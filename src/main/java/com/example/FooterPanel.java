package com.example;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    public FooterPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel footerLabel = new JLabel("如果上面没有了您审批的单据，请到“已审批”菜单查询");
        footerLabel.setForeground(Color.RED);
        add(footerLabel);
    }
}
