package com.todolist.app;

import com.dao.TodoDAO;
import com.entity.Todo;
import com.todolist.app.TodoListApp.Task;
import com.utils.Auth;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.util.List;

public class TaskStateManager {
    private TodoDAO todoDAO;
    private TodoListApp todoListApp;

    // Các trạng thái có thể có của task
    public static final String STATUS_TODO = "Cần làm";
    public static final String STATUS_IN_PROGRESS = "Đang làm";
    public static final String STATUS_IN_REVIEW = "Đang xem xét";
    public static final String STATUS_DONE = "Hoàn thành";

    public TaskStateManager(TodoListApp todoListApp, TodoDAO todoDAO) {
        this.todoListApp = todoListApp;
        this.todoDAO = todoDAO;
    }

    /**
     * Cập nhật trạng thái của task trong database
     */
    public boolean updateTaskState(Task task, String newStatus) {
        try {
            if (task.getDbTaskId() == null || task.getDbTaskId().isEmpty()) {
                System.out.println("Task không có ID database");
                return false;
            }

            // Tìm todo trong database
            Todo todo = findTaskInDb(task.getDbTaskId());
            if (todo != null) {
                // Cập nhật trạng thái
                todo.setTrangThaiTask(newStatus);
                todo.setTrangThai(newStatus.equals(STATUS_DONE));
                
                // Lưu vào database
                todoDAO.update(todo);
                System.out.println("Đã cập nhật task " + todo.getMaTodo() + " thành " + newStatus);
                
                // Cập nhật UI
                task.setStatus(newStatus);
                return true;
            } else {
                System.out.println("Không tìm thấy task trong database với ID: " + task.getDbTaskId());
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(todoListApp,
                "Lỗi khi cập nhật trạng thái task: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Cập nhật toàn bộ thông tin của task
     */
    public boolean updateTaskInfo(Task task) {
        try {
            if (task.getDbTaskId() == null || task.getDbTaskId().isEmpty()) {
                System.out.println("Task không có ID database");
                return false;
            }

            Todo todo = findTaskInDb(task.getDbTaskId());
            if (todo != null) {
                // Cập nhật thông tin
                todo.setTieuDe(task.getTitle());
                todo.setNoiDung(task.getDescription());
                todo.setLevel(task.getLevel());
                if (task.getDeadline() != null) {
                    todo.setDeadline(Timestamp.valueOf(task.getDeadline()));
                }
                todo.setTrangThaiTask(task.getStatus());
                todo.setTrangThai(task.getStatus().equals(STATUS_DONE));

                // Lưu vào database
                todoDAO.update(todo);
                System.out.println("Đã cập nhật thông tin task " + todo.getMaTodo());
                return true;
            } else {
                System.out.println("Không tìm thấy task trong database với ID: " + task.getDbTaskId());
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(todoListApp,
                "Lỗi khi cập nhật thông tin task: " + e.getMessage(),
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Tìm task trong database theo ID
     */
    private Todo findTaskInDb(String taskId) {
        try {
            // Sử dụng phương thức selectByUserId và tìm task có MaTodo phù hợp
            List<Todo> todos = todoDAO.selectByUserId(Auth.user.getMaNguoiDung());
            for (Todo todo : todos) {
                if (todo.getMaTodo().equals(taskId)) {
                    return todo;
                }
            }
            return null;
        } catch (Exception e) {
            System.err.println("Lỗi khi tìm task trong database: " + e.getMessage());
            return null;
        }
    }
} 