package com.dao;

import com.entity.CongViec;
import com.entity.NguoiDung;
import com.utils.XJdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CongViecDAO {

    // Thêm công việc, trả về ID mới tạo
public int insert(CongViec cv) {
    String sql = "INSERT INTO CongViec (TieuDe, MoTa, NgayHetHan, DoUuTien, TrangThai, MaNguoiDung, TrangThaiKanban) VALUES (?, ?, ?, ?, ?, ?, ?)";
    int generatedId = -1;

    try (
        Connection conn = XJdbc.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
    ) {
        ps.setString(1, cv.getTieuDe());
        ps.setString(2, cv.getMoTa());
        ps.setString(3, cv.getNgayHetHan());
        ps.setString(4, cv.getDoUuTien());
        ps.setBoolean(5, cv.isTrangThai());
        ps.setString(6, cv.getMaNguoiDung());
        ps.setString(7, cv.getTrangThaiKanban());

        ps.executeUpdate();

        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
        }

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    return generatedId;
}

    NguoiDung nguoiDung = new NguoiDung();
    private String maNguoiDung = nguoiDung.getMaNguoiDung();
    
    // Cập nhật công việc
public void update(CongViec cv) {
    String sql = "UPDATE CongViec SET TieuDe = ?, MoTa = ?, NgayHetHan = ?, DoUuTien = ?, TrangThai = ?, TrangThaiKanban = ? WHERE MaCongViec = ?";

    try (
        Connection conn = XJdbc.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)
    ) {
        ps.setString(1, cv.getTieuDe());
        ps.setString(2, cv.getMoTa());
        ps.setString(3, cv.getNgayHetHan());
        ps.setString(4, cv.getDoUuTien());
        ps.setBoolean(5, cv.isTrangThai());
        ps.setString(6, cv.getTrangThaiKanban());
        ps.setInt(7, cv.getMaCongViec());

        ps.executeUpdate();

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

// Xóa công việc theo mã công việc
public void delete(int maCongViec) {
    String sql = "DELETE FROM CongViec WHERE MaCongViec = ?";

    try (
        Connection conn = XJdbc.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)
    ) {
        ps.setInt(1, maCongViec);
        ps.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}


public List<CongViec> getAllByNguoiDung(String maNguoiDung) {
    List<CongViec> list = new ArrayList<>();
    String sql = "SELECT * FROM CongViec WHERE MaNguoiDung = ?";

    try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung)) {
        while (rs.next()) {
            CongViec cv = readFromResultSet(rs);
            list.add(cv);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    return list;
}


    // Lấy tất cả công việc theo mã người dùng
public List<CongViec> getByNguoiDungVaTrangThaiKanban(String maNguoiDung, String trangThaiKanban) {
    List<CongViec> list = new ArrayList<>();
    String sql = "SELECT * FROM CongViec WHERE MaNguoiDung = ? AND TrangThaiKanban = ?";

    try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung, trangThaiKanban)) {
        while (rs.next()) {
            CongViec cv = readFromResultSet(rs);
            list.add(cv);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    return list;
}

    
    public List<CongViec> selectByTrangThaiKanban(String trangThaiKanban, String maNguoiDung) {
    String sql = "SELECT * FROM CongViec WHERE TrangThaiKanban = ? AND MaNguoiDung = ?";
    List<CongViec> list = new ArrayList<>();
    try (Connection conn = XJdbc.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, trangThaiKanban);
        ps.setString(2, maNguoiDung);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(readFromResultSet(rs));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    private CongViec readFromResultSet(ResultSet rs) throws SQLException {
    CongViec cv = new CongViec();
    cv.setMaCongViec(rs.getInt("MaCongViec"));
    cv.setTieuDe(rs.getString("TieuDe"));
    cv.setMoTa(rs.getString("MoTa"));
    cv.setNgayHetHan(rs.getString("NgayHetHan"));
    cv.setDoUuTien(rs.getString("DoUuTien"));
    cv.setTrangThai(rs.getBoolean("TrangThai"));
    cv.setNgayTao(rs.getTimestamp("NgayTao"));
    cv.setMaNguoiDung(rs.getString("MaNguoiDung"));
    cv.setTrangThaiKanban(rs.getString("TrangThaiKanban"));
    return cv;
}

}
