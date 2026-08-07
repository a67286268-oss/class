package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MoveLabelFrame extends JFrame {

    private JLabel label;
    private JLabel label2;
    private final int MOVE_STEP = 10;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {

        setTitle("방향키로 별 움직이기 연습");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        label = new JLabel("☆");
        label.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        // 좌표 기반 - 크기, 위치 (직접 설정 해야 함)
        label.setSize(50, 50); // 사이즈
        label.setLocation(200, 200); // 시작 위치

        label2 = new JLabel("(" + getCount() + ")");
        label2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        // 좌표 기반 - 크기, 위치 (직접 설정 해야 함)
        label2.setSize(30, 30); // 사이즈
        label2.setLocation(10,10); // 시작 위치
    }

    private void setInitLayout() {
        setLayout(null); // null -> 좌표 기반
        add(label);
        add(label2);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int resultX = label.getX();
                int resultY = label.getY();


                if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 왼쪽
                    resultX -= MOVE_STEP;

                } else if (e.getKeyCode() == KeyEvent.VK_UP) { // 위
                    resultY -= MOVE_STEP;

                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 오른쪽
                    resultX += MOVE_STEP;

                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // 아래
                    resultY += MOVE_STEP;

                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    resultX = 200;
                    resultY = 200;
                    label.setText("☆");
                }

                label.setLocation(resultX,resultY);

                if (label.getText().equals("☆")) {
                    label.setText("★");
                } else if (label.getText().equals("★")) {
                    label.setText("☆");
                }

                setCount(getCount() + 1);
                label2.setText("(" + getCount() + ")");


            }
        });
    }

    public static void main(String[] args) {
        new MoveLabelFrame();
    }

}
