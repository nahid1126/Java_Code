package com.Login_Frame.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
	LoginFrame(){
		AnotherMe();
	}

	public void AnotherMe() {
		Container c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);

		//font
		Font f=new Font("Arial",Font.BOLD,18);

		//jlabel 1
		JLabel l,l1;
		l=new JLabel("Enter User Name :");
		l.setBounds(185,10,170,30);
		l.setFont(f);
		c.add(l);

		//text field
		JTextField text=new JTextField();
		text.setBounds(180,40,250,40);
		text.setFont(f);
		c.add(text);

		//jlabel 2
		l1=new JLabel("Enter Your Password :");
		l1.setBounds(185,100,170,30);
		l1.setFont(f);
		c.add(l1);

		//password field
		JPasswordField pass=new JPasswordField();
		pass.setBounds(180,130,250,40);
		pass.setEchoChar('*');
		pass.setFont(f);
		c.add(pass);

		//button
		JButton login,clear;
		login=new JButton("Login");
		login.setBounds(218,180,90,30);
		login.setFont(f);
		c.add(login);

		clear=new JButton("Clear");
		clear.setBounds(320,180,80,30);
		clear.setFont(f);
		c.add(clear);

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				text.setText("");
				pass.setText("");
			}
		});

		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				String name,ps;
				 name=text.getText();
				 ps=pass.getText();
				if (name.equals("Nahid")&&ps.equals("1126")){
					JOptionPane.showMessageDialog(null,"Login Successful");
					text.setText("");
					pass.setText("");
					//dispose();
					NewFrame frame=new NewFrame();
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					text.setText("");
					pass.setText("");
				}
			}
		});


	}


	public static void main(String[] args) {
	  LoginFrame frame =new LoginFrame();
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setBounds(600,350,600,400);
	  frame.setTitle("Login Frame");
    }
}
