package com.dao;

import com.entity.ThoiGianHoatDong;
import com.utils.XJdbc;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ThoiGianHoatDongDAO {

    // Thêm mới
    public void insert(String maNguoiDung, Date ngayHoatDong, int thoiGianTongHop) {
        String sql = "INSERT INTO THOIGIAN_HOATDONG (MaNguoiDung, NgayHoatDong, ThoiGianTongHop) VALUES (?, ?, ?)";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung, ngayHoatDong, thoiGianTongHop);
            pstmt.executeUpdate();
            pstmt.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Xóa theo mã hoạt động
    public void delete(int maHoatDong) {
        String sql = "DELETE FROM THOIGIAN_HOATDONG WHERE MaHoatDong = ?";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, maHoatDong);
            pstmt.executeUpdate();
            pstmt.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Cập nhật thời gian tổng hợp theo mã hoạt động
    public void update(int maHoatDong, int thoiGianTongHop) {
        String sql = "UPDATE THOIGIAN_HOATDONG SET ThoiGianTongHop = ? WHERE MaHoatDong = ?";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, thoiGianTongHop, maHoatDong);
            pstmt.executeUpdate();
            pstmt.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Truy vấn tất cả hoạt động của một người dùng
    public List<ThoiGianHoatDong> selectByMaNguoiDung(String maNguoiDung) {
        List<ThoiGianHoatDong> list = new ArrayList<>();
        String sql = "SELECT * FROM THOIGIAN_HOATDONG WHERE MaNguoiDung = ?";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ThoiGianHoatDong tg = new ThoiGianHoatDong();
                tg.setMaHoatDong(rs.getInt("MaHoatDong"));
                tg.setMaNguoiDung(rs.getString("MaNguoiDung"));
                tg.setNgayHoatDong(rs.getDate("NgayHoatDong"));
                tg.setThoiGianTongHop(rs.getInt("ThoiGianTongHop"));
                list.add(tg);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public ThoiGianHoatDong findByMaNguoiDungAndDate(String maNguoiDung, Date ngayHoatDong) {
    String sql = "SELECT * FROM THOIGIAN_HOATDONG WHERE MaNguoiDung = ? AND NgayHoatDong = ?";
    try {
        PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung, ngayHoatDong);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            ThoiGianHoatDong thoiGianHoatDong = new ThoiGianHoatDong();
            thoiGianHoatDong.setMaHoatDong(rs.getInt("MaHoatDong"));
            thoiGianHoatDong.setMaNguoiDung(rs.getString("MaNguoiDung"));
            thoiGianHoatDong.setNgayHoatDong(rs.getDate("NgayHoatDong"));
            thoiGianHoatDong.setThoiGianTongHop(rs.getInt("ThoiGianTongHop"));
            rs.getStatement().getConnection().close();
            return thoiGianHoatDong;
        }
        rs.getStatement().getConnection().close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return null;
}

    public Map<LocalDate, Integer> getTongThoiGianTheoNgay(String maNguoiDung, LocalDate startDate, LocalDate endDate) {
    String sql = "SELECT NgayHoatDong, SUM(ThoiGianTongHop) AS TongThoiGian "
               + "FROM THOIGIAN_HOATDONG "
               + "WHERE MaNguoiDung = ? AND NgayHoatDong BETWEEN ? AND ? "
               + "GROUP BY NgayHoatDong "
               + "ORDER BY NgayHoatDong";
    
    Map<LocalDate, Integer> result = new LinkedHashMap<>();
    
    try {
        PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung, Date.valueOf(startDate), Date.valueOf(endDate));
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            LocalDate date = rs.getDate("NgayHoatDong").toLocalDate();
            int totalTime = rs.getInt("TongThoiGian");
            result.put(date, totalTime);
        }
        
        rs.getStatement().getConnection().close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    return result;
}

}
