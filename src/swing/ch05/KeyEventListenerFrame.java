package swing.ch05;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventListenerFrame extends JFrame {

    private final int FREAM_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame() {
        initData();
        setInitData();
        addEventListener();
    }

    private void initData() {
        setSize(FREAM_SIZE,FREAM_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);

        textArea = new JTextArea();
    }

    private void addEventListener() {
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("키누름" + e.getKeyCode());
                // 이벤트를 받아서 위쪽 화살표면 위쪽
                // 아래쪽화살표면 아래 출력
                if (e.getKeyCode() == 37) { // 왼쪽
                    textArea.append("⬅");
                } else if (e.getKeyCode() == 38) { // 위
                    textArea.append("⬆");
                } else if (e.getKeyCode() == 39) { // 오른쪽
                    textArea.append("➡");
                } else if (e.getKeyCode() == 40) { // 아래
                    textArea.append("⬇");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased 발생 : " + e.getKeyCode());
            }
        });
    }

    private void setInitData() {
        add(textArea);
        setVisible(true);
    }


    public static void main(String[] args) {

        new KeyEventListenerFrame();

    }


}
