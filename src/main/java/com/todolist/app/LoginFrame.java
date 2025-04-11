//package com.todolist.app;
//
//import com.dao.UserDAO;
//import com.entity.NguoiDung;
//import com.utils.Auth;
//import com.text.GoogleOAuthFlow;
//import com.utils.MsgBox;
//import com.formdev.flatlaf.FlatLightLaf;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.border.*;
//import java.awt.geom.RoundRectangle2D;
//
//public class LoginFrame extends JFrame {
//    private JPanel mainPanel;
//    private JPanel leftPanel;
//    private JPanel rightPanel;
//    private JTextField txtUser;
//    private JPasswordField txtPassword;
//    private JButton btnLogin;
//    private JButton btnLoginGG;
//    private JButton btnLoginFB;
//    private JLabel lblRegister;
//    private JLabel lblForgotPassword;
//    
//    private UserDAO dao = new UserDAO();
//    private GoogleOAuthFlow gg = new GoogleOAuthFlow();
//
//    // Custom colors
//    private static final Color PRIMARY_COLOR = new Color(71, 120, 197);
//    private static final Color SECONDARY_COLOR = new Color(255, 255, 255);
//    private static final Color BACKGROUND_COLOR = new Color(245, 245, 245);
//    private static final Color TEXT_COLOR = new Color(51, 51, 51);
//
//    public LoginFrame() {
//        initComponents();
//        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
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
//                String welcome = "Welcome Back!";
//                FontMetrics fm = g2d.getFontMetrics();
//                g2d.drawString(welcome, (getWidth() - fm.stringWidth(welcome)) / 2, getHeight() / 2 - 50);
//                
//                g2d.setFont(new Font("Segoe UI", Font.PLAIN, 16));
//                String subtext = "Sign in to continue your journey";
//                fm = g2d.getFontMetrics();
//                g2d.drawString(subtext, (getWidth() - fm.stringWidth(subtext)) / 2, getHeight() / 2);
//                
//                g2d.dispose();
//            }
//        };
//        leftPanel.setPreferredSize(new Dimension(400, 0));
//        
//        // Right Panel - Login Form
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
//        // Login form components
//        JLabel lblTitle = new JLabel("Login to Your Account");
//        lblTitle.setBounds(50, 50, 500, 40);
//        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
//        lblTitle.setForeground(TEXT_COLOR);
//        rightPanel.add(lblTitle);
//        
//        txtUser = new JTextField();
//        styleTextField(txtUser, "Username");
//        txtUser.setBounds(50, 120, 500, 45);
//        rightPanel.add(txtUser);
//        
//        txtPassword = new JPasswordField();
//        styleTextField(txtPassword, "Password");
//        txtPassword.setBounds(50, 190, 500, 45);
//        rightPanel.add(txtPassword);
//        
//        btnLogin = new JButton("Sign In");
//        styleButton(btnLogin, PRIMARY_COLOR);
//        btnLogin.setBounds(50, 270, 500, 45);
//        btnLogin.addActionListener(e -> dangNhap());
//        rightPanel.add(btnLogin);
//        
//        JLabel lblOr = new JLabel("Or continue with");
//        lblOr.setBounds(250, 340, 100, 30);
//        lblOr.setForeground(new Color(150, 150, 150));
//        lblOr.setHorizontalAlignment(SwingConstants.CENTER);
//        rightPanel.add(lblOr);
//        
//        btnLoginGG = new JButton("Google");
//        styleButton(btnLoginGG, new Color(234, 67, 53));
//        btnLoginGG.setBounds(50, 390, 240, 45);
//        btnLoginGG.addActionListener(e -> btnLoginGGActionPerformed());
//        rightPanel.add(btnLoginGG);
//        
//        btnLoginFB = new JButton("Facebook");
//        styleButton(btnLoginFB, new Color(66, 103, 178));
//        btnLoginFB.setBounds(310, 390, 240, 45);
//        rightPanel.add(btnLoginFB);
//        
//        lblRegister = new JLabel("Don't have an account? Register");
//        lblRegister.setBounds(50, 460, 250, 30);
//        lblRegister.setForeground(PRIMARY_COLOR);
//        lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        lblRegister.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                dispose();
//                new RegisterFrame().setVisible(true);
//            }
//        });
//        rightPanel.add(lblRegister);
//        
//        lblForgotPassword = new JLabel("Forgot password?");
//        lblForgotPassword.setBounds(450, 460, 100, 30);
//        lblForgotPassword.setForeground(PRIMARY_COLOR);
//        lblForgotPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        rightPanel.add(lblForgotPassword);
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
//    private void dangNhap() {
//        String tenDangNhap = txtUser.getText().trim();
//        String matKhau = new String(txtPassword.getPassword());
//        
//        if (tenDangNhap.isEmpty() || tenDangNhap.equals("Username") || 
//            matKhau.isEmpty() || matKhau.equals("Password")) {
//            MsgBox.alert(this, "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu!");
//            return;
//        }
//
//        NguoiDung nguoiDung = dao.selectById(tenDangNhap);
//
//        if (nguoiDung == null) {
//            MsgBox.alert(this, "Tên đăng nhập không tồn tại!");
//        } else if (!matKhau.equals(nguoiDung.getMatKhau())) {
//            MsgBox.alert(this, "Mật khẩu không chính xác!");
//        } else if (!nguoiDung.isTrangThai()) {
//            MsgBox.alert(this, "Tài khoản của bạn đã bị khóa!");
//        } else {
//            MsgBox.alert(this, "Đăng nhập thành công!");
//            Auth.user = nguoiDung;
//            this.dispose();
//            new TodoListApp().setVisible(true);
//        }
//    }
//
//    private void btnLoginGGActionPerformed() {
//        try {
//            // Thêm delay ngắn để đảm bảo port được giải phóng
//            Thread.sleep(1000);
//            
//            // Gọi phương thức main() của GoogleOAuthFlow
//            gg.main();
//            
//            // Kiểm tra xem đăng nhập có thành công không
//            if (Auth.user != null) {
//                MsgBox.alert(this, "Đăng nhập Google thành công!");
//                this.dispose();
//                
//                SwingUtilities.invokeLater(() -> {
//                    TodoListApp todoList = new TodoListApp();
//                    todoList.setVisible(true);
//                });
//            } else {
//                MsgBox.alert(this, "Đăng nhập Google thất bại!");
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            MsgBox.alert(this, "Quá trình đăng nhập bị gián đoạn!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            MsgBox.alert(this, "Đăng nhập thất bại! Vui lòng thử lại sau.");
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
//            new LoginFrame().setVisible(true);
//        });
//    }
//} 