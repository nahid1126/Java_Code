package com.Login_Frame.company;

import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame {
    NewFrame(){
        Container con;
        con=this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.GRAY);

        JLabel le=new JLabel("Welcome to another Frame");
        le.setBounds(100,30,200,20);
        con.add(le);
    }
    public static void main(String[] args) {
        NewFrame frame =new NewFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,350,600,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Another Frame");

        }
}
