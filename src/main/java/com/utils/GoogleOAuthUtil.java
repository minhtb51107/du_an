package com.utils;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class GoogleOAuthUtil {

    private static final String CLIENT_ID = "921416426640-0c17hi0qbqicfi0atrc3n2hddrqj4j0k.apps.googleusercontent.com";
    private static final String CLIENT_SECRET = "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";
    private static final String REDIRECT_URI = "http://localhost:3000/auth/google/callback";
    private static final String TOKEN_SERVER_URL = "https://oauth2.googleapis.com/token";
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    public static void main(String[] args) throws Exception {
        // Bước 1: Tạo link xác thực và mở trình duyệt
        String authUrl = "https://accounts.google.com/o/oauth2/auth?access_type=offline&client_id="
                + CLIENT_ID
                + "&redirect_uri=" + REDIRECT_URI
                + "&response_type=code&scope=openid%20https://www.googleapis.com/auth/userinfo.profile%20https://www.googleapis.com/auth/userinfo.email&prompt=consent";

        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(authUrl));
        } else {
            System.out.println("Mở trình duyệt không được, hãy copy link sau và dán vào trình duyệt:");
            System.out.println(authUrl);
        }

        // Bước 2: Nhập mã xác thực từ người dùng
        System.out.print("Nhập mã xác thực (authorization code) từ trình duyệt: ");
        Scanner scanner = new Scanner(System.in);
        String authorizationCode = scanner.nextLine();

        // Bước 3: Lấy access token từ mã xác thực
        String accessToken = getAccessToken(authorizationCode);
        System.out.println("Access Token: " + accessToken);
        scanner.close();
    }

    public static String getAccessToken(String authCode) throws Exception {
        System.out.println("Auth Code: " + authCode); // Kiểm tra mã xác thực
        GoogleAuthorizationCodeTokenRequest tokenRequest = new GoogleAuthorizationCodeTokenRequest(
                new NetHttpTransport(),
                JSON_FACTORY,
                "https://oauth2.googleapis.com/token",
                CLIENT_ID,
                CLIENT_SECRET,
                authCode,
                REDIRECT_URI
        );

        TokenResponse tokenResponse = tokenRequest.execute();
        System.out.println("Access Token: " + tokenResponse.getAccessToken()); // In ra access token

        return tokenResponse.getAccessToken();
    }
}
