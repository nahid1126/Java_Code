package com.ToggoleButton.company;

import javafx.scene.control.ToggleButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonDemo extends JFrame implements ActionListener {
    private Container c;
    private JToggleButton tb;
    private JLabel lb;
    private ImageIcon on,off;

    ToggleButtonDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        on=new ImageIcon("src/icon/on.jpg");
        off=new ImageIcon("src/icon/off.jpg");
        tb = new JToggleButton(off);
        tb.setBounds(50, 100, 270, 110);
        c.add(tb);

        lb = new JLabel("Hello There");
        lb.setVisible(false);
        lb.setBounds(150, 210, 100, 20);
        c.add(lb);

        tb.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (tb.isSelected()) {
            tb.setIcon(on);
            lb.setVisible(true);
        } else {
            tb.setIcon(off);
            lb.setVisible(false);
        }
    }

    public static void main(String[] args) {
        // write your code here
        ToggleButtonDemo frame = new ToggleButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 400, 350);
        frame.setTitle("Toggle Button");
    }
}
