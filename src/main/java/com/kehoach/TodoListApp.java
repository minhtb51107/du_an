package com.kehoach;

import com.swing.RoundedPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TodoListApp extends JPanel{
    public JPanel categoryPanel;
    private JScrollPane mainScrollPane;
    public ArrayList<CategoryPanel> categories;

    public TodoListApp() {
        categories = new ArrayList<>();
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);

        // Panel chứa danh mục (hàng ngang)
        categoryPanel = new JPanel();
        categoryPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        //categoryPanel.setBackground(new Color(50, 50, 50));
        categoryPanel.setOpaque(false);

        // Bọc panel trong JScrollPane để cuộn theo chiều ngang
        mainScrollPane = new JScrollPane(categoryPanel);
        mainScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mainScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER); // Không cuộn chiều dọc
        mainScrollPane.setBorder(null);
        mainScrollPane.setOpaque(false);
        mainScrollPane.getViewport().setOpaque(false);

        // Nút thêm danh mục
        JButton addCategoryButton = new JButton("Add Category");
        styleButton(addCategoryButton);
        addCategoryButton.addActionListener(e -> addCategory());

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(false);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //bottomPanel.setBackground(new Color(50, 50, 50));
        bottomPanel.add(addCategoryButton);

        add(mainScrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        //setVisible(true);
    }

    private void addCategory() {
        String categoryName = JOptionPane.showInputDialog("Enter category name:");
        if (categoryName != null && !categoryName.trim().isEmpty()) {
            CategoryPanel newCategory = new CategoryPanel(categoryName, this);
            categories.add(newCategory);
            categoryPanel.add(newCategory);
            refreshCategoryPanel();
        }
    }

    public void refreshCategoryPanel() {
        categoryPanel.revalidate();
        categoryPanel.repaint();
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(0, 150, 136));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TodoListApp::new);
    }
}

class CategoryPanel extends JPanel {
    private JLabel categoryLabel;
    private JButton addTaskButton, editCategoryButton, deleteCategoryButton;
    public JPanel taskPanel;
    public int taskCount = 0;
    private TodoListApp app;

    public CategoryPanel(String category, TodoListApp app) {

        this.app = app;
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.setBackground(new Color(255, 255, 255, 255));
        this.setPreferredSize(new Dimension(400, 850)); // Chiều rộng cố định, chiều cao thay đổi
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //setOpaque(false);
        
        categoryLabel = new JLabel(category);
        categoryLabel.setForeground(Color.BLACK);
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 16));
        categoryLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        RoundedPanel topPanel = new RoundedPanel(0);
        topPanel.setLayout(new BorderLayout());
        topPanel.add(categoryLabel, BorderLayout.WEST);
        topPanel.setBackground(new Color(247,161,100,255));
        topPanel.setOpaque(false);

        // Panel chứa các nút sửa và xóa
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(105,118,255,255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        addTaskButton = new JButton("Add");
        addTaskButton.setOpaque(false);
        styleButton(addTaskButton);
        addTaskButton.addActionListener(e -> addTask());

        // Nút thêm thẻ (task)
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(addTaskButton, gbc);

        // Nút sửa danh mục
        editCategoryButton = new JButton("Edit");
        editCategoryButton.setOpaque(false);
        styleButton(editCategoryButton);
        editCategoryButton.addActionListener(e -> editCategory());

        gbc.gridx = 1;
        gbc.gridy = 0;
        buttonPanel.add(editCategoryButton, gbc);

        // Nút xóa danh mục
        deleteCategoryButton = new JButton("Delete");
        deleteCategoryButton.setOpaque(false);
        styleButton(deleteCategoryButton);
        deleteCategoryButton.addActionListener(e -> deleteCategory());

        gbc.gridx = 2;
        gbc.gridy = 0;
        buttonPanel.add(deleteCategoryButton, gbc);

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        taskPanel.setBackground(new Color(100, 100, 100, 0));
        taskPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Bọc taskPanel trong JScrollPane để cuộn nếu có quá nhiều thẻ con
        JScrollPane taskScrollPane = new JScrollPane(taskPanel);
        taskScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        taskScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        taskScrollPane.setBorder(null);
        taskScrollPane.setOpaque(false);
        taskScrollPane.getViewport().setOpaque(false);
        
        this.add(topPanel, BorderLayout.NORTH);
        this.add(taskScrollPane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH); // Các nút sẽ được đặt dưới tên khung cha
    }

    private void addTask() {
        String taskName = JOptionPane.showInputDialog("Enter task:");
        if (taskName != null && !taskName.trim().isEmpty()) {
            TaskCard newTask = new TaskCard(taskName, this);
            JPanel Panel = new JPanel();
            Panel.setLayout(new BorderLayout());
            Panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            Panel.setOpaque(false);
            Panel.setMaximumSize(new Dimension(380, 100));
            Panel.add(newTask, BorderLayout.CENTER);
            taskPanel.add(Panel);
            taskCount++;

            // Tăng kích thước chiều cao của category panel theo số lượng task
            adjustPanelSize();
            refreshTaskPanel();
        }
    }

    public void adjustPanelSize() {
        int newHeight = 850; // Chiều cao cố định cho category panel
        this.setPreferredSize(new Dimension(400, newHeight)); // Giữ chiều cao cố định cho category panel
        this.revalidate();
        this.repaint();
    }

    public void refreshTaskPanel() {
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(new Color(0, 150, 136, 0));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
    }

    private void editCategory() {
        String newCategoryName = JOptionPane.showInputDialog("Edit category name:", categoryLabel.getText());
        if (newCategoryName != null && !newCategoryName.trim().isEmpty()) {
            categoryLabel.setText(newCategoryName);
        }
    }

    private void deleteCategory() {
        // Xác nhận việc xóa danh mục
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this category?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            app.categories.remove(this);
            app.categoryPanel.remove(this);
            app.refreshCategoryPanel();
        }
    }
}

class TaskCard extends JPanel {
    private JTextArea taskTextArea;
    private JButton deleteButton;
    private CategoryPanel category;

    public TaskCard(String task, CategoryPanel category) {
        this.category = category;
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        this.setMaximumSize(new Dimension(390, 120));
        this.setOpaque(false);

        // Sử dụng JTextArea thay cho JLabel
        taskTextArea = new JTextArea(task);
        taskTextArea.setForeground(Color.BLACK);
        taskTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        taskTextArea.setOpaque(false); // Không hiển thị nền
        taskTextArea.setBorder(null);  // Loại bỏ viền
        taskTextArea.setLineWrap(true);
        taskTextArea.setWrapStyleWord(true);
        taskTextArea.setWrapStyleWord(true);
        taskTextArea.setLineWrap(true);
        taskTextArea.setEditable(true); // Người dùng có thể nhập nội dung

        // Tạo nút "XÓA"
        deleteButton = new JButton("XÓA");
        deleteButton.setOpaque(false);
        styleButton(deleteButton);
        deleteButton.addActionListener(e -> deleteTask());

        // Tạo panel bo tròn
        RoundedPanel Panel = new RoundedPanel(20);
        Panel.setLayout(new BorderLayout());
        Panel.setBackground(new Color(254, 137, 135, 255));
        Panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Panel chứa nút xóa
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setOpaque(false);
        buttonPanel.add(deleteButton);

        // Tạo Panel chứa JTextArea để căn chỉnh vị trí
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setOpaque(false);
        textPanel.add(taskTextArea, BorderLayout.CENTER);

        // Thêm các thành phần vào panel chính
        Panel.add(buttonPanel, BorderLayout.NORTH); // Nút nằm trên
        Panel.add(textPanel, BorderLayout.CENTER);  // Khung nhập văn bản nằm dưới
        this.add(Panel, BorderLayout.CENTER);
    }

    // Phương thức xóa task
    private void deleteTask() {
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa task này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Component parent = this.getParent();
            if (parent instanceof JPanel) {
                category.taskPanel.remove(parent);
            } else {
                category.taskPanel.remove(this);
            }
            category.taskCount--;
            category.adjustPanelSize();
            category.refreshTaskPanel();
        }
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(new Color(150, 150, 150, 0));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
}

