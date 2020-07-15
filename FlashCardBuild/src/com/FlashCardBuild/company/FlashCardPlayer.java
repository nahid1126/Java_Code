package com.FlashCardBuild.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class FlashCardPlayer implements ActionListener {
    private JTextArea display,answer;
    private ArrayList<FlashCard>cardlist;
    private Iterator cardIterator;
    private FlashCard currentcard;
    private int currentcardIndex;
    private JFrame frame;
    private boolean isShow;
    private JPanel mainPanel;
    private JButton showans;

    FlashCardPlayer(){
        //create ui
        frame=new JFrame("Flash Card Player");
        mainPanel=new JPanel();
        Font f = new Font("Helvetica Neue", Font.BOLD, 20);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(450,500);
        frame.setLocationRelativeTo(null);

        //create text area
        display=new JTextArea(10,20);
        display.setFont(f);

        JScrollPane jScrollPane = new JScrollPane(display);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //create button
        showans=new JButton("Show Answer");

        //add the main panel
        mainPanel.add(jScrollPane);
        mainPanel.add(showans);

        //add to the frame
        frame.add(mainPanel);


        //create menu bar
        JMenuBar menuBar=new JMenuBar();
        menuBar.setBackground(Color.YELLOW);
        JMenu menu=new JMenu("File");
        JMenuItem item=new JMenuItem("loader");
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        menu.add(item);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        //add action listener
        showans.addActionListener(this);
        item.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("loader")){
            JFileChooser fileOpen=new JFileChooser();
            fileOpen.showOpenDialog(frame);
            
            loadFile(fileOpen.getSelectedFile());
        }
        if (actionEvent.getSource()==showans){
            if(isShow){
                display.setText(currentcard.getAnswer());
                showans.setText("Next card");
                isShow=false;
            }else {
                //show next question
                if (cardIterator.hasNext()){
                    showNextCard();
                }else {
                    //no more card
                    display.setText("That was last card");
                    showans.setEnabled(false);
                }
            }
        }
    }

    private void loadFile(File selectedFile) {
        cardlist=new ArrayList<FlashCard>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(selectedFile));
            String line =null;
            while ((line=reader.readLine())!=null){
                makeCard(line);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"You can't write the file");
            e.printStackTrace();
        } 
    }

    private void makeCard(String line) {
        //spilt answer
        String [] result=line.split("/");
        FlashCard card=new FlashCard(result[0],result[1]);
        cardlist.add(card);
        //spilt answer another way
//        StringTokenizer result=new StringTokenizer(line,"/");
//        if (result.hasMoreElements()){
//            FlashCard card=new FlashCard(result.nextToken(),result.nextToken());
//            cardlist.add(card);
//        }

        //show 1st card
        cardIterator=cardlist.iterator();
        showNextCard();
    }

    private void showNextCard() {
        currentcard= (FlashCard) cardIterator.next();
        display.setText(currentcard.getQuestion());
        showans.setText("Show Answer");
        isShow=true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardPlayer();
            }
        });
    }


}
