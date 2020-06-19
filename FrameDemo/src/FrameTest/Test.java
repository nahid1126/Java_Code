package FrameTest;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    Test(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,400,500,300);
        setTitle("New Frame");
        setBackground(Color.green);
        setResizable(false);
    }
    public static void main(String[] args) {
        Test frame=new Test();
        frame.setVisible(true);
    }
}
