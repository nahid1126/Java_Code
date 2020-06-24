package comPassword_Field.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordField extends JFrame {
   // private Container c;
   // private JPasswordField p;
   // private JLabel l;
   // private Font f;
    PasswordField (){
        AnotherMe();
    }
    public void AnotherMe(){
       Container c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

      Font  f=new Font("Arial",Font.BOLD,19);

      JLabel  l=new JLabel("Enter Your Password");
        l.setBounds(200,10,200,20);
        l.setFont(f);
        c.add(l);

        //password field
       JPasswordField p = new JPasswordField();
        p.setEchoChar('*');
        p.setBounds(200,40,200,30);
        p.setFont(f);
        c.add(p);

        //Add cursor in button
        Cursor cu=new Cursor(Cursor.HAND_CURSOR);

        JButton login=new JButton("login");
        login.setBounds(255,70,80,30);
        login.setBackground(Color.green);
        login.setCursor(cu);
        c.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setText("");
            }
        });
    }

    public static void main(String[] args) {
	PasswordField frame = new PasswordField();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(600,300,600,450);
	frame.setTitle("PasswordField");
    }
}
