package com.service;

import com.dao.KhoaBieuDAO;
import com.dao.UserDAO;
import com.entity.NguoiDung;
import com.ui.MainFrame;
//import static com.text.GoogleOAuthUtil.getAccessToken;
import com.text.OAuthCallbackServer;
import static com.utils.GoogleOAuthUtil.getAccessToken;
import java.awt.Desktop;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class GoogleAuthService {

    public void main() throws Exception {
        // Bước 1: Khởi động server lắng nghe mã xác thực
        OAuthCallbackServer.startServer();

        // Bước 2: Mở trình duyệt tự động đăng nhập Google
        String authUrl = "https://accounts.google.com/o/oauth2/auth?access_type=offline&client_id=921416426640-0c17hi0qbqicfi0atrc3n2hddrqj4j0k.apps.googleusercontent.com&redirect_uri=http://localhost:3000/auth/google/callback&response_type=code&scope=openid%20https://www.googleapis.com/auth/userinfo.profile%20https://www.googleapis.com/auth/userinfo.email&prompt=consent";
        Desktop.getDesktop().browse(new URI(authUrl));

        // Bước 3: Đợi nhận mã xác thực từ server
        //System.out.println("Đang đợi mã xác thực...");
        while (OAuthCallbackServer.getAuthorizationCode() == null) {
            Thread.sleep(1000);
        }
        String authorizationCode = OAuthCallbackServer.getAuthorizationCode();
        //System.out.println("Mã xác thực tự động nhận: " + authorizationCode);

        // Bước 4: Sử dụng mã xác thực để lấy Access Token
        String accessToken = getAccessToken(authorizationCode);
        //System.out.println("Access Token: " + accessToken);

        // Bước 5: Lấy thông tin tài khoản từ Google API và lưu vào CSDL
        getUserInfoAndSaveToDatabase(accessToken);
        
        JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
        MainFrame lg = new MainFrame("");
        lg.setVisible(true);

        // Bước 6: Đóng server OAuth sau khi hoàn tất
        OAuthCallbackServer.stopServer();
        //System.out.println("Server OAuth (cổng 3000) đã được đóng.");
    }

    // Phương thức lấy thông tin người dùng từ Google và lưu vào cơ sở dữ liệu
    private static void getUserInfoAndSaveToDatabase(String accessToken) throws SQLException {
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
                
                NguoiDung nguoiDung = new NguoiDung();

//                System.out.println("Thông tin tài khoản Google:");
//                System.out.println("ID: " + googleId);
//                System.out.println("Email: " + email);
//                System.out.println("Tên: " + name);
//                System.out.println("Ảnh đại diện: " + picture);

                // Lưu thông tin vào cơ sở dữ liệu
                UserDAO us = new UserDAO();
                us.saveUserToDatabase(googleId, email, name, picture);               
                
            } else {
                System.out.println("Lỗi khi lấy thông tin người dùng, mã phản hồi: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
