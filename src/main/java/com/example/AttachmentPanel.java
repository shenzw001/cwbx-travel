package com.example;

import javax.swing.*;
import java.awt.*;

public class AttachmentPanel extends JPanel {

    public AttachmentPanel() {
        setLayout(new GridLayout(1, 5, 10, 10));
        setBorder(BorderFactory.createTitledBorder("附件"));

        add(createAttachmentSection("1. 出差审批单", "上传"));
        add(createAttachmentSection("2. 发票", "扫描"));
        add(createAttachmentSection("3. 公务卡", "扫描"));
        add(createAttachmentSection("4. 通知单", "扫描"));
        add(createAttachmentSection("4. 其他文件", "扫描"));
    }

    private JPanel createAttachmentSection(String title, String buttonText) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button = new JButton(buttonText);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        button.addActionListener(e -> System.out.println(title + " button clicked"));

        panel.add(titleLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(button);

        return panel;
    }
}
