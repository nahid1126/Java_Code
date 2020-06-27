package com.FrameDemo.company;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author NAHID HASAN
 */
public class TextField extends JFrame {

    private Container c;
    private JTextField tf1,tf2;
    private JLabel l,l2;
    private Font f;
    private ImageIcon i;

    TextField() {
        AnotherMe();
    }

    public void AnotherMe() {
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

        ButtonGroup grp=new ButtonGroup();
        JRadioButton m,fe;
        l2=new JLabel("Select Gender :");
        l2.setBounds(100,155,130,30);
        l2.setForeground(Color.YELLOW);
        l2.setFont(f);
        c.add(l2);

        //create and add jradio button
        m=new JRadioButton("Male");
        m.setBounds(180,180,70,20);
        m.setFont(f);
        m.setBackground(Color.DARK_GRAY);
        m.setForeground(Color.YELLOW);
        c.add(m);
        fe=new JRadioButton("Female");
        fe.setBounds(300,180,90,20);
        fe.setBackground(Color.DARK_GRAY);
        fe.setForeground(Color.YELLOW);
        fe.setFont(f);
        c.add(fe);

        //adding jradio button selection
        grp.add(m);
        grp.add(fe);

        f=new Font("Arial",Font.BOLD,17);
        JButton submit=new JButton("Submit");
        submit.setBackground(Color.green);
        submit.setBounds(250,220,100,30);
        submit.setFont(f);
        c.add(submit);
    }

    public static void main(String[] args) {
        TextField frame = new TextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(600, 300, 600, 400);
        frame.setResizable(false);
    }

}
