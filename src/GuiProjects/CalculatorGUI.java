package com.GuiProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

    //ONLY INTEGERS!

    private static final JTextField num1 = new JTextField();
    private static final JTextField num2 = new JTextField();
    private static final JButton button = new JButton("+");
    private static final JLabel label = new JLabel("Ans: 0");
    private static final JButton button2 = new JButton("-");
    private static final JButton button3 = new JButton("*");
    private static final JButton button4 = new JButton("/");

    public CalculatorGUI()  {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator App");
        frame.add(panel);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (d.width - w) /2;
        int y = (d.height - h) /2;
        frame.setLocation(x,y);
        panel.setLayout(null);

        num1.setBounds(10,20,100,25);
        panel.add(num1);

        num2.setBounds(200,20,100,25);
        panel.add(num2);

        button.setBounds(10,80,60,25);
        button.addActionListener(this);
        panel.add(button2);

        button2.setBounds(80,80,60,25);
        button2.addActionListener(this);
        panel.add(button);

        button3.setBounds(150,80,60,25);
        button3.addActionListener(this);
        panel.add(button3);

        button4.setBounds(220,80,60,25);
        button4.addActionListener(this);
        panel.add(button4);

        label.setBounds(140,120,100,25);
        panel.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionListener buttonOne = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                int num = Integer.parseInt(num1.getText());
                int numTwo = Integer.parseInt(num2.getText());
                result = num + numTwo;
                label.setText("Ans: " + result);
            }
        };

        ActionListener buttonTwo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                int num = Integer.parseInt(num1.getText());
                int numTwo = Integer.parseInt(num2.getText());
                result = num - numTwo;
                label.setText("Ans: " + result);
            }
        };

        ActionListener buttonThree = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                int num = Integer.parseInt(num1.getText());
                int numTwo = Integer.parseInt(num2.getText());
                result = num * numTwo;
                label.setText("Ans: " + result);
            }
        };

        ActionListener buttonFour = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                int num = Integer.parseInt(num1.getText());
                int numTwo = Integer.parseInt(num2.getText());
                result = num / numTwo;
                label.setText("Ans: " + result);
            }
        };
        button.addActionListener(buttonOne);
        button2.addActionListener(buttonTwo);
        button3.addActionListener(buttonThree);
        button4.addActionListener(buttonFour);
    }
}
