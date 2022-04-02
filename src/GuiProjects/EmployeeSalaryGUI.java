package com.GuiProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeSalaryGUI {
    private JPanel Main;
    private JTextField NameFelid;
    private JTextField TaxFeild;
    private JTextField NetSalaryFeild;
    private JButton enterButton;
    private JTextField SalaryFeild;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeSalaryGUI");
        frame.setContentPane(new EmployeeSalaryGUI().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame(frame);
        frame.pack();
        frame.setVisible(true);
    }

    private static void centerFrame(JFrame frame) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (d.width - w) /2;
        int y = (d.height - h) /2;

        frame.setLocation(x,y);
    }

    public EmployeeSalaryGUI() {
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double salary = Double.parseDouble(SalaryFeild.getText());


                double tax;

                if (salary > 50_000) {
                    tax = salary * 10/100;
                }
                else if (salary > 35_000) {
                    tax = salary * 5/100;
                }
                else {
                    tax = 0.000;
                }

                TaxFeild.setText(String.valueOf(tax));

                double net_salary;
                net_salary = salary - tax;
                NetSalaryFeild.setText(String.valueOf(net_salary));

            }
        });
    }
}
