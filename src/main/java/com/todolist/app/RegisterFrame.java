//package com.todolist.app;
//
//import com.dao.UserDAO;
//import com.entity.NguoiDung;
//import com.utils.MsgBox;
//import com.formdev.flatlaf.FlatLightLaf;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.border.*;
//import java.awt.geom.RoundRectangle2D;
//
//public class RegisterFrame extends JFrame {
//    private JPanel mainPanel;
//    private JPanel leftPanel;
//    private JPanel rightPanel;
//    private JTextField txtUsername;
//    private JTextField txtEmail;
//    private JPasswordField txtPassword;
//    private JPasswordField txtConfirmPassword;
//    private JButton btnRegister;
//    private JButton btnBackToLogin;
//    private JLabel lblTitle;
//    
//    private UserDAO dao = new UserDAO();
//
//    // Custom colors
//    private static final Color PRIMARY_COLOR = new Color(71, 120, 197);
//    private static final Color SECONDARY_COLOR = new Color(255, 255, 255);
//    private static final Color BACKGROUND_COLOR = new Color(245, 245, 245);
//    private static final Color TEXT_COLOR = new Color(51, 51, 51);
//
//    public RegisterFrame() {
//        initComponents();
//        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
//        
//        // Kiểm tra kết nối database
//        if (!dao.checkConnection()) {
//            MsgBox.alert(this, "Không thể kết nối đến database! Vui lòng kiểm tra lại cấu hình.");
//            this.dispose();
//            return;
//        }
//        
//        // Kiểm tra và tạo bảng nếu cần
//        if (!dao.checkTable()) {
//            MsgBox.alert(this, "Không thể tạo bảng NGUOIDUNG! Vui lòng kiểm tra lại quyền truy cập database.");
//            this.dispose();
//            return;
//        }
//    }
//
//    private void initComponents() {
//        setUndecorated(true);
//        setSize(1000, 600);
//        setLocationRelativeTo(null);
//        setBackground(new Color(0, 0, 0, 0));
//        
//        mainPanel = new JPanel(new BorderLayout());
//        mainPanel.setBackground(BACKGROUND_COLOR);
//        
//        // Left Panel - Welcome Section
//        leftPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                Graphics2D g2d = (Graphics2D) g.create();
//                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//                
//                // Gradient background
//                GradientPaint gradient = new GradientPaint(0, 0, PRIMARY_COLOR, getWidth(), getHeight(), 
//                    new Color(41, 128, 185));
//                g2d.setPaint(gradient);
//                g2d.fillRect(0, 0, getWidth(), getHeight());
//                
//                // Welcome text
//                g2d.setColor(SECONDARY_COLOR);
//                g2d.setFont(new Font("Segoe UI", Font.BOLD, 36));
//                String welcome = "Create Account";
//                FontMetrics fm = g2d.getFontMetrics();
//                g2d.drawString(welcome, (getWidth() - fm.stringWidth(welcome)) / 2, getHeight() / 2 - 50);
//                
//                g2d.setFont(new Font("Segoe UI", Font.PLAIN, 16));
//                String subtext = "Join us and start your journey";
//                fm = g2d.getFontMetrics();
//                g2d.drawString(subtext, (getWidth() - fm.stringWidth(subtext)) / 2, getHeight() / 2);
//                
//                g2d.dispose();
//            }
//        };
//        leftPanel.setPreferredSize(new Dimension(400, 0));
//        
//        // Right Panel - Register Form
//        rightPanel = new JPanel(null);
//        rightPanel.setBackground(SECONDARY_COLOR);
//        
//        // Close button
//        JButton btnClose = new JButton("×");
//        btnClose.setBounds(550, 10, 30, 30);
//        btnClose.setForeground(TEXT_COLOR);
//        btnClose.setFont(new Font("Arial", Font.BOLD, 20));
//        btnClose.setContentAreaFilled(false);
//        btnClose.setBorder(null);
//        btnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        btnClose.addActionListener(e -> System.exit(0));
//        rightPanel.add(btnClose);
//        
//        // Register form components
//        lblTitle = new JLabel("Create Your Account");
//        lblTitle.setBounds(50, 50, 500, 40);
//        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
//        lblTitle.setForeground(TEXT_COLOR);
//        rightPanel.add(lblTitle);
//        
//        txtUsername = new JTextField();
//        styleTextField(txtUsername, "Username");
//        txtUsername.setBounds(50, 120, 500, 45);
//        rightPanel.add(txtUsername);
//        
//        txtEmail = new JTextField();
//        styleTextField(txtEmail, "Email");
//        txtEmail.setBounds(50, 190, 500, 45);
//        rightPanel.add(txtEmail);
//        
//        txtPassword = new JPasswordField();
//        styleTextField(txtPassword, "Password");
//        txtPassword.setBounds(50, 260, 500, 45);
//        rightPanel.add(txtPassword);
//        
//        txtConfirmPassword = new JPasswordField();
//        styleTextField(txtConfirmPassword, "Confirm Password");
//        txtConfirmPassword.setBounds(50, 330, 500, 45);
//        rightPanel.add(txtConfirmPassword);
//        
//        btnRegister = new JButton("Create Account");
//        styleButton(btnRegister, PRIMARY_COLOR);
//        btnRegister.setBounds(50, 400, 500, 45);
//        btnRegister.addActionListener(e -> dangKy());
//        rightPanel.add(btnRegister);
//        
//        btnBackToLogin = new JButton("Back to Login");
//        styleButton(btnBackToLogin, new Color(150, 150, 150));
//        btnBackToLogin.setBounds(50, 460, 500, 45);
//        btnBackToLogin.addActionListener(e -> {
//            this.dispose();
//            new LoginFrame().setVisible(true);
//        });
//        rightPanel.add(btnBackToLogin);
//        
//        mainPanel.add(leftPanel, BorderLayout.WEST);
//        mainPanel.add(rightPanel, BorderLayout.CENTER);
//        
//        // Add shadow border
//        mainPanel.setBorder(new CompoundBorder(
//            new EmptyBorder(10, 10, 10, 10),
//            new ShadowBorder()
//        ));
//        
//        setContentPane(mainPanel);
//        
//        // Window drag support
//        FrameDragListener frameDragListener = new FrameDragListener(this);
//        addMouseListener(frameDragListener);
//        addMouseMotionListener(frameDragListener);
//    }
//    
//    private void styleTextField(JTextField textField, String placeholder) {
//        textField.setBackground(BACKGROUND_COLOR);
//        textField.setForeground(TEXT_COLOR);
//        textField.setCaretColor(PRIMARY_COLOR);
//        textField.setBorder(BorderFactory.createCompoundBorder(
//            new LineBorder(new Color(200, 200, 200)),
//            new EmptyBorder(5, 15, 5, 15)
//        ));
//        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//        
//        if (textField instanceof JPasswordField) {
//            ((JPasswordField)textField).setEchoChar('●');
//        }
//        
//        // Placeholder
//        textField.setText(placeholder);
//        textField.setForeground(new Color(150, 150, 150));
//        
//        textField.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                if (textField.getText().equals(placeholder)) {
//                    textField.setText("");
//                    textField.setForeground(TEXT_COLOR);
//                    if (textField instanceof JPasswordField) {
//                        ((JPasswordField)textField).setEchoChar('●');
//                    }
//                }
//            }
//            
//            @Override
//            public void focusLost(FocusEvent e) {
//                if (textField.getText().isEmpty()) {
//                    textField.setText(placeholder);
//                    textField.setForeground(new Color(150, 150, 150));
//                    if (textField instanceof JPasswordField) {
//                        ((JPasswordField)textField).setEchoChar((char)0);
//                    }
//                }
//            }
//        });
//    }
//    
//    private void styleButton(JButton button, Color color) {
//        button.setBackground(color);
//        button.setForeground(Color.WHITE);
//        button.setFocusPainted(false);
//        button.setBorderPainted(false);
//        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
//        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        
//        button.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                button.setBackground(color.darker());
//            }
//            
//            @Override
//            public void mouseExited(MouseEvent e) {
//                button.setBackground(color);
//            }
//        });
//    }
//    
//    private void dangKy() {
//        String username = txtUsername.getText().trim();
//        String email = txtEmail.getText().trim();
//        String password = new String(txtPassword.getPassword());
//        String confirmPassword = new String(txtConfirmPassword.getPassword());
//        
//        // Kiểm tra dữ liệu đầu vào
//        if (username.isEmpty() || username.equals("Username") ||
//            email.isEmpty() || email.equals("Email") ||
//            password.isEmpty() || password.equals("Password") ||
//            confirmPassword.isEmpty() || confirmPassword.equals("Confirm Password")) {
//            MsgBox.alert(this, "Vui lòng nhập đầy đủ thông tin!");
//            return;
//        }
//        
//        // Kiểm tra định dạng email
//        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
//            MsgBox.alert(this, "Email không hợp lệ!");
//            return;
//        }
//        
//        // Kiểm tra mật khẩu
//        if (!password.equals(confirmPassword)) {
//            MsgBox.alert(this, "Mật khẩu xác nhận không khớp!");
//            return;
//        }
//        
//        if (password.length() < 6) {
//            MsgBox.alert(this, "Mật khẩu phải có ít nhất 6 ký tự!");
//            return;
//        }
//        
//        // Kiểm tra username đã tồn tại chưa
//        if (dao.selectById(username) != null) {
//            MsgBox.alert(this, "Tên đăng nhập đã tồn tại!");
//            return;
//        }
//        
//        try {
//            dao.registerUser(email, password, username);
//            MsgBox.alert(this, "Đăng ký thành công! Vui lòng đăng nhập.");
//            this.dispose();
//            new LoginFrame().setVisible(true);
//        } catch (Exception e) {
//            e.printStackTrace();
//            MsgBox.alert(this, "Đăng ký thất bại! Vui lòng thử lại.");
//        }
//    }
//    
//    // Custom shadow border
//    private class ShadowBorder extends AbstractBorder {
//        @Override
//        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//            Graphics2D g2d = (Graphics2D) g.create();
//            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            
//            // Draw shadow
//            g2d.setColor(new Color(0, 0, 0, 50));
//            for (int i = 0; i < 10; i++) {
//                g2d.drawRoundRect(x + i, y + i, width - 2 * i - 1, height - 2 * i - 1, 20, 20);
//            }
//            
//            g2d.dispose();
//        }
//        
//        @Override
//        public Insets getBorderInsets(Component c) {
//            return new Insets(10, 10, 10, 10);
//        }
//    }
//    
//    // Window drag support
//    private class FrameDragListener extends MouseAdapter {
//        private final JFrame frame;
//        private Point mouseDownCompCoords = null;
//
//        public FrameDragListener(JFrame frame) {
//            this.frame = frame;
//        }
//
//        public void mouseReleased(MouseEvent e) {
//            mouseDownCompCoords = null;
//        }
//
//        public void mousePressed(MouseEvent e) {
//            mouseDownCompCoords = e.getPoint();
//        }
//
//        public void mouseDragged(MouseEvent e) {
//            Point currCoords = e.getLocationOnScreen();
//            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
//        }
//    }
//
//    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        EventQueue.invokeLater(() -> {
//            new RegisterFrame().setVisible(true);
//        });
//    }
//} 