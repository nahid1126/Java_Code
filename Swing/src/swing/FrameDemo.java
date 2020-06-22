/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author NAHID HASAN
 */
public class FrameDemo extends JFrame {
    private ImageIcon ic;  
    private Container con;
    //constractor

    FrameDemo(){
        //frame visisble
        setVisible(true);
        
        //close program after click X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
        //frame.setLocationRelativeTo(null);
        
        //frame size and location combine
        setBounds(600,250,700,500);
        
        //frame size fixed
        setResizable(false);
        
        //frame title
        setTitle("My Frame");
        
        AnotherFun();
    }
    public void AnotherFun(){
        //change icon
        ic = new ImageIcon(getClass().getResource("hi.png"));
       this.setIconImage(ic.getImage());
       
       //change background
       con=this.getContentPane();
       con.setBackground(Color.green);
    }
    public static void main(String[] args) {
      new FrameDemo();
    }
    
}
