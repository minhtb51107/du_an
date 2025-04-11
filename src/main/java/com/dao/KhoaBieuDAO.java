/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.entity.KhoaBieu;
import com.utils.XJdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class KhoaBieuDAO extends DAO<KhoaBieu, Integer> {

    public void insert(KhoaBieu model) {
        String sql = "INSERT INTO KHOABIEU (TUAN, ID_KEHOACH) VALUES (?, ?)";
        XJdbc.update(sql,
                model.getTuan());
                model.getId_kehoach();
    }
    
    public void insertKhoaBieu(int tuan, int id_kehoach) {
        String sql = "INSERT INTO KHOABIEU (TUAN, ID_KEHOACH) VALUES (?, ?)";
        XJdbc.update(sql, tuan, id_kehoach);
    }


    public void insertTuan(int thang, int tuan, int soNgay, String tieuDe, String ghiChu, int toHop, int id_kehoach) {
        String sql = "INSERT INTO TUAN (THANG, ID_TUAN, SO_NGAY, TIEU_DE, GHI_CHU, TO_HOP, ID_KEHOACH) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, thang, tuan, soNgay, tieuDe, ghiChu, toHop, id_kehoach);
    }

    public void insertNgay(int tuan, int soNgay, String ghiChu, int toHop, int id_kehoach) {
        String sql = "INSERT INTO NGAY (ID_TUAN,Id_NGAY, GHI_CHU, TO_HOP, ID_KEHOACH) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql, tuan, soNgay, ghiChu, toHop, id_kehoach);
    }

    public void insertKeHoach(String user_id) {
        String sql = "INSERT INTO KEHOACH (ID_USER) VALUES (?)";
        XJdbc.update(sql, user_id);
    }

    protected List<KhoaBieu> selectBySql(String sql, Object... args) {
        List<KhoaBieu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhoaBieu entity = new KhoaBieu();
                    entity.setThang(rs.getInt("THANG"));
                    entity.setTuan(rs.getInt("TUAN"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<KhoaBieu> selectAll() {
        String sql = "SELECT * FROM KHOABIEU";
        return selectBySql(sql);
    }

    public List<int[]> getAllData(int idKeHoach) {
        List<int[]> dataList = new ArrayList<>();
        String sql = "SELECT THANG, TUAN FROM KHOABIEU WHERE ID_KEHOACH = ?";

        try {
            ResultSet rs = XJdbc.query(sql, idKeHoach);
            while (rs.next()) {
                int thang = rs.getInt("THANG");
                int tuan = rs.getInt("TUAN");
                dataList.add(new int[]{thang, tuan});
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return dataList;
    }

    public List<int[]> getAllDataTUAN() {
        List<int[]> dataList = new ArrayList<>();
        String sql = "SELECT THANG, ID_TUAN, SO_NGAY FROM TUAN";

        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                int thang = rs.getInt("THANG");
                int tuan = rs.getInt("ID_TUAN");
                int ngay = rs.getInt("SO_NGAY");
                dataList.add(new int[]{thang, tuan, ngay});
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return dataList;
    }

    public void update(KhoaBieu model) {
        String sql = "UPDATE KHOABIEU SET TUAN = ? WHERE THANG = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql,
                model.getTuan(), // Cập nhật TUAN
                model.getThang(),
                model.getId_kehoach()); // Điều kiện WHERE dựa trên THANG
    }

    public void updateKhoaBieu(int tuan, int thang, int id_kehoach) {
        String sql = "UPDATE KHOABIEU SET TUAN = ? WHERE THANG = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql, tuan, thang, id_kehoach);
    }

    public void updateSoNgayTheoTuan(int soNgay, int tuan, int id_kehoach) {
        String sql = "UPDATE TUAN SET SO_NGAY = ? WHERE ID_TUAN = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql, soNgay, tuan, id_kehoach);
    }

    public void updateTieuDeCuaTuan(String tieuDe, int tuan, int toHop, int id_kehoach) {
        String sql = "UPDATE TUAN SET Tieu_De = ? WHERE ID_TUAN = ? AND TO_HOP = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql, tieuDe, tuan, toHop, id_kehoach);
    }

    public void updateGhiChuCuaTuan(String ghiChu, int tuan, int toHop, int id_kehoach) {
        String sql = "UPDATE TUAN SET GHI_CHU = ? WHERE ID_TUAN = ? AND TO_HOP = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql, ghiChu, tuan, toHop, id_kehoach);
    }

    public void updateGhiChuCuaNgay(String ghiChu, int ngay, int id_kehoach) {
        String sql = "UPDATE NGAY SET GHI_CHU = ? WHERE ID_NGAY = ? AND ID_KEHOACH = ?";
        XJdbc.update(sql, ghiChu, ngay, id_kehoach);
    }

     /**
     * Xóa tất cả bản ghi trong bảng NGAY theo ID_KEHOACH
     */
    public void deleteNgayByKeHoach(int idKeHoach) {
        String sql = "DELETE FROM NGAY WHERE ID_KEHOACH = ?";
        XJdbc.update(sql, idKeHoach);
    }

    /**
     * Xóa tất cả bản ghi trong bảng TUAN theo ID_KEHOACH
     */
    public void deleteTuanByKeHoach(int idKeHoach) {
        String sql = "DELETE FROM TUAN WHERE ID_KEHOACH = ?";
        XJdbc.update(sql, idKeHoach);
    }

    /**
     * Xóa tất cả bản ghi trong bảng KHOABIEU theo ID_KEHOACH
     */
    public void deleteKhoaBieuByKeHoach(int idKeHoach) {
        String sql = "DELETE FROM KHOABIEU WHERE ID_KEHOACH = ?";
        XJdbc.update(sql, idKeHoach);
    }

    /**
     * Xóa toàn bộ dữ liệu liên quan đến một kế hoạch (kehoach)
     */
    public void deleteAllByKeHoach(int idKeHoach) {
        // Nếu XJdbc hỗ trợ transaction, bạn nên bật transaction ở đây
        // ví dụ: Connection conn = XJdbc.getConnection();
        // conn.setAutoCommit(false);
        try {
            // 1. Xóa bảng con trước
            deleteNgayByKeHoach(idKeHoach);
            deleteTuanByKeHoach(idKeHoach);
            // 2. Xóa bảng cha cuối cùng
            deleteKhoaBieuByKeHoach(idKeHoach);
            // nếu dùng transaction: conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // nếu dùng transaction: conn.rollback();
            throw new RuntimeException(e);
        } finally {
            // nếu dùng transaction: conn.setAutoCommit(true);
        }
    }
    
    public int getMaxThang() {
        String sql = "SELECT MAX(THANG) FROM KHOABIEU";
        try {
            ResultSet rs = XJdbc.query(sql);
            if (rs.next()) {
                return rs.getInt(1); // Lấy giá trị lớn nhất
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0; // Nếu không có dữ liệu
    }

    public int getSoNgayByTuan(int tuan) {
        String sql = "SELECT SO_NGAY FROM TUAN WHERE ID_TUAN = ?";
        try {
            ResultSet rs = XJdbc.query(sql, tuan);
            if (rs.next()) {
                return rs.getInt("SO_NGAY"); // Lấy giá trị của SO_NGAY
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0; // Trả về 0 nếu không tìm thấy
    }
    
    public int getIdKeHoachByIdUser(String id_user) {
        String sql = "SELECT ID_KEHOACH FROM KEHOACH WHERE ID_USER = ?";
        try {
            ResultSet rs = XJdbc.query(sql, id_user);
            if (rs.next()) {
                return rs.getInt("ID_KEHOACH"); 
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0; // Trả về 0 nếu không tìm thấy
    }

    public int getSoTuanByThang(int thang) {
        String sql = "SELECT TUAN FROM KHOABIEU WHERE THANG = ?";
        try {
            ResultSet rs = XJdbc.query(sql, thang);
            if (rs.next()) {
                return rs.getInt("TUAN"); // Lấy giá trị của SO_NGAY
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0; // Trả về 0 nếu không tìm thấy
    }

    public String selectTieuDeByTuan(int tuan, int id_kehoach) {
        String sql = "SELECT * FROM TUAN WHERE ID_TUAN = ? AND ID_KEHOACH = ? ORDER BY ID_KEHOACH ASC;";
        try {
            ResultSet rs = XJdbc.query(sql, tuan, id_kehoach);
            if (rs.next()) {
                return rs.getString("TIEU_DE"); // Lấy tiêu đề từ kết quả
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public String selectGhiChuByTuan(int tuan, int id_kehoach) {
        String sql = "SELECT * FROM TUAN WHERE ID_TUAN = ? AND ID_KEHOACH = ? ORDER BY ID_KEHOACH ASC;";
        try {
            ResultSet rs = XJdbc.query(sql, tuan, id_kehoach);
            if (rs.next()) {
                return rs.getString("GHI_CHU"); // Lấy tiêu đề từ kết quả
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public String selectGhiChuByNgay(int ngay, int id_kehoach) {
        String sql = "SELECT * FROM NGAY WHERE ID_NGAY = ? AND ID_KEHOACH = ? ORDER BY ID_KEHOACH ASC;";
        try {
            ResultSet rs = XJdbc.query(sql, ngay, id_kehoach);
            if (rs.next()) {
                return rs.getString("GHI_CHU"); // Lấy tiêu đề từ kết quả
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public List<Integer> selectIdTuanByThang(int thang) {
        List<Integer> idTuanList = new ArrayList<>();
        String sql = "SELECT ID_TUAN FROM TUAN WHERE THANG = ?";
        try {
            ResultSet rs = XJdbc.query(sql, thang);
            while (rs.next()) {
                idTuanList.add(rs.getInt("ID_TUAN"));
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return idTuanList;
    }

    public int countTuanByThang(int thang) {
        String sql = "SELECT COUNT(*) FROM TUAN WHERE THANG = ?";
        try {
            ResultSet rs = XJdbc.query(sql, thang);
            if (rs.next()) {
                return rs.getInt(1); // Lấy giá trị COUNT(*)
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0; // Trả về 0 nếu không có dữ liệu
    }

    public static void callCapNhatTuan() {
        String sql = "{CALL CapNhatTuan}";
        try {
            XJdbc.update(sql);
            System.out.println("Procedure CapNhatTuan đã được thực thi thành công.");
        } catch (Exception e) {
            System.err.println("Lỗi khi gọi Procedure CapNhatTuan: " + e.getMessage());
        }
    }

    public static void callCapNhatNgay() {
        try {
            XJdbc.update("{CALL CapNhatNgay}");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void callCapNhatTuan(int idKeHoach) {
        try {
            // Gọi procedure bằng cách sử dụng XJdbc
            String sql = "{CALL CapNhatTuan(?)}";
            XJdbc.update(sql, idKeHoach);
            System.out.println("Procedure CapNhatTuan được thực thi thành công cho ID_KEHOACH = " + idKeHoach);
        } catch (Exception e) {
            System.err.println("Lỗi khi gọi procedure CapNhatTuan: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void callCapNhatNgay(int idKeHoach) {
        String sql = "{CALL CapNhatNgay(?)}";
        try {
            XJdbc.update(sql, idKeHoach);
        } catch (Exception e) {
        }
    }
}
