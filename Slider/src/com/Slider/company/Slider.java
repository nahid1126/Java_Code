package com.Slider.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider extends JFrame implements ChangeListener {
    private Container c;
    private JSlider reds, greens, blues;
    private JLabel red, green, blue, prl;
    private JTextField redt, greent, bluet;
    private JPanel jp;

    Slider() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

		/*js=new JSlider(0,20,0);
		js.setBounds(40,50,300,50);
		js.setMinorTickSpacing(1);
		js.setMajorTickSpacing(5);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		//js.setBackground(Color.LIGHT_GRAY);
		c.add(js);*/

        red = new JLabel("Red");
        red.setBounds(10, 40, 30, 20);
        c.add(red);

        reds = new JSlider(0, 255, 0);
        reds.setBounds(50, 30, 300, 50);
        reds.setBackground(Color.LIGHT_GRAY);
        c.add(reds);

        redt = new JTextField();
        redt.setBounds(360, 35, 80, 40);
        redt.setHorizontalAlignment(JTextField.CENTER);
        c.add(redt);

        green = new JLabel("Green");
        green.setBounds(10, 120, 40, 20);
        c.add(green);

        greens = new JSlider(0, 255, 0);
        greens.setBounds(50, 115, 300, 50);
        greens.setBackground(Color.LIGHT_GRAY);
        c.add(greens);

        greent = new JTextField();
        greent.setBounds(360, 120, 80, 40);
        greent.setHorizontalAlignment(JTextField.CENTER);
        c.add(greent);

        blue = new JLabel("Blue");
        blue.setBounds(10, 210, 30, 20);
        c.add(blue);

        blues = new JSlider(0, 255, 0);
        blues.setBounds(50, 200, 300, 50);
        blues.setBackground(Color.LIGHT_GRAY);
        c.add(blues);

        bluet = new JTextField();
        bluet.setBounds(360, 210, 80, 40);
        bluet.setHorizontalAlignment(JTextField.CENTER);
        c.add(bluet);

        jp=new JPanel();
        jp.setBounds(460,50,200,200);
        c.add(jp);

        prl=new JLabel("Preview");
        prl.setBounds(540,260,100,20);
        c.add(prl);

        reds.addChangeListener(this);
        greens.addChangeListener(this);
        blues.addChangeListener(this);
    }

	@Override
	public void stateChanged(ChangeEvent changeEvent) {
    	int redvalue=reds.getValue();
    	int greenvalue=greens.getValue();
    	int bluevalue=blues.getValue();

    	redt.setText(String.valueOf(redvalue));
    	greent.setText(String.valueOf(greenvalue));
    	bluet.setText(String.valueOf(bluevalue));

    	Color color=new Color(redvalue,greenvalue,bluevalue);
    	jp.setBackground(color);
	}
    public static void main(String[] args) {
        Slider frame = new Slider();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JSilder");
        frame.setBounds(600, 300, 700, 400);
    }

}
