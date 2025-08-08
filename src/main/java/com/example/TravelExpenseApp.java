package com.example;

import javax.swing.*;
import java.awt.*;

public class TravelExpenseApp {

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("财务报销系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame to be larger
        frame.setSize(1200, 800);

        // Add the header panel
        HeaderPanel headerPanel = new HeaderPanel();
        frame.getContentPane().add(headerPanel, BorderLayout.NORTH);

        // Add the main form panel
        MainFormPanel mainFormPanel = new MainFormPanel();

        // Add the attachment panel
        AttachmentPanel attachmentPanel = new AttachmentPanel();

        // Create a central panel to hold the main form and attachments
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(mainFormPanel, BorderLayout.CENTER);
        centerPanel.add(attachmentPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);

        // Add the footer panel
        FooterPanel footerPanel = new FooterPanel();
        frame.getContentPane().add(footerPanel, BorderLayout.SOUTH);


        // Display the window.
        frame.setVisible(true);
    }
}
