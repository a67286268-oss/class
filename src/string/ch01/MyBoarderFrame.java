package string.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBoarderFrame extends JFrame {

    JButton[] buttons = new JButton[5];


    public MyBoarderFrame() {
        super.setTitle("보더레이아웃연습");
        super.setSize(600, 400);
        super.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    public void initData() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + i);
        }

    }

    public void setInitLayout() {
        setLayout(new BorderLayout());
        String[] borders = new String[]{
                BorderLayout.NORTH,
                BorderLayout.SOUTH,
                BorderLayout.WEST,
                BorderLayout.EAST,
                BorderLayout.CENTER
        };


        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], borders[i]);
        }

    }


}
