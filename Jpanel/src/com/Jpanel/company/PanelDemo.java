package com.Jpanel.company;

import javax.swing.*;
import java.awt.*;

public class PanelDemo extends JFrame {
    private Container c;
    private JPanel panel1,panel2;
    private BorderLayout bl;
    PanelDemo(){
        c=this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        bl=new BorderLayout(10,10);
        c.setLayout(bl);

        JButton bu1=new JButton("1"),bu2=new JButton("2"),bu3,bu4,bu5,bu6,bu7;
        bu3=new JButton("3");
        bu4=new JButton("4");
        bu5=new JButton("5");
        bu6=new JButton("6");
        bu7=new JButton("7");
        //Jpanel
        panel1=new JPanel();
        panel1.setBounds(50,80,50,100);
        //c.add(panel1);
        panel2=new JPanel();
        panel2.setBounds(355,80,250,300);
        //c.add(panel2);

        bu7.add(panel1);
        //panel1.add(bu1);
        //panel2.add(bu2);


        //add border layout
        c.add(bu3,BorderLayout.NORTH);
        c.add(bu4,BorderLayout.WEST);
        c.add(bu5,BorderLayout.EAST);
        c.add(bu6,BorderLayout.SOUTH);
        c.add(bu7,BorderLayout.CENTER);

    }

    public static void main(String[] args) {

        PanelDemo frame=new PanelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,670,500);
        frame.setTitle("Jpanel");
    }
}
