package com.FlashCardBuild.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class FlashCardBuild extends JFrame implements ActionListener {

    private JFrame frame;
    private JTextArea question, answer;
    private ArrayList<FlashCard> cardList;
    private JPanel jPanel;
    private JMenuBar jMenuBar;
    private JMenu file;
    private JMenuItem newItem, saveItem;

    FlashCardBuild() {
        //create menu bar
        jMenuBar = new JMenuBar();
        jMenuBar.setBackground(Color.CYAN);
        //this.setJMenuBar(jMenuBar);
        file = new JMenu("File");
        newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        file.add(newItem);
        file.add(saveItem);

        //add menu bar into menu
        jMenuBar.add(file);


        //create user  interface
        frame = new JFrame("Flash Card");
        frame.setVisible(true);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a jpanel and hold everything
        jPanel = new JPanel();

        //create font
        Font f = new Font("Helvetica Neue", Font.BOLD, 20);

        //create question area
        question = new JTextArea(7, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(f);


        //add scrollpane
        JScrollPane jScrollPane = new JScrollPane(question);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //create question area
        answer = new JTextArea(7, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(f);

        //add scrollpane
        JScrollPane jScrollPane2 = new JScrollPane(answer);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //create jlabel
        JLabel qjLabel = new JLabel("Question"), ajLabel = new JLabel("Answer");


        //create button
        JButton next = new JButton("Next Card");

        //add component to main panel
        jPanel.add(qjLabel);
        jPanel.add(jScrollPane);
        jPanel.add(ajLabel);
        jPanel.add(jScrollPane2);
        jPanel.add(next);

        //add to the frame
        frame.setJMenuBar(jMenuBar);
        frame.add(jPanel);
        //frame.getContentPane().add(BorderLayout.CENTER,jPanel);

        //add action listene
        newItem.addActionListener(this);
        saveItem.addActionListener(this);
        next.addActionListener(this);

        //create arraylist
        cardList = new ArrayList<FlashCard>();

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New")) {
            new FlashCardBuild();
        } else if (e.getActionCommand().equals("Save")) {
            //create flash card
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);

            //create a file dialog with file chooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(frame);
            saveFile(fileChooser.getSelectedFile());
        } else if (e.getActionCommand().equals("Next Card")) {
            //create flash card
            FlashCard card = new FlashCard(question.getText(), answer.getText());
            cardList.add(card);

            //clear to card
            question.setText("");
            answer.setText("");
            question.requestFocus();
        }
    }

    private void saveFile(File selectedFile) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(selectedFile));
            Iterator<FlashCard>cardIterator=cardList.iterator();
            while (cardIterator.hasNext()){
                FlashCard card= (FlashCard)cardIterator.next();
                writer.write(card.getQuestion()+"/");
                writer.write(card.getAnswer()+"\n");
            }
            writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"You can't write the file");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardBuild();
            }
        });
    }


}
