package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    MyImagePanel myImagePanel;

    public MyImageFrame() {
        setTitle("중첩클래스 활용");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myImagePanel = new MyImagePanel();
        add(myImagePanel);
        setVisible(true);
    }

    static class MyImagePanel extends JPanel {

        private Image image2;

        public MyImagePanel() {
            // 프로젝트 루트 폴더에 image1.png가 있어야 합니다.
            // 만약 src/image1.png 에 있다면 getClass().getResource("/image1.png") 를 사용하세요.

            //System.out.println("파일 존재 여부: " + file.exists());
            //System.out.println("찾는 파일의 절대 경로: " + file.getAbsolutePath());

            image2 = new ImageIcon("image2.jpg").getImage();
        }


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // JPanel의 기본 배경 렌더링

            g.drawString("이미지게임", 200, 200);
            g.drawLine(100, 100, 300, 100);

            // null 대신 Observer로 패널 자신(this)을 지정
            g.drawImage(image2, 100, 100, 100, 100, null);
        }
    } // end of inner class

    // 테스트 코드
    public static void main(String[] args) {
        new MyImageFrame();
    }

} // end of outer class