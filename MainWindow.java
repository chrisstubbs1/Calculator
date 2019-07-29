package com.chrisstubbs;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private Panel panel;
    private ToolBar toolBar;

    public MainWindow() {
        super("Calculator");
        setLayout(new BorderLayout());

        panel = new Panel();
        toolBar = new ToolBar();
        toolBar.setPreferredSize(new Dimension(50, 50));

        add(toolBar, BorderLayout.PAGE_START);
        add(panel, BorderLayout.CENTER);

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
