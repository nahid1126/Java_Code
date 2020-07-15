package com.MenuBar.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JFrame implements ActionListener {
    private JMenu file, edit, help;
    private JMenuBar jMenuBar;
    private JMenuItem newItem, openItem, exitItem, copyItem, pasteItem, cutItem, contactItem;
    private ImageIcon cutIcon, newIcon,openIcon,exitIcon,pasteIcon,contactIcon,copyIcon;

    MenuBar() {
        //menu bar
        jMenuBar = new JMenuBar();
        jMenuBar.setBackground(Color.CYAN);
        this.setJMenuBar(jMenuBar);

        //icon create
        newIcon = new ImageIcon("src/icon/new.png");
        cutIcon = new ImageIcon("src/icon/cut.png");
        openIcon = new ImageIcon("src/icon/open.png");
        exitIcon =new ImageIcon("src/icon/exit.png");
        pasteIcon = new ImageIcon("src/icon/paste.png");
        contactIcon = new ImageIcon("src/icon/contact.png");
        copyIcon = new ImageIcon("src/icon/copy.png");


        //menu Item
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        //menu add menubar
        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(help);

        //menu item create
        newItem = new JMenuItem("New");
        newItem.setIcon(newIcon);
        //keyboard short cut add
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));

        openItem = new JMenuItem("Open");
        openItem.setIcon(openIcon);
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));

        exitItem = new JMenuItem("Exit");
        exitItem.setIcon(exitIcon);

        copyItem = new JMenuItem("Copy");
        copyItem.setIcon(copyIcon);
		copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));

        pasteItem = new JMenuItem("paste");
        pasteItem.setIcon(pasteIcon);
        //keyboard short cut add
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));

        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
		cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));

        contactItem = new JMenuItem("Contact us");
        contactItem.setIcon(contactIcon);


        file.add(newItem);
        file.addSeparator();
        file.add(openItem);
        file.addSeparator();
        file.add(exitItem);


        edit.add(copyItem);
        edit.addSeparator();
        edit.add(pasteItem);
        edit.addSeparator();
        edit.add(cutItem);

        help.add(contactItem);

        newItem.addActionListener(this);
        exitItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == newItem) {
            JFrame frame = new JFrame("New Frame");
            frame.setVisible(true);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if (actionEvent.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MenuBar frame = new MenuBar();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MenuBar");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
    }

}
