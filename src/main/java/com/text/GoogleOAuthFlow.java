package com.text;

import static com.text.GoogleOAuthUtil.getAccessToken;
import java.awt.Desktop;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.json.JSONObject;

public class GoogleOAuthFlow {

    public void main() throws Exception {
        // Bước 1: Khởi động server lắng nghe mã xác thực
        OAuthCallbackServer.startServer();

        // Bước 2: Mở trình duyệt tự động đăng nhập Google
        String authUrl = "https://accounts.google.com/o/oauth2/auth?access_type=offline&client_id=921416426640-0c17hi0qbqicfi0atrc3n2hddrqj4j0k.apps.googleusercontent.com&redirect_uri=http://localhost:3000/auth/google/callback&response_type=code&scope=openid%20https://www.googleapis.com/auth/userinfo.profile%20https://www.googleapis.com/auth/userinfo.email&prompt=consent";
        Desktop.getDesktop().browse(new URI(authUrl));

        // Bước 3: Đợi nhận mã xác thực từ server
        System.out.println("Đang đợi mã xác thực...");
        while (OAuthCallbackServer.getAuthorizationCode() == null) {
            Thread.sleep(1000);
        }
        String authorizationCode = OAuthCallbackServer.getAuthorizationCode();
        System.out.println("Mã xác thực tự động nhận: " + authorizationCode);

        // Bước 4: Sử dụng mã xác thực để lấy Access Token
        String accessToken = getAccessToken(authorizationCode);
        System.out.println("Access Token: " + accessToken);

        // Bước 5: Lấy thông tin tài khoản từ Google API và lưu vào CSDL
        getUserInfoAndSaveToDatabase(accessToken);

        // Bước 6: Đóng server OAuth sau khi hoàn tất
        OAuthCallbackServer.stopServer();
        System.out.println("Server OAuth (cổng 3000) đã được đóng.");
    }

    // Phương thức lấy thông tin người dùng từ Google và lưu vào cơ sở dữ liệu
    private static void getUserInfoAndSaveToDatabase(String accessToken) {
        try {
            String urlString = "https://www.googleapis.com/oauth2/v2/userinfo";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + accessToken);
            conn.setRequestProperty("Accept", "application/json");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                Scanner scanner = new Scanner(conn.getInputStream());
                StringBuilder jsonResponse = new StringBuilder();
                while (scanner.hasNext()) {
                    jsonResponse.append(scanner.nextLine());
                }
                scanner.close();

                // Chuyển đổi JSON thành đối tượng và in ra dữ liệu
                JSONObject userInfo = new JSONObject(jsonResponse.toString());
                String googleId = userInfo.getString("id");
                String email = userInfo.getString("email");
                String name = userInfo.getString("name");
                String picture = userInfo.getString("picture");

//                System.out.println("Thông tin tài khoản Google:");
//                System.out.println("ID: " + googleId);
//                System.out.println("Email: " + email);
//                System.out.println("Tên: " + name);
//                System.out.println("Ảnh đại diện: " + picture);

                // Lưu thông tin vào cơ sở dữ liệu
                saveUserToDatabase(googleId, email, name, picture);

            } else {
                System.out.println("Lỗi khi lấy thông tin người dùng, mã phản hồi: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Kết nối và lưu thông tin người dùng vào bảng NGUOIDUNG
    private static void saveUserToDatabase(String googleId, String email, String name, String picture) {
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
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

}
