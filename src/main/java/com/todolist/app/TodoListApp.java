
package com.todolist.app;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.Date;
import com.utils.XJdbc;
import java.sql.Timestamp;
import java.util.List;
import com.dao.TodoDAO;
import com.entity.Todo;
import com.utils.Auth;
import com.utils.MsgBox;
import com.formdev.flatlaf.FlatLightLaf;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.time.LocalDate;
import java.awt.image.BufferedImage;
import java.awt.geom.Ellipse2D;
import java.awt.AlphaComposite;
import java.net.URL;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.time.LocalTime;
import java.util.stream.IntStream;

public class TodoListApp extends JPanel {
    private JPanel mainPanel;
    private JPanel boardPanel;
    private JPanel sidebarPanel;
    private ArrayList<TaskColumn> columns;
    private JTextField searchField; // Thêm trường tìm kiếm
    
    // Các trạng thái công việc bằng tiếng Việt
    private static final String STATUS_TODO = "Cần làm";
    private static final String STATUS_IN_PROGRESS = "Đang làm";
    private static final String STATUS_IN_REVIEW = "Đang xem xét";
    private static final String STATUS_DONE = "Hoàn thành";
    
    // Cập nhật bảng màu hiện đại
    private static final Color BACKGROUND_COLOR = new Color(246, 248, 250);
    private static final Color HEADER_COLOR = new Color(255, 255, 255);
    private static final Color ACCENT_COLOR = new Color(88, 101, 242);  // Discord-like color
    private static final Color TEXT_COLOR = new Color(49, 51, 56);
    private static final Color SECONDARY_TEXT_COLOR = new Color(107, 114, 128);
    private static final Color BORDER_COLOR = new Color(226, 232, 240);
    private static final Color SIDEBAR_COLOR = new Color(255, 255, 255, 245);
    private static final Color COLUMN_BACKGROUND = new Color(255, 255, 255);
    private static final Color HOVER_COLOR = new Color(249, 250, 251);
    
    // Cập nhật màu tag
    private static final Color TAG_BLUE = new Color(88, 101, 242, 20);
    private static final Color TAG_RED = new Color(237, 66, 69, 20);
    private static final Color TAG_GREEN = new Color(87, 242, 135, 20);
    private static final Color TAG_PURPLE = new Color(114, 137, 218, 20);
    private static final Color TAG_PINK = new Color(255, 115, 250, 20);
    private static final Color TAG_ORANGE = new Color(255, 163, 72, 20);
    
    // Cập nhật các thông số thiết kế
    private static final int BORDER_RADIUS = 12;
    private static final int COLUMN_RADIUS = 16;
    private static final int SHADOW_SIZE = 8;
    
    // Cập nhật font chữ
    private static final Font TITLE_FONT = new Font("Segoe UI", Font.BOLD, 28);
    private static final Font HEADER_FONT = new Font("Segoe UI", Font.BOLD, 18);
    private static final Font NORMAL_FONT = new Font("Segoe UI", Font.PLAIN, 15);
    private static final Font SMALL_FONT = new Font("Segoe UI", Font.PLAIN, 14);
    
    // Cập nhật màu card
    private static final Color CARD_BLUE = new Color(245, 247, 255);
    private static final Color CARD_PINK = new Color(255, 245, 252);
    private static final Color CARD_GREEN = new Color(245, 255, 250);
    private static final Color CARD_ORANGE = new Color(255, 250, 245);
    private static final Color CARD_MINT = new Color(240, 253, 250);
    private static final Color CARD_PURPLE = new Color(250, 245, 255);
    
    // Cập nhật màu shadow
    private static final Color SHADOW_COLOR = new Color(0, 0, 0, 10);
    private static final Color HOVER_SHADOW_COLOR = new Color(0, 0, 0, 20);
    
    // Hiệu ứng animation
    private static final float ANIMATION_SPEED = 0.2f;
    private static final int ANIMATION_DELAY = 10;
    private TodoDAO todoDAO = new TodoDAO();
    private String currentLanguage = "Java";
    private JComboBox<String> languageBox;
    private TaskStateManager taskStateManager;  // Thêm TaskStateManager
    
    // Thêm một field mới để lưu popup thông báo
    private JWindow notificationPopup;
    
    Window window = SwingUtilities.getWindowAncestor(this);
    
    // Thêm biến instance mới
    private JButton notificationButton;
    private JPanel notificationsPanel;
    private List<NotificationItem> notifications = new ArrayList<>();
    private int unreadCount = 0;

    // Thêm class NotificationItem
    private class NotificationItem {
        private String title;
        private String message;
        private String time;
        private boolean isRead;

        public NotificationItem(String title, String message, String time) {
            this.title = title;
            this.message = message;
            this.time = time;
            this.isRead = false;
        }
    }

    // Thêm biến instance
    private JPanel rightPanel;

    public TodoListApp() {
//        setTitle("Quản lý công việc");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setMinimumSize(new Dimension(1200, 800));
        
        // Khởi tạo các thành phần
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(BACKGROUND_COLOR);
        
        // Tạo header panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(HEADER_COLOR);
        headerPanel.setBorder(BorderFactory.createCompoundBorder(
            new ShadowBorder(SHADOW_COLOR, 5),
            BorderFactory.createEmptyBorder(15, 25, 15, 25)
        ));

        // Panel bên trái của header
        JPanel leftHeaderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        leftHeaderPanel.setBackground(HEADER_COLOR);

        // Logo và tiêu đề
        JLabel titleLabel = new JLabel("Quản lý công việc");
        titleLabel.setFont(TITLE_FONT);
        titleLabel.setForeground(TEXT_COLOR);
        leftHeaderPanel.add(titleLabel);

        // Panel bên phải của header
        rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        rightPanel.setBackground(HEADER_COLOR);

        // Thêm nút thông báo
        createNotificationButton();

        // Nút đăng xuất
        JButton logoutButton = new JButton("Đăng xuất");
        styleButton(logoutButton);
        logoutButton.addActionListener(e -> {
            //dispose();
            //new LoginFrame().setVisible(true);
        });
        rightPanel.add(logoutButton);

        headerPanel.add(leftHeaderPanel, BorderLayout.WEST);
        headerPanel.add(rightPanel, BorderLayout.EAST);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Tạo nội dung chính
        createMainContent();
        
        // Thêm mainPanel vào frame
        add(mainPanel);
        
        // Cài đặt cửa sổ
//        setLocationRelativeTo(null);
//        pack();

        // Thêm một số thông báo mẫu
        addSampleNotifications();
    }

    private void addSampleNotifications() {
        // Thêm một số thông báo mẫu để kiểm tra
        addNotification(
            "Chào mừng bạn!", 
            "Chào mừng đến với ứng dụng Quản lý công việc"
        );
        
        addNotification(
            "Hướng dẫn sử dụng", 
            "Nhấp vào nút '+' để thêm công việc mới"
        );
        
        addNotification(
            "Tính năng mới", 
            "Đã thêm tính năng lọc và tìm kiếm công việc"
        );
    }

    private void createNotificationButton() {
        // Tạo container cho nút thông báo
        JPanel notificationContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        notificationContainer.setBackground(HEADER_COLOR);

        // Tạo nút thông báo
        notificationButton = new JButton();
        notificationButton.setPreferredSize(new Dimension(40, 40));
        notificationButton.setBackground(HEADER_COLOR);
        notificationButton.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        notificationButton.setFocusPainted(false);
        notificationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Tạo icon thông báo
        ImageIcon bellIcon = createImageIcon("bell.png", 20, 20);
        if (bellIcon != null) {
            notificationButton.setIcon(bellIcon);
        } else {
            // Fallback nếu không tìm thấy icon
            notificationButton.setText("🔔");
            notificationButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        }

        // Thêm badge số thông báo chưa đọc
        notificationButton.setLayout(null);
        JLabel badgeLabel = new JLabel("0");
        badgeLabel.setFont(new Font("Segoe UI", Font.BOLD, 11));
        badgeLabel.setForeground(Color.WHITE);
        badgeLabel.setBackground(new Color(255, 69, 58));
        badgeLabel.setOpaque(true);
        badgeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        badgeLabel.setVerticalAlignment(SwingConstants.CENTER);
        badgeLabel.setBounds(25, 3, 16, 16);
        badgeLabel.setBorder(new CircleBorder(new Color(255, 69, 58), 0));
        notificationButton.add(badgeLabel);

        // Hiệu ứng hover
        notificationButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                notificationButton.setBackground(HOVER_COLOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                notificationButton.setBackground(HEADER_COLOR);
            }
        });

        // Xử lý sự kiện click
        notificationButton.addActionListener(e -> showNotifications());

        notificationContainer.add(notificationButton);
        rightPanel.add(notificationContainer);

        // Cập nhật badge
        updateNotificationBadge();
    }

    private void loadTasksFromDatabase() {
        try {
            List<Todo> todos = todoDAO.selectByUserId(Auth.user.getMaNguoiDung());
            
            for (Todo todo : todos) {
                Task task = new Task(
                    todo.getTieuDe(),
                    todo.getNoiDung(),
                    "Cơ bản",
                    todo.getNgayTao().toLocalDateTime()
                );
                
                // Lưu ID từ cơ sở dữ liệu vào task
                task.dbTaskId = todo.getMaTodo();
                
                String status = todo.getTrangThaiTask();
                if (status == null || status.isEmpty()) {
                    status = todo.isTrangThai() ? STATUS_DONE : STATUS_TODO;
                } else {
                    // Ánh xạ các trạng thái tiếng Anh sang tiếng Việt
                    if (status.equals("Todo list")) {
                        status = STATUS_TODO;
                    } else if (status.equals("In Progress")) {
                        status = STATUS_IN_PROGRESS;
                    } else if (status.equals("In Review")) {
                        status = STATUS_IN_REVIEW;
                    } else if (status.equals("Done")) {
                        status = STATUS_DONE;
                    }
                }
                
                task.setStatus(status); // Đặt trạng thái cho task
                
                for (TaskColumn column : columns) {
                    if (column.columnTitle.equals(status)) {
                        column.addTask(task);
                        break;
                    }
                }
            }
            
            revalidate();
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Lỗi khi tải dữ liệu từ database: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createMainContent() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(BACKGROUND_COLOR);

        // Tạo các phần còn lại của giao diện
        createBoard();

        // Thêm mainPanel vào frame
        add(mainPanel);
    }

    private void createBoard() {
        JPanel boardPanel = new JPanel(new BorderLayout(20, 20));
        boardPanel.setBackground(BACKGROUND_COLOR);
        boardPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(BACKGROUND_COLOR);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBackground(BACKGROUND_COLOR);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        String[] languages = {"Java", "JavaScript", "HTML/CSS", "C", "Python", "SQL"};
        languageBox = new JComboBox<>(languages);
        
        languageBox.setFont(TITLE_FONT);
        languageBox.setForeground(TEXT_COLOR);
        languageBox.setBackground(new Color(0, 0, 0, 0));
        languageBox.setBorder(null);
        languageBox.setOpaque(false);
        
        // Thêm renderer để hiển thị biểu tượng ngôn ngữ
        languageBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, 
                                                         boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                String language = (String) value;
                
                ImageIcon langIcon = getLanguageIconForDialog(language);
                if (langIcon != null) {
                    label.setIcon(langIcon);
                    label.setIconTextGap(10);
                }
                
                if (isSelected) {
                    label.setBackground(new Color(243, 244, 246));
                }
                
                return label;
            }
        });
        
        languageBox.setMaximumSize(new Dimension(400, 40));
        languageBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        languageBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                languageBox.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, ACCENT_COLOR));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if (!languageBox.isPopupVisible()) {
                    languageBox.setBorder(null);
                }
            }
        });
        
        languageBox.addActionListener(e -> {
            currentLanguage = (String) languageBox.getSelectedItem();
            loadTasksByLanguage(currentLanguage);
        });
        
        titlePanel.add(languageBox);
        titlePanel.add(Box.createRigidArea(new Dimension(0, 10)));

        headerPanel.add(titlePanel, BorderLayout.NORTH);

        JPanel navPanel = new JPanel(new BorderLayout());
        navPanel.setBackground(BACKGROUND_COLOR);

        JPanel boardTitlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        boardTitlePanel.setBackground(BACKGROUND_COLOR);

        JLabel boardLabel = new JLabel("Danh mục");
        boardLabel.setFont(HEADER_FONT);
        boardLabel.setForeground(TEXT_COLOR);
        boardTitlePanel.add(boardLabel);

        JLabel separator = new JLabel(" - ");
        separator.setFont(HEADER_FONT);
        separator.setForeground(SECONDARY_TEXT_COLOR);
        boardTitlePanel.add(separator);

        JLabel tasksLabel = new JLabel("Quản lý học tập");
        tasksLabel.setFont(HEADER_FONT);
        tasksLabel.setForeground(ACCENT_COLOR);
        boardTitlePanel.add(tasksLabel);

        navPanel.add(boardTitlePanel, BorderLayout.WEST);

        JPanel actionsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        actionsPanel.setBackground(BACKGROUND_COLOR);

        // Nút lọc
        JButton filterButton = new JButton("Lọc");
        filterButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        filterButton.setForeground(Color.WHITE);
        filterButton.setBackground(ACCENT_COLOR);
        filterButton.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(BORDER_RADIUS),
            BorderFactory.createEmptyBorder(8, 15, 8, 15)
        ));
        filterButton.setFocusPainted(false);
        filterButton.addActionListener(e -> showFilterDialog());
        actionsPanel.add(filterButton);

        // Nút tạo công việc
        JButton createTaskButton = new JButton("+ Tạo công việc");
        createTaskButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        createTaskButton.setForeground(Color.WHITE);
        createTaskButton.setBackground(ACCENT_COLOR);
        createTaskButton.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(BORDER_RADIUS),
            BorderFactory.createEmptyBorder(8, 15, 8, 15)
        ));
        createTaskButton.setFocusPainted(false);
        createTaskButton.addActionListener(e -> showAddTaskDialog());
        actionsPanel.add(createTaskButton);

        navPanel.add(actionsPanel, BorderLayout.EAST);
        headerPanel.add(navPanel, BorderLayout.CENTER);
        boardPanel.add(headerPanel, BorderLayout.NORTH);

        // Thay đổi cách hiển thị các cột để phù hợp khi thu nhỏ/phóng to
        JPanel columnsPanel = new JPanel(new GridBagLayout());
        columnsPanel.setBackground(BACKGROUND_COLOR);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(0, 10, 0, 10);

        String[] columnTitles = {STATUS_TODO, STATUS_IN_PROGRESS, STATUS_IN_REVIEW, STATUS_DONE};
        columns = new ArrayList<>();

        for (int i = 0; i < columnTitles.length; i++) {
            TaskColumn column = new TaskColumn(columnTitles[i]);
            columns.add(column);
            gbc.gridx = i;
            columnsPanel.add(column, gbc);
        }

        // Thêm vào JScrollPane để có thể cuộn ngang khi cần
        JScrollPane scrollPane = new JScrollPane(columnsPanel);
        scrollPane.setBorder(null);
        scrollPane.setBackground(BACKGROUND_COLOR);
        scrollPane.getViewport().setBackground(BACKGROUND_COLOR);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Giữ nguyên phần thiết lập thanh cuộn

        boardPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(boardPanel, BorderLayout.CENTER);
    }

    // Thêm một class để hiển thị ngày tháng đúng định dạng
    private class TwoDigitListCellRenderer extends DefaultListCellRenderer {
        private final String format;
        
        public TwoDigitListCellRenderer(String format) {
            this.format = format;
        }
        
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, 
                                                     int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof Integer) {
                value = String.format(format, (Integer)value);
            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
    }
    
    // Cập nhật phương thức showAddTaskDialog cho tiếng Việt
    private void showAddTaskDialog() {
        JDialog dialog = new JDialog((Dialog) window, "Tạo Task Mới", true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(450, 580);
        dialog.setLocationRelativeTo(this);

        // Panel chính với padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));

        // Tiêu đề
        JLabel titleLabel = new JLabel("Tiêu đề");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(10));

        // Text field cho tiêu đề với border tròn và màu nền nhẹ
        JTextField titleField = new JTextField();
        titleField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        titleField.setMaximumSize(new Dimension(Short.MAX_VALUE, 40));
        titleField.setBackground(Color.WHITE);  // Đặt màu nền trắng
        titleField.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(new Color(226, 232, 240), 8),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
        titleField.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(titleField);
        mainPanel.add(Box.createVerticalStrut(20));

        // Mô tả
        JLabel descLabel = new JLabel("Mô tả");
        descLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        descLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(descLabel);
        mainPanel.add(Box.createVerticalStrut(10));

        // Text area cho mô tả với border tròn và màu nền nhẹ
        JTextArea descArea = new JTextArea();
        descArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setBackground(Color.WHITE);  // Đặt màu nền trắng
        descArea.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(new Color(226, 232, 240), 8),
            BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));

        JScrollPane scrollPane = new JScrollPane(descArea);
        scrollPane.setMaximumSize(new Dimension(Short.MAX_VALUE, 100));
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(scrollPane);
        mainPanel.add(Box.createVerticalStrut(20));

        // Panel cho ngôn ngữ và cấp độ
        JPanel optionsPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        optionsPanel.setBackground(Color.WHITE);
        optionsPanel.setMaximumSize(new Dimension(Short.MAX_VALUE, 80));
        optionsPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Panel ngôn ngữ
        JPanel languagePanel = new JPanel();
        languagePanel.setLayout(new BoxLayout(languagePanel, BoxLayout.Y_AXIS));
        languagePanel.setBackground(Color.WHITE);
        languagePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel langLabel = new JLabel("Ngôn ngữ");
        langLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        langLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        languagePanel.add(langLabel);
        languagePanel.add(Box.createVerticalStrut(10));

        String[] languages = {"Java", "C", "SQL", "JavaScript", "HTML/CSS", "Python"};
        JComboBox<String> languageBox = new JComboBox<>(languages);
        languageBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, 
                    int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);
                ImageIcon icon = getLanguageIconForDialog((String) value);
                if (icon != null) {
                    label.setIcon(icon);
                }
                return label;
            }
        });
        styleComboBox(languageBox);
        languageBox.setMaximumSize(new Dimension(Short.MAX_VALUE, 35));
        languageBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        languagePanel.add(languageBox);

        // Panel cấp độ
        JPanel levelPanel = new JPanel();
        levelPanel.setLayout(new BoxLayout(levelPanel, BoxLayout.Y_AXIS));
        levelPanel.setBackground(Color.WHITE);
        levelPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel levelLabel = new JLabel("Mức độ");
        levelLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        levelLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        levelPanel.add(levelLabel);
        levelPanel.add(Box.createVerticalStrut(10));

        String[] levels = {"Cơ bản", "Nâng cao", "Chuyên nghiệp", "Ứng dụng"};
        JComboBox<String> levelBox = new JComboBox<>(levels);
        styleComboBox(levelBox);
        levelBox.setMaximumSize(new Dimension(Short.MAX_VALUE, 35));
        levelBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        levelPanel.add(levelBox);

        optionsPanel.add(languagePanel);
        optionsPanel.add(levelPanel);
        mainPanel.add(optionsPanel);
        mainPanel.add(Box.createVerticalStrut(20));

        // Panel deadline
        JPanel deadlinePanel = new JPanel();
        deadlinePanel.setLayout(new BoxLayout(deadlinePanel, BoxLayout.Y_AXIS));
        deadlinePanel.setBackground(Color.WHITE);
        deadlinePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        deadlinePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));  // Thêm padding bottom

        JLabel deadlineLabel = new JLabel("Deadline");
        deadlineLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        deadlineLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        deadlinePanel.add(deadlineLabel);
        deadlinePanel.add(Box.createVerticalStrut(10));

        // Panel chọn ngày
        JPanel datePanel = new JPanel();
        datePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        datePanel.setBackground(Color.WHITE);
        datePanel.setMaximumSize(new Dimension(Short.MAX_VALUE, 35));
        datePanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // ComboBox cho ngày, tháng, năm
        JComboBox<String> dayBox = new JComboBox<>(IntStream.rangeClosed(1, 31)
                .mapToObj(i -> String.format("%02d", i))
                .toArray(String[]::new));
        JComboBox<String> monthBox = new JComboBox<>(IntStream.rangeClosed(1, 12)
                .mapToObj(i -> String.format("%02d", i))
                .toArray(String[]::new));
        JComboBox<String> yearBox = new JComboBox<>(IntStream.rangeClosed(2024, 2030)
                .mapToObj(String::valueOf)
                .toArray(String[]::new));

        // Style cho các combobox ngày tháng năm
        dayBox.setRenderer(new TwoDigitListCellRenderer("%02d"));
        monthBox.setRenderer(new TwoDigitListCellRenderer("%02d"));
        styleComboBox(dayBox);
        styleComboBox(monthBox);
        styleComboBox(yearBox);

        // Set kích thước cho các combobox
        Dimension dateBoxSize = new Dimension(80, 35);
        dayBox.setPreferredSize(dateBoxSize);
        monthBox.setPreferredSize(dateBoxSize);
        yearBox.setPreferredSize(new Dimension(100, 35));

        // Thêm separator giữa các combobox
        JLabel separator1 = new JLabel(" / ");
        JLabel separator2 = new JLabel(" / ");
        separator1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        separator2.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        datePanel.add(dayBox);
        datePanel.add(separator1);
        datePanel.add(monthBox);
        datePanel.add(separator2);
        datePanel.add(yearBox);

        deadlinePanel.add(datePanel);
        mainPanel.add(deadlinePanel);

        // Panel nút
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setMaximumSize(new Dimension(Short.MAX_VALUE, 35));
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Nút Hủy
        JButton cancelButton = new JButton("Hủy");
        cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cancelButton.setPreferredSize(new Dimension(100, 35));
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setForeground(TEXT_COLOR);
        cancelButton.setBorder(new RoundedBorder(BORDER_COLOR, 8));
        cancelButton.setFocusPainted(false);
        cancelButton.setText("Hủy");  // Đảm bảo text được hiển thị

        // Hiệu ứng hover cho nút Hủy
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cancelButton.setBackground(new Color(249, 250, 251));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancelButton.setBackground(Color.WHITE);
            }
        });

        // Nút Tạo Task
        JButton createButton = new JButton("Tạo Task");
        createButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        createButton.setPreferredSize(new Dimension(100, 35));
        createButton.setBackground(ACCENT_COLOR);
        createButton.setForeground(Color.WHITE);
        createButton.setBorder(new RoundedBorder(ACCENT_COLOR, 8));
        createButton.setFocusPainted(false);
        createButton.setText("Tạo Task");  // Đảm bảo text được hiển thị

        // Hiệu ứng hover cho nút Tạo Task
        createButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                createButton.setBackground(ACCENT_COLOR.darker());
                createButton.setBorder(new RoundedBorder(ACCENT_COLOR.darker(), 8));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                createButton.setBackground(ACCENT_COLOR);
                createButton.setBorder(new RoundedBorder(ACCENT_COLOR, 8));
            }
        });

        // Thêm action cho nút Hủy
        cancelButton.addActionListener(e -> dialog.dispose());

        // Thêm action cho nút Tạo Task
        createButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            String description = descArea.getText().trim();
            String language = (String) languageBox.getSelectedItem();
            String level = (String) levelBox.getSelectedItem();
            
            if (title.isEmpty()) {
                JOptionPane.showMessageDialog(dialog,
                    "Vui lòng nhập tiêu đề task",
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo deadline từ các giá trị đã chọn
            LocalDateTime deadline = LocalDateTime.of(
                Integer.parseInt((String) yearBox.getSelectedItem()),
                Integer.parseInt((String) monthBox.getSelectedItem()),
                Integer.parseInt((String) dayBox.getSelectedItem()),
                23, 59, 59
            );

            String fullDescription = String.format("[%s] %s", language, description);

            // Lưu task vào database
            try {
                Todo todo = new Todo();
                String taskId = todoDAO.getNextTodoCode();
                todo.setMaTodo(taskId);
                todo.setTieuDe(title);
                todo.setNoiDung(fullDescription);
                todo.setNgayTao(Timestamp.valueOf(LocalDateTime.now()));
                todo.setTrangThaiTask(STATUS_TODO);
                todo.setTrangThai(false);
                todo.setMaNguoiDung(Auth.user.getMaNguoiDung());
                todo.setLevel(level);
                todo.setDeadline(Timestamp.valueOf(deadline));
                todoDAO.insert(todo);

                // Thêm task vào cột "Cần làm"
                for (TaskColumn column : columns) {
                    if (column.columnTitle.equals(STATUS_TODO)) {
                        Task newTask = new Task(title, fullDescription, level, LocalDateTime.now(), deadline);
                        newTask.setDbTaskId(taskId);
                        column.addTask(newTask);
                        break;
                    }
                }

                // Thêm thông báo
                addNotification("Task mới", "Đã tạo task: " + title);

                dialog.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(dialog,
                    "Lỗi khi lưu task: " + ex.getMessage(),
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
            }
        });

        buttonPanel.add(cancelButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(createButton);

        mainPanel.add(buttonPanel);

        dialog.add(mainPanel);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    // Class hỗ trợ tạo icon màu cho combobox cấp độ
    private class ColorIcon implements Icon {
        private final Color color;
        private final int width = 12;
        private final int height = 12;

        public ColorIcon(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(color);
            g2d.fillOval(x, y + (c.getHeight() - height) / 2, width, height);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return width;
        }

        @Override
        public int getIconHeight() {
            return height;
        }
    }

    // Phương thức lấy màu cho từng cấp độ
    private Color getLevelColor(String level) {
        switch (level) {
            case "Cơ bản": return new Color(52, 152, 219);
            case "Nâng cao": return new Color(231, 76, 60);
            case "Chuyên nghiệp": return new Color(230, 126, 34);
            case "Ứng dụng": return new Color(46, 204, 113);
            default: return Color.GRAY;
        }
    }

    private Color getColumnBackground(String title) {
        switch (title) {
            case STATUS_TODO: return new Color(255, 255, 255);
            case STATUS_IN_PROGRESS: return new Color(255, 252, 245);
            case STATUS_IN_REVIEW: return new Color(245, 250, 255);
            case STATUS_DONE: return new Color(245, 255, 248);
            default: return Color.WHITE;
        }
    }

    private Color getColumnTextColor(String title) {
        switch (title) {
            case STATUS_TODO: return new Color(55, 55, 55);
            case STATUS_IN_PROGRESS: return new Color(245, 159, 0);
            case STATUS_IN_REVIEW: return new Color(45, 144, 255);
            case STATUS_DONE: return new Color(50, 180, 120);
            default: return TEXT_COLOR;
        }
    }

    private String getColumnIcon(String title) {
        switch (title) {
            case STATUS_TODO: return "📋";
            case STATUS_IN_PROGRESS: return "⚡";
            case STATUS_IN_REVIEW: return "👀";
            case STATUS_DONE: return "✅";
            default: return "📌";
        }
    }

    public boolean canMoveTask(String currentStatus, String targetColumn) {
        switch (currentStatus) {
            case STATUS_TODO:
                return targetColumn.equals(STATUS_IN_PROGRESS);
            case STATUS_IN_PROGRESS:
                return targetColumn.equals(STATUS_IN_REVIEW) || targetColumn.equals(STATUS_TODO);
            case STATUS_IN_REVIEW:
                return targetColumn.equals(STATUS_DONE) || targetColumn.equals(STATUS_IN_PROGRESS);
            case STATUS_DONE:
                return targetColumn.equals(STATUS_IN_REVIEW);
            default:
                return false;
        }
    }
    
    // Cập nhật phương thức tạo popup thông báo cho tiếng Việt
    private void createNotificationPopup() {
        if (notificationPopup == null) {
            notificationPopup = new JWindow(window);
            notificationPopup.setSize(320, 350);
            notificationPopup.setBackground(new Color(0, 0, 0, 0));
            
            // Panel chính với border và shadow
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.setBackground(Color.WHITE);
            mainPanel.setBorder(BorderFactory.createCompoundBorder(
                new ShadowBorder(new Color(0, 0, 0, 50), 8),
                BorderFactory.createEmptyBorder(0, 0, 0, 0)
            ));
            
            // Panel header của popup
            JPanel headerPanel = new JPanel(new BorderLayout());
            headerPanel.setBackground(new Color(245, 247, 250));
            headerPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            
            JLabel notifHeaderLabel = new JLabel("Thông báo");
            notifHeaderLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
            notifHeaderLabel.setForeground(TEXT_COLOR);
            headerPanel.add(notifHeaderLabel, BorderLayout.WEST);
            
            JLabel countBadge = new JLabel("2 mới");
            countBadge.setFont(new Font("Segoe UI", Font.BOLD, 12));
            countBadge.setForeground(Color.WHITE);
            countBadge.setBackground(new Color(237, 66, 69));
            countBadge.setOpaque(true);
            countBadge.setBorder(BorderFactory.createEmptyBorder(3, 8, 3, 8));
            ((JComponent) countBadge).setBorder(new RoundedBorder(countBadge.getBackground(), 10));
            headerPanel.add(countBadge, BorderLayout.EAST);
            
            mainPanel.add(headerPanel, BorderLayout.NORTH);
            
            // Panel chứa danh sách thông báo
            JPanel notifListPanel = new JPanel();
            notifListPanel.setLayout(new BoxLayout(notifListPanel, BoxLayout.Y_AXIS));
            notifListPanel.setBackground(Color.WHITE);
            notifListPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            
            // Tạo một số thông báo mẫu
            notifListPanel.add(createNotificationItem(
                "Bài tập mới đã được thêm", 
                "Hãy xem bài tập mới về Java vừa được thêm vào khóa học", 
                "5 phút trước",
                true
            ));
            
            notifListPanel.add(createNotificationItem(
                "Deadline sắp đến", 
                "Bài tập về cấu trúc dữ liệu cần nộp trong 2 ngày tới", 
                "1 giờ trước",
                true
            ));
            
            notifListPanel.add(createNotificationItem(
                "Điểm bài tập đã cập nhật", 
                "Bài tập tuần trước của bạn đã được chấm điểm", 
                "2 ngày trước",
                false
            ));
            
            notifListPanel.add(createNotificationItem(
                "Thông báo bảo trì hệ thống", 
                "Hệ thống sẽ bảo trì vào 22h ngày 15/08/2023", 
                "5 ngày trước",
                false
            ));
            
            // Panel scroll để cuộn danh sách thông báo
            JScrollPane scrollPane = new JScrollPane(notifListPanel);
            scrollPane.setBorder(null);
            scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            
            mainPanel.add(scrollPane, BorderLayout.CENTER);
            
            // Panel footer với nút xem tất cả
            JPanel footerPanel = new JPanel(new BorderLayout());
            footerPanel.setBackground(new Color(245, 247, 250));
            footerPanel.setBorder(BorderFactory.createEmptyBorder(12, 15, 12, 15));
            
            JButton viewAllButton = new JButton("Xem tất cả thông báo");
            viewAllButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            viewAllButton.setForeground(ACCENT_COLOR);
            viewAllButton.setBackground(null);
            viewAllButton.setBorderPainted(false);
            viewAllButton.setFocusPainted(false);
            viewAllButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            viewAllButton.setContentAreaFilled(false);
            
            viewAllButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    viewAllButton.setForeground(ACCENT_COLOR.darker());
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    viewAllButton.setForeground(ACCENT_COLOR);
                }
            });
            
            footerPanel.add(viewAllButton, BorderLayout.CENTER);
            mainPanel.add(footerPanel, BorderLayout.SOUTH);
            
            // Thêm mũi tên chỉ lên trên đầu popup
            JPanel arrowPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    int[] xPoints = {getWidth()/2 - 8, getWidth()/2 + 8, getWidth()/2};
                    int[] yPoints = {8, 8, 0};
                    
                    g2d.setColor(Color.WHITE);
                    g2d.fillPolygon(xPoints, yPoints, 3);
                    
                    g2d.dispose();
                }
            };
            arrowPanel.setOpaque(false);
            arrowPanel.setPreferredSize(new Dimension(notificationPopup.getWidth(), 8));
            mainPanel.add(arrowPanel, BorderLayout.NORTH);
            
            notificationPopup.setContentPane(mainPanel);
            notificationPopup.setFocusableWindowState(false);
            
            // Đóng popup khi click ra ngoài
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowDeactivated(WindowEvent e) {
                    if (notificationPopup.isVisible()) {
                        notificationPopup.setVisible(false);
                    }
                }
            });
        }
    }

    private void loadTasksByLanguage(String language) {
        try {
            // Xóa tất cả task hiện tại
            for (TaskColumn column : columns) {
                column.clearTasks();
            }
            
            // Lấy danh sách task từ database
            List<Todo> todos = todoDAO.selectByUserIdAndLanguage(Auth.user.getMaNguoiDung(), language);
            System.out.println("Đang tải " + todos.size() + " task cho ngôn ngữ " + language);
            
            for (Todo todo : todos) {
                Task task;
                if (todo.getDeadline() != null) {
                    task = new Task(
                        todo.getTieuDe(),
                        todo.getNoiDung(),
                        todo.getLevel(),
                        todo.getNgayTao().toLocalDateTime(),
                        todo.getDeadline().toLocalDateTime()
                    );
                } else {
                    task = new Task(
                        todo.getTieuDe(),
                        todo.getNoiDung(),
                        todo.getLevel(),
                        todo.getNgayTao().toLocalDateTime()
                    );
                }
                
                // Lưu ID từ cơ sở dữ liệu vào task
                task.setDbTaskId(todo.getMaTodo());
                
                String status = todo.getTrangThaiTask();
                if (status == null || status.isEmpty()) {
                    status = todo.isTrangThai() ? STATUS_DONE : STATUS_TODO;
                }
                
                task.setStatus(status); // Đặt trạng thái cho task
                
                // Tìm cột tương ứng và thêm task vào
                boolean added = false;
                for (TaskColumn column : columns) {
                    if (column.columnTitle.equals(status)) {
                        column.addTask(task);
                        System.out.println("Đã tải task " + todo.getMaTodo() + " với trạng thái " + status);
                        added = true;
                        break;
                    }
                }
                
                if (!added) {
                    System.out.println("Không tìm thấy cột phù hợp cho task " + todo.getMaTodo() + " với trạng thái " + status);
                }
            }
            
            // Cập nhật ngôn ngữ hiện tại
            currentLanguage = language;
            
            // Cập nhật giao diện
            revalidate();
            repaint();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Lỗi khi tải task: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private ImageIcon getLanguageIconForDialog(String language) {
        String iconPath = "";
        switch (language) {
            case "Java": 
                iconPath = "/com/img/logojava.png";
                break;
            case "JavaScript": 
                iconPath = "/com/img/logojavascript.png";
                break;
            case "HTML/CSS": 
                iconPath = "/com/img/htmlcss.png";
                break;
            case "C": 
                iconPath = "/com/img/logoc.png";
                break;
            case "Python": 
                iconPath = "/com/img/python.png";
                break;
            case "SQL": 
                iconPath = "/com/img/logosql.png";
                break;
            default: 
                iconPath = "/com/img/lessons.png";
        }
        try {
            java.net.URL imageUrl = getClass().getResource(iconPath);
            if (imageUrl != null) {
                ImageIcon icon = new ImageIcon(imageUrl);
                Image img = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
                return new ImageIcon(img);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String extractLanguageFromDescription(String description) {
        if (description != null) {
            String[] lines = description.split("\n");
            for (String line : lines) {
                if (line.trim().startsWith("Ngôn ngữ:")) {
                    try {
                        return line.substring(line.indexOf(":") + 1).trim();
                    } catch (Exception e) {
                        return "";
                    }
                }
            }
        }
        return "";
    }

    // Phương thức để định dạng nội dung hiển thị cho task
    private String formatDescriptionForDisplay(String desc) {
        if (desc == null || desc.isEmpty()) {
            return "";
        }
        
        String[] parts = desc.split("\n");
        StringBuilder formatted = new StringBuilder();
        
        for (String part : parts) {
            String trimmed = part.trim();
            // Loại bỏ dòng ngôn ngữ và mức độ khỏi mô tả hiển thị
            if (!trimmed.startsWith("Ngôn ngữ:") && !trimmed.startsWith("Mức độ:")) {
                if (formatted.length() > 0) {
                    formatted.append("\n");
                }
                formatted.append(trimmed);
            }
        }
        
        // Giới hạn độ dài nội dung để không quá lớn
        String result = formatted.toString();
        if (result.length() > 200) {
            result = result.substring(0, 197) + "...";
        }
        
        return result;
    }
    
    private String formatDescription(String desc) {
        String[] parts = desc.split("\n");
        StringBuilder formatted = new StringBuilder();
        
        for (String part : parts) {
            String trimmed = part.trim();
            // Loại bỏ dòng ngôn ngữ và mức độ khỏi mô tả hiển thị
            if (!trimmed.startsWith("Ngôn ngữ:") && !trimmed.startsWith("Mức độ:")) {
                if (formatted.length() > 0) {
                    formatted.append("<br>");
                }
                formatted.append(trimmed);
            }
        }
        
        return formatted.toString();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            TodoListApp app = new TodoListApp();
            app.setVisible(true);
        });
    }

    // Thêm class RelativeLayout 
    private class RelativeLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {}

        @Override
        public void removeLayoutComponent(Component comp) {}

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return new Dimension(100, 100);
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return new Dimension(100, 100);
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                int count = parent.getComponentCount();
                if (count > 0) {
                    Component mainComponent = parent.getComponent(0);
                    mainComponent.setBounds(0, 0, parent.getWidth(), parent.getHeight());
                    
                    if (count > 1) {
                        Component badge = parent.getComponent(1);
                        int badgeSize = 16;
                        badge.setBounds(
                            parent.getWidth() - badgeSize,
                            0,
                            badgeSize,
                            badgeSize
                        );
                    }
                }
            }
        }
    }

    // Thêm class ModernScrollBarUI
    private class ModernScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(200, 200, 200, 100);
            this.trackColor = new Color(0, 0, 0, 0);
        }
        
        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }
        
        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }
        
        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            if(thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
                return;
            }
            
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                              RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(new GradientPaint(
                thumbBounds.x, thumbBounds.y,
                new Color(180, 180, 180, 100),
                thumbBounds.x + thumbBounds.width, thumbBounds.y,
                new Color(180, 180, 180, 160)
            ));
            g2.fillRoundRect(thumbBounds.x, thumbBounds.y,
                           thumbBounds.width, thumbBounds.height,
                           8, 8);
            g2.dispose();
        }
        
        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            return button;
        }
    }

    // Thêm class Task với đầy đủ phương thức
    public class Task extends JPanel {
        private String id;
        private String dbTaskId; // ID trong cơ sở dữ liệu
        private String title;
        private String description;
        private String status;
        private String level;
        private LocalDateTime dueDate;
        private LocalDateTime deadline;
        private TaskColumn parentColumn;
        private Point dragStart;
        private Point originalLocation;
        private boolean isDragging = false;
        private JLayeredPane layeredPane;
        private Point offset;
        private Timer dragTimer;
        
        public Task(String title, String description, String level, LocalDateTime dueDate) {
            this.id = "TASK-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            this.title = title;
            this.description = description;
            this.status = STATUS_TODO; // Sử dụng trạng thái tiếng Việt
            this.level = level;
            this.dueDate = dueDate;
            this.deadline = dueDate.plusDays(7); // Mặc định là 7 ngày sau ngày tạo
            
            setupDragTimer();
            setupTaskPanel();
            setupDragAndDrop();
        }
        
        public Task(String title, String description, String level, LocalDateTime dueDate, LocalDateTime deadline) {
            this.id = "TASK-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            this.title = title;
            this.description = description;
            this.status = STATUS_TODO; // Sử dụng trạng thái tiếng Việt
            this.level = level;
            this.dueDate = dueDate;
            this.deadline = deadline;
            
            setupDragTimer();
            setupTaskPanel();
            setupDragAndDrop();
        }
        
        private void setupDragTimer() {
            dragTimer = new Timer(16, e -> {
                if (isDragging) {
                    setOpaque(false);
                    setBorder(BorderFactory.createCompoundBorder(
                        new ShadowBorder(HOVER_SHADOW_COLOR, SHADOW_SIZE + 4),
                        BorderFactory.createEmptyBorder(15, 15, 15, 15)
                    ));
                } else {
                    setOpaque(true);
                    setBorder(BorderFactory.createCompoundBorder(
                        new ShadowBorder(SHADOW_COLOR, SHADOW_SIZE),
                        BorderFactory.createEmptyBorder(15, 15, 15, 15)
                    ));
                    ((Timer)e.getSource()).stop();
                }
                revalidate();
                repaint();
            });
        }

        private void setupTaskPanel() {
            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(250, 160));
            
            // Thêm hiệu ứng shadow khi hover
            setBorder(new ShadowBorder(SHADOW_COLOR, 3));
            setBackground(Color.WHITE);
            
            // Thêm hiệu ứng hover
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    setBorder(new ShadowBorder(HOVER_SHADOW_COLOR, 5));
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    setBorder(new ShadowBorder(SHADOW_COLOR, 3));
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            });

            // Header panel với style mới
            JPanel headerPanel = new JPanel(new BorderLayout());
            headerPanel.setBackground(new Color(245, 247, 250));
            headerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(235, 238, 245)));
            headerPanel.setPreferredSize(new Dimension(250, 40));
            
            // Level tag và menu trong header
            JPanel headerContent = new JPanel(new BorderLayout(10, 0));
            headerContent.setOpaque(false);
            headerContent.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            
            // Thêm tag level
            headerContent.add(createLevelTag(level), BorderLayout.WEST);
            // Thêm menu button
            headerContent.add(createMenuButton(), BorderLayout.EAST);
            
            headerPanel.add(headerContent, BorderLayout.CENTER);
            add(headerPanel, BorderLayout.NORTH);

            // Content panel với thiết kế mới
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
            contentPanel.setOpaque(false);
            contentPanel.setBackground(new Color(255, 255, 255));
            contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 15, 0));

            // Panel tiêu đề với màu nền riêng và hiệu ứng gradient
            JPanel titlePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    // Tạo gradient nhẹ
                    GradientPaint gp = new GradientPaint(
                        0, 0, new Color(243, 244, 248),
                        0, getHeight(), new Color(246, 248, 252)
                    );
                    g2d.setPaint(gp);
                    g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
                    g2d.dispose();
                }
            };
            titlePanel.setLayout(new BorderLayout());
            titlePanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(230, 234, 240), 1, true),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
            ));
            titlePanel.setAlignmentX(LEFT_ALIGNMENT);
            
            // Hiển thị tiêu đề đậm và rõ ràng
            JLabel titleLabel = new JLabel(title);
            titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
            titleLabel.setForeground(new Color(35, 35, 35));
            titlePanel.add(titleLabel, BorderLayout.CENTER);
            
            contentPanel.add(titlePanel);
            contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));

            // Panel nội dung với màu nền khác
            if (description != null && !description.isEmpty()) {
                String formattedDesc = TodoListApp.this.formatDescriptionForDisplay(description);
                if (!formattedDesc.isEmpty()) {
                    JPanel descPanel = new JPanel();
                    descPanel.setLayout(new BorderLayout());
                    descPanel.setBackground(new Color(250, 250, 252)); // Màu nền nhẹ cho nội dung
                    descPanel.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(232, 236, 242), 1, true),
                        BorderFactory.createEmptyBorder(8, 10, 8, 10)
                    ));
                    descPanel.setAlignmentX(LEFT_ALIGNMENT);
                    
                    // Sử dụng JTextArea để hiển thị nội dung nhiều dòng tốt hơn
                    JTextArea descTextArea = new JTextArea(formattedDesc);
                    descTextArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                    descTextArea.setForeground(new Color(75, 85, 99));
                    descTextArea.setLineWrap(true);
                    descTextArea.setWrapStyleWord(true);
                    descTextArea.setEditable(false);
                    descTextArea.setBackground(descPanel.getBackground());
                    descTextArea.setBorder(null);
                    
                    // Tính toán số dòng hợp lý
                    int lines = Math.min(formattedDesc.split("\n").length + (formattedDesc.length() / 25), 5);
                    descTextArea.setRows(lines);
                    
                    descPanel.add(descTextArea, BorderLayout.CENTER);
                    contentPanel.add(descPanel);
                }
            }

            add(contentPanel, BorderLayout.CENTER);

            // Footer panel với thông tin deadline
            JPanel footerPanel = new JPanel(new BorderLayout());
            footerPanel.setBackground(new Color(248, 249, 251));
            footerPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(235, 238, 245)),
                BorderFactory.createEmptyBorder(8, 12, 8, 12)
            ));
            
            // Hiển thị deadline với định dạng và màu sắc tốt hơn
            JPanel deadlineInfo = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
            deadlineInfo.setOpaque(false);
            
            // Icon đồng hồ
            JLabel clockIcon = new JLabel("⏰");
            clockIcon.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            deadlineInfo.add(clockIcon);
            
            // Định dạng và hiển thị deadline
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String deadlineText = deadline.format(formatter);
            
            // Tính toán số ngày còn lại
            long daysLeft = ChronoUnit.DAYS.between(LocalDateTime.now(), deadline);
            
            // Màu sắc dựa vào thời gian còn lại
            Color deadlineColor;
            if (daysLeft < 0) {
                deadlineColor = new Color(220, 53, 69); // Đỏ - quá hạn
                deadlineText = "Quá hạn: " + deadlineText;
            } else if (daysLeft <= 2) {
                deadlineColor = new Color(255, 128, 0); // Cam - gần hết hạn
                deadlineText = "Sắp hết hạn: " + deadlineText;
            } else if (daysLeft <= 7) {
                deadlineColor = new Color(255, 193, 7); // Vàng - cần chú ý
                deadlineText = "Còn " + daysLeft + " ngày: " + deadlineText;
            } else {
                deadlineColor = new Color(25, 135, 84); // Xanh lá - còn nhiều thời gian
                deadlineText = "Hạn chót: " + deadlineText;
            }
            
            JLabel deadlineLabel = new JLabel(deadlineText);
            deadlineLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            deadlineLabel.setForeground(deadlineColor);
            deadlineInfo.add(deadlineLabel);
            
            footerPanel.add(deadlineInfo, BorderLayout.WEST);
            
            // Hiển thị ngôn ngữ lập trình ở góc phải
            String language = extractLanguageFromDescription();
            if (!language.isEmpty()) {
                JLabel langLabel = new JLabel(language);
                langLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
                langLabel.setForeground(new Color(80, 90, 120));
                
                // Thêm icon cho ngôn ngữ lập trình
                ImageIcon langIcon = getLanguageIconForDialog(language);
                if (langIcon != null) {
                    langLabel.setIcon(langIcon);
                    langLabel.setIconTextGap(6);
                }
                
                footerPanel.add(langLabel, BorderLayout.EAST);
            }
            
            add(footerPanel, BorderLayout.SOUTH);
        }

        private void setupDragAndDrop() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (SwingUtilities.isLeftMouseButton(e)) {
                        originalLocation = getLocation();
                        
                        offset = e.getPoint();
                        
                        Container parent = getParent();
                        while (parent != null && !(parent instanceof JLayeredPane)) {
                            parent = parent.getParent();
                        }
                        layeredPane = (JLayeredPane) parent;
                        
                        if (layeredPane != null) {
                            Rectangle bounds = getBounds();
                            Point location = SwingUtilities.convertPoint(Task.this.getParent(), bounds.getLocation(), layeredPane);
                            
                            setBounds(new Rectangle(location, bounds.getSize()));
                            
                            layeredPane.add(Task.this, JLayeredPane.DRAG_LAYER);
                            layeredPane.moveToFront(Task.this);
                            
                            isDragging = true;
                            if (!dragTimer.isRunning()) {
                                dragTimer.start();
                            }
                            
                            layeredPane.revalidate();
                            layeredPane.repaint();
                        }
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (isDragging) {
                        isDragging = false;
                        if (layeredPane != null) {
                            layeredPane.remove(Task.this);
                            
                            Point dropPoint = e.getLocationOnScreen();
                            TaskColumn targetColumn = null;
                            
                            // Tìm cột đích
                            for (TaskColumn column : columns) {
                                Point columnPoint = new Point(dropPoint);
                                SwingUtilities.convertPointFromScreen(columnPoint, column);
                                
                                if (column.contains(columnPoint)) {
                                    targetColumn = column;
                                    break;
                                }
                            }
                            
                            // Xử lý di chuyển task
                            if (targetColumn != null) {
                                // Nếu thả vào cùng cột cũ, chỉ thêm trở lại mà không tạo mới
                                if (targetColumn == parentColumn) {
                                    // Kiểm tra xem task đã nằm trong cột chưa
                                    boolean taskExists = false;
                                    for (Component comp : parentColumn.tasksPanel.getComponents()) {
                                        if (comp == Task.this) {
                                            taskExists = true;
                                            break;
                                        }
                                    }
                                    
                                    // Chỉ thêm nếu task chưa tồn tại trong cột
                                    if (!taskExists) {
                                        parentColumn.addTask(Task.this);
                                    } else {
                                        // Đã tồn tại, không làm gì cả
                                        parentColumn.tasksPanel.revalidate();
                                        parentColumn.tasksPanel.repaint();
                                    }
                                }
                                // Nếu thả vào cột khác và hợp lệ
                                else if (targetColumn.canMoveTask(status, targetColumn.columnTitle)) {
                                    // Đảm bảo task bị xóa khỏi cột nguồn trước
                                    if (parentColumn != null) {
                                        parentColumn.removeTask(Task.this);
                                    }
                                    // Thêm vào cột mới
                                    targetColumn.addTask(Task.this);
                                    status = targetColumn.columnTitle;
                                } else {
                                    // Nếu không thể di chuyển, trả task về cột cũ
                                    if (parentColumn != null) {
                                        // Kiểm tra xem task đã nằm trong cột chưa
                                        boolean taskExists = false;
                                        for (Component comp : parentColumn.tasksPanel.getComponents()) {
                                            if (comp == Task.this) {
                                                taskExists = true;
                                                break;
                                            }
                                        }
                                        
                                        // Chỉ thêm nếu task chưa tồn tại trong cột
                                        if (!taskExists) {
                                            parentColumn.addTask(Task.this);
                                        } else {
                                            parentColumn.tasksPanel.revalidate();
                                            parentColumn.tasksPanel.repaint();
                                        }
                                    }
                                }
                            } else {
                                // Nếu thả ra ngoài cột, trả task về cột cũ
                                if (parentColumn != null) {
                                    // Kiểm tra xem task đã nằm trong cột chưa
                                    boolean taskExists = false;
                                    for (Component comp : parentColumn.tasksPanel.getComponents()) {
                                        if (comp == Task.this) {
                                            taskExists = true;
                                            break;
                                        }
                                    }
                                    
                                    // Chỉ thêm nếu task chưa tồn tại trong cột
                                    if (!taskExists) {
                                        parentColumn.addTask(Task.this);
                                    } else {
                                        parentColumn.tasksPanel.revalidate();
                                        parentColumn.tasksPanel.repaint();
                                    }
                                }
                            }
                            
                            if (!dragTimer.isRunning()) {
                                dragTimer.start();
                            }
                            
                            layeredPane.revalidate();
                            layeredPane.repaint();
                            
                            layeredPane = null;
                            offset = null;
                            originalLocation = null;
                        }
                    }
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if (isDragging && layeredPane != null) {
                        Point mousePoint = SwingUtilities.convertPoint(Task.this, e.getPoint(), layeredPane);
                        setLocation(mousePoint.x - offset.x, mousePoint.y - offset.y);
                        
                        layeredPane.repaint();
                    }
                }
            });
        }

        private Color getStatusColor(String status) {
            switch (status) {
                case STATUS_TODO: return new Color(130, 130, 130);
                case STATUS_IN_PROGRESS: return new Color(255, 170, 50);
                case STATUS_IN_REVIEW: return new Color(100, 150, 255);
                case STATUS_DONE: return new Color(50, 180, 50);
                default: return new Color(130, 130, 130);
            }
        }

        private int getPreferredHeight() {
            // Tính toán chiều cao dựa trên nội dung
            int height = 160; // Chiều cao cơ bản
            
            if (description != null && !description.isEmpty()) {
                String formattedDesc = TodoListApp.this.formatDescription(description);
                int descriptionLength = formattedDesc.length();
                
                // Tính chiều cao dựa trên số ký tự và số dòng
                int lineCount = 1 + descriptionLength / 30; // ước tính ~30 ký tự/dòng
                int descriptionHeight = Math.min(lineCount * 20, 150); // giới hạn chiều cao tối đa
                
                height += descriptionHeight;
            }
            
            return Math.min(height, 350); // Giới hạn chiều cao tối đa
        }

        private JPanel createLevelTag(String level) {
            JPanel tagPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 2));
            tagPanel.setOpaque(true);
            tagPanel.setBorder(new RoundedBorder(8));
            
            Color bgColor;
            Color textColor;
            
            switch (level.toLowerCase()) {
                case "cơ bản":
                    bgColor = new Color(235, 245, 255);
                    textColor = new Color(50, 145, 255);
                    break;
                case "nâng cao":
                    bgColor = new Color(255, 240, 245);
                    textColor = new Color(255, 85, 130);
                    break;
                case "chuyên nghiệp":
                    bgColor = new Color(255, 245, 235);
                    textColor = new Color(255, 145, 35);
                    break;
                case "ứng dụng":
                    bgColor = new Color(235, 255, 240);
                    textColor = new Color(45, 195, 95);
                    break;
                default:
                    bgColor = new Color(245, 245, 245);
                    textColor = new Color(130, 130, 130);
            }
            
            tagPanel.setBackground(bgColor);
            
            JLabel levelLabel = new JLabel(level);
            levelLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
            levelLabel.setForeground(textColor);
            tagPanel.add(levelLabel);
            
            return tagPanel;
        }

        private String extractLanguageFromDescription() {
            return TodoListApp.this.extractLanguageFromDescription(this.description);
        }

        private JButton createMenuButton() {
            JButton menuButton = new JButton("⋮");
            menuButton.setContentAreaFilled(false);
            menuButton.setBorderPainted(false);
            menuButton.setFocusPainted(false);
            menuButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
            menuButton.setForeground(new Color(140, 140, 140));
            menuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            // Thêm hiệu ứng hover
            menuButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    menuButton.setForeground(ACCENT_COLOR);
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    menuButton.setForeground(new Color(140, 140, 140));
                }
            });
            
            // Thêm menu popup
            JPopupMenu popupMenu = new JPopupMenu();
            popupMenu.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230)));

            JMenuItem editItem = createMenuItem("Chỉnh sửa", new Color(50, 50, 50));
            editItem.addActionListener(e -> showEditTaskDialog());

            JMenuItem deleteItem = createMenuItem("Xóa", new Color(255, 80, 80));
            deleteItem.addActionListener(e -> confirmAndDelete());

            popupMenu.add(editItem);
            popupMenu.addSeparator();
            popupMenu.add(deleteItem);

            menuButton.addActionListener(e -> popupMenu.show(menuButton, 0, menuButton.getHeight()));
            
            return menuButton;
        }
        
        private void confirmAndDelete() {
            int confirm = JOptionPane.showConfirmDialog(
                TodoListApp.this,
                "Bạn có chắc chắn muốn xóa task này không?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );
            
            if (confirm == JOptionPane.YES_OPTION && parentColumn != null) {
                parentColumn.removeTask(Task.this);
            }
        }
        
        private JMenuItem createMenuItem(String text, Color textColor) {
            JMenuItem item = new JMenuItem(text);
            item.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            item.setForeground(textColor);
            item.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
            return item;
        }

        private void showEditTaskDialog() {
            JDialog dialog = new JDialog((Dialog) window, "Chỉnh sửa Task", true);
            dialog.setSize(500, 600);
            dialog.setLocationRelativeTo(TodoListApp.this);
            dialog.setLayout(new BorderLayout(20, 20));
            
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout(10, 10));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            
            // Panel cho các trường nhập liệu
            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(0, 1, 10, 10));
            
            // Tiêu đề
            JLabel titleLabel = new JLabel("Tiêu đề:");
            JTextField taskTitleField = new JTextField(title);
            
            // Mô tả
            JLabel descriptionLabel = new JLabel("Mô tả:");
            JTextArea descriptionArea = new JTextArea(description);
            descriptionArea.setLineWrap(true);
            descriptionArea.setWrapStyleWord(true);
            JScrollPane descriptionScrollPane = new JScrollPane(descriptionArea);
            descriptionScrollPane.setPreferredSize(new Dimension(0, 100));
            
            // Ngôn ngữ
            JLabel languageLabel = new JLabel("Ngôn ngữ:");
            String[] languages = {"Java", "Python", "JavaScript", "C++", "C#", "PHP"};
            JComboBox<String> languageComboBox = new JComboBox<>(languages);
            
            // Cấp độ
            JLabel levelLabel = new JLabel("Cấp độ:");
            String[] levels = {"Cơ bản", "Trung bình", "Nâng cao"};
            JComboBox<String> levelComboBox = new JComboBox<>(levels);
            levelComboBox.setSelectedItem(level);
            
            // Deadline
            JLabel deadlineLabel = new JLabel("Deadline:");
            JPanel deadlinePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            
            // Tạo các combo box cho ngày, tháng, năm
            LocalDateTime currentDeadline = deadline != null ? deadline : LocalDateTime.now().plusDays(7);
            
            Integer[] days = new Integer[31];
            for (int i = 0; i < 31; i++) days[i] = i + 1;
            JComboBox<Integer> dayComboBox = new JComboBox<>(days);
            dayComboBox.setSelectedItem(currentDeadline.getDayOfMonth());
            
            Integer[] months = new Integer[12];
            for (int i = 0; i < 12; i++) months[i] = i + 1;
            JComboBox<Integer> monthComboBox = new JComboBox<>(months);
            monthComboBox.setSelectedItem(currentDeadline.getMonthValue());
            
            Integer[] years = new Integer[10];
            int currentYear = LocalDateTime.now().getYear();
            for (int i = 0; i < 10; i++) years[i] = currentYear + i;
            JComboBox<Integer> yearComboBox = new JComboBox<>(years);
            yearComboBox.setSelectedItem(currentDeadline.getYear());
            
            deadlinePanel.add(dayComboBox);
            deadlinePanel.add(new JLabel("/"));
            deadlinePanel.add(monthComboBox);
            deadlinePanel.add(new JLabel("/"));
            deadlinePanel.add(yearComboBox);
            
            // Thêm các components vào panel
            inputPanel.add(titleLabel);
            inputPanel.add(taskTitleField);
            inputPanel.add(descriptionLabel);
            inputPanel.add(descriptionScrollPane);
            inputPanel.add(languageLabel);
            inputPanel.add(languageComboBox);
            inputPanel.add(levelLabel);
            inputPanel.add(levelComboBox);
            inputPanel.add(deadlineLabel);
            inputPanel.add(deadlinePanel);
            
            mainPanel.add(inputPanel, BorderLayout.CENTER);
            
            // Panel cho các nút
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            
            JButton cancelButton = new JButton("Hủy");
            JButton saveButton = new JButton("Lưu");
            
            cancelButton.addActionListener(e -> dialog.dispose());
            
            saveButton.addActionListener(e -> {
                // Kiểm tra dữ liệu nhập
                if (taskTitleField.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(dialog,
                        "Vui lòng nhập tiêu đề cho task!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Thu thập dữ liệu
                String taskTitle = taskTitleField.getText().trim();
                String description = descriptionArea.getText().trim();
                String language = (String) languageComboBox.getSelectedItem();
                String level = (String) levelComboBox.getSelectedItem();
                
                // Thêm thông tin ngôn ngữ và cấp độ vào mô tả
                if (!description.isEmpty()) {
                    description += "\n";
                }
                description += "Ngôn ngữ: " + language + "\n";
                description += "Mức độ: " + level;
                
                // Lấy deadline từ các combo box
                int day = (Integer) dayComboBox.getSelectedItem();
                int month = (Integer) monthComboBox.getSelectedItem();
                int year = (Integer) yearComboBox.getSelectedItem();
                
                // Tạo LocalDateTime cho deadline
                LocalDateTime newDeadline = LocalDateTime.of(year, month, day, 23, 59, 59);
                
                // Cập nhật thông tin task
                setTitle(taskTitle);
                setDescription(description);
                setLevel(level);
                setDeadline(newDeadline);
                
                // Cập nhật giao diện
                setupTaskPanel();
                
                // Cập nhật trong cơ sở dữ liệu
                TodoListApp.this.updateTaskInDatabase(Task.this);
                
                // Đóng dialog
                dialog.dispose();
                
                // Cập nhật hiển thị
                if (parentColumn != null) {
                    parentColumn.revalidate();
                    parentColumn.repaint();
                }
            });
            
            buttonPanel.add(cancelButton);
            buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            buttonPanel.add(saveButton);
            
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);
            
            dialog.add(mainPanel);
            dialog.setVisible(true);
        }

        public String getId() { return id; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        public TaskColumn getParentColumn() { return parentColumn; }
        public void setParentColumn(TaskColumn column) { this.parentColumn = column; }
        public String getDbTaskId() { return dbTaskId; }
        public void setDbTaskId(String dbTaskId) { this.dbTaskId = dbTaskId; }
        
        public LocalDateTime getDeadline() {
            return deadline;
        }
        
        public void setDeadline(LocalDateTime deadline) {
            this.deadline = deadline;
        }
        
        public String getTitle() {
            return title;
        }
        
        public String getDescription() {
            return description;
        }
        
        public String getLevel() {
            return level;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public void setDescription(String description) {
            this.description = description;
        }
        
        public void setLevel(String level) {
            this.level = level;
        }
    }

    // Thêm class ShadowBorder
    private class ShadowBorder extends AbstractBorder {
        private final Color shadowColor;
        private final int shadowSize;

        public ShadowBorder(Color shadowColor, int shadowSize) {
            this.shadowColor = shadowColor;
            this.shadowSize = shadowSize;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            for (int i = 0; i < shadowSize; i++) {
                float alpha = (float) (shadowSize - i) / shadowSize * 0.5f;
                g2.setColor(new Color(
                    shadowColor.getRed(),
                    shadowColor.getGreen(),
                    shadowColor.getBlue(),
                    (int) (shadowColor.getAlpha() * alpha)
                ));
                g2.drawRoundRect(
                    x + i, 
                    y + i, 
                    width - (i * 2) - 1, 
                    height - (i * 2) - 1, 
                    COLUMN_RADIUS, 
                    COLUMN_RADIUS
                );
            }
            g2.dispose();
        }
        
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(shadowSize, shadowSize, shadowSize, shadowSize);
        }
    }

    // Thêm class CircleBorder
    private class CircleBorder implements Border {
        private Color color;
        private int thickness;

        public CircleBorder(Color color, int thickness) {
            this.color = color;
            this.thickness = thickness;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(color);
            g2.setStroke(new BasicStroke(thickness));
            g2.drawOval(x + thickness/2, y + thickness/2, 
                       width - thickness, height - thickness);
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(thickness, thickness, thickness, thickness);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }

    // Thêm class RoundedBorder
    private class RoundedBorder extends AbstractBorder {
        private int radius;
        private Color color;
        
        public RoundedBorder(int radius) {
            this.radius = radius;
            this.color = null;
        }
        
        public RoundedBorder(Color color, int radius) {
            this.radius = radius;
            this.color = color;
        }
        
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            if (color != null) {
                g2d.setColor(color);
                g2d.fillRoundRect(x, y, width, height, radius, radius);
            } else {
                g2d.setColor(c.getBackground().darker());
                g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            }
            
            g2d.dispose();
        }
        
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius/2, radius/2, radius/2, radius/2);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return color != null;
        }
    }

    // Thêm class TaskColumn
    private class TaskColumn extends JPanel {
        private JPanel tasksPanel;
        private String columnTitle;
        private Timer expandTimer;
        private float expandProgress = 0f;
        private int targetHeight;
        private boolean isExpanding = false;
        private JLayeredPane layeredPane;
        private Point offset;
        
        public TaskColumn(String title) {
            this.columnTitle = title;
            setLayout(new BorderLayout(0, 15));
            setBackground(getColumnBackground(title));
            setBorder(BorderFactory.createCompoundBorder(
                new ShadowBorder(SHADOW_COLOR, SHADOW_SIZE),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
            ));
            
            // Điều chỉnh kích thước cột
            setPreferredSize(new Dimension(380, 100));
            setMinimumSize(new Dimension(350, 100));
            setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

            // Header với gradient và icon
            JPanel headerPanel = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    GradientPaint gp = new GradientPaint(
                        0, 0, 
                        new Color(255, 255, 255, 240),
                        0, getHeight(),
                        new Color(255, 255, 255, 180)
                    );
                    g2.setPaint(gp);
                    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 12, 12);
                    g2.dispose();
                }
            };
            headerPanel.setOpaque(false);
            headerPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

            JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
            titlePanel.setOpaque(false);

            // Icon lớn hơn và màu sắc tươi sáng hơn
            JLabel iconLabel = new JLabel(getColumnIcon(title));
            iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
            titlePanel.add(iconLabel);

            JLabel titleLabel = new JLabel(title);
            titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
            titleLabel.setForeground(getColumnTextColor(title));
            titlePanel.add(titleLabel);

            headerPanel.add(titlePanel, BorderLayout.CENTER);
            add(headerPanel, BorderLayout.NORTH);

            // Panel chứa các task với spacing tốt hơn
            tasksPanel = new JPanel();
            tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));
            tasksPanel.setBackground(getColumnBackground(title));
            tasksPanel.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));

            // Scroll pane với thanh cuộn tùy chỉnh
            JScrollPane scrollPane = new JScrollPane(tasksPanel);
            scrollPane.setBorder(null);
            scrollPane.setBackground(getColumnBackground(title));
            scrollPane.getViewport().setBackground(getColumnBackground(title));
            
            // Tùy chỉnh thanh cuộn
            scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
            scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(8, Integer.MAX_VALUE));
            
            add(scrollPane, BorderLayout.CENTER);
            setupDropTarget();
        }

        private Color getColumnBackground(String title) {
            switch (title) {
                case STATUS_TODO: return new Color(255, 255, 255);
                case STATUS_IN_PROGRESS: return new Color(255, 252, 245);
                case STATUS_IN_REVIEW: return new Color(245, 250, 255);
                case STATUS_DONE: return new Color(245, 255, 248);
                default: return Color.WHITE;
            }
        }

        private Color getColumnTextColor(String title) {
            switch (title) {
                case STATUS_TODO: return new Color(55, 55, 55);
                case STATUS_IN_PROGRESS: return new Color(245, 159, 0);
                case STATUS_IN_REVIEW: return new Color(45, 144, 255);
                case STATUS_DONE: return new Color(50, 180, 120);
                default: return TEXT_COLOR;
            }
        }

        private String getColumnIcon(String title) {
            switch (title) {
                case STATUS_TODO: return "📋";
                case STATUS_IN_PROGRESS: return "⚡";
                case STATUS_IN_REVIEW: return "👀";
                case STATUS_DONE: return "✅";
                default: return "📌";
            }
        }

        private void setupDropTarget() {
            setTransferHandler(new TransferHandler() {
                @Override
                public boolean canImport(TransferSupport support) {
                    return support.isDataFlavorSupported(DataFlavor.stringFlavor);
                }

                @Override
                public boolean importData(TransferSupport support) {
                    try {
                        String taskId = (String)support.getTransferable()
                            .getTransferData(DataFlavor.stringFlavor);
                        
                        Task task = null;
                        TaskColumn sourceColumn = null;
                        
                        // Tìm task và cột nguồn
                        for (TaskColumn column : columns) {
                            task = column.findTaskById(taskId);
                            if (task != null) {
                                sourceColumn = column;
                                break;
                            }
                        }
                        
                        // Nếu không tìm thấy task
                        if (task == null) {
                            System.out.println("Không tìm thấy task với ID: " + taskId);
                            return false;
                        }
                        
                        // Nếu thả vào cùng cột, không làm gì cả
                        if (sourceColumn == TaskColumn.this) {
                            return false;
                        }
                        
                        // Kiểm tra điều kiện di chuyển
                        if (canMoveTask(task.getStatus(), columnTitle)) {
                            // Xóa task khỏi cột nguồn
                            sourceColumn.removeTask(task);
                            
                            // Cập nhật trạng thái và thêm vào cột đích
                            task.setStatus(columnTitle);
                            addTask(task);
                            
                            // Sử dụng TaskStateManager để cập nhật trạng thái
                            if (taskStateManager.updateTaskState(task, columnTitle)) {
                                System.out.println("Đã di chuyển task " + taskId + " sang " + columnTitle);
                            } else {
                                System.out.println("Không thể cập nhật trạng thái trong database");
                            }
                            
                            // Cập nhật UI
                            revalidate();
                            repaint();
                            
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(TodoListApp.this,
                                "Không thể di chuyển task này đến cột " + columnTitle,
                                "Di chuyển không hợp lệ",
                                JOptionPane.WARNING_MESSAGE);
                            return false;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(TodoListApp.this,
                            "Lỗi khi di chuyển task: " + e.getMessage(),
                            "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }
                
                @Override
                public int getSourceActions(JComponent c) {
                    return COPY_OR_MOVE;
                }
            });
        }

        public void addTask(Task task) {
            task.setParentColumn(this);
            task.setStatus(columnTitle);
            tasksPanel.add(task);
            tasksPanel.add(Box.createRigidArea(new Dimension(0, 15)));
            
            SwingUtilities.invokeLater(() -> {
                int totalHeight = calculateTotalHeight();
                animateColumnHeight(totalHeight);
            });
        }

        private int calculateTotalHeight() {
            int totalHeight = 0;
            for (Component c : tasksPanel.getComponents()) {
                totalHeight += c.getPreferredSize().height;
            }
            return Math.min(totalHeight + 100, 600);
        }

        private void animateColumnHeight(int targetHeight) {
            if (expandTimer != null && expandTimer.isRunning()) {
                expandTimer.stop();
            }

            final int startHeight = getHeight();
            final int heightDiff = targetHeight - startHeight;
            final int animationDuration = 300;
            final int steps = 30;
            final int delay = animationDuration / steps;

            expandTimer = new Timer(delay, null);
            final int[] step = {0};

            expandTimer.addActionListener(e -> {
                step[0]++;
                if (step[0] <= steps) {
                    float progress = (float) step[0] / steps;
                    float easedProgress = (float) (1 - Math.pow(1 - progress, 3));
                    int newHeight = startHeight + (int) (heightDiff * easedProgress);
                    
                    setPreferredSize(new Dimension(380, newHeight));
                    setMinimumSize(new Dimension(350, newHeight));
                    revalidate();
                    repaint();
                } else {
                    ((Timer) e.getSource()).stop();
                }
            });

            expandTimer.start();
        }

        public void removeTask(Task task) {
            tasksPanel.remove(task);
            if (tasksPanel.getComponentCount() > 0) {
                tasksPanel.remove(tasksPanel.getComponentCount() - 1);
            }
            
            SwingUtilities.invokeLater(() -> {
                int totalHeight = calculateTotalHeight();
                if (tasksPanel.getComponentCount() == 0) {
                    totalHeight = 100;
                }
                animateColumnHeight(totalHeight);
            });
        }

        private Task findTaskById(String id) {
            for (Component c : tasksPanel.getComponents()) {
                if (c instanceof Task && ((Task)c).getId().equals(id)) {
                    return (Task)c;
                }
            }
            return null;
        }

        public boolean canMoveTask(String currentStatus, String targetColumn) {
            switch (currentStatus) {
                case STATUS_TODO:
                    return targetColumn.equals(STATUS_IN_PROGRESS);
                case STATUS_IN_PROGRESS:
                    return targetColumn.equals(STATUS_IN_REVIEW) || targetColumn.equals(STATUS_TODO);
                case STATUS_IN_REVIEW:
                    return targetColumn.equals(STATUS_DONE) || targetColumn.equals(STATUS_IN_PROGRESS);
                case STATUS_DONE:
                    return targetColumn.equals(STATUS_IN_REVIEW);
                default:
                    return false;
            }
        }

        public void clearTasks() {
            tasksPanel.removeAll();
            tasksPanel.revalidate();
            tasksPanel.repaint();
            animateColumnHeight(100); // Reset về chiều cao mặc định
        }
    }
    
    // Tạo một mục thông báo đơn lẻ
    private JPanel createNotificationItem(String title, String message, String time, boolean isNew) {
        JPanel itemPanel = new JPanel(new BorderLayout(10, 5));
        itemPanel.setBackground(isNew ? new Color(245, 247, 250) : Color.WHITE);
        itemPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(230, 230, 230)),
            BorderFactory.createEmptyBorder(12, 15, 12, 15)
        ));
        itemPanel.setMaximumSize(new Dimension(320, 100));
        itemPanel.setPreferredSize(new Dimension(320, 80));
        
        // Dot để đánh dấu thông báo mới
        if (isNew) {
            JPanel dotPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    g2d.setColor(new Color(237, 66, 69));
                    g2d.fillOval(0, 5, 8, 8);
                    
                    g2d.dispose();
                }
            };
            dotPanel.setOpaque(false);
            dotPanel.setPreferredSize(new Dimension(10, 10));
            itemPanel.add(dotPanel, BorderLayout.WEST);
        } else {
            itemPanel.add(Box.createRigidArea(new Dimension(10, 0)), BorderLayout.WEST);
        }
        
        // Panel chứa nội dung thông báo
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setForeground(TEXT_COLOR);
        titleLabel.setAlignmentX(LEFT_ALIGNMENT);
        contentPanel.add(titleLabel);
        
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        
        JLabel messageLabel = new JLabel("<html><div style='width:230px'>" + message + "</div></html>");
        messageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        messageLabel.setForeground(SECONDARY_TEXT_COLOR);
        messageLabel.setAlignmentX(LEFT_ALIGNMENT);
        contentPanel.add(messageLabel);
        
        contentPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        
        JLabel timeLabel = new JLabel(time);
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        timeLabel.setForeground(new Color(160, 160, 160));
        timeLabel.setAlignmentX(LEFT_ALIGNMENT);
        contentPanel.add(timeLabel);
        
        itemPanel.add(contentPanel, BorderLayout.CENTER);
        
        // Thêm hiệu ứng hover
        itemPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                itemPanel.setBackground(new Color(240, 242, 245));
                itemPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                itemPanel.setBackground(isNew ? new Color(245, 247, 250) : Color.WHITE);
                itemPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                // Xử lý khi click vào thông báo
                JOptionPane.showMessageDialog(TodoListApp.this,
                    message,
                    title,
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        return itemPanel;
    }

    // Thêm phương thức để style ComboBox
    private void styleComboBox(JComboBox<?> comboBox) {
        comboBox.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1, true),
            BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));
        
        comboBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!comboBox.isPopupVisible()) {
                    comboBox.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(ACCENT_COLOR, 1, true),
                        BorderFactory.createEmptyBorder(5, 8, 5, 8)
                    ));
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if (!comboBox.isPopupVisible()) {
                    comboBox.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BORDER_COLOR, 1, true),
                        BorderFactory.createEmptyBorder(5, 8, 5, 8)
                    ));
                }
            }
        });
        
        comboBox.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                comboBox.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(ACCENT_COLOR, 1, true),
                    BorderFactory.createEmptyBorder(5, 8, 5, 8)
                ));
            }
            
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                comboBox.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(BORDER_COLOR, 1, true),
                    BorderFactory.createEmptyBorder(5, 8, 5, 8)
                ));
            }
            
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                comboBox.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(BORDER_COLOR, 1, true),
                    BorderFactory.createEmptyBorder(5, 8, 5, 8)
                ));
            }
        });
    }

    // Phương thức để tìm todo trong database theo ID
    private Todo findTaskInDbById(String taskId) {
        try {
            // Lấy danh sách todos từ cơ sở dữ liệu
            List<Todo> todos = todoDAO.selectByUserId(Auth.user.getMaNguoiDung());
            
            for (Todo todo : todos) {
                if (todo.getMaTodo().equals(taskId)) {
                    return todo;
                }
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi tìm task trong database: " + e.getMessage());
        }
        return null;
    }
    
    // Phương thức để cập nhật trạng thái của task trong cơ sở dữ liệu
    private void updateTaskStatusInDatabase(String taskId, String newStatus) {
        try {
            // Tìm task trong UI để lấy dbTaskId
            Task task = null;
            for (TaskColumn column : columns) {
                task = column.findTaskById(taskId);
                if (task != null) break;
            }
            
            if (task == null || task.getDbTaskId() == null) {
                System.out.println("Không tìm thấy task hoặc task chưa có dbTaskId");
                return;
            }
            
            // Tìm todo trong database
            Todo todo = findTaskInDbById(task.getDbTaskId());
            if (todo != null) {
                // Cập nhật trạng thái
                todo.setTrangThaiTask(newStatus);
                // Cập nhật trạng thái hoàn thành
                todo.setTrangThai(newStatus.equals(STATUS_DONE));
                // Lưu lại vào cơ sở dữ liệu
                todoDAO.update(todo);
                System.out.println("Đã cập nhật trạng thái task " + todo.getMaTodo() + " thành " + newStatus);
                
                // Cập nhật lại task trong UI
                task.setStatus(newStatus);
            } else {
                System.out.println("Không tìm thấy task trong database với ID: " + task.getDbTaskId());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Lỗi khi cập nhật trạng thái task: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchTasks() {
        String searchText = searchField.getText().toLowerCase().trim();
        
        // Nếu không có từ khóa tìm kiếm, hiển thị tất cả task
        if (searchText.isEmpty()) {
            loadTasksFromDatabase();
            return;
        }
        
        // Xóa tất cả task hiện tại
        for (TaskColumn column : columns) {
            column.clearTasks();
        }
        
        try {
            // Lấy tất cả task từ database
            List<Todo> todos = todoDAO.selectByUserId(Auth.user.getMaNguoiDung());
            
            for (Todo todo : todos) {
                // Kiểm tra nếu task phù hợp với từ khóa tìm kiếm
                if (todo.getTieuDe().toLowerCase().contains(searchText) ||
                    todo.getNoiDung().toLowerCase().contains(searchText) ||
                    todo.getLevel().toLowerCase().contains(searchText)) {
                    
                    Task task = new Task(
                        todo.getTieuDe(),
                        todo.getNoiDung(),
                        todo.getLevel(),
                        todo.getNgayTao().toLocalDateTime()
                    );
                    
                    task.dbTaskId = todo.getMaTodo();
                    
                    String status = todo.getTrangThaiTask();
                    if (status == null || status.isEmpty()) {
                        status = todo.isTrangThai() ? STATUS_DONE : STATUS_TODO;
                    } else {
                        if (status.equals("Todo list")) {
                            status = STATUS_TODO;
                        } else if (status.equals("In Progress")) {
                            status = STATUS_IN_PROGRESS;
                        } else if (status.equals("In Review")) {
                            status = STATUS_IN_REVIEW;
                        } else if (status.equals("Done")) {
                            status = STATUS_DONE;
                        }
                    }
                    
                    task.setStatus(status);
                    
                    for (TaskColumn column : columns) {
                        if (column.columnTitle.equals(status)) {
                            column.addTask(task);
                            break;
                        }
                    }
                }
            }
            
            revalidate();
            repaint();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Lỗi khi tìm kiếm task: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTaskInDatabase(Task task) {
        try {
            if (task.getDbTaskId() == null || task.getDbTaskId().isEmpty()) {
                System.err.println("Task không có ID database");
                return;
            }
            
            // Tìm todo trong database
            Todo todo = findTaskInDbById(task.getDbTaskId());
            if (todo != null) {
                // Cập nhật thông tin
                todo.setTieuDe(task.getTitle());
                todo.setNoiDung(task.getDescription());
                todo.setLevel(task.getLevel());
                if (task.getDeadline() != null) {
                    todo.setDeadline(Timestamp.valueOf(task.getDeadline()));
                }
                // Lưu lại vào cơ sở dữ liệu
                todoDAO.update(todo);
                System.out.println("Đã cập nhật task " + todo.getMaTodo() + " trong database");
            } else {
                System.err.println("Không tìm thấy task trong database với ID: " + task.getDbTaskId());
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi cập nhật task: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Thêm phương thức để lấy URL của hình ảnh
    private URL getImageURL(String imageName) {
        try {
            return getClass().getResource("/com/img/" + imageName);
        } catch (Exception e) {
            System.err.println("Không tìm thấy hình ảnh: " + imageName);
            return null;
        }
    }

    // Thêm phương thức để tạo ImageIcon từ tên file
    private ImageIcon createImageIcon(String imageName, int width, int height) {
        URL imageURL = getImageURL(imageName);
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(image);
        }
        return null;
    }

    // Thêm phương thức để lấy icon ngôn ngữ
    private ImageIcon getLanguageIcon(String language) {
        String iconName = "";
        switch (language) {
            case "Java":
                iconName = "logojava.png";
                break;
            case "C":
                iconName = "logoc.png";
                break;
            case "SQL":
                iconName = "logosql.png";
                break;
            case "JavaScript":
                iconName = "logojavascript.png";
                break;
            case "HTML/CSS":
                iconName = "htmlcss.png";
                break;
            case "Python":
                iconName = "python.png";
                break;
            default:
                return null;
        }
        return createImageIcon(iconName, 24, 24);
    }

    // Thêm phương thức hiển thị dialog lọc
    private void showFilterDialog() {
        JDialog dialog = new JDialog((Dialog) window, "Lọc công việc", true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(450, 400);
        dialog.setLocationRelativeTo(this);

        // Panel chính với background màu trắng
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));

        // Panel tiêu đề
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        titlePanel.setBackground(Color.WHITE);
        
        // Icon lọc
        JLabel filterIcon = new JLabel("🔍");
        filterIcon.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        titlePanel.add(filterIcon);
        
        // Tiêu đề
        JLabel titleLabel = new JLabel("Lọc theo mức độ");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(50, 50, 50));
        titlePanel.add(Box.createHorizontalStrut(10));
        titlePanel.add(titleLabel);
        
        mainPanel.add(titlePanel);
        mainPanel.add(Box.createVerticalStrut(20));

        // Panel mô tả
        JPanel descPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        descPanel.setBackground(Color.WHITE);
        JLabel descLabel = new JLabel("Chọn một hoặc nhiều mức độ để lọc công việc:");
        descLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        descLabel.setForeground(new Color(100, 100, 100));
        descPanel.add(descLabel);
        mainPanel.add(descPanel);
        mainPanel.add(Box.createVerticalStrut(25));

        // Panel chứa các checkbox
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new BoxLayout(checkboxPanel, BoxLayout.Y_AXIS));
        checkboxPanel.setBackground(Color.WHITE);

        // Tạo các checkbox với style mới
        JCheckBox[] checkboxes = {
            createStyledCheckbox("Cơ bản", new Color(52, 152, 219)),
            createStyledCheckbox("Nâng cao", new Color(231, 76, 60)),
            createStyledCheckbox("Chuyên nghiệp", new Color(230, 126, 34)),
            createStyledCheckbox("Ứng dụng", new Color(46, 204, 113))
        };

        for (JCheckBox checkbox : checkboxes) {
            JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            itemPanel.setBackground(Color.WHITE);
            itemPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
            itemPanel.add(checkbox);
            checkboxPanel.add(itemPanel);
            checkboxPanel.add(Box.createVerticalStrut(10));
        }

        // Thêm panel scroll cho checkbox
        JScrollPane scrollPane = new JScrollPane(checkboxPanel);
        scrollPane.setBorder(null);
        scrollPane.setBackground(Color.WHITE);
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        // Custom thanh cuộn
        scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new ModernScrollBarUI());
        
        mainPanel.add(scrollPane);
        mainPanel.add(Box.createVerticalStrut(30));

        // Panel chứa các nút
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        buttonPanel.setBackground(Color.WHITE);

        // Nút Hủy
        JButton cancelButton = new JButton("Hủy");
        cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        cancelButton.setPreferredSize(new Dimension(100, 40));
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setForeground(new Color(100, 100, 100));
        cancelButton.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        cancelButton.setFocusPainted(false);
        cancelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Hiệu ứng hover cho nút Hủy
        cancelButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cancelButton.setBackground(new Color(245, 245, 245));
            }
            public void mouseExited(MouseEvent e) {
                cancelButton.setBackground(Color.WHITE);
            }
        });

        // Nút Áp dụng
        JButton applyButton = new JButton("Áp dụng");
        applyButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        applyButton.setPreferredSize(new Dimension(100, 40));
        applyButton.setBackground(ACCENT_COLOR);
        applyButton.setForeground(Color.WHITE);
        applyButton.setBorder(BorderFactory.createEmptyBorder());
        applyButton.setFocusPainted(false);
        applyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Hiệu ứng hover cho nút Áp dụng
        applyButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                applyButton.setBackground(ACCENT_COLOR.darker());
            }
            public void mouseExited(MouseEvent e) {
                applyButton.setBackground(ACCENT_COLOR);
            }
        });

        // Thêm xử lý sự kiện
        cancelButton.addActionListener(e -> dialog.dispose());
        
        applyButton.addActionListener(e -> {
            List<String> selectedLevels = new ArrayList<>();
            for (JCheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    selectedLevels.add(checkbox.getText());
                }
            }
            
            // Áp dụng bộ lọc
            applyFilters(selectedLevels);
            dialog.dispose();
        });

        buttonPanel.add(cancelButton);
        buttonPanel.add(applyButton);
        mainPanel.add(buttonPanel);

        dialog.add(mainPanel);
        dialog.setVisible(true);
    }

    // Phương thức tạo checkbox với style mới
    private JCheckBox createStyledCheckbox(String text, Color color) {
        JCheckBox checkbox = new JCheckBox(text);
        checkbox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        checkbox.setBackground(Color.WHITE);
        checkbox.setFocusPainted(false);
        checkbox.setIcon(new CheckBoxIcon(color, false));
        checkbox.setSelectedIcon(new CheckBoxIcon(color, true));
        checkbox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Thêm padding
        checkbox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        return checkbox;
    }

    // Class tạo icon cho checkbox
    private class CheckBoxIcon implements Icon {
        private final Color color;
        private final boolean selected;
        private final int size = 22;

        public CheckBoxIcon(Color color, boolean selected) {
            this.color = color;
            this.selected = selected;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Vẽ hình vuông với góc bo tròn
            if (selected) {
                g2d.setColor(color);
                g2d.fillRoundRect(x, y, size, size, 6, 6);
                
                // Vẽ dấu check
                g2d.setColor(Color.WHITE);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(x + 5, y + 11, x + 9, y + 15);
                g2d.drawLine(x + 9, y + 15, x + 17, y + 7);
            } else {
                g2d.setColor(new Color(200, 200, 200));
                g2d.setStroke(new BasicStroke(1));
                g2d.drawRoundRect(x, y, size - 1, size - 1, 6, 6);
            }

            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }

    // Thêm phương thức áp dụng bộ lọc
    private void applyFilters(List<String> levels) {
        try {
            // Xóa tất cả task hiện tại
            for (TaskColumn column : columns) {
                column.clearTasks();
            }
            
            // Lấy danh sách task từ database
            List<Todo> todos = todoDAO.selectByUserIdAndLanguage(Auth.user.getMaNguoiDung(), currentLanguage);
            
            // Nếu không có mức độ nào được chọn, hiển thị tất cả
            if (levels.isEmpty()) {
                loadTasksByLanguage(currentLanguage);
                return;
            }
            
            for (Todo todo : todos) {
                String taskLevel = todo.getLevel();
                
                // Kiểm tra nếu task có mức độ phù hợp
                if (levels.contains(taskLevel)) {
                    Task task = new Task(
                        todo.getTieuDe(),
                        todo.getNoiDung(),
                        todo.getLevel(),
                        todo.getNgayTao().toLocalDateTime()
                    );
                    
                    if (todo.getDeadline() != null) {
                        task.setDeadline(todo.getDeadline().toLocalDateTime());
                    }
                    
                    task.setDbTaskId(todo.getMaTodo());
                    task.setStatus(todo.getTrangThaiTask());
                    
                    // Thêm task vào cột tương ứng
                    for (TaskColumn column : columns) {
                        if (column.columnTitle.equals(todo.getTrangThaiTask())) {
                            column.addTask(task);
                            break;
                        }
                    }
                }
            }
            
            // Cập nhật giao diện
            revalidate();
            repaint();
            
            // Hiển thị thông báo nếu không tìm thấy task nào
            int totalTasks = 0;
            for (TaskColumn column : columns) {
                totalTasks += column.tasksPanel.getComponentCount() / 2;
            }
            
            if (totalTasks == 0) {
                JOptionPane.showMessageDialog(this,
                    "Không tìm thấy công việc nào ở mức độ đã chọn",
                    "Kết quả lọc",
                    JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Lỗi khi lọc công việc: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    // Thêm phương thức để định dạng nút
    private void styleButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setBackground(new Color(33, 150, 243)); // Màu xanh Material Design
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Thêm hiệu ứng hover
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(25, 118, 210)); // Màu xanh đậm hơn
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(33, 150, 243)); // Trở lại màu ban đầu
            }
        });
    }

    private void addNotification(String title, String message) {
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        NotificationItem notification = new NotificationItem(title, message, time);
        notifications.add(0, notification); // Thêm vào đầu danh sách
        unreadCount++;
        updateNotificationBadge();
    }

    private void markNotificationAsRead(NotificationItem notification) {
        if (!notification.isRead) {
            notification.isRead = true;
            unreadCount--;
            updateNotificationBadge();
        }
    }

    private void markAllNotificationsAsRead() {
        for (NotificationItem notification : notifications) {
            notification.isRead = true;
        }
        unreadCount = 0;
        updateNotificationBadge();
        showNotifications(); // Refresh popup
    }

    private void updateNotificationBadge() {
        if (notificationButton != null) {
            for (Component comp : notificationButton.getComponents()) {
                if (comp instanceof JLabel) {
                    JLabel badge = (JLabel) comp;
                    badge.setText(String.valueOf(unreadCount));
                    badge.setVisible(unreadCount > 0);
                }
            }
        }
    }

    private void showNotifications() {
        if (notificationPopup != null && notificationPopup.isVisible()) {
            notificationPopup.dispose();
            return;
        }

        // Tạo popup window
        notificationPopup = new JWindow(window);
        notificationPopup.setBackground(new Color(0, 0, 0, 0));

        // Panel chính
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createCompoundBorder(
            new ShadowBorder(new Color(0, 0, 0, 50), 8),
            BorderFactory.createEmptyBorder(0, 0, 0, 0)
        ));

        // Panel tiêu đề
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.WHITE);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JLabel titleLabel = new JLabel("Thông báo");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        headerPanel.add(titleLabel, BorderLayout.WEST);

        // Nút đánh dấu đã đọc tất cả
        if (unreadCount > 0) {
            JButton markAllReadButton = new JButton("Đánh dấu đã đọc");
            markAllReadButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            markAllReadButton.setForeground(ACCENT_COLOR);
            markAllReadButton.setBackground(Color.WHITE);
            markAllReadButton.setBorder(BorderFactory.createEmptyBorder());
            markAllReadButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            markAllReadButton.addActionListener(e -> markAllNotificationsAsRead());
            headerPanel.add(markAllReadButton, BorderLayout.EAST);
        }

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Panel nội dung
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        if (notifications.isEmpty()) {
            JPanel emptyPanel = new JPanel(new BorderLayout());
            emptyPanel.setBackground(Color.WHITE);
            emptyPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            
            JLabel emptyLabel = new JLabel("Không có thông báo nào", SwingConstants.CENTER);
            emptyLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            emptyLabel.setForeground(new Color(150, 150, 150));
            emptyPanel.add(emptyLabel, BorderLayout.CENTER);
            
            contentPanel.add(emptyPanel);
        } else {
            for (NotificationItem notification : notifications) {
                contentPanel.add(createNotificationItemPanel(notification));
                contentPanel.add(Box.createVerticalStrut(10));
            }
        }

        // Scroll pane cho nội dung
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(null);
        scrollPane.setBackground(Color.WHITE);
        scrollPane.getViewport().setBackground(Color.WHITE);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        // Custom thanh cuộn
        scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        notificationPopup.add(mainPanel);
        notificationPopup.pack();

        // Đặt kích thước tối đa và tối thiểu
        int width = 350;
        int maxHeight = 400;
        int height = Math.min(contentPanel.getPreferredSize().height + headerPanel.getPreferredSize().height + 20, maxHeight);
        notificationPopup.setSize(width, height);

        // Định vị popup dưới nút thông báo
        Point buttonLocation = notificationButton.getLocationOnScreen();
        notificationPopup.setLocation(
            buttonLocation.x + notificationButton.getWidth() - width,
            buttonLocation.y + notificationButton.getHeight() + 5
        );

        // Thêm sự kiện đóng popup khi click ra ngoài
        addPopupAutoHide();

        notificationPopup.setVisible(true);
    }

    private JPanel createNotificationItemPanel(NotificationItem notification) {
        JPanel itemPanel = new JPanel(new BorderLayout(10, 5));
        itemPanel.setBackground(notification.isRead ? Color.WHITE : new Color(245, 247, 250));
        itemPanel.setBorder(BorderFactory.createEmptyBorder(12, 15, 12, 15));
        itemPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Icon thông báo
        JLabel iconLabel = new JLabel("🔔");
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        itemPanel.add(iconLabel, BorderLayout.WEST);

        // Panel nội dung
        JPanel contentPanel = new JPanel(new BorderLayout(5, 3));
        contentPanel.setBackground(null);

        // Tiêu đề
        JLabel titleLabel = new JLabel(notification.title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        contentPanel.add(titleLabel, BorderLayout.NORTH);

        // Nội dung
        JLabel messageLabel = new JLabel(notification.message);
        messageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        messageLabel.setForeground(new Color(100, 100, 100));
        contentPanel.add(messageLabel, BorderLayout.CENTER);

        // Thời gian
        JLabel timeLabel = new JLabel(notification.time);
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        timeLabel.setForeground(new Color(150, 150, 150));
        contentPanel.add(timeLabel, BorderLayout.SOUTH);

        itemPanel.add(contentPanel, BorderLayout.CENTER);

        // Xử lý sự kiện hover
        itemPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                itemPanel.setBackground(HOVER_COLOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                itemPanel.setBackground(notification.isRead ? Color.WHITE : new Color(245, 247, 250));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                markNotificationAsRead(notification);
                // Xử lý click vào thông báo (có thể thêm logic tùy ứng dụng)
            }
        });

        return itemPanel;
    }

    private void addPopupAutoHide() {
        final AWTEventListener[] listenerRef = new AWTEventListener[1];
        
        listenerRef[0] = event -> {
            if (event instanceof MouseEvent) {
                MouseEvent mouseEvent = (MouseEvent) event;
                if (mouseEvent.getID() == MouseEvent.MOUSE_CLICKED) {
                    Point clickPoint = mouseEvent.getLocationOnScreen();
                    if (!notificationPopup.getBounds().contains(clickPoint) &&
                        !notificationButton.getBounds().contains(notificationButton.getParent().getMousePosition())) {
                        notificationPopup.dispose();
                        Toolkit.getDefaultToolkit().removeAWTEventListener(listenerRef[0]);
                    }
                }
            }
        };
        
        Toolkit.getDefaultToolkit().addAWTEventListener(
            listenerRef[0],
            AWTEvent.MOUSE_EVENT_MASK
        );
    }
} 