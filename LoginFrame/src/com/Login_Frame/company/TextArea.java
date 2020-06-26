package com.Login_Frame.company;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JFrame {
    TextArea(){
        Container c;
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        Font f=new Font("Arial",Font.BOLD+Font.ITALIC,20);

        JTextArea t=new JTextArea();
        t.setFont(f);
        t.setLineWrap(true);
        t.setWrapStyleWord(true);
        c.add(t);

        JScrollPane sc=new JScrollPane(t);
        sc.setBounds(100,50,400,200);
        c.add(sc);
    }
    public static void main(String[] args) {
        TextArea frame =new TextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,300,600,400);
        frame.setTitle("Text Area");
    }
}
