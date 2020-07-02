package com.AnotherWayActionlistener.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sc;
     KeyListener(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        Font f=new Font("Arial",Font.BOLD,18);

        //text field
         tf=new JTextField();
         tf.setBounds(100,50,150,50);
         tf.setFont(f);
         c.add(tf);

         //text area
         ta=new JTextArea();
         ta.setFont(f);
         c.add(ta);

         sc=new JScrollPane(ta);
         sc.setBounds(100,130,250,200);
         c.add(sc);

         //keyListener for textfield and show it text area
         tf.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent keyEvent) {
                 ta.append("Key Typed : "+keyEvent.getKeyChar()+"\n");
             }

             @Override
             public void keyPressed(KeyEvent keyEvent) {
                 ta.append("Key Pressed : "+keyEvent.getKeyChar()+"\n");
             }

             @Override
             public void keyReleased(KeyEvent keyEvent) {
                 ta.append("Key Released : "+keyEvent.getKeyChar()+"\n");
             }
         });
    }
    public static void main(String[] args) {
        KeyListener frame= new KeyListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 600, 400);
        frame.setTitle("KeyListener Demo");
        frame.setResizable(false);
    }
}
