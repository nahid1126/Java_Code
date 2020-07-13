package com.Text_To_Reverse.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_To_Reverse extends JFrame implements ActionListener {
    JLabel jLabel, contentLabel;
    JTextField jTextField,jTextField2;
    JFrame jFrame;
    JButton jButton;

    Text_To_Reverse() {
        //create frame
        jFrame = new JFrame("Enter Text");
        jFrame.setVisible(true);
        jFrame.setLayout(new FlowLayout());

        //create fond
        Font f=new Font("Arial",Font.BOLD,18);

        //size and default close operation
        jFrame.setSize(350, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create textfield
        jTextField = new JTextField(10);
        jTextField.setActionCommand("textField");
        jTextField.setFont(f);

        jTextField2=new JTextField(10);
        jTextField2.setFont(f);

        //create button
        jButton = new JButton("Reverse");
        jButton.setFont(f);

        //create label prompt
        jLabel = new JLabel("Enter Text");
        jLabel.setFont(f);
        contentLabel = new JLabel("Reverse Text");
        contentLabel.setFont(f);


        //add to frame
        jFrame.add(jLabel);
        jFrame.add(jTextField);

        jFrame.add(contentLabel);
        jFrame.add(jTextField2);
        jFrame.add(jButton);


        //add action listener
        jTextField.addActionListener(this);
        jButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")) {
            String original = jTextField.getText();
            String holder = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                holder+=original.charAt(i);
                jTextField2.setText(holder);
            }
        } else {
            JOptionPane.showMessageDialog(null,"You pressed Enter. please Enter Reverse button .\nText is : " + jTextField.getText());
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Text_To_Reverse();
            }
        });
    }
}
