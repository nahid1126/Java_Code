/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author NAHID HASAN
 */
public class LabelDemo extends JFrame{
    private Container c;
    private JLabel label,label1,label2;
    private Font f;
    private ImageIcon im;
    /**
     * @param args the command line arguments
     */
    public LabelDemo(){
        
       //container create and change the background
     c=this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.GRAY);
     
     //crate font for jlabel
     f=new Font("Arial",Font.BOLD,20);
     
      //jlabel create and add
     label1 =new JLabel("Hi Nahid Hasan!");
    // label1.setText("Hi Nahid Hasan!");
     label1.setBounds(50,20,200,50);
     //add font
     label1.setFont(f);
     
     //change foreground color
     label1.setForeground(Color.yellow);
     
     //change jlabel background color
     label1.setOpaque(true);
     label1.setBackground(Color.BLUE);
     
     //add label into container
     c.add(label1);
    
     label2 =new JLabel("How are You?");
    // label2.setText("How are You?");
     label2.setBounds(50,80,200,50);
     //add font
     label2.setFont(f);
     //change foreground color
     label2.setForeground(Color.RED);
     
     //change jlabel background color
     label2.setOpaque(true);
     label2.setBackground(Color.GREEN);
     
     //add label into container
     c.add(label2);
     
     
      //add image in label
     im=new ImageIcon(getClass().getResource("neymar.jpg"));
     
     label=new JLabel(im);
     label.setBounds(50,15,200,120);
     c.add(label);
    }
    
    public static void main(String[] args) {
     LabelDemo frame=new LabelDemo();
     //frame visisble
     frame.setVisible(true);
     //close program after click X
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     //frame size and locations set
     frame.setBounds(650,400,600,400);
     //add title
     frame.setTitle("My Frame");
     
    }
}
