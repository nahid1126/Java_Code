package com.Jpanel.company;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    private Container c;
    private JButton bu[];
    private FlowLayout fl;

    FlowLayoutDemo(){
        c=this.getContentPane();
        fl=new FlowLayout();
        fl.setHgap(10);
        fl.setVgap(15);
        c.setLayout(fl);
        c.setBackground(Color.LIGHT_GRAY);

        //create button using array
        bu=new JButton[9];
        for (int i=0;i<9;i++){
            bu[i]=new JButton(""+(i+1));
            c.add(bu[i]);
        }

    }

    public static void main(String[] args) {

        FlowLayoutDemo frame=new FlowLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,670,500);
        frame.setTitle("Flow Layout");
    }
}
