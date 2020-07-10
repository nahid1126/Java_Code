package com.JSpinnerDemo.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerDemo extends JFrame implements ChangeListener {
    private Container c;
    private JSpinner jSpinner;
    private JLabel jLabel;
    JSpinnerDemo(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        jSpinner=new JSpinner();
        jSpinner.setBounds(150,90,90,50);
        c.add(jSpinner);

        jLabel=new JLabel();
        jLabel.setBounds(130,140,150,30);
        c.add(jLabel);

        jSpinner.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        String number=jSpinner.getValue().toString();
        int value=Integer.parseInt(number);
        jLabel.setText("Current value : "+value);
    }
    public static void main(String[] args) {
        JSpinnerDemo frame = new JSpinnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JSpinner");
        frame.setBounds(600, 300, 400, 300);
    }


}