/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.entity.KhoaBieu;
import com.utils.XJdbc;
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
        String sql = "INSERT INTO KHOABIEU (TUAN) VALUES (?)";
        XJdbc.update(sql,
                //                model.getPanelIndex(),
                model.getTuan());
    }

    public void insertTuan(int thang, int tuan, int soNgay, String tieuDe) {
        String sql = "INSERT INTO TUAN (THANG, ID_TUAN, SO_NGAY, TIEU_DE) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, thang, tuan, soNgay, tieuDe);
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

    public List<int[]> getAllData() {
        List<int[]> dataList = new ArrayList<>();
        String sql = "SELECT THANG, TUAN FROM KHOABIEU";

        try {
            ResultSet rs = XJdbc.query(sql);
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
        String sql = "UPDATE KHOABIEU SET TUAN = ? WHERE THANG = ?";
        XJdbc.update(sql,
                model.getTuan(), // Cập nhật TUAN
                model.getThang()); // Điều kiện WHERE dựa trên THANG
    }

    public void updateSoNgayTheoTuan(int soNgay, int tuan) {
        String sql = "UPDATE TUAN SET SO_NGAY = ? WHERE ID_TUAN = ?";
        XJdbc.update(sql, soNgay, tuan);
    }

    public void updateTieuDeCuaTuan(String tieuDe, int tuan) {
        String sql = "UPDATE TUAN SET Tieu_De = ? WHERE ID_TUAN = ?";
        XJdbc.update(sql, tieuDe, tuan);
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

    public String selectTieuDeByTuan(int tuan, int thang) {
        String sql = "SELECT TIEU_DE FROM TUAN WHERE ID_TUAN = ? AND THANG = ?";
        try {
            ResultSet rs = XJdbc.query(sql, tuan, thang);
            if (rs.next()) {
                return rs.getString("TIEU_DE"); // Lấy tiêu đề từ kết quả
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

}
