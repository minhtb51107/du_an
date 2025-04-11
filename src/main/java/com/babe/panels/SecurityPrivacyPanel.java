package com.babe.panels;

import com.babe.components.*;
import com.babe.theme.AppTheme;
import com.babe.model.UserProfile;
import com.dao.LichSuDAO;
import com.dao.UserDAO;
import com.entity.NguoiDung;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.table.DefaultTableModel;

public class SecurityPrivacyPanel extends JPanel {
    private final UserProfile userProfile;

    public SecurityPrivacyPanel(UserProfile userProfile) {
        this.userProfile = userProfile;
        setupPanel();
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
        
        // Sử dụng icon từ file
        JLabel iconLabel = new JLabel(createIcon("/com/img/security.png"));
        
        JLabel titleLabel = new JLabel("Bảo mật & Quyền riêng tư");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(40, 40, 40));
        
        headerPanel.add(iconLabel);
        headerPanel.add(titleLabel);

        mainContentPanel.add(headerPanel);
        mainContentPanel.add(Box.createVerticalStrut(30));

        // Bảo mật
        addSection("Bảo mật", mainContentPanel);
        addPasswordChange(mainContentPanel);
        //addTwoFactorAuth(mainContentPanel);
        //addLoginHistory(mainContentPanel);
        //addLogoutAllDevices(mainContentPanel);

        // Quyền riêng tư
//        addSection("Quyền riêng tư", mainContentPanel);
//        addProfileVisibility(mainContentPanel);
//        addActivityVisibility(mainContentPanel);
//        addMessagePermission(mainContentPanel);

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
                g2d.setColor(new Color(40, 60, 99)); // Thay đổi màu tím thành màu xanh đậm
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

    NguoiDung nguoiDung = new NguoiDung();
    String maND = nguoiDung.getMaNguoiDung();
    UserDAO dao = new UserDAO();

    private void addPasswordChange(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Mật khẩu:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setOpaque(false);

        StyledToggleButton btn = new StyledToggleButton("Đổi mật khẩu");
        btn.setPreferredSize(new Dimension(120, 35));
        buttonPanel.add(btn);
        btn.addActionListener(e -> {
            openPasswordChangeForm(maND);
        });

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);

        container.add(rowPanel);
    }

    private void openPasswordChangeForm(String maNguoiDung) {
    JFrame frame = new JFrame("Đổi mật khẩu");
    frame.setSize(450, 350);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().setBackground(Color.WHITE);
    frame.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.fill = GridBagConstraints.HORIZONTAL;

    JLabel titleLabel = new JLabel("Đổi mật khẩu", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
    titleLabel.setForeground(new Color(33, 150, 243));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    frame.add(titleLabel, gbc);

    gbc.gridwidth = 1;

    JLabel codeLabel = new JLabel("Mã xác thực:");
    codeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    gbc.gridx = 0;
    gbc.gridy = 1;
    frame.add(codeLabel, gbc);

    JTextField codeField = new JTextField();
    gbc.gridx = 1;
    frame.add(codeField, gbc);

    JButton sendCodeButton = new JButton("Gửi mã tới email");
    sendCodeButton.setBackground(new Color(33, 150, 243));
    sendCodeButton.setForeground(Color.WHITE);
    sendCodeButton.setFocusPainted(false);
    sendCodeButton.addActionListener(e -> {
        String code = generateVerificationCode();
        sendVerificationCodeToEmail(maNguoiDung, code);
        JOptionPane.showMessageDialog(frame, "Mã xác thực đã được gửi tới email của bạn.");
        frame.getRootPane().putClientProperty("verificationCode", code);
    });
    gbc.gridx = 1;
    gbc.gridy = 2;
    frame.add(sendCodeButton, gbc);

    JLabel newPassLabel = new JLabel("Mật khẩu mới:");
    newPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    gbc.gridx = 0;
    gbc.gridy = 3;
    frame.add(newPassLabel, gbc);

    JPasswordField newPassField = new JPasswordField();
    gbc.gridx = 1;
    frame.add(newPassField, gbc);

    JLabel confirmPassLabel = new JLabel("Xác nhận mật khẩu:");
    confirmPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    gbc.gridx = 0;
    gbc.gridy = 4;
    frame.add(confirmPassLabel, gbc);

    JPasswordField confirmPassField = new JPasswordField();
    gbc.gridx = 1;
    frame.add(confirmPassField, gbc);

    JButton confirmButton = new JButton("Xác nhận");
    confirmButton.setBackground(new Color(76, 175, 80));
    confirmButton.setForeground(Color.WHITE);
    confirmButton.setFocusPainted(false);
    confirmButton.addActionListener(e -> {
        String enteredCode = codeField.getText().trim();
        String sentCode = (String) frame.getRootPane().getClientProperty("verificationCode");

        String newPass = new String(newPassField.getPassword());
        String confirmPass = new String(confirmPassField.getPassword());

        if (sentCode == null) {
            JOptionPane.showMessageDialog(frame, "Vui lòng gửi mã xác thực trước!");
            return;
        }

        if (!enteredCode.equals(sentCode)) {
            JOptionPane.showMessageDialog(frame, "Mã xác thực không đúng!");
            return;
        }

        if (newPass.isEmpty() || confirmPass.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        if (!newPass.equals(confirmPass)) {
            JOptionPane.showMessageDialog(frame, "Mật khẩu xác nhận không khớp!");
            return;
        }

        dao.updatePassword(maNguoiDung, newPass);
        JOptionPane.showMessageDialog(frame, "Đổi mật khẩu thành công!");
        frame.dispose();
    });
    gbc.gridx = 1;
    gbc.gridy = 5;
    frame.add(confirmButton, gbc);

    frame.setVisible(true);
}


    private void sendVerificationCodeToEmail(String maNguoiDung, String code) {
        // Lấy email người dùng từ database
        String email = dao.selectEmail(maNguoiDung);

        // Gửi email qua SMTP
        try {
            // Cấu hình SMTP và gửi mail (bạn cấu hình tùy server bạn dùng)
            EmailSender.sendEmail(email, "Mã xác thực đổi mật khẩu", "Mã xác thực của bạn là: " + code);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public class EmailSender {

        public static void sendEmail(String toEmail, String subject, String messageText) {
            final String fromEmail = "binhminh51107@gmail.com"; // Email của bạn
            final String password = "hrkm xnjk iegz ewzg"; // Mật khẩu ứng dụng (không phải mật khẩu tài khoản Gmail thông thường!)

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(fromEmail));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
                message.setSubject(subject);
                message.setText(messageText);

                Transport.send(message);
                System.out.println("Email sent successfully");
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

    private String generateVerificationCode() {
        int length = 6;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            code.append(characters.charAt(random.nextInt(characters.length())));
        }

        return code.toString();
    }




    private void addTwoFactorAuth(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Panel chứa label và mô tả
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.setOpaque(false);

        JLabel label = new JLabel("Xác thực 2 lớp:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Thêm mô tả chi tiết về xác thực 2 lớp
        JLabel descLabel = new JLabel("<html>Bảo vệ tài khoản của bạn bằng cách yêu cầu mã xác thực từ ứng dụng Authenticator.<br>" +
                                    "Khi bật tính năng này, bạn cần nhập mã xác thực mỗi khi đăng nhập từ thiết bị mới.</html>");
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descLabel.setForeground(new Color(140, 140, 140));
        descLabel.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
        descLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        labelPanel.add(label);
        labelPanel.add(descLabel);

        // Panel điều khiển bên phải
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        controlPanel.setOpaque(false);

        StyledSwitchButton twoFactorToggle = new StyledSwitchButton();
        twoFactorToggle.setSelected(false);

        // Thêm nút cài đặt
        StyledButton setupButton = new StyledButton("Cài đặt", false);
        setupButton.setPreferredSize(new Dimension(100, 35));
        setupButton.addActionListener(e -> {
            // TODO: Implement 2FA setup logic
            JOptionPane.showMessageDialog(
                this,
                "Đang chuyển hướng đến trang cài đặt xác thực 2 lớp...",
                "Cài đặt xác thực 2 lớp",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        controlPanel.add(twoFactorToggle);
//        controlPanel.add(setupButton);

        rowPanel.add(labelPanel, BorderLayout.WEST);
        rowPanel.add(controlPanel, BorderLayout.CENTER);
        container.add(rowPanel);
    }

    private void addLogoutAllDevices(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Panel bên trái chứa label và description
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setOpaque(false);

        // Label chính
        JLabel label = new JLabel("Đăng xuất tất cả thiết bị:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Label mô tả
        JLabel descLabel = new JLabel("Đăng xuất khỏi tất cả các thiết bị đang đăng nhập");
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descLabel.setForeground(new Color(140, 140, 140));
        descLabel.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
        descLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        leftPanel.add(label);
        leftPanel.add(descLabel);

        // Panel bên phải chứa nút
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setOpaque(false);

        StyledButton logoutButton = new StyledButton("Đăng xuất tất cả", true);
        logoutButton.setPreferredSize(new Dimension(130, 35));
        logoutButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc chắn muốn đăng xuất khỏi tất cả các thiết bị không?",
                "Xác nhận đăng xuất",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );
            
            if (result == JOptionPane.YES_OPTION) {
                // Xử lý đăng xuất tất cả thiết bị
                LichSuDAO dao1 = new LichSuDAO();
                dao1.deleteLoginHistory(maND);
                JOptionPane.showMessageDialog(
                    this,
                    "Đã đăng xuất khỏi tất cả các thiết bị!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        buttonPanel.add(logoutButton);

        rowPanel.add(leftPanel, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }
    
    private void addLoginHistory(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Panel chứa label và mô tả
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.setOpaque(false);

        JLabel label = new JLabel("Lịch sử đăng nhập:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Thêm mô tả chi tiết về lịch sử đăng nhập
        JLabel descLabel = new JLabel("<html>Xem danh sách các thiết bị đã đăng nhập vào tài khoản của bạn.<br>" +
                                    "Bạn có thể đăng xuất khỏi các thiết bị không quen thuộc.</html>");
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descLabel.setForeground(new Color(140, 140, 140));
        descLabel.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
        descLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        labelPanel.add(label);
        labelPanel.add(descLabel);

        // Panel điều khiển bên phải
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        controlPanel.setOpaque(false);

        // Thêm nút xem lịch sử
        StyledButton viewButton = new StyledButton("Xem lịch sử", false);
        viewButton.setPreferredSize(new Dimension(120, 35));
        viewButton.addActionListener(e -> {
            // TODO: Implement login history view logic
            openLoginHistoryForm(maND);
        });

        controlPanel.add(viewButton);

        rowPanel.add(labelPanel, BorderLayout.WEST);
        rowPanel.add(controlPanel, BorderLayout.CENTER);
        container.add(rowPanel);
    }
    
    private void openLoginHistoryForm(String maNguoiDung) {
    JFrame frame = new JFrame("Lịch sử đăng nhập");
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    // Tạo bảng để hiển thị lịch sử đăng nhập
    String[] columnNames = {"Thời gian đăng nhập", "Địa chỉ IP", "Thiết bị"};
    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
    JTable loginHistoryTable = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(loginHistoryTable);
    frame.add(scrollPane, BorderLayout.CENTER);

    // Tạo nút đăng xuất các thiết bị không quen thuộc
    JPanel actionPanel = new JPanel();
    JButton logoutButton = new JButton("Đăng xuất khỏi thiết bị này");
    logoutButton.addActionListener(e -> {
        int selectedRow = loginHistoryTable.getSelectedRow();
        if (selectedRow != -1) {
            String device = (String) tableModel.getValueAt(selectedRow, 2);
            String ipAddress = (String) tableModel.getValueAt(selectedRow, 1);
            // Xử lý đăng xuất khỏi thiết bị đã chọn
            logoutDevice(maNguoiDung, device, ipAddress);
            loadLoginHistory(maNguoiDung, tableModel);
        } else {
            JOptionPane.showMessageDialog(frame, "Vui lòng chọn một thiết bị để đăng xuất.");
        }
    });
    actionPanel.add(logoutButton);

    frame.add(actionPanel, BorderLayout.SOUTH);

    // Lấy dữ liệu từ cơ sở dữ liệu và điền vào bảng
    loadLoginHistory(maNguoiDung, tableModel);

    frame.setVisible(true);
}
    
        private final String dbUrl = "jdbc:sqlserver://localhost:1433;database=du_an_tot_nghiep;encrypt=true;trustServerCertificate=true;";
    private final String dbUser = "sa";
    private final String dbPassword = "123";

private void loadLoginHistory(String maNguoiDung, DefaultTableModel tableModel) {
    // Giả sử kết nối và lấy dữ liệu từ cơ sở dữ liệu (SQL)
    String query = "SELECT ThoiGianDangNhap, DiaChiIP, ThietBi FROM LICHSUDANGNHAP WHERE MaNguoiDung = ? ORDER BY ThoiGianDangNhap DESC";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        
        pstmt.setString(1, maNguoiDung); // Giả sử maNguoiDung là mã người dùng hiện tại
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            String loginTime = rs.getString("ThoiGianDangNhap");
            String ipAddress = rs.getString("DiaChiIP");
            String device = rs.getString("ThietBi");
            tableModel.addRow(new Object[]{loginTime, ipAddress, device});
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi khi tải lịch sử đăng nhập.");
    }
}

private void logoutDevice(String maNguoiDung, String device, String ipAddress) {
    // Xử lý đăng xuất thiết bị khỏi tài khoản người dùng
    String logoutQuery = "DELETE FROM LICHSUDANGNHAP WHERE MaNguoiDung = ? AND ThietBi = ? AND DiaChiIP = ?";
    
    try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
         PreparedStatement pstmt = conn.prepareStatement(logoutQuery)) {
        
        pstmt.setString(1, maNguoiDung);
        pstmt.setString(2, device);
        pstmt.setString(3, ipAddress);
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Đăng xuất thiết bị thành công.");
        } else {
            JOptionPane.showMessageDialog(null, "Thiết bị không được tìm thấy hoặc đã đăng xuất.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi khi đăng xuất thiết bị.");
    }
}


    private void addProfileVisibility(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Hiển thị hồ sơ:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        buttonPanel.setOpaque(false);

        String[] options = {"Công khai", "Bạn bè", "Chỉ mình tôi"};
        ButtonGroup group = new ButtonGroup();
        
        for (String option : options) {
            StyledToggleButton btn = new StyledToggleButton(option);
            btn.setPreferredSize(new Dimension(100, 35));
            if (option.equals("Công khai")) {
                btn.setSelected(true);
            }
            group.add(btn);
            buttonPanel.add(btn);
        }

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addActivityVisibility(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Hiển thị hoạt động:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        buttonPanel.setOpaque(false);

        String[] options = {"Công khai", "Bạn bè", "Chỉ mình tôi"};
        ButtonGroup group = new ButtonGroup();
        
        for (String option : options) {
            StyledToggleButton btn = new StyledToggleButton(option);
            btn.setPreferredSize(new Dimension(100, 35));
            if (option.equals("Bạn bè")) {
                btn.setSelected(true);
            }
            group.add(btn);
            buttonPanel.add(btn);
        }

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }

    private void addMessagePermission(JPanel container) {
        JPanel rowPanel = new JPanel(new BorderLayout(20, 0));
        rowPanel.setOpaque(false);
        rowPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JLabel label = new JLabel("Cho phép nhắn tin:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setForeground(new Color(60, 60, 60));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        buttonPanel.setOpaque(false);

        String[] options = {"Mọi người", "Bạn bè", "Không ai"};
        ButtonGroup group = new ButtonGroup();
        
        for (String option : options) {
            StyledToggleButton btn = new StyledToggleButton(option);
            btn.setPreferredSize(new Dimension(100, 35));
            if (option.equals("Bạn bè")) {
                btn.setSelected(true);
            }
            group.add(btn);
            buttonPanel.add(btn);
        }

        rowPanel.add(label, BorderLayout.WEST);
        rowPanel.add(buttonPanel, BorderLayout.CENTER);
        
        container.add(rowPanel);
    }
} 