/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.entity.LichSu;
import com.utils.XJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class LichSuDAO {
    
    LichSu lichSu = new LichSu();
    
        private final String dbUrl = "jdbc:sqlserver://localhost:1433;database=du_an_tot_nghiep;encrypt=true;trustServerCertificate=true;";
    private final String dbUser = "sa";
    private final String dbPassword = "123";

    public void saveLoginHistory(String maNguoiDung) {
        String insertSQL = "INSERT INTO LICHSUDANGNHAP (MaNguoiDung, DiaChiIP, ThietBi) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword); PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, maNguoiDung);
            pstmt.setString(2, lichSu.getIPAddress());
            pstmt.setString(3, lichSu.getDeviceInfo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public String selectMaNguoiDungByDiaChiIP(String DiaChiIP) {
        String sql = "SELECT MaNguoiDung FROM LICHSUDANGNHAP WHERE DiaChiIP = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, DiaChiIP).executeQuery();
            if (rs.next()) {
                return rs.getString("MaNguoiDung");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
        
                    // Phương thức để xóa lịch sử đăng nhập từ bảng LICHSUDANGNHAP
    public void deleteLoginHistory(String maNguoiDung) {
        // Câu lệnh SQL để xóa dữ liệu
        String sql = "DELETE FROM LICHSUDANGNHAP WHERE MaNguoiDung = ?";
        
        // Gọi phương thức update từ lớp XJdbc để thực thi câu lệnh DELETE
        try {
            XJdbc.update(sql, maNguoiDung);
            System.out.println("Lịch sử đăng nhập đã được xóa thành công.");
        } catch (RuntimeException e) {
            System.err.println("Lỗi khi xóa lịch sử đăng nhập: " + e.getMessage());
        }
}
}
