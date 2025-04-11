/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.entity.Diem;
import com.entity.DiemTrungBinhBaiHocChinh;
import com.entity.DiemTrungKhoaHoc;
import com.utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class BaiHocDAO {

    public Integer getMaBaiHocChiTietByTen(String tenBaiHocChiTiet) {
        String sql = "SELECT MaBaiHocChiTiet FROM BaiHocChiTiet WHERE TenBaiHocChiTiet = ?";
        try (PreparedStatement pstmt = com.utils.XJdbc.prepareStatement(sql, tenBaiHocChiTiet); ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("MaBaiHocChiTiet");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi truy vấn MaBaiHocChiTiet", e);
        }
        return null; // Không tìm thấy
    }

    public void insertDiem(String maNguoiDung, int maBaiHocChiTiet, double soDiem) {
        String sql = "INSERT INTO DIEM (MaNguoiDung, MaBaiHocChiTiet, SoDiem) VALUES (?, ?, ?)";
        XJdbc.executeUpdate(sql, maNguoiDung, maBaiHocChiTiet, soDiem);
    }

    public int countDiemByNguoiDungAndBaiHoc(String maNguoiDung, int maBaiHocChiTiet) {
        String sql = "SELECT COUNT(*) FROM DIEM WHERE MaNguoiDung = ? AND MaBaiHocChiTiet = ?";
        try {
            ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung, maBaiHocChiTiet);
            if (rs.next()) {
                return rs.getInt(1);
            }
            rs.getStatement().getConnection().close(); // Đóng kết nối nếu cần
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public void updateDiem(String maNguoiDung, int maBaiHocChiTiet, double soDiemMoi) {
        String sql = "UPDATE DIEM SET SoDiem = ? WHERE MaNguoiDung = ? AND MaBaiHocChiTiet = ?";
        XJdbc.executeUpdate(sql, soDiemMoi, maNguoiDung, maBaiHocChiTiet);
    }

    public Diem getDiemByMaBaiHocConAndNguoiDung(int maBaiHocCon, String maNguoiDung) {
        String sql = """
        SELECT d.SoDiem, d.MaNguoiDung, d.MaBaiHocChiTiet
        FROM DIEM d
        JOIN BaiHocChiTiet bhct ON d.MaBaiHocChiTiet = bhct.MaBaiHocChiTiet
        WHERE bhct.MaBaiHocCon = ? 
          AND d.MaNguoiDung = ?
        """;

        try (ResultSet rs = XJdbc.executeQuery(sql, maBaiHocCon, maNguoiDung)) {
            if (rs.next()) {
                Diem diem = new Diem();
                diem.setSoDiem(rs.getDouble("SoDiem"));
                diem.setMaNguoiDung(rs.getString("MaNguoiDung"));
                diem.setMaBaiHocChiTiet(rs.getInt("MaBaiHocChiTiet"));
                return diem;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public List<Diem> getDanhSachDiemByNguoiDungVaBaiHocCon(String maNguoiDung, int maBaiHocCon) {
        List<Diem> list = new ArrayList<>();
        String sql = """
        SELECT d.SoDiem, d.MaNguoiDung, d.MaBaiHocChiTiet
        FROM DIEM d
        JOIN BaiHocChiTiet bhct ON d.MaBaiHocChiTiet = bhct.MaBaiHocChiTiet
        WHERE d.MaNguoiDung = ?
          AND bhct.MaBaiHocCon = ?
        """;

        try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung, maBaiHocCon)) {
            while (rs.next()) {
                Diem diem = new Diem();
                diem.setSoDiem(rs.getDouble("SoDiem"));
                diem.setMaNguoiDung(rs.getString("MaNguoiDung"));
                diem.setMaBaiHocChiTiet(rs.getInt("MaBaiHocChiTiet"));
                list.add(diem);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public Integer getMaBaiHocConByTen(String tenBaiHocCon) {
        String sql = "SELECT MaBaiHocCon FROM BaiHocCon WHERE TenBaiHocCon = ?";

        try (ResultSet rs = XJdbc.executeQuery(sql, tenBaiHocCon)) {
            if (rs.next()) {
                return rs.getInt("MaBaiHocCon");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null; // Nếu không tìm thấy
    }

    public Double getDiemTrungBinh(String maNguoiDung, int maBaiHocCon, int maBaiHocChinh) {
        String sql = """
        SELECT 
            SUM(d.SoDiem) * 1.0 / 
            (SELECT COUNT(*) FROM BaiHocCon WHERE MaBaiHocChinh = ?) AS DiemTrungBinh
        FROM DIEM d
        JOIN BaiHocChiTiet bhct ON d.MaBaiHocChiTiet = bhct.MaBaiHocChiTiet
        WHERE bhct.MaBaiHocCon = ? 
          AND d.MaNguoiDung = ?
        """;

        try (ResultSet rs = XJdbc.executeQuery(sql, maBaiHocChinh, maBaiHocCon, maNguoiDung)) {
            if (rs.next()) {
                return rs.getDouble("DiemTrungBinh");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0.0; // Nếu không có dữ liệu thì trả về 0.0
    }

    public List<DiemTrungBinhBaiHocChinh> getDiemTrungBinhBaiHocChinh(String maNguoiDung, int maKhoaHoc) {
        List<DiemTrungBinhBaiHocChinh> list = new ArrayList<>();

        String sql = """
        WITH DiemTheoCon AS (
            SELECT
                bhc.MaBaiHocChinh,
                bhc.MaBaiHocCon,
                SUM(COALESCE(d.SoDiem, 0)) AS TongDiem,
                COUNT(bhct.MaBaiHocChiTiet) AS SoLuongChiTiet
            FROM BaiHocCon bhc
            JOIN BaiHocChiTiet bhct ON bhct.MaBaiHocCon = bhc.MaBaiHocCon
            LEFT JOIN DIEM d ON d.MaBaiHocChiTiet = bhct.MaBaiHocChiTiet
                AND d.MaNguoiDung = ?
            GROUP BY bhc.MaBaiHocChinh, bhc.MaBaiHocCon
        ),
        DiemTB_Con AS (
            SELECT
                MaBaiHocChinh,
                MaBaiHocCon,
                CASE 
                    WHEN SoLuongChiTiet > 0 
                    THEN TongDiem * 1.0 / SoLuongChiTiet 
                    ELSE NULL 
                END AS DiemTB_Con
            FROM DiemTheoCon
        )
        SELECT
            kh.MaKhoaHoc,
            kh.TenKhoaHoc,
            bhch.MaBaiHocChinh,
            bhch.TenBaiHocChinh,
            COALESCE(AVG(COALESCE(dtc.DiemTB_Con, 0)), 0) AS DiemTrungBinhBaiHocChinh
        FROM BaiHocChinh bhch
        JOIN KhoaHoc kh ON bhch.MaKhoaHoc = kh.MaKhoaHoc
        LEFT JOIN BaiHocCon bhc ON bhc.MaBaiHocChinh = bhch.MaBaiHocChinh
        LEFT JOIN DiemTB_Con dtc ON dtc.MaBaiHocChinh = bhch.MaBaiHocChinh
        WHERE kh.MaKhoaHoc = ?
        GROUP BY kh.MaKhoaHoc, kh.TenKhoaHoc, bhch.MaBaiHocChinh, bhch.TenBaiHocChinh
        """;

        try (ResultSet rs = XJdbc.executeQuery(sql, maNguoiDung, maKhoaHoc)) {
            while (rs.next()) {
                DiemTrungBinhBaiHocChinh item = new DiemTrungBinhBaiHocChinh();
                item.setMaKhoaHoc(rs.getInt("MaKhoaHoc"));
                item.setTenKhoaHoc(rs.getString("TenKhoaHoc"));
                item.setMaBaiHocChinh(rs.getInt("MaBaiHocChinh"));
                item.setTenBaiHocChinh(rs.getString("TenBaiHocChinh"));
                item.setDiemTrungBinhBaiHocChinh(rs.getDouble("DiemTrungBinhBaiHocChinh"));
                list.add(item);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public Integer getMaKhoaHocByTen(String tenKhoaHoc) {
        String sql = "SELECT MaKhoaHoc FROM KhoaHoc WHERE TenKhoaHoc = ?";
        try (ResultSet rs = XJdbc.executeQuery(sql, tenKhoaHoc)) {
            if (rs.next()) {
                return rs.getInt("MaKhoaHoc");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null; // Nếu không tìm thấy
    }

    public List<DiemTrungKhoaHoc> getDiemTrungBinhBaiHocChinh(String maNguoiDung) {
    List<DiemTrungKhoaHoc> list = new ArrayList<>();
    
    String sql = """
        WITH DiemTheoCon AS (
            SELECT
                bhc.MaBaiHocChinh,
                bhc.MaBaiHocCon,
                SUM(COALESCE(d.SoDiem, 0)) AS TongDiem,
                COUNT(bhct.MaBaiHocChiTiet) AS SoLuongChiTiet
            FROM BaiHocCon bhc
            JOIN BaiHocChiTiet bhct ON bhct.MaBaiHocCon = bhc.MaBaiHocCon
            LEFT JOIN DIEM d ON d.MaBaiHocChiTiet = bhct.MaBaiHocChiTiet
                            AND d.MaNguoiDung = ?
            GROUP BY bhc.MaBaiHocChinh, bhc.MaBaiHocCon
        ),
        DiemTB_Con AS (
            SELECT
                MaBaiHocChinh,
                MaBaiHocCon,
                CASE 
                    WHEN SoLuongChiTiet > 0 THEN TongDiem * 1.0 / SoLuongChiTiet
                    ELSE NULL
                END AS DiemTB_Con
            FROM DiemTheoCon
        ),
        DiemTB_Chinh AS (
            SELECT
                bhch.MaKhoaHoc,
                bhch.MaBaiHocChinh,
                COALESCE(AVG(COALESCE(dtc.DiemTB_Con, 0)), 0) AS DiemTB_BaiHocChinh
            FROM BaiHocChinh bhch
            LEFT JOIN BaiHocCon bhc ON bhc.MaBaiHocChinh = bhch.MaBaiHocChinh
            LEFT JOIN DiemTB_Con dtc ON dtc.MaBaiHocCon = bhc.MaBaiHocCon
            GROUP BY bhch.MaKhoaHoc, bhch.MaBaiHocChinh
        )
        SELECT MaKhoaHoc, MaBaiHocChinh, DiemTB_BaiHocChinh
        FROM DiemTB_Chinh
        """;
    
    try {
        PreparedStatement pstmt = XJdbc.prepareStatement(sql, maNguoiDung);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            DiemTrungKhoaHoc diem = new DiemTrungKhoaHoc();
            diem.setMaKhoaHoc(rs.getString("MaKhoaHoc"));
            diem.setMaBaiHocChinh(rs.getString("MaBaiHocChinh"));
            diem.setDiemTrungBinh(rs.getDouble("DiemTB_BaiHocChinh"));
            
            list.add(diem);
        }
        
        rs.getStatement().getConnection().close(); // Đóng kết nối
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    return list;
}

}
