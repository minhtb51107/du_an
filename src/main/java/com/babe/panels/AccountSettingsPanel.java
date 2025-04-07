package com.babe.panels;

import com.babe.components.*;
import com.babe.theme.AppTheme;
import com.babe.model.UserProfile;
import com.dao.ThongTinDAO;
import com.dao.UserDAO;
import com.entity.NguoiDung;
import com.entity.ThongTinCaNhan;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.imageio.ImageIO;

public class AccountSettingsPanel extends JPanel {
    private final UserProfile userProfile;
    private JTextField usernameField;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JComboBox<String> dayCombo;
    private JComboBox<String> monthCombo;
    private JComboBox<String> yearCombo;
    private JTextArea bioArea;
    private String selectedGender;
    private JPanel avatarPanel;
    private ImageIcon currentAvatar;
    private static final Color BLUE_COLOR = new Color(63, 131, 248);
    private static final Color HOVER_COLOR = new Color(255, 255, 255, 30);
    private static final Color PRESSED_COLOR = new Color(0, 0, 0, 30);
    private static final int BORDER_RADIUS = 20;
    
    JFileChooser fileChooser;

    
        // Lấy mã người dùng từ đối tượng nguoiDung
    NguoiDung nguoiDung = new NguoiDung();
    ThongTinCaNhan thongTinCaNhan = new ThongTinCaNhan();
    String maND = nguoiDung.getMaNguoiDung();
    
    ThongTinDAO dao1 = new ThongTinDAO();
    
    UserDAO dao = new UserDAO();

    public AccountSettingsPanel(UserProfile userProfile) {
        this.userProfile = userProfile;
        setupPanel();
        
        usernameField.setText(dao1.selectTenHienThi(maND));
        nameField.setText(dao1.selectHoTen(maND));
        emailField.setText(dao.selectEmail(maND));
        phoneField.setText(dao.selectSDT(maND));
        bioArea.setText(dao1.selectTieuSu(maND));
        dayCombo.setSelectedItem(dao1.selectNgay(maND));
        monthCombo.setSelectedItem(dao1.selectThang(maND));
        yearCombo.setSelectedItem(dao1.selectNam(maND));
        selectedGender = dao1.selectGioiTinh(maND);
        currentAvatar = new ImageIcon(dao1.selectAnhDaiDien(maND));
    }

    private ImageIcon createIcon(String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image image = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    private void setupPanel() {
        setLayout(new BorderLayout());
        setBackground(AppTheme.BACKGROUND);

        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new BoxLayout(mainContentPanel, BoxLayout.Y_AXIS));
        mainContentPanel.setBackground(Color.WHITE);
        mainContentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Header
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        headerPanel.setOpaque(false);
        
        JLabel iconLabel = new JLabel(createIcon("/com/img/account.png"));
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        iconLabel.setForeground(new Color(100, 100, 100));
        
        JLabel titleLabel = new JLabel("Cài đặt tài khoản");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(40, 40, 40));
        
        headerPanel.add(iconLabel);
        headerPanel.add(titleLabel);

        mainContentPanel.add(headerPanel);
        mainContentPanel.add(Box.createVerticalStrut(30));

        // Thông tin cá nhân
        addSection("Thông tin cá nhân", mainContentPanel);
        addProfilePicture(mainContentPanel);
        addUsernameField(mainContentPanel);
        addFullNameField(mainContentPanel);
        addEmailField(mainContentPanel);
        addPhoneField(mainContentPanel);
        addBirthdayField(mainContentPanel);
        addGenderField(mainContentPanel);
        addBioField(mainContentPanel);
        addSaveButton(mainContentPanel, "Lưu thông tin cá nhân");

        // Liên kết mạng xã hội
//        addSection("Liên kết mạng xã hội", mainContentPanel);
//        addSocialMediaLinks(mainContentPanel);

        // Tạo JScrollPane với các tùy chỉnh
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        
        // Tùy chỉnh thanh cuộn
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setPreferredSize(new Dimension(8, 0));
        verticalScrollBar.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(200, 200, 200);
                this.trackColor = Color.WHITE;
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createZeroButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createZeroButton();
            }

            private JButton createZeroButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }
            
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
                    return;
                }

                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Vẽ thumb với góc bo tròn
                g2.setColor(thumbColor);
                g2.fillRoundRect(thumbBounds.x + 1, thumbBounds.y + 1, 
                               thumbBounds.width - 2, thumbBounds.height - 2, 
                               8, 8);
                g2.dispose();
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(trackColor);
                g2.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
                g2.dispose();
            }
        });

        add(scrollPane, BorderLayout.CENTER);
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

    private void addProfilePicture(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Ảnh đại diện:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel picturePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        picturePanel.setOpaque(false);

        // Tạo panel cho ảnh đại diện
        avatarPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                if (currentAvatar != null) {
                    // Vẽ ảnh đại diện
                    Image img = currentAvatar.getImage();
                    int size = Math.min(getWidth(), getHeight());
                    g2d.setClip(new java.awt.geom.Ellipse2D.Float(0, 0, size, size));
                    g2d.drawImage(img, 0, 0, size, size, null);
                } else {
                    // Vẽ placeholder
                    g2d.setColor(new Color(240, 240, 240));
                    g2d.fillOval(0, 0, 80, 80);
                    g2d.setColor(new Color(200, 200, 200));
                    g2d.setStroke(new BasicStroke(2));
                    g2d.drawOval(0, 0, 80, 80);
                }
                
                g2d.dispose();
            }
        };
        avatarPanel.setPreferredSize(new Dimension(80, 80));
        avatarPanel.setMaximumSize(new Dimension(80, 80));

        StyledButton changeButton = new StyledButton("Thay đổi", false);
        changeButton.setPreferredSize(new Dimension(100, 35));
        changeButton.addActionListener(e -> {
            fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Chọn ảnh đại diện");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif"));
            
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    // Đọc file ảnh và tạo ImageIcon
                    ImageIcon newAvatar = new ImageIcon(fileChooser.getSelectedFile().getPath());
                    // Scale ảnh về kích thước phù hợp
                    Image scaledImage = newAvatar.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                    currentAvatar = new ImageIcon(scaledImage);
                    avatarPanel.repaint();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Không thể tải ảnh: " + ex.getMessage(),
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        picturePanel.add(avatarPanel);
        picturePanel.add(Box.createHorizontalStrut(15));
        picturePanel.add(changeButton);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(picturePanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addUsernameField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Tên hiển thị:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        usernameField = new JTextField(userProfile.getDisplayName());
        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        usernameField.setPreferredSize(new Dimension(200, 35));
        usernameField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(usernameField, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addFullNameField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Họ và tên:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        nameField = new JTextField(userProfile.getFullName());
        nameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        nameField.setPreferredSize(new Dimension(200, 35));
        nameField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(nameField, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addEmailField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Email:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        emailField = new JTextField(userProfile.getEmail());
        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        emailField.setPreferredSize(new Dimension(200, 35));
        emailField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(emailField, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addPhoneField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Số điện thoại:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        phoneField = new JTextField(userProfile.getPhone());
        phoneField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        phoneField.setPreferredSize(new Dimension(200, 35));
        phoneField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(phoneField, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addBirthdayField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Ngày sinh:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        datePanel.setOpaque(false);

        // ComboBox cho ngày
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i-1] = String.format("%02d", i);
        }
        dayCombo = createStyledComboBox(days, 70);

        // ComboBox cho tháng
        String[] months = new String[12];
        for (int i = 1; i <= 12; i++) {
            months[i-1] = String.format("%02d", i);
        }
        monthCombo = createStyledComboBox(months, 70);

        // ComboBox cho năm
        String[] years = new String[124];
        int currentYear = java.time.Year.now().getValue();
        for (int i = 0; i < 124; i++) {
            years[i] = String.valueOf(currentYear - i);
        }
        yearCombo = createStyledComboBox(years, 90);

        // Set giá trị mặc định từ userProfile
        if (userProfile.getBirthday() != null) {
            java.time.LocalDate birthday = userProfile.getBirthday();
            dayCombo.setSelectedItem(String.format("%02d", birthday.getDayOfMonth()));
            monthCombo.setSelectedItem(String.format("%02d", birthday.getMonthValue()));
            yearCombo.setSelectedItem(String.valueOf(birthday.getYear()));
        }

        // Thêm nhãn cho từng combobox
        JPanel dayWrapper = new JPanel(new BorderLayout(5, 0));
        dayWrapper.setOpaque(false);
        JLabel dayLabel = new JLabel("Ngày");
        dayLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        dayLabel.setForeground(new Color(100, 100, 100));
        dayWrapper.add(dayCombo, BorderLayout.CENTER);
        dayWrapper.add(dayLabel, BorderLayout.SOUTH);

        JPanel monthWrapper = new JPanel(new BorderLayout(5, 0));
        monthWrapper.setOpaque(false);
        JLabel monthLabel = new JLabel("Tháng");
        monthLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        monthLabel.setForeground(new Color(100, 100, 100));
        monthWrapper.add(monthCombo, BorderLayout.CENTER);
        monthWrapper.add(monthLabel, BorderLayout.SOUTH);

        JPanel yearWrapper = new JPanel(new BorderLayout(5, 0));
        yearWrapper.setOpaque(false);
        JLabel yearLabel = new JLabel("Năm");
        yearLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        yearLabel.setForeground(new Color(100, 100, 100));
        yearWrapper.add(yearCombo, BorderLayout.CENTER);
        yearWrapper.add(yearLabel, BorderLayout.SOUTH);

        datePanel.add(dayWrapper);
        datePanel.add(monthWrapper);
        datePanel.add(yearWrapper);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(datePanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private JComboBox<String> createStyledComboBox(String[] items, int width) {
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        comboBox.setPreferredSize(new Dimension(width, 35));
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(new Color(60, 60, 60));
        
        // Tạo border với góc bo tròn và padding nhỏ hơn
        comboBox.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        // Thiết lập renderer để tùy chỉnh hiển thị các item
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value,
                    int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                
                if (isSelected) {
                    label.setBackground(new Color(240, 245, 255));
                    label.setForeground(new Color(63, 131, 248));
                } else {
                    label.setBackground(Color.WHITE);
                    label.setForeground(new Color(60, 60, 60));
                }

                // Giảm padding để hiển thị đầy đủ text
                label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                return label;
            }
        });

        // Tùy chỉnh UI cho JComboBox
        comboBox.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton button = new JButton();
                ImageIcon icon = new ImageIcon(getClass().getResource("/com/img/down-arrow.png"));
                Image img = icon.getImage().getScaledInstance(12, 12, Image.SCALE_SMOOTH);
                button.setIcon(new ImageIcon(img));
                button.setBackground(Color.WHITE);
                button.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2));
                button.setFocusPainted(false);

                // Thêm hiệu ứng hover
                button.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        button.setBackground(new Color(245, 245, 245));
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        button.setBackground(Color.WHITE);
                    }
                });

                return button;
            }

            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                // Không vẽ background khi focus
            }
        });

        return comboBox;
    }

    private void addGenderField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Giới tính:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        genderPanel.setOpaque(false);

        selectedGender = userProfile.getGender();
        boolean isMale = "Nam".equals(selectedGender);
        
        JPanel malePanel = createGenderIconPanel("Nam", isMale);
        JPanel femalePanel = createGenderIconPanel("Nữ", !isMale);

        malePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedGender = "Nam";
                updateGenderSelection(malePanel, femalePanel, true);
            }
        });

        femalePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedGender = "Nữ";
                updateGenderSelection(femalePanel, malePanel, false);
            }
        });

        genderPanel.add(malePanel);
        genderPanel.add(femalePanel);

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(genderPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void updateGenderSelection(JPanel selectedPanel, JPanel unselectedPanel, boolean isMale) {
        selectedPanel.setBackground(new Color(240, 245, 255));
        unselectedPanel.setBackground(new Color(245, 245, 245));
        selectedPanel.setBorder(BorderFactory.createLineBorder(AppTheme.PRIMARY, 2));
        unselectedPanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        
        // Cập nhật màu của icon và text
        Component[] selectedComponents = selectedPanel.getComponents();
        Component[] unselectedComponents = unselectedPanel.getComponents();
        
        for (Component c : selectedComponents) {
            if (c instanceof JLabel) {
                ((JLabel) c).setForeground(AppTheme.PRIMARY);
            }
        }
        
        for (Component c : unselectedComponents) {
            if (c instanceof JLabel) {
                ((JLabel) c).setForeground(new Color(100, 100, 100));
            }
        }
    }

    private JPanel createGenderIconPanel(String gender, boolean isSelected) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(80, 80));
        panel.setBackground(isSelected ? new Color(240, 245, 255) : new Color(245, 245, 245));
        panel.setBorder(BorderFactory.createLineBorder(
            isSelected ? AppTheme.PRIMARY : new Color(200, 200, 200),
            isSelected ? 2 : 1
        ));
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Icon panel
        JPanel iconPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Vẽ icon giới tính với kích thước nhỏ hơn
                if (gender.equals("Nam")) {
                    // Vẽ icon nam (♂) - giảm size từ 30 xuống 24
                    g2d.setColor(isSelected ? AppTheme.PRIMARY : new Color(100, 100, 100));
                    g2d.setStroke(new BasicStroke(1.5f));
                    int size = 24;
                    int x = (getWidth() - size) / 2;
                    int y = (getHeight() - size) / 2;
                    g2d.drawOval(x, y, size, size);
                    g2d.drawLine(x + size - 4, y + 4, x + size + 8, y - 8);
                    g2d.drawLine(x + size + 8, y - 8, x + size + 8, y);
                    g2d.drawLine(x + size + 8, y - 8, x + size, y - 8);
                } else {
                    // Vẽ icon nữ (♀) - giảm size từ 30 xuống 24
                    g2d.setColor(isSelected ? AppTheme.PRIMARY : new Color(100, 100, 100));
                    g2d.setStroke(new BasicStroke(1.5f));
                    int size = 24;
                    int x = (getWidth() - size) / 2;
                    int y = (getHeight() - size) / 2 - 4;
                    g2d.drawOval(x, y, size, size);
                    g2d.drawLine(x + size/2, y + size, x + size/2, y + size + 12);
                    g2d.drawLine(x + size/2 - 8, y + size + 8, x + size/2 + 8, y + size + 8);
                }

                g2d.dispose();
            }
        };
        iconPanel.setOpaque(false);
        iconPanel.setPreferredSize(new Dimension(80, 45));

        // Label
        JLabel label = new JLabel(gender, SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        label.setForeground(isSelected ? AppTheme.PRIMARY : new Color(100, 100, 100));

        panel.add(iconPanel, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);

        // Thêm hiệu ứng hover
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!panel.getBackground().equals(new Color(240, 245, 255))) {
                    panel.setBackground(new Color(248, 249, 250));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!panel.getBackground().equals(new Color(240, 245, 255))) {
                    panel.setBackground(new Color(245, 245, 245));
                }
            }
        });

        return panel;
    }

    private void addBioField(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Tiểu sử:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        bioArea = new JTextArea(userProfile.getBio(), 3, 30);
        bioArea.setLineWrap(true);
        bioArea.setWrapStyleWord(true);
        bioArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        bioArea.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(new JScrollPane(bioArea), BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addSocialMediaLinks(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Panel chứa label và mô tả
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.setOpaque(false);

        JLabel label = new JLabel("Liên kết mạng xã hội:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel descLabel = new JLabel("Kết nối tài khoản mạng xã hội của bạn");
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descLabel.setForeground(new Color(140, 140, 140));
        descLabel.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
        descLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        labelPanel.add(label);
        labelPanel.add(descLabel);

        // Panel chứa các icon mạng xã hội
        JPanel socialIconsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        socialIconsPanel.setOpaque(false);

        // Tạo các icon mạng xã hội
        addSocialIcon(socialIconsPanel, "/com/img/facebook.png", "Facebook", false);
        addSocialIcon(socialIconsPanel, "/com/img/instagram.png", "Instagram", true);
        addSocialIcon(socialIconsPanel, "/com/img/discord.png", "Discord", false);

        rowPanel.add(labelPanel, BorderLayout.WEST);
        rowPanel.add(socialIconsPanel, BorderLayout.CENTER);
        container.add(rowPanel);

        // Thêm panel hiển thị các tài khoản đã liên kết
        addLinkedAccountsPanel(container);
    }

    private void addSocialIcon(JPanel container, String iconPath, String platform, boolean isLinked) {
        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new BoxLayout(iconPanel, BoxLayout.Y_AXIS));
        iconPanel.setOpaque(false);
        iconPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Icon
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(iconPath));
        Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        JLabel iconLabel = new JLabel(new ImageIcon(scaledImage));
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Trạng thái
        JLabel statusLabel = new JLabel(isLinked ? "Đã liên kết" : "Liên kết");
        statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        statusLabel.setForeground(isLinked ? new Color(0, 150, 0) : new Color(100, 100, 100));
        statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        iconPanel.add(iconLabel);
        iconPanel.add(Box.createVerticalStrut(5));
        iconPanel.add(statusLabel);

        // Thêm hover effect
        iconPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statusLabel.setForeground(AppTheme.PRIMARY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusLabel.setForeground(isLinked ? new Color(0, 150, 0) : new Color(100, 100, 100));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (!isLinked) {
                    // Xử lý liên kết tài khoản
                    JOptionPane.showMessageDialog(
                        iconPanel,
                        "Đang chuyển hướng đến trang đăng nhập " + platform,
                        "Liên kết tài khoản",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        container.add(iconPanel);
    }

    private void addLinkedAccountsPanel(JPanel container) {
        // Panel cho Instagram (đã liên kết)
        JPanel linkedAccountPanel = new JPanel(new BorderLayout(20, 0));
        linkedAccountPanel.setOpaque(false);
        linkedAccountPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        // Thông tin tài khoản
        JPanel accountInfo = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        accountInfo.setOpaque(false);

        ImageIcon instagramIcon = new ImageIcon(getClass().getResource("/com/img/instagram.png"));
        Image scaledImage = instagramIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JLabel iconLabel = new JLabel(new ImageIcon(scaledImage));

        JLabel usernameLabel = new JLabel("@your.username");
        usernameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        usernameLabel.setForeground(new Color(60, 60, 60));

        accountInfo.add(iconLabel);
        accountInfo.add(usernameLabel);

        // Panel điều khiển bên phải
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        controlPanel.setOpaque(false);

        // Switch hiển thị trên trang cá nhân
        JLabel visibilityLabel = new JLabel("Hiển thị trên trang cá nhân");
        visibilityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        visibilityLabel.setForeground(new Color(100, 100, 100));

        StyledSwitchButton visibilityToggle = new StyledSwitchButton();
        visibilityToggle.setSelected(true);

        // Nút hủy liên kết
        JLabel unlinkLabel = new JLabel("Hủy liên kết");
        unlinkLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        unlinkLabel.setForeground(new Color(220, 53, 69));
        unlinkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        unlinkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unlinkLabel.setForeground(new Color(200, 35, 51));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                unlinkLabel.setForeground(new Color(220, 53, 69));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int result = JOptionPane.showConfirmDialog(
                    container,
                    "Bạn có chắc chắn muốn hủy liên kết tài khoản Instagram không?",
                    "Xác nhận hủy liên kết",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
                );
                
                if (result == JOptionPane.YES_OPTION) {
                    // Xử lý hủy liên kết
                }
            }
        });

        controlPanel.add(visibilityLabel);
        controlPanel.add(visibilityToggle);
        controlPanel.add(Box.createHorizontalStrut(20));
        controlPanel.add(unlinkLabel);

        linkedAccountPanel.add(accountInfo, BorderLayout.WEST);
        linkedAccountPanel.add(controlPanel, BorderLayout.CENTER);

        container.add(linkedAccountPanel);
    }

    private void saveChanges() {
        try {
            // Cập nhật thông tin cơ bản
            userProfile.setDisplayName(usernameField.getText());
            userProfile.setFullName(nameField.getText());
            userProfile.setEmail(emailField.getText());
            userProfile.setPhone(phoneField.getText());
            userProfile.setBio(bioArea.getText());
            userProfile.setGender(selectedGender);

            // Cập nhật ngày sinh
            int day = Integer.parseInt((String) dayCombo.getSelectedItem());
            int month = Integer.parseInt((String) monthCombo.getSelectedItem());
            int year = Integer.parseInt((String) yearCombo.getSelectedItem());
            userProfile.setBirthday(java.time.LocalDate.of(year, month, day));

            // Cập nhật ảnh đại diện nếu có
            if (currentAvatar != null) {
                userProfile.setAvatarIcon(currentAvatar);
            }

            // Lưu vào database hoặc file
            userProfile.saveToDatabase();

            JOptionPane.showMessageDialog(
                this,
                "Đã lưu thay đổi thành công!",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                "Có lỗi xảy ra khi lưu thông tin: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void addSaveButton(JPanel container, String buttonText) {
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        StyledButton saveButton = new StyledButton(buttonText, true);
        saveButton.setPreferredSize(new Dimension(180, 35));
        
        // Thêm hiệu ứng hover và click
        saveButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc chắn muốn lưu các thay đổi?",
                "Xác nhận lưu",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            
            if (result == JOptionPane.YES_OPTION) {
                saveChanges();
                saveProfile();
            }
        });

        rowPanel.add(saveButton);
        container.add(rowPanel);
        
        // Thêm đường kẻ phân cách
        JPanel separatorPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(new Color(230, 230, 230));
                g2d.drawLine(0, 0, getWidth(), 0);
                g2d.dispose();
            }
        };
        separatorPanel.setOpaque(false);
        separatorPanel.setPreferredSize(new Dimension(0, 1));
        container.add(separatorPanel);
    }
    
    private final String dbUrl = "jdbc:sqlserver://localhost:1433;database=du_an_tot_nghiep;encrypt=true;trustServerCertificate=true;";
    private final String dbUser = "sa";
    private final String dbPassword = "123";
   
    
    private void saveProfile() {
    // Lấy dữ liệu từ form
    String username = usernameField.getText().trim();
    String fullName = nameField.getText().trim();
    String email = emailField.getText().trim();
    String phone = phoneField.getText().trim();

    String day = (String) dayCombo.getSelectedItem();
    String month = (String) monthCombo.getSelectedItem();
    String year = (String) yearCombo.getSelectedItem();
    String birthday = year + "-" + month + "-" + day; // Dạng YYYY-MM-DD
    
    String newAvatar = fileChooser.getSelectedFile().getPath();

    // Lấy ảnh đại diện nếu có thay đổi
    byte[] avatar = null;
    if (currentAvatar != null) {
        avatar = convertImageToByteArray(currentAvatar);
    }

    String bio = bioArea.getText().trim();
    String gender = selectedGender; // lấy giới tính được chọn

    try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
        conn.setAutoCommit(false); // Bắt đầu giao dịch

        // 1. Update bảng THONGTINCANHAN
        String updateThongTin = "UPDATE THONGTINCANHAN SET " +
                                "TenHienThi = ?, HoTen = ?, GioiTinh = ?, TieuSu = ?, NgaySinh = ?, AnhDaiDien = ? " +
                                "WHERE MaNguoiDung = ?";

        try (PreparedStatement pstmt1 = conn.prepareStatement(updateThongTin)) {
            pstmt1.setString(1, username);
            pstmt1.setString(2, fullName);
            pstmt1.setString(3, gender);
            pstmt1.setString(4, bio);
            pstmt1.setDate(5, Date.valueOf(birthday));
            if (avatar != null) {
                //pstmt1.setBytes(6, avatar);
                pstmt1.setString(6, newAvatar);
            } else {
                pstmt1.setNull(6, Types.VARBINARY);
            }
            pstmt1.setString(7, maND); // maNguoiDung là biến truyền vào hoặc bạn phải lấy ra

            pstmt1.executeUpdate();
        }

        // 2. Update bảng NGUOIDUNG
        String updateNguoiDung = "UPDATE NGUOIDUNG SET " +
                                 "Email = ?, SoDienThoai = ? " +
                                 "WHERE MaNguoiDung = ?";

        try (PreparedStatement pstmt2 = conn.prepareStatement(updateNguoiDung)) {
            pstmt2.setString(1, email);
            pstmt2.setString(2, phone);
            pstmt2.setString(3, maND); // maNguoiDung là biến truyền vào hoặc bạn phải lấy ra

            pstmt2.executeUpdate();
        }

        conn.commit(); // Xác nhận giao dịch
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + e.getMessage());
    }
}



// Hàm chuyển đổi ảnh thành byte array
private byte[] convertImageToByteArray(ImageIcon imageIcon) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(), imageIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = bufferedImage.createGraphics();
    imageIcon.paintIcon(null, g2d, 0, 0);
    g2d.dispose();
    try {
        ImageIO.write(bufferedImage, "png", baos);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return baos.toByteArray();
}

} 