package com.TabbedPaneDemo.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneDemo extends JFrame {
     private Container c;
     private JTabbedPane jTabbedPane;
     private JPanel jPanel1,jPanel2,jPanel3;
     private JLabel jLabel1,jLabel2,jLabel3;
     private ImageIcon homei,abouti,contacti;
     private JButton jButton;
     TabbedPaneDemo(){
         c=this.getContentPane();
         c.setLayout(null);
         jLabel1=new JLabel("HI I'am Nahid Hasan");
         jLabel2=new JLabel("I'am Nahid Hasan \n i'm student of Northern University Bangladesh");
         jLabel3=new JLabel("Cell:01725676253\n email:nahidnub1126@gmail.com");

         jButton=new JButton("Chose a color");
         jButton.setBounds(15,10,100,50);

         homei=new ImageIcon();
         abouti=new ImageIcon();
         contacti=new ImageIcon();
         jTabbedPane=new JTabbedPane();
         jTabbedPane.setBounds(40,20,300,300);
         c.add(jTabbedPane);

         jPanel1=new JPanel();
         jPanel1.add(jLabel1);
         jPanel1.add(jButton);
         jPanel1.setBackground(Color.LIGHT_GRAY);

         jPanel2=new JPanel();
         jPanel2.add(jLabel2);
         jPanel2.setBackground(Color.ORANGE);

         jPanel3=new JPanel();
         jPanel3.add(jLabel3);
         jPanel3.setBackground(Color.YELLOW);

         homei=new ImageIcon("src/icon/home.png");
         abouti=new ImageIcon("src/icon/about.png");
         contacti=new ImageIcon("src/icon/contact.png");

         jTabbedPane.addTab("Home",homei,jPanel1,"Home");
         jTabbedPane.addTab("About",abouti,jPanel2,"about");
         jTabbedPane.addTab("Contact",contacti,jPanel3,"Contact");

         jButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 Color color=JColorChooser.showDialog(null,"Select Color ",Color.GREEN);
                 c.setBackground(color);
             }
         });
     }

    public static void main(String[] args) {
        TabbedPaneDemo frame=new TabbedPaneDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tabbed Demo");
        frame.setBounds(500,300,400,400);
    }
}
