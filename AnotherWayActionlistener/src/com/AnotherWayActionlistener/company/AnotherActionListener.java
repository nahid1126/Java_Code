package com.AnotherWayActionlistener.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherActionListener extends JFrame implements ActionListener {
    private Container c;
    private JButton b1,b2,b3;
    private Font f;

    AnotherActionListener(){
        AnotherMe();
    }
    public void AnotherMe(){
        //container create
        c=this.getContentPane();
        c.setLayout(null);

        //font create
        f=new Font("Arial",Font.BOLD,18);

        //button create and  add container
        b1=new JButton("Red");
        b1.setBounds(250,50,90,40);
        b1.setFont(f);
        c.add(b1);

        b2=new JButton("Green");
        b2.setBounds(250,100,90,40);
        b2.setFont(f);
        c.add(b2);

        b3=new JButton("Blue");
        b3.setBounds(250,150,90,40);
        b3.setFont(f);
        c.add(b3);


        //call actionlistener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            c.setBackground(Color.RED);
            b1.setBackground(Color.RED);
        }
        else if(e.getSource()==b2){
            c.setBackground(Color.GREEN);
            b2.setBackground(Color.GREEN);
        }else {
            c.setBackground(Color.BLUE);
            b3.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        AnotherActionListener frame= new AnotherActionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 600, 400);
        frame.setTitle("Another ActionListener Demo");
        frame.setResizable(false);
    }

}

