/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatAI;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
    public class Panel extends JPanel {
        public Panel() {
            setLayout(new BorderLayout());
            setOpaque(false);
//            setBackground(new Color(24, 24, 25));
            setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            add(new ChatAIUI(), BorderLayout.CENTER);
        }
    }
