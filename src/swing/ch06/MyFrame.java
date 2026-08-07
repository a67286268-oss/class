package swing.ch06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements Runnable{

    public static void main(String[] args) {
        new MyFrame();
    }


    private JLabel backgroundMap;
    private JLabel player;
    private JLabel monster1;
    private ImageIcon monster1L;
    private ImageIcon monster1R;
    private final int MOVE_STEP = 7;
    private ImageIcon playerIconL;
    private ImageIcon playerIconR;
    private final int MAX_LEFT = 45;
    private final int MAX_RIGHT = 870;
    private final int MAX_UP = 0;
    private final int MAX_DOWN = 510;

    private Thread monsterPattern;
    private final int MONSTER_STEP = 3;
    private final int MONSTER_MAX_LEFT = 60; // 몬스터 좌측 이동 한계
    private final int MONSTER_MAX_RIGHT = 880; // 몬스터 우측 이동 한계



    @Override
    public void run() {
        boolean isLeft = true;

        while (true) {
            int resultX = monster1.getX();
            int resultY = monster1.getY();

            if (resultX >= MONSTER_MAX_RIGHT) { // monster1.setLocation(880,520); << 위치 초기값
                monster1.setIcon(monster1L);
                isLeft = true;
            } else if (resultX <= MONSTER_MAX_LEFT) {
                isLeft = false;
                monster1.setIcon(monster1R);
            }

            if (isLeft) {
                resultX -= MONSTER_STEP;
            } else {
                resultX += MONSTER_STEP;
            }
            monster1.setLocation(resultX,resultY);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();

        monsterPattern = new Thread(this);
        monsterPattern.start();
    }

    private void initData() {
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 이미지 경로를 안전하게 불러오는 방식 (프로젝트 경로 기준)
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");

        backgroundMap = new JLabel(backgroundIcon);
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        playerIconL = new ImageIcon("images/playerL.png");
        playerIconR = new ImageIcon("images/playerR.png");
        monster1L = new ImageIcon("images/enemyL.png");
        monster1R = new ImageIcon("images/enemyR.png");

        player = new JLabel(playerIconL);
        player.setSize(100, 100);
        player.setLocation(200, 270); // x 45 (왼쪽벽), x 870 (오른쪽벽)
        // y 0 (천장) y 510 (바닥)

        monster1 = new JLabel(monster1L);
        monster1.setSize(80,80);
        monster1.setLocation(880,520); // 몬스터X,Y좌표 + 10 : 맵의 오른쪽아래구석

    }

    private void setInitLayout() {
        setLayout(null);
        add(backgroundMap);
        backgroundMap.add(player);
        backgroundMap.add(monster1);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int resultX = player.getX();
                int resultY = player.getY();

                if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 왼쪽
                    resultX -= MOVE_STEP;
                    player.setIcon(playerIconL);

                } else if (e.getKeyCode() == KeyEvent.VK_UP) { // 위
                    resultY -= MOVE_STEP;

                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 오른쪽
                    resultX += MOVE_STEP;
                    player.setIcon(playerIconR);

                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // 아래
                    resultY += MOVE_STEP;
                }

                // 이동 한계
                if (resultY >= MAX_DOWN) {
                    resultY = MAX_DOWN;
                } else if (resultY <= MAX_UP) {
                    resultY = MAX_UP;
                } else if (resultX <= MAX_LEFT) {
                    resultX = MAX_LEFT;
                } else if (resultX >= MAX_RIGHT) {
                    resultX = MAX_RIGHT;
                }


                player.setLocation(resultX, resultY);

            }
        });
    }


}

