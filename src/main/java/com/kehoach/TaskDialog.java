// TaskDialog.java (Hoàn thiện đầy đủ lưu và update task vào database)
package com.kehoach;

import com.dao.CongViecDAO;
import com.entity.CongViec;
import com.entity.NguoiDung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskDialog extends JDialog {

    private JTextField titleField;
    private JTextArea descArea;
    private JTextField dueField;
    private JComboBox<String> priorityBox;
    private TaskCard editingCard;

    // DAO và thông tin người dùng
    private CongViecDAO congViecDAO = new CongViecDAO();
    NguoiDung nguoiDung = new NguoiDung();
    private String maNguoiDung = nguoiDung.getMaNguoiDung();
    ; // Giả sử bạn sẽ set trước khi mở dialog
     String trangThaiKanban;

    public TaskDialog(ColumnPanel parent, TaskCard card) {
        super((Frame) SwingUtilities.getWindowAncestor(parent), "Task Details", true);
        this.editingCard = card;
        trangThaiKanban = parent.getTitle();

        setSize(400, 300);
        setLocationRelativeTo(parent);

        titleField = new JTextField(20);
        descArea = new JTextArea(5, 20);
        dueField = new JTextField(10);
        priorityBox = new JComboBox<>(new String[]{"Low", "Medium", "High"});

        if (card != null) {
            titleField.setText(card.getTitleText());
            descArea.setText(card.getDescription());
            dueField.setText(card.getDueDate());
            priorityBox.setSelectedItem(card.getPriority());
        }

        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        form.add(new JLabel("Title:"), gbc);
        gbc.gridx = 1;
        form.add(titleField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        form.add(new JLabel("Description:"), gbc);
        gbc.gridx = 1;
        form.add(new JScrollPane(descArea), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        form.add(new JLabel("Due Date:"), gbc);
        gbc.gridx = 1;
        form.add(dueField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        form.add(new JLabel("Priority:"), gbc);
        gbc.gridx = 1;
        form.add(priorityBox, gbc);

        JButton saveBtn = new JButton("Save");
        saveBtn.addActionListener(e -> onSave(parent));
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(e -> dispose());
        JPanel btns = new JPanel();
        btns.add(saveBtn);
        btns.add(cancelBtn);

        getContentPane().add(form, BorderLayout.CENTER);
        getContentPane().add(btns, BorderLayout.SOUTH);
    }

    private void onSave(ColumnPanel parent) {
        String title = titleField.getText();
        String desc = descArea.getText();
        String dueDate = dueField.getText();
        String priority = (String) priorityBox.getSelectedItem();

        if (editingCard != null) {
            // Update task
            CongViec cv = new CongViec();
            cv.setMaCongViec(editingCard.getTaskId());
            cv.setTieuDe(title);
            cv.setMoTa(desc);
            cv.setNgayHetHan(dueDate);
            cv.setDoUuTien(priority);
            cv.setTrangThai(false); // Hoặc lấy từ UI nếu có checkbox trạng thái
            cv.setTrangThaiKanban(trangThaiKanban);

            congViecDAO.update(cv);

            editingCard.updateTask(title, desc, dueDate, priority);
        } else {
            // New task
            CongViec cv = new CongViec();
            cv.setTieuDe(title);
            cv.setMoTa(desc);
            cv.setNgayHetHan(dueDate);
            cv.setDoUuTien(priority);
            cv.setTrangThai(false);
            cv.setMaNguoiDung(maNguoiDung);
            cv.setTrangThaiKanban(trangThaiKanban);

            congViecDAO.insert(cv);

            parent.addTask(new TaskCard(editingCard.getTaskId(), title, desc, dueDate, priority, parent));
        }

        dispose();
    }

}
