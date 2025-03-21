/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.swing;

import com.ui.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.plaf.basic.BasicScrollBarUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC
 */
public class ProfessionalSidebarForm extends javax.swing.JFrame {

    public ProfessionalSidebarForm() {
        initComponents();

        setTitle("Dashboard với Thanh Menu Dọc Chuyên Nghiệp"); // Đặt tiêu đề cho cửa sổ
        setSize(1000, 600); // Kích thước cửa sổ ban đầu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng ứng dụng khi nhấn nút đóng
        setLocationRelativeTo(null); // Căn giữa cửa sổ trên màn hình
        setLayout(null); // Sử dụng layout null để tự do đặt vị trí các thành phần
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Mở rộng cửa sổ toàn màn hình

        // Tạo một JPanel bọc ngoài để tạo khoảng cách
        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0)); // Tạo khoảng trống xung quanh
        wrapperPanel.setOpaque(false); // Không vẽ nền cho panel

        // Tạo sidebar menu với các mục được sắp xếp theo chiều dọc
        RoundedPanel sidebar = new RoundedPanel(50); // Panel bo góc 50px
        sidebar.setBackground(new Color(92, 225, 230, 255)); // Màu nền sidebar
        sidebar.setLayout(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(220, getHeight())); // Đặt chiều rộng cố định cho sidebar
        sidebar.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // Tạo khoảng cách trên cùng

        // Tạo JPanel mới để chứa cả logo và avatar
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setOpaque(false);

        // Thêm logo hoặc tiêu đề phía trên thanh menu
        JLabel logo = new JLabel("DASHBOARD");
        logo.setForeground(Color.WHITE); // Màu chữ trắng
        logo.setFont(new Font("Arial", Font.BOLD, 20)); // Font chữ Arial đậm, kích thước 20
        logo.setAlignmentX(Component.CENTER_ALIGNMENT); // Căn giữa logo trong sidebar
        logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0)); // Tạo khoảng cách dưới logo

        topPanel.add(logo);

        // Thêm AvatarPanel vào sidebar
        AvatarPanel avatarPanel = new AvatarPanel();
        // Thêm AvatarPanel vào phía trên cùng của sidebar
        sidebar.add(avatarPanel, BorderLayout.NORTH);

        // Thêm avatar vào dưới logo trong topPanel
        topPanel.add(avatarPanel);

// Thêm topPanel vào phía trên cùng của sidebar
        sidebar.add(topPanel, BorderLayout.NORTH);

        // Tạo JPanel để chứa các mục menu và đặt vào giữa sidebar
        JPanel menuContainer = new JPanel();
        menuContainer.setOpaque(false);
        menuContainer.setLayout(new BoxLayout(menuContainer, BoxLayout.Y_AXIS));
        menuContainer.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // Tạo khoảng đệm trên

        // Khu vực hiển thị nội dung chính
        JPanel mainContent = new JPanel();
        mainContent.setBackground(Color.WHITE); // Màu nền trắng cho nội dung chính
        mainContent.setLayout(new BorderLayout());
        mainContent.add(new JLabel("Nội dung chính hiển thị ở đây", SwingConstants.CENTER), BorderLayout.CENTER);
        mainContent.setOpaque(false); // Nền trong suốt (để hiển thị nền phía sau)

// Các mục menu và đường dẫn icon tương ứng
        String[] menuItems = {"Trang chủ", "Cá nhân", "Bài học", "Tương tác", "Kế hoạch", "Cài đặt", "Trợ giúp"};
        String[] iconPaths = {
            "/com/img/home.png",
            "/com/img/people.png",
            "/com/img/lessons.png",
            "/com/img/network.png",
            "/com/img/calendar.png",
            "/com/img/settings.png",
            "/com/img/support.png"
        };

// Mảng lưu các panel nội dung khác nhau cho mỗi menu item
        JPanel[] contentPanels = new JPanel[menuItems.length];

// Tạo nội dung hiển thị khác nhau cho từng item menu
        for (int i = 0; i < menuItems.length; i++) {
            JPanel panel = new JPanel();
            panel.setOpaque(false);
            panel.setLayout(new BorderLayout());

            switch (i) {
                case 0 -> { // Item 1: Hiển thị toàn panel

                }
                case 1 -> { // Item 2: Hiển thị toàn label

                }
                case 2 -> { // Item 3: Sử dụng JTextArea
                    panel.add(new LessonContentPanel(), BorderLayout.CENTER);
                }
                case 3 -> { // Item 4: Sử dụng hình ảnh

                }
                case 4 -> { // Item 5: Form nhập liệu

                }
                case 5 -> { // Item 6: Hiển thị bảng dữ liệu

                }
                case 6 -> { // Item 7: Nội dung trống hoặc tùy chỉnh khác

                }
            }

            contentPanels[i] = panel;
        }

// Tạo các menu item riêng lẻ
        for (int i = 0; i < menuItems.length; i++) {
            String item = menuItems[i];
            String iconPath = iconPaths[i];
            JPanel contentPanel = contentPanels[i];

            // Tạo JPanel cho từng menu item
            JPanel menuPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Vẽ thanh gạch ngang ở dưới mỗi item
                    g.setColor(Color.BLACK);
                    g.drawLine(10, getHeight() - 10, getWidth() - 10, getHeight() - 10);
                }
            };

            menuPanel.setOpaque(false);
            menuPanel.setMaximumSize(new Dimension(200, 50));
            menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            // Tạo icon và label cho menu item
            ImageIcon originalIcon = new ImageIcon(getClass().getResource(iconPath));
            Image scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JLabel menuLabel = new JLabel(item, scaledIcon, JLabel.LEFT);
            menuLabel.setForeground(Color.BLACK);
            menuLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            menuLabel.setIconTextGap(20); // Khoảng cách giữa icon và text

            menuPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 0)); // Khoảng cách giữa các menu
            menuPanel.add(menuLabel);

            // Hiệu ứng hover
            menuPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    menuLabel.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    menuLabel.setForeground(Color.BLACK);
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    // Hiển thị nội dung tương ứng trong mainContent khi nhấn vào menu item
                    mainContent.removeAll();
                    mainContent.add(contentPanel, BorderLayout.CENTER);
                    mainContent.revalidate();
                    mainContent.repaint();
                }
            });

            menuContainer.add(menuPanel);
        }

// Đặt menuContainer vào giữa sidebar
        sidebar.add(menuContainer, BorderLayout.CENTER);

// Tải icon cho nút Đăng xuất
        ImageIcon originalLogoutIcon = new ImageIcon(getClass().getResource("/com/img/logout.png"));

// Thay đổi kích thước icon (32x32)
        Image scaledLogoutImage = originalLogoutIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoutIcon = new ImageIcon(scaledLogoutImage);

// Tạo nút Đăng xuất với icon
        JButton logoutButton = new JButton("Đăng xuất", scaledLogoutIcon);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.setFont(new Font("Arial", Font.PLAIN, 20));
        logoutButton.setFocusPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        logoutButton.setHorizontalAlignment(SwingConstants.LEFT); // Căn trái icon và text
        logoutButton.setIconTextGap(10); // Khoảng cách giữa icon và text

// Tạo JPanel để căn giữa nút Đăng xuất
        JPanel logoutPanel = new JPanel();
        logoutPanel.setOpaque(false);
        logoutPanel.setLayout(new BoxLayout(logoutPanel, BoxLayout.Y_AXIS));
        logoutPanel.add(Box.createVerticalGlue()); // Đẩy nút xuống dưới cùng
        logoutPanel.add(logoutButton);
        logoutPanel.setBorder(BorderFactory.createEmptyBorder(0, 40, 20, 0)); // Tạo khoảng đệm dưới cùng

        logoutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutButton.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logoutButton.setForeground(Color.BLACK);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Bạn đã đăng xuất");
            }
        });

// Đặt nút Đăng xuất vào phía dưới cùng của sidebar
        sidebar.add(logoutPanel, BorderLayout.SOUTH);

        // Panel hiển thị hình nền
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1920, 1010); // Kích thước full màn hình
        backgroundPanel.setLayout(new BorderLayout());

        wrapperPanel.add(sidebar, BorderLayout.WEST); // Đặt sidebar vào bên trái của wrapper

        add(backgroundPanel); // Thêm background vào JFrame
        backgroundPanel.add(wrapperPanel, BorderLayout.WEST); // Thêm sidebar vào background
        backgroundPanel.add(mainContent, BorderLayout.CENTER); // Thêm nội dung chính vào background
    }

    class BackgroundPanel extends JPanel {

        private Image backgroundImage;

        public BackgroundPanel() {
            try {
                backgroundImage = new ImageIcon(getClass().getResource("/com/img/mainBackGround1.png")).getImage();
            } catch (Exception e) {
                System.out.println("Không thể tải hình ảnh: " + e.getMessage());
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                Rectangle screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment()
                        .getDefaultScreenDevice().getDefaultConfiguration().getBounds();
                int screenWidth = screenBounds.width;
                int screenHeight = screenBounds.height;
                g.drawImage(backgroundImage, 0, 0, screenWidth, screenHeight, this);
            } else {
                g.drawString("Hình ảnh không tải được!", 50, 50);
            }
        }
    }

    class AvatarPanel extends JPanel {

        private Image avatarImage;
        private String userName = "Người dùng";
        private String greeting = "Chào mừng!";

        public AvatarPanel() {
            setPreferredSize(new Dimension(200, 200));
            setOpaque(false);

            // Tải hình ảnh avatar từ file (đảm bảo đường dẫn đúng)
            avatarImage = new ImageIcon(getClass().getResource("")).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int avatarSize = 100;
            int x = (getWidth() - avatarSize) / 2;
            int y = 10;

            Ellipse2D.Double circle = new Ellipse2D.Double(x, y, avatarSize, avatarSize);
            g2d.setClip(circle);
            g2d.drawImage(avatarImage, x, y, avatarSize, avatarSize, this);
            g2d.setClip(null);

            g2d.setColor(Color.WHITE);
            g2d.setStroke(new BasicStroke(3));
            g2d.draw(circle);

            g2d.setFont(new Font("Arial", Font.BOLD, 18));
            g2d.setColor(Color.WHITE);
            FontMetrics fm = g2d.getFontMetrics();
            int textX = (getWidth() - fm.stringWidth(userName)) / 2;
            g2d.drawString(userName, textX, y + avatarSize + 30);

            g2d.setFont(new Font("Arial", Font.PLAIN, 16));
            g2d.setColor(Color.BLACK);
            fm = g2d.getFontMetrics();
            textX = (getWidth() - fm.stringWidth(greeting)) / 2;
            g2d.drawString(greeting, textX, y + avatarSize + 50);

            g2d.dispose();
        }
    }

    class LessonContentPanel extends JPanel {

        private CardLayout cardLayout;
        private JPanel mainContent;
        private int currentPage = 0;
        private final int totalPages = 5; // Số trang nội dung bài học

        public LessonContentPanel() {
            setLayout(new BorderLayout());
            cardLayout = new CardLayout();
            mainContent = new JPanel(cardLayout);
            setOpaque(false);
            mainContent.setOpaque(false);

            // Tạo các trang nội dung với switch case
            for (int i = 1; i <= totalPages; i++) {
                JPanel page = createPage(i);
                page.setOpaque(false);
                mainContent.add(page, "Page" + i);
            }

            // Nút Previous
            ImageIcon IconPrve = new ImageIcon(getClass().getResource("/com/img/prev.png"));
            Image scaledImagePrve = IconPrve.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
            JButton btnPrev = new JButton(new ImageIcon(scaledImagePrve));
            btnPrev.setBorderPainted(false);
            btnPrev.setContentAreaFilled(false);
            btnPrev.setFocusPainted(false);
            btnPrev.setOpaque(false);
            btnPrev.addActionListener(e -> {
                if (currentPage > 0) {
                    currentPage--;
                    cardLayout.show(mainContent, "Page" + (currentPage + 1));
                }
            });

            // Nút Next
            ImageIcon IconNext = new ImageIcon(getClass().getResource("/com/img/next.png"));
            Image scaledImageNext = IconNext.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
            JButton btnNext = new JButton(new ImageIcon(scaledImageNext));
            btnNext.setBorderPainted(false);
            btnNext.setContentAreaFilled(false);
            btnNext.setFocusPainted(false);
            btnNext.setOpaque(false);
            btnNext.addActionListener(e -> {
                if (currentPage < totalPages - 1) {
                    currentPage++;
                    cardLayout.show(mainContent, "Page" + (currentPage + 1));
                }
            });

            add(btnPrev, BorderLayout.WEST);
            add(mainContent, BorderLayout.CENTER);
            add(btnNext, BorderLayout.EAST);
            cardLayout.show(mainContent, "Page1");
        }

        // Phương thức tạo nội dung trang dựa trên chỉ số trang
        private JPanel createPage(int pageIndex) {
            JPanel page = new JPanel();
            page.setLayout(new BorderLayout());

            switch (pageIndex) {
                case 1 -> {
                    page.add(new NestedGridLayoutExample(), BorderLayout.CENTER);
                }
                case 2 -> {
                    page.add(new JLabel("Nội dung trang 2", SwingConstants.CENTER), BorderLayout.CENTER);
                }
                case 3 -> {
                    page.add(new JLabel("Nội dung trang 3", SwingConstants.CENTER), BorderLayout.CENTER);
                }
                case 4 -> {
                    page.add(new JLabel("Nội dung trang 4", SwingConstants.CENTER), BorderLayout.CENTER);
                }
                case 5 -> {
                    page.add(new JLabel("Nội dung trang 5", SwingConstants.CENTER), BorderLayout.CENTER);
                }
                default -> {
                    page.add(new JLabel("Nội dung không khả dụng", SwingConstants.CENTER), BorderLayout.CENTER);
                }
            }

            return page;
        }
    }

    public class NestedGridLayoutExample extends JPanel {

        public NestedGridLayoutExample() {
            setLayout(new BorderLayout());
            setOpaque(false);

            // Tạo outerPanel với GridBagLayout, 2 hàng 1 cột
            JPanel outerPanel = new JPanel(new GridBagLayout());
            outerPanel.setOpaque(false);
            GridBagConstraints outerGbc = new GridBagConstraints();
            outerGbc.insets = new Insets(5, 5, 5, 5);
            outerGbc.fill = GridBagConstraints.BOTH;

            // Hàng đầu tiên của outerPanel với chiều cao nhỏ
            JPanel topPanel = new JPanel(new BorderLayout());
            topPanel.setBackground(new Color(37, 36, 41, 150)); // Màu nền mờ
            topPanel.setOpaque(false);
            outerGbc.gridx = 0;
            outerGbc.gridy = 0;
            outerGbc.weightx = 1.0;
            outerGbc.weighty = 0.02; // Chiều cao nhỏ
            outerPanel.add(topPanel, outerGbc);

            JLabel title = new JLabel("Lessons");
            title.setForeground(new Color(37, 36, 41)); // Màu chữ trắng
            title.setFont(new Font("Arial", Font.BOLD, 45)); // Font chữ Arial đậm, kích thước 20
            title.setAlignmentX(Component.CENTER_ALIGNMENT); // Căn giữa logo trong sidebar
            title.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Tạo khoảng cách dưới logo

            topPanel.add(title, BorderLayout.WEST);

            // Tạo panel chính với GridBagLayout để tùy chỉnh chiều rộng các cột
            JPanel mainPanel = new JPanel(new GridBagLayout());
            mainPanel.setOpaque(false);
            GridBagConstraints mainGbc = new GridBagConstraints();
            mainGbc.insets = new Insets(10, 10, 10, 10);
            mainGbc.fill = GridBagConstraints.BOTH;

            // Tạo panel phụ với GridBagLayout để điều chỉnh tỷ lệ chiều cao các hàng
            JPanel nestedPanel = new JPanel(new GridBagLayout());
            nestedPanel.setOpaque(false);
            GridBagConstraints nestedGbc = new GridBagConstraints();
            nestedGbc.insets = new Insets(5, 5, 5, 5);
            nestedGbc.fill = GridBagConstraints.BOTH;

            // Tạo panel A1 với màu cam
            RoundedPanel panelA1 = new RoundedPanel(50);
            panelA1.setBackground(new Color(36,37,41,255)); // Màu nền sidebar
            panelA1.setLayout(new BorderLayout()); // Đặt layout cho panelA1 để chứa NestedPanelExample

            // Thêm NestedPanelExample vào trong RoundedPanel
            panelA1.add(new NestedPanelExample(), BorderLayout.CENTER);

            // Thêm panelA1 vào giao diện chính
            add(panelA1, BorderLayout.CENTER);

            // Tạo panel A2 với màu hồng
            RoundedPanel panelA2 = new RoundedPanel(50);
            panelA2.setBackground(new Color(36,37,41,255)); 
            panelA2.setLayout(new BorderLayout());
            panelA2.setPreferredSize(new Dimension(200, 20)); // Kích thước cố định của panelA2

            panelA2.add(new CustomPanel(), BorderLayout.CENTER);


            // Tạo panel chứa 2 hàng 1 cột
JPanel innerPanel = new JPanel(new GridBagLayout());
innerPanel.setOpaque(false); // Đảm bảo trong suốt nếu cần
GridBagConstraints gbc = new GridBagConstraints();
gbc.insets = new Insets(5, 5, 5, 5);
gbc.fill = GridBagConstraints.BOTH;

// Tạo panel trên (hàng 1)
JPanel topSubPanel = new JPanel();
topSubPanel.setBackground(new Color(37, 36, 41, 0)); // Đổi màu để dễ nhận diện
topSubPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
topSubPanel.setLayout(new BorderLayout());
topSubPanel.add(new PanelAA1(), BorderLayout.CENTER);
topSubPanel.setOpaque(false);


gbc.gridx = 0;
gbc.gridy = 0;
gbc.weightx = 1.0;
gbc.weighty = 0.5; // Chiếm 50% chiều cao
innerPanel.add(topSubPanel, gbc);

// Tạo panel dưới (hàng 2)
JPanel bottomSubPanel = new JPanel();
bottomSubPanel.setOpaque(false);
bottomSubPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
bottomSubPanel.setLayout(new BorderLayout());
bottomSubPanel.add(new CustomPanelChildren1(), BorderLayout.CENTER);
            bottomSubPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));


gbc.gridx = 0;
gbc.gridy = 0;
gbc.weightx = 1.0;
gbc.weighty = 0.5; // Chiếm 50% chiều cao
gbc.gridy = 1;
innerPanel.add(bottomSubPanel, gbc);

            // Tạo panel B với màu xám nhạt
            RoundedPanel panelB = new RoundedPanel(50);
            panelB.setBackground(new Color(36,37,41,255)); // Màu nền sidebar
            panelB.setLayout(new BorderLayout());
            panelB.add(innerPanel, BorderLayout.CENTER);

            // Thêm panel A1 vào hàng đầu tiên (chiếm 70% chiều cao)
            nestedGbc.gridx = 0;
            nestedGbc.gridy = 0;
            nestedGbc.weighty = 0.7; // Chiều cao 70%
            nestedGbc.weightx = 1.0; // Chiều rộng lấp đầy
            nestedPanel.add(panelA1, nestedGbc);

            // Thêm panel A2 vào hàng thứ hai (chiếm 30% chiều cao)
            nestedGbc.gridy = 1;
            nestedGbc.weighty = 0.3; // Chiều cao 30%
            nestedPanel.add(panelA2, nestedGbc);
//            nestedPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            // Thêm nestedPanel vào cột đầu tiên của mainPanel
            mainGbc.gridx = 0;
            mainGbc.gridy = 0;
            mainGbc.weightx = 0.7; // Chiếm 70% chiều rộng
            mainGbc.weighty = 1.0; // Chiều cao lấp đầy
            mainPanel.add(nestedPanel, mainGbc);

            // Thêm panel B vào cột thứ hai của mainPanel
            mainGbc.gridx = 1;
            mainGbc.weightx = 0.3; // Chiếm 30% chiều rộng
            mainPanel.add(panelB, mainGbc);

            // Thêm mainPanel vào hàng thứ hai của outerPanel
            outerGbc.gridy = 1;
            outerGbc.weighty = 0.9; // Chiều cao chính
            outerPanel.add(mainPanel, outerGbc);

            // Thêm outerPanel vào NestedGridLayoutExample
            add(outerPanel, BorderLayout.CENTER);
        }
    }

public class CustomPanelChildren1 extends JPanel {
    private JPanel containerPanel;
    private JScrollPane scrollPane;
    private int startY;
    
    private String[] titles = {"Bài học 1", "Bài học 2", "Bài học 3", "Bài học 4", "Bài học 5", "Bài học 6", "Bài học 7", "Bài học 8", "Bài học 9", "Bài học 10"};
    private String[] descriptions = {
        "Giới thiệu lập trình", "Cấu trúc điều kiện", "Vòng lặp", "Mảng và danh sách",
        "Lập trình hướng đối tượng", "Kế thừa và đa hình", "Xử lý ngoại lệ",
        "Đọc ghi file", "Kết nối cơ sở dữ liệu", "Triển khai ứng dụng"
    };
    private String[] icons = {
        "", "", "", "", "",
        "", "", "", "", ""
    };
    
    public CustomPanelChildren1() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder());

        containerPanel = new JPanel(new GridBagLayout());
        containerPanel.setBackground(null);
        containerPanel.setOpaque(false);

        scrollPane = new JScrollPane(containerPanel);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.setViewportBorder(null);

        add(scrollPane, BorderLayout.CENTER);

        addDragScrolling();
        addSampleItems();
    }

    private void addSampleItems() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        
        for (int i = 0; i < titles.length; i++) {
            containerPanel.add(createItemPanel(i), gbc);
            gbc.gridy++;
        }
    }

    private JPanel createItemPanel(int index) {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(255, 99, 132));
        panel.setPreferredSize(new Dimension(350, 70));
        panel.setBorder(null);

        GridBagConstraints gbc = new GridBagConstraints();
        
        // Cột 1 - Icon
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 0.3;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource(icons[index])));
        panel.add(iconLabel, gbc);
        
// Cột 2 - Nội dung (Tiêu đề & Mô tả)
gbc.gridx = 1;
gbc.gridheight = 1;
gbc.fill = GridBagConstraints.BOTH; 
gbc.weightx = 0.6;
gbc.anchor = GridBagConstraints.WEST; // Căn trái
gbc.insets = new Insets(5, 10, 5, 10); // Đảm bảo lề đều nhau

// Panel bọc nội dung
JPanel textPanel = new JPanel(new GridBagLayout());
textPanel.setOpaque(false);

// GridBagConstraints cho textPanel
GridBagConstraints gbcText = new GridBagConstraints();
gbcText.gridx = 0;
gbcText.gridy = 0;
gbcText.anchor = GridBagConstraints.WEST; // Căn trái
gbcText.weightx = 1; // Đảm bảo mở rộng hết phần còn lại
gbcText.fill = GridBagConstraints.HORIZONTAL;

// Tiêu đề
JLabel titleLabel = new JLabel(titles[index]);
titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
titleLabel.setPreferredSize(new Dimension(250, 20)); // Đảm bảo độ rộng cố định

// Mô tả
JLabel descLabel = new JLabel(descriptions[index]);
descLabel.setHorizontalAlignment(SwingConstants.LEFT);
descLabel.setPreferredSize(new Dimension(250, 20)); // Đảm bảo độ rộng cố định

// Thêm vào textPanel
textPanel.add(titleLabel, gbcText);
gbcText.gridy++;
textPanel.add(descLabel, gbcText);

// Thêm textPanel vào panel cha
panel.add(textPanel, gbc);


        
        // Cột 3 - Nút "Bắt đầu"
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.EAST;

  ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/img/next.png"));
// Thay đổi kích thước icon (32x32)
        Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JButton button = new JButton(scaledIcon);
            button.setPreferredSize(new Dimension(30, 30));
            button.setFocusable(false);
            button.setBorderPainted(false);  // Ẩn viền
            button.setContentAreaFilled(false); // Xóa nền
            button.setFocusPainted(false);  // Xóa viền khi focus
            button.setOpaque(false);  // Đảm bảo không có nền
        
        // Gán sự kiện cho nút
        final int lessonIndex = index;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openLesson(lessonIndex);
            }
        });
        
        panel.add(button, gbc);
        return panel;
    }
    
    private void openLesson(int index) {
        switch (index) {
            case 0 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 1 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 2 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 3 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 4 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 5 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 6 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 7 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 8 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 9 -> JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            default -> JOptionPane.showMessageDialog(this, "Bài học không tồn tại.");
        }
    }
    
    private void addDragScrolling() {
        containerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startY = e.getY();
            }
        });

        containerPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
                int newValue = verticalBar.getValue() + (startY - e.getY());
                verticalBar.setValue(newValue);
                startY = e.getY();
            }
        });
    }
}


public class CustomPanel extends JPanel {
    private int startX; // Vị trí ban đầu khi bắt đầu kéo chuột
    private JScrollPane scrollPane;
    private JPanel containerPanel;

    public CustomPanel() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());

        // Mảng tiêu đề và mô tả
        String[] titles = {"Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6"};
        String[] descriptions = {
            "Mô tả bài 1", "Mô tả bài 2", "Mô tả bài 3",
            "Mô tả bài 4", "Mô tả bài 5", "Mô tả bài 6"
        };

        // Panel chứa tất cả panel con
        containerPanel = new JPanel();
        containerPanel.setBorder(null);
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        containerPanel.setOpaque(false);

        for (int i = 0; i < 6; i++) {
            RoundedPanel childPanel = new RoundedPanel(30);
            childPanel.setBorder(null);
            childPanel.setPreferredSize(new Dimension(250, 200));
            childPanel.setMaximumSize(new Dimension(250, 200));
            childPanel.setBackground(new Color(169,228,232,255));
            childPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JPanel panel1 = new JPanel(new GridBagLayout());
            panel1.setOpaque(false);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel titleLabel = new JLabel(titles[i], SwingConstants.LEFT);
            titleLabel.setForeground(Color.BLACK);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            
            ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/img/start.png"));
// Thay đổi kích thước icon (32x32)
        Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JButton button = new JButton(scaledIcon);
            button.setPreferredSize(new Dimension(30, 30));
            button.setFocusable(false);
            button.setBorderPainted(false);  // Ẩn viền
            button.setContentAreaFilled(false); // Xóa nền
            button.setFocusPainted(false);  // Xóa viền khi focus
            button.setOpaque(false);  // Đảm bảo không có nền

            int index = i;
            button.addActionListener(createButtonListener(index));

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0.8;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weighty = 0; // Không mở rộng theo chiều dọc
            panel1.add(titleLabel, gbc);

            gbc.gridx = 1;
            gbc.weightx = 0.2;
            gbc.anchor = GridBagConstraints.EAST;
            panel1.add(button, gbc);

            JLabel descriptionLabel = new JLabel(descriptions[i], SwingConstants.CENTER);
            descriptionLabel.setFont(new Font("Arial", Font.BOLD, 16));
            descriptionLabel.setForeground(Color.BLACK);
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            gbc.weightx = 1;
            gbc.weighty = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            panel1.add(descriptionLabel, gbc);

            childPanel.setLayout(new BorderLayout());
            childPanel.add(panel1, BorderLayout.CENTER);

            containerPanel.add(childPanel);

            if (i < 5) {
                containerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            }
        }

        scrollPane = new JScrollPane(containerPanel);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.setViewportBorder(null);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(100, 100, 100, 150); // Màu thanh cuộn
            }
        });


        add(scrollPane, BorderLayout.CENTER);

        // Thêm chức năng kéo để cuộn bằng chuột
        addDragScrolling();
    }

private void addDragScrolling() {
    containerPanel.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            startX = e.getX();
        }
    });

    containerPanel.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            JScrollBar horizontalBar = scrollPane.getHorizontalScrollBar();
            int newValue = horizontalBar.getValue() + (startX - e.getX());

            // Giới hạn phạm vi cuộn
            newValue = Math.max(horizontalBar.getMinimum(), Math.min(horizontalBar.getMaximum(), newValue));

            horizontalBar.setValue(newValue);
            startX = e.getX();
        }
    });
}


    // Xử lý sự kiện khi nhấn nút
    private ActionListener createButtonListener(int index) {
        return e -> {
            switch (index) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 1");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
            }
        };
    }
}


    public class NestedPanelExample extends JPanel {

        public NestedPanelExample() {
            setLayout(new BorderLayout());
            setOpaque(false);

            // Panel 1: 1 cột, 2 hàng
            JPanel panel1 = new JPanel(new GridBagLayout());
            panel1.setOpaque(false);
            panel1.setPreferredSize(new Dimension(220, 100)); // Chiều rộng 200px, chiều cao 100px
            GridBagConstraints gbc1 = new GridBagConstraints();
            gbc1.insets = new Insets(5, 5, 5, 5);
            gbc1.fill = GridBagConstraints.BOTH;

            // Panel 2: Nằm trong hàng 1 của panel 1, 2 cột, 1 hàng
            JPanel panel2 = new JPanel(new GridBagLayout());
            panel2.setOpaque(false);
            panel2.setPreferredSize(new Dimension(100, 100));
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.insets = new Insets(5, 5, 5, 5);
            gbc2.fill = GridBagConstraints.BOTH;

            // Panel 3: Nằm trong cột 1 của panel 2, 2 hàng, 1 cột
            JPanel panel3 = new JPanel(new GridBagLayout());
            panel3.setPreferredSize(new Dimension(100, 120)); // Chiều rộng 200px, chiều cao 100px
            //panel3.setBackground(new Color(200, 255, 200)); // Màu nền nhẹ
            panel3.setOpaque(false);
            GridBagConstraints gbc3 = new GridBagConstraints();
            gbc3.insets = new Insets(5, 5, 5, 5);
            gbc3.fill = GridBagConstraints.BOTH;

            // Thêm các component vào Panel 3 (2 hàng, 1 cột)
            gbc3.gridx = 0;
            gbc3.gridy = 0;
            gbc3.weightx = 1.0;
            gbc3.weighty = 0.2;

            JLabel tieude = new JLabel("NGÔN NGỮ JAVA");
            tieude.setForeground(Color.WHITE); // Màu chữ
            tieude.setFont(new Font("Arial", Font.BOLD, 30)); // Cài đặt font chữ
            tieude.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
            panel3.add(tieude, gbc3);

            // Tạo JTextArea với nền trong suốt
            JTextArea textArea1 = new JTextArea("Hướng đối tượng (OOP): Hỗ trợ các nguyên tắc lập trình OOP như Kế thừa, Đa hình, "
                    + "Đóng gói, Trừu tượng hóa, giúp dễ quản lý và tái sử dụng mã."
                    + "\n\n"
                    + "Đa nền tảng: Nhờ JVM, mã Java có thể chạy trên các hệ điều hành khác nhau như"
                    + "Windows, macOS, Linux, v.v."
                    + "\n\n"
                    + "Bộ thu gom rác (Garbage Collection): Tự động quản lý bộ nhớ, giảm nguy cơ rò rỉ bộ nhớ."
                    + "\n\n"
                    + "An toàn và Bảo mật: Java cung cấp các tính năng bảo mật như ClassLoader, "
                    + "Security Manager, và mã hóa."
                    + "\n\n"
                    + "Đa luồng (Multithreading): Hỗ trợ tạo và quản lý nhiều luồng xử lý song song, "
                    + "tối ưu hiệu suất của ứng dụng."
                    + "\n\n"
                    + "Hiệu suất tốt: Dù không nhanh bằng ngôn ngữ biên dịch như C/C++, nhưng Java "
                    + "có hiệu suất tốt nhờ Just-In-Time (JIT) Compiler."
            );
            textArea1.setBackground(new Color(0, 0, 0, 0)); // Loại bỏ nền JTextArea
            textArea1.setPreferredSize(new Dimension(200, 100)); // Chiều rộng 200px, chiều cao 100px
            textArea1.setBorder(null); // Loại bỏ viền
            textArea1.setForeground(Color.WHITE); // Màu chữ
            textArea1.setFont(new Font("Arial", Font.PLAIN, 14)); // Cài đặt font chữ
            textArea1.setEditable(false); // Không cho chỉnh sửa
            textArea1.setFocusable(false); // Loại bỏ focus border
            textArea1.setLineWrap(true);
            textArea1.setWrapStyleWord(true);
            textArea1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

            gbc3.gridy = 1;
            gbc3.weighty = 0.8; // Chiều cao chiếm 80%
            panel3.add(textArea1, gbc3);

            // Thêm panel 3 vào cột 1 của panel 2
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            gbc2.weightx = 0.5;
            gbc2.weighty = 1.0;
            panel2.add(panel3, gbc2);

            // Thêm một component vào cột 2 của panel 2
            gbc2.gridx = 1;
            
           RoundedPanel panel4 = new RoundedPanel(30);
            panel4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            panel4.setBackground(new Color(222,211,96,255));
            panel4.setLayout(new BorderLayout());
            panel4.add(new CoursePanel(), BorderLayout.CENTER);

            panel2.add(panel4, gbc2);

            JTextArea textArea2 = new JTextArea("Java là một ngôn ngữ lập trình hướng đối tượng, đa nền tảng, mạnh mẽ và bảo mật, được phát triển bởi Sun Microsystems (nay thuộc Oracle) vào năm 1995. Java nổi bật với khẩu hiệu \"Write Once, Run Anywhere\" (WORA), nghĩa là chỉ cần viết mã một lần và có thể chạy trên mọi nền tảng hỗ trợ Java Virtual Machine (JVM)."
            );
            textArea2.setBackground(new Color(0, 0, 0, 0)); // Loại bỏ nền JTextArea
            textArea2.setBorder(null); // Loại bỏ viền
            textArea2.setForeground(Color.WHITE); // Màu chữ
            textArea2.setFont(new Font("Arial", Font.PLAIN, 16)); // Cài đặt font chữ
            textArea2.setEditable(false); // Không cho chỉnh sửa
            textArea2.setFocusable(false); // Loại bỏ focus border
            textArea2.setLineWrap(true);
            textArea2.setWrapStyleWord(true);
            textArea2.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20)); // Tạo khoảng trống xung quanh

            // Thêm panel 2 vào hàng 1 của panel 1
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.weightx = 1.0;
            gbc1.weighty = 0.7;
            panel1.add(panel2, gbc1);

            // Thêm một component vào hàng 2 của panel 1
            gbc1.gridy = 1;
            gbc1.weighty = 0.3;
            panel1.add(textArea2, gbc1);

            // Thêm panel 1 vào NestedPanelExample
            add(panel1, BorderLayout.CENTER);
        }
    }

public class DonutChartPanel extends JPanel {
    public DonutChartPanel() {
        setLayout(new BorderLayout());
        setBorder(null);
        setOpaque(false);
        setBackground(null);
setPreferredSize(new Dimension(500, 500));
setMinimumSize(new Dimension(300, 300));


        add(createDonutChartPanel(), BorderLayout.CENTER);
    }

    private JPanel createDonutChartPanel() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        dataset.setValue("Bài 1", 10);
        dataset.setValue("Bài 2", 16.67);
        dataset.setValue("Bài 3", 16.67);
        dataset.setValue("Bài 4", 16.67);
        dataset.setValue("Bài 5", 16.67);
        dataset.setValue("Bài 6", 16.67);

        double totalCompleted = dataset.getKeys().stream()
                .mapToDouble(key -> dataset.getValue((String) key).doubleValue()).sum();

        if (totalCompleted < 100) {
            dataset.setValue("Chưa hoàn thành", 100 - totalCompleted);
        }

        JFreeChart chart = ChartFactory.createRingChart(
                null, dataset, false, true, false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint(1, new Color(255, 99, 132));  
        plot.setSectionPaint(2, new Color(54, 162, 235));  
        plot.setSectionPaint(3, new Color(255, 206, 86));  
        plot.setSectionPaint(4, new Color(75, 192, 192));  
        plot.setSectionPaint(5, new Color(153, 102, 255)); 
        plot.setSectionPaint(6, new Color(255, 159, 64));  
        plot.setInteriorGap(0);
        plot.setShadowPaint(null);

        
        if (dataset.getKeys().contains("Chưa hoàn thành")) {
            plot.setSectionPaint(0, Color.WHITE);
        }

        plot.setInteriorGap(0.4);
        plot.setLabelGenerator(null);
        plot.setOutlinePaint(null);
        plot.setBackgroundPaint(null);
        chart.setBackgroundPaint(null);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setLayout(new BorderLayout());
        chartPanel.setOpaque(false);
        chartPanel.setBorder(BorderFactory.createEmptyBorder());
        chartPanel.setBackground(null);
                chartPanel.setBorder(null);
        chartPanel.setPreferredSize(new Dimension(600, 600)); // Kích thước lớn hơn
        chartPanel.setMinimumSize(new Dimension(600, 600));


        JLabel lblCenter = new JLabel(String.format("%.2f%%", totalCompleted), SwingConstants.CENTER);
        lblCenter.setFont(new Font("Arial", Font.BOLD, 20));
        lblCenter.setForeground(Color.WHITE);
        lblCenter.setOpaque(false);
        
        chartPanel.add(lblCenter, BorderLayout.CENTER);
        return chartPanel;
    }
}

public class PanelAA1 extends JPanel {
    public PanelAA1() {
        setLayout(new GridBagLayout());
        setOpaque(false);
        setBorder(null);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 10, 10, 10); // Thêm padding giữa tiêu đề và panelA2
        add(new DonutChartPanel(), gbc);
        
        gbc.gridy = 1;
        gbc.weighty = 0.1;
        add(new PanelA2(), gbc);
    }
}

class PanelA2 extends JPanel {
    private static final Color[] COLORS = {
        new Color(255, 99, 132),   // Đỏ hồng
        new Color(54, 162, 235),   // Xanh dương
        new Color(255, 206, 86),   // Vàng
        new Color(75, 192, 192),   // Xanh ngọc
        new Color(153, 102, 255),  // Tím
        new Color(255, 159, 64)    // Cam
    };

    public PanelA2() {
        setLayout(new GridBagLayout());
        setOpaque(false);
        setBorder(null);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 5, 10, 5); // Thêm padding giữa các hàng
        
        for (int i = 0; i < 3; i++) {
            gbc.gridy = i;
            for (int j = 0; j < 2; j++) {
                gbc.gridx = j;
                int index = i * 2 + j;
                if (index < COLORS.length) {
                    add(createRowPanel(index + 1, COLORS[index]), gbc);
                }
            }
        }
    }

    private JPanel createRowPanel(int lessonNumber, Color color) {
        JPanel rowPanel = new JPanel(new GridBagLayout());
        rowPanel.setOpaque(false);
        rowPanel.setBorder(null);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        gbc.gridx = 0;
        gbc.weightx = 0.2;
        JPanel colorPanel = new JPanel();

        colorPanel.setBackground(color);
        rowPanel.add(colorPanel, gbc);
        
        gbc.gridx = 1;
        gbc.weightx = 0.6;
        JLabel titleLabel = new JLabel("Bài " + lessonNumber, SwingConstants.LEFT);
        titleLabel.setForeground(Color.WHITE);
        rowPanel.add(titleLabel, gbc);
                titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); // Tạo khoảng trống xung quanh
        
        gbc.gridx = 2;
        gbc.weightx = 0.2;
        JLabel percentageLabel = new JLabel("0%/100%", SwingConstants.RIGHT);
                percentageLabel.setForeground(Color.WHITE);
        rowPanel.add(percentageLabel, gbc);
        
        return rowPanel;
    }
}

public class CoursePanel extends JPanel {
    
    public CoursePanel() {
        setOpaque(false);
        setBorder(null);
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
        setPreferredSize(new Dimension(60, 100)); // Chiều rộng 200px, chiều cao 100px
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Cấu hình mặc định
        gbc.gridx = 0;
        gbc.weightx = 1.0; // Kéo giãn theo chiều ngang
        gbc.anchor = GridBagConstraints.WEST; // Căn trái
        gbc.fill = GridBagConstraints.HORIZONTAL; // Giãn theo chiều ngang
        gbc.insets = new Insets(5, 0, 5, 0); // Khoảng cách giữa các hàng

        // Tiêu đề khóa học (Hàng đầu tiên)
        gbc.gridy = 0;
        JLabel courseTitle = new JLabel("<html>Khóa học Java từ cơ bản đến nâng cao</html>");
        courseTitle.setFont(new Font("Arial", Font.BOLD, 26));
              courseTitle.setForeground(Color.BLACK);
        add(courseTitle, gbc);
        
        // Khoảng trống để mô tả nằm giữa
        gbc.gridy = 1;
        gbc.weighty = 0.2; // Tạo khoảng trống trước mô tả
        add(new JLabel(), gbc);

        // Mô tả ngắn gọn (Phần giữa)
        gbc.gridy = 2;
        gbc.weighty = 0.1; // Tạo khoảng trống trước mô tả
        JLabel courseDescription = new JLabel("<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>");
        courseDescription.setFont(new Font("Arial", Font.PLAIN, 16));
        courseDescription.setForeground(Color.BLACK);
        add(courseDescription, gbc);

        // Thời lượng khóa học
        gbc.gridy = 3;
        JLabel durationLabel = new JLabel("Thời lượng: 60 giờ, 3 tháng học");
                durationLabel.setFont(new Font("Arial", Font.PLAIN, 14));
                     durationLabel.setForeground(Color.BLACK);
        add(durationLabel, gbc);

        // Số lượng bài học
        gbc.gridy = 4;
        JLabel lessonsLabel = new JLabel("Số lượng bài học: 50 bài giảng + bài tập thực hành");
         lessonsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
         lessonsLabel.setForeground(Color.BLACK);
        add(lessonsLabel, gbc);
        
        // Khoảng trống để nút đăng ký nằm ở dưới cùng
        gbc.gridy = 5;
        gbc.weighty = 0.5; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);

        // Nút đăng ký (Hàng cuối)
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.weightx = 0.2;
        gbc.anchor = GridBagConstraints.EAST; // Căn giữa nút
        
        JButton registerButton = new JButton("Đăng ký ngay");
        registerButton.setFocusPainted(false);
        registerButton.setBackground(new Color(255,255,255,255));
        registerButton.setForeground(Color.BLACK);
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBorder(null);

        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
         
        JPanel rowPanel = new JPanel(new BorderLayout());
        
        rowPanel.add(registerButton, BorderLayout.EAST);
        rowPanel.setOpaque(false);
        
        add(rowPanel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);
    }
}
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessionalSidebarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessionalSidebarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessionalSidebarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessionalSidebarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessionalSidebarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
