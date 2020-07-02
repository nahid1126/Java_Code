package com.AnotherWayActionlistener.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseListener extends JFrame {
    private Container c;
    private JTextField tf,tf2;
    private JTextArea ta;
    private Font f;
    private JScrollPane sc;
    MouseListener(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        //font
        f=new Font("Arial",Font.BOLD,18);
        //textfield
        tf=new JTextField();
        tf.setBounds(75,20,150,50);
        tf.setFont(f);
        c.add(tf);

        //textarea
        ta=new JTextArea();
        ta.setFont(f);
        c.add(ta);
        sc=new JScrollPane(ta);
        sc.setBounds(20,80,250,200);
        c.add(sc);

        //mouse listener
        tf.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                ta.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                ta.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                ta.append("Mouse Released\n");
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                ta.append("Mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                ta.append("Mouse Exited\n");
            }
        });

        //MOuse motionlistener
        tf2=new JTextField();
        tf2.setBounds(75,300,150,50);
        //tf2.setFont(f);
        c.add(tf2);

        ta.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                tf2.setText("Mouse Dragged "+mouseEvent.getX()+" "+mouseEvent.getY()+"\n");
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                tf2.setText("Mouse Moved "+mouseEvent.getX()+" "+mouseEvent.getY()+"\n");
            }
        });

        //windowlistener
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {
                System.out.println("windowDeactivated");
            }
        });
    }
    public static void main(String[] args) {
        MouseListener frame=new MouseListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 300, 400);
        frame.setTitle("Another ActionListener Demo");
        frame.setResizable(false);
    }
}
