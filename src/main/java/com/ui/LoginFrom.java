package com.ui;

import com.dao.KhoaBieuDAO;
import com.dao.UserDAO;
import com.entity.NguoiDung;
import com.ui.RegisterFrom;
import com.swing.Panel1;
import com.text.GoogleOAuthFlow;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.FontUtils;
import com.service.GoogleAuthService;
import com.utils.MsgBox;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.FontUtils;
import com.utils.Auth;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LoginFrom extends javax.swing.JFrame {

    GoogleOAuthFlow gg = new GoogleOAuthFlow();
    UserDAO dao = new UserDAO();
    // Biến toàn cục để lưu mã xác thực
    private String verificationCode;

    public LoginFrom() {
        initComponents();
        mainPanel.setLayout(new CardLayout());
        mainPanel.add(loginPanel, "loginPanel");
        mainPanel.add(registerPanel, "registerPanel");
    }

    void dangNhap() {
        // Lấy dữ liệu từ các trường nhập liệu
        String tenDangNhap = txtUser.getText().trim();
        char[] matKhauChars = txtPassword.getPassword();

// So sánh từng ký tự hoặc chuyển sang String sau khi xử lý cẩn thận
        // Kiểm tra người dùng có nhập thông tin hay chưa
        if (tenDangNhap.isEmpty() || matKhauChars.length == 0) {
            MsgBox.alert(this, "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu!");
            return;
        }

        // Tìm người dùng theo tên đăng nhập
        NguoiDung nguoiDung = dao.selectById(tenDangNhap);
        
        // Kiểm tra thông tin đăng nhập
        if (nguoiDung == null) {
            MsgBox.alert(this, "Tên đăng nhập không tồn tại!");
        } else if (!matKhauChars.equals(nguoiDung.getMatKhau())) {
            MsgBox.alert(this, "Mật khẩu không chính xác!");
        } else if (!nguoiDung.isTrangThai()) {
            MsgBox.alert(this, "Tài khoản của bạn đã bị khóa!");
        } else {
            // Đăng nhập thành công
            MsgBox.alert(this, "Đăng nhập thành công với quyền: " + nguoiDung.getQuyen());
            this.dispose(); // Đóng cửa sổ đăng nhập
            Auth.user = nguoiDung;
            MainFrame lg = new MainFrame("");
            lg.setVisible(true);

            System.out.println(nguoiDung.getMaNguoiDung());

            // Có thể thêm logic chuyển đến màn hình chính hoặc phân quyền ở đây
            if ("Admin".equalsIgnoreCase(nguoiDung.getQuyen())) {
                // Mở giao diện Admin
            } else {
                // Mở giao diện User
            }
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        lblChonDN = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        lblHobbies2 = new javax.swing.JLabel();
        lblSport1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnGui = new javax.swing.JButton();
        lblHobbies3 = new javax.swing.JLabel();
        lblSport2 = new javax.swing.JLabel();
        lblSport3 = new javax.swing.JLabel();
        btnDangky = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        lblChonDK = new javax.swing.JLabel();
        lblHobbies1 = new javax.swing.JLabel();
        lblHobbies = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblSport = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLoginGG = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.CardLayout());

        registerPanel.setOpaque(false);

        lblChonDN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChonDN.setText("Bạn đã có tài khoản?");
        lblChonDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChonDNMouseClicked(evt);
            }
        });

        txtPassword1.setText("jPasswordField1");

        lblHobbies2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHobbies2.setForeground(new java.awt.Color(51, 51, 51));
        lblHobbies2.setText("Email");

        lblSport1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSport1.setForeground(new java.awt.Color(51, 51, 51));
        lblSport1.setText("Mã xác thực");

        btnGui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGui.setText("Gửi");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });

        lblHobbies3.setBackground(new java.awt.Color(255, 255, 255));
        lblHobbies3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHobbies3.setForeground(new java.awt.Color(51, 51, 51));
        lblHobbies3.setText("Register");

        lblSport2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSport2.setForeground(new java.awt.Color(51, 51, 51));
        lblSport2.setText("Username");

        lblSport3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSport3.setForeground(new java.awt.Color(51, 51, 51));
        lblSport3.setText("Password");

        btnDangky.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangky.setText("Đăng ký");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblChonDN)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPanelLayout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHobbies3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHobbies2)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSport2)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSport3)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSport1)
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 65, Short.MAX_VALUE)))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(lblChonDN)
                .addGap(15, 15, 15))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPanelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(lblHobbies3)
                    .addGap(12, 12, 12)
                    .addComponent(lblHobbies2)
                    .addGap(5, 5, 5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblSport2)
                    .addGap(5, 5, 5)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblSport3)
                    .addGap(5, 5, 5)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblSport1)
                    .addGap(5, 5, 5)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 98, Short.MAX_VALUE)))
        );

        mainPanel.add(registerPanel, "card2");

        loginPanel.setOpaque(false);

        lblChonDK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChonDK.setText("Bạn chưa có tài khoản?");
        lblChonDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChonDKMouseClicked(evt);
            }
        });

        lblHobbies1.setBackground(new java.awt.Color(255, 255, 255));
        lblHobbies1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHobbies1.setForeground(new java.awt.Color(51, 51, 51));
        lblHobbies1.setText("Login");

        lblHobbies.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHobbies.setForeground(new java.awt.Color(51, 51, 51));
        lblHobbies.setText("User name");

        lblSport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSport.setForeground(new java.awt.Color(51, 51, 51));
        lblSport.setText("Password");

        txtPassword.setText("jPasswordField1");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLoginGG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginGG.setForeground(new java.awt.Color(255, 51, 51));
        btnLoginGG.setText("Google");
        btnLoginGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginGGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoginGG, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSport)
                            .addComponent(lblHobbies)
                            .addComponent(lblHobbies1)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblChonDK)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHobbies1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHobbies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLoginGG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(lblChonDK)
                .addGap(18, 18, 18))
        );

        mainPanel.add(loginPanel, "card2");

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 470, 530));

        lblBackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\du_an_tot_nghiep\\src\\main\\resources\\com\\img\\nenlogin.png")); // NOI18N
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        dangNhap();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginGGActionPerformed
        // TODO add your handling code here:
        GoogleAuthService authService = new GoogleAuthService();
        try {
            authService.main();

            //System.exit(0);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
        }
    }//GEN-LAST:event_btnLoginGGActionPerformed

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        // Cấu hình thông tin server SMTP
        String host = "smtp.gmail.com";
        String port = "587";
        final String username = "binhminh51107@gmail.com"; // Thay bằng email của bạn
        final String appPassword = "hrkm xnjk iegz ewzg"; // Thay bằng mật khẩu ứng dụng của bạn

        String email = txtEmail.getText().trim();
        String userName = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();

        // Kiểm tra các trường không được để trống
        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên đăng nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có ít nhất 6 ký tự!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra định dạng email hợp lệ
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo mã xác thực ngẫu nhiên (6 chữ số)
        verificationCode = String.valueOf((int) (Math.random() * 900000) + 100000);

        // Thiết lập thuộc tính cho phiên làm việc SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Tạo phiên làm việc với tài khoản SMTP
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, appPassword);
            }
        });

        try {
            // Tạo email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));

            // Thiết lập nội dung email
            message.setSubject("Mã xác thực đăng ký tài khoản");
            message.setText("Xin chào,\n\nMã xác thực của bạn là: " + verificationCode
                    + "\nVui lòng nhập mã này để hoàn tất đăng ký.");

            // Gửi email
            Transport.send(message);

            JOptionPane.showMessageDialog(this, "Mã xác thực đã được gửi đến email của bạn!", "Thành công", JOptionPane.INFORMATION_MESSAGE);

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Gửi email thất bại: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuiActionPerformed

    private void lblChonDNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChonDNMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "loginPanel");

//        LoginFrom lg = new LoginFrom();
//        lg.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_lblChonDNMouseClicked

    private void btnDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkyActionPerformed
        // TODO add your handling code here:
        String inputCode = txtMa.getText().trim(); // Lấy mã người dùng nhập
        String email = txtEmail.getText();
        String user = txtUsername.getText();
        String pass = txtPassword.getText();

        if (inputCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã xác thực!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (inputCode.equals(verificationCode)) {
            JOptionPane.showMessageDialog(this, "Xác thực thành công! Đăng ký hoàn tất.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            // Thực hiện các thao tác đăng ký tài khoản (lưu vào CSDL, chuyển trang, ...)
            UserDAO us = new UserDAO();
            us.registerUser(email, pass, user);
        } else {
            JOptionPane.showMessageDialog(this, "Mã xác thực không đúng. Vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDangkyActionPerformed

    private void lblChonDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChonDKMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "registerPanel");

        //        RegisterFrom rg = new RegisterFrom();
        //        rg.setVisible(true);
        //        this.dispose();
    }//GEN-LAST:event_lblChonDKMouseClicked

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());  // Chọn giao diện FlatLaf
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrom().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangky;
    private javax.swing.JButton btnGui;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginGG;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblChonDK;
    private javax.swing.JLabel lblChonDN;
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JLabel lblHobbies1;
    private javax.swing.JLabel lblHobbies2;
    private javax.swing.JLabel lblHobbies3;
    private javax.swing.JLabel lblSport;
    private javax.swing.JLabel lblSport1;
    private javax.swing.JLabel lblSport2;
    private javax.swing.JLabel lblSport3;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
