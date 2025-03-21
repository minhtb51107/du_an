package com.text;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class OAuthCallbackServer {
    private static HttpServer server;
    private static String authorizationCode;

    public static void startServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(3000), 0);
        server.createContext("/auth/google/callback", new CallbackHandler());
        server.setExecutor(null); // Sử dụng executor mặc định
        server.start();
        System.out.println("Server đã khởi động trên http://localhost:3000");
    }

    public static void stopServer() {
        if (server != null) {
            server.stop(0); // Dừng server ngay lập tức
            System.out.println("Server đã dừng.");
        }
    }

    public static String getAuthorizationCode() {
        return authorizationCode;
    }

    // Xử lý yêu cầu khi nhận mã xác thực từ Google
    static class CallbackHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            if (query != null && query.contains("code=")) {
                authorizationCode = query.split("code=")[1].split("&")[0];
                String response = "Đã nhận mã xác thực! Bạn có thể quay lại ứng dụng.";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

                // Tự động dừng server ngay khi nhận mã xác thực
                stopServer();
            }
        }
    }
}
