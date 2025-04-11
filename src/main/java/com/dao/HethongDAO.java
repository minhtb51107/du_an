/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class HethongDAO {

    public void insertHeThong(String maNguoiDung, String baiHocHienTai) {
        String sql = "INSERT INTO HeThong (MaNguoiDung, BaiHocHienTai) VALUES (?, ?)";

        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung, baiHocHienTai);
            pstmt.executeUpdate();
            pstmt.getConnection().close(); // Đóng kết nối sau khi dùng xong
            System.out.println("Chèn dữ liệu vào bảng HeThong thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi khi chèn dữ liệu vào bảng HeThong: " + ex.getMessage());
        }
    }

    public String getBaiHocHienTai(String maNguoiDung) {
        String sql = "SELECT BaiHocHienTai FROM HeThong WHERE MaNguoiDung = ?";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String baiHocHienTai = rs.getString("BaiHocHienTai");
                rs.getStatement().getConnection().close(); // Đóng kết nối
                return baiHocHienTai;
            } else {
                rs.getStatement().getConnection().close(); // Đóng kết nối
                return null; // Không có dữ liệu
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void updateBaiHocHienTai(String maNguoiDung, String baiHocHienTai) {
        String sql = "UPDATE HeThong SET BaiHocHienTai = ? WHERE MaNguoiDung = ?";
        try {
            PreparedStatement pstmt = XJdbc.prepareStatement(sql, baiHocHienTai, maNguoiDung);
            int rowsUpdated = pstmt.executeUpdate();
            pstmt.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
