package com.dao;

import com.entity.LichSu;
import com.entity.NguoiDung;
import com.utils.Auth;
import com.utils.XJdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO /*extends DAO<NguoiDung, String>*/ {

    private final String dbUrl = "jdbc:sqlserver://localhost:1433;database=du_an_tot_nghiep;encrypt=true;trustServerCertificate=true;";
    private final String dbUser = "sa";
    private final String dbPassword = "123";

    public void saveUserToDatabase(String googleId, String email, String name, String picture) throws SQLException {
        String dbUrl = "jdbc:sqlserver://localhost:1433;database=du_an_tot_nghiep;encrypt=true;trustServerCertificate=true;";
        String dbUser = "sa";
        String dbPassword = "123";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            System.out.println("Kết nối cơ sở dữ liệu thành công!");

            // Kiểm tra người dùng đã tồn tại chưa
            String checkUserSql = "SELECT * FROM NGUOIDUNG WHERE Email = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkUserSql)) {
                checkStmt.setString(1, email);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Người dùng đã tồn tại trong hệ thống.");
                    UserDAO us = new UserDAO();
                    NguoiDung nguoiDung = new NguoiDung();
                    String a = us.getMaNguoiDungByEmail(email);
                    nguoiDung.setMaNguoiDung(a);
                    
                    String maND = nguoiDung.getMaNguoiDung();
                    LichSu lichSu = new LichSu();

                    LichSuDAO lichSuDAO = new LichSuDAO();
                    String maND1 = lichSuDAO.selectMaNguoiDungByDiaChiIP(lichSu.getIPAddress());
                    if(maND1 == null){
                        lichSuDAO.saveLoginHistory(maND);
                    } 
                } else {
                    // Lấy mã người dùng mới, đảm bảo mã bắt đầu từ ND021 trở đi
                    String newUserCode = generateNewUserCode(connection);

                    // Thêm người dùng mới vào bảng NGUOIDUNG
                    String insertSql = "INSERT INTO NGUOIDUNG (MaNguoiDung, TenDangNhap, MatKhau, HoTen, Email, SoDienThoai, Quyen, TrangThai) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement insertStmt = connection.prepareStatement(insertSql)) {
                        insertStmt.setString(1, newUserCode); // Mã người dùng mới
                        insertStmt.setString(2, email); // Tên đăng nhập là email
                        insertStmt.setString(3, "GoogleOAuth"); // Mật khẩu mặc định
                        insertStmt.setString(4, name);
                        insertStmt.setString(5, email);
                        insertStmt.setString(6, ""); // Số điện thoại (để trống nếu không có)
                        insertStmt.setString(7, "User"); // Quyền mặc định là User
                        insertStmt.setBoolean(8, true); // Trạng thái kích hoạt

                        int rowsInserted = insertStmt.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Người dùng mới đã được thêm vào cơ sở dữ liệu.");
                            UserDAO us = new UserDAO();
                            NguoiDung nguoiDung = new NguoiDung();
                            String a = us.getMaNguoiDungByEmail(email);
                            nguoiDung.setMaNguoiDung(a);
                            KhoaBieuDAO kb = new KhoaBieuDAO();
                            //System.out.println("a " + a);
                            if (a != null) {
                                kb.insertKeHoach(a);
                            }
                            nguoiDung.setMaNguoiDung(a);
                            //System.out.println("getMaNguoiDung " + nguoiDung.getMaNguoiDung());
                        }

                        // === Thêm dòng mới vào bảng THONGTINCANHAN ===
                        String insertInfoSql = "INSERT INTO THONGTINCANHAN (MaNguoiDung, AnhDaiDien, TenHienThi, HoTen, NgaySinh, GioiTinh, TieuSu) "
                                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
                        try (PreparedStatement infoStmt = connection.prepareStatement(insertInfoSql)) {
                            infoStmt.setString(1, newUserCode);
                            infoStmt.setString(2, picture); // Ảnh đại diện từ Google
                            infoStmt.setString(3, name); // Tên hiển thị
                            infoStmt.setString(4, name); // Họ tên
                            infoStmt.setNull(5, Types.DATE); // Ngày sinh để null
                            infoStmt.setString(6, "none"); // Giới tính mặc định
                            infoStmt.setString(7, ""); // Tiểu sử trống
                            infoStmt.executeUpdate();
                            System.out.println("Đã thêm thông tin cá nhân cho người dùng mới.");
                        }

                        LichSuDAO lichSuDAO = new LichSuDAO();
                        lichSuDAO.saveLoginHistory(newUserCode);    
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

// Tạo mã người dùng mới theo đúng format (ND021 trở đi)
    private static String generateNewUserCode(Connection connection) throws SQLException {
        String getMaxCodeSql = "SELECT TOP 1 MaNguoiDung FROM NGUOIDUNG WHERE MaNguoiDung LIKE 'ND%' ORDER BY MaNguoiDung DESC";
        try (PreparedStatement stmt = connection.prepareStatement(getMaxCodeSql)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String lastCode = rs.getString("MaNguoiDung");
                int newCodeNumber = Integer.parseInt(lastCode.substring(2)) + 1;
                return String.format("ND%03d", newCodeNumber);
            } else {
                return "ND021"; // Trả về mã mặc định đầu tiên nếu chưa có người dùng nào
            }
        }
    }

    public void updatePassword(String maNguoiDung, String newPassword) {
        String sql = "UPDATE NGUOIDUNG SET MatKhau = ? WHERE MaNguoiDung = ?";

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newPassword); // Có thể hash mật khẩu ở đây (bcrypt, SHA-256)
            pstmt.setString(2, maNguoiDung);
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void registerUser(String email, String password, String username) {
        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            System.out.println("Kết nối cơ sở dữ liệu thành công!");

            // Kiểm tra email đã tồn tại chưa
            String checkUserSql = "SELECT * FROM NGUOIDUNG WHERE Email = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkUserSql)) {
                checkStmt.setString(1, email);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Email đã tồn tại. Vui lòng sử dụng email khác.");
                    return;
                }
            }

            // Lấy mã người dùng mới
            String newUserCode = generateNewUserCode(connection);

            // Thêm người dùng mới vào bảng NGUOIDUNG
            String insertSql = "INSERT INTO NGUOIDUNG (MaNguoiDung, TenDangNhap, MatKhau, HoTen, Email, SoDienThoai, Quyen, TrangThai) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertStmt = connection.prepareStatement(insertSql)) {
                insertStmt.setString(1, newUserCode); // Mã người dùng mới
                insertStmt.setString(2, username); // Tên đăng nhập là email
                insertStmt.setString(3, password); // Mật khẩu do người dùng nhập vào
                insertStmt.setString(4, "");
                insertStmt.setString(5, email);
                insertStmt.setString(6, ""); // Số điện thoại
                insertStmt.setString(7, "User"); // Quyền mặc định là User
                insertStmt.setBoolean(8, true); // Trạng thái kích hoạt

                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Người dùng mới đã được thêm vào cơ sở dữ liệu.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateTieuSu(String maNguoiDung, String MatKhau) {
        String sql = "UPDATE NGUOIDUNG SET MatKhau = ? WHERE MaNguoiDung = ?";
        XJdbc.update(sql, MatKhau, maNguoiDung);
    }

    public NguoiDung selectById(String maNguoiDung) {
        String sql = "SELECT * FROM NGUOIDUNG WHERE TenDangNhap = ?";
        List<NguoiDung> list = this.selectBySql(sql, maNguoiDung);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NguoiDung> selectAll() {
        String sql = "SELECT * FROM NGUOIDUNG";
        return selectBySql(sql);
    }

    public String getMaNguoiDungByEmail(String email) {
        String sql = "SELECT MaNguoiDung FROM NGUOIDUNG WHERE Email = ?";
        try (ResultSet rs = XJdbc.query(sql, email)) {
            if (rs.next()) {
                return rs.getString("MaNguoiDung");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String selectEmail(String maNguoiDung) {
        String sql = "SELECT Email FROM NGUOIDUNG WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("Email");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String selectSDT(String maNguoiDung) {
        String sql = "SELECT SoDienThoai FROM NGUOIDUNG WHERE MaNguoiDung = ?";
        try {
            ResultSet rs = XJdbc.getStmt(sql, maNguoiDung).executeQuery();
            if (rs.next()) {
                return rs.getString("SoDienThoai");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NguoiDung entity = new NguoiDung();
                    entity.setMaNguoiDung(rs.getString("MaNguoiDung"));
                    entity.setTenDangNhap(rs.getString("TenDangNhap"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setSoDienThoai(rs.getString("SoDienThoai"));
                    entity.setQuyen(rs.getString("Quyen"));
                    entity.setTrangThai(rs.getBoolean("TrangThai"));
                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
