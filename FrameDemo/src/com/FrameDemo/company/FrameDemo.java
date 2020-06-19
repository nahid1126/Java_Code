package com.FrameDemo.company;

import javax.swing.*;

public class FrameDemo {

    public static void main(String[] args) {

        JFrame frame=new JFrame();

        //JFrame visible
        frame.setVisible(true);

        //Close frame after closing frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set frame size
        //frame.setSize(500,300);

        //frame location
        //frame.setLocationRelativeTo(null);

        //frame location+size combine
        frame.setBounds(700,400,500,300);
        frame.setTitle("My frame");

        frame.setResizable(false);
    }
}
