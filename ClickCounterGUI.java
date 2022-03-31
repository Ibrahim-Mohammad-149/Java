package com.CommandLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterGUI implements ActionListener {

    private static int count = 0;
    private static JLabel label = new JLabel("Number of clicks: ");

    public ClickCounterGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!");
        label = new JLabel("Number of clicks: 0");

        frame.setSize(350,200);
        frame.setTitle("Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (d.width - w) /2;
        int y = (d.height - h) /2;
        frame.setLocation(x,y);
        frame.add(panel);

        panel.setLayout(null);

        button.setBounds(120,20,100,25);
        button.addActionListener(this);
        panel.add(button);

        label.setBounds(110,100,120,25);
        panel.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounterGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
