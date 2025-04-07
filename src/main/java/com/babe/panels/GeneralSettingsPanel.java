package com.babe.panels;

import com.babe.components.*;
import com.babe.theme.AppTheme;
import com.babe.model.UserProfile;
import com.entity.HeThong;
import com.trangchu.CustomPanel;
import com.trangchu.LineChartExample;
import com.ui.MainFrame;
import com.ui.MainFrame.TrangBaiHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class GeneralSettingsPanel extends JPanel {
    private final UserProfile userProfile;
    private static final Color BLUE_COLOR = new Color(63, 131, 248);
    private static final Color HOVER_COLOR = new Color(255, 255, 255, 30);
    private static final Color PRESSED_COLOR = new Color(0, 0, 0, 30);
    private static final int BORDER_RADIUS = 20;
    
    HeThong ht = new HeThong();  

    public GeneralSettingsPanel(UserProfile userProfile) {
        this.userProfile = userProfile;
        setupPanel();
//        setOpaque(false);
    }

    private ImageIcon createIcon(String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image image = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    private void setupPanel() {
        setLayout(new GridBagLayout());
        setBackground(AppTheme.BACKGROUND);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 25, 15, 25);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;

        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new BoxLayout(mainContentPanel, BoxLayout.Y_AXIS));
        mainContentPanel.setBackground(Color.WHITE);
        mainContentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Header
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        headerPanel.setOpaque(false);
        
        JLabel iconLabel = new JLabel(createIcon("/com/img/general.png"));
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        iconLabel.setForeground(new Color(100, 100, 100));
        
        JLabel titleLabel = new JLabel("Cài đặt chung");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(40, 40, 40));
        
        headerPanel.add(iconLabel);
        headerPanel.add(titleLabel);

        mainContentPanel.add(headerPanel);
        mainContentPanel.add(Box.createVerticalStrut(30));

        // Giao diện
        addSection("Giao diện", mainContentPanel);
        addThemeSelector(mainContentPanel);
        //addFontSizeSelector(mainContentPanel);

        // Tùy chỉnh nội dung hiển thị
        addSection("Tùy chỉnh thông báo", mainContentPanel);
        addCompletedLessonsToggle(mainContentPanel);
        addLearningTipsToggle(mainContentPanel);
        //addEasyReadingMode(mainContentPanel);

        // Hỗ trợ & Phản hồi
        addSection("Hỗ trợ & Phản hồi", mainContentPanel);
        addFeedbackButton(mainContentPanel);
        addBugReportButton(mainContentPanel);
        addUserGuideButton(mainContentPanel);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(mainContentPanel, gbc);
    }

    private void addSection(String title, JPanel container) {
        container.add(Box.createVerticalStrut(20));
        
        JPanel sectionPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                g2d.setFont(new Font("Segoe UI", Font.BOLD, 18));
                g2d.setColor(new Color(40, 60, 99));
                g2d.drawString(title, 0, 20);
                
                g2d.setColor(new Color(230, 230, 230));
                g2d.setStroke(new BasicStroke(1.0f));
                g2d.drawLine(0, 35, getWidth(), 35);
                
                g2d.dispose();
            }
        };
        sectionPanel.setOpaque(false);
        sectionPanel.setPreferredSize(new Dimension(0, 45));
        sectionPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        
        container.add(sectionPanel);
    }

    private void addThemeSelector(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Chủ đề:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboPanel.setOpaque(false);

        String[] themes = {"Sáng", "Tối"};
        JComboBox<String> themeCombo = new JComboBox<>(themes);
        themeCombo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        themeCombo.setPreferredSize(new Dimension(200, 35));
        themeCombo.setBackground(Color.WHITE);
        themeCombo.setForeground(new Color(60, 60, 60));
        
        // Tạo border với góc bo tròn
        themeCombo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        // Thiết lập renderer để tùy chỉnh hiển thị các item
        themeCombo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value,
                    int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                setFont(new Font("Segoe UI", Font.PLAIN, 14));
                setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

                String selected = (String) themeCombo.getSelectedItem();
                
                LineChartExample ln = new LineChartExample();    
                  
                if (selected == "Sáng") {
                    ht.setSangtoi(true);
                    //ht.setMau(new Color(43, 43, 41, 255));
                } else {
                    ht.setSangtoi(false);
                    //ht.setMau(new Color(255, 255, 255, 255));
                }

                if (isSelected) {
                    setBackground(new Color(240, 245, 255));
                    setForeground(new Color(63, 131, 248));
                } else {
                    setBackground(Color.WHITE);
                    setForeground(new Color(60, 60, 60));
                }

//                System.out.println("isSangtoi " + ht.isSangtoi());
                return this;
            }
        });

        comboPanel.add(themeCombo);
        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(comboPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }
     
private void addFontSizeSelector(JPanel container) {
    JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
    rowPanel.setOpaque(false);
    rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

    JLabel label = new JLabel("Cỡ chữ:");
    label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    label.setForeground(new Color(60, 60, 60));

    JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
    buttonsPanel.setOpaque(false);

    String[] sizes = {"Nhỏ", "Vừa", "Lớn"};
    ButtonGroup sizeGroup = new ButtonGroup();

    for (String size : sizes) {
        StyledToggleButton btn = new StyledToggleButton(size);
        btn.setPreferredSize(new Dimension(80, 35));

        if (size.equals("Vừa")) {
            btn.setSelected(true);
        }

        // Thêm sự kiện cho nút
        btn.addActionListener(e -> {
            switch (size) {
                case "Nhỏ":
                    ht.setCochu("Nhỏ");
                    break;
                case "Vừa":
                    ht.setCochu("Vừa");
                    break;
                case "Lớn":
                    ht.setCochu("Lớn");
                    break;
            } 
        });


        sizeGroup.add(btn);
        buttonsPanel.add(btn);
    }

    rowPanel.add(label, BorderLayout.WEST);
    rowPanel.add(buttonsPanel, BorderLayout.CENTER);

    container.add(rowPanel);
}


    private void addCompletedLessonsToggle(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Ẩn/Hiện thông báo bài học:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel togglePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        togglePanel.setOpaque(false);
        togglePanel.add(new StyledSwitchButton());

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(togglePanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addLearningTipsToggle(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Ẩn/Hiện thông báo khóa biểu:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel togglePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        togglePanel.setOpaque(false);
        togglePanel.add(new StyledSwitchButton());

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(togglePanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

//    private void addEasyReadingMode(JPanel container) {
//        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
//        rowPanel.setOpaque(false);
//        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
//
//        JLabel label = new JLabel("Chế độ đọc dễ dàng:");
//        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//        label.setForeground(new Color(60, 60, 60));
//
//        JPanel sliderPanel = new JPanel(new BorderLayout(10, 5));
//        sliderPanel.setOpaque(false);
//
//        // Tạo slider với 3 mức: 0 (bé), 1 (vừa), 2 (lớn)
//        JSlider sizeSlider = new JSlider(JSlider.HORIZONTAL, 0, 2, 1);
//        sizeSlider.setOpaque(false);
//        sizeSlider.setPreferredSize(new Dimension(300, 40));
//        sizeSlider.setMajorTickSpacing(1);
//        sizeSlider.setSnapToTicks(true);
//        
//        // Tùy chỉnh giao diện của slider
//        sizeSlider.setUI(new javax.swing.plaf.basic.BasicSliderUI(sizeSlider) {
//            @Override
//            public void paintTrack(Graphics g) {
//                Graphics2D g2d = (Graphics2D) g;
//                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//                
//                // Vẽ phần track đã chọn (màu xanh)
//                g2d.setColor(AppTheme.PRIMARY);
//                g2d.fillRect(trackRect.x, trackRect.y + (trackRect.height - 4) / 2, 
//                           thumbRect.x - trackRect.x + 8, 4);
//                
//                // Vẽ phần track chưa chọn (màu xám)
//                g2d.setColor(new Color(220, 220, 220));
//                g2d.fillRect(thumbRect.x + 8, trackRect.y + (trackRect.height - 4) / 2,
//                           trackRect.x + trackRect.width - thumbRect.x - 8, 4);
//
//                // Vẽ các điểm đánh dấu
//                int tickWidth = 2;
//                int tickHeight = 8;
//                g2d.setColor(new Color(200, 200, 200));
//                
//                // Vẽ điểm đánh dấu cho "Bé"
//                int x1 = trackRect.x;
//                int y1 = trackRect.y + (trackRect.height - tickHeight) / 2;
//                g2d.fillRect(x1, y1, tickWidth, tickHeight);
//                
//                // Vẽ điểm đánh dấu cho "Vừa"
//                int x2 = trackRect.x + trackRect.width / 2;
//                g2d.fillRect(x2, y1, tickWidth, tickHeight);
//                
//                // Vẽ điểm đánh dấu cho "Lớn"
//                int x3 = trackRect.x + trackRect.width;
//                g2d.fillRect(x3 - tickWidth, y1, tickWidth, tickHeight);
//            }
//
//            @Override
//            public void paintThumb(Graphics g) {
//                Graphics2D g2d = (Graphics2D) g;
//                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//                // Vẽ thumb tròn màu trắng với viền xanh
//                g2d.setColor(Color.WHITE);
//                g2d.fillOval(thumbRect.x, thumbRect.y, 16, 16);
//                g2d.setColor(AppTheme.PRIMARY);
//                g2d.setStroke(new BasicStroke(2));
//                g2d.drawOval(thumbRect.x, thumbRect.y, 16, 16);
//            }
//        });
//
//        // Panel chứa các nhãn
//        JPanel labelContainer = new JPanel(new GridLayout(1, 3));
//        labelContainer.setOpaque(false);
//
//        JLabel smallLabel = new JLabel("Bé");
//        smallLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//        smallLabel.setForeground(new Color(100, 100, 100));
//        smallLabel.setHorizontalAlignment(SwingConstants.LEFT);
//
//        JLabel mediumLabel = new JLabel("Vừa");
//        mediumLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//        mediumLabel.setForeground(new Color(100, 100, 100));
//        mediumLabel.setHorizontalAlignment(SwingConstants.CENTER);
//
//        JLabel largeLabel = new JLabel("Lớn");
//        largeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//        largeLabel.setForeground(new Color(100, 100, 100));
//        largeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//
//        labelContainer.add(smallLabel);
//        labelContainer.add(mediumLabel);
//        labelContainer.add(largeLabel);
//
//        sliderPanel.add(sizeSlider, BorderLayout.CENTER);
//        sliderPanel.add(labelContainer, BorderLayout.SOUTH);
//
//        rowPanel.add(label, BorderLayout.WEST);
//        rowPanel.add(sliderPanel, BorderLayout.CENTER);
//        
//        container.add(rowPanel);
//
//        // Thêm ChangeListener để xử lý sự kiện khi giá trị thay đổi
//        sizeSlider.addChangeListener(e -> {
//            if (!sizeSlider.getValueIsAdjusting()) {
//                int value = sizeSlider.getValue();
//                String size = switch (value) {
//                    case 0 -> "Bé";
//                    case 1 -> "Vừa";
//                    case 2 -> "Lớn";
//                    default -> "Vừa";
//                };
//                // Xử lý thay đổi kích thước font ở đây
//            }
//        });
//    }

    private void addFeedbackButton(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Gửi phản hồi về ứng dụng:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setOpaque(false);

        StyledButton feedbackButton = new StyledButton("Gửi phản hồi", false);
        feedbackButton.setPreferredSize(new Dimension(120, 35));
        feedbackButton.addActionListener(e -> showFeedbackDialog());
        buttonPanel.add(feedbackButton);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addBugReportButton(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Báo cáo lỗi hoặc đề xuất:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setOpaque(false);

        StyledButton reportButton = new StyledButton("Báo cáo", false);
        reportButton.setPreferredSize(new Dimension(120, 35));
        reportButton.addActionListener(e -> showBugReportDialog());
        buttonPanel.add(reportButton);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addUserGuideButton(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Xem hướng dẫn sử dụng:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setOpaque(false);

        StyledButton guideButton = new StyledButton("Xem hướng dẫn", false);
        guideButton.setPreferredSize(new Dimension(120, 35));
        guideButton.addActionListener(e -> showUserGuide());
        buttonPanel.add(guideButton);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void showFeedbackDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Gửi phản hồi");
        dialog.setModal(true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        feedbackArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        JScrollPane scrollPane = new JScrollPane(feedbackArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton sendButton = new StyledButton("Gửi", true);
        sendButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(dialog,
                "Cảm ơn bạn đã gửi phản hồi!",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE);
            dialog.dispose();
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(sendButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    private void showBugReportDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Báo cáo lỗi hoặc đề xuất");
        dialog.setModal(true);
        dialog.setSize(400, 350);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup group = new ButtonGroup();
        JRadioButton bugButton = new JRadioButton("Báo cáo lỗi");
        JRadioButton suggestionButton = new JRadioButton("Đề xuất tính năng");
        group.add(bugButton);
        group.add(suggestionButton);
        bugButton.setSelected(true);
        typePanel.add(bugButton);
        typePanel.add(suggestionButton);

        JTextArea reportArea = new JTextArea();
        reportArea.setLineWrap(true);
        reportArea.setWrapStyleWord(true);
        reportArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        panel.add(typePanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(reportArea), BorderLayout.CENTER);

        JButton sendButton = new StyledButton("Gửi", true);
        sendButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(dialog,
                "Cảm ơn bạn đã gửi báo cáo!",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE);
            dialog.dispose();
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(sendButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    private void showUserGuide() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Hướng dẫn sử dụng");
        dialog.setModal(true);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextPane guidePane = new JTextPane();
        guidePane.setEditable(false);
        guidePane.setContentType("text/html");
        guidePane.setText(
            "<html><body style='font-family: Segoe UI; font-size: 14px;'>" +
            "<h2>Hướng dẫn sử dụng ứng dụng</h2>" +
            "<h3>1. Giao diện chính</h3>" +
            "<p>- Thanh công cụ phía trên chứa các chức năng chính</p>" +
            "<p>- Menu bên trái để điều hướng giữa các phần của ứng dụng</p>" +
            "<h3>2. Học tập</h3>" +
            "<p>- Chọn khóa học từ danh sách</p>" +
            "<p>- Làm bài tập và theo dõi tiến độ</p>" +
            "<h3>3. Cài đặt</h3>" +
            "<p>- Tùy chỉnh giao diện theo sở thích</p>" +
            "<p>- Điều chỉnh thông báo và quyền riêng tư</p>" +
            "</body></html>"
        );

        JScrollPane scrollPane = new JScrollPane(guidePane);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton closeButton = new StyledButton("Đóng", false);
        closeButton.addActionListener(e -> dialog.dispose());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(closeButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        dialog.add(panel);
        dialog.setVisible(true);
    }
} 