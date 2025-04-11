package com.dao;

import com.entity.Todo;
import com.utils.XJdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {
    
    public boolean checkTable() {
        try {
            Connection conn = XJdbc.getConnection();
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "TODOS", null);
            
            if (tables.next()) {
                System.out.println("Bảng TODOS đã tồn tại!");
                ResultSet levelColumn = dbm.getColumns(null, null, "TODOS", "level");
                if (!levelColumn.next()) {
                    String alterLevelSql = "ALTER TABLE TODOS ADD level NVARCHAR(50)";
                    XJdbc.executeUpdate(alterLevelSql);
                    System.out.println("Đã thêm cột level vào bảng TODOS!");
                }
                
                ResultSet deadlineColumn = dbm.getColumns(null, null, "TODOS", "deadline");
                if (!deadlineColumn.next()) {
                    String alterDeadlineSql = "ALTER TABLE TODOS ADD deadline DATETIME";
                    XJdbc.executeUpdate(alterDeadlineSql);
                    System.out.println("Đã thêm cột deadline vào bảng TODOS!");
                }
                
                conn.close();
                return true;
            } else {
                System.out.println("Bảng TODOS chưa tồn tại! Đang tạo...");
                String sql = "CREATE TABLE TODOS ("
                    + "MaTodo VARCHAR(10) PRIMARY KEY,"
                    + "MaNguoiDung VARCHAR(10) NOT NULL,"
                    + "TieuDe NVARCHAR(100) NOT NULL,"
                    + "NoiDung NVARCHAR(MAX),"
                    + "NgayTao DATETIME DEFAULT GETDATE(),"
                    + "TrangThai BIT DEFAULT 0,"
                    + "TrangThaiTask VARCHAR(20) DEFAULT 'TODO',"
                    + "level NVARCHAR(50),"
                    + "deadline DATETIME,"
                    + "CONSTRAINT FK_TODOS_NGUOIDUNG FOREIGN KEY (MaNguoiDung) REFERENCES NGUOIDUNG(MaNguoiDung)"
                    + ")";
                XJdbc.executeUpdate(sql);
                System.out.println("Đã tạo bảng TODOS thành công!");
                conn.close();
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi kiểm tra/tạo bảng TODOS: " + e.getMessage());
            return false;
        }
    }
    
    public void insert(Todo todo) {
        String sql = "INSERT INTO TODOS (MaTodo, MaNguoiDung, TieuDe, NoiDung, NgayTao, TrangThai, TrangThaiTask, level, deadline) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql, 
            todo.getMaTodo(),
            todo.getMaNguoiDung(),
            todo.getTieuDe(),
            todo.getNoiDung(),
            todo.getNgayTao(),
            todo.isTrangThai(),
            todo.getTrangThaiTask(),
            todo.getLevel(),
            todo.getDeadline()
        );
    }
    
    public void update(Todo todo) {
        String sql = "UPDATE TODOS SET TieuDe=?, NoiDung=?, TrangThai=?, TrangThaiTask=?, level=?, deadline=? WHERE MaTodo=?";
        XJdbc.executeUpdate(sql,
            todo.getTieuDe(),
            todo.getNoiDung(),
            todo.isTrangThai(),
            todo.getTrangThaiTask(),
            todo.getLevel(),
            todo.getDeadline(),
            todo.getMaTodo()
        );
    }
    
    public void delete(String maTodo) {
        String sql = "DELETE FROM TODOS WHERE MaTodo=?";
        XJdbc.executeUpdate(sql, maTodo);
    }
    
    public void deleteAllByUserId(String maNguoiDung) {
        String sql = "DELETE FROM TODOS WHERE MaNguoiDung=?";
        XJdbc.executeUpdate(sql, maNguoiDung);
    }
    
    public void deleteAll() {
        String sql = "DELETE FROM TODOS";
        XJdbc.executeUpdate(sql);
    }
    
    public List<Todo> selectByUserId(String maNguoiDung) {
        List<Todo> list = new ArrayList<>();
        String sql = "SELECT * FROM TODOS WHERE MaNguoiDung=? ORDER BY NgayTao DESC";
        
        try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung)) {
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setMaTodo(rs.getString("MaTodo"));
                todo.setMaNguoiDung(rs.getString("MaNguoiDung"));
                todo.setTieuDe(rs.getString("TieuDe"));
                todo.setNoiDung(rs.getString("NoiDung"));
                todo.setNgayTao(rs.getTimestamp("NgayTao"));
                todo.setTrangThai(rs.getBoolean("TrangThai"));
                todo.setTrangThaiTask(rs.getString("TrangThaiTask"));
                todo.setLevel(rs.getString("level"));
                list.add(todo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<Todo> selectByUserIdAndLanguage(String maNguoiDung, String language) {
        String sql = "SELECT * FROM TODOS WHERE MaNguoiDung = ? AND NoiDung LIKE ? ORDER BY NgayTao DESC";
        List<Todo> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung, "%Ngôn ngữ: " + language + "%")) {
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setMaTodo(rs.getString("MaTodo"));
                todo.setMaNguoiDung(rs.getString("MaNguoiDung"));
                todo.setTieuDe(rs.getString("TieuDe"));
                todo.setNoiDung(rs.getString("NoiDung"));
                todo.setNgayTao(rs.getTimestamp("NgayTao"));
                todo.setTrangThai(rs.getBoolean("TrangThai"));
                todo.setTrangThaiTask(rs.getString("TrangThaiTask"));
                todo.setLevel(rs.getString("level"));
                todo.setDeadline(rs.getTimestamp("deadline"));
                list.add(todo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    private String generateNewTodoCode() {
        String sql = "SELECT TOP 1 MaTodo FROM TODOS ORDER BY MaTodo DESC";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            if (rs.next()) {
                String lastCode = rs.getString("MaTodo");
                int number = Integer.parseInt(lastCode.substring(2)) + 1;
                return String.format("TD%03d", number);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "TD001";
    }
    
    public String getNextTodoCode() {
        return generateNewTodoCode();
    }
    
    private List<Todo> selectBySql(String sql, Object... args) {
        List<Todo> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(sql, args)) {
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setMaTodo(rs.getString("MaTodo"));
                todo.setMaNguoiDung(rs.getString("MaNguoiDung"));
                todo.setTieuDe(rs.getString("TieuDe"));
                todo.setNoiDung(rs.getString("NoiDung"));
                todo.setNgayTao(rs.getTimestamp("NgayTao"));
                todo.setTrangThai(rs.getBoolean("TrangThai"));
                todo.setTrangThaiTask(rs.getString("TrangThaiTask"));
                todo.setLevel(rs.getString("level"));
                
                try {
                    Timestamp deadline = rs.getTimestamp("deadline");
                    todo.setDeadline(deadline);
                } catch (SQLException e) {
                    System.out.println("Cột deadline chưa tồn tại: " + e.getMessage());
                }
                
                list.add(todo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
} 