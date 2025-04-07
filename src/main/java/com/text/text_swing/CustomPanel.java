/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text.text_swing;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    public CustomPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        // Main Panel (2 columns, 1 row)
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints mainGbc = new GridBagConstraints();
        mainGbc.fill = GridBagConstraints.BOTH;
        mainGbc.weightx = 1;
        mainGbc.weighty = 1;

        // Panel A (3 rows, 1 column)
        JPanel panelA = new JPanel(new GridBagLayout());
        GridBagConstraints panelAGbc = new GridBagConstraints();
        panelAGbc.fill = GridBagConstraints.BOTH;
        panelAGbc.weightx = 1;
        panelAGbc.weighty = 1;
        panelAGbc.gridx = 0;
        
        for (int i = 0; i < 3; i++) {
            panelAGbc.gridy = i;
            panelA.add(new JButton("A" + (i + 1)), panelAGbc);
        }

        // Panel B (2 rows, 1 column)
        JPanel panelB = new JPanel(new GridBagLayout());
        GridBagConstraints panelBGbc = new GridBagConstraints();
        panelBGbc.fill = GridBagConstraints.BOTH;
        panelBGbc.weightx = 1;
        panelBGbc.weighty = 1;
        panelBGbc.gridx = 0;
        
        for (int i = 0; i < 2; i++) {
            panelBGbc.gridy = i;
            panelB.add(new JButton("B" + (i + 1)), panelBGbc);
        }

        // Add Panel A and Panel B to mainPanel
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.weightx = 0.7;
        mainPanel.add(panelA, mainGbc);
        
        mainGbc.gridx = 1;
        mainGbc.weightx = 0.3;
        mainPanel.add(panelB, mainGbc);

        // Add mainPanel to CustomPanel
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(mainPanel, gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Panel Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new CustomPanel());
        frame.setVisible(true);
    }
}

