package com.Action_Demo.company;

import jdk.internal.dynalink.linker.LinkerServices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo extends JFrame {
    private Container c;
    public JTextField tf1,tf2;
    private JLabel l;
    private Font f;
    private ImageIcon i;
    ActionDemo(){
        AnotherMe();
    }
    public void AnotherMe(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        i=new ImageIcon(getClass().getResource("hi.png"));
        this.setIconImage(i.getImage());
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        //Add font and size
        f=new Font("Arial",Font.ITALIC+Font.BOLD,17);

        l=new JLabel("Enter Your first Name");
        l.setBounds(100,0,200,50);
        l.setFont(f);
        l.setForeground(Color.yellow);
        c.add(l);

        // Add textfield into frame
        tf1=new JTextField();
        tf1.setBounds(100,45,400,30);
        tf1.setBackground(Color.pink);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setFont(f);
        c.add(tf1);

        l=new JLabel("Enter Your Second Name");
        l.setBounds(100,80,200,50);
        l.setFont(f);
        l.setForeground(Color.yellow);
        c.add(l);

        // Add textfield into frame
        tf2=new JTextField();
        tf2.setBounds(100,120,400,30);
        tf2.setBackground(Color.pink);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setFont(f);
        c.add(tf2);

     /*//Add actionListener in frame
        tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Your First name");
                }
                else {
                JOptionPane.showMessageDialog(null,"Text 1 = "+s);
                }
            }
        });

        tf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Your Second name");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Text 2 = "+s);
                }
            }
        });*/

        f=new Font("Arial",Font.BOLD,17);
        JButton submit=new JButton("Submit");
        submit.setBackground(Color.green);
        submit.setBounds(250,160,100,30);
        submit.setFont(f);
        c.add(submit);

        //button actionListener
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=tf1.getText();
                s=tf2.getText();
                if (s.isEmpty()){
                  if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter first and second Name");}
                }else{
                    JOptionPane.showMessageDialog(null,"Submit Done");
                }
            }
        });
        //call another method for adding actionlistener
        ActionControl con =new ActionControl();
        tf1.addActionListener(con);
        tf2.addActionListener(con);

    }

    //another way to add actionlistener
    public class ActionControl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource()==tf1){
                String s=tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Your First name");
                }
                else {
                    JOptionPane.showMessageDialog(null,"First Name is = "+s);
                }
            }
            else{
                String s=tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Your Second name");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Second Name is = "+s);
                }
            }
        }
    }

    public static void main(String[] args) {
	   ActionDemo frame= new ActionDemo();
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 300, 600, 400);
        frame.setTitle("ActionListener Demo");
        frame.setResizable(false);
    }
}
