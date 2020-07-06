package com.Jpanel.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardDemo extends JFrame implements ActionListener {
    private Container c;
    private CardLayout cl;
    private JButton bu[];
    CardDemo(){
        c=this.getContentPane();
        cl=new CardLayout(10,10);
        c.setLayout(cl);
        c.setBackground(Color.LIGHT_GRAY);

        bu=new JButton[3];
        for (int i=0;i<3;i++){
            bu[i]=new JButton(" "+(char)(i+65));
            c.add(bu[i]);
            bu[i].addActionListener(this::actionPerformed);
        }


    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cl.next(c);
    }
    public static void main(String[] args) {

        CardDemo frame=new CardDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,200,200);
        frame.setTitle("Card Layout");
    }
}
