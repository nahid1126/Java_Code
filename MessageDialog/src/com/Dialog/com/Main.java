package com.Dialod.com;

import javax.swing.*;

import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

public class Main {

    public static void main(String[] args) {
	// ShowMessageDialog
        JOptionPane.showMessageDialog(null,"Hi What is your name?","Wave",JOptionPane.QUESTION_MESSAGE);

        //showInputDialog
        String na=JOptionPane.showInputDialog("Enter Your First Name :");
        String me=JOptionPane.showInputDialog("Enter Your Last Name :");
        String name=na+" "+me;

        //Dialog with icon and title 4 parameter
        JOptionPane.showMessageDialog(null,name+" How are you?","Qustion",JOptionPane.QUESTION_MESSAGE);

        int op=JOptionPane.showConfirmDialog(null,name+" This is You?", "Quit", YES_NO_OPTION);

        if(op==YES_OPTION){
            System.out.println("Welcome "+name);
        }else {
            System.out.println("You are not "+name);
        }

    }
}
