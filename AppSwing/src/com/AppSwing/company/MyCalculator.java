package com.AppSwing.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    private double total = 0.0;
    private double total2 = 0.0;
    private char math_op;

    private JPanel Calculator;
    private JTextField textField1;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnMinus;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnPlus;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnEqual;
    private JButton btnClear;
    private JButton btnFour;


    private void getOperator(String btnText){
        math_op=btnText.charAt(0);
        total = total + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public MyCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = textField1.getText() + btnOne.getText();
                textField1.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = textField1.getText() + btnTwo.getText();
                textField1.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = textField1.getText() + btnThree.getText();
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = textField1.getText() + btnFive.getText();
                textField1.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = textField1.getText() + btnNine.getText();
                textField1.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText = textField1.getText() + btnZero.getText();
                textField1.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                } else if (textField1.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textField1.getText() + btnPoint.getText();
                    textField1.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                textField1.setText("");
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text=btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               switch (math_op){
                   case '+':
                       total2=total+Double.parseDouble(textField1.getText());
                       break;
                   case '-':
                       total2 = total - Double.parseDouble(textField1.getText());
                       break;
                   case '*':
                       total2 = total * Double.parseDouble(textField1.getText());
                       break;
                   case '/':
                       total2 = total / Double.parseDouble(textField1.getText());
                       break;
               }
                textField1.setText(Double.toString(total2));
                total = 0;
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text=btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(500, 300, 260, 300);
        frame.setResizable(false);
    }

}
