/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ui;

import com.baihoc.DanhSachBaiHoc;
import com.baihoc.DynamicPanelExample;
import com.baihoc.ModernBarChart;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.FontUtils;
import com.lesson.content.java.TrangChinh;
import com.swing.ProfessionalSidebarForm;
import com.swing.RoundedPanel;
import com.kehoach.GiaoDienKeHoach;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC
 */
public class MainFrame extends javax.swing.JFrame {

    String content;

    private LessonContentPanel lessonContentPanel;

    EmptyPanel emptyPanel;

    //JPanel[] contentPanels;
    JPanel panelA = new JPanel();

    DanhSachBaiHoc danhSachBaiHoc;

    /**
     * Creates new form MainFrame
     */
    public MainFrame(String content) {

        initComponents();
        setTitle("Full Screen Background Demo");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Mở rộng cửa sổ toàn màn hình
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new BackgroundPanel());
        setLayout(null); // Vô hiệu hóa layout để tự quản lý vị trí các component

        setTitle("Dashboard với Thanh Menu Dọc Chuyên Nghiệp"); // Đặt tiêu đề cho cửa sổ
        //setSize(1000, 600); // Kích thước cửa sổ ban đầu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng ứng dụng khi nhấn nút đóng
        setLocationRelativeTo(null); // Căn giữa cửa sổ trên màn hình
        setLayout(null); // Sử dụng layout null để tự do đặt vị trí các thành phần
        //setExtendedState(JFrame.MAXIMIZED_BOTH); // Mở rộng cửa sổ toàn màn hình

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
        MainFrame.AvatarPanel avatarPanel = new MainFrame.AvatarPanel();
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
            JPanel panelA = new JPanel();
            panelA.setOpaque(false);
            panelA.setLayout(new BorderLayout());

            switch (i) {
                case 0 -> { // Item 1: Hiển thị toàn panel

                }
                case 1 -> { // Item 2: Hiển thị toàn label

                }
                case 2 -> { // Item 3: Sử dụng JTextArea
//                    lessonContentPanel = new LessonContentPanel(this);
                    emptyPanel = new EmptyPanel(this);
                    panelA.add(emptyPanel, BorderLayout.CENTER);
                }
                case 3 -> { // Item 4: Sử dụng hình ảnh
                    panelA.add(new TrangBaiHoc(this, "Java"), BorderLayout.CENTER);
                }
                case 4 -> { // Item 5: Form nhập liệu
                    panelA.add(new GridBagPanelDemo(), BorderLayout.CENTER);
                }
                case 5 -> { // Item 6: Hiển thị bảng dữ liệu

                }
                case 6 -> { // Item 7: Nội dung trống hoặc tùy chỉnh khác

                }
            }

            contentPanels[i] = panelA;
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
        MainFrame.BackgroundPanel backgroundPanel = new MainFrame.BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1920, 1010); // Kích thước full màn hình
        backgroundPanel.setLayout(new BorderLayout());

        wrapperPanel.add(sidebar, BorderLayout.WEST); // Đặt sidebar vào bên trái của wrapper

        add(backgroundPanel); // Thêm background vào JFrame
        backgroundPanel.add(wrapperPanel, BorderLayout.WEST); // Thêm sidebar vào background
        backgroundPanel.add(mainContent, BorderLayout.CENTER); // Thêm nội dung chính vào background
    }

    public class EmptyPanel extends JPanel {

        public EmptyPanel(MainFrame mainFrame) {
            setLayout(new BorderLayout());
            setOpaque(false);
            lessonContentPanel = new LessonContentPanel(mainFrame);
            add(lessonContentPanel, BorderLayout.CENTER);
        }
    }

    public void updateDanhSachBai(JPanel newPanel) {

        emptyPanel.removeAll();
        emptyPanel.add(newPanel, BorderLayout.CENTER);
        emptyPanel.revalidate();
        emptyPanel.repaint();

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
        private final int totalPages = 6; // Số trang nội dung bài học

        public LessonContentPanel(MainFrame mainFrame) {
            setLayout(new BorderLayout());
            cardLayout = new CardLayout();
            mainContent = new JPanel(cardLayout);
            setOpaque(false);
            mainContent.setOpaque(false);

            // Tạo các trang nội dung với switch case
            for (int i = 1; i <= totalPages; i++) {
                JPanel page = createPage(i, mainFrame);
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
        private JPanel createPage(int pageIndex, MainFrame mainFrame) {
            this.removeAll();
            JPanel page = new JPanel(); // Tạo lại trang có TrangChinh mới
            page.setLayout(new BorderLayout());

            switch (pageIndex) {
                case 1 -> {
                    page.add(new TrangChinh(0, "Java", "Java", mainFrame), BorderLayout.CENTER);
                }
                case 2 -> {
                    page.add(new TrangChinh(1, "HTML & CSS", "HTML & CSS", mainFrame), BorderLayout.CENTER);
                }
                case 3 -> {
                    page.add(new TrangChinh(2, "JAVASCRIPT", "JAVASCRIPT", mainFrame), BorderLayout.CENTER);
                }
                case 4 -> {
                    page.add(new TrangChinh(3, "PYTHON", "PYTHON", mainFrame), BorderLayout.CENTER);
                }
                case 5 -> {
                    page.add(new TrangChinh(4, "C", "C", mainFrame), BorderLayout.CENTER);
                }
                case 6 -> {
                    page.add(new TrangChinh(5, "SQL", "SQL", mainFrame), BorderLayout.CENTER);
                }
                default -> {
                    page.add(new JLabel("Nội dung không khả dụng", SwingConstants.CENTER), BorderLayout.CENTER);
                }
            }

            return page;
        }

        TrangChinh trangChinh;
    }

    public class GridBagPanelDemo extends JPanel {

        private JPanel mainPanel; // Panel chứa nội dung sẽ thay đổi
        private CardLayout cardLayout; // Layout giúp chuyển đổi nội dung

        public GridBagPanelDemo() {
            setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Xóa viền gốc
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            // Hàng 1: Thanh Menu
            JPanel menuPanel = new JPanel(new BorderLayout());
            menuPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // Xóa viền gốc

            // Tạo JLabel tiêu đề
            JLabel lblTitle = new JLabel("Quản lý công việc");
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

            // Thêm tiêu đề và các nút vào menuPanel
            menuPanel.add(lblTitle, BorderLayout.WEST);
            menuPanel.add(buttonPanel, BorderLayout.CENTER);

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
    }

    public class TrangBaiHoc extends JPanel {

        private JPanel mainPanel;
        private DanhSachBaiHoc danhSachBaiHoc;

        public TrangBaiHoc(MainFrame mainFrame, String content) {
            setLayout(new BorderLayout()); // Sử dụng BorderLayout cho việc mở rộng toàn bộ
            setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
            GridBagConstraints gbc = new GridBagConstraints();

            // Panel chứa 2 hàng
            JPanel topContainerPanel = new JPanel(new GridBagLayout());
            GridBagConstraints topGbc = new GridBagConstraints();
            topGbc.gridx = 0;
            topGbc.fill = GridBagConstraints.BOTH;

            // Header Panel (Hàng 1 - 10%)
            JPanel headerPanel = new JPanel(new BorderLayout());
            headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Xóa viền gốc
            headerPanel.setOpaque(false);
            headerPanel.setPreferredSize(new Dimension(100, 5));
            //headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
            topGbc.gridy = 0;
            topGbc.weightx = 1.0;
            topGbc.weighty = 0.1;
            topContainerPanel.add(headerPanel, topGbc);
            
            // Tạo JLabel tiêu đề
            JLabel lblTitle = new JLabel("Quản lý công việc");
            lblTitle.setFont(new Font("Arial", Font.BOLD, 34));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 20)); // Cách phải 1 chút

            // Tạo panel chứa các nút, dùng FlowLayout.RIGHT
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));

            // Tạo RoundedPanel chứa JButton
            //RoundedPanel KhoaBieu = createRoundedPanel();
            RoundedPanel baitap = createRoundedPanel();
            RoundedPanel Thoattrang = createRoundedPanel();

            // Tạo JButton với icon
//            JButton btnKhoaBieu = createButtonWithIcon("Khóa biểu", "/com/img/calendar (1).png");
//            KhoaBieu.setBackground(new Color(238, 239, 233, 255));
//            btnKhoaBieu.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    KhoaBieu.setBackground(new Color(238, 239, 233, 255));
//                    TodoList.setBackground(new Color(223, 223, 215, 255));
//                    NhatKy.setBackground(new Color(223, 223, 215, 255));
//                }
//            });
            JButton btnbaitap = createButtonWithIcon("Bài tập", "/com/img/to-do-list.png");

            JButton btnThoattrang = createButtonWithIcon("Thoát", "/com/img/diary.png");
            btnThoattrang.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lessonContentPanel = new LessonContentPanel(mainFrame);
                    updateDanhSachBai(lessonContentPanel);
                }
            });

            // Đặt JButton vào RoundedPanel với GridBagConstraints để căn giữa
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.CENTER;

            //KhoaBieu.add(btnKhoaBieu, gbc);
            baitap.add(btnbaitap, gbc);
            Thoattrang.add(btnThoattrang, gbc);

            // Thêm các RoundedPanel vào buttonPanel
            //buttonPanel.add(KhoaBieu);
            buttonPanel.add(baitap);
            buttonPanel.add(Thoattrang);
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // Xóa viền gốc

            // Thêm tiêu đề và các nút vào menuPanel
            headerPanel.add(lblTitle, BorderLayout.WEST);
            headerPanel.add(buttonPanel, BorderLayout.CENTER);

            // Main Panel (Hàng 2 - 90%)
            mainPanel = new JPanel(new GridBagLayout());
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.BOTH;

            // Left Panel
            JPanel leftPanel = new JPanel(new GridBagLayout());
            leftPanel.setOpaque(false);
            GridBagConstraints leftGbc = new GridBagConstraints();
            leftGbc.weightx = 1.0;
            leftGbc.weighty = 1.0;
            leftGbc.fill = GridBagConstraints.BOTH;

            // Top Panel
            JPanel topPanel = new JPanel();
            topPanel.setOpaque(false);
            topPanel.setPreferredSize(new Dimension(100, 100));
            RoundedPanel topPanelA = new RoundedPanel(50);
            //topPanelA.setPreferredSize(new Dimension(100, 100));
            topPanelA.setBackground(new Color(21, 63, 77, 255));
            topPanelA.setLayout(new BorderLayout());
            topPanelA.add(new ModernBarChart(""), BorderLayout.CENTER);
            topPanel.setLayout(new BorderLayout());
            topPanel.add(topPanelA, BorderLayout.CENTER);
            topPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
            leftGbc.gridx = 0;
            leftGbc.gridy = 0;
            leftPanel.add(topPanel, leftGbc);

            // Bottom Panel
            RoundedPanel bottomPanel = new RoundedPanel(50);
            bottomPanel.setBackground(new Color(21, 63, 77, 255));
            bottomPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
            bottomPanel.setLayout(new BorderLayout());
            danhSachBaiHoc = new DanhSachBaiHoc(content);
            bottomPanel.add(danhSachBaiHoc, BorderLayout.CENTER);
            bottomPanel.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
            leftGbc.gridx = 0;
            leftGbc.gridy = 1;
            leftPanel.add(bottomPanel, leftGbc);
            leftPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

            // Thêm Left Panel vào Main Panel
// Thêm Left Panel vào Main Panel
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0.3; // Tăng trọng số để giữ lại diện tích
            gbc.weighty = 1.0;
            mainPanel.add(leftPanel, gbc);

            // Right Panel
// Right Panel
            JPanel rightPanel = new JPanel(new BorderLayout());
            rightPanel.setOpaque(false);

            RoundedPanel newPanel = new RoundedPanel(50);
            newPanel.setBackground(new Color(200, 226, 225, 255));
            newPanel.setPreferredSize(new Dimension(150, 10));
            newPanel.setLayout(new BorderLayout());
            newPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            newPanel.add(new DynamicPanelExample(), BorderLayout.CENTER);
            rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
            rightPanel.add(newPanel, BorderLayout.CENTER);

            gbc.gridx = 1;
            gbc.weightx = 0.7;
            gbc.weighty = 1.0;
            mainPanel.add(rightPanel, gbc);

// Cập nhật lại giao diện
            mainPanel.revalidate();
            mainPanel.repaint();

            // Thêm Main Panel vào topContainerPanel
            topGbc.gridy = 1;
            topGbc.weighty = 0.9;
            topContainerPanel.add(mainPanel, topGbc);

            add(topContainerPanel, BorderLayout.CENTER); // Đảm bảo toàn bộ giao diện được hiển thị
        }
        
        private RoundedPanel createRoundedPanel() {
            RoundedPanel panel = new RoundedPanel(50);
            panel.setBackground(new Color(200, 226, 225, 255));
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
            button.setFont(new Font("Arial", Font.PLAIN, 14));
            button.setHorizontalAlignment(SwingConstants.LEFT); // Căn text về bên phải icon
            button.setVerticalAlignment(SwingConstants.CENTER);
            button.setIconTextGap(5); // Khoảng cách giữa icon và text
            return button;
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
            .addGap(0, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());  // Chọn giao diện FlatLaf
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
