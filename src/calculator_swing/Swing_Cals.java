/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Kishor Kc
 */
public class Swing_Cals {

    public static void main(String args[]) {
        Cals c = new Cals();
        c.setTitle("Calculator");
        c.setBounds(100, 100, 500, 400);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);
    }
}

class Cals extends JFrame implements ActionListener {

    Container c;

    JTextField t1;
    JTextField t2;
    JLabel j1;
    JLabel j2;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JLabel result;

    public Cals() {

        c = getContentPane();
        c.setLayout(null);

        j1 = new JLabel();
        j1.setText("First Number");
        j1.setBounds(5, 10, 120, 10);
        c.add(j1);

        t1 = new JTextField();
        t1.setBounds(130, 10, 120, 20);
        c.add(t1);

        j2 = new JLabel();
        j2.setText("Second Number");
        j2.setBounds(5, 40, 120, 10);
        c.add(j2);

        t2 = new JTextField();
        t2.setBounds(130, 40, 120, 20);
        c.add(t2);

        btn1 = new JButton();
        btn1.setText("+");
        btn1.setBounds(5, 80, 80, 20);
        c.add(btn1);

        btn2 = new JButton();
        btn2.setText("-");
        btn2.setBounds(95, 80, 80, 20);
        c.add(btn2);

        btn3 = new JButton();
        btn3.setText("*");
        btn3.setBounds(5, 110, 80, 20);
        c.add(btn3);

        btn4 = new JButton();
        btn4.setText("÷");
        btn4.setBounds(95, 110, 80, 20);
        c.add(btn4);

        result = new JLabel();
        result.setText("Result : ");
        result.setBounds(5, 150, 180, 20);
        c.add(result);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btn1) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("Result : " + c);
            }
            if (e.getSource() == btn2) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("Result : " + c);
            }
            if (e.getSource() == btn3) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                result.setText("Result : " + c);
            }
            if (e.getSource() == btn4) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                result.setText("Result : " + c);
            }
        } catch (NumberFormatException e1) {
            System.out.println(e1);
            result.setText("Please Input Number Only! ");
        }
    }
}
