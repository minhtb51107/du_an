/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kehoach;

import com.swing.RoundedPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class GridBagPanelDemo extends JPanel {

    private JPanel mainPanel; // Panel chứa nội dung sẽ thay đổi
    private CardLayout cardLayout; // Layout giúp chuyển đổi nội dung
    JLabel lblTitle;

    public GridBagPanelDemo() {
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Xóa viền gốc
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setOpaque(false);

        // Hàng 1: Thanh Menu
        JPanel menuPanel = new JPanel(new BorderLayout());
        menuPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // Xóa viền gốc

        // Tạo JLabel tiêu đề
        lblTitle = new JLabel("Trang Khóa biểu");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 34));
        lblTitle.setForeground(Color.BLACK);
        lblTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 20)); // Cách phải 1 chút

        // Tạo panel chứa các nút, dùng FlowLayout.RIGHT
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));

        // Tạo RoundedPanel chứa JButton
        RoundedPanel KhoaBieu = createRoundedPanel();
        RoundedPanel TodoList = createRoundedPanel();
        RoundedPanel NhatKy = createRoundedPanel();

        // Tạo JButton với icon
        JButton btnKhoaBieu = createButtonWithIcon("Khóa biểu", "/com/img/calendar (1).png");
        KhoaBieu.setBackground(new Color(238, 239, 233, 255));
        btnKhoaBieu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                KhoaBieu.setBackground(new Color(238, 239, 233, 255));
                TodoList.setBackground(new Color(223, 223, 215, 255));
                NhatKy.setBackground(new Color(223, 223, 215, 255));
            }
        });
        JButton btnTodoList = createButtonWithIcon("To-do List", "/com/img/to-do-list.png");
        btnTodoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                KhoaBieu.setBackground(new Color(223, 223, 215, 255));
                TodoList.setBackground(new Color(238, 239, 233, 255));
                NhatKy.setBackground(new Color(223, 223, 215, 255));
            }
        });
        JButton btnNhatKy = createButtonWithIcon("Nhật ký", "/com/img/diary.png");
        btnNhatKy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                KhoaBieu.setBackground(new Color(223, 223, 215, 255));
                TodoList.setBackground(new Color(223, 223, 215, 255));
                NhatKy.setBackground(new Color(238, 239, 233, 255));
            }
        });

        // Đặt JButton vào RoundedPanel với GridBagConstraints để căn giữa
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        KhoaBieu.add(btnKhoaBieu, gbc);
        TodoList.add(btnTodoList, gbc);
        NhatKy.add(btnNhatKy, gbc);

        // Thêm các RoundedPanel vào buttonPanel
        buttonPanel.add(KhoaBieu);
        buttonPanel.add(TodoList);
        buttonPanel.add(NhatKy);
        buttonPanel.setOpaque(false);

        // Thêm tiêu đề và các nút vào menuPanel
        menuPanel.add(lblTitle, BorderLayout.WEST);
        menuPanel.add(buttonPanel, BorderLayout.CENTER);
        menuPanel.setOpaque(false);

        // Thêm menuPanel vào giao diện chính
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(menuPanel, gbc);

        // Panel chính để hiển thị nội dung
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.setBorder(BorderFactory.createEmptyBorder());
        mainPanel.setOpaque(false);

        // Các panel nội dung
        JPanel panelKhoaBieu = createPanel(new Color(238, 239, 233, 255), "");
        panelKhoaBieu.setLayout(new BorderLayout());
        panelKhoaBieu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panelKhoaBieu.setPreferredSize(new Dimension(500, 400));  // Kích thước mong muốn
        panelKhoaBieu.setMinimumSize(new Dimension(500, 400));    // Không cho nhỏ hơn
        panelKhoaBieu.setMaximumSize(new Dimension(500, 400));    // Không cho lớn hơn

        JScrollPane scrollPane = new JScrollPane();
        GiaoDienKeHoach panel = new GiaoDienKeHoach(scrollPane);

        scrollPane.setViewportView(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
//        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        scrollPane.setOpaque(false);
        scrollPane.setViewportBorder(null);

        panelKhoaBieu.add(scrollPane);

        JPanel panelTodoList = createPanel(new Color(238, 239, 233, 255), "To-do List nội dung");
        panelTodoList.setLayout(new BorderLayout());
        TodoListApp app = new TodoListApp();
        panelTodoList.add(app, BorderLayout.CENTER);

        JPanel panelNhatKy = createPanel(new Color(238, 239, 233, 255), "Nhật ký nội dung");

        mainPanel.add(panelKhoaBieu, "KhoaBieu");

        mainPanel.add(panelTodoList, "TodoList");

        mainPanel.add(panelNhatKy, "NhatKy");

        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(mainPanel, gbc);

        // Xử lý sự kiện chuyển đổi nội dung
        btnKhoaBieu.addActionListener(e -> cardLayout.show(mainPanel, "KhoaBieu"));
        btnTodoList.addActionListener(e -> cardLayout.show(mainPanel, "TodoList"));
        btnNhatKy.addActionListener(e -> cardLayout.show(mainPanel, "NhatKy"));
    }

    private JPanel createPanel(Color color, String text) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(color);
        panel.add(new JLabel(text));
        return panel;
    }

    private RoundedPanel createRoundedPanel() {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(new Color(223, 223, 215, 255));
        panel.setPreferredSize(new Dimension(130, 50)); // Tăng kích thước để vừa icon + text
        panel.setLayout(new GridBagLayout()); // Căn giữa
        return panel;
    }

    private JButton createButtonWithIcon(String text, String iconPath) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(iconPath));

        // Thay đổi kích thước icon (32x32)
        Image scaledImage = originalIcon.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JButton button = new JButton(text, scaledIcon);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        button.setHorizontalAlignment(SwingConstants.LEFT); // Căn text về bên phải icon
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setIconTextGap(5); // Khoảng cách giữa icon và text
        return button;
    }

    public void setTitleColor(Color color) {
        lblTitle.setForeground(color);
    }
}
