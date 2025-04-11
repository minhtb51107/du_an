// KanbanBoardApp.java
package com.kehoach;

import com.dao.CongViecDAO;
import com.entity.CongViec;
import com.entity.NguoiDung;
import javax.swing.*;
import java.awt.*;
import java.util.List;


public class KanbanBoardApp extends JPanel {
        private ColumnPanel nextUpColumn;
    private ColumnPanel inProgressColumn;
    private ColumnPanel reviewColumn;
    private ColumnPanel completedColumn;
        NguoiDung nguoiDung = new NguoiDung();
    private String maNguoiDung = nguoiDung.getMaNguoiDung();
    
    public KanbanBoardApp() {
        setLayout(new BorderLayout());
        setOpaque(false);

        JPanel board = new JPanel(new GridLayout(1, 4, 10, 0));
        board.setOpaque(false);
        board.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        nextUpColumn = new ColumnPanel("Next Up", new Color(208,222,249,255));
        inProgressColumn = new ColumnPanel("In Progress", new Color(247,228,211,255));
        reviewColumn = new ColumnPanel("Review", new Color(252,224,244,255));
        completedColumn = new ColumnPanel("Completed", new Color(193,243,228,255));

        board.add(nextUpColumn);
        board.add(inProgressColumn);
        board.add(reviewColumn);
        board.add(completedColumn);

        add(board);

        // Sau khi setup xong cột, ta load data
        loadTasks();

        setVisible(true);
    }
    
    private void loadTasks() {
    CongViecDAO congViecDAO = new CongViecDAO();
    List<CongViec> tasks = congViecDAO.getAllByNguoiDung(maNguoiDung); // maNguoiDung: biến này cần truyền từ login hoặc khai báo trước

    for (CongViec cv : tasks) {

        switch (cv.getTrangThaiKanban()) {
            case "Next Up":
                TaskCard taskCard = new TaskCard(cv.getMaCongViec(),cv.getTieuDe(), cv.getMoTa(), cv.getDoUuTien(), cv.getNgayHetHan(), nextUpColumn);
                nextUpColumn.addTask(taskCard);
                break;
            case "In Progress":
                TaskCard taskCard1 = new TaskCard(cv.getMaCongViec(), cv.getTieuDe(), cv.getMoTa(), cv.getDoUuTien(), cv.getNgayHetHan(), inProgressColumn);
                inProgressColumn.addTask(taskCard1);
                break;
            case "Review":
                TaskCard taskCard2 = new TaskCard(cv.getMaCongViec(), cv.getTieuDe(), cv.getMoTa(), cv.getDoUuTien(), cv.getNgayHetHan(), reviewColumn);
                reviewColumn.addTask(taskCard2);
                break;
            case "Completed":
                TaskCard taskCard3 = new TaskCard(cv.getMaCongViec(), cv.getTieuDe(), cv.getMoTa(), cv.getDoUuTien(), cv.getNgayHetHan(), completedColumn);
                completedColumn.addTask(taskCard3);
                break;
            default:
                System.out.println("Không xác định trạng thái: " + cv.getTrangThaiKanban());
        }
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(KanbanBoardApp::new);
    }
}