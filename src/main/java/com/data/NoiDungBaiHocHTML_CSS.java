/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class NoiDungBaiHocHTML_CSS {
    
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        Index_MAP.put("Giới Thiệu HTML", new int[]{
            0, 1, 0, 1, 2, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("Lịch Sử Phát Triển Của HTML", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Cách HTML Hoạt Động", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1});
        Index_MAP.put("Các Phần Của Tài Liệu HTML", new int[]{
            0, 2, 1, 0, 2, 1, 2, 0, 1, 2, 1, 1, 2, 1, 0, 2, 0, 1});
        Index_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new int[]{
            0, 1, 0, 1, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Tạo File HTML", new int[]{
            0, 1, 0, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Chạy File HTML Trên Trình Duyệt", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2});
        Index_MAP.put("Lỗi Thường Gặp", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 2, 1});
        Index_MAP.put("Đoạn Văn (<p>)", new int[]{
            0, 1, 0, 2, 0, 1, 0, 2, 0, 1, 0, 2, 0, 1});
        Index_MAP.put("Xuống Dòng (<br>)", new int[]{
            0, 1, 0, 2, 0, 1, 0, 2, 1, 2, 0, 1, 0, 2, 0, 1});
        Index_MAP.put("Đường Ngang (<hr>)", new int[]{
            0, 1, 0, 1, 2, 0, 1, 0, 2, 1, 2, 0, 1, 0, 2, 0, 2, 0, 1, 0, 2, 0, 1});
        Index_MAP.put("Các Thẻ Định Dạng Phổ Biến", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1});
        Index_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new int[]{
            0, 2, 0, 1, 0, 1});
        Index_MAP.put("Danh sách là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 0, 1});
        Index_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 0, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new int[]{
            0, 1, 0, 2, 1, 0, 1, 2, 1, 0, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Danh Sách Mô Tả (<dl>)", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1});
        Index_MAP.put("Chèn Ảnh (<img>)", new int[]{
            0, 2, 1, 0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 0, 2, 0, 1});
        Index_MAP.put("Chèn Video (<video>)", new int[]{
            0, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("Chèn Âm Thanh (<audio>)", new int[]{
            0, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new int[]{
            0, 2, 1, 0, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1});
        Index_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 2, 1, 0, 1, 0, 1, 2});
        Index_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1});
        Index_MAP.put("Liên Kết Hình Ảnh", new int[]{
            0, 1, 0, 2, 1, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Cấu Trúc Thẻ <iframe>", new int[]{
            0, 1, 0, 2, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Tại Sao Sử Dụng Iframe?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new int[]{
            0, 1, 0, 2, 0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 2});
        Index_MAP.put("Các Thuộc Tính Của Bảng", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1});
        Index_MAP.put("Bảng Nâng Cao", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Các Loại Trường Nhập", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2});
        Index_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1});
        //HTML nâng cao
        Index_MAP.put("HTML semantic là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2});
        Index_MAP.put("<header>", new int[]{
            0, 1, 0, 2, 0, 2, 0, 1});
        Index_MAP.put("<footer>", new int[]{
            0, 1, 0, 2, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("<nav>", new int[]{
            0, 1, 0, 2, 1, 0, 2, 1, 0, 1});
        Index_MAP.put("<article>", new int[]{
            0, 1, 0, 2, 1, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("<section>", new int[]{
            0, 1, 0, 2, 0, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Semantic HTML là gì", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1});
        Index_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new int[]{
            0, 1, 0, 2, 0, 1, 0, 1, 2, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1});
        Index_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new int[]{
            0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 0, 1});
        Index_MAP.put("Các thẻ <meta> quan trọng trong HTML", new int[]{
            0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Meta Title và Meta Description", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Meta Robots và Meta Viewport", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 0, 1});
        Index_MAP.put("Meta Charset", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 2, 0, 1});
        Index_MAP.put("Giới thiệu Open Graph và Twitter Card", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Open Graph", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Twitter Card", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Favicon", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Sitemap", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("robots.txt", new int[]{
            0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Local Storage", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Session Storage", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Geolocation API là", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Tính năng của Geolocation API", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Lợi ích SEO gián tiếp", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Drag & Drop API là gì", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 2, 1, 2, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("Tính năng của Drag & Drop API", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Lợi ích đối với SEO", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1});
        //CSS Cơ Bản
        Index_MAP.put("Inline CSS", new int[]{
            0, 1, 0, 2, 1, 0, 2, 0, 1, 0, 1, 0, 1, 0, 2});
        Index_MAP.put("Internal CSS", new int[]{
            0, 1, 0, 2, 1, 0, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("External CSS", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2});
        Index_MAP.put("CSS sử dụng cú pháp gì?", new int[]{
            0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 2});
        Index_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new int[]{
            0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 0, 1, 2});
        Index_MAP.put("Các kiểu Selector trong CSS", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1});
        Index_MAP.put("Tag Selector", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Class Selector", new int[]{
            0, 1, 0, 1, 0, 2, 1, 0, 2, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1, 0, 2, 2, 1, 0, 1});
        Index_MAP.put("ID Selector", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1, 0, 2, 2, 0, 1, 2});
        Index_MAP.put("Attribute Selector", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Đơn vị tuyệt đối", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 1});
        Index_MAP.put("Đơn vị tương đối", new int[]{
            0, 1, 0, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 0, 1, 0, 1, 0, 2, 1});
        Index_MAP.put("Cấu trúc Box Model", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 1, 2, 0, 2, 1});
        Index_MAP.put("Width và Height", new int[]{
            0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 2, 1, 0, 1, 2, 0, 1});
        Index_MAP.put("max-width và min-width", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 2, 1, 0, 1});
        Index_MAP.put("Các loại position chính", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Sự khác biệt giữa các kiểu positioning", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Ứng dụng thực tế của từng loại", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Hệ màu HEX", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Hệ màu RGB", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Hệ màu HSL", new int[]{
            0, 1, 2, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Font-family", new int[]{
            0, 1, 2, 1, 0, 1, 0, 1, 2, 1, 0, 2, 1, 0, 1, 0, 1});
        Index_MAP.put("Font-size", new int[]{
            0, 1, 2, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 0, 1});
        Index_MAP.put("Font-weight", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 0, 1});
        Index_MAP.put("Line-height", new int[]{
            0, 1, 2, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1});
        Index_MAP.put("Letter-spacing", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Ứng dụng thực tế", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Display: block", new int[]{
            0, 1, 2, 1, 0, 1, 2, 0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Display: inline", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 2, 2, 1, 2, 2, 0, 1, 2, 2, 0, 1});
        Index_MAP.put("Display: inline-block", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 1, 2, 2, 0, 1, 2, 2, 0, 1, 2, 0, 1});
        Index_MAP.put("Display: flex", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 2, 1});
        Index_MAP.put("Display: grid", new int[]{
            0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 2, 2, 1, 0, 1});
        Index_MAP.put("Viewport là gì", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1, 2, 1, 0, 1});
        Index_MAP.put("Cú pháp chuẩn của thẻ Viewport", new int[]{
            0, 2, 0, 1, 0, 1, 0, 2, 1, 0, 1});
        Index_MAP.put("Các thuộc tính quan trọng", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 0, 1});
        Index_MAP.put("Vai trò của Viewport meta tag", new int[]{
            0, 1, 2, 1, 2, 1, 0, 1, 0, 2, 1});
        //CSS nâng cao
        Index_MAP.put("display: flex là gì?", new int[]{
            0, 1, 0, 1, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Các thuộc tính chính của Flexbox", new int[]{
            0, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2
        });

        Index_MAP.put("justify-content", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("align-items", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 2
        });

        Index_MAP.put("align-self", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("flex-wrap", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("flex-direction", new int[]{
            0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1
        });

        Index_MAP.put("display: grid là gì?", new int[]{
            0, 1, 0, 1, 1, 0, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Các thuộc tính chính của CSS Grid", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 1
        });

        Index_MAP.put("Khái Niệm về CSS Grid Layout", new int[]{
            0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 2
        });

        Index_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 2, 1
        });

        Index_MAP.put("Chi Tiết về Các Thuộc Tính", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Khái Niệm", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Cách Sử Dụng Media Queries", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Tại Sao Media Queries Quan Trọng?", new int[]{
            0, 1, 0, 1, 1
        });

        Index_MAP.put("Mobile-first", new int[]{
            0, 1, 0, 1, 0, 2, 0, 2, 0, 2, 0, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Desktop-first", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 2, 0, 1, 1, 1
        });

        Index_MAP.put("So Sánh Mobile-first và Desktop-first", new int[]{
            0, 1, 1, 0, 1, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1
        });

        Index_MAP.put("CSS Container Queries", new int[]{
            0, 1, 0, 1, 1, 2, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Transition", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 2, 0, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Animation", new int[]{
            0, 1, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Keyframes", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Hover effect nâng cao", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 1, 2, 0, 2, 0, 2, 0, 2, 0, 1
        });

        Index_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new int[]{
            0, 1, 2, 1, 0, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 0, 1
        });

        Index_MAP.put(":not() - Loại Trừ Một Phần Tử", new int[]{
            0, 1, 0, 2, 1, 0, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 2, 1
        });

        Index_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new int[]{
            0, 1, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Pseudo-elements (::before, ::after)", new int[]{
            0, 1, 0, 1, 1, 0, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("BEM (Block Element Modifier)", new int[]{
            0, 1, 0, 1, 1, 1, 2, 2, 0, 1, 1, 1, 2, 2, 0, 1, 1, 1, 2, 2, 0, 1, 2, 2, 0, 1
        });

        Index_MAP.put("OOCSS (Object-Oriented CSS)", new int[]{
            0, 1, 0, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 0, 1, 0, 2, 0, 1
        });

        Index_MAP.put("SMACSS", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 1
        });

        Index_MAP.put("Biến trong CSS (--main-color)", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Nested Rules", new int[]{
            0, 1, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new int[]{
            0, 1, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Functions – Xử lý logic trong SCSS", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Tối ưu hóa mã CSS với SCSS", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Minify CSS", new int[]{
            0, 1, 1, 0, 1, 0, 1, 1, 2, 1, 0, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Load Font Tối ưu", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 1, 0, 1
        });

        Index_MAP.put("Critical CSS – Tải trước những phần CSS quan trọng", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Lazy Loading – Tải tài nguyên khi cần thiết", new int[]{
            0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Bootstrap", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2
        });

        Index_MAP.put("Tailwind CSS", new int[]{
            0, 1, 0, 1, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("ARIA Roles", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Keyboard Navigation", new int[]{
            0, 1, 0, 1, 1, 1, 1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new int[]{
            0, 1, 0, 1, 0, 1, 2, 0, 1, 1, 2, 1, 1, 2, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 2, 0, 1
        });

        Index_MAP.put("Tạo hình ảnh bằng CSS", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1
        });

        Index_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("CSS Art", new int[]{
            0, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 2, 0, 1, 0, 1, 0, 1
        });

        Index_MAP.put("Pure CSS Illustrations", new int[]{
            0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 2, 0, 2
        });
        //Ứng Dụng & Dự Án Thực Tế
        Index_MAP.put("Một Blog cá nhân là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của blog cá nhân", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Landing page sản phẩm là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Web bán hàng cơ bản là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Hiệu ứng scroll", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Parallax", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 0, 1});
        Index_MAP.put("Ứng dụng trong thiết kế", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Dark Mode (chế độ tối) là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của Dark Mode", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Cách thức triển khai Dark Mode", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 2, 2, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Animation nâng cao là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 2, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của animation nâng cao", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Lợi ích của animation nâng cao", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Manifest.json là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của manifest.json", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Service Worker là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng về Service Worker", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Caching trong Service Worker", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1});
        Index_MAP.put("Các lợi ích của Service Worker & Caching", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của Offline Mode", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        Index_MAP.put("Các yếu tố quan trọng của Push Notifications", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1});
    }

    // Phương thức lấy tiêu đề theo chỉ số dựa vào ngôn ngữ
    public static int getIndex(String language, int index) {
        if (Index_MAP.containsKey(language)) {
            int[] titles = Index_MAP.get(language);
            if (index >= 0 && index < titles.length) {
                return titles[index];
            }
        }
        return 0;
    }

    // Phương thức lấy toàn bộ danh sách tiêu đề của một ngôn ngữ
    public static int[] getIndex(String language) {
        return Index_MAP.getOrDefault(language, new int[]{});
    }

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {

        TITLE_MAP.put("Giới Thiệu HTML", new String[]{
            "HTML là gì?",
            "Một số điểm cơ bản về HTML",
            "Cấu trúc cơ bản của một trang HTML:",
            "Các thẻ phổ biến:",
            "HTML kết hợp với:"
        });
        TITLE_MAP.put("Lịch Sử Phát Triển Của HTML", new String[]{
            "HTML ra đời",
            "Các phiên bản HTML chính",
            "HTML ngày nay",
            "Tóm tắt nhanh lịch sử HTML"
        });
        TITLE_MAP.put("Cách HTML Hoạt Động", new String[]{
            "HTML là bộ khung của trang web",
            "Trình duyệt web đọc và hiển thị HTML",
            "HTML phối hợp với CSS và JavaScript",
            "Quy trình cơ bản khi tải một trang HTML:",
            "Ví dụ nhỏ"
        });
        TITLE_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "Khai báo loại tài liệu (DOCTYPE)",
            "Thẻ <html> - Phần gốc của tài liệu",
            "Bên trong <html> có 2 phần chính:",
            "Sơ đồ tổng quát",
            "Tóm tắt các phần của tài liệu HTML"
        });
        TITLE_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "1. <!DOCTYPE html>",
            "2. <html>",
            "3. <head>",
            "4. <title>",
            "5. <meta>",
            "6. <link>",
            "7. <body>",
            "8. <h1> đến <h6>",
            "9. <p>",
            "10. <a>",
            "11. <img>",
            "12. <ul>, <ol>, <li>",
            "13. <div>",
            "14. <span>",
            "Tóm Tắt Các Thẻ HTML Quan Trọng"
        });
        TITLE_MAP.put("Tạo File HTML", new String[]{
            "1. Bước 1: Mở trình soạn thảo văn bản",
            "2. Bước 2: Viết nội dung HTML cơ bản",
            "3. Bước 3: Lưu file với đuôi .html",
            "4. Bước 4: Mở file HTML bằng trình duyệt"
        });
        TITLE_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            "1. Cách 1: Mở trực tiếp bằng trình duyệt",
            "2. Cách 2: Kéo thả vào trình duyệt",
            "3. Cách 3: Mở bằng chức năng \"Open file\"",
            "4. Cách 4: Dùng trình soạn thảo có tích hợp chạy nhanh",
            "Lưu Ý"
        });
        TITLE_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            "1. Developer Tools là gì?",
            "2. Cách mở Developer Tools",
            "3. Kiểm tra và chỉnh sửa HTML",
            "Ví dụ:",
            "4. Cập nhật chỉ là tạm thời",
            "Mẹo Hay"
        });
        TITLE_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "1. Tiêu đề (<h1> đến <h6>) là gì?",
            "2. Ý nghĩa của từng mức tiêu đề",
            "Lưu ý quan trọng:",
            "3. Một số lưu ý",
            "Ví dụ Minh Họa"
        });
        TITLE_MAP.put("Lỗi Thường Gặp", new String[]{
            "1. Thiếu hoặc sai thẻ đóng (</thẻ>)",
            "2. Quên thêm thẻ <!DOCTYPE html>",
            "3. Lỗi sai thuộc tính trong thẻ (ví dụ: src, href)",
            "4. Lỗi chính tả thẻ HTML",
            "5. Sử dụng sai cấu trúc thẻ",
            "6. Lỗi thiếu hoặc sai thuộc tính alt trong thẻ <img>",
            "7. Không sử dụng thẻ <meta> cho encoding",
            "8. Lỗi đường dẫn file CSS, JavaScript không chính xác"
        });
        TITLE_MAP.put("Đoạn Văn (<p>)", new String[]{
            "1. Công Dụng của Thẻ <p>",
            "2. Cấu Trúc Cơ Bản",
            "3. Tính Năng",
            "4. Ví Dụ Sử Dụng Thẻ <p>",
            "5. Lưu Ý Quan Trọng",
            "Ví Dụ Thực Tế",
            "Tóm Tắt"
        });
        TITLE_MAP.put("Xuống Dòng (<br>)", new String[]{
            "1. Công Dụng của Thẻ <br>",
            "2. Cấu Trúc Cơ Bản",
            "3. Tính Năng",
            "4. Ví Dụ Sử Dụng Thẻ <br>",
            "5. Lưu Ý Quan Trọng",
            "Ví Dụ Thực Tế",
            "Tóm Tắt"
        });
        TITLE_MAP.put("Đường Ngang (<hr>)", new String[]{
            "1. Công Dụng của Thẻ <hr>",
            "2. Cấu Trúc Cơ Bản",
            "3. Tính Năng",
            "4. Ví Dụ Sử Dụng Thẻ <hr>",
            "5. Tùy Chỉnh Thẻ <hr> bằng CSS",
            "Ví dụ CSS:",
            "Kết quả:",
            "6. Lưu Ý",
            "Ví Dụ Thực Tế",
            "Tóm Tắt"
        });
        TITLE_MAP.put("Các Thẻ Định Dạng Phổ Biến", new String[]{
            "1.1 <b> - In đậm",
            "1.2 <strong> - Đậm và nhấn mạnh",
            "1.3 <i> - In nghiêng",
            "1.4 <em> - Nhấn mạnh",
            "2.1 <u> - Gạch dưới",
            "2.2 <mark> - Đánh dấu",
            "2.3 <small> - Văn bản nhỏ",
            "2.4 <del> - Gạch bỏ",
            "2.5 <ins> - Chèn thêm",
            "3.1 <sub> - Chữ dưới (Subscript)",
            "3.2 <sup> - Chữ trên (Superscript)",
            "4.1 <a> - Liên kết",
            "4.2 <ul> - Danh sách không thứ tự",
            "4.3 <ol> - Danh sách có thứ tự",
            "5.1 <code> - Đoạn mã",
            "5.2 <pre> - Văn bản định dạng sẵn",
            "Tóm Tắt"
        });
        TITLE_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new String[]{
            "Ví Dụ Về Định Dạng Văn Bản",
            "Giải Thích:",
            "Kết Quả Hiển Thị:"
        });
        TITLE_MAP.put("Danh sách là gì?", new String[]{
            "1. Định nghĩa chung về \"Danh sách\":",
            "Ví dụ đời thường:",
            "2. Đặc điểm của danh sách:",
            "3. Các loại danh sách thường gặp:",
            "4. Danh sách trong lập trình:",
            "5. Ý nghĩa của danh sách trong thực tế:"
        });
        TITLE_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new String[]{
            "Danh sách có thứ tự (<ol>) trong HTML là gì?",
            "2. Các cách tùy chỉnh danh sách <ol>",
            "3. Khi nào dùng <ol>?",
            "4. Danh sách lồng nhau",
            "🔥 Ghi nhớ nhanh:"
        });
        TITLE_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new String[]{
            "Danh Sách Không Thứ Tự (<ul>) trong HTML là gì?",
            "2. Ví dụ cơ bản",
            "3. Tùy chỉnh dấu đầu dòng",
            "4. Khi nào nên dùng <ul>?",
            "5. Danh sách lồng nhau",
            "🎯 Tóm gọn:"
        });
        TITLE_MAP.put("Danh Sách Mô Tả (<dl>)", new String[]{
            "Danh Sách Mô Tả (<dl>) trong HTML là gì?",
            "2. Cấu trúc cơ bản",
            "3. Một vài lưu ý:",
            "4. Ví dụ thêm phức tạp",
            "5. Khi nào nên dùng <dl>?",
            "🎯 Tóm gọn:"
        });
        TITLE_MAP.put("Chèn Ảnh (<img>)", new String[]{
            "1. Cấu trúc cơ bản của thẻ <img>:",
            "2. Các thuộc tính quan trọng của thẻ <img>:",
            "3. Chèn ảnh từ URL và từ file cục bộ:",
            "4. Chèn ảnh thay thế (Alt text):",
            "5. Điều chỉnh kích thước ảnh:",
            "Ví dụ thực tế:",
            "Tóm lại:"
        });
        TITLE_MAP.put("Chèn Video (<video>)", new String[]{
            "1. Cấu trúc cơ bản của thẻ <video>:",
            "2. Các thuộc tính quan trọng của thẻ <video>:",
            "3. Chèn video từ nhiều định dạng (đa nền tảng):",
            "4. Ví dụ đầy đủ về video với các thuộc tính:",
            "Giải thích:",
            "Tóm lại:"
        });
        TITLE_MAP.put("Chèn Âm Thanh (<audio>)", new String[]{
            "1. Cấu trúc cơ bản của thẻ <audio>:",
            "2. Các thuộc tính quan trọng của thẻ <audio>:",
            "3. Chèn âm thanh từ nhiều định dạng (đa nền tảng):",
            "4. Ví dụ đầy đủ về âm thanh với các thuộc tính:\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "Giải thích:",
            "Tóm lại:"
        });
        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new String[]{
            "1. Cấu trúc cơ bản của thẻ <a>:",
            "2. Ví dụ về liên kết cơ bản:",
            "3. Các thuộc tính phổ biến của thẻ <a>:",
            "4. Các dạng liên kết trong HTML:",
            "Ví dụ thực tế về liên kết:",
            "Tóm lại:"
        });
        TITLE_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new String[]{
            "1. Gán id cho phần tử mục tiêu",
            "2. Tạo liên kết bằng thẻ <a>",
            "Ví Dụ Cụ Thể",
            "Một Số Lưu Ý Khi Dùng Liên Kết Nội Bộ",
            "Thêm hiệu ứng cuộn mượt"
        });
        TITLE_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new String[]{
            "1. href",
            "2. target",
            "3. title",
            "4. download",
            "5. rel"
        });
        TITLE_MAP.put("Liên Kết Hình Ảnh", new String[]{
            "1. Giới thiệu",
            "2. Cấu trúc cơ bản",
            "3. Ví dụ thực tế",
            "4. Một số lưu ý",
            "5. Tổng kết"
        });
        TITLE_MAP.put("Cấu Trúc Thẻ <iframe>", new String[]{
            "1. Giới thiệu",
            "2. Cấu trúc cơ bản của <iframe>",
            "3. Các thuộc tính thường dùng",
            "4. Ví dụ thực tế",
            "5. Một số lưu ý khi dùng <iframe>"
        });
        TITLE_MAP.put("Tại Sao Sử Dụng Iframe?", new String[]{
            "1. Nhúng Nội Dung Từ Nguồn Khác",
            "2. Tiết Kiệm Công Sức Phát Triển",
            "3. Giữ Cho Nội Dung Cập Nhật Tự Động",
            "4. Cách Ly Nội Dung",
            "5. Bảo Mật",
            "✅ Tóm lại:"
        });
        TITLE_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new String[]{
            "1. Bảo Mật",
            "2. Tối Ưu Hiệu Suất",
            "3. Tính Tương Thích và Quản Lý Cross-Domain",
            "4. Ảnh Hưởng Đến SEO",
            "5. Đảm Bảo Tính Thân Thiện Với Người Dùng"
        });
        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new String[]{
            "1. Giới Thiệu",
            "2. Cấu Trúc Cơ Bản",
            "Các thành phần trong bảng:",
            "3. Mô Tả Các Thẻ:",
            "4. Ví Dụ Cụ Thể",
            "5. Một Số Thuộc Tính Khác"
        });
        TITLE_MAP.put("Các Thuộc Tính Của Bảng", new String[]{
            "1. Thuộc Tính Cơ Bản Của Thẻ <table>",
            "2. Thuộc Tính Của Thẻ <tr> (Hàng Bảng)",
            "3. Thuộc Tính Của Thẻ <th> (Tiêu Đề Cột/Hàng)",
            "4. Thuộc Tính Của Thẻ <td> (Ô Dữ Liệu)",
            "5. Ví Dụ"
        });
        TITLE_MAP.put("Bảng Nâng Cao", new String[]{
            "1. Sử Dụng CSS Để Tùy Chỉnh Bảng",
            "2. Sử Dụng colspan và rowspan Để Mở Rộng Bảng",
            "3. Tạo Bảng Với Nội Dung Động (Sử Dụng JavaScript)",
            "4. Sử Dụng Bảng Với thead, tbody, và tfoot",
            "5. Tạo Bảng Với Các Công Cụ Xếp Hạng và Tìm Kiếm"
        });
        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new String[]{
            "1. Thẻ <form>",
            "2. Các Trường Nhập Liệu",
            "3. Các Nút Điều Khiển",
            "4. Ví Dụ Hoàn Chỉnh Của Biểu Mẫu",
            "5. Lưu Ý Khi Sử Dụng Biểu Mẫu"
        });
        TITLE_MAP.put("Các Loại Trường Nhập", new String[]{
            "1. Trường Nhập Văn Bản",
            "2. Trường Nhập Mật Khẩu",
            "3. Trường Nhập Số",
            "4. Trường Chọn Một Lựa Chọn",
            "5. Trường Nhập Tệp"
        });
        TITLE_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new String[]{
            "1. action",
            "2. method",
            "3. enctype",
            "4. target",
            "5. name",
            "6. autocomplete",
            "7. accept-charset"
        });
        //HTML nâng cao
        TITLE_MAP.put("HTML semantic là gì?", new String[]{
            "HTML semantic là gì?",
            "Lợi ích của HTML Semantic:",
            "Các Thẻ HTML Semantic Thường Dùng:",
            "Ví dụ đầy đủ về một trang web sử dụng HTML semantic:"
        });
        TITLE_MAP.put("<header>", new String[]{
            "<header> trong HTML là gì?",
            "Ví dụ về <header> dùng cho toàn trang:",
            "Ví dụ về <header> trong bài viết:",
            "Những điểm lưu ý khi dùng <header>:"
        });
        TITLE_MAP.put("<footer>", new String[]{
            "<footer> trong HTML là gì?",
            "Ví dụ về <footer> cho toàn trang web:",
            "Ví dụ về <footer> trong bài viết (<article>) :",
            "Những điểm lưu ý khi dùng <footer>:",
            "<footer> tóm tắt nhanh:"
        });
        TITLE_MAP.put("<nav>", new String[]{
            "<nav> trong HTML là gì?",
            "Ví dụ về <nav> cơ bản:",
            "Một ví dụ <nav> đẹp hơn, kết hợp với logo:",
            "Những điểm lưu ý khi dùng <nav>:",
            "Tóm gọn bằng gạch đầu dòng:"
        });
        TITLE_MAP.put("<article>", new String[]{
            "<article> trong HTML là gì?",
            "Ví dụ về <article> trong blog:",
            "Ví dụ về <article> cho danh sách sản phẩm:",
            "Những điểm lưu ý khi dùng <article>:",
            "Tóm gọn bằng gạch đầu dòng:"
        });
        TITLE_MAP.put("<section>", new String[]{
            "<section> trong HTML là gì?",
            "Ví dụ về <section> cơ bản:",
            "Ví dụ nhiều <section> trong một trang:",
            "Những điểm lưu ý khi dùng <section>:",
            "Tóm gọn bằng gạch đầu dòng:",
            "🌟 Ghi nhớ mẹo nhỏ:"
        });
        TITLE_MAP.put("Semantic HTML là gì", new String[]{
            "Semantic HTML là gì?",
            "Tại sao cần dùng Semantic HTML?",
            "Ví dụ minh họa",
            "Các thẻ Semantic HTML hay gặp",
            "Tóm lại"
        });
        TITLE_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new String[]{
            "1. Sử dụng Semantic HTML",
            "Ví dụ sử dụng Semantic HTML:",
            "Lợi ích:",
            "2. Tạo Sơ Đồ Dữ Liệu (Structured Data)",
            "Lợi ích:",
            "3. Tối Ưu Hóa URL",
            "Lợi ích:",
            "4. Tối Ưu Hóa Tiêu Đề và Thẻ Meta",
            "Lợi ích:",
            "5. Tối Ưu Hóa Liên Kết (Internal Linking)",
            "Lợi ích:",
            "Tóm tắt cách giúp công cụ tìm kiếm hiểu rõ trang:"
        });
        TITLE_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new String[]{
            "1. Sử dụng Semantic HTML",
            "2. Sử dụng Structured Data (Dữ liệu có cấu trúc)",
            "3. Tối Ưu Hóa Tiêu Đề và Mô Tả (Meta Title & Description)",
            "4. Tối Ưu Hóa URL",
            "5. Tối Ưu Hóa Trải Nghiệm Người Dùng (UX)",
            "6. Tạo Liên Kết Nội Bộ (Internal Linking)",
            "7. Tối Ưu Hóa Cho Tìm Kiếm Di Động (Mobile Optimization)",
            "Tóm lại:"
        });
        TITLE_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new String[]{
            "1. Tối Ưu Hóa Cho Tìm Kiếm Bằng Giọng Nói",
            "2. Tối Ưu Hóa Cho Thiết Bị Di Động",
            "Tóm tắt các chiến lược tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động:"
        });
        TITLE_MAP.put("Các thẻ <meta> quan trọng trong HTML", new String[]{
            "1. <meta charset=\"UTF-8\">",
            "2. <meta name=\"description\" content=\"...\">",
            "3. <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">",
            "4. <meta name=\"robots\" content=\"index, follow\">",
            "5. <meta property=\"og:title\" content=\"...\"> (Open Graph)",
            "Tóm tắt 5 thẻ <meta> quan trọng:"
        });
        TITLE_MAP.put("Meta Title và Meta Description", new String[]{
            "1. Meta Title (Thẻ <title>)",
            "2. Meta Description (Thẻ <meta name=\"description\" content=\"...\">)",
            "Tóm tắt:",
            "Mối quan hệ giữa Meta Title và Meta Description:"
        });
        TITLE_MAP.put("Meta Robots và Meta Viewport", new String[]{
            "1. Meta Robots (<meta name=\"robots\" content=\"...\">)",
            "2. Meta Viewport (<meta name=\"viewport\" content=\"...\">)",
            "Tóm tắt:",
            "Công dụng trong SEO và UX:"
        });
        TITLE_MAP.put("Meta Charset", new String[]{
            "Meta Charset là gì?",
            "Mục đích của Meta Charset:",
            "Bộ mã ký tự phổ biến:",
            "Lý do quan trọng:",
            "Cách sử dụng Meta Charset:",
            "Ví dụ sử dụng:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Giới thiệu Open Graph và Twitter Card", new String[]{
            "1. Open Graph (OG)",
            "2. Twitter Card",
            "Tóm tắt sự khác biệt giữa Open Graph và Twitter Card:",
            "Lợi ích của việc sử dụng Open Graph và Twitter Card:"
        });
        TITLE_MAP.put("Open Graph", new String[]{
            "Open Graph (OG) là gì?",
            "Mục đích của Open Graph:",
            "Các Thẻ Open Graph Chính:",
            "Các Loại Open Graph Content:",
            "Cấu trúc Thẻ Open Graph Cơ Bản:",
            "Lý Do Sử Dụng Open Graph:",
            "Lợi ích của việc sử dụng Open Graph:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Twitter Card", new String[]{
            "Twitter Card là gì?",
            "Mục đích của Twitter Card:",
            "Các loại Twitter Cards:",
            "Các Thẻ Twitter Card Chính:",
            "Ví dụ sử dụng thẻ Twitter Card:",
            "Lý Do Sử Dụng Twitter Card:",
            "Lợi ích của việc sử dụng Twitter Card:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Favicon", new String[]{
            "Favicon (viết tắt của \"favorite icon\") là gì?",
            "Mục đích của Favicon:",
            "Cách Tạo và Sử Dụng Favicon:",
            "Cách Tạo Favicon:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Sitemap", new String[]{
            "Sitemap là gì?",
            "Mục đích của Sitemap:",
            "Các loại Sitemap:",
            "Cách Tạo Sitemap XML:",
            "Lợi ích của Sitemap:",
            "Cách Đăng Ký Sitemap với Google Search Console:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("robots.txt", new String[]{
            "robots.txt là gì?",
            "Mục đích của robots.txt:",
            "Cấu trúc của robots.txt:",
            "Cấu trúc cơ bản của robots.txt:",
            "Ví dụ về robots.txt:",
            "Các thẻ và hướng dẫn phổ biến trong robots.txt:",
            "Lợi ích của việc sử dụng robots.txt:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Local Storage", new String[]{
            "Local Storage là gì",
            "Các đặc điểm của Local Storage:",
            "Cách sử dụng Local Storage:",
            "Ưu điểm của Local Storage:",
            "Nhược điểm của Local Storage:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Session Storage", new String[]{
            "Session Storage là gì?",
            "Các đặc điểm của Session Storage:",
            "Cách sử dụng Session Storage:",
            "Ưu điểm của Session Storage:",
            "Nhược điểm của Session Storage:"
        });
        TITLE_MAP.put("Geolocation API là", new String[]{
            "Geolocation API là",
            "Các tính năng của Geolocation API:",
            "Cách sử dụng Geolocation API:",
            "Ví dụ sử dụng Geolocation API:",
            "Thông tin vị trí trả về:",
            "Lưu ý về quyền riêng tư và bảo mật:",
            "Ưu điểm và hạn chế của Geolocation API:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Tính năng của Geolocation API", new String[]{
            "1. Lấy Vị trí Hiện tại",
            "2. Theo dõi Vị trí",
            "3. Xử lý Lỗi",
            "4. Xác định Độ Chính xác",
            "5. Lấy Chiều Cao (Altitude)",
            "6. Theo dõi Hướng di chuyển",
            "7. Tính Tốc độ",
            "8. Tính năng Bảo mật và Quyền Riêng tư",
            "9. Hỗ trợ các Phương pháp Định vị Khác nhau",
            "Tóm tắt về các tính năng của Geolocation API:"
        });
        TITLE_MAP.put("Lợi ích SEO gián tiếp", new String[]{
            "Lợi ích SEO gián tiếp là gì?",
            "1. Cải thiện Trải Nghiệm Người Dùng (UX)",
            "2. Tăng Tỷ Lệ Chuyển Đổi (Conversion Rate)",
            "3. Giảm Tỷ Lệ Thoát (Bounce Rate)",
            "4. Tăng Thời Gian Duyệt Web (Time on Site)",
            "5. Tạo Dữ Liệu Cải Thiện Chiến Lược Nội Dung",
            "6. Tạo Dựng Mối Quan Hệ và Độ Tin Cậy",
            "7. Cải Thiện Tính Xác Thực và Độ Tin Cậy của Trang Web",
            "8. Sử Dụng Tối Ưu Các Kênh Truyền Thông",
            "9. Giúp Xây Dựng Thương Hiệu và Lòng Trung Thành",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Drag & Drop API là gì", new String[]{
            "Drag & Drop API là gì?",
            "Các Thành Phần Chính của Drag & Drop API:",
            "Cách Sử Dụng Drag & Drop API",
            "Ví Dụ Hoàn Chỉnh:",
            "Lợi Ích của Drag & Drop API:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Tính năng của Drag & Drop API", new String[]{
            "1. Kéo và Thả Phần Tử",
            "2. Quản Lý Dữ Liệu Khi Kéo và Thả",
            "3. Các Sự Kiện Chính",
            "4. Hỗ Trợ Kéo Đến Các Khu Vực Cụ Thể (Drop Zones)",
            "5. Kéo và Thả Hỗ Trợ Định Dạng Dữ Liệu",
            "6. Cải Thiện Trải Nghiệm Người Dùng",
            "7. Tương Tác Với Các Phần Tử Trong DOM",
            "8. Hỗ Trợ Các Loại Phần Tử Phức Tạp",
            "9. Hỗ Trợ Các Trình Duyệt Hiện Đại",
            "Ví Dụ Sử Dụng:",
            "Tóm tắt các tính năng chính của Drag & Drop API:"
        });
        TITLE_MAP.put("Lợi ích đối với SEO", new String[]{
            "1. Cải Thiện Trải Nghiệm Người Dùng (UX)",
            "2. Tăng Tương Tác và Tiến Tới Mục Tiêu",
            "3. Tối Ưu Hóa Các Tính Năng Phức Tạp",
            "4. Tăng Cơ Hội Chia Sẻ Nội Dung",
            "5. Dễ Dàng Cập Nhật và Quản Lý Nội Dung",
            "6. Hỗ Trợ Các Thiết Bị Di Động"
        });
        //CSS Cơ Bản
        TITLE_MAP.put("Inline CSS", new String[]{
            "Inline CSS là gì?",
            "Cú pháp chung:",
            "Ví dụ đơn giản:",
            "Ưu điểm của Inline CSS",
            "Nhược điểm của Inline CSS",
            "Khi nào nên dùng Inline CSS?",
            "Một ví dụ đầy đủ:"
        });
        TITLE_MAP.put("Internal CSS", new String[]{
            "Internal CSS là gì?",
            "Cú pháp cơ bản:",
            "Ví dụ đơn giản:",
            "Ưu điểm của Internal CSS",
            "Nhược điểm của Internal CSS",
            "Khi nào nên dùng Internal CSS?"
        });
        TITLE_MAP.put("External CSS", new String[]{
            "External CSS là gì?",
            "📄 Cấu trúc gồm 2 phần:",
            "✅ Ưu điểm của External CSS",
            "❌ Nhược điểm",
            "🧠 Khi nào nên dùng External CSS?",
            "🧪 Ví dụ đầy đủ với External CSS"});
        TITLE_MAP.put("CSS sử dụng cú pháp gì?", new String[]{
            "1. Cú pháp cơ bản của CSS",
            "2. Các loại Selector trong CSS",
            "3. Chú thích trong CSS",
            "4. Ví dụ tổng hợp"
        });
        TITLE_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new String[]{
            "1. Bộ chọn (Selector)",
            "2. Khai báo (Declaration)",
            "3. Quy tắc CSS",
            "4. Các loại bộ chọn CSS nâng cao",
            "5. Chú ý khi viết CSS",
            "Tóm tắt"
        });
        TITLE_MAP.put("Các kiểu Selector trong CSS", new String[]{
            "1. Universal Selector (*)",
            "2. Class Selector (.)",
            "3. ID Selector (#)",
            "4. Element Selector (Type Selector)",
            "5. Pseudo-class Selector (:hover, :focus, :nth-child())",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Tag Selector", new String[]{
            "Tag Selector la gi?",
            "Mô tả:",
            "Cách sử dụng:",
            "Ví dụ:",
            "Ưu điểm của Tag Selector:",
            "Nhược điểm:",
            "Tóm lại:"
        });
        TITLE_MAP.put("Class Selector", new String[]{
            "Class Selector la gi?",
            "Mô tả:",
            "Cách sử dụng:",
            "HTML ví dụ:",
            "Một số điểm cần nhớ:",
            "Ưu điểm của Class Selector:",
            "Nhược điểm:",
            "Ví dụ thực tế:",
            "Tóm lại:"
        });
        TITLE_MAP.put("ID Selector", new String[]{
            "ID Selector la gi",
            "🔍 Mô tả",
            "🧪 Cách sử dụng:",
            "✅ Ưu điểm của ID Selector:",
            "❗ Lưu ý:",
            "💡 Ví dụ thực tế:",
            "📌 Kết hợp với JavaScript:"
        });
        TITLE_MAP.put("Attribute Selector", new String[]{
            "1. Attribute Selector là gì?",
            "2. Cách viết Attribute Selector",
            "3. Ví dụ thực tế",
            "4. Ưu điểm khi dùng Attribute Selector",
            "5. Một số lưu ý khi sử dụng"
        });
        TITLE_MAP.put("Đơn vị tuyệt đối", new String[]{
            "1. Định nghĩa đơn giản",
            "2. Một số đơn vị tuyệt đối phổ biến",
            "3. Khi nào nên dùng đơn vị tuyệt đối?",
            "4. Ưu điểm",
            "5. Nhược điểm",
            "📌 Ví dụ thực tế"
        });
        TITLE_MAP.put("Đơn vị tương đối", new String[]{
            "1. Định nghĩa đơn giản",
            "2. Các loại đơn vị tương đối phổ biến",
            "3. Ưu điểm",
            "4. Nhược điểm",
            "📌 Ví dụ tổng hợp"
        });
        TITLE_MAP.put("Cấu trúc Box Model", new String[]{
            "1. Box Model là gì?",
            "2. Các thành phần trong Box Model",
            "3. Hình minh họa nhanh",
            "4. Cách tính tổng kích thước hộp",
            "5. Ví dụ thực tế"
        });
        TITLE_MAP.put("Width và Height", new String[]{
            "1. Định nghĩa",
            "2. Cách sử dụng cơ bản",
            "3. Các đơn vị thường dùng",
            "4. Các giá trị đặc biệt",
            "5. Ví dụ thực tế",
            "6. Lưu ý khi dùng box-sizing",
            "📌 Tóm tắt nhanh:"
        });
        TITLE_MAP.put("max-width và min-width", new String[]{
            "1. max-width và max-height",
            "2. min-width và min-height",
            "3. Kết hợp với các đơn vị khác",
            "4. Ưu điểm",
            "5. Nhược điểm",
            "6. Ví dụ thực tế với responsive",
            "📌 Tóm tắt nhanh:"
        });
        TITLE_MAP.put("Các loại position chính", new String[]{
            "1. Static (Mặc định)",
            "2. Relative",
            "3. Absolute",
            "4. Fixed",
            "5. Sticky",
            "📌 Tóm tắt:"
        });
        TITLE_MAP.put("Sự khác biệt giữa các kiểu positioning", new String[]{
            "1. Static — Mặc định, không định vị gì cả",
            "2. Relative — Xê dịch một chút, vẫn giữ chỗ cũ",
            "3. Absolute — Ra khỏi dòng, định vị theo cha",
            "4. Fixed — Cố định vào màn hình",
            "5. Sticky — Dính tạm thời",
            "🧠 Mẹo nhớ nhanh:"

        });
        TITLE_MAP.put("Ứng dụng thực tế của từng loại", new String[]{
            "1. Static — Dùng khi không cần định vị đặc biệt",
            "2. Relative — Dùng để dịch chuyển nhẹ hoặc làm mốc cho phần tử con",
            "3. Absolute — Định vị chính xác ở mọi nơi",
            "4. Fixed — Cố định phần tử trên màn hình",
            "5. Sticky — Dính một cách thông minh theo cuộn",
            "🎯 Kết luận"
        });
        TITLE_MAP.put("Hệ màu HEX", new String[]{
            "1. HEX là gì?",
            "2. Cách đọc mã HEX",
            "3. Một số màu cơ bản",
            "4. Tính năng viết gọn",
            "5. Ứng dụng thực tế",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Hệ màu RGB", new String[]{
            "1. RGB là gì?",
            "2. Công thức của RGB",
            "3. Đặc điểm nổi bật",
            "4. Ứng dụng thực tế",
            "📚 Tóm gọn:"
        });
        TITLE_MAP.put("Hệ màu HSL", new String[]{
            "1. HSL là gì?",
            "2. Cách hoạt động của HSL",
            "3. Ví dụ trực quan",
            "4. Ứng dụng thực tế",
            "📚 Tóm gọn:"
        });
        TITLE_MAP.put("Font-family", new String[]{
            "1. Font-family là gì?",
            "2. Nguyên tắc hoạt động",
            "3. Một số lưu ý khi dùng Font-family",
            "4. Ví dụ thực tế",
            "5. Các bộ font phổ biến (dạng danh sách)",
            "📌 Ghi nhớ nhanh:"
        });
        TITLE_MAP.put("Font-size", new String[]{
            "1. Font-size là gì?",
            "2. Các đơn vị sử dụng trong Font-size",
            "3. Một số ví dụ thực tế",
            "4. Lợi ích của việc sử dụng các đơn vị khác nhau",
            "5. Responsive Design",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Font-weight", new String[]{
            "1. Font-weight là gì?",
            "2. Các giá trị của Font-weight",
            "3. Ứng dụng thực tế",
            "4. Tác động đến Typography và UX",
            "5. Kết hợp với các thuộc tính khác",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Line-height", new String[]{
            "1. Line-height là gì?",
            "2. Giá trị của Line-height",
            "3. Tác dụng của Line-height",
            "4. Ví dụ thực tế",
            "5. Lợi ích của Line-height trong thiết kế web",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Letter-spacing", new String[]{
            "1. Letter-spacing là gì?",
            "2. Giá trị của Letter-spacing",
            "3. Ứng dụng thực tế của Letter-spacing",
            "4. Lợi ích của Letter-spacing",
            "5. Kết hợp với các thuộc tính khác",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Ứng dụng thực tế", new String[]{
            "1. Tạo kiểu chữ tiêu đề nổi bật",
            "2. Tạo không gian cho chữ trong văn bản dài",
            "3. Hiệu ứng văn bản nghệ thuật",
            "4. Tạo kiểu chữ cho nút bấm (Button)",
            "5. Chữ ký cá nhân hoặc logo",
            "6. Hiệu ứng chữ khi hover",
            "7. Giảm khoảng cách cho văn bản nhỏ",
            "📚 Tóm lại"
        });
        TITLE_MAP.put("Display: block", new String[]{
            "1. display: block là gì?",
            "2. Đặc điểm của phần tử Block-level",
            "3. Phần tử block-level mặc định",
            "4. So sánh với phần tử inline",
            "5. Ứng dụng thực tế của display: block",
            "6. Kết hợp với display: inline",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Display: inline", new String[]{
            "1. display: inline là gì?",
            "2. Đặc điểm của phần tử Inline",
            "3. So sánh với phần tử block-level",
            "4. Ứng dụng thực tế của display: inline",
            "5. Kết hợp với display: block hoặc inline-block",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Display: inline-block", new String[]{
            "1. display: inline-block là gì?",
            "2. Đặc điểm của phần tử Inline-block",
            "3. Ứng dụng thực tế của display: inline-block",
            "4. Các tính năng và lưu ý",
            "📚 Tóm lại:"
        });
        TITLE_MAP.put("Display: flex", new String[]{
            "Cấu trúc cơ bản của display: flex",
            "Thuộc tính flex container",
            "Thuộc tính flex item",
            "Ví dụ tổng hợp"
        });
        TITLE_MAP.put("Display: grid", new String[]{
            "Cấu trúc cơ bản của display: grid",
            "Các thuộc tính của grid container",
            "Thuộc tính của grid items",
            "Ví dụ tổng hợp về display: grid",
            "Giải thích:",
            "Tóm tắt"
        });
        TITLE_MAP.put("Viewport là gì", new String[]{
            "Viewport là gì",
            "Tầm quan trọng của Viewport",
            "Các yếu tố ảnh hưởng đến Viewport",
            "Viewport và Thiết kế đáp ứng (Responsive Design)",
            "Tóm tắt"
        });
        TITLE_MAP.put("Cú pháp chuẩn của thẻ Viewport", new String[]{
            "Cú pháp chuẩn:",
            "Giải thích các thuộc tính:",
            "Các thuộc tính bổ sung có thể sử dụng trong thẻ viewport:",
            "Ví dụ đầy đủ:",
            "Tóm tắt:"
        });
        TITLE_MAP.put("Các thuộc tính quan trọng", new String[]{
            "1. width",
            "2. initial-scale",
            "3. maximum-scale",
            "4. minimum-scale",
            "5. user-scalable",
            "6. height (Hiếm sử dụng)",
            "Ví dụ đầy đủ về thẻ meta viewport:",
            "Giải thích ví dụ:",
            "Tóm tắt:",});
        TITLE_MAP.put("Vai trò của Viewport meta tag", new String[]{
            "Các vai trò chính của thẻ meta viewport:",
            "Tóm tắt các vai trò chính của thẻ meta viewport:",
            "Ví dụ cụ thể về thẻ meta viewport:",});
        //Css nang cao
        TITLE_MAP.put("display: flex là gì?", new String[]{
            "Giới thiệu",
            "Các khái niệm chính",
            "Các thuộc tính của Flex Container",
            "Các thuộc tính của Flex Items",
            "Code mẫu hoàn chỉnh",
            "Ưu điểm của Flexbox"
        });

        TITLE_MAP.put("Các thuộc tính chính của Flexbox", new String[]{
            "1. Thuộc tính cho container (flex container)",
            "2. Thuộc tính cho items (flex items)",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("justify-content", new String[]{
            "Các giá trị của justify-content",
            "Sử dụng với Grid Layout",
            "Lưu ý quan trọng",
            "Kết luận"
        });

        TITLE_MAP.put("align-items", new String[]{
            "Thuộc tính align-items trong CSS",
            "Giá trị của align-items",
            "Giải thích chi tiết từng giá trị",
            "Lưu ý quan trọng",
            "Kết hợp với các thuộc tính khác"
        });

        TITLE_MAP.put("align-self", new String[]{
            "Giới thiệu",
            "Các giá trị của align-self",
            "Sử dụng với Grid Layout",
            "Khi nào sử dụng align-self",
            "Lưu ý"
        });

        TITLE_MAP.put("flex-wrap", new String[]{
            "Thuộc tính flex-wrap trong CSS Flexbox",
            "Các giá trị của flex-wrap",
            "Kết hợp với flex-direction",
            "Khi nào sử dụng flex-wrap"
        });

        TITLE_MAP.put("flex-direction", new String[]{
            "Thuộc tính flex-direction trong CSS",
            "Nội dung đầy đủ về flex-direction"
        });

        TITLE_MAP.put("display: grid là gì?", new String[]{
            "display: grid trong HTML & CSS",
            "1. Giới thiệu về CSS Grid",
            "2. Các thuộc tính chính của Grid",
            "3. Các giá trị và đơn vị thường dùng",
            "4. Căn chỉnh trong Grid",
            "5. Grid Template Areas",
            "6. Responsive Grid",
            "7. Kết hợp Flexbox và Grid"
        });

        TITLE_MAP.put("Các thuộc tính chính của CSS Grid", new String[]{
            "Các thuộc tính chính của Grid trong HTML & CSS",
            "1. Thuộc tính cho Container (Grid Container)",
            "2. Thuộc tính cho Items (Grid Items)",
            "3. Các hàm và đơn vị hữu ích",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Khái Niệm về CSS Grid Layout", new String[]{
            "1. Giới thiệu về CSS Grid Layout",
            "2. Các khái niệm cơ bản",
            "3. Tạo Grid Container",
            "4. Các thuộc tính cho Grid Container",
            "5. Các thuộc tính cho Grid Items",
            "6. Ví dụ hoàn chỉnh",
            "7. Các hàm và đơn vị hữu ích",
            "8. Grid kết hợp với Flexbox"
        });

        TITLE_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new String[]{
            "Các thuộc tính chính trong CSS Grid",
            "1. Thuộc tính cho Container (Grid Container)",
            "2. Thuộc tính cho Items (Grid Items)",
            "3. Các thuộc tính khác",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Chi Tiết về Các Thuộc Tính", new String[]{
            "1. Thuộc tính HTML phổ biến",
            "2. Thuộc tính CSS quan trọng",
            "3. Thuộc tính CSS3 mới"
        });

        TITLE_MAP.put("Khái Niệm", new String[]{
            "Media Queries trong HTML & CSS",
            "1. Cú pháp cơ bản của Media Query",
            "2. Các loại media type phổ biến",
            "3. Các media features quan trọng",
            "4. Cách sử dụng Media Queries",
            "5. Breakpoints phổ biến",
            "6. Ví dụ hoàn chỉnh",
            "7. Best Practices khi sử dụng Media Queries"
        });

        TITLE_MAP.put("Cách Sử Dụng Media Queries", new String[]{
            "Cách sử dụng Media Queries trong HTML/CSS",
            "1. Cú pháp cơ bản của Media Queries",
            "2. Các loại Media Type",
            "3. Các Media Features phổ biến",
            "4. Breakpoints phổ biến",
            "5. Ví dụ hoàn chỉnh",
            "6. Cách sử dụng Media Queries trong thẻ <link>",
            "7. Các toán tử logic trong Media Queries",
            "8. Media Queries cho màn hình retina (độ phân giải cao)",
            "Kết luận"
        });

        TITLE_MAP.put("Tại Sao Media Queries Quan Trọng?", new String[]{
            "Tầm quan trọng của Media Queries trong HTML/CSS",
            "Khái niệm và tầm quan trọng"
        });

        TITLE_MAP.put("Mobile-first", new String[]{
            "Mobile-First trong HTML/CSS",
            "1. Tại sao nên sử dụng Mobile-First",
            "2. Cấu trúc cơ bản của Mobile-First",
            "3. Các breakpoint phổ biến",
            "4. Ví dụ hoàn chỉnh về layout Mobile-First",
            "5. Best Practices cho Mobile-First",
            "6. Xử lý hình ảnh trong Mobile-First",
            "7. Kết luận"
        });

        TITLE_MAP.put("Desktop-first", new String[]{
            "Desktop-First Approach in HTML/CSS",
            "1. Khái niệm cơ bản",
            "2. Ưu điểm",
            "3. Nhược điểm",
            "4. Các breakpoint thông dụng",
            "Code mẫu đầy đủ",
            "Giải thích code"
        });

        TITLE_MAP.put("So Sánh Mobile-first và Desktop-first", new String[]{
            "Mobile-First Approach",
            "Desktop-First Approach",
            "2. Cách triển khai code",
            "3. So sánh chi tiết",
            "4. Khi nào nên sử dụng",
            "5. Best Practices",
            "Kết luận"
        });

        TITLE_MAP.put("CSS Container Queries", new String[]{
            "CSS Container Queries",
            "1. Cách sử dụng Container Queries",
            "2. Ví dụ đầy đủ",
            "3. Các trường hợp sử dụng phổ biến",
            "4. Lưu ý khi sử dụng"
        });

        TITLE_MAP.put("Transition", new String[]{
            "Transition trong HTML/CSS",
            "Các thuộc tính của Transition",
            "Transition với nhiều thuộc tính",
            "Transition với transform",
            "Transition trong thực tế (nút bấm)",
            "Lưu ý khi sử dụng Transition"
        });

        TITLE_MAP.put("Animation", new String[]{
            "Animation trong HTML và CSS",
            "1. CSS Transitions",
            "2. CSS Animations",
            "3. Transformations",
            "4. Animation với JavaScript",
            "5. Thư viện Animation phổ biến",
            "6. Best Practices cho Animation"
        });

        TITLE_MAP.put("Keyframes", new String[]{
            "Keyframes trong CSS",
            "Nội dung đầy đủ về Keyframes",
            "Code mẫu"
        });

        TITLE_MAP.put("Hover effect nâng cao", new String[]{
            "Hover Effect Nâng Cao Trong HTML và CSS",
            "1. Các loại hover effect nâng cao",
            "2. Kết hợp nhiều hiệu ứng",
            "3. Hiệu ứng hình ảnh",
            "4. Hiệu ứng nút bấm nâng cao",
            "5. Hiệu ứng menu dropdown",
            "6. Hiệu ứng card nâng cao",
            "Kết luận"
        });

        TITLE_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new String[]{
            "Cú pháp cơ bản",
            "Các dạng sử dụng",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put(":not() - Loại Trừ Một Phần Tử", new String[]{
            "Giới thiệu về :not()",
            "Cú pháp cơ bản",
            "Các ví dụ thực tế",
            "Những điều cần lưu ý",
            "Ví dụ nâng cao"
        });

        TITLE_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new String[]{
            "CSS :focus-within Selector",
            "Nội dung chi tiết",
            "Code mẫu",
            "Kết luận"
        });

        TITLE_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "Pseudo-elements (::before và ::after) trong HTML/CSS",
            "1. Giới thiệu về ::before và ::after",
            "2. Cú pháp cơ bản",
            "3. Các ví dụ đầy đủ",
            "4. Những điều cần lưu ý"
        });

        TITLE_MAP.put("BEM (Block Element Modifier)", new String[]{
            "BEM (Block, Element, Modifier) trong HTML/CSS",
            "1. Block (Khối)",
            "2. Element (Phần tử)",
            "3. Modifier (Bổ nghĩa)",
            "Ví dụ hoàn chỉnh",
            "Lợi ích của BEM"
        });

        TITLE_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "OOCSS (Object-Oriented CSS) là gì?",
            "Nguyên tắc chính của OOCSS",
            "Lợi ích của OOCSS",
            "Ví dụ minh họa OOCSS",
            "Best Practices khi áp dụng OOCSS"
        });

        TITLE_MAP.put("SMACSS", new String[]{
            "1. SMACSS (Scalable and Modular Architecture for CSS)",
            "2. Strong (Có thể hiểu là CSS mạnh mẽ/kiên cố)",
            "3. HTML",
            "4. CSS (Cascading Style Sheets)",
            "Kết hợp tất cả: Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Biến trong CSS (--main-color)", new String[]{
            "Biến CSS (CSS Custom Properties) - --main-color",
            "1. Khai báo biến CSS",
            "2. Sử dụng biến CSS",
            "3. Phạm vi của biến (Scope)",
            "4. Giá trị mặc định",
            "5. Thay đổi biến bằng JavaScript",
            "Ví dụ đầy đủ",
            "Ưu điểm của biến CSS"
        });

        TITLE_MAP.put("Nested Rules", new String[]{
            "Nested Rules trong HTML/CSS",
            "1. Khái niệm cơ bản",
            "2. Lồng selector với pseudo-classes",
            "3. Lồng media queries",
            "4. Lồng các thuộc tính CSS",
            "5. Sử dụng ký tự & (parent selector)",
            "Code mẫu đầy đủ",
            "Ưu điểm của Nested Rules",
            "Lưu ý khi sử dụng"
        });

        TITLE_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new String[]{
            "Mixins trong CSS",
            "1. Định nghĩa Mixins",
            "2. Cú pháp cơ bản",
            "3. Mixins có tham số",
            "4. Giá trị mặc định cho tham số",
            "5. Mixins với nội dung động (@content)",
            "6. Ví dụ đầy đủ với Sass",
            "7. Kết quả CSS sau khi biên dịch"
        });

        TITLE_MAP.put("Functions – Xử lý logic trong SCSS", new String[]{
            "Xử lý logic trong SCSS (SASS)",
            "1. Biến (Variables)",
            "2. Nesting (Lồng nhau)",
            "3. Mixins",
            "4. Kế thừa (Extend/Inheritance)",
            "5. Điều kiện (If/Else)",
            "6. Vòng lặp (Loops)",
            "7. Functions",
            "8. Toán tử (Operators)",
            "Ví dụ tổng hợp",
            "Kết quả CSS sau khi biên dịch"
        });

        TITLE_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "1. Giới thiệu về SCSS",
            "2. Cài đặt và sử dụng SCSS",
            "3. Các tính năng tối ưu hóa với SCSS",
            "4. Ví dụ hoàn chỉnh",
            "5. Tích hợp với HTML",
            "6. Best Practices khi sử dụng SCSS"
        });

        TITLE_MAP.put("Minify CSS", new String[]{
            "1. Khái niệm Minify CSS",
            "2. Các kỹ thuật Minify CSS",
            "3. Cách Minify CSS trong HTML",
            "4. Code mẫu minify CSS trong HTML",
            "5. Cách minify CSS file riêng biệt",
            "6. Công cụ tự động hóa minify CSS",
            "7. Lưu ý khi minify CSS"
        });

        TITLE_MAP.put("Load Font Tối ưu", new String[]{
            "Tối ưu hóa tải font trong HTML/CSS",
            "1. Các phương pháp tối ưu hóa tải font",
            "2. Code mẫu hoàn chỉnh",
            "3. Các công cụ hỗ trợ",
            "4. Best Practices"
        });

        TITLE_MAP.put("Critical CSS – Tải trước những phần CSS quan trọng", new String[]{
            "Critical CSS trong HTML/CSS",
            "1. Khái niệm Critical CSS",
            "2. Tại sao cần Critical CSS",
            "3. Cách xác định Critical CSS",
            "4. Cách triển khai Critical CSS",
            "5. Công cụ hỗ trợ",
            "Code mẫu triển khai Critical CSS",
            "Kết luận"
        });

        TITLE_MAP.put("Lazy Loading – Tải tài nguyên khi cần thiết", new String[]{
            "Lazy Loading trong HTML và CSS",
            "1. Tổng quan về Lazy Loading",
            "2. Các loại Lazy Loading",
            "3. Cách triển khai Lazy Loading",
            "4. Lazy Loading video",
            "5. Lazy Loading với thư viện",
            "6. Best Practices khi sử dụng Lazy Loading",
            "7. Đo lường hiệu quả"
        });

        TITLE_MAP.put("Bootstrap", new String[]{
            "1. Giới thiệu về Bootstrap",
            "2. Cách tích hợp Bootstrap vào dự án",
            "3. Hệ thống lưới (Grid System)",
            "4. Các thành phần (Components) phổ biến",
            "5. Tiện ích (Utilities)",
            "6. Ví dụ hoàn chỉnh",
            "7. Tùy chỉnh Bootstrap"
        });

        TITLE_MAP.put("Tailwind CSS", new String[]{
            "Tailwind CSS trong HTML/CSS",
            "1. Giới thiệu về Tailwind CSS",
            "2. Cách sử dụng Tailwind CSS",
            "3. Các utility class cơ bản",
            "4. Responsive Design",
            "5. Hover, Focus và các trạng thái khác",
            "6. Customization",
            "7. Ví dụ hoàn chỉnh",
            "8. Kết luận"
        });

        TITLE_MAP.put("ARIA Roles", new String[]{
            "ARIA Roles trong HTML/CSS",
            "1. Tổng quan về ARIA Roles",
            "2. Các loại ARIA Roles chính",
            "3. Cách sử dụng ARIA Roles",
            "4. Kết hợp ARIA Roles với các thuộc tính ARIA khác",
            "5. Ví dụ hoàn chỉnh",
            "6. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Keyboard Navigation", new String[]{
            "Keyboard Navigation trong HTML/CSS",
            "Nội dung chính về Keyboard Navigation",
            "Code mẫu đầy đủ",
            "Best Practices cho Keyboard Navigation"
        });

        TITLE_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "Dark Mode và Hỗ trợ Người dùng Khiếm thị trong HTML/CSS",
            "1. Tại sao Dark Mode quan trọng cho người dùng khiếm thị",
            "2. Triển khai Dark Mode cơ bản với CSS",
            "3. Cải thiện khả năng tiếp cận trong Dark Mode",
            "4. Tôn trọng cài đặt hệ thống",
            "5. Kiểm tra khả năng tiếp cận",
            "6. Tài nguyên và tham khảo thêm"
        });

        TITLE_MAP.put("Tạo hình ảnh bằng CSS", new String[]{
            "Tạo hình ảnh bằng CSS trong HTML/CSS",
            "Các phương pháp tạo hình ảnh bằng CSS",
            "Ưu điểm của việc tạo hình bằng CSS",
            "Nhược điểm",
            "Kết luận"
        });

        TITLE_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new String[]{
            "Tạo Animations (Hoạt ảnh) Phức tạp trong HTML & CSS",
            "1. Các khái niệm cơ bản về Animation trong CSS",
            "2. Các thuộc tính Animation quan trọng",
            "3. Tạo Animation phức tạp với nhiều keyframes",
            "4. Kết hợp nhiều Animation cùng lúc",
            "5. Animation 3D với transform",
            "6. Sử dụng CSS Variables để tạo Animation linh hoạt",
            "7. Kết hợp SVG và CSS Animation",
            "8. Animation Performance Optimization",
            "9. Ví dụ hoàn chỉnh: Animation loading spinner phức tạp",
            "10. Kết luận"
        });

        TITLE_MAP.put("CSS Art", new String[]{
            "1. Giới thiệu về CSS Art",
            "2. Các kỹ thuật chính trong CSS Art",
            "3. Ví dụ hoàn chỉnh: Tạo mặt trăng bằng CSS",
            "4. Ví dụ phức tạp: Tạo chú mèo bằng CSS",
            "5. Lợi ích của CSS Art",
            "6. Hạn chế của CSS Art",
            "7. Các nguồn học CSS Art"
        });

        TITLE_MAP.put("Pure CSS Illustrations", new String[]{
            "Pure CSS Illustrations trong HTML/CSS",
            "Nội dung chi tiết",
            "Code mẫu: Tạo mặt trời bằng Pure CSS",
            "Code mẫu 2: Tạo cây bằng Pure CSS"
        });
        //Ứng Dụng & Dự Án Thực Tế
        TITLE_MAP.put("Một Blog cá nhân là gì?", new String[]{
            "1. Định nghĩa blog cá nhân",
            "2. Lịch sử hình thành và phát triển",
            "3. Các đặc điểm nổi bật của blog cá nhân",
            "4. Một số nền tảng phổ biến để tạo blog cá nhân",
            "5. Tương lai của blog cá nhân"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của blog cá nhân", new String[]{
            "1. Nội dung chất lượng",
            "2. Phong cách cá nhân đặc trưng",
            "3. Giao diện thân thiện, dễ dùng",
            "4. Khả năng kết nối và tương tác với độc giả",
            "5. Tối ưu SEO cơ bản và chia sẻ mạng xã hội"
        });
        TITLE_MAP.put("Landing page sản phẩm là gì?", new String[]{
            "Landing Page Sản Phẩm là gì?",
            "1. Mục Tiêu và Cấu Trúc Của Landing Page",
            "2. Nội Dung Tập Trung vào Lợi Ích Sản Phẩm",
            "3. Thiết Kế Đơn Giản và Tối Ưu",
            "4. Call to Action (CTA) Mạnh Mẽ và Hấp Dẫn",
            "5. Tăng Cường Lòng Tin và Sự Đáng Tin Cậy",
            "6. Tối Ưu SEO và Chia Sẻ Mạng Xã Hội",
            "Ví dụ về Landing Page Sản Phẩm:"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new String[]{
            "1. Mục Tiêu Rõ Ràng",
            "2. Tiêu Đề Hấp Dẫn",
            "3. Mô Tả Sản Phẩm Cụ Thể và Lợi Ích",
            "4. Hình Ảnh và Video Chất Lượng Cao",
            "5. Call to Action (CTA) Rõ Ràng và Hấp Dẫn",
            "6. Lòng Tin và Chứng Nhận",
            "7. Khuyến Mãi và Ưu Đãi Đặc Biệt",
            "8. Tối Ưu Hoá Tốc Độ Tải Trang",
            "9. Tính Đáp Ứng (Responsive)",
            "10. Thông Tin Liên Hệ Dễ Dàng",
            "11. Các Liên Kết Nội Bộ và Mạng Xã Hội"
        });
        TITLE_MAP.put("Web bán hàng cơ bản là gì?", new String[]{
            "Web bán hàng cơ bản là gì?",
            "1. Trang chủ hấp dẫn",
            "2. Danh mục sản phẩm rõ ràng",
            "3. Trang chi tiết sản phẩm",
            "4. Giỏ hàng và thanh toán",
            "5. Chính sách giao hàng và đổi trả",
            "6. Tính năng hỗ trợ khách hàng",
            "7. Tối ưu hóa cho thiết bị di động (Responsive)",
            "8. SEO cơ bản",
            "Ví dụ về Web bán hàng cơ bản:",
            "Lợi ích của việc xây dựng một web bán hàng cơ bản:"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new String[]{
            "1. Giao Diện Dễ Dàng Sử Dụng",
            "2. Danh Mục Sản Phẩm Rõ Ràng",
            "3. Trang Chi Tiết Sản Phẩm",
            "4. Giỏ Hàng và Quy Trình Thanh Toán Đơn Giản",
            "5. Chính Sách Giao Hàng và Đổi Trả",
            "6. Call to Action (CTA) Mạnh Mẽ",
            "7. Tính Năng Hỗ Trợ Khách Hàng",
            "8. SEO Cơ Bản",
            "9. Chứng Nhận và Đánh Giá",
            "10. Khuyến Mãi và Ưu Đãi",
            "Tóm lại:"
        });
        TITLE_MAP.put("Hiệu ứng scroll", new String[]{
            "Hiệu ứng scroll la gì?",
            "1. Hiệu ứng Fade-In khi cuộn trang",
            "2. Hiệu ứng Parallax Scroll",
            "3. Hiệu ứng Scroll-triggered Animation",
            "Lời Kết:"
        });
        TITLE_MAP.put("Parallax", new String[]{
            "Parallax la gi?",
            "Ví Dụ Parallax Sử Dụng CSS và JavaScript",
            "Giải Thích:",
            "Lưu Ý:",
            "Thêm Thư Viện JavaScript (rellax.js)",
            "Kết luận:"
        });
        TITLE_MAP.put("Ứng dụng trong thiết kế", new String[]{
            "1. Tạo Ấn Tượng Ban Đầu Mạnh Mẽ",
            "2. Cải Thiện Trải Nghiệm Người Dùng",
            "3. Hiển Thị Hình Ảnh Sáng Tạo",
            "4. Tăng Tính Tương Tác và Hướng Dẫn Người Dùng",
            "5. Thiết Kế Portfolio và Trang Cá Nhân",
            "6. Tạo Ra Hiệu Ứng Thị Giác Phức Tạp",
            "7. Tạo Cảm Giác Tương Tác Với Người Dùng",
            "Lợi Ích Khi Sử Dụng Parallax trong Thiết Kế",
            "Lưu Ý Khi Sử Dụng Parallax trong Thiết Kế"
        });
        TITLE_MAP.put("Dark Mode (chế độ tối) là gì?", new String[]{
            "Dark Mode (chế độ tối) là gì?",
            "Lý Do Sử Dụng Dark Mode:",
            "Ứng Dụng của Dark Mode:",
            "Lợi Ích của Dark Mode:",
            "Nhược Điểm của Dark Mode:",
            "Cách Kích Hoạt Dark Mode:",
            "Kết luận:"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Dark Mode", new String[]{
            "1. Chuyển Hệ Màu Sắc",
            "2. Giảm Ánh Sáng Xanh",
            "3. Thiết Kế Đơn Giản và Tối Giản",
            "4. Chế Độ Chuyển Đổi Dễ Dàng",
            "5. Tối Ưu Hóa Cho Đọc và Nội Dung",
            "6. Tiết Kiệm Năng Lượng (Trên Màn Hình OLED/AMOLED)",
            "7. Đảm Bảo Hỗ Trợ Cho Mọi Thiết Bị",
            "8. Trải Nghiệm Người Dùng",
            "9. Tạo Độ Tương Phản Để Tăng Tính Thẩm Mỹ",
            "10. Phát Triển Và Cập Nhật Liên Tục",
            "Kết Luận:"
        });
        TITLE_MAP.put("Cách thức triển khai Dark Mode", new String[]{
            "1. Thiết Kế Giao Diện Dark Mode",
            "2. Sử Dụng CSS để Triển Khai Dark Mode",
            "3. Tạo Tính Năng Chuyển Đổi Giữa Chế Độ Sáng và Tối",
            "4. Lưu Trạng Thái Người Dùng",
            "5. Tối Ưu Hóa Hình Ảnh và Các Yếu Tố Đồ Họa",
            "6. Kiểm Tra và Tinh Chỉnh",
            "7. Tạo Dark Mode trên Ứng Dụng Di Động",
            "Kết Luận"
        });
        TITLE_MAP.put("Animation nâng cao là gì?", new String[]{
            "Animation nâng cao là gì?",
            "Các Yếu Tố Chính của Animation Nâng Cao:",
            "Các Kỹ Thuật Animation Nâng Cao:",
            "Ví Dụ về Animation Nâng Cao với GSAP (GreenSock Animation Platform)",
            "Kết Luận:"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của animation nâng cao", new String[]{
            "1. Tốc Độ và Độ Trễ (Timing)",
            "2. Sự Tương Tác (Interactivity)",
            "3. Chuyển Động Tự Nhiên (Natural Movement)",
            "4. Độ Mượt Mà và Tính Liên Tục",
            "5. Sử Dụng Các Kỹ Thuật Tương Tác Đa Dạng",
            "6. Chuyển Động 3D và Chiều Sâu",
            "7. Tối Ưu Hóa Hiệu Suất",
            "8. Tạo Lớp Chồng Hiệu Ứng (Layered Effects)",
            "9. Cải Thiện Trải Nghiệm Người Dùng (UX)",
            "10. Tính Đồng Bộ (Synchronization)",
            "Kết Luận:"
        });
        TITLE_MAP.put("Lợi ích của animation nâng cao", new String[]{
            "1. Tăng Trải Nghiệm Người Dùng (UX)",
            "2. Tăng Tính Thẩm Mỹ và Sự Hấp Dẫn",
            "3. Giảm Thiểu Cảm Giác Chờ Đợi",
            "4. Tạo Động Lực và Thúc Đẩy Tương Tác",
            "5. Cải Thiện Tính Đồng Nhất và Mạch Lạc",
            "6. Tăng Cường Hiệu Suất và Quản Lý Tài Nguyên",
            "7. Giúp Truyền Tải Thông Điệp và Cảm Xúc",
            "8. Cải Thiện Quản Lý Thông Tin",
            "9. Tăng Cường Tính Khả Dụng (Accessibility)",
            "10. Khả Năng Tương Thích với Các Thiết Bị và Môi Trường Khác Nhau",
            "Kết Luận:"
        });
        TITLE_MAP.put("Manifest.json là gì?", new String[]{
            "Manifest.json là gì?",
            "1. Định nghĩa ngắn gọn",
            "2. Ứng dụng phổ biến",
            "3. Ví dụ nội dung một file manifest.json",
            "4. Vì sao manifest.json quan trọng?"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của manifest.json", new String[]{
            "1. name (Tên ứng dụng/tiện ích)",
            "2. short_name (Tên ngắn)",
            "3. description (Mô tả ứng dụng/tiện ích)",
            "4. start_url (URL bắt đầu)",
            "5. icons (Bộ biểu tượng)",
            "6. display (Chế độ hiển thị)",
            "7. background_color (Màu nền lúc loading)",
            "8. theme_color (Màu chủ đề)",
            "9. orientation (Chiều hiển thị) (tuỳ chọn)",
            "10. scope (Phạm vi URL được coi như thuộc về app) (tuỳ chọn)",
            "💬 Tóm lại:"
        });
        TITLE_MAP.put("Service Worker là gì?", new String[]{
            "📦 Service Worker là gì?",
            "🚀 Hiểu đơn giản:",
            "📚 Đặc điểm nổi bật:",
            "🎯 Các chức năng chính:",
            "🛠️ Ví dụ đơn giản:",
            "🧠 Kết luận:"
        });
        TITLE_MAP.put("Các yếu tố quan trọng về Service Worker", new String[]{
            "1. Vòng đời (Life Cycle)",
            "2. Caching và quản lý bộ nhớ",
            "3. Intercept Network Requests (Chặn và xử lý yêu cầu mạng)",
            "4. Push Notification và Background Sync",
            "5. Yêu cầu HTTPS và bảo mật",
            "🔥 Tóm nhanh các yếu tố quan trọng của Service Worker:"
        });
        TITLE_MAP.put("Caching trong Service Worker", new String[]{
            "📦 Caching trong Service Worker",
            "🔥 Cách hoạt động cơ bản:",
            "🛠️ Các chiến lược caching phổ biến:",
            "✏️ Ví dụ cơ bản về caching:",
            "🎯 Ghi nhớ nhanh:"
        });
        TITLE_MAP.put("Các lợi ích của Service Worker & Caching", new String[]{
            "1. Tăng tốc độ tải trang web vượt trội",
            "2. Hỗ trợ truy cập ngoại tuyến (Offline Mode)",
            "3. Giảm tải cho server và tiết kiệm băng thông",
            "4. Nâng cao trải nghiệm người dùng (User Experience)",
            "5. Gửi thông báo đẩy và đồng bộ nền (Push Notification & Background Sync)",
            "6. Kiểm soát chi tiết việc cập nhật tài nguyên",
            "7. Hỗ trợ xây dựng Progressive Web App (PWA)",
            "🎯 Tóm gọn lại lợi ích"
        });
        TITLE_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new String[]{
            "🌐 Offline Mode (Chế độ ngoại tuyến) là gì?",
            "✨ Tại sao Offline Mode lại quan trọng?",
            "🛠️ Những công nghệ hỗ trợ Offline Mode",
            "📚 Các tình huống thực tế ứng dụng Offline Mode",
            "📢 Một vài lưu ý khi triển khai Offline Mode"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Offline Mode", new String[]{
            "1. Lưu trữ tài nguyên tĩnh (Static Assets Caching)",
            "2. Quản lý dữ liệu động (Dynamic Data Management)",
            "3. Service Worker hiệu quả và an toàn",
            "4. Thông báo và giao diện người dùng thân thiện",
            "5. Chiến lược Caching hợp lý (Caching Strategies)",
            "6. Đồng bộ dữ liệu khi kết nối lại (Background Sync)",
            "📌 Lưu ý thêm"
        });
        TITLE_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new String[]{
            "📢 Push Notifications – Các thành phần và yếu tố quan trọng",
            "⚙️ Cách thức hoạt động",
            "🎯 Lợi ích khi sử dụng Push Notifications",
            "🛠️ Các thành phần chính trong Push Notifications",
            "💡 Một số lưu ý khi triển khai Push Notifications"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Push Notifications", new String[]{
            "1. Sự cho phép (Permission)",
            "2. Nội dung thông báo (Content)",
            "3. Thời gian gửi (Timing)",
            "4. Cá nhân hóa (Personalization)",
            "5. Khả năng tương tác (Interaction)",
            "6. Chiến lược phân nhóm người dùng (Segmentation)",
            "7. Đo lường và tối ưu (Analytics)",
            "8. Tần suất gửi thông báo (Frequency)",
            "9. Định dạng thông báo (Notification Format)",
            "10. Chiến lược hồi sinh người dùng (User Retention Strategy)",
            "✨ Mẹo bổ sung:"
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getTitle(String language, int index) {
        if (TITLE_MAP.containsKey(language)) {
            String[] descriptions = TITLE_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getTitle(String language) {
        return TITLE_MAP.getOrDefault(language, new String[]{});
    }

    private static final Map<String, String[]> Content_MAP = new HashMap<>();

    static {
        Content_MAP.put("Giới Thiệu HTML", new String[]{
            "HTML (viết tắt của HyperText Markup Language) là ngôn ngữ đánh dấu dùng để xây dựng và định dạng nội dung trên các trang web. Nó không phải là ngôn ngữ lập trình (như JavaScript hay Python) mà chỉ đóng vai trò mô tả cấu trúc của trang web.\n",
            "Thẻ (tags): HTML sử dụng các cặp thẻ để đánh dấu nội dung, ví dụ:",
            "<h1> đến <h6>: Tiêu đề các cấp.\n"
            + "\n"
            + "<p>: Đoạn văn.\n"
            + "\n"
            + "<a>: Liên kết (hyperlink).\n"
            + "\n"
            + "<img>: Ảnh.\n"
            + "\n"
            + "<div>, <span>: Thẻ chứa nội dung.\n"
            + "\n"
            + "<ul>, <ol>, <li>: Danh sách.\n"
            + "\n"
            + "<form>, <input>, <button>: Các thẻ liên quan đến biểu mẫu.\n",
            "CSS (Cascading Style Sheets) để tạo giao diện đẹp.\n"
            + "\n"
            + "JavaScript để làm cho trang web động và tương tác."
        });
        Content_MAP.put("Lịch Sử Phát Triển Của HTML", new String[]{
            "Năm 1989, Tim Berners-Lee (làm việc tại CERN – Tổ chức Nghiên cứu Hạt nhân Châu Âu) đề xuất một hệ thống chia sẻ thông tin qua Internet mà sau này trở thành World Wide Web.\n"
            + "\n"
            + "Năm 1991, ông phát hành phiên bản HTML đầu tiên (gọi là HTML 1.0, thực ra lúc đó chưa đặt tên như vậy). Nó cực kỳ đơn giản, chỉ có khoảng 18 thẻ.\n"
            + "",
            "HTML 2.0 (1995):\n"
            + "\n"
            + "Phiên bản tiêu chuẩn đầu tiên.\n"
            + "\n"
            + "Bao gồm các tính năng cơ bản: biểu mẫu (form), bảng (table), liên kết (link)...\n"
            + "\n"
            + "Được chuẩn hóa bởi tổ chức IETF.\n"
            + "\n"
            + "HTML 3.2 (1997):\n"
            + "\n"
            + "Hỗ trợ thêm: bảng biểu đẹp hơn, font chữ, script (JavaScript).\n"
            + "\n"
            + "Được duy trì bởi W3C (World Wide Web Consortium).\n"
            + "\n"
            + "HTML 4.01 (1999):\n"
            + "\n"
            + "Cải tiến lớn: phân chia cấu trúc và trình bày (khuyến khích dùng CSS).\n"
            + "\n"
            + "Hỗ trợ ngôn ngữ quốc tế, frames, các yếu tố đa phương tiện.\n"
            + "\n"
            + "HTML 5 (2014):\n"
            + "\n"
            + "Phiên bản hiện đại, đang được dùng rộng rãi hiện nay.\n"
            + "\n"
            + "Thêm các thành phần mới: <video>, <audio>, <canvas>, <article>, <section>, v.v.\n"
            + "\n"
            + "Hỗ trợ tốt hơn cho thiết bị di động, ứng dụng web, và đa phương tiện mà không cần plugin như Flash.",
            "Hiện tại, HTML5 được duy trì dưới dạng \"Living Standard\" (tiêu chuẩn sống), nghĩa là nó được cập nhật liên tục chứ không có bản \"6.0\", \"7.0\" như trước.\n"
            + "\n"
            + "Tổ chức WHATWG (Web Hypertext Application Technology Working Group) chịu trách nhiệm phát triển phiên bản mới nhất.\n"
            + "\n"
            + "HTML bây giờ kết hợp chặt với CSS3, JavaScript để xây dựng các web hiện đại, tương tác và responsive.",
            "Năm 1991 – HTML 1.0\n"
            + "Phiên bản đầu tiên, rất đơn giản, chỉ khoảng 18 thẻ. Do Tim Berners-Lee tạo ra.\n"
            + "\n"
            + "Năm 1995 – HTML 2.0\n"
            + "Phiên bản tiêu chuẩn đầu tiên, hỗ trợ form (biểu mẫu), liên kết, bảng đơn giản.\n"
            + "\n"
            + "Năm 1997 – HTML 3.2\n"
            + "Thêm hỗ trợ bảng phức tạp, thay đổi font chữ, tích hợp JavaScript.\n"
            + "\n"
            + "Năm 1999 – HTML 4.01\n"
            + "Tách biệt rõ ràng nội dung và trình bày (khuyến khích dùng CSS). Hỗ trợ tốt đa phương tiện và quốc tế hóa.\n"
            + "\n"
            + "Năm 2014 – HTML5\n"
            + "Bước tiến lớn: thêm thẻ video, audio, canvas, hỗ trợ mạnh cho ứng dụng web hiện đại và thiết bị di động."
        });
        Content_MAP.put("Cách HTML Hoạt Động", new String[]{
            "Khi bạn viết HTML, bạn đang xây dựng cấu trúc cho website: chỗ nào là tiêu đề, chỗ nào là đoạn văn, hình ảnh, video,...\n"
            + "\n"
            + "Các thẻ HTML như <h1>, <p>, <img>, <a> định nghĩa từng phần tử trên trang.",
            "Khi người dùng mở một trang web, trình duyệt như Chrome, Firefox, Safari sẽ đọc file HTML từ máy chủ.\n"
            + "\n"
            + "Trình duyệt phân tích (parse) HTML để hiểu các thành phần, sau đó vẽ ra giao diện cho người xem.",
            "HTML: Xây dựng cấu trúc (ví dụ: Đây là tiêu đề, đây là hình ảnh).\n"
            + "\n"
            + "CSS: Tạo giao diện đẹp (ví dụ: màu nền, phông chữ, bố cục).\n"
            + "\n"
            + "JavaScript: Thêm tính tương tác (ví dụ: bấm nút để mở menu, gửi biểu mẫu).\n"
            + "",
            "Người dùng nhập địa chỉ trang web (URL).\n"
            + "\n"
            + "Trình duyệt gửi yêu cầu đến máy chủ chứa file HTML.\n"
            + "\n"
            + "Máy chủ trả về file HTML.\n"
            + "\n"
            + "Trình duyệt đọc HTML, rồi đọc thêm CSS, JavaScript nếu có.\n"
            + "\n"
            + "Trình duyệt dựng thành giao diện mà người dùng nhìn thấy.",
            "Giả sử bạn có file HTML như này:",
            "Trình duyệt sẽ hiểu:\n"
            + "\n"
            + "<h1> là tiêu đề lớn → hiển thị to và đậm.\n"
            + "\n"
            + "<p> là đoạn văn bản bình thường → hiển thị nhỏ hơn.\n"
            + ""
        });
        Content_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "Đây là dòng đầu tiên của file HTML.\n"
            + "\n"
            + "Nó khai báo với trình duyệt rằng tài liệu này dùng phiên bản HTML nào.\n"
            + "\n"
            + "Ví dụ <!DOCTYPE html> báo rằng đây là tài liệu HTML5.",
            "Tất cả nội dung của trang web đều phải nằm bên trong cặp thẻ <html>.\n"
            + "\n"
            + "<html> thường có thêm thuộc tính ngôn ngữ (lang), ví dụ:",
            "a. Phần <head> - Phần \"hậu trường\"",
            "Chứa các thông tin mô tả cho trang web, nhưng không hiển thị trực tiếp lên giao diện.\n"
            + "\n"
            + "Các thành phần thường có trong <head>:\n"
            + "\n"
            + "<title>: Tiêu đề trang (hiện trên tab trình duyệt).\n"
            + "\n"
            + "<meta>: Các thẻ mô tả dữ liệu (ví dụ khai báo charset UTF-8).\n"
            + "\n"
            + "<link>: Liên kết tới file CSS bên ngoài.\n"
            + "\n"
            + "<script>: Gắn JavaScript.\n"
            + "\n"
            + "<style>: Viết CSS trực tiếp.",
            "b. Phần <body> - Nội dung hiển thị",
            "Chứa toàn bộ nội dung mà người dùng sẽ nhìn thấy khi mở web:\n"
            + "\n"
            + "Văn bản, hình ảnh, video, bảng, biểu mẫu, menu...\n"
            + "\n"
            + "Đây là phần mà bạn thường xuyên làm việc nhất khi học HTML.",
            "Khai báo DOCTYPE\n"
            + "\n"
            + "Thông báo cho trình duyệt biết đây là tài liệu HTML5.\n"
            + "\n"
            + "Thẻ <html>\n"
            + "\n"
            + "Là thẻ bao ngoài, chứa toàn bộ nội dung của trang web.\n"
            + "\n"
            + "Phần <head>\n"
            + "\n"
            + "Chứa các thông tin không hiển thị trực tiếp như: tiêu đề, mô tả, liên kết CSS, JavaScript.\n"
            + "\n"
            + "Phần <body>\n"
            + "\n"
            + "Chứa nội dung hiển thị cho người dùng: văn bản, hình ảnh, video, liên kết,..."
        });
        Content_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "Khai báo rằng tài liệu đang dùng chuẩn HTML5.\n"
            + "\n"
            + "Giúp trình duyệt hiểu cách xử lý file HTML.",
            "Thẻ gốc bao toàn bộ nội dung trang web.\n"
            + "\n"
            + "Thường có thêm thuộc tính lang, ví dụ:",
            "Chứa thông tin cấu hình cho trang web (meta, tiêu đề, liên kết file ngoài...).\n"
            + "\n"
            + "Không hiển thị trực tiếp lên giao diện người dùng.",
            "Đặt tiêu đề trang web (hiển thị trên tab trình duyệt).\n"
            + "\n"
            + "Ví dụ:",
            "Thẻ mô tả thông tin ẩn về trang (charset, tác giả, mô tả,...).\n"
            + "\n"
            + "Ví dụ phổ biến:",
            "Dùng để kết nối tài liệu HTML với file ngoài (thường là CSS).\n"
            + "\n"
            + "Ví dụ:",
            "Chứa toàn bộ nội dung mà người dùng nhìn thấy trên trang web:\n"
            + "\n"
            + "Tiêu đề, đoạn văn, hình ảnh, video, form, liên kết,...",
            "Các thẻ tiêu đề với các cấp độ khác nhau:\n"
            + "\n"
            + "<h1> là tiêu đề lớn nhất (quan trọng nhất).\n"
            + "\n"
            + "<h6> là tiêu đề nhỏ nhất.\n"
            + "\n"
            + "Ví dụ:",
            "Thẻ đoạn văn bản.\n"
            + "\n"
            + "Ví dụ:",
            "Tạo liên kết (hyperlink) đến trang khác hoặc nơi khác.\n"
            + "\n"
            + "Ví dụ:",
            "Hiển thị hình ảnh trên trang.\n"
            + "\n"
            + "Ví dụ:",
            "Tạo danh sách:\n"
            + "\n"
            + "<ul>: Danh sách không thứ tự (dấu chấm).\n"
            + "\n"
            + "<ol>: Danh sách có thứ tự (số thứ tự).\n"
            + "\n"
            + "<li>: Mỗi mục trong danh sách.\n"
            + "\n"
            + "Ví dụ:",
            "Thẻ khối dùng để nhóm các phần tử lại với nhau.\n"
            + "\n"
            + "Không ảnh hưởng đến nội dung nhưng rất quan trọng khi kết hợp với CSS và JavaScript.",
            "Thẻ inline dùng để nhóm chữ hoặc phần tử nhỏ trong một dòng.\n"
            + "\n"
            + "Dùng nhiều để style một phần nhỏ của văn bản.",
            "<!DOCTYPE html>: Khai báo loại tài liệu HTML5.\n"
            + "\n"
            + "<html>: Bao toàn bộ nội dung trang web.\n"
            + "\n"
            + "<head>: Chứa thông tin ẩn (title, CSS, meta).\n"
            + "\n"
            + "<title>: Tiêu đề trang (hiện ở tab trình duyệt).\n"
            + "\n"
            + "<meta>: Cung cấp thông tin bổ sung cho trình duyệt.\n"
            + "\n"
            + "<link>: Kết nối tài nguyên ngoài (CSS, icon).\n"
            + "\n"
            + "<body>: Nội dung hiển thị cho người dùng.\n"
            + "\n"
            + "<h1> - <h6>: Các cấp tiêu đề từ lớn đến nhỏ.\n"
            + "\n"
            + "<p>: Viết đoạn văn bản.\n"
            + "\n"
            + "<a>: Tạo liên kết.\n"
            + "\n"
            + "<img>: Hiển thị hình ảnh.\n"
            + "\n"
            + "<ul>, <ol>, <li>: Tạo danh sách.\n"
            + "\n"
            + "<div>: Tạo khối nội dung.\n"
            + "\n"
            + "<span>: Gom nhóm nội dung nhỏ trong dòng.\n"
            + ""
        });
        Content_MAP.put("Tạo File HTML", new String[]{
            "Có thể dùng:\n"
            + "\n"
            + "Notepad (Windows)\n"
            + "\n"
            + "VS Code (Visual Studio Code)\n"
            + "\n"
            + "Sublime Text, Notepad++,...",
            "Ví dụ nội dung file:",
            "Chọn File → Save As.\n"
            + "\n"
            + "Đặt tên file, ví dụ: index.html.\n"
            + "\n"
            + "Chọn Save as type: All Files.\n"
            + "\n"
            + "Encoding nên chọn UTF-8 nếu có.",
            "Nhấp đôi vào file .html.\n"
            + "\n"
            + "Hoặc mở trình duyệt → chọn Open File → chọn file HTML vừa tạo."
        });
        Content_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            "Bước 1: Tạo và lưu file HTML (ví dụ: index.html).\n"
            + "\n"
            + "Bước 2: Nhấp đôi chuột vào file.\n"
            + "\n"
            + "File sẽ tự động mở bằng trình duyệt mặc định (Chrome, Edge, Firefox,...).",
            "Mở trình duyệt trước.\n"
            + "\n"
            + "Kéo file HTML từ thư mục → Thả vào trình duyệt.",
            "Vào trình duyệt → Nhấn Ctrl + O (hoặc File → Open File).\n"
            + "\n"
            + "Chọn file HTML → Open.",
            "Nếu dùng VS Code:\n"
            + "\n"
            + "Cài extension Live Server.\n"
            + "\n"
            + "Bấm chuột phải file HTML → Chọn Open with Live Server.\n"
            + "\n"
            + "Tự động mở file trên trình duyệt với địa chỉ dạng http://127.0.0.1:5500/.",
            "Nếu sửa nội dung file HTML:\n"
            + "\n"
            + "Nhớ lưu lại (Ctrl + S).\n"
            + "\n"
            + "Reload (F5) trình duyệt để thấy cập nhật.\n"
            + "\n"
            + "Nếu file không hiển thị đúng, kiểm tra:\n"
            + "\n"
            + "Đã lưu đúng đuôi .html chưa.\n"
            + "\n"
            + "Nội dung HTML có đúng cú pháp không."
        });
        Content_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            "Là công cụ tích hợp sẵn trong các trình duyệt như Chrome, Firefox, Edge,...\n"
            + "\n"
            + "Dùng để xem, kiểm tra và chỉnh sửa nhanh mã HTML, CSS, JavaScript.",
            "Cách 1: Bấm F12 trên bàn phím.\n"
            + "\n"
            + "Cách 2: Chuột phải vào trang web → chọn Inspect hoặc Kiểm tra.\n"
            + "\n"
            + "Cách 3: Menu trình duyệt → More Tools → Developer Tools.",
            "Trong tab Elements (hoặc Inspector):\n"
            + "\n"
            + "Xem cấu trúc HTML của trang.\n"
            + "\n"
            + "Bấm chuột phải vào phần tử → chọn Edit as HTML để chỉnh sửa trực tiếp.\n"
            + "\n"
            + "Kéo thả hoặc thêm bớt các thẻ HTML ngay trong trình duyệt.",
            "Thay đổi nội dung của thẻ <h1>.\n"
            + "\n"
            + "Thêm thẻ mới như <p>Đoạn văn mới</p>.",
            "Các chỉnh sửa trong Developer Tools chỉ có hiệu lực tạm thời.\n"
            + "\n"
            + "Khi reload (F5) trang web → mọi thay đổi sẽ mất.\n"
            + "\n"
            + "Để lưu thay đổi thật sự, bạn phải chỉnh sửa file HTML gốc rồi lưu lại.",
            "Có thể dùng Developer Tools để thử nghiệm ý tưởng nhanh trước khi cập nhật vào dự án thật.\n"
            + "\n"
            + "Kết hợp với tab Console để kiểm tra lỗi JavaScript hoặc chạy lệnh thử luôn."
        });
        Content_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "Là các thẻ HTML dùng để đánh dấu tiêu đề cho nội dung trang web.\n"
            + "\n"
            + "Các thẻ này giúp tổ chức nội dung thành các phần rõ ràng.\n"
            + "\n"
            + "Ngoài ra, còn rất quan trọng cho SEO và khả năng truy cập (Accessibility).",
            "<h1>: Tiêu đề lớn nhất của trang, dùng cho tiêu đề chính.\n"
            + "\n"
            + "Ví dụ: Tên bài viết, tên trang web.\n"
            + "\n"
            + "<h2>: Tiêu đề cấp 2, dùng cho các mục chính trong bài.\n"
            + "\n"
            + "Ví dụ: Các phần chính của bài viết.\n"
            + "\n"
            + "<h3>: Tiêu đề cấp 3, mục con của <h2>.\n"
            + "\n"
            + "Ví dụ: Các mục nhỏ trong phần chính.\n"
            + "\n"
            + "<h4>: Tiêu đề cấp 4, tiếp tục chia nhỏ nội dung trong <h3>.\n"
            + "\n"
            + "<h5>: Tiêu đề cấp 5, ít sử dụng, thường cho các chi tiết nhỏ.\n"
            + "\n"
            + "<h6>: Tiêu đề cấp nhỏ nhất, dùng cho ghi chú, phụ đề.",
            "Chỉ có 1 <h1> trên mỗi trang.\n"
            + "\n"
            + "Dùng đúng thứ tự: <h1> → <h2> → <h3>...\n"
            + "\n"
            + "Tiêu đề hỗ trợ SEO và truy cập tốt hơn.",
            "Mỗi trang web chỉ nên có 1 thẻ <h1> duy nhất để thể hiện tiêu đề chính.\n"
            + "\n"
            + "Cần sử dụng đúng thứ tự: <h1> → <h2> → <h3>... (không nên nhảy bừa).\n"
            + "\n"
            + "Tiêu đề không chỉ để chỉnh kích thước (nếu cần điều chỉnh kích thước thì dùng CSS).\n"
            + "\n"
            + "Giúp máy tìm kiếm (Google) hiểu cấu trúc trang web của bạn."
        });
        Content_MAP.put("Lỗi Thường Gặp", new String[]{
            "Mô tả: Quên không đóng một thẻ HTML có thể gây ra lỗi hiển thị hoặc cấu trúc trang bị sai.\n"
            + "\n"
            + "Cách khắc phục: Kiểm tra lại tất cả các thẻ đã mở và đóng đúng cách.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa:",
            "Mô tả: Thiếu thẻ khai báo <!DOCTYPE html> có thể khiến trình duyệt không hiển thị đúng cách.\n"
            + "\n"
            + "Cách khắc phục: Đảm bảo thẻ này nằm ở đầu tài liệu HTML.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa:",
            "Mô tả: Để link hay hình ảnh không được hiển thị đúng khi sai thuộc tính.\n"
            + "\n"
            + "Cách khắc phục: Kiểm tra kỹ các thuộc tính như src (cho ảnh) và href (cho liên kết).\n"
            + "\n"
            + "Ví dụ:",
            "Sửa: Đảm bảo file ảnh và đường dẫn đúng.",
            "Mô tả: Viết sai tên thẻ có thể làm cho trang không hiển thị đúng.\n"
            + "\n"
            + "Cách khắc phục: Kiểm tra chính tả thẻ, các thẻ HTML phải đúng tên.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa:",
            "Mô tả: Sử dụng thẻ không đúng vị trí hoặc thứ tự (ví dụ, đặt thẻ <p> bên trong <h1>).\n"
            + "\n"
            + "Cách khắc phục: Kiểm tra lại cấu trúc thẻ.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa:",
            "Mô tả: Quên thêm thẻ <meta charset=\"UTF-8\"> có thể khiến các ký tự đặc biệt không hiển thị đúng.\n"
            + "\n"
            + "Cách khắc phục: Đảm bảo thẻ này có mặt trong phần <head>.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa:",
            "Mô tả: Nếu đường dẫn đến các file CSS hoặc JS không chính xác, trang sẽ không có style hoặc không chạy được JavaScript.\n"
            + "\n"
            + "Cách khắc phục: Kiểm tra lại đường dẫn file CSS và JavaScript.\n"
            + "\n"
            + "Ví dụ:",
            "Sửa: Đảm bảo đường dẫn đúng đến vị trí file."
        });
        Content_MAP.put("Đoạn Văn (<p>)", new String[]{
            "Thẻ <p> được sử dụng để xác định đoạn văn trong tài liệu HTML.\n"
            + "\n"
            + "Mỗi thẻ <p> tạo ra một đoạn văn mới và trình duyệt sẽ tự động thêm khoảng cách giữa các đoạn văn.",
            "Tự động tạo khoảng cách giữa các đoạn văn, giúp nội dung dễ đọc hơn.\n"
            + "\n"
            + "Có thể chứa văn bản, liên kết, hình ảnh (được bao quanh bởi thẻ <img>), hoặc các thẻ HTML khác (như <strong>, <em>, <a>,…).",
            "Thẻ <p> không thể chứa các thẻ block-level như <div>, <table>, <ul>, và <ol>.\n"
            + "\n"
            + "Nếu không đóng thẻ <p> đúng cách, trình duyệt có thể tự động thêm thẻ đóng vào, nhưng sẽ không đảm bảo đúng cấu trúc bạn mong muốn.",
            "Thẻ <p> là thẻ cơ bản để tạo đoạn văn trong HTML.\n"
            + "\n"
            + "Sử dụng để phân chia nội dung văn bản thành các phần rõ ràng, dễ đọc."
        });
        Content_MAP.put("Xuống Dòng (<br>)", new String[]{
            "Thẻ <br> được sử dụng để chèn xuống dòng trong văn bản mà không cần phải tạo một đoạn văn mới như thẻ <p>.\n"
            + "\n"
            + "Thẻ <br> là một thẻ self-closing, tức là không cần phải có thẻ đóng (</br>).\n"
            + "",
            "Dùng để ngắt dòng trong văn bản mà không làm phân chia thành một đoạn văn mới.\n"
            + "\n"
            + "Chỉ xuống một dòng, không tạo ra khoảng cách như thẻ <p>.",
            "Kết quả sẽ hiển thị như sau:",
            "Không nên sử dụng quá nhiều thẻ <br> để tạo khoảng cách, vì điều này có thể làm trang web thiếu tính tổ chức và không thân thiện với SEO.\n"
            + "\n"
            + "Để tạo khoảng cách giữa các đoạn văn, nên sử dụng thẻ <p> hoặc CSS (margins, padding).",
            "Thẻ <br> giúp bạn ngắt dòng trong văn bản mà không cần tạo một đoạn văn mới.\n"
            + "\n"
            + "Lưu ý: Sử dụng <br> khi cần thiết, tránh lạm dụng thẻ này để tạo khoảng cách không cần thiết."
        });
        Content_MAP.put("Đường Ngang (<hr>)", new String[]{
            "Thẻ <hr> được sử dụng để tạo ra một đường ngang (horizontal rule) trong trang web.\n"
            + "\n"
            + "Thường dùng để tách biệt các phần nội dung hoặc phân chia các chủ đề trong trang.\n"
            + "",
            "Thẻ <hr> là một thẻ self-closing, tức là không cần thẻ đóng (</hr>).",
            "Thẻ này tạo một đường kẻ ngang xuyên suốt chiều rộng của phần tử chứa nó.\n"
            + "\n"
            + "Có thể tùy chỉnh đường kẻ ngang này bằng CSS (ví dụ: đổi màu sắc, độ dày, kiểu đường kẻ...).",
            "Kết quả sẽ là:",
            "Bạn có thể thay đổi giao diện của đường kẻ ngang này bằng CSS, ví dụ:\n"
            + "\n"
            + "Đổi màu sắc.\n"
            + "\n"
            + "Đổi độ rộng, độ dày của đường kẻ.\n"
            + "\n"
            + "Thay đổi kiểu đường kẻ (dấu chấm, nét đứt, v.v...).",
            "Không nên lạm dụng thẻ <hr> quá nhiều trong một trang web, vì sẽ làm mất đi tính tổ chức và làm trang web trở nên khó đọc.\n"
            + "\n"
            + "Thường dùng thẻ <hr> khi bạn cần phân tách các phần nội dung lớn như bài viết, các phần trong menu, v.v.",
            "Thẻ <hr> tạo ra một đường kẻ ngang để phân chia nội dung trong trang HTML.\n"
            + "\n"
            + "Có thể tùy chỉnh kiểu dáng của đường kẻ này bằng CSS để phù hợp với thiết kế của trang web.",});
        Content_MAP.put("Các Thẻ Định Dạng Phổ Biến", new String[]{
            "Dùng để in đậm một đoạn văn bản.\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "Lưu ý: Thẻ <b> chỉ đơn giản là làm đậm văn bản mà không có tác dụng ý nghĩa như thẻ <strong>.",
            "Tạo độ đậm và đồng thời biểu thị sự quan trọng hoặc nhấn mạnh.",
            "SEO: Thẻ <strong> có ý nghĩa trong việc cải thiện SEO vì nó làm nổi bật nội dung quan trọng.",
            "Dùng để in nghiêng văn bản.",
            "Lưu ý: Thẻ <i> không mang tính nhấn mạnh như thẻ <em>.",
            "Tạo in nghiêng và mang ý nghĩa nhấn mạnh.",
            "SEO: Thẻ <em> có ý nghĩa trong SEO, giúp công cụ tìm kiếm nhận diện nội dung cần nhấn mạnh.",
            "Dùng để gạch dưới một đoạn văn bản",
            "Dùng để đánh dấu một phần văn bản, thường là màu nền vàng.",
            "Dùng để hiển thị văn bản nhỏ hơn bình thường.",
            "Dùng để gạch bỏ văn bản, thường dùng để chỉ ra văn bản đã bị xóa.",
            "Dùng để chèn thêm văn bản, thường hiển thị dưới dạng gạch dưới.",
            "Dùng để tạo chữ dưới (như trong công thức hóa học hoặc toán học).",
            "Dùng để tạo chữ trên (như trong lũy thừa hoặc chỉ số mũ).",
            "Dùng để tạo một liên kết đến một URL khác.",
            "Dùng để tạo danh sách không có thứ tự (bullet points).",
            "Dùng để tạo danh sách có thứ tự (số thứ tự).",
            "Dùng để định dạng đoạn mã (thường dùng trong lập trình).",
            "Dùng để giữ nguyên định dạng văn bản, bao gồm các khoảng trắng và dấu xuống dòng.\n"
            + "",
            "Các thẻ định dạng trong HTML giúp bạn:\n"
            + "\n"
            + "Tạo kiểu cho văn bản (in đậm, nghiêng, gạch dưới, v.v.).\n"
            + "\n"
            + "Nhấn mạnh thông tin quan trọng (như trong thẻ <strong> hoặc <em>).\n"
            + "\n"
            + "Tạo các danh sách và liên kết dễ dàng.",});
        Content_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new String[]{
            "<b>: In đậm.\n"
            + "\n"
            + "<strong>: Nhấn mạnh (in đậm và quan trọng).\n"
            + "\n"
            + "<i>: In nghiêng.\n"
            + "\n"
            + "<u>: Gạch dưới.\n"
            + "\n"
            + "<mark>: Đánh dấu.\n"
            + "\n"
            + "<del>: Gạch bỏ văn bản.\n"
            + "\n"
            + "<ins>: Chèn thêm văn bản.\n"
            + "\n"
            + "<sub>: Chữ dưới (subscript).\n"
            + "\n"
            + "<sup>: Chữ trên (superscript).\n"
            + "\n"
            + "<a>: Tạo liên kết.\n"
            + "\n"
            + "<ul> và <ol>: Danh sách không thứ tự và có thứ tự.\n"
            + "\n"
            + "<code>: Định dạng đoạn mã.\n"
            + "\n"
            + "<pre>: Văn bản định dạng sẵn.",
            "Các đoạn văn bản được in đậm, in nghiêng, gạch dưới, đánh dấu sẽ được hiển thị tương ứng.\n"
            + "\n"
            + "Các thẻ <ul> và <ol> tạo ra danh sách không thứ tự và có thứ tự.\n"
            + "\n"
            + "<code> và <pre> sẽ giúp bạn hiển thị mã nguồn hoặc văn bản theo đúng định dạng ban đầu.\n"
            + ""
        });
        Content_MAP.put("Danh sách là gì?", new String[]{
            "Danh sách là một tập hợp gồm nhiều phần tử, các phần tử này có thể cùng loại hoặc khác loại, và có trật tự rõ ràng (nghĩa là phần tử đứng trước, phần tử đứng sau được xác định).\n"
            + "\n"
            + "Mục đích của việc lập danh sách là để quản lý thông tin dễ dàng hơn, dễ tìm kiếm, dễ thêm bớt, hoặc xử lý.",
            "Danh sách học sinh trong lớp.\n"
            + "\n"
            + "Danh sách công việc cần làm trong ngày (to-do list).\n"
            + "\n"
            + "Danh sách món ăn trong thực đơn (menu).",
            "Có thứ tự: Các phần tử được sắp xếp theo một trật tự nhất định.\n"
            + "\n"
            + "Có thể trùng lặp: Một danh sách có thể chứa các phần tử giống nhau.\n"
            + "\n"
            + "Kích thước động (trong một số trường hợp): Danh sách có thể thêm hoặc xóa phần tử linh hoạt (nhất là trong lập trình).",
            "Danh sách tuyến tính: Các phần tử được nối tiếp nhau một cách thẳng hàng (ví dụ như list trong Python, array trong C++).\n"
            + "\n"
            + "Danh sách liên kết (Linked List): Các phần tử (node) liên kết với nhau bằng các con trỏ.\n"
            + "\n"
            + "Danh sách phân cấp: Danh sách có các cấp bậc, giống như cây (tree), ví dụ như danh sách thư mục trong máy tính.",
            "Trong lập trình, danh sách (List) là một kiểu dữ liệu cấu trúc rất phổ biến. Ví dụ:\n"
            + "\n"
            + "Python: dùng list",
            "Java: dùng ArrayList hoặc LinkedList\n"
            + "\n"
            + "java\n"
            + "Copy\n"
            + "Edit",
            "C++: dùng vector hoặc list",
            "Các thao tác thường làm với danh sách:\n"
            + "\n"
            + "Thêm phần tử (Add)\n"
            + "\n"
            + "Xóa phần tử (Remove)\n"
            + "\n"
            + "Tìm kiếm phần tử (Search)\n"
            + "\n"
            + "Duyệt qua danh sách (Iterate)",
            "Giúp con người hệ thống hóa công việc, tránh bỏ sót.\n"
            + "\n"
            + "Giúp máy tính lưu trữ dữ liệu một cách hiệu quả để xử lý.\n"
            + "\n"
            + "Ứng dụng trong mọi lĩnh vực: giáo dục, y tế, thương mại điện tử, quản lý kho, quản lý nhân sự, v.v.\n"
            + ""
        });
        Content_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new String[]{
            "Thẻ <ol> trong HTML dùng để tạo danh sách có thứ tự.\n"
            + "\n"
            + "Mỗi phần tử bên trong danh sách được đặt trong thẻ <li>.\n"
            + "\n"
            + "Khi trình duyệt hiển thị, các mục sẽ được đánh số tự động theo thứ tự (1, 2, 3,...).\n"
            + "\n"
            + "Ví dụ đơn giản:",
            "Kết quả:\n"
            + "\n"
            + "Chuẩn bị bài\n"
            + "\n"
            + "Tham gia lớp học\n"
            + "\n"
            + "Ôn tập sau giờ học",
            "Đổi kiểu số thứ tự: Bạn có thể đổi thành chữ cái hoặc số La Mã bằng cách thêm thuộc tính type.\n"
            + "\n"
            + "Ví dụ:",
            "Kết quả:\n"
            + "A. HTML\n"
            + "B. CSS\n"
            + "C. JavaScript\n"
            + "\n"
            + "Chọn số bắt đầu: Muốn bắt đầu danh sách từ số bất kỳ (không phải 1), dùng thuộc tính start.\n"
            + "\n"
            + "Ví dụ:",
            "Kết quả: 5. Bước một\n"
            + "6. Bước hai\n"
            + "\n"
            + "Đếm ngược: Nếu muốn danh sách hiển thị ngược lại (giảm dần), bạn thêm từ khóa reversed.\n"
            + "\n"
            + "Ví dụ:",
            "Kết quả: 3. Phần ba\n"
            + "2. Phần hai\n"
            + "\n"
            + "Phần một\n"
            + "",
            "Bạn nên dùng <ol> khi:\n"
            + "\n"
            + "Cần thể hiện trình tự thực hiện (ví dụ: các bước nấu ăn, hướng dẫn sử dụng).\n"
            + "\n"
            + "Muốn nhấn mạnh độ ưu tiên hoặc xếp hạng (ví dụ: top 5 bộ phim yêu thích).\n"
            + "\n"
            + "Nếu chỉ đơn thuần là liệt kê mà không quan trọng thứ tự, thì dùng <ul> (danh sách không thứ tự) sẽ phù hợp hơn.",
            "Bạn có thể lồng danh sách vào bên trong danh sách khác. Ví dụ:",
            "Ở đây, phần lớn là danh sách có thứ tự (<ol>) và bên trong từng bước là danh sách không thứ tự (<ul>).",
            "<ol> → danh sách có thứ tự.\n"
            + "\n"
            + "<ul> → danh sách không thứ tự.\n"
            + "\n"
            + "<li> → từng mục (item) trong danh sách."

        });
        Content_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new String[]{
            "Thẻ <ul> (Unordered List) dùng để tạo danh sách không có thứ tự.\n"
            + "\n"
            + "Các mục trong danh sách được đặt trong thẻ <li>.\n"
            + "\n"
            + "Khi hiển thị, mỗi mục sẽ có một dấu đầu dòng (mặc định là dấu chấm tròn).",
            "Trình duyệt sẽ tự động thêm dấu chấm đầu dòng:\n"
            + "\n"
            + "Ăn sáng\n"
            + "\n"
            + "Đi học\n"
            + "\n"
            + "Thể dục thể thao",
            "Bạn có thể thay đổi kiểu dấu đầu dòng bằng cách sử dụng CSS với thuộc tính list-style-type.\n"
            + "Một số kiểu thông dụng:\n"
            + "\n"
            + "disc: Dấu chấm tròn đặc (đây là kiểu mặc định).\n"
            + "\n"
            + "circle: Dấu tròn rỗng (không tô đậm).\n"
            + "\n"
            + "square: Dấu hình vuông nhỏ.\n"
            + "\n"
            + "none: Không có dấu đầu dòng.\n"
            + "\n"
            + "Ví dụ thay đổi sang dấu vuông:",
            "Kết quả: Các mục sẽ được đánh dấu bằng hình vuông thay vì chấm tròn.\n"
            + "",
            "Bạn nên dùng <ul> trong trường hợp:\n"
            + "\n"
            + "Các mục không cần theo thứ tự cụ thể.\n"
            + "\n"
            + "Chỉ đơn giản là liệt kê các thông tin.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Danh sách sở thích\n"
            + "\n"
            + "Danh sách đồ dùng cần mang theo\n"
            + "\n"
            + "Các bước chuẩn bị cho một sự kiện\n"
            + "",
            "Bạn có thể lồng danh sách <ul> này vào bên trong <li> của một danh sách <ul> khác.\n"
            + "\n"
            + "Ví dụ:",
            "Hiển thị như sau:\n"
            + "\n"
            + "Môn học yêu thích\n"
            + "\n"
            + "Toán\n"
            + "\n"
            + "Văn\n"
            + "\n"
            + "Tiếng Anh\n"
            + "\n"
            + "Hoạt động ngoại khóa\n"
            + "\n"
            + "Đá bóng\n"
            + "\n"
            + "Vẽ tranh",
            "<ul> → Tạo danh sách không thứ tự.\n"
            + "\n"
            + "<li> → Từng mục trong danh sách.\n"
            + "\n"
            + "Có thể đổi kiểu dấu đầu dòng bằng CSS (list-style-type).\n"
            + ""
        });
        Content_MAP.put("Danh Sách Mô Tả (<dl>)", new String[]{
            "Thẻ <dl> là viết tắt của Description List — Danh sách mô tả.\n"
            + "\n"
            + "Dùng để liệt kê một loạt các thuật ngữ (term) và giải thích ý nghĩa (description) tương ứng với từng thuật ngữ đó.\n"
            + "\n"
            + "Thường gặp trong:\n"
            + "\n"
            + "Từ điển\n"
            + "\n"
            + "Danh sách thông tin sản phẩm\n"
            + "\n"
            + "Bảng giải thích thuật ngữ",
            "Một danh sách mô tả trong HTML thường có 3 loại thẻ:\n"
            + "\n"
            + "<dl>: Bọc toàn bộ danh sách\n"
            + "\n"
            + "<dt> (Description Term): Thuật ngữ hoặc tiêu đề\n"
            + "\n"
            + "<dd> (Description Definition): Nội dung mô tả cho thuật ngữ đó\n"
            + "\n"
            + "Ví dụ:",
            "Hiển thị như:\n"
            + "\n"
            + "HTML\n"
            + "Ngôn ngữ đánh dấu để xây dựng trang web.\n"
            + "\n"
            + "CSS\n"
            + "Ngôn ngữ tạo phong cách cho trang web.\n"
            + "\n"
            + "JavaScript\n"
            + "Ngôn ngữ lập trình để làm trang web tương tác.\n"
            + "",
            "Một <dt> có thể đi kèm nhiều <dd>, nếu cần mô tả nhiều ý cho một thuật ngữ.\n"
            + "\n"
            + "<dd> có thể chứa bất kỳ nội dung HTML nào: văn bản, hình ảnh, liên kết, thậm chí cả danh sách con.\n"
            + "\n"
            + "Mặc định, trình duyệt sẽ thụt lề phần mô tả (<dd>) để phân biệt với thuật ngữ (<dt>).\n"
            + "",
            "Một thuật ngữ với nhiều mô tả:",
            "Hiển thị:\n"
            + "\n"
            + "HTML\n"
            + "HyperText Markup Language.\n"
            + "Dùng để tạo cấu trúc cơ bản cho website.",
            "Bạn nên dùng <dl> khi:\n"
            + "\n"
            + "Cần giải thích các thuật ngữ.\n"
            + "\n"
            + "Muốn liệt kê thuộc tính và mô tả chi tiết cho mỗi mục.\n"
            + "\n"
            + "Muốn tạo giao diện giống như từ điển hoặc giải thích thông tin sản phẩm.",
            "<dl>: Khung cho danh sách mô tả.\n"
            + "\n"
            + "<dt>: Tiêu đề/thuật ngữ.\n"
            + "\n"
            + "<dd>: Nội dung giải thích/mô tả."
        });
        Content_MAP.put("Chèn Ảnh (<img>)", new String[]{
            "<img>: Là thẻ để chèn ảnh. Đây là thẻ không có thẻ đóng.\n"
            + "\n"
            + "src: Thuộc tính bắt buộc để chỉ đường dẫn tới ảnh (có thể là URL hoặc đường dẫn file cục bộ).\n"
            + "\n"
            + "alt: Thuộc tính mô tả nội dung của ảnh, giúp cải thiện khả năng tiếp cận (accessibility) và SEO.",
            "src: Chỉ đường dẫn ảnh.\n"
            + "Ví dụ: src=\"images/photo.jpg\"\n"
            + "\n"
            + "alt: Mô tả ảnh. Đây là thuộc tính quan trọng nếu ảnh không thể tải được, hoặc với người dùng khiếm thị sử dụng công nghệ hỗ trợ. Ví dụ: alt=\"Hình ảnh mô tả về phong cảnh\"\n"
            + "\n"
            + "width và height: Điều chỉnh kích thước của ảnh.\n"
            + "\n"
            + "Ví dụ: width=\"300\" height=\"200\"\n"
            + "\n"
            + "Lưu ý: Nếu chỉ thay đổi một trong hai, ảnh có thể bị biến dạng.\n"
            + "\n"
            + "title: Hiển thị mô tả ngắn khi người dùng rê chuột lên ảnh. Ví dụ: title=\"Hình ảnh đẹp\"",
            "Ảnh từ URL:",
            "Ảnh từ file cục bộ:",
            "Lưu ý: Đối với ảnh từ file cục bộ, bạn cần đảm bảo đường dẫn đúng và ảnh cần có trong thư mục thích hợp.\n"
            + "",
            "Khi ảnh không thể tải được, thuộc tính alt sẽ hiển thị thay thế cho ảnh, giúp người dùng hiểu rõ nội dung ảnh là gì.",
            "Thẻ <img> có thể thay đổi kích thước theo chiều ngang và dọc:\n"
            + "\n"
            + "Cách 1: Đặt kích thước trực tiếp trong thẻ:",
            "Cách 2: Sử dụng CSS để thay đổi kích thước linh hoạt hơn:",
            "Lưu ý: Khi chỉnh kích thước ảnh, nếu bạn chỉ thay đổi một trong hai chiều, chiều còn lại sẽ tự động được tính toán để giữ tỷ lệ gốc của ảnh.",
            "Chèn ảnh sử dụng thẻ <img> với các thuộc tính cơ bản như src, alt, width, height.\n"
            + "\n"
            + "Thẻ <img> không có thẻ đóng.\n"
            + "\n"
            + "Đảm bảo cung cấp mô tả alt để hỗ trợ SEO và người dùng khiếm thị.\n"
            + "\n"
            + "Có thể điều chỉnh kích thước ảnh thông qua thuộc tính width, height hoặc CSS."
        });
        Content_MAP.put("Chèn Video (<video>)", new String[]{
            "<video>: Thẻ để chèn video.\n"
            + "\n"
            + "src: Thuộc tính chỉ đường dẫn đến file video.\n"
            + "\n"
            + "controls: Thuộc tính cho phép hiển thị các điều khiển video (play, pause, volume, progress bar).",
            "src: Chỉ đường dẫn đến file video. Ví dụ: src=\"video.mp4\"\n"
            + "\n"
            + "controls: Hiển thị các điều khiển video như nút play, pause, âm lượng.",
            "autoplay: Video sẽ tự động phát ngay khi tải trang (không yêu cầu người dùng nhấn nút play).",
            "loop: Video sẽ phát lại liên tục sau khi kết thúc.",
            "muted: Video sẽ được phát mà không có âm thanh.",
            "poster: Chỉ định hình ảnh thay thế cho video trước khi video bắt đầu.",
            "Để video có thể chạy trên nhiều trình duyệt khác nhau, bạn nên cung cấp nhiều định dạng video khác nhau, vì không phải trình duyệt nào cũng hỗ trợ tất cả định dạng video.\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "<source>: Được sử dụng để chỉ định các tệp video thay thế với các định dạng khác nhau.\n"
            + "\n"
            + "Trình duyệt sẽ sử dụng định dạng đầu tiên mà nó hỗ trợ.",
            "Video sẽ tự động phát, phát lại liên tục, và không có âm thanh.\n"
            + "\n"
            + "Nếu không có video nào có thể phát, trình duyệt sẽ hiển thị thông báo thay thế: \"Trình duyệt của bạn không hỗ trợ thẻ video.\"\n"
            + "\n"
            + "poster=\"poster-image.jpg\": Hình ảnh thay thế sẽ xuất hiện trước khi video được phát.",
            "Thẻ <video> giúp nhúng video vào trang web, với nhiều tùy chọn như tự động phát, lặp lại, hay điều khiển âm thanh.\n"
            + "\n"
            + "Bạn có thể sử dụng nhiều định dạng video để tương thích với nhiều trình duyệt.\n"
            + "\n"
            + "Các thuộc tính phổ biến bao gồm: controls, autoplay, loop, muted, poster, src.\n"
            + ""
        });
        Content_MAP.put("Chèn Âm Thanh (<audio>)", new String[]{
            "<audio>: Thẻ để chèn âm thanh vào trang web.\n"
            + "\n"
            + "src: Thuộc tính chứa đường dẫn tới file âm thanh.\n"
            + "\n"
            + "controls: Thuộc tính cho phép hiển thị các điều khiển âm thanh (play, pause, volume).\n"
            + "",
            "src: Chỉ định đường dẫn đến file âm thanh.",
            "controls: Cho phép hiển thị các điều khiển âm thanh như play, pause, âm lượng.",
            "autoplay: Âm thanh sẽ tự động phát ngay khi trang tải xong mà không cần người dùng nhấn play.",
            "loop: Âm thanh sẽ phát lại liên tục khi kết thúc.\n"
            + "",
            "muted: Âm thanh sẽ được phát mà không có âm thanh (tắt tiếng).\n"
            + "",
            "preload: Chỉ định cách tải âm thanh khi trang được tải.\n"
            + "\n"
            + "auto: Tải toàn bộ âm thanh khi trang tải.\n"
            + "\n"
            + "metadata: Chỉ tải thông tin về âm thanh.\n"
            + "\n"
            + "none: Không tải âm thanh cho đến khi người dùng nhấn play.\n"
            + "",
            "Giống như video, để âm thanh có thể chơi trên nhiều trình duyệt khác nhau, bạn nên cung cấp các định dạng âm thanh khác nhau.",
            "<source>: Được sử dụng để cung cấp các định dạng âm thanh thay thế.\n"
            + "\n"
            + "Trình duyệt sẽ sử dụng định dạng đầu tiên mà nó hỗ trợ.",
            "Âm thanh sẽ tự động phát, phát lại liên tục, và không có âm thanh (tắt tiếng).\n"
            + "\n"
            + "preload=\"auto\": Âm thanh sẽ được tải ngay khi trang được tải.\n"
            + "\n"
            + "<source>: Cung cấp các định dạng âm thanh thay thế cho các trình duyệt khác nhau.\n"
            + "",
            "Thẻ <audio> giúp nhúng âm thanh vào trang web, với các thuộc tính như controls, autoplay, loop, muted, preload.\n"
            + "\n"
            + "Cung cấp nhiều định dạng âm thanh như MP3, OGG, WAV để tương thích với nhiều trình duyệt.\n"
            + "\n"
            + "Sử dụng thuộc tính controls để cung cấp các điều khiển cho người dùng (play, pause, volume)."
        });
        Content_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new String[]{
            "<a>: Là thẻ để tạo liên kết.\n"
            + "\n"
            + "href: Thuộc tính chứa địa chỉ URL mà liên kết sẽ dẫn tới.\n"
            + "\n"
            + "Văn bản hiển thị: Đây là phần nội dung mà người dùng sẽ nhìn thấy và nhấn vào để đi đến liên kết.",
            "Khi người dùng nhấn vào \"Truy cập Example\", trình duyệt sẽ mở trang https://www.example.com.",
            "href: Chỉ định địa chỉ URL mà liên kết trỏ đến.\n"
            + "\n"
            + "Ví dụ:",
            "target: Điều khiển nơi liên kết sẽ mở:\n"
            + "\n"
            + "_self (mặc định): Mở liên kết trong cùng cửa sổ/tab.\n"
            + "\n"
            + "_blank: Mở liên kết trong một cửa sổ/tab mới.\n"
            + "\n"
            + "_parent: Mở liên kết trong cửa sổ cha.\n"
            + "\n"
            + "_top: Mở liên kết trong toàn bộ cửa sổ.\n"
            + "\n"
            + "Ví dụ:",
            "title: Mô tả ngắn về liên kết. Khi người dùng rê chuột lên liên kết, mô tả này sẽ hiển thị.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "rel: Cung cấp mối quan hệ giữa trang hiện tại và trang mà liên kết trỏ đến. Dùng khi liên kết mở trang trong tab mới (target=\"_blank\") để cải thiện bảo mật.\n"
            + "\n"
            + "Ví dụ:",
            "Liên kết đến một trang web bên ngoài:",
            "Liên kết đến một trang trong cùng một website:",
            "Liên kết đến một phần trong cùng một trang (đoạn văn hoặc mục cụ thể):\n"
            + "\n"
            + "Để làm điều này, bạn cần sử dụng id cho phần muốn dẫn tới và tham chiếu nó trong thẻ <a>.\n"
            + "\n"
            + "Đầu tiên, tạo một mục với id:",
            "Sau đó, tạo liên kết đến mục đó:",
            "Thẻ <a> là công cụ chủ yếu để tạo liên kết trong HTML.\n"
            + "\n"
            + "Liên kết có thể trỏ đến URL bên ngoài hoặc mục nội bộ của trang.\n"
            + "\n"
            + "Các thuộc tính như href, target, title, rel giúp tùy chỉnh hành vi của liên kết.\n"
            + ""
        });
        Content_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new String[]{
            "Bạn cần đặt thuộc tính id cho phần tử bạn muốn nhảy tới",
            "id=\"gioi-thieu\": Đây là \"mốc\" để liên kết tới.",
            "Sử dụng thẻ <a> và đặt giá trị của href là #id đã gán ở trên.",
            "Dấu # báo hiệu đây là liên kết nội bộ, theo sau là giá trị id.\n"
            + "",
            " Khi người dùng nhấn vào \"Dịch vụ\" trong menu, trình duyệt sẽ tự động cuộn xuống tới phần <h2 id=\"dich-vu\">.\n"
            + "",
            "id phải duy nhất trong mỗi trang.\n"
            + "\n"
            + "Tên id nên đơn giản, không dấu, không khoảng trắng (dùng gạch ngang hoặc gạch dưới nếu cần).\n"
            + "\n"
            + "Có thể kết hợp liên kết nội bộ với CSS để tạo hiệu ứng cuộn mượt (smooth scrolling).",
            "Bạn có thể thêm hiệu ứng cuộn mượt bằng CSS:",
            "Khi đó, khi nhấn vào liên kết, trang sẽ cuộn từ từ thay vì nhảy ngay lập tức."
        });
        Content_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new String[]{
            "Ý nghĩa:\n"
            + "Xác định địa chỉ URL hoặc ID của phần tử trong trang để liên kết tới.\n"
            + "\n"
            + "Ví dụ:",
            "Giải thích thêm:\n"
            + "Nếu href trỏ tới một website (https://...), liên kết sẽ chuyển hướng đến đó. Nếu href trỏ tới một ID (ví dụ: #gioithieu), nó sẽ cuộn tới đúng vị trí trong cùng trang.\n"
            + "\n"
            + "Lưu ý: Nếu không có href, thẻ <a> sẽ không có chức năng liên kết.\n"
            + "",
            "Ý nghĩa:\n"
            + "Chỉ định cách hiển thị tài liệu được liên kết.\n"
            + "\n"
            + "Các giá trị phổ biến:\n"
            + "\n"
            + "_self: (Mặc định) Mở link trong tab hiện tại.\n"
            + "\n"
            + "_blank: Mở link trong tab mới.\n"
            + "\n"
            + "_parent: Mở trong frame cha (ít dùng).\n"
            + "\n"
            + "_top: Mở trên toàn bộ trình duyệt, phá vỡ các frameset.\n"
            + "\n"
            + "Ví dụ:",
            "Lưu ý:\n"
            + "Khi dùng target=\"_blank\", nên thêm rel=\"noopener noreferrer\" để tránh lỗ hổng bảo mật.\n"
            + "",
            "Ý nghĩa:\n"
            + "Hiển thị dòng chú thích nhỏ (tooltip) khi người dùng rê chuột vào liên kết.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "Lưu ý:\n"
            + "title chỉ hỗ trợ văn bản ngắn gọn. Không nên thay thế hoàn toàn nội dung chính bằng tooltip.\n"
            + "",
            "Ý nghĩa:\n"
            + "Khi người dùng click vào link, trình duyệt sẽ tải file về thay vì mở nó.\n"
            + "\n"
            + "Ví dụ:",
            "Mở rộng:\n"
            + "Bạn có thể chỉ định tên file tải về bằng cách thêm giá trị cho download, ví dụ:",
            "Lưu ý:\n"
            + "Chỉ hoạt động với các file cùng domain hoặc server cho phép tải.\n"
            + "",
            "Ý nghĩa:\n"
            + "Xác định mối quan hệ giữa tài liệu hiện tại và tài liệu được liên kết.\n"
            + "\n"
            + "Ví dụ:",
            "Một số giá trị hay gặp:\n"
            + "\n"
            + "noopener: Ngăn trang được mở kiểm soát trang hiện tại.\n"
            + "\n"
            + "noreferrer: Không gửi thông tin referrer (nguồn gốc click).\n"
            + "\n"
            + "nofollow: Dùng trong SEO, yêu cầu Google không theo link này.\n"
            + "\n"
            + "Lưu ý:\n"
            + "Với target=\"_blank\", luôn nên thêm rel=\"noopener noreferrer\" để tránh bị tấn công kiểu \"tabnabbing\".",});
        Content_MAP.put("Liên Kết Hình Ảnh", new String[]{
            "Ngoài việc tạo liên kết văn bản, bạn hoàn toàn có thể chèn hình ảnh làm liên kết trong HTML.\n"
            + "Khi người dùng nhấn vào hình ảnh, họ sẽ được chuyển đến một trang web hoặc một vị trí khác.",
            "<a>: Thẻ tạo liên kết.\n"
            + "\n"
            + "<img>: Thẻ chèn hình ảnh, nằm bên trong thẻ <a>.\n"
            + "\n"
            + "href: Địa chỉ trang cần tới.\n"
            + "\n"
            + "src: Đường dẫn hình ảnh cần hiển thị.\n"
            + "\n"
            + "alt: Văn bản thay thế mô tả hình ảnh (giúp SEO tốt hơn và hỗ trợ người khiếm thị).\n"
            + "",
            "Liên kết tới trang chủ bằng logo:",
            "Kích thước ảnh:\n"
            + "Có thể dùng thuộc tính width và height để điều chỉnh kích thước hình ảnh trong liên kết.\n"
            + "\n"
            + "Thêm target=\"_blank\":\n"
            + "Nếu muốn mở liên kết trong tab mới khi click hình ảnh:",
            "SEO:\n"
            + "Luôn thêm alt cho ảnh để cải thiện SEO và khả năng truy cập.\n"
            + "\n"
            + "Styling:\n"
            + "Có thể dùng CSS để thay đổi cách hiển thị hình ảnh, ví dụ thêm hiệu ứng hover:",
            "<a>:\n"
            + "→ Dùng để tạo liên kết trong HTML.\n"
            + "\n"
            + "<img>:\n"
            + "→ Dùng để chèn hình ảnh vào trong trang web.\n"
            + "\n"
            + "Thuộc tính href:\n"
            + "→ Xác định địa chỉ URL mà liên kết sẽ trỏ tới.\n"
            + "\n"
            + "Thuộc tính src:\n"
            + "→ Chỉ ra đường dẫn đến hình ảnh được chèn.\n"
            + "\n"
            + "Thuộc tính alt:\n"
            + "→ Mô tả nội dung hình ảnh (giúp SEO, truy cập cho người khiếm thị)."
        });
        Content_MAP.put("Cấu Trúc Thẻ <iframe>", new String[]{
            "Thẻ <iframe> trong HTML dùng để nhúng một tài liệu HTML khác vào trong trang web hiện tại.\n"
            + "Bạn có thể dùng <iframe> để hiển thị:\n"
            + "\n"
            + "Một trang web khác\n"
            + "\n"
            + "Video YouTube\n"
            + "\n"
            + "Bản đồ Google Maps\n"
            + "\n"
            + "Hoặc tài liệu bên ngoài (PDF, biểu mẫu...)",
            "Trong đó:\n"
            + "\n"
            + "src: Đường dẫn tới trang web hoặc tài liệu muốn nhúng.",
            "src:\n"
            + "→ Đường dẫn tài nguyên cần nhúng vào iframe.\n"
            + "\n"
            + "width:\n"
            + "→ Xác định chiều rộng của iframe (đơn vị pixel hoặc phần trăm).\n"
            + "\n"
            + "height:\n"
            + "→ Xác định chiều cao của iframe.\n"
            + "\n"
            + "title:\n"
            + "→ Mô tả nội dung bên trong iframe, hỗ trợ SEO và Accessibility.\n"
            + "\n"
            + "frameborder (cũ, ít dùng):\n"
            + "→ Xác định có viền hay không (giá trị 0 là không có viền).\n"
            + "\n"
            + "allowfullscreen:\n"
            + "→ Cho phép iframe hiển thị ở chế độ toàn màn hình (thường dùng với video).\n"
            + "\n"
            + "loading:\n"
            + "→ Tối ưu hiệu suất tải trang:\n"
            + "\n"
            + "lazy: Chỉ tải iframe khi cuộn tới gần nó.\n"
            + "\n"
            + "eager: Tải iframe ngay lập tức.",
            "Nhúng một website khác:",
            "Nhúng Video YouTube:",
            "Nhúng bản đồ Google Maps:",
            "Không phải tất cả trang web đều cho phép bạn nhúng qua iframe (họ có thể chặn bằng bảo mật X-Frame-Options).\n"
            + "\n"
            + "Nên thêm title cho iframe để cải thiện khả năng truy cập (accessibility).\n"
            + "\n"
            + "Có thể dùng loading=\"lazy\" để tối ưu tốc độ tải trang.\n"
            + "\n"
            + "Hạn chế lạm dụng iframe nếu không cần thiết, vì nó có thể ảnh hưởng đến hiệu suất trang web."
        });
        Content_MAP.put("Tại Sao Sử Dụng Iframe?", new String[]{
            "Giúp hiển thị trang web, video, bản đồ, tài liệu từ nguồn bên ngoài mà không cần tải lại trang.\n"
            + "\n"
            + "Ví dụ: Nhúng video YouTube, Google Maps, tài liệu PDF.",
            "Thay vì tự lập trình mọi thứ, bạn có thể mượn nội dung hoặc chức năng từ các trang dịch vụ khác.\n"
            + "\n"
            + "Ví dụ: Nhúng form đăng ký, chatbot, lịch biểu.",
            "Nội dung trong iframe luôn được cập nhật theo trang nguồn.\n"
            + "Bạn không cần chỉnh sửa thủ công khi họ thay đổi.\n"
            + "\n"
            + "Ví dụ: Bản đồ Google Maps sẽ tự update vị trí/địa điểm mới.",
            "Nội dung bên trong iframe hoạt động độc lập với trang chính.\n"
            + "\n"
            + "Nếu nội dung iframe bị lỗi hoặc chậm, nó không ảnh hưởng tới toàn bộ trang web của bạn.",
            "Các trình duyệt hiện đại cho phép kiểm soát iframe bằng các chính sách bảo mật (như sandbox, allow,...) để hạn chế rủi ro.\n"
            + "\n"
            + "Bạn có thể hạn chế iframe chỉ được làm những việc nhất định (không cho chạy script, không cho gửi form,...).\n"
            + "",
            "Iframe = cách đơn giản + nhanh + linh hoạt để nhúng nội dung từ bên ngoài vào trang web mà vẫn kiểm soát được an toàn và hiệu suất!"
        });
        Content_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new String[]{
            "Sử dụng sandbox:\n"
            + "Để tăng cường bảo mật, bạn có thể sử dụng thuộc tính sandbox trong iframe. Điều này sẽ hạn chế các hoạt động như chạy JavaScript hoặc gửi form từ nội dung trong iframe.\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "Các giá trị có thể dùng với sandbox:\n"
            + "\n"
            + "allow-forms: Cho phép gửi form.\n"
            + "\n"
            + "allow-scripts: Cho phép chạy JavaScript.\n"
            + "\n"
            + "allow-same-origin: Cho phép iframe truy cập cùng một nguồn.\n"
            + "\n"
            + "Cảnh giác với target=\"_blank\":\n"
            + "Khi sử dụng target=\"_blank\" với các liên kết trong iframe, hãy nhớ thêm rel=\"noopener noreferrer\" để tránh lỗ hổng bảo mật gọi là tabnabbing.",
            "Chỉ tải iframe khi cần thiết:\n"
            + "Sử dụng thuộc tính loading=\"lazy\" để trì hoãn việc tải iframe cho đến khi người dùng cuộn tới nó.",
            "Đặt kích thước iframe cụ thể:\n"
            + "Hãy xác định chiều rộng và chiều cao của iframe để tránh việc trang bị chậm do phải tính toán lại kích thước trong lúc tải.\n"
            + "\n"
            + "html\n"
            + "Copy\n"
            + "Edit",
            "Xử lý nội dung từ domain khác:\n"
            + "Các trang web có thể chặn việc nhúng iframe từ các domain khác thông qua chính sách X-Frame-Options hoặc Content Security Policy. Nếu trang bạn muốn nhúng không cho phép iframe, bạn sẽ không thể làm được.\n"
            + "\n"
            + "Cân nhắc khi sử dụng iframe với nội dung động:\n"
            + "Nếu bạn đang nhúng một trang có nội dung thay đổi liên tục (như bảng điều khiển, ứng dụng), hãy chắc chắn rằng trang đó hoạt động tốt trong iframe và không làm gián đoạn trải nghiệm người dùng.",
            "Không ảnh hưởng nhiều đến SEO trực tiếp:\n"
            + "Nội dung bên trong iframe không được tính vào SEO của trang chính. Vì vậy, hãy sử dụng iframe cho những nội dung không quan trọng đối với SEO của trang web chính.\n"
            + "\n"
            + "Thêm thuộc tính title:\n"
            + "Để cải thiện khả năng truy cập, hãy luôn thêm thuộc tính title cho iframe. Điều này giúp người dùng có thể hiểu rõ nội dung bên trong iframe mà không phải nhìn thấy nó trực tiếp.",
            "Trải nghiệm người dùng:\n"
            + "Đảm bảo rằng nội dung trong iframe có thể dễ dàng truy cập và tương tác trên các thiết bị di động. Cần phải kiểm tra tính tương thích của iframe với các kích thước màn hình khác nhau.\n"
            + "\n"
            + "Giới hạn chiều rộng và chiều cao:\n"
            + "Khi nhúng nội dung iframe, hãy cẩn thận với việc đặt kích thước quá nhỏ hoặc quá lớn vì nó có thể ảnh hưởng đến bố cục trang web của bạn."
        });
        Content_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new String[]{
            "Bảng trong HTML được sử dụng để hiển thị dữ liệu theo dạng hàng và cột. Thẻ <table> là thẻ chứa bảng, và bên trong bảng sẽ có các thẻ như <tr>, <th>, và <td>.",
            "<table>: Dùng để tạo bảng.\n"
            + "\n"
            + "<tr>: Dùng để tạo một hàng trong bảng.\n"
            + "\n"
            + "<th>: Dùng để tạo ô tiêu đề (header) trong bảng, nội dung của thẻ này mặc định được in đậm và căn giữa.\n"
            + "\n"
            + "<td>: Dùng để tạo một ô dữ liệu trong bảng.",
            "Thẻ <table>:\n"
            + "Dùng để tạo bảng. Mọi thẻ bảng khác như <tr>, <th>, <td> đều phải nằm trong thẻ <table>.\n"
            + "\n"
            + "Thẻ <tr>:\n"
            + "Dùng để tạo một hàng trong bảng. Mỗi hàng có thể chứa các ô dữ liệu (<td>) hoặc tiêu đề (<th>).\n"
            + "\n"
            + "Thẻ <th>:\n"
            + "Thẻ này được dùng để tạo ô tiêu đề cho cột hoặc hàng, giúp phân biệt và mô tả nội dung trong bảng.\n"
            + "\n"
            + "Thẻ <td>:\n"
            + "Dùng để tạo ô dữ liệu trong bảng. Đây là nơi chứa dữ liệu thực tế mà bạn muốn hiển thị.",
            "Bảng đơn giản với 2 hàng và 3 cột:",
            "border=\"1\": Thêm thuộc tính này vào thẻ <table> để hiển thị viền cho bảng.\n"
            + "",
            "border: Xác định độ dày của viền bảng.\n"
            + "\n"
            + "cellspacing: Xác định khoảng cách giữa các ô.\n"
            + "\n"
            + "cellpadding: Xác định khoảng cách giữa viền ô và nội dung bên trong ô.\n"
            + "\n"
            + "Ví dụ với các thuộc tính này:"
        });
        Content_MAP.put("Các Thuộc Tính Của Bảng", new String[]{
            "border:\n"
            + "Xác định độ dày của viền bảng.\n"
            + "\n"
            + "Ví dụ: border=\"1\" (Viền dày 1px)\n"
            + "\n"
            + "cellspacing:\n"
            + "Xác định khoảng cách giữa các ô trong bảng (khoảng cách giữa các ô <td> và <th>).\n"
            + "\n"
            + "Ví dụ: cellspacing=\"10\"\n"
            + "\n"
            + "cellpadding:\n"
            + "Xác định khoảng cách giữa viền ô và nội dung bên trong ô.\n"
            + "\n"
            + "Ví dụ: cellpadding=\"5\"\n"
            + "\n"
            + "width:\n"
            + "Xác định chiều rộng của bảng.\n"
            + "\n"
            + "Ví dụ: width=\"100%\" hoặc width=\"500px\"\n"
            + "\n"
            + "height:\n"
            + "Xác định chiều cao của bảng.\n"
            + "\n"
            + "Ví dụ: height=\"300px\"\n"
            + "\n"
            + "align:\n"
            + "Xác định cách căn chỉnh bảng.\n"
            + "\n"
            + "Ví dụ: align=\"center\" (Căn giữa bảng)\n"
            + "\n"
            + "bgcolor:\n"
            + "Xác định màu nền cho bảng.\n"
            + "\n"
            + "Ví dụ: bgcolor=\"#f0f0f0\"",
            "align:\n"
            + "Căn chỉnh nội dung của các ô trong hàng (<td> hoặc <th>) theo chiều ngang.\n"
            + "\n"
            + "Ví dụ: align=\"center\"\n"
            + "\n"
            + "valign:\n"
            + "Căn chỉnh nội dung của các ô trong hàng theo chiều dọc.\n"
            + "\n"
            + "Ví dụ: valign=\"middle\" (Căn giữa theo chiều dọc)\n"
            + "\n"
            + "bgcolor:\n"
            + "Xác định màu nền của một hàng.\n"
            + "\n"
            + "Ví dụ: bgcolor=\"#d3d3d3\"\n"
            + "",
            "colspan:\n"
            + "Xác định số lượng cột mà một ô tiêu đề chiếm.\n"
            + "\n"
            + "Ví dụ: <th colspan=\"2\">Tiêu đề chung cho 2 cột</th>\n"
            + "\n"
            + "rowspan:\n"
            + "Xác định số lượng hàng mà một ô tiêu đề chiếm.\n"
            + "\n"
            + "Ví dụ: <th rowspan=\"2\">Tiêu đề chung cho 2 hàng</th>\n"
            + "\n"
            + "align:\n"
            + "Căn chỉnh nội dung của ô tiêu đề theo chiều ngang.\n"
            + "\n"
            + "Ví dụ: align=\"center\"\n"
            + "\n"
            + "valign:\n"
            + "Căn chỉnh nội dung của ô tiêu đề theo chiều dọc.\n"
            + "\n"
            + "Ví dụ: valign=\"middle\"\n"
            + "\n"
            + "bgcolor:\n"
            + "Xác định màu nền cho ô tiêu đề.\n"
            + "\n"
            + "Ví dụ: bgcolor=\"#f1f1f1\"\n"
            + "",
            "colspan:\n"
            + "Xác định số lượng cột mà một ô dữ liệu chiếm.\n"
            + "\n"
            + "Ví dụ: <td colspan=\"3\">Dữ liệu chiếm 3 cột</td>\n"
            + "\n"
            + "rowspan:\n"
            + "Xác định số lượng hàng mà một ô dữ liệu chiếm.\n"
            + "\n"
            + "Ví dụ: <td rowspan=\"2\">Dữ liệu chiếm 2 hàng</td>\n"
            + "\n"
            + "align:\n"
            + "Căn chỉnh nội dung của ô dữ liệu theo chiều ngang.\n"
            + "\n"
            + "Ví dụ: align=\"right\"\n"
            + "\n"
            + "valign:\n"
            + "Căn chỉnh nội dung của ô dữ liệu theo chiều dọc.\n"
            + "\n"
            + "Ví dụ: valign=\"bottom\"\n"
            + "\n"
            + "bgcolor:\n"
            + "Xác định màu nền của ô dữ liệu.\n"
            + "\n"
            + "Ví dụ: bgcolor=\"#ffffff\"",
            "Dưới đây là một ví dụ sử dụng các thuộc tính bảng cơ bản:",
            "Bảng có viền (border=\"1\")\n"
            + "\n"
            + "Khoảng cách giữa các ô (cellspacing=\"5\")\n"
            + "\n"
            + "Khoảng cách giữa viền và nội dung (cellpadding=\"10\")\n"
            + "\n"
            + "Căn giữa tiêu đề và hàng (align=\"center\")\n"
            + "\n"
            + "Màu nền bảng và hàng tiêu đề (bgcolor=\"#f0f0f0\", bgcolor=\"#d3d3d3\")\n"
            + ""
        });
        Content_MAP.put("Bảng Nâng Cao", new String[]{
            "1.1. Tạo Bảng Đẹp Mắt Với CSS\n"
            + "Bằng cách sử dụng CSS, bạn có thể cải thiện diện mạo của bảng, làm cho bảng trông hiện đại hơn và dễ đọc hơn. Dưới đây là một ví dụ về cách tạo một bảng có viền, màu nền, hiệu ứng hover, và các dòng kẻ đẹp mắt.",
            "1.2. Giải Thích:\n"
            + "border-collapse: collapse;: Kết hợp các viền của các ô vào một viền duy nhất.\n"
            + "\n"
            + "tr:nth-child(even): Cách để áp dụng màu nền cho các hàng chẵn.\n"
            + "\n"
            + "tr:hover: Tạo hiệu ứng khi di chuột qua các hàng của bảng.\n"
            + "",
            "colspan: Sử dụng khi một ô cần chiếm nhiều cột.\n"
            + "\n"
            + "rowspan: Sử dụng khi một ô cần chiếm nhiều hàng.\n"
            + "\n"
            + "Ví Dụ:",
            "Giải Thích:\n"
            + "rowspan=\"2\": Ô \"Họ Tên\" chiếm 2 hàng.\n"
            + "\n"
            + "colspan=\"2\": Tiêu đề \"Thông Tin\" chiếm 2 cột.",
            "Bạn có thể tạo bảng với nội dung thay đổi theo thời gian hoặc tương tác với người dùng bằng JavaScript. Ví dụ dưới đây sẽ tạo bảng khi nhấn nút:\n"
            + "\n"
            + "Ví Dụ:",
            "Giải Thích:\n"
            + "Khi bạn nhấn nút \"Thêm Nhân Viên\", JavaScript sẽ tự động tạo một hàng mới trong bảng và cập nhật ID, họ tên, chức vụ và tuổi.\n"
            + "\n"
            + "Dùng insertRow() để thêm một hàng mới và insertCell() để thêm các ô trong hàng.\n"
            + "",
            "Sử dụng các thẻ <thead>, <tbody>, và <tfoot> giúp phân chia bảng thành các phần rõ ràng, dễ quản lý và cải thiện khả năng truy cập.\n"
            + "\n"
            + "Ví Dụ:",
            "Giải Thích:\n"
            + "<thead>: Chứa tiêu đề bảng.\n"
            + "\n"
            + "<tbody>: Chứa dữ liệu chính của bảng.\n"
            + "\n"
            + "<tfoot>: Chứa thông tin tổng hợp (ví dụ, tổng số bản ghi).",
            "Kết hợp bảng với các công cụ như xếp hạng, tìm kiếm, và phân trang giúp tăng tính tương tác. Bạn có thể tích hợp các thư viện như DataTables để làm điều này dễ dàng.\n"
            + "\n"
            + "Ví dụ: DataTables là một thư viện jQuery giúp tạo bảng có khả năng tìm kiếm, phân trang, và sắp xếp.\n"
            + ""
        });
        Content_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new String[]{
            "Thẻ <form> là thẻ chứa toàn bộ biểu mẫu và định nghĩa hành động (action) và phương thức (method) mà biểu mẫu sẽ thực hiện khi được gửi đi.\n"
            + "\n"
            + "Cấu Trúc:",
            "action: Xác định URL mà dữ liệu của biểu mẫu sẽ được gửi đến.\n"
            + "\n"
            + "method: Xác định phương thức gửi dữ liệu, có thể là GET hoặc POST. Phương thức GET được sử dụng khi dữ liệu không nhạy cảm, còn POST thường được sử dụng khi gửi dữ liệu nhạy cảm.",
            "2.1. Thẻ <input>\n"
            + "Thẻ <input> là một thẻ rất linh hoạt, có thể được sử dụng với nhiều loại type khác nhau để tạo các trường nhập liệu đa dạng.\n"
            + "\n"
            + "Ví Dụ:",
            "Các loại type phổ biến:\n"
            + "\n"
            + "text: Trường văn bản.\n"
            + "\n"
            + "password: Trường mật khẩu, khi nhập vào sẽ được ẩn đi.\n"
            + "\n"
            + "email: Trường nhập email, giúp xác thực định dạng email hợp lệ.\n"
            + "\n"
            + "number: Trường nhập số.\n"
            + "\n"
            + "radio: Các lựa chọn đơn (radio button).\n"
            + "\n"
            + "checkbox: Các lựa chọn đa (checkbox).\n"
            + "\n"
            + "submit: Nút gửi biểu mẫu.\n"
            + "\n"
            + "reset: Nút đặt lại biểu mẫu.\n"
            + "",
            "2.2. Thẻ <textarea>\n"
            + "Thẻ <textarea> tạo ra một khu vực văn bản lớn, cho phép người dùng nhập nhiều dòng dữ liệu.\n"
            + "\n"
            + "Ví Dụ:",
            "rows: Số dòng của vùng nhập liệu.\n"
            + "\n"
            + "cols: Số cột của vùng nhập liệu.\n"
            + "",
            "2.3. Thẻ <select> và <option>\n"
            + "Thẻ <select> được sử dụng để tạo danh sách thả xuống, cho phép người dùng chọn một giá trị trong danh sách các tùy chọn.\n"
            + "\n"
            + "Ví Dụ:\n"
            + "html\n"
            + "Copy code",
            "Thẻ <option> được sử dụng để tạo các lựa chọn trong danh sách thả xuống.",
            "3.1. Thẻ <button>\n"
            + "Thẻ <button> dùng để tạo các nút điều khiển trong biểu mẫu.\n"
            + "\n"
            + "Ví Dụ:",
            "Các giá trị type của thẻ <button>:\n"
            + "\n"
            + "submit: Gửi biểu mẫu.\n"
            + "\n"
            + "reset: Đặt lại biểu mẫu.\n"
            + "\n"
            + "button: Tạo nút tùy chỉnh mà không thực hiện hành động mặc định.\n"
            + "",
            "Dưới đây là một ví dụ hoàn chỉnh về biểu mẫu đăng ký với các trường nhập liệu khác nhau:",
            "Giải Thích:\n"
            + "Họ Tên: Trường nhập văn bản thông thường.\n"
            + "\n"
            + "Email: Trường nhập email, sử dụng type=\"email\" để xác thực định dạng email.\n"
            + "\n"
            + "Giới Tính: Sử dụng radio button để người dùng chọn giới tính.\n"
            + "\n"
            + "Ngày Sinh: Trường nhập ngày tháng sử dụng type=\"date\".\n"
            + "\n"
            + "Lời Nhắn: Sử dụng thẻ <textarea> để nhập nhiều dòng văn bản.\n"
            + "",
            "required: Thuộc tính này yêu cầu người dùng phải nhập giá trị vào trường đó trước khi gửi biểu mẫu.\n"
            + "\n"
            + "placeholder: Thuộc tính này cho phép hiển thị một ví dụ hoặc hướng dẫn trong trường nhập liệu.\n"
            + "\n"
            + "action và method: Đảm bảo bạn xác định đúng nơi biểu mẫu sẽ gửi dữ liệu và phương thức sử dụng."
        });
        Content_MAP.put("Các Loại Trường Nhập", new String[]{
            "<input type=\"text\">: Đây là loại trường nhập cơ bản nhất, cho phép người dùng nhập vào một chuỗi văn bản đơn giản. Trường này thường được sử dụng để nhận thông tin như tên, địa chỉ, hoặc bất kỳ dữ liệu văn bản nào.",
            "<textarea>: Khác với <input type=\"text\">, thẻ <textarea> cho phép nhập văn bản nhiều dòng. Thường dùng để nhận các đoạn văn dài như bình luận, mô tả, hoặc tin nhắn.",
            "<input type=\"password\">: Loại trường này dùng để nhập mật khẩu hoặc thông tin nhạy cảm. Khi người dùng gõ, các ký tự sẽ được thay thế bằng dấu chấm (hoặc dấu sao) để bảo mật.",
            "<input type=\"number\">: Trường nhập này chỉ chấp nhận số, và có thể hạn chế giá trị nhập vào bằng cách sử dụng các thuộc tính min, max, và step. Đây là lựa chọn tuyệt vời cho các trường nhập dữ liệu như độ tuổi, số lượng, hoặc các giá trị số.",
            "<input type=\"radio\">: Trường này cho phép người dùng chọn chỉ một giá trị trong một nhóm các lựa chọn. Thông thường, các trường radio được dùng trong các tình huống như chọn giới tính, phương thức thanh toán, hoặc tình trạng.",
            "<input type=\"checkbox\">: Trường này cho phép người dùng chọn một hoặc nhiều giá trị từ các lựa chọn có sẵn. Thường dùng cho các tình huống như đăng ký nhận bản tin, đồng ý với điều khoản sử dụng, v.v.",
            "<input type=\"file\">: Trường này cho phép người dùng tải lên một hoặc nhiều tệp từ thiết bị của họ. Bạn có thể sử dụng thuộc tính multiple để cho phép tải nhiều tệp cùng lúc.",
            "Nếu bạn muốn cho phép tải lên nhiều tệp, bạn có thể thêm thuộc tính multiple vào thẻ <input>:"
        });
        Content_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new String[]{
            "Mô tả: Xác định URL mà biểu mẫu sẽ gửi dữ liệu đến khi người dùng nhấn nút gửi. Đây là địa chỉ máy chủ nhận dữ liệu từ biểu mẫu.\n"
            + "\n"
            + "Ví dụ:",
            "action=\"/submit_form\": Dữ liệu sẽ được gửi tới địa chỉ /submit_form.",
            "Mô tả: Xác định phương thức HTTP sẽ được sử dụng để gửi biểu mẫu. Các giá trị phổ biến là:\n"
            + "\n"
            + "GET: Dữ liệu biểu mẫu sẽ được gửi qua URL (thường dùng cho các yêu cầu không có dữ liệu nhạy cảm).\n"
            + "\n"
            + "POST: Dữ liệu sẽ được gửi trong phần thân của yêu cầu HTTP, phù hợp cho các yêu cầu có dữ liệu nhạy cảm như mật khẩu.\n"
            + "\n"
            + "Ví dụ:",
            "method=\"post\": Dữ liệu sẽ được gửi qua POST.",
            "Mô tả: Thuộc tính này xác định cách mã hóa dữ liệu biểu mẫu khi được gửi đi, đặc biệt khi có các trường tải tệp. Các giá trị phổ biến là:\n"
            + "\n"
            + "application/x-www-form-urlencoded: Dữ liệu được mã hóa trong URL (mặc định).\n"
            + "\n"
            + "multipart/form-data: Dùng khi có trường tải tệp (file upload).\n"
            + "\n"
            + "application/json: Dữ liệu sẽ được gửi dưới dạng JSON (thường dùng cho các API hiện đại).\n"
            + "\n"
            + "Ví dụ:",
            "enctype=\"multipart/form-data\": Cho phép tải tệp lên máy chủ.",
            "Mô tả: Xác định nơi biểu mẫu sẽ mở khi dữ liệu được gửi. Các giá trị phổ biến là:\n"
            + "\n"
            + "_self: Mở trong cùng cửa sổ/tab (mặc định).\n"
            + "\n"
            + "_blank: Mở trong cửa sổ/tab mới.\n"
            + "\n"
            + "_parent: Mở trong cửa sổ cha của cửa sổ/tab hiện tại.\n"
            + "\n"
            + "_top: Mở trong toàn bộ cửa sổ.\n"
            + "\n"
            + "Ví dụ:",
            "target=\"_blank\": Biểu mẫu sẽ mở kết quả trong một cửa sổ mới.",
            "Mô tả: Xác định tên của biểu mẫu, thường dùng khi muốn tham chiếu đến biểu mẫu qua JavaScript.\n"
            + "\n"
            + "Ví dụ:",
            "name=\"myForm\": Đặt tên cho biểu mẫu để có thể tham chiếu trong JavaScript.",
            "Mô tả: Xác định xem trình duyệt có nên tự động điền thông tin vào biểu mẫu hay không.\n"
            + "\n"
            + "on: Bật chức năng tự động hoàn thành (mặc định).\n"
            + "\n"
            + "off: Tắt chức năng tự động hoàn thành.\n"
            + "\n"
            + "Ví dụ:",
            "autocomplete=\"off\": Tắt tính năng tự động hoàn thành.",
            "Mô tả: Xác định bộ ký tự mà trình duyệt sử dụng để mã hóa dữ liệu khi gửi đi. Thường được sử dụng khi gửi dữ liệu không phải là chuỗi ASCII (ví dụ, nếu có dữ liệu Unicode).\n"
            + "\n"
            + "Ví dụ:",
            "accept-charset=\"UTF-8\": Dữ liệu sẽ được mã hóa theo bộ ký tự UTF-8."
        });
        //HTML nâng cao
        Content_MAP.put("HTML semantic là gì?", new String[]{
            "HTML semantic (ngữ nghĩa HTML) là một cách sử dụng các thẻ HTML để tạo ra cấu trúc và ý nghĩa rõ ràng cho nội dung trên trang web. Thay vì sử dụng các thẻ chung chung như <div> hoặc <span> cho mọi phần tử, HTML semantic sử dụng các thẻ có ý nghĩa rõ ràng để xác định từng phần nội dung, giúp cả người đọc và các công cụ tìm kiếm hiểu được nội dung của trang web.",
            "Cải thiện SEO (Search Engine Optimization):\n"
            + "\n"
            + "Các công cụ tìm kiếm như Google đánh giá cao các thẻ semantic vì chúng giúp công cụ tìm kiếm hiểu được nội dung của trang web. Việc sử dụng thẻ như <article> hoặc <section> sẽ giúp công cụ tìm kiếm hiểu rõ cấu trúc và mục đích của các phần nội dung.\n"
            + "\n"
            + "Cải thiện khả năng truy cập (Accessibility):\n"
            + "\n"
            + "Các thẻ semantic giúp các công cụ hỗ trợ như màn hình đọc hiểu rõ nội dung của trang web, đặc biệt đối với người khuyết tật. Ví dụ, thẻ <nav> giúp người sử dụng công cụ đọc màn hình nhận ra các liên kết điều hướng, còn thẻ <header> cho biết phần đầu trang.\n"
            + "\n"
            + "Cấu trúc rõ ràng và dễ duy trì:\n"
            + "\n"
            + "HTML semantic tạo ra một cấu trúc rõ ràng cho mã nguồn, giúp lập trình viên dễ dàng bảo trì và mở rộng dự án sau này. Việc sử dụng thẻ đúng chức năng sẽ giúp mã nguồn dễ hiểu hơn cho bất kỳ ai làm việc với nó.\n"
            + "\n"
            + "Tối ưu hóa hiệu suất:\n"
            + "\n"
            + "Vì các thẻ semantic giúp trình duyệt hiểu cấu trúc trang, việc sử dụng chúng có thể giảm thiểu thời gian tải trang, giúp trang web của bạn nhanh hơn.",
            "<header>:\n"
            + "\n"
            + "Được dùng để chứa thông tin tiêu đề, logo, hoặc các liên kết điều hướng chính của trang. Đây là phần đầu trang và thường xuất hiện ở đầu mỗi trang web hoặc trong các phần như bài viết hoặc nhóm nội dung.",
            "<footer>:\n"
            + "\n"
            + "Dùng để chứa thông tin chân trang, như bản quyền, liên hệ, thông tin về tác giả, hoặc các liên kết phụ.",
            "<article>:\n"
            + "\n"
            + "Được sử dụng để đánh dấu một bài viết độc lập hoặc một phần nội dung có thể được chia sẻ, tái sử dụng.",
            "<section>:\n"
            + "\n"
            + "Dùng để nhóm các phần có liên quan trong một bài viết hoặc trang web. Một trang có thể có nhiều <section> để phân chia các nội dung khác nhau.",
            "<nav>:\n"
            + "\n"
            + "Dùng để nhóm các liên kết điều hướng chính của trang web. Nó giúp người dùng dễ dàng tìm thấy các phần quan trọng của website.",
            "<aside>:\n"
            + "\n"
            + "Thường dùng để chứa nội dung phụ, như các bài viết liên quan, quảng cáo hoặc các thông tin không phải là nội dung chính.\n"
            + "\n"
            + "html\n"
            + "Copy code",
            "<main>:\n"
            + "\n"
            + "Đánh dấu phần chính của trang web. Nó chỉ chứa nội dung chính, không bao gồm header, footer hay sidebar."
        });
        Content_MAP.put("<header>", new String[]{
            "Là một thẻ semantic trong HTML5.\n"
            + "\n"
            + "Dùng để xác định phần đầu của một trang web hoặc một phần nội dung như <article>, <section>, <aside>.\n"
            + "\n"
            + "Mục đích: chứa các thành phần giới thiệu hoặc điều hướng (ví dụ như logo, tiêu đề, thanh menu).\n"
            + "\n"
            + "Nội dung thường chứa trong <header>:\n"
            + "\n"
            + "Tiêu đề (<h1>, <h2>, ...).\n"
            + "\n"
            + "Thanh điều hướng (<nav>).\n"
            + "\n"
            + "Logo.\n"
            + "\n"
            + "Các slogan, câu giới thiệu ngắn.\n"
            + "\n"
            + "Một trang web hoặc một bài viết có thể có nhiều thẻ <header>.",
            "Đừng nhầm <header> với <head>. (→ <head> chứa meta, script, link, không phải nội dung hiển thị.)\n"
            + "\n"
            + "Không nên đặt <header> bên trong những phần tử như <footer> hoặc <address>.\n"
            + "\n"
            + "<header> KHÔNG BẮT BUỘC phải chứa <nav>, nhưng thường thì có.\n"
            + ""
        });
        Content_MAP.put("<footer>", new String[]{
            "Là một thẻ semantic trong HTML5.\n"
            + "\n"
            + "Dùng để định nghĩa phần chân (footer) của một trang web hoặc một phần nội dung (như <article>, <section>, <aside>).\n"
            + "\n"
            + "Mục đích: chứa thông tin kết thúc, bổ sung cho nội dung, ví dụ như:\n"
            + "\n"
            + "Bản quyền (copyright).\n"
            + "\n"
            + "Liên hệ.\n"
            + "\n"
            + "Liên kết đến các trang liên quan.\n"
            + "\n"
            + "Tác giả bài viết.\n"
            + "\n"
            + "Các liên kết mạng xã hội.\n"
            + "\n"
            + "Chính sách bảo mật, điều khoản sử dụng.\n"
            + "\n"
            + "Một trang có thể có nhiều <footer> (ví dụ: một cái cho toàn trang, một cái cho từng bài viết).",
            "Không nhầm lẫn <footer> với <head> hay <header>.\n"
            + "\n"
            + "Không bắt buộc chỉ có một <footer> trên trang.\n"
            + "\n"
            + "Nội dung trong <footer> thường không ảnh hưởng trực tiếp đến nội dung chính, mà bổ trợ thêm thông tin.\n"
            + "",
            "Thẻ: <footer>.\n"
            + "\n"
            + "Mục đích: Xác định phần chân (kết thúc) cho một trang web hoặc một phần nội dung (ví dụ: bài viết, section...).\n"
            + "\n"
            + "Vị trí: Thường đặt ở cuối trang hoặc cuối bài viết.\n"
            + "\n"
            + "Nội dung thường có trong <footer>:\n"
            + "\n"
            + "Thông tin bản quyền (copyright).\n"
            + "\n"
            + "Liên kết nhanh (chính sách bảo mật, điều khoản, liên hệ...).\n"
            + "\n"
            + "Thông tin tác giả.\n"
            + "\n"
            + "Mạng xã hội (Facebook, Instagram...).\n"
            + "\n"
            + "Nếu bạn muốn, mình còn có thể tổng hợp thêm một số tips nhỏ khi dùng <footer>, ví dụ:\n"
            + "\n"
            + "Luôn để <footer> dễ tìm thấy bằng CSS (ví dụ: màu nền tối, chữ sáng).\n"
            + "\n"
            + "Có thể chia <footer> thành nhiều cột (contact, menu, social media) cho gọn.\n"
            + "\n"
            + "Đảm bảo footer trên mobile cũng hiển thị rõ (responsive design)."
        });
        Content_MAP.put("<nav>", new String[]{
            "<nav> là một thẻ semantic trong HTML5.\n"
            + "\n"
            + "Dùng để định nghĩa khu vực chứa các liên kết điều hướng trong trang web.\n"
            + "\n"
            + "Các liên kết này thường dẫn đến những phần chính trong website như:\n"
            + "\n"
            + "Trang chủ\n"
            + "\n"
            + "Giới thiệu\n"
            + "\n"
            + "Sản phẩm\n"
            + "\n"
            + "Tin tức\n"
            + "\n"
            + "Liên hệ\n"
            + "\n"
            + "Một trang web có thể có nhiều thẻ <nav>, ví dụ: một menu chính, một menu phụ trong footer.",
            "Ở đây:\n"
            + "\n"
            + "<ul> là danh sách các mục.\n"
            + "\n"
            + "<li> là từng mục.\n"
            + "\n"
            + "<a> là liên kết dẫn tới các phần khác trong trang hoặc đến trang khác.",
            "Không nên cho tất cả các liên kết trong trang vào <nav>.\n"
            + "→ Chỉ nên đặt các liên kết quan trọng cho việc điều hướng.\n"
            + "\n"
            + "Có thể lồng <nav> trong <header> hoặc cũng có thể nằm riêng.\n"
            + "\n"
            + "Một trang có thể có nhiều <nav> (ví dụ: menu chính ở đầu trang, menu phụ trong sidebar).",
            "Thẻ: <nav>.\n"
            + "\n"
            + "Mục đích: Gom các liên kết điều hướng.\n"
            + "\n"
            + "Vị trí: Thường trong <header>, nhưng có thể ở bất cứ đâu.\n"
            + "\n"
            + "Nội dung bên trong: Các thẻ liên kết (<a>), thường nằm trong danh sách (<ul>, <li>).\n"
            + ""
        });
        Content_MAP.put("<article>", new String[]{
            "<article> là một thẻ semantic trong HTML5.\n"
            + "\n"
            + "Dùng để định nghĩa một nội dung độc lập và tự chứa, có thể được phân phối hoặc tái sử dụng riêng lẻ.\n"
            + "\n"
            + "Thường dùng để bao bọc những nội dung như:\n"
            + "\n"
            + "Bài viết trên blog.\n"
            + "\n"
            + "Bài báo (news article).\n"
            + "\n"
            + "Một bình luận (comment).\n"
            + "\n"
            + "Một bài đăng trên mạng xã hội.\n"
            + "\n"
            + "Một sản phẩm trong danh sách sản phẩm.\n"
            + "\n"
            + "Mỗi <article> có thể tự đứng độc lập với tiêu đề, nội dung, tác giả, ngày tháng, v.v.",
            "header trong article: chứa tiêu đề, ngày đăng.\n"
            + "\n"
            + "footer trong article: chứa tag, thông tin thêm.",
            "Dùng <article> khi nội dung có thể tồn tại độc lập.\n"
            + "\n"
            + "Mỗi <article> nên có tiêu đề riêng (dùng <h1>, <h2>,... tùy cấp độ).\n"
            + "\n"
            + "Bên trong <article> có thể có thêm:\n"
            + "\n"
            + "<header>, <section>, <footer>, <figure>, v.v.\n"
            + "\n"
            + "Một trang web thường có nhiều <article> (ví dụ danh sách tin tức, danh sách bài blog).",
            "Thẻ: <article>.\n"
            + "\n"
            + "Mục đích: Định nghĩa nội dung độc lập, có thể phân phối riêng.\n"
            + "\n"
            + "Vị trí: Trong thân trang (<body>), có thể lồng trong <section>.\n"
            + "\n"
            + "Nội dung bên trong: Bài viết, sản phẩm, bình luận, v.v.\n"
            + ""
        });
        Content_MAP.put("<section>", new String[]{
            "<section> là thẻ semantic trong HTML5.\n"
            + "\n"
            + "Dùng để chia nội dung thành các khu vực (sections) theo chủ đề hoặc chức năng riêng biệt.\n"
            + "\n"
            + "Mỗi <section> thường có tiêu đề riêng (dùng <h1> → <h6>) để mô tả nội dung của nó.\n"
            + "\n"
            + "Các ví dụ dùng <section>:\n"
            + "\n"
            + "Phần \"Giới thiệu\" trong một trang web.\n"
            + "\n"
            + "Phần \"Dịch vụ\" liệt kê các dịch vụ công ty cung cấp.\n"
            + "\n"
            + "Phần \"Tin tức mới nhất\" trên trang chủ.\n"
            + "\n"
            + "Phần \"Bài viết liên quan\" trong blog.",
            "<section> phù hợp khi nội dung có cùng chủ đề và cần có tiêu đề riêng.\n"
            + "\n"
            + "Một trang web thường có nhiều <section> để chia các phần nội dung khác nhau.\n"
            + "\n"
            + "Bên trong <section> có thể chứa:\n"
            + "\n"
            + "Văn bản, hình ảnh, video, form, danh sách,...\n"
            + "\n"
            + "Các thẻ semantic khác như <article>, <aside>, <nav>,...",
            "Thẻ: <section>.\n"
            + "\n"
            + "Mục đích: Chia nội dung thành khu vực theo chủ đề.\n"
            + "\n"
            + "Vị trí: Trong thân trang (<body>), có thể lồng trong <main>, <article>, v.v.\n"
            + "\n"
            + "Nội dung bên trong: Có thể có văn bản, hình ảnh, video,... kèm theo tiêu đề.\n"
            + "",
            "Nếu một nội dung có thể được cho vào \"mục lục\" thì nên bọc nó bằng <section>.\n"
            + "\n"
            + "Nếu chỉ đơn giản là nhóm nội dung không theo chủ đề, chỉ để nhóm lại → nên dùng <div> thay vì <section>.\n"
            + ""
        });
        Content_MAP.put("Semantic HTML là gì", new String[]{
            "Semantic HTML là cách viết HTML mà sử dụng các thẻ có ý nghĩa rõ ràng, để mô tả chính xác nội dung bên trong chúng.\n"
            + "\n"
            + "\"Semantic\" = \"Ngữ nghĩa\" = \"Có ý nghĩa rõ ràng\".\n"
            + "\n"
            + "Thay vì chỉ dùng <div>, <span> chung chung, mình dùng những thẻ như:\n"
            + "\n"
            + "<header> để chứa phần đầu trang.\n"
            + "\n"
            + "<nav> để chứa menu điều hướng.\n"
            + "\n"
            + "<main> để chứa nội dung chính.\n"
            + "\n"
            + "<section> để nhóm nội dung cùng chủ đề.\n"
            + "\n"
            + "<article> cho bài viết độc lập.\n"
            + "\n"
            + "<aside> cho nội dung phụ như quảng cáo, sidebar.\n"
            + "\n"
            + "<footer> cho phần cuối trang.\n"
            + "",
            "Giúp code dễ đọc, dễ hiểu cho lập trình viên khác (và cho chính mình sau này).\n"
            + "\n"
            + "Giúp Google, các máy tìm kiếm hiểu nội dung web rõ hơn → Tốt cho SEO.\n"
            + "\n"
            + "Giúp người khuyết tật dùng các công cụ hỗ trợ (screen reader) dễ dàng hơn.\n"
            + "\n"
            + "Giúp chuẩn hóa web theo tiêu chuẩn quốc tế (W3C).",
            "Ví dụ 1: Không dùng Semantic HTML",
            "Ví dụ 2: Dùng Semantic HTML",
            "Nhìn vào ví dụ 2, bạn dễ dàng hiểu ngay:\n"
            + "\n"
            + "Đâu là header.\n"
            + "\n"
            + "Đâu là nav.\n"
            + "\n"
            + "Đâu là nội dung chính.\n"
            + "\n"
            + "Đâu là footer.\n"
            + "",
            "<header> — phần đầu trang hoặc đầu một khu vực.\n"
            + "\n"
            + "<nav> — menu điều hướng.\n"
            + "\n"
            + "<main> — nội dung chính.\n"
            + "\n"
            + "<section> — nhóm nội dung theo chủ đề.\n"
            + "\n"
            + "<article> — bài viết độc lập.\n"
            + "\n"
            + "<aside> — nội dung phụ.\n"
            + "\n"
            + "<footer> — phần chân trang.",
            "Semantic HTML = Viết HTML có ý nghĩa tự nhiên, rõ ràng.\n"
            + "\n"
            + "Giúp SEO tốt, code sạch, truy cập dễ dàng cho mọi người.\n"
            + ""
        });
        Content_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new String[]{
            "Dùng các thẻ có ý nghĩa rõ ràng để công cụ tìm kiếm dễ hiểu nội dung hơn, ví dụ:\n"
            + "\n"
            + "<header>: Dùng để chứa phần tiêu đề, logo, hoặc menu của trang.\n"
            + "\n"
            + "<nav>: Dùng cho phần điều hướng (menu chính của website).\n"
            + "\n"
            + "<main>: Đánh dấu nội dung chính của trang.\n"
            + "\n"
            + "<section>: Chia trang thành các phần nội dung theo chủ đề.\n"
            + "\n"
            + "<article>: Dùng cho bài viết độc lập hoặc bài báo.\n"
            + "\n"
            + "<footer>: Dùng cho phần chân trang, chứa thông tin bản quyền, liên kết.\n"
            + "\n"
            + "<aside>: Thường dùng cho nội dung phụ, như quảng cáo hoặc các thông tin liên quan.",
            "Tổ chức rõ ràng giúp Google hiểu rõ các phần khác nhau trong trang, từ đó xếp hạng chính xác hơn.\n"
            + "\n"
            + "Dễ dàng xác định phần nào là nội dung chính (tăng khả năng hiển thị khi người dùng tìm kiếm thông tin).",
            "Sơ đồ dữ liệu (structured data) là một cách để cung cấp thông tin chi tiết về trang web của bạn theo dạng mã máy mà công cụ tìm kiếm dễ hiểu.\n"
            + "\n"
            + "Ví dụ, bạn có thể dùng Schema.org để khai báo thêm thông tin về bài viết, sản phẩm, hoặc sự kiện, giúp Google hiểu rõ hơn về nội dung và cấu trúc trang của bạn.",
            "Cung cấp thông tin chi tiết như tiêu đề, tác giả, ngày đăng... giúp công cụ tìm kiếm hiển thị chính xác hơn trong kết quả tìm kiếm.\n"
            + "\n"
            + "Rich Snippets (thông tin chi tiết hiển thị trực tiếp trên kết quả tìm kiếm) sẽ giúp website của bạn nổi bật hơn.\n"
            + "",
            "Đảm bảo rằng URL của bạn dễ đọc và mô tả đúng nội dung của trang. Ví dụ:\n"
            + "\n"
            + "URL chuẩn: https://example.com/dich-vu-thiet-ke-web\n"
            + "\n"
            + "URL không chuẩn: https://example.com/page?id=123",
            "Công cụ tìm kiếm dễ dàng hiểu nội dung của trang qua URL mô tả rõ ràng.",
            "Đảm bảo mỗi trang có một tiêu đề (title) và thẻ meta description rõ ràng, mô tả chính xác nội dung trang. Các thẻ này giúp Google hiểu nội dung và hiển thị mô tả ngắn trong kết quả tìm kiếm.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "html\n"
            + "Copy code",
            "Tiêu đề rõ ràng và meta description giúp Google hiểu trang của bạn là gì và hiển thị chính xác trong kết quả tìm kiếm.",
            "Liên kết nội bộ (internal links) giữa các bài viết hoặc trang trong website giúp Google hiểu cấu trúc trang và các trang quan trọng.\n"
            + "\n"
            + "Ví dụ:",
            "Liên kết nội bộ giúp công cụ tìm kiếm hiểu được sự liên kết giữa các trang và cải thiện khả năng xếp hạng của toàn bộ website.\n"
            + "",
            "Sử dụng Semantic HTML: Cấu trúc rõ ràng giúp công cụ tìm kiếm hiểu nội dung.\n"
            + "\n"
            + "Thêm Structured Data: Cung cấp thông tin chi tiết về trang web qua schema.org.\n"
            + "\n"
            + "Tối ưu hóa URL: Sử dụng URL dễ đọc, có mô tả.\n"
            + "\n"
            + "Tối ưu hóa tiêu đề và thẻ meta: Giúp công cụ tìm kiếm hiểu nội dung của trang.\n"
            + "\n"
            + "Tối ưu hóa liên kết nội bộ: Tạo liên kết giữa các trang để Google dễ dàng hiểu cấu trúc của website.\n"
            + ""
        });
        Content_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new String[]{
            "Lý do: Các thẻ Semantic HTML giúp Google hiểu cấu trúc của trang web rõ ràng hơn. Nếu công cụ tìm kiếm có thể xác định các phần chính như tiêu đề, bài viết, menu điều hướng, và chân trang, thì quá trình lập chỉ mục sẽ dễ dàng và chính xác hơn.\n"
            + "\n"
            + "Ví dụ:",
            "Lợi ích:\n"
            + "\n"
            + "Cấu trúc rõ ràng giúp công cụ tìm kiếm hiểu nội dung từng phần của trang.\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác cho từng phần như bài viết, bài đăng, menu, chân trang.",
            "Lý do: Cung cấp thêm thông tin về trang web theo dạng dữ liệu có cấu trúc (structured data) giúp Google và các công cụ tìm kiếm hiểu sâu hơn về nội dung của trang.\n"
            + "\n"
            + "Ví dụ:",
            "Lợi ích:\n"
            + "\n"
            + "Cung cấp thông tin chi tiết cho công cụ tìm kiếm như tiêu đề bài viết, tác giả, ngày xuất bản.\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác cho các bài viết, sản phẩm, hoặc sự kiện.",
            "Lý do: Tiêu đề (Title) và mô tả (Meta Description) là những yếu tố quan trọng giúp Google hiểu rõ nội dung của trang và giúp người dùng biết liệu trang này có đáp ứng nhu cầu tìm kiếm của họ hay không.\n"
            + "\n"
            + "Ví dụ:",
            "Lợi ích:\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác: Tiêu đề và mô tả rõ ràng giúp công cụ tìm kiếm hiểu nhanh về trang.\n"
            + "\n"
            + "Thu hút người dùng: Mô tả hấp dẫn giúp người dùng quyết định có nhấp vào trang hay không.",
            "Lý do: URL rõ ràng, dễ đọc giúp công cụ tìm kiếm và người dùng dễ dàng nhận diện nội dung trang.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "URL chuẩn: https://example.com/dich-vu-seo\n"
            + "\n"
            + "URL không chuẩn: https://example.com/page?id=123\n"
            + "\n"
            + "Lợi ích:\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác: URL dễ hiểu giúp công cụ tìm kiếm dễ dàng xác định nội dung trang.\n"
            + "\n"
            + "Thân thiện với người dùng: Người dùng dễ dàng nhớ và chia sẻ URL.",
            "Lý do: Google đánh giá trải nghiệm người dùng khi xếp hạng trang web. Trang web thân thiện và dễ sử dụng sẽ giúp giữ người dùng lâu hơn và giảm tỷ lệ thoát trang (bounce rate).\n"
            + "\n"
            + "Các yếu tố cần cải thiện:\n"
            + "\n"
            + "Tốc độ tải trang: Trang web nhanh chóng giúp giữ người dùng ở lại lâu hơn.\n"
            + "\n"
            + "Thiết kế đáp ứng (Responsive design): Trang web dễ sử dụng trên mọi thiết bị, từ máy tính bàn đến điện thoại di động.\n"
            + "\n"
            + "Cấu trúc nội dung rõ ràng: Nội dung dễ đọc, hình ảnh rõ ràng, không gian trắng hợp lý.\n"
            + "\n"
            + "Lợi ích:\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác: Google ưu tiên xếp hạng những trang có trải nghiệm người dùng tốt.\n"
            + "\n"
            + "Giảm tỷ lệ thoát: Người dùng sẽ ở lại lâu hơn, giúp trang web có cơ hội được lập chỉ mục chính xác hơn.\n"
            + "",
            "Lý do: Liên kết nội bộ giúp Google hiểu rõ cấu trúc trang và mối quan hệ giữa các trang trong website. Điều này giúp công cụ tìm kiếm lập chỉ mục các trang quan trọng.\n"
            + "\n"
            + "Ví dụ:",
            "Lợi ích:\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác: Liên kết giúp Google tìm thấy và lập chỉ mục các trang khác trong website.\n"
            + "\n"
            + "Tăng trải nghiệm người dùng: Người dùng dễ dàng truy cập vào các bài viết, dịch vụ liên quan.",
            "Lý do: Google ưu tiên Mobile-First Indexing, tức là công cụ tìm kiếm sẽ kiểm tra và lập chỉ mục trang web dựa trên phiên bản di động.\n"
            + "\n"
            + "Lợi ích:\n"
            + "\n"
            + "Tăng khả năng lập chỉ mục chính xác: Trang web tối ưu cho di động giúp Google lập chỉ mục chính xác hơn.\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng: Người dùng di động có thể truy cập website dễ dàng, tăng khả năng duy trì người dùng lâu hơn.",
            "Để tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng, bạn cần chú trọng vào các yếu tố như:\n"
            + "\n"
            + "Sử dụng Semantic HTML để giúp công cụ tìm kiếm hiểu cấu trúc trang.\n"
            + "\n"
            + "Tạo structured data để cung cấp thông tin chi tiết cho công cụ tìm kiếm.\n"
            + "\n"
            + "Tối ưu hóa tiêu đề, mô tả và URL giúp cả người dùng và công cụ tìm kiếm hiểu trang rõ ràng.\n"
            + "\n"
            + "Tạo trải nghiệm người dùng tốt, giúp người dùng ở lại lâu hơn và giảm tỷ lệ thoát.\n"
            + "\n"
            + "Sử dụng liên kết nội bộ để giúp Google lập chỉ mục các trang quan trọng.\n"
            + "\n"
            + "Đảm bảo trang web đáp ứng di động, tăng khả năng lập chỉ mục trên các thiết bị di động."
        });
        Content_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new String[]{
            "Tìm kiếm bằng giọng nói (Voice Search) đang ngày càng trở nên phổ biến, đặc biệt là trên các thiết bị di động và các trợ lý ảo như Google Assistant, Siri, và Alexa. Tìm kiếm giọng nói khác biệt với tìm kiếm văn bản ở chỗ người dùng thường sử dụng các câu hỏi tự nhiên, dài hơn và mang tính giao tiếp hơn.\n"
            + "\n"
            + "Cách tối ưu hóa cho tìm kiếm bằng giọng nói:\n"
            + "Tối ưu hóa nội dung cho câu hỏi tự nhiên (Long-Tail Keywords):\n"
            + "\n"
            + "Tìm kiếm bằng giọng nói thường sử dụng các câu hỏi dài, như \"Tôi nên ăn gì tối nay?\" hoặc \"Nhà hàng nào ở gần tôi nhất?\".\n"
            + "\n"
            + "Đảm bảo nội dung của bạn chứa các câu hỏi và câu trả lời tự nhiên, tương ứng với cách mà người dùng sẽ tìm kiếm.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Tìm kiếm văn bản: \"món ăn sáng ngon\"\n"
            + "\n"
            + "Tìm kiếm bằng giọng nói: \"món ăn sáng ngon ở Hà Nội là gì?\"\n"
            + "\n"
            + "Tối ưu hóa FAQ (Câu hỏi thường gặp):\n"
            + "\n"
            + "Cung cấp các câu hỏi và câu trả lời ngắn gọn trên trang web của bạn. Đây là kiểu nội dung lý tưởng cho tìm kiếm bằng giọng nói, vì công cụ tìm kiếm có thể dễ dàng trích xuất câu trả lời trực tiếp.\n"
            + "\n"
            + "Ví dụ:",
            "Tối ưu hóa nội dung cho tính năng Featured Snippets (Đoạn trích nổi bật):\n"
            + "\n"
            + "Google thường lấy nội dung từ các đoạn trích nổi bật (featured snippets) để trả lời các câu hỏi tìm kiếm bằng giọng nói. Đảm bảo nội dung của bạn có thể được trích xuất dưới dạng câu trả lời ngắn gọn hoặc danh sách.\n"
            + "\n"
            + "Dùng các câu trả lời dạng dạng danh sách, câu hỏi và trả lời ngắn gọn, và các đoạn mô tả chi tiết.\n"
            + "\n"
            + "Ví dụ:",
            "Sử dụng ngôn ngữ tự nhiên và thân thiện với người dùng:\n"
            + "\n"
            + "Viết nội dung theo kiểu đối thoại, giống như bạn đang trò chuyện với người dùng thay vì chỉ đơn thuần là văn bản tiếp thị.\n"
            + "\n"
            + "Tránh sử dụng từ ngữ quá kỹ thuật hoặc khó hiểu.",
            "Với sự gia tăng của các thiết bị di động, Google đã chuyển sang Mobile-First Indexing, nghĩa là Google sẽ ưu tiên lập chỉ mục dựa trên phiên bản di động của trang web. Điều này có nghĩa là trang web của bạn cần phải tối ưu hóa cho các thiết bị di động để có thể hiển thị tốt và có khả năng xếp hạng cao.\n"
            + "\n"
            + "Cách tối ưu hóa cho thiết bị di động:\n"
            + "Thiết kế đáp ứng (Responsive Design):\n"
            + "\n"
            + "Đảm bảo trang web của bạn có thiết kế đáp ứng, nghĩa là trang web sẽ tự động thay đổi giao diện để phù hợp với mọi loại màn hình, từ điện thoại di động đến máy tính để bàn.\n"
            + "\n"
            + "Sử dụng media queries trong CSS để điều chỉnh các yếu tố như độ rộng, hình ảnh, kích thước văn bản tùy thuộc vào kích thước màn hình.\n"
            + "\n"
            + "Ví dụ:",
            "Tối ưu hóa tốc độ tải trang:\n"
            + "\n"
            + "Trang web của bạn cần tải nhanh trên thiết bị di động. Google và người dùng đều yêu cầu tốc độ tải trang nhanh để có trải nghiệm tốt.\n"
            + "\n"
            + "Công cụ Google PageSpeed Insights có thể giúp bạn kiểm tra và cải thiện tốc độ trang web.\n"
            + "\n"
            + "Giảm kích thước hình ảnh, sử dụng lazy loading cho ảnh và video, và tối ưu hóa mã nguồn là các cách giúp cải thiện tốc độ tải trang.\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng (UX):\n"
            + "\n"
            + "Cấu trúc điều hướng đơn giản: Sử dụng thanh điều hướng dễ sử dụng, chẳng hạn như hamburger menu (menu 3 dấu gạch ngang) trên các thiết bị di động.\n"
            + "\n"
            + "Tối ưu hóa các yếu tố nhấp (Click): Đảm bảo các nút, liên kết và các yếu tố nhấp khác dễ dàng nhấn và không bị chồng lên nhau, tránh gây khó chịu cho người dùng.\n"
            + "\n"
            + "Ví dụ:",
            "Tối ưu hóa hình ảnh và video:\n"
            + "\n"
            + "Đảm bảo hình ảnh và video của bạn được tối ưu hóa cho thiết bị di động. Giảm kích thước file ảnh, sử dụng định dạng WebP cho ảnh, và sử dụng các phương thức như lazy loading để tải nội dung khi người dùng cuộn trang xuống.\n"
            + "\n"
            + "Ví dụ:",
            "Thử nghiệm với các công cụ di động:\n"
            + "\n"
            + "Sử dụng công cụ như Google Mobile-Friendly Test để kiểm tra khả năng tương thích của trang web trên thiết bị di động và đảm bảo rằng trang của bạn cung cấp trải nghiệm tốt trên mọi màn hình.",
            "Tối ưu hóa cho Tìm Kiếm Bằng Giọng Nói:\n"
            + "\n"
            + "Sử dụng long-tail keywords và tối ưu hóa cho câu hỏi tự nhiên.\n"
            + "\n"
            + "Tạo các FAQ để cung cấp câu trả lời ngắn gọn, dễ dàng được trích xuất cho tìm kiếm bằng giọng nói.\n"
            + "\n"
            + "Đảm bảo nội dung có thể được trích xuất cho Featured Snippets.\n"
            + "\n"
            + "Sử dụng ngôn ngữ tự nhiên và dễ hiểu.\n"
            + "\n"
            + "Tối Ưu Hóa Cho Thiết Bị Di Động:\n"
            + "\n"
            + "Thiết kế Responsive để trang web thích nghi với mọi kích thước màn hình.\n"
            + "\n"
            + "Tối ưu hóa tốc độ tải trang để đảm bảo trải nghiệm mượt mà.\n"
            + "\n"
            + "Cải thiện UX (trải nghiệm người dùng) với thiết kế dễ sử dụng trên di động.\n"
            + "\n"
            + "Tối ưu hóa hình ảnh và video để giảm tải trọng và tăng tốc độ.\n"
            + ""
        });
        Content_MAP.put("Các thẻ <meta> quan trọng trong HTML", new String[]{
            "Mục đích: Đảm bảo rằng trang web sử dụng bộ mã hóa ký tự UTF-8, đây là bộ mã phổ biến và hỗ trợ tất cả các ký tự quốc tế, bao gồm tiếng Việt và các ký tự đặc biệt như dấu câu, ký tự không phải ASCII.\n"
            + "\n"
            + "Lý do quan trọng: Nếu không khai báo mã hóa này, các ký tự đặc biệt có thể bị hiển thị sai hoặc gây lỗi hiển thị văn bản trên trang web.\n"
            + "\n"
            + "Cách sử dụng:",
            "Đây là thẻ rất quan trọng và nên được đặt ngay đầu phần <head> của tài liệu HTML.",
            "Mục đích: Cung cấp một mô tả ngắn gọn về nội dung của trang web. Thông tin này được sử dụng bởi các công cụ tìm kiếm (như Google) để hiển thị dưới dạng đoạn mô tả trong kết quả tìm kiếm.\n"
            + "\n"
            + "Lý do quan trọng: Mô tả này không chỉ giúp người dùng hiểu về nội dung của trang web mà còn có ảnh hưởng đến SEO (Tối ưu hóa công cụ tìm kiếm). Mô tả hấp dẫn có thể khuyến khích người dùng nhấp vào trang web của bạn từ kết quả tìm kiếm.\n"
            + "\n"
            + "Lưu ý: Nên viết mô tả từ 150-160 ký tự để đảm bảo chúng không bị cắt ngắn trong kết quả tìm kiếm.\n"
            + "\n"
            + "Cách sử dụng:",
            "Mục đích: Tối ưu hóa trang web cho các thiết bị di động, giúp trang web tự động điều chỉnh kích thước để phù hợp với màn hình của thiết bị, từ điện thoại, máy tính bảng đến máy tính để bàn.\n"
            + "\n"
            + "Lý do quan trọng: Với xu hướng người dùng chủ yếu truy cập web từ thiết bị di động, thẻ này giúp cải thiện trải nghiệm người dùng, đồng thời là yếu tố quan trọng cho Mobile-First Indexing của Google, nghĩa là Google ưu tiên lập chỉ mục trang web dựa trên phiên bản di động.\n"
            + "\n"
            + "Cách sử dụng:",
            "Thẻ này đảm bảo rằng giao diện trang web sẽ được hiển thị phù hợp trên mọi loại màn hình, không bị thu nhỏ hoặc giãn rộng không mong muốn.\n"
            + "",
            "Mục đích: Điều khiển cách các công cụ tìm kiếm lập chỉ mục và theo dõi các liên kết trên trang web của bạn. Các giá trị phổ biến là:\n"
            + "\n"
            + "index: Cho phép công cụ tìm kiếm lập chỉ mục trang.\n"
            + "\n"
            + "noindex: Ngăn công cụ tìm kiếm lập chỉ mục trang.\n"
            + "\n"
            + "follow: Cho phép công cụ tìm kiếm theo dõi các liên kết trong trang.\n"
            + "\n"
            + "nofollow: Ngăn công cụ tìm kiếm theo dõi các liên kết trong trang.\n"
            + "\n"
            + "Lý do quan trọng: Giúp bạn kiểm soát việc liệu công cụ tìm kiếm có nên lập chỉ mục và theo dõi trang của bạn hay không. Ví dụ, bạn có thể sử dụng noindex nếu trang không có giá trị SEO, hoặc nofollow nếu bạn không muốn công cụ tìm kiếm theo dõi một số liên kết.\n"
            + "\n"
            + "Cách sử dụng:",
            "Đây là thẻ rất hữu ích khi bạn cần đảm bảo rằng các trang quan trọng của mình được lập chỉ mục và theo dõi.\n"
            + "",
            "Mục đích: Thẻ Open Graph giúp tối ưu hóa việc chia sẻ trang web trên mạng xã hội, đặc biệt là Facebook. Khi bạn chia sẻ một liên kết, thẻ này xác định tiêu đề sẽ hiển thị cùng với liên kết trên các nền tảng mạng xã hội.\n"
            + "\n"
            + "Lý do quan trọng: Nếu không sử dụng thẻ này, mạng xã hội có thể tự động chọn tiêu đề của trang web, điều này đôi khi không phản ánh đúng thông điệp bạn muốn truyền tải. Việc sử dụng thẻ Open Graph giúp cải thiện khả năng hiển thị và thu hút người dùng khi chia sẻ trang.\n"
            + "\n"
            + "Cách sử dụng:",
            "Ngoài thẻ og:title, còn có các thẻ Open Graph khác như og:description, og:image, giúp cung cấp thêm mô tả và hình ảnh khi chia sẻ trên mạng xã hội.",
            "<meta charset=\"UTF-8\">: Đảm bảo mã hóa ký tự đúng, hỗ trợ ký tự đặc biệt.\n"
            + "\n"
            + "<meta name=\"description\" content=\"...\">: Mô tả trang web cho công cụ tìm kiếm và người dùng.\n"
            + "\n"
            + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">: Tối ưu hóa giao diện cho thiết bị di động.\n"
            + "\n"
            + "<meta name=\"robots\" content=\"index, follow\">: Kiểm soát lập chỉ mục và theo dõi liên kết.\n"
            + "\n"
            + "<meta property=\"og:title\" content=\"...\">: Tối ưu hóa tiêu đề khi chia sẻ trang trên mạng xã hội."
        });
        Content_MAP.put("Meta Title và Meta Description", new String[]{
            "Mục đích: Thẻ Meta Title (hay còn gọi là thẻ <title>) chứa tiêu đề của trang web. Đây là phần đầu tiên mà người dùng và các công cụ tìm kiếm nhìn thấy khi trang của bạn xuất hiện trong kết quả tìm kiếm.\n"
            + "\n"
            + "Lý do quan trọng:\n"
            + "\n"
            + "SEO: Meta Title ảnh hưởng trực tiếp đến thứ hạng tìm kiếm của trang web. Các công cụ tìm kiếm, như Google, sử dụng tiêu đề để hiểu nội dung trang và xác định mức độ liên quan của trang đối với từ khóa tìm kiếm.\n"
            + "\n"
            + "Trải nghiệm người dùng: Tiêu đề hấp dẫn, rõ ràng và phù hợp giúp người dùng quyết định có nhấp vào trang của bạn hay không.\n"
            + "\n"
            + "Yêu cầu:\n"
            + "\n"
            + "Nên có độ dài từ 50 đến 60 ký tự (tối đa khoảng 600 pixel).\n"
            + "\n"
            + "Nên chứa từ khóa chính.\n"
            + "\n"
            + "Nên rõ ràng và mô tả đúng nội dung của trang.\n"
            + "\n"
            + "Cách sử dụng:",
            "Mục đích: Meta Description chứa một đoạn mô tả ngắn về nội dung của trang web. Đây là phần mô tả hiển thị dưới tiêu đề trong kết quả tìm kiếm của Google và các công cụ tìm kiếm khác.\n"
            + "\n"
            + "Lý do quan trọng:\n"
            + "\n"
            + "SEO: Mặc dù Google không trực tiếp sử dụng Meta Description để xếp hạng trang, nhưng mô tả này ảnh hưởng đến tỷ lệ nhấp (CTR) vào trang web của bạn. Một mô tả hấp dẫn và chính xác có thể giúp người dùng quyết định có nhấp vào liên kết của bạn hay không.\n"
            + "\n"
            + "Trải nghiệm người dùng: Cung cấp cho người dùng thông tin ngắn gọn và rõ ràng về nội dung trang, giúp họ biết trang có liên quan đến tìm kiếm của họ hay không.\n"
            + "\n"
            + "Yêu cầu:\n"
            + "\n"
            + "Nên có độ dài từ 150 đến 160 ký tự.\n"
            + "\n"
            + "Cần mô tả chính xác nội dung của trang.\n"
            + "\n"
            + "Nên chứa từ khóa chính nhưng không nhồi nhét từ khóa.\n"
            + "\n"
            + "Cách sử dụng:\n"
            + "\n"
            + "html\n"
            + "Copy code",
            "Meta Title (Thẻ <title>): Là tiêu đề của trang web, xuất hiện trên tab trình duyệt và trong kết quả tìm kiếm. Tiêu đề nên rõ ràng, chứa từ khóa và có độ dài từ 50-60 ký tự.\n"
            + "\n"
            + "Meta Description (Thẻ <meta name=\"description\" content=\"...\">): Là mô tả ngắn về trang web, xuất hiện dưới tiêu đề trong kết quả tìm kiếm. Mô tả nên hấp dẫn, chính xác và có độ dài từ 150-160 ký tự.",
            "Meta Title giúp xác định tiêu đề của trang và là yếu tố quan trọng trong SEO.\n"
            + "\n"
            + "Meta Description giúp giải thích thêm về nội dung trang và ảnh hưởng đến tỷ lệ nhấp vào kết quả tìm kiếm."
        });
        Content_MAP.put("Meta Robots và Meta Viewport", new String[]{
            "Mục đích: Thẻ Meta Robots điều khiển cách công cụ tìm kiếm (ví dụ như Google) lập chỉ mục trang và theo dõi các liên kết trong trang web của bạn. Thẻ này giúp bạn kiểm soát việc trang web có được tìm thấy và các liên kết trên trang có được theo dõi hay không.\n"
            + "\n"
            + "Lý do quan trọng:\n"
            + "\n"
            + "SEO: Giúp bạn tránh việc công cụ tìm kiếm lập chỉ mục các trang không mong muốn (ví dụ: các trang test, trang cảm ơn, trang login) hoặc theo dõi các liên kết không quan trọng.\n"
            + "\n"
            + "Tối ưu hóa chỉ mục: Bạn có thể kiểm soát các trang quan trọng hơn để được chỉ mục và trang không cần thiết sẽ không bị lập chỉ mục.\n"
            + "\n"
            + "Các giá trị phổ biến của thẻ Meta Robots:\n"
            + "\n"
            + "index: Cho phép công cụ tìm kiếm lập chỉ mục trang.\n"
            + "\n"
            + "noindex: Ngăn công cụ tìm kiếm lập chỉ mục trang.\n"
            + "\n"
            + "follow: Cho phép công cụ tìm kiếm theo dõi các liên kết trong trang.\n"
            + "\n"
            + "nofollow: Ngăn công cụ tìm kiếm theo dõi các liên kết trong trang.\n"
            + "\n"
            + "noarchive: Ngăn công cụ tìm kiếm lưu trữ phiên bản của trang (khi công cụ tìm kiếm hiển thị liên kết đã được lưu trữ).\n"
            + "\n"
            + "nosnippet: Ngăn công cụ tìm kiếm hiển thị đoạn trích (snippet) của trang web trong kết quả tìm kiếm.\n"
            + "\n"
            + "Ví dụ sử dụng:",
            "Thẻ trên yêu cầu công cụ tìm kiếm không lập chỉ mục trang và không theo dõi các liên kết trong trang.",
            "Mục đích: Thẻ Meta Viewport giúp tối ưu hóa giao diện của trang web khi hiển thị trên các thiết bị di động. Nó cho phép bạn điều chỉnh cách trang web của mình hiển thị trên các màn hình có kích thước khác nhau, từ điện thoại thông minh đến máy tính bảng và máy tính để bàn.\n"
            + "\n"
            + "Lý do quan trọng:\n"
            + "\n"
            + "Mobile-first indexing: Google hiện nay ưu tiên việc lập chỉ mục các trang web trên phiên bản di động của trang. Vì vậy, việc tối ưu hóa trang cho thiết bị di động là rất quan trọng.\n"
            + "\n"
            + "Trải nghiệm người dùng: Thẻ này giúp đảm bảo rằng trang web của bạn sẽ hiển thị đúng trên tất cả các thiết bị, giảm thiểu việc người dùng phải thu phóng hoặc cuộn ngang để xem nội dung.\n"
            + "\n"
            + "Các giá trị phổ biến của thẻ Meta Viewport:\n"
            + "\n"
            + "width=device-width: Đặt chiều rộng của viewport bằng chiều rộng của thiết bị (tức là chiều rộng của màn hình thiết bị di động).\n"
            + "\n"
            + "initial-scale=1: Đặt mức thu phóng ban đầu của trang là 1, nghĩa là không thu phóng.\n"
            + "\n"
            + "maximum-scale=1: Giới hạn mức thu phóng tối đa mà người dùng có thể thay đổi.\n"
            + "\n"
            + "user-scalable=no: Ngăn người dùng thu phóng trang.\n"
            + "\n"
            + "Ví dụ sử dụng:",
            "Thẻ này giúp trang web của bạn tự động điều chỉnh để phù hợp với màn hình của mọi loại thiết bị.",
            "Meta Robots: Dùng để điều khiển cách các công cụ tìm kiếm lập chỉ mục trang và theo dõi các liên kết. Ví dụ:\n"
            + "\n"
            + "<meta name=\"robots\" content=\"index, follow\">: Cho phép công cụ tìm kiếm lập chỉ mục và theo dõi liên kết.\n"
            + "\n"
            + "<meta name=\"robots\" content=\"noindex, nofollow\">: Ngừng lập chỉ mục và không theo dõi liên kết.\n"
            + "\n"
            + "Meta Viewport: Dùng để tối ưu hóa giao diện trang web cho các thiết bị di động, giúp trang tự động điều chỉnh kích thước và tỷ lệ hiển thị cho phù hợp. Ví dụ:\n"
            + "\n"
            + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">: Điều chỉnh chiều rộng trang phù hợp với thiết bị và không thay đổi tỷ lệ thu phóng ban đầu.",
            "Meta Robots giúp kiểm soát việc trang của bạn có được lập chỉ mục và theo dõi hay không, hỗ trợ SEO.\n"
            + "\n"
            + "Meta Viewport đảm bảo trải nghiệm người dùng tốt trên tất cả các thiết bị, đặc biệt là trên điện thoại di động.\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + ""
        });
        Content_MAP.put("Meta Charset", new String[]{
            "Meta Charset là một thẻ <meta> trong HTML giúp xác định bộ mã ký tự (character encoding) mà trang web sử dụng. Thẻ này quan trọng vì nó đảm bảo rằng nội dung văn bản trên trang được hiển thị đúng cách, đặc biệt là các ký tự đặc biệt và ngôn ngữ không phải là tiếng Anh, như tiếng Việt, tiếng Trung, hoặc các ký tự Unicode khác.",
            "Meta Charset là một thẻ <meta> trong HTML giúp xác định bộ mã ký tự (character encoding) mà trang web sử dụng. Thẻ này quan trọng vì nó đảm bảo rằng nội dung văn bản trên trang được hiển thị đúng cách, đặc biệt là các ký tự đặc biệt và ngôn ngữ không phải là tiếng Anh, như tiếng Việt, tiếng Trung, hoặc các ký tự Unicode khác.",
            "UTF-8: Là bộ mã ký tự phổ biến và mạnh mẽ nhất hiện nay, hỗ trợ hầu hết các ngôn ngữ và ký tự trong Unicode, bao gồm các ký tự đặc biệt và ngôn ngữ không phải Latin.",
            "Đảm bảo tính tương thích: Nếu không khai báo đúng bộ mã ký tự, một số ký tự đặc biệt hoặc ký tự không phải ASCII có thể bị hiển thị sai, gây ảnh hưởng đến trải nghiệm người dùng và tính chuyên nghiệp của trang web.\n"
            + "\n"
            + "Tương thích với các công cụ tìm kiếm: Công cụ tìm kiếm như Google cũng cần biết bộ mã ký tự để hiểu đúng nội dung trang web của bạn khi lập chỉ mục.",
            "Để sử dụng thẻ Meta Charset, bạn chỉ cần thêm thẻ sau vào phần <head> của tài liệu HTML của bạn, trước khi bất kỳ nội dung nào được tải:",
            "Meta Charset là thẻ quan trọng trong HTML để đảm bảo nội dung văn bản được hiển thị chính xác, đặc biệt là với các ngôn ngữ và ký tự đặc biệt.\n"
            + "\n"
            + "UTF-8 là bộ mã ký tự được sử dụng phổ biến nhất vì nó hỗ trợ hầu hết các ngôn ngữ và ký tự Unicode.\n"
            + "\n"
            + "Cách sử dụng: <meta charset=\"UTF-8\"> giúp bạn khai báo bộ mã ký tự cho trang web, giúp tránh các vấn đề liên quan đến việc hiển thị sai ký tự."
        });
        Content_MAP.put("Giới thiệu Open Graph và Twitter Card", new String[]{
            "Open Graph là một giao thức do Facebook phát triển, cho phép các trang web cung cấp thông tin chi tiết về nội dung khi chia sẻ lên mạng xã hội. Các thẻ Open Graph giúp cải thiện trải nghiệm người dùng khi họ chia sẻ liên kết trang web của bạn trên Facebook, LinkedIn, hay các nền tảng mạng xã hội khác hỗ trợ Open Graph.\n"
            + "\n"
            + "Mục đích của Open Graph:\n"
            + "Tối ưu hóa chia sẻ: Open Graph cho phép bạn tùy chỉnh cách thức thông tin về trang web của bạn sẽ được hiển thị khi người dùng chia sẻ liên kết.\n"
            + "\n"
            + "Tăng khả năng thu hút người dùng: Bằng cách cung cấp hình ảnh, tiêu đề và mô tả hấp dẫn, bạn có thể thu hút nhiều người nhấp vào liên kết của mình.\n"
            + "\n"
            + "Các thẻ Open Graph phổ biến:\n"
            + "og:title: Tiêu đề của trang web khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "\n"
            + "og:description: Mô tả ngắn về nội dung trang web.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ.\">\n"
            + "\n"
            + "og:image: Hình ảnh sẽ hiển thị khi trang web được chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:image\" content=\"http://example.com/image.jpg\">\n"
            + "\n"
            + "og:url: Địa chỉ URL của trang web.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:url\" content=\"http://example.com\">\n"
            + "\n"
            + "og:type: Loại nội dung (ví dụ: bài viết, video, website, v.v.).\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:type\" content=\"website\">\n"
            + "\n"
            + "Ví dụ sử dụng thẻ Open Graph:",
            "Twitter Card là một giao thức do Twitter phát triển để cải thiện cách thông tin trang web được hiển thị khi chia sẻ trên Twitter. Các thẻ Twitter Card cho phép bạn điều chỉnh cách thức liên kết của bạn hiển thị dưới dạng rich media (chứa ảnh, video hoặc bản xem trước).\n"
            + "\n"
            + "Mục đích của Twitter Card:\n"
            + "Cải thiện chia sẻ trên Twitter: Khi chia sẻ liên kết của bạn trên Twitter, thẻ Twitter Card giúp bài viết của bạn hiển thị một cách bắt mắt hơn, bao gồm ảnh, tiêu đề, mô tả, và các thông tin quan trọng khác.\n"
            + "\n"
            + "Tăng tỷ lệ nhấp chuột: Với Twitter Card, bạn có thể cải thiện tỷ lệ nhấp chuột vào liên kết của bạn từ Twitter, vì bài viết sẽ trở nên hấp dẫn hơn.\n"
            + "\n"
            + "Các loại Twitter Cards:\n"
            + "Summary Card: Thẻ này hiển thị tiêu đề, mô tả ngắn và hình ảnh đại diện của trang web.\n"
            + "\n"
            + "Summary Card with Large Image: Tương tự như Summary Card nhưng có hình ảnh lớn hơn.\n"
            + "\n"
            + "Player Card: Thẻ này dành cho các nội dung đa phương tiện, như video hoặc âm thanh.\n"
            + "\n"
            + "App Card: Thẻ này dành cho các liên kết tải về ứng dụng, với các nút tải về.\n"
            + "\n"
            + "Các thẻ Twitter Card phổ biến:\n"
            + "twitter:card: Loại Twitter Card (ví dụ: summary, summary_large_image).\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:card\" content=\"summary_large_image\">\n"
            + "\n"
            + "twitter:title: Tiêu đề của trang khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "\n"
            + "twitter:description: Mô tả ngắn về trang khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ\">\n"
            + "\n"
            + "twitter:image: Hình ảnh sẽ hiển thị khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:image\" content=\"http://example.com/image.jpg\">\n"
            + "\n"
            + "twitter:url: Địa chỉ URL của trang web.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:url\" content=\"http://example.com\">\n"
            + "\n"
            + "Ví dụ sử dụng thẻ Twitter Card:",
            "Open Graph chủ yếu được sử dụng để tối ưu hóa chia sẻ trên các nền tảng mạng xã hội như Facebook, LinkedIn, và các mạng xã hội khác hỗ trợ OG.\n"
            + "\n"
            + "Twitter Card tối ưu hóa cách thức chia sẻ liên kết trên Twitter, cung cấp thông tin bổ sung như hình ảnh lớn hoặc video.",
            "Cải thiện sự tương tác: Khi chia sẻ liên kết, các nền tảng xã hội hiển thị thông tin chi tiết, bao gồm tiêu đề, mô tả và hình ảnh, thu hút sự chú ý và tăng tỷ lệ nhấp chuột.\n"
            + "\n"
            + "Kiểm soát nội dung chia sẻ: Bạn có thể chọn hình ảnh, tiêu đề và mô tả phù hợp nhất để người dùng thấy khi chia sẻ trang web của mình."
        });
        Content_MAP.put("Open Graph", new String[]{
            "Open Graph (OG) là một giao thức được Facebook phát triển, giúp các trang web cung cấp thông tin chi tiết khi chia sẻ lên các mạng xã hội. Open Graph cho phép các nhà phát triển web kiểm soát cách thức nội dung của trang web được hiển thị khi chia sẻ trên các nền tảng như Facebook, LinkedIn, WhatsApp, và các dịch vụ khác hỗ trợ Open Graph.",
            "Tối ưu hóa chia sẻ nội dung: Khi người dùng chia sẻ liên kết trang web của bạn, Open Graph cho phép bạn quyết định những gì sẽ được hiển thị, như tiêu đề, mô tả, hình ảnh, và URL.\n"
            + "\n"
            + "Tăng tính hấp dẫn và tương tác: Với khả năng hiển thị các thông tin có chọn lọc và bắt mắt (ví dụ: hình ảnh, tiêu đề, mô tả), bạn có thể thu hút người dùng nhấp vào liên kết của bạn nhiều hơn.",
            "og:title: Tiêu đề của trang khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "\n"
            + "og:description: Mô tả ngắn gọn về trang web khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ, nâng cao khả năng hiển thị trên công cụ tìm kiếm.\">\n"
            + "\n"
            + "og:image: Hình ảnh sẽ hiển thị khi chia sẻ liên kết.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:image\" content=\"http://example.com/image.jpg\">\n"
            + "\n"
            + "og:url: URL của trang web.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:url\" content=\"http://example.com\">\n"
            + "\n"
            + "og:type: Loại nội dung của trang (ví dụ: bài viết, website, video).\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:type\" content=\"website\">\n"
            + "\n"
            + "og:site_name: Tên của trang web.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:site_name\" content=\"Example Website\">\n"
            + "\n"
            + "og:locale: Ngôn ngữ của trang web.\n"
            + "\n"
            + "Ví dụ: <meta property=\"og:locale\" content=\"vi_VN\">",
            "Website: Trang thông tin chung.\n"
            + "\n"
            + "Article: Dành cho các bài viết, blog, tin tức.\n"
            + "\n"
            + "Video: Dành cho các video trực tuyến.\n"
            + "\n"
            + "Product: Dành cho các sản phẩm thương mại điện tử.\n"
            + "\n"
            + "Music: Dành cho các bài hát, album.",
            "Tăng khả năng hiển thị: Việc sử dụng các thẻ Open Graph giúp bạn điều chỉnh cách trang của mình hiển thị khi được chia sẻ trên các mạng xã hội, từ đó thu hút sự chú ý của người dùng.\n"
            + "\n"
            + "Kiểm soát thông tin chia sẻ: Bạn có thể xác định hình ảnh, tiêu đề và mô tả mà bạn muốn người khác thấy khi chia sẻ liên kết của bạn, thay vì để mạng xã hội tự động trích xuất thông tin.\n"
            + "\n"
            + "Tối ưu hóa cho các nền tảng mạng xã hội: Bằng cách sử dụng Open Graph, bạn đảm bảo rằng trang web của bạn có thể hiển thị đúng cách trên nhiều nền tảng như Facebook, Twitter, LinkedIn, v.v.",
            "Cải thiện CTR (Tỷ lệ nhấp chuột): Các bài viết chia sẻ có hình ảnh và mô tả rõ ràng sẽ thu hút người dùng nhiều hơn, từ đó làm tăng tỷ lệ nhấp chuột vào trang web.\n"
            + "\n"
            + "Hiển thị đúng nội dung: Việc điều chỉnh các thẻ Open Graph giúp bạn đảm bảo rằng người dùng luôn thấy đúng thông tin khi chia sẻ trang web của bạn.",
            "Open Graph giúp tối ưu hóa nội dung khi chia sẻ lên các nền tảng mạng xã hội, cho phép bạn kiểm soát những gì người dùng sẽ thấy, như tiêu đề, mô tả, hình ảnh, và URL. Việc sử dụng Open Graph giúp tăng tính hấp dẫn và cải thiện tỷ lệ nhấp chuột vào trang web của bạn từ các mạng xã hội."
        });
        Content_MAP.put("Twitter Card", new String[]{
            "Twitter Card là một công cụ do Twitter phát triển, cho phép các trang web kiểm soát cách thức nội dung của họ hiển thị khi được chia sẻ trên Twitter. Twitter Card giúp biến các liên kết thông thường thành các bản xem trước phong phú hơn, bao gồm tiêu đề, mô tả, hình ảnh, và thậm chí là video hoặc âm thanh, từ đó tạo sự hấp dẫn và tăng khả năng tương tác.",
            "Tăng tính hấp dẫn khi chia sẻ liên kết: Khi người dùng chia sẻ liên kết từ trang web của bạn, Twitter Card giúp hiển thị nội dung rõ ràng hơn và hấp dẫn hơn, khiến người xem có xu hướng nhấp vào liên kết nhiều hơn.\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng: Twitter Card cung cấp các bản xem trước (rich previews) thay vì chỉ hiển thị một URL đơn giản, giúp người dùng biết trước nội dung trang web là gì khi chia sẻ.\n"
            + "\n"
            + "Tăng tỷ lệ nhấp chuột (CTR): Với các Twitter Card hấp dẫn (hình ảnh lớn, tiêu đề rõ ràng), người dùng có xu hướng nhấp vào liên kết hơn, từ đó tăng lượt truy cập cho trang web của bạn.",
            "Summary Card: Là loại đơn giản nhất, hiển thị tiêu đề, mô tả ngắn và hình ảnh đại diện của trang web.\n"
            + "\n"
            + "Ví dụ: Dùng khi bạn muốn chia sẻ một bài viết, bài blog, hoặc trang sản phẩm.\n"
            + "\n"
            + "Summary Card with Large Image: Giống như Summary Card nhưng có hình ảnh lớn hơn để thu hút người xem.\n"
            + "\n"
            + "Ví dụ: Dùng khi bạn muốn hình ảnh chiếm ưu thế trong bản xem trước, ví dụ như ảnh sản phẩm hoặc sự kiện.\n"
            + "\n"
            + "Player Card: Dành cho các nội dung đa phương tiện như video hoặc âm thanh, giúp hiển thị video hoặc nhạc trực tiếp trên Twitter.\n"
            + "\n"
            + "Ví dụ: Dùng cho video YouTube hoặc âm thanh SoundCloud.\n"
            + "\n"
            + "App Card: Dành cho các liên kết đến ứng dụng, hiển thị các nút tải ứng dụng cho các nền tảng di động.\n"
            + "\n"
            + "Ví dụ: Dùng cho các liên kết dẫn đến trang tải ứng dụng trên App Store hoặc Google Play.",
            "twitter:card: Loại Twitter Card bạn muốn sử dụng (ví dụ: summary, summary_large_image, player, app).\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:card\" content=\"summary_large_image\">\n"
            + "\n"
            + "twitter:title: Tiêu đề của trang khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "\n"
            + "twitter:description: Mô tả ngắn về trang khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ, nâng cao khả năng hiển thị trên công cụ tìm kiếm.\">\n"
            + "\n"
            + "twitter:image: Hình ảnh sẽ hiển thị khi chia sẻ.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:image\" content=\"http://example.com/image.jpg\">\n"
            + "\n"
            + "twitter:url: Địa chỉ URL của trang web.\n"
            + "\n"
            + "Ví dụ: <meta name=\"twitter:url\" content=\"http://example.com\">",
            "Tăng mức độ tương tác: Các thẻ Twitter Card giúp nội dung của bạn nổi bật hơn trên Twitter và thu hút sự chú ý của người dùng, từ đó tăng tỷ lệ nhấp chuột vào liên kết.\n"
            + "\n"
            + "Hiển thị đầy đủ thông tin: Thẻ Twitter Card cho phép bạn chia sẻ đầy đủ thông tin (tiêu đề, mô tả, hình ảnh) thay vì chỉ một URL đơn giản, giúp người dùng hiểu rõ hơn về nội dung mà họ sẽ truy cập.\n"
            + "\n"
            + "Cải thiện hiệu quả chia sẻ: Khi các bài viết có hình ảnh hoặc video được chia sẻ, chúng thường có mức độ tương tác cao hơn, giúp bạn xây dựng thương hiệu và tăng lượng truy cập từ Twitter.",
            "Tạo ấn tượng mạnh mẽ: Các bài viết có hình ảnh lớn hoặc video hiển thị trực tiếp giúp người xem dễ dàng nhận diện và tạo sự chú ý hơn, so với chỉ một dòng văn bản.\n"
            + "\n"
            + "Tăng khả năng chia sẻ: Nội dung được tối ưu hóa với Twitter Card sẽ thu hút người dùng hơn, khuyến khích họ chia sẻ nhiều hơn.",
            "Twitter Card là công cụ mạnh mẽ giúp bạn tối ưu hóa cách nội dung của bạn hiển thị khi chia sẻ trên Twitter. Bằng cách sử dụng các thẻ thích hợp, bạn có thể đảm bảo rằng các bài viết của bạn không chỉ thu hút sự chú ý mà còn tăng khả năng nhấp chuột, từ đó giúp tăng trưởng lượng truy cập cho trang web của bạn."
        });
        Content_MAP.put("Favicon", new String[]{
            "Favicon (viết tắt của \"favorite icon\") là một biểu tượng nhỏ được hiển thị trên các trình duyệt web, thường xuất hiện bên cạnh tên trang web trong tab của trình duyệt hoặc trong danh sách các dấu trang (bookmarks). Favicon giúp người dùng dễ dàng nhận diện và điều hướng giữa các tab hoặc trang web mở trên trình duyệt.",
            "Nhận diện trang web: Favicon giúp người dùng dễ dàng nhận diện trang web của bạn khi mở nhiều tab hoặc trong danh sách dấu trang.\n"
            + "\n"
            + "Tăng tính chuyên nghiệp: Một favicon thiết kế đẹp và dễ nhận diện có thể tạo ấn tượng tốt cho người dùng, đồng thời tăng tính chuyên nghiệp của trang web.\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng: Favicon là một phần quan trọng trong giao diện người dùng, giúp tăng khả năng nhận diện thương hiệu và cải thiện khả năng điều hướng trên trang web.",
            "Định dạng và kích thước:\n"
            + "\n"
            + "Định dạng: Favicon thường có định dạng .ico, nhưng cũng có thể là các định dạng khác như .png, .jpg, hoặc .svg.\n"
            + "\n"
            + "Kích thước: Các kích thước phổ biến cho favicon là 16x16px, 32x32px và 48x48px. Một số thiết bị hoặc trình duyệt hiện đại có thể yêu cầu favicon có kích thước lớn hơn để hỗ trợ hiển thị tốt trên các màn hình Retina.\n"
            + "\n"
            + "Cách chèn favicon vào trang web: Favicon được chèn vào trong phần <head> của mã HTML thông qua thẻ <link>. Dưới đây là một ví dụ về cách sử dụng thẻ <link> để thêm favicon:",
            "rel=\"icon\": Định nghĩa thẻ là favicon.\n"
            + "\n"
            + "href=\"favicon.ico\": Đường dẫn đến tệp favicon của bạn.\n"
            + "\n"
            + "type=\"image/x-icon\": Chỉ định loại tệp của favicon (thường là .ico).\n"
            + "\n"
            + "Favicon cho các thiết bị di động: Để đảm bảo favicon hiển thị đúng trên các thiết bị di động, bạn có thể thêm các thẻ meta để chỉ định các biểu tượng ứng dụng (App Icons) cho các hệ điều hành như iOS hoặc Android:",
            "Bạn cũng có thể sử dụng các favicon có kích thước lớn hơn để phù hợp với các thiết bị với độ phân giải cao (như Retina Display).\n"
            + "\n"
            + "Favicon cho các nền tảng khác: Ngoài các thẻ cơ bản cho favicon trên trình duyệt, nếu bạn muốn tối ưu hóa favicon cho các nền tảng như Windows, Android, hay Safari, bạn có thể sử dụng các thẻ meta sau:",
            "Sử dụng công cụ tạo favicon trực tuyến: Bạn có thể sử dụng các công cụ trực tuyến như favicon.io để tạo favicon từ hình ảnh có sẵn hoặc văn bản.\n"
            + "\n"
            + "Sử dụng phần mềm thiết kế đồ họa: Nếu bạn có kỹ năng thiết kế, bạn có thể sử dụng phần mềm như Photoshop, Illustrator hoặc GIMP để tạo favicon theo cách thủ công. Đảm bảo rằng bạn lưu tệp ở định dạng .ico hoặc .png.",
            "Dễ dàng nhận diện: Favicon giúp người dùng dễ dàng nhận ra trang web của bạn khi họ có nhiều tab mở trên trình duyệt.\n"
            + "\n"
            + "Tăng tính chuyên nghiệp: Một favicon phù hợp sẽ tạo ra ấn tượng tốt và thể hiện rằng bạn chăm sóc từng chi tiết trên trang web của mình.\n"
            + "\n"
            + "Cải thiện UX: Favicon là một phần quan trọng của trải nghiệm người dùng, giúp họ dễ dàng nhận diện và điều hướng trên trang web của bạn.",
            "Favicon là biểu tượng nhỏ giúp nhận diện trang web trên trình duyệt, đặc biệt là trong các tab và dấu trang. Để thêm favicon vào trang web, bạn chỉ cần sử dụng thẻ <link> trong phần <head> của tài liệu HTML. Favicon giúp nâng cao trải nghiệm người dùng và tạo ấn tượng chuyên nghiệp cho trang web của bạn."
        });
        Content_MAP.put("Sitemap", new String[]{
            "Sitemap (tạm dịch là \"sơ đồ trang web\") là một tệp XML hoặc HTML giúp các công cụ tìm kiếm như Google, Bing, Yahoo, v.v. hiểu được cấu trúc của trang web và tìm kiếm các nội dung một cách hiệu quả. Sitemap giúp các công cụ tìm kiếm xác định các trang quan trọng trên website của bạn và lập chỉ mục các trang đó nhanh chóng hơn, từ đó cải thiện SEO (tối ưu hóa công cụ tìm kiếm).",
            "Giúp công cụ tìm kiếm lập chỉ mục: Sitemap giúp các công cụ tìm kiếm hiểu rõ hơn về cấu trúc và nội dung của trang web, đồng thời xác định các trang quan trọng cần lập chỉ mục.\n"
            + "\n"
            + "Cải thiện SEO: Việc có một sitemap hợp lý giúp các công cụ tìm kiếm thu thập thông tin hiệu quả hơn, cải thiện khả năng xuất hiện trên kết quả tìm kiếm.\n"
            + "\n"
            + "Dễ dàng quản lý nội dung trang web: Sitemap là công cụ hữu ích cho quản trị viên website để theo dõi và quản lý các trang trên website của mình.",
            "Sitemap XML: Đây là loại sitemap phổ biến nhất, được sử dụng bởi các công cụ tìm kiếm. Nó chứa danh sách các URL trên trang web của bạn, cùng với các thông tin như:\n"
            + "\n"
            + "Last Modified (Ngày cập nhật gần nhất)\n"
            + "\n"
            + "Change Frequency (Tần suất thay đổi)\n"
            + "\n"
            + "Priority (Ưu tiên của trang)\n"
            + "\n"
            + "Ví dụ về Sitemap XML:",
            "Sitemap HTML: Đây là một sitemap có dạng trang web HTML chứa liên kết đến tất cả các trang quan trọng trên website của bạn. Nó giúp người dùng dễ dàng điều hướng và tìm kiếm thông tin trên trang web. Tuy nhiên, loại sitemap này không ảnh hưởng nhiều đến SEO như sitemap XML.\n"
            + "\n"
            + "Video Sitemap: Nếu trang web của bạn có nhiều video, bạn có thể tạo một video sitemap để giúp công cụ tìm kiếm hiểu rõ hơn về các video có trên trang và tăng khả năng xuất hiện trong kết quả tìm kiếm video.\n"
            + "\n"
            + "Image Sitemap: Tương tự như video sitemap, image sitemap giúp các công cụ tìm kiếm hiểu rõ hơn về các hình ảnh trên website của bạn, tăng khả năng xuất hiện trong kết quả tìm kiếm hình ảnh.\n"
            + "\n"
            + "News Sitemap: Dành cho các trang web có nội dung tin tức, giúp công cụ tìm kiếm hiểu và chỉ mục các bài báo mới nhất một cách nhanh chóng.",
            "Tạo thủ công: Nếu website của bạn không quá lớn, bạn có thể tạo sitemap XML bằng tay bằng cách viết thủ công các URL trong một tệp XML.\n"
            + "\n"
            + "Sử dụng công cụ tạo sitemap: Các công cụ trực tuyến như XML-sitemaps giúp bạn tạo sitemap tự động. Bạn chỉ cần nhập URL của trang web, công cụ sẽ tự động tạo sitemap cho bạn.\n"
            + "\n"
            + "Sử dụng plugin (nếu dùng CMS): Nếu bạn sử dụng CMS như WordPress, có thể sử dụng các plugin như Yoast SEO hoặc Google XML Sitemaps để tạo và cập nhật sitemap tự động.",
            "Giúp công cụ tìm kiếm lập chỉ mục nhanh hơn: Sitemap giúp các công cụ tìm kiếm tìm thấy các trang của bạn nhanh hơn, đặc biệt nếu trang web của bạn có rất nhiều trang, hoặc nếu bạn vừa mới tạo trang web.\n"
            + "\n"
            + "Cải thiện SEO: Việc lập chỉ mục nhanh chóng giúp các trang quan trọng của bạn được xếp hạng tốt hơn trên các công cụ tìm kiếm.\n"
            + "\n"
            + "Hỗ trợ các trang web động hoặc trang mới: Nếu trang web của bạn thường xuyên cập nhật hoặc có nhiều trang mới, sitemap giúp các công cụ tìm kiếm dễ dàng phát hiện các thay đổi và nội dung mới.\n"
            + "\n"
            + "Hỗ trợ các nội dung đặc biệt: Nếu trang web của bạn có video, hình ảnh, hoặc tin tức, sitemap sẽ giúp công cụ tìm kiếm hiểu rõ hơn về những nội dung này, từ đó giúp chúng xuất hiện trong các kết quả tìm kiếm tương ứng.",
            "Truy cập vào Google Search Console và chọn trang web của bạn.\n"
            + "\n"
            + "Chọn \"Sitemaps\" từ menu bên trái.\n"
            + "\n"
            + "Nhập đường dẫn của sitemap XML vào ô \"Add a new sitemap\".\n"
            + "\n"
            + "Nhấn \"Submit\".",
            "Sitemap là một công cụ hữu ích giúp công cụ tìm kiếm như Google dễ dàng lập chỉ mục các trang của bạn. Các loại sitemap phổ biến bao gồm sitemap XML, HTML, video, hình ảnh, và tin tức. Sitemap không chỉ giúp công cụ tìm kiếm tìm thấy nội dung nhanh chóng mà còn giúp cải thiện SEO và quản lý nội dung trang web."
        });
        Content_MAP.put("robots.txt", new String[]{
            "robots.txt là một tệp văn bản nằm trong thư mục gốc của một trang web, giúp quản trị viên web chỉ dẫn các công cụ tìm kiếm (robots hoặc crawlers) về cách thức truy cập và thu thập dữ liệu từ các trang web trên trang của họ. Tệp này rất quan trọng trong SEO vì nó cho phép bạn kiểm soát việc lập chỉ mục của các công cụ tìm kiếm và bảo vệ các trang web mà bạn không muốn chúng lập chỉ mục.",
            "Chỉ định quyền truy cập của robots: Bạn có thể chỉ định các trang hoặc thư mục mà bạn không muốn công cụ tìm kiếm truy cập và lập chỉ mục.\n"
            + "\n"
            + "Giảm tải cho máy chủ: Một số robots có thể làm tải hệ thống của bạn nặng lên bằng cách thu thập dữ liệu quá nhiều. Bạn có thể hạn chế việc này bằng cách chỉ định các trang không cần thiết cho robots.\n"
            + "\n"
            + "Bảo mật thông tin: Nếu có những trang bạn không muốn công khai trên các công cụ tìm kiếm (ví dụ: trang đăng nhập, trang cá nhân, hoặc dữ liệu nhạy cảm), bạn có thể chỉ thị cho robots không lập chỉ mục các trang đó.",
            "Tệp robots.txt sử dụng cú pháp đơn giản gồm hai thành phần chính:\n"
            + "\n"
            + "User-agent: Xác định tên của robot (crawler) mà bạn muốn áp dụng các quy tắc.\n"
            + "\n"
            + "Disallow: Định nghĩa các đường dẫn mà robot không được phép truy cập.\n"
            + "\n"
            + "Allow: Định nghĩa các đường dẫn mà robot được phép truy cập, nếu có.\n"
            + "\n"
            + "Sitemap: Cung cấp đường dẫn đến sitemap của bạn để công cụ tìm kiếm có thể tìm thấy tất cả các trang mà bạn muốn lập chỉ mục.",
            "Chặn tất cả robots khỏi toàn bộ website:",
            "**User-agent: ***: Đây là tất cả các robots.\n"
            + "\n"
            + "Disallow: /: Chặn mọi robot truy cập toàn bộ website.\n"
            + "\n"
            + "Cho phép tất cả robots truy cập toàn bộ website:",
            "Disallow: rỗng có nghĩa là không có trang nào bị chặn, tất cả các robots có thể truy cập mọi trang.\n"
            + "\n"
            + "Chỉ cho phép Googlebot (Google Search Bot) truy cập một thư mục nhất định:",
            "User-agent: Googlebot: Đây là robot của Google.\n"
            + "\n"
            + "Disallow: /: Chặn Googlebot truy cập vào toàn bộ trang web.\n"
            + "\n"
            + "Allow: /public/: Cho phép Googlebot truy cập thư mục /public/.\n"
            + "\n"
            + "Cung cấp Sitemap cho robots:",
            "Sitemap: Cung cấp đường dẫn đến sitemap, giúp các công cụ tìm kiếm hiểu rõ hơn về cấu trúc của trang web.",
            "User-agent: Xác định công cụ tìm kiếm cụ thể (Googlebot, Bingbot, v.v.).\n"
            + "\n"
            + "Ví dụ: User-agent: Googlebot chỉ định quy tắc cho Googlebot.\n"
            + "\n"
            + "Disallow: Cấm truy cập vào các trang hoặc thư mục nhất định.\n"
            + "\n"
            + "Ví dụ: Disallow: /admin/ chặn tất cả các robots truy cập vào thư mục /admin/.\n"
            + "\n"
            + "Allow: Cho phép robots truy cập một số trang mặc dù có sự hạn chế chung.\n"
            + "\n"
            + "Ví dụ: Allow: /public/ cho phép robots truy cập thư mục /public/.\n"
            + "\n"
            + "Cảnh báo về các lỗi phổ biến:\n"
            + "\n"
            + "Không có khoảng cách giữa User-agent: và tên của robot.\n"
            + "\n"
            + "Không có Disallow: / ở dưới cùng của tệp nếu bạn không muốn chặn toàn bộ website.",
            "Kiểm soát công cụ tìm kiếm: Robots.txt giúp bạn kiểm soát cách các công cụ tìm kiếm tương tác với trang web của bạn, quyết định trang nào được lập chỉ mục và trang nào không.\n"
            + "\n"
            + "Bảo vệ các nội dung nhạy cảm: Nếu có các trang không mong muốn xuất hiện trong kết quả tìm kiếm (như trang đăng nhập, trang cá nhân, hay các trang thử nghiệm), bạn có thể ngừng công cụ tìm kiếm truy cập chúng.\n"
            + "\n"
            + "Tối ưu hóa tài nguyên máy chủ: Bạn có thể chặn các công cụ tìm kiếm không cần thiết để giảm tải cho máy chủ của bạn, giúp trang web hoạt động hiệu quả hơn.",
            "robots.txt là một tệp quan trọng trong quản lý SEO và tối ưu hóa công cụ tìm kiếm, cho phép bạn chỉ dẫn các công cụ tìm kiếm về cách thức truy cập và lập chỉ mục các trang web của bạn. Bạn có thể chặn các trang không mong muốn hoặc cung cấp hướng dẫn chi tiết về các trang quan trọng cần được lập chỉ mục."
        });
        Content_MAP.put("Local Storage", new String[]{
            "Local Storage là một tính năng của HTML5 cho phép lưu trữ dữ liệu trong trình duyệt của người dùng dưới dạng key-value (cặp khóa-giá trị). Dữ liệu được lưu trữ trong Local Storage có thể tồn tại lâu dài, ngay cả khi người dùng đóng trình duyệt hoặc tắt máy tính. Điều này giúp ứng dụng web duy trì trạng thái giữa các phiên làm việc mà không cần phải lưu trữ dữ liệu trên máy chủ.",
            "Lưu trữ dữ liệu phía client: Dữ liệu được lưu trữ trên máy tính của người dùng, trong trình duyệt web, thay vì trên server.\n"
            + "\n"
            + "Dữ liệu không có thời gian hết hạn: Dữ liệu được lưu trữ trong Local Storage không bị xóa tự động khi đóng trình duyệt hoặc sau một khoảng thời gian, trừ khi người dùng hoặc ứng dụng web yêu cầu xóa.\n"
            + "\n"
            + "Dữ liệu lưu trữ dạng key-value: Bạn có thể lưu trữ các giá trị theo cặp khóa (key) và giá trị (value). Các giá trị này thường là chuỗi (string), nhưng bạn có thể sử dụng JSON.parse() và JSON.stringify() để lưu trữ các đối tượng phức tạp.\n"
            + "\n"
            + "Giới hạn dung lượng: Trình duyệt thường có một hạn chế về dung lượng khi sử dụng Local Storage, thông thường khoảng 5MB cho mỗi domain.\n"
            + "\n"
            + "Truy cập đồng bộ: Việc đọc và ghi dữ liệu trong Local Storage là đồng bộ, nghĩa là khi bạn yêu cầu trình duyệt lưu trữ hoặc lấy dữ liệu, nó sẽ thực hiện ngay lập tức và chặn tiến trình cho đến khi hoàn thành.",
            " Lưu trữ dữ liệu:\n"
            + "Dữ liệu được lưu trữ dưới dạng cặp khóa-giá trị. Bạn sử dụng phương thức localStorage.setItem(key, value) để lưu trữ dữ liệu.",
            "2. Lấy dữ liệu:\n"
            + "Để lấy giá trị của một khóa đã lưu, bạn sử dụng localStorage.getItem(key).",
            "3. Xóa dữ liệu:\n"
            + "Để xóa một cặp khóa-giá trị, bạn sử dụng localStorage.removeItem(key).",
            "4. Xóa tất cả dữ liệu:\n"
            + "Để xóa toàn bộ dữ liệu trong Local Storage, bạn sử dụng localStorage.clear().\n"
            + "",
            "5. Kiểm tra sự tồn tại của dữ liệu:\n"
            + "Bạn có thể kiểm tra xem một khóa có tồn tại trong Local Storage hay không bằng cách kiểm tra giá trị trả về của getItem.\n"
            + "",
            "6. Lưu trữ đối tượng phức tạp (JSON):\n"
            + "Local Storage chỉ hỗ trợ lưu trữ chuỗi, nhưng bạn có thể lưu trữ các đối tượng phức tạp bằng cách sử dụng JSON.stringify() để chuyển đối tượng thành chuỗi trước khi lưu và JSON.parse() để chuyển chuỗi trở lại thành đối tượng khi lấy ra.",
            "Lưu trữ lâu dài: Dữ liệu trong Local Storage tồn tại ngay cả khi người dùng đóng trình duyệt hoặc tắt máy tính.\n"
            + "\n"
            + "Không cần kết nối mạng: Local Storage giúp bạn lưu trữ dữ liệu mà không cần phải phụ thuộc vào server, giúp giảm tải cho máy chủ và tiết kiệm băng thông.\n"
            + "\n"
            + "Lưu trữ dễ dàng: Với chỉ một vài lệnh đơn giản, bạn có thể dễ dàng lưu trữ và lấy lại dữ liệu từ Local Storage.",
            "Dung lượng hạn chế: Local Storage có giới hạn dung lượng (thường là khoảng 5MB), nên không thể lưu trữ quá nhiều dữ liệu.\n"
            + "\n"
            + "Dữ liệu có thể bị xóa thủ công: Người dùng có thể xóa dữ liệu trong Local Storage bằng cách xóa lịch sử duyệt web hoặc sử dụng công cụ phát triển của trình duyệt.\n"
            + "\n"
            + "Không hỗ trợ lưu trữ dữ liệu bảo mật: Vì dữ liệu lưu trữ trong Local Storage có thể bị truy cập dễ dàng bởi bất kỳ ai sử dụng trình duyệt của bạn, nên không nên lưu trữ thông tin nhạy cảm (ví dụ: mật khẩu, thông tin thẻ tín dụng).\n"
            + "\n"
            + "Không có tính năng đồng bộ giữa các thiết bị: Dữ liệu chỉ được lưu trữ trên thiết bị của người dùng hiện tại và không được đồng bộ giữa các thiết bị khác nhau.",
            "Local Storage là một công cụ mạnh mẽ cho phép bạn lưu trữ dữ liệu phía client trong trình duyệt của người dùng. Nó giúp các ứng dụng web duy trì trạng thái giữa các phiên làm việc mà không cần phải lưu trữ dữ liệu trên server, giúp cải thiện hiệu suất và giảm tải cho server. Tuy nhiên, cần lưu ý về dung lượng hạn chế và bảo mật khi lưu trữ dữ liệu quan trọng."
        });
        Content_MAP.put("Session Storage", new String[]{
            "Session Storage là một tính năng trong HTML5 cho phép lưu trữ dữ liệu trong trình duyệt, tương tự như Local Storage, nhưng dữ liệu trong Session Storage chỉ tồn tại trong suốt phiên làm việc của người dùng (session). Khi người dùng đóng tab hoặc cửa sổ trình duyệt, dữ liệu trong Session Storage sẽ bị xóa. Điều này có nghĩa là dữ liệu không được lưu trữ lâu dài, mà chỉ trong một phiên duyệt web duy nhất.",
            "Lưu trữ dữ liệu trong phiên duyệt web: Dữ liệu chỉ tồn tại trong một phiên duyệt web duy nhất. Khi tab hoặc cửa sổ trình duyệt đóng lại, dữ liệu trong Session Storage sẽ bị xóa.\n"
            + "\n"
            + "Dữ liệu được lưu dưới dạng key-value: Cũng giống như Local Storage, Session Storage lưu trữ dữ liệu dưới dạng các cặp khóa-giá trị.\n"
            + "\n"
            + "Dữ liệu không được chia sẻ giữa các tab và cửa sổ khác nhau: Mỗi tab và cửa sổ của trình duyệt có bộ Session Storage riêng biệt. Dữ liệu trong Session Storage của một tab sẽ không thể truy cập được từ tab khác.\n"
            + "\n"
            + "Giới hạn dung lượng: Session Storage cũng có giới hạn dung lượng, nhưng thường lớn hơn Local Storage một chút (tùy thuộc vào trình duyệt).",
            "1. Lưu trữ dữ liệu:\n"
            + "Sử dụng phương thức sessionStorage.setItem(key, value) để lưu trữ dữ liệu trong Session Storage.",
            "2. Lấy dữ liệu:\n"
            + "Để lấy giá trị của một khóa đã lưu trong Session Storage, sử dụng sessionStorage.getItem(key).",
            "3. Xóa dữ liệu:\n"
            + "Để xóa một cặp khóa-giá trị trong Session Storage, sử dụng sessionStorage.removeItem(key).",
            "4. Xóa tất cả dữ liệu:\n"
            + "Để xóa toàn bộ dữ liệu trong Session Storage, sử dụng sessionStorage.clear().",
            "5. Kiểm tra sự tồn tại của dữ liệu:\n"
            + "Bạn có thể kiểm tra xem một khóa có tồn tại trong Session Storage hay không bằng cách kiểm tra giá trị trả về của getItem.",
            "6. Lưu trữ đối tượng phức tạp (JSON):\n"
            + "Giống như với Local Storage, dữ liệu trong Session Storage cũng chỉ có thể là chuỗi. Bạn có thể lưu trữ các đối tượng phức tạp bằng cách sử dụng JSON.stringify() và JSON.parse().",
            "Dữ liệu tồn tại trong một phiên duyệt web: Session Storage rất hữu ích khi bạn cần lưu trữ dữ liệu chỉ trong suốt một phiên duyệt web mà không cần phải giữ lại sau khi người dùng đóng tab hoặc cửa sổ trình duyệt.\n"
            + "\n"
            + "Không bị xóa khi reload trang: Dữ liệu trong Session Storage vẫn tồn tại trong suốt phiên làm việc, ngay cả khi người dùng reload trang.\n"
            + "\n"
            + "Lưu trữ dữ liệu cho các tác vụ ngắn hạn: Ví dụ, bạn có thể sử dụng Session Storage để lưu trữ các giá trị trong quá trình điền vào form, giỏ hàng, hoặc các bước trong quy trình thanh toán.",
            "Dữ liệu chỉ tồn tại trong một phiên duyệt web: Dữ liệu sẽ bị mất khi người dùng đóng tab hoặc cửa sổ trình duyệt, do đó không thể sử dụng để lưu trữ thông tin dài hạn.\n"
            + "\n"
            + "Không chia sẻ giữa các tab: Dữ liệu trong Session Storage không thể truy cập được từ các tab khác trong cùng một trình duyệt, mỗi tab có một bộ Session Storage riêng.\n"
            + "\n"
            + "Giới hạn dung lượng: Mặc dù dung lượng của Session Storage lớn hơn cookie, nhưng nó vẫn có giới hạn, và nếu bạn cần lưu trữ rất nhiều dữ liệu, bạn có thể gặp phải vấn đề về dung lượng."
        });
        Content_MAP.put("Geolocation API là", new String[]{
            "Geolocation API là một API trong HTML5 cho phép các trang web và ứng dụng web truy cập thông tin về vị trí địa lý của người dùng. API này giúp xác định vị trí của người dùng (theo vĩ độ và kinh độ) để phục vụ các tính năng như định vị, tìm kiếm gần đó, bản đồ và các ứng dụng yêu cầu thông tin vị trí.",
            "Xác định vị trí người dùng: API này cho phép ứng dụng web xác định vị trí của người dùng thông qua các phương pháp như GPS, Wi-Fi hoặc địa chỉ IP, tùy thuộc vào khả năng của thiết bị và trình duyệt.\n"
            + "\n"
            + "Đơn giản và dễ sử dụng: Chỉ với vài dòng mã JavaScript, bạn có thể lấy thông tin vị trí của người dùng.\n"
            + "\n"
            + "Chỉ thị các quyền riêng tư: Trình duyệt sẽ yêu cầu người dùng cấp quyền truy cập thông tin vị trí. Nếu người dùng không cấp quyền, API sẽ không thể truy xuất vị trí.\n"
            + "\n"
            + "Cập nhật vị trí liên tục: API này cũng có thể cung cấp thông tin vị trí liên tục khi người dùng di chuyển, giúp các ứng dụng như bản đồ hoặc điều hướng theo thời gian thực hoạt động hiệu quả.",
            "Để sử dụng Geolocation API trong JavaScript, bạn sẽ sử dụng đối tượng navigator.geolocation. Các phương thức chính của Geolocation API bao gồm:\n"
            + "\n"
            + "getCurrentPosition(): Phương thức này được sử dụng để lấy vị trí hiện tại của người dùng.\n"
            + "\n"
            + "watchPosition(): Phương thức này theo dõi sự thay đổi của vị trí và gọi lại mỗi khi có sự thay đổi.\n"
            + "\n"
            + "clearWatch(): Dùng để dừng theo dõi vị trí khi không còn cần thiết.",
            "1. Lấy vị trí hiện tại của người dùng:",
            "2. Theo dõi vị trí liên tục",
            "Để dừng theo dõi vị trí, bạn có thể sử dụng clearWatch():",
            "Vị trí được trả về dưới dạng đối tượng position, có thuộc tính coords chứa các thông tin sau:\n"
            + "\n"
            + "latitude: Vĩ độ của vị trí.\n"
            + "\n"
            + "longitude: Kinh độ của vị trí.\n"
            + "\n"
            + "altitude (nếu có): Chiều cao so với mực nước biển.\n"
            + "\n"
            + "accuracy: Độ chính xác của thông tin vị trí (đơn vị: mét).\n"
            + "\n"
            + "altitudeAccuracy (nếu có): Độ chính xác của chiều cao (đơn vị: mét).\n"
            + "\n"
            + "heading (nếu có): Hướng di chuyển (theo độ).\n"
            + "\n"
            + "speed (nếu có): Tốc độ di chuyển (đơn vị: m/s).",
            "Trình duyệt sẽ yêu cầu người dùng cấp quyền truy cập vị trí trước khi API có thể trả về thông tin.\n"
            + "\n"
            + "Các trang web chỉ có thể sử dụng Geolocation API qua kết nối HTTPS (trình duyệt sẽ từ chối yêu cầu vị trí nếu trang web không sử dụng HTTPS).\n"
            + "\n"
            + "Các dịch vụ như Google Maps, Uber, và các ứng dụng tìm kiếm địa phương sử dụng Geolocation API để cung cấp các tính năng dựa trên vị trí chính xác của người dùng.",
            "Ưu điểm:\n"
            + "Tiện ích: Cung cấp một cách nhanh chóng và dễ dàng để xác định vị trí của người dùng.\n"
            + "\n"
            + "Ứng dụng rộng rãi: Được sử dụng trong nhiều loại ứng dụng như bản đồ, ứng dụng định vị, tìm kiếm gần đó và các dịch vụ liên quan đến vị trí.\n"
            + "\n"
            + "Chính xác: Tùy thuộc vào thiết bị và kết nối, có thể cung cấp độ chính xác cao, đặc biệt với các thiết bị di động có GPS.\n"
            + "\n"
            + "Hạn chế:\n"
            + "Quyền riêng tư: Người dùng cần phải cấp quyền để truy cập vị trí của họ, nếu không API sẽ không thể lấy dữ liệu.\n"
            + "\n"
            + "Yêu cầu HTTPS: Để bảo mật và bảo vệ quyền riêng tư của người dùng, Geolocation API chỉ hoạt động trên các trang sử dụng HTTPS.\n"
            + "\n"
            + "Độ chính xác có thể thay đổi: Độ chính xác của vị trí có thể không cao, đặc biệt là khi sử dụng Wi-Fi hoặc địa chỉ IP thay vì GPS.",
            "Geolocation API giúp các trang web và ứng dụng web truy cập thông tin về vị trí địa lý của người dùng, hỗ trợ các tính năng như định vị, tìm kiếm gần đó, và bản đồ. Tuy nhiên, để đảm bảo tính bảo mật và quyền riêng tư, người dùng phải cấp phép cho ứng dụng sử dụng thông tin vị trí của họ."
        });
        Content_MAP.put("Tính năng của Geolocation API", new String[]{
            "getCurrentPosition(): Phương thức này trả về vị trí địa lý hiện tại của người dùng. Đây là tính năng cơ bản nhất của Geolocation API, cho phép bạn lấy thông tin vĩ độ, kinh độ của người dùng một lần khi yêu cầu.\n"
            + "\n"
            + "Ví dụ: Xác định vị trí của người dùng khi họ truy cập trang web.",
            "watchPosition(): Phương thức này cho phép theo dõi sự thay đổi của vị trí người dùng theo thời gian thực. Mỗi khi vị trí thay đổi, hàm callback được gọi lại với thông tin vị trí mới.\n"
            + "\n"
            + "Ví dụ: Sử dụng trong các ứng dụng như bản đồ, hướng dẫn đường đi, hay các ứng dụng yêu cầu cập nhật liên tục về vị trí của người dùng.",
            "Các phương thức getCurrentPosition() và watchPosition() đều hỗ trợ cơ chế xử lý lỗi. Nếu không thể lấy thông tin vị trí (ví dụ: do không có quyền truy cập hoặc thiết bị không hỗ trợ), bạn có thể xử lý thông qua một hàm callback lỗi.\n"
            + "\n"
            + "Lỗi có thể bao gồm: \"Không có quyền truy cập\", \"Không thể xác định vị trí\", \"Thiết bị không hỗ trợ\".",
            "Thông qua thuộc tính coords.accuracy, bạn có thể biết được độ chính xác của vị trí (đơn vị: mét). Điều này rất quan trọng nếu bạn cần kết quả vị trí chính xác cho các ứng dụng như tìm kiếm gần đó hoặc định vị trên bản đồ.",
            "Trong một số trường hợp, Geolocation API cũng có thể trả về độ cao của vị trí người dùng so với mực nước biển, thông qua thuộc tính coords.altitude. Tuy nhiên, điều này chỉ có sẵn nếu thiết bị hỗ trợ (ví dụ: GPS trên thiết bị di động).",
            "Heading: Nếu thiết bị hỗ trợ, API có thể cung cấp thông tin về hướng di chuyển (hướng của thiết bị) thông qua thuộc tính coords.heading (theo độ).",
            "Speed: Nếu thiết bị hỗ trợ (ví dụ: với GPS hoặc các cảm biến chuyển động), bạn có thể lấy được tốc độ di chuyển của người dùng qua thuộc tính coords.speed (đơn vị m/s).",
            "Trình duyệt sẽ yêu cầu người dùng cấp phép trước khi cho phép ứng dụng web truy cập vào thông tin vị trí của họ. Điều này giúp bảo vệ quyền riêng tư của người dùng.\n"
            + "\n"
            + "Geolocation API chỉ có thể được sử dụng trên các trang web bảo mật (HTTPS).",
            "Geolocation API không chỉ sử dụng GPS để xác định vị trí mà còn có thể sử dụng Wi-Fi, địa chỉ IP và các phương pháp khác để xác định vị trí khi GPS không khả dụng hoặc chính xác.\n"
            + "\n"
            + "Đặc biệt, trong các khu vực đô thị, sử dụng Wi-Fi có thể cung cấp vị trí chính xác hơn so với GPS.",
            "Lấy và theo dõi vị trí người dùng (getCurrentPosition, watchPosition).\n"
            + "\n"
            + "Cung cấp thông tin chi tiết như độ chính xác, chiều cao, tốc độ, và hướng di chuyển.\n"
            + "\n"
            + "Bảo mật và quyền riêng tư: Trình duyệt yêu cầu sự cho phép của người dùng trước khi truy cập thông tin vị trí.\n"
            + "\n"
            + "Hỗ trợ đa phương pháp định vị: Bao gồm GPS, Wi-Fi, địa chỉ IP, giúp xác định vị trí trong các điều kiện khác nhau."
        });
        Content_MAP.put("Lợi ích SEO gián tiếp", new String[]{
            "Lợi ích SEO gián tiếp là những lợi ích mà các yếu tố hoặc chiến lược không trực tiếp ảnh hưởng đến thứ hạng của trang web trên công cụ tìm kiếm nhưng lại góp phần cải thiện trải nghiệm người dùng và các yếu tố liên quan, từ đó giúp cải thiện SEO tổng thể. Dưới đây là một số lợi ích SEO gián tiếp:",
            "Tốc độ tải trang: Các yếu tố như tối ưu hóa hình ảnh, sử dụng bộ nhớ cache và giảm thiểu JavaScript có thể làm tăng tốc độ tải trang. Trang web tải nhanh không chỉ nâng cao trải nghiệm người dùng mà còn giảm tỷ lệ thoát (bounce rate), yếu tố gián tiếp ảnh hưởng đến SEO.\n"
            + "\n"
            + "Thiết kế thân thiện với thiết bị di động: Với sự gia tăng người dùng di động, một trang web được tối ưu hóa cho thiết bị di động không chỉ giúp người dùng dễ dàng duyệt web mà còn giúp cải thiện SEO. Google ưu tiên các trang web thân thiện với di động trong kết quả tìm kiếm.",
            "Các yếu tố như tối ưu hóa các nút kêu gọi hành động (CTA), đơn giản hóa quy trình thanh toán và cải thiện các trang đích có thể giúp tăng tỷ lệ chuyển đổi. Mặc dù tỷ lệ chuyển đổi không phải là yếu tố trực tiếp ảnh hưởng đến SEO, nhưng nếu tỷ lệ chuyển đổi của trang web cao, có thể giúp Google nhận ra rằng trang web có giá trị cao đối với người dùng, từ đó cải thiện thứ hạng gián tiếp.",
            "Trải nghiệm người dùng tốt hơn (ví dụ: nội dung hấp dẫn, thiết kế dễ sử dụng, tốc độ trang nhanh) sẽ khiến người dùng ở lại lâu hơn trên trang web, giảm tỷ lệ thoát. Tỷ lệ thoát thấp có thể là một tín hiệu gián tiếp cho Google rằng trang web của bạn có giá trị và liên quan đến người tìm kiếm, điều này giúp cải thiện thứ hạng SEO.",
            "Khi người dùng tìm thấy nội dung hữu ích và dễ dàng điều hướng trên trang web của bạn, họ sẽ dành nhiều thời gian hơn để duyệt. Google có thể sử dụng dữ liệu này để hiểu rằng trang web của bạn cung cấp giá trị cho người dùng, từ đó gián tiếp ảnh hưởng đến thứ hạng SEO.",
            "Phân tích hành vi người dùng trên trang web (thông qua Google Analytics, ví dụ) giúp bạn hiểu được nội dung nào hiệu quả và nội dung nào không thu hút người dùng. Việc này giúp tối ưu hóa nội dung của bạn, tạo ra những bài viết và trang đích hấp dẫn hơn, qua đó gián tiếp nâng cao SEO bằng cách thu hút nhiều người truy cập và giữ họ lâu hơn.",
            "Mặc dù không phải là yếu tố trực tiếp trong thuật toán xếp hạng của Google, nhưng việc xây dựng mối quan hệ tốt với các đối tác và cộng đồng (ví dụ: qua mạng xã hội, diễn đàn, hoặc các chương trình hợp tác) có thể gián tiếp giúp SEO. Việc nhận được sự chia sẻ, liên kết (backlinks) từ các nguồn uy tín giúp cải thiện sự tin cậy và thứ hạng của trang web trong kết quả tìm kiếm.",
            "Việc cung cấp thông tin rõ ràng về bảo mật (chứng chỉ SSL), các điều khoản sử dụng, chính sách bảo mật và các chứng chỉ uy tín giúp xây dựng lòng tin của người dùng. Khi người dùng cảm thấy trang web đáng tin cậy, họ sẽ dành nhiều thời gian hơn và tham gia vào các hành động có giá trị như đăng ký nhận bản tin hoặc mua sắm. Điều này có thể gián tiếp ảnh hưởng đến SEO.",
            "Mặc dù SEO chủ yếu tập trung vào việc tối ưu hóa trang web, nhưng các chiến lược marketing khác như email marketing, social media marketing, và video marketing cũng có thể gián tiếp hỗ trợ SEO. Chia sẻ nội dung của bạn trên các nền tảng xã hội có thể tạo ra lưu lượng truy cập vào trang web và khuyến khích người dùng chia sẻ thêm, từ đó tạo ra nhiều cơ hội xây dựng liên kết tự nhiên.",
            "Việc xây dựng thương hiệu và mối quan hệ lâu dài với người dùng có thể giúp cải thiện lưu lượng truy cập tự nhiên vào trang web. Khi người dùng nhớ đến thương hiệu của bạn và quay lại tìm kiếm, điều này có thể gián tiếp ảnh hưởng đến SEO bởi vì Google nhận diện rằng người dùng có xu hướng tìm kiếm và tương tác với trang web của bạn thường xuyên.",
            "Lợi ích SEO gián tiếp không chỉ đến từ việc tối ưu hóa các yếu tố kỹ thuật SEO mà còn từ việc cải thiện trải nghiệm người dùng, tối ưu hóa tỷ lệ chuyển đổi, giảm tỷ lệ thoát và tạo dựng mối quan hệ vững mạnh với người dùng. Tất cả những yếu tố này không chỉ làm cho người dùng hài lòng mà còn gián tiếp giúp cải thiện thứ hạng trang web trong kết quả tìm kiếm của Google."
        });
        Content_MAP.put("Drag & Drop API là gì", new String[]{
            "Drag & Drop API là một API trong HTML5 cho phép người dùng kéo (drag) và thả (drop) các phần tử trên trang web. API này giúp tạo ra các giao diện người dùng trực quan và dễ sử dụng, nơi người dùng có thể kéo các mục (như hình ảnh, văn bản, hoặc các phần tử giao diện khác) và thả chúng vào các khu vực khác nhau trên trang web.",
            "Drag Events: Các sự kiện được kích hoạt khi người dùng thực hiện thao tác kéo và thả. Những sự kiện này giúp theo dõi trạng thái của các phần tử trong suốt quá trình kéo và thả.\n"
            + "\n"
            + "dragstart: Kích hoạt khi người dùng bắt đầu kéo một phần tử.\n"
            + "\n"
            + "drag: Kích hoạt khi phần tử đang được kéo.\n"
            + "\n"
            + "dragend: Kích hoạt khi người dùng kết thúc hành động kéo (thả hoặc hủy bỏ).\n"
            + "\n"
            + "dragenter: Kích hoạt khi phần tử kéo vào khu vực có thể thả.\n"
            + "\n"
            + "dragover: Kích hoạt khi phần tử đang được kéo qua khu vực có thể thả.\n"
            + "\n"
            + "dragleave: Kích hoạt khi phần tử kéo rời khỏi khu vực có thể thả.\n"
            + "\n"
            + "drop: Kích hoạt khi phần tử được thả vào khu vực có thể thả.\n"
            + "\n"
            + "Drag Data:\n"
            + "\n"
            + "Thông qua phương thức setData() và getData(), bạn có thể thiết lập và lấy dữ liệu khi kéo và thả. Điều này cho phép bạn lưu trữ thông tin về phần tử đang kéo và sử dụng nó khi phần tử được thả.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "setData(type, data): Xác định loại dữ liệu và giá trị dữ liệu (ví dụ: văn bản, hình ảnh, v.v.).\n"
            + "\n"
            + "getData(type): Lấy dữ liệu được lưu trữ trong quá trình kéo.\n"
            + "\n"
            + "Khu vực Kéo và Thả:\n"
            + "\n"
            + "draggable: Thuộc tính draggable được áp dụng cho phần tử mà người dùng có thể kéo. Đặt thuộc tính này là true để cho phép phần tử đó có thể kéo.\n"
            + "\n"
            + "dropzone: Khu vực nơi người dùng có thể thả phần tử vào. Bạn có thể chỉ định khu vực này thông qua các sự kiện dragover và drop.",
            "1. Tạo Phần Tử Kéo (Draggable Element):\n"
            + "Trước tiên, bạn cần thêm thuộc tính draggable=\"true\" vào phần tử HTML mà bạn muốn người dùng có thể kéo.",
            "2. Xử Lý Sự Kiện Khi Bắt Đầu Kéo (dragstart)\n"
            + "Khi người dùng bắt đầu kéo phần tử, sự kiện dragstart được kích hoạt. Bạn có thể lưu trữ dữ liệu để sử dụng khi phần tử được thả.",
            "3. Thiết Lập Khu Vực Thả (Drop Zone)\n"
            + "Để tạo khu vực có thể thả, bạn cần thêm sự kiện dragover (để cho phép kéo vào khu vực này) và drop (để xử lý khi thả phần tử vào).",
            "4. Sự Kiện Khi Kéo Vượt Qua Khu Vực Thả (dragenter, dragleave)\n"
            + "Bạn có thể sử dụng các sự kiện dragenter và dragleave để thay đổi giao diện của khu vực thả khi phần tử kéo vào hoặc ra khỏi khu vực này.",
            "Giao diện trực quan: Tạo ra các trải nghiệm người dùng tương tác trực quan và dễ sử dụng.\n"
            + "\n"
            + "Tăng tính linh hoạt: Có thể áp dụng cho nhiều loại nội dung, từ văn bản, hình ảnh cho đến các phần tử giao diện.\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng: Việc kéo và thả giúp người dùng thao tác nhanh chóng và hiệu quả hơn trong nhiều ứng dụng web, ví dụ như trong ứng dụng quản lý tệp hoặc các trò chơi.",
            "Drag & Drop API cung cấp các công cụ cho phép người dùng kéo và thả các phần tử trên trang web, tạo ra các trải nghiệm người dùng tương tác và trực quan. Các sự kiện chính của API này giúp theo dõi quá trình kéo và thả, từ đó tạo ra những giao diện linh hoạt và dễ sử dụng."
        });
        Content_MAP.put("Tính năng của Drag & Drop API", new String[]{
            "Kéo Phần Tử: Cho phép người dùng kéo các phần tử HTML (như hình ảnh, văn bản, các mục trong danh sách) từ một vị trí và di chuyển chúng đến nơi khác trên trang web.\n"
            + "\n"
            + "Thả Phần Tử: Cung cấp cơ chế để người dùng thả phần tử đã kéo vào một khu vực xác định, như khu vực thả (drop zone), giúp thực hiện các thao tác như thay đổi vị trí, chuyển đổi trạng thái, hoặc di chuyển tệp.",
            "setData() và getData(): Cung cấp khả năng lưu trữ và truy xuất dữ liệu trong suốt quá trình kéo và thả. Bạn có thể lưu trữ thông tin về phần tử đang kéo và sử dụng thông tin này khi thả phần tử vào khu vực đích.\n"
            + "\n"
            + "Dữ Liệu Đa Dạng: API hỗ trợ nhiều loại dữ liệu, không chỉ giới hạn trong văn bản, mà còn có thể là các đối tượng phức tạp, hình ảnh hoặc các dữ liệu dạng nhị phân.",
            "dragstart: Kích hoạt khi người dùng bắt đầu kéo một phần tử.\n"
            + "\n"
            + "drag: Kích hoạt trong suốt quá trình kéo phần tử, có thể được sử dụng để cập nhật giao diện hoặc các trạng thái liên quan.\n"
            + "\n"
            + "dragend: Kích hoạt khi việc kéo kết thúc, tức là khi phần tử được thả hoặc hành động kéo bị hủy bỏ.\n"
            + "\n"
            + "dragenter: Xảy ra khi phần tử đang kéo vào khu vực có thể thả, giúp bạn thay đổi giao diện khu vực thả (ví dụ: thay đổi màu nền).\n"
            + "\n"
            + "dragover: Kích hoạt khi phần tử kéo qua khu vực có thể thả, bạn cần phải gọi event.preventDefault() để cho phép thả vào khu vực này.\n"
            + "\n"
            + "dragleave: Xảy ra khi phần tử kéo ra khỏi khu vực thả.\n"
            + "\n"
            + "drop: Kích hoạt khi phần tử được thả vào khu vực thả. Đây là sự kiện quan trọng để xử lý hành động khi thả phần tử.",
            "dropzone: Một khu vực cụ thể trên trang mà người dùng có thể thả phần tử vào. Khu vực này có thể được xác định bằng các sự kiện dragover và drop, cho phép thả phần tử vào một vùng cụ thể của trang.",
            "Hỗ Trợ Định Dạng Dữ Liệu: API cho phép bạn thiết lập định dạng dữ liệu khi kéo, chẳng hạn như text/plain, text/html, image/png, hoặc các định dạng khác mà bạn cần trong ứng dụng của mình.",
            "Feedback Trực Quan: API cho phép bạn cung cấp phản hồi trực quan cho người dùng khi họ kéo và thả phần tử, như thay đổi màu sắc của khu vực thả, thêm các hiệu ứng động, hoặc hiển thị thông báo.\n"
            + "\n"
            + "Chế Độ Kéo Đặc Biệt: Bạn có thể tùy chỉnh hành động kéo để chỉ kéo một phần tử hoặc một nhóm phần tử cụ thể. Điều này giúp tạo ra trải nghiệm người dùng mượt mà và dễ sử dụng.",
            "Chuyển Đổi Vị Trí Phần Tử: Bạn có thể thay đổi vị trí của các phần tử trong DOM khi người dùng thả chúng vào một khu vực thả mới. Điều này rất hữu ích cho các ứng dụng như danh sách sắp xếp lại, tạo bảng điều khiển hoặc giao diện quản lý nội dung.",
            "Kéo và Thả Các Đối Tượng Phức Tạp: Bạn có thể kéo các đối tượng phức tạp như hình ảnh, đoạn văn bản hoặc các phần tử HTML khác. Điều này mang lại tính linh hoạt cao trong việc triển khai các tính năng kéo và thả.",
            "Tương Thích Với Nhiều Trình Duyệt: API này được hỗ trợ trên hầu hết các trình duyệt hiện đại như Chrome, Firefox, Safari và Edge, giúp người dùng có trải nghiệm đồng nhất trên nhiều nền tảng.",
            "Kéo Phần Tử",
            "Khu Vực Thả",
            "JavaScript Để Xử Lý Sự Kiện",
            "Cho phép kéo và thả phần tử trong trang web.\n"
            + "\n"
            + "Hỗ trợ lưu trữ và truy xuất dữ liệu kéo và thả thông qua setData() và getData().\n"
            + "\n"
            + "Các sự kiện như dragstart, dragend, drop, giúp theo dõi và xử lý hành động kéo và thả.\n"
            + "\n"
            + "Cung cấp khả năng tạo các khu vực thả (drop zones) và cải thiện trải nghiệm người dùng với phản hồi trực quan.\n"
            + "\n"
            + "Hỗ trợ kéo các phần tử HTML phức tạp và thay đổi vị trí của chúng trong DOM."
        });
        Content_MAP.put("Lợi ích đối với SEO", new String[]{
            "Trải Nghiệm Người Dùng Tốt Hơn: Các tính năng kéo và thả có thể làm cho giao diện người dùng trở nên trực quan và dễ sử dụng hơn. Trải nghiệm người dùng tốt thường dẫn đến thời gian ở lại trang cao hơn và giảm tỷ lệ thoát, cả hai yếu tố này có thể gián tiếp ảnh hưởng đến SEO.\n"
            + "\n"
            + "Tương Tác Mượt Mà: Các trang web sử dụng các tính năng kéo và thả giúp người dùng thao tác nhanh chóng, dễ dàng và thú vị hơn, giúp tạo sự gắn kết với người dùng và khuyến khích họ quay lại trang web.",
            "Tăng Tính Tương Tác: Khi người dùng có thể kéo và thả các phần tử (như trong ứng dụng quản lý hoặc bảng điều khiển), họ có xu hướng tương tác nhiều hơn với trang web. Tính tương tác này có thể giúp giữ chân người dùng lâu hơn trên trang, từ đó giảm tỷ lệ thoát và nâng cao các chỉ số tương tác mà công cụ tìm kiếm đánh giá.\n"
            + "\n"
            + "Quy Trình Đơn Giản Hơn: Khi người dùng có thể thực hiện các tác vụ dễ dàng thông qua các tính năng kéo và thả, điều này có thể giúp họ hoàn thành các mục tiêu trang web nhanh chóng, chẳng hạn như điền vào biểu mẫu, tổ chức nội dung, hoặc sắp xếp các mục. Những trải nghiệm đơn giản và hiệu quả giúp tăng tỷ lệ chuyển đổi và thúc đẩy SEO gián tiếp.",
            "Ứng Dụng Sắp Xếp và Tìm Kiếm: Các trang web có tính năng kéo và thả (như danh sách sản phẩm, thẻ tag, hoặc các mục quản lý khác) giúp người dùng dễ dàng sắp xếp và tìm kiếm nội dung. Điều này có thể làm giảm thời gian người dùng tìm kiếm thông tin, cải thiện hiệu quả sử dụng trang và có thể gián tiếp nâng cao trải nghiệm của người dùng, từ đó gián tiếp giúp SEO.\n"
            + "\n"
            + "Sắp Xếp Nội Dung Dễ Dàng: Nếu trang web có tính năng kéo và thả để người dùng sắp xếp các mục (ví dụ: bảng điều khiển hoặc danh sách bài viết), việc tạo ra một giao diện dễ dàng và thuận tiện giúp người dùng tìm thấy nội dung họ muốn một cách nhanh chóng và dễ dàng. Điều này giữ người dùng ở lại lâu hơn, điều này có thể tác động tích cực đến xếp hạng SEO.",
            "Nâng Cao Chia Sẻ Xã Hội: Các tính năng kéo và thả, ví dụ như kéo hình ảnh hoặc văn bản để chia sẻ lên các nền tảng mạng xã hội, có thể khuyến khích người dùng chia sẻ nội dung. Khi nội dung của bạn được chia sẻ trên các nền tảng xã hội, điều này có thể gián tiếp giúp cải thiện thứ hạng SEO thông qua tăng lượng truy cập và tín hiệu xã hội.",
            "Tạo Nội Dung Linh Hoạt: Các công cụ kéo và thả có thể giúp bạn dễ dàng quản lý và tổ chức nội dung trang web. Ví dụ, trong các hệ thống quản lý nội dung (CMS) với tính năng kéo và thả, bạn có thể nhanh chóng thay đổi bố cục trang mà không cần phải lập trình lại mã nguồn. Điều này giúp duy trì nội dung trang web luôn mới mẻ, hấp dẫn và tối ưu cho SEO.",
            "Tính Năng Kéo và Thả Trên Thiết Bị Di Động: Các tính năng kéo và thả cũng có thể được tối ưu hóa cho thiết bị di động. Trải nghiệm người dùng trên thiết bị di động ngày càng trở nên quan trọng đối với SEO, vì Google ưu tiên các trang web thân thiện với thiết bị di động. Khi bạn áp dụng tính năng kéo và thả cho giao diện di động, bạn cải thiện tính tương tác và tối ưu hóa cho trải nghiệm di động, từ đó giúp cải thiện thứ hạng tìm kiếm.",
            "Tóm lại, Drag & Drop API không trực tiếp ảnh hưởng đến các yếu tố xếp hạng SEO như từ khóa, tốc độ tải trang hay liên kết, nhưng nó có thể gián tiếp cải thiện SEO thông qua việc nâng cao trải nghiệm người dùng, tăng sự tương tác và giữ người dùng lâu hơn trên trang, giúp giảm tỷ lệ thoát và cải thiện các chỉ số tương tác. Khi người dùng có trải nghiệm tốt hơn, họ có xu hướng quay lại và chia sẻ trang web, từ đó hỗ trợ SEO tốt hơn."
        });
        //CSS Cơ Bản
        Content_MAP.put("Inline CSS", new String[]{
            "Inline CSS (CSS nội dòng) là cách bạn thêm trực tiếp các thuộc tính CSS ngay trong thẻ HTML, thông qua thuộc tính style.\n"
            + "Điều này giúp bạn thay đổi giao diện của một phần tử HTML cụ thể nhanh chóng mà không cần viết CSS ở nơi khác.",
            "Trong đó:\n"
            + "\n"
            + "element là tên thẻ HTML (như div, p, h1, a, v.v...)\n"
            + "\n"
            + "property là tên thuộc tính CSS (như color, font-size, background-color,...)\n"
            + "\n"
            + "value là giá trị mà bạn muốn áp dụng cho thuộc tính đó",
            "✅ Nhanh chóng: Dễ dàng chỉnh sửa, test nhanh 1 phần tử nhỏ.\n"
            + "\n"
            + "✅ Không cần file ngoài: Không cần tạo thêm file .css, tiện cho những trang nhỏ.\n"
            + "\n"
            + "✅ Ưu tiên cao: Trong hệ thống CSS, inline có độ ưu tiên cao hơn CSS ngoài file (external) và CSS bên trong thẻ <style> (internal).",
            "❌ Khó bảo trì: Nếu trang có nhiều thẻ HTML, việc sửa từng style riêng lẻ sẽ rất cực.\n"
            + "\n"
            + "❌ Không tách biệt nội dung và trình bày: Một trong những nguyên tắc cơ bản khi viết web hiện đại là tách HTML (nội dung) và CSS (trình bày) riêng biệt.\n"
            + "\n"
            + "❌ Mất tính tái sử dụng: Bạn không thể áp dụng cùng một style cho nhiều phần tử dễ dàng như khi dùng class.\n"
            + "",
            "Khi bạn chỉ cần style nhanh cho một vài phần tử đơn giản.\n"
            + "\n"
            + "Khi viết email HTML (nhiều trình duyệt email chỉ hỗ trợ inline CSS).\n"
            + "\n"
            + "Khi bạn muốn override (ghi đè) nhanh style từ file CSS ngoài (nhưng nên hạn chế!)."
        });
        Content_MAP.put("Internal CSS", new String[]{
            "Internal CSS (CSS nội bộ) là cách bạn viết các quy tắc CSS bên trong thẻ <style>, nằm trong phần <head> của tài liệu HTML.\n"
            + "Nó giúp bạn định dạng cho toàn bộ trang web, không cần viết từng style ngay trong thẻ HTML như với Inline CSS.",
            "selector: bộ chọn (ví dụ: p, h1, .class, #id, v.v.)\n"
            + "\n"
            + "property: thuộc tính CSS (ví dụ: color, font-size, margin, v.v.)\n"
            + "\n"
            + "value: giá trị cho thuộc tính",
            "✅ Dễ quản lý: Viết một chỗ cho toàn bộ trang, dễ chỉnh sửa hơn inline CSS.\n"
            + "\n"
            + "✅ Không cần file ngoài: Tiện lợi nếu bạn chỉ làm 1 trang nhỏ, không phải load thêm file .css.\n"
            + "\n"
            + "✅ Có thể sử dụng bộ chọn (selectors) như class, id, element dễ dàng.",
            "❌ Không tái sử dụng giữa nhiều trang: Nếu website có nhiều trang HTML, mỗi trang phải copy lại phần <style>, gây dư thừa.\n"
            + "\n"
            + "❌ Tăng kích thước file HTML: Nếu style nhiều, file HTML sẽ to ra, ảnh hưởng tốc độ tải trang.",
            "Khi làm một trang web đơn giản, không cần nhiều trang con.\n"
            + "\n"
            + "Khi cần test nhanh style trong giai đoạn phát triển ban đầu.\n"
            + "\n"
            + "Khi làm bài tập nhỏ hoặc demo, không cần tối ưu hóa nhiều."
        });
        Content_MAP.put("External CSS", new String[]{
            "External CSS là cách bạn viết các quy tắc CSS trong một file riêng biệt có đuôi .css, rồi liên kết nó với trang HTML thông qua thẻ <link> trong phần <head>.\n"
            + "\n"
            + "Việc này giúp bạn tách biệt hoàn toàn phần nội dung (HTML) và phần trình bày (CSS) – theo đúng chuẩn thiết kế web hiện đại.",
            "1. File HTML:",
            "2. File CSS (ví dụ: styles.css):",
            "Tái sử dụng dễ dàng: Bạn có thể dùng chung 1 file .css cho nhiều trang HTML.\n"
            + "\n"
            + "Giữ cho HTML gọn gàng: Không lộn xộn với các đoạn style.\n"
            + "\n"
            + "Dễ bảo trì, dễ đọc: Khi cần sửa style, chỉ cần vào file CSS.\n"
            + "\n"
            + "Tăng hiệu suất tải trang (vì CSS có thể được cache – lưu tạm trên trình duyệt).",
            "Cần tải thêm 1 file .css, nên trang có thể chậm nếu mạng yếu (nhưng thường không đáng kể).\n"
            + "\n"
            + "Không phù hợp cho những demo nhỏ hoặc test nhanh.",
            "Khi bạn làm dự án website nhiều trang, hoặc bất kỳ dự án web thực tế nào.\n"
            + "\n"
            + "Khi bạn muốn code sạch, dễ đọc, dễ bảo trì.\n"
            + "\n"
            + "Khi bạn làm nhóm/team – dễ chia CSS ra cho các thành viên quản lý.\n"
            + "",
            "📁 File HTML: index.html",
            "📁 File CSS: style.css"
        });
        Content_MAP.put("CSS sử dụng cú pháp gì?", new String[]{
            "Cấu trúc chung:",
            "Selector (Bộ chọn): Xác định phần tử HTML mà bạn muốn áp dụng kiểu dáng.\n"
            + "\n"
            + "Property (Thuộc tính): Tên thuộc tính bạn muốn thay đổi (ví dụ: color, font-size, margin...).\n"
            + "\n"
            + "Value (Giá trị): Giá trị gán cho thuộc tính đó (ví dụ: red, 16px, 10px...).\n"
            + "\n"
            + "Ví dụ:",
            "=> Tất cả các thẻ <p> sẽ có chữ màu đỏ và cỡ chữ 16px.",
            "Selector theo thẻ: Chọn theo tên thẻ HTML.",
            "Selector theo class: Chọn theo thuộc tính class.\n"
            + "\n"
            + "css\n"
            + "Copy code",
            "Selector theo id: Chọn theo thuộc tính id.",
            "Selector nhóm (Group selector): Chọn nhiều phần tử cùng lúc.",
            "Selector tổ hợp (Combinators): Chọn các phần tử dựa trên quan hệ giữa chúng. Ví dụ:\n"
            + "\n"
            + "css\n"
            + "Copy code",
            "CSS cho phép viết chú thích để ghi chú lại code:"
        });
        Content_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new String[]{
            "Bộ chọn (selector) là phần xác định phần tử HTML nào sẽ bị ảnh hưởng bởi quy tắc CSS. Các loại bộ chọn phổ biến gồm:\n"
            + "\n"
            + "Bộ chọn thẻ (Element Selector): Áp dụng cho tất cả các phần tử HTML cùng loại.",
            "Tất cả các thẻ <p> trong trang sẽ có màu chữ xanh.\n"
            + "\n"
            + "Bộ chọn lớp (Class Selector): Áp dụng cho tất cả các phần tử có cùng class.\n"
            + "\n"
            + "css\n"
            + "Copy code",
            "Tất cả các phần tử có class myClass sẽ có nền màu vàng. Bạn phải thêm class=\"myClass\" trong thẻ HTML.\n"
            + "\n"
            + "Bộ chọn ID (ID Selector): Áp dụng cho phần tử có ID cụ thể.",
            "Phần tử có id=\"myID\" sẽ có chữ màu đỏ. ID là duy nhất trong mỗi trang, nên chỉ có một phần tử sẽ bị ảnh hưởng.\n"
            + "\n"
            + "Bộ chọn toàn bộ phần tử (Universal Selector): Áp dụng cho tất cả các phần tử trên trang.",
            "Quy tắc này sẽ loại bỏ margin của tất cả các phần tử.\n"
            + "\n"
            + "Bộ chọn con (Descendant Selector): Áp dụng cho phần tử con bên trong phần tử cha.",
            "Tất cả các thẻ <p> nằm trong thẻ <div> sẽ có cỡ chữ là 18px.",
            "Một quy tắc CSS có thể có một hoặc nhiều khai báo. Mỗi khai báo bao gồm:\n"
            + "\n"
            + "Thuộc tính (Property): Là tên của tính chất muốn áp dụng (ví dụ: color, font-size, background-color, v.v.).\n"
            + "\n"
            + "Giá trị (Value): Là giá trị được gán cho thuộc tính đó (ví dụ: red, 16px, yellow, v.v.).\n"
            + "\n"
            + "Cú pháp của một khai báo CSS là:",
            "Một quy tắc CSS đầy đủ sẽ có bộ chọn và các khai báo được bọc trong dấu ngoặc nhọn {}. Mỗi khai báo trong phần khai báo phải kết thúc bằng dấu chấm phẩy ; (dấu phẩy cuối cùng có thể bỏ qua trong một số trường hợp).\n"
            + "\n"
            + "Ví dụ quy tắc CSS cơ bản:",
            "Selector: h1 → Áp dụng cho tất cả các thẻ <h1>.\n"
            + "\n"
            + "Declarations:\n"
            + "\n"
            + "color: green; → Màu chữ là xanh lá.\n"
            + "\n"
            + "font-size: 24px; → Cỡ chữ là 24px.\n"
            + "\n"
            + "font-weight: bold; → Chữ đậm.",
            "Ngoài các bộ chọn cơ bản, CSS còn hỗ trợ các bộ chọn nâng cao để kiểm soát chính xác hơn các phần tử mà bạn muốn áp dụng các quy tắc. Một số bộ chọn nâng cao:\n"
            + "\n"
            + "Bộ chọn con trực tiếp (Child Selector): Áp dụng cho phần tử con trực tiếp của một phần tử cha.",
            "Áp dụng cho tất cả các thẻ <p> là con trực tiếp của thẻ <div>.\n"
            + "\n"
            + "Bộ chọn lớp đa lớp (Multiple Class Selector): Áp dụng cho các phần tử có nhiều lớp.",
            "Áp dụng cho phần tử có cả class1 và class2.\n"
            + "\n"
            + "Bộ chọn con sau (Adjacent Sibling Selector): Áp dụng cho phần tử liền kề với phần tử trước nó.",
            "Áp dụng cho thẻ <p> ngay sau thẻ <h1>.\n"
            + "\n"
            + "Bộ chọn giả (Pseudo-class Selector): Áp dụng cho trạng thái đặc biệt của phần tử (ví dụ: khi phần tử được hover).",
            "Khi người dùng di chuột qua một liên kết (<a>), màu chữ sẽ chuyển thành đỏ.\n"
            + "\n"
            + "Bộ chọn giả lớp (Pseudo-element Selector): Áp dụng cho một phần tử ảo, ví dụ như đầu hoặc cuối của một phần tử.",
            "Thay đổi cỡ chữ của chữ cái đầu tiên trong thẻ <p>.",
            "Khai báo không được thiếu dấu chấm phẩy (;): Trong một số trường hợp, CSS vẫn hoạt động nếu thiếu dấu chấm phẩy sau khai báo cuối cùng trong một block, nhưng để đảm bảo tính tương thích, bạn nên sử dụng dấu chấm phẩy sau mỗi khai báo.\n"
            + "\n"
            + "Phân biệt giữa id và class: ID nên được sử dụng duy nhất cho mỗi phần tử trong trang, trong khi class có thể áp dụng cho nhiều phần tử.\n"
            + "\n"
            + "Tính kế thừa: Các thuộc tính như màu chữ, font, và dòng chữ có thể được kế thừa từ phần tử cha xuống phần tử con. Tuy nhiên, các thuộc tính như chiều rộng (width), chiều cao (height) và lề (margin) không được kế thừa.",
            "Một quy tắc CSS bao gồm:\n"
            + "\n"
            + "Selector: Để chỉ định phần tử nào trong HTML sẽ được áp dụng quy tắc.\n"
            + "\n"
            + "Declaration block: Một hoặc nhiều thuộc tính và giá trị, giúp thay đổi kiểu của phần tử.\n"
            + "\n"
            + "Ví dụ đầy đủ:"
        });
        Content_MAP.put("Các kiểu Selector trong CSS", new String[]{
            "Mô tả: Selector này áp dụng cho tất cả các phần tử HTML trong trang web. Đây là một cách nhanh chóng để áp dụng cùng một kiểu cho mọi phần tử mà không cần phải chỉ định từng phần tử cụ thể.\n"
            + "\n"
            + "Cách sử dụng: Sử dụng dấu sao * để chọn tất cả các phần tử.",
            "Mô tả: Selector này dùng để chọn các phần tử có một hoặc nhiều lớp (class) nhất định. Lớp được chỉ định với dấu chấm (.) theo sau là tên lớp.\n"
            + "\n"
            + "Cách sử dụng: Áp dụng cho mọi phần tử có lớp cụ thể.",
            "Mô tả: ID selector chọn các phần tử có một ID cụ thể. ID là duy nhất trong mỗi trang web, nên chỉ có thể áp dụng cho một phần tử duy nhất.\n"
            + "\n"
            + "Cách sử dụng: Sử dụng dấu # theo sau là tên ID của phần tử.",
            "Mô tả: Selector này áp dụng cho các phần tử theo loại (element type). Ví dụ, nếu bạn muốn áp dụng kiểu cho tất cả các thẻ <p>, bạn có thể sử dụng selector này.\n"
            + "\n"
            + "Cách sử dụng: Chỉ định tên phần tử (element) mà bạn muốn áp dụng kiểu.",
            "Mô tả: Pseudo-classes giúp bạn chọn các phần tử dựa trên trạng thái đặc biệt của chúng.\n"
            + "\n"
            + ":hover: Áp dụng khi người dùng di chuột qua phần tử.\n"
            + "\n"
            + ":focus: Áp dụng khi phần tử có tiêu điểm, như ô nhập liệu khi người dùng nhấn vào.\n"
            + "\n"
            + ":nth-child(n): Áp dụng cho phần tử con dựa trên vị trí của nó trong cha.\n"
            + "\n"
            + "Cách sử dụng:",
            "Universal Selector (*): Áp dụng cho tất cả các phần tử.\n"
            + "\n"
            + "Class Selector (.): Áp dụng cho các phần tử có lớp nhất định.\n"
            + "\n"
            + "ID Selector (#): Áp dụng cho phần tử có ID cụ thể.\n"
            + "\n"
            + "Element Selector (Type Selector): Áp dụng cho các phần tử theo loại (thẻ).\n"
            + "\n"
            + "Pseudo-class Selector (:hover, :focus, :nth-child()): Áp dụng cho phần tử khi chúng ở trạng thái đặc biệt."
        });
        Content_MAP.put("Tag Selector", new String[]{
            "Tag Selector (hay còn gọi là Element Selector) trong CSS là một kiểu selector dùng để áp dụng kiểu dáng cho tất cả các phần tử HTML thuộc một loại hoặc một thẻ cụ thể.",
            "Tag Selector chọn tất cả các phần tử của một loại thẻ HTML trong tài liệu. Khi bạn sử dụng selector này, tất cả các phần tử của thẻ được chỉ định sẽ được áp dụng các quy tắc CSS mà bạn đã định nghĩa.",
            "Để sử dụng Tag Selector, bạn chỉ cần viết tên thẻ HTML mà bạn muốn chọn mà không cần dấu chấm (.) hay dấu #.",
            "Chọn tất cả các thẻ <p>:\n"
            + "\n"
            + "Áp dụng một kiểu cho tất cả các đoạn văn trong trang.",
            "Chọn tất cả các thẻ <h1>:\n"
            + "\n"
            + "Áp dụng kiểu cho tất cả các tiêu đề cấp 1",
            "Chọn tất cả các thẻ <a>:\n"
            + "\n"
            + "Áp dụng kiểu cho tất cả các liên kết.",
            "Chọn tất cả các thẻ <div>:\n"
            + "\n"
            + "Áp dụng kiểu cho tất cả các thẻ <div>",
            "Dễ sử dụng: Không cần phải thêm bất kỳ lớp (class) hay ID, chỉ cần dùng tên thẻ.\n"
            + "\n"
            + "Áp dụng rộng rãi: Khi bạn muốn áp dụng kiểu cho tất cả các phần tử của một loại thẻ, Tag Selector rất tiện lợi.",
            "Không cụ thể: Nó có thể áp dụng cho quá nhiều phần tử trên trang web, dẫn đến việc khó kiểm soát khi có nhiều phần tử giống nhau mà bạn muốn có kiểu dáng khác nhau.\n"
            + "\n"
            + "Không linh hoạt: Nếu bạn cần áp dụng kiểu cho một nhóm phần tử riêng biệt, việc chỉ sử dụng Tag Selector có thể không đủ chính xác. Bạn sẽ cần sử dụng class hoặc ID selectors để phân biệt các phần tử.",
            "Tag Selector là một công cụ rất hữu ích trong CSS khi bạn muốn áp dụng kiểu dáng cho tất cả các phần tử của một loại thẻ cụ thể. Tuy nhiên, nếu bạn cần kiểm soát chi tiết hơn, có thể kết hợp thêm với các selector khác như Class Selector hoặc ID Selector."
        });
        Content_MAP.put("Class Selector", new String[]{
            "Class Selector trong CSS là một kiểu selector cho phép bạn áp dụng kiểu dáng cho một hoặc nhiều phần tử HTML dựa trên giá trị của thuộc tính class.",
            "Class Selector chọn tất cả các phần tử HTML có cùng một tên lớp (class).\n"
            + "\n"
            + "Rất linh hoạt vì bạn có thể áp dụng cùng một kiểu cho nhiều loại thẻ khác nhau chỉ bằng cách thêm cùng một lớp.\n"
            + "\n"
            + "Trong CSS, để viết một Class Selector, bạn thêm dấu . trước tên class.",
            "Các phần tử có class=\"tieu-de\" sẽ có chữ màu xanh đậm và kích cỡ chữ là 24px.",
            "Cả <h1> và <p> đều được áp dụng cùng kiểu.",
            "Một phần tử có thể có nhiều class cùng lúc, ngăn cách bởi dấu cách",
            "Bạn có thể kết hợp class selector với tên thẻ để cụ thể hơn:",
            "Chỉ các thẻ <p> có class tieu-de mới được áp dụng.",
            "Tính tái sử dụng cao: Một class có thể gán cho nhiều phần tử khác nhau.\n"
            + "\n"
            + "Dễ tổ chức CSS: Bạn dễ dàng kiểm soát nhóm các phần tử có vai trò hoặc kiểu dáng tương tự.\n"
            + "\n"
            + "Linh hoạt: Không bị giới hạn trong một loại thẻ cụ thể.",
            "Nếu không quản lý tốt, việc gán quá nhiều class hoặc đặt tên class khó hiểu có thể khiến CSS trở nên lộn xộn.",
            "Cả <button> và <a> đều trông giống như nút bấm.",
            "Class Selector giúp bạn kiểm soát chính xác và tái sử dụng kiểu dáng cho nhiều phần tử khác nhau. Đây là một trong những công cụ mạnh mẽ nhất trong CSS để thiết kế web linh hoạt, sạch sẽ, dễ bảo trì."
        });
        Content_MAP.put("ID Selector", new String[]{
            "ID Selector trong CSS là một kiểu selector dùng để áp dụng kiểu dáng cho một phần tử HTML duy nhất, thông qua thuộc tính id.",
            "Mỗi phần tử HTML có thể có một thuộc tính id duy nhất trong toàn bộ trang.\n"
            + "\n"
            + "ID Selector trong CSS được xác định bằng dấu # trước tên id.",
            "CSS:",
            "HTML:",
            "Khi trình duyệt đọc đến đoạn trên, nó sẽ áp dụng kiểu CSS cho thẻ <h1> có id là tieu-de-chinh.",
            "Dễ nhận biết và dùng cho một phần tử cụ thể, giúp bạn kiểm soát tốt các vùng quan trọng như: header, footer, main content,...\n"
            + "\n"
            + "Được sử dụng phổ biến khi cần tùy chỉnh đặc biệt cho một phần tử duy nhất.",
            "Một id chỉ nên xuất hiện một lần trong một trang HTML.\n"
            + "\n"
            + "Không nên lạm dụng ID để tạo kiểu CSS cho nhiều phần tử — dùng class sẽ linh hoạt hơn trong các trường hợp đó.",
            "ID cũng được dùng nhiều trong JavaScript để chọn phần tử nhanh chóng:"
        });
        Content_MAP.put("Attribute Selector", new String[]{
            "Đây là loại selector cho phép bạn chọn các phần tử HTML dựa trên thuộc tính (attribute) và giá trị của thuộc tính đó.\n"
            + "\n"
            + "Dùng khi bạn muốn styling các phần tử có đặc điểm riêng biệt mà không cần thêm class hay id.",
            "Chỉ cần thuộc tính:",
            "Thuộc tính có giá trị cụ thể:",
            "Các biến thể khác:\n"
            + "\n"
            + "[attr^=\"giá trị\"]: Bắt đầu bằng\n"
            + "\n"
            + "[attr$=\"giá trị\"]: Kết thúc bằng\n"
            + "\n"
            + "[attr*=\"giá trị\"]: Chứa giá trị",
            "Chọn input có thuộc tính required:",
            "Chọn link mở tab mới:",
            "Chọn ảnh kết thúc bằng .jpg:",
            "Chọn phần tử có tiêu đề chứa từ \"hot\":",
            "Cực kỳ linh hoạt: Không cần chỉnh HTML thêm class/id.\n"
            + "\n"
            + "Viết CSS gọn gàng: Dễ áp dụng với nhiều loại phần tử có thuộc tính chung.\n"
            + "\n"
            + "Tương thích tốt với nhiều trình duyệt hiện đại.",
            "Nếu quá lạm dụng Attribute Selector trên trang lớn, có thể gây giảm hiệu suất do phải quét nhiều phần tử.\n"
            + "\n"
            + "Nên ưu tiên dùng cho các mục tiêu cụ thể hoặc kết hợp thêm với class nếu cần tối ưu hơn.\n"
            + ""
        });
        Content_MAP.put("Đơn vị tuyệt đối", new String[]{
            "Đơn vị tuyệt đối là những đơn vị đo có giá trị cố định, không thay đổi theo ngữ cảnh (ví dụ như kích thước màn hình, độ phân giải...).\n"
            + "\n"
            + "Bất kể trình duyệt, thiết bị to nhỏ thế nào, giá trị của đơn vị tuyệt đối vẫn giữ nguyên.",
            "px (pixel):\n"
            + "→ Đơn vị phổ biến nhất.\n"
            + "→ 1px tương đương với 1 điểm ảnh trên màn hình (theo cách hiểu đơn giản).\n"
            + "\n"
            + "pt (point):\n"
            + "→ Thường dùng trong in ấn.\n"
            + "→ 1pt = 1/72 inch.\n"
            + "\n"
            + "cm (centimeter):\n"
            + "→ 1cm là đúng 1 centimet thực tế.\n"
            + "\n"
            + "mm (millimeter):\n"
            + "→ 1mm bằng 1/10 của centimet.\n"
            + "\n"
            + "in (inch):\n"
            + "→ 1in = 2.54cm = 96px trên màn hình chuẩn.",
            "Khi bạn muốn kích thước cố định bất kể màn hình to nhỏ.\n"
            + "\n"
            + "Phù hợp cho thiết kế in ấn, PDF, hoặc layout yêu cầu chính xác tuyệt đối.\n"
            + "\n"
            + "Ví dụ khi làm namecard, tài liệu in, hoặc khi bạn muốn nút bấm/khung hình phải đúng 200px, không co giãn.",
            "Dễ kiểm soát: Bạn biết chính xác kích thước phần tử.\n"
            + "\n"
            + "Ổn định: Không bị thay đổi theo môi trường hay thiết bị.",
            "Kém linh hoạt:\n"
            + "→ Trên màn hình nhỏ (như điện thoại), phần tử có thể bị to quá hoặc nhỏ quá.\n"
            + "\n"
            + "Không tối ưu cho responsive web:\n"
            + "→ Khi làm web hiện đại, thường sẽ ưu tiên đơn vị tương đối (%, em, rem) hơn.",
            ".box sẽ luôn có chiều rộng 300px và cao 150px, bất kể điện thoại, máy tính bảng hay PC."
        });
        Content_MAP.put("Đơn vị tương đối", new String[]{
            "Đơn vị tương đối là những đơn vị đo phụ thuộc vào kích thước của thành phần khác (ví dụ: kích thước font cha, kích thước viewport...).\n"
            + "\n"
            + "Giá trị có thể thay đổi tùy thuộc vào môi trường, thiết bị và cấu trúc bố cục.",
            "🔹 %\n"
            + "Phần trăm so với phần tử cha.\n"
            + "\n"
            + "Ví dụ: width: 50% sẽ lấy một nửa chiều rộng của thành phần chứa nó.",
            "=> .container sẽ rộng bằng 80% của phần tử cha.",
            "🔹 em\n"
            + "Dựa trên kích thước font của phần tử cha.\n"
            + "\n"
            + "1em = 100% kích thước chữ của cha.",
            "=> Nếu font-size của cha là 16px, thì .text sẽ có 32px.",
            "🔹 rem (root em)\n"
            + "Dựa trên kích thước font của html (gốc trang).\n"
            + "\n"
            + "Không bị ảnh hưởng bởi cấp cha gần nhất như em.",
            "=> .title sẽ có 32px, luôn chuẩn xác, không phụ thuộc vào cha.",
            "🔹 vw (viewport width)\n"
            + "1vw = 1% chiều rộng của cửa sổ trình duyệt.\n"
            + "\n"
            + "Dùng để làm giao diện tự co dãn theo màn hình.",
            "=> .banner sẽ chiếm 80% chiều rộng cửa sổ.",
            "🔹 vh (viewport height)\n"
            + "1vh = 1% chiều cao của cửa sổ trình duyệt.\n"
            + "\n"
            + "Thường dùng cho các bố cục toàn màn hình (full height).",
            "=> .hero sẽ cao đúng bằng 100% chiều cao màn hình.",
            "Responsive dễ dàng: Tự động co giãn theo thiết bị.\n"
            + "\n"
            + "Thân thiện với SEO: Giúp web load đẹp trên mọi kích thước màn hình.\n"
            + "\n"
            + "Hiện đại: Giao diện mượt mà, dễ đọc hơn trên điện thoại, tablet.",
            "Cần tính toán kỹ: Đặc biệt khi lồng nhiều em, % dễ bị chồng giá trị.\n"
            + "\n"
            + "Có thể bất ổn nếu không set kích thước cha hợp lý.\n"
            + "",
            ".content sẽ:\n"
            + "\n"
            + "Rộng 90% so với cha.\n"
            + "\n"
            + "Font chữ là 24px.\n"
            + "\n"
            + "Padding (khoảng cách trong) chiếm 5% chiều rộng màn hình."
        });
        Content_MAP.put("Cấu trúc Box Model", new String[]{
            "Box Model là cách mà CSS định nghĩa và tính toán kích thước cho mỗi phần tử HTML trên trang web.\n"
            + "\n"
            + "Mỗi phần tử sẽ được coi như một hộp (box) gồm nhiều lớp xếp chồng lên nhau.\n"
            + "\n"
            + "Việc hiểu đúng Box Model cực kỳ quan trọng để căn chỉnh giao diện chính xác!",
            "Content (Nội dung)\n"
            + "Đây là phần chứa nội dung chính như văn bản, hình ảnh, video...\n"
            + "\n"
            + "Kích thước của content được xác định bằng width và height",
            "🔹 Padding (Khoảng đệm)\n"
            + "Khoảng cách giữa nội dung và viền (border).\n"
            + "\n"
            + "Làm cho nội dung không bị sát mép với viền.\n"
            + "\n"
            + "Padding không có màu riêng, nó sẽ ăn theo màu nền (background) của phần tử.",
            "🔹 Border (Viền)\n"
            + "Viền bao quanh padding và content.\n"
            + "\n"
            + "Có thể chỉnh độ dày, màu sắc, kiểu viền (solid, dashed, dotted...).",
            "🔹 Margin (Lề ngoài)\n"
            + "Khoảng cách giữa phần tử đó với phần tử khác xung quanh.\n"
            + "\n"
            + "Margin có thể gộp (collapse) khi hai phần tử đứng gần nhau.",
            "Theo mặc định (content-box):",
            "Nếu dùng box-sizing: border-box:\n"
            + "\n"
            + "width và height sẽ bao gồm luôn padding và border → dễ kiểm soát hơn nhiều!",
            ".box sẽ:\n"
            + "\n"
            + "Tổng chiều rộng vẫn là 300px.\n"
            + "\n"
            + "Tổng chiều cao vẫn là 150px.\n"
            + "\n"
            + "Padding và Border không làm tăng kích thước nhờ border-box."
        });
        Content_MAP.put("Width và Height", new String[]{
            "Width và Height dùng để xác định kích thước vùng nội dung của một phần tử HTML.\n"
            + "\n"
            + "Không tính padding, border và margin (trừ khi dùng box-sizing: border-box).",
            "width: 300px;: chiều rộng là 300px.\n"
            + "\n"
            + "height: 150px;: chiều cao là 150px.",
            "px (pixels): Ví dụ width: 200px; → Đơn vị cố định.\n"
            + "\n"
            + "% (phần trăm): Ví dụ width: 50%; → Theo phần trăm phần tử cha.\n"
            + "\n"
            + "vw / vh (viewport width/height): Ví dụ width: 100vw; → Theo kích thước trình duyệt.\n"
            + "\n"
            + "em / rem: Ví dụ width: 10em; → Theo font-size hiện tại.",
            "auto: Kích thước tự động dựa trên nội dung hoặc thẻ cha.\n"
            + "\n"
            + "inherit: Kế thừa kích thước từ phần tử cha.\n"
            + "\n"
            + "initial: Trở về giá trị mặc định ban đầu.\n"
            + "\n"
            + "max-width / min-width: Giới hạn tối đa / tối thiểu cho chiều rộng.\n"
            + "\n"
            + "max-height / min-height: Giới hạn tối đa / tối thiểu cho chiều cao.",
            ".container:\n"
            + "\n"
            + "Chiếm 80% chiều rộng thẻ cha.\n"
            + "\n"
            + "Không vượt quá 1200px.\n"
            + "\n"
            + "Không nhỏ hơn 320px.\n"
            + "\n"
            + "Chiều cao tự động theo nội dung.\n"
            + "",
            "Mặc định: width và height chỉ áp dụng cho vùng nội dung.\n"
            + "\n"
            + "Khi dùng box-sizing: border-box: width và height sẽ bao gồm luôn padding và border, dễ căn chỉnh hơn.",
            "width và height giúp xác định kích thước phần tử.\n"
            + "\n"
            + "Có thể dùng px, %, vw, vh, em, rem.\n"
            + "\n"
            + "Giá trị đặc biệt như auto, inherit, initial, max-width, min-width, max-height, min-height giúp linh hoạt hơn.\n"
            + "\n"
            + "Nên cân nhắc box-sizing: border-box để dễ quản lý kích thước."
        });
        Content_MAP.put("max-width và min-width", new String[]{
            "max-width: Giới hạn chiều rộng tối đa của một phần tử. Phần tử sẽ không vượt quá giá trị max-width dù có nội dung lớn hơn.\n"
            + "\n"
            + "max-height: Giới hạn chiều cao tối đa của phần tử. Dù nội dung có nhiều hơn, phần tử sẽ không cao hơn giá trị max-height.\n"
            + "\n"
            + "Ví dụ:",
            ".box sẽ không bao giờ vượt quá 300px chiều rộng và 250px chiều cao, mặc dù width và height đã được set lớn hơn.",
            "min-width: Xác định chiều rộng tối thiểu của phần tử. Phần tử sẽ không bao giờ có chiều rộng nhỏ hơn giá trị min-width dù có nội dung nhỏ hơn.\n"
            + "\n"
            + "min-height: Xác định chiều cao tối thiểu của phần tử. Phần tử sẽ không có chiều cao nhỏ hơn min-height, dù nội dung có ít hay không có gì.\n"
            + "\n"
            + "Ví dụ:",
            ".box sẽ luôn luôn có chiều rộng ít nhất là 600px và chiều cao ít nhất là 500px, mặc dù width và height đã được set nhỏ hơn.",
            "Khi dùng max-width / min-width / max-height / min-height với %: Giá trị này sẽ dựa vào phần tử cha. Ví dụ, nếu bạn đặt max-width: 100%, phần tử sẽ không thể rộng hơn 100% chiều rộng của phần tử chứa nó.\n"
            + "\n"
            + "Ví dụ với %:",
            ".container sẽ chiếm tối đa 90% chiều rộng của phần tử cha dù cha có rộng hơn.",
            "Linh hoạt: Bạn có thể tạo giao diện responsive dễ dàng mà không lo phần tử quá lớn hoặc quá nhỏ.\n"
            + "\n"
            + "Kiểm soát chính xác kích thước: Dễ dàng giới hạn kích thước của phần tử, tránh cho nó bị \"phình to\" hoặc bị \"hẹp quá\".",
            "Không linh hoạt khi thiết kế cố định: Đôi khi, việc giới hạn chiều rộng hoặc chiều cao có thể khiến phần tử không còn hiển thị đúng như mong muốn trong một số trường hợp.",
            ".box sẽ:\n"
            + "\n"
            + "Chiếm 80% chiều rộng phần tử cha, nhưng không quá 1200px và không nhỏ hơn 300px.\n"
            + "\n"
            + "Chiều cao 50% chiều cao cửa sổ (viewport), nhưng không vượt quá 600px và không thấp hơn 200px.",
            "max-width / max-height: Giới hạn kích thước tối đa của phần tử.\n"
            + "\n"
            + "min-width / min-height: Giới hạn kích thước tối thiểu của phần tử.\n"
            + "\n"
            + "Có thể sử dụng đơn vị % để tính theo phần tử cha hoặc viewport.\n"
            + "\n"
            + "Hỗ trợ responsive design rất tốt."
        });
        Content_MAP.put("Các loại position chính", new String[]{
            "Mặc định cho tất cả các phần tử HTML.\n"
            + "\n"
            + "Phần tử sẽ xuất hiện theo dòng chảy bình thường của trang.\n"
            + "\n"
            + "Các thuộc tính như top, right, bottom, left không có tác dụng.\n"
            + "\n"
            + "Ví dụ:",
            "✅ Ưu điểm: Dễ kiểm soát với bố cục cơ bản.\n"
            + "⚠️ Nhược điểm: Không di chuyển tự do được.",
            "Phần tử được định vị tương đối với vị trí ban đầu của nó.\n"
            + "\n"
            + "Bạn có thể dùng top, right, bottom, left để dịch chuyển nhẹ phần tử mà không làm ảnh hưởng đến dòng chảy tài liệu.\n"
            + "\n"
            + "Ví dụ:",
            "📌 Ghi nhớ: Khi dùng relative, phần tử vẫn chiếm chỗ cũ trong layout gốc.",
            "Phần tử được loại ra khỏi dòng chảy bình thường.\n"
            + "\n"
            + "Nó được định vị tương đối với tổ tiên gần nhất có position là relative, absolute, fixed hoặc sticky.\n"
            + "\n"
            + "Nếu không có tổ tiên nào như vậy, nó sẽ định vị theo <html> (body).\n"
            + "\n"
            + "Ví dụ:",
            "🧠 Lưu ý: absolute giúp xếp chồng và đặt chính xác phần tử ở bất kỳ đâu bạn muốn.",
            "Phần tử cố định vị trí theo cửa sổ trình duyệt (viewport).\n"
            + "\n"
            + "Khi cuộn trang, phần tử không di chuyển.\n"
            + "\n"
            + "Ví dụ:",
            "📌 Ứng dụng thực tế: Tạo nút quay lại đầu trang, menu cố định, thanh thông báo,...",
            "Là sự kết hợp giữa relative và fixed.\n"
            + "\n"
            + "Phần tử sẽ di chuyển cùng dòng chảy ban đầu (giống relative) và khi cuộn đến một vị trí nhất định, nó sẽ \"dính\" lại (giống fixed).\n"
            + "\n"
            + "Ví dụ:",
            "🧠 Quan trọng: sticky cần phải có container đủ chiều cao thì mới hoạt động tốt!",
            "Static: Theo mặc định.\n"
            + "\n"
            + "Relative: Dịch chuyển so với vị trí gốc.\n"
            + "\n"
            + "Absolute: Định vị tự do, bám theo phần tử cha.\n"
            + "\n"
            + "Fixed: Dính chặt vào màn hình.\n"
            + "\n"
            + "Sticky: Dính lại sau khi scroll."
        });
        Content_MAP.put("Sự khác biệt giữa các kiểu positioning", new String[]{
            "Phần tử nằm yên theo dòng chảy tự nhiên của HTML.\n"
            + "\n"
            + "Không thể chỉnh top, bottom, left, right.\n"
            + "\n"
            + "Không cần viết position: static; vì đây là mặc định.\n"
            + "\n"
            + "📌 Tưởng tượng: Giống như bạn xếp ghế theo hàng ghế sẵn, không thay đổi chỗ.",
            "Phần tử vẫn chiếm chỗ cũ trong layout.\n"
            + "\n"
            + "Có thể dịch chuyển nhẹ so với vị trí ban đầu bằng top, left, bottom, right.\n"
            + "\n"
            + "Thường dùng để tạo điểm gốc cho absolute con bên trong.\n"
            + "\n"
            + "📌 Tưởng tượng: Bạn ngồi xê dịch nhẹ trên ghế nhưng ghế vẫn ở đúng chỗ ban đầu.",
            "Phần tử không còn nằm trong dòng chảy thông thường nữa.\n"
            + "\n"
            + "Được định vị tự do dựa trên phần tử cha gần nhất có position khác static.\n"
            + "\n"
            + "Nếu không tìm được cha nào phù hợp, nó bám theo <html> (viewport).\n"
            + "\n"
            + "📌 Tưởng tượng: Bạn rời khỏi ghế, tự do đứng ở đâu cũng được trong hội trường.",
            "Phần tử gắn cố định vào một vị trí trên màn hình.\n"
            + "\n"
            + "Khi bạn cuộn trang, phần tử này không di chuyển theo.\n"
            + "\n"
            + "📌 Tưởng tượng: Bạn bám chặt vào tường, dù mọi người di chuyển hay không, bạn vẫn đứng nguyên chỗ.",
            "Lúc đầu di chuyển theo dòng chảy như relative.\n"
            + "\n"
            + "Khi cuộn tới ngưỡng nhất định, nó dính lại như fixed.\n"
            + "\n"
            + "Rất hay dùng cho thanh menu, header dính,...\n"
            + "\n"
            + "📌 Tưởng tượng: Bạn đi bộ trong hành lang, nhưng khi đến cửa ra vào, bạn dừng lại đứng yên.",
            "Static: Cố định theo thứ tự HTML.\n"
            + "\n"
            + "Relative: Dịch nhẹ so với vị trí ban đầu.\n"
            + "\n"
            + "Absolute: Tự do định vị theo cha.\n"
            + "\n"
            + "Fixed: Dính vào cửa sổ màn hình.\n"
            + "\n"
            + "Sticky: Dính vào chỗ khi cuộn tới."
        });
        Content_MAP.put("Ứng dụng thực tế của từng loại", new String[]{
            "Ứng dụng:\n"
            + "\n"
            + "Các đoạn văn bản (<p>, <h1>, <ul>, <div>) bình thường.\n"
            + "\n"
            + "Nội dung xếp theo dòng tự nhiên, không cần can thiệp layout.\n"
            + "\n"
            + "🔥 Ví dụ: Các bài viết blog, trang tin tức.",
            "Ứng dụng:\n"
            + "\n"
            + "Hiệu ứng nhỏ: di chuyển nhẹ nút bấm khi hover.\n"
            + "\n"
            + "Làm gốc cha để con absolute bám vào đúng chỗ.\n"
            + "\n"
            + "🔥 Ví dụ:\n"
            + "\n"
            + "Hiển thị tooltip nhỏ bên cạnh nút.\n"
            + "\n"
            + "Icon nhỏ lệch góc trên nút \"Thông báo\".",
            "Ứng dụng:\n"
            + "\n"
            + "Pop-up, menu thả xuống, tooltip.\n"
            + "\n"
            + "Các phần tử cần bay ra khỏi layout bình thường.\n"
            + "\n"
            + "🔥 Ví dụ:\n"
            + "\n"
            + "Menu xổ xuống từ nút hamburger.\n"
            + "\n"
            + "Thẻ nhãn \"SALE\" gắn góc sản phẩm.",
            "Ứng dụng:\n"
            + "\n"
            + "Header cố định, nút gọi hành động (CTA), nút chat luôn hiện dù cuộn.\n"
            + "\n"
            + "Thanh công cụ nhanh.\n"
            + "\n"
            + "🔥 Ví dụ:\n"
            + "\n"
            + "Nút \"Lên đầu trang\" (scroll to top).\n"
            + "\n"
            + "Header web Facebook không biến mất khi cuộn.",
            "Ứng dụng:\n"
            + "\n"
            + "Thanh menu phụ dính khi cuộn tới khu vực nội dung.\n"
            + "\n"
            + "Chữ mục lục bài viết.\n"
            + "\n"
            + "🔥 Ví dụ:\n"
            + "\n"
            + "Các tiêu đề chương sách dính lại khi đọc blog dài.\n"
            + "\n"
            + "Menu con dọc bên trái trên website tài liệu.",
            "Nếu bạn muốn tự do di chuyển → dùng absolute hoặc fixed.\n"
            + "\n"
            + "Nếu chỉ cần dịch nhẹ → dùng relative.\n"
            + "\n"
            + "Nếu muốn dính khi cuộn → dùng sticky.\n"
            + "\n"
            + "Nếu không cần thay đổi → giữ static.\n"
            + ""
        });
        Content_MAP.put("Hệ màu HEX", new String[]{
            "Hệ màu HEX (Hexadecimal) dùng hệ cơ số 16 (từ 0-9 và A-F) để mô tả màu sắc trong HTML, CSS. Một mã HEX bắt đầu bằng dấu # và có 6 ký tự biểu diễn mức độ của ba màu cơ bản: đỏ (Red), xanh lá (Green) và xanh dương (Blue).\n"
            + "\n"
            + "Ví dụ: #FF5733\n"
            + "\n"
            + "FF là đỏ rực rỡ\n"
            + "\n"
            + "57 là xanh lá vừa phải\n"
            + "\n"
            + "33 là xanh dương nhẹ",
            "Mã HEX được chia thành ba cặp ký tự:\n"
            + "\n"
            + "Hai ký tự đầu tiên: cường độ màu đỏ\n"
            + "\n"
            + "Hai ký tự tiếp theo: cường độ màu xanh lá\n"
            + "\n"
            + "Hai ký tự cuối cùng: cường độ màu xanh dương\n"
            + "\n"
            + "Mỗi giá trị nằm trong khoảng từ 00 (0) đến FF (255).",
            "#FFFFFF → màu trắng tinh khiết (cường độ tối đa cho tất cả)\n"
            + "\n"
            + "#000000 → màu đen sâu (không có ánh sáng nào)\n"
            + "\n"
            + "#FF0000 → màu đỏ tươi\n"
            + "\n"
            + "#00FF00 → màu xanh lá tươi\n"
            + "\n"
            + "#0000FF → màu xanh dương tươi",
            "Khi mỗi cặp ký tự giống nhau, có thể viết gọn lại bằng 3 ký tự:\n"
            + "\n"
            + "#FFFFFF → #FFF\n"
            + "\n"
            + "#000000 → #000\n"
            + "\n"
            + "#336699 → #369",
            "Trong thiết kế web, HEX dùng để set màu nền, màu chữ, màu viền.\n"
            + "\n"
            + "Trong branding, HEX giúp định nghĩa màu thương hiệu chính xác tuyệt đối.\n"
            + "\n"
            + "Trong tối ưu hóa UX/UI, việc chọn đúng màu giúp cải thiện cảm xúc người dùng và gián tiếp hỗ trợ SEO.\n"
            + "",
            "✅ HEX là cách định nghĩa màu bằng hệ 16, với ba thành phần đỏ, xanh lá và xanh dương.\n"
            + "✅ Ngắn gọn, dễ dùng và cực kỳ phổ biến trong lập trình web."
        });
        Content_MAP.put("Hệ màu RGB", new String[]{
            "RGB là viết tắt của Red - Green - Blue, tức Đỏ - Xanh lá - Xanh dương.\n"
            + "Đây là hệ màu ánh sáng, hoạt động bằng cách pha trộn ba màu cơ bản với nhau theo các mức độ khác nhau để tạo ra hàng triệu màu sắc khác nhau.\n"
            + "\n"
            + "👉 Mỗi màu cơ bản có giá trị từ:\n"
            + "\n"
            + "0 (không có ánh sáng)\n"
            + "\n"
            + "đến 255 (cường độ ánh sáng cao nhất)\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "rgb(255, 0, 0) → màu đỏ tươi (chỉ có đỏ)\n"
            + "\n"
            + "rgb(0, 255, 0) → màu xanh lá tươi (chỉ có xanh lá)\n"
            + "\n"
            + "rgb(0, 0, 255) → màu xanh dương tươi (chỉ có xanh dương)",
            "Màu trong RGB được tạo bằng công thức:",
            "Trong đó:\n"
            + "\n"
            + "red: mức độ màu đỏ (0–255)\n"
            + "\n"
            + "green: mức độ màu xanh lá (0–255)\n"
            + "\n"
            + "blue: mức độ màu xanh dương (0–255)\n"
            + "\n"
            + "👉 Khi ba giá trị này đều bằng 0, bạn có màu đen: rgb(0,0,0).\n"
            + "👉 Khi ba giá trị đều là 255, bạn có màu trắng: rgb(255,255,255).",
            "Chủ yếu dùng cho màn hình: website, TV, điện thoại, máy tính đều hiển thị màu sắc bằng RGB.\n"
            + "\n"
            + "Dễ tùy chỉnh: có thể pha trộn bất kỳ màu nào bằng cách điều chỉnh ba giá trị.\n"
            + "\n"
            + "Dùng được với độ trong suốt: với rgba(), thêm tham số alpha để kiểm soát độ trong suốt.\n"
            + "\n"
            + "Ví dụ:",
            "Web design: tạo màu nền, màu nút bấm, màu chữ.\n"
            + "\n"
            + "Thiết kế giao diện: RGB rất linh hoạt để tạo giao diện sinh động, bắt mắt.\n"
            + "\n"
            + "Hiệu ứng động: chuyển đổi màu sắc mượt mà khi hover, animation nhờ dễ điều chỉnh giá trị RGB.",
            "✅ RGB là mô hình pha trộn ánh sáng Đỏ - Xanh lá - Xanh dương để tạo nên các màu sắc.\n"
            + "✅ Dùng phổ biến trên web, thiết kế số và tối ưu cho màn hình điện tử."
        });
        Content_MAP.put("Hệ màu HSL", new String[]{
            "HSL viết tắt của:\n"
            + "\n"
            + "H: Hue (Sắc độ) – màu sắc cơ bản\n"
            + "\n"
            + "S: Saturation (Độ bão hòa) – độ tươi hoặc nhạt của màu\n"
            + "\n"
            + "L: Lightness (Độ sáng) – độ sáng tối của màu\n"
            + "\n"
            + "👉 Hệ màu HSL giúp biểu diễn màu sắc dựa trên cách mắt người cảm nhận, rất直観的 (trực quan) hơn so với RGB.\n"
            + "\n"
            + "Ví dụ:",
            "Hue (Sắc độ):\n"
            + "\n"
            + "Là góc trên vòng tròn màu, từ 0° đến 360°.\n"
            + "\n"
            + "0° → đỏ, 120° → xanh lá, 240° → xanh dương,...\n"
            + "\n"
            + "Saturation (Độ bão hòa):\n"
            + "\n"
            + "0% → màu xám (không có màu)\n"
            + "\n"
            + "100% → màu đậm rực rỡ\n"
            + "\n"
            + "Lightness (Độ sáng):\n"
            + "\n"
            + "0% → màu đen hoàn toàn\n"
            + "\n"
            + "50% → màu gốc chuẩn\n"
            + "\n"
            + "100% → màu trắng\n"
            + "\n"
            + "👉 Nghĩa là bạn có thể điều chỉnh màu đậm nhạt và sáng tối rất dễ dàng mà không cần nhớ các mã phức tạp như HEX hay RGB!",
            "hsl(0, 100%, 50%) → đỏ tươi\n"
            + "\n"
            + "hsl(120, 100%, 50%) → xanh lá tươi\n"
            + "\n"
            + "hsl(240, 100%, 50%) → xanh dương tươi\n"
            + "\n"
            + "hsl(0, 0%, 50%) → màu xám trung tính\n"
            + "",
            "Thiết kế giao diện UI/UX: dễ điều chỉnh sáng/tối để tạo các biến thể màu mà vẫn đồng bộ.\n"
            + "\n"
            + "Tạo hiệu ứng: đổi màu theo lightness giúp làm hiệu ứng hover, active rất tự nhiên.\n"
            + "\n"
            + "Xây dựng theme động: dễ dàng thay đổi sắc độ màu chủ đạo chỉ bằng việc chỉnh hue!\n"
            + "",
            "✅ HSL trực quan, dễ hiểu hơn RGB vì dựa vào sắc độ, độ bão hòa và độ sáng.\n"
            + "✅ Thích hợp để tinh chỉnh màu sắc linh hoạt, đẹp mắt, đặc biệt trong thiết kế web hiện đại."
        });
        Content_MAP.put("Font-family", new String[]{
            "font-family là thuộc tính CSS dùng để xác định kiểu chữ cho nội dung trên website.\n"
            + "Nó ảnh hưởng mạnh đến:\n"
            + "\n"
            + "Thẩm mỹ\n"
            + "\n"
            + "Cảm xúc người dùng\n"
            + "\n"
            + "Khả năng đọc dễ hay khó\n"
            + "\n"
            + "Ví dụ:",
            "Ở đây, trình duyệt sẽ ưu tiên Arial, nếu không có sẽ chọn bất kỳ font sans-serif nào.",
            "Danh sách font: Viết nhiều font, ngăn cách bằng dấu phẩy. Trình duyệt chọn font đầu tiên có sẵn.\n"
            + "\n"
            + "Fallback font: Nếu font chính không khả dụng, trình duyệt dùng nhóm font tổng quát (serif, sans-serif, monospace, cursive, fantasy)",
            "Font nhiều từ phải đặt trong ngoặc kép:",
            "Luôn thêm font dự phòng để tránh lỗi hiển thị.\n"
            + "\n"
            + "Cân nhắc hiệu suất tải trang khi dùng font ngoài (như Google Fonts).",
            "👉 Trình duyệt thử lần lượt Roboto → Helvetica Neue → Arial → sans-serif.\n"
            + "",
            "Arial: Sans-serif cổ điển, dễ đọc.\n"
            + "\n"
            + "Times New Roman: Phông serif, chuyên nghiệp, hay dùng trong tài liệu.\n"
            + "\n"
            + "Verdana: Chữ rộng, dễ nhìn trên màn hình nhỏ.\n"
            + "\n"
            + "Georgia: Sang trọng, cân đối.\n"
            + "\n"
            + "Courier New: Monospace, phù hợp cho code.\n"
            + "\n"
            + "Roboto: Hiện đại, cực phổ biến trong web và app.",
            "font-family quyết định phong cách văn bản.\n"
            + "\n"
            + "Đừng quên fallback fonts.\n"
            + "\n"
            + "Lựa chọn font giúp trang web \"nói đúng giọng\"."
        });
        Content_MAP.put("Font-size", new String[]{
            "font-size trong CSS được dùng để xác định kích thước chữ (font) trên trang web. Nó quyết định văn bản sẽ lớn hay nhỏ, dễ đọc hay khó đọc.\n"
            + "\n"
            + "Ví dụ:",
            "Trong ví dụ này, font-size được set là 16 pixel cho tất cả các đoạn văn.",
            "a. Pixel (px)\n"
            + "Là đơn vị cố định, không thay đổi khi người dùng thay đổi độ phân giải màn hình.\n"
            + "\n"
            + "Ví dụ: font-size: 16px; (rất phổ biến trong thiết kế web).\n"
            + "\n"
            + "b. Em (em)\n"
            + "Được tính toán dựa trên font-size của phần tử cha.\n"
            + "\n"
            + "1 em tương đương với kích thước font của phần tử cha.\n"
            + "\n"
            + "Ví dụ: nếu cha có font-size: 16px, thì font-size: 1.5em sẽ là 24px.\n"
            + "\n"
            + "c. Rem (rem)\n"
            + "Là đơn vị tương đối so với font-size của thẻ <html> (root element).\n"
            + "\n"
            + "Cộng với khả năng điều chỉnh kích thước chữ toàn bộ trang bằng cách thay đổi font-size của thẻ <html>.\n"
            + "\n"
            + "Ví dụ: font-size: 1rem sẽ tương đương với kích thước font của thẻ <html>.\n"
            + "\n"
            + "d. % (Phần trăm)\n"
            + "Tính theo phần trăm font-size của phần tử cha.\n"
            + "\n"
            + "Ví dụ: font-size: 120% tương đương với 120% của font-size của phần tử cha.\n"
            + "\n"
            + "e. View Width (vw)\n"
            + "Đơn vị này tính toán dựa trên chiều rộng của cửa sổ trình duyệt.\n"
            + "\n"
            + "1 vw = 1% của chiều rộng cửa sổ trình duyệt.\n"
            + "\n"
            + "Ví dụ: font-size: 5vw; có thể làm chữ lớn hơn khi cửa sổ rộng.",
            "Sử dụng px (Pixel):",
            "→ Tạo kích thước font cố định là 32px cho tất cả các thẻ <h1>.\n"
            + "\n"
            + "Sử dụng em:",
            "Sử dụng rem:",
            "Sử dụng %:",
            "Pixel (px): Giữ kích thước cố định, dễ kiểm soát chính xác.\n"
            + "\n"
            + "Em và Rem: Tạo tính linh hoạt và dễ dàng thay đổi kích thước font cho toàn bộ trang web.\n"
            + "\n"
            + "%: Dễ dàng làm cho văn bản thích ứng với phần tử cha.\n"
            + "\n"
            + "vw: Thích hợp cho các thiết kế responsive, tự điều chỉnh theo chiều rộng màn hình.",
            "Khi thiết kế Responsive, sử dụng các đơn vị như em, rem, và vw là cách tuyệt vời để làm cho kích thước font tự điều chỉnh theo kích thước màn hình của thiết bị.\n"
            + "\n"
            + "Ví dụ:",
            "✅ font-size giúp bạn điều chỉnh kích thước chữ trên trang web, sử dụng các đơn vị như px, em, rem, % và vw.\n"
            + "✅ Chọn đơn vị phù hợp giúp bạn kiểm soát được kích thước chữ một cách linh hoạt và dễ dàng tạo giao diện responsive."
        });
        Content_MAP.put("Font-weight", new String[]{
            "font-weight trong CSS được dùng để xác định độ đậm của chữ. Thông qua thuộc tính này, bạn có thể tạo ra những hiệu ứng văn bản nổi bật, nhấn mạnh cho tiêu đề, hoặc các phần quan trọng trong nội dung.\n"
            + "\n"
            + "Ví dụ cơ bản:",
            "Trong ví dụ trên, văn bản trong thẻ <p> sẽ được làm đậm.",
            "a. Các từ khóa\n"
            + "normal: Độ đậm mặc định của font (thường là 400).\n"
            + "\n"
            + "bold: Làm đậm văn bản (tương đương với 700).\n"
            + "\n"
            + "bolder: Tăng độ đậm so với phần tử cha.\n"
            + "\n"
            + "lighter: Giảm độ đậm so với phần tử cha.\n"
            + "\n"
            + "Ví dụ:",
            "b. Các giá trị số\n"
            + "100 đến 900: Các giá trị số từ 100 đến 900 chỉ ra độ đậm, trong đó:\n"
            + "\n"
            + "100 là mỏng nhất.\n"
            + "\n"
            + "900 là đậm nhất.\n"
            + "\n"
            + "Giá trị mặc định là 400 (normal).\n"
            + "\n"
            + "Giá trị 700 tương đương với bold.\n"
            + "\n"
            + "Ví dụ:",
            "Sử dụng normal và bold:",
            "Sử dụng giá trị số:",
            "Làm đậm khi hover:",
            "Làm nổi bật nội dung: Dùng font-weight để nhấn mạnh tiêu đề, từ khóa, hoặc các phần quan trọng trong bài viết.\n"
            + "\n"
            + "Độ đậm vừa phải: Để dễ đọc, tránh dùng font-weight quá nặng hoặc quá nhẹ. Điều này ảnh hưởng đến trải nghiệm người đọc, nhất là trên các thiết bị di động.\n"
            + "\n"
            + "Hỗ trợ thẩm mỹ: Điều chỉnh font-weight giúp cải thiện thẩm mỹ, làm cho thiết kế trở nên hài hòa và dễ tiếp cận hơn.",
            "Font-weight thường được kết hợp với các thuộc tính như font-family, font-size, line-height để tạo ra kiểu chữ hoàn hảo cho trang web. Ví dụ, bạn có thể tạo một tiêu đề mạnh mẽ và nổi bật bằng cách kết hợp font-size lớn với font-weight đậm:",
            "✅ font-weight giúp bạn điều chỉnh độ đậm của chữ, từ bình thường đến rất đậm.\n"
            + "✅ Có thể sử dụng các từ khóa (normal, bold) hoặc các giá trị số (100 đến 900).\n"
            + "✅ Làm đậm văn bản giúp cải thiện sự rõ ràng và tạo điểm nhấn trong thiết kế."
        });
        Content_MAP.put("Line-height", new String[]{
            "line-height là thuộc tính CSS dùng để xác định chiều cao dòng chữ, tức là khoảng cách giữa các dòng văn bản trong một đoạn, giúp cải thiện khả năng đọc và sự dễ chịu khi xem nội dung.\n"
            + "\n"
            + "Ví dụ cơ bản:",
            "Trong ví dụ trên, khoảng cách giữa các dòng của thẻ <p> sẽ là 1.5 lần chiều cao của font chữ hiện tại.",
            "Có thể thiết lập line-height với các loại giá trị khác nhau:\n"
            + "\n"
            + "a. Số (Number)\n"
            + "Nếu bạn chỉ định một số, nó sẽ được tính toán dựa trên kích thước font chữ hiện tại.\n"
            + "\n"
            + "Ví dụ: line-height: 1.5; sẽ tạo khoảng cách giữa các dòng bằng 1.5 lần chiều cao font chữ.\n"
            + "\n"
            + "b. Đơn vị (px, em, rem)\n"
            + "Bạn cũng có thể sử dụng các đơn vị như px, em, hoặc rem để thiết lập chiều cao dòng cố định.\n"
            + "\n"
            + "Ví dụ: line-height: 24px; sẽ tạo khoảng cách cố định là 24px giữa các dòng văn bản.\n"
            + "\n"
            + "c. Từ khóa (normal)\n"
            + "normal là giá trị mặc định, tự động tính toán khoảng cách phù hợp với font chữ.\n"
            + "\n"
            + "Ví dụ: line-height: normal;",
            "Tăng khả năng đọc: Khoảng cách dòng phù hợp sẽ giúp văn bản dễ đọc hơn, đặc biệt là trên các thiết bị nhỏ như điện thoại.\n"
            + "\n"
            + "Cải thiện giao diện: Giúp văn bản trông rõ ràng, thoáng đãng và không bị chồng chéo.\n"
            + "\n"
            + "Tạo thẩm mỹ: Các đoạn văn bản trông không quá chật chội, tạo không gian thoải mái cho người đọc.",
            "Khoảng cách dòng tự động:",
            "Khoảng cách dòng tương đối (1.5):",
            "Khoảng cách dòng cố định (24px):",
            "Khoảng cách dòng sử dụng em:",
            "Dễ đọc hơn: Khoảng cách dòng hợp lý giúp mắt không bị mỏi khi đọc dài.\n"
            + "\n"
            + "Responsive: Sử dụng các giá trị tỷ lệ như em hoặc rem giúp giữ cho khoảng cách dòng linh hoạt trên nhiều thiết bị.\n"
            + "\n"
            + "Tạo bố cục rõ ràng: Việc điều chỉnh line-height giúp tránh tình trạng văn bản bị \"dính\" vào nhau, tạo sự thoáng đãng.",
            "✅ line-height giúp bạn kiểm soát khoảng cách giữa các dòng chữ, từ đó cải thiện khả năng đọc và thẩm mỹ.\n"
            + "✅ Bạn có thể sử dụng các giá trị như số (1.5), đơn vị (px, em) hoặc từ khóa (normal).\n"
            + "✅ Khoảng cách dòng hợp lý giúp tạo trải nghiệm người dùng tốt hơn, đặc biệt trong các thiết kế responsive."
        });
        Content_MAP.put("Letter-spacing", new String[]{
            "letter-spacing là thuộc tính CSS dùng để điều chỉnh khoảng cách giữa các ký tự trong một đoạn văn bản. Nó giúp tạo hiệu ứng văn bản có khoảng cách rộng hơn hoặc gần hơn giữa các chữ cái, cải thiện tính thẩm mỹ và dễ đọc.\n"
            + "\n"
            + "Ví dụ cơ bản:",
            "Trong ví dụ trên, khoảng cách giữa các ký tự trong thẻ <p> sẽ được tăng lên 2px.",
            "Bạn có thể sử dụng các giá trị sau cho thuộc tính letter-spacing:\n"
            + "\n"
            + "a. Số (dùng đơn vị px, em, rem)\n"
            + "px: Điều chỉnh khoảng cách cố định giữa các ký tự.\n"
            + "\n"
            + "em và rem: Tạo khoảng cách tương đối với kích thước font chữ.\n"
            + "\n"
            + "Ví dụ:",
            "b. Giá trị âm\n"
            + "Bạn có thể sử dụng giá trị âm để làm cho các ký tự dính gần nhau hơn.\n"
            + "\n"
            + "Ví dụ:",
            "Tăng khoảng cách: Để cải thiện khả năng đọc hoặc tạo phong cách thiết kế hiện đại.",
            "Giảm khoảng cách: Tạo hiệu ứng chặt chẽ, mật độ văn bản cao.",
            "Tiêu đề phong cách:",
            "Cải thiện tính thẩm mỹ: Sử dụng letter-spacing có thể làm cho văn bản trông dễ chịu hơn hoặc tạo hiệu ứng nghệ thuật đặc biệt.\n"
            + "\n"
            + "Khả năng đọc dễ dàng: Khi tăng khoảng cách giữa các ký tự, văn bản có thể trở nên dễ đọc hơn, đặc biệt trên các thiết bị nhỏ.\n"
            + "\n"
            + "Phong cách hiện đại: Tạo kiểu dáng độc đáo cho các tiêu đề hoặc văn bản nổi bật.\n"
            + "",
            "letter-spacing thường được kết hợp với các thuộc tính như font-family, font-size, font-weight, text-transform để tạo ra những kiểu chữ độc đáo và dễ đọc.\n"
            + "\n"
            + "Ví dụ kết hợp:",
            "👉 Tiêu đề này sẽ có kích thước lớn, các ký tự cách xa nhau, chữ in hoa và đậm.\n"
            + "",
            "✅ letter-spacing điều chỉnh khoảng cách giữa các ký tự, giúp văn bản dễ đọc và tạo phong cách.\n"
            + "✅ Bạn có thể tăng hoặc giảm khoảng cách với giá trị số dương hoặc âm (px, em).\n"
            + "✅ Tăng khoảng cách giúp cải thiện thẩm mỹ và khả năng đọc, trong khi giảm khoảng cách tạo hiệu ứng chặt chẽ."
        });
        Content_MAP.put("Ứng dụng thực tế", new String[]{
            "Khi thiết kế các tiêu đề, việc sử dụng letter-spacing có thể giúp chữ trở nên nổi bật hơn. Việc tăng khoảng cách giữa các ký tự làm cho tiêu đề dễ đọc và dễ nhận diện hơn.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Tiêu đề trên trang chủ hoặc các mục quan trọng giúp thu hút sự chú ý của người dùng.",
            "Khi văn bản dài, sử dụng letter-spacing có thể giúp văn bản dễ đọc hơn bằng cách tạo khoảng cách giữa các chữ cái. Điều này rất hữu ích trong các bài viết, đoạn văn dài hoặc thông báo quan trọng.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Sử dụng trong các bài blog, nội dung trên website hoặc tài liệu trực tuyến.",
            "Sử dụng letter-spacing kết hợp với các hiệu ứng khác có thể tạo ra phong cách nghệ thuật cho văn bản, đặc biệt là trong các quảng cáo hoặc thiết kế đồ họa. Điều này có thể giúp văn bản trở nên ấn tượng và bắt mắt hơn.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Tiêu đề trong các chiến dịch quảng cáo, banner, hoặc trang landing page.",
            "Bạn có thể sử dụng letter-spacing để làm cho văn bản trên nút bấm (button) trở nên nổi bật và dễ đọc hơn, giúp người dùng dễ dàng nhận ra hành động cần thực hiện.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Các nút gọi hành động như \"Đăng ký\", \"Mua ngay\", \"Tìm hiểu thêm\", giúp văn bản trên nút dễ nhìn và dễ đọc.",
            "Khi thiết kế logo hoặc chữ ký, letter-spacing giúp các ký tự trong tên công ty hoặc sản phẩm trở nên rõ ràng và dễ nhận diện. Bạn có thể điều chỉnh khoảng cách để tạo phong cách độc đáo cho thương hiệu.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Thiết kế logo hoặc tên thương hiệu, giúp tạo dấu ấn riêng biệt cho công ty.",
            "Sử dụng letter-spacing để tạo hiệu ứng động cho văn bản khi người dùng rê chuột vào. Việc thay đổi khoảng cách ký tự giúp tạo sự thú vị và làm cho giao diện trở nên sinh động hơn.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Các liên kết, nút bấm hoặc menu giúp người dùng có trải nghiệm tương tác thú vị hơn.",
            "Trong một số tình huống, bạn có thể muốn giảm khoảng cách giữa các ký tự để văn bản trông gọn gàng hơn, đặc biệt là khi thiết kế các đoạn văn bản nhỏ.\n"
            + "\n"
            + "Ví dụ:",
            "Ứng dụng thực tế: Sử dụng trong các chú thích, ghi chú, hoặc các đoạn văn bản phụ.",
            "✅ letter-spacing có thể giúp tạo ra các kiểu chữ phong cách, dễ đọc và dễ nhận diện.\n"
            + "✅ Bạn có thể sử dụng nó để điều chỉnh khoảng cách giữa các ký tự cho tiêu đề, đoạn văn, nút bấm, logo, và nhiều ứng dụng khác.\n"
            + "✅ Tăng hoặc giảm khoảng cách giữa các chữ cái có thể tạo hiệu ứng thị giác đẹp mắt và cải thiện trải nghiệm người dùng."
        });
        Content_MAP.put("Display: block", new String[]{
            "display: block là thuộc tính CSS dùng để chỉ định rằng phần tử HTML sẽ được hiển thị dưới dạng phần tử khối (block-level element). Điều này có nghĩa là phần tử sẽ chiếm toàn bộ chiều rộng của vùng chứa, ngắt dòng và bắt đầu một dòng mới.\n"
            + "\n"
            + "Ví dụ:",
            "Trong ví dụ trên, thẻ <div> sẽ được hiển thị như một phần tử khối.",
            "Chiếm toàn bộ chiều rộng của phần tử cha (tùy thuộc vào kích thước của phần tử cha).\n"
            + "\n"
            + "Ngắt dòng: Phần tử block-level sẽ bắt đầu từ dòng mới, nghĩa là các phần tử khác sẽ không hiển thị trên cùng một dòng mà nằm dưới nó.\n"
            + "\n"
            + "Có thể thay đổi chiều rộng và chiều cao: Các phần tử block có thể có chiều rộng (width) và chiều cao (height) tùy chỉnh.\n"
            + "\n"
            + "Ví dụ:",
            "Nhiều thẻ HTML mặc định được coi là phần tử block-level. Một số thẻ phổ biến bao gồm:\n"
            + "\n"
            + "<div>\n"
            + "\n"
            + "<p>\n"
            + "\n"
            + "<h1>, <h2>, <h3>, v.v.\n"
            + "\n"
            + "<ul>, <ol>, <li>\n"
            + "\n"
            + "<form>, <header>, <footer>\n"
            + "\n"
            + "Các phần tử này sẽ tự động có display: block trừ khi bị thay đổi.",
            "Phần tử inline không ngắt dòng, nghĩa là nó sẽ hiển thị trên cùng một dòng với các phần tử khác.\n"
            + "\n"
            + "Phần tử block ngắt dòng và chiếm toàn bộ chiều rộng của phần tử chứa.\n"
            + "\n"
            + "Ví dụ về phần tử inline:",
            "Cả hai phần tử <span> sẽ hiển thị trên cùng một dòng",
            "Đảm bảo phần tử chiếm toàn bộ chiều rộng: Bạn có thể sử dụng display: block để đảm bảo phần tử chiếm toàn bộ không gian trong vùng chứa của nó, ví dụ như khi bạn muốn tạo một hộp div có chiều rộng đầy đủ.",
            "Xử lý layout và sắp xếp: Khi bạn muốn các phần tử không xếp chồng lên nhau mà tạo ra các khối riêng biệt trong layout (ví dụ như trong các layout của trang web), bạn có thể sử dụng display: block cho các phần tử như <div>, <section>, <article>, v.v.",
            "Hiển thị các phần tử kiểu block trong một menu: Đối với các menu hoặc danh sách mà bạn muốn mỗi mục nằm trên một dòng riêng biệt, bạn có thể sử dụng display: block.",
            "Bạn có thể thay đổi display của các phần tử giữa inline và block tùy thuộc vào cách bạn muốn chúng hiển thị trên trang.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Bạn có thể thay đổi một thẻ inline (như <span>) thành block:",
            "Hoặc thay đổi một thẻ block (như <div>) thành inline",
            "✅ display: block chỉ định phần tử sẽ chiếm toàn bộ chiều rộng của vùng chứa và ngắt dòng, bắt đầu một dòng mới.\n"
            + "✅ Các phần tử block-level có thể tùy chỉnh chiều rộng và chiều cao.\n"
            + "✅ Phần tử block thường được sử dụng để tạo các khối nội dung như <div>, <p>, <section>, v.v.\n"
            + "✅ Hiểu rõ sự khác biệt giữa block và inline giúp bạn dễ dàng điều chỉnh bố cục và kiểu hiển thị của các phần tử trên trang web."
        });
        Content_MAP.put("Display: inline", new String[]{
            "display: inline là thuộc tính CSS được sử dụng để chỉ định rằng phần tử sẽ được hiển thị dưới dạng phần tử inline (inline-level element). Điều này có nghĩa là phần tử sẽ không ngắt dòng, và các phần tử inline khác sẽ hiển thị cùng trên một dòng.\n"
            + "\n"
            + "Ví dụ:",
            "Trong ví dụ trên, thẻ <span> sẽ được hiển thị như một phần tử inline.",
            "Không ngắt dòng: Phần tử inline không bắt đầu một dòng mới mà hiển thị trên cùng một dòng với các phần tử khác.\n"
            + "\n"
            + "Không chiếm toàn bộ chiều rộng: Phần tử inline chỉ chiếm đúng không gian cần thiết để chứa nội dung của nó, không chiếm toàn bộ chiều rộng như phần tử block.\n"
            + "\n"
            + "Không thể thay đổi chiều rộng và chiều cao: Bạn không thể trực tiếp điều chỉnh chiều rộng và chiều cao của phần tử inline. Tuy nhiên, bạn có thể thay đổi các thuộc tính như padding và margin, nhưng chúng sẽ không làm phần tử inline bị thay đổi chiều rộng.\n"
            + "\n"
            + "Ví dụ về phần tử inline:",
            "Cả hai phần tử <span> sẽ hiển thị trên cùng một dòng, không có sự ngắt dòng giữa chúng.\n"
            + "",
            "Phần tử block-level ngắt dòng và chiếm toàn bộ chiều rộng của vùng chứa.\n"
            + "\n"
            + "Phần tử inline không ngắt dòng và chỉ chiếm không gian cần thiết cho nội dung của nó.\n"
            + "\n"
            + "Ví dụ về phần tử block:",
            "Cả hai phần tử <div> sẽ được hiển thị trên các dòng riêng biệt, vì chúng là phần tử block.",
            "Định dạng văn bản: Các thẻ như <span>, <a>, và <strong> là phần tử inline, thường được sử dụng để thay đổi một phần văn bản trong một câu mà không ảnh hưởng đến dòng văn bản khác.\n"
            + "\n"
            + "Ví dụ:",
            "Kết quả là từ \"important\" sẽ có màu đỏ, nhưng sẽ hiển thị trên cùng dòng với phần còn lại của đoạn văn.\n"
            + "\n"
            + "Tạo menu ngang: Bạn có thể sử dụng các phần tử inline để tạo một menu ngang, giúp các mục menu hiển thị trên cùng một dòng.\n"
            + "\n"
            + "Ví dụ:",
            "Tạo link liên kết: Thẻ <a> là phần tử inline mặc định, dùng để tạo liên kết mà không ngắt dòng.\n"
            + "\n"
            + "Ví dụ:",
            "Bạn có thể thay đổi display của các phần tử giữa inline, block, và inline-block tùy thuộc vào cách bạn muốn chúng hiển thị.\n"
            + "\n"
            + "inline-block: Cho phép bạn kết hợp đặc điểm của cả block và inline. Phần tử có thể có chiều rộng và chiều cao tùy chỉnh nhưng vẫn hiển thị trên cùng một dòng.\n"
            + "\n"
            + "Ví dụ:",
            "✅ display: inline giúp phần tử hiển thị trên cùng một dòng mà không ngắt dòng và chỉ chiếm không gian cần thiết cho nội dung.\n"
            + "✅ Phần tử inline rất hữu ích khi bạn muốn định dạng một phần văn bản mà không ảnh hưởng đến dòng văn bản khác, hoặc khi tạo các menu, liên kết.\n"
            + "✅ Nếu bạn cần phần tử có thể thay đổi chiều rộng và chiều cao nhưng vẫn hiển thị trên cùng một dòng, hãy thử sử dụng display: inline-block."
        });
        Content_MAP.put("Display: inline-block", new String[]{
            "display: inline-block là một kiểu hiển thị trong CSS kết hợp giữa inline và block. Phần tử sử dụng display: inline-block sẽ hiển thị trên cùng một dòng (như phần tử inline) nhưng lại có thể có chiều rộng và chiều cao (như phần tử block).\n"
            + "\n"
            + "Ví dụ:",
            "Hiển thị trên cùng một dòng: Phần tử với display: inline-block sẽ không ngắt dòng và sẽ hiển thị cùng với các phần tử khác trên cùng một dòng, giống như phần tử inline.\n"
            + "\n"
            + "Có thể thay đổi chiều rộng và chiều cao: Khác với phần tử inline, phần tử inline-block có thể có chiều rộng và chiều cao tùy chỉnh (như phần tử block).\n"
            + "\n"
            + "Cung cấp khả năng căn chỉnh tốt hơn: Vì nó kết hợp đặc điểm của cả inline và block, bạn có thể dễ dàng căn chỉnh các phần tử trong bố cục mà không bị ngắt dòng.\n"
            + "\n"
            + "Ví dụ:",
            "1. Tạo menu ngang (Horizontal menu)\n"
            + "display: inline-block rất hữu ích khi bạn muốn các mục trong một menu hiển thị trên cùng một dòng nhưng vẫn có thể kiểm soát kích thước của từng mục.\n"
            + "\n"
            + "Ví dụ:",
            "2. Bố cục nhiều cột (Multi-column layout)\n"
            + "Bạn có thể sử dụng display: inline-block để tạo bố cục nhiều cột mà không cần phải sử dụng float hoặc flexbox.\n"
            + "\n"
            + "Ví dụ:",
            "3. Tạo các hình vuông hoặc hộp có kích thước cố định\n"
            + "Khi bạn cần hiển thị các phần tử có kích thước cố định trong một dòng (như các thẻ sản phẩm trong cửa hàng trực tuyến), bạn có thể sử dụng display: inline-block.\n"
            + "\n"
            + "Ví dụ:",
            "Căn chỉnh các phần tử: Khi sử dụng display: inline-block, bạn có thể căn chỉnh các phần tử theo cách linh hoạt mà không cần phải lo lắng về ngắt dòng.\n"
            + "\n"
            + "Khoảng cách giữa các phần tử: Khi sử dụng inline-block, cần chú ý đến khoảng cách giữa các phần tử. Khoảng cách này có thể được tạo ra bởi khoảng trắng trong HTML giữa các phần tử. Để loại bỏ khoảng cách này, bạn có thể xóa khoảng trắng trong HTML hoặc đặt thuộc tính font-size: 0 cho phần tử cha.\n"
            + "\n"
            + "Ví dụ tránh khoảng cách:",
            "✅ display: inline-block kết hợp giữa tính chất của phần tử inline và block. Phần tử có thể hiển thị trên cùng một dòng, đồng thời có thể điều chỉnh chiều rộng và chiều cao.\n"
            + "✅ Ứng dụng phổ biến của inline-block bao gồm tạo menu ngang, bố cục nhiều cột, hoặc tạo các hộp sản phẩm có kích thước cố định.\n"
            + "✅ Sự kết hợp này giúp bạn có thể dễ dàng kiểm soát bố cục và căn chỉnh các phần tử mà không gặp phải các vấn đề như khi sử dụng float.\n"
            + ""
        });
        Content_MAP.put("Display: flex", new String[]{
            "Khi bạn sử dụng display: flex trên một phần tử cha (flex container), tất cả các phần tử con (flex items) bên trong nó sẽ trở thành các phần tử linh hoạt, và bạn có thể điều chỉnh vị trí, kích thước, và căn chỉnh các phần tử con này một cách dễ dàng.\n"
            + "\n"
            + "Ví dụ:",
            "Trong đó, .container sẽ trở thành flex container và tất cả các phần tử con trong .container sẽ trở thành flex items.",
            "Khi sử dụng display: flex, bạn có thể áp dụng nhiều thuộc tính khác cho flex container để kiểm soát cách các phần tử con (flex items) được sắp xếp. Dưới đây là các thuộc tính chính của flex container:\n"
            + "\n"
            + "flex-direction Xác định hướng (trục) của các phần tử con bên trong container. Có 4 giá trị:\n"
            + "\n"
            + "row: Sắp xếp các phần tử theo chiều ngang (từ trái sang phải).\n"
            + "\n"
            + "row-reverse: Sắp xếp các phần tử theo chiều ngang, nhưng ngược lại (từ phải sang trái).\n"
            + "\n"
            + "column: Sắp xếp các phần tử theo chiều dọc (từ trên xuống dưới).\n"
            + "\n"
            + "column-reverse: Sắp xếp các phần tử theo chiều dọc, nhưng ngược lại (từ dưới lên trên).\n"
            + "\n"
            + "Ví dụ:",
            "justify-content Điều chỉnh căn chỉnh các phần tử con dọc theo trục chính (trục của flex-direction). Các giá trị phổ biến:\n"
            + "\n"
            + "flex-start: Các phần tử căn trái (hoặc đầu).\n"
            + "\n"
            + "flex-end: Các phần tử căn phải (hoặc cuối).\n"
            + "\n"
            + "center: Căn giữa.\n"
            + "\n"
            + "space-between: Căn đều, với không gian giữa các phần tử.\n"
            + "\n"
            + "space-around: Căn đều, với không gian bằng nhau trước và sau các phần tử.\n"
            + "\n"
            + "space-evenly: Căn đều với khoảng cách bằng nhau giữa các phần tử.\n"
            + "\n"
            + "Ví dụ:",
            "align-items Căn chỉnh các phần tử con dọc theo trục phụ (trục vuông góc với trục chính). Các giá trị phổ biến:\n"
            + "\n"
            + "flex-start: Căn phần tử lên trên (hoặc đầu).\n"
            + "\n"
            + "flex-end: Căn phần tử xuống dưới (hoặc cuối).\n"
            + "\n"
            + "center: Căn phần tử vào giữa.\n"
            + "\n"
            + "baseline: Căn các phần tử theo đường cơ sở của chúng (thường là văn bản).\n"
            + "\n"
            + "stretch: Kéo dài các phần tử để chiếm toàn bộ chiều cao của container (mặc định).\n"
            + "\n"
            + "Ví dụ:",
            "align-self Cho phép điều chỉnh căn chỉnh của một phần tử con riêng biệt so với các phần tử còn lại trong container. Các giá trị giống với align-items:\n"
            + "\n"
            + "auto: Sử dụng giá trị mặc định (tương tự align-items).\n"
            + "\n"
            + "flex-start, flex-end, center, baseline, stretch.\n"
            + "\n"
            + "Ví dụ:",
            "flex-wrap Quy định xem các phần tử con có được bọc (wrap) sang dòng mới khi không còn đủ không gian trong container hay không. Các giá trị:\n"
            + "\n"
            + "nowrap: Không bọc phần tử con, tất cả đều hiển thị trên một dòng.\n"
            + "\n"
            + "wrap: Bọc các phần tử con khi hết không gian.\n"
            + "\n"
            + "wrap-reverse: Bọc các phần tử con nhưng theo hướng ngược lại.\n"
            + "\n"
            + "Ví dụ:",
            "Mỗi phần tử con bên trong một flex container (flex item) có thể được điều chỉnh bằng các thuộc tính của flex item:\n"
            + "\n"
            + "flex-grow Xác định tỷ lệ phần tử con có thể mở rộng để chiếm không gian dư trong container. Mặc định là 0, nghĩa là phần tử không mở rộng. Giá trị lớn hơn 0 sẽ làm phần tử đó mở rộng theo tỷ lệ.",
            "flex-shrink Xác định tỷ lệ phần tử con sẽ thu nhỏ lại khi không gian không đủ. Mặc định là 1, nghĩa là phần tử sẽ thu nhỏ khi cần thiết. Giá trị 0 có nghĩa là phần tử không thu nhỏ.",
            "flex-basis Xác định chiều rộng hoặc chiều cao ban đầu của phần tử con trước khi tính toán các giá trị mở rộng hoặc thu nhỏ. Giá trị này có thể là một giá trị cụ thể như px, em, hoặc auto.",
            "flex Kết hợp các thuộc tính flex-grow, flex-shrink và flex-basis thành một thuộc tính duy nhất.\n"
            + "",
            "align-self Điều chỉnh căn chỉnh của phần tử con so với các phần tử còn lại trong container (tương tự align-items nhưng áp dụng cho từng phần tử riêng biệt).",
            "Trong ví dụ trên:\n"
            + "\n"
            + ".container sử dụng display: flex để tạo một flex container.\n"
            + "\n"
            + "Các phần tử con (.item) sẽ được phân bố đều với không gian giữa chúng, căn chỉnh theo chiều dọc, và nếu không gian không đủ, chúng sẽ bọc sang dòng mới."
        });
        Content_MAP.put("Display: grid", new String[]{
            "Khi bạn sử dụng display: grid cho một phần tử cha (grid container), các phần tử con bên trong đó (grid items) sẽ được tự động sắp xếp theo dạng lưới, và bạn có thể dễ dàng điều chỉnh số lượng cột, hàng và kích thước của chúng.\n"
            + "\n"
            + "Ví dụ:",
            "Trong đó, .container trở thành grid container, và tất cả các phần tử con bên trong .container sẽ trở thành grid items.",
            "Sau khi bạn áp dụng display: grid cho phần tử cha, bạn có thể sử dụng các thuộc tính sau để kiểm soát cách bố trí các phần tử con:\n"
            + "\n"
            + "grid-template-columns và grid-template-rows\n"
            + "\n"
            + "grid-template-columns xác định số lượng và kích thước của các cột trong grid.\n"
            + "\n"
            + "grid-template-rows xác định số lượng và kích thước của các hàng trong grid.\n"
            + "\n"
            + "Ví dụ:",
            "1fr: Đơn vị fr (fractional unit) chia đều không gian. 1fr là 1 phần không gian có sẵn.\n"
            + "\n"
            + "auto: Tự động điều chỉnh chiều cao hoặc chiều rộng của hàng hoặc cột dựa trên nội dung.\n"
            + "\n"
            + "grid-template-areas Dùng để định nghĩa tên các khu vực (area) trong grid để sắp xếp các phần tử con theo cách rõ ràng và dễ hiểu hơn.\n"
            + "\n"
            + "Ví dụ:",
            "grid-gap (hoặc gap) giúp tạo ra khoảng cách giữa các phần tử trong grid. Bạn có thể đặt một giá trị duy nhất cho cả hàng và cột hoặc tách biệt chúng:",
            "grid-auto-rows và grid-auto-columns\n"
            + "\n"
            + "grid-auto-rows xác định kích thước hàng tự động khi bạn không chỉ định kích thước cho một hàng.\n"
            + "\n"
            + "grid-auto-columns xác định kích thước cột tự động.\n"
            + "\n"
            + "Ví dụ:",
            "Các hàng không được định nghĩa kích thước sẽ tự động có chiều cao là 100px.\n"
            + "\n"
            + "justify-items và align-items\n"
            + "\n"
            + "justify-items căn chỉnh các phần tử con theo chiều ngang trong mỗi ô.\n"
            + "\n"
            + "align-items căn chỉnh các phần tử con theo chiều dọc trong mỗi ô.\n"
            + "\n"
            + "Ví dụ:",
            "Khi bạn sử dụng display: grid, các phần tử con (grid items) sẽ có thể được căn chỉnh và điều chỉnh theo các thuộc tính sau:\n"
            + "\n"
            + "grid-column và grid-row Các thuộc tính này cho phép bạn chỉ định một phần tử con sẽ chiếm bao nhiêu cột và bao nhiêu hàng trong grid.\n"
            + "\n"
            + "Ví dụ:",
            "grid-column-start, grid-column-end, grid-row-start, grid-row-end Đây là các thuộc tính giúp bạn chỉ định chính xác vị trí bắt đầu và kết thúc của phần tử con trong grid.\n"
            + "\n"
            + "Ví dụ:",
            "justify-self và align-self\n"
            + "\n"
            + "justify-self căn chỉnh phần tử con theo chiều ngang trong ô.\n"
            + "\n"
            + "align-self căn chỉnh phần tử con theo chiều dọc trong ô.\n"
            + "\n"
            + "Ví dụ:",
            ".container sử dụng display: grid để tạo bố cục lưới với ba cột (grid-template-columns: 1fr 1fr 1fr).\n"
            + "\n"
            + "gap: 10px tạo khoảng cách giữa các ô trong grid.\n"
            + "\n"
            + "Các phần tử con (.item-1, .item-2, ...) được sắp xếp vào các vị trí cụ thể trong grid bằng cách sử dụng grid-column và grid-row.",
            "display: grid giúp bạn dễ dàng tạo một bố cục lưới với khả năng kiểm soát kích thước, vị trí và cách căn chỉnh các phần tử. Nó cung cấp một phương pháp mạnh mẽ và linh hoạt cho việc thiết kế bố cục phức tạp mà không cần phải sử dụng các kỹ thuật như floats hay positioning."
        });
        Content_MAP.put("Viewport là gì", new String[]{
            "Viewport là một thuật ngữ trong thiết kế web và phát triển web, dùng để chỉ phần không gian hiển thị của một trang web trên màn hình của người dùng. Nó là khu vực mà nội dung của trang web được hiển thị và tương tác trực tiếp. Trong bối cảnh web, viewport rất quan trọng trong việc tối ưu hóa trải nghiệm người dùng, đặc biệt khi làm việc với các thiết bị có kích thước màn hình khác nhau (desktop, laptop, tablet, smartphone, v.v.).",
            "Responsive Design (Thiết kế đáp ứng):\n"
            + "\n"
            + "Viewport giúp trang web hiển thị chính xác trên các thiết bị với kích thước màn hình khác nhau. Sử dụng các thuộc tính CSS như @media và các thẻ meta để điều chỉnh cách trang web hiển thị trên các thiết bị khác nhau.\n"
            + "\n"
            + "Viewport Width (VW) và Viewport Height (VH):\n"
            + "\n"
            + "CSS cung cấp các đơn vị vw (viewport width) và vh (viewport height), dùng để tính toán tỷ lệ phần trăm của chiều rộng và chiều cao của viewport. Ví dụ, 100vw có nghĩa là chiều rộng của toàn bộ viewport, còn 100vh là chiều cao của toàn bộ viewport.\n"
            + "\n"
            + "Ví dụ:",
            "Điều này giúp bạn tạo các phần tử chiếm toàn bộ không gian của màn hình.\n"
            + "\n"
            + "Viewport Meta Tag:\n"
            + "\n"
            + "Trong HTML, bạn có thể sử dụng thẻ <meta> để điều chỉnh cách trình duyệt xử lý viewport trên các thiết bị di động, đặc biệt là để thiết kế các trang web di động thân thiện. Thẻ này đặc biệt quan trọng trong thiết kế Responsive Web Design.\n"
            + "\n"
            + "Ví dụ:",
            "width=device-width: Đặt chiều rộng của viewport bằng với chiều rộng của thiết bị (màn hình).\n"
            + "\n"
            + "initial-scale=1.0: Xác định tỷ lệ phóng to ban đầu khi trang web được tải (ở đây là 1, tức là không phóng to hay thu nhỏ khi tải trang).",
            "Kích thước màn hình của thiết bị.\n"
            + "\n"
            + "Zooming: Người dùng có thể phóng to hoặc thu nhỏ trang web bằng cách sử dụng các cử chỉ hoặc công cụ zoom của trình duyệt.\n"
            + "\n"
            + "Các yếu tố CSS như width, height, padding, margin, và các đơn vị đo (px, em, rem, vw, vh) đều có thể ảnh hưởng đến cách phần tử được hiển thị trong viewport.",
            "Khi bạn làm việc với thiết kế đáp ứng, bạn cần phải đảm bảo rằng nội dung của trang web có thể thay đổi linh hoạt tùy theo kích thước của viewport. Điều này có thể được thực hiện bằng cách sử dụng:\n"
            + "\n"
            + "Media Queries: Điều chỉnh các kiểu CSS dựa trên kích thước của viewport.\n"
            + "\n"
            + "Flexbox và Grid Layout: Giúp sắp xếp các phần tử một cách linh hoạt, phù hợp với mọi kích thước màn hình.\n"
            + "\n"
            + "Flexible units: Các đơn vị như vw, vh, % giúp tạo các phần tử có thể co giãn linh hoạt.\n"
            + "\n"
            + "Ví dụ với Media Queries:",
            "Điều này có nghĩa là khi viewport có chiều rộng tối đa là 768px, font-size sẽ được thay đổi thành 14px.",
            "Viewport là khu vực hiển thị của trang web trên màn hình của người dùng.\n"
            + "\n"
            + "Nó rất quan trọng trong thiết kế web đáp ứng, giúp trang web hiển thị đẹp trên mọi thiết bị với các kích thước màn hình khác nhau.\n"
            + "\n"
            + "Bạn có thể sử dụng thẻ meta viewport trong HTML và media queries trong CSS để tối ưu hóa trang web cho các thiết bị di động."
        });
        Content_MAP.put("Cú pháp chuẩn của thẻ Viewport", new String[]{
            "name=\"viewport\":\n"
            + "\n"
            + "Chỉ định rằng thẻ meta này dùng để thiết lập các thuộc tính của viewport.\n"
            + "\n"
            + "content=\"width=device-width\":\n"
            + "\n"
            + "width=device-width: Đặt chiều rộng của viewport bằng với chiều rộng của thiết bị. Điều này đảm bảo rằng trang web sẽ không bị phóng to hay thu nhỏ trên các thiết bị có màn hình nhỏ. Thay vì sử dụng một giá trị cố định (ví dụ: width=1000), sử dụng device-width sẽ giúp trang web tự động điều chỉnh chiều rộng theo kích thước màn hình của thiết bị.\n"
            + "\n"
            + "initial-scale=1.0:\n"
            + "\n"
            + "initial-scale: Thiết lập tỷ lệ phóng to ban đầu khi trang web được tải. Giá trị 1.0 có nghĩa là không có sự phóng to hay thu nhỏ khi trang web được tải lần đầu tiên. Nếu bạn thay đổi giá trị này (ví dụ initial-scale=2.0), trang web sẽ được phóng to lên gấp đôi.",
            "Ngoài width và initial-scale, bạn cũng có thể sử dụng một số thuộc tính khác trong thẻ meta viewport để điều chỉnh cách thức hiển thị trang web trên các thiết bị:\n"
            + "\n"
            + "maximum-scale:\n"
            + "\n"
            + "Xác định tỷ lệ tối đa khi người dùng phóng to trang web.\n"
            + "\n"
            + "Ví dụ: maximum-scale=1.0 ngăn người dùng phóng to quá mức.\n"
            + "\n"
            + "minimum-scale:\n"
            + "\n"
            + "Xác định tỷ lệ tối thiểu khi người dùng thu nhỏ trang web.\n"
            + "\n"
            + "Ví dụ: minimum-scale=0.5 cho phép thu nhỏ xuống còn 50%.\n"
            + "\n"
            + "user-scalable:\n"
            + "\n"
            + "Kiểm soát khả năng người dùng có thể thay đổi tỷ lệ trang web hay không.\n"
            + "\n"
            + "Giá trị: yes (cho phép phóng to thu nhỏ) hoặc no (ngừng phóng to thu nhỏ).\n"
            + "\n"
            + "Ví dụ: user-scalable=no ngừng phóng to thu nhỏ.",
            "width=device-width: Đặt chiều rộng của viewport bằng với chiều rộng của thiết bị.\n"
            + "\n"
            + "initial-scale=1.0: Thiết lập tỷ lệ phóng to ban đầu là 1.\n"
            + "\n"
            + "maximum-scale=1.0: Không cho phép người dùng phóng to quá mức.\n"
            + "\n"
            + "user-scalable=no: Không cho phép người dùng phóng to hoặc thu nhỏ.",
            "Thẻ <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> là cú pháp cơ bản và chuẩn để tối ưu hóa trang web cho các thiết bị di động, giúp thiết lập chiều rộng của trang phù hợp với kích thước màn hình của thiết bị và xác định tỷ lệ phóng to ban đầu."
        });
        Content_MAP.put("Các thuộc tính quan trọng", new String[]{
            "Công dụng: Xác định chiều rộng của viewport.\n"
            + "\n"
            + "Giá trị:\n"
            + "\n"
            + "width=device-width: Đặt chiều rộng của viewport bằng với chiều rộng của thiết bị. Điều này giúp trang web tự động điều chỉnh để phù hợp với mọi kích thước màn hình.\n"
            + "\n"
            + "Bạn cũng có thể chỉ định giá trị cố định như width=800 (800px) nếu bạn muốn viewport có chiều rộng cố định.\n"
            + "\n"
            + "Ví dụ:",
            "Công dụng: Đặt tỷ lệ phóng to ban đầu của trang khi nó được tải lần đầu tiên.\n"
            + "\n"
            + "Giá trị:\n"
            + "\n"
            + "1.0: Không phóng to hoặc thu nhỏ khi tải trang.\n"
            + "\n"
            + "Các giá trị khác sẽ làm trang được phóng to hoặc thu nhỏ tùy theo giá trị (ví dụ: initial-scale=2.0 sẽ phóng to gấp đôi).\n"
            + "\n"
            + "Ví dụ:\n"
            + "",
            "Công dụng: Xác định tỷ lệ phóng to tối đa mà người dùng có thể áp dụng khi sử dụng cử chỉ zoom.\n"
            + "\n"
            + "Giá trị: Là một số thực (ví dụ: 1.0, 2.0).\n"
            + "\n"
            + "maximum-scale=1.0: Người dùng không thể phóng to quá mức.\n"
            + "\n"
            + "maximum-scale=3.0: Cho phép phóng to tối đa gấp 3 lần.\n"
            + "\n"
            + "Ví dụ:",
            "Công dụng: Xác định tỷ lệ thu nhỏ tối thiểu mà người dùng có thể áp dụng khi sử dụng cử chỉ zoom.\n"
            + "\n"
            + "Giá trị: Là một số thực (ví dụ: 0.5, 1.0).\n"
            + "\n"
            + "minimum-scale=0.5: Người dùng có thể thu nhỏ tối thiểu đến 50%.\n"
            + "\n"
            + "Ví dụ:",
            "Công dụng: Kiểm soát khả năng người dùng có thể thay đổi tỷ lệ trang web hay không.\n"
            + "\n"
            + "Giá trị:\n"
            + "\n"
            + "yes: Cho phép người dùng phóng to và thu nhỏ trang.\n"
            + "\n"
            + "no: Ngừng khả năng phóng to thu nhỏ trang (khi đó người dùng không thể zoom in/zoom out).\n"
            + "\n"
            + "Ví dụ:",
            "Công dụng: Đặt chiều cao của viewport.\n"
            + "\n"
            + "Giá trị: Có thể là height=device-height hoặc một giá trị cố định.\n"
            + "\n"
            + "Ví dụ:",
            "width=device-width: Đặt chiều rộng của viewport bằng với chiều rộng của thiết bị.\n"
            + "\n"
            + "initial-scale=1.0: Không phóng to hoặc thu nhỏ khi trang web được tải lần đầu tiên.\n"
            + "\n"
            + "maximum-scale=1.0: Người dùng không thể phóng to quá mức.\n"
            + "\n"
            + "minimum-scale=1.0: Người dùng không thể thu nhỏ trang quá mức.\n"
            + "\n"
            + "user-scalable=no: Ngừng khả năng phóng to hoặc thu nhỏ trang web.",
            "Các thuộc tính quan trọng trong thẻ meta viewport giúp bạn kiểm soát cách hiển thị trang web trên các thiết bị di động và đảm bảo rằng trang web của bạn hiển thị đúng trên mọi kích thước màn hình.\n"
            + "\n"
            + "width, initial-scale, maximum-scale, minimum-scale, user-scalable là các thuộc tính thường xuyên được sử dụng trong thiết kế web đáp ứng."
        });
        Content_MAP.put("Vai trò của Viewport meta tag", new String[]{
            "1. Đảm bảo bố cục trang web phù hợp với màn hình của thiết bị\n"
            + "Thẻ meta viewport cho phép bạn thiết lập chiều rộng của viewport để phù hợp với kích thước màn hình của thiết bị, từ đó đảm bảo rằng trang web của bạn hiển thị đúng trên các loại màn hình khác nhau.\n"
            + "\n"
            + "Ví dụ, nếu không có thẻ này, trình duyệt có thể hiển thị trang web với một chiều rộng mặc định (ví dụ: 980px), khiến trang web bị thu nhỏ hoặc phóng to trên các thiết bị di động.\n"
            + "\n"
            + "Ví dụ:",
            "Điều này giúp chiều rộng của trang web được điều chỉnh sao cho vừa vặn với chiều rộng của thiết bị, tránh tình trạng người dùng phải cuộn ngang khi duyệt web trên thiết bị di động.\n"
            + "\n"
            + "2. Kiểm soát tỷ lệ phóng to và thu nhỏ\n"
            + "Thẻ meta viewport giúp kiểm soát khả năng phóng to và thu nhỏ của người dùng, đặc biệt khi bạn muốn ngừng hoặc giới hạn việc phóng to trang web.\n"
            + "\n"
            + "Nếu không sử dụng thẻ này, người dùng có thể dễ dàng phóng to hoặc thu nhỏ nội dung trang web, làm cho bố cục trở nên khó đọc hoặc khó sử dụng.\n"
            + "\n"
            + "Ví dụ:",
            "Điều này ngừng khả năng phóng to hoặc thu nhỏ trang web bằng cử chỉ pinch trên thiết bị di động.\n"
            + "\n"
            + "3. Tăng cường hiệu suất tải trang trên thiết bị di động\n"
            + "Việc sử dụng thẻ meta viewport giúp trình duyệt tự động tối ưu hóa cách trang web được hiển thị, giúp giảm bớt các vấn đề về việc hiển thị sai tỷ lệ hoặc phóng to quá mức, từ đó cải thiện trải nghiệm người dùng, đặc biệt là trên thiết bị di động.\n"
            + "\n"
            + "4. Hỗ trợ thiết kế đáp ứng (Responsive Design)\n"
            + "Thẻ meta viewport là một phần không thể thiếu trong thiết kế đáp ứng. Khi sử dụng đúng cách, nó giúp trang web thay đổi kích thước và bố cục sao cho phù hợp với các thiết bị khác nhau, từ điện thoại di động, máy tính bảng cho đến desktop.\n"
            + "\n"
            + "Responsive Web Design phụ thuộc vào việc kết hợp thẻ meta viewport với các media queries trong CSS để điều chỉnh giao diện của trang web sao cho phù hợp với các kích thước màn hình khác nhau.\n"
            + "\n"
            + "5. Giúp ngừng việc hiển thị sai lệch nội dung\n"
            + "Trình duyệt trên thiết bị di động không sử dụng thẻ meta viewport có thể hiển thị trang web với tỷ lệ không phù hợp (ví dụ: phóng to nội dung hoặc thu nhỏ quá mức). Việc sử dụng thẻ viewport giúp ngừng hiện tượng này, mang lại một giao diện trang web dễ đọc và dễ sử dụng.\n"
            + "\n"
            + "6. Tối ưu hóa trải nghiệm người dùng trên các thiết bị di động\n"
            + "Khi thiết lập đúng thẻ meta viewport, trang web sẽ tự động điều chỉnh để hiển thị đúng đắn trên các thiết bị có kích thước màn hình khác nhau. Điều này giúp người dùng có một trải nghiệm mượt mà và không bị gặp phải vấn đề với giao diện.",
            "Đảm bảo bố cục trang web tự động điều chỉnh cho phù hợp với các kích thước màn hình của thiết bị.\n"
            + "\n"
            + "Kiểm soát tỷ lệ phóng to và thu nhỏ của người dùng, giúp tránh tình trạng phóng to quá mức hoặc thu nhỏ quá mức trang web.\n"
            + "\n"
            + "Tăng cường hiệu suất tải trang và cải thiện trải nghiệm người dùng trên thiết bị di động.\n"
            + "\n"
            + "Hỗ trợ thiết kế đáp ứng và giúp trang web hiển thị tối ưu trên tất cả các thiết bị.\n"
            + "\n"
            + "Giúp ngừng việc hiển thị sai lệch nội dung, mang lại giao diện dễ đọc và dễ sử dụng",
            "width=device-width: Đảm bảo chiều rộng của trang web phù hợp với chiều rộng của thiết bị.\n"
            + "\n"
            + "initial-scale=1.0: Xác định tỷ lệ phóng to ban đầu là 1, không phóng to hoặc thu nhỏ trang khi tải lần đầu tiên."
        });
        //Css nang cao
        Content_MAP.put("display: flex là gì?", new String[]{
            "display: flex là một giá trị của thuộc tính display trong CSS, giúp tạo bố cục linh hoạt (Flexbox Layout) cho các phần tử HTML. Flexbox giúp dễ dàng căn chỉnh, phân phối không gian giữa các phần tử trong container ngay cả khi kích thước của chúng không xác định hoặc thay đổi.",
            "1. Flex Container\n"
            + "Là phần tử cha chứa các flex items, được thiết lập bằng display: flex hoặc display: inline-flex.",
            "2. Flex Items\n"
            + "Là các phần tử con trực tiếp nằm trong flex container.",
            "3. Main Axis\n"
            + "Trục chính mà các flex items được sắp xếp theo (mặc định là chiều ngang).",
            "4. Cross Axis\n"
            + "Trục vuông góc với main axis (mặc định là chiều dọc).",
            "1. flex-direction\n"
            + "Xác định hướng của main axis:",
            "2. flex-wrap\n"
            + "Xác định các items có xuống dòng khi không đủ chỗ hay không:",
            "3. justify-content\n"
            + "Căn chỉnh items dọc theo main axis:",
            "4. align-items\n"
            + "Căn chỉnh items dọc theo cross axis:",
            "5. align-content\n"
            + "Căn chỉnh các dòng items khi có nhiều dòng:",
            "1. order\n"
            + "Xác định thứ tự xuất hiện của item:",
            "2. flex-grow\n"
            + "Xác định khả năng phóng to của item khi có không gian thừa:",
            "3. flex-shrink\n"
            + "Xác định khả năng thu nhỏ của item khi thiếu không gian:",
            "4. flex-basis\n"
            + "Xác định kích thước ban đầu của item trước khi phân phối không gian thừa:",
            "5. align-self\n"
            + "Ghi đè căn chỉnh cho từng item riêng lẻ:",
            "Dễ dàng căn giữa phần tử theo cả chiều ngang và dọc\n"
            + "\n"
            + "Phân phối không gian linh hoạt giữa các phần tử\n"
            + "\n"
            + "Kiểm soát hướng và thứ tự hiển thị của phần tử\n"
            + "\n"
            + "Hỗ trợ responsive design tốt"
        });

        Content_MAP.put("Các thuộc tính chính của Flexbox", new String[]{
            "Flexbox (Flexible Box Layout) là một mô hình bố cục mạnh mẽ trong CSS giúp sắp xếp các phần tử một cách linh hoạt và hiệu quả. Dưới đây là các thuộc tính chính của Flexbox:",
            "display: flex | inline-flex\n"
            + "Xác định một phần tử là flex container.",
            "flex-direction: row | row-reverse | column | column-reverse\n"
            + "Xác định hướng chính của các flex items.",
            "flex-wrap: nowrap | wrap | wrap-reverse\n"
            + "Xác định các flex items có xuống dòng khi không đủ chỗ hay không.",
            "flex-flow: <flex-direction> <flex-wrap>\n"
            + "Cú pháp rút gọn cho flex-direction và flex-wrap.",
            "justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly\n"
            + "Căn chỉnh các items dọc theo trục chính.",
            "align-items: stretch | flex-start | flex-end | center | baseline\n"
            + "Căn chỉnh các items dọc theo trục vuông góc với trục chính.",
            "align-content: stretch | flex-start | flex-end | center | space-between | space-around\n"
            + "Căn chỉnh các dòng flex khi có nhiều dòng (chỉ có tác dụng khi flex-wrap: wrap).",
            "order: <integer>\n"
            + "Thay đổi thứ tự hiển thị của item (mặc định là 0).",
            "flex-grow: <number>\n"
            + "Xác định khả năng phóng to của item so với các item khác (mặc định là 0).",
            "flex-shrink: <number>\n"
            + "Xác định khả năng thu nhỏ của item so với các item khác (mặc định là 1).",
            "flex-basis: <length> | auto\n"
            + "Xác định kích thước ban đầu của item trước khi phân phối không gian còn lại.",
            "flex: <flex-grow> <flex-shrink> <flex-basis>\n"
            + "Cú pháp rút gọn cho flex-grow, flex-shrink và flex-basis.",
            "align-self: auto | flex-start | flex-end | center | baseline | stretch\n"
            + "Ghi đè căn chỉnh của item so với align-items của container."
        });

        Content_MAP.put("justify-content", new String[]{
            "justify-content là một thuộc tính CSS quan trọng trong Flexbox và Grid Layout, dùng để căn chỉnh các phần tử con theo trục chính (main axis) trong container.",
            "1. flex-start (Giá trị mặc định)\n"
            + "Các phần tử con sẽ được căn về đầu container.",
            "2. flex-end\n"
            + "Các phần tử con sẽ được căn về cuối container.",
            "3. center\n"
            + "Các phần tử con sẽ được căn giữa container.",
            "4. space-between\n"
            + "Các phần tử con sẽ được phân bố đều trong container, phần tử đầu ở đầu container, phần tử cuối ở cuối container, các phần tử còn lại chia đều khoảng trống.",
            "5. space-around\n"
            + "Các phần tử con sẽ được phân bố với khoảng trống xung quanh bằng nhau.",
            "6. space-evenly\n"
            + "Các phần tử con sẽ được phân bố với khoảng trống giữa chúng bằng nhau.",
            "justify-content cũng hoạt động trong Grid Layout để căn chỉnh các track (cột hoặc hàng) trong grid container.",
            "justify-content chỉ có tác dụng khi container có không gian thừa (extra space) dọc theo trục chính.\n"
            + "\n"
            + "Trong Flexbox, trục chính mặc định là chiều ngang (row), nhưng có thể thay đổi bằng flex-direction.\n"
            + "\n"
            + "Trong Grid, justify-content căn chỉnh các track (cột hoặc hàng) chứ không phải các item riêng lẻ.",
            "justify-content là một thuộc tính mạnh mẽ để kiểm soát bố cục và căn chỉnh trong CSS. Hiểu rõ cách sử dụng nó sẽ giúp bạn tạo ra các bố cục linh hoạt và đẹp mắt hơn."
        });

        Content_MAP.put("align-items", new String[]{
            "align-items là một thuộc tính CSS được sử dụng trong Flexbox và Grid Layout để căn chỉnh các items (phần tử con) dọc theo trục chéo (cross axis) của container.",
            "stretch (mặc định)\n"
            + "\n"
            + "flex-start / start\n"
            + "\n"
            + "flex-end / end\n"
            + "\n"
            + "center\n"
            + "\n"
            + "baseline",
            "1. stretch (giá trị mặc định)\n"
            + "Các items sẽ được kéo dãn để lấp đầy container theo chiều của trục chéo.",
            "2. flex-start hoặc start\n"
            + "Các items được căn ở đầu container theo trục chéo.",
            "3. flex-end hoặc end\n"
            + "Các items được căn ở cuối container theo trục chéo.",
            "4. center\n"
            + "Các items được căn giữa container theo trục chéo.",
            "5. baseline\n"
            + "Các items được căn theo baseline (đường cơ sở) của chúng.",
            "align-items áp dụng cho container chứ không phải các items riêng lẻ\n"
            + "\n"
            + "Để căn chỉnh từng item riêng lẻ, sử dụng thuộc tính align-self\n"
            + "\n"
            + "Trong Flexbox, trục chéo là trục vuông góc với trục chính (được xác định bởi flex-direction)\n"
            + "\n"
            + "Trong Grid Layout, align-items căn chỉnh các items trong grid cell theo trục dọc"
        });

        Content_MAP.put("align-self", new String[]{
            "Thuộc tính align-self trong CSS được sử dụng để căn chỉnh các item riêng lẻ bên trong một flex container hoặc grid container theo chiều dọc (cross axis). Nó ghi đè giá trị của thuộc tính align-items được áp dụng cho container.",
            "1. auto (mặc định)\n"
            + "Kế thừa giá trị từ thuộc tính align-items của container\n"
            + "\n"
            + "Nếu container không có align-items, giá trị mặc định là stretch",
            "2. flex-start\n"
            + "Căn item về phía đầu của cross axis",
            "3. flex-end\n"
            + "Căn item về phía cuối của cross axis",
            "4. center\n"
            + "Căn giữa item theo cross axis",
            "5. baseline\n"
            + "Căn item theo baseline của text",
            "6. stretch\n"
            + "Kéo dãn item để lấp đầy container theo cross axis (mặc định nếu không có chiều cao xác định)",
            "Sử dụng với Grid Layout\n"
            + "align-self cũng hoạt động tương tự trong Grid Layout:",
            "Khi bạn muốn ghi đè căn chỉnh của một item riêng lẻ khác với các item khác trong container\n"
            + "\n"
            + "Khi container có align-items nhưng bạn muốn một item có cách căn chỉnh khác\n"
            + "\n"
            + "Khi làm việc với flexbox hoặc grid layout và cần kiểm soát vị trí các item theo cross axis",
            "align-self chỉ có tác dụng khi phần tử là flex item hoặc grid item\n"
            + "\n"
            + "Nếu phần tử không phải là flex/grid item, align-self không có hiệu lực\n"
            + "\n"
            + "Trong flexbox, align-self hoạt động theo cross axis (thường là chiều dọc)\n"
            + "\n"
            + "Trong grid, align-self căn chỉnh item trong vùng grid area theo chiều block (dọc)"
        });

        Content_MAP.put("flex-wrap", new String[]{
            "Thuộc tính flex-wrap xác định cách các flex items sẽ được sắp xếp khi không đủ không gian trong flex container.",
            "1. nowrap (giá trị mặc định)\n"
            + "Các flex items sẽ không xuống dòng, chúng sẽ co lại để vừa với container\n"
            + "\n"
            + "Nếu không đủ không gian, các items có thể bị tràn ra ngoài container",
            "2. wrap\n"
            + "Các flex items sẽ xuống dòng khi không đủ không gian\n"
            + "\n"
            + "Dòng đầu tiên sẽ ở trên cùng của container",
            "3. wrap-reverse\n"
            + "Các flex items sẽ xuống dòng khi không đủ không gian\n"
            + "\n"
            + "Dòng đầu tiên sẽ ở dưới cùng của container (ngược với wrap)",
            "flex-wrap thường được sử dụng cùng với flex-direction thông qua shorthand property flex-flow:",
            "Khi bạn muốn các items tự động xuống dòng khi không đủ không gian\n"
            + "\n"
            + "Khi tạo layout responsive mà không muốn items bị co lại quá nhiều\n"
            + "\n"
            + "Khi muốn kiểm soát hướng và cách các items xuống dòng"
        });

        Content_MAP.put("flex-direction", new String[]{
            "1. Giới thiệu\n"
            + "flex-direction xác định hướng chính (main axis) mà các flex items sẽ được sắp xếp trong flex container.",
            "2. Các giá trị của flex-direction\n"
            + "a. row (giá trị mặc định)\n"
            + "Các flex items được sắp xếp từ trái sang phải (trong layout ngang)\n"
            + "\n"
            + "Main axis chạy theo chiều ngang\n"
            + "\n"
            + "Cross axis chạy theo chiều dọc",
            "b. row-reverse\n"
            + "Các flex items được sắp xếp từ phải sang trái\n"
            + "\n"
            + "Main axis vẫn chạy theo chiều ngang nhưng bị đảo ngược",
            "c. column\n"
            + "Các flex items được sắp xếp từ trên xuống dưới\n"
            + "\n"
            + "Main axis chạy theo chiều dọc\n"
            + "\n"
            + "Cross axis chạy theo chiều ngang",
            "d. column-reverse\n"
            + "Các flex items được sắp xếp từ dưới lên trên\n"
            + "\n"
            + "Main axis vẫn chạy theo chiều dọc nhưng bị đảo ngược",
            "3. Code mẫu",
            "4. Lưu ý quan trọng\n"
            + "flex-direction chỉ có tác dụng khi phần tử cha được thiết lập display: flex hoặc display: inline-flex\n"
            + "\n"
            + "Thuộc tính này ảnh hưởng đến:\n"
            + "\n"
            + "Hướng của main axis (trục chính)\n"
            + "\n"
            + "Thứ tự sắp xếp các flex items\n"
            + "\n"
            + "Hướng bắt đầu của flex items\n"
            + "\n"
            + "Khi thay đổi flex-direction, các thuộc tính như justify-content và align-items cũng sẽ thay đổi hướng tương ứng",
            "5. Ứng dụng thực tế\n"
            + "row: Thích hợp cho navigation bars, card layouts ngang\n"
            + "\n"
            + "column: Thích hợp cho mobile layouts, sidebar menus\n"
            + "\n"
            + "row-reverse/column-reverse: Hữu ích khi muốn đảo ngược thứ tự mà không cần thay đổi HTML"
        });

        Content_MAP.put("display: grid là gì?", new String[]{
            "display: grid là một giá trị của thuộc tính display trong CSS, cho phép tạo bố cục lưới (grid layout) hai chiều cho các phần tử HTML. Đây là một trong những phương pháp mạnh mẽ nhất để thiết kế bố cục trang web hiện đại.",
            "CSS Grid Layout là hệ thống bố cục hai chiều (theo hàng và cột) giúp sắp xếp các phần tử trên trang web một cách dễ dàng và linh hoạt.",
            "Ưu điểm:\n"
            + "\n"
            + "Dễ dàng căn chỉnh và phân bố không gian\n"
            + "\n"
            + "Hỗ trợ responsive design\n"
            + "\n"
            + "Kiểm soát cả hàng và cột cùng lúc\n"
            + "\n"
            + "Giảm nhu cầu sử dụng float hay position",
            "2.1. Thuộc tính cho container (cha)",
            "2.2. Thuộc tính cho items (con)",
            "3.1. Đơn vị đo lường\n"
            + "fr: Đơn vị phân số (fraction)\n"
            + "\n"
            + "px, %, em, rem: Các đơn vị thông thường\n"
            + "\n"
            + "auto: Tự động điều chỉnh\n"
            + "\n"
            + "min-content, max-content: Theo nội dung",
            "3.2. Hàm và từ khóa\n"
            + "repeat(): Lặp lại mẫu\n"
            + "\n"
            + "minmax(): Xác định khoảng giá trị\n"
            + "\n"
            + "fit-content(): Điều chỉnh theo nội dung\n"
            + "\n"
            + "auto-fill, auto-fit: Tự động điền",
            "4.1. Căn chỉnh items\n"
            + "justify-items: Căn ngang\n"
            + "\n"
            + "align-items: Căn dọc\n"
            + "\n"
            + "place-items: Kết hợp cả hai",
            "4.2. Căn chỉnh content\n"
            + "justify-content: Căn ngang toàn bộ grid\n"
            + "\n"
            + "align-content: Căn dọc toàn bộ grid\n"
            + "\n"
            + "place-content: Kết hợp cả hai",
            "Cho phép định nghĩa bố cục bằng tên vùng"
        });

        Content_MAP.put("Các thuộc tính chính của CSS Grid", new String[]{
            "Grid Layout là một hệ thống bố cục mạnh mẽ trong CSS cho phép tạo các layout phức tạp một cách dễ dàng. Dưới đây là các thuộc tính chính của Grid:",
            "display: grid\n"
            + "Xác định phần tử là một grid container.",
            "grid-template-columns và grid-template-rows\n"
            + "Xác định số lượng và kích thước của các cột và hàng.",
            "grid-template-areas\n"
            + "Xác định layout bằng cách đặt tên cho các vùng.",
            "gap (grid-gap)\n"
            + "Xác định khoảng cách giữa các ô grid.",
            "justify-items và align-items\n"
            + "Căn chỉnh nội dung bên trong các ô grid theo chiều ngang và dọc.",
            "justify-content và align-content\n"
            + "Căn chỉnh toàn bộ grid trong container khi có không gian thừa.",
            "grid-column và grid-row\n"
            + "Xác định vị trí của item trong grid.",
            "grid-area\n"
            + "Gán item vào vùng được đặt tên hoặc xác định vị trí.",
            "justify-self và align-self\n"
            + "Căn chỉnh riêng cho từng item.",
            "repeat()\n"
            + "Lặp lại pattern cho cột hoặc hàng.",
            "fr unit\n"
            + "Đơn vị phân số, chia không gian còn lại.",
            "minmax()\n"
            + "Xác định kích thước tối thiểu và tối đa.",
            "auto-fill và auto-fit\n"
            + "Tự động điều chỉnh số lượng cột/hàng.",
            "Trong ví dụ này:\n"
            + "\n"
            + "Tạo một grid container với 3 cột bằng nhau và 3 hàng\n"
            + "\n"
            + "Sử dụng grid-template-areas để xác định bố cục\n"
            + "\n"
            + "Các grid item được gán vào các vùng tương ứng\n"
            + "\n"
            + "Có khoảng cách 10px giữa các item\n"
            + "\n"
            + "Sử dụng flexbox để căn giữa nội dung trong header và footer"
        });

        Content_MAP.put("Khái Niệm về CSS Grid Layout", new String[]{
            "CSS Grid Layout (hay còn gọi là Grid) là một hệ thống bố cục hai chiều (2D) mạnh mẽ trong CSS, cho phép bạn thiết kế các bố cục phức tạp một cách dễ dàng bằng cách chia không gian thành các hàng và cột.",
            "Ưu điểm:\n"
            + "\n"
            + "Dễ dàng tạo bố cục phức tạp mà không cần float hay positioning\n"
            + "\n"
            + "Kiểm soát cả chiều ngang và chiều dọc\n"
            + "\n"
            + "Responsive dễ dàng\n"
            + "\n"
            + "Code ngắn gọn và dễ bảo trì hơn",
            "Grid Container\n"
            + "Là phần tử cha chứa grid, được khai báo bằng display: grid hoặc display: inline-grid.",
            "Grid Item\n"
            + "Là các phần tử con trực tiếp của grid container.",
            "Grid Line\n"
            + "Các đường phân chia giữa các cột và hàng.",
            "Grid Track\n"
            + "Khoảng cách giữa hai grid line liên tiếp (một hàng hoặc một cột).",
            "Grid Cell\n"
            + "Giao điểm giữa một hàng và một cột (giống ô trong bảng).",
            "Grid Area\n"
            + "Một hoặc nhiều grid cell tạo thành một vùng hình chữ nhật.",
            "grid-template-columns/grid-template-rows\n"
            + "Xác định số cột/hàng và kích thước của chúng.",
            "grid-template-areas\n"
            + "Xác định bố cục bằng cách đặt tên cho các vùng.",
            "gap (grid-gap)\n"
            + "Xác định khoảng cách giữa các cột và hàng.",
            "justify-items/align-items\n"
            + "Căn chỉnh nội dung bên trong grid items theo chiều ngang/dọc.",
            "justify-content/align-content\n"
            + "Căn chỉnh toàn bộ grid trong container.",
            "grid-column/grid-row\n"
            + "Xác định vị trí của item bằng cách chỉ định grid lines.",
            "grid-area\n"
            + "Gán item vào một vùng được đặt tên hoặc xác định vị trí.",
            "justify-self/align-self\n"
            + "Căn chỉnh riêng cho từng item.",
            "repeat()",
            "minmax()",
            "fr unit\n"
            + "Đơn vị phân chia không gian còn lại.",
            "auto-fit vs auto-fill",
            "Grid và Flexbox có thể kết hợp với nhau để tạo bố cục linh hoạt:"
        });

        Content_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new String[]{
            "CSS Grid là một hệ thống bố cục mạnh mẽ cho phép tạo các layout phức tạp một cách dễ dàng. Dưới đây là các thuộc tính chính của CSS Grid cùng với code mẫu:",
            "display: grid\n"
            + "Xác định phần tử là một grid container.",
            "grid-template-columns và grid-template-rows\n"
            + "Xác định số lượng và kích thước của các cột và hàng.",
            "grid-template-areas\n"
            + "Xác định layout bằng cách sử dụng tên vùng.",
            "grid-gap (hoặc gap)\n"
            + "Xác định khoảng cách giữa các ô grid.\n"
            + "\n"
            + "css",
            "justify-items và align-items\n"
            + "Căn chỉnh nội dung bên trong các ô grid theo chiều ngang và dọc.",
            "grid-column và grid-row\n"
            + "Xác định vị trí của item trong grid.",
            "grid-area\n"
            + "Gán item vào một vùng được đặt tên hoặc xác định vị trí.",
            "justify-self và align-self\n"
            + "Căn chỉnh riêng cho từng item.",
            "grid-auto-columns và grid-auto-rows\n"
            + "Xác định kích thước cho các cột/hàng tự động tạo ra.",
            "grid-auto-flow\n"
            + "Kiểm soát cách các item tự động đặt vào grid.",
            "Trong ví dụ này:\n"
            + "\n"
            + "Tạo một grid container với 3 cột và 3 hàng\n"
            + "\n"
            + "Sử dụng grid-template-areas để xác định layout\n"
            + "\n"
            + "Mỗi phần (header, sidebar, main, aside, footer) được đặt vào vùng tương ứng\n"
            + "\n"
            + "Có khoảng cách 10px giữa các ô\n"
            + "\n"
            + "Các item được căn giữa và có màu nền khác nhau để dễ phân biệt"
        });

        Content_MAP.put("Chi Tiết về Các Thuộc Tính", new String[]{
            "a. Thuộc tính cơ bản",
            "b. Thuộc tính form",
            "a. Thuộc tính văn bản",
            "b. Thuộc tính box model",
            "c. Thuộc tính hiển thị và vị trí",
            "d. Thuộc tính chuyển đổi và hoạt ảnh",
            "e. Thuộc tính responsive",
            "a. Flexbox",
            "b. Grid",
            "c. Biến CSS (Custom Properties)"
        });

        Content_MAP.put("Khái Niệm", new String[]{
            "Media Queries là một kỹ thuật quan trọng trong CSS3 cho phép bạn áp dụng các kiểu CSS khác nhau dựa trên các điều kiện như kích thước màn hình, độ phân giải, hướng thiết bị và các đặc điểm khác của thiết bị hiển thị.",
            "Media Query bao gồm một loại phương tiện (media type) và một hoặc nhiều biểu thức kiểm tra điều kiện.",
            "Ví dụ cơ bản:",
            "all: Phù hợp với tất cả các thiết bị\n"
            + "\n"
            + "screen: Dành cho màn hình máy tính, tablet, smartphone\n"
            + "\n"
            + "print: Dành cho máy in hoặc chế độ xem trước khi in\n"
            + "\n"
            + "speech: Dành cho trình đọc màn hình\n"
            + "\n"
            + "Ví dụ:",
            "a. Kích thước viewport\n"
            + "width: Chiều rộng viewport\n"
            + "\n"
            + "height: Chiều cao viewport\n"
            + "\n"
            + "min-width: Chiều rộng tối thiểu\n"
            + "\n"
            + "max-width: Chiều rộng tối đa\n"
            + "\n"
            + "min-height: Chiều cao tối thiểu\n"
            + "\n"
            + "max-height: Chiều cao tối đa\n"
            + "\n"
            + "Ví dụ:",
            "b. Hướng màn hình\n"
            + "orientation: portrait (dọc) hoặc landscape (ngang)",
            "c. Tỷ lệ màn hình và độ phân giải\n"
            + "aspect-ratio: Tỷ lệ giữa chiều rộng và chiều cao\n"
            + "\n"
            + "resolution: Độ phân giải màn hình (dpi, dpcm)\n"
            + "\n"
            + "min-resolution, max-resolution",
            "d. Các tính năng khác\n"
            + "hover: Kiểm tra thiết bị có hỗ trợ hover không\n"
            + "\n"
            + "pointer: Kiểm tra loại con trỏ (fine, coarse, none)\n"
            + "\n"
            + "prefers-color-scheme: Chế độ sáng/tối",
            "a. Trong file CSS",
            "b. Trong thẻ <link>",
            "c. Sử dụng với @import",
            "Dưới đây là các breakpoint thường dùng cho các thiết bị khác nhau:",
            "Dưới đây là một ví dụ hoàn chỉnh về responsive design sử dụng Media Queries:",
            "Mobile First: Bắt đầu với kiểu cho màn hình nhỏ nhất rồi mở rộng lên\n"
            + "\n"
            + "Sử dụng min-width thay vì max-width: Dễ quản lý và mở rộng hơn\n"
            + "\n"
            + "Nhóm các Media Queries liên quan: Giúp code dễ đọc và bảo trì\n"
            + "\n"
            + "Tránh quá nhiều breakpoint: Chỉ sử dụng khi thực sự cần thiết\n"
            + "\n"
            + "Kiểm tra trên nhiều thiết bị: Đảm bảo hiển thị đúng trên các kích thước khác nhau"
        });

        Content_MAP.put("Cách Sử Dụng Media Queries", new String[]{
            "Media Queries là một kỹ thuật quan trọng trong thiết kế web responsive, cho phép áp dụng các kiểu CSS khác nhau tùy thuộc vào đặc điểm của thiết bị (như chiều rộng màn hình, độ phân giải, hướng màn hình).",
            "Media Query có cú pháp như sau:",
            "Ví dụ cơ bản:",
            "Có các loại media type chính:\n"
            + "\n"
            + "all: Áp dụng cho tất cả thiết bị\n"
            + "\n"
            + "print: Áp dụng khi in ấn\n"
            + "\n"
            + "screen: Áp dụng cho màn hình máy tính, tablet, smartphone\n"
            + "\n"
            + "speech: Áp dụng cho trình đọc màn hình",
            "Ví dụ với media type:",
            "width, min-width, max-width: Chiều rộng viewport\n"
            + "\n"
            + "height, min-height, max-height: Chiều cao viewport\n"
            + "\n"
            + "orientation: Hướng màn hình (portrait/landscape)\n"
            + "\n"
            + "resolution: Độ phân giải\n"
            + "\n"
            + "aspect-ratio: Tỉ lệ khung hình",
            "Ví dụ với nhiều media features:",
            "Các breakpoint thường dùng cho thiết kế responsive:",
            "Dưới đây là một ví dụ hoàn chỉnh về sử dụng media queries:",
            "Bạn cũng có thể áp dụng media queries trực tiếp trong thẻ <link> để tải các file CSS khác nhau:",
            "Bạn có thể sử dụng các toán tử logic như and, or (dấu phẩy), not:",
            "Media Queries là công cụ mạnh mẽ để tạo các trang web responsive. Bằng cách sử dụng chúng một cách hiệu quả, bạn có thể đảm bảo trang web của mình hiển thị đẹp trên mọi thiết bị từ điện thoại di động đến màn hình máy tính lớn."
        });

        Content_MAP.put("Tại Sao Media Queries Quan Trọng?", new String[]{
            "Media Queries là một kỹ thuật cực kỳ quan trọng trong thiết kế web hiện đại, đặc biệt là trong thời đại đa thiết bị như hiện nay. Dưới đây là phân tích đầy đủ về tầm quan trọng và cách sử dụng Media Queries.",
            "Nội dung: Media Queries cho phép bạn áp dụng các quy tắc CSS khác nhau tùy thuộc vào đặc điểm của thiết bị (như chiều rộng màn hình, độ phân giải, hướng màn hình). Điều này giúp tạo ra các trang web đáp ứng (responsive) có thể hiển thị tốt trên mọi thiết bị từ điện thoại đến máy tính bảng và desktop.",
            "Tầm quan trọng:\n"
            + "\n"
            + "Đảm bảo trải nghiệm người dùng tốt trên mọi thiết bị\n"
            + "\n"
            + "Tăng khả năng tiếp cận trang web\n"
            + "\n"
            + "Cải thiện thứ hạng SEO (Google ưu tiên các trang web responsive)\n"
            + "\n"
            + "Giảm tỷ lệ thoát trang do giao diện không phù hợp"
        });

        Content_MAP.put("Mobile-first", new String[]{
            "Mobile-First là một phương pháp thiết kế web bắt đầu từ việc thiết kế cho màn hình nhỏ (mobile) trước, sau đó mở rộng ra các màn hình lớn hơn (tablet, desktop) thông qua media queries.",
            "Ưu tiên trải nghiệm mobile: Ngày càng nhiều người dùng truy cập web bằng thiết bị di động\n"
            + "\n"
            + "Hiệu suất tốt hơn: Bắt đầu từ mobile buộc bạn tập trung vào những yếu tố cốt lõi\n"
            + "\n"
            + "Dễ mở rộng: Dễ dàng thêm styles cho màn hình lớn hơn là phải cắt giảm từ desktop xuống mobile",
            "Bắt đầu với CSS đơn giản: Chỉ định kiểu cơ bản trước, không cần media queries\n"
            + "\n"
            + "Sử dụng min-width: Media queries nên sử dụng min-width thay vì max-width\n"
            + "\n"
            + "Tối ưu hình ảnh: Sử dụng hình ảnh có kích thước phù hợp cho mobile\n"
            + "\n"
            + "Kiểm tra trên thiết bị thực: Đừng chỉ dựa vào trình duyệt desktop\n"
            + "\n"
            + "Ưu tiên nội dung: Tập trung vào nội dung quan trọng trước",
            "Mobile-First không chỉ là về kích thước màn hình mà là một triết lý thiết kế tập trung vào trải nghiệm người dùng trên thiết bị di động trước tiên. Bằng cách bắt đầu từ mobile, bạn đảm bảo rằng website của mình sẽ hoạt động tốt trên tất cả các thiết bị, từ nhỏ đến lớn."
        });

        Content_MAP.put("Desktop-first", new String[]{
            "Desktop-first là một phương pháp thiết kế web bắt đầu từ thiết kế cho màn hình desktop trước, sau đó điều chỉnh cho các thiết bị nhỏ hơn bằng media queries. Đây là cách tiếp cận ngược lại với Mobile-first.",
            "Desktop-first có nghĩa là:\n"
            + "\n"
            + "Bắt đầu thiết kế cho màn hình lớn (desktop) trước\n"
            + "\n"
            + "Sử dụng max-width trong media queries để điều chỉnh cho các kích thước màn hình nhỏ hơn\n"
            + "\n"
            + "Thường sử dụng các breakpoint giảm dần",
            "Dễ dàng cho các website có lượng truy cập chủ yếu từ desktop\n"
            + "\n"
            + "Phù hợp với các ứng dụng phức tạp cần nhiều không gian\n"
            + "\n"
            + "Tương thích tốt với các trình duyệt cũ",
            "Có thể tải nhiều code không cần thiết cho mobile\n"
            + "\n"
            + "Cần chú ý performance trên mobile\n"
            + "\n"
            + "Không được khuyến khích bằng mobile-first trong nhiều trường hợp",
            "Phần desktop (default):\n"
            + "\n"
            + "Layout với container rộng 1200px\n"
            + "\n"
            + "Navigation ngang\n"
            + "\n"
            + "Main content và sidebar nằm cạnh nhau (flex)",
            "Các breakpoint:\n"
            + "\n"
            + "1200px: Điều chỉnh container thành full width\n"
            + "\n"
            + "992px: Thay đổi navigation thành wrap và chuyển layout thành cột\n"
            + "\n"
            + "768px: Điều chỉnh padding và font-size\n"
            + "\n"
            + "576px: Chuyển navigation thành dọc",
            "Cách sắp xếp media queries:\n"
            + "\n"
            + "Sắp xếp từ lớn đến nhỏ (max-width giảm dần)\n"
            + "\n"
            + "Các styles nhỏ hơn sẽ ghi đè lên styles lớn hơn khi màn hình thu nhỏ"
        });

        Content_MAP.put("So Sánh Mobile-first và Desktop-first", new String[]{
            "Là phương pháp thiết kế và phát triển giao diện web bắt đầu từ thiết bị di động trước, sau đó mở rộng ra các màn hình lớn hơn như tablet và desktop.",
            "Ưu điểm:\n"
            + "\n"
            + "Tối ưu cho trải nghiệm di động (đang chiếm đa số)\n"
            + "\n"
            + "Hiệu suất tốt hơn do ưu tiên tải nội dung cốt lõi trước\n"
            + "\n"
            + "Dễ dàng mở rộng lên các màn hình lớn hơn",
            "Là phương pháp truyền thống, bắt đầu thiết kế cho màn hình desktop trước rồi mới thu nhỏ xuống các thiết bị nhỏ hơn.",
            "Ưu điểm:\n"
            + "\n"
            + "Phù hợp với các ứng dụng phức tạp cần nhiều không gian\n"
            + "\n"
            + "Dễ triển khai với các hệ thống cũ\n"
            + "\n"
            + "Quen thuộc với nhiều developer",
            "Mobile-First Code Mẫu",
            "Desktop-First Code Mẫu",
            "Tiêu chí	Mobile-First	Desktop-First\n"
            + "Hướng tiếp cận	Bắt đầu từ mobile -> mở rộng lên	Bắt đầu từ desktop -> thu nhỏ xuống\n"
            + "Media Queries	Sử dụng min-width	Sử dụng max-width\n"
            + "Hiệu suất	Tốt hơn do ưu tiên tải nội dung cốt lõi	Có thể tải nhiều resource không cần thiết\n"
            + "Độ phức tạp	Đơn giản khi mở rộng	Phức tạp khi cần tối ưu cho mobile\n"
            + "Phù hợp	Website content-heavy, người dùng di động	Ứng dụng phức tạp, người dùng desktop",
            "Nên dùng Mobile-First khi:\n"
            + "Đối tượng người dùng chủ yếu là mobile\n"
            + "\n"
            + "Website cần tối ưu tốc độ tải trang\n"
            + "\n"
            + "Dự án mới, không bị ràng buộc bởi hệ thống cũ\n"
            + "\n"
            + "Ưu tiên trải nghiệm người dùng di động",
            "Nên dùng Desktop-First khi:\n"
            + "Ứng dụng quản trị, dashboard phức tạp\n"
            + "\n"
            + "Hệ thống cũ đã được xây dựng theo cách này\n"
            + "\n"
            + "Đối tượng người dùng chủ yếu là desktop\n"
            + "\n"
            + "Cần nhiều không gian hiển thị và tính năng phức tạp",
            "Cho Mobile-First:\n"
            + "Bắt đầu với CSS cho màn hình nhỏ nhất\n"
            + "\n"
            + "Sử dụng min-width trong media queries\n"
            + "\n"
            + "Ưu tiên nội dung cốt lõi, giảm thiểu resource\n"
            + "\n"
            + "Kiểm tra trên thiết bị thật khi có thể",
            "Cho Desktop-First:\n"
            + "Bắt đầu với CSS cho màn hình lớn\n"
            + "\n"
            + "Sử dụng max-width trong media queries\n"
            + "\n"
            + "Chú ý đến hiệu suất trên mobile\n"
            + "\n"
            + "Cân nhắc sử dụng conditional loading cho mobile",
            "Cả hai phương pháp đều có ưu nhược điểm riêng. Mobile-First đang là xu hướng chủ đạo do sự phổ biến của thiết bị di động, nhưng Desktop-First vẫn có giá trị trong nhiều trường hợp. Lựa chọn phương pháp nào phụ thuộc vào đối tượng người dùng, yêu cầu dự án và nguồn lực hiện có."
        });

        Content_MAP.put("CSS Container Queries", new String[]{
            "Container Queries là một tính năng mới trong CSS cho phép bạn áp dụng kiểu dáng cho các phần tử dựa trên kích thước của container cha thay vì kích thước viewport (như Media Queries). Đây là một bước tiến lớn trong thiết kế responsive.",
            "Để sử dụng Container Queries, bạn cần thực hiện 3 bước:",
            "1.1. Định nghĩa một container",
            "1.2. Viết query dựa trên container",
            "1.3. Các đơn vị mới liên quan đến container\n"
            + "CSS cung cấp các đơn vị mới để làm việc với container:",
            "Dưới đây là một ví dụ hoàn chỉnh về cách sử dụng Container Queries:",
            "3.1. Thẻ sản phẩm (Product Cards)\n"
            + "Như ví dụ trên, các thẻ sản phẩm có thể thay đổi layout dựa trên kích thước container của chúng.",
            "3.2. Component trong CMS",
            "3.3. Form controls",
            "Hỗ trợ trình duyệt: Tính đến 2023, Container Queries đã được hỗ trợ trong hầu hết các trình duyệt hiện đại (Chrome, Edge, Firefox, Safari). Tuy nhiên, nên kiểm tra caniuse.com để xem tình trạng hỗ trợ mới nhất.\n"
            + "\n"
            + "Performance: Container Queries có thể ảnh hưởng đến hiệu suất nếu sử dụng quá nhiều trên một trang.\n"
            + "\n"
            + "Kết hợp với Media Queries: Bạn có thể kết hợp cả hai:"
        });

        Content_MAP.put("Transition", new String[]{
            "Transition là một tính năng quan trọng trong CSS cho phép bạn tạo hiệu ứng chuyển đổi mượt mà giữa các trạng thái của phần tử khi có sự thay đổi thuộc tính CSS.",
            "1. transition-property\n"
            + "Xác định thuộc tính CSS nào sẽ có hiệu ứng chuyển tiếp.",
            "2. transition-duration\n"
            + "Xác định thời gian diễn ra hiệu ứng chuyển tiếp.",
            "3. transition-timing-function\n"
            + "Xác định tốc độ thay đổi của hiệu ứng theo thời gian.",
            "Các giá trị phổ biến:\n"
            + "\n"
            + "ease (mặc định): chậm bắt đầu, nhanh giữa, chậm kết thúc\n"
            + "\n"
            + "linear: tốc độ không đổi\n"
            + "\n"
            + "ease-in: chậm bắt đầu\n"
            + "\n"
            + "ease-out: chậm kết thúc\n"
            + "\n"
            + "ease-in-out: chậm bắt đầu và kết thúc\n"
            + "\n"
            + "cubic-bezier(n,n,n,n): tự định nghĩa hàm timing",
            "4. transition-delay\n"
            + "Xác định độ trễ trước khi hiệu ứng bắt đầu.",
            "5. Cú pháp rút gọn transition\n"
            + "Có thể kết hợp tất cả các thuộc tính transition trong một dòng.",
            "Không phải tất cả thuộc tính CSS đều có thể áp dụng transition\n"
            + "\n"
            + "Hiệu ứng transition chỉ hoạt động khi có sự thay đổi giá trị thuộc tính\n"
            + "\n"
            + "Nên sử dụng các giá trị timing-function phù hợp với từng ngữ cảnh\n"
            + "\n"
            + "Transition hoạt động tốt nhất với các thay đổi trạng thái như hover, focus, active"
        });

        Content_MAP.put("Animation", new String[]{
            "Animation là một kỹ thuật quan trọng trong thiết kế web giúp tạo các hiệu ứng chuyển động, làm cho trang web trở nên sinh động và hấp dẫn hơn.",
            "CSS Transitions cho phép bạn thay đổi giá trị thuộc tính một cách mượt mà trong một khoảng thời gian xác định.",
            "Các thuộc tính chính:\n"
            + "transition-property: Thuộc tính sẽ áp dụng hiệu ứng\n"
            + "\n"
            + "transition-duration: Thời gian diễn ra hiệu ứng\n"
            + "\n"
            + "transition-timing-function: Hàm thời gian của hiệu ứng\n"
            + "\n"
            + "transition-delay: Thời gian trễ trước khi hiệu ứng bắt đầu",
            "CSS Animations mạnh mẽ hơn transitions, cho phép tạo các chuyển động phức tạp với nhiều keyframes.",
            "Các thuộc tính chính:\n"
            + "animation-name: Tên animation (khai báo trong @keyframes)\n"
            + "\n"
            + "animation-duration: Thời gian thực hiện animation\n"
            + "\n"
            + "animation-timing-function: Hàm thời gian\n"
            + "\n"
            + "animation-delay: Thời gian trễ\n"
            + "\n"
            + "animation-iteration-count: Số lần lặp\n"
            + "\n"
            + "animation-direction: Hướng chạy animation\n"
            + "\n"
            + "animation-fill-mode: Trạng thái trước/sau khi animation chạy\n"
            + "\n"
            + "animation-play-state: Trạng thái chạy/dừng",
            "CSS Transform cho phép thay đổi hình dạng, vị trí của phần tử.",
            "Các hàm transform phổ biến:\n"
            + "translate(): Di chuyển phần tử\n"
            + "\n"
            + "rotate(): Xoay phần tử\n"
            + "\n"
            + "scale(): Thay đổi kích thước\n"
            + "\n"
            + "skew(): Làm nghiêng phần tử\n"
            + "\n"
            + "matrix(): Kết hợp các phép biến đổi",
            "JavaScript có thể được sử dụng để kiểm soát animation một cách linh hoạt hơn",
            "a. Animate.css\n"
            + "Thư viện CSS animation đơn giản, dễ sử dụng.",
            "b. GSAP (GreenSock Animation Platform)\n"
            + "Thư viện JavaScript mạnh mẽ cho animation phức tạp.",
            "Hiệu suất: Ưu tiên sử dụng transform và opacity vì chúng không gây ra reflow\n"
            + "\n"
            + "Đơn giản: Không nên lạm dụng quá nhiều animation\n"
            + "\n"
            + "Truy cập: Cung cấp tùy chọn tắt animation cho người dùng nhạy cảm\n"
            + "\n"
            + "Thời gian: Giữ animation ngắn gọn (thường 200-500ms)\n"
            + "\n"
            + "Hỗ trợ trình duyệt: Luôn có fallback cho trình duyệt cũ"
        });

        Content_MAP.put("Keyframes", new String[]{
            "Keyframes là một tính năng mạnh mẽ trong CSS cho phép bạn tạo các hiệu ứng hoạt hình (animation) bằng cách định nghĩa các trạng thái (styles) tại các điểm khác nhau trong chuỗi hoạt hình.",
            "1. Cú pháp cơ bản\n"
            + "Keyframes được định nghĩa bằng quy tắc @keyframes trong CSS:",
            "Hoặc sử dụng phần trăm:",
            "2. Các thành phần chính\n"
            + "a. Tên hoạt hình\n"
            + "Bạn có thể đặt bất kỳ tên nào cho hoạt hình\n"
            + "\n"
            + "Tên nên mô tả được mục đích của hoạt hình\n"
            + "\n"
            + "Ví dụ: fadeIn, slideOut, bounce, rotate360",
            "b. Các điểm keyframe\n"
            + "Được xác định bằng phần trăm (0% đến 100%) hoặc từ khóa from (0%) và to (100%)\n"
            + "\n"
            + "Mỗi điểm keyframe chứa các thuộc tính CSS sẽ được áp dụng tại thời điểm đó",
            "c. Thuộc tính CSS trong keyframes\n"
            + "Bất kỳ thuộc tính CSS nào có thể chuyển đổi được đều có thể sử dụng\n"
            + "\n"
            + "Ví dụ: opacity, transform, color, background, width, height, v.v.",
            "3. Áp dụng hoạt hình cho phần tử\n"
            + "Sau khi định nghĩa keyframes, bạn áp dụng nó cho phần tử bằng thuộc tính animation:",
            "4. Các thuộc tính animation đi kèm\n"
            + "animation-name: Tên của @keyframes\n"
            + "\n"
            + "animation-duration: Thời gian hoàn thành 1 chu kỳ\n"
            + "\n"
            + "animation-timing-function: Hàm thời gian (ease, linear, ease-in, etc.)\n"
            + "\n"
            + "animation-delay: Thời gian trước khi bắt đầu\n"
            + "\n"
            + "animation-iteration-count: Số lần lặp (number hoặc infinite)\n"
            + "\n"
            + "animation-direction: Hướng (normal, reverse, alternate, alternate-reverse)\n"
            + "\n"
            + "animation-fill-mode: Trạng thái trước/sau khi hoạt hình (none, forwards, backwards, both)\n"
            + "\n"
            + "animation-play-state: Trạng thái phát (running hoặc paused)",
            "Ví dụ 1: Fade In đơn giản",
            "Ví dụ 2: Di chuyển và xoay",
            "Ví dụ 3: Hoạt hình phức tạp với nhiều điểm keyframe",
            "Ví dụ 4: Hoạt hình với nhiều thuộc tính animation"
        });

        Content_MAP.put("Hover effect nâng cao", new String[]{
            "Hover effect là hiệu ứng xảy ra khi người dùng di chuột qua một phần tử trên trang web. Dưới đây là hướng dẫn đầy đủ về các hiệu ứng hover nâng cao với code mẫu.",
            "1.1. Hiệu ứng chuyển đổi màu sắc (Color Transition)",
            "1.2. Hiệu ứng phóng to (Scale Effect)",
            "1.3. Hiệu ứng xoay (Rotate Effect)",
            "1.4. Hiệu ứng đổ bóng (Box Shadow)",
            "1.5. Hiệu ứng chữ (Text Effect)",
            "3.1. Hiệu ứng phóng to hình ảnh",
            "3.2. Hiệu ứng lật hình ảnh",
            "Các hiệu ứng hover nâng cao giúp tăng tính tương tác và trải nghiệm người dùng trên website. Bằng cách kết hợp các thuộc tính CSS như transform, transition, animation và pseudo-elements, bạn có thể tạo ra những hiệu ứng đẹp mắt và chuyên nghiệp."
        });

        Content_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new String[]{
            ":nth-child() là một pseudo-class trong CSS cho phép bạn chọn các phần tử dựa trên vị trí của chúng trong nhóm các phần tử anh chị em (siblings).",
            "Trong đó pattern có thể là:\n"
            + "\n"
            + "Một số (ví dụ: 3)\n"
            + "\n"
            + "Từ khóa (odd, even)\n"
            + "\n"
            + "Công thức (ví dụ: 2n+1)",
            "1. Chọn phần tử cụ thể",
            "2. Chọn các phần tử chẵn/lẻ",
            "3. Sử dụng công thức",
            "4. Kết hợp với các selector khác",
            "5. Ứng dụng thực tế: Tạo bảng zebra-striped",
            "6. Chọn các phần tử theo khoảng",
            ":nth-child() đếm tất cả các phần tử anh chị em, không chỉ các phần tử cùng loại.\n"
            + "\n"
            + "Chỉ số bắt đầu từ 1 (không phải 0 như trong nhiều ngôn ngữ lập trình).\n"
            + "\n"
            + "Có thể kết hợp với các pseudo-class khác như :hover, :focus."
        });

        Content_MAP.put(":not() - Loại Trừ Một Phần Tử", new String[]{
            "Bộ chọn :not() trong CSS là một pseudo-class cho phép bạn chọn tất cả các phần tử không phù hợp với selector được chỉ định bên trong nó. Đây là một công cụ mạnh mẽ để loại trừ các phần tử cụ thể khỏi việc áp dụng style.",
            "Trong đó selector có thể là bất kỳ selector CSS hợp lệ nào.",
            "1. Loại trừ một phần tử cụ thể",
            "2. Loại trừ nhiều phần tử",
            "3. Loại trừ theo kiểu phần tử",
            "4. Kết hợp với các pseudo-class khác",
            "Không lồng nhau: Bạn không thể viết :not(:not(...))\n"
            + "\n"
            + "Hiệu suất: :not() có thể ảnh hưởng đến hiệu suất nếu sử dụng với selector phức tạp\n"
            + "\n"
            + "Đặc tính: :not() không làm tăng specificity của selector\n"
            + "\n"
            + "Giới hạn: Không thể chứa pseudo-element như ::before hoặc ::after",
            "Loại trừ phần tử dựa trên thuộc tính",
            ":not() là một công cụ mạnh mẽ giúp bạn viết CSS ngắn gọn và hiệu quả hơn bằng cách loại trừ các phần tử không mong muốn khỏi các quy tắc style."
        });

        Content_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new String[]{
            ":focus-within là một pseudo-class trong CSS cho phép bạn chọn và tạo kiểu cho một phần tử khi bất kỳ phần tử con nào bên trong nó đang được focus (được chọn hoặc nhập liệu).",
            "1. Cách hoạt động\n"
            + "Khi một phần tử con (input, button, link, etc.) nhận focus, phần tử cha chứa nó sẽ được áp dụng các kiểu CSS nếu có selector :focus-within\n"
            + "\n"
            + "Khác với :focus chỉ áp dụng cho chính phần tử được focus, :focus-within áp dụng cho phần tử cha",
            "2. Trường hợp sử dụng\n"
            + "Làm nổi bật form hoặc phần chứa form khi có input được focus\n"
            + "\n"
            + "Hiển thị gợi ý hoặc hướng dẫn khi người dùng focus vào input\n"
            + "\n"
            + "Thay đổi giao diện navigation khi có item được focus\n"
            + "\n"
            + "Tạo hiệu ứng visual để hướng sự chú ý của người dùng",
            "3. Hỗ trợ trình duyệt\n"
            + "Được hỗ trợ bởi tất cả trình duyệt hiện đại (Chrome, Firefox, Safari, Edge)\n"
            + "\n"
            + "Không hỗ trợ IE11 và các trình duyệt cũ hơn",
            "Ví dụ 1: Highlight form container khi input được focus",
            "Ví dụ 2: Hiển thị gợi ý khi focus vào input",
            "Ví dụ 3: Navigation menu với hiệu ứng focus",
            ":focus-within là một công cụ mạnh mẽ để cải thiện trải nghiệm người dùng, giúp tạo ra các tương tác trực quan hơn mà không cần sử dụng JavaScript. Nó đặc biệt hữu ích cho các form và các thành phần điều hướng phức tạp."
        });

        Content_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "Pseudo-elements là các phần tử ảo cho phép bạn tạo và style các phần tử không tồn tại trong DOM nhưng có thể được hiển thị trên trang web. Hai pseudo-elements phổ biến nhất là ::before và ::after.",
            "::before\n"
            + "Chèn nội dung trước nội dung của phần tử được chọn\n"
            + "\n"
            + "Mặc định là inline",
            "::after\n"
            + "Chèn nội dung sau nội dung của phần tử được chọn\n"
            + "\n"
            + "Mặc định là inline",
            "Lưu ý quan trọng: Thuộc tính content là bắt buộc, ngay cả khi là chuỗi rỗng (content: \"\").",
            "Ví dụ 1: Thêm biểu tượng trước và sau đoạn văn",
            "Ví dụ 2: Tạo custom bullet points cho danh sách",
            "Ví dụ 3: Tạo tooltip bằng ::after",
            "Ví dụ 4: Tạo hiệu ứng đẹp cho button",
            "Ví dụ 5: Tạo hình phức tạp với ::before và ::after",
            "Thuộc tính content là bắt buộc, có thể là:\n"
            + "\n"
            + "Chuỗi văn bản: content: \"text\"\n"
            + "\n"
            + "Hình ảnh: content: url(image.png)\n"
            + "\n"
            + "Thuộc tính HTML: content: attr(data-attribute)\n"
            + "\n"
            + "Chuỗi rỗng: content: \"\" (thường dùng cho decorative elements)\n"
            + "\n"
            + "Pseudo-elements mặc định là inline, nhưng bạn có thể thay đổi bằng display: block hoặc display: inline-block.\n"
            + "\n"
            + "Bạn có thể sử dụng cả hai pseudo-elements cùng lúc cho một phần tử.\n"
            + "\n"
            + "Pseudo-elements có thể được styled gần như mọi thuộc tính CSS (màu sắc, font, background, position, v.v.)\n"
            + "\n"
            + "Đối với các trình duyệt cũ, bạn có thể sử dụng cú pháp với một dấu hai chấm (:before thay vì ::before), nhưng cú pháp mới với hai dấu hai chấm được khuyến khích."
        });

        Content_MAP.put("BEM (Block Element Modifier)", new String[]{
            "BEM là một phương pháp đặt tên lớp CSS giúp tạo ra code dễ đọc, dễ hiểu và dễ bảo trì. Dưới đây là giải thích đầy đủ về BEM cùng với code mẫu.",
            "Block là một thành phần độc lập, có ý nghĩa riêng biệt và có thể tái sử dụng.",
            "Đặc điểm:\n"
            + "\n"
            + "Đặt tên đơn giản, mô tả mục đích (vd: menu, button)\n"
            + "\n"
            + "Không phụ thuộc vào các block/element khác\n"
            + "\n"
            + "Có thể chứa các element bên trong",
            "Ví dụ:",
            "Element là một phần của block, không có ý nghĩa độc lập.",
            "Đặc điểm:\n"
            + "\n"
            + "Đặt tên theo cấu trúc: block__element (2 dấu gạch dưới)\n"
            + "\n"
            + "Luôn phụ thuộc vào block cha\n"
            + "\n"
            + "Có thể lồng nhau (nhưng không nên quá sâu)",
            "Ví dụ:",
            "Modifier định nghĩa trạng thái, kiểu dáng hoặc hành vi của block/element.",
            "Đặc điểm:\n"
            + "\n"
            + "Đặt tên theo cấu trúc: block--modifier hoặc block__element--modifier (2 dấu gạch ngang)\n"
            + "\n"
            + "Không nên sử dụng độc lập mà luôn đi kèm với block/element gốc",
            "Ví dụ:",
            "Dưới đây là một ví dụ hoàn chỉnh sử dụng BEM cho một thành phần menu:",
            "Tính rõ ràng: Dễ hiểu mối quan hệ giữa các thành phần\n"
            + "\n"
            + "Tính module: Dễ dàng tái sử dụng code\n"
            + "\n"
            + "Giảm xung đột CSS: Tên lớp cụ thể giảm khả năng trùng lặp\n"
            + "\n"
            + "Dễ bảo trì: Cấu trúc rõ ràng giúp dễ sửa đổi\n"
            + "\n"
            + "Khả năng mở rộng: Dễ thêm thành phần mới mà không phá vỡ cấu trúc hiện có"
        });

        Content_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "OOCSS (Object-Oriented CSS) là một phương pháp viết CSS theo hướng đối tượng, được Nicole Sullivan đề xuất vào năm 2009. Phương pháp này giúp CSS trở nên dễ bảo trì, tái sử dụng và mở rộng hơn.",
            "1. Tách cấu trúc (structure) và giao diện (skin)\n"
            + "Nguyên tắc này khuyến khích tách các thuộc tính liên quan đến bố cục (như width, height, margin, padding) khỏi các thuộc tính liên quan đến giao diện (như color, background, border).",
            "Ví dụ:",
            "2. Tách container và content\n"
            + "Nguyên tắc này khuyên không nên gắn styles cụ thể vào các selector phụ thuộc vào vị trí trong DOM.",
            "Ví dụ không tốt:",
            "Ví dụ tốt:",
            "Tái sử dụng code: Các class có thể được sử dụng ở nhiều nơi\n"
            + "\n"
            + "Dễ bảo trì: Thay đổi ở một nơi ảnh hưởng đến nhiều phần tử\n"
            + "\n"
            + "Giảm kích thước file CSS: Tránh lặp code\n"
            + "\n"
            + "Nhất quán: Giao diện đồng nhất hơn",
            "Đặt tên class rõ ràng, mô tả đúng chức năng\n"
            + "\n"
            + "Tránh sử dụng ID trong CSS (chỉ dùng cho JavaScript nếu cần)\n"
            + "\n"
            + "Hạn chế sử dụng selector lồng nhau (nesting)\n"
            + "\n"
            + "Tạo các class có thể kết hợp được với nhau\n"
            + "\n"
            + "Sử dụng tiền tố cho các nhóm class (ví dụ: .btn-, .media-, .text-)"
        });

        Content_MAP.put("SMACSS", new String[]{
            "Nội dung: SMACSS là phương pháp tổ chức CSS giúp code dễ bảo trì và mở rộng, chia CSS thành 5 loại:",
            "a. Base Rules\n"
            + "Quy tắc cơ bản cho các phần tử HTML (reset/normalize CSS)",
            "b. Layout Rules\n"
            + "Quy tắc bố cục chính của trang (header, footer, grid system)",
            "c. Module Rules\n"
            + "Các thành phần có thể tái sử dụng (buttons, cards, widgets)",
            "d. State Rules\n"
            + "Trạng thái của các phần tử (active, disabled, hidden)",
            "e. Theme Rules\n"
            + "Giao diện tùy chỉnh (nếu cần)",
            "Nội dung: Viết CSS theo cách mạnh mẽ, ít phụ thuộc, dễ bảo trì:\n"
            + "\n"
            + "Sử dụng đặc tính CSS đúng cách\n"
            + "\n"
            + "Tránh !important\n"
            + "\n"
            + "Đặt tên class rõ ràng\n"
            + "\n"
            + "Tận dụng kế thừa",
            "Nội dung: Ngôn ngữ đánh dấu siêu văn bản, cấu trúc nội dung trang web",
            "Nội dung: Ngôn ngữ định kiểu, điều khiển giao diện và bố cục",
            "Cách tiếp cận này giúp code:\n"
            + "\n"
            + "Dễ đọc và bảo trì\n"
            + "\n"
            + "Có cấu trúc rõ ràng\n"
            + "\n"
            + "Dễ mở rộng\n"
            + "\n"
            + "Hiệu suất tốt\n"
            + "\n"
            + "Nhất quán trong toàn bộ dự án"
        });

        Content_MAP.put("Biến trong CSS (--main-color)", new String[]{
            "Biến CSS (còn gọi là CSS Custom Properties) là một tính năng mạnh mẽ cho phép bạn lưu trữ các giá trị CSS để tái sử dụng trong toàn bộ stylesheet. Biến được đặt tên bắt đầu bằng -- (hai dấu gạch ngang), ví dụ --main-color.",
            "Biến CSS được khai báo trong bộ chọn (selector) và có phạm vi (scope) tương ứng với bộ chọn đó.",
            "Để sử dụng biến, bạn dùng hàm var()",
            "Biến CSS có phạm vi theo cascade, giống như các thuộc tính CSS thông thường.",
            "Bạn có thể đặt giá trị mặc định khi biến không được định nghĩa",
            "Biến CSS có thể được thay đổi động bằng JavaScript",
            "Tái sử dụng: Dễ dàng thay đổi nhiều giá trị cùng lúc\n"
            + "\n"
            + "Tính động: Có thể thay đổi bằng JavaScript\n"
            + "\n"
            + "Tính kế thừa: Tuân theo quy tắc cascade của CSS\n"
            + "\n"
            + "Dễ bảo trì: Thay đổi một nơi ảnh hưởng nhiều nơi"
        });

        Content_MAP.put("Nested Rules", new String[]{
            "Nested rules (quy tắc lồng nhau) là một tính năng của CSS preprocessor như Sass (SCSS), Less, hay Stylus, cho phép bạn viết CSS với cấu trúc lồng nhau giống như cấu trúc HTML, giúp code dễ đọc và bảo trì hơn.",
            "Nested rules cho phép bạn lồng các selector CSS bên trong các selector khác, tạo ra một hệ thống phân cấp rõ ràng.",
            "Ví dụ với SCSS:",
            "Kết quả CSS sau khi biên dịch:",
            "Bạn có thể dễ dàng lồng các pseudo-classes như :hover, :focus...",
            "Ví dụ:",
            "Kết quả:",
            "Nested rules cũng hỗ trợ lồng media queries một cách rõ ràng.",
            "Ví dụ:",
            "Kết quả:",
            "Một số thuộc tính CSS có thể được lồng nhau để giảm lặp code.",
            "Ví dụ với font:",
            "Kết quả:",
            "Ký tự & tham chiếu đến selector cha, rất hữu ích cho BEM hay các modifier.",
            "Ví dụ với BEM:",
            "Kết quả:",
            "Dưới đây là một ví dụ đầy đủ sử dụng nested rules trong SCSS:",
            "Kết quả CSS sau khi biên dịch:",
            "Code dễ đọc và tổ chức hơn: Cấu trúc lồng nhau phản ánh cấu trúc HTML\n"
            + "\n"
            + "Giảm lặp code: Không cần lặp lại selector cha nhiều lần\n"
            + "\n"
            + "Bảo trì dễ dàng hơn: Thay đổi selector cha sẽ tự động áp dụng cho các selector con\n"
            + "\n"
            + "Hỗ trợ tốt cho phương pháp BEM: Dễ dàng tạo các modifier và element",
            "Không nên lồng quá sâu (thường không quá 3-4 cấp) để tránh CSS quá cụ thể\n"
            + "\n"
            + "Sử dụng & một cách hợp lý để tránh tạo ra các selector phức tạp không cần thiết\n"
            + "\n"
            + "Nested rules chỉ có trong CSS preprocessor, không phải là tính năng của CSS thuần"
        });

        Content_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new String[]{
            "Mixins là một tính năng mạnh mẽ trong các bộ tiền xử lý CSS như Sass, Less hay Stylus, cho phép bạn định nghĩa các nhóm thuộc tính CSS có thể tái sử dụng nhiều lần trong stylesheet của bạn.",
            "Mixins là các khối mã CSS có thể được tái sử dụng, giúp tránh lặp lại code và dễ bảo trì hơn. Chúng có thể chứa bất kỳ thuộc tính CSS nào và thậm chí có thể nhận tham số.",
            "Trong Sass, mixin được định nghĩa bằng @mixin và được gọi bằng @include.",
            "Mixins có thể nhận tham số, làm cho chúng linh hoạt hơn.",
            "Bạn có thể đặt giá trị mặc định cho các tham số của mixin.",
            "Mixin có thể nhận một khối style bổ sung thông qua @content.",
            "Mixins giúp code CSS của bạn trở nên DRY (Don't Repeat Yourself), dễ bảo trì và mở rộng hơn rất nhiều. Chúng đặc biệt hữu ích cho các thuộc tính cần tiền tố trình duyệt, các pattern thiết kế lặp lại, hoặc các media queries."
        });

        Content_MAP.put("Functions – Xử lý logic trong SCSS", new String[]{
            "SCSS (SASS) cung cấp nhiều tính năng xử lý logic mạnh mẽ giúp viết CSS hiệu quả và linh hoạt hơn. Dưới đây là các khái niệm quan trọng về xử lý logic trong SCSS:",
            "Biến cho phép lưu trữ các giá trị để tái sử dụng trong toàn bộ stylesheet.",
            "Cho phép lồng các selector vào nhau để tổ chức code rõ ràng hơn.",
            "Mixins cho phép tạo các khối code có thể tái sử dụng với tham số truyền vào.",
            "Cho phép chia sẻ tập hợp các thuộc tính CSS từ selector này sang selector khác.",
            "SCSS hỗ trợ các câu lệnh điều kiện @if, @else if và @else.",
            "SCSS hỗ trợ vòng lặp @for, @each và @while.",
            "Vòng lặp @for",
            "Vòng lặp @each",
            "Vòng lặp @while",
            "Cho phép định nghĩa các hàm để tính toán giá trị.",
            "SCSS hỗ trợ các toán tử số học, so sánh và logic."
        });

        Content_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "SCSS (Sassy CSS) là một preprocessor của CSS, cung cấp nhiều tính năng mạnh mẽ giúp viết CSS dễ dàng và hiệu quả hơn. SCSS là phiên bản nâng cấp của SASS với cú pháp tương tự CSS thông thường.",
            "Lợi ích của SCSS:\n"
            + "\n"
            + "Cho phép sử dụng biến (variables)\n"
            + "\n"
            + "Hỗ trợ nesting (lồng nhau)\n"
            + "\n"
            + "Có thể tách thành nhiều module\n"
            + "\n"
            + "Hỗ trợ mixins và functions\n"
            + "\n"
            + "Kế thừa (inheritance)\n"
            + "\n"
            + "Các phép toán logic",
            "Để sử dụng SCSS, bạn cần một trình biên dịch (compiler) để chuyển đổi SCSS thành CSS thông thường.",
            "Cài đặt qua npm:",
            "Biên dịch file SCSS:",
            "3.1. Biến (Variables)\n"
            + "Code mẫu:",
            "3.2. Nesting (Lồng nhau)\n"
            + "Code mẫu:",
            "3.3. Mixins\n"
            + "Code mẫu:",
            "3.4. Kế thừa (Inheritance)\n"
            + "Code mẫu:",
            "3.5. Modules và Import\n"
            + "File _variables.scss:",
            "File main.scss:",
            "3.6. Toán tử và hàm\n"
            + "Code mẫu:",
            "File styles.scss:",
            "File index.html:",
            "Tổ chức file hợp lý: Chia nhỏ thành các file partials (_variables.scss, _mixins.scss, _buttons.scss...)\n"
            + "\n"
            + "Đặt tên biến rõ ràng: Sử dụng tên mô tả (\n"
            + "p\n"
            + "r\n"
            + "i\n"
            + "m\n"
            + "a\n"
            + "r\n"
            + "y\n"
            + "−\n"
            + "c\n"
            + "o\n"
            + "l\n"
            + "o\n"
            + "r\n"
            + "t\n"
            + "h\n"
            + "a\n"
            + "y\n"
            + "v\n"
            + "ı\n"
            + "ˋ\n"
            + "primary−colorthayv \n"
            + "ı\n"
            + "ˋ\n"
            + " color1)\n"
            + "\n"
            + "Tránh nesting quá sâu: Không nên nesting quá 3-4 cấp\n"
            + "\n"
            + "Sử dụng mixins cho vendor prefixes\n"
            + "\n"
            + "Kế thừa thông minh: Sử dụng %placeholder cho các style được dùng nhiều lần\n"
            + "\n"
            + "Comment code: Giải thích các mixins, functions phức tạp\n"
            + "\n"
            + "Kiểm tra output CSS: Đảm bảo CSS output không bị dư thừa"
        });

        Content_MAP.put("Minify CSS", new String[]{
            "Minify CSS là quá trình loại bỏ tất cả các ký tự không cần thiết trong mã CSS (như khoảng trắng, dòng mới, comments) để giảm kích thước file mà không ảnh hưởng đến chức năng. Mục đích chính là tối ưu hóa hiệu suất website.",
            "Lợi ích:\n"
            + "\n"
            + "Giảm kích thước file CSS → tải trang nhanh hơn\n"
            + "\n"
            + "Giảm băng thông tiêu thụ\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng",
            "Các kỹ thuật chính bao gồm:\n"
            + "\n"
            + "Loại bỏ khoảng trắng thừa\n"
            + "\n"
            + "Loại bỏ dòng mới\n"
            + "\n"
            + "Loại bỏ comments\n"
            + "\n"
            + "Rút gọn giá trị màu (ví dụ: #FFFFFF → #FFF)\n"
            + "\n"
            + "Rút gọn các thuộc tính margin/padding (ví dụ: margin: 10px 10px 10px 10px → margin: 10px)",
            "Có 2 cách chính:",
            "3.1. Minify thủ công",
            "3.2. Sử dụng công cụ trực tuyến hoặc build tools\n"
            + "Các công cụ phổ biến: CSSNano, CleanCSS, UglifyCSS, hoặc các trang web như cssminifier.com",
            "Nếu CSS nằm trong file riêng (style.css):",
            "Sau khi minify (style.min.css):",
            "Sử dụng Gulp để tự động minify:",
            "Luôn giữ bản gốc chưa minify để dễ bảo trì\n"
            + "\n"
            + "Kiểm tra kỹ sau khi minify để đảm bảo không có lỗi\n"
            + "\n"
            + "Sử dụng source maps khi cần debug\n"
            + "\n"
            + "Kết hợp với gzip để nén thêm"
        });

        Content_MAP.put("Load Font Tối ưu", new String[]{
            "Tối ưu hóa tải font là quá trình cải thiện hiệu suất khi sử dụng font chữ tùy chỉnh trên website, giúp giảm thời gian tải và tránh hiện tượng FOUT (Flash of Unstyled Text) hoặc FOIT (Flash of Invisible Text).",
            "a. Sử dụng định dạng font hiện đại (WOFF2)\n"
            + "WOFF2 là định dạng font nén hiệu quả nhất hiện nay, giảm kích thước file so với TTF/OTF khoảng 30%.",
            "b. Sử dụng thuộc tính font-display\n"
            + "Thuộc tính này quy định cách trình duyệt hiển thị text trong khi font đang tải.",
            "c. Preload font quan trọng\n"
            + "Tải font quan trọng sớm nhất có thể bằng thẻ <link rel=\"preload\">",
            "d. Subset font (Rút gọn font)\n"
            + "Chỉ bao gồm các ký tự cần thiết cho website của bạn.",
            "e. Sử dụng font hệ thống khi có thể\n"
            + "Ưu tiên sử dụng font hệ thống trước khi tải font tùy chỉnh.",
            "Google Fonts: Sử dụng tham số display=swap để tự động áp dụng font-display: swap",
            "Font Squirrel Generator: Tạo font subset và convert sang nhiều định dạng\n"
            + "\n"
            + "Webfont Loader: Thư viện JavaScript giúp kiểm soát việc tải font tốt hơn",
            "Ưu tiên sử dụng WOFF2, fallback về WOFF\n"
            + "\n"
            + "Preload chỉ 1-2 font quan trọng nhất\n"
            + "\n"
            + "Sử dụng font-display: swap cho phần lớn trường hợp\n"
            + "\n"
            + "Giới hạn số lượng font và weight (chỉ sử dụng những weight thực sự cần thiết)\n"
            + "\n"
            + "Theo dõi hiệu suất bằng Lighthouse để đánh giá"
        });

        Content_MAP.put("Critical CSS – Tải trước những phần CSS quan trọng", new String[]{
            "Critical CSS là kỹ thuật tối ưu hóa hiệu suất trang web bằng cách xác định và tải các CSS cần thiết để hiển thị phần nội dung \"trên cùng\" (above-the-fold) của trang trước, trong khi các phần CSS khác được tải sau.",
            "Critical CSS là phần CSS cần thiết để hiển thị đúng nội dung mà người dùng nhìn thấy ngay khi trang web được tải (phần trên cùng mà không cần cuộn chuột). Kỹ thuật này giúp cải thiện:\n"
            + "\n"
            + "Thời gian hiển thị nội dung đầu tiên (First Contentful Paint)\n"
            + "\n"
            + "Hiệu suất tổng thể của trang web\n"
            + "\n"
            + "Trải nghiệm người dùng",
            "Giảm thời gian tải trang ban đầu\n"
            + "\n"
            + "Tránh hiện tượng \"Flash of Unstyled Content\" (FOUC)\n"
            + "\n"
            + "Tối ưu hóa chỉ số Core Web Vitals\n"
            + "\n"
            + "Cải thiện thứ hạng SEO (Google ưu tiên trang web có tốc độ tải nhanh)",
            "Phân tích phần nội dung \"above-the-fold\"\n"
            + "\n"
            + "Sử dụng công cụ như Chrome DevTools, PageSpeed Insights\n"
            + "\n"
            + "Xác định các selector CSS cần thiết cho phần hiển thị ban đầu",
            "Có 3 phương pháp chính:\n"
            + "\n"
            + "Nhúng trực tiếp vào thẻ <style> trong <head>\n"
            + "\n"
            + "Tải không đồng bộ CSS không quan trọng\n"
            + "\n"
            + "Sử dụng server-side rendering hoặc build tools",
            "Penthouse, Critical, UnCSS (để trích xuất Critical CSS)\n"
            + "\n"
            + "Webpack, Gulp, Grunt (tự động hóa quá trình)\n"
            + "\n"
            + "PageSpeed Insights (phân tích và đề xuất)",
            "1. Cách cơ bản (nhúng Critical CSS trực tiếp)",
            "2. Cách nâng cao với PHP tự động tạo Critical CSS",
            "3. Sử dụng JavaScript để tải Critical CSS động",
            "Critical CSS là kỹ thuật mạnh mẽ để tối ưu hóa hiệu suất trang web. Bằng cách tập trung vào việc tải và áp dụng các style cần thiết nhất trước tiên, bạn có thể cải thiện đáng kể trải nghiệm người dùng và điểm số hiệu suất của trang web."
        });

        Content_MAP.put("Lazy Loading – Tải tài nguyên khi cần thiết", new String[]{
            "Lazy loading là một kỹ thuật tối ưu hiệu suất website bằng cách trì hoãn việc tải các tài nguyên (hình ảnh, iframe, video, script, v.v.) cho đến khi chúng thực sự cần thiết hoặc khi người dùng cuộn đến vị trí của chúng.",
            "Lazy loading giúp:\n"
            + "\n"
            + "Giảm thời gian tải trang ban đầu\n"
            + "\n"
            + "Tiết kiệm băng thông cho người dùng\n"
            + "\n"
            + "Cải thiện trải nghiệm người dùng\n"
            + "\n"
            + "Tối ưu hiệu suất, đặc biệt trên thiết bị di động",
            "a. Lazy Loading hình ảnh\n"
            + "Cách phổ biến nhất là sử dụng thuộc tính loading=\"lazy\" hoặc sử dụng Intersection Observer API.",
            "b. Lazy Loading iframe\n"
            + "Tương tự hình ảnh nhưng áp dụng cho các iframe nhúng.",
            "c. Lazy Loading CSS/JS\n"
            + "Chỉ tải các file CSS/JS khi cần thiết.",
            "a. Sử dụng thuộc tính HTML loading=\"lazy\"",
            "b. Sử dụng Intersection Observer API (JavaScript)",
            "c. Lazy Loading CSS",
            "d. Lazy Loading background image trong CSS",
            "a. Sử dụng lazysizes",
            "b. Sử dụng lozad.js",
            "Luôn đặt kích thước (width/height) cho hình ảnh để tránh layout shift\n"
            + "\n"
            + "Sử dụng placeholder để giữ không gian trước khi tải\n"
            + "\n"
            + "Ưu tiên tải nội dung trên cùng (above the fold) không lazy load\n"
            + "\n"
            + "Kết hợp với preload cho các tài nguyên quan trọng\n"
            + "\n"
            + "Thêm fallback cho trình duyệt không hỗ trợ (noscript)\n"
            + "\n"
            + "Test trên nhiều trình duyệt để đảm bảo tương thích",
            "Sử dụng các công cụ như:\n"
            + "\n"
            + "Lighthouse\n"
            + "\n"
            + "WebPageTest\n"
            + "\n"
            + "Chrome DevTools (Performance tab)"
        });

        Content_MAP.put("Bootstrap", new String[]{
            "Bootstrap là một framework CSS và JavaScript mã nguồn mở miễn phí được phát triển bởi Twitter, dùng để thiết kế giao diện web responsive (thích ứng với mọi kích thước màn hình) một cách nhanh chóng và dễ dàng.",
            "Ưu điểm của Bootstrap:\n"
            + "\n"
            + "Tiết kiệm thời gian phát triển\n"
            + "\n"
            + "Hỗ trợ responsive design\n"
            + "\n"
            + "Tương thích với mọi trình duyệt hiện đại\n"
            + "\n"
            + "Có sẵn nhiều component và utility class\n"
            + "\n"
            + "Dễ dàng tùy biến",
            "Có 2 cách chính để sử dụng Bootstrap:",
            "a. Sử dụng CDN (Content Delivery Network)",
            "b. Tải về và sử dụng local\n"
            + "Tải Bootstrap từ trang chủ getbootstrap.com\n"
            + "\n"
            + "Giải nén và liên kết các file vào dự án",
            "3. Hệ thống lưới (Grid System)\n"
            + "Bootstrap sử dụng hệ thống lưới 12 cột giúp bố cục trang web trở nên dễ dàng.",
            "Các breakpoint trong Bootstrap:\n"
            + "\n"
            + ".col- (extra small <576px)\n"
            + "\n"
            + ".col-sm- (small ≥576px)\n"
            + "\n"
            + ".col-md- (medium ≥768px)\n"
            + "\n"
            + ".col-lg- (large ≥992px)\n"
            + "\n"
            + ".col-xl- (extra large ≥1200px)\n"
            + "\n"
            + ".col-xxl- (extra extra large ≥1400px)",
            "a. Navigation Bar",
            "b. Buttons",
            "c. Cards",
            "d. Forms",
            "Bootstrap cung cấp nhiều utility class để xử lý nhanh các style phổ biến.\n"
            + "\n"
            + "a. Spacing",
            "b. Text",
            "c. Background",
            "Bạn có thể tùy chỉnh Bootstrap bằng cách:\n"
            + "\n"
            + "Ghi đè CSS trong file riêng\n"
            + "\n"
            + "Sử dụng SASS để biên dịch lại Bootstrap với các biến tùy chỉnh\n"
            + "\n"
            + "Sử dụng các theme có sẵn"
        });

        Content_MAP.put("Tailwind CSS", new String[]{
            "Tailwind CSS là một framework CSS utility-first giúp xây dựng giao diện người dùng nhanh chóng bằng cách sử dụng các lớp có sẵn thay vì viết CSS tùy chỉnh.",
            "Tailwind CSS là một framework CSS cấp thấp (low-level) cung cấp các lớp tiện ích (utility classes) để xây dựng giao diện người dùng hiện đại mà không cần rời khỏi file HTML.",
            "Ưu điểm:\n"
            + "\n"
            + "Không cần đặt tên class phức tạp\n"
            + "\n"
            + "Dễ dàng tạo giao diện responsive\n"
            + "\n"
            + "Tùy chỉnh dễ dàng\n"
            + "\n"
            + "Kích thước file CSS nhỏ nhờ PurgeCSS",
            "Có 3 cách chính để sử dụng Tailwind:",
            "a. Sử dụng CDN (nhanh nhưng không tận dụng được hết tính năng)",
            "b. Cài đặt qua npm (khuyến nghị cho dự án thực tế)",
            "c. Sử dụng CLI",
            "a. Typography",
            "b. Màu sắc",
            "c. Spacing (Padding & Margin)",
            "d. Flexbox",
            "e. Grid",
            "Tailwind sử dụng các breakpoint mặc định:\n"
            + "\n"
            + "sm: 640px\n"
            + "\n"
            + "md: 768px\n"
            + "\n"
            + "lg: 1024px\n"
            + "\n"
            + "xl: 1280px\n"
            + "\n"
            + "2xl: 1536px",
            "Bạn có thể tùy chỉnh Tailwind bằng file tailwind.config.js:",
            "Tailwind CSS là một framework mạnh mẽ giúp tăng tốc độ phát triển giao diện người dùng. Với cách tiếp cận utility-first, nó cho phép bạn xây dựng các thiết kế phức tạp mà không cần rời khỏi file HTML. Tailwind đặc biệt phù hợp cho các dự án cần tùy chỉnh cao hoặc khi làm việc với các component-based framework như React, Vue hay Angular."
        });

        Content_MAP.put("ARIA Roles", new String[]{
            "ARIA (Accessible Rich Internet Applications) Roles là các thuộc tính giúp làm cho nội dung web trở nên dễ tiếp cận hơn, đặc biệt là cho người dùng sử dụng trình đọc màn hình. ARIA roles cung cấp thông tin ngữ nghĩa bổ sung cho các phần tử HTML.",
            "ARIA roles định nghĩa loại phần tử hoặc chức năng của phần tử đó trong trang web. Chúng giúp trình đọc màn hình hiểu và thông báo chính xác hơn về cấu trúc và chức năng của trang.",
            "a. Landmark Roles (Vai trò mốc)\n"
            + "Giúp xác định các khu vực quan trọng của trang.",
            "b. Widget Roles (Vai trò tiện ích)\n"
            + "Dùng cho các thành phần tương tác.",
            "c. Document Structure Roles\n"
            + "Mô tả cấu trúc tài liệu.",
            "d. Live Region Roles\n"
            + "Cho các vùng nội dung thay đổi động.",
            "a. Khi nào nên dùng\n"
            + "Khi ngữ nghĩa HTML không đủ\n"
            + "\n"
            + "Khi tạo các widget tùy chỉnh\n"
            + "\n"
            + "Khi nội dung thay đổi động",
            "b. Khi nào không nên dùng\n"
            + "Khi HTML có sẵn phần tử ngữ nghĩa tương đương\n"
            + "\n"
            + "Khi không cần thiết cho trải nghiệm người dùng",
            "Ưu tiên sử dụng phần tử HTML ngữ nghĩa thay vì ARIA roles khi có thể\n"
            + "\n"
            + "Không thay đổi ngữ nghĩa của phần tử HTML bằng ARIA\n"
            + "\n"
            + "Kiểm tra khả năng tiếp cận bằng trình đọc màn hình\n"
            + "\n"
            + "Kết hợp với các thuộc tính ARIA khác như aria-label, aria-hidden, v.v."
        });

        Content_MAP.put("Keyboard Navigation", new String[]{
            "Keyboard navigation (điều hướng bằng bàn phím) là khả năng người dùng có thể tương tác và điều hướng qua các phần tử trên trang web chỉ bằng bàn phím mà không cần sử dụng chuột. Đây là một phần quan trọng của thiết kế web accessible (tiếp cận), đặc biệt hữu ích cho người dùng khuyết tật vận động hoặc thị giác.",
            "1. Tại sao Keyboard Navigation quan trọng\n"
            + "Khả năng tiếp cận: Giúp người dùng không thể sử dụng chuột vẫn có thể truy cập nội dung\n"
            + "\n"
            + "Hiệu quả: Một số người dùng thao tác nhanh hơn bằng bàn phím\n"
            + "\n"
            + "Yêu cầu pháp lý: Tuân thủ các tiêu chuẩn như WCAG (Web Content Accessibility Guidelines)\n"
            + "\n"
            + "Trải nghiệm người dùng: Cải thiện UX cho tất cả người dùng",
            "2. Các phần tử HTML có sẵn keyboard navigation\n"
            + "Các phần tử tương tác mặc định như <a>, <button>, <input>, <select> đều có thể điều hướng bằng phím Tab.",
            "3. Thuộc tính tabindex\n"
            + "Thuộc tính tabindex xác định thứ tự và khả năng focus của phần tử:\n"
            + "\n"
            + "tabindex=\"0\": Phần tử có thể focus theo thứ tự DOM\n"
            + "\n"
            + "tabindex=\"-1\": Phần tử có thể focus bằng JavaScript nhưng không qua tab\n"
            + "\n"
            + "tabindex=\"n\" (n > 0): Xác định thứ tự focus (không nên dùng)",
            "4. Focus styles\n"
            + "Thiết kế kiểu hiển thị khi phần tử được focus là cực kỳ quan trọng:",
            "5. ARIA roles và attributes\n"
            + "Các thuộc tính ARIA giúp cải thiện trải nghiệm keyboard navigation:",
            "6. Keyboard navigation cho custom components\n"
            + "Khi tạo các component tùy chỉnh, cần implement keyboard navigation:\n"
            + "\n"
            + "Dropdown menus\n"
            + "\n"
            + "Modal dialogs\n"
            + "\n"
            + "Tabs\n"
            + "\n"
            + "Accordions\n"
            + "\n"
            + "Carousels",
            "Dưới đây là một ví dụ hoàn chỉnh về keyboard navigation cho một trang web:",
            "Thứ tự tab hợp lý: Đảm bảo thứ tự tab đi theo luồng nội dung tự nhiên\n"
            + "\n"
            + "Focus styles rõ ràng: Luôn có visual indicator khi phần tử được focus\n"
            + "\n"
            + "Skip links: Cung cấp liên kết để bỏ qua navigation khi cần\n"
            + "\n"
            + "Keyboard trap: Đối với modal, giữ focus bên trong cho đến khi đóng\n"
            + "\n"
            + "Phím tắt: Cung cấp phím tắt cho các chức năng thường dùng\n"
            + "\n"
            + "ARIA landmarks: Sử dụng các role như banner, main, navigation để định hướng\n"
            + "\n"
            + "Kiểm thử: Luôn kiểm tra trang web chỉ bằng bàn phím"
        });

        Content_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "Dark mode không chỉ là xu hướng thiết kế mà còn là tính năng quan trọng hỗ trợ người dùng khiếm thị hoặc nhạy cảm với ánh sáng. Dưới đây là hướng dẫn đầy đủ về cách triển khai dark mode có tính đến khả năng tiếp cận.",
            "Nội dung:\n"
            + "\n"
            + "Giảm mỏi mắt và căng thẳng thị giác\n"
            + "\n"
            + "Hỗ trợ người bị chứng sợ ánh sáng (photophobia)\n"
            + "\n"
            + "Cải thiện khả năng đọc cho người bị loạn thị\n"
            + "\n"
            + "Giảm ánh sáng xanh có hại\n"
            + "\n"
            + "Tăng độ tương phản cho người giảm thị lực",
            "Code mẫu:",
            "Nội dung và thực hành:\n"
            + "\n"
            + "a. Độ tương phản đủ cao\n"
            + "Đảm bảo tỷ lệ tương phản tối thiểu 4.5:1 cho văn bản thông thường\n"
            + "\n"
            + "7:1 cho văn bản nhỏ hoặc người dùng có thị lực kém",
            "Code cải thiện tương phản:",
            "b. Không chỉ dựa vào màu sắc\n"
            + "Thêm gạch chân cho liên kết\n"
            + "\n"
            + "Sử dụng thêm biểu tượng hoặc kiểu dáng khác",
            "Code mẫu:",
            "c. Giảm độ chói\n"
            + "Thêm lớp phủ mờ cho các phần tử sáng\n"
            + "\n"
            + "Tránh chuyển đổi đột ngột giữa các chế độ",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Sử dụng prefers-color-scheme để phát hiện cài đặt hệ thống\n"
            + "\n"
            + "Cho phép ghi đè cài đặt hệ thống bằng lựa chọn người dùng\n"
            + "\n"
            + "Lưu tùy chọn người dùng bằng localStorage",
            "Code nâng cao:",
            "Công cụ kiểm tra:\n"
            + "\n"
            + "Sử dụng Lighthouse trong Chrome DevTools\n"
            + "\n"
            + "Kiểm tra bằng trình đọc màn hình (NVDA, VoiceOver)\n"
            + "\n"
            + "Sử dụng công cụ kiểm tra độ tương phản (WebAIM Contrast Checker)",
            "Code thêm ARIA attributes:",
            "Nguồn hữu ích:\n"
            + "\n"
            + "WCAG 2.1 Guidelines\n"
            + "\n"
            + "WebAIM Color Contrast Checker\n"
            + "\n"
            + "MDN prefers-color-scheme"
        });

        Content_MAP.put("Tạo hình ảnh bằng CSS", new String[]{
            "CSS (Cascading Style Sheets) không chỉ dùng để tạo kiểu cho các phần tử HTML mà còn có thể tạo ra các hình ảnh, biểu tượng và hình dạng phức tạp mà không cần sử dụng file ảnh. Điều này giúp giảm tải cho server, tăng tốc độ tải trang và dễ dàng thay đổi màu sắc, kích thước.",
            "1. Tạo hình cơ bản với CSS\n"
            + "Các hình cơ bản như hình vuông, hình tròn, tam giác có thể tạo dễ dàng bằng CSS.",
            "2. Tạo hình phức tạp bằng CSS\n"
            + "Kết hợp nhiều phần tử và sử dụng pseudo-elements (::before, ::after) để tạo hình phức tạp.",
            "3. Tạo hình bằng CSS Gradient\n"
            + "Sử dụng linear-gradient và radial-gradient để tạo hiệu ứng màu sắc phức tạp.",
            "4. Tạo hình động bằng CSS Animation\n"
            + "Kết hợp CSS animation để tạo hình ảnh động.",
            "5. Tạo hình bằng CSS Box Shadow\n"
            + "Sử dụng box-shadow để tạo nhiều hiệu ứng phức tạp.",
            "6. Tạo hình bằng CSS Clip-path\n"
            + "Sử dụng clip-path để cắt phần tử thành các hình dạng phức tạp.",
            "Không cần tải file ảnh: Giảm request HTTP và tăng tốc độ tải trang\n"
            + "\n"
            + "Dễ dàng thay đổi: Màu sắc, kích thước có thể thay đổi bằng CSS\n"
            + "\n"
            + "Responsive: Hình ảnh tự động thay đổi kích thước theo container\n"
            + "\n"
            + "Hiệu suất cao: Không cần decode ảnh như file bitmap\n"
            + "\n"
            + "Animation dễ dàng: Có thể áp dụng CSS animation linh hoạt",
            "Phức tạp với hình chi tiết: Khó tạo hình phức tạp hơn so với SVG hoặc bitmap\n"
            + "\n"
            + "Hỗ trợ trình duyệt: Một số tính năng mới có thể không hỗ trợ trên trình duyệt cũ\n"
            + "\n"
            + "Khó bảo trì: Code CSS phức tạp có thể khó hiểu và bảo trì",
            "Tạo hình ảnh bằng CSS là kỹ thuật mạnh mẽ giúp xây dựng giao diện hiện đại, tối ưu hiệu suất. Tùy vào yêu cầu cụ thể, bạn có thể lựa chọn phương pháp phù hợp từ các hình cơ bản đến phức tạp, kết hợp với animation để tạo trải nghiệm người dùng tốt hơn."
        });

        Content_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new String[]{
            "Animations phức tạp trong HTML và CSS cho phép bạn tạo các hiệu ứng chuyển động nâng cao, mượt mà và hấp dẫn cho trang web. Dưới đây là hướng dẫn đầy đủ với các phần nội dung và code mẫu.",
            "1.1 CSS Transitions\n"
            + "Cho phép thay đổi giá trị thuộc tính một cách mượt mà trong một khoảng thời gian xác định.",
            "1.2 CSS Animations và @keyframes\n"
            + "Cho phép tạo các hoạt ảnh phức tạp hơn với nhiều bước chuyển đổi.",
            "2.1 animation-name\n"
            + "Xác định tên của @keyframes sẽ được sử dụng.\n"
            + "\n"
            + "2.2 animation-duration\n"
            + "Xác định thời gian animation chạy một chu kỳ.\n"
            + "\n"
            + "2.3 animation-timing-function\n"
            + "Xác định tốc độ thay đổi của animation (ease, linear, ease-in, ease-out, ease-in-out, cubic-bezier).\n"
            + "\n"
            + "2.4 animation-delay\n"
            + "Xác định thời gian trước khi animation bắt đầu.\n"
            + "\n"
            + "2.5 animation-iteration-count\n"
            + "Xác định số lần animation lặp lại (number hoặc infinite).\n"
            + "\n"
            + "2.6 animation-direction\n"
            + "Xác định hướng animation (normal, reverse, alternate, alternate-reverse).\n"
            + "\n"
            + "2.7 animation-fill-mode\n"
            + "Xác định kiểu áp dụng styles trước/sau animation (none, forwards, backwards, both).\n"
            + "\n"
            + "2.8 animation-play-state\n"
            + "Cho phép tạm dừng hoặc chạy animation (running, paused).",
            "Ưu tiên sử dụng transform và opacity vì chúng có thể được tối ưu bởi GPU\n"
            + "\n"
            + "Tránh animating các thuộc tính như width, height, margin, padding vì chúng gây reflow\n"
            + "\n"
            + "Sử dụng will-change để thông báo trước cho trình duyệt về các phần tử sẽ được animate",
            "Tạo animations phức tạp trong HTML và CSS đòi hỏi sự hiểu biết về:\n"
            + "\n"
            + "Các thuộc tính animation cơ bản\n"
            + "\n"
            + "Cách sử dụng @keyframes\n"
            + "\n"
            + "Kết hợp nhiều animation cùng lúc\n"
            + "\n"
            + "Tối ưu hiệu suất animation\n"
            + "\n"
            + "Sử dụng các kỹ thuật nâng cao như 3D transforms, SVG animations"
        });

        Content_MAP.put("CSS Art", new String[]{
            "CSS Art là nghệ thuật tạo hình ảnh, minh họa hoặc tác phẩm nghệ thuật chỉ sử dụng HTML và CSS mà không cần bất kỳ hình ảnh nào từ bên ngoài. Đây là một cách tuyệt vời để thể hiện kỹ năng CSS và sự sáng tạo của developer.",
            "Đặc điểm chính:\n"
            + "\n"
            + "Sử dụng hoàn toàn HTML và CSS\n"
            + "\n"
            + "Không sử dụng hình ảnh bitmap (jpg, png) hoặc vector (svg)\n"
            + "\n"
            + "Thường sử dụng các thuộc tính như border-radius, box-shadow, gradient, transform\n"
            + "\n"
            + "Có thể tạo hình ảnh tĩnh hoặc animation",
            "a. Sử dụng Border và Border-radius\n"
            + "Tạo hình dạng cơ bản bằng cách kết hợp border và border-radius.",
            "b. Box-shadow và Pseudo-elements\n"
            + "Tạo nhiều hình dạng phức tạp mà không cần thêm nhiều phần tử HTML.",
            "c. CSS Gradient\n"
            + "Tạo hiệu ứng màu sắc phức tạp mà không cần hình ảnh.",
            "d. CSS Transform và Animation\n"
            + "Tạo chuyển động và hiệu ứng cho CSS Art.",
            "Hiệu suất: Không cần tải hình ảnh từ server\n"
            + "\n"
            + "Khả năng mở rộng: Dễ dàng thay đổi kích thước mà không làm giảm chất lượng\n"
            + "\n"
            + "Tương tác: Dễ dàng thêm animation và hiệu ứng hover\n"
            + "\n"
            + "Khả năng tùy biến: Thay đổi màu sắc, kích thước dễ dàng thông qua CSS",
            "Độ phức tạp: Hình ảnh càng phức tạp càng khó thực hiện bằng CSS\n"
            + "\n"
            + "Khả năng bảo trì: Code có thể trở nên khó đọc và bảo trì với các tác phẩm phức tạp\n"
            + "\n"
            + "Khả năng tương thích: Một số thuộc tính CSS mới có thể không hoạt động trên tất cả trình duyệt",
            "CodePen: Nhiều ví dụ từ cộng đồng\n"
            + "\n"
            + "CSSBattle: Trò chơi viết CSS để tạo hình ảnh chính xác\n"
            + "\n"
            + "A Single Div Project: Thử thách tạo hình ảnh chỉ với một thẻ div\n"
            + "\n"
            + "Các tutorial trên YouTube và blog"
        });

        Content_MAP.put("Pure CSS Illustrations", new String[]{
            "Pure CSS illustrations là kỹ thuật tạo hình minh họa bằng cách sử dụng hoàn toàn CSS (và HTML) mà không cần dùng đến hình ảnh bitmap hay SVG. Kỹ thuật này tận dụng các thuộc tính CSS như border, box-shadow, transform và pseudo-elements để tạo ra các hình ảnh phức tạp.",
            "1. Giới thiệu về Pure CSS Illustrations\n"
            + "Pure CSS illustrations là nghệ thuật tạo hình chỉ bằng code CSS, không sử dụng bất kỳ file hình ảnh nào. Cách tiếp cận này có nhiều ưu điểm:\n"
            + "\n"
            + "Tải nhanh hơn hình ảnh\n"
            + "\n"
            + "Có thể scale dễ dàng\n"
            + "\n"
            + "Dễ dàng thay đổi màu sắc, kích thước\n"
            + "\n"
            + "Tương tác được với CSS animations",
            "2. Các kỹ thuật cơ bản\n"
            + "Các kỹ thuật chính để tạo Pure CSS illustrations:\n"
            + "\n"
            + "Sử dụng border-radius để tạo hình tròn, oval\n"
            + "\n"
            + "Dùng box-shadow để tạo nhiều hình từ một element\n"
            + "\n"
            + "Sử dụng transform để xoay, nghiêng, phóng to/thu nhỏ\n"
            + "\n"
            + "Tận dụng pseudo-elements (::before, ::after) để thêm chi tiết\n"
            + "\n"
            + "Kết hợp gradient cho hiệu ứng màu phức tạp",
            "3. Các công cụ hỗ trợ\n"
            + "CSS clip-path maker\n"
            + "\n"
            + "Box-shadow generator\n"
            + "\n"
            + "Gradient editor\n"
            + "\n"
            + "CSS transform tools",
            "4. Ưu và nhược điểm\n"
            + "Ưu điểm:\n"
            + "\n"
            + "Hiệu suất tốt\n"
            + "\n"
            + "Responsive tự nhiên\n"
            + "\n"
            + "Dễ dàng tạo animation\n"
            + "\n"
            + "Không cần request thêm file ảnh",
            "Nhược điểm:\n"
            + "\n"
            + "Code có thể phức tạp với hình chi tiết\n"
            + "\n"
            + "Khó bảo trì với hình phức tạp\n"
            + "\n"
            + "Hỗ trợ trình duyệt không đồng đều với một số thuộc tính",
            "5. Ứng dụng thực tế\n"
            + "Loading animations\n"
            + "\n"
            + "Biểu tượng đơn giản\n"
            + "\n"
            + "Nhân vật hoạt hình đơn giản\n"
            + "\n"
            + "Background patterns\n"
            + "\n"
            + "Icon hệ thống"
        });
        //Ứng Dụng & Dự Án Thực Tế
        Content_MAP.put("Một Blog cá nhân là gì?", new String[]{
            "Blog cá nhân (Personal Blog) là một dạng trang web hoặc nhật ký trực tuyến do một cá nhân quản lý, dùng để ghi lại, chia sẻ các ý tưởng, kinh nghiệm, câu chuyện, hoặc quan điểm của bản thân về các chủ đề mà họ yêu thích hoặc am hiểu.\n"
            + "Nội dung blog cá nhân có thể thiên về cảm xúc, mang tính cá nhân sâu sắc, hoặc cũng có thể mang tính chuyên môn, học thuật tùy theo mục đích của người viết.\n"
            + "\n"
            + "Không giống như blog của doanh nghiệp (corporate blog) vốn tập trung vào quảng bá sản phẩm/dịch vụ, blog cá nhân chủ yếu phục vụ cho việc kết nối cảm xúc, chia sẻ giá trị cá nhân, lưu giữ hành trình phát triển và đôi khi cả xây dựng thương hiệu cá nhân.",
            "Thập niên 1990s: Blog ra đời từ những nhật ký trực tuyến đầu tiên (online diaries). Những người dùng Internet ban đầu sử dụng blog như một cách ghi lại suy nghĩ và chia sẻ trải nghiệm với bạn bè trên mạng.\n"
            + "\n"
            + "2000s: Sự xuất hiện của các nền tảng như Blogger, WordPress đã khiến việc tạo blog trở nên dễ dàng hơn. Blog cá nhân nở rộ như một hiện tượng văn hóa Internet.\n"
            + "\n"
            + "2010s trở đi: Sự phát triển của mạng xã hội (Facebook, Instagram, YouTube, TikTok) đã khiến hình thức thể hiện nội dung cá nhân đa dạng hơn, nhưng blog cá nhân vẫn tồn tại song song như một dạng nội dung sâu sắc hơn so với mạng xã hội đơn thuần.\n"
            + "\n"
            + "Ngày nay, một blog cá nhân có thể tồn tại độc lập, hoặc kết hợp với các nền tảng mạng xã hội để xây dựng cộng đồng rộng lớn hơn.",
            "3.1. Tự do nội dung\n"
            + "Người viết có thể tự do lựa chọn chủ đề mình yêu thích, từ những chủ đề phổ biến như:\n"
            + "\n"
            + "Du lịch: Chia sẻ hành trình, bí quyết du lịch giá rẻ, review địa điểm.\n"
            + "\n"
            + "Ẩm thực: Công thức nấu ăn, đánh giá nhà hàng, chia sẻ trải nghiệm ẩm thực vùng miền.\n"
            + "\n"
            + "Phong cách sống (Lifestyle): Mẹo sống, phát triển bản thân, quản lý thời gian.\n"
            + "\n"
            + "Nghề nghiệp chuyên môn: Marketing, công nghệ, giáo dục, tài chính cá nhân,...\n"
            + "\n"
            + "Sáng tạo nghệ thuật: Viết lách, nhiếp ảnh, vẽ tranh, làm nhạc,...\n"
            + "\n"
            + "Hay những chủ đề rất riêng tư, như nhật ký cá nhân, hồi ký, tâm sự...\n"
            + "\n"
            + "3.2. Phong cách viết cá nhân hóa\n"
            + "Phong cách viết trên blog cá nhân thường rất tự nhiên, dễ gần. Người đọc cảm nhận như đang được trò chuyện trực tiếp với tác giả. Điều này khác với các bài viết trên báo chí hay nội dung quảng cáo.\n"
            + "\n"
            + "3.3. Tính tương tác cao\n"
            + "Bằng việc để lại bình luận, chia sẻ bài viết, hoặc thậm chí gửi email trao đổi, độc giả có thể trực tiếp tương tác với tác giả, tạo nên mối liên hệ bền chặt.\n"
            + "\n"
            + "3.4. Đa dạng hình thức\n"
            + "Ngoài các bài viết chữ truyền thống, blog cá nhân hiện đại còn tích hợp:\n"
            + "\n"
            + "Ảnh chụp\n"
            + "\n"
            + "Video vlog\n"
            + "\n"
            + "Podcast (bài nói chuyện thu âm)\n"
            + "\n"
            + "Infographics\n"
            + "\n"
            + "Các khóa học online nhỏ do tác giả tổ chức\n"
            + "\n"
            + "3.5. Tính bền vững\n"
            + "Khác với bài đăng mạng xã hội dễ bị trôi mất, bài viết trên blog cá nhân có thể lưu trữ lâu dài, dễ dàng tìm kiếm lại qua Google và xây dựng uy tín dần dần.",
            "WordPress.org (tự host, chuyên nghiệp)\n"
            + "\n"
            + "WordPress.com (host miễn phí, dễ sử dụng)\n"
            + "\n"
            + "Blogger (của Google, dễ dùng, miễn phí)\n"
            + "\n"
            + "Medium (tập trung vào nội dung chất lượng cao)\n"
            + "\n"
            + "Substack (blog kết hợp với email newsletter)\n"
            + "\n"
            + "Ghost (nền tảng blog hiện đại, mạnh về viết lách)\n"
            + "\n"
            + "Ngoài ra, nhiều người còn kết hợp blog cá nhân với:\n"
            + "\n"
            + "Facebook cá nhân/fanpage\n"
            + "\n"
            + "Instagram blog dạng hình ảnh\n"
            + "\n"
            + "YouTube vlog cá nhân\n"
            + "\n"
            + "TikTok chia sẻ nhanh dạng video ngắn",
            "Mặc dù mạng xã hội ngày càng phát triển, nhu cầu về nội dung dài, sâu sắc và bền vững vẫn luôn tồn tại. Blog cá nhân sẽ không biến mất, mà có xu hướng:\n"
            + "\n"
            + "Kết hợp với các hình thức nội dung mới như podcast, video.\n"
            + "\n"
            + "Tập trung vào nội dung chất lượng hơn là số lượng.\n"
            + "\n"
            + "Trở thành trung tâm thương hiệu cá nhân (personal brand hub) cho mỗi người.\n"
            + "\n"
            + "Góp phần xây dựng cộng đồng nhỏ nhưng trung thành (micro-community)."
        });
        Content_MAP.put("Các yếu tố quan trọng của blog cá nhân", new String[]{
            "Ý nghĩa: Nội dung là linh hồn của blog. Người đọc sẽ quay lại hoặc giới thiệu blog của bạn nếu họ thực sự thấy có ích.\n"
            + "\n"
            + "Cách làm:\n"
            + "\n"
            + "Chọn chủ đề mình am hiểu hoặc có đam mê lâu dài.\n"
            + "\n"
            + "Cố gắng cập nhật kiến thức mới để nội dung luôn \"fresh\".\n"
            + "\n"
            + "Xen kẽ nội dung dài (hướng dẫn, phân tích) và ngắn (chia sẻ nhanh, cảm nghĩ) để giữ blog sinh động.\n"
            + "\n"
            + "Ví dụ: Một blog chia sẻ kinh nghiệm du lịch cần có các bài hướng dẫn chi tiết, gợi ý lịch trình, mẹo tiết kiệm chi phí,…",
            "Ý nghĩa: Giữa hàng ngàn blog về cùng một chủ đề, cá tính của bạn sẽ là điểm độc đáo.\n"
            + "\n"
            + "Cách làm:\n"
            + "\n"
            + "Định hình giọng văn: hài hước, nhẹ nhàng, sắc sảo, sâu sắc...\n"
            + "\n"
            + "Sử dụng hình ảnh cá nhân hóa (ảnh tự chụp, minh họa riêng).\n"
            + "\n"
            + "Kể chuyện (storytelling) để bài viết giàu cảm xúc, chân thật.\n"
            + "\n"
            + "Ví dụ: Thay vì chỉ viết \"10 mẹo học tiếng Anh\", hãy kể chuyện mình từng \"khổ sở\" ra sao lúc học để bài viết gần gũi hơn.",
            "Ý nghĩa: Dù nội dung tốt đến đâu, nếu giao diện rối rắm, người đọc cũng sẽ bỏ đi.\n"
            + "\n"
            + "Cách làm:\n"
            + "\n"
            + "Tối giản: chỉ giữ những phần thật sự cần thiết.\n"
            + "\n"
            + "Sắp xếp bài viết theo chủ đề để dễ tìm kiếm.\n"
            + "\n"
            + "Tạo menu rõ ràng, thêm thanh tìm kiếm nhanh.\n"
            + "\n"
            + "Ví dụ: Một blog cá nhân về sách có thể chia menu thành: Review sách, Danh sách yêu thích, Mẹo đọc nhanh,...",
            "Ý nghĩa: Người đọc sẽ gắn bó hơn khi họ cảm thấy được lắng nghe, được phản hồi.\n"
            + "\n"
            + "Cách làm:\n"
            + "\n"
            + "Thêm phần bình luận dưới mỗi bài viết.\n"
            + "\n"
            + "Đặt câu hỏi ở cuối bài viết để kích thích tương tác (\"Bạn nghĩ sao về chủ đề này? Comment cho mình biết nhé!\").\n"
            + "\n"
            + "Tổ chức minigame, khảo sát nhỏ nếu blog đủ lớn.\n"
            + "\n"
            + "Ví dụ: Một blogger về lifestyle có thể tổ chức “Tuần lễ Q&A: Gửi câu hỏi cho mình về thời trang, mình sẽ trả lời hết trong blog!”",
            "Ý nghĩa: Blog đẹp nhưng không ai tìm thấy thì cũng uổng công xây dựng.\n"
            + "\n"
            + "Cách làm:\n"
            + "\n"
            + "Nghiên cứu từ khóa cơ bản để chèn hợp lý vào tiêu đề, mô tả, nội dung.\n"
            + "\n"
            + "Sử dụng liên kết nội bộ (gợi ý bài liên quan) để tăng thời gian ở lại trang.\n"
            + "\n"
            + "Thiết lập chia sẻ nhanh (social sharing button) ở cuối mỗi bài viết.\n"
            + "\n"
            + "Ví dụ: Viết bài \"10 quán cà phê view đẹp ở Đà Lạt\" → dùng từ khóa tự nhiên như \"cà phê đẹp Đà Lạt\", \"quán cafe chill Đà Lạt\"...\n"
            + ""
        });
        Content_MAP.put("Landing page sản phẩm là gì?", new String[]{
            "Landing page sản phẩm là một trang web riêng biệt, được thiết kế đặc biệt để thuyết phục người dùng thực hiện một hành động cụ thể liên quan đến một sản phẩm hoặc dịch vụ. Trang này được tối ưu hóa với một mục tiêu duy nhất và hướng người dùng đến hành động cụ thể, ví dụ như mua hàng, đăng ký nhận bản tin, yêu cầu thông tin thêm, hoặc đăng ký dùng thử.",
            "Mục tiêu rõ ràng: Landing page sản phẩm không phải là một trang thông tin tổng quát mà là một trang nhắm đến một mục tiêu duy nhất. Mục tiêu này có thể là chuyển đổi khách truy cập thành khách hàng hoặc khuyến khích hành động cụ thể như yêu cầu thêm thông tin, đặt hàng, hoặc đăng ký.\n"
            + "\n"
            + "Cấu trúc đơn giản và tập trung: Landing page thường có cấu trúc rất đơn giản, không chứa quá nhiều yếu tố phân tâm. Các phần tử trên trang được thiết kế sao cho hướng người dùng đến hành động chính, giúp tối ưu hóa tỷ lệ chuyển đổi.",
            "Giới thiệu sản phẩm: Phần này trình bày chi tiết về sản phẩm bạn đang bán, từ các tính năng đến công dụng của sản phẩm. Tuy nhiên, điều quan trọng là không chỉ nói về sản phẩm, mà phải làm nổi bật cách sản phẩm giải quyết vấn đề hoặc tạo ra giá trị cho người dùng.\n"
            + "\n"
            + "Lợi ích thay vì tính năng: Những lợi ích mà sản phẩm mang lại nên được nhấn mạnh. Ví dụ, thay vì chỉ nói \"Sản phẩm này có tính năng tự động hóa\", bạn có thể nói \"Sản phẩm này giúp bạn tiết kiệm thời gian bằng cách tự động hóa quy trình X\".\n"
            + "\n"
            + "Sử dụng hình ảnh hoặc video: Một hình ảnh đẹp và sắc nét hoặc một video giới thiệu sản phẩm có thể làm tăng sự tin tưởng của khách hàng và giúp họ hình dung rõ hơn về sản phẩm. Những yếu tố này làm cho landing page trở nên hấp dẫn và dễ tiếp cận hơn.",
            "Giao diện rõ ràng: Giao diện của landing page nên tối giản, dễ hiểu và dễ điều hướng. Các yếu tố như màu sắc, bố cục và phông chữ cần phải dễ nhìn và dễ sử dụng. Những yếu tố này không nên làm phân tán sự chú ý của người dùng khỏi hành động bạn muốn họ thực hiện.\n"
            + "\n"
            + "Thiết kế đáp ứng (Responsive): Trong thời đại công nghệ hiện nay, người dùng có thể truy cập landing page từ nhiều thiết bị khác nhau. Vì vậy, thiết kế của landing page cần phải linh hoạt và hiển thị tốt trên cả desktop và thiết bị di động.",
            "CTA rõ ràng và nổi bật: CTA (kêu gọi hành động) là phần quan trọng nhất của một landing page. Đây là nút hoặc liên kết mà bạn muốn khách hàng nhấp vào để thực hiện hành động mong muốn. CTA phải rõ ràng, nổi bật và dễ nhận biết. Các câu kêu gọi hành động có thể là \"Mua ngay\", \"Đăng ký ngay\", \"Tải bản dùng thử miễn phí\", \"Xem chi tiết\", v.v.\n"
            + "\n"
            + "Đặt CTA ở vị trí chiến lược: CTA không chỉ được đặt ở cuối trang mà còn có thể xuất hiện ở đầu trang, hoặc thậm chí trong quá trình cuộn trang để giữ khách hàng không phải tìm kiếm quá lâu.",
            "Chứng thực từ khách hàng cũ: Đánh giá, phản hồi từ khách hàng cũ hoặc chứng nhận từ các chuyên gia sẽ giúp xây dựng lòng tin cho người dùng khi họ chưa biết nhiều về sản phẩm của bạn. Điều này đặc biệt quan trọng với những sản phẩm đắt tiền hoặc mới mẻ.\n"
            + "\n"
            + "Chứng nhận và bảo mật: Nếu landing page yêu cầu khách hàng cung cấp thông tin cá nhân hoặc thanh toán, bạn cần đảm bảo rằng các phương thức thanh toán là an toàn và bảo mật, có các chứng nhận bảo mật rõ ràng (ví dụ: HTTPS, chứng nhận SSL).",
            "SEO: Tối ưu hóa công cụ tìm kiếm (SEO) cho landing page là cực kỳ quan trọng để đảm bảo trang của bạn có thể xuất hiện trên các kết quả tìm kiếm của Google. Việc sử dụng từ khóa phù hợp, tạo tiêu đề hấp dẫn, và mô tả chính xác về sản phẩm sẽ giúp người dùng dễ dàng tìm thấy trang của bạn.\n"
            + "\n"
            + "Chia sẻ dễ dàng: Thêm các nút chia sẻ mạng xã hội giúp người dùng dễ dàng chia sẻ landing page của bạn với bạn bè hoặc gia đình, tạo ra sự lan truyền và gia tăng lượt truy cập.",
            "Trang bán phần mềm: Một landing page dành cho phần mềm quản lý công việc có thể bao gồm một video ngắn mô tả tính năng, kèm theo lời kêu gọi hành động \"Đăng ký ngay để dùng thử miễn phí\". Phía dưới có phần đánh giá của khách hàng đã sử dụng phần mềm và chứng nhận bảo mật khi thanh toán.\n"
            + "\n"
            + "Landing page cho sản phẩm thể thao: Một landing page bán giày thể thao mới có thể giới thiệu các tính năng giày, như độ bền, chất liệu thoáng khí, và thiết kế thời trang. Nút CTA \"Mua ngay\" được đặt nổi bật và có thể kèm theo chương trình khuyến mãi."
        });
        Content_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new String[]{
            "Mục tiêu cụ thể: Landing page phải tập trung vào một hành động duy nhất mà bạn muốn người dùng thực hiện, ví dụ như mua sản phẩm, đăng ký dùng thử, hoặc yêu cầu thêm thông tin.\n"
            + "\n"
            + "Chỉ có một CTA (Call to Action): Mỗi landing page chỉ nên có một CTA chính để tránh làm người dùng phân tâm và đảm bảo họ thực hiện hành động mong muốn.",
            "Thu hút sự chú ý: Tiêu đề của landing page phải ngắn gọn, súc tích và hấp dẫn để gây ấn tượng ngay từ cái nhìn đầu tiên.\n"
            + "\n"
            + "Liên kết rõ ràng đến lợi ích: Tiêu đề nên nói rõ sản phẩm sẽ giải quyết vấn đề gì cho người dùng, hoặc mang lại lợi ích gì cho họ.",
            "Thông tin sản phẩm chính xác: Mô tả chi tiết các tính năng nổi bật và công dụng sản phẩm, nhưng đừng quên nhấn mạnh vào lợi ích mà sản phẩm mang lại cho khách hàng.\n"
            + "\n"
            + "Giải quyết vấn đề của khách hàng: Cung cấp thông tin giải thích rõ cách mà sản phẩm sẽ giải quyết nhu cầu hoặc vấn đề của người dùng.",
            "Hình ảnh đẹp, sắc nét: Hình ảnh sản phẩm chất lượng cao sẽ giúp khách hàng hình dung rõ hơn về sản phẩm.\n"
            + "\n"
            + "Video hướng dẫn, demo sản phẩm: Video có thể làm nổi bật tính năng của sản phẩm và cách sử dụng, tạo niềm tin và giúp người dùng cảm thấy dễ dàng hơn khi quyết định mua.",
            "Nút CTA nổi bật: CTA phải dễ thấy, màu sắc nổi bật và đặt ở các vị trí chiến lược (đầu trang, giữa trang, cuối trang).\n"
            + "\n"
            + "Lời kêu gọi hành động mạnh mẽ: Câu CTA nên rõ ràng và khuyến khích hành động ngay lập tức, ví dụ: \"Mua ngay\", \"Đăng ký dùng thử miễn phí\", \"Xem chi tiết\", v.v.",
            "Đánh giá từ khách hàng: Các đánh giá, lời chứng thực từ khách hàng có thể giúp tạo sự tin cậy cho sản phẩm. Đây là yếu tố quan trọng để khuyến khích người dùng tin tưởng và quyết định mua hàng.\n"
            + "\n"
            + "Chứng nhận bảo mật: Đảm bảo rằng mọi giao dịch trên trang web đều được bảo mật và an toàn, đặc biệt nếu yêu cầu thông tin thanh toán.",
            "Ưu đãi hấp dẫn: Nếu có chương trình khuyến mãi (giảm giá, quà tặng), hãy làm nổi bật điều này trên landing page để thu hút sự chú ý của khách hàng.\n"
            + "\n"
            + "Giới hạn thời gian: Một chương trình khuyến mãi có giới hạn về thời gian sẽ tạo sự cấp bách, thúc đẩy khách hàng hành động nhanh chóng.",
            "Trang tải nhanh: Tốc độ tải trang ảnh hưởng trực tiếp đến trải nghiệm người dùng và tỷ lệ chuyển đổi. Một trang tải chậm có thể khiến người dùng bỏ đi trước khi kịp thực hiện hành động.",
            "Tương thích với thiết bị di động: Hầu hết người dùng sẽ truy cập landing page trên điện thoại, vì vậy trang cần phải được tối ưu hóa để hiển thị đẹp trên mọi thiết bị.",
            "Cung cấp phương thức liên lạc: Đảm bảo người dùng có thể dễ dàng liên hệ với bạn nếu họ cần giải đáp thêm thắc mắc. Đây có thể là số điện thoại, email hoặc chatbot trực tuyến.",
            "Liên kết đến các bài viết hoặc trang liên quan: Điều này giúp người dùng tìm thêm thông tin về sản phẩm và tăng khả năng chuyển đổi.\n"
            + "\n"
            + "Chia sẻ trên mạng xã hội: Cung cấp các nút chia sẻ dễ dàng trên mạng xã hội để người dùng có thể chia sẻ landing page nếu họ thấy thú vị."
        });
        Content_MAP.put("Web bán hàng cơ bản là gì?", new String[]{
            "Web bán hàng cơ bản là một trang web được thiết kế với mục đích chính là giới thiệu, quảng bá và bán sản phẩm hoặc dịch vụ trực tuyến. Nó cung cấp một nền tảng để người bán có thể giao dịch trực tiếp với khách hàng qua internet, và khách hàng có thể tìm kiếm, chọn mua các sản phẩm, thanh toán và nhận hàng qua phương thức giao hàng.",
            "Giao diện thân thiện: Trang chủ của web bán hàng cần có một giao diện dễ nhìn, dễ sử dụng, giúp người dùng dễ dàng tìm thấy các sản phẩm và dịch vụ.\n"
            + "\n"
            + "Mục tiêu rõ ràng: Trang chủ phải hiển thị những sản phẩm nổi bật, ưu đãi đặc biệt hoặc chương trình khuyến mãi ngay từ đầu để thu hút khách hàng.",
            "Phân loại sản phẩm: Sản phẩm cần được phân loại rõ ràng theo nhóm, loại, thương hiệu, mức giá,... giúp khách hàng dễ dàng tìm kiếm sản phẩm mình muốn.\n"
            + "\n"
            + "Bộ lọc tìm kiếm: Cung cấp tính năng lọc giúp người dùng tìm sản phẩm theo các tiêu chí như giá, màu sắc, kích thước, đánh giá, v.v.",
            "Mô tả chi tiết: Cung cấp mô tả đầy đủ về sản phẩm, bao gồm các tính năng, thông số kỹ thuật, và lợi ích.\n"
            + "\n"
            + "Hình ảnh chất lượng cao: Hình ảnh rõ ràng, sắc nét từ nhiều góc độ giúp khách hàng hình dung rõ hơn về sản phẩm.\n"
            + "\n"
            + "Đánh giá từ người dùng: Hiển thị đánh giá và nhận xét từ khách hàng đã mua sản phẩm để tạo sự tin tưởng.",
            "Giỏ hàng dễ dàng sử dụng: Người dùng có thể dễ dàng thêm hoặc xóa sản phẩm khỏi giỏ hàng và kiểm tra lại các mặt hàng trước khi thanh toán.\n"
            + "\n"
            + "Quá trình thanh toán đơn giản: Cung cấp các phương thức thanh toán trực tuyến an toàn và thuận tiện như thẻ tín dụng, chuyển khoản ngân hàng, ví điện tử, hoặc thanh toán khi nhận hàng (COD)",
            "Thông tin giao hàng rõ ràng: Cung cấp thông tin về các phương thức giao hàng, thời gian giao hàng dự kiến, chi phí vận chuyển.\n"
            + "\n"
            + "Chính sách đổi trả: Hiển thị chính sách đổi trả, hoàn tiền nếu sản phẩm bị lỗi hoặc không như mô tả.",
            "Chat trực tuyến: Một cửa sổ chat trực tuyến giúp khách hàng có thể liên hệ ngay lập tức nếu có bất kỳ câu hỏi hoặc yêu cầu nào về sản phẩm.\n"
            + "\n"
            + "Thông tin liên hệ: Cung cấp địa chỉ email, số điện thoại và các kênh hỗ trợ khách hàng khác.",
            "Tương thích với di động: Đảm bảo rằng website hoạt động tốt trên các thiết bị di động, vì nhiều khách hàng sẽ mua hàng qua điện thoại.",
            "Tối ưu hóa công cụ tìm kiếm: Đảm bảo rằng web bán hàng được tối ưu hóa SEO để dễ dàng tìm thấy trên các công cụ tìm kiếm như Google. Điều này bao gồm việc sử dụng từ khóa phù hợp, tối ưu hóa mô tả sản phẩm, và tạo các liên kết nội bộ hợp lý.",
            "Web bán quần áo: Trang web sẽ bao gồm các danh mục như áo sơ mi, quần jean, giày dép, túi xách, v.v. Khách hàng có thể lọc theo kích thước, màu sắc, và giá để chọn lựa sản phẩm. Sau khi chọn được sản phẩm, khách hàng sẽ thêm vào giỏ hàng và tiến hành thanh toán.\n"
            + "\n"
            + "Web bán đồ điện tử: Trang web có thể cung cấp các sản phẩm như điện thoại, laptop, máy tính bảng, với đầy đủ mô tả chi tiết về tính năng và thông số kỹ thuật. Khách hàng cũng có thể xem các đánh giá từ những người đã sử dụng sản phẩm để đưa ra quyết định.",
            "Tăng trưởng doanh thu: Web bán hàng giúp bạn tiếp cận khách hàng rộng rãi, từ trong nước đến quốc tế, mở rộng thị trường và tăng trưởng doanh thu.\n"
            + "\n"
            + "Tiết kiệm chi phí: Không cần phải duy trì cửa hàng vật lý, giảm thiểu chi phí vận hành và thuê mặt bằng.\n"
            + "\n"
            + "Tiện lợi cho khách hàng: Khách hàng có thể mua hàng bất cứ lúc nào, mọi lúc mọi nơi, và dễ dàng so sánh sản phẩm từ các nhà cung cấp khác nhau."
        });
        Content_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new String[]{
            "Tính trực quan: Giao diện cần được thiết kế đơn giản, dễ hiểu, dễ sử dụng để khách hàng có thể dễ dàng điều hướng mà không gặp phải khó khăn.\n"
            + "\n"
            + "Bố cục hợp lý: Các sản phẩm, danh mục, giỏ hàng và thông tin thanh toán phải được sắp xếp khoa học, giúp khách hàng dễ dàng tìm thấy những gì họ cần.\n"
            + "\n"
            + "Responsive (Tương thích di động): Website phải hiển thị đẹp trên các thiết bị di động và máy tính bảng, vì nhiều khách hàng hiện nay mua sắm qua điện thoại.",
            "Phân loại sản phẩm: Các sản phẩm cần được chia thành các danh mục rõ ràng như: Sản phẩm mới, sản phẩm bán chạy, sản phẩm theo loại, giá cả, v.v.\n"
            + "\n"
            + "Bộ lọc tìm kiếm: Cho phép người dùng lọc sản phẩm theo các tiêu chí như giá, màu sắc, kích thước, loại sản phẩm, v.v., giúp tiết kiệm thời gian tìm kiếm.",
            "Mô tả chi tiết: Cung cấp mô tả đầy đủ về sản phẩm, bao gồm thông tin về tính năng, chất liệu, kích thước, màu sắc và bất kỳ thông tin nào mà khách hàng cần biết.\n"
            + "\n"
            + "Hình ảnh chất lượng cao: Hình ảnh sản phẩm phải rõ nét, có nhiều góc nhìn khác nhau để khách hàng có thể hình dung chi tiết sản phẩm.\n"
            + "\n"
            + "Đánh giá và nhận xét của khách hàng: Các đánh giá từ khách hàng trước sẽ giúp người mua tin tưởng và đưa ra quyết định chính xác.",
            "Giỏ hàng dễ sử dụng: Giỏ hàng nên hiển thị rõ ràng số lượng sản phẩm, tổng giá trị và có khả năng thay đổi số lượng hoặc xóa sản phẩm dễ dàng.\n"
            + "\n"
            + "Thanh toán nhanh chóng: Quy trình thanh toán phải đơn giản và nhanh gọn, giảm thiểu số bước và thông tin yêu cầu từ khách hàng.\n"
            + "\n"
            + "Các phương thức thanh toán đa dạng: Cung cấp các phương thức thanh toán linh hoạt như thẻ tín dụng, chuyển khoản ngân hàng, ví điện tử, hoặc thanh toán khi nhận hàng.",
            "Thông tin giao hàng rõ ràng: Cung cấp thông tin về các phương thức giao hàng, thời gian giao hàng và chi phí vận chuyển. Các khách hàng sẽ cảm thấy yên tâm hơn khi biết được thời gian giao hàng chính xác.\n"
            + "\n"
            + "Chính sách đổi trả: Cung cấp thông tin về chính sách đổi trả, bảo hành sản phẩm để khách hàng cảm thấy an tâm khi mua hàng.",
            "Nút CTA nổi bật: Các nút kêu gọi hành động như \"Mua ngay\", \"Thêm vào giỏ hàng\", \"Đăng ký nhận ưu đãi\" cần được thiết kế sao cho dễ nhận biết và dễ nhấn.\n"
            + "\n"
            + "Vị trí hợp lý: CTA phải được đặt ở các vị trí dễ thấy trên trang như đầu trang, cuối trang và trong suốt quá trình duyệt sản phẩm.",
            "Chat trực tuyến (Live chat): Cho phép khách hàng trò chuyện trực tiếp với nhân viên hỗ trợ khi họ có thắc mắc hoặc cần trợ giúp trong quá trình mua sắm.\n"
            + "\n"
            + "Thông tin liên hệ dễ dàng: Hiển thị rõ ràng các phương thức liên lạc như email, số điện thoại, địa chỉ cửa hàng (nếu có) để khách hàng có thể liên hệ khi cần.",
            "Tối ưu hóa công cụ tìm kiếm (SEO): Cần tối ưu hóa các trang sản phẩm và nội dung của website để dễ dàng xuất hiện trên các công cụ tìm kiếm như Google. Điều này giúp website dễ dàng tiếp cận khách hàng tiềm năng.\n"
            + "\n"
            + "Từ khóa và mô tả hấp dẫn: Sử dụng từ khóa phù hợp trong tiêu đề, mô tả sản phẩm và URL của các trang để tăng khả năng xuất hiện trong các kết quả tìm kiếm.",
            "Đánh giá từ khách hàng: Đánh giá sản phẩm từ những khách hàng đã mua trước là yếu tố rất quan trọng trong việc xây dựng lòng tin.\n"
            + "\n"
            + "Chứng nhận bảo mật: Đảm bảo website có chứng chỉ bảo mật (SSL) và các chứng nhận bảo mật khi thanh toán trực tuyến để khách hàng cảm thấy an toàn.",
            "Ưu đãi đặc biệt: Tạo các chương trình khuyến mãi hấp dẫn, như giảm giá, quà tặng miễn phí, hoặc các gói quà đặc biệt để thu hút khách hàng.\n"
            + "\n"
            + "Hiển thị rõ ràng: Các chương trình khuyến mãi phải được hiển thị rõ ràng ngay trên trang chủ hoặc trang sản phẩm để khách hàng dễ dàng nhận thấy.",
            "Để xây dựng một web bán hàng cơ bản hiệu quả, bạn cần chú ý đến các yếu tố quan trọng từ giao diện người dùng, mô tả sản phẩm, giỏ hàng và thanh toán, đến các chính sách giao hàng và hỗ trợ khách hàng. Tất cả những yếu tố này đều giúp khách hàng có trải nghiệm mua sắm trực tuyến mượt mà, tăng khả năng chuyển đổi và tạo ra doanh thu cho doanh nghiệp."
        });
        Content_MAP.put("Hiệu ứng scroll", new String[]{
            "Hiệu ứng scroll (scroll effects) là các hiệu ứng trực quan được kích hoạt khi người dùng cuộn trang web xuống hoặc lên. Các hiệu ứng này giúp tạo ra một trải nghiệm người dùng thú vị hơn, làm cho trang web trở nên sinh động và tương tác hơn. Dưới đây là một số loại hiệu ứng scroll phổ biến mà bạn có thể áp dụng:",
            "Đoạn mã dưới đây sẽ làm cho các phần tử mờ dần ra khi người dùng cuộn đến chúng.\n"
            + "\n"
            + "HTML:",
            "CSS (styles.css):",
            "JavaScript (script.js):",
            "Đoạn mã dưới đây tạo ra hiệu ứng parallax đơn giản, nơi mà hình ảnh nền di chuyển chậm hơn khi người dùng cuộn trang.\n"
            + "\n"
            + "HTML:",
            "CSS (styles.css):",
            "JavaScript (script.js):",
            "Hiệu ứng này sẽ kích hoạt một animation khi người dùng cuộn đến vị trí của phần tử.\n"
            + "\n"
            + "HTML:",
            "CSS (styles.css):",
            "JavaScript (script.js):",
            "Hiệu ứng Fade-In: Khi cuộn trang đến vị trí của các phần tử, chúng sẽ mờ dần ra.\n"
            + "\n"
            + "Hiệu ứng Parallax: Tạo hiệu ứng chiều sâu khi người dùng cuộn trang.\n"
            + "\n"
            + "Hiệu ứng Scroll-triggered: Kích hoạt các animation khi phần tử được cuộn vào khung nhìn của người dùng."
        });
        Content_MAP.put("Parallax", new String[]{
            "Parallax là một hiệu ứng thị giác đặc biệt, trong đó các đối tượng nền di chuyển chậm hơn so với các đối tượng ở phía trước (hoặc người dùng cuộn xuống), tạo ra một hiệu ứng chiều sâu và làm cho website trở nên sinh động hơn. Hiệu ứng này rất phổ biến trên các trang web hiện đại để thu hút người dùng và tạo ấn tượng mạnh.",
            "1. Cấu trúc HTML:\n"
            + "Đây là cấu trúc cơ bản của một trang web có hiệu ứng parallax.",
            "2. CSS để tạo hiệu ứng Parallax:\n"
            + "Dưới đây là mã CSS để tạo hiệu ứng parallax.",
            "3. JavaScript để điều khiển hiệu ứng Parallax:\n"
            + "JavaScript sẽ được sử dụng để thay đổi vị trí của nền khi người dùng cuộn trang.\n"
            + "",
            "Parallax Container: Đây là phần chứa hiệu ứng parallax. Chúng ta đặt chiều cao của phần tử này là 100vh để nó chiếm toàn bộ chiều cao của viewport.\n"
            + "\n"
            + "Parallax Background: Phần tử này là hình nền sẽ tạo hiệu ứng di chuyển khi cuộn trang. Hình ảnh nền được đặt là background-image và có chiều cao lớn hơn (150%) để nó không bị cắt khi cuộn.\n"
            + "\n"
            + "JavaScript: Khi người dùng cuộn trang, chúng ta lấy vị trí cuộn của trang (window.pageYOffset) và thay đổi vị trí nền bằng cách thay đổi giá trị transform của phần tử .parallax-bg. scrollPosition * 0.5 đảm bảo rằng nền di chuyển chậm hơn so với phần tử phía trên, tạo ra hiệu ứng parallax.",
            "Hiệu ứng Parallax có thể không mượt mà trên một số thiết bị cũ. Để tối ưu hóa cho tất cả các thiết bị, bạn có thể thử nghiệm với các thư viện như rellax.js hoặc parallax.js.\n"
            + "\n"
            + "Kiểm tra khả năng tương thích di động: Đảm bảo rằng hiệu ứng này hoạt động tốt trên các thiết bị di động vì có thể gặp vấn đề với các trình duyệt hoặc thiết bị không hỗ trợ hiệu ứng di chuyển phức tạp.",
            "Để dễ dàng thêm hiệu ứng parallax và kiểm soát tốc độ chuyển động, bạn có thể sử dụng thư viện như rellax.js.\n"
            + "\n"
            + "Thêm thư viện Rellax.js vào trang của bạn (đặt ở phần <head>):",
            "Sử dụng Rellax.js trong JavaScript:",
            "Cách này sẽ giúp bạn dễ dàng thêm hiệu ứng parallax mà không cần phải viết quá nhiều mã.",
            "Hiệu ứng parallax là một cách tuyệt vời để làm cho website của bạn trở nên sinh động và tương tác hơn. Bạn có thể sử dụng mã trên để tạo ra hiệu ứng parallax đơn giản cho website của mình, hoặc thử nghiệm với các thư viện JavaScript để làm cho việc tích hợp hiệu ứng này trở nên dễ dàng hơn."
        });
        Content_MAP.put("Ứng dụng trong thiết kế", new String[]{
            "Parallax có thể tạo ra một ấn tượng mạnh mẽ ngay từ khi người dùng lần đầu tiên truy cập vào trang web. Với các yếu tố chuyển động nền khi cuộn, người dùng sẽ cảm nhận được chiều sâu và sự sinh động của trang web. Điều này giúp tăng sự chú ý vào các phần nội dung quan trọng ngay khi họ mới bắt đầu cuộn.\n"
            + "\n"
            + "Ví dụ: Các trang chủ của các trang web thương mại điện tử, các công ty du lịch hay những trang portfolio cá nhân thường sử dụng hiệu ứng parallax để giới thiệu sản phẩm, dịch vụ một cách trực quan và ấn tượng.",
            "Hiệu ứng parallax làm cho việc di chuyển qua các phần của trang web trở nên thú vị hơn, khiến người dùng cảm thấy họ đang tương tác với một môi trường sống động thay vì chỉ đọc văn bản hoặc xem hình ảnh tĩnh. Các yếu tố chuyển động giúp dẫn dắt người dùng từ phần này sang phần khác mà không cảm thấy nhàm chán.\n"
            + "\n"
            + "Ứng dụng:\n"
            + "\n"
            + "Trang chủ của các thương hiệu lớn như Nike hoặc Apple sử dụng hiệu ứng parallax để tạo ra sự kết nối trực quan giữa sản phẩm và người dùng.\n"
            + "\n"
            + "Các trang web mang tính tương tác như games hoặc trang web giáo dục có thể dùng hiệu ứng này để giúp người dùng cảm thấy như họ đang tham gia vào một câu chuyện hoặc hành trình.",
            "Parallax thường được áp dụng vào các hình ảnh nền lớn hoặc hình ảnh với hiệu ứng chuyển động mượt mà, tạo cảm giác sâu sắc và thú vị. Nó cho phép người thiết kế tạo ra những hình ảnh nền độc đáo mà không cần dùng đến những hiệu ứng phức tạp khác.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Trang web nghệ thuật: Các trang portfolio nghệ thuật hoặc các website của nghệ sĩ có thể sử dụng parallax để làm nổi bật tác phẩm của họ thông qua các lớp nền chuyển động khác nhau.\n"
            + "\n"
            + "Trang web du lịch: Các trang web này có thể sử dụng parallax để tạo chiều sâu cho các hình ảnh của các địa điểm du lịch, làm cho người dùng cảm thấy họ đang \"lướt\" qua các điểm đến.",
            "Một trong những ứng dụng phổ biến của parallax là để hướng dẫn người dùng và tăng tính tương tác. Hiệu ứng này có thể được sử dụng để làm nổi bật các phần quan trọng của trang web, chẳng hạn như lời kêu gọi hành động (CTA), sản phẩm, hoặc các yếu tố cần chú ý.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Các nút CTA như “Mua ngay” hoặc “Đăng ký” có thể được thêm hiệu ứng parallax để người dùng dễ dàng nhận diện và hành động.\n"
            + "\n"
            + "Trang web quảng cáo có thể dùng parallax để làm nổi bật thông điệp của chiến dịch quảng cáo, khiến nó trở nên sinh động và dễ nhớ.",
            "Parallax giúp tạo ra một portfolio trực quan, dễ gây ấn tượng với các nhà tuyển dụng, khách hàng hoặc đối tác tiềm năng. Các designer hoặc nhiếp ảnh gia có thể sử dụng hiệu ứng này để làm nổi bật các dự án của mình bằng cách tạo ra một trải nghiệm mượt mà và sinh động.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Website cá nhân: Sử dụng parallax để làm nổi bật các kỹ năng, dự án và thông tin cá nhân của bạn. Ví dụ, bạn có thể sử dụng hiệu ứng parallax để các phần nội dung từ từ xuất hiện khi người dùng cuộn xuống.",
            "Ngoài việc tạo cảm giác chiều sâu, parallax cũng có thể được sử dụng để xây dựng các hiệu ứng thị giác phức tạp. Những chuyển động nền và các phần tử trên trang có thể được thiết kế theo các hướng khác nhau để tạo ra hiệu ứng lạ mắt và độc đáo.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Trang web giới thiệu sản phẩm hoặc dịch vụ có thể sử dụng parallax để làm nổi bật từng tính năng sản phẩm khi người dùng cuộn qua. Các phần tử như video, hình ảnh hoặc văn bản có thể thay đổi vị trí hoặc kích thước tùy theo chuyển động của người dùng.\n"
            + "\n"
            + "Các trang web sự kiện: Parallax có thể giúp thể hiện thông tin sự kiện theo cách sống động, tạo cảm giác như người dùng đang khám phá từng chi tiết về sự kiện qua từng bước.",
            "Khi được sử dụng hợp lý, hiệu ứng parallax có thể khiến người dùng cảm thấy mình đang tham gia vào trải nghiệm trực quan chứ không chỉ là đơn thuần xem nội dung. Điều này có thể làm tăng mức độ tương tác với trang web của bạn, giúp người dùng cảm thấy họ có sự kiểm soát hơn trong cách mà họ tương tác với nội dung.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Trang web phim: Các website giới thiệu phim có thể sử dụng parallax để làm nổi bật các cảnh phim hoặc các nhân vật, giúp người dùng cảm nhận được không khí của bộ phim.\n"
            + "\n"
            + "Trang web âm nhạc: Các website nghệ sĩ có thể áp dụng parallax để tạo ra các hiệu ứng chuyển động cho các album nhạc, video hoặc tour diễn.",
            "Cải thiện trải nghiệm người dùng: Các hiệu ứng chuyển động tạo ra trải nghiệm lôi cuốn, giúp người dùng cảm thấy thú vị khi duyệt trang.\n"
            + "\n"
            + "Tăng tính thẩm mỹ: Parallax làm trang web trở nên hấp dẫn và hiện đại hơn, giúp thu hút người dùng ngay từ cái nhìn đầu tiên.\n"
            + "\n"
            + "Dễ dàng gây ấn tượng: Hiệu ứng này giúp website của bạn nổi bật so với các đối thủ, thu hút khách hàng và người dùng.\n"
            + "\n"
            + "Tăng khả năng tương tác: Khi sử dụng parallax, bạn có thể dễ dàng dẫn dắt người dùng đến các mục tiêu của bạn, chẳng hạn như đăng ký dịch vụ, mua sản phẩm hoặc khám phá thêm thông tin.\n"
            + "",
            "Không lạm dụng: Sử dụng quá nhiều hiệu ứng parallax có thể làm trang web trở nên quá tải và làm chậm tốc độ tải trang.\n"
            + "\n"
            + "Tối ưu hóa cho di động: Hãy đảm bảo hiệu ứng parallax hoạt động tốt trên tất cả các thiết bị, đặc biệt là trên thiết bị di động.\n"
            + "\n"
            + "Tốc độ tải trang: Parallax có thể ảnh hưởng đến tốc độ tải trang. Hãy tối ưu hóa hình ảnh và các phần tử di động để giảm thiểu thời gian tải trang.\n"
            + ""
        });
        Content_MAP.put("Dark Mode (chế độ tối) là gì?", new String[]{
            "Dark Mode (Chế độ tối) là một chế độ giao diện người dùng (UI) trong các ứng dụng hoặc hệ điều hành, trong đó các màu nền chủ yếu là màu đen hoặc xám tối, và văn bản, biểu tượng, hoặc các yếu tố giao diện khác sẽ có màu sáng hoặc trắng. Chế độ này giúp giảm độ sáng của màn hình, giảm chói và làm dịu mắt, đặc biệt khi sử dụng trong môi trường thiếu ánh sáng.",
            "Bảo vệ mắt:\n"
            + "\n"
            + "Dark Mode có thể giúp giảm căng thẳng cho mắt khi sử dụng thiết bị trong môi trường ánh sáng yếu. Khi bạn sử dụng màn hình với ánh sáng mạnh (chế độ sáng), mắt sẽ dễ bị mỏi và khô. Dark Mode giảm độ sáng màn hình, giúp mắt thoải mái hơn.\n"
            + "\n"
            + "Tiết kiệm năng lượng:\n"
            + "\n"
            + "Trên các màn hình OLED và AMOLED, chế độ tối có thể giúp tiết kiệm pin vì các điểm ảnh màu đen sẽ không tiêu tốn năng lượng. Điều này có lợi cho các thiết bị di động hoặc laptop khi sử dụng lâu dài.\n"
            + "\n"
            + "Cải thiện trải nghiệm vào ban đêm:\n"
            + "\n"
            + "Dark Mode giúp người dùng không bị chói mắt khi sử dụng điện thoại hoặc máy tính vào ban đêm. Điều này giúp người dùng dễ dàng duy trì giấc ngủ tốt hơn mà không bị ánh sáng xanh làm gián đoạn.\n"
            + "\n"
            + "Phong cách và thẩm mỹ:\n"
            + "\n"
            + "Nhiều người thích giao diện tối vì nó trông hiện đại và dễ nhìn hơn, đặc biệt là khi kết hợp với thiết kế tối giản. Dark Mode cũng tạo cảm giác “sang trọng” và có thể làm nổi bật các hình ảnh, đồ họa hoặc video.",
            "Ứng dụng di động:\n"
            + "\n"
            + "Các ứng dụng như Instagram, Twitter, YouTube, Facebook, WhatsApp, và nhiều ứng dụng khác đều cung cấp chế độ tối, giúp người dùng tùy chỉnh giao diện theo sở thích của mình.\n"
            + "\n"
            + "Hệ điều hành:\n"
            + "\n"
            + "Windows 10, macOS, Android, và iOS đều hỗ trợ Dark Mode ở cấp hệ thống, cho phép người dùng áp dụng chế độ này trên toàn bộ giao diện, không chỉ riêng trong các ứng dụng.\n"
            + "\n"
            + "Trang web:\n"
            + "\n"
            + "Các trang web như YouTube, Reddit, và nhiều website khác cho phép người dùng chọn chế độ sáng/tối để cải thiện trải nghiệm duyệt web.\n"
            + "\n"
            + "Các công cụ lập trình:\n"
            + "\n"
            + "Dark Mode cũng rất phổ biến trong các IDE (Môi trường phát triển tích hợp) như Visual Studio Code, Sublime Text, Xcode,... Giới lập trình viên thường ưu tiên chế độ tối để giảm mỏi mắt trong các giờ làm việc dài.",
            "Giảm mỏi mắt: Khi sử dụng trong điều kiện ánh sáng yếu, Dark Mode giúp giảm độ sáng mạnh từ màn hình, làm dịu mắt.\n"
            + "\n"
            + "Tiết kiệm năng lượng (trên màn hình OLED/AMOLED): Màn hình tối tiêu tốn ít năng lượng hơn, giúp tiết kiệm pin cho các thiết bị di động.\n"
            + "\n"
            + "Cải thiện sự tập trung: Dark Mode có thể giúp bạn tập trung vào nội dung chính mà không bị phân tâm bởi các yếu tố giao diện sáng.",
            "Khó đọc trong ánh sáng mạnh: Trong môi trường ánh sáng mạnh, Dark Mode có thể khó đọc vì văn bản sáng trên nền tối có thể không rõ ràng như khi sử dụng chế độ sáng.\n"
            + "\n"
            + "Không phù hợp với mọi loại nội dung: Đối với những nội dung chứa hình ảnh sáng hoặc video, Dark Mode có thể không tối ưu vì nó có thể làm mất đi độ tương phản, khiến nội dung không đẹp mắt.",
            "Trên Windows 10:\n"
            + "\n"
            + "Mở Settings > Personalization > Colors.\n"
            + "\n"
            + "Chọn chế độ sáng hoặc tối trong phần Choose your color.\n"
            + "\n"
            + "Trên macOS:\n"
            + "\n"
            + "Mở System Preferences > General.\n"
            + "\n"
            + "Chọn chế độ Dark trong mục Appearance.\n"
            + "\n"
            + "Trên Android:\n"
            + "\n"
            + "Vào Settings > Display.\n"
            + "\n"
            + "Chọn Dark trong mục Theme.\n"
            + "\n"
            + "Trên iOS:\n"
            + "\n"
            + "Vào Settings > Display & Brightness.\n"
            + "\n"
            + "Chọn Dark trong mục Appearance.",
            "Dark Mode là một tính năng được nhiều người dùng yêu thích vì khả năng giảm độ sáng màn hình, bảo vệ mắt, tiết kiệm năng lượng và tạo giao diện thẩm mỹ. Tuy nhiên, người dùng cũng cần cân nhắc sử dụng Dark Mode trong những tình huống phù hợp, nhất là khi có đủ ánh sáng để đọc dễ dàng hơn với chế độ sáng."
        });
        Content_MAP.put("Các yếu tố quan trọng của Dark Mode", new String[]{
            "Cân bằng độ tương phản: Điều quan trọng là phải đảm bảo sự tương phản đủ mạnh giữa nền tối và văn bản sáng để người dùng dễ dàng đọc nội dung. Nếu tương phản quá thấp, người dùng sẽ gặp khó khăn trong việc đọc nội dung, và nếu quá cao, sẽ gây chói mắt.\n"
            + "\n"
            + "Màu sắc của các yếu tố giao diện: Các yếu tố như nút bấm, liên kết, biểu tượng, hoặc các phần tử tương tác khác cần phải có màu sắc nổi bật so với nền tối để người dùng dễ dàng nhận diện.",
            "Giảm ánh sáng xanh: Một trong những lý do phổ biến khi người dùng chọn Dark Mode là giảm thiểu ánh sáng xanh phát ra từ màn hình, giúp bảo vệ mắt và tránh gây mỏi mắt hoặc mất ngủ. Thiết kế Dark Mode nên đảm bảo rằng ánh sáng xanh được kiểm soát, không quá mạnh.",
            "Giảm bớt các yếu tố thừa: Dark Mode hoạt động tốt hơn khi các yếu tố giao diện được tối giản, giảm bớt độ phức tạp của giao diện. Các hình ảnh và đồ họa nên được sử dụng một cách tiết kiệm để không gây cản trở việc đọc và làm giảm hiệu quả thị giác.\n"
            + "\n"
            + "Tránh sử dụng quá nhiều màu sáng: Mặc dù Dark Mode sử dụng màu tối làm nền, nhưng việc thêm quá nhiều màu sáng có thể làm mất đi hiệu quả của chế độ này. Cần sử dụng các màu sáng cho văn bản và các yếu tố tương tác một cách hợp lý để tạo sự cân bằng.",
            "Tính năng chuyển đổi dễ dàng giữa chế độ sáng và tối: Người dùng thường muốn có khả năng chuyển đổi linh hoạt giữa Dark Mode và Light Mode (chế độ sáng). Hệ thống hoặc ứng dụng nên cho phép người dùng chuyển đổi chế độ dễ dàng thông qua cài đặt hoặc thậm chí tự động chuyển đổi dựa trên thời gian trong ngày (chế độ ban ngày/ban đêm).",
            "Tối ưu hóa đọc văn bản: Trong Dark Mode, văn bản sáng trên nền tối có thể gây mỏi mắt nếu không được thiết kế cẩn thận. Cần đảm bảo kích thước chữ, độ đậm của chữ và các khoảng cách dòng được điều chỉnh hợp lý để người dùng có thể đọc dễ dàng trong thời gian dài.\n"
            + "\n"
            + "Chế độ đọc ban đêm: Các ứng dụng đọc sách điện tử hoặc các nền tảng cung cấp nội dung văn bản dài có thể sử dụng Dark Mode để tạo cảm giác thoải mái hơn cho người dùng khi đọc vào ban đêm",
            "Tiết kiệm pin: Dark Mode đặc biệt có lợi cho các thiết bị sử dụng màn hình OLED hoặc AMOLED, vì những màn hình này không phát sáng các điểm ảnh màu đen, do đó giảm thiểu mức tiêu thụ năng lượng. Thiết kế Dark Mode cần tận dụng đặc điểm này để giúp tăng thời gian sử dụng của thiết bị.",
            "Tính tương thích với nhiều thiết bị: Dark Mode cần phải hoạt động mượt mà trên tất cả các thiết bị, từ máy tính để bàn, điện thoại di động đến máy tính bảng. Điều này có nghĩa là thiết kế giao diện phải linh hoạt và thích nghi với các kích thước màn hình khác nhau.\n"
            + "\n"
            + "Tính năng tự động bật: Trên các hệ điều hành như macOS, iOS, hoặc Windows, Dark Mode có thể tự động bật vào ban đêm để tối ưu hóa trải nghiệm người dùng, giảm ánh sáng mạnh khi môi trường xung quanh trở nên tối.",
            "Cảm giác thân thiện và dễ chịu: Mặc dù Dark Mode có thể làm giảm căng thẳng cho mắt, nhưng nếu không được thiết kế đúng cách, nó cũng có thể khiến giao diện trở nên khó nhìn hoặc không thoải mái. Cần phải thử nghiệm nhiều yếu tố thiết kế như màu sắc, độ sáng và độ tương phản để tạo ra một trải nghiệm người dùng thoải mái.\n"
            + "\n"
            + "Khả năng tùy chỉnh: Một số người dùng muốn có thể tùy chỉnh Dark Mode theo sở thích của họ (ví dụ như thay đổi màu sắc của nền hoặc văn bản). Điều này có thể làm tăng mức độ hài lòng của người dùng đối với giao diện.",
            "Sử dụng các hiệu ứng bóng đổ: Để tạo chiều sâu và làm cho các yếu tố giao diện nổi bật, các nhà thiết kế có thể sử dụng các hiệu ứng bóng đổ nhẹ khi làm việc với Dark Mode. Điều này giúp các phần tử giao diện như nút bấm, biểu tượng hoặc thanh cuộn dễ dàng nhận diện.",
            "Liên tục tối ưu và cập nhật: Dark Mode không phải là một tính năng tĩnh mà sẽ cần được tối ưu hóa qua thời gian. Các nhà phát triển và nhà thiết kế cần lắng nghe phản hồi từ người dùng và điều chỉnh các yếu tố như màu sắc, độ sáng, và giao diện để tạo ra một chế độ tối tối ưu.",
            "Khi thiết kế Dark Mode, cần chú ý đến sự cân bằng giữa yếu tố thẩm mỹ, tính dễ sử dụng và hiệu quả về năng lượng. Những yếu tố như độ tương phản, tối ưu hóa cho mắt, tiết kiệm năng lượng và trải nghiệm người dùng cần được tối ưu hóa để mang lại một chế độ tối tiện lợi và hấp dẫn cho người dùng.",});
        Content_MAP.put("Cách thức triển khai Dark Mode", new String[]{
            "Chọn màu sắc hợp lý: Chế độ tối sử dụng nền tối và văn bản sáng. Cần lựa chọn màu nền tối (như đen hoặc xám tối) và các màu sáng cho văn bản, các yếu tố giao diện như nút, liên kết, và biểu tượng. Các tông màu này phải có độ tương phản cao để dễ đọc.\n"
            + "\n"
            + "Đảm bảo tương phản cao: Đảm bảo rằng văn bản có đủ độ tương phản với nền tối để dễ đọc, nhưng không quá chói mắt. Các màu sắc như trắng, xám sáng cho văn bản và các màu nhẹ cho các yếu tố giao diện như nút bấm hoặc biểu tượng.\n"
            + "\n"
            + "Thiết kế tối giản: Dark Mode hoạt động tốt nhất với các giao diện đơn giản, không có quá nhiều yếu tố đồ họa phức tạp. Hạn chế các màu sắc sáng mạnh và sử dụng hình ảnh tối giản.",
            "Nếu bạn đang làm việc với một trang web, bạn có thể triển khai Dark Mode bằng CSS.\n"
            + "\n"
            + "a. CSS Media Query (prefers-color-scheme)\n"
            + "CSS cung cấp prefers-color-scheme để tự động nhận diện chế độ sáng/tối mà người dùng đang sử dụng trên thiết bị của họ.",
            "Giải thích:\n"
            + "\n"
            + "Khi người dùng chọn Dark Mode trong hệ thống của họ (hoặc khi hệ thống tự động chuyển vào ban đêm), CSS sẽ áp dụng các styles trong @media (prefers-color-scheme: dark) để hiển thị chế độ tối.\n"
            + "\n"
            + "Các phần tử như body, button, hay các thành phần khác cần được định dạng lại màu sắc để phù hợp với Dark Mode.",
            "Cung cấp tính năng cho người dùng để chuyển đổi giữa Dark Mode và Light Mode một cách linh hoạt mà không cần phải thay đổi cài đặt hệ thống.\n"
            + "\n"
            + "a. Thêm Nút Chuyển Đổi\n"
            + "Bạn có thể tạo một nút hoặc công tắc để người dùng chọn chế độ sáng hoặc tối theo ý thích.",
            "Giải thích:\n"
            + "\n"
            + "Đoạn mã JavaScript kiểm tra nút khi người dùng nhấn vào để chuyển đổi chế độ giữa sáng và tối.\n"
            + "\n"
            + "Khi người dùng click vào nút, lớp dark-mode sẽ được thêm hoặc xóa khỏi body, làm thay đổi giao diện.",
            "Để giữ lại lựa chọn Dark Mode của người dùng, bạn có thể lưu trạng thái vào localStorage hoặc cookies. Điều này giúp trạng thái Dark Mode không bị mất khi người dùng làm mới trang hoặc quay lại sau một thời gian.",
            "Giải thích:\n"
            + "\n"
            + "Khi người dùng thay đổi chế độ, trạng thái sẽ được lưu vào localStorage để khi người dùng quay lại trang, chế độ mà họ đã chọn sẽ được áp dụng tự động.",
            "Hình ảnh nền: Các hình ảnh nền sáng có thể trở nên khó nhìn trong Dark Mode. Bạn có thể thay thế các hình ảnh sáng bằng hình nền tối khi người dùng chuyển sang chế độ tối hoặc cung cấp một phiên bản hình ảnh riêng cho Dark Mode.\n"
            + "\n"
            + "Biểu tượng: Biểu tượng sáng có thể khó nhìn trên nền tối. Hãy đảm bảo rằng các biểu tượng được thiết kế sao cho có thể nhìn rõ trên cả nền sáng và tối. Bạn có thể sử dụng SVG hoặc icon set có thể thay đổi màu sắc dễ dàng.",
            "Kiểm tra trên các thiết bị và trình duyệt khác nhau: Hãy chắc chắn rằng Dark Mode hoạt động tốt trên mọi thiết bị và trình duyệt mà người dùng có thể sử dụng.\n"
            + "\n"
            + "Tối ưu hóa hiệu suất: Hãy đảm bảo rằng việc chuyển đổi giữa các chế độ không làm ảnh hưởng đến hiệu suất trang web hoặc ứng dụng của bạn.",
            "Android: Bạn có thể sử dụng chế độ tối trong Android bằng cách sử dụng AppCompatDelegate.setDefaultNightMode() trong ứng dụng Android.\n"
            + "\n"
            + "iOS: Trên iOS, chế độ tối được hỗ trợ tự động, và bạn có thể kiểm soát nó bằng cách sử dụng UITraitCollection trong UIViewController để phản hồi khi chế độ sáng/tối thay đổi.",
            "Triển khai Dark Mode là một quá trình đơn giản nếu bạn làm theo các bước trên, từ việc thiết kế giao diện đến việc sử dụng CSS và JavaScript để thêm tính năng chuyển đổi chế độ. Bằng cách cung cấp tính năng Dark Mode, bạn sẽ giúp người dùng có một trải nghiệm tốt hơn, giảm mỏi mắt và tối ưu hóa sử dụng năng lượng cho thiết bị của họ."
        });
        Content_MAP.put("Animation nâng cao là gì?", new String[]{
            "Animation nâng cao (Advanced Animation) là những kỹ thuật hoạt hình và chuyển động phức tạp hơn so với các animation cơ bản. Nó liên quan đến việc sử dụng các công cụ và phương pháp phức tạp để tạo ra các chuyển động, hiệu ứng và tương tác đa dạng trong giao diện người dùng, ứng dụng, website, hoặc trò chơi. Animation nâng cao không chỉ làm đẹp giao diện mà còn có thể tăng trải nghiệm người dùng, làm cho các ứng dụng hoặc website trở nên sống động và dễ sử dụng hơn.",
            "Chuyển Động Liên Tục và Mượt Mà\n"
            + "\n"
            + "Các animation nâng cao thường không chỉ là những chuyển động đơn giản mà là những chuỗi chuyển động liền mạch, mềm mại, tạo ra cảm giác tự nhiên. Các yếu tố như tốc độ và độ trễ (timing) của animation đóng vai trò quan trọng trong việc tạo ra sự mượt mà và dễ chịu cho người dùng.\n"
            + "\n"
            + "Hiệu Ứng Phức Tạp\n"
            + "\n"
            + "Các hiệu ứng animation nâng cao thường sử dụng nhiều thuộc tính CSS hoặc JavaScript để làm thay đổi nhiều yếu tố trên trang cùng một lúc. Ví dụ như cảm biến cuộn (scrolling effects), parallax, hoặc transitions phức tạp.\n"
            + "\n"
            + "Các kỹ thuật như easing functions (thêm độ trễ vào các chuyển động để chúng trở nên mượt mà hơn) cũng là một phần quan trọng trong animation nâng cao.\n"
            + "\n"
            + "Tạo Hiệu Ứng 3D\n"
            + "\n"
            + "Animation nâng cao có thể bao gồm cả chuyển động 3D, với việc sử dụng các thuộc tính như transform và perspective để tạo ra cảm giác chiều sâu và không gian 3D. Ví dụ: các khối quay, hiệu ứng parallax hoặc các hoạt ảnh dạng xoay (rotate) có chiều sâu.\n"
            + "\n"
            + "Những hiệu ứng này có thể sử dụng WebGL hoặc các thư viện như three.js để tạo các hình ảnh động 3D phức tạp.\n"
            + "\n"
            + "Sử Dụng Các Công Cụ và Thư Viện Animation\n"
            + "\n"
            + "CSS Animations và CSS Transitions có thể làm việc tốt cho các animation cơ bản, nhưng animation nâng cao yêu cầu các công cụ mạnh mẽ hơn như JavaScript, GSAP (GreenSock Animation Platform), PixiJS hoặc Anime.js.\n"
            + "\n"
            + "Các thư viện này cung cấp các công cụ mạnh mẽ để tạo hiệu ứng và chuyển động phức tạp như cuộn mượt mà, chuyển động đồng bộ của nhiều đối tượng, hoặc hoạt hình cùng lúc nhiều yếu tố trang web.\n"
            + "\n"
            + "Chuyển Động Tương Tác\n"
            + "\n"
            + "Animation nâng cao có thể tạo ra các chuyển động và hiệu ứng dựa trên hành vi người dùng, như khi người dùng di chuột qua các yếu tố trên trang hoặc khi họ cuộn trang. Các hiệu ứng này không chỉ phản hồi lại tương tác mà còn có thể tạo ra một trải nghiệm người dùng hấp dẫn, ví dụ như:\n"
            + "\n"
            + "Hover Effects: Chuyển động xảy ra khi người dùng di chuột qua một phần tử.\n"
            + "\n"
            + "Scroll Animations: Animation được kích hoạt khi người dùng cuộn trang đến một vị trí nhất định.\n"
            + "\n"
            + "Tạo Hoạt Hình Phức Tạp với Timeline và Keyframes\n"
            + "\n"
            + "Sử dụng keyframes trong CSS hoặc JavaScript cho phép bạn tạo những chuyển động phức tạp qua nhiều giai đoạn. Animation nâng cao thường sử dụng các keyframes để điều khiển chuyển động của các phần tử qua nhiều bước thay vì chỉ một chuyển động đơn giản.\n"
            + "\n"
            + "Timeline trong các thư viện như GSAP cho phép bạn đồng bộ hóa nhiều animation, điều khiển thời gian, tạo các chuỗi chuyển động phức tạp.",
            "Easing Functions\n"
            + "\n"
            + "Easing functions là các thuật toán điều chỉnh tốc độ của một chuyển động trong animation. Các easing phổ biến bao gồm:\n"
            + "\n"
            + "Ease-in: Chuyển động bắt đầu chậm và tăng tốc dần.\n"
            + "\n"
            + "Ease-out: Chuyển động bắt đầu nhanh và giảm tốc.\n"
            + "\n"
            + "Ease-in-out: Chuyển động bắt đầu chậm, tăng tốc rồi lại giảm tốc.\n"
            + "\n"
            + "Các easing function giúp tạo cảm giác tự nhiên cho các chuyển động thay vì quá khô cứng hoặc không có tính chân thực.\n"
            + "\n"
            + "Chuyển Động Parallax\n"
            + "\n"
            + "Parallax scrolling là kỹ thuật tạo hiệu ứng chiều sâu bằng cách làm cho các lớp đối tượng khác nhau trên trang web di chuyển với tốc độ khác nhau khi người dùng cuộn trang. Đây là một kỹ thuật phổ biến trong thiết kế web hiện đại, mang lại cảm giác sống động và tương tác.\n"
            + "\n"
            + "SVG Animation\n"
            + "\n"
            + "SVG (Scalable Vector Graphics) có thể được sử dụng để tạo ra các animation vector 2D phức tạp. Các animation SVG giúp tạo ra những chuyển động sắc nét, không bị vỡ khi phóng to mà vẫn giữ được chất lượng cao. SVG animation có thể được sử dụng trong CSS hoặc JavaScript để tạo các hình ảnh động như logo, biểu đồ, hoặc các hình dạng động.\n"
            + "\n"
            + "Chuyển Động 3D và Hiệu Ứng Bóng Đổ\n"
            + "\n"
            + "Với CSS3, bạn có thể tạo ra các hiệu ứng 3D như chuyển động xoay các đối tượng trong không gian ba chiều hoặc làm các đối tượng nổi lên, lùi lại nhờ vào các thuộc tính như perspective, transform và rotate.\n"
            + "\n"
            + "Các hiệu ứng bóng đổ tinh vi có thể tạo ra chiều sâu và cảm giác chuyển động cho các phần tử trong giao diện, giúp chúng trở nên sống động hơn.\n"
            + "\n"
            + "Animated Sprites (Hoạt hình đối tượng sprite)\n"
            + "\n"
            + "Sprite sheets là các hình ảnh động được tạo thành từ nhiều khung hình trong một hình ảnh duy nhất. Các animation sprite giúp tạo các chuyển động mượt mà, như nhân vật trong game hoặc các chuyển động động vật, khi lặp qua các khung hình khác nhau.\n"
            + "\n"
            + "Thường được sử dụng trong game, website hoặc ứng dụng di động.",
            "Giải thích:\n"
            + "\n"
            + "gsap.from() và gsap.to() là các hàm của GSAP để tạo animation. Với duration và ease, bạn có thể điều khiển độ dài và độ trễ của chuyển động.\n"
            + "\n"
            + "x, opacity, scale là các thuộc tính có thể được điều chỉnh để thay đổi vị trí, độ mờ, hoặc kích thước của phần tử.",
            "Animation nâng cao không chỉ giúp làm đẹp giao diện mà còn nâng cao trải nghiệm người dùng, tạo cảm giác sống động và tương tác mượt mà. Việc áp dụng các kỹ thuật phức tạp như easing, parallax, chuyển động 3D, và sử dụng các thư viện như GSAP sẽ giúp bạn tạo ra các hiệu ứng chuyển động mạnh mẽ và thú vị, làm cho ứng dụng và website của bạn trở nên độc đáo và hấp dẫn hơn."
        });
        Content_MAP.put("Các yếu tố quan trọng của animation nâng cao", new String[]{
            "Timing là yếu tố cơ bản trong mọi animation nâng cao. Tốc độ chuyển động cần được điều chỉnh sao cho hợp lý, không quá nhanh khiến người dùng không kịp theo dõi, cũng không quá chậm làm giảm sự tương tác.\n"
            + "\n"
            + "Easing: Là các hàm điều chỉnh tốc độ chuyển động của các đối tượng trong animation. Các easing functions như ease-in, ease-out, ease-in-out giúp tạo ra chuyển động mượt mà hơn, tự nhiên hơn. Cảm giác mượt mà, trơn tru là một trong những yếu tố quan trọng của animation nâng cao.",
            "Animation nâng cao thường dựa vào sự tương tác của người dùng. Các animation phản hồi lại hành vi của người dùng, chẳng hạn như khi người dùng di chuột qua, nhấp chuột, kéo trang, hoặc cuộn trang.\n"
            + "\n"
            + "Các yếu tố như hover effects, scroll animations, click-triggered animations hay drag-and-drop animations đều là các yếu tố giúp tạo nên sự tương tác mượt mà giữa người dùng và giao diện.",
            "Các chuyển động trong animation nâng cao cần phải phản ánh các chuyển động tự nhiên. Điều này có thể bao gồm việc sử dụng các kỹ thuật như easing, anticipation, overshoot, hoặc settling để làm cho các chuyển động trở nên hợp lý hơn và dễ chịu hơn cho người dùng.\n"
            + "\n"
            + "Anticipation (dự đoán) là kỹ thuật để người xem cảm thấy chuyển động diễn ra một cách tự nhiên, ví dụ như trước khi một vật thể di chuyển, nó có thể hơi rút lại một chút để tạo cảm giác \"tiến về phía trước\".\n"
            + "\n"
            + "Overshoot là khi một đối tượng vượt qua mục tiêu rồi quay lại để dừng lại ở điểm cuối, tạo cảm giác tự nhiên, như đối tượng \"đánh động\" một chút trước khi dừng lại.",
            "Smoothness là yếu tố then chốt của animation nâng cao. Các chuyển động nên liên tục và mượt mà mà không bị gián đoạn hay trục trặc. Để đạt được độ mượt mà, bạn cần tối ưu hóa hiệu suất và tránh quá tải các phần tử khi triển khai animation.\n"
            + "\n"
            + "Framerate: Một framerate ổn định (60 fps) là lý tưởng để tạo ra chuyển động mượt mà. Các animation cần phải được tối ưu để không bị giật, chậm.",
            "Parallax: Là kỹ thuật tạo hiệu ứng chiều sâu bằng cách làm cho các đối tượng trên trang web di chuyển với tốc độ khác nhau khi người dùng cuộn trang. Parallax là một kỹ thuật rất phổ biến trong thiết kế web hiện đại.\n"
            + "\n"
            + "Scroll-based Animations: Là các animation được kích hoạt khi người dùng cuộn trang đến một vị trí nhất định. Điều này giúp tạo ra trải nghiệm tương tác phong phú và hấp dẫn.\n"
            + "\n"
            + "CSS Transitions and Keyframes: Cung cấp cách dễ dàng để thực hiện các animation phức tạp mà không cần đến JavaScript. Các thuộc tính như @keyframes trong CSS giúp bạn tạo chuyển động phức tạp từ một trạng thái này sang trạng thái khác.\n"
            + "\n"
            + "SVG Animations: Sử dụng các hình ảnh vector động giúp tạo ra các animation sắc nét và dễ dàng chỉnh sửa mà không bị vỡ hình.",
            "Animation nâng cao có thể bao gồm cả hiệu ứng 3D, với việc sử dụng các thuộc tính như transform, perspective, rotate, hoặc translate để tạo hiệu ứng chiều sâu. Những kỹ thuật này giúp tạo ra các đối tượng có cảm giác ba chiều, ví dụ như các hộp quay, đối tượng di chuyển trong không gian 3D.\n"
            + "\n"
            + "WebGL và three.js là các công nghệ cho phép tạo các animation 3D phức tạp trong trình duyệt.",
            "Hiệu suất là yếu tố rất quan trọng khi triển khai animation nâng cao. Những animation phức tạp có thể làm chậm hiệu suất của trang web hoặc ứng dụng nếu không được tối ưu đúng cách. Các kỹ thuật tối ưu hóa hiệu suất bao gồm:\n"
            + "\n"
            + "Reduce Layout Reflow and Repaint: Tránh thay đổi các thuộc tính ảnh hưởng đến layout (như chiều cao, chiều rộng) trong quá trình animation.\n"
            + "\n"
            + "Hardware Acceleration: Sử dụng các thuộc tính như transform và opacity thay vì thay đổi các thuộc tính như top, left, để tận dụng khả năng tăng tốc phần cứng của GPU.",
            "Layered animation là việc áp dụng nhiều hiệu ứng animation khác nhau cho các phần tử khác nhau trên trang web, tạo ra chiều sâu và sự phức tạp. Ví dụ, có thể có các hiệu ứng animation cho background, text, button, icon, v.v., tất cả đều diễn ra đồng thời nhưng ở các mức độ khác nhau.\n"
            + "\n"
            + "Các animation này có thể được thực hiện đồng bộ hoặc bất đồng bộ để tạo ra hiệu ứng chuyển động phức tạp hơn và phong phú hơn.",
            "Animation nâng cao không chỉ làm đẹp cho giao diện mà còn phải phục vụ mục đích chức năng và cải thiện trải nghiệm người dùng. Ví dụ:\n"
            + "\n"
            + "Loading Animations: Các animation trong lúc tải trang hoặc nội dung giúp người dùng cảm thấy thời gian chờ đợi không quá lâu.\n"
            + "\n"
            + "Feedback Animations: Các animation phản hồi lại hành động của người dùng (như nhấp chuột, nhập liệu) giúp người dùng cảm thấy tương tác được phản hồi ngay lập tức, mang lại cảm giác trực quan hơn.",
            "Synchronization của các animation là rất quan trọng để chúng không bị lệch nhịp, tạo cảm giác không đồng bộ. Khi nhiều phần tử có animation chạy đồng thời, bạn cần phải kiểm soát thời gian (timing) và các bước thực thi sao cho các chuyển động diễn ra nhịp nhàng và tự nhiên.",
            "Animation nâng cao không chỉ đơn thuần là về hiệu ứng đẹp mắt mà còn giúp tạo ra một trải nghiệm người dùng hấp dẫn và tương tác. Để thực hiện animation nâng cao hiệu quả, bạn cần cân nhắc về timing, interactivity, chuyển động tự nhiên, hiệu suất và sự đồng bộ giữa các phần tử. Khi áp dụng đúng cách, animation nâng cao có thể giúp giao diện ứng dụng hoặc website của bạn trở nên sống động và dễ sử dụng hơn rất nhiều."
        });
        Content_MAP.put("Lợi ích của animation nâng cao", new String[]{
            "Tạo cảm giác phản hồi nhanh chóng: Các animation nâng cao giúp người dùng nhận thấy các hành động của mình có tác động ngay lập tức lên giao diện, chẳng hạn như hiệu ứng khi nhấn nút, cuộn trang hay di chuột qua các phần tử. Điều này làm người dùng cảm thấy ứng dụng hoặc website phản hồi nhanh chóng và linh hoạt.\n"
            + "\n"
            + "Hướng dẫn người dùng: Các animation có thể giúp hướng dẫn người dùng về các tính năng của giao diện, như việc di chuyển hoặc tương tác với các phần tử. Ví dụ, các animation có thể chỉ ra các bước tiếp theo trong quy trình hoặc thu hút sự chú ý đến các phần quan trọng của giao diện.\n"
            + "\n"
            + "Tạo cảm giác trực quan: Animation giúp chuyển động các yếu tố giao diện một cách mượt mà, giúp người dùng cảm nhận được sự thay đổi một cách rõ ràng và dễ dàng.",
            "Tạo ra giao diện sinh động: Animation nâng cao làm cho giao diện trở nên sống động và bắt mắt, thu hút sự chú ý của người dùng ngay từ lần đầu tiên truy cập. Những chuyển động mượt mà, sáng tạo không chỉ khiến giao diện thêm phần thu hút mà còn tạo cảm giác hiện đại và chuyên nghiệp.\n"
            + "\n"
            + "Tạo sự khác biệt và độc đáo: Sử dụng các animation độc đáo có thể giúp thương hiệu hoặc ứng dụng của bạn nổi bật trong đám đông. Điều này có thể tạo ấn tượng mạnh mẽ đối với người dùng và khiến họ nhớ đến sản phẩm hoặc dịch vụ của bạn.",
            "Hiệu ứng loading: Các animation như loading spinners hay progress bars có thể giúp người dùng cảm thấy thoải mái hơn khi phải chờ đợi quá trình tải dữ liệu. Thay vì để người dùng cảm thấy mất kiên nhẫn, animation giúp họ nhận biết quá trình đang diễn ra và thời gian chờ đợi không trở nên dài đằng đẵng.\n"
            + "\n"
            + "Cải thiện cảm giác thời gian: Animation có thể làm giảm cảm giác khó chịu trong thời gian chờ đợi, giúp người dùng cảm thấy thời gian trôi qua nhanh hơn.",
            "Khuyến khích người dùng tương tác: Những animation thú vị và hấp dẫn có thể kích thích người dùng tương tác nhiều hơn. Ví dụ, animation cho các nút khi hover hoặc nhấp chuột sẽ khuyến khích người dùng nhấp vào và khám phá các tính năng khác của ứng dụng hoặc trang web.\n"
            + "\n"
            + "Cải thiện tỷ lệ chuyển đổi: Một giao diện mượt mà và dễ sử dụng có thể giúp tăng tỷ lệ chuyển đổi. Ví dụ, animation làm nổi bật các nút Call to Action (CTA) sẽ khiến người dùng dễ dàng nhận ra và thực hiện hành động mà bạn mong muốn, chẳng hạn như mua hàng hoặc đăng ký.",
            "Đảm bảo tính nhất quán: Animation nâng cao có thể giúp giao diện trở nên mạch lạc và nhất quán. Các chuyển động mượt mà giúp các phần tử như nút, menu hoặc các khối nội dung có thể di chuyển hoặc thay đổi vị trí một cách tự nhiên, làm giảm sự \"giật cục\" trong giao diện.\n"
            + "\n"
            + "Giảm sự phân tán: Các animation giúp điều chỉnh chuyển động của các phần tử trên trang, giúp người dùng tập trung vào những phần quan trọng và tránh sự phân tán. Ví dụ, các hiệu ứng cuộn mượt mà giúp người dùng cảm nhận trang có một nhịp điệu nhất định, tránh việc các yếu tố trên trang di chuyển một cách rời rạc.",
            "Tối ưu hóa giao diện động: Animation nâng cao có thể giúp tối ưu hóa việc sử dụng tài nguyên trên trang web. Ví dụ, thay vì tải tất cả các phần tử cùng một lúc, animation có thể chỉ kích hoạt các phần tử khi người dùng cuộn đến chúng, giúp giảm tải cho website và cải thiện hiệu suất.\n"
            + "\n"
            + "Giảm sự tắc nghẽn giao diện: Các animation có thể giúp giảm số lượng yếu tố cố định trên trang và thay vào đó sử dụng các yếu tố động, điều này làm giảm sự tắc nghẽn trong giao diện và tạo không gian tốt hơn cho người dùng.",
            "Tạo sự kết nối cảm xúc: Animation có thể tác động đến cảm xúc của người dùng. Ví dụ, những chuyển động nhẹ nhàng, uyển chuyển có thể tạo cảm giác thư giãn, trong khi các chuyển động nhanh hoặc mạnh mẽ có thể tạo cảm giác năng động, kích thích.\n"
            + "\n"
            + "Truyền tải thông điệp rõ ràng: Các animation giúp truyền tải thông điệp của một ứng dụng hoặc sản phẩm theo cách dễ hiểu và trực quan. Thông qua các chuyển động, bạn có thể làm nổi bật các tính năng đặc biệt hoặc lợi ích của sản phẩm một cách dễ dàng.",
            "Tổ chức thông tin trực quan: Animation có thể giúp nhóm thông tin thành các phần nhỏ dễ tiêu thụ hơn. Ví dụ, khi bạn có nhiều dữ liệu cần trình bày, animation có thể làm cho quá trình này mượt mà hơn bằng cách chia nhỏ các phần tử hoặc làm cho chúng xuất hiện một cách từ từ.\n"
            + "\n"
            + "Cải thiện khả năng hiển thị: Khi có nhiều nội dung hoặc dữ liệu cần người dùng chú ý, animation có thể làm nổi bật các yếu tố quan trọng như thông báo, cập nhật hoặc cảnh báo.",
            "Phản hồi rõ ràng: Các animation có thể giúp cải thiện khả năng sử dụng của giao diện, làm rõ các thay đổi trạng thái (chẳng hạn như nút bị vô hiệu hóa hoặc một mục đã được chọn). Điều này giúp người dùng dễ dàng theo dõi trạng thái của các phần tử và tránh sự nhầm lẫn.\n"
            + "\n"
            + "Cải thiện điều hướng: Animation giúp người dùng dễ dàng di chuyển giữa các phần của giao diện mà không cảm thấy bối rối. Những hiệu ứng chuyển động mượt mà có thể làm rõ ràng các sự kiện trên trang và giúp người dùng cảm nhận được các thay đổi một cách trực quan.",
            "Phản hồi mượt mà trên mọi thiết bị: Animation nâng cao, nếu được tối ưu đúng cách, có thể cung cấp trải nghiệm mượt mà trên cả desktop và thiết bị di động, cải thiện khả năng sử dụng và trải nghiệm trên các màn hình nhỏ hơn.\n"
            + "\n"
            + "Khả năng thích ứng với các tình huống mạng chậm: Các animation có thể được tối ưu hóa để hoạt động hiệu quả ngay cả khi kết nối mạng yếu, giúp tránh làm chậm hoặc gián đoạn trải nghiệm của người dùng.",
            "Animation nâng cao không chỉ giúp giao diện trở nên sinh động mà còn cải thiện trải nghiệm người dùng, tăng tính thẩm mỹ, tối ưu hiệu suất và tăng khả năng tương tác. Khi sử dụng một cách hợp lý, animation có thể giúp trang web hoặc ứng dụng của bạn trở nên hấp dẫn hơn, dễ sử dụng và dễ nhớ hơn đối với người dùng."
        });
        Content_MAP.put("Manifest.json là gì?", new String[]{
            "Manifest.json là một tệp cấu hình cực kỳ quan trọng trong các ứng dụng web hiện đại (đặc biệt là Progressive Web App - PWA) và các tiện ích mở rộng trình duyệt (browser extensions).\n"
            + "Tệp này chứa thông tin mô tả về ứng dụng hoặc tiện ích, giúp trình duyệt hoặc thiết bị hiểu cách xử lý ứng dụng đó.",
            "manifest.json là tệp JSON chứa các metadata (dữ liệu mô tả) như: tên ứng dụng, phiên bản, biểu tượng, quyền truy cập, tệp khởi chạy, chế độ hiển thị, v.v.\n"
            + "\n"
            + "Nó không thực thi mã, chỉ cung cấp thông tin để hệ thống đọc và hiểu cách ứng dụng vận hành.",
            "Web Application (nhất là Progressive Web App – PWA): manifest giúp web app có thể \"cài như app\" trên điện thoại, có icon, màn hình splash đẹp như app gốc.\n"
            + "\n"
            + "Browser Extension (tiện ích Chrome, Firefox...): manifest định nghĩa quyền truy cập, scripts cần tải, giao diện popup, v.v.\n"
            + "\n"
            + "Game, App trên nền web cũng dùng manifest để khai báo thông tin sản phẩm.",
            "Manifest của một PWA:",
            "Manifest của một Chrome Extension:",
            "🔥 Biến web thành app: Cho phép web app được thêm vào home screen, hoạt động như app mobile native.\n"
            + "\n"
            + "🔒 Quản lý bảo mật: Trong tiện ích trình duyệt, manifest khai báo rõ quyền truy cập, giúp kiểm soát bảo mật.\n"
            + "\n"
            + "📱 Cá nhân hóa giao diện: Tùy chỉnh icon, theme, splash screen theo brand của ứng dụng.\n"
            + "\n"
            + "🚀 Tối ưu hóa trải nghiệm người dùng: Giao diện khởi động nhanh, nhất quán, đẹp hơn.\n"
            + ""
        });
        Content_MAP.put("Các yếu tố quan trọng của manifest.json", new String[]{
            "Tên đầy đủ hiển thị khi người dùng cài đặt hoặc mở ứng dụng.\n"
            + "\n"
            + "Nên ngắn gọn, dễ hiểu, liên quan trực tiếp đến chức năng chính.\n"
            + "",
            "Hiển thị trong không gian nhỏ như màn hình chính điện thoại hoặc menu ứng dụng.\n"
            + "\n"
            + "Giúp tên không bị cắt xén hoặc tràn chữ.",
            "Câu mô tả ngắn gọn về mục đích, tính năng của app hay tiện ích.\n"
            + "\n"
            + "Quan trọng khi người dùng tìm kiếm hoặc xem thông tin chi tiết.\n"
            + "",
            "Trang web nào sẽ được mở đầu tiên khi người dùng khởi chạy ứng dụng.\n"
            + "\n"
            + "Cực kỳ quan trọng để đảm bảo trải nghiệm mượt mà và đúng mục tiêu.",
            "Các hình ảnh icon ở nhiều kích thước (ví dụ: 192x192px, 512x512px) để hiển thị đẹp trên mọi thiết bị.\n"
            + "\n"
            + "Một file manifest thiếu icons sẽ làm ứng dụng trông thiếu chuyên nghiệp.",
            "Quyết định giao diện người dùng khi app được mở:\n"
            + "\n"
            + "standalone: Trông như ứng dụng riêng (không có thanh địa chỉ).\n"
            + "\n"
            + "fullscreen: Chiếm toàn bộ màn hình.\n"
            + "\n"
            + "minimal-ui: Giao diện gọn nhẹ.\n"
            + "\n"
            + "browser: Hiển thị như trang web bình thường.",
            "Màu sắc hiển thị trong lúc app đang tải.\n"
            + "\n"
            + "Chọn màu hài hòa với giao diện chính để tăng trải nghiệm thị giác.",
            "Thay đổi màu của thanh công cụ trình duyệt và một số thành phần hệ thống để đồng bộ với brand.\n"
            + "",
            "Quy định ứng dụng sẽ cố định ở chiều ngang (landscape) hay dọc (portrait) hay cả hai.",
            "Giới hạn phạm vi URL người dùng có thể truy cập trong ứng dụng.\n"
            + "",
            "Một file manifest.json chuẩn và tốt giống như tấm “hồ sơ lý lịch” cho web app/extension của bạn:\n"
            + "➡️ Đầy đủ thông tin.\n"
            + "➡️ Trình bày chuyên nghiệp.\n"
            + "➡️ Tối ưu trải nghiệm người dùng từ cái nhìn đầu tiên."
        });
        Content_MAP.put("Service Worker là gì?", new String[]{
            "Service Worker là một file JavaScript chạy ngầm trong trình duyệt, giúp quản lý yêu cầu mạng, cache dữ liệu, hỗ trợ offline, gửi thông báo đẩy và nhiều chức năng nền khác cho web app.",
            "Ban đầu: User truy cập web, Service Worker được cài đặt và cache dữ liệu.\n"
            + "\n"
            + "Sau này: Khi offline hoặc mạng yếu, web vẫn chạy mượt nhờ lấy tài nguyên từ cache.\n"
            + "\n"
            + "Có mạng: Service Worker có thể tự động cập nhật tài nguyên mới.",
            "Chạy độc lập: Hoạt động riêng, không phụ thuộc vào giao diện web.\n"
            + "\n"
            + "Không truy cập trực tiếp DOM: Chỉ giao tiếp qua các sự kiện.\n"
            + "\n"
            + "Lắng nghe các sự kiện: Như install, activate, fetch, push, v.v.\n"
            + "\n"
            + "Yêu cầu HTTPS: Chỉ hoạt động trên HTTPS để đảm bảo an toàn (hoặc localhost khi dev).\n"
            + "\n"
            + "Vòng đời riêng: Gồm các giai đoạn install → activate → fetch.",
            "Cache tài nguyên: HTML, CSS, JS, ảnh, dữ liệu API,...\n"
            + "\n"
            + "Hỗ trợ Offline: Người dùng vẫn dùng web ngay cả khi mất mạng.\n"
            + "\n"
            + "Push Notification: Gửi thông báo từ server đến trình duyệt.\n"
            + "\n"
            + "Background Sync: Đồng bộ dữ liệu tự động khi có mạng trở lại.",
            "Đăng ký Service Worker trong trang web:",
            "Nội dung file service-worker.js:",
            "Service Worker giúp web nhanh hơn, mượt hơn, offline được, cập nhật thông minh và là linh hồn của Progressive Web App (PWA).\n"
            + "\n"
            + "Biết dùng Service Worker = bạn đã tiến một bước lớn trong việc làm web chuyên nghiệp!"
        });
        Content_MAP.put("Các yếu tố quan trọng về Service Worker", new String[]{
            "Install: Khi Service Worker lần đầu được cài đặt → bạn thường cache các tài nguyên quan trọng.\n"
            + "\n"
            + "Activate: Dọn dẹp cache cũ, chuẩn bị cho Service Worker mới thay thế.\n"
            + "\n"
            + "Fetch: Chặn các request mạng và quyết định trả về dữ liệu từ cache hay từ server.\n"
            + "\n"
            + "👉 Quản lý tốt vòng đời sẽ giúp web hoạt động ổn định và ít lỗi.",
            "Cache chiến lược: Lưu các file HTML, CSS, JS, ảnh... để web có thể tải nhanh hoặc offline.\n"
            + "\n"
            + "Phiên bản hóa cache: Khi cập nhật website, cần tạo cache mới và xóa cache cũ.\n"
            + "\n"
            + "👉 Nếu không quản lý cache đúng cách, người dùng có thể thấy phiên bản web cũ.",
            "Service Worker có thể bắt mọi yêu cầu mạng (API, ảnh, tài liệu...) rồi quyết định:\n"
            + "\n"
            + "Trả dữ liệu từ cache.\n"
            + "\n"
            + "Gửi yêu cầu mới ra server.\n"
            + "\n"
            + "Hoặc kết hợp cả hai (stale-while-revalidate).\n"
            + "\n"
            + "👉 Giúp tăng tốc độ tải trang và hỗ trợ hoạt động offline.",
            "Push Notification: Gửi thông báo đẩy đến người dùng ngay cả khi trình duyệt đang đóng.\n"
            + "\n"
            + "Background Sync: Gửi dữ liệu tự động (ví dụ gửi bài viết, đơn hàng) khi mạng trở lại.\n"
            + "\n"
            + "👉 Giúp trải nghiệm người dùng tốt hơn, không lo mất kết nối.",
            "Service Worker chỉ hoạt động trên HTTPS (trừ localhost trong lúc phát triển).\n"
            + "\n"
            + "Vì Service Worker có thể can thiệp vào request/response nên bắt buộc phải đảm bảo an toàn.\n"
            + "\n"
            + "👉 Luôn kiểm tra kỹ lưỡng để tránh lỗ hổng bảo mật.",
            "Vòng đời (Life Cycle)\n"
            + "→ Điều khiển quá trình cài đặt, kích hoạt, cập nhật, thay thế Service Worker.\n"
            + "\n"
            + "Caching\n"
            + "→ Lưu trữ tài nguyên (HTML, CSS, JS, ảnh...) để website có thể tải nhanh hơn và hoạt động offline.\n"
            + "\n"
            + "Xử lý yêu cầu mạng (Fetch Handling)\n"
            + "→ Chủ động chặn và xử lý request để quyết định lấy dữ liệu từ cache hay từ server.\n"
            + "\n"
            + "Push Notification và Background Sync\n"
            + "→ Cho phép gửi thông báo đẩy và đồng bộ dữ liệu ngay cả khi người dùng offline.\n"
            + "\n"
            + "Yêu cầu HTTPS để bảo mật\n"
            + "→ Service Worker chỉ hoạt động trên các trang web HTTPS nhằm đảm bảo an toàn dữ liệu."
        });
        Content_MAP.put("Caching trong Service Worker", new String[]{
            "Caching trong Service Worker là kỹ thuật lưu trữ tài nguyên (HTML, CSS, JS, ảnh, fonts...) để:\n"
            + "\n"
            + "Tăng tốc độ tải trang.\n"
            + "\n"
            + "Giảm phụ thuộc vào mạng.\n"
            + "\n"
            + "Hỗ trợ chế độ offline cho web app.\n"
            + "",
            "Khi install Service Worker → bạn cache các tài nguyên cần thiết.\n"
            + "\n"
            + "Khi fetch request từ web → Service Worker sẽ kiểm tra cache trước, sau đó mới quyết định:\n"
            + "\n"
            + "Trả tài nguyên từ cache.\n"
            + "\n"
            + "Hoặc gửi yêu cầu ra server.",
            " Cache First (Ưu tiên Cache)\n"
            + "Kiểm tra cache trước.\n"
            + "\n"
            + "Nếu có, trả ngay.\n"
            + "\n"
            + "Nếu không, mới fetch từ mạng.\n"
            + "\n"
            + "👉 Phù hợp cho: ảnh, icon, file CSS, JS ít thay đổi.\n"
            + "\n"
            + "2. Network First (Ưu tiên Mạng)\n"
            + "Cố fetch từ mạng trước.\n"
            + "\n"
            + "Nếu mạng lỗi, fallback về cache.\n"
            + "\n"
            + "👉 Phù hợp cho: tin tức, bài blog, dữ liệu động.\n"
            + "\n"
            + "3. Cache Then Network (Song song)\n"
            + "Gửi yêu cầu mạng và lấy cache cùng lúc.\n"
            + "\n"
            + "Hiển thị nhanh bản cache, sau đó cập nhật bằng dữ liệu mới.\n"
            + "\n"
            + "👉 Phù hợp cho: nội dung cần vừa nhanh vừa cập nhật.\n"
            + "\n"
            + "4. Stale-While-Revalidate\n"
            + "Trả về cache ngay lập tức để user không phải chờ.\n"
            + "\n"
            + "Đồng thời, âm thầm fetch bản mới và cập nhật cache sau.\n"
            + "\n"
            + "👉 Phù hợp cho: web cần tốc độ cao và dữ liệu tương đối ổn định.",
            "Trong service-worker.js:",
            "Cache thông minh = web siêu nhanh + hoạt động offline.\n"
            + "\n"
            + "Quản lý phiên bản cache đúng cách để tránh lỗi dữ liệu cũ.\n"
            + "\n"
            + "Không nên cache dữ liệu cực kỳ động (như bảng giá chứng khoán).\n"
            + ""
        });
        Content_MAP.put("Các lợi ích của Service Worker & Caching", new String[]{
            "Khi tài nguyên như hình ảnh, CSS, JavaScript được lưu vào cache, trình duyệt có thể lấy chúng ngay lập tức từ bộ nhớ cục bộ thay vì tải lại từ server.\n"
            + "\n"
            + "Điều này giúp thời gian phản hồi nhanh hơn, đặc biệt là khi người dùng truy cập lại trang web lần thứ hai trở đi.\n"
            + "\n"
            + "Kết quả: Web mượt mà hơn, giảm tỷ lệ thoát trang, tăng thời gian người dùng ở lại.",
            "Service Worker giúp ứng dụng vẫn hoạt động bình thường ngay cả khi không có mạng Internet.\n"
            + "\n"
            + "Khi người dùng mất kết nối, Service Worker sẽ lấy dữ liệu đã lưu trong cache để hiển thị nội dung.\n"
            + "\n"
            + "Đây là yếu tố cực kỳ quan trọng đối với những web app cần độ ổn định cao (như tin tức, game, bản đồ, ghi chú…).",
            "Vì dữ liệu đã cache trên thiết bị người dùng, nên mỗi lần truy cập, ít request phải gửi đến server.\n"
            + "\n"
            + "Điều này giúp:\n"
            + "\n"
            + "Server hoạt động nhẹ nhàng hơn.\n"
            + "\n"
            + "Tiết kiệm tài nguyên máy chủ.\n"
            + "\n"
            + "Giảm chi phí vận hành, đặc biệt với lượng truy cập lớn.",
            "Tốc độ tải nhanh, khả năng truy cập offline, nội dung luôn sẵn sàng ➔ giúp người dùng cảm thấy hài lòng hơn.\n"
            + "\n"
            + "Người dùng sẽ đánh giá cao sự tiện lợi, đồng thời tăng khả năng:\n"
            + "\n"
            + "Quay lại website nhiều lần.\n"
            + "\n"
            + "Gắn bó lâu dài với sản phẩm.",
            "Push Notification: Gửi tin nhắn/khuyến mãi/nhắc nhở cho người dùng ngay cả khi họ không mở website.\n"
            + "\n"
            + "Background Sync: Khi người dùng thực hiện một hành động lúc offline (ví dụ gửi form, đăng ảnh), Service Worker sẽ tự động gửi dữ liệu đi khi mạng quay trở lại.\n"
            + "\n"
            + "Giúp web app trở nên thông minh và chủ động hơn, như các ứng dụng mobile native.",
            "Service Worker cho phép bạn lập trình logic kiểm soát cache:\n"
            + "\n"
            + "Lựa chọn cache cái gì, trong bao lâu.\n"
            + "\n"
            + "Tự động cập nhật cache khi có phiên bản tài nguyên mới.\n"
            + "\n"
            + "Điều này giúp tránh trường hợp người dùng bị \"kẹt\" với những phiên bản web lỗi thời.",
            "Service Worker là một thành phần bắt buộc để biến một website thành PWA (ứng dụng web tiên tiến).\n"
            + "\n"
            + "Khi tích hợp PWA, website của bạn sẽ có thêm khả năng:\n"
            + "\n"
            + "Cài đặt như app trên điện thoại.\n"
            + "\n"
            + "Chạy ở chế độ full-screen.\n"
            + "\n"
            + "Hoạt động nhanh và mượt như ứng dụng gốc.\n"
            + "",
            "🏎️ Tốc độ tải nhanh hơn\n"
            + "Tài nguyên như hình ảnh, CSS, JS được lưu vào bộ nhớ cache.\n"
            + "\n"
            + "Web tải nhanh gấp nhiều lần, đặc biệt khi truy cập lại.\n"
            + "\n"
            + "🌐 Hỗ trợ truy cập ngoại tuyến\n"
            + "Người dùng có thể truy cập website mà không cần Internet.\n"
            + "\n"
            + "Các nội dung đã lưu trữ sẽ tự động hiển thị.\n"
            + "\n"
            + "🛡️ Giảm tải cho server\n"
            + "Ít request gửi đến server ➔ giảm băng thông tiêu thụ.\n"
            + "\n"
            + "Server chạy nhẹ nhàng, tiết kiệm chi phí hạ tầng.\n"
            + "\n"
            + "🎯 Trải nghiệm người dùng tốt hơn\n"
            + "Web phản hồi nhanh ➔ Người dùng cảm thấy dễ chịu, chuyên nghiệp.\n"
            + "\n"
            + "Tăng khả năng giữ chân người truy cập.\n"
            + "\n"
            + "📬 Push Notification & Background Sync\n"
            + "Gửi tin nhắn cho người dùng ngay cả khi web tắt.\n"
            + "\n"
            + "Đồng bộ hóa dữ liệu ngầm khi mạng trở lại.\n"
            + "\n"
            + "🔧 Kiểm soát tài nguyên chủ động\n"
            + "Lập trình logic cache linh hoạt: cache lâu dài, làm mới dữ liệu khi cần.\n"
            + "\n"
            + "Tránh lỗi hiển thị phiên bản cũ.\n"
            + "\n"
            + "📱 Hỗ trợ phát triển PWA\n"
            + "Biến web thành ứng dụng di động: cài đặt trên máy, chạy toàn màn hình, hoạt động mượt."
        });
        Content_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new String[]{
            "Offline Mode là một chế độ cho phép người dùng tiếp tục truy cập, đọc nội dung, thực hiện một số chức năng cơ bản trên website hoặc ứng dụng ngay cả khi thiết bị không còn kết nối Internet.\n"
            + "\n"
            + "Cơ chế này hoạt động bằng cách:\n"
            + "\n"
            + "Lưu trữ trước các tài nguyên cần thiết như HTML, CSS, JavaScript, hình ảnh, và dữ liệu vào bộ nhớ của trình duyệt hoặc thiết bị.\n"
            + "\n"
            + "Khi mất mạng, thay vì báo lỗi, website sẽ lấy dữ liệu từ bộ nhớ đã lưu để hiển thị, đảm bảo trải nghiệm liền mạch.\n"
            + "\n"
            + "👉 Nói cách khác, Offline Mode giúp các website/web app hoạt động mượt mà như một ứng dụng cài đặt trên máy, mà không hoàn toàn phụ thuộc vào mạng Internet.",
            "Tính liên tục trong trải nghiệm người dùng\n"
            + "\n"
            + "Người dùng không bị gián đoạn công việc hoặc giải trí khi mất mạng.\n"
            + "\n"
            + "Ứng dụng như Google Docs cho phép bạn soạn thảo tài liệu offline rồi đồng bộ sau.\n"
            + "\n"
            + "Tăng sự hài lòng và độ tin cậy\n"
            + "\n"
            + "Người dùng cảm thấy website chuyên nghiệp hơn khi vẫn dùng được dù rớt mạng.\n"
            + "\n"
            + "Website chịu được điều kiện mạng yếu, mạng chập chờn.\n"
            + "\n"
            + "Hỗ trợ cho các khu vực mạng yếu\n"
            + "\n"
            + "Ở những khu vực như nông thôn, miền núi hoặc nơi có kết nối kém, Offline Mode giúp người dùng vẫn có thể sử dụng dịch vụ bình thường.\n"
            + "\n"
            + "Tối ưu chi phí dữ liệu\n"
            + "\n"
            + "Các dữ liệu được cache lại sẽ không phải tải nhiều lần, tiết kiệm băng thông.",
            "Service Worker\n"
            + "Một đoạn script chạy nền trong trình duyệt, cho phép can thiệp vào các request và quản lý dữ liệu cache. Đây là nền tảng quan trọng nhất để hỗ trợ chế độ ngoại tuyến.\n"
            + "\n"
            + "Cache API\n"
            + "Cung cấp khả năng lưu trữ các tài nguyên tĩnh (như HTML, CSS, JavaScript, hình ảnh) vào bộ nhớ trình duyệt, giúp website có thể load nhanh mà không cần truy cập server mỗi lần.\n"
            + "\n"
            + "IndexedDB\n"
            + "Là một hệ quản trị cơ sở dữ liệu phía client, cho phép lưu trữ các dữ liệu dạng lớn và phức tạp như hồ sơ người dùng, tin nhắn, đơn hàng,... để sử dụng khi offline.\n"
            + "\n"
            + "Manifest.json\n"
            + "Một file định dạng JSON giúp khai báo thông tin cơ bản của web app (như tên ứng dụng, biểu tượng, màu nền) và hỗ trợ thiết lập cách hoạt động trong môi trường ngoại tuyến.",
            "Ứng dụng đọc báo: Người dùng tải nội dung tin tức khi online, sau đó có thể đọc offline suốt chuyến tàu/xe.\n"
            + "\n"
            + "Ứng dụng giáo dục: Người học tải bài giảng video, tài liệu khi có mạng và học offline sau đó.\n"
            + "\n"
            + "Ứng dụng nghe nhạc: Spotify, YouTube Music,... cho phép tải playlist yêu thích về nghe offline.",
            "Cần thiết kế giao diện riêng cho tình trạng offline (ví dụ: \"Bạn đang offline, một số tính năng sẽ tạm thời bị giới hạn\").\n"
            + "\n"
            + "Cần quản lý đồng bộ dữ liệu cẩn thận khi người dùng online trở lại (ví dụ: tự động gửi bài viết, đơn hàng,...).\n"
            + "",});
        Content_MAP.put("Các yếu tố quan trọng của Offline Mode", new String[]{
            "Đây là bước đầu tiên và bắt buộc để hỗ trợ chế độ ngoại tuyến.\n"
            + "\n"
            + "Bao gồm lưu sẵn các file HTML, CSS, JavaScript, hình ảnh, fonts... vào bộ nhớ cache của trình duyệt.\n"
            + "\n"
            + "Khi người dùng truy cập website mà không có kết nối mạng, các tài nguyên đã lưu sẽ được tải từ bộ nhớ cache thay vì từ server.\n"
            + "\n"
            + "Cần lên kế hoạch kỹ lưỡng để chọn lọc những tài nguyên nào thật sự cần thiết, tránh làm ứng dụng quá nặng.",
            "Ngoài các file tĩnh, ứng dụng web hiện đại thường cần tải dữ liệu động như bài viết, thông tin sản phẩm, đơn hàng...\n"
            + "\n"
            + "Các dữ liệu này có thể lưu trữ tạm thời bằng IndexedDB hoặc LocalStorage.\n"
            + "\n"
            + "Dữ liệu động cần được đồng bộ với server khi người dùng trực tuyến trở lại, để đảm bảo tính nhất quán.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "Người dùng tạo đơn hàng trong lúc offline → Lưu tạm vào IndexedDB → Khi online, tự động gửi đơn hàng lên server.",
            "Service Worker là thành phần chủ chốt kiểm soát việc giao tiếp mạng và cache.\n"
            + "\n"
            + "Cần xây dựng các kịch bản xử lý thông minh như:\n"
            + "\n"
            + "Ưu tiên lấy từ cache trước, nếu không có thì mới tìm lên mạng (Cache First).\n"
            + "\n"
            + "Hoặc ưu tiên lấy từ mạng, nếu thất bại thì fallback về cache (Network First).\n"
            + "\n"
            + "Phải xử lý cẩn thận các lỗi mạng, timeout để tránh website bị treo hoặc chậm.\n"
            + "\n"
            + "Nên quản lý phiên bản Service Worker để cập nhật cache khi có bản mới.",
            "Giao diện cần thông báo rõ ràng khi người dùng chuyển sang chế độ ngoại tuyến, ví dụ:\n"
            + "\n"
            + "Hiện một banner, popup, hoặc icon nhỏ báo \"Bạn đang sử dụng Offline Mode\".\n"
            + "\n"
            + "Tránh việc người dùng cố thực hiện hành động cần mạng (như thanh toán) mà không biết rằng họ đang offline.\n"
            + "\n"
            + "Có thể cung cấp trải nghiệm giới hạn: cho phép xem nội dung đã lưu nhưng tạm ẩn hoặc khóa những tính năng yêu cầu Internet.",
            "Không phải nội dung nào cũng nên lưu cache vĩnh viễn.\n"
            + "\n"
            + "Các chiến lược phổ biến:\n"
            + "\n"
            + "Cache First: ưu tiên dữ liệu cache, mạng chỉ dùng khi cache thiếu → Tốt cho tài nguyên tĩnh.\n"
            + "\n"
            + "Network First: ưu tiên dữ liệu mới nhất từ mạng, nếu lỗi thì fallback về cache → Tốt cho dữ liệu động.\n"
            + "\n"
            + "Stale-While-Revalidate: trả về dữ liệu cache ngay lập tức và âm thầm cập nhật cache từ mạng → Cân bằng tốt giữa tốc độ và cập nhật mới.",
            "Khi người dùng trở lại online, Service Worker có thể tự động:\n"
            + "\n"
            + "Gửi dữ liệu đã lưu tạm từ local lên server.\n"
            + "\n"
            + "Làm mới nội dung trang để phản ánh trạng thái mới nhất.\n"
            + "\n"
            + "Nếu phức tạp, có thể thêm thông báo cho người dùng xác nhận trước khi gửi dữ liệu.",
            "Nên kiểm tra thiết bị và trình duyệt có hỗ trợ Service Worker không.\n"
            + "\n"
            + "Cần dự phòng trường hợp cache quá cũ, lỗi, hoặc chiếm quá nhiều dung lượng bộ nhớ trình duyệt.\n"
            + "\n"
            + "Hạn chế các chức năng offline đối với các thao tác yêu cầu bảo mật cao như thanh toán, đổi mật khẩu."
        });
        Content_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new String[]{
            "1. Các thành phần cơ bản:\n"
            + "Client (Thiết bị người dùng):\n"
            + "Điện thoại, trình duyệt web, hoặc app sẽ nhận thông báo đẩy.\n"
            + "\n"
            + "Service Worker:\n"
            + "Một script chạy ngầm trong trình duyệt, cho phép web nhận thông báo ngay cả khi không mở.\n"
            + "\n"
            + "Push Service:\n"
            + "Dịch vụ trung gian giúp lưu trữ và chuyển tiếp thông báo (ví dụ: Firebase Cloud Messaging).\n"
            + "\n"
            + "Backend Server:\n"
            + "Nơi gửi yêu cầu push đến Push Service kèm theo nội dung và thông tin người nhận.\n"
            + "\n"
            + "2. Lợi ích khi sử dụng Push Notifications:\n"
            + "Giữ chân người dùng:\n"
            + "Nhắc nhở người dùng quay lại app/web thường xuyên.\n"
            + "\n"
            + "Truyền tải thông tin nhanh chóng:\n"
            + "Cập nhật sự kiện, tin tức, chương trình khuyến mãi ngay lập tức.\n"
            + "\n"
            + "Tăng tỷ lệ chuyển đổi:\n"
            + "Thúc đẩy hành động mua hàng, đăng ký dịch vụ.\n"
            + "\n"
            + "Cá nhân hóa trải nghiệm:\n"
            + "Gửi thông báo dựa trên hành vi và sở thích của từng người.\n"
            + "\n"
            + "3. Các nền tảng hỗ trợ nổi bật:\n"
            + "Firebase Cloud Messaging (FCM):\n"
            + "Miễn phí, dễ tích hợp cho Android, iOS, Web.\n"
            + "\n"
            + "OneSignal:\n"
            + "Giao diện quản lý đẹp, hỗ trợ nhiều tùy chỉnh nâng cao.\n"
            + "\n"
            + "APNs (Apple Push Notification Service):\n"
            + "Hệ thống thông báo chính thức của Apple dành cho iOS/macOS.\n"
            + "\n"
            + "Web Push Protocols:\n"
            + "Chuẩn cho trình duyệt web (VAPID, Encrypted Payloads).",
            "Đăng ký nhận thông báo:\n"
            + "\n"
            + "Người dùng được hỏi có cho phép nhận thông báo hay không.\n"
            + "\n"
            + "Nếu đồng ý, thiết bị sẽ tạo một Subscription Token (mã định danh nhận thông báo).\n"
            + "\n"
            + "Gửi thông báo từ server:\n"
            + "\n"
            + "Server backend sử dụng dịch vụ gửi push (như Firebase Cloud Messaging, OneSignal, VAPID) để gửi nội dung đến thiết bị có token.\n"
            + "\n"
            + "Service Worker xử lý (trên web):\n"
            + "\n"
            + "Đối với web, Service Worker sẽ \"nghe\" và hiển thị thông báo đẩy ngay cả khi website không mở.\n"
            + "\n"
            + "Hiển thị thông báo cho người dùng:\n"
            + "\n"
            + "Thông báo hiện ra theo thiết kế sẵn (title, body, icon, action buttons...).",
            "✅ Giữ chân người dùng:\n"
            + "\n"
            + "Thường xuyên nhắc người dùng về sản phẩm, chương trình mới.\n"
            + "\n"
            + "✅ Tăng tương tác:\n"
            + "\n"
            + "Gửi nội dung cá nhân hóa theo thói quen sử dụng.\n"
            + "\n"
            + "✅ Tăng doanh thu:\n"
            + "\n"
            + "Đẩy mạnh các chương trình khuyến mãi, ưu đãi giới hạn thời gian.\n"
            + "\n"
            + "✅ Cập nhật thông tin nhanh chóng:\n"
            + "\n"
            + "Tin tức nóng hổi, thay đổi quan trọng được gửi ngay lập tức.\n"
            + "\n"
            + "✅ Xây dựng thương hiệu:\n"
            + "\n"
            + "Nhắc nhớ sự hiện diện thương hiệu trong tâm trí khách hàng.",
            "Subscription:\n"
            + "\n"
            + "Token định danh thiết bị người dùng nhận push.\n"
            + "\n"
            + "Notification Payload:\n"
            + "\n"
            + "Nội dung thực sự của thông báo (title, message, image, actions).\n"
            + "\n"
            + "Push Service:\n"
            + "\n"
            + "Dịch vụ trung gian đảm nhận việc truyền tải thông báo.\n"
            + "\n"
            + "Service Worker (đối với web):\n"
            + "\n"
            + "Một file script chạy ngầm xử lý nhận và hiển thị push.",
            "Xin phép người dùng một cách hợp lý, đừng xin ngay khi vừa vào website.\n"
            + "\n"
            + "Cá nhân hóa nội dung dựa trên hành vi, vị trí địa lý, lịch sử sử dụng.\n"
            + "\n"
            + "Tần suất gửi hợp lý: Gửi quá nhiều sẽ khiến người dùng \"bỏ thông báo\" hoặc thậm chí block luôn app/web.\n"
            + "\n"
            + "Tối ưu nội dung: Tiêu đề hấp dẫn, nội dung ngắn gọn, có lời kêu gọi hành động mạnh mẽ.\n"
            + "\n"
            + "Chạy A/B Testing thường xuyên để tối ưu hiệu quả thông báo."});
        Content_MAP.put("Các yếu tố quan trọng của Push Notifications", new String[]{
            "Trước khi gửi thông báo, cần yêu cầu người dùng cấp quyền rõ ràng.\n"
            + "\n"
            + "Nên lựa chọn thời điểm hợp lý: ví dụ sau khi người dùng tương tác vài lần với ứng dụng, thay vì yêu cầu ngay từ lần đầu truy cập.\n"
            + "\n"
            + "Tâm lý người dùng rất quan trọng: Nếu họ cảm thấy bị làm phiền, họ sẽ tắt hoặc từ chối vĩnh viễn.",
            "Tiêu đề phải gây chú ý chỉ trong vài giây đầu tiên.\n"
            + "\n"
            + "Nội dung cần ngắn gọn, cụ thể, tránh quá chung chung hoặc \"spam\" kiểu quảng cáo trắng trợn.\n"
            + "\n"
            + "Sử dụng emoji, biểu tượng nhỏ nếu phù hợp để làm tăng tính thu hút.",
            "Thời điểm gửi thông báo ảnh hưởng rất lớn tới khả năng người dùng mở nó.\n"
            + "\n"
            + "Ví dụ: Không nên gửi vào giữa đêm, hoặc vào giờ làm việc bận rộn.\n"
            + "\n"
            + "Có thể dùng hệ thống lập lịch thông minh để cá nhân hóa thời gian gửi theo từng múi giờ hoặc thói quen online của người dùng.",
            "Thông báo càng cá nhân hóa thì tỷ lệ mở càng cao.\n"
            + "\n"
            + "Ví dụ:\n"
            + "\n"
            + "\"Chào Linh, sản phẩm bạn yêu thích đã giảm giá!\"\n"
            + "\n"
            + "\"Đơn hàng #A1234 của bạn đã được giao thành công!\"",
            "Nên cho phép người dùng thực hiện hành động trực tiếp từ thông báo:\n"
            + "\n"
            + "Ví dụ: nút \"Xem ngay\", \"Mua ngay\", \"Trả lời tin nhắn\" ngay trên giao diện thông báo.\n"
            + "\n"
            + "Điều này giúp rút ngắn hành trình hành động, tăng chuyển đổi.",
            "Chia nhóm dựa trên:\n"
            + "\n"
            + "Độ tuổi, giới tính, vị trí địa lý.\n"
            + "\n"
            + "Hành vi mua sắm, sở thích, lịch sử sử dụng dịch vụ.\n"
            + "\n"
            + "Mục tiêu: Gửi đúng thông điệp tới đúng người, đúng lúc.",
            "Các chỉ số cần theo dõi:\n"
            + "\n"
            + "Tỷ lệ mở (Open Rate).\n"
            + "\n"
            + "Tỷ lệ click (Click-Through Rate).\n"
            + "\n"
            + "Tỷ lệ từ chối thông báo.\n"
            + "\n"
            + "Dựa trên dữ liệu thu thập được để liên tục cải thiện nội dung, thời gian, và tần suất gửi.",
            "Gửi quá nhiều → Người dùng cảm thấy phiền và sẽ tắt thông báo hoặc gỡ app.\n"
            + "\n"
            + "Gửi quá ít → Người dùng có thể quên mất sự tồn tại của bạn.\n"
            + "\n"
            + "Cần cân đối, ưu tiên chất lượng thông báo hơn số lượng.",
            "Ngoài dạng text thông thường, có thể dùng:\n"
            + "\n"
            + "Hình ảnh minh họa (Big Picture Notifications).\n"
            + "\n"
            + "Video thumbnail.\n"
            + "\n"
            + "Carousels (dạng trượt nhiều nội dung trong 1 thông báo).",
            "Sử dụng Push Notifications như một phần trong kế hoạch giữ chân người dùng lâu dài.\n"
            + "\n"
            + "Ví dụ: nhắc người dùng quay lại app nếu đã lâu không sử dụng, hoặc gửi tin chúc mừng vào những dịp đặc biệt (sinh nhật, ngày lễ,…).",
            "Test A/B liên tục: Tiêu đề nào, nội dung nào mang lại open rate cao hơn.\n"
            + "\n"
            + "Xây dựng chuỗi Push: Ví dụ một chuỗi 3–4 thông báo tự động gửi theo hành vi người dùng.\n"
            + "\n"
            + "Tận dụng AI: Một số nền tảng push có AI tự động chọn thời điểm và nội dung phù hợp nhất cho từng người."
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getContent(String language, int index) {
        if (Content_MAP.containsKey(language)) {
            String[] descriptions = Content_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getContent(String language) {
        return Content_MAP.getOrDefault(language, new String[]{});
    }

    private static final Map<String, String[]> Code_MAP = new HashMap<>();

    static {
        Code_MAP.put("Giới Thiệu HTML", new String[]{
            "<p>Đây là một đoạn văn bản.</p>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "  <head>\n"
            + "    <title>Tiêu đề trang</title>\n"
            + "  </head>\n"
            + "  <body>\n"
            + "    <h1>Chào mừng đến với website!</h1>\n"
            + "    <p>Đây là nội dung chính.</p>\n"
            + "  </body>\n"
            + "</html>"
        });
        Code_MAP.put("Lịch Sử Phát Triển Của HTML", new String[]{
            ""
        });
        Code_MAP.put("Cách HTML Hoạt Động", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "  <head>\n"
            + "    <title>Trang đầu tiên</title>\n"
            + "  </head>\n"
            + "  <body>\n"
            + "    <h1>Chào mừng!</h1>\n"
            + "    <p>Đây là một đoạn văn.</p>\n"
            + "  </body>\n"
            + "</html>"
        });
        Code_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "<!DOCTYPE html>",
            "<html> ... </html>",
            "<html lang=\"vi\">",
            "<head>\n"
            + "  ... (thông tin meta, tiêu đề, liên kết CSS, script...)\n"
            + "</head>",
            "<body>\n"
            + "  ... (tiêu đề, đoạn văn, hình ảnh, video, liên kết...)\n"
            + "</body>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "  <head>\n"
            + "    <!-- Thông tin, cấu hình -->\n"
            + "  </head>\n"
            + "  <body>\n"
            + "    <!-- Nội dung trang -->\n"
            + "  </body>\n"
            + "</html>"
        });
        Code_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "<html lang=\"vi\">",
            "<title>Trang chủ của tôi</title>",
            "<meta charset=\"UTF-8\">\n"
            + "<meta name=\"description\" content=\"Trang web giới thiệu sản phẩm.\">",
            "<link rel=\"stylesheet\" href=\"style.css\">",
            "<h1>Giới thiệu công ty</h1>",
            "<p>Chúng tôi cung cấp dịch vụ tốt nhất thị trường.</p>",
            "<a href=\"https://www.example.com\">Truy cập website</a>",
            "<img src=\"hinh-anh.jpg\" alt=\"Mô tả hình ảnh\">",
            "<ul>\n"
            + "  <li>HTML</li>\n"
            + "  <li>CSS</li>\n"
            + "  <li>JavaScript</li>\n"
            + "</ul>"
        });
        Code_MAP.put("Tạo File HTML", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Trang Đầu Tiên</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Xin chào thế giới!</h1>\n"
            + "  <p>Đây là trang HTML đầu tiên của tôi.</p>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            ""
        });
        Code_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            ""
        });
        Code_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "<h1>Giới Thiệu HTML</h1>\n"
            + "\n"
            + "<h2>Lịch Sử Phát Triển</h2>\n"
            + "<h3>HTML 1.0</h3>\n"
            + "<h3>HTML 2.0</h3>\n"
            + "\n"
            + "<h2>Cách Hoạt Động</h2>\n"
            + "<h3>HTML và Trình Duyệt</h3>"
        });
        Code_MAP.put("Lỗi Thường Gặp", new String[]{
            "<h1>Tiêu đề\n"
            + "<p>Đoạn văn bản</p>",
            "<h1>Tiêu đề</h1>\n"
            + "<p>Đoạn văn bản</p>",
            "<html>\n"
            + "<head>\n"
            + "  <title>Trang Web</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Chào mừng</h1>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "  <title>Trang Web</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Chào mừng</h1>\n"
            + "</body>\n"
            + "</html>",
            "<img src=\"hinh-anh.jpg\">\n"
            + "<a href=\"https://www.example.com\">Truy cập</a>",
            "<titile>Trang web của tôi</titile>",
            "<title>Trang web của tôi</title>",
            "<h1>Tiêu đề <p>Đoạn văn</p></h1>",
            "<h1>Tiêu đề</h1>\n"
            + "<p>Đoạn văn</p>",
            "<img src=\"image.jpg\">",
            "<img src=\"image.jpg\" alt=\"Mô tả hình ảnh\">",
            "<head>\n"
            + "  <title>Trang Web</title>\n"
            + "</head>",
            "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Trang Web</title>\n"
            + "</head>",
            "<link rel=\"stylesheet\" href=\"style.css\">\n"
            + "<script src=\"script.js\"></script>"
        });
        Code_MAP.put("Đoạn Văn (<p>)", new String[]{
            "<p>Đây là một đoạn văn trong HTML.</p>",
            "<p>HTML là một ngôn ngữ đánh dấu được sử dụng để tạo trang web.</p>\n"
            + "<p>Đoạn văn này có thể chứa <a href=\"https://www.example.com\">liên kết</a> đến một trang web khác.</p>\n"
            + "<p><strong>Công nghệ web</strong> đang phát triển rất nhanh chóng!</p>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Đoạn Văn</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <p>HTML là ngôn ngữ đánh dấu giúp tạo ra các trang web.</p>\n"
            + "  <p>Chúng ta có thể sử dụng các thẻ HTML để định dạng và tổ chức nội dung trang web.</p>\n"
            + "  <p>Đây là <a href=\"https://www.example.com\">liên kết</a> đến một trang khác.</p>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Xuống Dòng (<br>)", new String[]{
            "<p>Đây là dòng văn bản đầu tiên.<br>Đây là dòng văn bản tiếp theo.</p>",
            "<p>Đây là dòng đầu tiên.<br>Đây là dòng thứ hai.<br>Đây là dòng thứ ba.</p>",
            "Đây là dòng đầu tiên.\n"
            + "Đây là dòng thứ hai.\n"
            + "Đây là dòng thứ ba.",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Xuống Dòng</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <p>Đây là một câu. <br> Đây là câu tiếp theo trong cùng một đoạn văn.</p>\n"
            + "  <p>Đoạn văn này <br> có nhiều dòng hơn với <br> thẻ <br>.</p>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Đường Ngang (<hr>)", new String[]{
            "<hr>",
            "<p>Đây là phần nội dung đầu tiên.</p>\n"
            + "<hr>\n"
            + "<p>Đây là phần nội dung thứ hai, tách biệt với phần đầu.</p>",
            "Đây là phần nội dung đầu tiên.\n"
            + "--------------------------------------------------\n"
            + "Đây là phần nội dung thứ hai, tách biệt với phần đầu.",
            "<style>\n"
            + "  hr {\n"
            + "    border: 1px solid #000;  /* Đường kẻ ngang màu đen */\n"
            + "    width: 50%;  /* Chiều rộng đường kẻ chiếm 50% */\n"
            + "    margin: 20px 0;  /* Khoảng cách trên và dưới đường kẻ */\n"
            + "  }\n"
            + "</style>",
            "<hr>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Đường Ngang</title>\n"
            + "  <style>\n"
            + "    hr {\n"
            + "      border: 1px dashed #ff6347;  /* Đường kẻ ngang kiểu dashed */\n"
            + "      width: 70%;  /* Đặt chiều rộng đường kẻ ngang */\n"
            + "      margin: 20px auto;  /* Khoảng cách trên và dưới */\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <p>Đây là phần nội dung đầu tiên.</p>\n"
            + "  <hr>\n"
            + "  <p>Đây là phần nội dung tiếp theo.</p>\n"
            + "  <hr>\n"
            + "  <p>Cuối cùng là phần nội dung thứ ba.</p>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Các Thẻ Định Dạng Phổ Biến", new String[]{
            "<b>Văn bản này sẽ được in đậm.</b>",
            "<strong>Văn bản này là quan trọng.</strong>",
            "<i>Văn bản này sẽ được in nghiêng.</i>",
            "<em>Văn bản này là quan trọng.</em>",
            "<u>Văn bản này có gạch dưới.</u>",
            "<mark>Văn bản này được đánh dấu.</mark>",
            "<small>Văn bản này sẽ nhỏ hơn bình thường.</small>",
            "<del>Văn bản này đã bị xóa.</del>",
            "<ins>Văn bản này đã được thêm vào.</ins>",
            "H<sub>2</sub>O",
            "X<sup>2</sup>",
            "<a href=\"https://www.example.com\">Truy cập trang web</a>",
            "<ul>\n"
            + "  <li>Phần tử 1</li>\n"
            + "  <li>Phần tử 2</li>\n"
            + "</ul>",
            "<ol>\n"
            + "  <li>Phần tử 1</li>\n"
            + "  <li>Phần tử 2</li>\n"
            + "</ol>",
            "<code>var x = 5;</code>",
            "<pre>\n"
            + "  Đoạn văn này giữ nguyên định dạng\n"
            + "  và khoảng trắng như trong mã nguồn.\n"
            + "</pre>"
        });
        Code_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Ví Dụ Định Dạng Văn Bản</title>\n"
            + "  <style>\n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "    }\n"
            + "    p {\n"
            + "      font-size: 18px;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "  <h1>Ví Dụ Về Định Dạng Văn Bản</h1>\n"
            + "  \n"
            + "  <!-- In đậm -->\n"
            + "  <p><b>Đoạn văn này được in đậm.</b></p>\n"
            + "  \n"
            + "  <!-- Nhấn mạnh (In đậm và Italic) -->\n"
            + "  <p><strong>Văn bản này là quan trọng và cần được nhấn mạnh.</strong></p>\n"
            + "  \n"
            + "  <!-- In nghiêng -->\n"
            + "  <p><i>Đoạn văn này được in nghiêng.</i></p>\n"
            + "  \n"
            + "  <!-- Gạch dưới -->\n"
            + "  <p><u>Văn bản này có gạch dưới.</u></p>\n"
            + "  \n"
            + "  <!-- Đánh dấu -->\n"
            + "  <p><mark>Văn bản này được đánh dấu bằng màu vàng.</mark></p>\n"
            + "  \n"
            + "  <!-- Gạch bỏ -->\n"
            + "  <p><del>Văn bản này đã bị xóa.</del></p>\n"
            + "  \n"
            + "  <!-- Chèn thêm -->\n"
            + "  <p><ins>Văn bản này được thêm vào.</ins></p>\n"
            + "  \n"
            + "  <!-- Chữ dưới (Subscript) -->\n"
            + "  <p>Phân tử H<sub>2</sub>O là nước.</p>\n"
            + "  \n"
            + "  <!-- Chữ trên (Superscript) -->\n"
            + "  <p>2<sup>3</sup> = 8 (Lũy thừa của 2).</p>\n"
            + "  \n"
            + "  <!-- Liên kết -->\n"
            + "  <p><a href=\"https://www.example.com\">Truy cập trang web Example</a></p>\n"
            + "  \n"
            + "  <!-- Danh sách không thứ tự -->\n"
            + "  <ul>\n"
            + "    <li>Có thể dùng để tạo danh sách không có thứ tự.</li>\n"
            + "    <li>Các mục sẽ được đánh dấu bằng dấu chấm.</li>\n"
            + "  </ul>\n"
            + "  \n"
            + "  <!-- Danh sách có thứ tự -->\n"
            + "  <ol>\n"
            + "    <li>Các mục trong danh sách sẽ được đánh số tự động.</li>\n"
            + "    <li>Có thể sử dụng cho các bước theo thứ tự.</li>\n"
            + "  </ol>\n"
            + "\n"
            + "  <!-- Đoạn mã -->\n"
            + "  <p><code>var x = 10;</code> - Đây là một đoạn mã JavaScript.</p>\n"
            + "  \n"
            + "  <!-- Văn bản định dạng sẵn -->\n"
            + "  <pre>\n"
            + "  Đây là văn bản định dạng sẵn.\n"
            + "  Khoảng trắng và dấu xuống dòng được giữ nguyên.\n"
            + "  </pre>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Danh sách là gì?", new String[]{
            "danh_sach = [1, 2, 3, 4, 5]",
            "ArrayList<String> danhSach = new ArrayList<>();\n"
            + "danhSach.add(\"An\");\n"
            + "danhSach.add(\"Bình\");\n"
            + "danhSach.add(\"Chi\");",
            "vector<int> danh_sach = {1, 2, 3, 4, 5};"
        });
        Code_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new String[]{
            "<ol>\n"
            + "  <li>Chuẩn bị bài</li>\n"
            + "  <li>Tham gia lớp học</li>\n"
            + "  <li>Ôn tập sau giờ học</li>\n"
            + "</ol>",
            "<ol type=\"A\">\n"
            + "  <li>HTML</li>\n"
            + "  <li>CSS</li>\n"
            + "  <li>JavaScript</li>\n"
            + "</ol>",
            "<ol start=\"5\">\n"
            + "  <li>Bước một</li>\n"
            + "  <li>Bước hai</li>\n"
            + "</ol>",
            "<ol reversed>\n"
            + "  <li>Phần ba</li>\n"
            + "  <li>Phần hai</li>\n"
            + "  <li>Phần một</li>\n"
            + "</ol>",
            "<ol>\n"
            + "  <li>Chuẩn bị nguyên liệu\n"
            + "    <ul>\n"
            + "      <li>Gạo</li>\n"
            + "      <li>Muối</li>\n"
            + "    </ul>\n"
            + "  </li>\n"
            + "  <li>Thực hiện\n"
            + "    <ul>\n"
            + "      <li>Vo gạo</li>\n"
            + "      <li>Nấu cơm</li>\n"
            + "    </ul>\n"
            + "  </li>\n"
            + "</ol>"
        });
        Code_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new String[]{
            "<ul>\n"
            + "  <li>Ăn sáng</li>\n"
            + "  <li>Đi học</li>\n"
            + "  <li>Thể dục thể thao</li>\n"
            + "</ul>",
            "<ul style=\"list-style-type: square;\">\n"
            + "  <li>Đọc sách</li>\n"
            + "  <li>Nghe nhạc</li>\n"
            + "  <li>Chơi thể thao</li>\n"
            + "</ul>",
            "<ul>\n"
            + "  <li>Môn học yêu thích\n"
            + "    <ul>\n"
            + "      <li>Toán</li>\n"
            + "      <li>Văn</li>\n"
            + "      <li>Tiếng Anh</li>\n"
            + "    </ul>\n"
            + "  </li>\n"
            + "  <li>Hoạt động ngoại khóa\n"
            + "    <ul>\n"
            + "      <li>Đá bóng</li>\n"
            + "      <li>Vẽ tranh</li>\n"
            + "    </ul>\n"
            + "  </li>\n"
            + "</ul>"
        });
        Code_MAP.put("Danh Sách Mô Tả (<dl>)", new String[]{
            "<dl>\n"
            + "  <dt>HTML</dt>\n"
            + "  <dd>Ngôn ngữ đánh dấu để xây dựng trang web.</dd>\n"
            + "\n"
            + "  <dt>CSS</dt>\n"
            + "  <dd>Ngôn ngữ tạo phong cách cho trang web.</dd>\n"
            + "\n"
            + "  <dt>JavaScript</dt>\n"
            + "  <dd>Ngôn ngữ lập trình để làm trang web tương tác.</dd>\n"
            + "</dl>",
            "<dl>\n"
            + "  <dt>HTML</dt>\n"
            + "  <dd>HyperText Markup Language.</dd>\n"
            + "  <dd>Dùng để tạo cấu trúc cơ bản cho website.</dd>\n"
            + "</dl>"
        });
        Code_MAP.put("Chèn Ảnh (<img>)", new String[]{
            "<img src=\"path/to/image.jpg\" alt=\"Mô tả ảnh\">",
            "<img src=\"https://example.com/images/photo.jpg\" alt=\"Ảnh từ URL\">",
            "<img src=\"images/photo.jpg\" alt=\"Ảnh từ file cục bộ\">",
            "<img src=\"image-not-found.jpg\" alt=\"Hình ảnh không tải được, vui lòng kiểm tra lại đường dẫn\">",
            "<img src=\"image.jpg\" width=\"500\" height=\"300\" alt=\"Ảnh chỉnh kích thước\">",
            "<img src=\"image.jpg\" alt=\"Ảnh thay đổi kích thước\" style=\"width: 100%; height: auto;\">",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Chèn Ảnh trong HTML</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <!-- Chèn ảnh từ URL -->\n"
            + "    <img src=\"https://example.com/photo.jpg\" alt=\"Ảnh phong cảnh\" width=\"500\" height=\"300\">\n"
            + "\n"
            + "    <!-- Chèn ảnh từ file cục bộ -->\n"
            + "    <img src=\"images/photo.jpg\" alt=\"Ảnh thiên nhiên\" width=\"400\" height=\"250\">\n"
            + "\n"
            + "    <!-- Ảnh thay thế khi không tải được -->\n"
            + "    <img src=\"not-found.jpg\" alt=\"Ảnh không tải được\" width=\"300\" height=\"200\">\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Chèn Video (<video>)", new String[]{
            "<video src=\"path/to/video.mp4\" controls>\n"
            + "    Trình duyệt của bạn không hỗ trợ thẻ video.\n"
            + "</video>",
            "<video src=\"movie.mp4\" controls></video>",
            "<video src=\"movie.mp4\" autoplay></video>",
            "<video src=\"movie.mp4\" loop></video>",
            "<video src=\"movie.mp4\" poster=\"thumbnail.jpg\" controls></video>",
            "<video controls>\n"
            + "    <source src=\"movie.mp4\" type=\"video/mp4\">\n"
            + "    <source src=\"movie.ogv\" type=\"video/ogg\">\n"
            + "    <source src=\"movie.webm\" type=\"video/webm\">\n"
            + "    Trình duyệt của bạn không hỗ trợ thẻ video.\n"
            + "</video>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Chèn Video trong HTML</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <h2>Video Ví Dụ</h2>\n"
            + "\n"
            + "    <!-- Video với nhiều định dạng -->\n"
            + "    <video width=\"600\" controls autoplay loop muted poster=\"poster-image.jpg\">\n"
            + "        <source src=\"movie.mp4\" type=\"video/mp4\">\n"
            + "        <source src=\"movie.ogv\" type=\"video/ogg\">\n"
            + "        <source src=\"movie.webm\" type=\"video/webm\">\n"
            + "        Trình duyệt của bạn không hỗ trợ thẻ video.\n"
            + "    </video>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Chèn Âm Thanh (<audio>)", new String[]{
            "<audio src=\"path/to/audio.mp3\" controls>\n"
            + "    Trình duyệt của bạn không hỗ trợ thẻ audio.\n"
            + "</audio>",
            "<audio src=\"audio.mp3\" controls></audio>",
            "<audio src=\"audio.mp3\" controls></audio>",
            "<audio src=\"audio.mp3\" autoplay controls></audio>",
            "<audio src=\"audio.mp3\" loop controls></audio>",
            "<audio src=\"audio.mp3\" muted controls></audio>",
            "<audio src=\"audio.mp3\" preload=\"auto\" controls></audio>",
            "<audio controls>\n"
            + "    <source src=\"audio.mp3\" type=\"audio/mp3\">\n"
            + "    <source src=\"audio.ogg\" type=\"audio/ogg\">\n"
            + "    <source src=\"audio.wav\" type=\"audio/wav\">\n"
            + "    Trình duyệt của bạn không hỗ trợ thẻ audio.\n"
            + "</audio>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Chèn Âm Thanh trong HTML</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <h2>Âm Thanh Ví Dụ</h2>\n"
            + "\n"
            + "    <!-- Âm thanh với nhiều định dạng -->\n"
            + "    <audio controls autoplay loop muted preload=\"auto\">\n"
            + "        <source src=\"audio.mp3\" type=\"audio/mp3\">\n"
            + "        <source src=\"audio.ogg\" type=\"audio/ogg\">\n"
            + "        <source src=\"audio.wav\" type=\"audio/wav\">\n"
            + "        Trình duyệt của bạn không hỗ trợ thẻ audio.\n"
            + "    </audio>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new String[]{
            "<a href=\"URL\">Văn bản hiển thị liên kết</a>",
            "<a href=\"https://www.example.com\">Truy cập Example</a>",
            "<a href=\"https://www.example.com\">Đi đến Example</a>",
            "<a href=\"https://www.example.com\" target=\"_blank\">Mở trang trong cửa sổ mới</a>",
            "<a href=\"https://www.example.com\" title=\"Đến trang Example\">Truy cập Example</a>",
            "<a href=\"https://www.example.com\" target=\"_blank\" rel=\"noopener noreferrer\">Mở trang Example</a>",
            "<a href=\"https://www.example.com\">Truy cập Example</a>",
            "<a href=\"/about.html\">Về chúng tôi</a>",
            "<h2 id=\"section1\">Mục 1</h2>",
            "<a href=\"#section1\">Đi đến Mục 1</a>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Liên Kết trong HTML</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <h2>Ví Dụ Liên Kết</h2>\n"
            + "    \n"
            + "    <!-- Liên kết tới trang web khác -->\n"
            + "    <a href=\"https://www.example.com\" target=\"_blank\" title=\"Truy cập trang Example\">Truy cập trang Example</a><br>\n"
            + "    \n"
            + "    <!-- Liên kết đến một trang trong cùng website -->\n"
            + "    <a href=\"/about.html\">Giới thiệu về chúng tôi</a><br>\n"
            + "    \n"
            + "    <!-- Liên kết đến một phần của cùng trang -->\n"
            + "    <a href=\"#section1\">Đi đến Mục 1</a><br>\n"
            + "    \n"
            + "    <h3 id=\"section1\">Mục 1</h3>\n"
            + "    <p>Đây là phần đầu tiên của trang web.</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new String[]{
            "<h2 id=\"gioi-thieu\">Giới thiệu</h2>",
            "<a href=\"#gioi-thieu\">Xem phần Giới thiệu</a>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Liên Kết Trong Trang</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <!-- Menu liên kết -->\n"
            + "    <h1>Danh Mục</h1>\n"
            + "    <ul>\n"
            + "        <li><a href=\"#gioi-thieu\">Giới thiệu</a></li>\n"
            + "        <li><a href=\"#dich-vu\">Dịch vụ</a></li>\n"
            + "        <li><a href=\"#lien-he\">Liên hệ</a></li>\n"
            + "    </ul>\n"
            + "\n"
            + "    <!-- Nội dung chính -->\n"
            + "    <h2 id=\"gioi-thieu\">Giới thiệu</h2>\n"
            + "    <p>Chúng tôi chuyên cung cấp dịch vụ chất lượng cao...</p>\n"
            + "\n"
            + "    <h2 id=\"dich-vu\">Dịch vụ</h2>\n"
            + "    <p>Chúng tôi cung cấp nhiều loại dịch vụ khác nhau...</p>\n"
            + "\n"
            + "    <h2 id=\"lien-he\">Liên hệ</h2>\n"
            + "    <p>Liên hệ với chúng tôi qua email hoặc số điện thoại...</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<style>\n"
            + "    html {\n"
            + "        scroll-behavior: smooth;\n"
            + "    }\n"
            + "</style>"
        });
        Code_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new String[]{
            "<a href=\"https://example.com\">Trang chủ</a>",
            "<a href=\"https://example.com\" target=\"_blank\">Mở trang mới</a>",
            "<a href=\"https://example.com\" title=\"Đi tới Example\">Trang Example</a>",
            "<a href=\"file.zip\" download>Tải file ZIP</a>",
            "<a href=\"file.zip\" download=\"TaiVe.zip\">Tải ngay</a>",
            "<a href=\"https://example.com\" target=\"_blank\" rel=\"noopener noreferrer\">Link an toàn</a>",});
        Code_MAP.put("Liên Kết Hình Ảnh", new String[]{
            "<a href=\"https://example.com\">\n"
            + "    <img src=\"hinh-anh.jpg\" alt=\"Mô tả hình ảnh\">\n"
            + "</a>",
            "<a href=\"index.html\">\n"
            + "    <img src=\"logo.png\" alt=\"Logo Trang Chủ\" width=\"150\" height=\"80\">\n"
            + "</a>",
            "<a href=\"https://example.com\" target=\"_blank\">\n"
            + "    <img src=\"banner.jpg\" alt=\"Xem chi tiết\">\n"
            + "</a>",
            "<style>\n"
            + "  a img:hover {\n"
            + "      opacity: 0.7;\n"
            + "      transition: 0.3s;\n"
            + "  }\n"
            + "</style>"
        });
        Code_MAP.put("Cấu Trúc Thẻ <iframe>", new String[]{
            "<iframe src=\"duong-dan-den-trang.html\"></iframe>",
            "<iframe src=\"https://example.com\" width=\"600\" height=\"400\" title=\"Website Ví dụ\"></iframe>",
            "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ID_VIDEO\" title=\"YouTube Video\" allowfullscreen></iframe>",
            "<iframe src=\"https://www.google.com/maps/embed?pb=...\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" title=\"Bản đồ Google Maps\"></iframe>"
        });
        Code_MAP.put("Tại Sao Sử Dụng Iframe?", new String[]{
            ""
        });
        Code_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new String[]{
            "<iframe src=\"https://example.com\" sandbox></iframe>",
            "<iframe src=\"https://example.com\" loading=\"lazy\"></iframe>",
            "<iframe src=\"https://example.com\" width=\"600\" height=\"400\"></iframe>"
        });
        Code_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new String[]{
            "<table>\n"
            + "    <tr>\n"
            + "        <th>Tiêu đề cột 1</th>\n"
            + "        <th>Tiêu đề cột 2</th>\n"
            + "        <th>Tiêu đề cột 3</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Dữ liệu 1</td>\n"
            + "        <td>Dữ liệu 2</td>\n"
            + "        <td>Dữ liệu 3</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Dữ liệu 4</td>\n"
            + "        <td>Dữ liệu 5</td>\n"
            + "        <td>Dữ liệu 6</td>\n"
            + "    </tr>\n"
            + "</table>",
            "<table border=\"1\">\n"
            + "    <tr>\n"
            + "        <th>Họ</th>\n"
            + "        <th>Tên</th>\n"
            + "        <th>Tuổi</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Nguyễn</td>\n"
            + "        <td>Anh</td>\n"
            + "        <td>25</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Trần</td>\n"
            + "        <td>Lan</td>\n"
            + "        <td>28</td>\n"
            + "    </tr>\n"
            + "</table>",
            "<table border=\"1\" cellspacing=\"5\" cellpadding=\"10\">\n"
            + "    <tr>\n"
            + "        <th>Họ</th>\n"
            + "        <th>Tên</th>\n"
            + "        <th>Tuổi</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Nguyễn</td>\n"
            + "        <td>Anh</td>\n"
            + "        <td>25</td>\n"
            + "    </tr>\n"
            + "</table>"
        });
        Code_MAP.put("Các Thuộc Tính Của Bảng", new String[]{
            "<table border=\"1\" cellspacing=\"5\" cellpadding=\"10\" width=\"100%\" bgcolor=\"#f0f0f0\">\n"
            + "    <tr align=\"center\" bgcolor=\"#d3d3d3\">\n"
            + "        <th colspan=\"2\">Thông Tin Cá Nhân</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Họ</td>\n"
            + "        <td>Nguyễn</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Tên</td>\n"
            + "        <td>Anh</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Tuổi</td>\n"
            + "        <td>25</td>\n"
            + "    </tr>\n"
            + "</table>"
        });
        Code_MAP.put("Bảng Nâng Cao", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Bảng Nâng Cao</title>\n"
            + "    <style>\n"
            + "        table {\n"
            + "            width: 80%;\n"
            + "            margin: 20px auto;\n"
            + "            border-collapse: collapse; /* Kết hợp các đường viền */\n"
            + "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Tạo bóng cho bảng */\n"
            + "        }\n"
            + "        th, td {\n"
            + "            padding: 12px;\n"
            + "            text-align: left;\n"
            + "            border: 1px solid #ddd;\n"
            + "        }\n"
            + "        th {\n"
            + "            background-color: #4CAF50;\n"
            + "            color: white;\n"
            + "        }\n"
            + "        tr:nth-child(even) {\n"
            + "            background-color: #f2f2f2; /* Màu nền cho các hàng chẵn */\n"
            + "        }\n"
            + "        tr:hover {\n"
            + "            background-color: #ddd; /* Hiệu ứng hover khi di chuột */\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>Danh Sách Nhân Viên</h2>\n"
            + "\n"
            + "<table>\n"
            + "    <tr>\n"
            + "        <th>ID</th>\n"
            + "        <th>Họ Tên</th>\n"
            + "        <th>Chức Vụ</th>\n"
            + "        <th>Tuổi</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>1</td>\n"
            + "        <td>Nguyễn Anh</td>\n"
            + "        <td>Giám Đốc</td>\n"
            + "        <td>30</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>2</td>\n"
            + "        <td>Trần Lan</td>\n"
            + "        <td>Quản Lý</td>\n"
            + "        <td>28</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>3</td>\n"
            + "        <td>Phạm Lâm</td>\n"
            + "        <td>Nhân Viên</td>\n"
            + "        <td>25</td>\n"
            + "    </tr>\n"
            + "</table>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<table border=\"1\">\n"
            + "    <tr>\n"
            + "        <th rowspan=\"2\">Họ Tên</th>\n"
            + "        <th colspan=\"2\">Thông Tin</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <th>Tuổi</th>\n"
            + "        <th>Chức Vụ</th>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Nguyễn Anh</td>\n"
            + "        <td>30</td>\n"
            + "        <td>Giám Đốc</td>\n"
            + "    </tr>\n"
            + "    <tr>\n"
            + "        <td>Trần Lan</td>\n"
            + "        <td>28</td>\n"
            + "        <td>Quản Lý</td>\n"
            + "    </tr>\n"
            + "</table>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Bảng Động</title>\n"
            + "    <style>\n"
            + "        table {\n"
            + "            width: 50%;\n"
            + "            margin: 20px auto;\n"
            + "            border-collapse: collapse;\n"
            + "        }\n"
            + "        th, td {\n"
            + "            padding: 8px;\n"
            + "            text-align: left;\n"
            + "            border: 1px solid #ddd;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>Danh Sách Nhân Viên</h2>\n"
            + "<button onclick=\"addRow()\">Thêm Nhân Viên</button>\n"
            + "\n"
            + "<table id=\"employeeTable\">\n"
            + "    <tr>\n"
            + "        <th>ID</th>\n"
            + "        <th>Họ Tên</th>\n"
            + "        <th>Chức Vụ</th>\n"
            + "        <th>Tuổi</th>\n"
            + "    </tr>\n"
            + "</table>\n"
            + "\n"
            + "<script>\n"
            + "    let id = 1;\n"
            + "\n"
            + "    function addRow() {\n"
            + "        let table = document.getElementById(\"employeeTable\");\n"
            + "        let row = table.insertRow();\n"
            + "        \n"
            + "        let cell1 = row.insertCell(0);\n"
            + "        let cell2 = row.insertCell(1);\n"
            + "        let cell3 = row.insertCell(2);\n"
            + "        let cell4 = row.insertCell(3);\n"
            + "        \n"
            + "        cell1.innerHTML = id++;\n"
            + "        cell2.innerHTML = \"Nguyễn Anh\";\n"
            + "        cell3.innerHTML = \"Giám Đốc\";\n"
            + "        cell4.innerHTML = \"30\";\n"
            + "    }\n"
            + "</script>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<table border=\"1\">\n"
            + "    <thead>\n"
            + "        <tr>\n"
            + "            <th>ID</th>\n"
            + "            <th>Họ Tên</th>\n"
            + "            <th>Chức Vụ</th>\n"
            + "            <th>Tuổi</th>\n"
            + "        </tr>\n"
            + "    </thead>\n"
            + "    <tbody>\n"
            + "        <tr>\n"
            + "            <td>1</td>\n"
            + "            <td>Nguyễn Anh</td>\n"
            + "            <td>Giám Đốc</td>\n"
            + "            <td>30</td>\n"
            + "        </tr>\n"
            + "        <tr>\n"
            + "            <td>2</td>\n"
            + "            <td>Trần Lan</td>\n"
            + "            <td>Quản Lý</td>\n"
            + "            <td>28</td>\n"
            + "        </tr>\n"
            + "    </tbody>\n"
            + "    <tfoot>\n"
            + "        <tr>\n"
            + "            <td colspan=\"4\">Tổng Cộng: 2 Nhân Viên</td>\n"
            + "        </tr>\n"
            + "    </tfoot>\n"
            + "</table>"
        });
        Code_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new String[]{
            "<form action=\"URL\" method=\"POST\">\n"
            + "    <!-- Các trường nhập liệu -->\n"
            + "</form>",
            "<form action=\"submit_form.php\" method=\"POST\">\n"
            + "    <label for=\"username\">Tên Đăng Nhập:</label>\n"
            + "    <input type=\"text\" id=\"username\" name=\"username\" required>\n"
            + "    \n"
            + "    <label for=\"password\">Mật Khẩu:</label>\n"
            + "    <input type=\"password\" id=\"password\" name=\"password\" required>\n"
            + "\n"
            + "    <input type=\"submit\" value=\"Đăng Nhập\">\n"
            + "</form>",
            "<form action=\"submit_form.php\" method=\"POST\">\n"
            + "    <label for=\"message\">Tin Nhắn:</label>\n"
            + "    <textarea id=\"message\" name=\"message\" rows=\"4\" cols=\"50\" required></textarea>\n"
            + "    \n"
            + "    <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"submit_form.php\" method=\"POST\">\n"
            + "    <label for=\"country\">Quốc Gia:</label>\n"
            + "    <select id=\"country\" name=\"country\" required>\n"
            + "        <option value=\"vietnam\">Việt Nam</option>\n"
            + "        <option value=\"usa\">Mỹ</option>\n"
            + "        <option value=\"uk\">Anh</option>\n"
            + "    </select>\n"
            + "    \n"
            + "    <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"submit_form.php\" method=\"POST\">\n"
            + "    <button type=\"submit\">Gửi</button>\n"
            + "    <button type=\"reset\">Đặt Lại</button>\n"
            + "</form>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Biểu Mẫu Đăng Ký</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>Đăng Ký Tài Khoản</h2>\n"
            + "\n"
            + "<form action=\"submit_registration.php\" method=\"POST\">\n"
            + "    <label for=\"fullname\">Họ Tên:</label>\n"
            + "    <input type=\"text\" id=\"fullname\" name=\"fullname\" required><br><br>\n"
            + "\n"
            + "    <label for=\"email\">Email:</label>\n"
            + "    <input type=\"email\" id=\"email\" name=\"email\" required><br><br>\n"
            + "\n"
            + "    <label for=\"gender\">Giới Tính:</label>\n"
            + "    <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" required>\n"
            + "    <label for=\"male\">Nam</label>\n"
            + "    <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\" required>\n"
            + "    <label for=\"female\">Nữ</label><br><br>\n"
            + "\n"
            + "    <label for=\"dob\">Ngày Sinh:</label>\n"
            + "    <input type=\"date\" id=\"dob\" name=\"dob\" required><br><br>\n"
            + "\n"
            + "    <label for=\"message\">Lời Nhắn:</label><br>\n"
            + "    <textarea id=\"message\" name=\"message\" rows=\"4\" cols=\"50\"></textarea><br><br>\n"
            + "\n"
            + "    <input type=\"submit\" value=\"Đăng Ký\">\n"
            + "</form>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Các Loại Trường Nhập", new String[]{
            "<label for=\"name\">Họ và tên:</label>\n"
            + "<input type=\"text\" id=\"name\" name=\"name\" required>",
            "<label for=\"message\">Lời nhắn:</label>\n"
            + "<textarea id=\"message\" name=\"message\" rows=\"4\" cols=\"50\"></textarea>",
            "<label for=\"password\">Mật khẩu:</label>\n"
            + "<input type=\"password\" id=\"password\" name=\"password\" required>",
            "<label for=\"age\">Tuổi:</label>\n"
            + "<input type=\"number\" id=\"age\" name=\"age\" min=\"18\" max=\"100\" step=\"1\" required>",
            "<label for=\"gender_male\">Nam:</label>\n"
            + "<input type=\"radio\" id=\"gender_male\" name=\"gender\" value=\"male\">\n"
            + "<label for=\"gender_female\">Nữ:</label>\n"
            + "<input type=\"radio\" id=\"gender_female\" name=\"gender\" value=\"female\">",
            "<label for=\"newsletter\">Đăng ký nhận bản tin:</label>\n"
            + "<input type=\"checkbox\" id=\"newsletter\" name=\"newsletter\" value=\"yes\">",
            "<label for=\"file\">Chọn tệp:</label>\n"
            + "<input type=\"file\" id=\"file\" name=\"file\" required>",
            "<input type=\"file\" id=\"files\" name=\"files\" multiple>"
        });
        Code_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new String[]{
            "<form action=\"/submit_form\" method=\"post\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"/submit_form\" method=\"post\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"/upload\" method=\"post\" enctype=\"multipart/form-data\">\n"
            + "  <input type=\"file\" name=\"file\">\n"
            + "  <input type=\"submit\" value=\"Tải lên\">\n"
            + "</form>",
            "<form action=\"/submit_form\" method=\"post\" target=\"_blank\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form name=\"myForm\" action=\"/submit\" method=\"post\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"/submit_form\" method=\"post\" autocomplete=\"off\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>",
            "<form action=\"/submit_form\" method=\"post\" accept-charset=\"UTF-8\">\n"
            + "  <input type=\"text\" name=\"username\">\n"
            + "  <input type=\"submit\" value=\"Gửi\">\n"
            + "</form>"
        });
        //HTML nâng cao
        Code_MAP.put("HTML semantic là gì?", new String[]{
            "<header>\n"
            + "  <h1>Chào mừng đến với Website của tôi</h1>\n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#home\">Trang Chủ</a></li>\n"
            + "      <li><a href=\"#about\">Giới Thiệu</a></li>\n"
            + "      <li><a href=\"#contact\">Liên Hệ</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "</header>",
            "<footer>\n"
            + "  <p>&copy; 2025 Công ty ABC. Mọi quyền được bảo vệ.</p>\n"
            + "</footer>",
            "<article>\n"
            + "  <h2>Bài viết về HTML Semantic</h2>\n"
            + "  <p>HTML semantic giúp tạo ra các trang web dễ hiểu và dễ truy cập...</p>\n"
            + "</article>",
            "<section>\n"
            + "  <h2>Giới thiệu về HTML Semantic</h2>\n"
            + "  <p>HTML semantic giúp...</p>\n"
            + "</section>",
            "<nav>\n"
            + "  <ul>\n"
            + "    <li><a href=\"#home\">Trang Chủ</a></li>\n"
            + "    <li><a href=\"#services\">Dịch Vụ</a></li>\n"
            + "  </ul>\n"
            + "</nav>",
            "<aside>\n"
            + "  <h3>Thông tin thêm</h3>\n"
            + "  <p>Đọc thêm về các bài viết liên quan...</p>\n"
            + "</aside>",
            "<main>\n"
            + "  <h2>Chào mừng đến với trang web của tôi!</h2>\n"
            + "  <p>Đây là phần nội dung chính của trang.</p>\n"
            + "</main>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Trang Web Semantic</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <header>\n"
            + "    <h1>Chào mừng đến với Website của tôi</h1>\n"
            + "    <nav>\n"
            + "      <ul>\n"
            + "        <li><a href=\"#home\">Trang Chủ</a></li>\n"
            + "        <li><a href=\"#about\">Giới Thiệu</a></li>\n"
            + "        <li><a href=\"#contact\">Liên Hệ</a></li>\n"
            + "      </ul>\n"
            + "    </nav>\n"
            + "  </header>\n"
            + "\n"
            + "  <main>\n"
            + "    <article>\n"
            + "      <h2>Bài viết về HTML Semantic</h2>\n"
            + "      <p>HTML semantic giúp tạo ra các trang web dễ hiểu và dễ truy cập...</p>\n"
            + "    </article>\n"
            + "    <section>\n"
            + "      <h2>Giới thiệu về HTML</h2>\n"
            + "      <p>HTML là ngôn ngữ đánh dấu siêu văn bản...</p>\n"
            + "    </section>\n"
            + "  </main>\n"
            + "\n"
            + "  <aside>\n"
            + "    <h3>Thông tin thêm</h3>\n"
            + "    <p>Đọc thêm về các bài viết liên quan...</p>\n"
            + "  </aside>\n"
            + "\n"
            + "  <footer>\n"
            + "    <p>&copy; 2025 Công ty ABC. Mọi quyền được bảo vệ.</p>\n"
            + "  </footer>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("<header>", new String[]{
            "<header>\n"
            + "  <h1>Cửa Hàng Điện Tử ABC</h1>\n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#home\">Trang chủ</a></li>\n"
            + "      <li><a href=\"#products\">Sản phẩm</a></li>\n"
            + "      <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "</header>",
            "<article>\n"
            + "  <header>\n"
            + "    <h2>Top 5 Laptop Cho Dân Lập Trình</h2>\n"
            + "    <p>Đăng ngày: 7/4/2025 • Tác giả: Nguyễn Văn A</p>\n"
            + "  </header>\n"
            + "  <p>Bài viết này sẽ giới thiệu những mẫu laptop tốt nhất cho lập trình viên...</p>\n"
            + "</article>"
        });
        Code_MAP.put("<footer>", new String[]{
            "<footer>\n"
            + "  <p>&copy; 2025 Cửa Hàng Điện Tử ABC. Bản quyền thuộc về chúng tôi.</p>\n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#privacy\">Chính sách bảo mật</a></li>\n"
            + "      <li><a href=\"#terms\">Điều khoản sử dụng</a></li>\n"
            + "      <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "</footer>",
            "<article>\n"
            + "  <h2>10 Tips Học Lập Trình Hiệu Quả</h2>\n"
            + "  <p>... Nội dung bài viết ...</p>\n"
            + "  \n"
            + "  <footer>\n"
            + "    <p>Đăng bởi: Nguyễn Văn B</p>\n"
            + "    <p>Ngày đăng: 7/4/2025</p>\n"
            + "  </footer>\n"
            + "</article>"
        });
        Code_MAP.put("<nav>", new String[]{
            "<nav>\n"
            + "  <ul>\n"
            + "    <li><a href=\"#home\">Trang chủ</a></li>\n"
            + "    <li><a href=\"#about\">Giới thiệu</a></li>\n"
            + "    <li><a href=\"#services\">Dịch vụ</a></li>\n"
            + "    <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "  </ul>\n"
            + "</nav>",
            "<header>\n"
            + "  <div class=\"logo\">MyWebsite</div>\n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#home\">Trang chủ</a></li>\n"
            + "      <li><a href=\"#blog\">Blog</a></li>\n"
            + "      <li><a href=\"#shop\">Cửa hàng</a></li>\n"
            + "      <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "</header>"
        });
        Code_MAP.put("<article>", new String[]{
            "<article>\n"
            + "  <header>\n"
            + "    <h2>5 Cách Học Lập Trình Hiệu Quả</h2>\n"
            + "    <p>Đăng ngày 7/4/2025 bởi Nguyễn Văn A</p>\n"
            + "  </header>\n"
            + "  <p>Lập trình là kỹ năng cần thực hành nhiều. Dưới đây là 5 cách giúp bạn học tốt hơn...</p>\n"
            + "  <footer>\n"
            + "    <p>Tags: Lập trình, Học tập</p>\n"
            + "  </footer>\n"
            + "</article>",
            "<article>\n"
            + "  <h2>Điện thoại iPhone 15</h2>\n"
            + "  <p>Giá: 25.000.000 VNĐ</p>\n"
            + "  <p>Siêu phẩm mới nhất của Apple với camera và hiệu suất mạnh mẽ.</p>\n"
            + "</article>"
        });
        Code_MAP.put("<section>", new String[]{
            "<section>\n"
            + "  <h2>Giới thiệu về chúng tôi</h2>\n"
            + "  <p>Chúng tôi là công ty chuyên cung cấp giải pháp phần mềm với hơn 10 năm kinh nghiệm...</p>\n"
            + "</section>",
            "<section>\n"
            + "  <h2>Dịch vụ của chúng tôi</h2>\n"
            + "  <ul>\n"
            + "    <li>Thiết kế website</li>\n"
            + "    <li>Phát triển ứng dụng di động</li>\n"
            + "    <li>Tư vấn công nghệ</li>\n"
            + "  </ul>\n"
            + "</section>\n"
            + "\n"
            + "<section>\n"
            + "  <h2>Khách hàng tiêu biểu</h2>\n"
            + "  <p>Chúng tôi đã hợp tác với hơn 200 doanh nghiệp lớn nhỏ trên toàn quốc.</p>\n"
            + "</section>"
        });
        Code_MAP.put("Semantic HTML là gì", new String[]{
            "<div id=\"header\">\n"
            + "  <div id=\"nav\">...</div>\n"
            + "</div>\n"
            + "<div id=\"content\">...</div>\n"
            + "<div id=\"footer\">...</div>",
            "<header>\n"
            + "  <nav>...</nav>\n"
            + "</header>\n"
            + "<main>\n"
            + "  ...\n"
            + "</main>\n"
            + "<footer>\n"
            + "  ...\n"
            + "</footer>"
        });
        Code_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new String[]{
            "<header>\n"
            + "  <h1>Chào mừng đến với Website của chúng tôi!</h1>\n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#home\">Trang chủ</a></li>\n"
            + "      <li><a href=\"#about\">Giới thiệu</a></li>\n"
            + "      <li><a href=\"#services\">Dịch vụ</a></li>\n"
            + "      <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "</header>\n"
            + "\n"
            + "<main>\n"
            + "  <section>\n"
            + "    <h2>Giới thiệu về chúng tôi</h2>\n"
            + "    <p>Chúng tôi cung cấp dịch vụ thiết kế web và phát triển ứng dụng...</p>\n"
            + "  </section>\n"
            + "\n"
            + "  <article>\n"
            + "    <h2>Bài viết mới nhất</h2>\n"
            + "    <p>Đây là nội dung của bài viết mới nhất trên blog của chúng tôi...</p>\n"
            + "  </article>\n"
            + "</main>\n"
            + "\n"
            + "<footer>\n"
            + "  <p>&copy; 2025, Công ty XYZ</p>\n"
            + "</footer>",
            "<script type=\"application/ld+json\">\n"
            + "  {\n"
            + "    \"@context\": \"https://schema.org\",\n"
            + "    \"@type\": \"Article\",\n"
            + "    \"headline\": \"Bài viết mới nhất về công nghệ\",\n"
            + "    \"author\": {\n"
            + "      \"@type\": \"Person\",\n"
            + "      \"name\": \"Nguyễn Văn A\"\n"
            + "    },\n"
            + "    \"datePublished\": \"2025-04-07\",\n"
            + "    \"image\": \"https://example.com/image.jpg\",\n"
            + "    \"publisher\": {\n"
            + "      \"@type\": \"Organization\",\n"
            + "      \"name\": \"Công ty XYZ\"\n"
            + "    }\n"
            + "  }\n"
            + "</script>",
            "<head>\n"
            + "  <title>Dịch vụ Thiết kế Website chuyên nghiệp - Công ty XYZ</title>\n"
            + "  <meta name=\"description\" content=\"Chúng tôi cung cấp dịch vụ thiết kế website đẹp, chuyên nghiệp và tối ưu cho SEO.\">\n"
            + "</head>",
            "<p>Để tìm hiểu thêm về dịch vụ của chúng tôi, hãy đọc bài viết về <a href=\"/dich-vu-thiet-ke-web\">thiết kế web chuyên nghiệp</a>.</p>"
        });
        Code_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new String[]{
            "<header>\n"
            + "    <nav>...</nav>\n"
            + "</header>\n"
            + "<main>\n"
            + "    <section>...</section>\n"
            + "</main>\n"
            + "<footer>...</footer>",
            "<script type=\"application/ld+json\">\n"
            + "  {\n"
            + "    \"@context\": \"https://schema.org\",\n"
            + "    \"@type\": \"Article\",\n"
            + "    \"headline\": \"Cách tối ưu SEO hiệu quả\",\n"
            + "    \"author\": {\n"
            + "      \"@type\": \"Person\",\n"
            + "      \"name\": \"Nguyễn Văn A\"\n"
            + "    },\n"
            + "    \"datePublished\": \"2025-04-07\",\n"
            + "    \"publisher\": {\n"
            + "      \"@type\": \"Organization\",\n"
            + "      \"name\": \"Công ty XYZ\"\n"
            + "    }\n"
            + "  }\n"
            + "</script>",
            "<head>\n"
            + "    <title>Dịch vụ SEO chuyên nghiệp - Công ty XYZ</title>\n"
            + "    <meta name=\"description\" content=\"Chúng tôi cung cấp dịch vụ SEO giúp website lên top Google hiệu quả và bền vững.\">\n"
            + "</head>",
            "<p>Để tìm hiểu thêm về dịch vụ SEO, hãy đọc bài viết <a href=\"/seo-hieu-qua\">SEO hiệu quả</a>.</p>"
        });
        Code_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new String[]{
            "<section>\n"
            + "  <h2>Câu hỏi thường gặp</h2>\n"
            + "  <dl>\n"
            + "    <dt>Làm sao để đặt món ăn?</dt>\n"
            + "    <dd>Để đặt món, bạn chỉ cần gọi vào số hotline của chúng tôi hoặc đặt hàng trực tuyến qua website.</dd>\n"
            + "  </dl>\n"
            + "</section>",
            "<section>\n"
            + "  <h2>5 Lý do bạn nên ăn sáng mỗi ngày</h2>\n"
            + "  <ul>\n"
            + "    <li>Giúp cung cấp năng lượng cho cơ thể.</li>\n"
            + "    <li>Cải thiện sự tập trung và năng suất làm việc.</li>\n"
            + "    <li>Giảm nguy cơ mắc bệnh tim mạch.</li>\n"
            + "    <li>Hỗ trợ quá trình trao đổi chất.</li>\n"
            + "    <li>Giúp duy trì cân nặng khỏe mạnh.</li>\n"
            + "  </ul>\n"
            + "</section>",
            "@media only screen and (max-width: 600px) {\n"
            + "  body {\n"
            + "    font-size: 14px;\n"
            + "  }\n"
            + "  .container {\n"
            + "    padding: 10px;\n"
            + "  }\n"
            + "}",
            "<nav>\n"
            + "  <ul>\n"
            + "    <li><a href=\"#home\">Trang chủ</a></li>\n"
            + "    <li><a href=\"#about\">Giới thiệu</a></li>\n"
            + "    <li><a href=\"#services\">Dịch vụ</a></li>\n"
            + "    <li><a href=\"#contact\">Liên hệ</a></li>\n"
            + "  </ul>\n"
            + "</nav>",
            "<img src=\"image.jpg\" alt=\"Hình ảnh sản phẩm\" loading=\"lazy\">"
        });
        Code_MAP.put("Các thẻ <meta> quan trọng trong HTML", new String[]{
            "<meta charset=\"UTF-8\">",
            "<meta name=\"description\" content=\"Trang web cung cấp các dịch vụ thiết kế web chuyên nghiệp, tối ưu hóa SEO và phát triển ứng dụng di động cho doanh nghiệp.\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">",
            "<meta name=\"robots\" content=\"index, follow\">",
            "<meta property=\"og:title\" content=\"Dịch vụ SEO chuyên nghiệp và tối ưu hóa trang web\">"
        });
        Code_MAP.put("Meta Title và Meta Description", new String[]{
            "<title>Dịch vụ SEO chuyên nghiệp và tối ưu hóa trang web</title>",
            "<meta name=\"description\" content=\"Trang web cung cấp các dịch vụ SEO chuyên nghiệp, tối ưu hóa website và phát triển chiến lược marketing trực tuyến hiệu quả.\">"
        });
        Code_MAP.put("Meta Robots và Meta Viewport", new String[]{
            "<meta name=\"robots\" content=\"noindex, nofollow\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
        });
        Code_MAP.put("Meta Charset", new String[]{
            "<meta charset=\"UTF-8\">",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
            + "    <title>Trang Web Tiếng Việt</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Chào mừng bạn đến với trang web của chúng tôi!</h1>\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Giới thiệu Open Graph và Twitter Card", new String[]{
            "<meta property=\"og:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "<meta property=\"og:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ\">\n"
            + "<meta property=\"og:image\" content=\"http://example.com/image.jpg\">\n"
            + "<meta property=\"og:url\" content=\"http://example.com\">\n"
            + "<meta property=\"og:type\" content=\"website\">",
            "<meta name=\"twitter:card\" content=\"summary_large_image\">\n"
            + "<meta name=\"twitter:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "<meta name=\"twitter:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ\">\n"
            + "<meta name=\"twitter:image\" content=\"http://example.com/image.jpg\">\n"
            + "<meta name=\"twitter:url\" content=\"http://example.com\">"
        });
        Code_MAP.put("Open Graph", new String[]{
            "<meta property=\"og:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "<meta property=\"og:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ, nâng cao khả năng hiển thị trên công cụ tìm kiếm.\">\n"
            + "<meta property=\"og:image\" content=\"http://example.com/image.jpg\">\n"
            + "<meta property=\"og:url\" content=\"http://example.com\">\n"
            + "<meta property=\"og:type\" content=\"website\">\n"
            + "<meta property=\"og:site_name\" content=\"Example Website\">\n"
            + "<meta property=\"og:locale\" content=\"vi_VN\">"
        });
        Code_MAP.put("Twitter Card", new String[]{
            "<meta name=\"twitter:card\" content=\"summary_large_image\">\n"
            + "<meta name=\"twitter:title\" content=\"Dịch vụ SEO chuyên nghiệp\">\n"
            + "<meta name=\"twitter:description\" content=\"Tối ưu hóa SEO cho các doanh nghiệp vừa và nhỏ, nâng cao khả năng hiển thị trên công cụ tìm kiếm.\">\n"
            + "<meta name=\"twitter:image\" content=\"http://example.com/image.jpg\">\n"
            + "<meta name=\"twitter:url\" content=\"http://example.com\">"
        });
        Code_MAP.put("Favicon", new String[]{
            "<head>\n"
            + "    <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n"
            + "    <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n"
            + "</head>",
            "<!-- Favicon cho iOS -->\n"
            + "<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">",
            "<!-- Favicon cho Windows Tile -->\n"
            + "<meta name=\"msapplication-TileImage\" content=\"mstile-144x144.png\">"
        });
        Code_MAP.put("Sitemap", new String[]{
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n"
            + "  <url>\n"
            + "    <loc>https://example.com/</loc>\n"
            + "    <lastmod>2025-04-01</lastmod>\n"
            + "    <changefreq>daily</changefreq>\n"
            + "    <priority>1.0</priority>\n"
            + "  </url>\n"
            + "  <url>\n"
            + "    <loc>https://example.com/about/</loc>\n"
            + "    <lastmod>2025-03-30</lastmod>\n"
            + "    <changefreq>weekly</changefreq>\n"
            + "    <priority>0.8</priority>\n"
            + "  </url>\n"
            + "</urlset>"
        });
        Code_MAP.put("robots.txt", new String[]{
            "User-agent: [Tên robot]\n"
            + "Disallow: [Đường dẫn không được phép truy cập]\n"
            + "Allow: [Đường dẫn được phép truy cập]\n"
            + "Sitemap: [Đường dẫn đến sitemap của bạn]",
            "User-agent: *\n"
            + "Disallow: /",
            "User-agent: *\n"
            + "Disallow:",
            "User-agent: Googlebot\n"
            + "Disallow: /\n"
            + "Allow: /public/",
            "User-agent: *\n"
            + "Disallow: /private/\n"
            + "Sitemap: https://www.example.com/sitemap.xml"
        });
        Code_MAP.put("Local Storage", new String[]{
            "localStorage.setItem('username', 'JohnDoe');\n"
            + "localStorage.setItem('age', '30');",
            "let username = localStorage.getItem('username');\n"
            + "let age = localStorage.getItem('age');\n"
            + "\n"
            + "console.log(username); // \"JohnDoe\"\n"
            + "console.log(age); // \"30\"",
            "localStorage.removeItem('username');",
            "localStorage.clear();",
            "if (localStorage.getItem('username') !== null) {\n"
            + "    console.log('Username exists');\n"
            + "} else {\n"
            + "    console.log('Username does not exist');\n"
            + "}",
            "// Lưu trữ đối tượng\n"
            + "let user = { name: 'John', age: 30 };\n"
            + "localStorage.setItem('user', JSON.stringify(user));\n"
            + "\n"
            + "// Lấy đối tượng\n"
            + "let storedUser = JSON.parse(localStorage.getItem('user'));\n"
            + "console.log(storedUser.name); // \"John\"\n"
            + "console.log(storedUser.age);  // 30"
        });
        Code_MAP.put("Session Storage", new String[]{
            "sessionStorage.setItem('username', 'JohnDoe');\n"
            + "sessionStorage.setItem('age', '30');",
            "let username = sessionStorage.getItem('username');\n"
            + "let age = sessionStorage.getItem('age');\n"
            + "\n"
            + "console.log(username); // \"JohnDoe\"\n"
            + "console.log(age); // \"30\"",
            "sessionStorage.removeItem('username');",
            "sessionStorage.clear();",
            "if (sessionStorage.getItem('username') !== null) {\n"
            + "    console.log('Username exists');\n"
            + "} else {\n"
            + "    console.log('Username does not exist');\n"
            + "}",
            "// Lưu trữ đối tượng\n"
            + "let user = { name: 'John', age: 30 };\n"
            + "sessionStorage.setItem('user', JSON.stringify(user));\n"
            + "\n"
            + "// Lấy đối tượng\n"
            + "let storedUser = JSON.parse(sessionStorage.getItem('user'));\n"
            + "console.log(storedUser.name); // \"John\"\n"
            + "console.log(storedUser.age);  // 30"
        });
        Code_MAP.put("Geolocation API là", new String[]{
            "if (navigator.geolocation) {\n"
            + "  navigator.geolocation.getCurrentPosition(function(position) {\n"
            + "    let latitude = position.coords.latitude;\n"
            + "    let longitude = position.coords.longitude;\n"
            + "    console.log(`Vĩ độ: ${latitude}, Kinh độ: ${longitude}`);\n"
            + "  }, function(error) {\n"
            + "    console.log(\"Lỗi khi lấy vị trí: \" + error.message);\n"
            + "  });\n"
            + "} else {\n"
            + "  console.log(\"Trình duyệt không hỗ trợ Geolocation.\");\n"
            + "}",
            "if (navigator.geolocation) {\n"
            + "  let watchID = navigator.geolocation.watchPosition(function(position) {\n"
            + "    let latitude = position.coords.latitude;\n"
            + "    let longitude = position.coords.longitude;\n"
            + "    console.log(`Vĩ độ: ${latitude}, Kinh độ: ${longitude}`);\n"
            + "  }, function(error) {\n"
            + "    console.log(\"Lỗi khi theo dõi vị trí: \" + error.message);\n"
            + "  });\n"
            + "} else {\n"
            + "  console.log(\"Trình duyệt không hỗ trợ Geolocation.\");\n"
            + "}",
            "navigator.geolocation.clearWatch(watchID);"
        });
        Code_MAP.put("Tính năng của Geolocation API", new String[]{
            ""
        });
        Code_MAP.put("Lợi ích SEO gián tiếp", new String[]{
            ""
        });
        Code_MAP.put("Drag & Drop API là gì", new String[]{
            "<div id=\"dragElement\" draggable=\"true\">Kéo tôi đi!</div>",
            "const dragElement = document.getElementById('dragElement');\n"
            + "dragElement.addEventListener('dragstart', function(event) {\n"
            + "    event.dataTransfer.setData('text', event.target.id); // Lưu dữ liệu khi kéo\n"
            + "});",
            "<div id=\"dropZone\" style=\"border: 2px dashed #ccc; width: 200px; height: 200px;\">\n"
            + "    Thả vào đây\n"
            + "</div>",
            "const dropZone = document.getElementById('dropZone');\n"
            + "\n"
            + "// Cho phép kéo vào khu vực thả\n"
            + "dropZone.addEventListener('dragover', function(event) {\n"
            + "    event.preventDefault(); // Ngừng hành vi mặc định của trình duyệt\n"
            + "});\n"
            + "\n"
            + "// Xử lý sự kiện khi thả phần tử vào khu vực thả\n"
            + "dropZone.addEventListener('drop', function(event) {\n"
            + "    event.preventDefault();\n"
            + "    const data = event.dataTransfer.getData('text'); // Lấy dữ liệu đã lưu trong dragstart\n"
            + "    const draggedElement = document.getElementById(data);\n"
            + "    dropZone.appendChild(draggedElement); // Thêm phần tử vào khu vực thả\n"
            + "});",
            "dropZone.addEventListener('dragenter', function(event) {\n"
            + "    dropZone.style.backgroundColor = 'lightgray'; // Thay đổi màu nền khi kéo vào\n"
            + "});\n"
            + "\n"
            + "dropZone.addEventListener('dragleave', function(event) {\n"
            + "    dropZone.style.backgroundColor = ''; // Quay lại màu nền ban đầu khi kéo ra ngoài\n"
            + "});",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Drag & Drop Example</title>\n"
            + "    <style>\n"
            + "        #dropZone {\n"
            + "            width: 200px;\n"
            + "            height: 200px;\n"
            + "            border: 2px dashed #ccc;\n"
            + "            text-align: center;\n"
            + "            line-height: 200px;\n"
            + "        }\n"
            + "        #dragElement {\n"
            + "            width: 100px;\n"
            + "            height: 100px;\n"
            + "            background-color: #4CAF50;\n"
            + "            color: white;\n"
            + "            text-align: center;\n"
            + "            line-height: 100px;\n"
            + "            cursor: pointer;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div id=\"dragElement\" draggable=\"true\">Kéo tôi đi!</div>\n"
            + "<div id=\"dropZone\">Thả vào đây</div>\n"
            + "\n"
            + "<script>\n"
            + "    const dragElement = document.getElementById('dragElement');\n"
            + "    const dropZone = document.getElementById('dropZone');\n"
            + "\n"
            + "    dragElement.addEventListener('dragstart', function(event) {\n"
            + "        event.dataTransfer.setData('text', event.target.id);\n"
            + "    });\n"
            + "\n"
            + "    dropZone.addEventListener('dragover', function(event) {\n"
            + "        event.preventDefault();\n"
            + "    });\n"
            + "\n"
            + "    dropZone.addEventListener('drop', function(event) {\n"
            + "        event.preventDefault();\n"
            + "        const data = event.dataTransfer.getData('text');\n"
            + "        const draggedElement = document.getElementById(data);\n"
            + "        dropZone.appendChild(draggedElement);\n"
            + "    });\n"
            + "\n"
            + "    dropZone.addEventListener('dragenter', function(event) {\n"
            + "        dropZone.style.backgroundColor = 'lightgray';\n"
            + "    });\n"
            + "\n"
            + "    dropZone.addEventListener('dragleave', function(event) {\n"
            + "        dropZone.style.backgroundColor = '';\n"
            + "    });\n"
            + "</script>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Tính năng của Drag & Drop API", new String[]{
            "<div id=\"dragItem\" draggable=\"true\">Kéo tôi!</div>",
            "<div id=\"dropArea\">Thả phần tử vào đây</div>",
            "const dragItem = document.getElementById('dragItem');\n"
            + "const dropArea = document.getElementById('dropArea');\n"
            + "\n"
            + "dragItem.addEventListener('dragstart', function(event) {\n"
            + "    event.dataTransfer.setData('text', event.target.id);\n"
            + "});\n"
            + "\n"
            + "dropArea.addEventListener('dragover', function(event) {\n"
            + "    event.preventDefault();\n"
            + "});\n"
            + "\n"
            + "dropArea.addEventListener('drop', function(event) {\n"
            + "    event.preventDefault();\n"
            + "    const data = event.dataTransfer.getData('text');\n"
            + "    const draggedElement = document.getElementById(data);\n"
            + "    dropArea.appendChild(draggedElement);\n"
            + "});"
        });
        Code_MAP.put("Lợi ích đối với SEO", new String[]{
            ""
        });
        //CSS Cơ Bản
        Code_MAP.put("Inline CSS", new String[]{
            "<element style=\"property: value; property2: value2;\">Nội dung</element>",
            "<h1 style=\"color: red; font-size: 36px;\">Tiêu đề màu đỏ</h1>\n"
            + "\n"
            + "<p style=\"background-color: lightyellow; padding: 10px;\">Đoạn văn có nền màu vàng nhạt.</p>\n"
            + "\n"
            + "<a href=\"#\" style=\"text-decoration: none; color: green;\">Link màu xanh lá</a>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Ví dụ Inline CSS</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <h1 style=\"color: navy; text-align: center;\">Chào mừng đến với website của tôi</h1>\n"
            + "\n"
            + "    <p style=\"font-size: 18px; color: gray;\">Đây là đoạn giới thiệu nhỏ với định dạng inline CSS.</p>\n"
            + "\n"
            + "    <button style=\"background-color: green; color: white; padding: 10px 20px; border: none; border-radius: 5px;\">\n"
            + "        Bấm vào đây\n"
            + "    </button>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("Internal CSS", new String[]{
            "<head>\n"
            + "  <style>\n"
            + "    selector {\n"
            + "      property: value;\n"
            + "      property2: value2;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Ví dụ Internal CSS</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            background-color: #f5f5f5;\n"
            + "        }\n"
            + "\n"
            + "        h1 {\n"
            + "            color: darkblue;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "\n"
            + "        p {\n"
            + "            font-size: 18px;\n"
            + "            color: gray;\n"
            + "            line-height: 1.5;\n"
            + "        }\n"
            + "\n"
            + "        .highlight {\n"
            + "            color: red;\n"
            + "            font-weight: bold;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <h1>Trang Web Của Tôi</h1>\n"
            + "    <p>Đây là một đoạn văn bản.</p>\n"
            + "    <p class=\"highlight\">Đây là một đoạn văn được làm nổi bật!</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });
        Code_MAP.put("External CSS", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Trang dùng External CSS</title>\n"
            + "  <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "  <h1>Chào mừng đến với website</h1>\n"
            + "  <p class=\"intro\">Đây là đoạn văn bản được định dạng bằng External CSS.</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "  background-color: #f0f8ff;\n"
            + "  font-family: Arial, sans-serif;\n"
            + "}\n"
            + "\n"
            + "h1 {\n"
            + "  color: navy;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + ".intro {\n"
            + "  color: gray;\n"
            + "  font-size: 18px;\n"
            + "  margin: 20px;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>Shop Online</title>\n"
            + "  <link rel=\"stylesheet\" href=\"style.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "  <header>\n"
            + "    <h1>Shop Thời Trang</h1>\n"
            + "  </header>\n"
            + "\n"
            + "  <div class=\"product\">\n"
            + "    <h2>Áo Hoodie</h2>\n"
            + "    <p class=\"price\">350.000đ</p>\n"
            + "    <p>Chất liệu cotton, freesize nam nữ.</p>\n"
            + "  </div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "  background-color: #f8f8f8;\n"
            + "  margin: 0;\n"
            + "  padding: 0;\n"
            + "  font-family: 'Segoe UI', sans-serif;\n"
            + "}\n"
            + "\n"
            + "header {\n"
            + "  background-color: black;\n"
            + "  color: white;\n"
            + "  padding: 20px;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + ".product {\n"
            + "  background-color: white;\n"
            + "  margin: 30px auto;\n"
            + "  padding: 20px;\n"
            + "  width: 80%;\n"
            + "  max-width: 500px;\n"
            + "  border-radius: 10px;\n"
            + "  box-shadow: 0 2px 6px rgba(0, 0, 0, 0.2);\n"
            + "}\n"
            + "\n"
            + ".price {\n"
            + "  color: red;\n"
            + "  font-weight: bold;\n"
            + "}"
        });
        Code_MAP.put("CSS sử dụng cú pháp gì?", new String[]{
            "selector {\n"
            + "  property: value;\n"
            + "  property: value;\n"
            + "}",
            "p {\n"
            + "  color: red;\n"
            + "  font-size: 16px;\n"
            + "}",
            "h1 {\n"
            + "  color: blue;\n"
            + "}",
            ".highlight {\n"
            + "  background-color: yellow;\n"
            + "}",
            "#main-title {\n"
            + "  font-weight: bold;\n"
            + "}",
            "h1, h2, p {\n"
            + "  margin-bottom: 10px;\n"
            + "}",
            "div p {\n"
            + "  color: green;\n"
            + "}",
            "/* Đây là một chú thích */\n"
            + "h1 {\n"
            + "  color: blue;\n"
            + "}",
            "/* Đổi màu chữ thẻ h1 */\n"
            + "h1 {\n"
            + "  color: navy;\n"
            + "}\n"
            + "\n"
            + "/* Đổi nền cho các phần tử có class là \"box\" */\n"
            + ".box {\n"
            + "  background-color: lightgrey;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + "/* Làm đậm chữ cho thẻ có id là \"important\" */\n"
            + "#important {\n"
            + "  font-weight: bold;\n"
            + "  color: red;\n"
            + "}"
        });
        Code_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new String[]{
            "p {\n"
            + "  color: blue;\n"
            + "}",
            ".myClass {\n"
            + "  background-color: yellow;\n"
            + "}",
            "#myID {\n"
            + "  color: red;\n"
            + "}",
            "* {\n"
            + "  margin: 0;\n"
            + "}",
            "div p {\n"
            + "  font-size: 18px;\n"
            + "}",
            "property: value;",
            "h1 {\n"
            + "  color: green;\n"
            + "  font-size: 24px;\n"
            + "  font-weight: bold;\n"
            + "}",
            "div > p {\n"
            + "  color: blue;\n"
            + "}",
            ".class1.class2 {\n"
            + "  background-color: red;\n"
            + "}",
            "h1 + p {\n"
            + "  font-size: 20px;\n"
            + "}",
            "a:hover {\n"
            + "  color: red;\n"
            + "}",
            "p::first-letter {\n"
            + "  font-size: 2em;\n"
            + "}",
            "h2 {\n"
            + "  color: blue;\n"
            + "  font-size: 20px;\n"
            + "  margin: 10px;\n"
            + "}"
        });
        Code_MAP.put("Các kiểu Selector trong CSS", new String[]{
            "* {\n"
            + "    color: red;  /* Đổi màu chữ của tất cả các phần tử thành đỏ */\n"
            + "}",
            ".button {\n"
            + "    background-color: blue;  /* Các phần tử có lớp 'button' sẽ có nền màu xanh */\n"
            + "}",
            "#header {\n"
            + "    background-color: grey;  /* Phần tử có ID 'header' sẽ có nền màu xám */\n"
            + "}",
            "p {\n"
            + "    font-size: 16px;  /* Tất cả các thẻ <p> sẽ có kích thước chữ 16px */\n"
            + "}",
            "a:hover {\n"
            + "    color: red;  /* Khi người dùng di chuột qua liên kết, màu sẽ chuyển thành đỏ */\n"
            + "}\n"
            + "\n"
            + "input:focus {\n"
            + "    border-color: blue;  /* Khi người dùng nhấn vào ô nhập liệu, viền sẽ chuyển màu xanh */\n"
            + "}\n"
            + "\n"
            + "li:nth-child(2) {\n"
            + "    color: green;  /* Phần tử li thứ 2 trong danh sách sẽ có màu chữ xanh */\n"
            + "}"
        });
        Code_MAP.put("Tag Selector", new String[]{
            "p {\n"
            + "    font-size: 16px;   /* Mọi thẻ <p> sẽ có font-size là 16px */\n"
            + "    color: blue;       /* Mọi thẻ <p> sẽ có màu chữ là xanh */\n"
            + "}",
            "h1 {\n"
            + "    font-weight: bold;  /* Mọi thẻ <h1> sẽ có chữ đậm */\n"
            + "    color: darkblue;    /* Mọi thẻ <h1> sẽ có màu chữ là xanh đậm */\n"
            + "}",
            "a {\n"
            + "    text-decoration: none;   /* Các thẻ <a> sẽ không có gạch chân */\n"
            + "    color: red;              /* Các thẻ <a> sẽ có màu chữ đỏ */\n"
            + "}",
            "div {\n"
            + "    margin: 10px;  /* Các thẻ <div> sẽ có margin 10px */\n"
            + "    background-color: lightgray;  /* Các thẻ <div> sẽ có nền màu xám sáng */\n"
            + "}"
        });
        Code_MAP.put("Class Selector", new String[]{
            ".tieu-de {\n"
            + "    font-size: 24px;\n"
            + "    color: darkgreen;\n"
            + "}",
            "<h1 class=\"tieu-de\">Trang chủ</h1>\n"
            + "<p class=\"tieu-de\">Đây là đoạn giới thiệu ngắn.</p>",
            "<div class=\"box highlight\"></div>",
            "p.tieu-de {\n"
            + "    text-transform: uppercase;\n"
            + "}",
            ".button {\n"
            + "    padding: 10px 20px;\n"
            + "    background-color: orange;\n"
            + "    border-radius: 8px;\n"
            + "    color: white;\n"
            + "    border: none;\n"
            + "}",
            "<button class=\"button\">Gửi</button>\n"
            + "<a href=\"#\" class=\"button\">Liên hệ</a>"
        });
        Code_MAP.put("ID Selector", new String[]{
            "#tieu-de-chinh {\n"
            + "    font-size: 28px;\n"
            + "    color: crimson;\n"
            + "    text-align: center;\n"
            + "}",
            "<h1 id=\"tieu-de-chinh\">Chào mừng đến với website!</h1>",
            "#main-content {\n"
            + "    max-width: 800px;\n"
            + "    margin: 0 auto;\n"
            + "    padding: 20px;\n"
            + "}",
            "<div id=\"main-content\">\n"
            + "    <p>Đây là nội dung chính của trang web.</p>\n"
            + "</div>",
            "document.getElementById(\"main-content\").style.backgroundColor = \"lightblue\";"
        });
        Code_MAP.put("Attribute Selector", new String[]{
            "[attribute] {\n"
            + "  /* style áp dụng cho mọi phần tử có thuộc tính này */\n"
            + "}",
            "[attribute=\"value\"] {\n"
            + "  /* style áp dụng cho phần tử có attribute đúng giá trị này */\n"
            + "}",
            "input[required] {\n"
            + "    border: 2px solid red;\n"
            + "}",
            "a[target=\"_blank\"] {\n"
            + "    color: orange;\n"
            + "}",
            "img[src$=\".jpg\"] {\n"
            + "    border-radius: 8px;\n"
            + "}",
            "[title*=\"hot\"] {\n"
            + "    background-color: yellow;\n"
            + "}"
        });
        Code_MAP.put("Đơn vị tuyệt đối", new String[]{
            ".box {\n"
            + "    width: 300px;\n"
            + "    height: 150px;\n"
            + "    background-color: lightblue;\n"
            + "}"
        });
        Code_MAP.put("Đơn vị tương đối", new String[]{
            ".container {\n"
            + "    width: 80%;\n"
            + "}",
            ".text {\n"
            + "    font-size: 2em;\n"
            + "}",
            "html {\n"
            + "    font-size: 16px;\n"
            + "}\n"
            + "\n"
            + ".title {\n"
            + "    font-size: 2rem;\n"
            + "}",
            ".banner {\n"
            + "    width: 80vw;\n"
            + "}",
            ".hero {\n"
            + "    height: 100vh;\n"
            + "}",
            "html {\n"
            + "    font-size: 16px;\n"
            + "}\n"
            + "\n"
            + ".content {\n"
            + "    width: 90%;\n"
            + "    font-size: 1.5rem;\n"
            + "    padding: 5vw;\n"
            + "}"
        });
        Code_MAP.put("Cấu trúc Box Model", new String[]{
            "width: 200px;\n"
            + "height: 100px;",
            "padding: 20px;",
            "border: 2px solid black;",
            "margin: 15px;",
            "+---------------------------+\n"
            + "|        Margin             |\n"
            + "|  +---------------------+  |\n"
            + "|  |     Border           | |\n"
            + "|  |  +---------------+   | |\n"
            + "|  |  |   Padding      |   | |\n"
            + "|  |  | +-----------+  |   | |\n"
            + "|  |  | | Content   |  |   | |\n"
            + "|  |  | +-----------+  |   | |\n"
            + "|  |  +---------------+   | |\n"
            + "|  +---------------------+  |\n"
            + "+---------------------------+",
            "Tổng chiều rộng = width + padding trái + padding phải + border trái + border phải\n"
            + "Tổng chiều cao = height + padding trên + padding dưới + border trên + border dưới",
            "box-sizing: border-box;",
            ".box {\n"
            + "    width: 300px;\n"
            + "    height: 150px;\n"
            + "    padding: 20px;\n"
            + "    border: 5px solid blue;\n"
            + "    margin: 30px;\n"
            + "    box-sizing: border-box;\n"
            + "}"
        });
        Code_MAP.put("Width và Height", new String[]{
            "div {\n"
            + "    width: 300px;\n"
            + "    height: 150px;\n"
            + "}",
            ".container {\n"
            + "    width: 80%;\n"
            + "    max-width: 1200px;\n"
            + "    min-width: 320px;\n"
            + "    height: auto;\n"
            + "}",
            "* {\n"
            + "    box-sizing: border-box;\n"
            + "}"
        });
        Code_MAP.put("max-width và min-width", new String[]{
            ".box {\n"
            + "    width: 500px;\n"
            + "    max-width: 300px;\n"
            + "    height: 400px;\n"
            + "    max-height: 250px;\n"
            + "    background-color: lightblue;\n"
            + "}",
            ".box {\n"
            + "    width: 500px;\n"
            + "    min-width: 600px;\n"
            + "    height: 400px;\n"
            + "    min-height: 500px;\n"
            + "    background-color: lightcoral;\n"
            + "}",
            ".container {\n"
            + "    width: 100%;\n"
            + "    max-width: 90%;\n"
            + "}",
            ".box {\n"
            + "    width: 80%;\n"
            + "    max-width: 1200px;\n"
            + "    min-width: 300px;\n"
            + "    height: 50vh;\n"
            + "    max-height: 600px;\n"
            + "    min-height: 200px;\n"
            + "    background-color: lightgreen;\n"
            + "}"
        });
        Code_MAP.put("Các loại position chính", new String[]{
            ".box {\n"
            + "    position: static;\n"
            + "}",
            ".box {\n"
            + "    position: relative;\n"
            + "    top: 20px;\n"
            + "    left: 30px;\n"
            + "}",
            ".parent {\n"
            + "    position: relative;\n"
            + "}\n"
            + ".child {\n"
            + "    position: absolute;\n"
            + "    top: 10px;\n"
            + "    right: 20px;\n"
            + "}",
            ".box {\n"
            + "    position: fixed;\n"
            + "    bottom: 0;\n"
            + "    right: 0;\n"
            + "}",
            ".box {\n"
            + "    position: sticky;\n"
            + "    top: 0;\n"
            + "}"
        });
        Code_MAP.put("Sự khác biệt giữa các kiểu positioning", new String[]{
            ""
        });
        Code_MAP.put("Ứng dụng thực tế của từng loại", new String[]{
            ""
        });
        Code_MAP.put("Hệ màu HEX", new String[]{
            ""
        });
        Code_MAP.put("Hệ màu RGB", new String[]{
            "rgb(red, green, blue)",
            "background-color: rgba(255, 0, 0, 0.5); /* màu đỏ trong suốt 50% */"
        });
        Code_MAP.put("Hệ màu HSL", new String[]{
            "color: hsl(0, 100%, 50%); /* màu đỏ tươi */"
        });
        Code_MAP.put("Font-family", new String[]{
            "body {\n"
            + "  font-family: Arial, sans-serif;\n"
            + "}",
            "h1 {\n"
            + "  font-family: \"Times New Roman\", serif;\n"
            + "}",
            "p {\n"
            + "  font-family: \"Roboto\", \"Helvetica Neue\", Arial, sans-serif;\n"
            + "}"
        });
        Code_MAP.put("Font-size", new String[]{
            "p {\n"
            + "  font-size: 16px;\n"
            + "}",
            "h1 {\n"
            + "  font-size: 32px;\n"
            + "}",
            "div {\n"
            + "  font-size: 1.2em;  /* 1.2 lần kích thước font của phần tử cha */\n"
            + "}",
            "body {\n"
            + "  font-size: 1.5rem;  /* 1.5 lần font-size của thẻ <html> */\n"
            + "}",
            "p {\n"
            + "  font-size: 120%;  /* 120% của kích thước font của phần tử cha */\n"
            + "}",
            "h1 {\n"
            + "  font-size: 5vw;  /* Làm cho font size thay đổi theo chiều rộng màn hình */\n"
            + "}"
        });
        Code_MAP.put("Font-weight", new String[]{
            "p {\n"
            + "  font-weight: bold;\n"
            + "}",
            "h1 {\n"
            + "  font-weight: bold; /* Làm đậm tiêu đề */\n"
            + "}",
            "h2 {\n"
            + "  font-weight: 600;  /* Đậm vừa */\n"
            + "}",
            "p {\n"
            + "  font-weight: normal; /* Chữ bình thường */\n"
            + "}\n"
            + "\n"
            + "h1 {\n"
            + "  font-weight: bold; /* Tiêu đề làm đậm */\n"
            + "}",
            "p {\n"
            + "  font-weight: 300;  /* Mỏng hơn một chút so với bình thường */\n"
            + "}\n"
            + "\n"
            + "h2 {\n"
            + "  font-weight: 700;  /* Đậm như 'bold' */\n"
            + "}",
            "a:hover {\n"
            + "  font-weight: bolder;  /* Tăng độ đậm khi rê chuột */\n"
            + "}",
            "h1 {\n"
            + "  font-size: 48px;\n"
            + "  font-weight: 900;  /* Tiêu đề cực đậm */\n"
            + "}"
        });
        Code_MAP.put("Line-height", new String[]{
            "p {\n"
            + "  line-height: 1.5;\n"
            + "}",
            "p {\n"
            + "  line-height: normal;\n"
            + "}",
            "p {\n"
            + "  line-height: 1.5;\n"
            + "}",
            "p {\n"
            + "  line-height: 24px;\n"
            + "}",
            "p {\n"
            + "  font-size: 16px;\n"
            + "  line-height: 1.8em;  /* 1.8 lần chiều cao font-size */\n"
            + "}"
        });
        Code_MAP.put("Letter-spacing", new String[]{
            "p {\n"
            + "  letter-spacing: 2px;\n"
            + "}",
            "h1 {\n"
            + "  letter-spacing: 1em; /* Khoảng cách tương đối theo kích thước font chữ */\n"
            + "}",
            "p {\n"
            + "  letter-spacing: -1px;  /* Khoảng cách giữa các ký tự sẽ giảm */\n"
            + "}",
            "p {\n"
            + "  letter-spacing: 1px;  /* Thêm khoảng cách giữa các chữ */\n"
            + "}",
            "p {\n"
            + "  letter-spacing: -0.5px;  /* Làm cho các ký tự sát nhau */\n"
            + "}",
            "h1 {\n"
            + "  letter-spacing: 3px;  /* Khoảng cách rộng cho tiêu đề */\n"
            + "  text-transform: uppercase;  /* Chữ in hoa */\n"
            + "}",
            "h2 {\n"
            + "  font-size: 24px;\n"
            + "  letter-spacing: 2px;\n"
            + "  text-transform: uppercase;\n"
            + "  font-weight: bold;\n"
            + "}"
        });
        Code_MAP.put("Ứng dụng thực tế", new String[]{
            "h1 {\n"
            + "  font-size: 48px;\n"
            + "  letter-spacing: 2px;  /* Thêm khoảng cách để tiêu đề trông rộng rãi, thoáng đãng */\n"
            + "  text-transform: uppercase;  /* Chữ in hoa tạo cảm giác mạnh mẽ */\n"
            + "}",
            "p {\n"
            + "  font-size: 16px;\n"
            + "  line-height: 1.5;\n"
            + "  letter-spacing: 0.5px;  /* Thêm khoảng cách nhỏ giữa các ký tự giúp đọc dễ dàng hơn */\n"
            + "}",
            "h2 {\n"
            + "  font-size: 30px;\n"
            + "  font-weight: bold;\n"
            + "  letter-spacing: 5px;  /* Khoảng cách lớn tạo ra hiệu ứng đặc biệt */\n"
            + "  text-transform: uppercase;\n"
            + "  color: #FF6347;  /* Màu sắc nổi bật */\n"
            + "}",
            "button {\n"
            + "  font-size: 18px;\n"
            + "  font-weight: bold;\n"
            + "  letter-spacing: 1px;  /* Khoảng cách giữa các chữ tạo hiệu ứng rõ ràng */\n"
            + "  padding: 10px 20px;\n"
            + "  background-color: #008CBA;\n"
            + "  color: white;\n"
            + "  border: none;\n"
            + "  border-radius: 5px;\n"
            + "}",
            ".logo {\n"
            + "  font-size: 36px;\n"
            + "  font-family: 'Arial', sans-serif;\n"
            + "  letter-spacing: 4px;  /* Khoảng cách rộng để tạo hiệu ứng thương hiệu nổi bật */\n"
            + "  text-transform: uppercase;\n"
            + "}",
            "a {\n"
            + "  font-size: 18px;\n"
            + "  letter-spacing: 1px;\n"
            + "  transition: all 0.3s ease;\n"
            + "}\n"
            + "\n"
            + "a:hover {\n"
            + "  letter-spacing: 3px;  /* Tăng khoảng cách khi rê chuột vào để tạo hiệu ứng */\n"
            + "}",
            "small-text {\n"
            + "  font-size: 12px;\n"
            + "  letter-spacing: -0.5px;  /* Giảm khoảng cách để văn bản nhỏ gọn hơn */\n"
            + "}"
        });
        Code_MAP.put("Display: block", new String[]{
            "div {\n"
            + "  display: block;\n"
            + "}",
            "<div style=\"display: block; width: 300px; height: 200px;\">\n"
            + "  Đây là một div với chiều rộng 300px và chiều cao 200px.\n"
            + "</div>",
            "<span>Đây là phần tử inline</span>\n"
            + "<span>Đây cũng là phần tử inline</span>",
            "div {\n"
            + "  display: block;\n"
            + "  width: 100%;\n"
            + "}",
            "section {\n"
            + "  display: block;\n"
            + "  margin-bottom: 20px;\n"
            + "}",
            "ul {\n"
            + "  list-style-type: none;\n"
            + "}\n"
            + "\n"
            + "li {\n"
            + "  display: block;\n"
            + "  padding: 10px;\n"
            + "}",
            "span {\n"
            + "  display: block;\n"
            + "}",
            "div {\n"
            + "  display: inline;\n"
            + "}"
        });
        Code_MAP.put("Display: inline", new String[]{
            "span {\n"
            + "  display: inline;\n"
            + "}",
            "<span>Đây là phần tử inline</span>\n"
            + "<span>Đây là phần tử inline thứ hai</span>",
            "<div>Đây là phần tử block</div>\n"
            + "<div>Đây là phần tử block thứ hai</div>",
            "span {\n"
            + "  display: inline;\n"
            + "  color: red;\n"
            + "}",
            "<p>This is <span>important</span> text.</p>",
            "ul {\n"
            + "  list-style-type: none;\n"
            + "  padding: 0;\n"
            + "}\n"
            + "\n"
            + "li {\n"
            + "  display: inline;  /* Các mục sẽ hiển thị trên cùng một dòng */\n"
            + "  margin-right: 10px;\n"
            + "}",
            "<ul>\n"
            + "  <li>Home</li>\n"
            + "  <li>About</li>\n"
            + "  <li>Contact</li>\n"
            + "</ul>",
            "a {\n"
            + "  display: inline;\n"
            + "  text-decoration: none;\n"
            + "  color: blue;\n"
            + "}",
            "<p>Click <a href=\"#\">here</a> to learn more.</p>",
            ".inline-block {\n"
            + "  display: inline-block;\n"
            + "  width: 100px;\n"
            + "  height: 50px;\n"
            + "  background-color: lightblue;\n"
            + "}",
            "<div class=\"inline-block\">Block inside inline</div>\n"
            + "<div class=\"inline-block\">Another block inside inline</div>"
        });
        Code_MAP.put("Display: inline-block", new String[]{
            "div {\n"
            + "  display: inline-block;\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: lightblue;\n"
            + "}",
            "div {\n"
            + "  display: inline-block;\n"
            + "  width: 150px;\n"
            + "  height: 150px;\n"
            + "  background-color: coral;\n"
            + "  margin: 10px;\n"
            + "}",
            "<div></div>\n"
            + "<div></div>\n"
            + "<div></div>",
            "ul {\n"
            + "  list-style-type: none;\n"
            + "  padding: 0;\n"
            + "}\n"
            + "\n"
            + "li {\n"
            + "  display: inline-block;\n"
            + "  margin-right: 20px;\n"
            + "}\n"
            + "\n"
            + "a {\n"
            + "  text-decoration: none;\n"
            + "  font-size: 16px;\n"
            + "  color: black;\n"
            + "}",
            "<ul>\n"
            + "  <li><a href=\"#\">Home</a></li>\n"
            + "  <li><a href=\"#\">About</a></li>\n"
            + "  <li><a href=\"#\">Services</a></li>\n"
            + "  <li><a href=\"#\">Contact</a></li>\n"
            + "</ul>",
            ".box {\n"
            + "  display: inline-block;\n"
            + "  width: 30%;\n"
            + "  margin-right: 10px;\n"
            + "  background-color: lightgray;\n"
            + "  padding: 10px;\n"
            + "  text-align: center;\n"
            + "}",
            "<div class=\"box\">Box 1</div>\n"
            + "<div class=\"box\">Box 2</div>\n"
            + "<div class=\"box\">Box 3</div>",
            ".product {\n"
            + "  display: inline-block;\n"
            + "  width: 200px;\n"
            + "  height: 300px;\n"
            + "  background-color: lightblue;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  padding: 20px;\n"
            + "}",
            "<div class=\"product\">Product 1</div>\n"
            + "<div class=\"product\">Product 2</div>\n"
            + "<div class=\"product\">Product 3</div>",
            ".container {\n"
            + "  font-size: 0; /* Loại bỏ khoảng cách giữa các phần tử inline-block */\n"
            + "}\n"
            + "\n"
            + ".box {\n"
            + "  display: inline-block;\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background-color: coral;\n"
            + "}"
        });
        Code_MAP.put("Display: flex", new String[]{
            ".container {\n"
            + "  display: flex;\n"
            + "}",
            ".container {\n"
            + "  display: flex;\n"
            + "  flex-direction: row;  /* Mặc định là row */\n"
            + "}",
            ".container {\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "}",
            ".container {\n"
            + "  display: flex;\n"
            + "  align-items: center;\n"
            + "}",
            ".item {\n"
            + "  align-self: flex-end;\n"
            + "}",
            ".container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: wrap;\n"
            + "}",
            ".item {\n"
            + "  flex-grow: 1;\n"
            + "}",
            ".item {\n"
            + "  flex-shrink: 1;\n"
            + "}",
            ".item {\n"
            + "  flex-basis: 200px;\n"
            + "}",
            ".item {\n"
            + "  flex: 1 1 200px;\n"
            + "}",
            ".item {\n"
            + "  align-self: center;\n"
            + "}",
            "<div class=\"container\">\n"
            + "  <div class=\"item\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "  <div class=\"item\">Item 3</div>\n"
            + "</div>",
            ".container {\n"
            + "  display: flex;\n"
            + "  justify-content: space-between;\n"
            + "  align-items: center;\n"
            + "  flex-wrap: wrap;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  flex: 1 1 200px;\n"
            + "  padding: 10px;\n"
            + "  background-color: lightgray;\n"
            + "  text-align: center;\n"
            + "}"
        });
        Code_MAP.put("Display: grid", new String[]{
            ".container {\n"
            + "  display: grid;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 2fr 1fr; /* 3 cột, tỷ lệ kích thước là 1:2:1 */\n"
            + "  grid-template-rows: 100px auto 50px; /* 3 hàng: 100px, auto và 50px */\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-areas:\n"
            + "    \"header header header\"\n"
            + "    \"main main sidebar\"\n"
            + "    \"footer footer footer\";\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 1fr 1fr;\n"
            + "  grid-gap: 10px;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 1fr 1fr;\n"
            + "  gap: 10px 20px; /* 10px giữa các hàng, 20px giữa các cột */\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 1fr;\n"
            + "  grid-auto-rows: 100px;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  justify-items: center; /* Căn giữa các phần tử theo chiều ngang */\n"
            + "  align-items: center; /* Căn giữa các phần tử theo chiều dọc */\n"
            + "}",
            ".item {\n"
            + "  grid-column: 1 / 3; /* Phần tử này sẽ chiếm từ cột 1 đến cột 3 */\n"
            + "  grid-row: 2 / 4; /* Phần tử này sẽ chiếm từ hàng 2 đến hàng 4 */\n"
            + "}",
            ".item {\n"
            + "  grid-column-start: 1;\n"
            + "  grid-column-end: 3;\n"
            + "  grid-row-start: 2;\n"
            + "  grid-row-end: 4;\n"
            + "}",
            ".item {\n"
            + "  justify-self: center; /* Căn giữa theo chiều ngang */\n"
            + "  align-self: center; /* Căn giữa theo chiều dọc */\n"
            + "}",
            "<div class=\"container\">\n"
            + "  <div class=\"item item-1\">Item 1</div>\n"
            + "  <div class=\"item item-2\">Item 2</div>\n"
            + "  <div class=\"item item-3\">Item 3</div>\n"
            + "  <div class=\"item item-4\">Item 4</div>\n"
            + "  <div class=\"item item-5\">Item 5</div>\n"
            + "</div>",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 1fr 1fr;\n"
            + "  grid-template-rows: auto;\n"
            + "  gap: 10px;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  background-color: lightblue;\n"
            + "  padding: 20px;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + ".item-1 {\n"
            + "  grid-column: span 2;\n"
            + "  grid-row: 1;\n"
            + "}\n"
            + "\n"
            + ".item-2 {\n"
            + "  grid-column: 3;\n"
            + "  grid-row: 1;\n"
            + "}\n"
            + "\n"
            + ".item-3 {\n"
            + "  grid-column: 1;\n"
            + "  grid-row: 2;\n"
            + "}\n"
            + "\n"
            + ".item-4 {\n"
            + "  grid-column: 2;\n"
            + "  grid-row: 2;\n"
            + "}\n"
            + "\n"
            + ".item-5 {\n"
            + "  grid-column: 3;\n"
            + "  grid-row: 2;\n"
            + "}"
        });
        Code_MAP.put("Viewport là gì", new String[]{
            ".full-screen {\n"
            + "  width: 100vw;\n"
            + "  height: 100vh;\n"
            + "}",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            "@media (max-width: 768px) {\n"
            + "  body {\n"
            + "    font-size: 14px;\n"
            + "  }\n"
            + "}"
        });
        Code_MAP.put("Cú pháp chuẩn của thẻ Viewport", new String[]{
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">"
        });
        Code_MAP.put("Các thuộc tính quan trọng", new String[]{
            "<meta name=\"viewport\" content=\"width=device-width\">",
            "<meta name=\"viewport\" content=\"initial-scale=1.0\">",
            "<meta name=\"viewport\" content=\"maximum-scale=1.0\">",
            "<meta name=\"viewport\" content=\"minimum-scale=0.5\">",
            "<meta name=\"viewport\" content=\"user-scalable=no\">",
            "<meta name=\"viewport\" content=\"height=device-height\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">"
        });
        Code_MAP.put("Vai trò của Viewport meta tag", new String[]{
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
            "<meta name=\"viewport\" content=\"user-scalable=no\">",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
        });
        // css nang cao
        Code_MAP.put("display: flex là gì?", new String[]{
            ".container {\n"
            + "  flex-direction: row | row-reverse | column | column-reverse;\n"
            + "}",
            ".container {\n"
            + "  flex-wrap: nowrap | wrap | wrap-reverse;\n"
            + "}",
            ".container {\n"
            + "  justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly;\n"
            + "}",
            ".container {\n"
            + "  align-items: stretch | flex-start | flex-end | center | baseline;\n"
            + "}",
            ".container {\n"
            + "  align-content: flex-start | flex-end | center | space-between | space-around | stretch;\n"
            + "}",
            ".item {\n"
            + "  order: 5; /* Giá trị mặc định là 0 */\n"
            + "}",
            ".item {\n"
            + "  flex-grow: 2; /* Giá trị mặc định là 0 */\n"
            + "}",
            ".item {\n"
            + "  flex-shrink: 3; /* Giá trị mặc định là 1 */\n"
            + "}",
            ".item {\n"
            + "  flex-basis: 200px | auto; /* Giá trị mặc định là auto */\n"
            + "}",
            ".item {\n"
            + "  align-self: auto | flex-start | flex-end | center | baseline | stretch;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Flexbox Demo</title>\n"
            + "  <style>\n"
            + "    .flex-container {\n"
            + "      display: flex;\n"
            + "      flex-direction: row;\n"
            + "      flex-wrap: wrap;\n"
            + "      justify-content: space-around;\n"
            + "      align-items: center;\n"
            + "      background-color: #f1f1f1;\n"
            + "      padding: 10px;\n"
            + "      height: 300px;\n"
            + "    }\n"
            + "    \n"
            + "    .flex-item {\n"
            + "      background-color: #4CAF50;\n"
            + "      color: white;\n"
            + "      width: 100px;\n"
            + "      margin: 10px;\n"
            + "      text-align: center;\n"
            + "      line-height: 75px;\n"
            + "      font-size: 30px;\n"
            + "    }\n"
            + "    \n"
            + "    .item1 {\n"
            + "      order: 3;\n"
            + "      flex-grow: 1;\n"
            + "    }\n"
            + "    \n"
            + "    .item2 {\n"
            + "      order: 1;\n"
            + "      flex-shrink: 2;\n"
            + "      align-self: flex-end;\n"
            + "    }\n"
            + "    \n"
            + "    .item3 {\n"
            + "      order: 2;\n"
            + "      flex-basis: 150px;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Ví dụ về Flexbox</h1>\n"
            + "  \n"
            + "  <div class=\"flex-container\">\n"
            + "    <div class=\"flex-item item1\">1</div>\n"
            + "    <div class=\"flex-item item2\">2</div>\n"
            + "    <div class=\"flex-item item3\">3</div>\n"
            + "  </div>\n"
            + "  \n"
            + "  <p>Container này sử dụng display: flex với nhiều thuộc tính flexbox khác nhau.</p>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Các thuộc tính chính của Flexbox", new String[]{
            "<div class=\"flex-container\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>",
            ".flex-container {\n"
            + "  display: flex; /* hoặc inline-flex */\n"
            + "  border: 2px solid #333;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  background-color: #4CAF50;\n"
            + "  color: white;\n"
            + "  padding: 20px;\n"
            + "  margin: 5px;\n"
            + "  text-align: center;\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-direction: row; /* Mặc định, sắp xếp ngang từ trái sang phải */\n"
            + "  /* flex-direction: row-reverse; Sắp xếp ngang từ phải sang trái */\n"
            + "  /* flex-direction: column; Sắp xếp dọc từ trên xuống */\n"
            + "  /* flex-direction: column-reverse; Sắp xếp dọc từ dưới lên */\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: nowrap; /* Mặc định, không xuống dòng */\n"
            + "  /* flex-wrap: wrap; Xuống dòng khi cần */\n"
            + "  /* flex-wrap: wrap-reverse; Xuống dòng nhưng đảo ngược thứ tự */\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-flow: row wrap; /* Tương đương flex-direction: row; flex-wrap: wrap; */\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  justify-content: flex-start; /* Mặc định, căn về đầu */\n"
            + "  /* justify-content: flex-end; Căn về cuối */\n"
            + "  /* justify-content: center; Căn giữa */\n"
            + "  /* justify-content: space-between; Căn đều, không gian giữa các item */\n"
            + "  /* justify-content: space-around; Căn đều, không gian xung quanh các item */\n"
            + "  /* justify-content: space-evenly; Căn đều, không gian bằng nhau giữa các item */\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: stretch; /* Mặc định, kéo dãn để lấp đầy container */\n"
            + "  /* align-items: flex-start; Căn về đầu */\n"
            + "  /* align-items: flex-end; Căn về cuối */\n"
            + "  /* align-items: center; Căn giữa */\n"
            + "  /* align-items: baseline; Căn theo baseline của text */\n"
            + "}",
            ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: wrap;\n"
            + "  align-content: stretch; /* Mặc định, kéo dãn các dòng để lấp đầy */\n"
            + "  /* align-content: flex-start; Các dòng căn về đầu */\n"
            + "  /* align-content: flex-end; Các dòng căn về cuối */\n"
            + "  /* align-content: center; Các dòng căn giữa */\n"
            + "  /* align-content: space-between; Căn đều giữa các dòng */\n"
            + "  /* align-content: space-around; Căn đều xung quanh các dòng */\n"
            + "}",
            ".item:nth-child(1) {\n"
            + "  order: 3; /* Hiển thị cuối cùng */\n"
            + "}\n"
            + ".item:nth-child(2) {\n"
            + "  order: 1; /* Hiển thị đầu tiên */\n"
            + "}\n"
            + ".item:nth-child(3) {\n"
            + "  order: 2; /* Hiển thị thứ hai */\n"
            + "}",
            ".item:nth-child(1) {\n"
            + "  flex-grow: 1; /* Chiếm không gian gấp đôi item thứ 2 */\n"
            + "}\n"
            + ".item:nth-child(2) {\n"
            + "  flex-grow: 2;\n"
            + "}",
            ".item:nth-child(1) {\n"
            + "  flex-shrink: 1; /* Thu nhỏ bình thường */\n"
            + "}\n"
            + ".item:nth-child(2) {\n"
            + "  flex-shrink: 3; /* Thu nhỏ nhanh hơn 3 lần so với item thứ 1 */\n"
            + "}",
            ".item {\n"
            + "  flex-basis: 100px; /* Thiết lập chiều rộng ban đầu là 100px */\n"
            + "  /* flex-basis: auto; Mặc định, lấy kích thước nội dung */\n"
            + "}",
            ".item {\n"
            + "  flex: 1 1 auto; /* Tương đương flex-grow: 1; flex-shrink: 1; flex-basis: auto; */\n"
            + "  /* flex: 0 1 100px; Không phóng to, thu nhỏ bình thường, kích thước ban đầu 100px */\n"
            + "  /* flex: 2; Tương đương flex: 2 1 0 */\n"
            + "}",
            ".item:nth-child(1) {\n"
            + "  align-self: flex-start; /* Căn item này về đầu */\n"
            + "}\n"
            + ".item:nth-child(2) {\n"
            + "  align-self: center; /* Căn giữa item này */\n"
            + "}\n"
            + ".item:nth-child(3) {\n"
            + "  align-self: flex-end; /* Căn về cuối item này */\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Flexbox Example</title>\n"
            + "  <style>\n"
            + "    .flex-container {\n"
            + "      display: flex;\n"
            + "      flex-flow: row wrap;\n"
            + "      justify-content: space-around;\n"
            + "      align-items: center;\n"
            + "      background-color: #f1f1f1;\n"
            + "      padding: 10px;\n"
            + "      height: 300px;\n"
            + "      border: 2px solid #333;\n"
            + "    }\n"
            + "    \n"
            + "    .item {\n"
            + "      background-color: #4CAF50;\n"
            + "      color: white;\n"
            + "      padding: 20px;\n"
            + "      margin: 10px;\n"
            + "      text-align: center;\n"
            + "      font-size: 20px;\n"
            + "      flex: 1 1 100px;\n"
            + "    }\n"
            + "    \n"
            + "    .item:nth-child(1) {\n"
            + "      order: 2;\n"
            + "      align-self: flex-end;\n"
            + "    }\n"
            + "    \n"
            + "    .item:nth-child(2) {\n"
            + "      order: 1;\n"
            + "      flex-grow: 2;\n"
            + "    }\n"
            + "    \n"
            + "    .item:nth-child(3) {\n"
            + "      order: 3;\n"
            + "      flex-shrink: 2;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"flex-container\">\n"
            + "    <div class=\"item\">1</div>\n"
            + "    <div class=\"item\">2</div>\n"
            + "    <div class=\"item\">3</div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("justify-content", new String[]{
            "<div class=\"container flex-start\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  border: 2px solid #333;\n"
            + "  padding: 10px;\n"
            + "  margin-bottom: 20px;\n"
            + "  height: 100px;\n"
            + "}\n"
            + ".item {\n"
            + "  width: 50px;\n"
            + "  height: 50px;\n"
            + "  background-color: #4CAF50;\n"
            + "  margin: 5px;\n"
            + "  display: flex;\n"
            + "  align-items: center;\n"
            + "  justify-content: center;\n"
            + "  color: white;\n"
            + "}\n"
            + ".flex-start {\n"
            + "  justify-content: flex-start;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container flex-end\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".flex-end {\n"
            + "  justify-content: flex-end;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container center\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".center {\n"
            + "  justify-content: center;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container space-between\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".space-between {\n"
            + "  justify-content: space-between;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container space-around\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".space-around {\n"
            + "  justify-content: space-around;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container space-evenly\">\n"
            + "  <div class=\"item\">1</div>\n"
            + "  <div class=\"item\">2</div>\n"
            + "  <div class=\"item\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".space-evenly {\n"
            + "  justify-content: space-evenly;\n"
            + "}\n"
            + "</style>",
            "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item\">1</div>\n"
            + "  <div class=\"grid-item\">2</div>\n"
            + "  <div class=\"grid-item\">3</div>\n"
            + "  <div class=\"grid-item\">4</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 100px;\n"
            + "  grid-template-rows: 100px 100px;\n"
            + "  justify-content: center;\n"
            + "  gap: 10px;\n"
            + "  border: 2px solid #333;\n"
            + "  padding: 10px;\n"
            + "  height: 300px;\n"
            + "}\n"
            + ".grid-item {\n"
            + "  background-color: #2196F3;\n"
            + "  color: white;\n"
            + "  display: flex;\n"
            + "  align-items: center;\n"
            + "  justify-content: center;\n"
            + "}\n"
            + "</style>"
        });

        Code_MAP.put("align-items", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: stretch;\n"
            + "  height: 200px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item\">1</div>\n"
            + "  <div class=\"flex-item\">2</div>\n"
            + "  <div class=\"flex-item\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: flex-start;\n"
            + "  height: 200px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item\">1</div>\n"
            + "  <div class=\"flex-item\">2</div>\n"
            + "  <div class=\"flex-item\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: flex-end;\n"
            + "  height: 200px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item\">1</div>\n"
            + "  <div class=\"flex-item\">2</div>\n"
            + "  <div class=\"flex-item\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: center;\n"
            + "  height: 200px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item\">1</div>\n"
            + "  <div class=\"flex-item\">2</div>\n"
            + "  <div class=\"flex-item\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  align-items: baseline;\n"
            + "  height: 200px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "\n"
            + ".item1 { padding-top: 30px; }\n"
            + ".item2 { padding-top: 50px; }\n"
            + ".item3 { padding-top: 10px; }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item item1\">1</div>\n"
            + "  <div class=\"flex-item item2\">2</div>\n"
            + "  <div class=\"flex-item item3\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-direction: column;\n"
            + "  align-items: center;\n"
            + "  justify-content: center;\n"
            + "  height: 300px;\n"
            + "  background-color: #f1f1f1;\n"
            + "}\n"
            + "\n"
            + ".flex-item {\n"
            + "  background-color: DodgerBlue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "  <div class=\"flex-item\">1</div>\n"
            + "  <div class=\"flex-item\">2</div>\n"
            + "  <div class=\"flex-item\">3</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("align-self", new String[]{
            "<div class=\"container\">\n"
            + "  <div class=\"item auto\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "  align-items: center; /* Container có align-items: center */\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightblue;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".auto {\n"
            + "  align-self: auto; /* Sẽ kế thừa center từ container */\n"
            + "}\n"
            + "</style>",
            "<div class=\"container\">\n"
            + "  <div class=\"item start\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightcoral;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".start {\n"
            + "  align-self: flex-start;\n"
            + "  background: lightgreen;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container\">\n"
            + "  <div class=\"item end\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightcoral;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".end {\n"
            + "  align-self: flex-end;\n"
            + "  background: lightblue;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container\">\n"
            + "  <div class=\"item center\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightcoral;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".center {\n"
            + "  align-self: center;\n"
            + "  background: lightyellow;\n"
            + "}\n"
            + "</style>",
            "<div class=\"container\">\n"
            + "  <div class=\"item baseline\">Item with text</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "  align-items: flex-start;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightcoral;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".baseline {\n"
            + "  align-self: baseline;\n"
            + "  background: lightpink;\n"
            + "  padding-top: 20px; /* Để thấy rõ hiệu ứng baseline */\n"
            + "}\n"
            + "</style>",
            "<div class=\"container\">\n"
            + "  <div class=\"item stretch\">Item 1</div>\n"
            + "  <div class=\"item\">Item 2</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "}\n"
            + "\n"
            + ".item {\n"
            + "  width: 80px;\n"
            + "  background: lightcoral;\n"
            + "  margin: 5px;\n"
            + "}\n"
            + "\n"
            + ".stretch {\n"
            + "  align-self: stretch;\n"
            + "  background: lightsalmon;\n"
            + "  height: auto; /* Bỏ height cố định để stretch có hiệu lực */\n"
            + "}\n"
            + "</style>",
            "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item item1\">1</div>\n"
            + "  <div class=\"grid-item item2\">2</div>\n"
            + "  <div class=\"grid-item item3\">3</div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: repeat(3, 1fr);\n"
            + "  height: 200px;\n"
            + "  background: #f0f0f0;\n"
            + "}\n"
            + "\n"
            + ".grid-item {\n"
            + "  background: lightblue;\n"
            + "  padding: 10px;\n"
            + "  border: 1px solid #333;\n"
            + "}\n"
            + "\n"
            + ".item1 {\n"
            + "  align-self: start;\n"
            + "  background: lightgreen;\n"
            + "}\n"
            + "\n"
            + ".item2 {\n"
            + "  align-self: center;\n"
            + "  background: lightyellow;\n"
            + "}\n"
            + "\n"
            + ".item3 {\n"
            + "  align-self: end;\n"
            + "  background: lightcoral;\n"
            + "}\n"
            + "</style>"
        });

        Code_MAP.put("flex-wrap", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: nowrap;\n"
            + "  background-color: #f1f1f1;\n"
            + "  width: 300px;\n"
            + "}\n"
            + "\n"
            + ".container > div {\n"
            + "  background-color: dodgerblue;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>flex-wrap: nowrap</h2>\n"
            + "<div class=\"container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>\n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: wrap;\n"
            + "  background-color: #f1f1f1;\n"
            + "  width: 300px;\n"
            + "}\n"
            + "\n"
            + ".container > div {\n"
            + "  background-color: tomato;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>flex-wrap: wrap</h2>\n"
            + "<div class=\"container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>\n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  flex-wrap: wrap-reverse;\n"
            + "  background-color: #f1f1f1;\n"
            + "  width: 300px;\n"
            + "}\n"
            + "\n"
            + ".container > div {\n"
            + "  background-color: green;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>flex-wrap: wrap-reverse</h2>\n"
            + "<div class=\"container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>\n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  flex-flow: row-reverse wrap;\n"
            + "  background-color: #f1f1f1;\n"
            + "  width: 300px;\n"
            + "  height: 200px;\n"
            + "}\n"
            + "\n"
            + ".container > div {\n"
            + "  background-color: purple;\n"
            + "  color: white;\n"
            + "  width: 100px;\n"
            + "  margin: 10px;\n"
            + "  text-align: center;\n"
            + "  line-height: 75px;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<h2>flex-flow: row-reverse wrap</h2>\n"
            + "<div class=\"container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>\n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("flex-direction", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Flex-direction Demo</title>\n"
            + "    <style>\n"
            + "        .container {\n"
            + "            display: flex;\n"
            + "            margin-bottom: 20px;\n"
            + "            border: 2px solid #333;\n"
            + "            padding: 10px;\n"
            + "        }\n"
            + "        \n"
            + "        .item {\n"
            + "            width: 100px;\n"
            + "            height: 100px;\n"
            + "            background-color: #4CAF50;\n"
            + "            margin: 5px;\n"
            + "            display: flex;\n"
            + "            justify-content: center;\n"
            + "            align-items: center;\n"
            + "            color: white;\n"
            + "            font-size: 24px;\n"
            + "        }\n"
            + "        \n"
            + "        .row {\n"
            + "            flex-direction: row;\n"
            + "        }\n"
            + "        \n"
            + "        .row-reverse {\n"
            + "            flex-direction: row-reverse;\n"
            + "        }\n"
            + "        \n"
            + "        .column {\n"
            + "            flex-direction: column;\n"
            + "            height: 400px;\n"
            + "        }\n"
            + "        \n"
            + "        .column-reverse {\n"
            + "            flex-direction: column-reverse;\n"
            + "            height: 400px;\n"
            + "        }\n"
            + "        \n"
            + "        h2 {\n"
            + "            color: #333;\n"
            + "            margin-top: 30px;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Demo flex-direction</h1>\n"
            + "    \n"
            + "    <h2>flex-direction: row (mặc định)</h2>\n"
            + "    <div class=\"container row\">\n"
            + "        <div class=\"item\">1</div>\n"
            + "        <div class=\"item\">2</div>\n"
            + "        <div class=\"item\">3</div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <h2>flex-direction: row-reverse</h2>\n"
            + "    <div class=\"container row-reverse\">\n"
            + "        <div class=\"item\">1</div>\n"
            + "        <div class=\"item\">2</div>\n"
            + "        <div class=\"item\">3</div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <h2>flex-direction: column</h2>\n"
            + "    <div class=\"container column\">\n"
            + "        <div class=\"item\">1</div>\n"
            + "        <div class=\"item\">2</div>\n"
            + "        <div class=\"item\">3</div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <h2>flex-direction: column-reverse</h2>\n"
            + "    <div class=\"container column-reverse\">\n"
            + "        <div class=\"item\">1</div>\n"
            + "        <div class=\"item\">2</div>\n"
            + "        <div class=\"item\">3</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("display: grid là gì?", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 200px auto;\n"
            + "  grid-template-rows: 80px 200px;\n"
            + "  gap: 10px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".grid-container > div {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  text-align: center;\n"
            + "  padding: 20px 0;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>  \n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "  <div>6</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: auto auto auto;\n"
            + "  gap: 10px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".grid-container > div {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  text-align: center;\n"
            + "  padding: 20px 0;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "\n"
            + ".item1 {\n"
            + "  grid-column-start: 1;\n"
            + "  grid-column-end: 3;\n"
            + "  grid-row: 1 / 3;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div class=\"item1\">1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>  \n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "  <div>6</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));\n"
            + "  gap: 10px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".grid-container > div {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  text-align: center;\n"
            + "  padding: 20px 0;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>  \n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "  <div>6</div>  \n"
            + "  <div>7</div>\n"
            + "  <div>8</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 100px 100px;\n"
            + "  grid-template-rows: 100px 100px 100px;\n"
            + "  gap: 10px;\n"
            + "  height: 400px;\n"
            + "  width: 400px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "  justify-content: center;\n"
            + "  align-content: center;\n"
            + "}\n"
            + "\n"
            + ".grid-container > div {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  text-align: center;\n"
            + "  padding: 20px 0;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div>1</div>\n"
            + "  <div>2</div>\n"
            + "  <div>3</div>  \n"
            + "  <div>4</div>\n"
            + "  <div>5</div>\n"
            + "  <div>6</div>  \n"
            + "  <div>7</div>\n"
            + "  <div>8</div>\n"
            + "  <div>9</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-areas:\n"
            + "    'header header header'\n"
            + "    'sidebar content content'\n"
            + "    'footer footer footer';\n"
            + "  gap: 10px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".grid-container > div {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  text-align: center;\n"
            + "  padding: 20px 0;\n"
            + "  font-size: 30px;\n"
            + "}\n"
            + "\n"
            + ".header { grid-area: header; }\n"
            + ".sidebar { grid-area: sidebar; }\n"
            + ".content { grid-area: content; }\n"
            + ".footer { grid-area: footer; }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div class=\"header\">Header</div>\n"
            + "  <div class=\"sidebar\">Sidebar</div>\n"
            + "  <div class=\"content\">Content</div>\n"
            + "  <div class=\"footer\">Footer</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));\n"
            + "  gap: 20px;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + ".grid-item {\n"
            + "  background-color: #f1f1f1;\n"
            + "  border: 1px solid #ddd;\n"
            + "  padding: 20px;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + "@media (max-width: 600px) {\n"
            + "  .grid-container {\n"
            + "    grid-template-columns: 1fr;\n"
            + "  }\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item\">Item 1</div>\n"
            + "  <div class=\"grid-item\">Item 2</div>\n"
            + "  <div class=\"grid-item\">Item 3</div>\n"
            + "  <div class=\"grid-item\">Item 4</div>\n"
            + "  <div class=\"grid-item\">Item 5</div>\n"
            + "  <div class=\"grid-item\">Item 6</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 2fr;\n"
            + "  gap: 20px;\n"
            + "}\n"
            + "\n"
            + ".grid-item {\n"
            + "  display: flex;\n"
            + "  flex-direction: column;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  padding: 20px;\n"
            + "  background-color: #f1f1f1;\n"
            + "  border: 1px solid #ddd;\n"
            + "}\n"
            + "\n"
            + "@media (max-width: 768px) {\n"
            + "  .grid-container {\n"
            + "    grid-template-columns: 1fr;\n"
            + "  }\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item\">\n"
            + "    <h3>Box 1</h3>\n"
            + "    <p>Content for box 1</p>\n"
            + "  </div>\n"
            + "  <div class=\"grid-item\">\n"
            + "    <h3>Box 2</h3>\n"
            + "    <p>Content for box 2</p>\n"
            + "    <button>Click me</button>\n"
            + "  </div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Các thuộc tính chính của CSS Grid", new String[]{
            ".container {\n"
            + "  display: grid;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 200px auto;\n"
            + "  grid-template-rows: 50px 100px;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-areas:\n"
            + "    \"header header header\"\n"
            + "    \"sidebar content content\"\n"
            + "    \"footer footer footer\";\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  gap: 10px; /* hoặc row-gap và column-gap riêng biệt */\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  justify-items: center; /* start | end | center | stretch */\n"
            + "  align-items: center;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  justify-content: space-between;\n"
            + "  align-content: space-around;\n"
            + "}",
            ".item {\n"
            + "  grid-column: 1 / 3; /* bắt đầu ở cột 1, kết thúc trước cột 3 */\n"
            + "  grid-row: 1; /* chiếm hàng 1 */\n"
            + "}",
            ".item {\n"
            + "  grid-area: header; /* sử dụng với grid-template-areas */\n"
            + "  \n"
            + "  /* hoặc */\n"
            + "  grid-area: 1 / 1 / 3 / 3; /* row-start / column-start / row-end / column-end */\n"
            + "}",
            ".item {\n"
            + "  justify-self: start;\n"
            + "  align-self: end;\n"
            + "}",
            ".container {\n"
            + "  grid-template-columns: repeat(3, 1fr); /* 3 cột bằng nhau */\n"
            + "}",
            ".container {\n"
            + "  grid-template-columns: 1fr 2fr 1fr; /* cột giữa rộng gấp đôi */\n"
            + "}",
            ".container {\n"
            + "  grid-template-columns: minmax(100px, 1fr) 2fr;\n"
            + "}",
            ".container {\n"
            + "  grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .container {\n"
            + "    display: grid;\n"
            + "    grid-template-columns: repeat(3, 1fr);\n"
            + "    grid-template-rows: 80px auto 80px;\n"
            + "    grid-template-areas:\n"
            + "      \"header header header\"\n"
            + "      \"sidebar main main\"\n"
            + "      \"footer footer footer\";\n"
            + "    gap: 10px;\n"
            + "    height: 100vh;\n"
            + "  }\n"
            + "  \n"
            + "  .header {\n"
            + "    grid-area: header;\n"
            + "    background-color: #ff9e7d;\n"
            + "    display: flex;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "    font-size: 24px;\n"
            + "  }\n"
            + "  \n"
            + "  .sidebar {\n"
            + "    grid-area: sidebar;\n"
            + "    background-color: #7dffb3;\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "  \n"
            + "  .main {\n"
            + "    grid-area: main;\n"
            + "    background-color: #7dc8ff;\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "  \n"
            + "  .footer {\n"
            + "    grid-area: footer;\n"
            + "    background-color: #ff7de8;\n"
            + "    display: flex;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"container\">\n"
            + "  <div class=\"header\">Header</div>\n"
            + "  <div class=\"sidebar\">Sidebar</div>\n"
            + "  <div class=\"main\">Main Content</div>\n"
            + "  <div class=\"footer\">Footer</div>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Khái Niệm về CSS Grid Layout", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: auto auto auto;\n"
            + "  grid-gap: 10px;\n"
            + "  background-color: #2196F3;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + ".grid-item {\n"
            + "  background-color: rgba(255, 255, 255, 0.8);\n"
            + "  border: 1px solid rgba(0, 0, 0, 0.8);\n"
            + "  padding: 20px;\n"
            + "  font-size: 30px;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item\">1</div>\n"
            + "  <div class=\"grid-item\">2</div>\n"
            + "  <div class=\"grid-item\">3</div>  \n"
            + "  <div class=\"grid-item\">4</div>\n"
            + "  <div class=\"grid-item\">5</div>\n"
            + "  <div class=\"grid-item\">6</div>  \n"
            + "  <div class=\"grid-item\">7</div>\n"
            + "  <div class=\"grid-item\">8</div>\n"
            + "  <div class=\"grid-item\">9</div>  \n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 200px auto;\n"
            + "  grid-template-rows: 80px 200px;\n"
            + "}",
            ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-areas:\n"
            + "    'header header header'\n"
            + "    'sidebar content content'\n"
            + "    'footer footer footer';\n"
            + "}",
            ".grid-container {\n"
            + "  gap: 20px; /* Cả row-gap và column-gap */\n"
            + "  /* Hoặc */\n"
            + "  row-gap: 10px;\n"
            + "  column-gap: 20px;\n"
            + "}",
            ".grid-container {\n"
            + "  justify-items: center; /* start | end | center | stretch */\n"
            + "  align-items: center;\n"
            + "}",
            ".grid-container {\n"
            + "  justify-content: space-between;\n"
            + "  align-content: center;\n"
            + "}",
            ".item1 {\n"
            + "  grid-column: 1 / 3; /* Bắt đầu từ line 1 đến line 3 */\n"
            + "  grid-row: 1;\n"
            + "}",
            ".header {\n"
            + "  grid-area: header;\n"
            + "}",
            ".item5 {\n"
            + "  justify-self: end;\n"
            + "  align-self: start;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "body {\n"
            + "  font-family: Arial, sans-serif;\n"
            + "  margin: 0;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + ".page {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 200px 1fr;\n"
            + "  grid-template-rows: 80px 1fr 60px;\n"
            + "  grid-template-areas:\n"
            + "    \"header header\"\n"
            + "    \"sidebar main\"\n"
            + "    \"footer footer\";\n"
            + "  min-height: 100vh;\n"
            + "  gap: 15px;\n"
            + "}\n"
            + "\n"
            + ".header {\n"
            + "  grid-area: header;\n"
            + "  background-color: #4CAF50;\n"
            + "  color: white;\n"
            + "  padding: 20px;\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + ".sidebar {\n"
            + "  grid-area: sidebar;\n"
            + "  background-color: #333;\n"
            + "  color: white;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + ".main {\n"
            + "  grid-area: main;\n"
            + "  display: grid;\n"
            + "  grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));\n"
            + "  gap: 15px;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  background-color: #f1f1f1;\n"
            + "  border-radius: 5px;\n"
            + "  padding: 15px;\n"
            + "  box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n"
            + "}\n"
            + "\n"
            + ".footer {\n"
            + "  grid-area: footer;\n"
            + "  background-color: #333;\n"
            + "  color: white;\n"
            + "  text-align: center;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + "@media (max-width: 600px) {\n"
            + "  .page {\n"
            + "    grid-template-columns: 1fr;\n"
            + "    grid-template-rows: 80px auto 1fr 60px;\n"
            + "    grid-template-areas:\n"
            + "      \"header\"\n"
            + "      \"sidebar\"\n"
            + "      \"main\"\n"
            + "      \"footer\";\n"
            + "  }\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"page\">\n"
            + "  <header class=\"header\">\n"
            + "    <h1>My Website</h1>\n"
            + "  </header>\n"
            + "  \n"
            + "  <aside class=\"sidebar\">\n"
            + "    <h3>Menu</h3>\n"
            + "    <ul>\n"
            + "      <li>Home</li>\n"
            + "      <li>About</li>\n"
            + "      <li>Services</li>\n"
            + "      <li>Contact</li>\n"
            + "    </ul>\n"
            + "  </aside>\n"
            + "  \n"
            + "  <main class=\"main\">\n"
            + "    <div class=\"card\">\n"
            + "      <h3>Card 1</h3>\n"
            + "      <p>Some content here</p>\n"
            + "    </div>\n"
            + "    <div class=\"card\">\n"
            + "      <h3>Card 2</h3>\n"
            + "      <p>Some content here</p>\n"
            + "    </div>\n"
            + "    <div class=\"card\">\n"
            + "      <h3>Card 3</h3>\n"
            + "      <p>Some content here</p>\n"
            + "    </div>\n"
            + "    <div class=\"card\">\n"
            + "      <h3>Card 4</h3>\n"
            + "      <p>Some content here</p>\n"
            + "    </div>\n"
            + "  </main>\n"
            + "  \n"
            + "  <footer class=\"footer\">\n"
            + "    <p>&copy; 2023 My Website</p>\n"
            + "  </footer>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "grid-template-columns: repeat(3, 1fr); /* Tương đương 1fr 1fr 1fr */",
            "grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));",
            "grid-template-columns: 1fr 2fr 1fr; /* Cột giữa rộng gấp đôi */",
            "/* auto-fit sẽ co giãn các track để lấp đầy không gian */\n"
            + "grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));\n"
            + "\n"
            + "/* auto-fill sẽ tạo ra nhiều track có thể mà không co giãn */\n"
            + "grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));",
            "<div class=\"grid-container\">\n"
            + "  <div class=\"grid-item flex-container\">\n"
            + "    <div class=\"flex-item\">A</div>\n"
            + "    <div class=\"flex-item\">B</div>\n"
            + "    <div class=\"flex-item\">C</div>\n"
            + "  </div>\n"
            + "  <!-- Các grid item khác -->\n"
            + "</div>",
            ".grid-container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 1fr 1fr;\n"
            + "}\n"
            + "\n"
            + ".flex-container {\n"
            + "  display: flex;\n"
            + "  flex-direction: column;\n"
            + "  justify-content: space-around;\n"
            + "}"
        });

        Code_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new String[]{
            ".container {\n"
            + "  display: grid;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: 100px 200px auto;\n"
            + "  grid-template-rows: 50px 100px;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-template-areas:\n"
            + "    \"header header header\"\n"
            + "    \"sidebar main main\"\n"
            + "    \"footer footer footer\";\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-gap: 10px;\n"
            + "  /* Hoặc tách riêng */\n"
            + "  column-gap: 10px;\n"
            + "  row-gap: 15px;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  justify-items: center; /* start | end | center | stretch */\n"
            + "  align-items: start; /* start | end | center | stretch */\n"
            + "}",
            ".item {\n"
            + "  grid-column: 1 / 3; /* Bắt đầu từ cột 1 đến trước cột 3 */\n"
            + "  grid-row: 1; /* Chiếm hàng 1 */\n"
            + "}",
            ".item {\n"
            + "  grid-area: header; /* Sử dụng với grid-template-areas */\n"
            + "}\n"
            + "\n"
            + "/* Hoặc xác định vị trí */\n"
            + ".item2 {\n"
            + "  grid-area: 1 / 2 / 3 / 4; /* row-start / column-start / row-end / column-end */\n"
            + "}",
            ".item {\n"
            + "  justify-self: end;\n"
            + "  align-self: center;\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-auto-columns: 100px;\n"
            + "  grid-auto-rows: minmax(50px, auto);\n"
            + "}",
            ".container {\n"
            + "  display: grid;\n"
            + "  grid-auto-flow: row dense; /* row | column | row dense | column dense */\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .container {\n"
            + "    display: grid;\n"
            + "    grid-template-columns: 1fr 2fr 1fr;\n"
            + "    grid-template-rows: 80px auto 80px;\n"
            + "    grid-template-areas:\n"
            + "      \"header header header\"\n"
            + "      \"sidebar main aside\"\n"
            + "      \"footer footer footer\";\n"
            + "    gap: 10px;\n"
            + "    height: 100vh;\n"
            + "  }\n"
            + "\n"
            + "  .header {\n"
            + "    grid-area: header;\n"
            + "    background-color: #ff9e7d;\n"
            + "    display: flex;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "  }\n"
            + "\n"
            + "  .sidebar {\n"
            + "    grid-area: sidebar;\n"
            + "    background-color: #7dffb3;\n"
            + "    padding: 10px;\n"
            + "  }\n"
            + "\n"
            + "  .main {\n"
            + "    grid-area: main;\n"
            + "    background-color: #7dc8ff;\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "\n"
            + "  .aside {\n"
            + "    grid-area: aside;\n"
            + "    background-color: #ff7de8;\n"
            + "    padding: 10px;\n"
            + "  }\n"
            + "\n"
            + "  .footer {\n"
            + "    grid-area: footer;\n"
            + "    background-color: #e8ff7d;\n"
            + "    display: flex;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"container\">\n"
            + "    <div class=\"header\">Header</div>\n"
            + "    <div class=\"sidebar\">Sidebar</div>\n"
            + "    <div class=\"main\">Main Content</div>\n"
            + "    <div class=\"aside\">Aside</div>\n"
            + "    <div class=\"footer\">Footer</div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Chi Tiết về Các Thuộc Tính", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Thuộc tính HTML</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <!-- Thuộc tính id - định danh duy nhất -->\n"
            + "    <div id=\"header\">Phần đầu trang</div>\n"
            + "    \n"
            + "    <!-- Thuộc tính class - nhóm các phần tử -->\n"
            + "    <p class=\"text-red important\">Đoạn văn quan trọng</p>\n"
            + "    \n"
            + "    <!-- Thuộc tính style - CSS nội tuyến -->\n"
            + "    <h1 style=\"color: blue; font-size: 24px;\">Tiêu đề xanh</h1>\n"
            + "    \n"
            + "    <!-- Thuộc tính title - thông tin thêm khi hover -->\n"
            + "    <a href=\"#\" title=\"Trang chủ\">Home</a>\n"
            + "    \n"
            + "    <!-- Thuộc tính data-* - lưu dữ liệu tùy chỉnh -->\n"
            + "    <div data-user-id=\"12345\" data-role=\"admin\">Người dùng</div>\n"
            + "</body>\n"
            + "</html>",
            "<form action=\"/submit\" method=\"post\">\n"
            + "    <!-- Thuộc tính required - bắt buộc nhập -->\n"
            + "    <input type=\"text\" name=\"username\" required placeholder=\"Tên đăng nhập\">\n"
            + "    \n"
            + "    <!-- Thuộc tính disabled - vô hiệu hóa -->\n"
            + "    <input type=\"text\" name=\"lastname\" disabled value=\"Không thể chỉnh sửa\">\n"
            + "    \n"
            + "    <!-- Thuộc tính readonly - chỉ đọc -->\n"
            + "    <input type=\"text\" name=\"readonly-field\" readonly value=\"Chỉ đọc\">\n"
            + "    \n"
            + "    <!-- Thuộc tính maxlength - giới hạn ký tự -->\n"
            + "    <input type=\"text\" name=\"short-text\" maxlength=\"10\">\n"
            + "    \n"
            + "    <!-- Thuộc tính pattern - kiểm tra bằng regex -->\n"
            + "    <input type=\"text\" name=\"zipcode\" pattern=\"[0-9]{5}\" title=\"5 chữ số\">\n"
            + "    \n"
            + "    <button type=\"submit\">Gửi</button>\n"
            + "</form>",
            "<style>\n"
            + "    .text-example {\n"
            + "        /* Màu chữ */\n"
            + "        color: #333;\n"
            + "        \n"
            + "        /* Cỡ chữ */\n"
            + "        font-size: 16px;\n"
            + "        \n"
            + "        /* Kiểu chữ */\n"
            + "        font-family: Arial, sans-serif;\n"
            + "        \n"
            + "        /* Độ đậm */\n"
            + "        font-weight: bold;\n"
            + "        \n"
            + "        /* Kiểu chữ nghiêng */\n"
            + "        font-style: italic;\n"
            + "        \n"
            + "        /* Căn chỉnh văn bản */\n"
            + "        text-align: center;\n"
            + "        \n"
            + "        /* Trang trí văn bản */\n"
            + "        text-decoration: underline;\n"
            + "        \n"
            + "        /* Khoảng cách giữa các ký tự */\n"
            + "        letter-spacing: 1px;\n"
            + "        \n"
            + "        /* Khoảng cách giữa các dòng */\n"
            + "        line-height: 1.5;\n"
            + "        \n"
            + "        /* Chuyển đổi chữ hoa/thường */\n"
            + "        text-transform: uppercase;\n"
            + "        \n"
            + "        /* Bóng cho văn bản */\n"
            + "        text-shadow: 1px 1px 2px rgba(0,0,0,0.3);\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<p class=\"text-example\">Ví dụ về thuộc tính văn bản</p>",
            "<style>\n"
            + "    .box {\n"
            + "        /* Kích thước */\n"
            + "        width: 300px;\n"
            + "        height: 200px;\n"
            + "        \n"
            + "        /* Padding - khoảng cách bên trong */\n"
            + "        padding: 20px;\n"
            + "        \n"
            + "        /* Border - viền */\n"
            + "        border: 2px solid #000;\n"
            + "        border-radius: 10px; /* Bo góc */\n"
            + "        \n"
            + "        /* Margin - khoảng cách bên ngoài */\n"
            + "        margin: 30px auto;\n"
            + "        \n"
            + "        /* Nền */\n"
            + "        background-color: #f0f0f0;\n"
            + "        background-image: linear-gradient(to bottom, #fff, #ccc);\n"
            + "        \n"
            + "        /* Hiệu ứng */\n"
            + "        box-shadow: 5px 5px 10px rgba(0,0,0,0.2);\n"
            + "        \n"
            + "        /* Thuộc tính box-sizing */\n"
            + "        box-sizing: border-box; /* Bao gồm padding và border trong width/height */\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"box\">Đây là một hộp</div>",
            "<style>\n"
            + "    .display-example {\n"
            + "        /* Kiểu hiển thị */\n"
            + "        display: block; /* block | inline | inline-block | flex | grid | none */\n"
            + "        \n"
            + "        /* Vị trí */\n"
            + "        position: relative; /* static | relative | absolute | fixed | sticky */\n"
            + "        top: 10px;\n"
            + "        left: 20px;\n"
            + "        \n"
            + "        /* Lớp z-index */\n"
            + "        z-index: 10;\n"
            + "        \n"
            + "        /* Hiển thị/ẩn */\n"
            + "        visibility: visible; /* visible | hidden */\n"
            + "        \n"
            + "        /* Độ trong suốt */\n"
            + "        opacity: 0.8;\n"
            + "        \n"
            + "        /* Overflow - xử lý nội dung tràn */\n"
            + "        overflow: auto; /* visible | hidden | scroll | auto */\n"
            + "    }\n"
            + "    \n"
            + "    .flex-container {\n"
            + "        display: flex;\n"
            + "        justify-content: space-between; /* Căn chỉnh theo trục chính */\n"
            + "        align-items: center; /* Căn chỉnh theo trục phụ */\n"
            + "        flex-wrap: wrap; /* Xuống dòng khi cần */\n"
            + "    }\n"
            + "    \n"
            + "    .grid-container {\n"
            + "        display: grid;\n"
            + "        grid-template-columns: repeat(3, 1fr);\n"
            + "        grid-gap: 10px;\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"display-example\">Ví dụ hiển thị</div>\n"
            + "<div class=\"flex-container\">\n"
            + "    <div>Mục 1</div>\n"
            + "    <div>Mục 2</div>\n"
            + "    <div>Mục 3</div>\n"
            + "</div>\n"
            + "<div class=\"grid-container\">\n"
            + "    <div>Ô 1</div>\n"
            + "    <div>Ô 2</div>\n"
            + "    <div>Ô 3</div>\n"
            + "</div>",
            "<style>\n"
            + "    .transform-example {\n"
            + "        width: 100px;\n"
            + "        height: 100px;\n"
            + "        background-color: red;\n"
            + "        \n"
            + "        /* Chuyển đổi */\n"
            + "        transform: rotate(45deg) scale(1.2) translate(20px, 10px);\n"
            + "        \n"
            + "        /* Chuyển tiếp */\n"
            + "        transition: all 0.3s ease-in-out;\n"
            + "    }\n"
            + "    \n"
            + "    .transform-example:hover {\n"
            + "        transform: rotate(0) scale(1) translate(0, 0);\n"
            + "        background-color: blue;\n"
            + "    }\n"
            + "    \n"
            + "    /* Animation */\n"
            + "    @keyframes example-animation {\n"
            + "        0% { transform: translateX(0); }\n"
            + "        50% { transform: translateX(100px); }\n"
            + "        100% { transform: translateX(0); }\n"
            + "    }\n"
            + "    \n"
            + "    .animation-example {\n"
            + "        width: 50px;\n"
            + "        height: 50px;\n"
            + "        background-color: green;\n"
            + "        animation: example-animation 2s infinite;\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"transform-example\">Hover vào tôi</div>\n"
            + "<div class=\"animation-example\"></div>",
            "<style>\n"
            + "    .responsive-example {\n"
            + "        width: 80%;\n"
            + "        max-width: 1200px;\n"
            + "        min-width: 300px;\n"
            + "        margin: 0 auto;\n"
            + "        \n"
            + "        /* Media queries */\n"
            + "        @media (max-width: 768px) {\n"
            + "            width: 95%;\n"
            + "            font-size: 14px;\n"
            + "        }\n"
            + "        \n"
            + "        @media (max-width: 480px) {\n"
            + "            width: 100%;\n"
            + "            padding: 10px;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    /* Flexbox cho responsive */\n"
            + "    .responsive-flex {\n"
            + "        display: flex;\n"
            + "        flex-direction: row;\n"
            + "        \n"
            + "        @media (max-width: 600px) {\n"
            + "            flex-direction: column;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    /* Grid cho responsive */\n"
            + "    .responsive-grid {\n"
            + "        display: grid;\n"
            + "        grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"responsive-example\">Nội dung responsive</div>\n"
            + "<div class=\"responsive-flex\">\n"
            + "    <div>Mục 1</div>\n"
            + "    <div>Mục 2</div>\n"
            + "</div>\n"
            + "<div class=\"responsive-grid\">\n"
            + "    <div>Ô 1</div>\n"
            + "    <div>Ô 2</div>\n"
            + "    <div>Ô 3</div>\n"
            + "</div>",
            "<style>\n"
            + "    .flex-container {\n"
            + "        display: flex;\n"
            + "        flex-direction: row; /* row | row-reverse | column | column-reverse */\n"
            + "        flex-wrap: wrap; /* nowrap | wrap | wrap-reverse */\n"
            + "        justify-content: center; /* flex-start | flex-end | center | space-between | space-around | space-evenly */\n"
            + "        align-items: stretch; /* flex-start | flex-end | center | baseline | stretch */\n"
            + "        align-content: flex-start; /* flex-start | flex-end | center | space-between | space-around | stretch */\n"
            + "        gap: 10px; /* Khoảng cách giữa các item */\n"
            + "    }\n"
            + "    \n"
            + "    .flex-item {\n"
            + "        flex: 1 0 200px; /* flex-grow | flex-shrink | flex-basis */\n"
            + "        order: 0; /* Thứ tự hiển thị */\n"
            + "        align-self: auto; /* Ghi đè align-items cho item riêng lẻ */\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"flex-container\">\n"
            + "    <div class=\"flex-item\">Item 1</div>\n"
            + "    <div class=\"flex-item\">Item 2</div>\n"
            + "    <div class=\"flex-item\">Item 3</div>\n"
            + "</div>",
            "<style>\n"
            + "    .grid-container {\n"
            + "        display: grid;\n"
            + "        grid-template-columns: 1fr 2fr 1fr; /* Định nghĩa cột */\n"
            + "        grid-template-rows: auto 100px; /* Định nghĩa hàng */\n"
            + "        grid-template-areas: \n"
            + "            \"header header header\"\n"
            + "            \"sidebar main aside\"\n"
            + "            \"footer footer footer\";\n"
            + "        gap: 15px; /* Khoảng cách giữa các ô */\n"
            + "    }\n"
            + "    \n"
            + "    .grid-header {\n"
            + "        grid-area: header;\n"
            + "    }\n"
            + "    \n"
            + "    .grid-main {\n"
            + "        grid-area: main;\n"
            + "    }\n"
            + "    \n"
            + "    .grid-sidebar {\n"
            + "        grid-area: sidebar;\n"
            + "    }\n"
            + "    \n"
            + "    .grid-aside {\n"
            + "        grid-area: aside;\n"
            + "    }\n"
            + "    \n"
            + "    .grid-footer {\n"
            + "        grid-area: footer;\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"grid-container\">\n"
            + "    <div class=\"grid-header\">Header</div>\n"
            + "    <div class=\"grid-sidebar\">Sidebar</div>\n"
            + "    <div class=\"grid-main\">Nội dung chính</div>\n"
            + "    <div class=\"grid-aside\">Aside</div>\n"
            + "    <div class=\"grid-footer\">Footer</div>\n"
            + "</div>",
            "<style>\n"
            + "    :root {\n"
            + "        --primary-color: #3498db;\n"
            + "        --secondary-color: #2ecc71;\n"
            + "        --spacing: 16px;\n"
            + "        --max-width: 1200px;\n"
            + "    }\n"
            + "    \n"
            + "    .variable-example {\n"
            + "        color: var(--primary-color);\n"
            + "        background-color: var(--secondary-color);\n"
            + "        padding: var(--spacing);\n"
            + "        max-width: var(--max-width);\n"
            + "    }\n"
            + "    \n"
            + "    @media (max-width: 768px) {\n"
            + "        :root {\n"
            + "            --spacing: 8px;\n"
            + "        }\n"
            + "    }\n"
            + "</style>\n"
            + "\n"
            + "<div class=\"variable-example\">Sử dụng biến CSS</div>"
        });

        Code_MAP.put("Khái Niệm", new String[]{
            "@media media-type and (media-feature-rule) {\n"
            + "  /* CSS rules */\n"
            + "}",
            "@media screen and (max-width: 600px) {\n"
            + "  body {\n"
            + "    background-color: lightblue;\n"
            + "  }\n"
            + "}",
            "@media print {\n"
            + "  body {\n"
            + "    font-size: 12pt;\n"
            + "    color: black;\n"
            + "    background: white;\n"
            + "  }\n"
            + "  \n"
            + "  .no-print {\n"
            + "    display: none;\n"
            + "  }\n"
            + "}",
            "/* Áp dụng khi chiều rộng từ 600px đến 900px */\n"
            + "@media (min-width: 600px) and (max-width: 900px) {\n"
            + "  .container {\n"
            + "    width: 90%;\n"
            + "    margin: 0 auto;\n"
            + "  }\n"
            + "}",
            "@media (orientation: landscape) {\n"
            + "  .sidebar {\n"
            + "    width: 30%;\n"
            + "    float: left;\n"
            + "  }\n"
            + "  \n"
            + "  .main-content {\n"
            + "    width: 70%;\n"
            + "    float: right;\n"
            + "  }\n"
            + "}",
            "@media (min-resolution: 300dpi) {\n"
            + "  .logo {\n"
            + "    background-image: url('logo-high-res.png');\n"
            + "  }\n"
            + "}",
            "@media (hover: hover) {\n"
            + "  .button:hover {\n"
            + "    background-color: #0056b3;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "@media (prefers-color-scheme: dark) {\n"
            + "  body {\n"
            + "    background-color: #121212;\n"
            + "    color: #ffffff;\n"
            + "  }\n"
            + "}",
            "/* Mobile first approach */\n"
            + "body {\n"
            + "  font-size: 16px;\n"
            + "  padding: 10px;\n"
            + "}\n"
            + "\n"
            + "/* Tablet */\n"
            + "@media (min-width: 768px) {\n"
            + "  body {\n"
            + "    font-size: 18px;\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "/* Desktop */\n"
            + "@media (min-width: 1024px) {\n"
            + "  body {\n"
            + "    font-size: 20px;\n"
            + "    padding: 30px;\n"
            + "  }\n"
            + "}",
            "<link rel=\"stylesheet\" media=\"screen and (max-width: 600px)\" href=\"mobile.css\">\n"
            + "<link rel=\"stylesheet\" media=\"screen and (min-width: 601px)\" href=\"desktop.css\">",
            "@import url(\"tablet.css\") screen and (min-width: 768px);",
            "/* Extra small devices (phones, 600px and down) */\n"
            + "@media only screen and (max-width: 600px) {...}\n"
            + "\n"
            + "/* Small devices (portrait tablets and large phones, 600px and up) */\n"
            + "@media only screen and (min-width: 600px) {...}\n"
            + "\n"
            + "/* Medium devices (landscape tablets, 768px and up) */\n"
            + "@media only screen and (min-width: 768px) {...}\n"
            + "\n"
            + "/* Large devices (laptops/desktops, 992px and up) */\n"
            + "@media only screen and (min-width: 992px) {...}\n"
            + "\n"
            + "/* Extra large devices (large laptops and desktops, 1200px and up) */\n"
            + "@media only screen and (min-width: 1200px) {...}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Responsive Design Example</title>\n"
            + "  <style>\n"
            + "    * {\n"
            + "      box-sizing: border-box;\n"
            + "      margin: 0;\n"
            + "      padding: 0;\n"
            + "    }\n"
            + "    \n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      line-height: 1.6;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    header {\n"
            + "      background: #333;\n"
            + "      color: #fff;\n"
            + "      padding: 1rem;\n"
            + "      text-align: center;\n"
            + "      margin-bottom: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    nav {\n"
            + "      background: #444;\n"
            + "      padding: 1rem;\n"
            + "      margin-bottom: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    nav ul {\n"
            + "      list-style: none;\n"
            + "      display: flex;\n"
            + "      justify-content: center;\n"
            + "    }\n"
            + "    \n"
            + "    nav ul li {\n"
            + "      margin: 0 10px;\n"
            + "    }\n"
            + "    \n"
            + "    nav ul li a {\n"
            + "      color: #fff;\n"
            + "      text-decoration: none;\n"
            + "    }\n"
            + "    \n"
            + "    .container {\n"
            + "      display: flex;\n"
            + "      flex-wrap: wrap;\n"
            + "      gap: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .main {\n"
            + "      flex: 1;\n"
            + "      background: #f4f4f4;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .sidebar {\n"
            + "      width: 300px;\n"
            + "      background: #e4e4e4;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    footer {\n"
            + "      background: #333;\n"
            + "      color: #fff;\n"
            + "      text-align: center;\n"
            + "      padding: 1rem;\n"
            + "      margin-top: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    /* Tablet styles */\n"
            + "    @media (max-width: 768px) {\n"
            + "      .container {\n"
            + "        flex-direction: column;\n"
            + "      }\n"
            + "      \n"
            + "      .sidebar {\n"
            + "        width: 100%;\n"
            + "      }\n"
            + "      \n"
            + "      nav ul {\n"
            + "        flex-direction: column;\n"
            + "        align-items: center;\n"
            + "      }\n"
            + "      \n"
            + "      nav ul li {\n"
            + "        margin: 5px 0;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    /* Mobile styles */\n"
            + "    @media (max-width: 480px) {\n"
            + "      body {\n"
            + "        padding: 10px;\n"
            + "      }\n"
            + "      \n"
            + "      header h1 {\n"
            + "        font-size: 1.5rem;\n"
            + "      }\n"
            + "      \n"
            + "      .main, .sidebar {\n"
            + "        padding: 15px;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    /* Print styles */\n"
            + "    @media print {\n"
            + "      nav, footer {\n"
            + "        display: none;\n"
            + "      }\n"
            + "      \n"
            + "      body {\n"
            + "        font-size: 12pt;\n"
            + "        color: #000;\n"
            + "        background: #fff;\n"
            + "        padding: 0;\n"
            + "      }\n"
            + "      \n"
            + "      .container {\n"
            + "        display: block;\n"
            + "      }\n"
            + "      \n"
            + "      .sidebar {\n"
            + "        page-break-before: always;\n"
            + "      }\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <header>\n"
            + "    <h1>Responsive Website</h1>\n"
            + "  </header>\n"
            + "  \n"
            + "  <nav>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#\">Home</a></li>\n"
            + "      <li><a href=\"#\">About</a></li>\n"
            + "      <li><a href=\"#\">Services</a></li>\n"
            + "      <li><a href=\"#\">Contact</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "  \n"
            + "  <div class=\"container\">\n"
            + "    <main class=\"main\">\n"
            + "      <h2>Main Content</h2>\n"
            + "      <p>This is the main content area. It will adjust based on the screen size.</p>\n"
            + "    </main>\n"
            + "    \n"
            + "    <aside class=\"sidebar\">\n"
            + "      <h3>Sidebar</h3>\n"
            + "      <p>This is the sidebar content. On smaller screens it will appear below the main content.</p>\n"
            + "    </aside>\n"
            + "  </div>\n"
            + "  \n"
            + "  <footer>\n"
            + "    <p>&copy; 2023 Responsive Design Example</p>\n"
            + "  </footer>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Cách Sử Dụng Media Queries", new String[]{
            "@media not|only mediatype and (mediafeature and|or|not mediafeature) {\n"
            + "  /* CSS rules */\n"
            + "}",
            "/* Áp dụng khi màn hình có chiều rộng tối đa 600px */\n"
            + "@media screen and (max-width: 600px) {\n"
            + "  body {\n"
            + "    background-color: lightblue;\n"
            + "  }\n"
            + "}",
            "/* Áp dụng khi in */\n"
            + "@media print {\n"
            + "  body {\n"
            + "    font-size: 12pt;\n"
            + "    color: black;\n"
            + "  }\n"
            + "  .no-print {\n"
            + "    display: none;\n"
            + "  }\n"
            + "}",
            "/* Áp dụng cho màn hình ngang có chiều rộng từ 600px đến 900px */\n"
            + "@media screen and (orientation: landscape) and (min-width: 600px) and (max-width: 900px) {\n"
            + "  .container {\n"
            + "    grid-template-columns: repeat(2, 1fr);\n"
            + "  }\n"
            + "}",
            "/* Small devices (điện thoại, 600px trở xuống) */\n"
            + "@media only screen and (max-width: 600px) {...}\n"
            + "\n"
            + "/* Medium devices (tablet dọc, 600px - 768px) */\n"
            + "@media only screen and (min-width: 600px) and (max-width: 768px) {...}\n"
            + "\n"
            + "/* Large devices (tablet ngang, 768px - 992px) */\n"
            + "@media only screen and (min-width: 768px) and (max-width: 992px) {...}\n"
            + "\n"
            + "/* Extra large devices (máy tính, 992px - 1200px) */\n"
            + "@media only screen and (min-width: 992px) and (max-width: 1200px) {...}\n"
            + "\n"
            + "/* XXL devices (máy tính lớn, 1200px trở lên) */\n"
            + "@media only screen and (min-width: 1200px) {...}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Ví dụ Media Queries</title>\n"
            + "  <style>\n"
            + "    * {\n"
            + "      box-sizing: border-box;\n"
            + "      margin: 0;\n"
            + "      padding: 0;\n"
            + "    }\n"
            + "    \n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      line-height: 1.6;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .header {\n"
            + "      background-color: #333;\n"
            + "      color: white;\n"
            + "      padding: 1rem;\n"
            + "      text-align: center;\n"
            + "      margin-bottom: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .nav {\n"
            + "      display: flex;\n"
            + "      justify-content: space-around;\n"
            + "      background-color: #444;\n"
            + "      padding: 1rem;\n"
            + "      margin-bottom: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .nav a {\n"
            + "      color: white;\n"
            + "      text-decoration: none;\n"
            + "    }\n"
            + "    \n"
            + "    .main {\n"
            + "      display: flex;\n"
            + "      flex-wrap: wrap;\n"
            + "      gap: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .content {\n"
            + "      flex: 3;\n"
            + "      background-color: #f4f4f4;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .sidebar {\n"
            + "      flex: 1;\n"
            + "      background-color: #ddd;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .footer {\n"
            + "      background-color: #333;\n"
            + "      color: white;\n"
            + "      text-align: center;\n"
            + "      padding: 1rem;\n"
            + "      margin-top: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    /* Media Queries */\n"
            + "    \n"
            + "    /* Tablet */\n"
            + "    @media screen and (max-width: 768px) {\n"
            + "      .main {\n"
            + "        flex-direction: column;\n"
            + "      }\n"
            + "      \n"
            + "      .nav {\n"
            + "        flex-direction: column;\n"
            + "        align-items: center;\n"
            + "        gap: 10px;\n"
            + "      }\n"
            + "      \n"
            + "      .content, .sidebar {\n"
            + "        flex: 1;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    /* Điện thoại */\n"
            + "    @media screen and (max-width: 480px) {\n"
            + "      body {\n"
            + "        padding: 10px;\n"
            + "      }\n"
            + "      \n"
            + "      .header h1 {\n"
            + "        font-size: 1.5rem;\n"
            + "      }\n"
            + "      \n"
            + "      .content, .sidebar {\n"
            + "        padding: 15px;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    /* In ấn */\n"
            + "    @media print {\n"
            + "      .nav, .footer {\n"
            + "        display: none;\n"
            + "      }\n"
            + "      \n"
            + "      body {\n"
            + "        padding: 0;\n"
            + "        font-size: 12pt;\n"
            + "        color: black;\n"
            + "      }\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"header\">\n"
            + "    <h1>Trang Web Responsive</h1>\n"
            + "  </div>\n"
            + "  \n"
            + "  <nav class=\"nav\">\n"
            + "    <a href=\"#\">Trang chủ</a>\n"
            + "    <a href=\"#\">Giới thiệu</a>\n"
            + "    <a href=\"#\">Dịch vụ</a>\n"
            + "    <a href=\"#\">Liên hệ</a>\n"
            + "  </nav>\n"
            + "  \n"
            + "  <div class=\"main\">\n"
            + "    <article class=\"content\">\n"
            + "      <h2>Nội dung chính</h2>\n"
            + "      <p>Đây là nội dung chính của trang web. Nội dung này sẽ thay đổi cách hiển thị tùy theo kích thước màn hình.</p>\n"
            + "    </article>\n"
            + "    \n"
            + "    <aside class=\"sidebar\">\n"
            + "      <h3>Sidebar</h3>\n"
            + "      <p>Thông tin phụ, có thể ẩn đi hoặc thay đổi vị trí trên màn hình nhỏ.</p>\n"
            + "    </aside>\n"
            + "  </div>\n"
            + "  \n"
            + "  <footer class=\"footer\">\n"
            + "    <p>Bản quyền © 2023</p>\n"
            + "  </footer>\n"
            + "</body>\n"
            + "</html>",
            "<link rel=\"stylesheet\" media=\"screen and (max-width: 600px)\" href=\"mobile.css\">\n"
            + "<link rel=\"stylesheet\" media=\"screen and (min-width: 601px) and (max-width: 1200px)\" href=\"tablet.css\">\n"
            + "<link rel=\"stylesheet\" media=\"screen and (min-width: 1201px)\" href=\"desktop.css\">",
            "/* Áp dụng khi màn hình có chiều rộng từ 600px đến 900px HOẶC khi in */\n"
            + "@media screen and (min-width: 600px) and (max-width: 900px), print {\n"
            + "  /* CSS rules */\n"
            + "}\n"
            + "\n"
            + "/* Áp dụng cho tất cả thiết bị KHÔNG PHẢI màn hình */\n"
            + "@media not screen {\n"
            + "  /* CSS rules */\n"
            + "}",
            "@media \n"
            + "only screen and (-webkit-min-device-pixel-ratio: 2),\n"
            + "only screen and (min-resolution: 192dpi) {\n"
            + "  /* CSS cho màn hình retina */\n"
            + "  .logo {\n"
            + "    background-image: url('logo@2x.png');\n"
            + "    background-size: contain;\n"
            + "  }\n"
            + "}"
        });

        Code_MAP.put("Tại Sao Media Queries Quan Trọng?", new String[]{});

        Code_MAP.put("Mobile-first", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Mobile-First Example</title>\n"
            + "    <style>\n"
            + "        /* Base styles - Mobile first */\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "            line-height: 1.6;\n"
            + "        }\n"
            + "        \n"
            + "        .container {\n"
            + "            width: 100%;\n"
            + "            padding: 15px;\n"
            + "            box-sizing: border-box;\n"
            + "        }\n"
            + "        \n"
            + "        /* Tablet styles */\n"
            + "        @media (min-width: 600px) {\n"
            + "            .container {\n"
            + "                padding: 20px;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Desktop styles */\n"
            + "        @media (min-width: 900px) {\n"
            + "            .container {\n"
            + "                max-width: 1200px;\n"
            + "                margin: 0 auto;\n"
            + "                padding: 30px;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <h1>Chào mừng đến với Mobile-First Design</h1>\n"
            + "        <p>Đây là một ví dụ về cách tiếp cận mobile-first trong thiết kế web.</p>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>",
            "/* Mobile first - styles for all devices */\n"
            + "/* ... */\n"
            + "\n"
            + "/* Small tablets (portrait) */\n"
            + "@media (min-width: 600px) {\n"
            + "    /* Styles for screens 600px and up */\n"
            + "}\n"
            + "\n"
            + "/* Tablets (landscape) and small laptops */\n"
            + "@media (min-width: 768px) {\n"
            + "    /* Styles for screens 768px and up */\n"
            + "}\n"
            + "\n"
            + "/* Laptops and desktops */\n"
            + "@media (min-width: 992px) {\n"
            + "    /* Styles for screens 992px and up */\n"
            + "}\n"
            + "\n"
            + "/* Large desktops */\n"
            + "@media (min-width: 1200px) {\n"
            + "    /* Styles for screens 1200px and up */\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Mobile-First Layout</title>\n"
            + "    <style>\n"
            + "        /* Reset và base styles */\n"
            + "        * {\n"
            + "            box-sizing: border-box;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        \n"
            + "        body {\n"
            + "            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n"
            + "            line-height: 1.6;\n"
            + "            color: #333;\n"
            + "        }\n"
            + "        \n"
            + "        /* Header */\n"
            + "        header {\n"
            + "            background-color: #2c3e50;\n"
            + "            color: white;\n"
            + "            padding: 1rem;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "        \n"
            + "        /* Navigation - Mobile */\n"
            + "        nav ul {\n"
            + "            list-style: none;\n"
            + "            background-color: #34495e;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "        \n"
            + "        nav li {\n"
            + "            padding: 0.5rem;\n"
            + "            border-bottom: 1px solid #2c3e50;\n"
            + "        }\n"
            + "        \n"
            + "        nav a {\n"
            + "            color: white;\n"
            + "            text-decoration: none;\n"
            + "            display: block;\n"
            + "        }\n"
            + "        \n"
            + "        /* Main content */\n"
            + "        .main-content {\n"
            + "            padding: 1rem;\n"
            + "        }\n"
            + "        \n"
            + "        .card {\n"
            + "            background: #f9f9f9;\n"
            + "            border: 1px solid #ddd;\n"
            + "            border-radius: 5px;\n"
            + "            padding: 1rem;\n"
            + "            margin-bottom: 1rem;\n"
            + "        }\n"
            + "        \n"
            + "        /* Footer */\n"
            + "        footer {\n"
            + "            background-color: #2c3e50;\n"
            + "            color: white;\n"
            + "            text-align: center;\n"
            + "            padding: 1rem;\n"
            + "            margin-top: 1rem;\n"
            + "        }\n"
            + "        \n"
            + "        /* Tablet styles */\n"
            + "        @media (min-width: 600px) {\n"
            + "            nav ul {\n"
            + "                display: flex;\n"
            + "                justify-content: space-around;\n"
            + "            }\n"
            + "            \n"
            + "            nav li {\n"
            + "                border-bottom: none;\n"
            + "            }\n"
            + "            \n"
            + "            .card-container {\n"
            + "                display: flex;\n"
            + "                flex-wrap: wrap;\n"
            + "                justify-content: space-between;\n"
            + "            }\n"
            + "            \n"
            + "            .card {\n"
            + "                width: 48%;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Desktop styles */\n"
            + "        @media (min-width: 900px) {\n"
            + "            .container {\n"
            + "                display: flex;\n"
            + "            }\n"
            + "            \n"
            + "            nav {\n"
            + "                width: 200px;\n"
            + "                background-color: #34495e;\n"
            + "                min-height: 100vh;\n"
            + "            }\n"
            + "            \n"
            + "            nav ul {\n"
            + "                flex-direction: column;\n"
            + "                padding: 1rem 0;\n"
            + "            }\n"
            + "            \n"
            + "            .main-content {\n"
            + "                flex: 1;\n"
            + "                padding: 2rem;\n"
            + "            }\n"
            + "            \n"
            + "            .card {\n"
            + "                width: 30%;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <header>\n"
            + "        <h1>Website của tôi</h1>\n"
            + "    </header>\n"
            + "    \n"
            + "    <div class=\"container\">\n"
            + "        <nav>\n"
            + "            <ul>\n"
            + "                <li><a href=\"#\">Trang chủ</a></li>\n"
            + "                <li><a href=\"#\">Giới thiệu</a></li>\n"
            + "                <li><a href=\"#\">Sản phẩm</a></li>\n"
            + "                <li><a href=\"#\">Dịch vụ</a></li>\n"
            + "                <li><a href=\"#\">Liên hệ</a></li>\n"
            + "            </ul>\n"
            + "        </nav>\n"
            + "        \n"
            + "        <main class=\"main-content\">\n"
            + "            <h2>Nội dung chính</h2>\n"
            + "            \n"
            + "            <div class=\"card-container\">\n"
            + "                <div class=\"card\">\n"
            + "                    <h3>Bài viết 1</h3>\n"
            + "                    <p>Nội dung bài viết 1. Đây là cách tiếp cận mobile-first trong thiết kế web.</p>\n"
            + "                </div>\n"
            + "                \n"
            + "                <div class=\"card\">\n"
            + "                    <h3>Bài viết 2</h3>\n"
            + "                    <p>Nội dung bài viết 2. Thiết kế bắt đầu từ mobile giúp tối ưu trải nghiệm người dùng.</p>\n"
            + "                </div>\n"
            + "                \n"
            + "                <div class=\"card\">\n"
            + "                    <h3>Bài viết 3</h3>\n"
            + "                    <p>Nội dung bài viết 3. Responsive design là yêu cầu cơ bản của website hiện đại.</p>\n"
            + "                </div>\n"
            + "            </div>\n"
            + "        </main>\n"
            + "    </div>\n"
            + "    \n"
            + "    <footer>\n"
            + "        <p>Bản quyền © 2023 - Website của tôi</p>\n"
            + "    </footer>\n"
            + "</body>\n"
            + "</html>",
            "<picture>\n"
            + "    <!-- Hiển thị trên màn hình lớn -->\n"
            + "    <source media=\"(min-width: 900px)\" srcset=\"large.jpg\">\n"
            + "    \n"
            + "    <!-- Hiển thị trên tablet -->\n"
            + "    <source media=\"(min-width: 600px)\" srcset=\"medium.jpg\">\n"
            + "    \n"
            + "    <!-- Ảnh mặc định cho mobile -->\n"
            + "    <img src=\"small.jpg\" alt=\"Mô tả hình ảnh\" style=\"width:100%;\">\n"
            + "</picture>"
        });

        Code_MAP.put("Desktop-first", new String[]{
            "/* Desktop styles (no media query) - default */\n"
            + "\n"
            + "/* Large desktop: 1200px and up */\n"
            + "@media (max-width: 1200px) { ... }\n"
            + "\n"
            + "/* Medium devices (desktops, 992px and down) */\n"
            + "@media (max-width: 992px) { ... }\n"
            + "\n"
            + "/* Small devices (tablets, 768px and down) */\n"
            + "@media (max-width: 768px) { ... }\n"
            + "\n"
            + "/* Extra small devices (phones, 576px and down) */\n"
            + "@media (max-width: 576px) { ... }",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Desktop-First Example</title>\n"
            + "    <style>\n"
            + "        /* Reset và base styles */\n"
            + "        * {\n"
            + "            box-sizing: border-box;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        \n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            line-height: 1.6;\n"
            + "            color: #333;\n"
            + "        }\n"
            + "        \n"
            + "        /* Desktop styles - default */\n"
            + "        .container {\n"
            + "            width: 1200px;\n"
            + "            margin: 0 auto;\n"
            + "            padding: 20px;\n"
            + "        }\n"
            + "        \n"
            + "        header {\n"
            + "            background: #35424a;\n"
            + "            color: #ffffff;\n"
            + "            padding: 20px 0;\n"
            + "            margin-bottom: 20px;\n"
            + "        }\n"
            + "        \n"
            + "        nav ul {\n"
            + "            display: flex;\n"
            + "            justify-content: space-between;\n"
            + "            list-style: none;\n"
            + "        }\n"
            + "        \n"
            + "        nav a {\n"
            + "            color: #ffffff;\n"
            + "            text-decoration: none;\n"
            + "            padding: 10px 15px;\n"
            + "            font-size: 18px;\n"
            + "        }\n"
            + "        \n"
            + "        .main-content {\n"
            + "            display: flex;\n"
            + "            margin-bottom: 20px;\n"
            + "        }\n"
            + "        \n"
            + "        .content {\n"
            + "            flex: 3;\n"
            + "            padding: 20px;\n"
            + "            background: #f4f4f4;\n"
            + "            margin-right: 20px;\n"
            + "        }\n"
            + "        \n"
            + "        .sidebar {\n"
            + "            flex: 1;\n"
            + "            padding: 20px;\n"
            + "            background: #e2e2e2;\n"
            + "        }\n"
            + "        \n"
            + "        footer {\n"
            + "            background: #35424a;\n"
            + "            color: #ffffff;\n"
            + "            text-align: center;\n"
            + "            padding: 20px;\n"
            + "        }\n"
            + "        \n"
            + "        /* Large desktop: 1200px and down */\n"
            + "        @media (max-width: 1200px) {\n"
            + "            .container {\n"
            + "                width: 100%;\n"
            + "                padding: 15px;\n"
            + "            }\n"
            + "            \n"
            + "            .content {\n"
            + "                margin-right: 15px;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Medium devices (desktops, 992px and down) */\n"
            + "        @media (max-width: 992px) {\n"
            + "            nav ul {\n"
            + "                flex-wrap: wrap;\n"
            + "                justify-content: center;\n"
            + "            }\n"
            + "            \n"
            + "            nav li {\n"
            + "                margin: 5px 10px;\n"
            + "            }\n"
            + "            \n"
            + "            .main-content {\n"
            + "                flex-direction: column;\n"
            + "            }\n"
            + "            \n"
            + "            .content {\n"
            + "                margin-right: 0;\n"
            + "                margin-bottom: 20px;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Small devices (tablets, 768px and down) */\n"
            + "        @media (max-width: 768px) {\n"
            + "            header {\n"
            + "                padding: 15px 0;\n"
            + "            }\n"
            + "            \n"
            + "            nav a {\n"
            + "                font-size: 16px;\n"
            + "                padding: 8px 10px;\n"
            + "            }\n"
            + "            \n"
            + "            .content, .sidebar {\n"
            + "                padding: 15px;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Extra small devices (phones, 576px and down) */\n"
            + "        @media (max-width: 576px) {\n"
            + "            nav ul {\n"
            + "                flex-direction: column;\n"
            + "                align-items: center;\n"
            + "            }\n"
            + "            \n"
            + "            nav li {\n"
            + "                margin: 5px 0;\n"
            + "            }\n"
            + "            \n"
            + "            .container {\n"
            + "                padding: 10px;\n"
            + "            }\n"
            + "            \n"
            + "            .content, .sidebar {\n"
            + "                padding: 10px;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <header>\n"
            + "        <div class=\"container\">\n"
            + "            <nav>\n"
            + "                <ul>\n"
            + "                    <li><a href=\"#\">Trang chủ</a></li>\n"
            + "                    <li><a href=\"#\">Giới thiệu</a></li>\n"
            + "                    <li><a href=\"#\">Dịch vụ</a></li>\n"
            + "                    <li><a href=\"#\">Sản phẩm</a></li>\n"
            + "                    <li><a href=\"#\">Liên hệ</a></li>\n"
            + "                </ul>\n"
            + "            </nav>\n"
            + "        </div>\n"
            + "    </header>\n"
            + "    \n"
            + "    <div class=\"container\">\n"
            + "        <div class=\"main-content\">\n"
            + "            <div class=\"content\">\n"
            + "                <h1>Chào mừng đến với website của chúng tôi</h1>\n"
            + "                <p>Đây là nội dung chính của trang web. Trên desktop, nội dung này sẽ hiển thị bên cạnh sidebar. Khi màn hình nhỏ hơn, layout sẽ thay đổi để phù hợp với thiết bị.</p>\n"
            + "                <p>Desktop-first nghĩa là chúng ta bắt đầu với thiết kế cho desktop trước, sau đó sử dụng media queries với max-width để điều chỉnh cho các kích thước màn hình nhỏ hơn.</p>\n"
            + "            </div>\n"
            + "            <div class=\"sidebar\">\n"
            + "                <h3>Sidebar</h3>\n"
            + "                <p>Đây là nội dung sidebar. Trên mobile, nó sẽ hiển thị bên dưới nội dung chính.</p>\n"
            + "                <ul>\n"
            + "                    <li>Mục 1</li>\n"
            + "                    <li>Mục 2</li>\n"
            + "                    <li>Mục 3</li>\n"
            + "                </ul>\n"
            + "            </div>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <footer>\n"
            + "        <div class=\"container\">\n"
            + "            <p>&copy; 2023 Công ty ABC. All rights reserved.</p>\n"
            + "        </div>\n"
            + "    </footer>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("So Sánh Mobile-first và Desktop-first", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Mobile-First Example</title>\n"
            + "    <style>\n"
            + "        /* Base styles - for mobile */\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            margin: 0;\n"
            + "            padding: 10px;\n"
            + "            background-color: #f5f5f5;\n"
            + "        }\n"
            + "        \n"
            + "        .container {\n"
            + "            width: 100%;\n"
            + "            padding: 10px;\n"
            + "            box-sizing: border-box;\n"
            + "        }\n"
            + "        \n"
            + "        .box {\n"
            + "            background-color: #4CAF50;\n"
            + "            color: white;\n"
            + "            padding: 20px;\n"
            + "            margin-bottom: 10px;\n"
            + "            border-radius: 5px;\n"
            + "        }\n"
            + "        \n"
            + "        /* Tablet - min-width 600px */\n"
            + "        @media (min-width: 600px) {\n"
            + "            .container {\n"
            + "                display: flex;\n"
            + "                flex-wrap: wrap;\n"
            + "                justify-content: space-between;\n"
            + "            }\n"
            + "            \n"
            + "            .box {\n"
            + "                width: 48%;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Desktop - min-width 900px */\n"
            + "        @media (min-width: 900px) {\n"
            + "            .container {\n"
            + "                max-width: 1200px;\n"
            + "                margin: 0 auto;\n"
            + "            }\n"
            + "            \n"
            + "            .box {\n"
            + "                width: 30%;\n"
            + "            }\n"
            + "            \n"
            + "            body {\n"
            + "                padding: 20px;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <div class=\"box\">Box 1 - Mobile First</div>\n"
            + "        <div class=\"box\">Box 2 - Mobile First</div>\n"
            + "        <div class=\"box\">Box 3 - Mobile First</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Desktop-First Example</title>\n"
            + "    <style>\n"
            + "        /* Base styles - for desktop */\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            margin: 0;\n"
            + "            padding: 20px;\n"
            + "            background-color: #f5f5f5;\n"
            + "        }\n"
            + "        \n"
            + "        .container {\n"
            + "            max-width: 1200px;\n"
            + "            margin: 0 auto;\n"
            + "            display: flex;\n"
            + "            justify-content: space-between;\n"
            + "        }\n"
            + "        \n"
            + "        .box {\n"
            + "            background-color: #2196F3;\n"
            + "            color: white;\n"
            + "            padding: 20px;\n"
            + "            width: 30%;\n"
            + "            border-radius: 5px;\n"
            + "        }\n"
            + "        \n"
            + "        /* Tablet - max-width 900px */\n"
            + "        @media (max-width: 900px) {\n"
            + "            .container {\n"
            + "                flex-wrap: wrap;\n"
            + "            }\n"
            + "            \n"
            + "            .box {\n"
            + "                width: 48%;\n"
            + "                margin-bottom: 10px;\n"
            + "            }\n"
            + "        }\n"
            + "        \n"
            + "        /* Mobile - max-width 600px */\n"
            + "        @media (max-width: 600px) {\n"
            + "            .container {\n"
            + "                display: block;\n"
            + "            }\n"
            + "            \n"
            + "            .box {\n"
            + "                width: 100%;\n"
            + "                margin-bottom: 10px;\n"
            + "            }\n"
            + "            \n"
            + "            body {\n"
            + "                padding: 10px;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <div class=\"box\">Box 1 - Desktop First</div>\n"
            + "        <div class=\"box\">Box 2 - Desktop First</div>\n"
            + "        <div class=\"box\">Box 3 - Desktop First</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("CSS Container Queries", new String[]{
            "<div class=\"card-container\">\n"
            + "  <div class=\"card\">\n"
            + "    <img src=\"image.jpg\" alt=\"Sample image\">\n"
            + "    <h3>Card Title</h3>\n"
            + "    <p>This is a sample card that will change layout based on its container size.</p>\n"
            + "  </div>\n"
            + "</div>",
            ".card-container {\n"
            + "  container-type: inline-size;\n"
            + "  /* Hoặc có thể dùng: \n"
            + "     container-type: size; (cả chiều rộng và chiều cao)\n"
            + "     container-type: inline-size; (chỉ chiều rộng)\n"
            + "  */\n"
            + "  container-name: card-container;\n"
            + "  /* Tên container để tham chiếu sau này */\n"
            + "}",
            "@container card-container (min-width: 400px) {\n"
            + "  .card {\n"
            + "    display: flex;\n"
            + "    gap: 1rem;\n"
            + "  }\n"
            + "  \n"
            + "  .card img {\n"
            + "    width: 150px;\n"
            + "    height: auto;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "@container card-container (min-width: 600px) {\n"
            + "  .card {\n"
            + "    flex-direction: column;\n"
            + "  }\n"
            + "  \n"
            + "  .card img {\n"
            + "    width: 100%;\n"
            + "    height: 200px;\n"
            + "    object-fit: cover;\n"
            + "  }\n"
            + "}",
            ".card {\n"
            + "  padding: calc(1cqw * 0.5); /* 0.5% chiều rộng container */\n"
            + "  margin: calc(1cqh * 0.2); /* 0.2% chiều cao container */\n"
            + "  font-size: clamp(1rem, 3cqw, 1.5rem); /* Font size responsive với container */\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>CSS Container Queries Demo</title>\n"
            + "  <style>\n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      padding: 2rem;\n"
            + "      display: grid;\n"
            + "      grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));\n"
            + "      gap: 2rem;\n"
            + "    }\n"
            + "    \n"
            + "    .product-card-container {\n"
            + "      container-type: inline-size;\n"
            + "      container-name: product-card;\n"
            + "      border: 1px solid #ddd;\n"
            + "      border-radius: 8px;\n"
            + "      overflow: hidden;\n"
            + "      background: white;\n"
            + "    }\n"
            + "    \n"
            + "    .product-card {\n"
            + "      padding: 1rem;\n"
            + "    }\n"
            + "    \n"
            + "    .product-card img {\n"
            + "      width: 100%;\n"
            + "      height: auto;\n"
            + "      display: block;\n"
            + "    }\n"
            + "    \n"
            + "    .product-card h3 {\n"
            + "      margin-top: 0.5rem;\n"
            + "      margin-bottom: 0.5rem;\n"
            + "    }\n"
            + "    \n"
            + "    .product-card .price {\n"
            + "      font-weight: bold;\n"
            + "      color: #e63946;\n"
            + "      font-size: 1.2rem;\n"
            + "    }\n"
            + "    \n"
            + "    /* Styles khi container rộng ít nhất 350px */\n"
            + "    @container product-card (min-width: 350px) {\n"
            + "      .product-card {\n"
            + "        display: grid;\n"
            + "        grid-template-columns: 120px 1fr;\n"
            + "        gap: 1rem;\n"
            + "      }\n"
            + "      \n"
            + "      .product-card img {\n"
            + "        height: 120px;\n"
            + "        object-fit: cover;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    /* Styles khi container rộng ít nhất 500px */\n"
            + "    @container product-card (min-width: 500px) {\n"
            + "      .product-card {\n"
            + "        display: block;\n"
            + "      }\n"
            + "      \n"
            + "      .product-card img {\n"
            + "        height: 200px;\n"
            + "      }\n"
            + "      \n"
            + "      .product-card .actions {\n"
            + "        display: flex;\n"
            + "        gap: 1rem;\n"
            + "        margin-top: 1rem;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    .btn {\n"
            + "      padding: 0.5rem 1rem;\n"
            + "      border: none;\n"
            + "      border-radius: 4px;\n"
            + "      cursor: pointer;\n"
            + "    }\n"
            + "    \n"
            + "    .btn-primary {\n"
            + "      background-color: #007bff;\n"
            + "      color: white;\n"
            + "    }\n"
            + "    \n"
            + "    .btn-secondary {\n"
            + "      background-color: #6c757d;\n"
            + "      color: white;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"product-card-container\" style=\"width: 300px\">\n"
            + "    <div class=\"product-card\">\n"
            + "      <img src=\"https://via.placeholder.com/300\" alt=\"Product image\">\n"
            + "      <h3>Basic Product</h3>\n"
            + "      <p>A simple product with basic features.</p>\n"
            + "      <div class=\"price\">$19.99</div>\n"
            + "      <div class=\"actions\">\n"
            + "        <button class=\"btn btn-primary\">Add to Cart</button>\n"
            + "        <button class=\"btn btn-secondary\">Details</button>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "  \n"
            + "  <div class=\"product-card-container\" style=\"width: 400px\">\n"
            + "    <div class=\"product-card\">\n"
            + "      <img src=\"https://via.placeholder.com/300\" alt=\"Product image\">\n"
            + "      <h3>Standard Product</h3>\n"
            + "      <p>A standard product with more features than the basic version.</p>\n"
            + "      <div class=\"price\">$39.99</div>\n"
            + "      <div class=\"actions\">\n"
            + "        <button class=\"btn btn-primary\">Add to Cart</button>\n"
            + "        <button class=\"btn btn-secondary\">Details</button>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "  \n"
            + "  <div class=\"product-card-container\" style=\"width: 600px\">\n"
            + "    <div class=\"product-card\">\n"
            + "      <img src=\"https://via.placeholder.com/300\" alt=\"Product image\">\n"
            + "      <h3>Premium Product</h3>\n"
            + "      <p>The premium version with all features included and premium support.</p>\n"
            + "      <div class=\"price\">$79.99</div>\n"
            + "      <div class=\"actions\">\n"
            + "        <button class=\"btn btn-primary\">Add to Cart</button>\n"
            + "        <button class=\"btn btn-secondary\">Details</button>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>",
            ".widget-container {\n"
            + "  container-type: inline-size;\n"
            + "  container-name: widget;\n"
            + "}\n"
            + "\n"
            + "@container widget (min-width: 300px) {\n"
            + "  .widget {\n"
            + "    display: flex;\n"
            + "    align-items: center;\n"
            + "  }\n"
            + "  \n"
            + "  .widget img {\n"
            + "    margin-right: 1rem;\n"
            + "  }\n"
            + "}",
            ".form-group-container {\n"
            + "  container-type: inline-size;\n"
            + "}\n"
            + "\n"
            + "@container (min-width: 400px) {\n"
            + "  .form-group {\n"
            + "    display: grid;\n"
            + "    grid-template-columns: 1fr 2fr;\n"
            + "    gap: 1rem;\n"
            + "  }\n"
            + "  \n"
            + "  .form-group label {\n"
            + "    text-align: right;\n"
            + "    padding-top: 0.5rem;\n"
            + "  }\n"
            + "}",
            "@media (min-width: 768px) {\n"
            + "  .container {\n"
            + "    width: 50%;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "@container (min-width: 400px) {\n"
            + "  .component {\n"
            + "    /* styles */\n"
            + "  }\n"
            + "}"
        });

        Code_MAP.put("Transition", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: red;\n"
            + "  transition-property: width;\n"
            + "  transition-duration: 2s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 300px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "<p>Di chuột vào hình vuông để xem hiệu ứng</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: blue;\n"
            + "  transition-property: width, height;\n"
            + "  transition-duration: 1s, 2s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "<p>Di chuột vào hình vuông để xem hiệu ứng với thời gian khác nhau</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".container {\n"
            + "  display: flex;\n"
            + "  justify-content: space-around;\n"
            + "}\n"
            + "\n"
            + ".box {\n"
            + "  width: 50px;\n"
            + "  height: 50px;\n"
            + "  background: green;\n"
            + "  margin-bottom: 20px;\n"
            + "  transition: width 2s;\n"
            + "}\n"
            + "\n"
            + ".ease { transition-timing-function: ease; }\n"
            + ".linear { transition-timing-function: linear; }\n"
            + ".ease-in { transition-timing-function: ease-in; }\n"
            + ".ease-out { transition-timing-function: ease-out; }\n"
            + ".ease-in-out { transition-timing-function: ease-in-out; }\n"
            + "\n"
            + ".container:hover .box {\n"
            + "  width: 300px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"container\">\n"
            + "  <div class=\"box ease\">ease</div>\n"
            + "  <div class=\"box linear\">linear</div>\n"
            + "  <div class=\"box ease-in\">ease-in</div>\n"
            + "  <div class=\"box ease-out\">ease-out</div>\n"
            + "  <div class=\"box ease-in-out\">ease-in-out</div>\n"
            + "</div>\n"
            + "<p>Di chuột vào vùng container để xem các hiệu ứng timing khác nhau</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: orange;\n"
            + "  transition: width 2s, height 2s, background 2s;\n"
            + "  transition-delay: 1s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "  background: purple;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "<p>Di chuột vào hình vuông và chờ 1 giây để xem hiệu ứng</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: pink;\n"
            + "  /* property duration timing-function delay */\n"
            + "  transition: width 2s ease-in-out 0.5s, \n"
            + "              height 3s linear,\n"
            + "              background 1s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 200px;\n"
            + "  height: 150px;\n"
            + "  background: cyan;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "<p>Di chuột vào hình vuông để xem hiệu ứng kết hợp</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".multi-box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: brown;\n"
            + "  border-radius: 0;\n"
            + "  opacity: 1;\n"
            + "  transition: width 1s, \n"
            + "              height 1s, \n"
            + "              background 1s, \n"
            + "              border-radius 1s, \n"
            + "              opacity 1s;\n"
            + "}\n"
            + "\n"
            + ".multi-box:hover {\n"
            + "  width: 150px;\n"
            + "  height: 150px;\n"
            + "  background: gold;\n"
            + "  border-radius: 50%;\n"
            + "  opacity: 0.7;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"multi-box\"></div>\n"
            + "<p>Di chuột vào hình để xem hiệu ứng nhiều thuộc tính</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".transform-box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: teal;\n"
            + "  transition: transform 1s ease-in-out;\n"
            + "}\n"
            + "\n"
            + ".transform-box:hover {\n"
            + "  transform: rotate(180deg) scale(1.5);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"transform-box\"></div>\n"
            + "<p>Di chuột vào hình để xem hiệu ứng transform</p>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".button {\n"
            + "  display: inline-block;\n"
            + "  padding: 15px 30px;\n"
            + "  background: #4CAF50;\n"
            + "  color: white;\n"
            + "  text-align: center;\n"
            + "  text-decoration: none;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  font-size: 16px;\n"
            + "  cursor: pointer;\n"
            + "  transition: background 0.3s, transform 0.2s, box-shadow 0.3s;\n"
            + "}\n"
            + "\n"
            + ".button:hover {\n"
            + "  background: #45a049;\n"
            + "  transform: translateY(-3px);\n"
            + "  box-shadow: 0 5px 15px rgba(0,0,0,0.3);\n"
            + "}\n"
            + "\n"
            + ".button:active {\n"
            + "  transform: translateY(1px);\n"
            + "  box-shadow: 0 2px 5px rgba(0,0,0,0.2);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<button class=\"button\">Nút có hiệu ứng</button>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Animation", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: blue;\n"
            + "  transition: width 2s, height 2s, background 2s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "  background: red;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "@keyframes example {\n"
            + "  0%   {background-color: red; left:0px; top:0px;}\n"
            + "  25%  {background-color: yellow; left:200px; top:0px;}\n"
            + "  50%  {background-color: blue; left:200px; top:200px;}\n"
            + "  75%  {background-color: green; left:0px; top:200px;}\n"
            + "  100% {background-color: red; left:0px; top:0px;}\n"
            + "}\n"
            + "\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  position: relative;\n"
            + "  background-color: red;\n"
            + "  animation-name: example;\n"
            + "  animation-duration: 4s;\n"
            + "  animation-iteration-count: infinite;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background-color: blue;\n"
            + "  transition: transform 2s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  transform: rotate(45deg) scale(1.5) translate(50px);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"box\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "#container {\n"
            + "  width: 400px;\n"
            + "  height: 400px;\n"
            + "  position: relative;\n"
            + "  background: yellow;\n"
            + "}\n"
            + "#animate {\n"
            + "  width: 50px;\n"
            + "  height: 50px;\n"
            + "  position: absolute;\n"
            + "  background: red;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<button onclick=\"myAnimation()\">Click Me</button>\n"
            + "<div id=\"container\">\n"
            + "  <div id=\"animate\"></div>\n"
            + "</div>\n"
            + "\n"
            + "<script>\n"
            + "function myAnimation() {\n"
            + "  let elem = document.getElementById(\"animate\");   \n"
            + "  let pos = 0;\n"
            + "  let id = setInterval(frame, 5);\n"
            + "  \n"
            + "  function frame() {\n"
            + "    if (pos == 350) {\n"
            + "      clearInterval(id);\n"
            + "    } else {\n"
            + "      pos++; \n"
            + "      elem.style.top = pos + \"px\"; \n"
            + "      elem.style.left = pos + \"px\"; \n"
            + "    }\n"
            + "  }\n"
            + "}\n"
            + "</script>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"/>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1 class=\"animate__animated animate__bounce\">An animated element</h1>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/gsap/3.11.4/gsap.min.js\"></script>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div id=\"box\" style=\"width:100px; height:100px; background:blue;\"></div>\n"
            + "\n"
            + "<script>\n"
            + "gsap.to(\"#box\", {\n"
            + "  duration: 2, \n"
            + "  x: 200, \n"
            + "  rotation: 360, \n"
            + "  ease: \"bounce.out\"\n"
            + "});\n"
            + "</script>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Keyframes", new String[]{
            "@keyframes tên-hoạt-hình {\n"
            + "  từ {\n"
            + "    /* CSS properties */\n"
            + "  }\n"
            + "  đến {\n"
            + "    /* CSS properties */\n"
            + "  }\n"
            + "}",
            "@keyframes tên-hoạt-hình {\n"
            + "  0% {\n"
            + "    /* CSS properties */\n"
            + "  }\n"
            + "  50% {\n"
            + "    /* CSS properties */\n"
            + "  }\n"
            + "  100% {\n"
            + "    /* CSS properties */\n"
            + "  }\n"
            + "}",
            ".phần-tử {\n"
            + "  animation: tên-hoạt-hình thời-gian timing-function delay iteration-count direction fill-mode;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "@keyframes fadeIn {\n"
            + "  from {\n"
            + "    opacity: 0;\n"
            + "  }\n"
            + "  to {\n"
            + "    opacity: 1;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background-color: red;\n"
            + "  animation: fadeIn 2s ease-in;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"box\"></div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "@keyframes moveAndRotate {\n"
            + "  0% {\n"
            + "    transform: translateX(0) rotate(0deg);\n"
            + "    background-color: red;\n"
            + "  }\n"
            + "  50% {\n"
            + "    transform: translateX(200px) rotate(180deg);\n"
            + "    background-color: blue;\n"
            + "  }\n"
            + "  100% {\n"
            + "    transform: translateX(400px) rotate(360deg);\n"
            + "    background-color: green;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".ball {\n"
            + "  width: 50px;\n"
            + "  height: 50px;\n"
            + "  border-radius: 50%;\n"
            + "  background-color: red;\n"
            + "  animation: moveAndRotate 3s ease-in-out infinite alternate;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"ball\"></div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "@keyframes complexAnimation {\n"
            + "  0% {\n"
            + "    transform: scale(1) translateY(0);\n"
            + "    background-color: #ff0000;\n"
            + "  }\n"
            + "  25% {\n"
            + "    transform: scale(1.2) translateY(-50px);\n"
            + "    background-color: #ffff00;\n"
            + "  }\n"
            + "  50% {\n"
            + "    transform: scale(1) translateY(0);\n"
            + "    background-color: #00ff00;\n"
            + "  }\n"
            + "  75% {\n"
            + "    transform: scale(0.8) translateY(30px);\n"
            + "    background-color: #0000ff;\n"
            + "  }\n"
            + "  100% {\n"
            + "    transform: scale(1) translateY(0);\n"
            + "    background-color: #ff00ff;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".element {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  margin: 50px auto;\n"
            + "  animation: complexAnimation 4s ease-in-out infinite;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"element\"></div>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "@keyframes slideBounce {\n"
            + "  0% {\n"
            + "    transform: translateX(-100px);\n"
            + "  }\n"
            + "  70% {\n"
            + "    transform: translateX(20px);\n"
            + "  }\n"
            + "  100% {\n"
            + "    transform: translateX(0);\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  width: 200px;\n"
            + "  height: 150px;\n"
            + "  background: linear-gradient(45deg, #ff9a9e, #fad0c4);\n"
            + "  border-radius: 10px;\n"
            + "  padding: 20px;\n"
            + "  box-shadow: 0 4px 8px rgba(0,0,0,0.1);\n"
            + "  \n"
            + "  /* Áp dụng nhiều thuộc tính animation riêng biệt */\n"
            + "  animation-name: slideBounce;\n"
            + "  animation-duration: 1s;\n"
            + "  animation-timing-function: cubic-bezier(0.175, 0.885, 0.32, 1.275);\n"
            + "  animation-delay: 0.5s;\n"
            + "  animation-iteration-count: 1;\n"
            + "  animation-fill-mode: both;\n"
            + "}\n"
            + "\n"
            + "h2 {\n"
            + "  color: white;\n"
            + "  text-shadow: 1px 1px 2px rgba(0,0,0,0.3);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"card\">\n"
            + "  <h2>Animated Card</h2>\n"
            + "  <p>This card slides in with a bounce effect.</p>\n"
            + "</div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Hover effect nâng cao", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".color-transition {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #3498db;\n"
            + "  transition: background-color 0.5s ease;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  color: white;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".color-transition:hover {\n"
            + "  background-color: #e74c3c;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"color-transition\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".scale-effect {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #2ecc71;\n"
            + "  transition: transform 0.3s ease;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  color: white;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".scale-effect:hover {\n"
            + "  transform: scale(1.1);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"scale-effect\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".rotate-effect {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #9b59b6;\n"
            + "  transition: transform 0.5s ease;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  color: white;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".rotate-effect:hover {\n"
            + "  transform: rotate(10deg);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"rotate-effect\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".shadow-effect {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #f1c40f;\n"
            + "  transition: box-shadow 0.3s ease;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  color: #333;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".shadow-effect:hover {\n"
            + "  box-shadow: 0 10px 20px rgba(0,0,0,0.2);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"shadow-effect\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".text-effect {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #1abc9c;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  color: white;\n"
            + "  font-family: Arial;\n"
            + "  position: relative;\n"
            + "  overflow: hidden;\n"
            + "}\n"
            + "\n"
            + ".text-effect::before {\n"
            + "  content: \"Hiệu ứng chữ\";\n"
            + "  position: absolute;\n"
            + "  top: 0;\n"
            + "  left: 0;\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "  background-color: #16a085;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  transform: translateY(-100%);\n"
            + "  transition: transform 0.5s ease;\n"
            + "}\n"
            + "\n"
            + ".text-effect:hover::before {\n"
            + "  transform: translateY(0);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"text-effect\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".combined-effect {\n"
            + "  width: 200px;\n"
            + "  height: 100px;\n"
            + "  background-color: #e67e22;\n"
            + "  color: white;\n"
            + "  font-family: Arial;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  transition: all 0.4s ease;\n"
            + "  border-radius: 5px;\n"
            + "  box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n"
            + "}\n"
            + "\n"
            + ".combined-effect:hover {\n"
            + "  background-color: #d35400;\n"
            + "  transform: translateY(-5px) rotate(2deg);\n"
            + "  box-shadow: 0 10px 20px rgba(0,0,0,0.2);\n"
            + "  letter-spacing: 1px;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"combined-effect\">Di chuột vào đây</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".image-container {\n"
            + "  width: 300px;\n"
            + "  height: 200px;\n"
            + "  overflow: hidden;\n"
            + "  position: relative;\n"
            + "}\n"
            + "\n"
            + ".image-effect {\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "  background-image: url('https://via.placeholder.com/300x200');\n"
            + "  background-size: cover;\n"
            + "  transition: transform 0.5s ease;\n"
            + "}\n"
            + "\n"
            + ".image-container:hover .image-effect {\n"
            + "  transform: scale(1.2);\n"
            + "}\n"
            + "\n"
            + ".image-overlay {\n"
            + "  position: absolute;\n"
            + "  top: 0;\n"
            + "  left: 0;\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "  background-color: rgba(0,0,0,0.5);\n"
            + "  color: white;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  opacity: 0;\n"
            + "  transition: opacity 0.5s ease;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".image-container:hover .image-overlay {\n"
            + "  opacity: 1;\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"image-container\">\n"
            + "  <div class=\"image-effect\"></div>\n"
            + "  <div class=\"image-overlay\">Hình ảnh đẹp</div>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".flip-container {\n"
            + "  width: 300px;\n"
            + "  height: 200px;\n"
            + "  perspective: 1000px;\n"
            + "}\n"
            + "\n"
            + ".flip-effect {\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "  position: relative;\n"
            + "  transform-style: preserve-3d;\n"
            + "  transition: transform 0.8s;\n"
            + "}\n"
            + "\n"
            + ".flip-container:hover .flip-effect {\n"
            + "  transform: rotateY(180deg);\n"
            + "}\n"
            + "\n"
            + ".flip-front, .flip-back {\n"
            + "  position: absolute;\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "  backface-visibility: hidden;\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  font-family: Arial;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + ".flip-front {\n"
            + "  background-color: #3498db;\n"
            + "}\n"
            + "\n"
            + ".flip-back {\n"
            + "  background-color: #e74c3c;\n"
            + "  transform: rotateY(180deg);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"flip-container\">\n"
            + "  <div class=\"flip-effect\">\n"
            + "    <div class=\"flip-front\">Mặt trước</div>\n"
            + "    <div class=\"flip-back\">Mặt sau</div>\n"
            + "  </div>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".advanced-button {\n"
            + "  padding: 15px 30px;\n"
            + "  background-color: #27ae60;\n"
            + "  color: white;\n"
            + "  border: none;\n"
            + "  border-radius: 50px;\n"
            + "  font-family: Arial;\n"
            + "  font-size: 16px;\n"
            + "  cursor: pointer;\n"
            + "  position: relative;\n"
            + "  overflow: hidden;\n"
            + "  transition: all 0.3s;\n"
            + "  box-shadow: 0 4px 6px rgba(0,0,0,0.1);\n"
            + "}\n"
            + "\n"
            + ".advanced-button:hover {\n"
            + "  background-color: #2ecc71;\n"
            + "  box-shadow: 0 6px 8px rgba(0,0,0,0.15);\n"
            + "  transform: translateY(-2px);\n"
            + "}\n"
            + "\n"
            + ".advanced-button::after {\n"
            + "  content: \"\";\n"
            + "  position: absolute;\n"
            + "  top: 50%;\n"
            + "  left: 50%;\n"
            + "  width: 5px;\n"
            + "  height: 5px;\n"
            + "  background: rgba(255, 255, 255, 0.5);\n"
            + "  opacity: 0;\n"
            + "  border-radius: 100%;\n"
            + "  transform: scale(1, 1) translate(-50%);\n"
            + "  transform-origin: 50% 50%;\n"
            + "}\n"
            + "\n"
            + ".advanced-button:focus:not(:active)::after {\n"
            + "  animation: ripple 1s ease-out;\n"
            + "}\n"
            + "\n"
            + "@keyframes ripple {\n"
            + "  0% {\n"
            + "    transform: scale(0, 0);\n"
            + "    opacity: 0.5;\n"
            + "  }\n"
            + "  100% {\n"
            + "    transform: scale(20, 20);\n"
            + "    opacity: 0;\n"
            + "  }\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<button class=\"advanced-button\">Nút bấm</button>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".dropdown {\n"
            + "  position: relative;\n"
            + "  display: inline-block;\n"
            + "}\n"
            + "\n"
            + ".dropbtn {\n"
            + "  background-color: #34495e;\n"
            + "  color: white;\n"
            + "  padding: 12px 24px;\n"
            + "  font-size: 16px;\n"
            + "  border: none;\n"
            + "  cursor: pointer;\n"
            + "  transition: all 0.3s;\n"
            + "  border-radius: 4px;\n"
            + "}\n"
            + "\n"
            + ".dropbtn:hover {\n"
            + "  background-color: #2c3e50;\n"
            + "}\n"
            + "\n"
            + ".dropdown-content {\n"
            + "  display: none;\n"
            + "  position: absolute;\n"
            + "  background-color: #f9f9f9;\n"
            + "  min-width: 160px;\n"
            + "  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n"
            + "  z-index: 1;\n"
            + "  opacity: 0;\n"
            + "  transform: translateY(-10px);\n"
            + "  transition: all 0.3s ease;\n"
            + "  border-radius: 4px;\n"
            + "}\n"
            + "\n"
            + ".dropdown-content a {\n"
            + "  color: #333;\n"
            + "  padding: 12px 16px;\n"
            + "  text-decoration: none;\n"
            + "  display: block;\n"
            + "  transition: background-color 0.2s;\n"
            + "}\n"
            + "\n"
            + ".dropdown-content a:hover {\n"
            + "  background-color: #ddd;\n"
            + "}\n"
            + "\n"
            + ".dropdown:hover .dropdown-content {\n"
            + "  display: block;\n"
            + "  opacity: 1;\n"
            + "  transform: translateY(0);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"dropdown\">\n"
            + "  <button class=\"dropbtn\">Menu Dropdown</button>\n"
            + "  <div class=\"dropdown-content\">\n"
            + "    <a href=\"#\">Mục 1</a>\n"
            + "    <a href=\"#\">Mục 2</a>\n"
            + "    <a href=\"#\">Mục 3</a>\n"
            + "  </div>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + ".card {\n"
            + "  width: 300px;\n"
            + "  height: 400px;\n"
            + "  background: white;\n"
            + "  border-radius: 10px;\n"
            + "  box-shadow: 0 4px 8px rgba(0,0,0,0.1);\n"
            + "  overflow: hidden;\n"
            + "  position: relative;\n"
            + "  transition: all 0.5s cubic-bezier(0.175, 0.885, 0.32, 1.275);\n"
            + "}\n"
            + "\n"
            + ".card:hover {\n"
            + "  transform: translateY(-10px);\n"
            + "  box-shadow: 0 15px 30px rgba(0,0,0,0.2);\n"
            + "}\n"
            + "\n"
            + ".card-image {\n"
            + "  width: 100%;\n"
            + "  height: 60%;\n"
            + "  background-image: url('https://via.placeholder.com/300x240');\n"
            + "  background-size: cover;\n"
            + "  transition: all 0.5s;\n"
            + "}\n"
            + "\n"
            + ".card:hover .card-image {\n"
            + "  height: 50%;\n"
            + "}\n"
            + "\n"
            + ".card-content {\n"
            + "  padding: 20px;\n"
            + "  position: relative;\n"
            + "}\n"
            + "\n"
            + ".card-title {\n"
            + "  font-size: 20px;\n"
            + "  font-weight: bold;\n"
            + "  margin-bottom: 10px;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".card-description {\n"
            + "  color: #666;\n"
            + "  font-size: 14px;\n"
            + "  margin-bottom: 15px;\n"
            + "  font-family: Arial;\n"
            + "}\n"
            + "\n"
            + ".card-button {\n"
            + "  background-color: #3498db;\n"
            + "  color: white;\n"
            + "  padding: 8px 16px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  transition: background-color 0.3s;\n"
            + "}\n"
            + "\n"
            + ".card-button:hover {\n"
            + "  background-color: #2980b9;\n"
            + "}\n"
            + "\n"
            + ".card-date {\n"
            + "  position: absolute;\n"
            + "  top: -25px;\n"
            + "  right: 20px;\n"
            + "  background-color: #e74c3c;\n"
            + "  color: white;\n"
            + "  padding: 5px 10px;\n"
            + "  border-radius: 20px;\n"
            + "  font-size: 12px;\n"
            + "  box-shadow: 0 2px 5px rgba(0,0,0,0.2);\n"
            + "}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"card\">\n"
            + "  <div class=\"card-image\"></div>\n"
            + "  <div class=\"card-content\">\n"
            + "    <div class=\"card-date\">20/10/2023</div>\n"
            + "    <div class=\"card-title\">Thẻ hiệu ứng</div>\n"
            + "    <div class=\"card-description\">Đây là mô tả của thẻ với hiệu ứng hover nâng cao.</div>\n"
            + "    <button class=\"card-button\">Xem thêm</button>\n"
            + "  </div>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new String[]{
            "selector:nth-child(pattern) {\n"
            + "  /* CSS properties */\n"
            + "}",
            "<ul class=\"list\">\n"
            + "  <li>Item 1</li>\n"
            + "  <li>Item 2</li>\n"
            + "  <li>Item 3</li>\n"
            + "  <li>Item 4</li>\n"
            + "  <li>Item 5</li>\n"
            + "</ul>",
            "/* Chọn phần tử thứ 3 */\n"
            + ".list li:nth-child(3) {\n"
            + "  color: red;\n"
            + "  font-weight: bold;\n"
            + "}",
            "/* Chọn các phần tử chẵn */\n"
            + ".list li:nth-child(even) {\n"
            + "  background-color: #f2f2f2;\n"
            + "}\n"
            + "\n"
            + "/* Chọn các phần tử lẻ */\n"
            + ".list li:nth-child(odd) {\n"
            + "  background-color: #e6e6e6;\n"
            + "}",
            "/* Chọn mỗi phần tử thứ 2 (2, 4, 6,...) */\n"
            + ".list li:nth-child(2n) {\n"
            + "  border-left: 3px solid blue;\n"
            + "}\n"
            + "\n"
            + "/* Chọn phần tử thứ 1 và sau đó mỗi phần tử thứ 3 (1, 4, 7,...) */\n"
            + ".list li:nth-child(3n+1) {\n"
            + "  text-decoration: underline;\n"
            + "}\n"
            + "\n"
            + "/* Chọn 3 phần tử đầu tiên */\n"
            + ".list li:nth-child(-n+3) {\n"
            + "  font-size: 1.2em;\n"
            + "}",
            "<div class=\"container\">\n"
            + "  <p>Đoạn văn 1</p>\n"
            + "  <div class=\"box\">Hộp 1</div>\n"
            + "  <p>Đoạn văn 2</p>\n"
            + "  <div class=\"box\">Hộp 2</div>\n"
            + "  <p>Đoạn văn 3</p>\n"
            + "</div>",
            "/* Chọn mỗi phần tử p thứ 2 */\n"
            + ".container p:nth-child(2n) {\n"
            + "  color: green;\n"
            + "}\n"
            + "\n"
            + "/* Chọn div.box đầu tiên */\n"
            + ".container div.box:nth-child(2) {\n"
            + "  border: 2px dashed orange;\n"
            + "}",
            "<table>\n"
            + "  <tr><th>STT</th><th>Tên</th><th>Điểm</th></tr>\n"
            + "  <tr><td>1</td><td>Nguyễn Văn A</td><td>8.5</td></tr>\n"
            + "  <tr><td>2</td><td>Trần Thị B</td><td>9.0</td></tr>\n"
            + "  <tr><td>3</td><td>Lê Văn C</td><td>7.5</td></tr>\n"
            + "  <tr><td>4</td><td>Phạm Thị D</td><td>8.0</td></tr>\n"
            + "</table>",
            "/* Kiểu cơ bản cho bảng */\n"
            + "table {\n"
            + "  width: 100%;\n"
            + "  border-collapse: collapse;\n"
            + "}\n"
            + "\n"
            + "/* Dòng chẵn */\n"
            + "tr:nth-child(even) {\n"
            + "  background-color: #f5f5f5;\n"
            + "}\n"
            + "\n"
            + "/* Dòng lẻ */\n"
            + "tr:nth-child(odd) {\n"
            + "  background-color: #fff;\n"
            + "}\n"
            + "\n"
            + "/* Dòng đầu tiên (tiêu đề) */\n"
            + "tr:nth-child(1) {\n"
            + "  background-color: #4CAF50;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + "/* Hiệu ứng khi di chuột qua */\n"
            + "tr:nth-child(n+2):hover {\n"
            + "  background-color: #ddd;\n"
            + "}",
            "<div class=\"gallery\">\n"
            + "  <div class=\"photo\">Ảnh 1</div>\n"
            + "  <div class=\"photo\">Ảnh 2</div>\n"
            + "  <div class=\"photo\">Ảnh 3</div>\n"
            + "  <div class=\"photo\">Ảnh 4</div>\n"
            + "  <div class=\"photo\">Ảnh 5</div>\n"
            + "  <div class=\"photo\">Ảnh 6</div>\n"
            + "  <div class=\"photo\">Ảnh 7</div>\n"
            + "  <div class=\"photo\">Ảnh 8</div>\n"
            + "</div>",
            "/* Chọn 3 ảnh đầu tiên */\n"
            + ".gallery .photo:nth-child(-n+3) {\n"
            + "  border: 3px solid gold;\n"
            + "}\n"
            + "\n"
            + "/* Chọn từ ảnh thứ 4 đến 6 */\n"
            + ".gallery .photo:nth-child(n+4):nth-child(-n+6) {\n"
            + "  opacity: 0.8;\n"
            + "  transform: scale(0.95);\n"
            + "}\n"
            + "\n"
            + "/* Chọn 2 ảnh cuối cùng */\n"
            + ".gallery .photo:nth-child(n+7) {\n"
            + "  filter: grayscale(50%);\n"
            + "}"
        });

        Code_MAP.put(":not() - Loại Trừ Một Phần Tử", new String[]{
            ":not(selector) {\n"
            + "  /* CSS properties */\n"
            + "}",
            "<div class=\"container\">\n"
            + "  <p>Đoạn văn 1</p>\n"
            + "  <p class=\"special\">Đoạn văn đặc biệt</p>\n"
            + "  <p>Đoạn văn 3</p>\n"
            + "</div>",
            "/* Áp dụng cho tất cả <p> trừ phần tử có class=\"special\" */\n"
            + ".container p:not(.special) {\n"
            + "  color: blue;\n"
            + "  font-weight: bold;\n"
            + "}\n"
            + "\n"
            + ".special {\n"
            + "  color: red;\n"
            + "  font-style: italic;\n"
            + "}",
            "<ul class=\"menu\">\n"
            + "  <li>Trang chủ</li>\n"
            + "  <li class=\"active\">Sản phẩm</li>\n"
            + "  <li>Dịch vụ</li>\n"
            + "  <li class=\"disabled\">Liên hệ</li>\n"
            + "</ul>",
            "/* Áp dụng cho tất cả <li> trừ .active và .disabled */\n"
            + ".menu li:not(.active):not(.disabled) {\n"
            + "  color: #666;\n"
            + "  cursor: pointer;\n"
            + "}\n"
            + "\n"
            + ".menu .active {\n"
            + "  color: #e74c3c;\n"
            + "  font-weight: bold;\n"
            + "}\n"
            + "\n"
            + ".menu .disabled {\n"
            + "  color: #ccc;\n"
            + "  cursor: not-allowed;\n"
            + "}",
            "<div class=\"content\">\n"
            + "  <h2>Tiêu đề</h2>\n"
            + "  <p>Đoạn văn bản thông thường</p>\n"
            + "  <a href=\"#\">Liên kết</a>\n"
            + "  <p>Đoạn văn bản khác</p>\n"
            + "  <span>Văn bản ngắn</span>\n"
            + "</div>",
            "/* Áp dụng cho tất cả phần tử con của .content trừ thẻ <a> */\n"
            + ".content > *:not(a) {\n"
            + "  margin-bottom: 15px;\n"
            + "  padding: 10px;\n"
            + "  background-color: #f9f9f9;\n"
            + "}\n"
            + "\n"
            + ".content a {\n"
            + "  color: #3498db;\n"
            + "  text-decoration: none;\n"
            + "}",
            "<ul class=\"items\">\n"
            + "  <li>Mục 1</li>\n"
            + "  <li>Mục 2</li>\n"
            + "  <li>Mục 3</li>\n"
            + "  <li>Mục 4</li>\n"
            + "  <li>Mục 5</li>\n"
            + "</ul>",
            "/* Áp dụng cho tất cả <li> trừ mục đầu tiên */\n"
            + ".items li:not(:first-child) {\n"
            + "  border-top: 1px solid #ddd;\n"
            + "  padding-top: 8px;\n"
            + "  margin-top: 8px;\n"
            + "}",
            "<input type=\"text\" placeholder=\"Nhập tên\">\n"
            + "<input type=\"email\" placeholder=\"Nhập email\">\n"
            + "<input type=\"password\" placeholder=\"Nhập mật khẩu\">\n"
            + "<input type=\"submit\" value=\"Gửi\">",
            "/* Áp dụng cho tất cả input trừ type=\"submit\" */\n"
            + "input:not([type=\"submit\"]) {\n"
            + "  width: 200px;\n"
            + "  padding: 8px;\n"
            + "  margin: 5px 0;\n"
            + "  border: 1px solid #ddd;\n"
            + "}\n"
            + "\n"
            + "input[type=\"submit\"] {\n"
            + "  background-color: #2ecc71;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  cursor: pointer;\n"
            + "}"
        });

        Code_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Focus Within Example</title>\n"
            + "    <style>\n"
            + "        .form-container {\n"
            + "            padding: 20px;\n"
            + "            border: 2px solid #ccc;\n"
            + "            border-radius: 8px;\n"
            + "            transition: all 0.3s ease;\n"
            + "            max-width: 400px;\n"
            + "            margin: 50px auto;\n"
            + "        }\n"
            + "        \n"
            + "        .form-container:focus-within {\n"
            + "            border-color: #4CAF50;\n"
            + "            box-shadow: 0 0 10px rgba(76, 175, 80, 0.5);\n"
            + "        }\n"
            + "        \n"
            + "        input {\n"
            + "            width: 100%;\n"
            + "            padding: 10px;\n"
            + "            margin: 10px 0;\n"
            + "            border: 1px solid #ddd;\n"
            + "            border-radius: 4px;\n"
            + "        }\n"
            + "        \n"
            + "        input:focus {\n"
            + "            outline: none;\n"
            + "            border-color: #4CAF50;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"form-container\">\n"
            + "        <h2>Đăng nhập</h2>\n"
            + "        <form>\n"
            + "            <input type=\"text\" placeholder=\"Tên đăng nhập\">\n"
            + "            <input type=\"password\" placeholder=\"Mật khẩu\">\n"
            + "            <button type=\"submit\">Đăng nhập</button>\n"
            + "        </form>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Input Hint with focus-within</title>\n"
            + "    <style>\n"
            + "        .input-group {\n"
            + "            margin: 20px;\n"
            + "            position: relative;\n"
            + "        }\n"
            + "        \n"
            + "        .input-hint {\n"
            + "            display: none;\n"
            + "            color: #666;\n"
            + "            font-size: 0.8em;\n"
            + "            margin-top: 5px;\n"
            + "        }\n"
            + "        \n"
            + "        .input-group:focus-within .input-hint {\n"
            + "            display: block;\n"
            + "        }\n"
            + "        \n"
            + "        input {\n"
            + "            padding: 8px;\n"
            + "            width: 250px;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"input-group\">\n"
            + "        <label for=\"username\">Tên người dùng:</label>\n"
            + "        <input type=\"text\" id=\"username\">\n"
            + "        <div class=\"input-hint\">Nhập tên người dùng từ 6-20 ký tự</div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <div class=\"input-group\">\n"
            + "        <label for=\"email\">Email:</label>\n"
            + "        <input type=\"email\" id=\"email\">\n"
            + "        <div class=\"input-hint\">Ví dụ: example@domain.com</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Navigation with focus-within</title>\n"
            + "    <style>\n"
            + "        nav {\n"
            + "            background-color: #333;\n"
            + "            padding: 10px;\n"
            + "        }\n"
            + "        \n"
            + "        .nav-menu {\n"
            + "            list-style: none;\n"
            + "            padding: 0;\n"
            + "            margin: 0;\n"
            + "            display: flex;\n"
            + "        }\n"
            + "        \n"
            + "        .nav-item {\n"
            + "            position: relative;\n"
            + "            margin-right: 15px;\n"
            + "        }\n"
            + "        \n"
            + "        .nav-item a {\n"
            + "            color: white;\n"
            + "            text-decoration: none;\n"
            + "            padding: 10px 15px;\n"
            + "            display: block;\n"
            + "        }\n"
            + "        \n"
            + "        .submenu {\n"
            + "            display: none;\n"
            + "            position: absolute;\n"
            + "            top: 100%;\n"
            + "            left: 0;\n"
            + "            background-color: #444;\n"
            + "            min-width: 200px;\n"
            + "            padding: 0;\n"
            + "            list-style: none;\n"
            + "        }\n"
            + "        \n"
            + "        .nav-item:focus-within .submenu,\n"
            + "        .nav-item:hover .submenu {\n"
            + "            display: block;\n"
            + "        }\n"
            + "        \n"
            + "        .submenu a {\n"
            + "            padding: 8px 15px;\n"
            + "            border-bottom: 1px solid #555;\n"
            + "        }\n"
            + "        \n"
            + "        .submenu a:hover {\n"
            + "            background-color: #555;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <nav>\n"
            + "        <ul class=\"nav-menu\">\n"
            + "            <li class=\"nav-item\">\n"
            + "                <a href=\"#\">Trang chủ</a>\n"
            + "            </li>\n"
            + "            <li class=\"nav-item\">\n"
            + "                <a href=\"#\">Sản phẩm</a>\n"
            + "                <ul class=\"submenu\">\n"
            + "                    <li><a href=\"#\">Điện thoại</a></li>\n"
            + "                    <li><a href=\"#\">Laptop</a></li>\n"
            + "                    <li><a href=\"#\">Phụ kiện</a></li>\n"
            + "                </ul>\n"
            + "            </li>\n"
            + "            <li class=\"nav-item\">\n"
            + "                <a href=\"#\">Dịch vụ</a>\n"
            + "                <ul class=\"submenu\">\n"
            + "                    <li><a href=\"#\">Bảo hành</a></li>\n"
            + "                    <li><a href=\"#\">Sửa chữa</a></li>\n"
            + "                    <li><a href=\"#\">Tư vấn</a></li>\n"
            + "                </ul>\n"
            + "            </li>\n"
            + "            <li class=\"nav-item\">\n"
            + "                <a href=\"#\">Liên hệ</a>\n"
            + "            </li>\n"
            + "        </ul>\n"
            + "    </nav>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "selector::before {\n"
            + "  /* CSS properties */\n"
            + "  content: \"\";\n"
            + "}\n"
            + "\n"
            + "selector::after {\n"
            + "  /* CSS properties */\n"
            + "  content: \"\";\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .quote {\n"
            + "    font-size: 1.2em;\n"
            + "    font-style: italic;\n"
            + "    position: relative;\n"
            + "    padding: 20px;\n"
            + "    background-color: #f8f8f8;\n"
            + "  }\n"
            + "  \n"
            + "  .quote::before {\n"
            + "    content: \"“\";\n"
            + "    font-size: 3em;\n"
            + "    color: #ccc;\n"
            + "    position: absolute;\n"
            + "    left: 10px;\n"
            + "    top: 10px;\n"
            + "  }\n"
            + "  \n"
            + "  .quote::after {\n"
            + "    content: \"”\";\n"
            + "    font-size: 3em;\n"
            + "    color: #ccc;\n"
            + "    position: absolute;\n"
            + "    right: 10px;\n"
            + "    bottom: -20px;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<p class=\"quote\">Cuộc sống không phải là vấn đề cần giải quyết, mà là một thực tại cần trải nghiệm.</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .custom-list {\n"
            + "    list-style: none;\n"
            + "    padding-left: 0;\n"
            + "  }\n"
            + "  \n"
            + "  .custom-list li {\n"
            + "    position: relative;\n"
            + "    padding-left: 30px;\n"
            + "    margin-bottom: 10px;\n"
            + "  }\n"
            + "  \n"
            + "  .custom-list li::before {\n"
            + "    content: \"→\";\n"
            + "    color: #ff6b6b;\n"
            + "    position: absolute;\n"
            + "    left: 0;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<ul class=\"custom-list\">\n"
            + "  <li>Mục đầu tiên trong danh sách</li>\n"
            + "  <li>Mục thứ hai với nội dung dài hơn một chút</li>\n"
            + "  <li>Mục cuối cùng</li>\n"
            + "</ul>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .tooltip {\n"
            + "    position: relative;\n"
            + "    display: inline-block;\n"
            + "    border-bottom: 1px dotted black;\n"
            + "    cursor: help;\n"
            + "  }\n"
            + "  \n"
            + "  .tooltip::after {\n"
            + "    content: attr(data-tooltip);\n"
            + "    position: absolute;\n"
            + "    width: 200px;\n"
            + "    background-color: #333;\n"
            + "    color: #fff;\n"
            + "    text-align: center;\n"
            + "    border-radius: 6px;\n"
            + "    padding: 5px;\n"
            + "    z-index: 1;\n"
            + "    bottom: 125%;\n"
            + "    left: 50%;\n"
            + "    margin-left: -100px;\n"
            + "    opacity: 0;\n"
            + "    transition: opacity 0.3s;\n"
            + "  }\n"
            + "  \n"
            + "  .tooltip:hover::after {\n"
            + "    opacity: 1;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<p>Di chuột vào từ này <span class=\"tooltip\" data-tooltip=\"Đây là nội dung tooltip giải thích thêm\">tooltip</span> để xem hiệu ứng.</p>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .fancy-button {\n"
            + "    position: relative;\n"
            + "    background-color: #4CAF50;\n"
            + "    border: none;\n"
            + "    color: white;\n"
            + "    padding: 15px 32px;\n"
            + "    text-align: center;\n"
            + "    text-decoration: none;\n"
            + "    display: inline-block;\n"
            + "    font-size: 16px;\n"
            + "    margin: 4px 2px;\n"
            + "    cursor: pointer;\n"
            + "    overflow: hidden;\n"
            + "  }\n"
            + "  \n"
            + "  .fancy-button::before {\n"
            + "    content: \"\";\n"
            + "    position: absolute;\n"
            + "    top: 0;\n"
            + "    left: -100%;\n"
            + "    width: 100%;\n"
            + "    height: 100%;\n"
            + "    background: linear-gradient(90deg, transparent, rgba(255,255,255,0.4), transparent);\n"
            + "    transition: 0.5s;\n"
            + "  }\n"
            + "  \n"
            + "  .fancy-button:hover::before {\n"
            + "    left: 100%;\n"
            + "  }\n"
            + "  \n"
            + "  .fancy-button::after {\n"
            + "    content: \"→\";\n"
            + "    position: absolute;\n"
            + "    right: -20px;\n"
            + "    opacity: 0;\n"
            + "    transition: 0.3s;\n"
            + "  }\n"
            + "  \n"
            + "  .fancy-button:hover::after {\n"
            + "    right: 10px;\n"
            + "    opacity: 1;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<button class=\"fancy-button\">Hover vào tôi</button>\n"
            + "\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .speech-bubble {\n"
            + "    position: relative;\n"
            + "    background: #00aabb;\n"
            + "    border-radius: 10px;\n"
            + "    padding: 20px;\n"
            + "    color: white;\n"
            + "    width: 200px;\n"
            + "    margin: 50px auto;\n"
            + "  }\n"
            + "  \n"
            + "  .speech-bubble::after {\n"
            + "    content: \"\";\n"
            + "    position: absolute;\n"
            + "    bottom: -15px;\n"
            + "    left: 50%;\n"
            + "    margin-left: -15px;\n"
            + "    border-width: 15px 15px 0;\n"
            + "    border-style: solid;\n"
            + "    border-color: #00aabb transparent;\n"
            + "  }\n"
            + "  \n"
            + "  .star-rating {\n"
            + "    font-size: 24px;\n"
            + "    position: relative;\n"
            + "    display: inline-block;\n"
            + "  }\n"
            + "  \n"
            + "  .star-rating::before {\n"
            + "    content: \"☆☆☆☆☆\";\n"
            + "    color: #ccc;\n"
            + "  }\n"
            + "  \n"
            + "  .star-rating::after {\n"
            + "    content: \"★★★★★\";\n"
            + "    color: #f8ce0b;\n"
            + "    position: absolute;\n"
            + "    top: 0;\n"
            + "    left: 0;\n"
            + "    width: 80%;\n"
            + "    overflow: hidden;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "<div class=\"speech-bubble\">Xin chào! Tôi là một bong bóng thoại.</div>\n"
            + "\n"
            + "<div class=\"star-rating\" title=\"Đánh giá 4/5 sao\"></div>\n"
            + "\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("BEM (Block Element Modifier)", new String[]{
            "<!-- HTML -->\n"
            + "<div class=\"header\">\n"
            + "  <!-- Nội dung header -->\n"
            + "</div>",
            "/* CSS */\n"
            + ".header {\n"
            + "  background-color: #333;\n"
            + "  padding: 20px;\n"
            + "}",
            "<!-- HTML -->\n"
            + "<div class=\"header\">\n"
            + "  <div class=\"header__logo\"></div>\n"
            + "  <nav class=\"header__nav\">\n"
            + "    <a href=\"#\" class=\"header__nav-item\"></a>\n"
            + "  </nav>\n"
            + "</div>",
            "/* CSS */\n"
            + ".header__logo {\n"
            + "  width: 100px;\n"
            + "  height: 50px;\n"
            + "}\n"
            + "\n"
            + ".header__nav {\n"
            + "  display: flex;\n"
            + "  gap: 15px;\n"
            + "}\n"
            + "\n"
            + ".header__nav-item {\n"
            + "  color: white;\n"
            + "  text-decoration: none;\n"
            + "}",
            "<!-- HTML -->\n"
            + "<button class=\"button button--primary\">Primary</button>\n"
            + "<button class=\"button button--disabled\">Disabled</button>\n"
            + "\n"
            + "<div class=\"card card--highlighted\">\n"
            + "  <h3 class=\"card__title card__title--large\">Special Offer</h3>\n"
            + "</div>",
            "/* CSS */\n"
            + ".button {\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "}\n"
            + "\n"
            + ".button--primary {\n"
            + "  background-color: blue;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + ".button--disabled {\n"
            + "  opacity: 0.5;\n"
            + "  cursor: not-allowed;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  border: 1px solid #ddd;\n"
            + "  padding: 15px;\n"
            + "}\n"
            + "\n"
            + ".card--highlighted {\n"
            + "  border-color: gold;\n"
            + "  box-shadow: 0 0 10px gold;\n"
            + "}\n"
            + "\n"
            + ".card__title--large {\n"
            + "  font-size: 24px;\n"
            + "}",
            "<nav class=\"menu\">\n"
            + "  <ul class=\"menu__list\">\n"
            + "    <li class=\"menu__item menu__item--active\">\n"
            + "      <a href=\"#\" class=\"menu__link\">Home</a>\n"
            + "    </li>\n"
            + "    <li class=\"menu__item\">\n"
            + "      <a href=\"#\" class=\"menu__link menu__link--external\">About</a>\n"
            + "    </li>\n"
            + "    <li class=\"menu__item\">\n"
            + "      <a href=\"#\" class=\"menu__link\">Contact</a>\n"
            + "    </li>\n"
            + "  </ul>\n"
            + "  \n"
            + "  <button class=\"menu__toggle menu__toggle--collapsed\">\n"
            + "    <span class=\"menu__toggle-icon\"></span>\n"
            + "  </button>\n"
            + "</nav>",
            "/* Block */\n"
            + ".menu {\n"
            + "  display: flex;\n"
            + "  justify-content: space-between;\n"
            + "  background-color: #f8f8f8;\n"
            + "  padding: 15px;\n"
            + "}\n"
            + "\n"
            + "/* Elements */\n"
            + ".menu__list {\n"
            + "  display: flex;\n"
            + "  list-style: none;\n"
            + "  margin: 0;\n"
            + "  padding: 0;\n"
            + "  gap: 20px;\n"
            + "}\n"
            + "\n"
            + ".menu__item {\n"
            + "  position: relative;\n"
            + "}\n"
            + "\n"
            + ".menu__link {\n"
            + "  text-decoration: none;\n"
            + "  color: #333;\n"
            + "  padding: 5px 10px;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle {\n"
            + "  background: none;\n"
            + "  border: none;\n"
            + "  cursor: pointer;\n"
            + "  display: none;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle-icon {\n"
            + "  display: block;\n"
            + "  width: 20px;\n"
            + "  height: 2px;\n"
            + "  background-color: #333;\n"
            + "  position: relative;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle-icon::before,\n"
            + ".menu__toggle-icon::after {\n"
            + "  content: '';\n"
            + "  position: absolute;\n"
            + "  width: 20px;\n"
            + "  height: 2px;\n"
            + "  background-color: #333;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle-icon::before {\n"
            + "  top: -6px;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle-icon::after {\n"
            + "  top: 6px;\n"
            + "}\n"
            + "\n"
            + "/* Modifiers */\n"
            + ".menu__item--active .menu__link {\n"
            + "  color: #0066cc;\n"
            + "  font-weight: bold;\n"
            + "}\n"
            + "\n"
            + ".menu__link--external::after {\n"
            + "  content: '↗';\n"
            + "  margin-left: 5px;\n"
            + "  font-size: 0.8em;\n"
            + "}\n"
            + "\n"
            + ".menu__toggle--collapsed .menu__toggle-icon {\n"
            + "  transform: rotate(45deg);\n"
            + "}\n"
            + "\n"
            + ".menu__toggle--collapsed .menu__toggle-icon::before {\n"
            + "  transform: rotate(-90deg) translate(-6px, 0);\n"
            + "}\n"
            + "\n"
            + ".menu__toggle--collapsed .menu__toggle-icon::after {\n"
            + "  opacity: 0;\n"
            + "}"
        });

        Code_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "<!-- HTML -->\n"
            + "<button class=\"btn btn-primary\">Primary Button</button>\n"
            + "<button class=\"btn btn-secondary\">Secondary Button</button>",
            "/* CSS */\n"
            + "/* Structure */\n"
            + ".btn {\n"
            + "  display: inline-block;\n"
            + "  padding: 10px 20px;\n"
            + "  border-radius: 4px;\n"
            + "  text-align: center;\n"
            + "  font-size: 16px;\n"
            + "}\n"
            + "\n"
            + "/* Skin */\n"
            + ".btn-primary {\n"
            + "  background-color: #3498db;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + ".btn-secondary {\n"
            + "  background-color: #e74c3c;\n"
            + "  color: white;\n"
            + "}",
            "/* Không nên */\n"
            + ".header .nav {\n"
            + "  /* styles */\n"
            + "}\n"
            + "\n"
            + "/* Nên */\n"
            + ".nav-primary {\n"
            + "  /* styles */\n"
            + "}",
            "<header class=\"header\">\n"
            + "  <nav class=\"nav nav-primary\">...</nav>\n"
            + "</header>",
            ".nav {\n"
            + "  /* styles chung cho tất cả navigation */\n"
            + "}\n"
            + "\n"
            + ".nav-primary {\n"
            + "  /* styles riêng cho primary navigation */\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>OOCSS Example</title>\n"
            + "  <style>\n"
            + "    /* Structure */\n"
            + "    .media {\n"
            + "      display: flex;\n"
            + "      align-items: flex-start;\n"
            + "      margin-bottom: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .media-img {\n"
            + "      margin-right: 15px;\n"
            + "    }\n"
            + "    \n"
            + "    .media-body {\n"
            + "      flex: 1;\n"
            + "    }\n"
            + "    \n"
            + "    /* Skin */\n"
            + "    .media-primary {\n"
            + "      background-color: #f8f9fa;\n"
            + "      padding: 15px;\n"
            + "      border-radius: 5px;\n"
            + "    }\n"
            + "    \n"
            + "    .media-secondary {\n"
            + "      border-left: 3px solid #3498db;\n"
            + "      padding-left: 12px;\n"
            + "    }\n"
            + "    \n"
            + "    /* Typography */\n"
            + "    .text-large {\n"
            + "      font-size: 18px;\n"
            + "      font-weight: bold;\n"
            + "    }\n"
            + "    \n"
            + "    .text-muted {\n"
            + "      color: #6c757d;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"media media-primary\">\n"
            + "    <img class=\"media-img\" src=\"avatar.jpg\" alt=\"Avatar\" width=\"64\">\n"
            + "    <div class=\"media-body\">\n"
            + "      <h3 class=\"text-large\">John Doe</h3>\n"
            + "      <p class=\"text-muted\">This is an example of OOCSS with a primary media object.</p>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "  \n"
            + "  <div class=\"media media-secondary\">\n"
            + "    <img class=\"media-img\" src=\"avatar2.jpg\" alt=\"Avatar\" width=\"64\">\n"
            + "    <div class=\"media-body\">\n"
            + "      <h3 class=\"text-large\">Jane Smith</h3>\n"
            + "      <p class=\"text-muted\">This is another example with a secondary style.</p>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("SMACSS", new String[]{
            "/* Base Rules */\n"
            + "body, html {\n"
            + "  margin: 0;\n"
            + "  padding: 0;\n"
            + "  font-family: Arial, sans-serif;\n"
            + "}\n"
            + "\n"
            + "a {\n"
            + "  color: #0366d6;\n"
            + "  text-decoration: none;\n"
            + "}\n"
            + "\n"
            + "h1, h2, h3 {\n"
            + "  font-weight: normal;\n"
            + "}",
            "/* Layout Rules */\n"
            + ".l-header {\n"
            + "  display: flex;\n"
            + "  justify-content: space-between;\n"
            + "  padding: 20px;\n"
            + "}\n"
            + "\n"
            + ".l-container {\n"
            + "  max-width: 1200px;\n"
            + "  margin: 0 auto;\n"
            + "}\n"
            + "\n"
            + ".l-grid {\n"
            + "  display: grid;\n"
            + "  grid-template-columns: repeat(3, 1fr);\n"
            + "  gap: 20px;\n"
            + "}",
            "/* Module Rules */\n"
            + ".btn {\n"
            + "  display: inline-block;\n"
            + "  padding: 8px 16px;\n"
            + "  border-radius: 4px;\n"
            + "  border: none;\n"
            + "}\n"
            + "\n"
            + ".btn-primary {\n"
            + "  background-color: #0366d6;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  border: 1px solid #ddd;\n"
            + "  border-radius: 8px;\n"
            + "  padding: 20px;\n"
            + "}",
            "/* State Rules */\n"
            + ".is-active {\n"
            + "  background-color: #e6f7ff;\n"
            + "}\n"
            + "\n"
            + ".is-hidden {\n"
            + "  display: none;\n"
            + "}\n"
            + "\n"
            + ".is-disabled {\n"
            + "  opacity: 0.5;\n"
            + "  pointer-events: none;\n"
            + "}",
            "/* Theme Rules */\n"
            + ".theme-dark {\n"
            + "  background-color: #222;\n"
            + "  color: #eee;\n"
            + "}\n"
            + "\n"
            + ".theme-dark .card {\n"
            + "  background-color: #333;\n"
            + "  border-color: #444;\n"
            + "}",
            "/* Strong CSS Example */\n"
            + "/* Thay vì */\n"
            + "#header .nav ul li a { color: red; } /* Quá cụ thể */\n"
            + "\n"
            + "/* Nên viết */\n"
            + ".nav-link { \n"
            + "  color: var(--primary-color);\n"
            + "  padding: 0.5rem 1rem;\n"
            + "}\n"
            + "\n"
            + "/* Sử dụng biến CSS */\n"
            + ":root {\n"
            + "  --primary-color: #0366d6;\n"
            + "  --spacing-unit: 8px;\n"
            + "}\n"
            + "\n"
            + "/* Responsive design */\n"
            + "@media (max-width: 768px) {\n"
            + "  .nav-link {\n"
            + "    padding: var(--spacing-unit);\n"
            + "  }\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Ví dụ HTML</title>\n"
            + "  <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "  <header class=\"l-header\">\n"
            + "    <h1>Logo</h1>\n"
            + "    <nav class=\"nav\">\n"
            + "      <ul>\n"
            + "        <li><a href=\"#\" class=\"nav-link is-active\">Trang chủ</a></li>\n"
            + "        <li><a href=\"#\" class=\"nav-link\">Giới thiệu</a></li>\n"
            + "      </ul>\n"
            + "    </nav>\n"
            + "  </header>\n"
            + "  \n"
            + "  <main class=\"l-container\">\n"
            + "    <article class=\"card\">\n"
            + "      <h2>Bài viết mới</h2>\n"
            + "      <p>Nội dung bài viết...</p>\n"
            + "      <button class=\"btn btn-primary\">Đọc thêm</button>\n"
            + "    </article>\n"
            + "  </main>\n"
            + "</body>\n"
            + "</html>",
            "/* CSS Example kết hợp các khái niệm */\n"
            + "/* Base */\n"
            + "body {\n"
            + "  line-height: 1.6;\n"
            + "  color: #333;\n"
            + "}\n"
            + "\n"
            + "/* Layout */\n"
            + ".l-container {\n"
            + "  padding: 0 1rem;\n"
            + "}\n"
            + "\n"
            + "/* Module */\n"
            + ".alert {\n"
            + "  padding: 1rem;\n"
            + "  border-radius: 4px;\n"
            + "  margin-bottom: 1rem;\n"
            + "}\n"
            + "\n"
            + ".alert-success {\n"
            + "  background-color: #d4edda;\n"
            + "  color: #155724;\n"
            + "}\n"
            + "\n"
            + "/* State */\n"
            + ".is-collapsed {\n"
            + "  max-height: 0;\n"
            + "  overflow: hidden;\n"
            + "  transition: max-height 0.3s ease;\n"
            + "}\n"
            + "\n"
            + "/* Theme */\n"
            + ".theme-light {\n"
            + "  --bg-color: #fff;\n"
            + "  --text-color: #333;\n"
            + "}\n"
            + "\n"
            + ".theme-dark {\n"
            + "  --bg-color: #222;\n"
            + "  --text-color: #eee;\n"
            + "}\n"
            + "\n"
            + "/* Utility */\n"
            + ".text-center {\n"
            + "  text-align: center;\n"
            + "}\n"
            + "\n"
            + ".mt-2 {\n"
            + "  margin-top: 2rem;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\" class=\"theme-light\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>SMACSS + Strong CSS</title>\n"
            + "  <style>\n"
            + "    /* Base */\n"
            + "    :root {\n"
            + "      --primary-color: #0366d6;\n"
            + "      --spacing-unit: 8px;\n"
            + "    }\n"
            + "    \n"
            + "    body {\n"
            + "      margin: 0;\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      line-height: 1.6;\n"
            + "      background-color: var(--bg-color, #fff);\n"
            + "      color: var(--text-color, #333);\n"
            + "    }\n"
            + "    \n"
            + "    /* Layout */\n"
            + "    .l-header {\n"
            + "      display: flex;\n"
            + "      justify-content: space-between;\n"
            + "      align-items: center;\n"
            + "      padding: calc(var(--spacing-unit) * 2);\n"
            + "      border-bottom: 1px solid #eee;\n"
            + "    }\n"
            + "    \n"
            + "    .l-main {\n"
            + "      max-width: 1200px;\n"
            + "      margin: 0 auto;\n"
            + "      padding: calc(var(--spacing-unit) * 3);\n"
            + "    }\n"
            + "    \n"
            + "    /* Module */\n"
            + "    .btn {\n"
            + "      display: inline-block;\n"
            + "      padding: var(--spacing-unit) calc(var(--spacing-unit) * 2);\n"
            + "      border-radius: 4px;\n"
            + "      cursor: pointer;\n"
            + "      transition: background-color 0.2s;\n"
            + "    }\n"
            + "    \n"
            + "    .btn-primary {\n"
            + "      background-color: var(--primary-color);\n"
            + "      color: white;\n"
            + "      border: none;\n"
            + "    }\n"
            + "    \n"
            + "    .btn-primary:hover {\n"
            + "      background-color: #024ea1;\n"
            + "    }\n"
            + "    \n"
            + "    .card {\n"
            + "      border: 1px solid #ddd;\n"
            + "      border-radius: 8px;\n"
            + "      padding: calc(var(--spacing-unit) * 3);\n"
            + "      margin-bottom: calc(var(--spacing-unit) * 2);\n"
            + "    }\n"
            + "    \n"
            + "    /* State */\n"
            + "    .is-hidden {\n"
            + "      display: none;\n"
            + "    }\n"
            + "    \n"
            + "    /* Theme */\n"
            + "    .theme-dark {\n"
            + "      --bg-color: #222;\n"
            + "      --text-color: #eee;\n"
            + "    }\n"
            + "    \n"
            + "    .theme-dark .card {\n"
            + "      background-color: #333;\n"
            + "      border-color: #444;\n"
            + "    }\n"
            + "    \n"
            + "    /* Utility */\n"
            + "    .text-right {\n"
            + "      text-align: right;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <header class=\"l-header\">\n"
            + "    <h1>Logo Website</h1>\n"
            + "    <nav>\n"
            + "      <button class=\"btn btn-primary\" id=\"themeToggle\">Đổi giao diện</button>\n"
            + "    </nav>\n"
            + "  </header>\n"
            + "  \n"
            + "  <main class=\"l-main\">\n"
            + "    <article class=\"card\">\n"
            + "      <h2>Bài viết mẫu</h2>\n"
            + "      <p>Đây là ví dụ kết hợp SMACSS, Strong CSS, HTML và CSS để tạo giao diện mạnh mẽ, dễ bảo trì.</p>\n"
            + "      <div class=\"text-right\">\n"
            + "        <button class=\"btn btn-primary\">Xem thêm</button>\n"
            + "      </div>\n"
            + "    </article>\n"
            + "  </main>\n"
            + "  \n"
            + "  <script>\n"
            + "    document.getElementById('themeToggle').addEventListener('click', function() {\n"
            + "      document.documentElement.classList.toggle('theme-dark');\n"
            + "    });\n"
            + "  </script>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Biến trong CSS (--main-color)", new String[]{
            ":root {\n"
            + "  --main-color: #3498db;\n"
            + "  --secondary-color: #2ecc71;\n"
            + "  --padding-large: 20px;\n"
            + "}",
            ".button {\n"
            + "  background-color: var(--main-color);\n"
            + "  padding: var(--padding-large);\n"
            + "}",
            "/* Biến toàn cục */\n"
            + ":root {\n"
            + "  --global-color: red;\n"
            + "}\n"
            + "\n"
            + ".container {\n"
            + "  /* Biến cục bộ, chỉ áp dụng trong .container và các phần tử con */\n"
            + "  --local-color: blue;\n"
            + "}\n"
            + "\n"
            + ".container p {\n"
            + "  color: var(--local-color); /* Sử dụng biến cục bộ */\n"
            + "}\n"
            + "\n"
            + "h1 {\n"
            + "  color: var(--global-color); /* Sử dụng biến toàn cục */\n"
            + "}",
            ".element {\n"
            + "  color: var(--undefined-color, black); /* Sẽ dùng màu black nếu --undefined-color không tồn tại */\n"
            + "}",
            "// Thay đổi biến toàn cục\n"
            + "document.documentElement.style.setProperty('--main-color', 'purple');\n"
            + "\n"
            + "// Thay đổi biến cục bộ\n"
            + "document.querySelector('.container').style.setProperty('--local-color', 'green');",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>CSS Variables Example</title>\n"
            + "  <style>\n"
            + "    /* Khai báo biến toàn cục */\n"
            + "    :root {\n"
            + "      --primary-color: #3498db;\n"
            + "      --secondary-color: #2ecc71;\n"
            + "      --text-color: #333;\n"
            + "      --spacing: 16px;\n"
            + "      --border-radius: 4px;\n"
            + "    }\n"
            + "\n"
            + "    /* Sử dụng biến */\n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      color: var(--text-color);\n"
            + "      padding: var(--spacing);\n"
            + "    }\n"
            + "\n"
            + "    .header {\n"
            + "      background-color: var(--primary-color);\n"
            + "      padding: calc(var(--spacing) * 2);\n"
            + "      border-radius: var(--border-radius);\n"
            + "      color: white;\n"
            + "      margin-bottom: var(--spacing);\n"
            + "    }\n"
            + "\n"
            + "    .button {\n"
            + "      background-color: var(--primary-color);\n"
            + "      color: white;\n"
            + "      padding: var(--spacing);\n"
            + "      border: none;\n"
            + "      border-radius: var(--border-radius);\n"
            + "      cursor: pointer;\n"
            + "      margin-right: var(--spacing);\n"
            + "    }\n"
            + "\n"
            + "    .button.secondary {\n"
            + "      background-color: var(--secondary-color);\n"
            + "    }\n"
            + "\n"
            + "    /* Biến cục bộ */\n"
            + "    .dark-theme {\n"
            + "      --primary-color: #2980b9;\n"
            + "      --secondary-color: #27ae60;\n"
            + "      --text-color: #ecf0f1;\n"
            + "      background-color: #2c3e50;\n"
            + "      padding: var(--spacing);\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"header\">\n"
            + "    <h1>CSS Variables Demo</h1>\n"
            + "  </div>\n"
            + "\n"
            + "  <button class=\"button\">Primary Button</button>\n"
            + "  <button class=\"button secondary\">Secondary Button</button>\n"
            + "\n"
            + "  <div class=\"dark-theme\" style=\"margin-top: 20px; padding: 20px;\">\n"
            + "    <h2>Dark Theme Section</h2>\n"
            + "    <p>This section uses locally scoped variables that override the global ones.</p>\n"
            + "    <button class=\"button\">Themed Button</button>\n"
            + "  </div>\n"
            + "\n"
            + "  <script>\n"
            + "    // Thay đổi biến CSS bằng JavaScript\n"
            + "    document.addEventListener('DOMContentLoaded', function() {\n"
            + "      setTimeout(function() {\n"
            + "        document.documentElement.style.setProperty('--primary-color', '#e74c3c');\n"
            + "      }, 2000);\n"
            + "    });\n"
            + "  </script>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Nested Rules", new String[]{
            "nav {\n"
            + "  ul {\n"
            + "    margin: 0;\n"
            + "    padding: 0;\n"
            + "    list-style: none;\n"
            + "  }\n"
            + "\n"
            + "  li { display: inline-block; }\n"
            + "\n"
            + "  a {\n"
            + "    display: block;\n"
            + "    padding: 6px 12px;\n"
            + "    text-decoration: none;\n"
            + "  }\n"
            + "}",
            "nav ul {\n"
            + "  margin: 0;\n"
            + "  padding: 0;\n"
            + "  list-style: none;\n"
            + "}\n"
            + "nav li {\n"
            + "  display: inline-block;\n"
            + "}\n"
            + "nav a {\n"
            + "  display: block;\n"
            + "  padding: 6px 12px;\n"
            + "  text-decoration: none;\n"
            + "}",
            "a {\n"
            + "  color: blue;\n"
            + "  \n"
            + "  &:hover {\n"
            + "    color: red;\n"
            + "  }\n"
            + "  \n"
            + "  &:visited {\n"
            + "    color: purple;\n"
            + "  }\n"
            + "}",
            "a {\n"
            + "  color: blue;\n"
            + "}\n"
            + "a:hover {\n"
            + "  color: red;\n"
            + "}\n"
            + "a:visited {\n"
            + "  color: purple;\n"
            + "}",
            ".container {\n"
            + "  width: 100%;\n"
            + "  \n"
            + "  @media (min-width: 768px) {\n"
            + "    width: 750px;\n"
            + "  }\n"
            + "  \n"
            + "  @media (min-width: 992px) {\n"
            + "    width: 970px;\n"
            + "  }\n"
            + "}",
            ".container {\n"
            + "  width: 100%;\n"
            + "}\n"
            + "\n"
            + "@media (min-width: 768px) {\n"
            + "  .container {\n"
            + "    width: 750px;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "@media (min-width: 992px) {\n"
            + "  .container {\n"
            + "    width: 970px;\n"
            + "  }\n"
            + "}",
            "body {\n"
            + "  font: {\n"
            + "    family: Arial, sans-serif;\n"
            + "    size: 16px;\n"
            + "    weight: normal;\n"
            + "  }\n"
            + "}",
            "body {\n"
            + "  font-family: Arial, sans-serif;\n"
            + "  font-size: 16px;\n"
            + "  font-weight: normal;\n"
            + "}",
            ".button {\n"
            + "  &--primary {\n"
            + "    background: blue;\n"
            + "  }\n"
            + "  \n"
            + "  &--large {\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "  \n"
            + "  &__icon {\n"
            + "    margin-right: 5px;\n"
            + "  }\n"
            + "}",
            ".button--primary {\n"
            + "  background: blue;\n"
            + "}\n"
            + ".button--large {\n"
            + "  padding: 20px;\n"
            + "}\n"
            + ".button__icon {\n"
            + "  margin-right: 5px;\n"
            + "}",
            "// Biến và mixin\n"
            + "$primary-color: #3498db;\n"
            + "$secondary-color: #2ecc71;\n"
            + "\n"
            + "@mixin border-radius($radius) {\n"
            + "  -webkit-border-radius: $radius;\n"
            + "     -moz-border-radius: $radius;\n"
            + "      -ms-border-radius: $radius;\n"
            + "          border-radius: $radius;\n"
            + "}\n"
            + "\n"
            + "// Nested rules\n"
            + ".card {\n"
            + "  border: 1px solid #ddd;\n"
            + "  padding: 20px;\n"
            + "  @include border-radius(5px);\n"
            + "  \n"
            + "  &-header {\n"
            + "    font-size: 1.5em;\n"
            + "    margin-bottom: 15px;\n"
            + "    color: $primary-color;\n"
            + "    \n"
            + "    &.highlight {\n"
            + "      color: $secondary-color;\n"
            + "    }\n"
            + "  }\n"
            + "  \n"
            + "  &-body {\n"
            + "    p {\n"
            + "      line-height: 1.6;\n"
            + "      \n"
            + "      &:first-child {\n"
            + "        margin-top: 0;\n"
            + "      }\n"
            + "      \n"
            + "      &:last-child {\n"
            + "        margin-bottom: 0;\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    a {\n"
            + "      color: $primary-color;\n"
            + "      \n"
            + "      &:hover {\n"
            + "        text-decoration: underline;\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "  \n"
            + "  @media (max-width: 768px) {\n"
            + "    padding: 15px;\n"
            + "    \n"
            + "    &-header {\n"
            + "      font-size: 1.2em;\n"
            + "    }\n"
            + "  }\n"
            + "}",
            ".card {\n"
            + "  border: 1px solid #ddd;\n"
            + "  padding: 20px;\n"
            + "  -webkit-border-radius: 5px;\n"
            + "  -moz-border-radius: 5px;\n"
            + "  -ms-border-radius: 5px;\n"
            + "  border-radius: 5px;\n"
            + "}\n"
            + "\n"
            + ".card-header {\n"
            + "  font-size: 1.5em;\n"
            + "  margin-bottom: 15px;\n"
            + "  color: #3498db;\n"
            + "}\n"
            + "\n"
            + ".card-header.highlight {\n"
            + "  color: #2ecc71;\n"
            + "}\n"
            + "\n"
            + ".card-body p {\n"
            + "  line-height: 1.6;\n"
            + "}\n"
            + "\n"
            + ".card-body p:first-child {\n"
            + "  margin-top: 0;\n"
            + "}\n"
            + "\n"
            + ".card-body p:last-child {\n"
            + "  margin-bottom: 0;\n"
            + "}\n"
            + "\n"
            + ".card-body a {\n"
            + "  color: #3498db;\n"
            + "}\n"
            + "\n"
            + ".card-body a:hover {\n"
            + "  text-decoration: underline;\n"
            + "}\n"
            + "\n"
            + "@media (max-width: 768px) {\n"
            + "  .card {\n"
            + "    padding: 15px;\n"
            + "  }\n"
            + "  .card-header {\n"
            + "    font-size: 1.2em;\n"
            + "  }\n"
            + "}"
        });

        Code_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new String[]{
            "// Định nghĩa mixin\n"
            + "@mixin tên-mixin {\n"
            + "  thuộc-tính: giá-trị;\n"
            + "  // ...\n"
            + "}\n"
            + "\n"
            + "// Sử dụng mixin\n"
            + ".lớp {\n"
            + "  @include tên-mixin;\n"
            + "}",
            "@mixin box-shadow($x, $y, $blur, $color) {\n"
            + "  box-shadow: $x $y $blur $color;\n"
            + "  -webkit-box-shadow: $x $y $blur $color;\n"
            + "  -moz-box-shadow: $x $y $blur $color;\n"
            + "}",
            "@mixin border-radius($radius: 5px) {\n"
            + "  border-radius: $radius;\n"
            + "  -webkit-border-radius: $radius;\n"
            + "  -moz-border-radius: $radius;\n"
            + "}",
            "@mixin media-query($device) {\n"
            + "  @media screen and (max-width: $device) {\n"
            + "    @content;\n"
            + "  }\n"
            + "}",
            "// Định nghĩa mixin căn giữa\n"
            + "@mixin center-element {\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "}\n"
            + "\n"
            + "// Mixin với tham số\n"
            + "@mixin button-style($bg-color, $text-color: white) {\n"
            + "  background-color: $bg-color;\n"
            + "  color: $text-color;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  transition: background-color 0.3s;\n"
            + "\n"
            + "  &:hover {\n"
            + "    background-color: darken($bg-color, 10%);\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Mixin responsive\n"
            + "@mixin respond-to($breakpoint) {\n"
            + "  @if $breakpoint == phone {\n"
            + "    @media (max-width: 600px) { @content; }\n"
            + "  } @else if $breakpoint == tablet {\n"
            + "    @media (max-width: 900px) { @content; }\n"
            + "  } @else if $breakpoint == desktop {\n"
            + "    @media (min-width: 901px) { @content; }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Sử dụng các mixin\n"
            + ".header {\n"
            + "  @include center-element;\n"
            + "  height: 80px;\n"
            + "  background-color: #333;\n"
            + "}\n"
            + "\n"
            + ".primary-btn {\n"
            + "  @include button-style(#3498db);\n"
            + "}\n"
            + "\n"
            + ".secondary-btn {\n"
            + "  @include button-style(#2ecc71, #333);\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  padding: 20px;\n"
            + "  margin: 10px;\n"
            + "  \n"
            + "  @include respond-to(phone) {\n"
            + "    width: 100%;\n"
            + "  }\n"
            + "  @include respond-to(tablet) {\n"
            + "    width: 50%;\n"
            + "  }\n"
            + "  @include respond-to(desktop) {\n"
            + "    width: 30%;\n"
            + "  }\n"
            + "}",
            ".header {\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  height: 80px;\n"
            + "  background-color: #333;\n"
            + "}\n"
            + "\n"
            + ".primary-btn {\n"
            + "  background-color: #3498db;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  transition: background-color 0.3s;\n"
            + "}\n"
            + ".primary-btn:hover {\n"
            + "  background-color: #2386c8;\n"
            + "}\n"
            + "\n"
            + ".secondary-btn {\n"
            + "  background-color: #2ecc71;\n"
            + "  color: #333;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  transition: background-color 0.3s;\n"
            + "}\n"
            + ".secondary-btn:hover {\n"
            + "  background-color: #27ae60;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  padding: 20px;\n"
            + "  margin: 10px;\n"
            + "}\n"
            + "@media (max-width: 600px) {\n"
            + "  .card {\n"
            + "    width: 100%;\n"
            + "  }\n"
            + "}\n"
            + "@media (max-width: 900px) {\n"
            + "  .card {\n"
            + "    width: 50%;\n"
            + "  }\n"
            + "}\n"
            + "@media (min-width: 901px) {\n"
            + "  .card {\n"
            + "    width: 30%;\n"
            + "  }\n"
            + "}"
        });

        Code_MAP.put("Functions – Xử lý logic trong SCSS", new String[]{
            "// Khai báo biến\n"
            + "$primary-color: #3498db;\n"
            + "$font-stack: Helvetica, sans-serif;\n"
            + "$padding: 15px;\n"
            + "\n"
            + "// Sử dụng biến\n"
            + "body {\n"
            + "  font-family: $font-stack;\n"
            + "  color: $primary-color;\n"
            + "}\n"
            + "\n"
            + ".container {\n"
            + "  padding: $padding;\n"
            + "}",
            "nav {\n"
            + "  ul {\n"
            + "    margin: 0;\n"
            + "    padding: 0;\n"
            + "    list-style: none;\n"
            + "    \n"
            + "    li {\n"
            + "      display: inline-block;\n"
            + "      \n"
            + "      a {\n"
            + "        text-decoration: none;\n"
            + "        &:hover {\n"
            + "          color: red;\n"
            + "        }\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "}",
            "// Định nghĩa mixin\n"
            + "@mixin border-radius($radius) {\n"
            + "  -webkit-border-radius: $radius;\n"
            + "  -moz-border-radius: $radius;\n"
            + "  border-radius: $radius;\n"
            + "}\n"
            + "\n"
            + "// Sử dụng mixin\n"
            + ".button {\n"
            + "  @include border-radius(5px);\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  @include border-radius(10px);\n"
            + "}",
            "// Base style\n"
            + "%message-shared {\n"
            + "  border: 1px solid #ccc;\n"
            + "  padding: 10px;\n"
            + "  color: #333;\n"
            + "}\n"
            + "\n"
            + ".message {\n"
            + "  @extend %message-shared;\n"
            + "}\n"
            + "\n"
            + ".success {\n"
            + "  @extend %message-shared;\n"
            + "  border-color: green;\n"
            + "}\n"
            + "\n"
            + ".error {\n"
            + "  @extend %message-shared;\n"
            + "  border-color: red;\n"
            + "}",
            "@mixin text-effect($val) {\n"
            + "  @if $val == danger {\n"
            + "    color: red;\n"
            + "  } @else if $val == alert {\n"
            + "    color: yellow;\n"
            + "  } @else if $val == success {\n"
            + "    color: green;\n"
            + "  } @else {\n"
            + "    color: black;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".text-danger {\n"
            + "  @include text-effect(danger);\n"
            + "}\n"
            + "\n"
            + ".text-alert {\n"
            + "  @include text-effect(alert);\n"
            + "}",
            "@for $i from 1 through 5 {\n"
            + "  .col-#{$i} {\n"
            + "    width: 100px * $i;\n"
            + "  }\n"
            + "}",
            "$colors: red, green, blue, yellow;\n"
            + "\n"
            + "@each $color in $colors {\n"
            + "  .#{$color}-text {\n"
            + "    color: $color;\n"
            + "  }\n"
            + "}",
            "$i: 1;\n"
            + "@while $i < 6 {\n"
            + "  .item-#{$i} {\n"
            + "    width: 2em * $i;\n"
            + "  }\n"
            + "  $i: $i + 2;\n"
            + "}",
            "@function calculate-rem($size) {\n"
            + "  $rem-size: $size / 16px;\n"
            + "  @return $rem-size * 1rem;\n"
            + "}\n"
            + "\n"
            + "body {\n"
            + "  font-size: calculate-rem(18px);\n"
            + "}",
            ".container {\n"
            + "  width: 100% / 3;\n"
            + "  height: 600px - 100px;\n"
            + "  font-size: 12px + 2px;\n"
            + "}\n"
            + "\n"
            + "@if 10px > 5px and 5px < 20px {\n"
            + "  .box {\n"
            + "    padding: 10px;\n"
            + "  }\n"
            + "}",
            "// Biến\n"
            + "$theme-colors: (\n"
            + "  primary: #3498db,\n"
            + "  secondary: #2ecc71,\n"
            + "  danger: #e74c3c\n"
            + ");\n"
            + "\n"
            + "// Mixin\n"
            + "@mixin button-style($bg-color) {\n"
            + "  background-color: $bg-color;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  \n"
            + "  &:hover {\n"
            + "    background-color: darken($bg-color, 10%);\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Function\n"
            + "@function get-color($key) {\n"
            + "  @return map-get($theme-colors, $key);\n"
            + "}\n"
            + "\n"
            + "// Vòng lặp\n"
            + "@each $name, $color in $theme-colors {\n"
            + "  .btn-#{$name} {\n"
            + "    @include button-style($color);\n"
            + "    \n"
            + "    // Điều kiện\n"
            + "    @if $name == danger {\n"
            + "      font-weight: bold;\n"
            + "    }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Kế thừa\n"
            + "%card-base {\n"
            + "  border: 1px solid #ddd;\n"
            + "  border-radius: 8px;\n"
            + "  padding: 20px;\n"
            + "  margin-bottom: 20px;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  @extend %card-base;\n"
            + "  background-color: white;\n"
            + "}\n"
            + "\n"
            + ".card-dark {\n"
            + "  @extend %card-base;\n"
            + "  background-color: #333;\n"
            + "  color: white;\n"
            + "}",
            ".btn-primary {\n"
            + "  background-color: #3498db;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "}\n"
            + ".btn-primary:hover {\n"
            + "  background-color: #217dbb;\n"
            + "}\n"
            + "\n"
            + ".btn-secondary {\n"
            + "  background-color: #2ecc71;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "}\n"
            + ".btn-secondary:hover {\n"
            + "  background-color: #25a25a;\n"
            + "}\n"
            + "\n"
            + ".btn-danger {\n"
            + "  background-color: #e74c3c;\n"
            + "  color: white;\n"
            + "  padding: 10px 20px;\n"
            + "  border: none;\n"
            + "  border-radius: 4px;\n"
            + "  cursor: pointer;\n"
            + "  font-weight: bold;\n"
            + "}\n"
            + ".btn-danger:hover {\n"
            + "  background-color: #d62c1a;\n"
            + "}\n"
            + "\n"
            + ".card, .card-dark {\n"
            + "  border: 1px solid #ddd;\n"
            + "  border-radius: 8px;\n"
            + "  padding: 20px;\n"
            + "  margin-bottom: 20px;\n"
            + "}\n"
            + "\n"
            + ".card {\n"
            + "  background-color: white;\n"
            + "}\n"
            + "\n"
            + ".card-dark {\n"
            + "  background-color: #333;\n"
            + "  color: white;\n"
            + "}"
        });

        Code_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "npm install -g sass",
            "sass input.scss output.css",
            "// Khai báo biến\n"
            + "$primary-color: #3498db;\n"
            + "$secondary-color: #2ecc71;\n"
            + "$font-stack: Helvetica, sans-serif;\n"
            + "\n"
            + "body {\n"
            + "  font: 100% $font-stack;\n"
            + "  color: $primary-color;\n"
            + "}\n"
            + "\n"
            + ".button {\n"
            + "  background-color: $secondary-color;\n"
            + "}",
            "nav {\n"
            + "  ul {\n"
            + "    margin: 0;\n"
            + "    padding: 0;\n"
            + "    list-style: none;\n"
            + "    \n"
            + "    li {\n"
            + "      display: inline-block;\n"
            + "      \n"
            + "      a {\n"
            + "        text-decoration: none;\n"
            + "        padding: 0.5rem 1rem;\n"
            + "        \n"
            + "        &:hover {\n"
            + "          color: $primary-color;\n"
            + "        }\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "}",
            "// Định nghĩa mixin\n"
            + "@mixin transform($property) {\n"
            + "  -webkit-transform: $property;\n"
            + "  -ms-transform: $property;\n"
            + "  transform: $property;\n"
            + "}\n"
            + "\n"
            + "// Sử dụng mixin\n"
            + ".box {\n"
            + "  @include transform(rotate(30deg));\n"
            + "  background-color: $primary-color;\n"
            + "}",
            "%message-shared {\n"
            + "  border: 1px solid #ccc;\n"
            + "  padding: 10px;\n"
            + "  color: #333;\n"
            + "}\n"
            + "\n"
            + ".success {\n"
            + "  @extend %message-shared;\n"
            + "  border-color: green;\n"
            + "}\n"
            + "\n"
            + ".error {\n"
            + "  @extend %message-shared;\n"
            + "  border-color: red;\n"
            + "}",
            "$primary-color: #3498db;\n"
            + "$secondary-color: #2ecc71;",
            "@use 'variables';\n"
            + "\n"
            + "body {\n"
            + "  color: variables.$primary-color;\n"
            + "}",
            ".container {\n"
            + "  width: 100%;\n"
            + "}\n"
            + "\n"
            + ".article {\n"
            + "  float: left;\n"
            + "  width: 600px / 960px * 100%;\n"
            + "}\n"
            + "\n"
            + ".aside {\n"
            + "  float: right;\n"
            + "  width: 300px / 960px * 100%;\n"
            + "}",
            "// Variables\n"
            + "$primary-color: #3498db;\n"
            + "$secondary-color: #2ecc71;\n"
            + "$dark-color: #2c3e50;\n"
            + "$light-color: #ecf0f1;\n"
            + "$font-stack: 'Helvetica Neue', Arial, sans-serif;\n"
            + "\n"
            + "// Mixins\n"
            + "@mixin border-radius($radius) {\n"
            + "  -webkit-border-radius: $radius;\n"
            + "  -moz-border-radius: $radius;\n"
            + "  border-radius: $radius;\n"
            + "}\n"
            + "\n"
            + "@mixin box-shadow($x, $y, $blur, $color) {\n"
            + "  -webkit-box-shadow: $x $y $blur $color;\n"
            + "  -moz-box-shadow: $x $y $blur $color;\n"
            + "  box-shadow: $x $y $blur $color;\n"
            + "}\n"
            + "\n"
            + "// Base styles\n"
            + "body {\n"
            + "  font-family: $font-stack;\n"
            + "  line-height: 1.6;\n"
            + "  color: $dark-color;\n"
            + "  background-color: $light-color;\n"
            + "  margin: 0;\n"
            + "  padding: 0;\n"
            + "}\n"
            + "\n"
            + "// Navigation\n"
            + ".navbar {\n"
            + "  background-color: $primary-color;\n"
            + "  padding: 1rem;\n"
            + "  \n"
            + "  ul {\n"
            + "    list-style: none;\n"
            + "    display: flex;\n"
            + "    gap: 1rem;\n"
            + "    \n"
            + "    li {\n"
            + "      a {\n"
            + "        color: white;\n"
            + "        text-decoration: none;\n"
            + "        padding: 0.5rem 1rem;\n"
            + "        @include border-radius(4px);\n"
            + "        \n"
            + "        &:hover {\n"
            + "          background-color: darken($primary-color, 10%);\n"
            + "        }\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Buttons\n"
            + ".btn {\n"
            + "  display: inline-block;\n"
            + "  padding: 0.5rem 1rem;\n"
            + "  border: none;\n"
            + "  @include border-radius(4px);\n"
            + "  cursor: pointer;\n"
            + "  text-decoration: none;\n"
            + "  font-size: 1rem;\n"
            + "  \n"
            + "  &-primary {\n"
            + "    background-color: $primary-color;\n"
            + "    color: white;\n"
            + "    \n"
            + "    &:hover {\n"
            + "      background-color: darken($primary-color, 10%);\n"
            + "    }\n"
            + "  }\n"
            + "  \n"
            + "  &-secondary {\n"
            + "    background-color: $secondary-color;\n"
            + "    color: white;\n"
            + "    \n"
            + "    &:hover {\n"
            + "      background-color: darken($secondary-color, 10%);\n"
            + "    }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Card component\n"
            + ".card {\n"
            + "  background: white;\n"
            + "  @include border-radius(8px);\n"
            + "  @include box-shadow(0, 2px, 4px, rgba(0,0,0,0.1));\n"
            + "  padding: 1.5rem;\n"
            + "  margin-bottom: 1rem;\n"
            + "  \n"
            + "  &-title {\n"
            + "    font-size: 1.5rem;\n"
            + "    margin-bottom: 1rem;\n"
            + "    color: $primary-color;\n"
            + "  }\n"
            + "  \n"
            + "  &-body {\n"
            + "    p {\n"
            + "      margin-bottom: 0.5rem;\n"
            + "    }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + "// Responsive utilities\n"
            + "@mixin respond-to($breakpoint) {\n"
            + "  @if $breakpoint == 'phone' {\n"
            + "    @media (max-width: 600px) { @content; }\n"
            + "  } @else if $breakpoint == 'tablet' {\n"
            + "    @media (max-width: 900px) { @content; }\n"
            + "  } @else if $breakpoint == 'desktop' {\n"
            + "    @media (min-width: 901px) { @content; }\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".container {\n"
            + "  width: 100%;\n"
            + "  max-width: 1200px;\n"
            + "  margin: 0 auto;\n"
            + "  padding: 0 1rem;\n"
            + "  \n"
            + "  @include respond-to('tablet') {\n"
            + "    padding: 0 2rem;\n"
            + "  }\n"
            + "  \n"
            + "  @include respond-to('phone') {\n"
            + "    padding: 0 1rem;\n"
            + "  }\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>SCSS Example</title>\n"
            + "  <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "  <nav class=\"navbar\">\n"
            + "    <ul>\n"
            + "      <li><a href=\"#\">Home</a></li>\n"
            + "      <li><a href=\"#\">About</a></li>\n"
            + "      <li><a href=\"#\">Services</a></li>\n"
            + "      <li><a href=\"#\">Contact</a></li>\n"
            + "    </ul>\n"
            + "  </nav>\n"
            + "  \n"
            + "  <div class=\"container\">\n"
            + "    <div class=\"card\">\n"
            + "      <h2 class=\"card-title\">Welcome to SCSS</h2>\n"
            + "      <div class=\"card-body\">\n"
            + "        <p>This is an example of using SCSS to create more maintainable CSS.</p>\n"
            + "        <a href=\"#\" class=\"btn btn-primary\">Learn More</a>\n"
            + "        <a href=\"#\" class=\"btn btn-secondary\">Sign Up</a>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Minify CSS", new String[]{
            "<!-- CSS gốc -->\n"
            + "<style>\n"
            + "  /* Đây là comment sẽ bị loại bỏ */\n"
            + "  body {\n"
            + "    background-color: #FFFFFF;\n"
            + "    margin: 10px 10px 10px 10px;\n"
            + "  }\n"
            + "  \n"
            + "  .container {\n"
            + "    width: 100%;\n"
            + "    padding: 20px;\n"
            + "  }\n"
            + "</style>\n"
            + "\n"
            + "<!-- Sau khi minify -->\n"
            + "<style>body{background-color:#FFF;margin:10px}.container{width:100%;padding:20px}</style>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Ví dụ Minify CSS</title>\n"
            + "    \n"
            + "    <!-- CSS gốc (chưa minify) -->\n"
            + "    <!--\n"
            + "    <style>\n"
            + "        /* Main styles */\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            line-height: 1.6;\n"
            + "            color: #333333;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        \n"
            + "        .header {\n"
            + "            background-color: #FF0000;\n"
            + "            padding: 20px;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "    -->\n"
            + "    \n"
            + "    <!-- CSS đã minify -->\n"
            + "    <style>body{font-family:Arial,sans-serif;line-height:1.6;color:#333;margin:0;padding:0}.header{background-color:red;padding:20px;text-align:center}</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"header\">\n"
            + "        <h1>Website đã được tối ưu</h1>\n"
            + "    </div>\n"
            + "    <p>Nội dung trang web...</p>\n"
            + "</body>\n"
            + "</html>",
            "/* File gốc style.css */\n"
            + "body {\n"
            + "    background: #ffffff url('bg.jpg') no-repeat;\n"
            + "    margin: 10px;\n"
            + "    padding: 20px;\n"
            + "}\n"
            + "\n"
            + "/* Main content */\n"
            + ".content {\n"
            + "    width: 80%;\n"
            + "    margin: 0 auto;\n"
            + "}",
            "body{background:#fff url('bg.jpg') no-repeat;margin:10px;padding:20px}.content{width:80%;margin:0 auto}",
            "const gulp = require('gulp');\n"
            + "const cleanCSS = require('gulp-clean-css');\n"
            + "\n"
            + "gulp.task('minify-css', () => {\n"
            + "  return gulp.src('styles/*.css')\n"
            + "    .pipe(cleanCSS({compatibility: 'ie8'}))\n"
            + "    .pipe(gulp.dest('dist'));\n"
            + "});"
        });

        Code_MAP.put("Load Font Tối ưu", new String[]{
            "@font-face {\n"
            + "  font-family: 'MyFont';\n"
            + "  src: url('myfont.woff2') format('woff2'),\n"
            + "       url('myfont.woff') format('woff');\n"
            + "  font-weight: normal;\n"
            + "  font-style: normal;\n"
            + "  font-display: swap;\n"
            + "}",
            "@font-face {\n"
            + "  font-family: 'MyFont';\n"
            + "  src: url('myfont.woff2') format('woff2');\n"
            + "  font-display: swap; /* Hiển thị font dự phòng trước, sau đó swap khi font chính tải xong */\n"
            + "}",
            "<link rel=\"preload\" href=\"font.woff2\" as=\"font\" type=\"font/woff2\" crossorigin>",
            "@font-face {\n"
            + "  font-family: 'MyFont';\n"
            + "  src: url('myfont-subset.woff2') format('woff2');\n"
            + "  unicode-range: U+0041-005A, U+0061-007A; /* Chỉ bao gồm chữ cái Latin thường và hoa */\n"
            + "}",
            "body {\n"
            + "  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Tối ưu hóa Font</title>\n"
            + "  \n"
            + "  <!-- Preload font quan trọng -->\n"
            + "  <link rel=\"preload\" href=\"fonts/roboto-regular.woff2\" as=\"font\" type=\"font/woff2\" crossorigin>\n"
            + "  \n"
            + "  <style>\n"
            + "    /* Khai báo font với font-display */\n"
            + "    @font-face {\n"
            + "      font-family: 'Roboto';\n"
            + "      src: url('fonts/roboto-regular.woff2') format('woff2'),\n"
            + "           url('fonts/roboto-regular.woff') format('woff');\n"
            + "      font-weight: 400;\n"
            + "      font-style: normal;\n"
            + "      font-display: swap;\n"
            + "    }\n"
            + "    \n"
            + "    @font-face {\n"
            + "      font-family: 'Roboto';\n"
            + "      src: url('fonts/roboto-bold.woff2') format('woff2'),\n"
            + "           url('fonts/roboto-bold.woff') format('woff');\n"
            + "      font-weight: 700;\n"
            + "      font-style: normal;\n"
            + "      font-display: swap;\n"
            + "    }\n"
            + "    \n"
            + "    /* Fallback font hệ thống */\n"
            + "    body {\n"
            + "      font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', system-ui, sans-serif;\n"
            + "    }\n"
            + "    \n"
            + "    /* Áp dụng font tùy chỉnh khi đã tải */\n"
            + "    .font-loaded body {\n"
            + "      font-family: 'Roboto', -apple-system, BlinkMacSystemFont, 'Segoe UI', sans-serif;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1>Tối ưu hóa tải font trong HTML/CSS</h1>\n"
            + "  <p>Ví dụ về cách tải font hiệu quả để cải thiện hiệu suất website.</p>\n"
            + "  \n"
            + "  <script>\n"
            + "    // Kiểm tra khi font đã tải xong\n"
            + "    document.fonts.ready.then(function() {\n"
            + "      document.documentElement.classList.add('font-loaded');\n"
            + "    });\n"
            + "  </script>\n"
            + "</body>\n"
            + "</html>",
            "<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\">"
        });

        Code_MAP.put("Critical CSS – Tải trước những phần CSS quan trọng", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Trang web với Critical CSS</title>\n"
            + "    \n"
            + "    <!-- Critical CSS được nhúng trực tiếp -->\n"
            + "    <style>\n"
            + "        /* CSS cho header và phần above-the-fold */\n"
            + "        body {\n"
            + "            margin: 0;\n"
            + "            font-family: 'Arial', sans-serif;\n"
            + "            line-height: 1.6;\n"
            + "        }\n"
            + "        .header {\n"
            + "            background: #2c3e50;\n"
            + "            color: white;\n"
            + "            padding: 1rem;\n"
            + "        }\n"
            + "        .hero {\n"
            + "            padding: 2rem;\n"
            + "            text-align: center;\n"
            + "            background: #f8f9fa;\n"
            + "        }\n"
            + "        .main-content {\n"
            + "            padding: 1rem;\n"
            + "        }\n"
            + "        \n"
            + "        /* Chỉ các style cần thiết cho phần đầu trang */\n"
            + "    </style>\n"
            + "    \n"
            + "    <!-- CSS không quan trọng được tải không đồng bộ -->\n"
            + "    <link rel=\"preload\" href=\"styles.css\" as=\"style\" onload=\"this.onload=null;this.rel='stylesheet'\">\n"
            + "    <noscript><link rel=\"stylesheet\" href=\"styles.css\"></noscript>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <header class=\"header\">\n"
            + "        <h1>Trang web của tôi</h1>\n"
            + "    </header>\n"
            + "    \n"
            + "    <section class=\"hero\">\n"
            + "        <h2>Chào mừng đến với trang web</h2>\n"
            + "        <p>Nội dung quan trọng hiển thị ngay lập tức</p>\n"
            + "    </section>\n"
            + "    \n"
            + "    <main class=\"main-content\">\n"
            + "        <!-- Nội dung chính -->\n"
            + "        <article>\n"
            + "            <h3>Tiêu đề bài viết</h3>\n"
            + "            <p>Nội dung dài sẽ được cuộn xuống...</p>\n"
            + "            <!-- Nhiều nội dung khác -->\n"
            + "        </article>\n"
            + "    </main>\n"
            + "    \n"
            + "    <script>\n"
            + "        // Polyfill để tải CSS không đồng bộ\n"
            + "        !function(e){\"use strict\"\n"
            + "        var n=function(n,t,o){var i,r=e.document,a=r.createElement(\"link\");if(t)i=t\n"
            + "        else{var d=(r.body||r.getElementsByTagName(\"head\")[0]).childNodes\n"
            + "        i=d[d.length-1]}var s=r.styleSheets\n"
            + "        a.rel=\"stylesheet\",a.href=n,a.media=\"only x\",o&&(a.onload=o)\n"
            + "        i.parentNode.insertBefore(a,t?i:i.nextSibling)\n"
            + "        var f=function(e){for(var n=a.href,t=s.length;t--;)\n"
            + "        if(s[t].href===n)return e()\n"
            + "        setTimeout(function(){f(e)})}\n"
            + "        return a.media=\"all\",f||o||null,a}\n"
            + "        \"undefined\"!=typeof exports?exports.loadCSS=n:e.loadCSS=n}(\"undefined\"!=typeof global?global:this)\n"
            + "        \n"
            + "        // Sử dụng loadCSS để tải file CSS chính\n"
            + "        loadCSS(\"styles.css\");\n"
            + "    </script>\n"
            + "</body>\n"
            + "</html>",
            "<?php\n"
            + "// Hàm tạo Critical CSS tự động (đơn giản)\n"
            + "function get_critical_css() {\n"
            + "    // Trong thực tế, bạn có thể đọc từ file hoặc cache\n"
            + "    return '\n"
            + "        body { margin: 0; font-family: Arial, sans-serif; }\n"
            + "        .header { background: #2c3e50; color: white; padding: 1rem; }\n"
            + "        .hero { padding: 2rem; text-align: center; background: #f8f9fa; }\n"
            + "        /* Thêm các style quan trọng khác */\n"
            + "    ';\n"
            + "}\n"
            + "?>\n"
            + "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Trang web với Critical CSS tự động</title>\n"
            + "    <style><?php echo get_critical_css(); ?></style>\n"
            + "    <link rel=\"preload\" href=\"full-styles.css\" as=\"style\" onload=\"this.onload=null;this.rel='stylesheet'\">\n"
            + "    <noscript><link rel=\"stylesheet\" href=\"full-styles.css\"></noscript>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <!-- Nội dung HTML -->\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Critical CSS với JavaScript</title>\n"
            + "    <script>\n"
            + "        // Tạo thẻ style và thêm Critical CSS\n"
            + "        var criticalCSS = `\n"
            + "            body { margin: 0; font-family: Arial, sans-serif; }\n"
            + "            .header { background: #2c3e50; color: white; padding: 1rem; }\n"
            + "            .hero { padding: 2rem; text-align: center; background: #f8f9fa; }\n"
            + "        `;\n"
            + "        \n"
            + "        var style = document.createElement('style');\n"
            + "        style.innerHTML = criticalCSS;\n"
            + "        document.head.appendChild(style);\n"
            + "        \n"
            + "        // Tải CSS đầy đủ sau khi trang đã tải\n"
            + "        window.onload = function() {\n"
            + "            var link = document.createElement('link');\n"
            + "            link.rel = 'stylesheet';\n"
            + "            link.href = 'styles.css';\n"
            + "            document.head.appendChild(link);\n"
            + "        };\n"
            + "    </script>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <header class=\"header\">\n"
            + "        <h1>Trang web của tôi</h1>\n"
            + "    </header>\n"
            + "    <section class=\"hero\">\n"
            + "        <h2>Nội dung quan trọng</h2>\n"
            + "    </section>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Lazy Loading – Tải tài nguyên khi cần thiết", new String[]{
            "<img src=\"image.jpg\" loading=\"lazy\" alt=\"Mô tả hình ảnh\" width=\"800\" height=\"600\">",
            "<img data-src=\"image-to-lazy-load.jpg\" alt=\"Mô tả hình ảnh\" class=\"lazy\">\n"
            + "\n"
            + "<script>\n"
            + "document.addEventListener(\"DOMContentLoaded\", function() {\n"
            + "  const lazyImages = document.querySelectorAll(\"img.lazy\");\n"
            + "  \n"
            + "  const imageObserver = new IntersectionObserver((entries, observer) => {\n"
            + "    entries.forEach(entry => {\n"
            + "      if (entry.isIntersecting) {\n"
            + "        const img = entry.target;\n"
            + "        img.src = img.dataset.src;\n"
            + "        img.classList.remove(\"lazy\");\n"
            + "        observer.unobserve(img);\n"
            + "      }\n"
            + "    });\n"
            + "  });\n"
            + "\n"
            + "  lazyImages.forEach(img => imageObserver.observe(img));\n"
            + "});\n"
            + "</script>",
            "<!-- Tải CSS ngay lập tức -->\n"
            + "<link rel=\"stylesheet\" href=\"critical.css\">\n"
            + "\n"
            + "<!-- Tải CSS khi cần -->\n"
            + "<link rel=\"preload\" href=\"non-critical.css\" as=\"style\" onload=\"this.rel='stylesheet'\">\n"
            + "<noscript><link rel=\"stylesheet\" href=\"non-critical.css\"></noscript>",
            "<div class=\"lazy-background\"></div>\n"
            + "\n"
            + "<style>\n"
            + ".lazy-background {\n"
            + "  background-image: url('placeholder.jpg'); /* Ảnh placeholder nhẹ */\n"
            + "}\n"
            + "\n"
            + ".lazy-background.visible {\n"
            + "  background-image: url('actual-image.jpg'); /* Ảnh thực tế */\n"
            + "}\n"
            + "</style>\n"
            + "\n"
            + "<script>\n"
            + "document.addEventListener(\"DOMContentLoaded\", function() {\n"
            + "  const backgroundObserver = new IntersectionObserver((entries) => {\n"
            + "    entries.forEach(entry => {\n"
            + "      if (entry.isIntersecting) {\n"
            + "        entry.target.classList.add(\"visible\");\n"
            + "        backgroundObserver.unobserve(entry.target);\n"
            + "      }\n"
            + "    });\n"
            + "  });\n"
            + "\n"
            + "  document.querySelectorAll(\".lazy-background\").forEach(el => {\n"
            + "    backgroundObserver.observe(el);\n"
            + "  });\n"
            + "});\n"
            + "</script>",
            "<video autoplay muted loop playsinline width=\"640\" height=\"360\" poster=\"placeholder.jpg\" loading=\"lazy\">\n"
            + "  <source data-src=\"video.webm\" type=\"video/webm\">\n"
            + "  <source data-src=\"video.mp4\" type=\"video/mp4\">\n"
            + "</video>\n"
            + "\n"
            + "<script>\n"
            + "document.addEventListener(\"DOMContentLoaded\", function() {\n"
            + "  const lazyVideos = document.querySelectorAll(\"video[data-src]\");\n"
            + "  \n"
            + "  const videoObserver = new IntersectionObserver((entries) => {\n"
            + "    entries.forEach(entry => {\n"
            + "      if (entry.isIntersecting) {\n"
            + "        const video = entry.target;\n"
            + "        const sources = video.querySelectorAll(\"source\");\n"
            + "        \n"
            + "        sources.forEach(source => {\n"
            + "          source.src = source.dataset.src;\n"
            + "        });\n"
            + "        \n"
            + "        video.load();\n"
            + "        videoObserver.unobserve(video);\n"
            + "      }\n"
            + "    });\n"
            + "  });\n"
            + "\n"
            + "  lazyVideos.forEach(video => videoObserver.observe(video));\n"
            + "});\n"
            + "</script>",
            "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/lazysizes/5.3.2/lazysizes.min.js\" async></script>\n"
            + "\n"
            + "<img data-src=\"image.jpg\" class=\"lazyload\" alt=\"Mô tả hình ảnh\">",
            "<script src=\"https://cdn.jsdelivr.net/npm/lozad/dist/lozad.min.js\"></script>\n"
            + "\n"
            + "<img data-src=\"image.jpg\" class=\"lozad\" alt=\"Mô tả hình ảnh\">\n"
            + "\n"
            + "<script>\n"
            + "const observer = lozad();\n"
            + "observer.observe();\n"
            + "</script>"
        });

        Code_MAP.put("Bootstrap", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Bootstrap Example</title>\n"
            + "    <!-- Bootstrap CSS -->\n"
            + "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
            + "</head>\n"
            + "<body>\n"
            + "    <!-- Nội dung trang web -->\n"
            + "    \n"
            + "    <!-- Bootstrap JS Bundle with Popper -->\n"
            + "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "<link href=\"path/to/bootstrap.min.css\" rel=\"stylesheet\">\n"
            + "<script src=\"path/to/bootstrap.bundle.min.js\"></script>",
            "<div class=\"container\">\n"
            + "    <div class=\"row\">\n"
            + "        <div class=\"col-md-4\">Cột 1 (4/12)</div>\n"
            + "        <div class=\"col-md-4\">Cột 2 (4/12)</div>\n"
            + "        <div class=\"col-md-4\">Cột 3 (4/12)</div>\n"
            + "    </div>\n"
            + "</div>",
            "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n"
            + "    <div class=\"container-fluid\">\n"
            + "        <a class=\"navbar-brand\" href=\"#\">Logo</a>\n"
            + "        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n"
            + "            <span class=\"navbar-toggler-icon\"></span>\n"
            + "        </button>\n"
            + "        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n"
            + "            <ul class=\"navbar-nav\">\n"
            + "                <li class=\"nav-item\">\n"
            + "                    <a class=\"nav-link active\" href=\"#\">Trang chủ</a>\n"
            + "                </li>\n"
            + "                <li class=\"nav-item\">\n"
            + "                    <a class=\"nav-link\" href=\"#\">Giới thiệu</a>\n"
            + "                </li>\n"
            + "                <li class=\"nav-item\">\n"
            + "                    <a class=\"nav-link\" href=\"#\">Dịch vụ</a>\n"
            + "                </li>\n"
            + "            </ul>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</nav>",
            "<button type=\"button\" class=\"btn btn-primary\">Primary</button>\n"
            + "<button type=\"button\" class=\"btn btn-secondary\">Secondary</button>\n"
            + "<button type=\"button\" class=\"btn btn-success\">Success</button>\n"
            + "<button type=\"button\" class=\"btn btn-danger\">Danger</button>\n"
            + "<button type=\"button\" class=\"btn btn-warning\">Warning</button>\n"
            + "<button type=\"button\" class=\"btn btn-info\">Info</button>\n"
            + "<button type=\"button\" class=\"btn btn-light\">Light</button>\n"
            + "<button type=\"button\" class=\"btn btn-dark\">Dark</button>",
            "<div class=\"card\" style=\"width: 18rem;\">\n"
            + "    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n"
            + "    <div class=\"card-body\">\n"
            + "        <h5 class=\"card-title\">Tiêu đề thẻ</h5>\n"
            + "        <p class=\"card-text\">Nội dung mẫu của thẻ.</p>\n"
            + "        <a href=\"#\" class=\"btn btn-primary\">Xem thêm</a>\n"
            + "    </div>\n"
            + "</div>",
            "<form>\n"
            + "    <div class=\"mb-3\">\n"
            + "        <label for=\"exampleInputEmail1\" class=\"form-label\">Email</label>\n"
            + "        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\">\n"
            + "    </div>\n"
            + "    <div class=\"mb-3\">\n"
            + "        <label for=\"exampleInputPassword1\" class=\"form-label\">Mật khẩu</label>\n"
            + "        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n"
            + "    </div>\n"
            + "    <div class=\"mb-3 form-check\">\n"
            + "        <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n"
            + "        <label class=\"form-check-label\" for=\"exampleCheck1\">Ghi nhớ tôi</label>\n"
            + "    </div>\n"
            + "    <button type=\"submit\" class=\"btn btn-primary\">Đăng nhập</button>\n"
            + "</form>",
            "<div class=\"mt-3 mb-4 ms-2 me-5 p-3\">Margin và Padding</div>",
            "<p class=\"text-start\">Căn trái</p>\n"
            + "<p class=\"text-center\">Căn giữa</p>\n"
            + "<p class=\"text-end\">Căn phải</p>\n"
            + "<p class=\"text-primary\">Văn bản màu chính</p>\n"
            + "<p class=\"fw-bold\">In đậm</p>",
            "<div class=\"bg-primary p-3\">Nền chính</div>\n"
            + "<div class=\"bg-success p-3\">Nền thành công</div>\n"
            + "<div class=\"bg-danger p-3\">Nền nguy hiểm</div>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Bootstrap Demo</title>\n"
            + "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
            + "</head>\n"
            + "<body>\n"
            + "    <!-- Navigation -->\n"
            + "    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n"
            + "        <div class=\"container\">\n"
            + "            <a class=\"navbar-brand\" href=\"#\">My Website</a>\n"
            + "            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n"
            + "                <span class=\"navbar-toggler-icon\"></span>\n"
            + "            </button>\n"
            + "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n"
            + "                <ul class=\"navbar-nav ms-auto\">\n"
            + "                    <li class=\"nav-item\">\n"
            + "                        <a class=\"nav-link active\" href=\"#\">Home</a>\n"
            + "                    </li>\n"
            + "                    <li class=\"nav-item\">\n"
            + "                        <a class=\"nav-link\" href=\"#\">About</a>\n"
            + "                    </li>\n"
            + "                    <li class=\"nav-item\">\n"
            + "                        <a class=\"nav-link\" href=\"#\">Services</a>\n"
            + "                    </li>\n"
            + "                    <li class=\"nav-item\">\n"
            + "                        <a class=\"nav-link\" href=\"#\">Contact</a>\n"
            + "                    </li>\n"
            + "                </ul>\n"
            + "            </div>\n"
            + "        </div>\n"
            + "    </nav>\n"
            + "\n"
            + "    <!-- Hero Section -->\n"
            + "    <div class=\"bg-primary text-white py-5\">\n"
            + "        <div class=\"container text-center\">\n"
            + "            <h1 class=\"display-4\">Welcome to Bootstrap</h1>\n"
            + "            <p class=\"lead\">Build responsive, mobile-first projects on the web</p>\n"
            + "            <button class=\"btn btn-light btn-lg\">Learn More</button>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "\n"
            + "    <!-- Content Section -->\n"
            + "    <div class=\"container my-5\">\n"
            + "        <div class=\"row\">\n"
            + "            <div class=\"col-md-4 mb-4\">\n"
            + "                <div class=\"card\">\n"
            + "                    <div class=\"card-body\">\n"
            + "                        <h5 class=\"card-title\">Feature One</h5>\n"
            + "                        <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n"
            + "                        <a href=\"#\" class=\"btn btn-primary\">View Details</a>\n"
            + "                    </div>\n"
            + "                </div>\n"
            + "            </div>\n"
            + "            <div class=\"col-md-4 mb-4\">\n"
            + "                <div class=\"card\">\n"
            + "                    <div class=\"card-body\">\n"
            + "                        <h5 class=\"card-title\">Feature Two</h5>\n"
            + "                        <p class=\"card-text\">Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n"
            + "                        <a href=\"#\" class=\"btn btn-primary\">View Details</a>\n"
            + "                    </div>\n"
            + "                </div>\n"
            + "            </div>\n"
            + "            <div class=\"col-md-4 mb-4\">\n"
            + "                <div class=\"card\">\n"
            + "                    <div class=\"card-body\">\n"
            + "                        <h5 class=\"card-title\">Feature Three</h5>\n"
            + "                        <p class=\"card-text\">Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>\n"
            + "                        <a href=\"#\" class=\"btn btn-primary\">View Details</a>\n"
            + "                    </div>\n"
            + "                </div>\n"
            + "            </div>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "\n"
            + "    <!-- Footer -->\n"
            + "    <footer class=\"bg-dark text-white py-4\">\n"
            + "        <div class=\"container text-center\">\n"
            + "            <p>&copy; 2023 My Website. All rights reserved.</p>\n"
            + "        </div>\n"
            + "    </footer>\n"
            + "\n"
            + "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "/* Ghi đè CSS */\n"
            + ".btn-primary {\n"
            + "    background-color: #ff5722;\n"
            + "    border-color: #ff5722;\n"
            + "}\n"
            + "\n"
            + ".navbar {\n"
            + "    box-shadow: 0 2px 4px rgba(0,0,0,.1);\n"
            + "}"
        });

        Code_MAP.put("Tailwind CSS", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Tailwind CDN</title>\n"
            + "  <script src=\"https://cdn.tailwindcss.com\"></script>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <h1 class=\"text-3xl font-bold text-blue-600\">Hello Tailwind!</h1>\n"
            + "</body>\n"
            + "</html>",
            "npm install -D tailwindcss\n"
            + "npx tailwindcss init",
            "npx tailwindcss -i ./src/input.css -o ./dist/output.css --watch",
            "<h1 class=\"text-4xl font-bold tracking-tight text-gray-900 sm:text-5xl\">\n"
            + "  Welcome to Tailwind CSS\n"
            + "</h1>\n"
            + "<p class=\"mt-6 text-lg leading-8 text-gray-600\">\n"
            + "  A utility-first CSS framework packed with classes like flex, pt-4, text-center and rotate-90.\n"
            + "</p>",
            "<div class=\"bg-blue-500 text-white p-4 rounded-lg\">\n"
            + "  This is a blue box with white text\n"
            + "</div>",
            "<div class=\"p-4 m-4 bg-green-100\">\n"
            + "  <p class=\"mb-2\">Item 1</p>\n"
            + "  <p class=\"mt-2\">Item 2</p>\n"
            + "</div>",
            "<div class=\"flex justify-between items-center p-4 bg-gray-100\">\n"
            + "  <div>Logo</div>\n"
            + "  <div class=\"flex space-x-4\">\n"
            + "    <a href=\"#\" class=\"text-blue-600\">Home</a>\n"
            + "    <a href=\"#\" class=\"text-blue-600\">About</a>\n"
            + "    <a href=\"#\" class=\"text-blue-600\">Contact</a>\n"
            + "  </div>\n"
            + "</div>",
            "<div class=\"grid grid-cols-3 gap-4\">\n"
            + "  <div class=\"bg-red-100 p-4\">1</div>\n"
            + "  <div class=\"bg-red-200 p-4\">2</div>\n"
            + "  <div class=\"bg-red-300 p-4\">3</div>\n"
            + "</div>",
            "<div class=\"bg-blue-500 md:bg-green-500 lg:bg-red-500 p-4\">\n"
            + "  This box changes color based on screen size\n"
            + "</div>",
            "<button class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\">\n"
            + "  Click me\n"
            + "</button>\n"
            + "\n"
            + "<input class=\"border-2 border-gray-300 focus:border-blue-500 rounded p-2\" placeholder=\"Focus me\">",
            "module.exports = {\n"
            + "  content: [\"./src/**/*.{html,js}\"],\n"
            + "  theme: {\n"
            + "    extend: {\n"
            + "      colors: {\n"
            + "        'primary': '#1DA1F2',\n"
            + "      },\n"
            + "    },\n"
            + "  },\n"
            + "  plugins: [],\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Tailwind Example</title>\n"
            + "  <script src=\"https://cdn.tailwindcss.com\"></script>\n"
            + "</head>\n"
            + "<body class=\"bg-gray-100\">\n"
            + "  <nav class=\"bg-white shadow-lg\">\n"
            + "    <div class=\"max-w-6xl mx-auto px-4\">\n"
            + "      <div class=\"flex justify-between\">\n"
            + "        <div class=\"flex space-x-7\">\n"
            + "          <a href=\"#\" class=\"flex items-center py-4 px-2\">\n"
            + "            <span class=\"font-semibold text-gray-500 text-lg\">Tailwind CSS</span>\n"
            + "          </a>\n"
            + "        </div>\n"
            + "        <div class=\"hidden md:flex items-center space-x-1\">\n"
            + "          <a href=\"#\" class=\"py-4 px-2 text-green-500 border-b-4 border-green-500 font-semibold\">Home</a>\n"
            + "          <a href=\"#\" class=\"py-4 px-2 text-gray-500 font-semibold hover:text-green-500 transition duration-300\">Services</a>\n"
            + "          <a href=\"#\" class=\"py-4 px-2 text-gray-500 font-semibold hover:text-green-500 transition duration-300\">About</a>\n"
            + "          <a href=\"#\" class=\"py-4 px-2 text-gray-500 font-semibold hover:text-green-500 transition duration-300\">Contact</a>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </nav>\n"
            + "\n"
            + "  <main class=\"max-w-6xl mx-auto px-4 py-8\">\n"
            + "    <div class=\"bg-white rounded-lg shadow-md p-6\">\n"
            + "      <h1 class=\"text-3xl font-bold text-gray-800 mb-4\">Welcome to Tailwind CSS</h1>\n"
            + "      <p class=\"text-gray-600 mb-4\">\n"
            + "        Tailwind CSS is a highly customizable, low-level CSS framework that gives you all of the building blocks you need to build bespoke designs.\n"
            + "      </p>\n"
            + "      <button class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\">\n"
            + "        Get Started\n"
            + "      </button>\n"
            + "    </div>\n"
            + "\n"
            + "    <div class=\"grid md:grid-cols-3 gap-6 mt-8\">\n"
            + "      <div class=\"bg-white rounded-lg shadow-md p-6\">\n"
            + "        <h2 class=\"text-xl font-semibold text-gray-800 mb-2\">Utility-First</h2>\n"
            + "        <p class=\"text-gray-600\">Build complex components from a constrained set of primitive utilities.</p>\n"
            + "      </div>\n"
            + "      <div class=\"bg-white rounded-lg shadow-md p-6\">\n"
            + "        <h2 class=\"text-xl font-semibold text-gray-800 mb-2\">Responsive</h2>\n"
            + "        <p class=\"text-gray-600\">Every utility class can be conditionally applied at different breakpoints.</p>\n"
            + "      </div>\n"
            + "      <div class=\"bg-white rounded-lg shadow-md p-6\">\n"
            + "        <h2 class=\"text-xl font-semibold text-gray-800 mb-2\">Customizable</h2>\n"
            + "        <p class=\"text-gray-600\">Tailwind is designed to be customized to match your design.</p>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </main>\n"
            + "\n"
            + "  <footer class=\"bg-gray-800 text-white py-8 mt-12\">\n"
            + "    <div class=\"max-w-6xl mx-auto px-4\">\n"
            + "      <div class=\"flex flex-col md:flex-row justify-between\">\n"
            + "        <div class=\"mb-4 md:mb-0\">\n"
            + "          <h3 class=\"text-xl font-bold\">Tailwind CSS</h3>\n"
            + "          <p class=\"mt-2 text-gray-400\">A utility-first CSS framework</p>\n"
            + "        </div>\n"
            + "        <div class=\"grid grid-cols-2 gap-8\">\n"
            + "          <div>\n"
            + "            <h4 class=\"text-lg font-semibold mb-4\">Links</h4>\n"
            + "            <ul class=\"space-y-2\">\n"
            + "              <li><a href=\"#\" class=\"text-gray-400 hover:text-white\">Documentation</a></li>\n"
            + "              <li><a href=\"#\" class=\"text-gray-400 hover:text-white\">Components</a></li>\n"
            + "            </ul>\n"
            + "          </div>\n"
            + "          <div>\n"
            + "            <h4 class=\"text-lg font-semibold mb-4\">Community</h4>\n"
            + "            <ul class=\"space-y-2\">\n"
            + "              <li><a href=\"#\" class=\"text-gray-400 hover:text-white\">GitHub</a></li>\n"
            + "              <li><a href=\"#\" class=\"text-gray-400 hover:text-white\">Twitter</a></li>\n"
            + "            </ul>\n"
            + "          </div>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "  </footer>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("ARIA Roles", new String[]{
            "<div role=\"navigation\">...</div>",
            "<header role=\"banner\">...</header>\n"
            + "<nav role=\"navigation\">...</nav>\n"
            + "<main role=\"main\">...</main>\n"
            + "<aside role=\"complementary\">...</aside>\n"
            + "<footer role=\"contentinfo\">...</footer>",
            "<button role=\"button\">Click me</button>\n"
            + "<div role=\"checkbox\" aria-checked=\"false\">Option</div>\n"
            + "<div role=\"slider\" aria-valuemin=\"0\" aria-valuemax=\"100\" aria-valuenow=\"50\"></div>",
            "<div role=\"article\">\n"
            + "  <h2 role=\"heading\" aria-level=\"2\">Article Title</h2>\n"
            + "  <p role=\"paragraph\">Article content...</p>\n"
            + "</div>",
            "<div role=\"alert\" aria-live=\"assertive\">Error message!</div>\n"
            + "<div role=\"status\" aria-live=\"polite\">Status updated</div>",
            "<!-- Không nên -->\n"
            + "<button role=\"button\">Click me</button>\n"
            + "\n"
            + "<!-- Nên -->\n"
            + "<button>Click me</button>",
            "<div role=\"tablist\">\n"
            + "  <div role=\"tab\" aria-selected=\"true\" aria-controls=\"panel1\">Tab 1</div>\n"
            + "  <div role=\"tab\" aria-selected=\"false\" aria-controls=\"panel2\">Tab 2</div>\n"
            + "</div>\n"
            + "<div role=\"tabpanel\" id=\"panel1\">Content 1</div>\n"
            + "<div role=\"tabpanel\" id=\"panel2\" hidden>Content 2</div>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <title>ARIA Roles Example</title>\n"
            + "  <style>\n"
            + "    [role=\"tab\"] {\n"
            + "      padding: 10px;\n"
            + "      background: #eee;\n"
            + "      cursor: pointer;\n"
            + "      display: inline-block;\n"
            + "    }\n"
            + "    [role=\"tab\"][aria-selected=\"true\"] {\n"
            + "      background: #ccc;\n"
            + "    }\n"
            + "    [role=\"tabpanel\"] {\n"
            + "      padding: 20px;\n"
            + "      border: 1px solid #ccc;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <header role=\"banner\">\n"
            + "    <h1>Website Title</h1>\n"
            + "    <nav role=\"navigation\">\n"
            + "      <ul>\n"
            + "        <li><a href=\"#\">Home</a></li>\n"
            + "        <li><a href=\"#\">About</a></li>\n"
            + "      </ul>\n"
            + "    </nav>\n"
            + "  </header>\n"
            + "\n"
            + "  <main role=\"main\">\n"
            + "    <div role=\"tablist\">\n"
            + "      <div role=\"tab\" aria-selected=\"true\" aria-controls=\"panel1\" tabindex=\"0\">Tab 1</div>\n"
            + "      <div role=\"tab\" aria-selected=\"false\" aria-controls=\"panel2\" tabindex=\"0\">Tab 2</div>\n"
            + "    </div>\n"
            + "    \n"
            + "    <div role=\"tabpanel\" id=\"panel1\">\n"
            + "      <h2>Content for Tab 1</h2>\n"
            + "      <p>This is the content for the first tab.</p>\n"
            + "    </div>\n"
            + "    \n"
            + "    <div role=\"tabpanel\" id=\"panel2\" hidden>\n"
            + "      <h2>Content for Tab 2</h2>\n"
            + "      <p>This is the content for the second tab.</p>\n"
            + "    </div>\n"
            + "  </main>\n"
            + "\n"
            + "  <aside role=\"complementary\">\n"
            + "    <h2>Related Links</h2>\n"
            + "    <ul>\n"
            + "      <li><a href=\"#\">Link 1</a></li>\n"
            + "    </ul>\n"
            + "  </aside>\n"
            + "\n"
            + "  <footer role=\"contentinfo\">\n"
            + "    <p>&copy; 2023 Company Name</p>\n"
            + "  </footer>\n"
            + "\n"
            + "  <script>\n"
            + "    const tabs = document.querySelectorAll('[role=\"tab\"]');\n"
            + "    \n"
            + "    tabs.forEach(tab => {\n"
            + "      tab.addEventListener('click', () => {\n"
            + "        // Reset all tabs\n"
            + "        tabs.forEach(t => {\n"
            + "          t.setAttribute('aria-selected', 'false');\n"
            + "          document.getElementById(t.getAttribute('aria-controls')).hidden = true;\n"
            + "        });\n"
            + "        \n"
            + "        // Set current tab\n"
            + "        tab.setAttribute('aria-selected', 'true');\n"
            + "        document.getElementById(tab.getAttribute('aria-controls')).hidden = false;\n"
            + "      });\n"
            + "    });\n"
            + "  </script>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Keyboard Navigation", new String[]{
            "/* Ví dụ focus style cơ bản */\n"
            + "button:focus, a:focus, input:focus {\n"
            + "  outline: 2px solid #4D90FE;\n"
            + "  outline-offset: 2px;\n"
            + "}\n"
            + "\n"
            + "/* Hoặc thay thế outline bằng box-shadow */\n"
            + "button:focus {\n"
            + "  outline: none;\n"
            + "  box-shadow: 0 0 0 3px rgba(77, 144, 254, 0.5);\n"
            + "}",
            "<div role=\"button\" tabindex=\"0\">Custom Button</div>\n"
            + "<div role=\"menu\">\n"
            + "  <div role=\"menuitem\" tabindex=\"0\">Item 1</div>\n"
            + "  <div role=\"menuitem\" tabindex=\"-1\">Item 2</div>\n"
            + "</div>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Keyboard Navigation Demo</title>\n"
            + "  <style>\n"
            + "    *:focus {\n"
            + "      outline: 3px solid #0066ff;\n"
            + "      outline-offset: 2px;\n"
            + "    }\n"
            + "    \n"
            + "    body {\n"
            + "      font-family: Arial, sans-serif;\n"
            + "      max-width: 800px;\n"
            + "      margin: 0 auto;\n"
            + "      padding: 20px;\n"
            + "    }\n"
            + "    \n"
            + "    .skip-link {\n"
            + "      position: absolute;\n"
            + "      left: -9999px;\n"
            + "      top: 0;\n"
            + "      background: #000;\n"
            + "      color: white;\n"
            + "      padding: 10px;\n"
            + "    }\n"
            + "    \n"
            + "    .skip-link:focus {\n"
            + "      left: 0;\n"
            + "    }\n"
            + "    \n"
            + "    nav ul {\n"
            + "      display: flex;\n"
            + "      list-style: none;\n"
            + "      padding: 0;\n"
            + "    }\n"
            + "    \n"
            + "    nav li {\n"
            + "      margin-right: 10px;\n"
            + "    }\n"
            + "    \n"
            + "    nav a {\n"
            + "      padding: 5px 10px;\n"
            + "      background: #eee;\n"
            + "      text-decoration: none;\n"
            + "    }\n"
            + "    \n"
            + "    .custom-button {\n"
            + "      display: inline-block;\n"
            + "      padding: 10px 15px;\n"
            + "      background: #0066cc;\n"
            + "      color: white;\n"
            + "      cursor: pointer;\n"
            + "    }\n"
            + "    \n"
            + "    .tab-list {\n"
            + "      display: flex;\n"
            + "      list-style: none;\n"
            + "      padding: 0;\n"
            + "      border-bottom: 1px solid #ccc;\n"
            + "    }\n"
            + "    \n"
            + "    .tab-item {\n"
            + "      padding: 10px 20px;\n"
            + "      border: 1px solid #ccc;\n"
            + "      margin-right: 5px;\n"
            + "      background: #f1f1f1;\n"
            + "    }\n"
            + "    \n"
            + "    .tab-item[aria-selected=\"true\"] {\n"
            + "      background: white;\n"
            + "      border-bottom: 1px solid white;\n"
            + "    }\n"
            + "    \n"
            + "    .tab-panel {\n"
            + "      padding: 20px;\n"
            + "      border: 1px solid #ccc;\n"
            + "      border-top: none;\n"
            + "      display: none;\n"
            + "    }\n"
            + "    \n"
            + "    .tab-panel[aria-hidden=\"false\"] {\n"
            + "      display: block;\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <!-- Skip link để nhảy đến nội dung chính -->\n"
            + "  <a href=\"#main-content\" class=\"skip-link\">Skip to main content</a>\n"
            + "  \n"
            + "  <header>\n"
            + "    <h1>Keyboard Navigation Demo</h1>\n"
            + "    <nav aria-label=\"Main navigation\">\n"
            + "      <ul>\n"
            + "        <li><a href=\"#section1\">Section 1</a></li>\n"
            + "        <li><a href=\"#section2\">Section 2</a></li>\n"
            + "        <li><a href=\"#section3\">Section 3</a></li>\n"
            + "      </ul>\n"
            + "    </nav>\n"
            + "  </header>\n"
            + "  \n"
            + "  <main id=\"main-content\">\n"
            + "    <section id=\"section1\">\n"
            + "      <h2>Section 1: Basic Navigation</h2>\n"
            + "      <p>Try tabbing through these elements:</p>\n"
            + "      <a href=\"#\">Regular link</a>\n"
            + "      <button>Standard button</button>\n"
            + "      <input type=\"text\" placeholder=\"Text input\">\n"
            + "      <div class=\"custom-button\" tabindex=\"0\">Custom button (div with tabindex)</div>\n"
            + "    </section>\n"
            + "    \n"
            + "    <section id=\"section2\">\n"
            + "      <h2>Section 2: Custom Tab Component</h2>\n"
            + "      <div class=\"tabs\">\n"
            + "        <ul class=\"tab-list\" role=\"tablist\">\n"
            + "          <li class=\"tab-item\" role=\"tab\" aria-selected=\"true\" tabindex=\"0\" aria-controls=\"tab1\">Tab 1</li>\n"
            + "          <li class=\"tab-item\" role=\"tab\" aria-selected=\"false\" tabindex=\"-1\" aria-controls=\"tab2\">Tab 2</li>\n"
            + "          <li class=\"tab-item\" role=\"tab\" aria-selected=\"false\" tabindex=\"-1\" aria-controls=\"tab3\">Tab 3</li>\n"
            + "        </ul>\n"
            + "        \n"
            + "        <div id=\"tab1\" class=\"tab-panel\" role=\"tabpanel\" aria-hidden=\"false\">\n"
            + "          <h3>Tab 1 Content</h3>\n"
            + "          <p>This is the content for tab 1.</p>\n"
            + "        </div>\n"
            + "        \n"
            + "        <div id=\"tab2\" class=\"tab-panel\" role=\"tabpanel\" aria-hidden=\"true\">\n"
            + "          <h3>Tab 2 Content</h3>\n"
            + "          <p>This is the content for tab 2.</p>\n"
            + "        </div>\n"
            + "        \n"
            + "        <div id=\"tab3\" class=\"tab-panel\" role=\"tabpanel\" aria-hidden=\"true\">\n"
            + "          <h3>Tab 3 Content</h3>\n"
            + "          <p>This is the content for tab 3.</p>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </section>\n"
            + "    \n"
            + "    <section id=\"section3\">\n"
            + "      <h2>Section 3: Modal Dialog</h2>\n"
            + "      <button id=\"open-modal\" aria-haspopup=\"dialog\">Open Modal</button>\n"
            + "      \n"
            + "      <div id=\"modal\" role=\"dialog\" aria-labelledby=\"modal-title\" aria-modal=\"true\" hidden>\n"
            + "        <div class=\"modal-content\">\n"
            + "          <h3 id=\"modal-title\">Modal Dialog</h3>\n"
            + "          <p>This is a modal dialog. Press Escape to close or tab to focusable elements.</p>\n"
            + "          <button id=\"close-modal\">Close</button>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </section>\n"
            + "  </main>\n"
            + "  \n"
            + "  <script>\n"
            + "    // Tab component functionality\n"
            + "    const tabs = document.querySelectorAll('[role=\"tab\"]');\n"
            + "    const tabPanels = document.querySelectorAll('[role=\"tabpanel\"]');\n"
            + "    \n"
            + "    tabs.forEach(tab => {\n"
            + "      tab.addEventListener('click', e => {\n"
            + "        setActiveTab(e.target);\n"
            + "      });\n"
            + "      \n"
            + "      tab.addEventListener('keydown', e => {\n"
            + "        // Handle arrow key navigation between tabs\n"
            + "        if (e.key === 'ArrowRight' || e.key === 'ArrowLeft') {\n"
            + "          const direction = e.key === 'ArrowRight' ? 1 : -1;\n"
            + "          const nextIndex = (Array.from(tabs).indexOf(e.target) + direction + tabs.length) % tabs.length;\n"
            + "          tabs[nextIndex].focus();\n"
            + "        } else if (e.key === 'Home') {\n"
            + "          tabs[0].focus();\n"
            + "        } else if (e.key === 'End') {\n"
            + "          tabs[tabs.length - 1].focus();\n"
            + "        } else if (e.key === 'Enter' || e.key === ' ') {\n"
            + "          e.preventDefault();\n"
            + "          setActiveTab(e.target);\n"
            + "        }\n"
            + "      });\n"
            + "    });\n"
            + "    \n"
            + "    function setActiveTab(activeTab) {\n"
            + "      tabs.forEach(tab => {\n"
            + "        const isSelected = tab === activeTab;\n"
            + "        tab.setAttribute('aria-selected', isSelected);\n"
            + "        tab.setAttribute('tabindex', isSelected ? '0' : '-1');\n"
            + "      });\n"
            + "      \n"
            + "      tabPanels.forEach(panel => {\n"
            + "        panel.setAttribute('aria-hidden', panel.id !== activeTab.getAttribute('aria-controls'));\n"
            + "      });\n"
            + "    }\n"
            + "    \n"
            + "    // Modal functionality\n"
            + "    const modal = document.getElementById('modal');\n"
            + "    const openModalBtn = document.getElementById('open-modal');\n"
            + "    const closeModalBtn = document.getElementById('close-modal');\n"
            + "    \n"
            + "    openModalBtn.addEventListener('click', () => {\n"
            + "      modal.hidden = false;\n"
            + "      closeModalBtn.focus();\n"
            + "    });\n"
            + "    \n"
            + "    closeModalBtn.addEventListener('click', () => {\n"
            + "      modal.hidden = true;\n"
            + "      openModalBtn.focus();\n"
            + "    });\n"
            + "    \n"
            + "    modal.addEventListener('keydown', e => {\n"
            + "      if (e.key === 'Escape') {\n"
            + "        modal.hidden = true;\n"
            + "        openModalBtn.focus();\n"
            + "      }\n"
            + "      \n"
            + "      // Trap focus inside modal\n"
            + "      if (e.key === 'Tab') {\n"
            + "        const focusableElements = modal.querySelectorAll('button, [href], input, select, textarea, [tabindex]:not([tabindex=\"-1\"])');\n"
            + "        const firstElement = focusableElements[0];\n"
            + "        const lastElement = focusableElements[focusableElements.length - 1];\n"
            + "        \n"
            + "        if (e.shiftKey && document.activeElement === firstElement) {\n"
            + "          lastElement.focus();\n"
            + "          e.preventDefault();\n"
            + "        } else if (!e.shiftKey && document.activeElement === lastElement) {\n"
            + "          firstElement.focus();\n"
            + "          e.preventDefault();\n"
            + "        }\n"
            + "      }\n"
            + "    });\n"
            + "  </script>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"vi\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Dark Mode Accessible</title>\n"
            + "    <style>\n"
            + "        :root {\n"
            + "            --text-color: #333;\n"
            + "            --bg-color: #fff;\n"
            + "            --link-color: #0066cc;\n"
            + "            --heading-color: #222;\n"
            + "        }\n"
            + "\n"
            + "        [data-theme=\"dark\"] {\n"
            + "            --text-color: #e0e0e0;\n"
            + "            --bg-color: #121212;\n"
            + "            --link-color: #9bb9ff;\n"
            + "            --heading-color: #ffffff;\n"
            + "        }\n"
            + "\n"
            + "        body {\n"
            + "            background-color: var(--bg-color);\n"
            + "            color: var(--text-color);\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            line-height: 1.6;\n"
            + "            transition: background-color 0.3s ease, color 0.3s ease;\n"
            + "        }\n"
            + "\n"
            + "        a {\n"
            + "            color: var(--link-color);\n"
            + "        }\n"
            + "\n"
            + "        h1, h2, h3 {\n"
            + "            color: var(--heading-color);\n"
            + "        }\n"
            + "\n"
            + "        .theme-toggle {\n"
            + "            position: fixed;\n"
            + "            top: 20px;\n"
            + "            right: 20px;\n"
            + "            padding: 10px;\n"
            + "            background: var(--bg-color);\n"
            + "            color: var(--text-color);\n"
            + "            border: 1px solid var(--text-color);\n"
            + "            border-radius: 5px;\n"
            + "            cursor: pointer;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <button class=\"theme-toggle\" aria-label=\"Chuyển đổi chế độ sáng/tối\">Chế độ tối</button>\n"
            + "    \n"
            + "    <h1>Trang web hỗ trợ Dark Mode</h1>\n"
            + "    <p>Ví dụ về trang web hỗ trợ chế độ tối với khả năng tiếp cận.</p>\n"
            + "    <a href=\"#\">Liên kết ví dụ</a>\n"
            + "\n"
            + "    <script>\n"
            + "        const toggle = document.querySelector('.theme-toggle');\n"
            + "        const prefersDarkScheme = window.matchMedia('(prefers-color-scheme: dark)');\n"
            + "\n"
            + "        // Kiểm tra cài đặt hệ thống\n"
            + "        if (prefersDarkScheme.matches) {\n"
            + "            document.body.setAttribute('data-theme', 'dark');\n"
            + "            toggle.textContent = 'Chế độ sáng';\n"
            + "        }\n"
            + "\n"
            + "        // Bắt sự kiện thay đổi hệ thống\n"
            + "        prefersDarkScheme.addListener(e => {\n"
            + "            if (e.matches) {\n"
            + "                document.body.setAttribute('data-theme', 'dark');\n"
            + "                toggle.textContent = 'Chế độ sáng';\n"
            + "            } else {\n"
            + "                document.body.removeAttribute('data-theme');\n"
            + "                toggle.textContent = 'Chế độ tối';\n"
            + "            }\n"
            + "        });\n"
            + "\n"
            + "        // Bắt sự kiện click nút\n"
            + "        toggle.addEventListener('click', () => {\n"
            + "            if (document.body.hasAttribute('data-theme')) {\n"
            + "                document.body.removeAttribute('data-theme');\n"
            + "                toggle.textContent = 'Chế độ tối';\n"
            + "            } else {\n"
            + "                document.body.setAttribute('data-theme', 'dark');\n"
            + "                toggle.textContent = 'Chế độ sáng';\n"
            + "            }\n"
            + "        });\n"
            + "    </script>\n"
            + "</body>\n"
            + "</html>",
            "[data-theme=\"dark\"] {\n"
            + "    --text-color: #f0f0f0;  /* Thay vì #e0e0e0 để tăng tương phản */\n"
            + "    --bg-color: #121212;\n"
            + "    --link-color: #7fa4ff;  /* Màu sáng hơn để tương phản tốt hơn */\n"
            + "}",
            "a {\n"
            + "    color: var(--link-color);\n"
            + "    text-decoration: underline;\n"
            + "    text-underline-offset: 0.2em;\n"
            + "}\n"
            + "\n"
            + "[data-theme=\"dark\"] a {\n"
            + "    text-decoration-thickness: 2px;\n"
            + "}",
            "body {\n"
            + "    transition: background-color 0.5s ease, color 0.5s ease;\n"
            + "}\n"
            + "\n"
            + "img, video {\n"
            + "    filter: brightness(0.9) contrast(1.1);\n"
            + "}\n"
            + "\n"
            + "[data-theme=\"dark\"] img, [data-theme=\"dark\"] video {\n"
            + "    filter: brightness(0.8) contrast(1.2);\n"
            + "}",
            "// Kiểm tra localStorage cho tùy chọn người dùng\n"
            + "const currentTheme = localStorage.getItem('theme');\n"
            + "if (currentTheme) {\n"
            + "    document.body.setAttribute('data-theme', currentTheme);\n"
            + "    toggle.textContent = currentTheme === 'dark' ? 'Chế độ sáng' : 'Chế độ tối';\n"
            + "} else if (prefersDarkScheme.matches) {\n"
            + "    document.body.setAttribute('data-theme', 'dark');\n"
            + "    toggle.textContent = 'Chế độ sáng';\n"
            + "}\n"
            + "\n"
            + "// Cập nhật localStorage khi thay đổi\n"
            + "toggle.addEventListener('click', () => {\n"
            + "    if (document.body.hasAttribute('data-theme')) {\n"
            + "        document.body.removeAttribute('data-theme');\n"
            + "        toggle.textContent = 'Chế độ tối';\n"
            + "        localStorage.setItem('theme', 'light');\n"
            + "    } else {\n"
            + "        document.body.setAttribute('data-theme', 'dark');\n"
            + "        toggle.textContent = 'Chế độ sáng';\n"
            + "        localStorage.setItem('theme', 'dark');\n"
            + "    }\n"
            + "});",
            "<button class=\"theme-toggle\" aria-pressed=\"false\" aria-label=\"Chuyển đổi giữa chế độ sáng và tối\">\n"
            + "    <span class=\"theme-icon\" aria-hidden=\"true\">🌙</span>\n"
            + "    <span class=\"theme-text\">Chế độ tối</span>\n"
            + "</button>",
            "// Cập nhật aria-pressed khi thay đổi\n"
            + "toggle.setAttribute('aria-pressed', document.body.hasAttribute('data-theme'));"
        });

        Code_MAP.put("Tạo hình ảnh bằng CSS", new String[]{
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .square {\n"
            + "    width: 100px;\n"
            + "    height: 100px;\n"
            + "    background-color: #ff5733;\n"
            + "  }\n"
            + "  \n"
            + "  .circle {\n"
            + "    width: 100px;\n"
            + "    height: 100px;\n"
            + "    background-color: #33ff57;\n"
            + "    border-radius: 50%;\n"
            + "  }\n"
            + "  \n"
            + "  .triangle {\n"
            + "    width: 0;\n"
            + "    height: 0;\n"
            + "    border-left: 50px solid transparent;\n"
            + "    border-right: 50px solid transparent;\n"
            + "    border-bottom: 100px solid #5733ff;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"square\"></div>\n"
            + "  <div class=\"circle\"></div>\n"
            + "  <div class=\"triangle\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .heart {\n"
            + "    position: relative;\n"
            + "    width: 100px;\n"
            + "    height: 90px;\n"
            + "  }\n"
            + "  \n"
            + "  .heart:before, .heart:after {\n"
            + "    position: absolute;\n"
            + "    content: \"\";\n"
            + "    left: 50px;\n"
            + "    top: 0;\n"
            + "    width: 50px;\n"
            + "    height: 80px;\n"
            + "    background: red;\n"
            + "    border-radius: 50px 50px 0 0;\n"
            + "    transform: rotate(-45deg);\n"
            + "    transform-origin: 0 100%;\n"
            + "  }\n"
            + "  \n"
            + "  .heart:after {\n"
            + "    left: 0;\n"
            + "    transform: rotate(45deg);\n"
            + "    transform-origin: 100% 100%;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"heart\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .gradient-circle {\n"
            + "    width: 200px;\n"
            + "    height: 200px;\n"
            + "    border-radius: 50%;\n"
            + "    background: radial-gradient(circle at center, #ff0000, #0000ff);\n"
            + "  }\n"
            + "  \n"
            + "  .gradient-square {\n"
            + "    width: 200px;\n"
            + "    height: 200px;\n"
            + "    background: linear-gradient(45deg, #ff0000, #00ff00, #0000ff);\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"gradient-circle\"></div>\n"
            + "  <div class=\"gradient-square\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .loading-spinner {\n"
            + "    width: 50px;\n"
            + "    height: 50px;\n"
            + "    border: 5px solid #f3f3f3;\n"
            + "    border-top: 5px solid #3498db;\n"
            + "    border-radius: 50%;\n"
            + "    animation: spin 1s linear infinite;\n"
            + "  }\n"
            + "  \n"
            + "  @keyframes spin {\n"
            + "    0% { transform: rotate(0deg); }\n"
            + "    100% { transform: rotate(360deg); }\n"
            + "  }\n"
            + "  \n"
            + "  .pulse {\n"
            + "    width: 50px;\n"
            + "    height: 50px;\n"
            + "    background-color: #e74c3c;\n"
            + "    border-radius: 50%;\n"
            + "    animation: pulse 1.5s infinite;\n"
            + "  }\n"
            + "  \n"
            + "  @keyframes pulse {\n"
            + "    0% { transform: scale(1); opacity: 1; }\n"
            + "    50% { transform: scale(1.2); opacity: 0.7; }\n"
            + "    100% { transform: scale(1); opacity: 1; }\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"loading-spinner\"></div>\n"
            + "  <div class=\"pulse\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .yin-yang {\n"
            + "    width: 96px;\n"
            + "    height: 48px;\n"
            + "    background: #fff;\n"
            + "    border-color: #000;\n"
            + "    border-style: solid;\n"
            + "    border-width: 2px 2px 50px 2px;\n"
            + "    border-radius: 100%;\n"
            + "    position: relative;\n"
            + "  }\n"
            + "  \n"
            + "  .yin-yang:before {\n"
            + "    content: \"\";\n"
            + "    position: absolute;\n"
            + "    top: 50%;\n"
            + "    left: 0;\n"
            + "    background: #fff;\n"
            + "    border: 18px solid #000;\n"
            + "    border-radius: 100%;\n"
            + "    width: 12px;\n"
            + "    height: 12px;\n"
            + "  }\n"
            + "  \n"
            + "  .yin-yang:after {\n"
            + "    content: \"\";\n"
            + "    position: absolute;\n"
            + "    top: 50%;\n"
            + "    left: 50%;\n"
            + "    background: #000;\n"
            + "    border: 18px solid #fff;\n"
            + "    border-radius: 100%;\n"
            + "    width: 12px;\n"
            + "    height: 12px;\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"yin-yang\"></div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<style>\n"
            + "  .star {\n"
            + "    width: 100px;\n"
            + "    height: 100px;\n"
            + "    background-color: gold;\n"
            + "    clip-path: polygon(\n"
            + "      50% 0%, \n"
            + "      61% 35%, \n"
            + "      98% 35%, \n"
            + "      68% 57%, \n"
            + "      79% 91%, \n"
            + "      50% 70%, \n"
            + "      21% 91%, \n"
            + "      32% 57%, \n"
            + "      2% 35%, \n"
            + "      39% 35%\n"
            + "    );\n"
            + "  }\n"
            + "  \n"
            + "  .pentagon {\n"
            + "    width: 100px;\n"
            + "    height: 100px;\n"
            + "    background-color: #8a2be2;\n"
            + "    clip-path: polygon(\n"
            + "      50% 0%,\n"
            + "      100% 38%,\n"
            + "      82% 100%,\n"
            + "      18% 100%,\n"
            + "      0% 38%\n"
            + "    );\n"
            + "  }\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"star\"></div>\n"
            + "  <div class=\"pentagon\"></div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new String[]{
            ".box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: blue;\n"
            + "  transition: width 2s, height 2s, background 2s;\n"
            + "}\n"
            + "\n"
            + ".box:hover {\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "  background: red;\n"
            + "}",
            "@keyframes slidein {\n"
            + "  from {\n"
            + "    transform: translateX(0%);\n"
            + "  }\n"
            + "  to {\n"
            + "    transform: translateX(100%);\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".slider {\n"
            + "  animation: slidein 3s infinite alternate;\n"
            + "}",
            "@keyframes complex-animation {\n"
            + "  0% {\n"
            + "    transform: translateY(0) rotate(0deg);\n"
            + "    background: red;\n"
            + "    opacity: 1;\n"
            + "  }\n"
            + "  25% {\n"
            + "    transform: translateY(100px) rotate(90deg);\n"
            + "    background: yellow;\n"
            + "  }\n"
            + "  50% {\n"
            + "    transform: translateY(200px) rotate(180deg);\n"
            + "    background: green;\n"
            + "    opacity: 0.5;\n"
            + "  }\n"
            + "  75% {\n"
            + "    transform: translateY(100px) rotate(270deg);\n"
            + "    background: blue;\n"
            + "  }\n"
            + "  100% {\n"
            + "    transform: translateY(0) rotate(360deg);\n"
            + "    background: red;\n"
            + "    opacity: 1;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".complex-box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  animation: complex-animation 5s ease-in-out infinite;\n"
            + "}",
            "@keyframes move {\n"
            + "  0% { transform: translateX(0); }\n"
            + "  100% { transform: translateX(300px); }\n"
            + "}\n"
            + "\n"
            + "@keyframes color-change {\n"
            + "  0% { background: red; }\n"
            + "  50% { background: yellow; }\n"
            + "  100% { background: blue; }\n"
            + "}\n"
            + "\n"
            + ".multi-animation {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  animation: \n"
            + "    move 3s ease-in-out infinite alternate,\n"
            + "    color-change 6s linear infinite;\n"
            + "}",
            "@keyframes flip {\n"
            + "  0% { transform: perspective(500px) rotateY(0); }\n"
            + "  100% { transform: perspective(500px) rotateY(360deg); }\n"
            + "}\n"
            + "\n"
            + ".flip-box {\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "  background: linear-gradient(45deg, #ff0000, #0000ff);\n"
            + "  animation: flip 4s linear infinite;\n"
            + "  transform-style: preserve-3d;\n"
            + "}",
            ":root {\n"
            + "  --rotate-degree: 0;\n"
            + "  --scale-size: 1;\n"
            + "}\n"
            + "\n"
            + "@keyframes variable-animation {\n"
            + "  to {\n"
            + "    --rotate-degree: 360;\n"
            + "    --scale-size: 1.5;\n"
            + "  }\n"
            + "}\n"
            + "\n"
            + ".variable-box {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: purple;\n"
            + "  animation: variable-animation 2s infinite alternate;\n"
            + "  transform: \n"
            + "    rotate(calc(var(--rotate-degree) * 1deg)) \n"
            + "    scale(var(--scale-size));\n"
            + "}\n"
            + "\n"
            + "@property --rotate-degree {\n"
            + "  syntax: \"<number>\";\n"
            + "  inherits: false;\n"
            + "  initial-value: 0;\n"
            + "}\n"
            + "\n"
            + "@property --scale-size {\n"
            + "  syntax: \"<number>\";\n"
            + "  inherits: false;\n"
            + "  initial-value: 1;\n"
            + "}",
            "<svg width=\"200\" height=\"200\">\n"
            + "  <circle id=\"circle\" cx=\"100\" cy=\"100\" r=\"50\" fill=\"orange\" />\n"
            + "</svg>\n"
            + "\n"
            + "<style>\n"
            + "  @keyframes svg-animation {\n"
            + "    0% { r: 50; fill: orange; }\n"
            + "    50% { r: 70; fill: red; }\n"
            + "    100% { r: 50; fill: orange; }\n"
            + "  }\n"
            + "  \n"
            + "  #circle {\n"
            + "    animation: svg-animation 3s infinite;\n"
            + "  }\n"
            + "</style>",
            ".optimized-box {\n"
            + "  transform: translateZ(0); /* Kích hoạt GPU acceleration */\n"
            + "  will-change: transform, opacity;\n"
            + "}",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "  <meta charset=\"UTF-8\">\n"
            + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "  <title>Complex Spinner Animation</title>\n"
            + "  <style>\n"
            + "    .spinner-container {\n"
            + "      display: flex;\n"
            + "      justify-content: center;\n"
            + "      align-items: center;\n"
            + "      height: 100vh;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner {\n"
            + "      position: relative;\n"
            + "      width: 80px;\n"
            + "      height: 80px;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-dot {\n"
            + "      position: absolute;\n"
            + "      width: 16px;\n"
            + "      height: 16px;\n"
            + "      border-radius: 50%;\n"
            + "      background: #4285f4;\n"
            + "      animation: spinner 1.8s infinite ease-in-out both;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-dot:nth-child(1) {\n"
            + "      top: 0;\n"
            + "      left: 0;\n"
            + "      background: #4285f4;\n"
            + "      animation-delay: -0.32s;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-dot:nth-child(2) {\n"
            + "      top: 0;\n"
            + "      right: 0;\n"
            + "      background: #ea4335;\n"
            + "      animation-delay: -0.16s;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-dot:nth-child(3) {\n"
            + "      bottom: 0;\n"
            + "      right: 0;\n"
            + "      background: #fbbc05;\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-dot:nth-child(4) {\n"
            + "      bottom: 0;\n"
            + "      left: 0;\n"
            + "      background: #34a853;\n"
            + "      animation-delay: -0.48s;\n"
            + "    }\n"
            + "    \n"
            + "    @keyframes spinner {\n"
            + "      0%, 80%, 100% { \n"
            + "        transform: scale(0);\n"
            + "      } \n"
            + "      40% { \n"
            + "        transform: scale(1);\n"
            + "      }\n"
            + "    }\n"
            + "    \n"
            + "    .spinner-ring {\n"
            + "      position: absolute;\n"
            + "      width: 100%;\n"
            + "      height: 100%;\n"
            + "      border: 4px solid transparent;\n"
            + "      border-top-color: #6200ea;\n"
            + "      border-radius: 50%;\n"
            + "      animation: spin 1.5s linear infinite;\n"
            + "    }\n"
            + "    \n"
            + "    @keyframes spin {\n"
            + "      to { transform: rotate(360deg); }\n"
            + "    }\n"
            + "  </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "  <div class=\"spinner-container\">\n"
            + "    <div class=\"spinner\">\n"
            + "      <div class=\"spinner-dot\"></div>\n"
            + "      <div class=\"spinner-dot\"></div>\n"
            + "      <div class=\"spinner-dot\"></div>\n"
            + "      <div class=\"spinner-dot\"></div>\n"
            + "      <div class=\"spinner-ring\"></div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "</body>\n"
            + "</html>"
        });

        Code_MAP.put("CSS Art", new String[]{
            "<div class=\"circle\"></div>\n"
            + "<div class=\"triangle\"></div>\n"
            + "\n"
            + "<style>\n"
            + ".circle {\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: #ff6b6b;\n"
            + "  border-radius: 50%;\n"
            + "}\n"
            + "\n"
            + ".triangle {\n"
            + "  width: 0;\n"
            + "  height: 0;\n"
            + "  border-left: 50px solid transparent;\n"
            + "  border-right: 50px solid transparent;\n"
            + "  border-bottom: 100px solid #4ecdc4;\n"
            + "}\n"
            + "</style>",
            "<div class=\"smiley\"></div>\n"
            + "\n"
            + "<style>\n"
            + ".smiley {\n"
            + "  position: relative;\n"
            + "  width: 100px;\n"
            + "  height: 100px;\n"
            + "  background: #ffd166;\n"
            + "  border-radius: 50%;\n"
            + "}\n"
            + "\n"
            + ".smiley::before,\n"
            + ".smiley::after {\n"
            + "  content: '';\n"
            + "  position: absolute;\n"
            + "  background: #333;\n"
            + "  border-radius: 50%;\n"
            + "}\n"
            + "\n"
            + ".smiley::before {\n"
            + "  width: 20px;\n"
            + "  height: 20px;\n"
            + "  top: 30px;\n"
            + "  left: 20px;\n"
            + "}\n"
            + "\n"
            + ".smiley::after {\n"
            + "  width: 20px;\n"
            + "  height: 20px;\n"
            + "  top: 30px;\n"
            + "  right: 20px;\n"
            + "}\n"
            + "\n"
            + ".smiley {\n"
            + "  box-shadow: inset 0 -25px 0 0 #333;\n"
            + "  border-radius: 50% 50% 50% 50% / 60% 60% 40% 40%;\n"
            + "}\n"
            + "</style>",
            "<div class=\"sunset\"></div>\n"
            + "\n"
            + "<style>\n"
            + ".sunset {\n"
            + "  width: 200px;\n"
            + "  height: 150px;\n"
            + "  background: linear-gradient(\n"
            + "    to bottom,\n"
            + "    #ff9a9e 0%,\n"
            + "    #fad0c4 20%,\n"
            + "    #fbc2eb 40%,\n"
            + "    #a6c1ee 60%,\n"
            + "    #6b73c1 80%,\n"
            + "    #3b4d61 100%\n"
            + "  );\n"
            + "  border-radius: 10px;\n"
            + "}\n"
            + "</style>",
            "<div class=\"loading\"></div>\n"
            + "\n"
            + "<style>\n"
            + ".loading {\n"
            + "  width: 50px;\n"
            + "  height: 50px;\n"
            + "  border: 5px solid #f3f3f3;\n"
            + "  border-top: 5px solid #3498db;\n"
            + "  border-radius: 50%;\n"
            + "  animation: spin 1s linear infinite;\n"
            + "}\n"
            + "\n"
            + "@keyframes spin {\n"
            + "  0% { transform: rotate(0deg); }\n"
            + "  100% { transform: rotate(360deg); }\n"
            + "}\n"
            + "</style>",
            "<div class=\"moon-container\">\n"
            + "  <div class=\"moon\"></div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".moon-container {\n"
            + "  display: flex;\n"
            + "  justify-content: center;\n"
            + "  align-items: center;\n"
            + "  height: 300px;\n"
            + "  background: #0f2027;\n"
            + "  background: linear-gradient(to right, #0f2027, #203a43, #2c5364);\n"
            + "}\n"
            + "\n"
            + ".moon {\n"
            + "  width: 150px;\n"
            + "  height: 150px;\n"
            + "  border-radius: 50%;\n"
            + "  background: #f5f5f5;\n"
            + "  box-shadow: \n"
            + "    0 0 30px #fff,\n"
            + "    0 0 60px #fff,\n"
            + "    0 0 90px #fff;\n"
            + "  position: relative;\n"
            + "  animation: float 4s ease-in-out infinite;\n"
            + "}\n"
            + "\n"
            + ".moon::before {\n"
            + "  content: '';\n"
            + "  position: absolute;\n"
            + "  width: 120px;\n"
            + "  height: 120px;\n"
            + "  border-radius: 50%;\n"
            + "  background: #0f2027;\n"
            + "  top: 15px;\n"
            + "  left: -30px;\n"
            + "}\n"
            + "\n"
            + "@keyframes float {\n"
            + "  0%, 100% {\n"
            + "    transform: translateY(0);\n"
            + "  }\n"
            + "  50% {\n"
            + "    transform: translateY(-20px);\n"
            + "  }\n"
            + "}\n"
            + "</style>",
            "<div class=\"cat\">\n"
            + "  <div class=\"head\">\n"
            + "    <div class=\"ear left\"></div>\n"
            + "    <div class=\"ear right\"></div>\n"
            + "    <div class=\"face\">\n"
            + "      <div class=\"eye left\"></div>\n"
            + "      <div class=\"eye right\"></div>\n"
            + "      <div class=\"nose\"></div>\n"
            + "      <div class=\"mouth\"></div>\n"
            + "    </div>\n"
            + "  </div>\n"
            + "  <div class=\"body\"></div>\n"
            + "  <div class=\"tail\"></div>\n"
            + "</div>\n"
            + "\n"
            + "<style>\n"
            + ".cat {\n"
            + "  position: relative;\n"
            + "  width: 200px;\n"
            + "  height: 200px;\n"
            + "  margin: 50px auto;\n"
            + "}\n"
            + "\n"
            + ".head {\n"
            + "  width: 120px;\n"
            + "  height: 100px;\n"
            + "  background: #ffb347;\n"
            + "  border-radius: 60px 60px 50px 50px;\n"
            + "  position: relative;\n"
            + "  z-index: 2;\n"
            + "}\n"
            + "\n"
            + ".ear {\n"
            + "  width: 40px;\n"
            + "  height: 50px;\n"
            + "  background: #ffb347;\n"
            + "  position: absolute;\n"
            + "  top: -20px;\n"
            + "  border-radius: 20px;\n"
            + "}\n"
            + "\n"
            + ".ear.left {\n"
            + "  left: 10px;\n"
            + "  transform: rotate(-30deg);\n"
            + "}\n"
            + "\n"
            + ".ear.right {\n"
            + "  right: 10px;\n"
            + "  transform: rotate(30deg);\n"
            + "}\n"
            + "\n"
            + ".face {\n"
            + "  position: absolute;\n"
            + "  width: 100%;\n"
            + "  height: 100%;\n"
            + "}\n"
            + "\n"
            + ".eye {\n"
            + "  width: 20px;\n"
            + "  height: 25px;\n"
            + "  background: #333;\n"
            + "  border-radius: 50%;\n"
            + "  position: absolute;\n"
            + "  top: 35px;\n"
            + "}\n"
            + "\n"
            + ".eye.left {\n"
            + "  left: 30px;\n"
            + "}\n"
            + "\n"
            + ".eye.right {\n"
            + "  right: 30px;\n"
            + "}\n"
            + "\n"
            + ".nose {\n"
            + "  width: 12px;\n"
            + "  height: 8px;\n"
            + "  background: #ff6b6b;\n"
            + "  border-radius: 50% 50% 50% 50% / 60% 60% 40% 40%;\n"
            + "  position: absolute;\n"
            + "  top: 55px;\n"
            + "  left: 54px;\n"
            + "}\n"
            + "\n"
            + ".mouth {\n"
            + "  width: 30px;\n"
            + "  height: 15px;\n"
            + "  border-bottom: 2px solid #333;\n"
            + "  border-radius: 0 0 50% 50%;\n"
            + "  position: absolute;\n"
            + "  top: 65px;\n"
            + "  left: 45px;\n"
            + "}\n"
            + "\n"
            + ".body {\n"
            + "  width: 140px;\n"
            + "  height: 120px;\n"
            + "  background: #ffb347;\n"
            + "  border-radius: 60px;\n"
            + "  position: absolute;\n"
            + "  top: 80px;\n"
            + "  left: 30px;\n"
            + "  z-index: 1;\n"
            + "}\n"
            + "\n"
            + ".tail {\n"
            + "  width: 80px;\n"
            + "  height: 20px;\n"
            + "  background: #ffb347;\n"
            + "  position: absolute;\n"
            + "  top: 120px;\n"
            + "  right: 10px;\n"
            + "  border-radius: 10px;\n"
            + "  transform: rotate(30deg);\n"
            + "  animation: wag 2s infinite alternate;\n"
            + "}\n"
            + "\n"
            + "@keyframes wag {\n"
            + "  from { transform: rotate(20deg); }\n"
            + "  to { transform: rotate(40deg); }\n"
            + "}\n"
            + "</style>"
        });

        Code_MAP.put("Pure CSS Illustrations", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Pure CSS Sun Illustration</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            display: flex;\n"
            + "            justify-content: center;\n"
            + "            align-items: center;\n"
            + "            height: 100vh;\n"
            + "            background: linear-gradient(to bottom, #87CEEB, #E0F7FA);\n"
            + "            margin: 0;\n"
            + "            overflow: hidden;\n"
            + "        }\n"
            + "        \n"
            + "        .sun {\n"
            + "            position: relative;\n"
            + "            width: 100px;\n"
            + "            height: 100px;\n"
            + "            background: #FFD700;\n"
            + "            border-radius: 50%;\n"
            + "            box-shadow: 0 0 50px #FFD700;\n"
            + "            animation: pulse 2s infinite alternate;\n"
            + "        }\n"
            + "        \n"
            + "        .sun::before {\n"
            + "            content: '';\n"
            + "            position: absolute;\n"
            + "            top: -15px;\n"
            + "            left: -15px;\n"
            + "            right: -15px;\n"
            + "            bottom: -15px;\n"
            + "            background: transparent;\n"
            + "            border-radius: 50%;\n"
            + "            border: 15px solid rgba(255, 215, 0, 0.4);\n"
            + "            animation: ripple 4s infinite;\n"
            + "        }\n"
            + "        \n"
            + "        .sun::after {\n"
            + "            content: '';\n"
            + "            position: absolute;\n"
            + "            top: -30px;\n"
            + "            left: -30px;\n"
            + "            right: -30px;\n"
            + "            bottom: -30px;\n"
            + "            background: transparent;\n"
            + "            border-radius: 50%;\n"
            + "            border: 15px solid rgba(255, 215, 0, 0.2);\n"
            + "            animation: ripple 4s infinite 0.5s;\n"
            + "        }\n"
            + "        \n"
            + "        .ray {\n"
            + "            position: absolute;\n"
            + "            background: #FFD700;\n"
            + "            width: 120px;\n"
            + "            height: 8px;\n"
            + "            top: 50%;\n"
            + "            left: 50%;\n"
            + "            transform-origin: left center;\n"
            + "        }\n"
            + "        \n"
            + "        /* Tạo các tia nắng */\n"
            + "        .ray:nth-child(1) { transform: translate(-50%, -50%) rotate(0deg); }\n"
            + "        .ray:nth-child(2) { transform: translate(-50%, -50%) rotate(45deg); }\n"
            + "        .ray:nth-child(3) { transform: translate(-50%, -50%) rotate(90deg); }\n"
            + "        .ray:nth-child(4) { transform: translate(-50%, -50%) rotate(135deg); }\n"
            + "        .ray:nth-child(5) { transform: translate(-50%, -50%) rotate(180deg); }\n"
            + "        .ray:nth-child(6) { transform: translate(-50%, -50%) rotate(225deg); }\n"
            + "        .ray:nth-child(7) { transform: translate(-50%, -50%) rotate(270deg); }\n"
            + "        .ray:nth-child(8) { transform: translate(-50%, -50%) rotate(315deg); }\n"
            + "        \n"
            + "        @keyframes pulse {\n"
            + "            from { transform: scale(1); }\n"
            + "            to { transform: scale(1.1); }\n"
            + "        }\n"
            + "        \n"
            + "        @keyframes ripple {\n"
            + "            from { transform: scale(0.5); opacity: 1; }\n"
            + "            to { transform: scale(1.5); opacity: 0; }\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"sun\">\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "        <div class=\"ray\"></div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Pure CSS Tree</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            display: flex;\n"
            + "            justify-content: center;\n"
            + "            align-items: flex-end;\n"
            + "            height: 100vh;\n"
            + "            background: #87CEEB;\n"
            + "            margin: 0;\n"
            + "        }\n"
            + "        \n"
            + "        .ground {\n"
            + "            position: absolute;\n"
            + "            bottom: 0;\n"
            + "            width: 100%;\n"
            + "            height: 100px;\n"
            + "            background: #8B4513;\n"
            + "        }\n"
            + "        \n"
            + "        .tree {\n"
            + "            position: relative;\n"
            + "            z-index: 1;\n"
            + "        }\n"
            + "        \n"
            + "        .trunk {\n"
            + "            width: 40px;\n"
            + "            height: 150px;\n"
            + "            background: linear-gradient(to right, #8B4513, #A0522D, #8B4513);\n"
            + "            margin: 0 auto;\n"
            + "            border-radius: 5px;\n"
            + "        }\n"
            + "        \n"
            + "        .leaves {\n"
            + "            position: relative;\n"
            + "            width: 0;\n"
            + "            height: 0;\n"
            + "            margin: 0 auto;\n"
            + "        }\n"
            + "        \n"
            + "        .leaves::before, .leaves::after {\n"
            + "            content: '';\n"
            + "            position: absolute;\n"
            + "            border-radius: 50%;\n"
            + "            background: #228B22;\n"
            + "        }\n"
            + "        \n"
            + "        .leaves::before {\n"
            + "            width: 120px;\n"
            + "            height: 120px;\n"
            + "            bottom: 20px;\n"
            + "            left: -60px;\n"
            + "            box-shadow: \n"
            + "                0 0 0 10px rgba(34, 139, 34, 0.8),\n"
            + "                0 0 0 20px rgba(34, 139, 34, 0.6);\n"
            + "        }\n"
            + "        \n"
            + "        .leaves::after {\n"
            + "            width: 80px;\n"
            + "            height: 80px;\n"
            + "            bottom: 70px;\n"
            + "            left: -40px;\n"
            + "            background: #2E8B57;\n"
            + "            z-index: 2;\n"
            + "        }\n"
            + "        \n"
            + "        .apple {\n"
            + "            position: absolute;\n"
            + "            width: 15px;\n"
            + "            height: 15px;\n"
            + "            background: #FF0000;\n"
            + "            border-radius: 50%;\n"
            + "            z-index: 3;\n"
            + "        }\n"
            + "        \n"
            + "        .apple:nth-child(1) { top: 30px; left: 20px; }\n"
            + "        .apple:nth-child(2) { top: 50px; left: -10px; }\n"
            + "        .apple:nth-child(3) { top: 70px; left: 30px; }\n"
            + "        .apple:nth-child(4) { top: 40px; left: -30px; }\n"
            + "        .apple:nth-child(5) { top: 60px; left: 10px; }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"ground\"></div>\n"
            + "    <div class=\"tree\">\n"
            + "        <div class=\"leaves\"></div>\n"
            + "        <div class=\"trunk\"></div>\n"
            + "        <div class=\"apple\"></div>\n"
            + "        <div class=\"apple\"></div>\n"
            + "        <div class=\"apple\"></div>\n"
            + "        <div class=\"apple\"></div>\n"
            + "        <div class=\"apple\"></div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>"
        });
        //Ứng Dụng & Dự Án Thực Tế
        Code_MAP.put("Một Blog cá nhân là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của blog cá nhân", new String[]{
            ""
        });
        Code_MAP.put("Landing page sản phẩm là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new String[]{
            ""
        });
        Code_MAP.put("Web bán hàng cơ bản là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new String[]{
            ""
        });
        Code_MAP.put("Hiệu ứng scroll", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Fade In Scroll Effect</title>\n"
            + "    <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <div class=\"content\">\n"
            + "        <div class=\"fade-in-box\">Nội dung 1</div>\n"
            + "        <div class=\"fade-in-box\">Nội dung 2</div>\n"
            + "        <div class=\"fade-in-box\">Nội dung 3</div>\n"
            + "    </div>\n"
            + "\n"
            + "    <script src=\"script.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "    font-family: Arial, sans-serif;\n"
            + "    margin: 0;\n"
            + "    padding: 0;\n"
            + "    height: 200vh; /* Tăng chiều cao để tạo hiệu ứng cuộn */\n"
            + "}\n"
            + "\n"
            + ".content {\n"
            + "    display: flex;\n"
            + "    flex-direction: column;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "    margin-top: 50px;\n"
            + "}\n"
            + "\n"
            + ".fade-in-box {\n"
            + "    width: 80%;\n"
            + "    max-width: 600px;\n"
            + "    margin: 30px 0;\n"
            + "    padding: 20px;\n"
            + "    background-color: #f0f0f0;\n"
            + "    text-align: center;\n"
            + "    opacity: 0;\n"
            + "    transform: translateY(50px);\n"
            + "    transition: opacity 1s, transform 1s;\n"
            + "}\n"
            + "\n"
            + "/* Các phần tử sẽ trở nên mờ dần khi cuộn đến */\n"
            + ".fade-in-box.visible {\n"
            + "    opacity: 1;\n"
            + "    transform: translateY(0);\n"
            + "}",
            "window.addEventListener('scroll', function() {\n"
            + "    const boxes = document.querySelectorAll('.fade-in-box');\n"
            + "    const triggerBottom = window.innerHeight / 1.3;\n"
            + "\n"
            + "    boxes.forEach(box => {\n"
            + "        const boxTop = box.getBoundingClientRect().top;\n"
            + "        if (boxTop < triggerBottom) {\n"
            + "            box.classList.add('visible');\n"
            + "        } else {\n"
            + "            box.classList.remove('visible');\n"
            + "        }\n"
            + "    });\n"
            + "});",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Parallax Scroll Effect</title>\n"
            + "    <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <div class=\"parallax-container\">\n"
            + "        <div class=\"parallax-bg\"></div>\n"
            + "        <div class=\"content\">\n"
            + "            <h1>Chào mừng bạn đến với trang của chúng tôi!</h1>\n"
            + "            <p>Cuộn xuống để thấy hiệu ứng parallax!</p>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "\n"
            + "    <script src=\"script.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "    margin: 0;\n"
            + "    font-family: Arial, sans-serif;\n"
            + "}\n"
            + "\n"
            + ".parallax-container {\n"
            + "    position: relative;\n"
            + "    height: 100vh;\n"
            + "    overflow: hidden;\n"
            + "}\n"
            + "\n"
            + ".parallax-bg {\n"
            + "    position: absolute;\n"
            + "    top: 0;\n"
            + "    left: 0;\n"
            + "    width: 100%;\n"
            + "    height: 150%;\n"
            + "    background-image: url('https://via.placeholder.com/1200x800');\n"
            + "    background-size: cover;\n"
            + "    background-position: center;\n"
            + "    transition: transform 0.1s ease-out;\n"
            + "}\n"
            + "\n"
            + ".content {\n"
            + "    position: absolute;\n"
            + "    top: 50%;\n"
            + "    left: 50%;\n"
            + "    transform: translate(-50%, -50%);\n"
            + "    color: white;\n"
            + "    text-align: center;\n"
            + "}\n"
            + "\n"
            + "h1 {\n"
            + "    font-size: 3rem;\n"
            + "}\n"
            + "\n"
            + "p {\n"
            + "    font-size: 1.5rem;\n"
            + "}",
            "window.addEventListener('scroll', function() {\n"
            + "    const parallax = document.querySelector('.parallax-bg');\n"
            + "    let scrollPosition = window.pageYOffset;\n"
            + "    parallax.style.transform = 'translateY(' + scrollPosition * 0.5 + 'px)';\n"
            + "});",
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Scroll Triggered Animation</title>\n"
            + "    <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <div class=\"content\">\n"
            + "        <div class=\"scroll-box\">Chào mừng đến với website của chúng tôi!</div>\n"
            + "        <div class=\"scroll-box\">Cuộn xuống để thấy hiệu ứng!</div>\n"
            + "        <div class=\"scroll-box\">Chúc bạn có trải nghiệm tuyệt vời!</div>\n"
            + "    </div>\n"
            + "\n"
            + "    <script src=\"script.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "    font-family: Arial, sans-serif;\n"
            + "    margin: 0;\n"
            + "    padding: 0;\n"
            + "    height: 200vh; /* Tạo không gian cuộn */\n"
            + "}\n"
            + "\n"
            + ".content {\n"
            + "    display: flex;\n"
            + "    flex-direction: column;\n"
            + "    justify-content: center;\n"
            + "    align-items: center;\n"
            + "    margin-top: 50px;\n"
            + "}\n"
            + "\n"
            + ".scroll-box {\n"
            + "    width: 80%;\n"
            + "    max-width: 600px;\n"
            + "    margin: 30px 0;\n"
            + "    padding: 20px;\n"
            + "    background-color: #f0f0f0;\n"
            + "    text-align: center;\n"
            + "    opacity: 0;\n"
            + "    transform: scale(0.8);\n"
            + "    transition: opacity 1s, transform 1s;\n"
            + "}\n"
            + "\n"
            + "/* Các phần tử sẽ phóng to và mờ dần khi cuộn đến */\n"
            + ".scroll-box.visible {\n"
            + "    opacity: 1;\n"
            + "    transform: scale(1);\n"
            + "}",
            "window.addEventListener('scroll', function() {\n"
            + "    const boxes = document.querySelectorAll('.scroll-box');\n"
            + "    const triggerBottom = window.innerHeight / 1.3;\n"
            + "\n"
            + "    boxes.forEach(box => {\n"
            + "        const boxTop = box.getBoundingClientRect().top;\n"
            + "        if (boxTop < triggerBottom) {\n"
            + "            box.classList.add('visible');\n"
            + "        } else {\n"
            + "            box.classList.remove('visible');\n"
            + "        }\n"
            + "    });\n"
            + "});"
        });
        Code_MAP.put("Parallax", new String[]{
            "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "    <title>Parallax Effect</title>\n"
            + "    <link rel=\"stylesheet\" href=\"styles.css\">\n"
            + "</head>\n"
            + "<body>\n"
            + "\n"
            + "    <div class=\"parallax-container\">\n"
            + "        <div class=\"parallax-bg\"></div>\n"
            + "        <div class=\"content\">\n"
            + "            <h1>Chào mừng đến với website của chúng tôi!</h1>\n"
            + "            <p>Cuộn xuống để thấy hiệu ứng Parallax!</p>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "\n"
            + "    <div class=\"section\">\n"
            + "        <h2>Đây là phần nội dung bên dưới</h2>\n"
            + "        <p>Cuộn tiếp để thấy thêm nội dung.</p>\n"
            + "    </div>\n"
            + "\n"
            + "    <div class=\"parallax-container\">\n"
            + "        <div class=\"parallax-bg\"></div>\n"
            + "        <div class=\"content\">\n"
            + "            <h1>Cuộn tiếp để thấy phần tiếp theo!</h1>\n"
            + "        </div>\n"
            + "    </div>\n"
            + "\n"
            + "    <script src=\"script.js\"></script>\n"
            + "</body>\n"
            + "</html>",
            "body {\n"
            + "    margin: 0;\n"
            + "    font-family: Arial, sans-serif;\n"
            + "}\n"
            + "\n"
            + ".parallax-container {\n"
            + "    position: relative;\n"
            + "    width: 100%;\n"
            + "    height: 100vh; /* Đặt chiều cao của phần tử parallax */\n"
            + "    overflow: hidden;\n"
            + "}\n"
            + "\n"
            + ".parallax-bg {\n"
            + "    position: absolute;\n"
            + "    top: 0;\n"
            + "    left: 0;\n"
            + "    width: 100%;\n"
            + "    height: 150%; /* Tăng chiều cao của hình ảnh nền */\n"
            + "    background-image: url('https://via.placeholder.com/1200x800'); /* Đổi thành hình ảnh của bạn */\n"
            + "    background-size: cover;\n"
            + "    background-position: center;\n"
            + "    transition: transform 0.1s ease-out;\n"
            + "}\n"
            + "\n"
            + ".content {\n"
            + "    position: absolute;\n"
            + "    top: 50%;\n"
            + "    left: 50%;\n"
            + "    transform: translate(-50%, -50%);\n"
            + "    color: white;\n"
            + "    text-align: center;\n"
            + "}\n"
            + "\n"
            + "h1 {\n"
            + "    font-size: 3rem;\n"
            + "}\n"
            + "\n"
            + "p {\n"
            + "    font-size: 1.5rem;\n"
            + "}\n"
            + "\n"
            + ".section {\n"
            + "    padding: 60px;\n"
            + "    text-align: center;\n"
            + "    background-color: #f1f1f1;\n"
            + "    color: #333;\n"
            + "}",
            "window.addEventListener('scroll', function() {\n"
            + "    const parallax = document.querySelector('.parallax-bg');\n"
            + "    const scrollPosition = window.pageYOffset;\n"
            + "    \n"
            + "    // Tạo hiệu ứng parallax bằng cách thay đổi vị trí nền\n"
            + "    parallax.style.transform = 'translateY(' + scrollPosition * 0.5 + 'px)';\n"
            + "});",
            "<script src=\"https://cdn.jsdelivr.net/npm/rellax@1.12.0/rellax.min.js\"></script>",
            "// Khởi tạo hiệu ứng parallax với Rellax.js\n"
            + "var rellax = new Rellax('.parallax-bg');"
        });
        Code_MAP.put("Ứng dụng trong thiết kế", new String[]{
            ""
        });
        Code_MAP.put("Dark Mode (chế độ tối) là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của Dark Mode", new String[]{
            ""
        });
        Code_MAP.put("Cách thức triển khai Dark Mode", new String[]{
            "/* Mặc định là chế độ sáng */\n"
            + "body {\n"
            + "  background-color: white;\n"
            + "  color: black;\n"
            + "}\n"
            + "\n"
            + "/* Khi người dùng sử dụng chế độ tối */\n"
            + "@media (prefers-color-scheme: dark) {\n"
            + "  body {\n"
            + "    background-color: #121212;\n"
            + "    color: white;\n"
            + "  }\n"
            + "\n"
            + "  /* Thêm các style khác cho Dark Mode */\n"
            + "  button {\n"
            + "    background-color: #333;\n"
            + "    color: white;\n"
            + "  }\n"
            + "}",
            "<button id=\"darkModeToggle\">Chế độ tối</button>",
            "// Kiểm tra chế độ hiện tại và áp dụng khi người dùng thay đổi\n"
            + "const toggleButton = document.getElementById('darkModeToggle');\n"
            + "toggleButton.addEventListener('click', () => {\n"
            + "  document.body.classList.toggle('dark-mode');\n"
            + "});",
            "/* CSS cho Dark Mode */\n"
            + ".dark-mode {\n"
            + "  background-color: #121212;\n"
            + "  color: white;\n"
            + "}\n"
            + "\n"
            + "/* Nút chuyển chế độ */\n"
            + "#darkModeToggle {\n"
            + "  background-color: #333;\n"
            + "  color: white;\n"
            + "  border: none;\n"
            + "  padding: 10px;\n"
            + "  cursor: pointer;\n"
            + "}\n"
            + "\n"
            + "#darkModeToggle:hover {\n"
            + "  background-color: #555;\n"
            + "}",
            "// Kiểm tra trạng thái Dark Mode khi tải trang\n"
            + "const isDarkMode = localStorage.getItem('darkMode') === 'true';\n"
            + "if (isDarkMode) {\n"
            + "  document.body.classList.add('dark-mode');\n"
            + "}\n"
            + "\n"
            + "// Lưu trạng thái Dark Mode\n"
            + "toggleButton.addEventListener('click', () => {\n"
            + "  const isDark = document.body.classList.toggle('dark-mode');\n"
            + "  localStorage.setItem('darkMode', isDark);\n"
            + "});"
        });
        Code_MAP.put("Animation nâng cao là gì?", new String[]{
            "// Sử dụng GSAP để tạo chuyển động phức tạp\n"
            + "gsap.from(\".element\", {\n"
            + "  duration: 1.5,\n"
            + "  x: -100,\n"
            + "  opacity: 0,\n"
            + "  scale: 0.5,\n"
            + "  ease: \"power3.out\"\n"
            + "});\n"
            + "\n"
            + "gsap.to(\".element\", {\n"
            + "  duration: 1.5,\n"
            + "  x: 100,\n"
            + "  opacity: 1,\n"
            + "  scale: 1,\n"
            + "  ease: \"bounce.out\"\n"
            + "});"
        });
        Code_MAP.put("Các yếu tố quan trọng của animation nâng cao", new String[]{
            ""
        });
        Code_MAP.put("Lợi ích của animation nâng cao", new String[]{
            ""
        });
        Code_MAP.put("Manifest.json là gì?", new String[]{
            "{\n"
            + "  \"name\": \"My Awesome App\",\n"
            + "  \"short_name\": \"AwesomeApp\",\n"
            + "  \"description\": \"Ứng dụng web tuyệt vời nhất!\",\n"
            + "  \"start_url\": \"/index.html\",\n"
            + "  \"display\": \"standalone\",\n"
            + "  \"background_color\": \"#ffffff\",\n"
            + "  \"theme_color\": \"#4CAF50\",\n"
            + "  \"icons\": [\n"
            + "    {\n"
            + "      \"src\": \"/icons/icon-192x192.png\",\n"
            + "      \"sizes\": \"192x192\",\n"
            + "      \"type\": \"image/png\"\n"
            + "    },\n"
            + "    {\n"
            + "      \"src\": \"/icons/icon-512x512.png\",\n"
            + "      \"sizes\": \"512x512\",\n"
            + "      \"type\": \"image/png\"\n"
            + "    }\n"
            + "  ]\n"
            + "}",
            "{\n"
            + "  \"manifest_version\": 3,\n"
            + "  \"name\": \"My Extension\",\n"
            + "  \"version\": \"1.0\",\n"
            + "  \"description\": \"Tiện ích mở rộng nhỏ gọn!\",\n"
            + "  \"permissions\": [\"storage\", \"tabs\"],\n"
            + "  \"background\": {\n"
            + "    \"service_worker\": \"background.js\"\n"
            + "  },\n"
            + "  \"action\": {\n"
            + "    \"default_popup\": \"popup.html\",\n"
            + "    \"default_icon\": \"icon.png\"\n"
            + "  }\n"
            + "}"
        });
        Code_MAP.put("Các yếu tố quan trọng của manifest.json", new String[]{
            "if ('serviceWorker' in navigator) {\n"
            + "  window.addEventListener('load', function() {\n"
            + "    navigator.serviceWorker.register('/service-worker.js')\n"
            + "    .then(function(registration) {\n"
            + "      console.log('ServiceWorker đã đăng ký thành công:', registration.scope);\n"
            + "    })\n"
            + "    .catch(function(error) {\n"
            + "      console.log('ServiceWorker đăng ký thất bại:', error);\n"
            + "    });\n"
            + "  });\n"
            + "}",
            "// Cài đặt và cache các file cần thiết\n"
            + "self.addEventListener('install', function(event) {\n"
            + "  event.waitUntil(\n"
            + "    caches.open('my-cache')\n"
            + "      .then(function(cache) {\n"
            + "        return cache.addAll([\n"
            + "          '/',\n"
            + "          '/index.html',\n"
            + "          '/styles.css',\n"
            + "          '/script.js',\n"
            + "          '/image.png'\n"
            + "        ]);\n"
            + "      })\n"
            + "  );\n"
            + "});\n"
            + "\n"
            + "// Bắt và xử lý các yêu cầu mạng\n"
            + "self.addEventListener('fetch', function(event) {\n"
            + "  event.respondWith(\n"
            + "    caches.match(event.request)\n"
            + "      .then(function(response) {\n"
            + "        return response || fetch(event.request);\n"
            + "      })\n"
            + "  );\n"
            + "});"
        });
        Code_MAP.put("Service Worker là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng về Service Worker", new String[]{
            ""
        });
        Code_MAP.put("Caching trong Service Worker", new String[]{
            "self.addEventListener('install', function(event) {\n"
            + "  event.waitUntil(\n"
            + "    caches.open('my-cache-v1')\n"
            + "      .then(function(cache) {\n"
            + "        return cache.addAll([\n"
            + "          '/',\n"
            + "          '/index.html',\n"
            + "          '/styles.css',\n"
            + "          '/app.js',\n"
            + "          '/logo.png'\n"
            + "        ]);\n"
            + "      })\n"
            + "  );\n"
            + "});\n"
            + "\n"
            + "self.addEventListener('fetch', function(event) {\n"
            + "  event.respondWith(\n"
            + "    caches.match(event.request)\n"
            + "      .then(function(response) {\n"
            + "        return response || fetch(event.request);\n"
            + "      })\n"
            + "  );\n"
            + "});"
        });
        Code_MAP.put("Các lợi ích của Service Worker & Caching", new String[]{
            ""
        });
        Code_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của Offline Mode", new String[]{
            ""
        });
        Code_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new String[]{
            ""
        });
        Code_MAP.put("Các yếu tố quan trọng của Push Notifications", new String[]{
            ""
        });

    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getCode(String language, int index) {
        if (Code_MAP.containsKey(language)) {
            String[] descriptions = Code_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getCode(String language) {
        return Code_MAP.getOrDefault(language, new String[]{});
    }
}
