// TaskCard.java
package com.kehoach;

import com.dao.CongViecDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TaskCard extends JPanel {
    public static final DataFlavor TASK_FLAVOR = new DataFlavor(TaskCard.class, "TaskCard");

    private String title;
    private String desc;
    private String due;
    private String priority;
    private String created;
    private boolean completed;
    private ColumnPanel parentColumn;
    private int taskId;

    // UI components
    private JLabel titleLabel;
    private JTextArea descArea;
    private JLabel dueLabel;
    private JLabel priorityLabel;
    private JButton completeBtn;

    public void setParentColumn(ColumnPanel newParent) {
        this.parentColumn = newParent;
    }

    public TaskCard(int taskId, String title, String desc, String due, String priority, ColumnPanel parent) {
        this.taskId = taskId;
        this.title = title;
        this.desc = desc;
        this.due = due;
        this.priority = priority;
        this.parentColumn = parent;
        this.completed = false;
        this.created = java.time.LocalDateTime.now().toString();

        setPreferredSize(new Dimension(220, 180));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        // Title
        titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        titleLabel.setForeground(new Color(50, 50, 50));
        add(titleLabel, BorderLayout.NORTH);

        // Description area
        descArea = new JTextArea(desc);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        descArea.setBackground(Color.WHITE);
        descArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JScrollPane scrollPane = new JScrollPane(descArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setPreferredSize(new Dimension(200, 60));
        add(scrollPane, BorderLayout.CENTER);

        // Bottom info panel
        JPanel bottom = new JPanel(new GridLayout(2, 1, 5, 5));
        bottom.setOpaque(false);

        // Row 1: Due date + priority
        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        infoPanel.setOpaque(false);
        dueLabel = new JLabel("📅 " + due);
        dueLabel.setFont(new Font("SansSerif", Font.PLAIN, 11));
        priorityLabel = new JLabel("⚡ " + priority);
        priorityLabel.setFont(new Font("SansSerif", Font.PLAIN, 11));
        infoPanel.add(dueLabel);
        infoPanel.add(priorityLabel);

        // Row 2: Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        buttonPanel.setOpaque(false);

        completeBtn = new JButton(completed ? "✅ Completed" : "❌ Incomplete");
        completeBtn.setFocusPainted(false);
        completeBtn.setBackground(new Color(100, 200, 100));
        completeBtn.setForeground(Color.WHITE);
        completeBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
        completeBtn.addActionListener(e -> toggleComplete());

        JButton editBtn = new JButton("✏️ Edit");
        editBtn.setFocusPainted(false);
        editBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
        editBtn.addActionListener(e -> new TaskDialog(parentColumn, this).setVisible(true));

        JButton deleteBtn = new JButton("🗑️ Delete");
        deleteBtn.setFocusPainted(false);
        deleteBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
        deleteBtn.setForeground(new Color(220, 20, 60));
        deleteBtn.addActionListener(e -> {
            parentColumn.removeTask(this);         // Xoá trên giao diện
            new CongViecDAO().delete(taskId);  // Xoá trong database
        });


        buttonPanel.add(completeBtn);
        buttonPanel.add(editBtn);
        buttonPanel.add(deleteBtn);

        bottom.add(infoPanel);
        bottom.add(buttonPanel);

        add(bottom, BorderLayout.SOUTH);

        // Drag and drop support
        setTransferHandler(new TransferHandler() {
            protected Transferable createTransferable(JComponent c) {
                return new TaskCardTransferable(TaskCard.this);
            }

            public int getSourceActions(JComponent c) {
                return MOVE;
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                getTransferHandler().exportAsDrag(TaskCard.this, e, TransferHandler.MOVE);
            }
        });
    }

    private void toggleComplete() {
        completed = !completed;
        completeBtn.setText(completed ? "✅ Completed" : "❌ Incomplete");
        completeBtn.setBackground(completed ? new Color(46, 204, 113) : new Color(100, 200, 100));
        revalidate();
        repaint();
    }

    public String getTitleText() {
        return title;
    }

    public String getDescription() {
        return desc;
    }

    public String getDueDate() {
        return due;
    }

    public String getPriority() {
        return priority;
    }
    
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void updateTask(String title, String desc, String due, String priority) {
        this.title = title;
        this.desc = desc;
        this.due = due;
        this.priority = priority;
        titleLabel.setText(title);
        descArea.setText(desc);
        dueLabel.setText("📅 " + due);
        priorityLabel.setText("⚡ " + priority);
    }

    private static class TaskCardTransferable implements Transferable {
        private final TaskCard card;

        public TaskCardTransferable(TaskCard card) {
            this.card = card;
        }

        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[]{TASK_FLAVOR};
        }

        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return TASK_FLAVOR.equals(flavor);
        }

        public Object getTransferData(DataFlavor flavor) {
            return card;
        }
    }
}
