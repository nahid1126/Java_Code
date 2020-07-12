package com.Student_Management.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Student_Management extends JFrame implements ActionListener {

    private Container c;
    private JLabel titleL, flabel, lLabel, phnlabel, cgpa;
    private JTextField fField, lField, phnField, cgpaField;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private Font f;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;
    private String[] col = {"First Name", "Last Name", "Phone Number", "CGPA"};
    private String[] row = new String[4];

    Student_Management() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        f = new Font("time new arial", Font.BOLD, 20);

        titleL = new JLabel("Student Registration");
        titleL.setBounds(300, 30, 200, 30);
        titleL.setForeground(Color.WHITE);
        titleL.setFont(f);
        c.add(titleL);

        flabel = new JLabel("First Name ");
        flabel.setBounds(10, 80, 130, 30);
        flabel.setFont(f);
        flabel.setForeground(Color.WHITE);
        c.add(flabel);

        fField = new JTextField();
        fField.setBounds(130, 80, 250, 30);
        fField.setFont(f);
        c.add(fField);

        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 120, 30);
        addButton.setFont(f);
        c.add(addButton);

        lLabel = new JLabel("Last Name ");
        lLabel.setBounds(10, 140, 130, 30);
        lLabel.setFont(f);
        lLabel.setForeground(Color.WHITE);
        c.add(lLabel);

        lField = new JTextField();
        lField.setBounds(130, 140, 250, 30);
        lField.setFont(f);
        c.add(lField);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 140, 120, 30);
        updateButton.setFont(f);
        c.add(updateButton);

        phnlabel = new JLabel("Phone ");
        phnlabel.setBounds(10, 200, 130, 30);
        phnlabel.setFont(f);
        phnlabel.setForeground(Color.WHITE);
        c.add(phnlabel);

        phnField = new JTextField();
        phnField.setBounds(130, 200, 250, 30);
        phnField.setFont(f);
        c.add(phnField);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 200, 120, 30);
        deleteButton.setFont(f);
        c.add(deleteButton);

        cgpa = new JLabel("CGPA ");
        cgpa.setBounds(10, 250, 130, 30);
        cgpa.setFont(f);
        cgpa.setForeground(Color.WHITE);
        c.add(cgpa);

        cgpaField = new JTextField();
        cgpaField.setBounds(130, 250, 250, 30);
        cgpaField.setFont(f);
        c.add(cgpaField);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 250, 120, 30);
        clearButton.setFont(f);
        c.add(clearButton);

        table = new JTable();


        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setFont(f);
        table.setSelectionBackground(Color.YELLOW);
        table.setRowHeight(35);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15, 360, 750, 300);
        c.add(scrollPane);

        JButton submit = new JButton("Submit");
        submit.setFont(f);
        submit.setBounds(320, 680, 120, 30);
        c.add(submit);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int numofrow=table.getSelectedRow();

                String fname= (String) model.getValueAt(numofrow,0);
                String lname= (String) model.getValueAt(numofrow,1);
                String phn= (String) model.getValueAt(numofrow,2);
                String cgpa= (String) model.getValueAt(numofrow,3);

                fField.setText(fname);
                lField.setText(lname);
                phnField.setText(phn);
                cgpaField.setText(cgpa);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == addButton) {
            row[0] = fField.getText();
            row[1] = lField.getText();
            row[2] = phnField.getText();
            row[3] = cgpaField.getText();
            model.addRow(row);
        } else if (actionEvent.getSource() == clearButton) {
            fField.setText("");
            lField.setText("");
            phnField.setText("");
            cgpaField.setText("");
        } else if (actionEvent.getSource() == deleteButton) {
            int number = table.getSelectedRow();
            if (number > 0) {
                model.removeRow(number);
            } else {
                JOptionPane.showMessageDialog(null, "Please Select Row");
            }
        }else if(actionEvent.getSource()==updateButton){
            int numberofRow=table.getSelectedRow();
            String fname=fField.getText();
            String lname=lField.getText();
            String phone=phnField.getText();
            String gpa=cgpaField.getText();

            model.setValueAt(fname,numberofRow,0);
            model.setValueAt(lname,numberofRow,1);
            model.setValueAt(phone,numberofRow,2);
            model.setValueAt(gpa,numberofRow,3);
        }

    }

    public static void main(String[] args) {
        Student_Management frame = new Student_Management();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setTitle("Student_Management");
        frame.setLocationRelativeTo(null);
    }

}
