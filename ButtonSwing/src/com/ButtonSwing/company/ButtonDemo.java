package com.ButtonSwing.company;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo {
    JLabel myLebel;
    public ButtonDemo(){
        //create Jframe
        JFrame jFrame=new JFrame("Button");

        //specify flowlayout for the layout manager
        jFrame.setLayout(new FlowLayout());

        //Give a size to our frame
        jFrame.setSize(220,80);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make button
        JButton upButton=new JButton("Up");
        JButton downButton=new JButton("Down");
        JButton nahidButton=new JButton("Nahid");

        //Label
        myLebel=new JLabel("Hello! Nahid");

        //add button to jframe
        jFrame.add(upButton);
        jFrame.add(downButton);
        jFrame.add(nahidButton);
        jFrame.add(myLebel);

        //show it
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
	// Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });

    }
}
