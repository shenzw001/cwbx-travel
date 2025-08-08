package com.example;

import javax.swing.*;
import java.awt.*;

public class MainFormPanel extends JPanel {

    public MainFormPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // "制单日期" (Date of issue)
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("制单日期:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JTextField("2025-07-25"), gbc);

        // "单据编号" (Document number)
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(new JLabel("单据编号:"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        add(new JTextField("SJ_CL_070501"), gbc);

        // "账套" (Account book)
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(new JLabel("账套:"), gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        add(new JTextField("基础数据"), gbc);

        // "报销人" (Reimburser)
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("报销人:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        add(new JTextField("张三"), gbc);
        gbc.gridwidth = 1; // reset

        // "出差事由" (Reason for travel)
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("出差事由:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        add(new JTextField(""), gbc);
        gbc.gridwidth = 1; // reset

        // "报销事由" (Reason for reimbursement)
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("报销事由:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        add(new JTextField(""), gbc);
        gbc.gridwidth = 1; // reset

        // "项目" (Project)
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("项目:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        add(new JTextField("手动选择项目"), gbc);
        gbc.gridwidth = 1; // reset

        // "是否重大" (Is it major?)
        gbc.gridx = 4;
        gbc.gridy = 4;
        add(new JLabel("是否重大:"), gbc);

        gbc.gridx = 5;
        gbc.gridy = 4;
        JPanel majorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        majorPanel.add(new JRadioButton("是"));
        majorPanel.add(new JRadioButton("否"));
        add(majorPanel, gbc);

        // Expense details table
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        String[] columnNames = {"序号", "预算指标", "项目总金额", "项目可用额", "报销可用额", "功能分类", "经济分类", "政府经济分类", "操作"};
        Object[][] data = {
            {"1", "手动选择预算指标", "自动带入", "自动带入", "自动带入", "自动带入", "自动带入", "自动带入", ""}
        };

        JTable expenseTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(expenseTable);
        add(scrollPane, gbc);

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;

        // Reimbursement details label
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 6;
        add(new JLabel("报销明细"), gbc);
        gbc.gridwidth = 1;

        // Reimbursement details table
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        String[] reimbursementColumnNames = {"序号", "开始日期", "结束日期", "出差人数", "出发地点", "到达地点", "是否含有早餐", "食宿补贴标准", "伙食补贴天数", "伙食补贴标准"};
        Object[][] reimbursementData = {
            {"", "", "", "", "", "", "", "", "", ""}
        };

        JTable reimbursementTable = new JTable(reimbursementData, reimbursementColumnNames);
        JScrollPane reimbursementScrollPane = new JScrollPane(reimbursementTable);
        add(reimbursementScrollPane, gbc);

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;

    }
}
