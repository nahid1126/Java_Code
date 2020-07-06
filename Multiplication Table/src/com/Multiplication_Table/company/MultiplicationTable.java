package com.Multiplication_Table.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {
	MultiplicationTable(){
		Container c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		JLabel imgL,textL;
		JTextField tf;
		JButton clear;
		JTextArea ta;

		//Image Icon
		ImageIcon img,ic;
		ic=new ImageIcon(getClass().getResource("icon.png"));
		setIconImage(ic.getImage());
		img=new ImageIcon(getClass().getResource("image.jpg"));
		imgL=new JLabel(img);
		imgL.setBounds(23,10,img.getIconWidth(),img.getIconHeight());
		c.add(imgL);

		//Font and add text jlabel
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		textL=new JLabel("Enter any Number :");
		textL.setBounds(60,280,185,40);
		textL.setForeground(Color.green);
		textL.setFont(f);
		c.add(textL);

		//text field
		tf=new JTextField();
		tf.setBounds(255,285,90,40);
		tf.setFont(f);
		tf.setHorizontalAlignment(JTextField.CENTER);
		tf.setBackground(Color.YELLOW);
		c.add(tf);

		//button and cursor
		Cursor cu=new Cursor(Cursor.HAND_CURSOR);
		clear=new JButton("Clear");
		clear.setBounds(370,285,90,40);
		clear.setFont(f);
		clear.setCursor(cu);
		c.add(clear);


		//text area
		ta=new JTextArea();
		ta.setBounds(18,350,490,300);
		ta.setFont(f);
		ta.setBackground(Color.green);
		c.add(ta);

		//Action listener for text field and text area
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				tf.setText("");
				ta.setText("");
			}
		});

		//Action listener for text field
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				String val=tf.getText();
				if(val.isEmpty()){
					JOptionPane.showMessageDialog(null,"You Didn't put any number \n Please Enter any number ");
				}
				else{
				ta.setText("");

				//change string to integer
				int num= Integer.parseInt(tf.getText());
				for (int i=1;i<=10;i++){
					int result=num*i;

					//change integer to string
					String r,n,inc;
					r=String.valueOf(result);
					n=String.valueOf(num);
					inc=String.valueOf(i);

					//add to text area
					ta.append(n+" x "+inc+" = "+r+"\n");
				}
				}
			}
		});

	}

    public static void main(String[] args) {
	    MultiplicationTable frame=new MultiplicationTable();
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(600,200,540,700);
	    frame.setTitle(" Multiplication Table");
    }
}
