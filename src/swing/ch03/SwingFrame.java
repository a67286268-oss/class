package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {

    MyImagePanel myImagePanel;

    public SwingFrame() {
        setSize(1000,1000);
        setTitle("집그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(300,100,500,100);
        g.drawLine(350,250,550,250);
        g.drawLine(550,250,500,100);
        g.drawLine(350,250,300,100);
        g.drawLine(300,100,250,250);
        g.drawLine(250,400,250,250);
        g.drawLine(250,400,550,400); //바닥 y400
        g.drawLine(350,250,350,400);
        g.drawLine(550,250,550,400);
        g.drawLine(425,400,425,320); // 문높이 320
        g.drawLine(425,320,475,320);
        g.drawLine(475,320,475,400);
        g.drawLine(360,260,420,260);
        g.drawLine(360,260,360,300);
        g.drawLine(420,300,360,300);
        g.drawLine(420,300,420,260);

    }


    static class MyImagePanel extends JPanel {


    }

    public static void main(String[] args) {
        new SwingFrame();
    }



}
