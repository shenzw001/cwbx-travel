package com.example;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        // Set the layout to FlowLayout with right alignment
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Create the buttons
        JButton submitButton = new JButton("提交");
        JButton backButton = new JButton("返回");

        // Add action listeners
        submitButton.addActionListener(e -> System.out.println("Submit button clicked"));
        backButton.addActionListener(e -> System.out.println("Back button clicked"));

        // Add the buttons to the panel
        add(submitButton);
        add(backButton);
    }
}
