package com.AnotherWayActionlistener.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VowelCounter extends JFrame {
    private Container c;
    private JLabel l1,l2,a,e,i,o,u;
    private JTextArea ta;
    private Font f;
    private JScrollPane sc;

    int totalv=0,Ta=0,Te=0,Ti=0,To=0,Tu=0;
    VowelCounter(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f=new Font("Arial",Font.BOLD,18);
        l1=new JLabel("Enter any text :");
        l1.setBounds(20,20,140,20);
        l1.setFont(f);
        c.add(l1);

        ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        c.add(ta);
        sc=new JScrollPane(ta);
        sc.setBounds(160,20,400,100);
        c.add(sc);

        l2=new JLabel();
        l2.setFont(f);
        l2.setBounds(160,140,250,30);
        c.add(l2);

        a=new JLabel();
        a.setFont(f);
        a.setBounds(160,180,230,30);
        c.add(a);

        e=new JLabel();
        e.setFont(f);
        e.setBounds(160,220,230,30);
        c.add(e);

        i=new JLabel();
        i.setFont(f);
        i.setBounds(160,260,230,30);
        c.add(i);

        o=new JLabel();
        o.setFont(f);
        o.setBounds(160,300,230,30);
        c.add(o);

        u=new JLabel();
        u.setFont(f);
        u.setBounds(160,340,230,30);
        c.add(u);

        //keylistener
        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getSource()==ta){
                    if (keyEvent.VK_A==keyEvent.getKeyCode()){
                        Ta++;
                        totalv++;
                    }
                    else if (keyEvent.VK_E==keyEvent.getKeyCode()){
                        Te++;
                        totalv++;
                    }
                    else if (keyEvent.VK_I==keyEvent.getKeyCode()){
                        Ti++;
                        totalv++;
                    }
                    else if (keyEvent.VK_O==keyEvent.getKeyCode()){
                        To++;
                        totalv++;
                    }
                    else if (keyEvent.VK_U==keyEvent.getKeyCode()){
                        Tu++;
                        totalv++;
                    }
                }
                l2.setText("Total Number Of Vowel : "+totalv);
                a.setText("Total Number OF A : "+Ta);
                e.setText("Total Number OF E : "+Te);
                i.setText("Total Number OF I : "+Ti);
                o.setText("Total Number OF O : "+To);
                u.setText("Total Number OF U : "+Tu);

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

    }
    public static void main(String[] args) {
        VowelCounter frame= new VowelCounter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 600, 700);
        frame.setTitle("VowelCounter Demo");
        frame.setResizable(false);
    }
}
