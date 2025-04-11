package com.kehoach;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;

public class ColumnPanel extends JPanel {

    private JPanel tasksPanel;
    private int taskCount = 0;
    private Color themeColor;
    String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    

    public ColumnPanel(String title, Color color) {
        this.themeColor = color;
        this.title = title;

        setLayout(new BorderLayout());
        setOpaque(false); // Chúng ta sẽ tự vẽ nền
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //setBackground(Color.WHITE);

        // Title label
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setBorder(new EmptyBorder(15, 20, 15, 20));
        add(titleLabel, BorderLayout.NORTH);

        // Tasks Panel
        tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));
        tasksPanel.setOpaque(false);

        JScrollPane scroll = new JScrollPane(tasksPanel);
        scroll.setBorder(null);
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scroll, BorderLayout.CENTER);

        // Add Card Button
        JButton addBtn = new JButton("+ Add Card");
        styleButton(addBtn);
        addBtn.addActionListener(this::onAddCard);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottom.setOpaque(false);
        bottom.add(addBtn);
        add(bottom, BorderLayout.SOUTH);

        // Drag & drop handler
        setTransferHandler(new TransferHandler() {
            public boolean canImport(TransferSupport support) {
                return support.isDataFlavorSupported(TaskCard.TASK_FLAVOR);
            }

            public boolean importData(TransferSupport support) {
                try {
                    TaskCard card = (TaskCard) support.getTransferable().getTransferData(TaskCard.TASK_FLAVOR);
                    addTask(card);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });
    }

    private void styleButton(JButton button) {
        button.setFocusPainted(false);
        button.setBackground(Color.WHITE);
        button.setFont(new Font("SansSerif", Font.BOLD, 16));
        button.setForeground(themeColor.darker());
        button.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void addTask(TaskCard task) {
        tasksPanel.add(task);
        tasksPanel.revalidate();
        tasksPanel.repaint();
    }

    public void removeTask(TaskCard card) {
        tasksPanel.remove(card);
        tasksPanel.revalidate();
        tasksPanel.repaint();
        taskCount--;
    }
    private void onAddCard(ActionEvent e) {
        new TaskDialog(this, null).setVisible(true);
    }

@Override
protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setColor(themeColor);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
    g2.dispose();
    super.paintComponent(g);
}

}
