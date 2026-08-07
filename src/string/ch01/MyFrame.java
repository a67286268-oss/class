package string.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton[] buttons = new JButton[3];


    public MyFrame() {
        super.setTitle("배치 관리자 연습");
        super.setSize(600,300);
        super.setVisible(true);

        initData();
        setInitLayout();
    }

    public void initData() {

//        buttons[0] = new JButton("button1");
//        buttons[1] = new JButton("button2");
//        buttons[2] = new JButton("button3");

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + i);
        }

    }

    public void setInitLayout() {
        setLayout(new FlowLayout());
//        add(buttons[0]);
//        add(buttons[1]);
//        add(buttons[2]);

        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i]);
        }



    }






}
