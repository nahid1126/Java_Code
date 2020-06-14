package com.company_SwingDemo.com;
import javax.swing.*;
public class SwingDemo {
    public SwingDemo(){
        //Crete a new JFrame container
        JFrame jFrame=new JFrame("First Swing Application");

        //Give it a size
        jFrame.setSize(275,100);

        //Terminate the program when the user close the application
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        //Create a JLabel
        JLabel jLabel=new JLabel("Wow This is Amazing!");

        //Add the JLabel in JFrame
        jFrame.add(jLabel);

        //Show it
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
	// Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
