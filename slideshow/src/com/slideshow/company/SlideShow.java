package com.slideshow.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlideShow extends JFrame implements ActionListener {
    private Container c;
    private JPanel jp;
    private JButton ne, pri;
    private ImageIcon ic;
    private JLabel jl;
    private CardLayout cl;

    SlideShow() {
        c = this.getContentPane();
        cl = new CardLayout();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        Font f = new Font("Arial", Font.BOLD, 18);

        jp = new JPanel(cl);
        jp.setBounds(10, 10, 560, 380);
        c.add(jp);

        pri = new JButton("Previews");
        pri.setBounds(10, 400, 130, 40);
        pri.setFont(f);
        c.add(pri);
        ne = new JButton("Next");
        ne.setBounds(470, 400, 100, 40);
        ne.setFont(f);
        c.add(ne);
        pri.addActionListener(this);
        ne.addActionListener(this);
        showImage();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == ne) {
            cl.next(jp);
        } else {
            cl.previous(jp);
        }
    }

    public void showImage() {
        String[] img = {"1.jpg", "2.jpg", "3.jpg"};
        for (String n : img) {
            ic = new ImageIcon("src/image/" + n);

            //resize image
            Image image = ic.getImage();
            Image nimage = image.getScaledInstance(jp.getWidth(), jp.getHeight(), Image.SCALE_SMOOTH);
            ic = new ImageIcon(nimage);

            jl = new JLabel(ic);
            jp.add(jl);
        }
    }

    public static void main(String[] args) {
        SlideShow frame = new SlideShow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 600, 500);
        frame.setTitle("Slide SHow");
    }

}
