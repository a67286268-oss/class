package swing.ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel1 = new JPanel();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel1.setBackground(Color.GREEN);
        panel1.add(button1);
        panel1.add(button2);

        add(panel1);
        setVisible(true);
    }

    private void addEventListener() {
        button1.addActionListener(this);
    }

    //  ActionListener 의 추상 메서드를 구현 메서드로 재정의
    //  미리 약속되어 있는 메서드, 즉 어떤 이벤트가 발생하면
    //  이 해당 메서드 동작 되도록 설계 되어 있음 (콜백 메서드)
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getSource());
        JButton selectedButton = (JButton) e.getSource();
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
    }

}
