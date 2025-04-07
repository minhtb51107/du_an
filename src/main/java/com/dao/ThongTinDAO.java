package com.dao;

import com.entity.ThongTinCaNhan;
import com.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author PC
 */
public class ThongTinDAO extends DAO<ThongTinCaNhan, String> {

    final String INSERT_SQL = "INSERT INTO THONGTINCANHAN (MaNguoiDung, AnhDaiDien, TenHienThi, HoTen, NgaySinh, GioiTinh, TieuSu) VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE THONGTINCANHAN SET AnhDaiDien=?, TenHienThi=?, HoTen=?, NgaySinh=?, GioiTinh=?, TieuSu=? WHERE MaNguoiDung=?";
    final String DELETE_SQL = "DELETE FROM THONGTINCANHAN WHERE MaNguoiDung=?";
    final String SELECT_ALL_SQL = "SELECT * FROM THONGTINCANHAN";
    final String SELECT_BY_ID_SQL = "SELECT * FROM THONGTINCANHAN WHERE MaNguoiDung=?";

    // === CÁCH 1: DÙNG ENTITY ===
    @Override
    public void insert(ThongTinCaNhan entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaNguoiDung(),
                entity.getAnhDaiDien(),
                entity.getTenHienThi(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getTieuSu());
    }

   
    public void update(ThongTinCaNhan entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getAnhDaiDien(),
                entity.getTenHienThi(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getTieuSu(),
                entity.getMaNguoiDung());
    }

    
    public void delete(String maNguoiDung) {
        XJdbc.update(DELETE_SQL, maNguoiDung);
    }

    
    public ThongTinCaNhan selectById(String maNguoiDung) {
        List<ThongTinCaNhan> list = this.selectBySql(SELECT_BY_ID_SQL, maNguoiDung);
        return list.isEmpty() ? null : list.get(0);
    }

    
    public List<ThongTinCaNhan> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    protected List<ThongTinCaNhan> selectBySql(String sql, Object... args) {
        List<ThongTinCaNhan> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.getStmt(sql, args).executeQuery();
            while (rs.next()) {
                ThongTinCaNhan entity = new ThongTinCaNhan();
                entity.setMaNguoiDung(rs.getString("MaNguoiDung"));
                entity.setAnhDaiDien(rs.getString("AnhDaiDien"));
                entity.setTenHienThi(rs.getString("TenHienThi"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setTieuSu(rs.getString("TieuSu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    // === CÁCH 2: KHÔNG DÙNG ENTITY ===

    public void insert(String maNguoiDung, String anhDaiDien, String tenHienThi, String hoTen, Date ngaySinh, String gioiTinh, String tieuSu) {
        XJdbc.update(INSERT_SQL,
                maNguoiDung,
                anhDaiDien,
                tenHienThi,
                hoTen,
                ngaySinh,
                gioiTinh,
                tieuSu);
    }

    public void update(String maNguoiDung, String anhDaiDien, String tenHienThi, String hoTen, Date ngaySinh, String gioiTinh, String tieuSu) {
        XJdbc.update(UPDATE_SQL,
                anhDaiDien,
                tenHienThi,
                hoTen,
                ngaySinh,
                gioiTinh,
                tieuSu,
                maNguoiDung);
    }

    public void deleteById(String maNguoiDung) {
        XJdbc.update(DELETE_SQL, maNguoiDung);
    }
    
    // === CÁCH 2: TỪNG FIELD RIÊNG ===

    public void updateAnhDaiDien(String maNguoiDung, String anhDaiDien) {
        String sql = "UPDATE THONGTINCANHAN SET AnhDaiDien = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, anhDaiDien, maNguoiDung);
    }

    public void updateTenHienThi(String maNguoiDung, String tenHienThi) {
        String sql = "UPDATE THONGTINCANHAN SET TenHienThi = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, tenHienThi, maNguoiDung);
    }

    public void updateHoTen(String maNguoiDung, String hoTen) {
        String sql = "UPDATE THONGTINCANHAN SET HoTen = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, hoTen, maNguoiDung);
    }

    public void updateNgaySinh(String maNguoiDung, Date ngaySinh) {
        String sql = "UPDATE THONGTINCANHAN SET NgaySinh = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, ngaySinh, maNguoiDung);
    }

    public void updateGioiTinh(String maNguoiDung, boolean gioiTinh) {
        String sql = "UPDATE THONGTINCANHAN SET GioiTinh = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, gioiTinh, maNguoiDung);
    }

    public void updateTieuSu(String maNguoiDung, String tieuSu) {
        String sql = "UPDATE THONGTINCANHAN SET TieuSu = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, tieuSu, maNguoiDung);
    }
    
    // === CÁC PHƯƠNG THỨC TRUY VẤN TỪNG THUỘC TÍNH ===

    public String selectAnhDaiDien(String maNguoiDung) {
        String sql = "SELECT AnhDaiDien FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("AnhDaiDien");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String selectTenHienThi(String maNguoiDung) {
        String sql = "SELECT TenHienThi FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("TenHienThi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String selectHoTen(String maNguoiDung) {
        String sql = "SELECT HoTen FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("HoTen");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date selectNgaySinh(String maNguoiDung) {
        String sql = "SELECT NgaySinh FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getDate("NgaySinh");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Lấy ngày sinh (ngày trong tháng)
public Integer selectNgay(String maNguoiDung) {
    String sql = "SELECT DAY(NgaySinh) AS Ngay FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
    try {
        ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
        if (rs.next()) {
            return rs.getInt("Ngay");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

// Lấy tháng sinh
public Integer selectThang(String maNguoiDung) {
    String sql = "SELECT MONTH(NgaySinh) AS Thang FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
    try {
        ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
        if (rs.next()) {
            return rs.getInt("Thang");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

// Lấy năm sinh
public Integer selectNam(String maNguoiDung) {
    String sql = "SELECT YEAR(NgaySinh) AS Nam FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
    try {
        ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
        if (rs.next()) {
            return rs.getInt("Nam");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}


    public String selectGioiTinh(String maNguoiDung) {
        String sql = "SELECT GioiTinh FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("GioiTinh");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String selectTieuSu(String maNguoiDung) {
        String sql = "SELECT TieuSu FROM THONGTINCANHAN WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("TieuSu");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
