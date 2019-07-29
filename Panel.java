package com.chrisstubbs;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    protected static JTextArea display;
    private GridBagConstraints c = new GridBagConstraints();
    private long temp;
    private int choice; //this variable controls what operation to use when equal is pressed
    private long answer;

    public Panel() {
        setLayout(new GridBagLayout());
        setBackground(Color.GRAY);

        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(1, 1, 1, 1);

        //display bar
        display = new JTextArea();
        display.setEditable(false);
        c.gridwidth = 5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(display, c);

        c.gridwidth = 1;

        //first column
        JButton button = new JButton("7");
        c.gridx = 1;
        c.gridy = 1;
        button.addActionListener(e -> display.append("7"));
        add(button, c);

        button = new JButton("4");
        c.gridx = 1;
        c.gridy = 2;
        button.addActionListener(e -> display.append("4"));
        add(button, c);

        button = new JButton("1");
        c.gridx = 1;
        c.gridy = 3;
        button.addActionListener(e -> display.append("1"));
        add(button, c);

        button = new JButton("0");
        c.gridx = 1;
        c.gridy = 4;
        button.addActionListener(e -> display.append("0"));
        add(button, c);

        //second column
        button = new JButton("8");
        c.gridx = 2;
        c.gridy = 1;
        button.addActionListener(e -> display.append("8"));
        add(button, c);

        button = new JButton("5");
        c.gridx = 2;
        c.gridy = 2;
        button.addActionListener(e -> display.append("5"));
        add(button, c);

        button = new JButton("2");
        c.gridx = 2;
        c.gridy = 3;
        button.addActionListener(e -> display.append("2"));
        add(button, c);

        button = new JButton(".");
        c.gridx = 2;
        c.gridy = 4;
        button.addActionListener(e -> display.append("."));
        add(button, c);

        //third column
        button = new JButton("9");
        c.gridx = 3;
        c.gridy = 1;
        button.addActionListener(e -> display.append("9"));
        add(button, c);

        button = new JButton("6");
        c.gridx = 3;
        c.gridy = 2;
        button.addActionListener(e -> display.append("6"));
        add(button, c);

        button = new JButton("3");
        c.gridx = 3;
        c.gridy = 3;
        button.addActionListener(e -> display.append("3"));
        add(button, c);

        button = new JButton("+");
        c.gridx = 3;
        c.gridy = 4;
        button.addActionListener(e -> {
            String tempS = display.getText();
            temp = Long.parseLong(tempS);
            display.setText(null);
            choice = 1;
        });
        add(button, c);


        //fourth row
        button = new JButton("/");
        c.gridx = 4;
        c.gridy = 1;
        button.addActionListener(e -> {
            String tempS = display.getText();
            temp = Long.parseLong(tempS);
            display.setText(null);
            choice = 2;
        });
        add(button, c);

        button = new JButton("X");
        c.gridx = 4;
        c.gridy = 2;
        button.addActionListener(e -> {
            String tempS = display.getText();
            temp = Long.parseLong(tempS);
            display.setText(null);
            choice = 3;
        });
        add(button, c);

        button = new JButton("-");
        c.gridx = 4;
        c.gridy = 3;
        button.addActionListener(e -> {
            String tempS = display.getText();
            temp = Long.parseLong(tempS);
            display.setText(null);
            choice = 4;
        });
        add(button, c);

        button = new JButton("=");
        c.gridheight = 2;
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 4;
        c.gridy = 4;
        button.addActionListener(e -> {

            String temp1 = display.getText();
            long long1 = Long.parseLong(temp1);

            switch (choice) {
                case 1:
                    answer = temp + long1;
                    display.setText(Long.toString(answer));
                    break;
                case 2:
                    answer = temp / long1;
                    display.setText(Long.toString(answer));
                    break;
                case 3:
                    answer = temp * long1;
                    display.setText(Long.toString(answer));
                    break;
                case 4:
                    answer = temp - long1;
                    display.setText(Long.toString(answer));
                    break;
            }
        });
        add(button, c);
    }
}
