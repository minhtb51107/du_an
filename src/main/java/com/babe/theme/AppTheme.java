package com.babe.theme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AppTheme {
    // Colors
    public static final Color PRIMARY = new Color(63, 131, 248);
    public static final Color PRIMARY_DARK = new Color(73, 28, 153);
    public static final Color PRIMARY_LIGHT = new Color(123, 78, 203);
    public static final Color BACKGROUND = new Color(245, 247, 250);
    public static final Color SURFACE = Color.WHITE;
    public static final Color TEXT_PRIMARY = new Color(33, 33, 33);
    public static final Color TEXT_SECONDARY = new Color(117, 117, 117);
    public static final Color SECONDARY = new Color(40, 60, 99);
    public static final Color ACCENT = new Color(255, 255, 255);
    public static final Color TEXT = new Color(60, 60, 60);
    public static final Color TEXT_LIGHT = new Color(100, 100, 100);
    public static final Color BORDER = new Color(230, 230, 230);
    public static final Color HOVER = new Color(240, 242, 245);
    public static final Color SELECTED = new Color(240, 245, 255);
    public static final Color ERROR = new Color(220, 53, 69);
    public static final Color SUCCESS = new Color(40, 167, 69);
    public static final Color WARNING = new Color(255, 193, 7);
    public static final Color INFO = new Color(23, 162, 184);

    // Fonts
    public static final Font HEADING = new Font("Segoe UI", Font.BOLD, 24);
    public static final Font SUBHEADING = new Font("Segoe UI", Font.BOLD, 18);
    public static final Font BODY = new Font("Segoe UI", Font.PLAIN, 14);

    // Spacing
    public static final int SPACING_SMALL = 8;
    public static final int SPACING_MEDIUM = 16;
    public static final int SPACING_LARGE = 24;

    // Border radius
    public static final int BORDER_RADIUS = 8;

    public static void setupTheme() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            // Panel settings
            UIManager.put("Panel.background", BACKGROUND);
            UIManager.put("Panel.font", BODY);

            // Button settings
            UIManager.put("Button.background", SURFACE);
            UIManager.put("Button.foreground", PRIMARY);
            UIManager.put("Button.font", BODY);
            UIManager.put("Button.border", BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(PRIMARY_LIGHT),
                new EmptyBorder(SPACING_SMALL, SPACING_MEDIUM, SPACING_SMALL, SPACING_MEDIUM)
            ));

            // Label settings
            UIManager.put("Label.font", BODY);
            UIManager.put("Label.foreground", TEXT_PRIMARY);

            // TextField settings
            UIManager.put("TextField.font", BODY);
            UIManager.put("TextField.foreground", TEXT_PRIMARY);
            UIManager.put("TextField.background", SURFACE);
            UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(PRIMARY_LIGHT),
                new EmptyBorder(SPACING_SMALL, SPACING_SMALL, SPACING_SMALL, SPACING_SMALL)
            ));

            // ComboBox settings
            UIManager.put("ComboBox.font", BODY);
            UIManager.put("ComboBox.foreground", TEXT_PRIMARY);
            UIManager.put("ComboBox.background", SURFACE);
            UIManager.put("ComboBox.border", BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(PRIMARY_LIGHT),
                new EmptyBorder(SPACING_SMALL, SPACING_SMALL, SPACING_SMALL, SPACING_SMALL)
            ));

            // CheckBox settings
            UIManager.put("CheckBox.font", BODY);
            UIManager.put("CheckBox.foreground", TEXT_PRIMARY);
            UIManager.put("CheckBox.background", SURFACE);

            // ToggleButton settings
            UIManager.put("ToggleButton.font", BODY);
            UIManager.put("ToggleButton.foreground", Color.WHITE);
            UIManager.put("ToggleButton.background", PRIMARY);
            UIManager.put("ToggleButton.select", PRIMARY_DARK);
            UIManager.put("ToggleButton.border", new EmptyBorder(
                SPACING_SMALL, SPACING_MEDIUM, SPACING_SMALL, SPACING_MEDIUM
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 