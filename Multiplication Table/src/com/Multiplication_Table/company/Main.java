package com.Multiplication_Table.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable frame=new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,200,540,700);
        frame.setTitle(" Multiplication Table");
    }
}
