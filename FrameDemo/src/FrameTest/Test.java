package FrameTest;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.green;

public class Test extends JFrame {
    private ImageIcon ic = new ImageIcon(getClass().getResource("hi.png"));
    private Container C;
    Test(){
        anotherfun();
    }
    public void anotherfun(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,400,500,300);
        setTitle("New Frame");

        this.setIconImage(ic.getImage());

        C=this.getContentPane();
        C.setBackground(green);
        setResizable(false);
    }
    public static void main(String[] args) {
        Test frame=new Test();
        frame.setVisible(true);
    }
}
