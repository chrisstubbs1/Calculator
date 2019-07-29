package com.chrisstubbs;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
    private JButton button;
    private GridBagConstraints c = new GridBagConstraints();

    public ToolBar() {
        setLayout(new GridBagLayout());
        setBackground(Color.GRAY);

        c.insets = new Insets(1, 1, 1, 1);

//        button = new JButton("Night Mode");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        add(button,c);

        button = new JButton("Clear");
        button.addActionListener(e -> Panel.display.setText(null));
        add(button, c);
    }
}
