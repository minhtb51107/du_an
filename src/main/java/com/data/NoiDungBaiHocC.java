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
public class NoiDungBaiHocC {

    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {

        //C
        Index_MAP.put("C là gì?", new int[]{
            0, 1, 1, 0, 1, 2, 0, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Tại sao nên học C?", new int[]{
            0, 1, 1, 1, 2, 2, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1
        });

        Index_MAP.put("Các đặc điểm nổi bật của C", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Nguồn gốc của C", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Các phiên bản của C", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2
        });

        Index_MAP.put("C và các ngôn ngữ lập trình khác", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 1, 1, 0, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Ứng dụng của C trong lập trình hệ thống", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1
        });

        Index_MAP.put("C trong phát triển phần mềm nhúng", new int[]{
            0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Cấu trúc tổng quát", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Khai báo biến", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 1, 2, 1, 2, 0, 2, 0, 1, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Hàm main", new int[]{
            0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Các bước biên dịch", new int[]{
            0, 1, 1, 1, 2, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Trình biên dịch và trình liên kết", new int[]{
            0, 1, 1, 1, 2, 1, 2, 0, 1, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Quá trình thực thi", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Câu lệnh if", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1
        });

        Index_MAP.put("Câu lệnh if-else", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 2
        });

        Index_MAP.put("Câu lệnh switch-case", new int[]{
            0, 1, 0, 2, 0, 1, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp for", new int[]{
            0, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 21, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp while", new int[]{
            0, 1, 2, 0, 1, 1, 1, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp do-while", new int[]{
            0, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 2, 1, 1, 2, 0, 1
        });

        Index_MAP.put("Khai báo mảng một chiều", new int[]{
            0, 1, 1, 2, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Truy cập và thao tác với phần tử trong mảng", new int[]{
            0, 1, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Khai báo mảng hai chiều", new int[]{
            0, 1, 2, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 0, 1
        });

        Index_MAP.put("Truy cập và thao tác với phần tử", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Khai báo chuỗi", new int[]{
            0, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Các hàm xử lý chuỗi", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("So sánh và nối chuỗi", new int[]{
            0, 1, 1, 2, 1, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 1, 2, 1
        });

        Index_MAP.put("Khái niệm về con trỏ", new int[]{
            0, 1, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1
        });

        Index_MAP.put("Khai báo con trỏ", new int[]{
            0, 1, 1, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Toán tử con trỏ", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Cú pháp định nghĩa hàm", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Gọi hàm", new int[]{
            0, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Hàm trả về giá trị", new int[]{
            0, 1, 1, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Truyền tham số theo giá trị", new int[]{
            0, 1, 0, 1, 0, 2, 0, 2, 0, 1, 0, 1, 1
        });

        Index_MAP.put("Truyền tham số theo tham chiếu", new int[]{
            0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Sử dụng con trỏ để truyền tham số", new int[]{
            0, 1, 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 1
        });

        Index_MAP.put("Khái niệm hàm đệ quy", new int[]{
            0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Cách hoạt động của hàm đệ quy", new int[]{
            0, 1, 0, 1, 0, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Ví dụ về hàm đệ quy", new int[]{
            0, 1, 2, 0, 1, 1, 1, 0, 1, 1
        });

        Index_MAP.put("Cấu trúc dữ liệu cơ bản", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2
        });

        Index_MAP.put("File I/O trong C", new int[]{
            0, 1, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Các hàm file I/O", new int[]{
            0, 1, 2, 1, 2, 1, 1, 2, 0, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 0, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 0, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 0, 1, 2, 2, 2, 2
        });

        Index_MAP.put("Khái niệm về struct", new int[]{
            0, 1, 1, 0, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Khái niệm về union", new int[]{
            0, 1, 0, 2, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Sự khác biệt giữa struct và union", new int[]{
            0, 1, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Danh sách liên kết", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1
        });

        Index_MAP.put("Ngăn xếp", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 0, 1, 1
        });

        Index_MAP.put("Hàng đợi", new int[]{
            0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 1
        });

        Index_MAP.put("Mở và đóng tệp tin", new int[]{
            0, 1, 0, 1, 1, 2, 1, 1, 0, 1, 1, 2, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Đọc và ghi tệp tin", new int[]{
            0, 1, 0, 1, 2, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Các hàm xử lý tệp tin", new int[]{
            0, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 1, 2
        });
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
    
            //C
        TITLE_MAP.put("C là gì?", new String[]{
            "1. Giới thiệu về C",
            "2. Cấu trúc cơ bản của chương trình C",
            "3. Kiểu dữ liệu trong C",
            "4. Biến và hằng số",
            "5. Toán tử trong C",
            "6. Cấu trúc điều khiển",
            "7. Hàm trong C",
            "8. Mảng và chuỗi",
            "9. Con trỏ",
            "10. Cấu trúc (struct)",
            "11. File I/O",
            "12. Ví dụ hoàn chỉnh",
            "Kết luận"
        });

        TITLE_MAP.put("Tại sao nên học C?", new String[]{
            "1. C là nền tảng của nhiều ngôn ngữ lập trình hiện đại",
            "2. Hiệu suất cao và gần với phần cứng",
            "3. Được sử dụng rộng rãi trong hệ thống nhúng và hệ điều hành",
            "4. Giúp hiểu sâu về cấu trúc dữ liệu và thuật toán",
            "5. Cộng đồng hỗ trợ lớn và tài nguyên phong phú",
            "6. Cơ hội nghề nghiệp rộng mở",
            "7. Rèn luyện tư duy lập trình chặt chẽ",
            "8. Tiền đề cho lập trình hệ thống và bảo mật",
            "Kết luận"
        });

        TITLE_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "1. Ngôn ngữ lập trình cấp trung (Middle-level language)",
            "2. Ngôn ngữ có cấu trúc (Structured programming language)",
            "3. Ngôn ngữ đa nền tảng (Portable)",
            "4. Hỗ trợ con trỏ (Pointers)",
            "5. Quản lý bộ nhớ thủ công (Manual memory management)",
            "6. Tốc độ thực thi nhanh",
            "7. Thư viện phong phú",
            "8. Ngôn ngữ đơn giản và nhỏ gọn",
            "9. Hỗ trợ lập trình hệ thống",
            "10. Khả năng mở rộng"
        });

        TITLE_MAP.put("Nguồn gốc của C", new String[]{
            "1. Bối cảnh ra đời",
            "2. Các mốc phát triển chính",
            "3. Đặc điểm nổi bật",
            "4. Ảnh hưởng và ứng dụng",
            "5. Code mẫu minh họa",
            "6. Kết luận"
        });

        TITLE_MAP.put("Các phiên bản của C", new String[]{
            "1. K&R C (1978)",
            "2. ANSI C (C89/C90)",
            "3. C99",
            "4. C11",
            "5. C17 (C18)",
            "6. C23 (Dự thảo)"
        });

        TITLE_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "1. Giới thiệu tổng quan",
            "2. So sánh cú pháp cơ bản",
            "3. Quản lý bộ nhớ",
            "4. Hướng đối tượng",
            "5. Hiệu suất",
            "6. Ứng dụng thực tế",
            "7. Ví dụ thuật toán (Tính giai thừa)",
            "8. Kết luận"
        });

        TITLE_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "1. Hệ điều hành (Operating Systems)",
            "2. Trình điều khiển thiết bị (Device Drivers)",
            "3. Hệ thống nhúng (Embedded Systems)",
            "4. Mạng máy tính (Networking)",
            "5. Công cụ hệ thống (System Utilities)",
            "6. Bảo mật hệ thống (System Security)",
            "7. Hệ thống file (File Systems)",
            "8. Ảo hóa (Virtualization)",
            "Kết luận"
        });

        TITLE_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "1. Giới thiệu về C trong lập trình nhúng",
            "2. Các khái niệm cơ bản trong C cho hệ thống nhúng",
            "3. Lập trình phần cứng với C",
            "4. Quản lý bộ nhớ trong hệ thống nhúng",
            "5. Giao tiếp phần cứng",
            "6. Real-Time Operating Systems (RTOS) với C",
            "7. Tối ưu hóa code nhúng",
            "8. Debug và kiểm tra phần mềm nhúng",
            "9. Best practices trong lập trình nhúng bằng C",
            "Kết luận"
        });

        TITLE_MAP.put("Cấu trúc tổng quát", new String[]{
            "1. Phần khai báo thư viện (Includes)",
            "2. Phần định nghĩa hằng số (Macros/Constants)",
            "3. Phần khai báo nguyên mẫu hàm (Function Prototypes)",
            "4. Phần khai báo biến toàn cục (Global Variables)",
            "5. Hàm main (Main Function)",
            "6. Phần định nghĩa hàm (Function Definitions)",
            "Chương trình mẫu hoàn chỉnh",
            "Giải thích các phần:"
        });

        TITLE_MAP.put("Khai báo biến", new String[]{
            "1. Giới thiệu về biến trong C",
            "2. Cú pháp khai báo biến",
            "3. Các kiểu dữ liệu cơ bản",
            "4. Khai báo nhiều biến cùng kiểu",
            "5. Biến static",
            "6. Biến register (gợi ý lưu trong thanh ghi)",
            "7. Biến volatile (ngăn trình biên dịch tối ưu)",
            "8. Biến const (hằng số)",
            "9. Biến extern (khai báo biến toàn cục)",
            "10. Ví dụ hoàn chỉnh",
            "11. Quy tắc đặt tên biến",
            "12. Phạm vi biến"
        });

        TITLE_MAP.put("Hàm main", new String[]{
            "Các thành phần chính của hàm main",
            "Các dạng hàm main phổ biến",
            "Ví dụ đầy đủ với chức năng cụ thể",
            "Giải thích ví dụ trên",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put("Các bước biên dịch", new String[]{
            "1. Tiền xử lý (Preprocessing)",
            "2. Biên dịch (Compilation)",
            "3. Dịch sang ngôn ngữ máy (Assembly)",
            "4. Liên kết (Linking)",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "1. Trình biên dịch (Compiler)",
            "2. Trình liên kết (Linker)",
            "3. Quá trình từ mã nguồn đến file thực thi",
            "4. Các tùy chọn biên dịch quan trọng"
        });

        TITLE_MAP.put("Quá trình thực thi", new String[]{
            "1. Viết mã nguồn (Source Code)",
            "2. Tiền xử lý (Preprocessing)",
            "3. Biên dịch (Compilation)",
            "4. Dịch sang ngôn ngữ máy (Assembly)",
            "5. Liên kết (Linking)",
            "6. Nạp chương trình (Loading)",
            "7. Thực thi (Execution)",
            "Chương trình mẫu đầy đủ",
            "Quá trình biên dịch và thực thi đầy đủ",
            "Các loại file trong quá trình biên dịch"
        });

        TITLE_MAP.put("Câu lệnh if", new String[]{
            "1. Cú pháp cơ bản của if",
            "2. Câu lệnh if-else",
            "3. Câu lệnh if-else if-else",
            "4. If lồng nhau",
            "5. Toán tử điều kiện và if",
            "6. If với phép gán và so sánh"
        });

        TITLE_MAP.put("Câu lệnh if-else", new String[]{
            "1. Giới thiệu",
            "2. Cú pháp đầy đủ",
            "3. Ví dụ minh họa",
            "4. Lưu ý quan trọng",
            "5. Ví dụ kết hợp toán tử logic"
        });

        TITLE_MAP.put("Câu lệnh switch-case", new String[]{
            "1. Giới thiệu",
            "2. Cú pháp đầy đủ",
            "3. Các thành phần chi tiết",
            "4. Code mẫu đầy đủ",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Vòng lặp for", new String[]{
            "Cấu trúc của vòng lặp for",
            "Ví dụ minh họa",
            "Khi nào nên dùng vòng lặp for"
        });

        TITLE_MAP.put("Vòng lặp while", new String[]{
            "Cấu trúc của vòng lặp while",
            "Các phần chi tiết",
            "Ví dụ minh họa",
            "Lưu ý khi sử dụng vòng lặp while"
        });

        TITLE_MAP.put("Vòng lặp do-while", new String[]{
            "Cấu trúc của vòng lặp do-while",
            "Code mẫu",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put("Khai báo mảng một chiều", new String[]{
            "1. Cú pháp khai báo mảng",
            "2. Khởi tạo mảng",
            "3. Truy cập phần tử mảng",
            "4. Kích thước mảng",
            "5. Code mẫu đầy đủ",
            "6. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "1. Giới thiệu về mảng trong C",
            "2. Khai báo mảng",
            "3. Truy cập phần tử mảng",
            "4. Thay đổi giá trị phần tử",
            "5. Duyệt mảng bằng vòng lặp",
            "6. Nhập và xuất mảng",
            "7. Mảng nhiều chiều",
            "8. Mảng và con trỏ",
            "9. Một số thao tác cơ bản với mảng",
            "10. Truyền mảng vào hàm"
        });

        TITLE_MAP.put("Khai báo mảng hai chiều", new String[]{
            "1. Cú pháp khai báo cơ bản",
            "2. Khởi tạo mảng 2 chiều",
            "3. Code mẫu đầy đủ",
            "4. Giải thích từng phần trong code mẫu",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "1. Giới thiệu về mảng 2 chiều",
            "2. Khai báo mảng 2 chiều",
            "3. Truy cập phần tử trong mảng 2 chiều",
            "4. Các thao tác cơ bản với mảng 2 chiều",
            "5. Các thao tác nâng cao",
            "6. Truyền mảng 2 chiều vào hàm",
            "7. Lưu ý khi làm việc với mảng 2 chiều"
        });

        TITLE_MAP.put("Khai báo chuỗi", new String[]{
            "1. Các cách khai báo chuỗi cơ bản",
            "2. Khai báo chuỗi không khởi tạo",
            "3. Khai báo nhiều chuỗi cùng lúc",
            "4. Code mẫu đầy đủ",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "1. Các hàm cơ bản",
            "2. Các hàm so sánh",
            "3. Các hàm tìm kiếm",
            "4. Các hàm khác",
            "5. Các hàm an toàn hơn (C11)",
            "Kết luận"
        });

        TITLE_MAP.put("So sánh và nối chuỗi", new String[]{
            "1. So sánh chuỗi trong C",
            "2. Nối chuỗi trong C",
            "3. Các hàm liên quan khác"
        });

        TITLE_MAP.put("Khái niệm về con trỏ", new String[]{
            "1. Định nghĩa con trỏ",
            "2. Cú pháp khai báo con trỏ",
            "3. Toán tử địa chỉ (&) và toán tử dereference (*)",
            "4. Con trỏ và mảng",
            "5. Con trỏ và hàm (Pass by reference)",
            "6. Con trỏ cấp 2 (Con trỏ đến con trỏ)",
            "7. Con trỏ NULL",
            "8. Con trỏ hàm",
            "9. Cấp phát động với con trỏ",
            "10. Con trỏ void (void pointer)"
        });

        TITLE_MAP.put("Khai báo con trỏ", new String[]{
            "Các phần của khai báo con trỏ",
            "Code mẫu",
            "Giải thích code mẫu"
        });

        TITLE_MAP.put("Toán tử con trỏ", new String[]{
            "1. Toán tử địa chỉ (&)",
            "2. Toán tử dereference (*)",
            "3. Toán tử gán con trỏ",
            "4. Toán tử số học con trỏ",
            "5. Toán tử so sánh con trỏ",
            "6. Con trỏ trỏ tới con trỏ",
            "7. Toán tử arrow (->) với cấu trúc"
        });

        TITLE_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "Kiểu trả về (Return type):",
            "Tên hàm (Function name):",
            "Tham số (Parameters):",
            "Thân hàm (Function body):",
            "Cú pháp đầy đủ:",
            "Ví dụ minh họa:"
        });

        TITLE_MAP.put("Gọi hàm", new String[]{
            "Các phần của lời gọi hàm",
            "Code mẫu minh họa",
            "Giải thích chi tiết"
        });

        TITLE_MAP.put("Hàm trả về giá trị", new String[]{
            "Các phần chính của hàm trả về giá trị",
            "Code mẫu",
            "Giải thích code mẫu"
        });

        TITLE_MAP.put("Truyền tham số theo giá trị", new String[]{
            "Khái niệm",
            "Đặc điểm",
            "Code mẫu minh họa",
            "Kết quả chạy chương trình",
            "Giải thích kết quả",
            "Ưu điểm và nhược điểm"
        });

        TITLE_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "1. Khái niệm",
            "2. Đặc điểm",
            "3. Cú pháp",
            "4. So sánh với truyền tham trị",
            "5. Code mẫu",
            "6. Kết luận"
        });

        TITLE_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "1. Khái niệm cơ bản",
            "2. Cách thức hoạt động",
            "3. Cú pháp",
            "4. Ví dụ minh họa",
            "5. Lưu ý quan trọng",
            "6. Truyền tham số con trỏ với const"
        });

        TITLE_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "1. Khái niệm hàm đệ quy",
            "2. Các thành phần của hàm đệ quy",
            "3. Ưu điểm và nhược điểm",
            "4. Các loại đệ quy",
            "5. Code mẫu",
            "6. Lưu ý khi sử dụng hàm đệ quy"
        });

        TITLE_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "1. Khái niệm đệ quy",
            "2. Cơ chế hoạt động",
            "3. Ưu điểm và nhược điểm",
            "4. Ví dụ minh họa",
            "5. Lưu ý khi sử dụng đệ quy"
        });

        TITLE_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "Ví dụ về hàm đệ quy tính giai thừa",
            "Giải thích chi tiết",
            "Ưu điểm và nhược điểm"
        });

        TITLE_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "1. Mảng (Array)",
            "2. Chuỗi (String)",
            "3. Cấu trúc (Struct)",
            "4. Union",
            "5. Enum",
            "6. Con trỏ (Pointer)",
            "7. Danh sách liên kết (Linked List)"
        });

        TITLE_MAP.put("File I/O trong C", new String[]{
            "1. Giới thiệu về File I/O trong C",
            "2. Các thao tác cơ bản với file",
            "3. Đọc và ghi file văn bản",
            "4. Đọc và ghi file nhị phân",
            "5. Các hàm điều khiển vị trí con trỏ file",
            "6. Xử lý lỗi file I/O",
            "7. Ví dụ tổng hợp"
        });

        TITLE_MAP.put("Các hàm file I/O", new String[]{
            "1. Mở và đóng file",
            "2. Ghi dữ liệu vào file",
            "3. Đọc dữ liệu từ file",
            "4. Các hàm kiểm tra và điều khiển",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Khái niệm về struct", new String[]{
            "1. Định nghĩa Struct",
            "2. Cú pháp khai báo Struct",
            "3. Các thành phần của Struct",
            "4. Code mẫu đầy đủ",
            "5. Kết quả chương trình mẫu"
        });

        TITLE_MAP.put("Khái niệm về union", new String[]{
            "1. Đặc điểm chính của Union",
            "2. Cú pháp khai báo Union",
            "3. Truy cập thành viên Union",
            "4. Ưu điểm của Union",
            "5. Nhược điểm của Union",
            "Code mẫu minh họa"
        });

        TITLE_MAP.put("Sự khác biệt giữa struct và union", new String[]{
            "1. Định nghĩa cơ bản",
            "2. Sự khác biệt về bộ nhớ",
            "3. Truy cập thành viên",
            "4. Ứng dụng thực tế",
            "5. Code mẫu minh họa",
            "6. Kết luận"
        });

        TITLE_MAP.put("Danh sách liên kết", new String[]{
            "1. Khái niệm Danh Sách Liên Kết",
            "2. Các loại Danh Sách Liên Kết",
            "3. Cấu trúc Node",
            "4. Các thao tác cơ bản",
            "5. Code mẫu Danh Sách Liên Kết Đơn",
            "6. Ưu điểm và Nhược điểm",
            "7. Ứng dụng"
        });

        TITLE_MAP.put("Ngăn xếp", new String[]{
            "1. Khái niệm ngăn xếp (Stack)",
            "2. Cách triển khai ngăn xếp trong C",
            "3. Ứng dụng của ngăn xếp",
            "4. Ưu và nhược điểm"
        });

        TITLE_MAP.put("Hàng đợi", new String[]{
            "Khái niệm",
            "Đặc điểm",
            "Các thao tác cơ bản",
            "Code mẫu cài đặt hàng đợi bằng mảng",
            "Giải thích code",
            "Ưu nhược điểm"
        });

        TITLE_MAP.put("Mở và đóng tệp tin", new String[]{
            "1. Khái niệm cơ bản về làm việc với tệp tin",
            "2. Mở tệp tin (fopen)",
            "3. Đóng tệp tin (fclose)",
            "4. Kiểm tra lỗi khi mở tệp",
            "5. Code mẫu",
            "6. Giải thích code mẫu",
            "7. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Đọc và ghi tệp tin", new String[]{
            "1. Khái niệm cơ bản về tệp tin trong C",
            "2. Mở và đóng tệp tin",
            "3. Ghi dữ liệu vào tệp tin",
            "4. Đọc dữ liệu từ tệp tin",
            "5. Xử lý tệp tin nhị phân",
            "6. Các hàm điều khiển vị trí con trỏ file",
            "7. Xử lý lỗi khi làm việc với tệp tin",
            "8. Các hàm tiện ích khác"
        });

        TITLE_MAP.put("Các hàm xử lý tệp tin", new String[]{
            "Kiểm tra và xử lý lỗi",
            "Di chuyển con trỏ file",
            "Các hàm nhị phân (Binary I/O)",
            "Xóa và đổi tên tệp tin"
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
    
    //C
        Content_MAP.put("C là gì?", new String[]{
            "C là ngôn ngữ lập trình cấp cao được phát triển bởi Dennis Ritchie tại Bell Labs vào năm 1972. Nó được thiết kế để lập trình hệ thống, đặc biệt là để viết hệ điều hành UNIX. C là ngôn ngữ biên dịch, đa nền tảng và có cú pháp gần với ngôn ngữ máy.",
            "Đặc điểm nổi bật:\n"
            + "\n"
            + "Ngôn ngữ cấu trúc\n"
            + "\n"
            + "Hiệu suất cao\n"
            + "\n"
            + "Tiếp cận mức thấp (low-level)\n"
            + "\n"
            + "Thư viện phong phú\n"
            + "\n"
            + "Ảnh hưởng đến nhiều ngôn ngữ khác (C++, Java, C#...)",
            "Một chương trình C cơ bản gồm các phần:",
            "C có các kiểu dữ liệu cơ bản:",
            "Kiểu số nguyên:\n"
            + "int: số nguyên (4 bytes)\n"
            + "\n"
            + "short: số nguyên ngắn (2 bytes)\n"
            + "\n"
            + "long: số nguyên dài (4 hoặc 8 bytes)\n"
            + "\n"
            + "char: ký tự (1 byte)",
            "Kiểu số thực:\n"
            + "float: số thực dấu phẩy động (4 bytes)\n"
            + "\n"
            + "double: số thực độ chính xác kép (8 bytes)",
            "Kiểu void:\n"
            + "void: kiểu không có giá trị",
            "Ví dụ:",
            "Biến:\n"
            + "Là tên gọi của vùng nhớ\n"
            + "\n"
            + "Phải được khai báo trước khi sử dụng\n"
            + "\n"
            + "Cú pháp: kiểu_dữ_liệu tên_biến;",
            "Hằng số:\n"
            + "Giá trị không thay đổi\n"
            + "\n"
            + "Khai báo bằng #define hoặc const",
            "Ví dụ:",
            "Toán tử số học:\n"
            + "+, -, *, /, % (chia lấy dư)",
            "Toán tử quan hệ:\n"
            + "==, !=, >, <, >=, <=",
            "Toán tử logic:\n"
            + "&& (AND), || (OR), ! (NOT)",
            "Toán tử gán:\n"
            + "=, +=, -=, *=, /=, %=",
            "Ví dụ:",
            "Câu lệnh if-else:",
            "Vòng lặp for:",
            "Vòng lặp while:",
            "Vòng lặp do-while:",
            "Câu lệnh switch:",
            "Ví dụ:",
            "Hàm là khối lệnh thực hiện một tác vụ cụ thể.\n"
            + "\n"
            + "Cú pháp:",
            "Ví dụ:",
            "Mảng:\n"
            + "Tập hợp các phần tử cùng kiểu\n"
            + "\n"
            + "Kích thước cố định",
            "Chuỗi:\n"
            + "Mảng các ký tự kết thúc bằng '\\0'\n"
            + "\n"
            + "Thư viện string.h hỗ trợ các hàm xử lý chuỗi",
            "Con trỏ là biến lưu địa chỉ của biến khác.",
            "Struct cho phép gom nhóm các biến khác kiểu.",
            "Xử lý file trong C sử dụng FILE pointer và các hàm trong stdio.h.",
            "Chương trình quản lý sinh viên đơn giản:",
            "C là ngôn ngữ mạnh mẽ, hiệu suất cao và là nền tảng cho nhiều ngôn ngữ lập trình hiện đại. Mặc dù cú pháp đơn giản nhưng C yêu cầu lập trình viên phải quản lý bộ nhớ và hiểu rõ cách hoạt động của hệ thống."
        });

        Content_MAP.put("Tại sao nên học C?", new String[]{
            "C là một ngôn ngữ lập trình cổ điển nhưng vẫn cực kỳ quan trọng trong thế giới lập trình hiện đại. Dưới đây là những lý do tại sao bạn nên học C cùng với các nội dung chi tiết và code mẫu minh họa.",
            "Nội dung: C (được phát triển năm 1972) là cơ sở cho nhiều ngôn ngữ phổ biến như C++, Java, Python, JavaScript. Hiểu C giúp bạn dễ dàng học các ngôn ngữ khác.",
            "Code mẫu: So sánh cú pháp cơ bản giữa C và các ngôn ngữ khác",
            "Nội dung: C là ngôn ngữ bậc thấp, cho phép kiểm soát trực tiếp bộ nhớ và tài nguyên hệ thống, mang lại hiệu suất vượt trội cho các ứng dụng đòi hỏi tốc độ.",
            "Code mẫu: Quản lý bộ nhớ trực tiếp",
            "Nội dung: Hầu hết hệ điều hành (Linux, Windows) và firmware đều được viết bằng C do khả năng tương tác trực tiếp với phần cứng.",
            "Code mẫu: Tương tác với phần cứng cơ bản",
            "Nội dung: C yêu cầu lập trình viên tự triển khai các cấu trúc dữ liệu từ đầu, giúp hiểu sâu cách chúng hoạt động.",
            "Code mẫu: Triển khai Linked List",
            "Nội dung: C có cộng đồng lập trình viên rộng lớn, nhiều tài liệu hướng dẫn, thư viện mã nguồn mở đa dạng.",
            "Nội dung: C được sử dụng trong nhiều lĩnh vực: hệ điều hành, nhúng, game, IoT, tài chính. Các công ty lớn như Microsoft, Google, Intel đều cần kỹ sư giỏi C.",
            "Nội dung: C yêu cầu quản lý bộ nhớ thủ công, kiểm soát lỗi cẩn thận, giúp hình thành thói quen lập trình kỷ luật.",
            "Code mẫu: Xử lý lỗi trong C",
            "Nội dung: Hiểu C là cần thiết để làm việc với hệ thống cấp thấp, phân tích mã độc, phát triển phần mềm bảo mật.",
            "Code mẫu: Làm việc với con trỏ hàm",
            "Học C cung cấp nền tảng vững chắc cho sự nghiệp lập trình, giúp bạn:\n"
            + "\n"
            + "Hiểu sâu cách máy tính hoạt động\n"
            + "\n"
            + "Phát triển kỹ năng lập trình hệ thống\n"
            + "\n"
            + "Dễ dàng chuyển sang ngôn ngữ khác\n"
            + "\n"
            + "Mở ra cơ hội trong nhiều lĩnh vực công nghệ"
        });

        Content_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "C kết hợp các tính năng của ngôn ngữ cấp cao và cấp thấp, cho phép lập trình hệ thống (như driver, hệ điều hành) và ứng dụng.",
            "C hỗ trợ các cấu trúc lập trình như hàm, vòng lặp, điều kiện giúp code dễ đọc và bảo trì.",
            "Code C có thể chạy trên nhiều nền tảng khác nhau với ít hoặc không cần thay đổi.",
            "Con trỏ cho phép truy cập và thao tác trực tiếp với bộ nhớ.",
            "C cung cấp các hàm như malloc(), calloc(), free() để quản lý bộ nhớ động.",
            "C được biên dịch trực tiếp thành mã máy nên có tốc độ thực thi nhanh.",
            "C có nhiều thư viện chuẩn (standard library) cung cấp các hàm hữu ích.",
            "C chỉ có khoảng 32 từ khóa và cú pháp đơn giản.",
            "C thường được dùng để phát triển hệ điều hành, trình biên dịch, driver.",
            "Có thể dễ dàng mở rộng chức năng bằng cách thêm các hàm mới."
        });

        Content_MAP.put("Nguồn gốc của C", new String[]{
            "Ngôn ngữ C được phát triển vào đầu những năm 1970 tại Bell Labs (Phòng thí nghiệm Bell) bởi Dennis Ritchie. Ngôn ngữ này ra đời trong bối cảnh:\n"
            + "\n"
            + "Hệ điều hành UNIX đang được phát triển tại Bell Labs\n"
            + "\n"
            + "Cần một ngôn ngữ lập trình hệ thống hiệu quả hơn assembly\n"
            + "\n"
            + "Kế thừa từ ngôn ngữ B (do Ken Thompson phát triển) và BCPL",
            "1969-1973: Giai đoạn phát triển ban đầu bởi Dennis Ritchie\n"
            + "\n"
            + "1978: Xuất bản cuốn \"The C Programming Language\" (K&R C)\n"
            + "\n"
            + "1989: Chuẩn hóa bởi ANSI (ANSI C hay C89)\n"
            + "\n"
            + "1990: ISO chấp nhận thành chuẩn ISO/IEC 9899:1990 (C90)\n"
            + "\n"
            + "1999: Chuẩn C99 với nhiều cải tiến\n"
            + "\n"
            + "2011: Chuẩn C11 bổ sung tính năng đa luồng\n"
            + "\n"
            + "2018: Chuẩn C18 (chủ yếu sửa lỗi)",
            "Ngôn ngữ bậc trung (middle-level)\n"
            + "\n"
            + "Cấu trúc và thủ tục (structured/procedural)\n"
            + "\n"
            + "Tương thích với phần cứng\n"
            + "\n"
            + "Hiệu suất cao\n"
            + "\n"
            + "Thư viện phong phú\n"
            + "\n"
            + "Tính linh hoạt và khả năng di động",
            "C đã ảnh hưởng đến nhiều ngôn ngữ khác như C++, Java, C#, Objective-C. Ứng dụng chính:\n"
            + "\n"
            + "Hệ điều hành (UNIX, Linux, Windows kernel)\n"
            + "\n"
            + "Hệ thống nhúng\n"
            + "\n"
            + "Trình biên dịch\n"
            + "\n"
            + "Cơ sở dữ liệu\n"
            + "\n"
            + "Ứng dụng hiệu suất cao",
            "Chương trình \"Hello World\" cơ bản",
            "Ví dụ về cấu trúc điều khiển",
            "Ví dụ về hàm và con trỏ",
            "Ví dụ về struct",
            "Ví dụ về quản lý bộ nhớ động",
            "Ngôn ngữ C đã tồn tại hơn 50 năm nhưng vẫn giữ vị trí quan trọng trong lập trình hệ thống và các ứng dụng hiệu suất cao. Sự đơn giản, hiệu quả và khả năng kiểm soát phần cứng khiến C trở thành ngôn ngữ không thể thay thế trong nhiều lĩnh vực."
        });

        Content_MAP.put("Các phiên bản của C", new String[]{
            "Mô tả: Phiên bản đầu tiên được mô tả trong cuốn \"The C Programming Language\" bởi Brian Kernighan và Dennis Ritchie.",
            "Đặc điểm:\n"
            + "\n"
            + "Không có prototype hàm\n"
            + "\n"
            + "Khai báo hàm kiểu cũ\n"
            + "\n"
            + "Không có kiểu void\n"
            + "\n"
            + "Xử lý kiểu đơn giản",
            "Code mẫu:",
            "Mô tả: Chuẩn hóa đầu tiên bởi ANSI (1989) và ISO (1990).",
            "Đặc điểm mới:\n"
            + "\n"
            + "Thêm prototype hàm\n"
            + "\n"
            + "Thêm kiểu void\n"
            + "\n"
            + "Thêm hằng chuỗi (string literal)\n"
            + "\n"
            + "Thêm thư viện chuẩn\n"
            + "\n"
            + "Hỗ trợ comment //",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 1999, bổ sung nhiều tính năng quan trọng.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Biến có thể khai báo ở bất kỳ đâu\n"
            + "\n"
            + "Hỗ trợ comment một dòng //\n"
            + "\n"
            + "Kiểu long long\n"
            + "\n"
            + "Mảng có kích thước thay đổi (VLA)\n"
            + "\n"
            + "Hỗ trợ số học phức tạp\n"
            + "\n"
            + "Macro với số lượng đối số thay đổi",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 2011, tập trung vào đa luồng và an toàn.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Hỗ trợ đa luồng (_Thread_local, <threads.h>)\n"
            + "\n"
            + "Biểu thức kiểu generic (_Generic)\n"
            + "\n"
            + "Hàm an toàn (bounds-checking) trong Annex K\n"
            + "\n"
            + "Macro static_assert\n"
            + "\n"
            + "Hủy bỏ gets()",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 2018, chủ yếu sửa lỗi và cải tiến nhỏ.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Sửa lỗi từ C11\n"
            + "\n"
            + "Thêm một số tính năng từ thư viện\n"
            + "\n"
            + "Không thay đổi ngôn ngữ cốt lõi",
            "Code mẫu:",
            "Mô tả: Chuẩn sắp tới (dự kiến 2023), nhiều cải tiến quan trọng.",
            "Đặc điểm mới (dự kiến):\n"
            + "\n"
            + "#elifdef và #elifndef\n"
            + "\n"
            + "Thuộc tính [[deprecated]]\n"
            + "\n"
            + "Hỗ trợ UTF-8 tốt hơn\n"
            + "\n"
            + "Thêm constexpr\n"
            + "\n"
            + "nullptr thay cho NULL",
            "Code mẫu (dự thảo):"
        });

        Content_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "Ngôn ngữ C\n"
            + "Mục đích: Ngôn ngữ lập trình hệ thống, phát triển hệ điều hành, driver, embedded systems\n"
            + "\n"
            + "Năm ra đời: 1972\n"
            + "\n"
            + "Đặc điểm: Ngôn ngữ bậc thấp, thủ tục, biên dịch\n"
            + "\n"
            + "Ưu điểm: Hiệu suất cao, kiểm soát phần cứng tốt, nhỏ gọn\n"
            + "\n"
            + "Nhược điểm: Không hỗ trợ OOP, quản lý bộ nhớ thủ công",
            "Các ngôn ngữ khác\n"
            + "Java: Hướng đối tượng, đa nền tảng (JVM), tự động quản lý bộ nhớ\n"
            + "\n"
            + "Python: Ngôn ngữ bậc cao, thông dịch, đa mục đích, cú pháp đơn giản\n"
            + "\n"
            + "JavaScript: Ngôn ngữ kịch bản web, chạy trên trình duyệt\n"
            + "\n"
            + "C++: Mở rộng từ C, hỗ trợ OOP và lập trình đa hình",
            "Hello World trong các ngôn ngữ",
            "C:",
            "Java:",
            "Python:",
            "JavaScript:",
            "C++:",
            "C\n"
            + "Quản lý thủ công bằng malloc/calloc/realloc/free\n"
            + "\n"
            + "Dễ xảy ra rò rỉ bộ nhớ nếu không giải phóng",
            "Java/Python/JavaScript\n"
            + "Tự động quản lý bộ nhớ (Garbage Collection)\n"
            + "\n"
            + "Lập trình viên không cần quan tâm đến giải phóng bộ nhớ",
            "Java:",
            "C\n"
            + "Không hỗ trợ OOP nguyên bản\n"
            + "\n"
            + "Có thể mô phỏng bằng struct và function pointer",
            "C++/Java/Python\n"
            + "Hỗ trợ đầy đủ OOP: lớp, đối tượng, kế thừa, đa hình",
            "C++:",
            "C\n"
            + "Hiệu suất cao nhất do gần với phần cứng\n"
            + "\n"
            + "Tối ưu hóa tốt khi biên dịch\n"
            + "\n"
            + "Không có overhead từ runtime environment",
            "C++\n"
            + "Hiệu suất gần bằng C, có thể chậm hơn đôi chút do các tính năng OOP",
            "Java/Python/JavaScript\n"
            + "Chậm hơn do chạy trên máy ảo hoặc thông dịch\n"
            + "\n"
            + "Java nhanh hơn Python/JavaScript nhờ JIT compiler",
            "C\n"
            + "Hệ điều hành (Linux, Windows kernel)\n"
            + "\n"
            + "Driver phần cứng\n"
            + "\n"
            + "Hệ thống nhúng (IoT, vi điều khiển)\n"
            + "\n"
            + "Các thư viện hiệu suất cao",
            "Các ngôn ngữ khác\n"
            + "Java: Ứng dụng doanh nghiệp, Android\n"
            + "\n"
            + "Python: Khoa học dữ liệu, AI, scripting, web backend\n"
            + "\n"
            + "JavaScript: Web frontend (React, Angular), Node.js\n"
            + "\n"
            + "C++: Game development, hệ thống hiệu suất cao",
            "C",
            "Java",
            "Python",
            "JavaScript",
            "C phù hợp cho lập trình hệ thống, nơi cần hiệu suất cao và kiểm soát phần cứng\n"
            + "\n"
            + "C++ kết hợp sức mạnh của C với OOP, phù hợp cho game, ứng dụng hiệu suất cao\n"
            + "\n"
            + "Java/Python/JavaScript phù hợp cho ứng dụng cấp cao, phát triển nhanh\n"
            + "\n"
            + "Lựa chọn ngôn ngữ phụ thuộc vào yêu cầu dự án: hiệu suất, thời gian phát triển, nền tảng mục tiêu"
        });

        Content_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "C là ngôn ngữ chính để phát triển hệ điều hành do khả năng truy cập trực tiếp vào phần cứng và hiệu suất cao.",
            "Nội dung:\n"
            + "\n"
            + "Unix và các hệ điều hành giống Unix (Linux, macOS) được viết chủ yếu bằng C\n"
            + "\n"
            + "Cung cấp khả năng kiểm soát bộ nhớ và tài nguyên hệ thống\n"
            + "\n"
            + "Cho phép tương tác trực tiếp với kernel và driver",
            "Code mẫu: Tạo tiến trình con bằng fork()",
            "Nội dung:\n"
            + "\n"
            + "C cho phép truy cập trực tiếp vào thanh ghi phần cứng\n"
            + "\n"
            + "Có thể quản lý ngắt (interrupt) và DMA\n"
            + "\n"
            + "Tương tác với phần cứng ở mức thấp",
            "Code mẫu: Driver đơn giản cho GPIO",
            "Nội dung:\n"
            + "\n"
            + "C được sử dụng rộng rãi trong lập trình vi điều khiển\n"
            + "\n"
            + "Hiệu quả về tài nguyên và tốc độ thực thi\n"
            + "\n"
            + "Có thể tương tác trực tiếp với phần cứng mà không cần hệ điều hành",
            "Code mẫu: Điều khiển LED trên vi điều khiển AVR",
            "Nội dung:\n"
            + "\n"
            + "C được dùng để phát triển giao thức mạng và stack mạng\n"
            + "\n"
            + "Hiệu suất cao trong xử lý packet\n"
            + "\n"
            + "Có thể làm việc với socket ở mức thấp",
            "Code mẫu: TCP Server đơn giản",
            "Nội dung:\n"
            + "\n"
            + "C được dùng để phát triển các công cụ hệ thống như shell, trình biên dịch, debugger\n"
            + "\n"
            + "Cung cấp khả năng kiểm soát tiến trình và tài nguyên hệ thống\n"
            + "\n"
            + "Hiệu suất cao trong xử lý file và I/O",
            "Code mẫu: Lệnh ls đơn giản",
            "Nội dung:\n"
            + "\n"
            + "Phát triển các công cụ bảo mật như firewall, IDS/IPS\n"
            + "\n"
            + "Làm việc với các cơ chế bảo mật của hệ điều hành\n"
            + "\n"
            + "Phân tích và xử lý các lỗ hổng hệ thống",
            "Code mẫu: Kiểm tra quyền root",
            "Nội dung:\n"
            + "\n"
            + "Phát triển hệ thống file và các công cụ quản lý file\n"
            + "\n"
            + "Làm việc với các thao tác I/O mức thấp\n"
            + "\n"
            + "Quản lý metadata và cấu trúc file system",
            "Code mẫu: Đọc thông tin inode",
            "Nội dung:\n"
            + "\n"
            + "Phát triển hypervisor và các công cụ ảo hóa\n"
            + "\n"
            + "Quản lý tài nguyên ảo hóa\n"
            + "\n"
            + "Tương tác với phần cứng ảo hóa",
            "Code mẫu: Kiểm tra ảo hóa bằng CPUID",
            "Ngôn ngữ C tiếp tục là lựa chọn hàng đầu cho lập trình hệ thống nhờ:\n"
            + "\n"
            + "Hiệu suất gần với ngôn ngữ assembly\n"
            + "\n"
            + "Khả năng kiểm soát phần cứng\n"
            + "\n"
            + "Tính di động và ổn định\n"
            + "\n"
            + "Thư viện hệ thống phong phú\n"
            + "\n"
            + "Cộng đồng hỗ trợ mạnh mẽ"
        });

        Content_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "Ngôn ngữ C là ngôn ngữ lập trình phổ biến nhất trong phát triển phần mềm nhúng do:\n"
            + "\n"
            + "Hiệu suất cao, gần với phần cứng\n"
            + "\n"
            + "Tiêu thụ tài nguyên thấp (bộ nhớ, CPU)\n"
            + "\n"
            + "Khả năng kiểm soát trực tiếp phần cứng\n"
            + "\n"
            + "Tính di động cao giữa các kiến trúc vi điều khiển",
            "2.1. Kiểu dữ liệu và kích thước\n"
            + "Trong hệ thống nhúng, việc hiểu rõ kích thước kiểu dữ liệu là quan trọng:",
            "2.2. Bit manipulation\n"
            + "Thao tác bit là kỹ thuật quan trọng để điều khiển phần cứng:",
            "3.1. Truy cập thanh ghi phần cứng\n"
            + "Cách truy cập thanh ghi phần cứng thông qua con trỏ:",
            "3.2. Ngắt (Interrupts)\n"
            + "Xử lý ngắt trong hệ thống nhúng:",
            "4.1. Bộ nhớ tĩnh và stack",
            "4.2. Quản lý heap (hạn chế sử dụng trong hệ thống nhúng)",
            "5.1. UART Communication",
            "5.2. SPI Communication",
            "6.1. Tạo task cơ bản (FreeRTOS example)",
            "6.2. Semaphore và Queue",
            "7.1. Sử dụng inline và macro",
            "7.2. Tối ưu vòng lặp",
            "8.1. Sử dụng assert",
            "8.2. Logging trong hệ thống nhúng",
            "9.1. Coding style",
            "9.2. Xử lý lỗi",
            "Ngôn ngữ C tiếp tục là lựa chọn hàng đầu cho phát triển phần mềm nhúng do:\n"
            + "\n"
            + "Hiệu suất cao và kiểm soát trực tiếp phần cứng\n"
            + "\n"
            + "Tiêu thụ tài nguyên thấp\n"
            + "\n"
            + "Hỗ trợ rộng rãi từ các nhà sản xuất vi điều khiển\n"
            + "\n"
            + "Cộng đồng phát triển mạnh mẽ"
        });

        Content_MAP.put("Cấu trúc tổng quát", new String[]{
            "Chứa các khai báo thư viện cần thiết cho chương trình.",
            "Định nghĩa các hằng số sẽ được sử dụng trong chương trình.",
            "Khai báo các hàm sẽ được sử dụng trong chương trình.",
            "Các biến có thể được truy cập từ mọi nơi trong chương trình.",
            "Hàm chính, điểm bắt đầu của chương trình.",
            "Triển khai chi tiết các hàm đã được khai báo.",
            "Thư viện: Chứa các file header cần thiết cho chương trình\n"
            + "\n"
            + "Hằng số: Định nghĩa các giá trị không đổi trong chương trình\n"
            + "\n"
            + "Nguyên mẫu hàm: Khai báo các hàm trước khi sử dụng\n"
            + "\n"
            + "Biến toàn cục: Có thể truy cập từ mọi hàm trong chương trình\n"
            + "\n"
            + "Hàm main: Điểm bắt đầu thực thi chương trình\n"
            + "\n"
            + "Định nghĩa hàm: Triển khai chi tiết các hàm đã khai báo"
        });

        Content_MAP.put("Khai báo biến", new String[]{
            "Biến trong C là tên gọi của một vùng nhớ được sử dụng để lưu trữ dữ liệu trong chương trình. Mỗi biến có một kiểu dữ liệu xác định và có thể thay đổi giá trị trong quá trình thực thi chương trình.",
            "Cú pháp cơ bản để khai báo biến trong C:",
            "a. Kiểu số nguyên",
            "b. Kiểu số thực",
            "c. Kiểu ký tự",
            "d. Kiểu boolean (C99 trở lên)",
            "Biến static giữ nguyên giá trị giữa các lần gọi hàm:",
            "File1.c:",
            "File2.c:",
            "Tên biến chỉ có thể chứa chữ cái, số và dấu gạch dưới\n"
            + "\n"
            + "Tên biến phải bắt đầu bằng chữ cái hoặc dấu gạch dưới\n"
            + "\n"
            + "Tên biến phân biệt hoa thường\n"
            + "\n"
            + "Không được trùng với từ khóa của C",
            "Ví dụ tên biến hợp lệ:",
            "Biến cục bộ: Chỉ có tác dụng trong khối lệnh hoặc hàm chứa nó\n"
            + "\n"
            + "Biến toàn cục: Có tác dụng trong toàn chương trình\n"
            + "\n"
            + "Biến tham số hàm: Có tác dụng trong hàm chứa nó\n"
            + "\n"
            + "Ví dụ:"
        });

        Content_MAP.put("Hàm main", new String[]{
            "1. Kiểu trả về\n"
            + "Hàm main thường có kiểu trả về int để báo cáo trạng thái thoát của chương trình cho hệ điều hành:\n"
            + "\n"
            + "0: Thành công\n"
            + "\n"
            + "Khác 0: Lỗi (thường là 1)",
            "2. Tham số\n"
            + "Hàm main có thể nhận các tham số từ dòng lệnh:\n"
            + "\n"
            + "argc (argument count): Số lượng tham số\n"
            + "\n"
            + "argv (argument vector): Mảng các chuỗi tham số",
            "3. Nội dung hàm\n"
            + "Phần thân hàm chứa các lệnh sẽ được thực thi khi chương trình chạy.",
            "1. Không tham số",
            "2. Có tham số dòng lệnh",
            "3. Sử dụng tham số môi trường (ít phổ biến hơn)",
            "Phần khai báo: Bao gồm các thư viện cần thiết\n"
            + "\n"
            + "Hàm phụ trợ: factorial() để tính giai thừa\n"
            + "\n"
            + "Kiểm tra tham số: Đảm bảo người dùng nhập đúng định dạng\n"
            + "\n"
            + "Xử lý lỗi: Thông báo lỗi và trả về mã lỗi khi cần\n"
            + "\n"
            + "Xử lý chính: Chuyển đổi tham số và tính toán kết quả\n"
            + "\n"
            + "Trả về kết quả: In ra màn hình và trả về mã thành công",
            "Luôn trả về giá trị từ hàm main (thường là 0 cho thành công)\n"
            + "\n"
            + "Kiểm tra số lượng và kiểu tham số khi sử dụng tham số dòng lệnh\n"
            + "\n"
            + "Trong C99 và C11, return 0; có thể được bỏ qua (compiler sẽ tự thêm)\n"
            + "\n"
            + "void trong main(void) là cách rõ ràng để chỉ ra không có tham số\n"
            + "\n"
            + "Hàm main là nơi bắt đầu và kết thúc luồng thực thi của chương trình C, vì vậy việc thiết kế hàm main rõ ràng, xử lý lỗi tốt là rất quan trọng."
        });

        Content_MAP.put("Các bước biên dịch", new String[]{
            "Trong giai đoạn này, trình tiền xử lý (preprocessor) sẽ xử lý các chỉ thị tiền xử lý (bắt đầu bằng #) trong mã nguồn.",
            "Các công việc chính:\n"
            + "\n"
            + "Bao gồm các file header (#include)\n"
            + "\n"
            + "Xử lý các macro (#define)\n"
            + "\n"
            + "Xử lý điều kiện biên dịch (#ifdef, #ifndef, #endif)\n"
            + "\n"
            + "Bỏ các comment trong mã nguồn",
            "Ví dụ:",
            "Sau khi tiền xử lý (có thể xem bằng gcc -E sample.c):",
            "Trình biên dịch (compiler) sẽ chuyển mã nguồn đã qua tiền xử lý thành mã assembly tương ứng với kiến trúc máy đích.",
            "Công việc chính:\n"
            + "\n"
            + "Kiểm tra cú pháp và ngữ nghĩa\n"
            + "\n"
            + "Phân tích mã nguồn và tạo mã assembly\n"
            + "\n"
            + "Tối ưu hóa code (nếu được bật)",
            "Ví dụ mã assembly (xem bằng gcc -S sample.c):",
            "Trình dịch hợp ngữ (assembler) sẽ chuyển mã assembly thành mã máy (object code) và tạo ra file object (.o hoặc .obj).",
            "Công việc chính:\n"
            + "\n"
            + "Dịch lệnh assembly sang mã máy\n"
            + "\n"
            + "Tạo các bảng tham chiếu (symbol table)\n"
            + "\n"
            + "Đóng gói thành file object",
            "Ví dụ (tạo file object bằng gcc -c sample.c sẽ tạo ra sample.o)",
            "Trình liên kết (linker) sẽ kết hợp các file object và thư viện để tạo ra file thực thi cuối cùng.",
            "Công việc chính:\n"
            + "\n"
            + "Giải quyết các tham chiếu chéo giữa các file object\n"
            + "\n"
            + "Liên kết với các thư viện (libc, ...)\n"
            + "\n"
            + "Phân bổ bộ nhớ cho chương trình\n"
            + "\n"
            + "Tạo file thực thi (executable)",
            "Ví dụ (tạo file thực thi bằng gcc sample.c -o sample)",
            "Chương trình chia thành nhiều file:",
            "Quá trình biên dịch từng bước:",
            "Tiền xử lý từng file:",
            "Biên dịch sang assembly:",
            "Dịch sang ngôn ngữ máy:",
            "Liên kết các file object:",
            "Chạy chương trình:",
            "Kết quả:"
        });

        Content_MAP.put("Quá trình thực thi", new String[]{
            "Nội dung: Đây là bước đầu tiên, lập trình viên viết mã nguồn bằng ngôn ngữ C theo cú pháp của ngôn ngữ.",
            "Code mẫu:",
            "Nội dung: Trình tiền xử lý (preprocessor) xử lý các chỉ thị bắt đầu bằng #:\n"
            + "\n"
            + "Bao gồm các file header (#include)\n"
            + "\n"
            + "Thay thế macro (#define)\n"
            + "\n"
            + "Xử lý điều kiện biên dịch (#ifdef, #ifndef)",
            "Kết quả sau tiền xử lý (có thể xem bằng gcc -E hello.c):",
            "Nội dung: Trình biên dịch (compiler) chuyển mã nguồn đã tiền xử lý thành mã assembly tương ứng với kiến trúc CPU.",
            "Lệnh biên dịch:",
            "Mã assembly mẫu (hello.s):",
            "Nội dung: Trình dịch hợp ngữ (assembler) chuyển mã assembly thành mã máy (object code) dạng nhị phân.",
            "Lệnh tạo file object:",
            "Nội dung: Trình liên kết (linker) kết hợp các file object và thư viện để tạo ra file thực thi hoàn chỉnh:\n"
            + "\n"
            + "Giải quyết các tham chiếu chéo giữa các file object\n"
            + "\n"
            + "Liên kết với các thư viện chuẩn (như thư viện C - libc)",
            "Lệnh liên kết:",
            "Nội dung: Hệ điều hành nạp chương trình vào bộ nhớ để thực thi:\n"
            + "\n"
            + "Đọc file thực thi\n"
            + "\n"
            + "Cấp phát bộ nhớ\n"
            + "\n"
            + "Nạp các thư viện động (nếu có)\n"
            + "\n"
            + "Thiết lập môi trường thực thi",
            "Nội dung: CPU thực thi các lệnh máy của chương trình:\n"
            + "\n"
            + "Thực thi từ hàm main()\n"
            + "\n"
            + "Quản lý bộ nhớ stack và heap\n"
            + "\n"
            + "Xử lý các lời gọi hàm và hệ thống",
            "Dưới đây là một chương trình C đầy đủ hơn minh họa các khái niệm:",
            "Tiền xử lý:",
            "Biên dịch sang assembly:",
            "Dịch sang ngôn ngữ máy:",
            "Liên kết:",
            "Thực thi:",
            "Kết quả khi chạy chương trình:",
            "File .c: Mã nguồn C\n"
            + "\n"
            + "File .i: Mã nguồn đã qua tiền xử lý\n"
            + "\n"
            + "File .s: Mã assembly\n"
            + "\n"
            + "File .o: Mã máy (object file)\n"
            + "\n"
            + "File thực thi (hoặc .exe trên Windows): Chương trình hoàn chỉnh"
        });

        Content_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "Trình biên dịch trong C là chương trình chuyển đổi mã nguồn (source code) viết bằng ngôn ngữ C thành mã máy (machine code) hoặc mã trung gian. Quá trình biên dịch bao gồm các giai đoạn chính:",
            "Tiền xử lý (Preprocessing): Xử lý các chỉ thị tiền xử lý như #include, #define, #ifdef...\n"
            + "\n"
            + "Biên dịch (Compilation): Chuyển mã nguồn đã qua tiền xử lý thành mã assembly\n"
            + "\n"
            + "Dịch assembly (Assembly): Chuyển mã assembly thành mã máy (tạo file object .o hoặc .obj)\n"
            + "\n"
            + "Liên kết (Linking): Kết hợp các file object và thư viện để tạo file thực thi\n"
            + "\n"
            + "Trình biên dịch C phổ biến nhất là GCC (GNU Compiler Collection).",
            "Code mẫu:",
            "Biên dịch với GCC:",
            "Trình liên kết có nhiệm vụ kết hợp các file object (.o hoặc .obj) được tạo ra bởi trình biên dịch và các thư viện (libraries) để tạo ra file thực thi cuối cùng. Công việc chính của linker:",
            "Liên kết các file object: Kết hợp mã máy từ nhiều file nguồn khác nhau\n"
            + "\n"
            + "Giải quyết các tham chiếu: Tìm và kết nối các hàm, biến được khai báo nhưng định nghĩa ở file khác\n"
            + "\n"
            + "Liên kết thư viện: Thêm các hàm từ thư viện chuẩn hoặc thư viện bên ngoài\n"
            + "\n"
            + "Phân bổ bộ nhớ: Sắp xếp các đoạn mã và dữ liệu vào các vùng nhớ phù hợp",
            "Có 2 loại liên kết chính:\n"
            + "\n"
            + "Liên kết tĩnh (Static linking): Code từ thư viện được nhúng trực tiếp vào file thực thi\n"
            + "\n"
            + "Liên kết động (Dynamic linking): File thực thi chỉ chứa tham chiếu đến thư viện, thư viện được nạp khi chạy chương trình",
            "Code mẫu liên kết nhiều file:\n"
            + "File 1: main.c",
            "File 2: math.c",
            "Biên dịch và liên kết:",
            "Chi tiết các bước:\n"
            + "Viết mã nguồn: Tạo các file .c và .h\n"
            + "\n"
            + "Tiền xử lý:\n"
            + "\n"
            + "Mở rộng #include\n"
            + "\n"
            + "Xử lý macro (#define)\n"
            + "\n"
            + "Điều kiện biên dịch (#ifdef, #ifndef)\n"
            + "\n"
            + "Biên dịch:\n"
            + "\n"
            + "Phân tích cú pháp (parsing)\n"
            + "\n"
            + "Kiểm tra kiểu\n"
            + "\n"
            + "Tối ưu hóa mã\n"
            + "\n"
            + "Tạo mã assembly\n"
            + "\n"
            + "Dịch assembly:\n"
            + "\n"
            + "Chuyển assembly thành mã máy\n"
            + "\n"
            + "Tạo file object (.o)\n"
            + "\n"
            + "Liên kết:\n"
            + "\n"
            + "Kết hợp các file object\n"
            + "\n"
            + "Giải quyết các tham chiếu\n"
            + "\n"
            + "Thêm code từ thư viện\n"
            + "\n"
            + "Tạo file thực thi",
            "Ví dụ đầy đủ với nhiều file:\n"
            + "File: utils.h",
            "File: utils.c",
            "File: app.c",
            "Biên dịch và liên kết:",
            "-o: Chỉ định tên file đầu ra",
            "-c: Chỉ biên dịch thành file object, không liên kết",
            "-I: Thêm thư mục tìm kiếm header file",
            "-L và -l: Liên kết với thư viện",
            "-g: Thêm thông tin debug",
            "-O: Tối ưu hóa mã",
            "-Wall: Bật tất cả cảnh báo"
        });

        Content_MAP.put("Câu lệnh if", new String[]{
            "Câu lệnh if trong C là một cấu trúc điều khiển cơ bản cho phép thực hiện các hành động khác nhau dựa trên các điều kiện khác nhau.",
            "Ví dụ:",
            "Khi muốn xử lý cả trường hợp điều kiện sai (false):",
            "Ví dụ:",
            "Khi có nhiều điều kiện cần kiểm tra:",
            "Ví dụ:",
            "Có thể lồng các câu lệnh if bên trong nhau:",
            "Ví dụ:",
            "Có thể sử dụng các toán tử logic (&&, ||, !) để kết hợp nhiều điều kiện:",
            "Ví dụ:",
            "Trong C, có thể kết hợp phép gán và so sánh trong điều kiện if:",
            "Ví dụ:",
            "Lưu ý: Cần cẩn thận khi sử dụng phép gán trong điều kiện if để tránh nhầm lẫn với phép so sánh (==)."
        });

        Content_MAP.put("Câu lệnh if-else", new String[]{
            "Câu lệnh if-else trong C là một cấu trúc điều khiển cơ bản cho phép thực hiện các khối lệnh khác nhau dựa trên điều kiện đúng hoặc sai.",
            "2.1. Câu lệnh if đơn giản",
            "2.2. Câu lệnh if-else",
            "2.3. Câu lệnh if-else if-else (nhiều điều kiện)",
            "2.4. Câu lệnh if lồng nhau",
            "3.1. Ví dụ if đơn giản",
            "3.2. Ví dụ if-else",
            "3.3. Ví dụ if-else if-else",
            "3.4. Ví dụ if lồng nhau",
            "Điều kiện trong if phải là biểu thức trả về giá trị boolean (0 là false, khác 0 là true)\n"
            + "\n"
            + "Có thể bỏ qua dấu ngoặc nhọn {} nếu khối lệnh chỉ có 1 câu lệnh\n"
            + "\n"
            + "Nên sử dụng dấu ngoặc nhọn {} ngay cả khi chỉ có 1 câu lệnh để tránh nhầm lẫn\n"
            + "\n"
            + "Có thể sử dụng các toán tử logic (&&, ||, !) để kết hợp nhiều điều kiện"
        });

        Content_MAP.put("Câu lệnh switch-case", new String[]{
            "Câu lệnh switch-case trong C là một cấu trúc điều khiển cho phép thực hiện nhiều nhánh khác nhau dựa trên giá trị của một biểu thức. Nó thường được sử dụng thay thế cho chuỗi các câu lệnh if-else khi cần kiểm tra nhiều giá trị khác nhau của cùng một biến.",
            "a. Biểu thức trong switch\n"
            + "Biểu thức phải trả về giá trị kiểu số nguyên (int, char, enum)\n"
            + "\n"
            + "Không thể sử dụng kiểu float, double hoặc chuỗi",
            "b. Các case\n"
            + "Mỗi case theo sau là một giá trị cụ thể để so sánh\n"
            + "\n"
            + "Giá trị trong case phải là hằng số (không thể là biến)\n"
            + "\n"
            + "Các giá trị case phải là duy nhất (không trùng lặp)",
            "c. Câu lệnh break\n"
            + "break dùng để thoát khỏi khối switch\n"
            + "\n"
            + "Nếu không có break, chương trình sẽ tiếp tục thực hiện các case tiếp theo (hiện tượng \"fall through\")",
            "d. Default case\n"
            + "Là trường hợp mặc định khi không có case nào khớp\n"
            + "\n"
            + "Không bắt buộc phải có, nhưng nên sử dụng để xử lý các trường hợp không mong muốn",
            "Ví dụ 1: Đánh giá điểm số",
            "Ví dụ 2: Tính toán đơn giản",
            "Ví dụ 3: Sử dụng fall through có chủ đích",
            "Biểu thức trong switch phải có kiểu nguyên (int, char, enum)\n"
            + "\n"
            + "Các case phải là giá trị hằng số, không thể là biến\n"
            + "\n"
            + "Luôn sử dụng break trừ khi có lý do cụ thể để fall through\n"
            + "\n"
            + "Nên sử dụng default case để xử lý các trường hợp không mong muốn\n"
            + "\n"
            + "Switch-case thường hiệu quả hơn chuỗi if-else dài khi so sánh cùng một biến"
        });

        Content_MAP.put("Vòng lặp for", new String[]{
            "Vòng lặp for trong C gồm 3 phần chính:",
            "1. Phần khởi tạo (Initialization)\n"
            + "Được thực hiện một lần duy nhất khi bắt đầu vòng lặp\n"
            + "\n"
            + "Thường dùng để khởi tạo biến đếm\n"
            + "\n"
            + "Có thể khai báo nhiều biến cách nhau bằng dấu phẩy\n"
            + "\n"
            + "Phần này có thể để trống nếu biến đếm đã được khởi tạo trước đó",
            "2. Phần điều kiện (Condition)\n"
            + "Được kiểm tra trước mỗi lần lặp\n"
            + "\n"
            + "Nếu điều kiện trả về true (khác 0), khối lệnh sẽ được thực thi\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Nếu để trống, điều kiện mặc định là true (lặp vô hạn)",
            "3. Phần cập nhật (Update)\n"
            + "Được thực hiện sau mỗi lần lặp\n"
            + "\n"
            + "Thường dùng để thay đổi giá trị biến đếm (tăng/giảm)\n"
            + "\n"
            + "Có thể thực hiện nhiều phép toán cách nhau bằng dấu phẩy\n"
            + "\n"
            + "Có thể để trống nếu việc cập nhật được thực hiện trong thân vòng lặp",
            "Ví dụ 1: Vòng lặp for cơ bản",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Vòng lặp for với nhiều biến",
            "Kết quả:",
            "Ví dụ 3: Vòng lặp for với phần khởi tạo để trống",
            "Kết quả:",
            "Ví dụ 4: Vòng lặp for vô hạn",
            "Ví dụ 5: Vòng lặp for lồng nhau",
            "Khi biết trước số lần lặp\n"
            + "\n"
            + "Khi cần truy cập các phần tử mảng/tập hợp theo chỉ số\n"
            + "\n"
            + "Khi cần thực hiện một công việc với biến đếm thay đổi theo quy luật"
        });

        Content_MAP.put("Vòng lặp while", new String[]{
            "Vòng lặp while là một cấu trúc điều khiển trong ngôn ngữ C cho phép thực hiện lặp đi lặp lại một khối lệnh khi một điều kiện nhất định vẫn còn đúng.",
            "1. Điều kiện (condition)\n"
            + "Là biểu thức logic được đánh giá trước mỗi lần lặp\n"
            + "\n"
            + "Nếu điều kiện trả về giá trị true (khác 0), khối lệnh sẽ được thực thi\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Điều kiện phải được đặt trong cặp ngoặc đơn ()",
            "2. Khối lệnh (body)\n"
            + "Là tập hợp các câu lệnh được thực thi khi điều kiện đúng\n"
            + "\n"
            + "Được bao bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Nếu chỉ có 1 câu lệnh, có thể bỏ qua ngoặc nhọn nhưng không khuyến khích",
            "3. Đặc điểm quan trọng\n"
            + "Vòng lặp while kiểm tra điều kiện trước khi thực hiện khối lệnh\n"
            + "\n"
            + "Có thể không thực hiện lần nào nếu điều kiện sai ngay từ đầu\n"
            + "\n"
            + "Cần có cơ chế thay đổi điều kiện trong khối lệnh để tránh lặp vô hạn",
            "Ví dụ 1: In các số từ 1 đến 5",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Tính tổng các số từ 1 đến n",
            "Ví dụ 3: Vòng lặp while vô hạn (cần phải tránh)",
            "Ví dụ 4: Đọc dữ liệu đến khi gặp điều kiện dừng",
            "Luôn đảm bảo điều kiện sẽ sai tại một thời điểm để tránh lặp vô hạn\n"
            + "\n"
            + "Khởi tạo biến điều kiện trước khi vào vòng lặp\n"
            + "\n"
            + "Có cơ chế thay đổi biến điều kiện trong thân vòng lặp\n"
            + "\n"
            + "Sử dụng break để thoát vòng lặp khi cần thiết\n"
            + "\n"
            + "Có thể sử dụng continue để bỏ qua phần còn lại của vòng lặp và kiểm tra điều kiện lại"
        });

        Content_MAP.put("Vòng lặp do-while", new String[]{
            "Vòng lặp do-while là một cấu trúc điều khiển trong ngôn ngữ C cho phép thực hiện một khối lệnh lặp đi lặp lại cho đến khi một điều kiện nhất định không còn đúng nữa. Điểm khác biệt chính giữa do-while và while là do-while đảm bảo khối lệnh được thực hiện ít nhất một lần, ngay cả khi điều kiện ban đầu là sai.",
            "1. Từ khóa do\n"
            + "Đánh dấu điểm bắt đầu của vòng lặp\n"
            + "\n"
            + "Bắt buộc phải có để xác định đây là vòng lặp do-while\n"
            + "\n"
            + "Theo sau bởi một khối lệnh trong cặp dấu ngoặc nhọn {}",
            "2. Khối lệnh\n"
            + "Chứa các câu lệnh sẽ được thực thi trong mỗi lần lặp\n"
            + "\n"
            + "Có thể chứa một hoặc nhiều câu lệnh\n"
            + "\n"
            + "Được thực thi ít nhất một lần, ngay cả khi điều kiện là false",
            "3. Từ khóa while và điều kiện\n"
            + "Điều kiện được kiểm tra sau mỗi lần thực thi khối lệnh\n"
            + "\n"
            + "Nếu điều kiện trả về true (khác 0), vòng lặp tiếp tục\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Điều kiện phải được đặt trong cặp dấu ngoặc đơn ()\n"
            + "\n"
            + "Kết thúc bằng dấu chấm phẩy ; (khác với vòng lặp while thông thường)",
            "Ví dụ 1: In các số từ 1 đến 5",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Nhập số dương từ người dùng",
            "Giải thích: Chương trình yêu cầu người dùng nhập số cho đến khi nhập một số dương.",
            "Ví dụ 3: Tính tổng các số từ 1 đến n",
            "Vòng lặp do-while luôn thực hiện khối lệnh ít nhất một lần\n"
            + "\n"
            + "Đảm bảo có cơ chế thay đổi điều kiện trong khối lệnh để tránh lặp vô hạn\n"
            + "\n"
            + "Dấu chấm phẩy sau while(điều_kiện) là bắt buộc\n"
            + "\n"
            + "Thích hợp cho các tình huống cần thực hiện trước, kiểm tra sau như menu, nhập dữ liệu"
        });

        Content_MAP.put("Khai báo mảng một chiều", new String[]{
            "Mảng một chiều (1D array) trong C là một cấu trúc dữ liệu lưu trữ một tập hợp các phần tử cùng kiểu dữ liệu theo một dãy liên tiếp trong bộ nhớ. Dưới đây là các phần chi tiết về khai báo mảng một chiều trong C:",
            "Cú pháp cơ bản để khai báo mảng một chiều:",
            "Trong đó:\n"
            + "\n"
            + "kiểu_dữ_liệu: Kiểu dữ liệu của các phần tử trong mảng (int, float, char,...)\n"
            + "\n"
            + "tên_mảng: Tên biến của mảng, tuân theo quy tắc đặt tên biến trong C\n"
            + "\n"
            + "kích_thước: Số lượng phần tử tối đa mảng có thể chứa (phải là hằng số nguyên)",
            "Có 2 cách khởi tạo mảng:",
            "a. Khai báo trước, khởi tạo sau",
            "b. Khai báo và khởi tạo cùng lúc",
            "Phần tử mảng được truy cập thông qua chỉ số (index) bắt đầu từ 0:",
            "Có thể xác định kích thước mảng (số phần tử) bằng toán tử sizeof:",
            "Chỉ số mảng bắt đầu từ 0 đến (kích_thước - 1)\n"
            + "\n"
            + "Truy cập ngoài phạm vi mảng sẽ gây lỗi không xác định\n"
            + "\n"
            + "Kích thước mảng phải là hằng số tại thời điểm biên dịch (trừ khi dùng malloc)\n"
            + "\n"
            + "Mảng không kiểm tra giới hạn tự động\n"
            + "\n"
            + "Tên mảng là con trỏ hằng trỏ đến phần tử đầu tiên"
        });

        Content_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "Mảng là một tập hợp các phần tử có cùng kiểu dữ liệu được lưu trữ liên tiếp trong bộ nhớ. Mỗi phần tử trong mảng được truy cập thông qua chỉ số (index).",
            "Các phần tử mảng được truy cập thông qua chỉ số, bắt đầu từ 0.",
            "Lưu ý: Trong C, khi truyền mảng vào hàm, thực chất là truyền địa chỉ của phần tử đầu tiên, do đó hàm có thể thay đổi giá trị của mảng gốc."
        });

        Content_MAP.put("Khai báo mảng hai chiều", new String[]{
            "Mảng 2 chiều trong C là một cấu trúc dữ liệu cho phép lưu trữ dữ liệu dưới dạng bảng (hàng và cột). Dưới đây là giải thích chi tiết về từng phần khi khai báo mảng 2 chiều:",
            "kiểu_dữ_liệu: Xác định kiểu của các phần tử trong mảng (int, float, char,...)\n"
            + "\n"
            + "tên_mảng: Tên biến đại diện cho mảng\n"
            + "\n"
            + "số_hàng: Số lượng hàng trong mảng\n"
            + "\n"
            + "số_cột: Số lượng cột trong mảng",
            "Có 3 cách khởi tạo mảng 2 chiều:",
            "a. Khởi tạo không chỉ định kích thước",
            "b. Khởi tạo chỉ định kích thước",
            "c. Khởi tạo dạng phẳng",
            "Khai báo không khởi tạo:\n"
            + "\n"
            + "int matrix1[3][4]: Tạo mảng 3x4 chưa có giá trị khởi tạo\n"
            + "\n"
            + "Các phần tử sẽ chứa giá trị rác (không xác định)",
            "Khai báo với khởi tạo đầy đủ:\n"
            + "\n"
            + "Mỗi hàng được bao bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Dễ đọc và kiểm soát cấu trúc dữ liệu",
            "Khai báo không chỉ định số hàng:\n"
            + "\n"
            + "Compiler tự động tính số hàng dựa trên số bộ giá trị khởi tạo\n"
            + "\n"
            + "Phải chỉ định số cột",
            "Khởi tạo dạng phẳng:\n"
            + "\n"
            + "Các giá trị được liệt kê liên tiếp\n"
            + "\n"
            + "Được gán theo thứ tự từ trái sang phải, từ trên xuống dưới",
            "Truy xuất phần tử:\n"
            + "\n"
            + "Sử dụng cú pháp tên_mảng[chỉ_số_hàng][chỉ_số_cột]\n"
            + "\n"
            + "Chỉ số bắt đầu từ 0",
            "Duyệt mảng:\n"
            + "\n"
            + "Sử dụng 2 vòng lặp lồng nhau\n"
            + "\n"
            + "Vòng lặp ngoài duyệt hàng\n"
            + "\n"
            + "Vòng lặp trong duyệt cột",
            "Tất cả mảng trong C có chỉ số bắt đầu từ 0\n"
            + "\n"
            + "Kích thước mảng tĩnh phải là hằng số tại thời điểm biên dịch\n"
            + "\n"
            + "Bộ nhớ của mảng 2 chiều được cấp phát liên tiếp trong bộ nhớ\n"
            + "\n"
            + "Có thể sử dụng con trỏ để truy cập mảng 2 chiều\n"
            + "\n"
            + "Khi truyền mảng 2 chiều vào hàm, phải chỉ định kích thước cột"
        });

        Content_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "Mảng 2 chiều (ma trận) trong C là một cấu trúc dữ liệu chứa các phần tử được sắp xếp theo hàng và cột. Mỗi phần tử trong mảng được xác định bởi chỉ số hàng và chỉ số cột.",
            "Đặc điểm:\n"
            + "\n"
            + "Có dạng hình chữ nhật (số phần tử các hàng bằng nhau)\n"
            + "\n"
            + "Kích thước được xác định bởi số hàng và số cột\n"
            + "\n"
            + "Phần tử đầu tiên có chỉ số [0][0]",
            "Có 2 cách khai báo mảng 2 chiều:",
            "a. Khai báo tĩnh",
            "b. Khai báo động (sử dụng con trỏ)",
            "Để truy cập phần tử tại hàng i cột j, sử dụng cú pháp:",
            "Ví dụ:",
            "a. Nhập và xuất mảng 2 chiều",
            "b. Tính tổng các phần tử",
            "c. Tìm phần tử lớn nhất/nhỏ nhất",
            "a. Tổng đường chéo chính",
            "b. Chuyển vị ma trận",
            "c. Nhân hai ma trận",
            "Có 2 cách chính để truyền mảng 2 chiều vào hàm:",
            "a. Truyền với kích thước cố định",
            "b. Truyền với kích thước động (sử dụng con trỏ)",
            "Kiểm tra giới hạn mảng: Luôn đảm bảo không truy cập vượt quá kích thước mảng\n"
            + "\n"
            + "Quản lý bộ nhớ: Với mảng động, luôn giải phóng bộ nhớ khi không dùng nữa\n"
            + "\n"
            + "Hiệu suất: Truy cập theo hàng thường nhanh hơn theo cột do cách bố trí bộ nhớ\n"
            + "\n"
            + "Truyền vào hàm: Khi truyền mảng tĩnh vào hàm, cần chỉ rõ kích thước cột\n"
            + "\n"
            + "Khởi tạo giá trị: Luôn khởi tạo giá trị cho mảng trước khi sử dụng"
        });

        Content_MAP.put("Khai báo chuỗi", new String[]{
            "Trong ngôn ngữ C, chuỗi (string) là một mảng các ký tự kết thúc bằng ký tự null ('\\0').",
            "a. Khai báo mảng ký tự",
            "Giải thích:\n"
            + "\n"
            + "char: Kiểu dữ liệu ký tự\n"
            + "\n"
            + "str1: Tên biến mảng\n"
            + "\n"
            + "[10]: Kích thước mảng (chứa tối đa 9 ký tự + 1 ký tự null)\n"
            + "\n"
            + "\"Hello\": Giá trị khởi tạo (tự động thêm '\\0' ở cuối)",
            "b. Khai báo không chỉ định kích thước",
            "Giải thích:\n"
            + "\n"
            + "[]: Kích thước mảng tự động xác định dựa trên chuỗi khởi tạo\n"
            + "\n"
            + "\"World\" có 5 ký tự + 1 ký tự null = 6 phần tử",
            "c. Khai báo con trỏ ký tự",
            "Giải thích:\n"
            + "\n"
            + "*str3: Con trỏ kiểu char\n"
            + "\n"
            + "\"Programming\" là chuỗi hằng được lưu trong segment văn bản (read-only)\n"
            + "\n"
            + "Con trỏ trỏ tới địa chỉ đầu của chuỗi",
            "Giải thích:\n"
            + "\n"
            + "Mảng chưa được khởi tạo, chứa giá trị rác\n"
            + "\n"
            + "Cần gán giá trị trước khi sử dụng",
            "Giải thích:\n"
            + "\n"
            + "Mảng 2 chiều gồm 7 chuỗi\n"
            + "\n"
            + "Mỗi chuỗi có tối đa 9 ký tự + 1 ký tự null",
            "Kết quả chạy chương trình:",
            "Ký tự null: Mọi chuỗi trong C phải kết thúc bằng '\\0'\n"
            + "\n"
            + "Phân biệt:\n"
            + "\n"
            + "char str[] = \"text\": Mảng có thể thay đổi nội dung\n"
            + "\n"
            + "char *str = \"text\": Chuỗi hằng, không thể thay đổi nội dung\n"
            + "\n"
            + "Kích thước: Luôn khai báo đủ lớn để chứa cả ký tự null\n"
            + "\n"
            + "Thư viện: Sử dụng #include <string.h> cho các hàm xử lý chuỗi"
        });

        Content_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "Ngôn ngữ C cung cấp nhiều hàm để xử lý chuỗi (mảng ký tự kết thúc bằng '\\0') thông qua thư viện <string.h>.",
            "a. strlen() - Độ dài chuỗi\n"
            + "Mô tả: Tính độ dài của chuỗi (không bao gồm ký tự kết thúc '\\0').",
            "b. strcpy() - Sao chép chuỗi\n"
            + "Mô tả: Sao chép nội dung từ chuỗi nguồn sang chuỗi đích.",
            "c. strcat() - Nối chuỗi\n"
            + "Mô tả: Nối chuỗi nguồn vào cuối chuỗi đích.",
            "a. strcmp() - So sánh chuỗi\n"
            + "Mô tả: So sánh hai chuỗi theo thứ tự từ điển.",
            "b. strncmp() - So sánh n ký tự đầu\n"
            + "Mô tả: So sánh n ký tự đầu tiên của hai chuỗi.",
            "a. strchr() - Tìm ký tự trong chuỗi\n"
            + "Mô tả: Tìm vị trí đầu tiên của ký tự trong chuỗi.",
            "b. strstr() - Tìm chuỗi con\n"
            + "Mô tả: Tìm vị trí đầu tiên của chuỗi con trong chuỗi.",
            "a. strtok() - Tách chuỗi\n"
            + "Mô tả: Tách chuỗi thành các token dựa trên delimiter.",
            "b. strrev() - Đảo ngược chuỗi\n"
            + "Lưu ý: Không phải là hàm chuẩn trong thư viện C, nhưng có trong một số trình biên dịch.",
            "c. strlwr() và strupr() - Chuyển đổi chữ hoa/thường\n"
            + "Lưu ý: Không phải là hàm chuẩn trong ANSI C, nhưng có trong nhiều trình biên dịch.",
            "a. strcpy_s() - Sao chép chuỗi an toàn\n"
            + "Mô tả: Phiên bản an toàn của strcpy với kiểm tra kích thước buffer.",
            "b. strcat_s() - Nối chuỗi an toàn\n"
            + "Mô tả: Phiên bản an toàn của strcat.",
            "Các hàm xử lý chuỗi trong C cung cấp nhiều tiện ích cho việc thao tác với dữ liệu văn bản. Khi sử dụng cần lưu ý:\n"
            + "\n"
            + "Luôn đảm bảo chuỗi đích có đủ không gian\n"
            + "\n"
            + "Kiểm tra giá trị NULL khi làm việc với con trỏ\n"
            + "\n"
            + "Ưu tiên sử dụng các hàm an toàn (_s) khi có thể\n"
            + "\n"
            + "Nhớ include thư viện <string.h>"
        });

        Content_MAP.put("So sánh và nối chuỗi", new String[]{
            "Trong ngôn ngữ C, không thể so sánh chuỗi trực tiếp bằng các toán tử so sánh (==, !=, >, <) vì chúng chỉ so sánh địa chỉ của chuỗi chứ không phải nội dung. Để so sánh nội dung chuỗi, ta sử dụng hàm strcmp() từ thư viện string.h.",
            "Hàm strcmp() có nguyên mẫu:",
            "Giá trị trả về:\n"
            + "\n"
            + "0 nếu hai chuỗi bằng nhau\n"
            + "\n"
            + "<0 nếu str1 nhỏ hơn str2 (theo thứ tự từ điển)\n"
            + "\n"
            + "0 nếu str1 lớn hơn str2 (theo thứ tự từ điển)",
            "Code mẫu:",
            "Nội dung:\n"
            + "Để nối chuỗi trong C, ta sử dụng hàm strcat() từ thư viện string.h. Hàm này sẽ nối chuỗi nguồn vào cuối chuỗi đích.\n"
            + "\n"
            + "Hàm strcat() có nguyên mẫu:",
            "Lưu ý:\n"
            + "\n"
            + "Chuỗi đích phải có đủ không gian để chứa cả nội dung ban đầu và chuỗi được nối thêm\n"
            + "\n"
            + "Chuỗi đích phải là mảng ký tự hoặc con trỏ trỏ tới vùng nhớ đủ lớn, không thể là chuỗi hằng",
            "Code mẫu:",
            "Nội dung:\n"
            + "Ngoài strcmp() và strcat(), thư viện string.h còn cung cấp nhiều hàm hữu ích khác cho việc xử lý chuỗi:\n"
            + "\n"
            + "strncmp(): So sánh n ký tự đầu tiên của 2 chuỗi\n"
            + "\n"
            + "strncat(): Nối n ký tự đầu tiên của chuỗi nguồn vào chuỗi đích\n"
            + "\n"
            + "strcpy(): Sao chép chuỗi\n"
            + "\n"
            + "strlen(): Lấy độ dài chuỗi",
            "Code mẫu:",
            "Lưu ý khi làm việc với chuỗi trong C:\n"
            + "\n"
            + "Luôn đảm bảo đủ bộ nhớ cho các thao tác\n"
            + "\n"
            + "Các hàm xử lý chuỗi trong C không tự động kiểm tra giới hạn bộ nhớ\n"
            + "\n"
            + "Kết thúc chuỗi phải có ký tự '\\0'"
        });

        Content_MAP.put("Khái niệm về con trỏ", new String[]{
            "Con trỏ là một trong những khái niệm quan trọng và mạnh mẽ nhất trong ngôn ngữ C. Nó cho phép bạn làm việc trực tiếp với bộ nhớ của máy tính.",
            "Con trỏ là một biến đặc biệt dùng để lưu trữ địa chỉ của một biến khác trong bộ nhớ. Thay vì lưu trữ giá trị dữ liệu trực tiếp, con trỏ lưu trữ vị trí (địa chỉ) nơi dữ liệu được lưu trữ.",
            "Cú pháp khai báo con trỏ:",
            "Ví dụ:",
            "Toán tử địa chỉ (&): Trả về địa chỉ bộ nhớ của một biến\n"
            + "\n"
            + "Toán tử dereference (*): Truy cập giá trị tại địa chỉ mà con trỏ đang trỏ đến",
            "Con trỏ và mảng có mối quan hệ chặt chẽ trong C. Tên mảng thực chất là một con trỏ hằng trỏ đến phần tử đầu tiên của mảng.",
            "Con trỏ cho phép truyền địa chỉ của biến vào hàm, cho phép hàm thay đổi giá trị của biến gốc.",
            "Là con trỏ lưu địa chỉ của một con trỏ khác.",
            "Con trỏ NULL là con trỏ không trỏ đến bất kỳ địa chỉ nào. Nó được sử dụng để kiểm tra và tránh truy cập vào vùng nhớ không hợp lệ.",
            "Con trỏ có thể trỏ đến hàm, cho phép gọi hàm thông qua con trỏ.",
            "Con trỏ thường được sử dụng với các hàm cấp phát động như malloc, calloc, realloc và free.",
            "Con trỏ void có thể trỏ đến bất kỳ kiểu dữ liệu nào, nhưng cần ép kiểu trước khi sử dụng.",
            "Con trỏ là công cụ mạnh mẽ nhưng cũng dễ gây lỗi nếu không sử dụng cẩn thận. Hiểu rõ cách hoạt động của con trỏ sẽ giúp bạn viết mã C hiệu quả và linh hoạt hơn."
        });

        Content_MAP.put("Khai báo con trỏ", new String[]{
            "Con trỏ (pointer) là một biến đặc biệt trong C, nó lưu trữ địa chỉ bộ nhớ của một biến khác thay vì giá trị trực tiếp.",
            "1. Kiểu dữ liệu của con trỏ\n"
            + "Xác định kiểu dữ liệu của biến mà con trỏ sẽ trỏ tới\n"
            + "\n"
            + "Ví dụ: int* (con trỏ tới số nguyên), float* (con trỏ tới số thực), char* (con trỏ tới ký tự)",
            "2. Toán tử con trỏ (*)\n"
            + "Dấu hoa thị (*) được sử dụng để khai báo một biến là con trỏ\n"
            + "\n"
            + "Cũng được sử dụng để truy cập giá trị tại địa chỉ mà con trỏ trỏ tới (dereference)",
            "3. Tên con trỏ\n"
            + "Đặt theo quy tắc đặt tên biến trong C\n"
            + "\n"
            + "Thường có tiền tố p hoặc ptr để dễ nhận biết (ví dụ: pNumber, ptrName)",
            "4. Toán tử địa chỉ (&)\n"
            + "Dấu và (&) được sử dụng để lấy địa chỉ của một biến\n"
            + "\n"
            + "Thường dùng khi gán giá trị cho con trỏ",
            "Khai báo biến thông thường: Tạo các biến với các kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Khai báo con trỏ: Sử dụng dấu * để khai báo các con trỏ tương ứng\n"
            + "\n"
            + "Gán địa chỉ: Sử dụng toán tử & để lấy địa chỉ của biến và gán cho con trỏ\n"
            + "\n"
            + "In giá trị: Minh họa cách truy cập giá trị trực tiếp và thông qua con trỏ\n"
            + "\n"
            + "Thay đổi giá trị: Cho thấy có thể thay đổi giá trị biến gốc thông qua con trỏ\n"
            + "\n"
            + "Con trỏ NULL: Minh họa con trỏ không trỏ tới địa chỉ hợp lệ"
        });

        Content_MAP.put("Toán tử con trỏ", new String[]{
            "Nội dung: Toán tử địa chỉ (&) trả về địa chỉ bộ nhớ của một biến.\n"
            + "\n"
            + "Được sử dụng để lấy địa chỉ của biến trong bộ nhớ\n"
            + "\n"
            + "Kết quả trả về là một con trỏ trỏ tới biến đó\n"
            + "\n"
            + "Không thể áp dụng cho hằng số hoặc biểu thức",
            "Nội dung: Toán tử dereference (*) truy cập giá trị tại địa chỉ mà con trỏ đang trỏ tới.\n"
            + "\n"
            + "Còn được gọi là toán tử \"gián tiếp\"\n"
            + "\n"
            + "Cho phép đọc hoặc ghi giá trị tại vị trí con trỏ trỏ tới\n"
            + "\n"
            + "Nếu con trỏ chưa được khởi tạo, việc dereference có thể gây lỗi",
            "Nội dung: Gán địa chỉ cho con trỏ.\n"
            + "\n"
            + "Con trỏ phải được khai báo cùng kiểu với biến mà nó trỏ tới\n"
            + "\n"
            + "Có thể gán giá trị NULL cho con trỏ để biểu thị nó không trỏ đến đâu\n"
            + "\n"
            + "Có thể gán giữa các con trỏ cùng kiểu",
            "Nội dung: Các phép toán số học trên con trỏ bao gồm cộng, trừ, tăng, giảm.\n"
            + "\n"
            + "Khi thực hiện phép toán, kích thước kiểu dữ liệu được tự động tính toán\n"
            + "\n"
            + "Chỉ có ý nghĩa khi con trỏ trỏ tới phần tử của mảng\n"
            + "\n"
            + "Bao gồm: ++, --, +, -, +=, -=",
            "Nội dung: So sánh giữa các con trỏ.\n"
            + "\n"
            + "Có thể so sánh bằng (==), không bằng (!=), lớn hơn (>), nhỏ hơn (<)\n"
            + "\n"
            + "Chỉ có ý nghĩa khi các con trỏ cùng trỏ tới các phần tử của cùng một mảng\n"
            + "\n"
            + "Con trỏ NULL có thể so sánh với bất kỳ con trỏ nào",
            "Nội dung: Sử dụng toán tử * nhiều lần để truy cập các cấp con trỏ lồng nhau.\n"
            + "\n"
            + "Mỗi dấu * tương ứng với một cấp dereference\n"
            + "\n"
            + "Thường dùng cho mảng 2 chiều hoặc khi cần thay đổi con trỏ trong hàm",
            "Nội dung: Toán tử -> dùng để truy cập thành phần của cấu trúc thông qua con trỏ.\n"
            + "\n"
            + "Là cách viết tắt của (*ptr).member\n"
            + "\n"
            + "Chỉ dùng với con trỏ trỏ tới cấu trúc\n"
            + "\n"
            + "Giúp code ngắn gọn và dễ đọc hơn"
        });

        Content_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "Xác định kiểu dữ liệu mà hàm sẽ trả về sau khi thực thi\n"
            + "\n"
            + "Nếu hàm không trả về giá trị nào, sử dụng void",
            "Định danh duy nhất cho hàm\n"
            + "\n"
            + "Theo quy tắc đặt tên trong C (bắt đầu bằng chữ hoặc _, không chứa khoảng trắng)",
            "Danh sách các biến đầu vào, đặt trong cặp ngoặc đơn\n"
            + "\n"
            + "Mỗi tham số gồm kiểu dữ liệu và tên biến\n"
            + "\n"
            + "Có thể để trống nếu hàm không nhận tham số",
            "Khối lệnh được đặt trong cặp ngoặc nhọn {}\n"
            + "\n"
            + "Chứa các câu lệnh thực thi\n"
            + "\n"
            + "Có thể có câu lệnh return để trả về giá trị (nếu hàm có kiểu trả về khác void)",
            "Giải thích ví dụ:\n"
            + "\n"
            + "Hàm sum():\n"
            + "\n"
            + "Kiểu trả về: int\n"
            + "\n"
            + "Tên hàm: sum\n"
            + "\n"
            + "Tham số: 2 tham số kiểu int là a và b\n"
            + "\n"
            + "Thân hàm: tính tổng a + b và trả về kết quả\n"
            + "\n"
            + "Hàm printHello():\n"
            + "\n"
            + "Kiểu trả về: void (không trả về giá trị)\n"
            + "\n"
            + "Tên hàm: printHello\n"
            + "\n"
            + "Không có tham số\n"
            + "\n"
            + "Thân hàm: in ra chuỗi \"Hello World!\"\n"
            + "\n"
            + "Hàm main() là hàm đặc biệt, điểm bắt đầu chương trình"
        });

        Content_MAP.put("Gọi hàm", new String[]{
            "1. Tên hàm\n"
            + "Là định danh của hàm được gọi\n"
            + "\n"
            + "Phải khớp chính xác với tên hàm đã được định nghĩa\n"
            + "\n"
            + "Phân biệt chữ hoa chữ thường trong C",
            "2. Danh sách đối số (arguments)\n"
            + "Các giá trị được truyền vào hàm\n"
            + "\n"
            + "Được đặt trong cặp dấu ngoặc đơn ()\n"
            + "\n"
            + "Các đối số cách nhau bởi dấu phẩy\n"
            + "\n"
            + "Kiểu dữ liệu của đối số phải khớp với tham số trong khai báo hàm",
            "3. Dấu chấm phẩy kết thúc\n"
            + "Mọi lời gọi hàm trong C phải kết thúc bằng dấu chấm phẩy (;)",
            "Khai báo hàm:\n"
            + "\n"
            + "int tinhTong(int a, int b) là khai báo hàm có kiểu trả về int, tên hàm tinhTong, nhận 2 tham số int\n"
            + "\n"
            + "Gọi hàm:\n"
            + "\n"
            + "tinhTong(5, 3) là lời gọi hàm với:\n"
            + "\n"
            + "Tên hàm: tinhTong\n"
            + "\n"
            + "Đối số: 5 và 3\n"
            + "\n"
            + "Kết quả được gán cho biến ketQua\n"
            + "\n"
            + "Hàm không có tham số:\n"
            + "\n"
            + "inThongBao() là lời gọi hàm không cần đối số\n"
            + "\n"
            + "Gọi hàm trong biểu thức:\n"
            + "\n"
            + "tinhTong(10, 20) được gọi trực tiếp trong lệnh printf\n"
            + "\n"
            + "Hàm thư viện:\n"
            + "\n"
            + "printf() là hàm từ thư viện chuẩn, được gọi với các đối số khác nhau"
        });

        Content_MAP.put("Hàm trả về giá trị", new String[]{
            "1. Kiểu trả về (Return type)\n"
            + "Là kiểu dữ liệu của giá trị mà hàm sẽ trả về\n"
            + "\n"
            + "Có thể là bất kỳ kiểu dữ liệu nào: int, float, char, double, con trỏ hoặc thậm chí kiểu void*\n"
            + "\n"
            + "Được khai báo ngay trước tên hàm",
            "2. Tên hàm (Function name)\n"
            + "Là định danh của hàm, tuân theo quy tắc đặt tên trong C\n"
            + "\n"
            + "Nên đặt tên có ý nghĩa, phản ánh chức năng của hàm",
            "3. Tham số (Parameters)\n"
            + "Danh sách các tham số đầu vào (nếu có) được đặt trong cặp ngoặc đơn\n"
            + "\n"
            + "Mỗi tham số gồm kiểu dữ liệu và tên tham số\n"
            + "\n"
            + "Các tham số cách nhau bằng dấu phẩy",
            "4. Thân hàm (Function body)\n"
            + "Chứa các câu lệnh thực hiện chức năng của hàm\n"
            + "\n"
            + "Được bao bọc bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Phải có ít nhất một câu lệnh return để trả về giá trị",
            "5. Câu lệnh return\n"
            + "Dùng để trả về giá trị từ hàm\n"
            + "\n"
            + "Giá trị sau return phải cùng kiểu hoặc có thể chuyển đổi ngầm định về kiểu trả về của hàm\n"
            + "\n"
            + "Khi gặp return, hàm sẽ kết thúc ngay lập tức",
            "Hàm tinhTong:\n"
            + "\n"
            + "Kiểu trả về: int\n"
            + "\n"
            + "Tham số: 2 số nguyên a và b\n"
            + "\n"
            + "Thân hàm: tính tổng 2 số và lưu vào biến tong\n"
            + "\n"
            + "Return: trả về giá trị tong\n"
            + "\n"
            + "Hàm laSoChan:\n"
            + "\n"
            + "Kiểu trả về: int (0 hoặc 1 như kiểu boolean)\n"
            + "\n"
            + "Tham số: 1 số nguyên num\n"
            + "\n"
            + "Thân hàm: kiểm tra số chẵn bằng phép chia dư\n"
            + "\n"
            + "Return: có 2 điểm return tùy điều kiện\n"
            + "\n"
            + "Hàm timMax:\n"
            + "\n"
            + "Kiểu trả về: float\n"
            + "\n"
            + "Tham số: 3 số thực x, y, z\n"
            + "\n"
            + "Thân hàm: tìm số lớn nhất bằng cách so sánh\n"
            + "\n"
            + "Return: trả về giá trị lớn nhất tìm được"
        });

        Content_MAP.put("Truyền tham số theo giá trị", new String[]{
            "Truyền tham số theo giá trị (pass by value) là cách truyền tham số phổ biến trong ngôn ngữ C, trong đó giá trị của biến được sao chép vào tham số của hàm. Khi hàm được gọi, nó làm việc với bản sao của giá trị chứ không phải với biến gốc, do đó mọi thay đổi trên tham số trong hàm sẽ không ảnh hưởng đến biến gốc.",
            "Tạo bản sao: Giá trị của biến được sao chép vào tham số hàm\n"
            + "\n"
            + "Độc lập bộ nhớ: Tham số hàm và biến gốc có vùng nhớ riêng biệt\n"
            + "\n"
            + "Không ảnh hưởng: Thay đổi tham số trong hàm không làm thay đổi biến gốc\n"
            + "\n"
            + "Hiệu quả với kiểu dữ liệu nhỏ: Phù hợp cho các kiểu dữ liệu đơn giản như int, float, char...",
            "Giá trị của x và y được sao chép vào a và b trong hàm swapByValue\n"
            + "\n"
            + "Hàm swapByValue hoán đổi giá trị của a và b thành công (in ra 10 và 5)\n"
            + "\n"
            + "Tuy nhiên, giá trị gốc của x và y trong hàm main không bị thay đổi\n"
            + "\n"
            + "Điều này chứng tỏ hàm làm việc với bản sao của giá trị chứ không phải biến gốc",
            "Ưu điểm:\n"
            + "\n"
            + "Đơn giản, dễ hiểu\n"
            + "\n"
            + "Đảm bảo giá trị biến gốc không bị thay đổi ngoài ý muốn\n"
            + "\n"
            + "Phù hợp khi chỉ cần sử dụng giá trị mà không cần thay đổi biến gốc",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ khi làm việc với kiểu dữ liệu lớn do phải sao chép toàn bộ giá trị\n"
            + "\n"
            + "Không thể thay đổi giá trị biến gốc từ bên trong hàm\n"
            + "\n"
            + "Không phù hợp khi cần trả về nhiều giá trị sau khi xử lý"
        });

        Content_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "Truyền tham số theo tham chiếu (pass by reference) là phương pháp truyền địa chỉ của biến vào hàm thay vì giá trị của biến. Khi đó, hàm có thể thay đổi trực tiếp giá trị của biến gốc thông qua địa chỉ này.\n"
            + "\n"
            + "Trong C, không có khái niệm tham chiếu như C++, nhưng chúng ta có thể mô phỏng bằng cách sử dụng con trỏ (pointer).",
            "Truyền địa chỉ của biến vào hàm\n"
            + "\n"
            + "Hàm có thể thay đổi giá trị của biến gốc\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi làm việc với cấu trúc dữ liệu lớn\n"
            + "\n"
            + "Thường dùng khi cần thay đổi nhiều giá trị hoặc làm việc với mảng, chuỗi",
            "Đặc điểm	Truyền tham trị	Truyền tham chiếu (dùng con trỏ)\n"
            + "Truyền vào hàm	Giá trị của biến	Địa chỉ của biến\n"
            + "Thay đổi giá trị	Không ảnh hưởng biến gốc	Ảnh hưởng trực tiếp biến gốc\n"
            + "Bộ nhớ	Tạo bản sao	Chỉ truyền địa chỉ\n"
            + "Hiệu suất	Kém hơn với dữ liệu lớn	Tốt hơn với dữ liệu lớn",
            "Ví dụ 1: Hoán đổi 2 số",
            "Ví dụ 2: Thay đổi giá trị biến",
            "Ví dụ 3: Làm việc với mảng",
            "Truyền tham số theo tham chiếu trong C được thực hiện thông qua con trỏ, cho phép hàm thay đổi giá trị của biến gốc. Phương pháp này đặc biệt hữu ích khi:\n"
            + "\n"
            + "Cần thay đổi nhiều giá trị trong hàm\n"
            + "\n"
            + "Làm việc với dữ liệu lớn để tránh sao chép\n"
            + "\n"
            + "Thao tác với mảng và chuỗi\n"
            + "\n"
            + "Cần trả về nhiều giá trị từ hàm"
        });

        Content_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "Truyền tham số bằng con trỏ trong C là phương pháp truyền địa chỉ của biến thay vì giá trị của biến vào hàm. Điều này cho phép hàm có thể thay đổi trực tiếp giá trị của biến gốc.",
            "Ưu điểm:\n"
            + "\n"
            + "Cho phép hàm thay đổi giá trị của biến gốc\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi làm việc với cấu trúc dữ liệu lớn\n"
            + "\n"
            + "Cho phép trả về nhiều giá trị thông qua tham số",
            "Khi truyền tham số bằng con trỏ:\n"
            + "\n"
            + "Hàm gọi truyền địa chỉ của biến (sử dụng toán tử &)\n"
            + "\n"
            + "Hàm nhận nhận tham số là con trỏ (khai báo với *)\n"
            + "\n"
            + "Hàm nhận có thể truy cập và thay đổi giá trị tại địa chỉ đó",
            "Ví dụ 1: Hàm hoán đổi giá trị",
            "Ví dụ 2: Thay đổi giá trị biến gốc",
            "Ví dụ 3: Làm việc với mảng",
            "Luôn kiểm tra con trỏ NULL trước khi sử dụng\n"
            + "\n"
            + "Cẩn thận với con trỏ \"dangling\" (trỏ đến vùng nhớ không hợp lệ)\n"
            + "\n"
            + "Sử dụng const với con trỏ khi không muốn thay đổi giá trị\n"
            + "\n"
            + "Phân biệt rõ giữa truyền giá trị và truyền tham chiếu (con trỏ)",
            "Sử dụng const để đảm bảo hàm không thay đổi giá trị:",
            "Truyền tham số bằng con trỏ là một kỹ thuật mạnh mẽ trong C, giúp tối ưu hiệu suất và linh hoạt trong việc thao tác với dữ liệu."
        });

        Content_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "Hàm đệ quy (recursive function) trong ngôn ngữ C là hàm có khả năng gọi lại chính nó trong thân hàm. Mỗi lần gọi đệ quy, hàm sẽ giải quyết một phần nhỏ của vấn đề, sau đó tiếp tục gọi chính nó để giải quyết phần còn lại cho đến khi đạt được điều kiện dừng.",
            "Đặc điểm chính:\n"
            + "\n"
            + "Hàm tự gọi chính nó\n"
            + "\n"
            + "Phải có điều kiện dừng (base case)\n"
            + "\n"
            + "Mỗi lần gọi đệ quy phải tiến gần hơn đến điều kiện dừng",
            "a. Điều kiện dừng (Base case)\n"
            + "Là điều kiện để kết thúc quá trình đệ quy, ngăn chặn việc gọi hàm vô hạn. Nếu không có điều kiện dừng, chương trình sẽ bị tràn bộ nhớ stack (stack overflow).",
            "b. Phần đệ quy (Recursive case)\n"
            + "Là phần mà hàm gọi lại chính nó với tham số thay đổi, thường là tiến gần hơn đến điều kiện dừng.",
            "Ưu điểm:\n"
            + "Giúp code ngắn gọn, dễ đọc, dễ hiểu với các bài toán có tính chất đệ quy\n"
            + "\n"
            + "Phù hợp giải quyết các vấn đề như: duyệt cây, phân chia bài toán (divide and conquer), quay lui (backtracking)",
            "Nhược điểm:\n"
            + "Tốn bộ nhớ do phải lưu trữ các lần gọi hàm trong stack\n"
            + "\n"
            + "Có thể chậm hơn cách giải bằng vòng lặp do overhead của việc gọi hàm\n"
            + "\n"
            + "Dễ gây stack overflow nếu đệ quy quá sâu",
            "a. Đệ quy trực tiếp (Direct recursion)\n"
            + "Hàm gọi trực tiếp chính nó.",
            "b. Đệ quy gián tiếp (Indirect recursion)\n"
            + "Hàm A gọi hàm B, hàm B lại gọi hàm A, tạo thành vòng đệ quy.",
            "c. Đệ quy đuôi (Tail recursion)\n"
            + "Là trường hợp đặc biệt khi lời gọi đệ quy là thao tác cuối cùng của hàm. Có thể được tối ưu bởi trình biên dịch.",
            "a. Tính giai thừa (đệ quy trực tiếp)",
            "b. Dãy Fibonacci (đệ quy nhị phân)",
            "c. Đệ quy đuôi (tính tổng các số từ 1 đến n)",
            "d. Đệ quy gián tiếp (ví dụ kiểm tra số chẵn/lẻ)",
            "Luôn đảm bảo có điều kiện dừng hợp lý\n"
            + "\n"
            + "Đảm bảo mỗi lần gọi đệ quy tiến gần đến điều kiện dừng\n"
            + "\n"
            + "Hạn chế sử dụng đệ quy với bài toán có độ phức tạp lớn\n"
            + "\n"
            + "Cân nhắc sử dụng vòng lặp thay thế nếu có thể\n"
            + "\n"
            + "Chú ý đến giới hạn stack của chương trình"
        });

        Content_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "Đệ quy là một kỹ thuật lập trình trong đó một hàm gọi lại chính nó để giải quyết vấn đề. Một hàm đệ quy cần có:\n"
            + "\n"
            + "Điều kiện dừng (base case): Điểm dừng của đệ quy\n"
            + "\n"
            + "Phần đệ quy (recursive case): Phần gọi lại chính hàm đó với tham số thay đổi",
            "Khi một hàm đệ quy được gọi:\n"
            + "\n"
            + "Hàm kiểm tra điều kiện dừng\n"
            + "\n"
            + "Nếu chưa thỏa điều kiện dừng, hàm gọi lại chính nó với tham số mới\n"
            + "\n"
            + "Quá trình này lặp lại cho đến khi đạt điều kiện dừng\n"
            + "\n"
            + "Các lời gọi hàm được giải quyết theo thứ tự ngược lại (từ cuối về đầu)",
            "Ưu điểm:\n"
            + "\n"
            + "Code ngắn gọn, dễ hiểu cho các bài toán có tính chất đệ quy\n"
            + "\n"
            + "Dễ dàng biểu diễn các giải thuật chia để trị",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ do phải lưu trữ nhiều ngăn xếp (stack frames)\n"
            + "\n"
            + "Có thể gây tràn bộ nhớ stack (stack overflow) nếu đệ quy quá sâu\n"
            + "\n"
            + "Hiệu suất thường kém hơn vòng lặp",
            "a. Tính giai thừa",
            "b. Dãy Fibonacci",
            "c. Đệ quy đuôi (Tail recursion)",
            "Luôn xác định rõ điều kiện dừng\n"
            + "\n"
            + "Đảm bảo các lời gọi đệ quy tiến dần về điều kiện dừng\n"
            + "\n"
            + "Hạn chế sử dụng đệ quy cho các bài toán có độ phức tạp lớn\n"
            + "\n"
            + "Cân nhắc sử dụng vòng lặp thay thế khi có thể\n"
            + "\n"
            + "Đối với đệ quy đuôi, một số trình biên dịch có thể tối ưu thành vòng lặp"
        });

        Content_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "Dưới đây là ví dụ về hàm đệ quy tính giai thừa trong C:",
            "Điều kiện dừng: Khi n = 0 hoặc n = 1, hàm trả về 1 vì 0! và 1! đều bằng 1",
            "Phần đệ quy: Với n > 1, hàm trả về n * factorial(n-1), tức là nó gọi lại chính nó với giá trị nhỏ hơn",
            "Quá trình thực thi:\n"
            + "\n"
            + "factorial(5) = 5 * factorial(4)\n"
            + "\n"
            + "factorial(4) = 4 * factorial(3)\n"
            + "\n"
            + "factorial(3) = 3 * factorial(2)\n"
            + "\n"
            + "factorial(2) = 2 * factorial(1)\n"
            + "\n"
            + "factorial(1) = 1 (điều kiện dừng)",
            "Ưu điểm:\n"
            + "\n"
            + "Code ngắn gọn, dễ hiểu\n"
            + "\n"
            + "Phù hợp với các bài toán có tính chất đệ quy tự nhiên",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ stack do mỗi lần gọi đệ quy cần lưu trữ thông tin\n"
            + "\n"
            + "Có thể gây tràn stack với đầu vào lớn\n"
            + "\n"
            + "Hiệu suất thường kém hơn vòng lặp"
        });

        Content_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "Mảng là tập hợp các phần tử có cùng kiểu dữ liệu, được lưu trữ liên tiếp trong bộ nhớ.",
            "Đặc điểm:\n"
            + "\n"
            + "Kích thước cố định khi khai báo\n"
            + "\n"
            + "Truy cập phần tử qua chỉ số\n"
            + "\n"
            + "Hiệu quả khi cần truy cập ngẫu nhiên",
            "Code mẫu:",
            "Trong C, chuỗi là mảng các ký tự kết thúc bằng ký tự null ('\\0').",
            "Đặc điểm:\n"
            + "\n"
            + "Là mảng một chiều của các ký tự\n"
            + "\n"
            + "Kết thúc bằng ký tự null\n"
            + "\n"
            + "Có thể khởi tạo bằng chuỗi ký tự trong dấu nháy kép",
            "Code mẫu:",
            "Struct cho phép nhóm các biến có kiểu dữ liệu khác nhau dưới một tên duy nhất.",
            "Đặc điểm:\n"
            + "\n"
            + "Có thể chứa nhiều kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Tương tự như class nhưng không có phương thức\n"
            + "\n"
            + "Kích thước bằng tổng kích thước các thành viên (có thể có padding)",
            "Code mẫu:",
            "Union cho phép lưu trữ nhiều kiểu dữ liệu khác nhau trong cùng một vùng nhớ.",
            "Đặc điểm:\n"
            + "\n"
            + "Chỉ lưu trữ một thành viên tại một thời điểm\n"
            + "\n"
            + "Kích thước bằng kích thước của thành viên lớn nhất\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi chỉ cần một trong các kiểu dữ liệu",
            "Code mẫu:",
            "Enum là kiểu dữ liệu cho phép định nghĩa một tập hợp các hằng số có tên.",
            "Đặc điểm:\n"
            + "\n"
            + "Giúp code dễ đọc và bảo trì hơn\n"
            + "\n"
            + "Mỗi phần tử enum có giá trị nguyên bắt đầu từ 0\n"
            + "\n"
            + "Có thể gán giá trị cụ thể cho các phần tử",
            "Code mẫu:",
            "Con trỏ là biến lưu trữ địa chỉ bộ nhớ của biến khác.",
            "Đặc điểm:\n"
            + "\n"
            + "Cho phép truy cập và thao tác trực tiếp với bộ nhớ\n"
            + "\n"
            + "Dùng để cấp phát động, truyền tham chiếu, làm việc với mảng\n"
            + "\n"
            + "Có thể có con trỏ trỏ đến con trỏ",
            "Code mẫu:",
            "Danh sách liên kết là cấu trúc dữ liệu động gồm các node liên kết với nhau.",
            "Đặc điểm:\n"
            + "\n"
            + "Kích thước có thể thay đổi trong khi chạy chương trình\n"
            + "\n"
            + "Mỗi node chứa dữ liệu và con trỏ đến node tiếp theo\n"
            + "\n"
            + "Có thể thêm/xóa node mà không cần dịch chuyển các phần tử khác",
            "Code mẫu:"
        });

        Content_MAP.put("File I/O trong C", new String[]{
            "File I/O trong C được thực hiện thông qua các hàm trong thư viện stdio.h. Có hai loại file chính:\n"
            + "\n"
            + "Text files: Chứa dữ liệu văn bản\n"
            + "\n"
            + "Binary files: Chứa dữ liệu nhị phân",
            "a. Mở file - fopen()",
            "Các chế độ mở file (mode):\n"
            + "\n"
            + "\"r\": Mở để đọc (file phải tồn tại)\n"
            + "\n"
            + "\"w\": Mở để ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a\": Mở để ghi tiếp vào cuối file\n"
            + "\n"
            + "\"r+\": Mở để đọc và ghi\n"
            + "\n"
            + "\"w+\": Mở để đọc và ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a+\": Mở để đọc và ghi tiếp vào cuối file\n"
            + "\n"
            + "Thêm \"b\" cho file nhị phân (ví dụ: \"rb\", \"wb\")",
            "Ví dụ:",
            "b. Đóng file - fclose()",
            "Ví dụ:",
            "a. Ghi file\n"
            + "Các hàm ghi file phổ biến:\n"
            + "\n"
            + "fprintf(): Ghi định dạng\n"
            + "\n"
            + "fputs(): Ghi chuỗi\n"
            + "\n"
            + "fputc(): Ghi ký tự",
            "Ví dụ:",
            "b. Đọc file\n"
            + "Các hàm đọc file phổ biến:\n"
            + "\n"
            + "fscanf(): Đọc định dạng\n"
            + "\n"
            + "fgets(): Đọc chuỗi\n"
            + "\n"
            + "fgetc(): Đọc ký tự",
            "Ví dụ:",
            "a. Ghi file nhị phân\n"
            + "Sử dụng fwrite():",
            "Ví dụ:",
            "b. Đọc file nhị phân\n"
            + "Sử dụng fread():",
            "Ví dụ:",
            "fseek(): Di chuyển con trỏ file\n"
            + "\n"
            + "ftell(): Trả về vị trí hiện tại\n"
            + "\n"
            + "rewind(): Đặt con trỏ về đầu file",
            "Ví dụ:",
            "feof(): Kiểm tra end-of-file\n"
            + "\n"
            + "ferror(): Kiểm tra lỗi",
            "Ví dụ:",
            "Chương trình quản lý sinh viên đơn giản:"
        });

        Content_MAP.put("Các hàm file I/O", new String[]{
            "fopen()\n"
            + "Mục đích: Mở một file",
            "filename: Tên file cần mở\n"
            + "\n"
            + "mode: Chế độ mở file:\n"
            + "\n"
            + "\"r\": Đọc (file phải tồn tại)\n"
            + "\n"
            + "\"w\": Ghi (tạo file mới hoặc ghi đè)\n"
            + "\n"
            + "\"a\": Ghi tiếp vào cuối file\n"
            + "\n"
            + "\"r+\": Đọc và ghi (file phải tồn tại)\n"
            + "\n"
            + "\"w+\": Đọc và ghi (tạo file mới hoặc ghi đè)\n"
            + "\n"
            + "\"a+\": Đọc và ghi tiếp vào cuối file",
            "Ví dụ:",
            "fclose()\n"
            + "Mục đích: Đóng file đã mở",
            "Trả về 0 nếu thành công, EOF nếu thất bại",
            "Ví dụ:",
            "fprintf()\n"
            + "Mục đích: Ghi dữ liệu có định dạng vào file (tương tự printf)",
            "Ví dụ:",
            "fputs()\n"
            + "Mục đích: Ghi một chuỗi vào file",
            "Ví dụ:",
            "fputc()\n"
            + "Mục đích: Ghi một ký tự vào file",
            "Ví dụ:",
            "fwrite()\n"
            + "Mục đích: Ghi dữ liệu nhị phân vào file",
            "ptr: Con trỏ tới dữ liệu cần ghi\n"
            + "\n"
            + "size: Kích thước mỗi phần tử\n"
            + "\n"
            + "nmemb: Số lượng phần tử",
            "fscanf()\n"
            + "Mục đích: Đọc dữ liệu có định dạng từ file (tương tự scanf)",
            "Ví dụ:",
            "fgets()\n"
            + "Mục đích: Đọc một dòng từ file",
            "str: Buffer để lưu dữ liệu đọc được\n"
            + "\n"
            + "n: Số ký tự tối đa đọc",
            "Ví dụ:",
            "fgetc()\n"
            + "Mục đích: Đọc một ký tự từ file",
            "Ví dụ:",
            "fread()\n"
            + "Mục đích: Đọc dữ liệu nhị phân từ file",
            "Ví dụ:",
            "feof()\n"
            + "Mục đích: Kiểm tra đã đến cuối file chưa",
            "Trả về giá trị khác 0 nếu đã đến cuối file",
            "Ví dụ:",
            "ferror()\n"
            + "Mục đích: Kiểm tra lỗi khi thao tác với file",
            "Trả về giá trị khác 0 nếu có lỗi",
            "Ví dụ:",
            "fseek()\n"
            + "Mục đích: Di chuyển con trỏ file đến vị trí mong muốn",
            "offset: Số byte di chuyển\n"
            + "\n"
            + "whence: Vị trí bắt đầu:\n"
            + "\n"
            + "SEEK_SET: Đầu file\n"
            + "\n"
            + "SEEK_CUR: Vị trí hiện tại\n"
            + "\n"
            + "SEEK_END: Cuối file",
            "Ví dụ:",
            "ftell()\n"
            + "Mục đích: Lấy vị trí hiện tại của con trỏ file",
            "Ví dụ:",
            "rewind()\n"
            + "Mục đích: Đặt con trỏ file về đầu file",
            "Ví dụ:",
            "Ví dụ hoàn chỉnh"
        });

        Content_MAP.put("Khái niệm về struct", new String[]{
            "Struct (cấu trúc) trong C là một kiểu dữ liệu do người dùng tự định nghĩa, cho phép nhóm các biến có kiểu dữ liệu khác nhau lại với nhau dưới một tên duy nhất. Mỗi biến trong struct được gọi là một thành viên (member) của struct.",
            "Struct giúp tổ chức dữ liệu phức tạp một cách có cấu trúc, làm cho code dễ đọc và dễ quản lý hơn.",
            "a. Khai báo Struct\n"
            + "Khai báo một struct mới mà không tạo biến ngay lập tức.",
            "b. Định nghĩa biến Struct\n"
            + "Tạo biến từ struct đã khai báo.",
            "c. Khởi tạo Struct\n"
            + "Gán giá trị ban đầu cho các thành viên của struct.",
            "d. Truy cập thành viên Struct\n"
            + "Sử dụng toán tử dấu chấm (.) để truy cập các thành viên.",
            "e. Struct lồng nhau\n"
            + "Một struct có thể chứa struct khác như thành viên.",
            "f. Con trỏ Struct\n"
            + "Sử dụng con trỏ để truy cập struct, dùng toán tử \"->\" để truy cập thành viên.",
            "Struct là một công cụ mạnh mẽ trong C để tổ chức dữ liệu phức tạp, đặc biệt hữu ích khi làm việc với các đối tượng có nhiều thuộc tính khác nhau."
        });

        Content_MAP.put("Khái niệm về union", new String[]{
            "Tất cả các thành viên chia sẻ cùng một vùng nhớ\n"
            + "\n"
            + "Kích thước của union bằng kích thước của thành viên lớn nhất\n"
            + "\n"
            + "Chỉ một thành viên có thể chứa giá trị tại một thời điểm\n"
            + "\n"
            + "Thường được sử dụng khi cần tiết kiệm bộ nhớ hoặc xử lý dữ liệu theo nhiều cách khác nhau",
            "Tương tự như struct, sử dụng toán tử dấu chấm (.) hoặc toán tử mũi tên (->) nếu làm việc với con trỏ",
            "Tiết kiệm bộ nhớ\n"
            + "\n"
            + "Linh hoạt trong việc biểu diễn dữ liệu\n"
            + "\n"
            + "Hữu ích khi làm việc với phần cứng hoặc giao tiếp mạng",
            "Không thể biết thành viên nào đang được sử dụng (cần thêm biến đánh dấu)\n"
            + "\n"
            + "Dễ gây nhầm lẫn nếu sử dụng không cẩn thận",
            "Ví dụ 1: Union cơ bản",
            "Ví dụ 2: Union trong hệ thống nhúng (đọc giá trị cảm biến)",
            "Ví dụ 3: Union kết hợp với struct để theo dõi kiểu dữ liệu"
        });

        Content_MAP.put("Sự khác biệt giữa struct và union", new String[]{
            "Struct (Structure):\n"
            + "\n"
            + "Là kiểu dữ liệu do người dùng định nghĩa, cho phép kết hợp các biến thuộc các kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Mỗi thành viên trong struct có bộ nhớ riêng biệt\n"
            + "\n"
            + "Kích thước struct bằng tổng kích thước tất cả các thành viên (cộng thêm padding nếu có)",
            "Union:\n"
            + "\n"
            + "Cũng là kiểu dữ liệu do người dùng định nghĩa, kết hợp các biến thuộc kiểu khác nhau\n"
            + "\n"
            + "Các thành viên dùng chung cùng một vùng nhớ\n"
            + "\n"
            + "Kích thước union bằng kích thước của thành viên lớn nhất",
            "Struct:",
            "Union:",
            "Struct: Có thể truy cập đồng thời tất cả các thành viên vì chúng có bộ nhớ riêng",
            "Union: Chỉ có thể sử dụng một thành viên tại một thời điểm vì dùng chung bộ nhớ",
            "Struct dùng khi:\n"
            + "\n"
            + "Cần lưu trữ nhiều thuộc tính cùng lúc\n"
            + "\n"
            + "Các thuộc tính độc lập với nhau\n"
            + "\n"
            + "Ví dụ: Điểm trong hệ tọa độ, thông tin sinh viên...",
            "Union dùng khi:\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi chỉ cần một thuộc tính tại một thời điểm\n"
            + "\n"
            + "Xử lý dữ liệu đa dạng nhưng không đồng thời\n"
            + "\n"
            + "Ví dụ: Biến có thể là int hoặc float tùy ngữ cảnh",
            "Đặc điểm	Struct	Union\n"
            + "Bộ nhớ	Cấp phát riêng cho mỗi thành viên	Dùng chung bộ nhớ\n"
            + "Kích thước	Tổng kích thước các thành viên	Bằng thành viên lớn nhất\n"
            + "Truy cập	Có thể truy cập đồng thời	Chỉ một thành viên tại một thời điểm\n"
            + "Ứng dụng	Lưu trữ nhiều thuộc tính	Tiết kiệm bộ nhớ, kiểu đa năng"
        });

        Content_MAP.put("Danh sách liên kết", new String[]{
            "Danh sách liên kết là một cấu trúc dữ liệu động bao gồm các node (nút) được liên kết với nhau thông qua các con trỏ. Mỗi node chứa dữ liệu và con trỏ trỏ đến node tiếp theo trong danh sách.",
            "Danh sách liên kết đơn (Singly Linked List): Mỗi node chỉ có con trỏ trỏ đến node tiếp theo\n"
            + "\n"
            + "Danh sách liên kết đôi (Doubly Linked List): Mỗi node có 2 con trỏ, trỏ đến node trước và node sau\n"
            + "\n"
            + "Danh sách liên kết vòng (Circular Linked List): Node cuối cùng trỏ lại node đầu tiên",
            "Mỗi node trong danh sách liên kết đơn gồm:\n"
            + "\n"
            + "Trường dữ liệu (data)\n"
            + "\n"
            + "Con trỏ next trỏ đến node tiếp theo",
            "Thêm node (đầu, cuối, vị trí bất kỳ)\n"
            + "\n"
            + "Xóa node\n"
            + "\n"
            + "Duyệt danh sách\n"
            + "\n"
            + "Tìm kiếm\n"
            + "\n"
            + "Đếm số node\n"
            + "\n"
            + "Sắp xếp",
            "Ưu điểm:\n"
            + "\n"
            + "Kích thước linh hoạt, có thể mở rộng hoặc thu nhỏ trong khi chương trình đang chạy\n"
            + "\n"
            + "Dễ dàng thêm/xóa node mà không cần dịch chuyển các phần tử như mảng",
            "Nhược điểm:\n"
            + "\n"
            + "Truy cập ngẫu nhiên chậm hơn mảng\n"
            + "\n"
            + "Tốn bộ nhớ hơn do lưu thêm con trỏ\n"
            + "\n"
            + "Khó debug hơn do sử dụng con trỏ",
            "Danh sách liên kết được sử dụng trong nhiều trường hợp:\n"
            + "\n"
            + "Cài đặt stack và queue\n"
            + "\n"
            + "Cài đặt bảng băm (hash table)\n"
            + "\n"
            + "Cài đặt đồ thị (adjacency list)\n"
            + "\n"
            + "Quản lý bộ nhớ trong hệ điều hành\n"
            + "\n"
            + "Lịch sử duyệt web trong trình duyệt"
        });

        Content_MAP.put("Ngăn xếp", new String[]{
            "Ngăn xếp (Stack) là một cấu trúc dữ liệu tuyến tính hoạt động theo nguyên tắc \"Last In First Out\" (LIFO) - phần tử được thêm vào cuối cùng sẽ được lấy ra đầu tiên.",
            "Các đặc điểm chính:\n"
            + "\n"
            + "Chỉ có thể thêm/xóa phần tử ở một đầu gọi là đỉnh (top) của stack\n"
            + "\n"
            + "Các thao tác cơ bản: push (thêm vào), pop (lấy ra), peek (xem phần tử trên cùng)",
            "Có 2 cách triển khai stack phổ biến trong C:\n"
            + "\n"
            + "Sử dụng mảng (Array)\n"
            + "\n"
            + "Sử dụng danh sách liên kết (Linked List)",
            "2.1. Triển khai bằng mảng",
            "2.2. Triển khai bằng danh sách liên kết",
            "Stack có nhiều ứng dụng trong lập trình và khoa học máy tính:\n"
            + "\n"
            + "Đảo ngược chuỗi\n"
            + "\n"
            + "Kiểm tra tính hợp lệ của biểu thức (dấu ngoặc)\n"
            + "\n"
            + "Chuyển đổi giữa các dạng biểu thức (trung tố, hậu tố)\n"
            + "\n"
            + "Thuật toán duyệt đồ thị (DFS)\n"
            + "\n"
            + "Quản lý các lời gọi hàm (call stack)\n"
            + "\n"
            + "Undo/Redo trong các ứng dụng",
            "Ưu điểm:\n"
            + "\n"
            + "Dễ cài đặt\n"
            + "\n"
            + "Hiệu suất tốt (O(1) cho các thao tác cơ bản)\n"
            + "\n"
            + "Phù hợp cho các bài toán cần xử lý theo thứ tự ngược",
            "Nhược điểm:\n"
            + "\n"
            + "Kích thước cố định nếu dùng mảng (có thể khắc phục bằng linked list)\n"
            + "\n"
            + "Chỉ truy cập được phần tử trên cùng"
        });

        Content_MAP.put("Hàng đợi", new String[]{
            "Hàng đợi (Queue) là một cấu trúc dữ liệu tuyến tính hoạt động theo nguyên tắc FIFO (First In First Out - Vào trước ra trước). Phần tử được thêm vào đầu tiên sẽ được lấy ra đầu tiên.",
            "Có 2 đầu: front (đầu) để lấy dữ liệu, rear (cuối) để thêm dữ liệu\n"
            + "\n"
            + "Thao tác thêm vào gọi là enqueue (hay push)\n"
            + "\n"
            + "Thao tác lấy ra gọi là dequeue (hay pop)\n"
            + "\n"
            + "Có thể cài đặt bằng mảng hoặc danh sách liên kết",
            "Khởi tạo hàng đợi\n"
            + "\n"
            + "Kiểm tra hàng đợi rỗng\n"
            + "\n"
            + "Kiểm tra hàng đợi đầy (với cài đặt bằng mảng)\n"
            + "\n"
            + "Thêm phần tử vào hàng đợi (enqueue)\n"
            + "\n"
            + "Lấy phần tử khỏi hàng đợi (dequeue)\n"
            + "\n"
            + "Xem phần tử đầu hàng đợi (peek)",
            "Cấu trúc Queue: Chứa mảng items để lưu dữ liệu, front và rear để theo dõi vị trí đầu và cuối.\n"
            + "\n"
            + "initQueue(): Khởi tạo front và rear = -1 (hàng đợi rỗng).\n"
            + "\n"
            + "isEmpty(): Kiểm tra nếu front và rear đều -1 thì hàng đợi rỗng.\n"
            + "\n"
            + "isFull(): Kiểm tra nếu rear ở vị trí cuối mảng thì hàng đợi đầy.\n"
            + "\n"
            + "enqueue(): Thêm phần tử vào cuối hàng đợi (rear), xử lý trường hợp hàng đợi rỗng.\n"
            + "\n"
            + "dequeue(): Lấy phần tử ở đầu hàng đợi (front), xử lý trường hợp chỉ còn 1 phần tử.\n"
            + "\n"
            + "peek(): Xem giá trị phần tử đầu hàng đợi mà không xóa nó.",
            "Ưu điểm:\n"
            + "\n"
            + "Dễ cài đặt bằng mảng hoặc danh sách liên kết\n"
            + "\n"
            + "Hiệu quả cho các bài toán cần xử lý theo thứ tự FIFO",
            "Nhược điểm:\n"
            + "\n"
            + "Khi cài bằng mảng có kích thước cố định, có thể bị đầy\n"
            + "\n"
            + "Cần quản lý front và rear cẩn thận để tránh sai sót"
        });

        Content_MAP.put("Mở và đóng tệp tin", new String[]{
            "Trước khi làm việc với tệp tin, chúng ta cần hiểu một số khái niệm:\n"
            + "\n"
            + "File pointer: Con trỏ FILE được sử dụng để tham chiếu đến tệp tin\n"
            + "\n"
            + "Stream: Luồng dữ liệu giữa chương trình và tệp tin\n"
            + "\n"
            + "Modes: Các chế độ mở tệp khác nhau (đọc, ghi, thêm, ...)",
            "Hàm fopen() được sử dụng để mở một tệp tin.",
            "Cú pháp:",
            "Tham số:\n"
            + "filename: Tên tệp tin cần mở (bao gồm đường dẫn nếu cần)\n"
            + "\n"
            + "mode: Chế độ mở tệp tin",
            "Các chế độ mở tệp phổ biến:\n"
            + "Mode	Ý nghĩa\n"
            + "\"r\"	Mở để đọc (file phải tồn tại)\n"
            + "\"w\"	Mở để ghi (tạo mới hoặc ghi đè)\n"
            + "\"a\"	Mở để ghi thêm vào cuối (tạo mới nếu chưa tồn tại)\n"
            + "\"r+\"	Mở để đọc và ghi (file phải tồn tại)\n"
            + "\"w+\"	Mở để đọc và ghi (tạo mới hoặc ghi đè)\n"
            + "\"a+\"	Mở để đọc và ghi thêm vào cuối",
            "Sau khi làm việc xong với tệp tin, cần đóng nó bằng hàm fclose().",
            "Cú pháp:",
            "Giá trị trả về:\n"
            + "0 nếu thành công\n"
            + "\n"
            + "EOF nếu có lỗi",
            "Luôn kiểm tra xem việc mở tệp có thành công không bằng cách kiểm tra giá trị trả về của fopen.",
            "Dưới đây là một ví dụ đầy đủ về mở, ghi, đọc và đóng tệp tin:",
            "Chương trình mở file \"example.txt\" ở chế độ ghi (\"w\")\n"
            + "\n"
            + "Nếu mở thành công, yêu cầu người dùng nhập dữ liệu\n"
            + "\n"
            + "Ghi dữ liệu vào file bằng fprintf\n"
            + "\n"
            + "Đóng file sau khi ghi xong\n"
            + "\n"
            + "Mở lại file ở chế độ đọc (\"r\")\n"
            + "\n"
            + "Đọc và hiển thị nội dung file từng dòng\n"
            + "\n"
            + "Đóng file sau khi đọc xong",
            "Luôn kiểm tra giá trị trả về của fopen\n"
            + "\n"
            + "Luôn đóng file sau khi sử dụng xong\n"
            + "\n"
            + "Sử dụng chế độ mở file phù hợp với nhu cầu (đọc/ghi/thêm)\n"
            + "\n"
            + "Xử lý các trường hợp file không tồn tại hoặc không có quyền truy cập"
        });

        Content_MAP.put("Đọc và ghi tệp tin", new String[]{
            "Trong C, tệp tin được xử lý thông qua con trỏ FILE. Có hai loại tệp tin chính:\n"
            + "\n"
            + "Tệp tin văn bản (text file): Chứa dữ liệu dạng text, có thể đọc bằng trình soạn thảo\n"
            + "\n"
            + "Tệp tin nhị phân (binary file): Chứa dữ liệu dạng nhị phân",
            "Mở tệp tin",
            "Các chế độ mở tệp (mode):\n"
            + "\n"
            + "\"r\": Mở để đọc (file phải tồn tại)\n"
            + "\n"
            + "\"w\": Mở để ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a\": Mở để ghi tiếp vào cuối file\n"
            + "\n"
            + "\"r+\": Mở để đọc và ghi\n"
            + "\n"
            + "\"w+\": Mở để đọc và ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a+\": Mở để đọc và ghi tiếp vào cuối file\n"
            + "\n"
            + "Thêm \"b\" cho file nhị phân (vd: \"rb\", \"wb\")",
            "Đóng tệp tin",
            "Code mẫu:",
            "Ghi từng ký tự",
            "Ghi chuỗi ký tự",
            "Ghi dữ liệu có định dạng",
            "Code mẫu:",
            "Đọc từng ký tự",
            "Đọc chuỗi ký tự",
            "Đọc dữ liệu có định dạng",
            "Kiểm tra kết thúc file",
            "Code mẫu:",
            "Ghi dữ liệu nhị phân",
            "Đọc dữ liệu nhị phân",
            "Code mẫu:",
            "Di chuyển con trỏ file",
            "Lấy vị trí hiện tại",
            "Đưa con trỏ về đầu file",
            "Code mẫu:",
            "Kiểm tra lỗi",
            "Xóa cờ lỗi",
            "Code mẫu:",
            "Đổi tên file",
            "Xóa file",
            "Code mẫu:"
        });

        Content_MAP.put("Các hàm xử lý tệp tin", new String[]{
            "feof()\n"
            + "Kiểm tra đã đến cuối file chưa.",
            "Cú pháp:",
            "ferror()\n"
            + "Kiểm tra lỗi khi làm việc với file.",
            "Cú pháp:",
            "perror()\n"
            + "Hiển thị thông báo lỗi.",
            "Cú pháp:",
            "Code mẫu:",
            "fseek()\n"
            + "Di chuyển con trỏ file đến vị trí chỉ định",
            "Cú pháp:",
            "Các giá trị whence:\n"
            + "\n"
            + "SEEK_SET: Đầu file\n"
            + "\n"
            + "SEEK_CUR: Vị trí hiện tại\n"
            + "\n"
            + "SEEK_END: Cuối file",
            "ftell()\n"
            + "Trả về vị trí hiện tại của con trỏ file.",
            "Cú pháp:",
            "rewind()\n"
            + "Đặt con trỏ file về đầu file.",
            "Cú pháp:",
            "Code mẫu:",
            "fwrite()\n"
            + "Ghi dữ liệu nhị phân vào file.",
            "Cú pháp:",
            "fread()\n"
            + "Đọc dữ liệu nhị phân từ file.",
            "Cú pháp:",
            "Code mẫu:",
            "remove()\n"
            + "Xóa một tệp tin.",
            "Cú pháp:",
            "rename()\n"
            + "Đổi tên tệp tin.",
            "Cú pháp:",
            "Code mẫu:"
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
        //C
        Code_MAP.put("C là gì?", new String[]{
            "#include <stdio.h> // Phần tiền xử lý (Preprocessor)\n"
            + "\n"
            + "// Khai báo hàm (Function declaration)\n"
            + "int add(int a, int b);\n"
            + "\n"
            + "// Hàm main - điểm bắt đầu chương trình\n"
            + "int main() {\n"
            + "    // Khai báo biến\n"
            + "    int x = 5, y = 10;\n"
            + "    int result;\n"
            + "    \n"
            + "    // Gọi hàm\n"
            + "    result = add(x, y);\n"
            + "    \n"
            + "    // In kết quả\n"
            + "    printf(\"Tổng là: %d\\n\", result);\n"
            + "    \n"
            + "    return 0; // Kết thúc chương trình\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "int age = 25;\n"
            + "float salary = 2500.50;\n"
            + "char grade = 'A';\n"
            + "double pi = 3.1415926535;",
            "#define PI 3.14159\n"
            + "const int MAX = 100;\n"
            + "\n"
            + "int main() {\n"
            + "    int count = 0;          // Biến\n"
            + "    float radius = 5.5;\n"
            + "    float area = PI * radius * radius;\n"
            + "    \n"
            + "    printf(\"Diện tích: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "int a = 10, b = 20;\n"
            + "int sum = a + b;\n"
            + "int mod = a % 3;\n"
            + "\n"
            + "if (a > 5 && b < 30) {\n"
            + "    a += 5;\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // code\n"
            + "} else if (điều_kiện) {\n"
            + "    // code\n"
            + "} else {\n"
            + "    // code\n"
            + "}",
            "for (khởi_tạo; điều_kiện; tăng/giảm) {\n"
            + "    // code\n"
            + "}",
            "while (điều_kiện) {\n"
            + "    // code\n"
            + "}",
            "do {\n"
            + "    // code\n"
            + "} while (điều_kiện);",
            "switch (biểu_thức) {\n"
            + "    case giá_trị_1:\n"
            + "        // code\n"
            + "        break;\n"
            + "    case giá_trị_2:\n"
            + "        // code\n"
            + "        break;\n"
            + "    default:\n"
            + "        // code\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // if-else\n"
            + "    int age = 18;\n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã trưởng thành\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Bạn chưa trưởng thành\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // for loop\n"
            + "    for (int i = 1; i <= 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    // switch\n"
            + "    char grade = 'B';\n"
            + "    switch (grade) {\n"
            + "        case 'A':\n"
            + "            printf(\"Xuất sắc!\\n\");\n"
            + "            break;\n"
            + "        case 'B':\n"
            + "            printf(\"Tốt\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Cần cố gắng\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "kiểu_trả_về tên_hàm(tham_số) {\n"
            + "    // thân hàm\n"
            + "    return giá_trị; // nếu kiểu trả về khác void\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm\n"
            + "int max(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 10, y = 20;\n"
            + "    int m = max(x, y);\n"
            + "    printf(\"Số lớn nhất là: %d\\n\", m);\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int max(int a, int b) {\n"
            + "    if (a > b) {\n"
            + "        return a;\n"
            + "    } else {\n"
            + "        return b;\n"
            + "    }\n"
            + "}",
            "// Khai báo mảng\n"
            + "int numbers[5] = {1, 2, 3, 4, 5};\n"
            + "\n"
            + "// Truy cập phần tử\n"
            + "int first = numbers[0];\n"
            + "numbers[2] = 10;",
            "char name[20] = \"Nguyen Van A\";\n"
            + "printf(\"Xin chào %s\\n\", name);\n"
            + "\n"
            + "// Nhập chuỗi từ bàn phím\n"
            + "char input[50];\n"
            + "printf(\"Nhập tên của bạn: \");\n"
            + "scanf(\"%s\", input);\n"
            + "printf(\"Tên bạn đã nhập: %s\\n\", input);",
            "int var = 10;\n"
            + "int *ptr = &var; // ptr trỏ đến var\n"
            + "\n"
            + "printf(\"Giá trị của var: %d\\n\", var);\n"
            + "printf(\"Địa chỉ của var: %p\\n\", &var);\n"
            + "printf(\"Giá trị qua con trỏ: %d\\n\", *ptr);",
            "struct SinhVien {\n"
            + "    char hoTen[50];\n"
            + "    int tuoi;\n"
            + "    float diemTB;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    struct SinhVien sv1;\n"
            + "    strcpy(sv1.hoTen, \"Nguyen Van A\");\n"
            + "    sv1.tuoi = 20;\n"
            + "    sv1.diemTB = 8.5;\n"
            + "    \n"
            + "    printf(\"Thông tin sinh viên:\\n\");\n"
            + "    printf(\"Họ tên: %s\\n\", sv1.hoTen);\n"
            + "    printf(\"Tuổi: %d\\n\", sv1.tuoi);\n"
            + "    printf(\"Điểm TB: %.2f\\n\", sv1.diemTB);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    char data[100];\n"
            + "    \n"
            + "    // Ghi file\n"
            + "    file = fopen(\"test.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    fprintf(file, \"Xin chào thế giới!\\n\");\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc file\n"
            + "    file = fopen(\"test.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    while (fgets(data, sizeof(data), file) != NULL) {\n"
            + "        printf(\"%s\", data);\n"
            + "    }\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int id;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "void printStudent(struct Student s) {\n"
            + "    printf(\"ID: %d, Tên: %s, GPA: %.2f\\n\", s.id, s.name, s.gpa);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Student students[3];\n"
            + "    int i;\n"
            + "    \n"
            + "    // Nhập thông tin sinh viên\n"
            + "    for (i = 0; i < 3; i++) {\n"
            + "        printf(\"Nhập thông tin sinh viên %d:\\n\", i+1);\n"
            + "        printf(\"Tên: \");\n"
            + "        scanf(\"%s\", students[i].name);\n"
            + "        printf(\"ID: \");\n"
            + "        scanf(\"%d\", &students[i].id);\n"
            + "        printf(\"GPA: \");\n"
            + "        scanf(\"%f\", &students[i].gpa);\n"
            + "    }\n"
            + "    \n"
            + "    // Hiển thị thông tin\n"
            + "    printf(\"\\nDanh sách sinh viên:\\n\");\n"
            + "    for (i = 0; i < 3; i++) {\n"
            + "        printStudent(students[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Tìm sinh viên có GPA cao nhất\n"
            + "    int maxIndex = 0;\n"
            + "    for (i = 1; i < 3; i++) {\n"
            + "        if (students[i].gpa > students[maxIndex].gpa) {\n"
            + "            maxIndex = i;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"\\nSinh viên có GPA cao nhất:\\n\");\n"
            + "    printStudent(students[maxIndex]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Tại sao nên học C?", new String[]{
            "// C\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "# Python\n"
            + "print(\"Hello, World!\")",
            "// Java\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *ptr = (int*) malloc(5 * sizeof(int)); // Cấp phát bộ nhớ động\n"
            + "    \n"
            + "    if (ptr == NULL) {\n"
            + "        printf(\"Memory allocation failed!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        ptr[i] = i * 2;\n"
            + "    }\n"
            + "    \n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        printf(\"%d \", ptr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    free(ptr); // Giải phóng bộ nhớ\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Process ID: %d\\n\", getpid());\n"
            + "    printf(\"Parent Process ID: %d\\n\", getppid());\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Node {\n"
            + "    int data;\n"
            + "    struct Node* next;\n"
            + "};\n"
            + "\n"
            + "void printList(struct Node* n) {\n"
            + "    while (n != NULL) {\n"
            + "        printf(\"%d \", n->data);\n"
            + "        n = n->next;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Node* head = NULL;\n"
            + "    struct Node* second = NULL;\n"
            + "    struct Node* third = NULL;\n"
            + "    \n"
            + "    head = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    second = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    third = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    \n"
            + "    head->data = 1;\n"
            + "    head->next = second;\n"
            + "    \n"
            + "    second->data = 2;\n"
            + "    second->next = third;\n"
            + "    \n"
            + "    third->data = 3;\n"
            + "    third->next = NULL;\n"
            + "    \n"
            + "    printList(head);\n"
            + "    \n"
            + "    free(head);\n"
            + "    free(second);\n"
            + "    free(third);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <errno.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    \n"
            + "    file = fopen(\"nonexistent.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Error opening file: %s\\n\", strerror(errno));\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Xử lý file\n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "int subtract(int a, int b) {\n"
            + "    return a - b;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int (*operation)(int, int);\n"
            + "    \n"
            + "    operation = add;\n"
            + "    printf(\"5 + 3 = %d\\n\", operation(5, 3));\n"
            + "    \n"
            + "    operation = subtract;\n"
            + "    printf(\"5 - 3 = %d\\n\", operation(5, 3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Truy cập bộ nhớ cấp thấp bằng con trỏ\n"
            + "    int x = 10;\n"
            + "    int *ptr = &x;\n"
            + "    printf(\"Giá trị của x: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Tính năng cấp cao như hàm\n"
            + "    printf(\"Tổng của 5 và 3 là: %d\\n\", sum(5, 3));\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "int sum(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int num) {\n"
            + "    if (num <= 1) return 0;\n"
            + "    for (int i = 2; i*i <= num; i++) {\n"
            + "        if (num % i == 0) return 0;\n"
            + "    }\n"
            + "    return 1;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 7;\n"
            + "    \n"
            + "    // Cấu trúc điều kiện\n"
            + "    if (isPrime(n)) {\n"
            + "        printf(\"%d là số nguyên tố\\n\", n);\n"
            + "    } else {\n"
            + "        printf(\"%d không là số nguyên tố\\n\", n);\n"
            + "    }\n"
            + "    \n"
            + "    // Cấu trúc vòng lặp\n"
            + "    printf(\"Các số nguyên tố từ 1 đến 20: \");\n"
            + "    for (int i = 1; i <= 20; i++) {\n"
            + "        if (isPrime(i)) {\n"
            + "            printf(\"%d \", i);\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Code này có thể chạy trên Windows, Linux, Mac...\n"
            + "    printf(\"Chương trình này chạy được trên nhiều nền tảng!\\n\");\n"
            + "    \n"
            + "    // Kiểm tra kích thước kiểu dữ liệu (có thể khác nhau giữa các nền tảng)\n"
            + "    printf(\"Kích thước của int: %lu bytes\\n\", sizeof(int));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr = &var;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ của var: %p\\n\", &var);\n"
            + "    printf(\"Giá trị qua con trỏ ptr: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Không đủ bộ nhớ!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng bộ nhộ đã cấp phát\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Mảng động: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <time.h>\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "unsigned long long factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    clock_t start, end;\n"
            + "    double cpu_time_used;\n"
            + "    \n"
            + "    start = clock();\n"
            + "    \n"
            + "    // Thực hiện tính toán tốn nhiều CPU\n"
            + "    unsigned long long result = factorial(20);\n"
            + "    printf(\"20! = %llu\\n\", result);\n"
            + "    \n"
            + "    end = clock();\n"
            + "    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;\n"
            + "    \n"
            + "    printf(\"Thời gian thực thi: %f giây\\n\", cpu_time_used);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "#include <math.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Thư viện stdio.h\n"
            + "    printf(\"Hello World!\\n\");\n"
            + "    \n"
            + "    // Thư viện string.h\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[20] = \"World\";\n"
            + "    strcat(str1, str2);\n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", str1);\n"
            + "    \n"
            + "    // Thư viện math.h\n"
            + "    printf(\"Căn bậc hai của 16 là: %f\\n\", sqrt(16));\n"
            + "    \n"
            + "    // Thư viện stdlib.h\n"
            + "    int random_num = rand() % 100;\n"
            + "    printf(\"Số ngẫu nhiên: %d\\n\", random_num);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Chương trình đơn giản minh họa tính đơn giản của C\n"
            + "int main() {\n"
            + "    int a = 5, b = 10;\n"
            + "    int sum = a + b;\n"
            + "    \n"
            + "    printf(\"Tổng của %d và %d là %d\\n\", a, b, sum);\n"
            + "    \n"
            + "    // Toán tử điều kiện đơn giản\n"
            + "    int max = (a > b) ? a : b;\n"
            + "    printf(\"Số lớn hơn là: %d\\n\", max);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <fcntl.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Mở file ở mức hệ thống\n"
            + "    int fd = open(\"test.txt\", O_WRONLY | O_CREAT, 0644);\n"
            + "    \n"
            + "    if (fd == -1) {\n"
            + "        perror(\"Lỗi khi mở file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Ghi dữ liệu vào file\n"
            + "    char *text = \"Ví dụ lập trình hệ thống với C\\n\";\n"
            + "    write(fd, text, strlen(text));\n"
            + "    \n"
            + "    // Đóng file\n"
            + "    close(fd);\n"
            + "    \n"
            + "    printf(\"Đã ghi dữ liệu vào file thành công!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm original\n"
            + "void greet() {\n"
            + "    printf(\"Xin chào!\\n\");\n"
            + "}\n"
            + "\n"
            + "// Mở rộng chức năng bằng hàm mới\n"
            + "void greetByName(char name[]) {\n"
            + "    printf(\"Xin chào, %s!\\n\", name);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    greet(); // Gọi hàm gốc\n"
            + "    greetByName(\"Nguyễn Văn A\"); // Gọi hàm mở rộng\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Nguồn gốc của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    // If-else\n"
            + "    if (number > 0) {\n"
            + "        printf(\"Number is positive\\n\");\n"
            + "    } else if (number < 0) {\n"
            + "        printf(\"Number is negative\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Number is zero\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // For loop\n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm\n"
            + "int add(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 3;\n"
            + "    int sum = add(x, y);\n"
            + "    \n"
            + "    printf(\"Sum of %d and %d is %d\\n\", x, y, sum);\n"
            + "    \n"
            + "    // Con trỏ\n"
            + "    int *ptr = &x;\n"
            + "    printf(\"Value of x: %d, Address of x: %p\\n\", x, (void*)ptr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Định nghĩa struct\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo và khởi tạo struct\n"
            + "    struct Student student1;\n"
            + "    strcpy(student1.name, \"Nguyen Van A\");\n"
            + "    student1.age = 20;\n"
            + "    student1.gpa = 3.5;\n"
            + "    \n"
            + "    // In thông tin\n"
            + "    printf(\"Student Information:\\n\");\n"
            + "    printf(\"Name: %s\\n\", student1.name);\n"
            + "    printf(\"Age: %d\\n\", student1.age);\n"
            + "    printf(\"GPA: %.2f\\n\", student1.gpa);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Memory allocation failed\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Gán giá trị\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // In giá trị\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các phiên bản của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "/* Khai báo hàm kiểu K&R */\n"
            + "power(base, n)\n"
            + "int base, n;\n"
            + "{\n"
            + "    int p;\n"
            + "    \n"
            + "    for (p = 1; n > 0; --n)\n"
            + "        p = p * base;\n"
            + "    return p;\n"
            + "}\n"
            + "\n"
            + "main()\n"
            + "{\n"
            + "    int i;\n"
            + "    \n"
            + "    for (i = 0; i < 10; ++i)\n"
            + "        printf(\"%d %d %d\\n\", i, power(2,i), power(-3,i));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "/* Prototype hàm */\n"
            + "int power(int base, int n);\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    int i;\n"
            + "    \n"
            + "    for (i = 0; i < 10; ++i) {\n"
            + "        printf(\"%d %d %d\\n\", i, power(2,i), power(-3,i));\n"
            + "    }\n"
            + "    \n"
            + "    // Comment kiểu mới\n"
            + "    return EXIT_SUCCESS;\n"
            + "}\n"
            + "\n"
            + "int power(int base, int n)\n"
            + "{\n"
            + "    int p = 1;\n"
            + "    \n"
            + "    for (; n > 0; --n) {\n"
            + "        p = p * base;\n"
            + "    }\n"
            + "    return p;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "// Hàm với số lượng đối số thay đổi\n"
            + "#define print(...) printf(__VA_ARGS__)\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Khai báo biến trong for\n"
            + "    for (int i = 0; i < 10; i++) {\n"
            + "        print(\"i = %d\\n\", i);\n"
            + "    }\n"
            + "    \n"
            + "    // Mảng kích thước thay đổi\n"
            + "    int n = 5;\n"
            + "    float arr[n];\n"
            + "    \n"
            + "    // Kiểu bool\n"
            + "    bool flag = true;\n"
            + "    \n"
            + "    // Số phức\n"
            + "    double complex z = 1.0 + 2.0 * I;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <threads.h>\n"
            + "#include <stdalign.h>\n"
            + "\n"
            + "_Thread_local int tls_var = 10;\n"
            + "\n"
            + "void print_type(int x) {\n"
            + "    _Generic(x,\n"
            + "        int: printf(\"int\\n\"),\n"
            + "        float: printf(\"float\\n\"),\n"
            + "        default: printf(\"other\\n\")\n"
            + "    );\n"
            + "}\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Kiểm tra align\n"
            + "    alignas(16) int aligned_arr[4];\n"
            + "    \n"
            + "    // Generic selection\n"
            + "    print_type(0);\n"
            + "    print_type(0.0f);\n"
            + "    \n"
            + "    // Static assert\n"
            + "    static_assert(sizeof(int) >= 2, \"int must be at least 16 bits\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stddef.h>\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Tính năng từ C11 vẫn hoạt động\n"
            + "    auto x = 3.14;\n"
            + "    \n"
            + "    // __STDC_VERSION__ cho biết phiên bản\n"
            + "    printf(\"C standard version: %ld\\n\", __STDC_VERSION__);\n"
            + "    \n"
            + "    // C17 không thêm cú pháp mới đáng kể\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "[[deprecated(\"Use new_function instead\")]]\n"
            + "void old_function() {\n"
            + "    printf(\"This is old function\\n\");\n"
            + "}\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Thuộc tính mới\n"
            + "    [[maybe_unused]] int x = 42;\n"
            + "    \n"
            + "    // Unicode hỗ trợ tốt hơn\n"
            + "    char8_t utf8_str[] = u8\"UTF-8 string\";\n"
            + "    \n"
            + "    // old_function(); // Cảnh báo deprecated\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "public class HelloWorld {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "print(\"Hello, World!\")",
            "console.log(\"Hello, World!\");",
            "#include <iostream>\n"
            + "\n"
            + "int main() {\n"
            + "    std::cout << \"Hello, World!\" << std::endl;\n"
            + "    return 0;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr = (int*)malloc(5 * sizeof(int)); // Cấp phát\n"
            + "    if (arr == NULL) {\n"
            + "        // Xử lý lỗi\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng mảng\n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        arr[i] = i * 2;\n"
            + "    }\n"
            + "    \n"
            + "    free(arr); // Giải phóng bộ nhớ\n"
            + "    return 0;\n"
            + "}",
            "public class MemoryExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        int[] arr = new int[5]; // Tự động quản lý bộ nhớ\n"
            + "        \n"
            + "        for (int i = 0; i < arr.length; i++) {\n"
            + "            arr[i] = i * 2;\n"
            + "        }\n"
            + "        \n"
            + "        // Không cần giải phóng bộ nhớ\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Mô phỏng lớp\n"
            + "typedef struct {\n"
            + "    int x;\n"
            + "    void (*print)(int);\n"
            + "} Number;\n"
            + "\n"
            + "void printNumber(int num) {\n"
            + "    printf(\"Number: %d\\n\", num);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    Number n;\n"
            + "    n.x = 10;\n"
            + "    n.print = printNumber;\n"
            + "    \n"
            + "    n.print(n.x); // Gọi phương thức\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <iostream>\n"
            + "\n"
            + "class Number {\n"
            + "private:\n"
            + "    int x;\n"
            + "public:\n"
            + "    Number(int val) : x(val) {}\n"
            + "    void print() {\n"
            + "        std::cout << \"Number: \" << x << std::endl;\n"
            + "    }\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    Number n(10);\n"
            + "    n.print();\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Factorial of %d is %d\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "public class Factorial {\n"
            + "    static int factorial(int n) {\n"
            + "        if (n == 0) return 1;\n"
            + "        return n * factorial(n - 1);\n"
            + "    }\n"
            + "    \n"
            + "    public static void main(String[] args) {\n"
            + "        int num = 5;\n"
            + "        System.out.println(\"Factorial of \" + num + \" is \" + factorial(num));\n"
            + "    }\n"
            + "}",
            "def factorial(n):\n"
            + "    return 1 if n == 0 else n * factorial(n - 1)\n"
            + "\n"
            + "num = 5\n"
            + "print(f\"Factorial of {num} is {factorial(num)}\")",
            "function factorial(n) {\n"
            + "    return n === 0 ? 1 : n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "const num = 5;\n"
            + "console.log(`Factorial of ${num} is ${factorial(num)}`);"
        });

        Code_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "#include <sys/types.h>\n"
            + "\n"
            + "int main() {\n"
            + "    pid_t pid = fork();\n"
            + "    \n"
            + "    if (pid == 0) {\n"
            + "        // Code executed by child process\n"
            + "        printf(\"Child Process - PID: %d\\n\", getpid());\n"
            + "    } else if (pid > 0) {\n"
            + "        // Code executed by parent process\n"
            + "        printf(\"Parent Process - PID: %d, Child PID: %d\\n\", getpid(), pid);\n"
            + "    } else {\n"
            + "        // Fork failed\n"
            + "        perror(\"fork failed\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <linux/module.h>\n"
            + "#include <linux/fs.h>\n"
            + "#include <linux/uaccess.h>\n"
            + "\n"
            + "#define DEVICE_NAME \"simple_gpio\"\n"
            + "\n"
            + "static int Major;\n"
            + "static int gpio_state = 0;\n"
            + "\n"
            + "static int device_open(struct inode *inode, struct file *file) {\n"
            + "    printk(KERN_INFO \"GPIO device opened\\n\");\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "static ssize_t device_read(struct file *filp, char *buffer, size_t length, loff_t *offset) {\n"
            + "    copy_to_user(buffer, &gpio_state, sizeof(gpio_state));\n"
            + "    return sizeof(gpio_state);\n"
            + "}\n"
            + "\n"
            + "static ssize_t device_write(struct file *filp, const char *buf, size_t len, loff_t *off) {\n"
            + "    copy_from_user(&gpio_state, buf, sizeof(gpio_state));\n"
            + "    printk(KERN_INFO \"GPIO state changed to %d\\n\", gpio_state);\n"
            + "    return len;\n"
            + "}\n"
            + "\n"
            + "static struct file_operations fops = {\n"
            + "    .read = device_read,\n"
            + "    .write = device_write,\n"
            + "    .open = device_open,\n"
            + "};\n"
            + "\n"
            + "int init_module(void) {\n"
            + "    Major = register_chrdev(0, DEVICE_NAME, &fops);\n"
            + "    if (Major < 0) {\n"
            + "        printk(KERN_ALERT \"Registering char device failed with %d\\n\", Major);\n"
            + "        return Major;\n"
            + "    }\n"
            + "    printk(KERN_INFO \"GPIO driver registered with major number %d\\n\", Major);\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "void cleanup_module(void) {\n"
            + "    unregister_chrdev(Major, DEVICE_NAME);\n"
            + "    printk(KERN_INFO \"GPIO driver unregistered\\n\");\n"
            + "}\n"
            + "\n"
            + "MODULE_LICENSE(\"GPL\");",
            "#include <avr/io.h>\n"
            + "#include <util/delay.h>\n"
            + "\n"
            + "#define LED_PIN PB0\n"
            + "#define DELAY_MS 500\n"
            + "\n"
            + "int main(void) {\n"
            + "    // Set LED pin as output\n"
            + "    DDRB |= (1 << LED_PIN);\n"
            + "    \n"
            + "    while(1) {\n"
            + "        // Toggle LED\n"
            + "        PORTB ^= (1 << LED_PIN);\n"
            + "        _delay_ms(DELAY_MS);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <string.h>\n"
            + "#include <unistd.h>\n"
            + "#include <sys/socket.h>\n"
            + "#include <netinet/in.h>\n"
            + "\n"
            + "#define PORT 8080\n"
            + "#define BUFFER_SIZE 1024\n"
            + "\n"
            + "int main() {\n"
            + "    int server_fd, new_socket;\n"
            + "    struct sockaddr_in address;\n"
            + "    int opt = 1;\n"
            + "    int addrlen = sizeof(address);\n"
            + "    char buffer[BUFFER_SIZE] = {0};\n"
            + "    \n"
            + "    // Creating socket file descriptor\n"
            + "    if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0) {\n"
            + "        perror(\"socket failed\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    // Forcefully attaching socket to the port 8080\n"
            + "    if (setsockopt(server_fd, SOL_SOCKET, SO_REUSEADDR | SO_REUSEPORT, &opt, sizeof(opt))) {\n"
            + "        perror(\"setsockopt\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    address.sin_family = AF_INET;\n"
            + "    address.sin_addr.s_addr = INADDR_ANY;\n"
            + "    address.sin_port = htons(PORT);\n"
            + "    \n"
            + "    // Bind the socket to the port\n"
            + "    if (bind(server_fd, (struct sockaddr *)&address, sizeof(address)) < 0) {\n"
            + "        perror(\"bind failed\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    if (listen(server_fd, 3) < 0) {\n"
            + "        perror(\"listen\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    if ((new_socket = accept(server_fd, (struct sockaddr *)&address, (socklen_t*)&addrlen)) < 0) {\n"
            + "        perror(\"accept\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    // Read and echo back the message\n"
            + "    read(new_socket, buffer, BUFFER_SIZE);\n"
            + "    printf(\"Message from client: %s\\n\", buffer);\n"
            + "    send(new_socket, buffer, strlen(buffer), 0);\n"
            + "    printf(\"Echo message sent\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <dirent.h>\n"
            + "\n"
            + "int main(int argc, char **argv) {\n"
            + "    DIR *dir;\n"
            + "    struct dirent *entry;\n"
            + "    char *path = argc > 1 ? argv[1] : \".\";\n"
            + "    \n"
            + "    if ((dir = opendir(path)) == NULL) {\n"
            + "        perror(\"opendir\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    while ((entry = readdir(dir)) != NULL) {\n"
            + "        printf(\"%s\\n\", entry->d_name);\n"
            + "    }\n"
            + "    \n"
            + "    closedir(dir);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    if (geteuid() != 0) {\n"
            + "        fprintf(stderr, \"This program requires root privileges\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Running with root privileges\\n\");\n"
            + "    // Thực hiện các thao tác yêu cầu quyền root ở đây\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <sys/stat.h>\n"
            + "#include <time.h>\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    if (argc != 2) {\n"
            + "        fprintf(stderr, \"Usage: %s <filename>\\n\", argv[0]);\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    struct stat file_info;\n"
            + "    \n"
            + "    if (stat(argv[1], &file_info) == -1) {\n"
            + "        perror(\"stat\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"File: %s\\n\", argv[1]);\n"
            + "    printf(\"Size: %ld bytes\\n\", file_info.st_size);\n"
            + "    printf(\"Inode: %ld\\n\", file_info.st_ino);\n"
            + "    printf(\"Last access: %s\", ctime(&file_info.st_atime));\n"
            + "    printf(\"Last modification: %s\", ctime(&file_info.st_mtime));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "void check_virtualization() {\n"
            + "    unsigned int hypervisor_bit;\n"
            + "    \n"
            + "    asm volatile (\n"
            + "        \"mov $1, %%eax\\n\"\n"
            + "        \"cpuid\\n\"\n"
            + "        \"bt $31, %%ecx\\n\"\n"
            + "        \"setc %0\\n\"\n"
            + "        : \"=r\" (hypervisor_bit)\n"
            + "        :\n"
            + "        : \"%eax\", \"%ebx\", \"%ecx\", \"%edx\"\n"
            + "    );\n"
            + "    \n"
            + "    if (hypervisor_bit) {\n"
            + "        printf(\"Running in a virtualized environment\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Not running in a virtualized environment\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    check_virtualization();\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello Embedded World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdint.h>\n"
            + "\n"
            + "int main() {\n"
            + "    uint8_t small = 255;      // 1 byte (0-255)\n"
            + "    uint16_t medium = 65535;  // 2 bytes (0-65535)\n"
            + "    uint32_t large = 4294967295; // 4 bytes\n"
            + "    float fp_number = 3.14159;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#define LED_ON (1 << 5)  // Bit 5\n"
            + "\n"
            + "int main() {\n"
            + "    uint8_t port = 0x00;\n"
            + "    \n"
            + "    // Bật LED\n"
            + "    port |= LED_ON;\n"
            + "    \n"
            + "    // Tắt LED\n"
            + "    port &= ~LED_ON;\n"
            + "    \n"
            + "    // Đảo trạng thái LED\n"
            + "    port ^= LED_ON;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "// Giả sử địa chỉ thanh ghi GPIO là 0x40021000\n"
            + "#define GPIO_BASE ((volatile uint32_t*)0x40021000)\n"
            + "\n"
            + "typedef struct {\n"
            + "    volatile uint32_t MODER;   // GPIO port mode register\n"
            + "    volatile uint32_t OTYPER;  // GPIO port output type register\n"
            + "    volatile uint32_t OSPEEDR; // GPIO port output speed register\n"
            + "    volatile uint32_t PUPDR;   // GPIO port pull-up/pull-down register\n"
            + "    volatile uint32_t IDR;     // GPIO port input data register\n"
            + "    volatile uint32_t ODR;     // GPIO port output data register\n"
            + "} GPIO_TypeDef;\n"
            + "\n"
            + "#define GPIOA ((GPIO_TypeDef*)GPIO_BASE)\n"
            + "\n"
            + "void configure_led() {\n"
            + "    // Cấu hình chân PA5 là output\n"
            + "    GPIOA->MODER &= ~(0x3 << (5 * 2));  // Clear bits\n"
            + "    GPIOA->MODER |= (0x1 << (5 * 2));   // Set output mode\n"
            + "}\n"
            + "\n"
            + "void toggle_led() {\n"
            + "    GPIOA->ODR ^= (1 << 5);  // Đảo trạng thái LED\n"
            + "}",
            "#include <stdint.h>\n"
            + "\n"
            + "// Prototype hàm xử lý ngắt\n"
            + "void EXTI0_IRQHandler(void) __attribute__((interrupt));\n"
            + "\n"
            + "void EXTI0_IRQHandler(void) {\n"
            + "    // Xử lý ngắt\n"
            + "    if (EXTI->PR & (1 << 0)) {\n"
            + "        // Xóa cờ ngắt\n"
            + "        EXTI->PR = (1 << 0);\n"
            + "        \n"
            + "        // Thực hiện hành động khi ngắt xảy ra\n"
            + "        toggle_led();\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void configure_interrupt() {\n"
            + "    // Cấu hình ngắt ngoài cho chân PA0\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_AFIOEN;  // Bật clock cho AFIO\n"
            + "    AFIO->EXTICR[0] |= AFIO_EXTICR1_EXTI0_PA;  // PA0 cho EXTI0\n"
            + "    \n"
            + "    EXTI->IMR |= EXTI_IMR_MR0;  // Bật mask ngắt cho EXTI0\n"
            + "    EXTI->RTSR |= EXTI_RTSR_TR0; // Bật ngắt cạnh lên\n"
            + "    \n"
            + "    NVIC_EnableIRQ(EXTI0_IRQn);  // Bật ngắt trong NVIC\n"
            + "    NVIC_SetPriority(EXTI0_IRQn, 0);  // Đặt độ ưu tiên\n"
            + "}",
            "#define BUFFER_SIZE 128\n"
            + "\n"
            + "// Biến toàn cục - lưu trong data/bss segment\n"
            + "static uint8_t global_buffer[BUFFER_SIZE];\n"
            + "\n"
            + "void process_data() {\n"
            + "    // Biến cục bộ - lưu trên stack\n"
            + "    uint8_t local_buffer[BUFFER_SIZE];\n"
            + "    \n"
            + "    // Sử dụng bộ nhớ tĩnh\n"
            + "    static uint8_t persistent_var = 0;\n"
            + "    persistent_var++;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "void use_heap_memory() {\n"
            + "    // Cấp phát động - tránh dùng trong hệ thống nhúng thời gian thực\n"
            + "    uint8_t *dynamic_buffer = malloc(BUFFER_SIZE);\n"
            + "    \n"
            + "    if (dynamic_buffer != NULL) {\n"
            + "        // Sử dụng bộ nhớ\n"
            + "        dynamic_buffer[0] = 0xAB;\n"
            + "        \n"
            + "        // Giải phóng bộ nhớ\n"
            + "        free(dynamic_buffer);\n"
            + "    }\n"
            + "}",
            "typedef struct {\n"
            + "    volatile uint32_t SR;   // Status register\n"
            + "    volatile uint32_t DR;   // Data register\n"
            + "    volatile uint32_t BRR;  // Baud rate register\n"
            + "    volatile uint32_t CR1;  // Control register 1\n"
            + "} USART_TypeDef;\n"
            + "\n"
            + "#define USART1 ((USART_TypeDef*)0x40013800)\n"
            + "\n"
            + "void uart_init(uint32_t baudrate) {\n"
            + "    // Bật clock cho USART1 và GPIO\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_USART1EN | RCC_APB2ENR_IOPAEN;\n"
            + "    \n"
            + "    // Cấu hình chân PA9 (TX) và PA10 (RX)\n"
            + "    GPIOA->CRH &= ~(GPIO_CRH_CNF9 | GPIO_CRH_MODE9);\n"
            + "    GPIOA->CRH |= GPIO_CRH_CNF9_1 | GPIO_CRH_MODE9;\n"
            + "    \n"
            + "    // Cấu hình baud rate\n"
            + "    USART1->BRR = SystemCoreClock / baudrate;\n"
            + "    \n"
            + "    // Bật USART, TX, RX\n"
            + "    USART1->CR1 = USART_CR1_UE | USART_CR1_TE | USART_CR1_RE;\n"
            + "}\n"
            + "\n"
            + "void uart_send_char(char c) {\n"
            + "    while (!(USART1->SR & USART_SR_TXE));  // Chờ đến khi bộ đệm trống\n"
            + "    USART1->DR = c;\n"
            + "}\n"
            + "\n"
            + "char uart_receive_char() {\n"
            + "    while (!(USART1->SR & USART_SR_RXNE));  // Chờ đến khi có dữ liệu\n"
            + "    return USART1->DR;\n"
            + "}",
            "typedef struct {\n"
            + "    volatile uint32_t CR1;     // Control register 1\n"
            + "    volatile uint32_t CR2;     // Control register 2\n"
            + "    volatile uint32_t SR;      // Status register\n"
            + "    volatile uint32_t DR;      // Data register\n"
            + "    volatile uint32_t CRCPR;   // CRC polynomial register\n"
            + "    volatile uint32_t RXCRCR;  // RX CRC register\n"
            + "    volatile uint32_t TXCRCR;  // TX CRC register\n"
            + "} SPI_TypeDef;\n"
            + "\n"
            + "#define SPI1 ((SPI_TypeDef*)0x40013000)\n"
            + "\n"
            + "void spi_init() {\n"
            + "    // Bật clock SPI và GPIO\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_SPI1EN | RCC_APB2ENR_IOPAEN;\n"
            + "    \n"
            + "    // Cấu hình chân SPI (PA5-SCK, PA6-MISO, PA7-MOSI)\n"
            + "    GPIOA->CRL &= ~(GPIO_CRL_CNF5 | GPIO_CRL_MODE5 | \n"
            + "                    GPIO_CRL_CNF6 | GPIO_CRL_MODE6 | \n"
            + "                    GPIO_CRL_CNF7 | GPIO_CRL_MODE7);\n"
            + "    GPIOA->CRL |= GPIO_CRL_CNF5_1 | GPIO_CRL_MODE5 |\n"
            + "                  GPIO_CRL_CNF6_1 | GPIO_CRL_MODE6 |\n"
            + "                  GPIO_CRL_CNF7_1 | GPIO_CRL_MODE7;\n"
            + "    \n"
            + "    // Cấu hình SPI: Master, clock polarity/phase, prescaler\n"
            + "    SPI1->CR1 = SPI_CR1_MSTR | SPI_CR1_BR_0 | SPI_CR1_SPE;\n"
            + "}\n"
            + "\n"
            + "uint8_t spi_transfer(uint8_t data) {\n"
            + "    while (!(SPI1->SR & SPI_SR_TXE));  // Chờ bộ đệm truyền trống\n"
            + "    SPI1->DR = data;\n"
            + "    \n"
            + "    while (!(SPI1->SR & SPI_SR_RXNE)); // Chờ nhận dữ liệu\n"
            + "    return SPI1->DR;\n"
            + "}",
            "#include \"FreeRTOS.h\"\n"
            + "#include \"task.h\"\n"
            + "\n"
            + "void vTask1(void *pvParameters) {\n"
            + "    while (1) {\n"
            + "        // Thực hiện công việc của task 1\n"
            + "        toggle_led();\n"
            + "        vTaskDelay(pdMS_TO_TICKS(500));  // Delay 500ms\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void vTask2(void *pvParameters) {\n"
            + "    while (1) {\n"
            + "        // Thực hiện công việc của task 2\n"
            + "        process_sensor_data();\n"
            + "        vTaskDelay(pdMS_TO_TICKS(1000)); // Delay 1s\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo các task\n"
            + "    xTaskCreate(vTask1, \"Task1\", configMINIMAL_STACK_SIZE, NULL, 1, NULL);\n"
            + "    xTaskCreate(vTask2, \"Task2\", configMINIMAL_STACK_SIZE, NULL, 2, NULL);\n"
            + "    \n"
            + "    // Khởi động scheduler\n"
            + "    vTaskStartScheduler();\n"
            + "    \n"
            + "    // Không bao giờ đến đây\n"
            + "    while (1);\n"
            + "}",
            "#include \"FreeRTOS.h\"\n"
            + "#include \"queue.h\"\n"
            + "#include \"semphr.h\"\n"
            + "\n"
            + "// Tạo queue và semaphore\n"
            + "QueueHandle_t xQueue = NULL;\n"
            + "SemaphoreHandle_t xSemaphore = NULL;\n"
            + "\n"
            + "void producer_task(void *pvParameters) {\n"
            + "    uint8_t data = 0;\n"
            + "    while (1) {\n"
            + "        data = read_sensor();\n"
            + "        \n"
            + "        // Gửi dữ liệu qua queue\n"
            + "        xQueueSend(xQueue, &data, portMAX_DELAY);\n"
            + "        \n"
            + "        // Cho semaphore\n"
            + "        xSemaphoreGive(xSemaphore);\n"
            + "        \n"
            + "        vTaskDelay(pdMS_TO_TICKS(200));\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void consumer_task(void *pvParameters) {\n"
            + "    uint8_t received_data;\n"
            + "    while (1) {\n"
            + "        // Chờ semaphore\n"
            + "        xSemaphoreTake(xSemaphore, portMAX_DELAY);\n"
            + "        \n"
            + "        // Nhận dữ liệu từ queue\n"
            + "        xQueueReceive(xQueue, &received_data, portMAX_DELAY);\n"
            + "        \n"
            + "        process_data(received_data);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo queue và semaphore\n"
            + "    xQueue = xQueueCreate(10, sizeof(uint8_t));\n"
            + "    xSemaphore = xSemaphoreCreateBinary();\n"
            + "    \n"
            + "    // Tạo các task\n"
            + "    xTaskCreate(producer_task, \"Producer\", configMINIMAL_STACK_SIZE, NULL, 2, NULL);\n"
            + "    xTaskCreate(consumer_task, \"Consumer\", configMINIMAL_STACK_SIZE, NULL, 1, NULL);\n"
            + "    \n"
            + "    vTaskStartScheduler();\n"
            + "    \n"
            + "    while (1);\n"
            + "}",
            "// Macro để đọc thanh ghi nhanh\n"
            + "#define READ_REG(addr) (*(volatile uint32_t*)(addr))\n"
            + "\n"
            + "// Hàm inline để tối ưu hiệu suất\n"
            + "static inline void delay_us(uint32_t us) {\n"
            + "    uint32_t count = us * (SystemCoreClock / 1000000) / 5;\n"
            + "    while (count--);\n"
            + "}\n"
            + "\n"
            + "// Sử dụng\n"
            + "void example_optimization() {\n"
            + "    uint32_t reg_value = READ_REG(0x40021000);\n"
            + "    delay_us(100);  // Delay 100 micro giây\n"
            + "}",
            "// Không tối ưu\n"
            + "void slow_loop() {\n"
            + "    for (int i = 0; i < 100; i++) {\n"
            + "        do_something(i);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Tối ưu hơn\n"
            + "void fast_loop() {\n"
            + "    int i = 100;\n"
            + "    while (i--) {\n"
            + "        do_something(100 - i - 1);\n"
            + "    }\n"
            + "}",
            "#include <assert.h>\n"
            + "\n"
            + "#define ASSERT_PORT(port) assert((port) >= GPIOA && (port) <= GPIOC)\n"
            + "\n"
            + "void set_pin(GPIO_TypeDef *port, uint8_t pin) {\n"
            + "    ASSERT_PORT(port);\n"
            + "    assert(pin < 16);\n"
            + "    \n"
            + "    port->BSRR = (1 << pin);  // Set pin\n"
            + "}",
            "// Log levels\n"
            + "typedef enum {\n"
            + "    LOG_ERROR,\n"
            + "    LOG_WARNING,\n"
            + "    LOG_INFO,\n"
            + "    LOG_DEBUG\n"
            + "} log_level_t;\n"
            + "\n"
            + "void log_message(log_level_t level, const char *message) {\n"
            + "    const char *level_str[] = {\"ERROR\", \"WARNING\", \"INFO\", \"DEBUG\"};\n"
            + "    \n"
            + "    if (level <= CURRENT_LOG_LEVEL) {\n"
            + "        uart_send_string(\"[\");\n"
            + "        uart_send_string(level_str[level]);\n"
            + "        uart_send_string(\"] \");\n"
            + "        uart_send_string(message);\n"
            + "        uart_send_string(\"\\r\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Sử dụng\n"
            + "log_message(LOG_ERROR, \"System initialization failed\");\n"
            + "log_message(LOG_INFO, \"Starting main loop\");",
            "// Đặt tên có ý nghĩa\n"
            + "#define MAX_SENSOR_READINGS  32\n"
            + "typedef enum {\n"
            + "    SENSOR_STATE_IDLE,\n"
            + "    SENSOR_STATE_READING,\n"
            + "    SENSOR_STATE_ERROR\n"
            + "} sensor_state_t;\n"
            + "\n"
            + "// Sử dụng static cho hàm cục bộ\n"
            + "static uint32_t calculate_checksum(const uint8_t *data, size_t length) {\n"
            + "    uint32_t sum = 0;\n"
            + "    for (size_t i = 0; i < length; i++) {\n"
            + "        sum += data[i];\n"
            + "    }\n"
            + "    return sum;\n"
            + "}\n"
            + "\n"
            + "// Cấu trúc code rõ ràng\n"
            + "typedef struct {\n"
            + "    uint8_t id;\n"
            + "    uint16_t value;\n"
            + "    uint32_t timestamp;\n"
            + "} sensor_data_t;\n"
            + "\n"
            + "void process_sensor_data(const sensor_data_t *data) {\n"
            + "    if (data == NULL) return;\n"
            + "    \n"
            + "    // Xử lý dữ liệu\n"
            + "}",
            "typedef enum {\n"
            + "    ERROR_NONE = 0,\n"
            + "    ERROR_INVALID_PARAM,\n"
            + "    ERROR_TIMEOUT,\n"
            + "    ERROR_HARDWARE\n"
            + "} error_code_t;\n"
            + "\n"
            + "error_code_t initialize_peripheral(void) {\n"
            + "    if (!check_hardware()) {\n"
            + "        return ERROR_HARDWARE;\n"
            + "    }\n"
            + "    \n"
            + "    if (configure() != 0) {\n"
            + "        return ERROR_INVALID_PARAM;\n"
            + "    }\n"
            + "    \n"
            + "    return ERROR_NONE;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    error_code_t err = initialize_peripheral();\n"
            + "    if (err != ERROR_NONE) {\n"
            + "        handle_error(err);\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Ứng dụng chính\n"
            + "    while (1) {\n"
            + "        run_application();\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cấu trúc tổng quát", new String[]{
            "#include <stdio.h>   // Thư viện nhập xuất chuẩn\n"
            + "#include <stdlib.h>  // Thư viện các hàm tiện ích\n"
            + "#include <math.h>    // Thư viện toán học\n"
            + "#include <string.h>  // Thư viện xử lý chuỗi",
            "#define PI 3.14159265359\n"
            + "#define MAX_SIZE 100\n"
            + "#define GREETING \"Xin chao ban!\"",
            "// Nguyên mẫu hàm tính tổng hai số\n"
            + "int sum(int a, int b);\n"
            + "\n"
            + "// Nguyên mẫu hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int n);\n"
            + "\n"
            + "// Nguyên mẫu hàm in mảng\n"
            + "void printArray(int arr[], int size);",
            "int globalCounter = 0;       // Biến đếm toàn cục\n"
            + "const float TAX_RATE = 0.1;  // Hằng số thuế",
            "int main() {\n"
            + "    // Khai báo biến cục bộ\n"
            + "    int a = 5, b = 10;\n"
            + "    int result;\n"
            + "    \n"
            + "    // Gọi hàm tính tổng\n"
            + "    result = sum(a, b);\n"
            + "    printf(\"Tong cua %d va %d la %d\\n\", a, b, result);\n"
            + "    \n"
            + "    // Kiểm tra số nguyên tố\n"
            + "    if (isPrime(7)) {\n"
            + "        printf(\"7 la so nguyen to\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng biến toàn cục\n"
            + "    globalCounter++;\n"
            + "    printf(\"Gia tri counter: %d\\n\", globalCounter);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "// Hàm tính tổng hai số\n"
            + "int sum(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int n) {\n"
            + "    if (n <= 1) return 0;\n"
            + "    for (int i = 2; i <= sqrt(n); i++) {\n"
            + "        if (n % i == 0) return 0;\n"
            + "    }\n"
            + "    return 1;\n"
            + "}\n"
            + "\n"
            + "// Hàm in mảng\n"
            + "void printArray(int arr[], int size) {\n"
            + "    for (int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <math.h>\n"
            + "\n"
            + "#define PI 3.14159265359\n"
            + "#define MAX_SIZE 100\n"
            + "\n"
            + "// Function prototypes\n"
            + "double calculateCircleArea(double radius);\n"
            + "void printFibonacci(int n);\n"
            + "int factorial(int n);\n"
            + "\n"
            + "// Global variables\n"
            + "int globalCounter = 0;\n"
            + "\n"
            + "int main() {\n"
            + "    double radius = 5.0;\n"
            + "    printf(\"Dien tich hinh tron ban kinh %.2f la: %.2f\\n\", \n"
            + "           radius, calculateCircleArea(radius));\n"
            + "    \n"
            + "    printf(\"Day Fibonacci 10 so dau: \");\n"
            + "    printFibonacci(10);\n"
            + "    \n"
            + "    printf(\"Giai thua cua 5 la: %d\\n\", factorial(5));\n"
            + "    \n"
            + "    globalCounter = 10;\n"
            + "    printf(\"Gia tri counter: %d\\n\", globalCounter);\n"
            + "    \n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Calculate area of a circle\n"
            + "double calculateCircleArea(double radius) {\n"
            + "    return PI * radius * radius;\n"
            + "}\n"
            + "\n"
            + "// Print Fibonacci sequence\n"
            + "void printFibonacci(int n) {\n"
            + "    int a = 0, b = 1, c;\n"
            + "    for (int i = 1; i <= n; i++) {\n"
            + "        printf(\"%d \", a);\n"
            + "        c = a + b;\n"
            + "        a = b;\n"
            + "        b = c;\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "// Calculate factorial\n"
            + "int factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}"
        });

        Code_MAP.put("Khai báo biến", new String[]{
            "kiểu_dữ_liệu tên_biến [= giá_trị_khởi_tạo];",
            "int a = 10;          // Số nguyên (thường 4 byte)\n"
            + "short b = 20;        // Số nguyên ngắn (2 byte)\n"
            + "long c = 100000L;    // Số nguyên dài (4 hoặc 8 byte)\n"
            + "long long d = 123456789LL; // Số nguyên rất dài (8 byte)\n"
            + "unsigned int e = 50;  // Số nguyên không dấu",
            "float f = 3.14f;      // Số thực độ chính xác đơn (4 byte)\n"
            + "double g = 3.141592;  // Số thực độ chính xác kép (8 byte)\n"
            + "long double h = 3.1415926535L; // Số thực độ chính xác mở rộng",
            "char ch1 = 'A';       // Ký tự đơn (1 byte)\n"
            + "char ch2 = 65;        // Cũng là 'A' (theo bảng ASCII)",
            "#include <stdbool.h>\n"
            + "bool isActive = true; // Kiểu logic (true/false)",
            "int x = 1, y = 2, z = 3;\n"
            + "float f1 = 1.1, f2 = 2.2;\n"
            + "char c1 = 'a', c2 = 'b', c3 = 'c';",
            "void counter() {\n"
            + "    static int count = 0; // Chỉ khởi tạo một lần\n"
            + "    count++;\n"
            + "    printf(\"Count: %d\\n\", count);\n"
            + "}",
            "register int fastVar = 0;",
            "volatile int hardwareRegister;",
            "const float PI = 3.14159;\n"
            + "const int MAX_SIZE = 100;",
            "int globalVar = 42;",
            "extern int globalVar; // Sử dụng biến globalVar từ File1.c",
            "#include <stdio.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "// Biến toàn cục\n"
            + "int globalCount = 0;\n"
            + "\n"
            + "// Hằng số\n"
            + "const double TAX_RATE = 0.1;\n"
            + "\n"
            + "void exampleFunction() {\n"
            + "    // Biến cục bộ\n"
            + "    int localVar = 10;\n"
            + "    \n"
            + "    // Biến static\n"
            + "    static int staticVar = 5;\n"
            + "    \n"
            + "    printf(\"Local: %d, Static: %d\\n\", localVar, staticVar);\n"
            + "    localVar++;\n"
            + "    staticVar++;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo các kiểu biến khác nhau\n"
            + "    int age = 25;\n"
            + "    float weight = 68.5f;\n"
            + "    char grade = 'A';\n"
            + "    bool isStudent = true;\n"
            + "    \n"
            + "    // Khai báo nhiều biến cùng kiểu\n"
            + "    double x = 1.1, y = 2.2, z = 3.3;\n"
            + "    \n"
            + "    // Biến register\n"
            + "    register int counter;\n"
            + "    \n"
            + "    // Biến volatile\n"
            + "    volatile int hardwareData;\n"
            + "    \n"
            + "    // Biến const\n"
            + "    const int MAX_USERS = 100;\n"
            + "    \n"
            + "    printf(\"Age: %d, Weight: %.1f, Grade: %c\\n\", age, weight, grade);\n"
            + "    printf(\"Is student: %s\\n\", isStudent ? \"true\" : \"false\");\n"
            + "    \n"
            + "    // Gọi hàm nhiều lần để thấy sự khác biệt giữa biến cục bộ và static\n"
            + "    exampleFunction(); // Local: 10, Static: 5\n"
            + "    exampleFunction(); // Local: 10, Static: 6\n"
            + "    exampleFunction(); // Local: 10, Static: 7\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int _count;\n"
            + "float averageScore;\n"
            + "double taxRate2023;",
            "#include <stdio.h>\n"
            + "\n"
            + "int globalVar = 10; // Biến toàn cục\n"
            + "\n"
            + "void testFunction(int param) { // param là biến tham số\n"
            + "    int localVar = 20; // Biến cục bộ\n"
            + "    printf(\"Global: %d, Param: %d, Local: %d\\n\", globalVar, param, localVar);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    testFunction(15);\n"
            + "    // printf(\"%d\", localVar); // Lỗi: localVar không tồn tại ở đây\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Hàm main", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main(void) {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    printf(\"Chương trình: %s\\n\", argv[0]);\n"
            + "    printf(\"Số tham số: %d\\n\", argc - 1);\n"
            + "    \n"
            + "    for (int i = 1; i < argc; i++) {\n"
            + "        printf(\"Tham số %d: %s\\n\", i, argv[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main(int argc, char *argv[], char *envp[]) {\n"
            + "    printf(\"Tham số môi trường:\\n\");\n"
            + "    \n"
            + "    for (int i = 0; envp[i] != NULL; i++) {\n"
            + "        printf(\"%s\\n\", envp[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h> // cho hàm atoi()\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "int factorial(int n) {\n"
            + "    if (n <= 1) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    // Kiểm tra số lượng tham số\n"
            + "    if (argc != 2) {\n"
            + "        printf(\"Usage: %s <number>\\n\", argv[0]);\n"
            + "        return 1; // Trả về mã lỗi\n"
            + "    }\n"
            + "    \n"
            + "    // Chuyển tham số thành số\n"
            + "    int num = atoi(argv[1]);\n"
            + "    \n"
            + "    // Kiểm tra số hợp lệ\n"
            + "    if (num < 0) {\n"
            + "        printf(\"Error: Number must be non-negative.\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Tính và in kết quả\n"
            + "    printf(\"Factorial of %d is %d\\n\", num, factorial(num));\n"
            + "    \n"
            + "    return 0; // Thành công\n"
            + "}"
        });

        Code_MAP.put("Các bước biên dịch", new String[]{
            "// sample.c\n"
            + "#include <stdio.h>\n"
            + "#define PI 3.14159\n"
            + "\n"
            + "int main() {\n"
            + "    // Tính diện tích hình tròn\n"
            + "    float radius = 5.0;\n"
            + "    float area = PI * radius * radius;\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "// Nội dung từ stdio.h được chèn vào đây\n"
            + "// Macro PI được thay thế bằng 3.14159\n"
            + "// Comment đã bị xóa\n"
            + "\n"
            + "int main() {\n"
            + "    float radius = 5.0;\n"
            + "    float area = 3.14159 * radius * radius;\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "	.file	\"sample.c\"\n"
            + "	.text\n"
            + "	.section	.rodata\n"
            + ".LC1:\n"
            + "	.string	\"Di\\341\\273\\207n t\\303\\255ch h\\303\\254nh tr\\303\\262n: %.2f\\n\"\n"
            + "	.text\n"
            + "	.globl	main\n"
            + "	.type	main, @function\n"
            + "main:\n"
            + ".LFB0:\n"
            + "	.cfi_startproc\n"
            + "	pushq	%rbp\n"
            + "	.cfi_def_cfa_offset 16\n"
            + "	.cfi_offset 6, -16\n"
            + "	movq	%rsp, %rbp\n"
            + "	.cfi_def_cfa_register 6\n"
            + "	subq	$16, %rsp\n"
            + "	movss	.LC0(%rip), %xmm0\n"
            + "	movss	%xmm0, -8(%rbp)\n"
            + "	...",
            "// circle.h\n"
            + "#ifndef CIRCLE_H\n"
            + "#define CIRCLE_H\n"
            + "\n"
            + "#define PI 3.14159\n"
            + "\n"
            + "float calculate_area(float radius);\n"
            + "\n"
            + "#endif",
            "// circle.c\n"
            + "#include \"circle.h\"\n"
            + "\n"
            + "float calculate_area(float radius) {\n"
            + "    return PI * radius * radius;\n"
            + "}",
            "// main.c\n"
            + "#include <stdio.h>\n"
            + "#include \"circle.h\"\n"
            + "\n"
            + "int main() {\n"
            + "    float radius = 5.0;\n"
            + "    float area = calculate_area(radius);\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "gcc -E circle.c -o circle.i\n"
            + "gcc -E main.c -o main.i",
            "gcc -S circle.i -o circle.s\n"
            + "gcc -S main.i -o main.s",
            "gcc -c circle.s -o circle.o\n"
            + "gcc -c main.s -o main.o",
            "gcc circle.o main.o -o circle_program",
            "./circle_program",
            "Diện tích hình tròn: 78.54"
        });

        Code_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "// File: hello.c\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "#define GREETING \"Hello, World!\"\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"%s\\n\", GREETING);\n"
            + "    return 0;\n"
            + "}",
            "gcc hello.c -o hello",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm được định nghĩa ở file khác\n"
            + "extern int add(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int result = add(5, 3);\n"
            + "    printf(\"Result: %d\\n\", result);\n"
            + "    return 0;\n"
            + "}",
            "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "gcc -c main.c        # Tạo main.o\n"
            + "gcc -c math.c        # Tạo math.o\n"
            + "gcc main.o math.o -o calculator  # Liên kết thành file thực thi",
            "#ifndef UTILS_H\n"
            + "#define UTILS_H\n"
            + "\n"
            + "int multiply(int a, int b);\n"
            + "void print_message(const char* msg);\n"
            + "\n"
            + "#endif",
            "#include <stdio.h>\n"
            + "#include \"utils.h\"\n"
            + "\n"
            + "int multiply(int a, int b) {\n"
            + "    return a * b;\n"
            + "}\n"
            + "\n"
            + "void print_message(const char* msg) {\n"
            + "    printf(\"Message: %s\\n\", msg);\n"
            + "}",
            "#include \"utils.h\"\n"
            + "\n"
            + "int main() {\n"
            + "    int product = multiply(4, 5);\n"
            + "    print_message(\"Product calculated\");\n"
            + "    printf(\"Product: %d\\n\", product);\n"
            + "    return 0;\n"
            + "}",
            "gcc -c utils.c       # Tạo utils.o\n"
            + "gcc -c app.c         # Tạo app.o\n"
            + "gcc utils.o app.o -o myapp  # Liên kết thành myapp",
            "gcc input.c -o output",
            "gcc -c file.c",
            "gcc -Iinclude/ source.c",
            "gcc main.c -Llib -lmylib",
            "gcc -g program.c -o program",
            "gcc -O2 program.c -o program",
            "gcc -Wall program.c -o program"
        });

        Code_MAP.put("Quá trình thực thi", new String[]{
            "// hello.c - Chương trình C đơn giản\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Xin chào thế giới!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "// Nội dung từ stdio.h được chèn vào đây\n"
            + "...\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Xin chào thế giới!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "gcc -S hello.c  # Tạo file hello.s",
            ".section	__TEXT,__text,regular,pure_instructions\n"
            + "	.build_version macos, 10, 15	sdk_version 10, 15\n"
            + "	.globl	_main                   ## -- Begin function main\n"
            + "_main:\n"
            + "	pushq	%rbp\n"
            + "	movq	%rsp, %rbp\n"
            + "	subq	$16, %rsp\n"
            + "	leaq	L_.str(%rip), %rdi\n"
            + "	movb	$0, %al\n"
            + "	callq	_printf\n"
            + "	xorl	%eax, %eax\n"
            + "	addq	$16, %rsp\n"
            + "	popq	%rbp\n"
            + "	retq\n"
            + "	.section	__TEXT,__cstring,cstring_literals\n"
            + "L_.str:                                 ## @.str\n"
            + "	.asciz	\"Xin chào thế giới!\\n\"",
            "gcc -c hello.c  # Tạo file hello.o",
            "gcc hello.o -o hello  # Tạo file thực thi hello",
            "// sample.c - Chương trình mẫu minh họa quá trình biên dịch\n"
            + "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Macro định nghĩa\n"
            + "#define GREETING \"Xin chào\"\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "int factorial(int n) {\n"
            + "    if (n <= 1) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Biến cục bộ\n"
            + "    int number = 5;\n"
            + "    \n"
            + "    // Gọi hàm và sử dụng macro\n"
            + "    printf(\"%s! Giai thừa của %d là %d\\n\", GREETING, number, factorial(number));\n"
            + "    \n"
            + "    // Cấp phát động\n"
            + "    int *arr = (int*)malloc(number * sizeof(int));\n"
            + "    if (arr == NULL) {\n"
            + "        perror(\"Lỗi cấp phát bộ nhớ\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng bộ nhớ đã cấp phát\n"
            + "    for (int i = 0; i < number; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "gcc -E sample.c -o sample.i",
            "gcc -S sample.c -o sample.s",
            "gcc -c sample.c -o sample.o",
            "gcc sample.o -o sample",
            "./sample",
            "Xin chào! Giai thừa của 5 là 120"
        });

        Code_MAP.put("Câu lệnh if", new String[]{
            "if (điều_kiện) {\n"
            + "    // Khối lệnh được thực thi nếu điều kiện đúng (true)\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 20;\n"
            + "    \n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // Khối lệnh nếu điều kiện đúng\n"
            + "} else {\n"
            + "    // Khối lệnh nếu điều kiện sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    if (number % 2 == 0) {\n"
            + "        printf(\"%d là số chẵn.\\n\", number);\n"
            + "    } else {\n"
            + "        printf(\"%d là số lẻ.\\n\", number);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh nếu điều_kiện_1 đúng\n"
            + "} else if (điều_kiện_2) {\n"
            + "    // Khối lệnh nếu điều_kiện_2 đúng\n"
            + "} else if (điều_kiện_3) {\n"
            + "    // Khối lệnh nếu điều_kiện_3 đúng\n"
            + "} else {\n"
            + "    // Khối lệnh nếu tất cả điều kiện trên sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int score = 85;\n"
            + "    \n"
            + "    if (score >= 90) {\n"
            + "        printf(\"Xếp loại A\\n\");\n"
            + "    } else if (score >= 80) {\n"
            + "        printf(\"Xếp loại B\\n\");\n"
            + "    } else if (score >= 70) {\n"
            + "        printf(\"Xếp loại C\\n\");\n"
            + "    } else if (score >= 60) {\n"
            + "        printf(\"Xếp loại D\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Xếp loại F\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    if (điều_kiện_2) {\n"
            + "        // Khối lệnh nếu cả 2 điều kiện đều đúng\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 15;\n"
            + "    \n"
            + "    if (num > 0) {\n"
            + "        printf(\"Số dương\\n\");\n"
            + "        \n"
            + "        if (num % 2 == 0) {\n"
            + "            printf(\"và là số chẵn\\n\");\n"
            + "        } else {\n"
            + "            printf(\"và là số lẻ\\n\");\n"
            + "        }\n"
            + "    } else if (num < 0) {\n"
            + "        printf(\"Số âm\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Số 0\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1 && điều_kiện_2) {\n"
            + "    // Khối lệnh nếu cả 2 điều kiện đều đúng\n"
            + "}\n"
            + "\n"
            + "if (điều_kiện_1 || điều_kiện_2) {\n"
            + "    // Khối lệnh nếu 1 trong 2 điều kiện đúng\n"
            + "}\n"
            + "\n"
            + "if (!điều_kiện) {\n"
            + "    // Khối lệnh nếu điều kiện sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 25;\n"
            + "    int hasLicense = 1; // 1 = true, 0 = false\n"
            + "    \n"
            + "    if (age >= 18 && hasLicense) {\n"
            + "        printf(\"Bạn được phép lái xe.\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Bạn không được phép lái xe.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if ((biến = giá_trị) == giá_trị_so_sánh) {\n"
            + "    // Khối lệnh\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int x;\n"
            + "    \n"
            + "    if ((x = 10) == 10) {\n"
            + "        printf(\"x được gán giá trị 10 và kiểm tra thành công\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Câu lệnh if-else", new String[]{
            "if (điều_kiện) {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện đúng (true)\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện đúng (true)\n"
            + "} else {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện sai (false)\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_1 đúng\n"
            + "} else if (điều_kiện_2) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_2 đúng\n"
            + "} else if (điều_kiện_3) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_3 đúng\n"
            + "} else {\n"
            + "    // Khối lệnh thực hiện nếu tất cả điều kiện trên sai\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_1 đúng\n"
            + "    \n"
            + "    if (điều_kiện_2) {\n"
            + "        // Khối lệnh thực hiện nếu cả điều_kiện_1 và điều_kiện_2 đều đúng\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 20;\n"
            + "    \n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    if (number % 2 == 0) {\n"
            + "        printf(\"%d là số chẵn.\\n\", number);\n"
            + "    } else {\n"
            + "        printf(\"%d là số lẻ.\\n\", number);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int score = 85;\n"
            + "    \n"
            + "    if (score >= 90) {\n"
            + "        printf(\"Xếp loại A\\n\");\n"
            + "    } else if (score >= 80) {\n"
            + "        printf(\"Xếp loại B\\n\");\n"
            + "    } else if (score >= 70) {\n"
            + "        printf(\"Xếp loại C\\n\");\n"
            + "    } else if (score >= 60) {\n"
            + "        printf(\"Xếp loại D\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Xếp loại F\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 100, b = 20, c = 30;\n"
            + "    \n"
            + "    if (a > b) {\n"
            + "        if (a > c) {\n"
            + "            printf(\"a là số lớn nhất.\\n\");\n"
            + "        } else {\n"
            + "            printf(\"c là số lớn nhất.\\n\");\n"
            + "        }\n"
            + "    } else {\n"
            + "        if (b > c) {\n"
            + "            printf(\"b là số lớn nhất.\\n\");\n"
            + "        } else {\n"
            + "            printf(\"c là số lớn nhất.\\n\");\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 25;\n"
            + "    char gender = 'M';\n"
            + "    \n"
            + "    if (age >= 18 && gender == 'M') {\n"
            + "        printf(\"Nam đã đủ tuổi nghĩa vụ quân sự.\\n\");\n"
            + "    } else if (age >= 18 || gender == 'F') {\n"
            + "        printf(\"Đã đủ tuổi bầu cử hoặc là nữ.\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Chưa đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Câu lệnh switch-case", new String[]{
            "switch (biểu_thức) {\n"
            + "    case giá_trị_1:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_1\n"
            + "        break;\n"
            + "    case giá_trị_2:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_2\n"
            + "        break;\n"
            + "    ...\n"
            + "    case giá_trị_n:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_n\n"
            + "        break;\n"
            + "    default:\n"
            + "        // Khối lệnh thực thi nếu không có case nào khớp\n"
            + "        break;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char grade;\n"
            + "    printf(\"Nhập điểm (A-F): \");\n"
            + "    scanf(\"%c\", &grade);\n"
            + "    \n"
            + "    switch (grade) {\n"
            + "        case 'A':\n"
            + "            printf(\"Xuất sắc!\\n\");\n"
            + "            break;\n"
            + "        case 'B':\n"
            + "            printf(\"Tốt!\\n\");\n"
            + "            break;\n"
            + "        case 'C':\n"
            + "            printf(\"Trung bình.\\n\");\n"
            + "            break;\n"
            + "        case 'D':\n"
            + "            printf(\"Yếu, cần cố gắng.\\n\");\n"
            + "            break;\n"
            + "        case 'F':\n"
            + "            printf(\"Trượt!\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Điểm không hợp lệ.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10, b = 5, result;\n"
            + "    char op;\n"
            + "    printf(\"Nhập phép tính (+, -, *, /): \");\n"
            + "    scanf(\"%c\", &op);\n"
            + "    \n"
            + "    switch (op) {\n"
            + "        case '+':\n"
            + "            result = a + b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '-':\n"
            + "            result = a - b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '*':\n"
            + "            result = a * b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '/':\n"
            + "            if (b != 0) {\n"
            + "                result = a / b;\n"
            + "                printf(\"Kết quả: %d\\n\", result);\n"
            + "            } else {\n"
            + "                printf(\"Lỗi: chia cho 0!\\n\");\n"
            + "            }\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Phép tính không hợp lệ!\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int month;\n"
            + "    printf(\"Nhập tháng (1-12): \");\n"
            + "    scanf(\"%d\", &month);\n"
            + "    \n"
            + "    switch (month) {\n"
            + "        case 1: case 3: case 5: case 7: case 8: case 10: case 12:\n"
            + "            printf(\"Tháng %d có 31 ngày.\\n\", month);\n"
            + "            break;\n"
            + "        case 4: case 6: case 9: case 11:\n"
            + "            printf(\"Tháng %d có 30 ngày.\\n\", month);\n"
            + "            break;\n"
            + "        case 2:\n"
            + "            printf(\"Tháng 2 có 28 hoặc 29 ngày.\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Tháng không hợp lệ!\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp for", new String[]{
            "for (khởi_tạo; điều_kiện; cập_nhật) {\n"
            + "    // Khối lệnh được thực thi\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // In ra các số từ 1 đến 5\n"
            + "    for (int i = 1; i <= 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    for (int i = 0, j = 10; i < j; i++, j--) {\n"
            + "        printf(\"i = %d, j = %d\\n\", i, j);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "i = 0, j = 10\n"
            + "i = 1, j = 9\n"
            + "i = 2, j = 8\n"
            + "i = 3, j = 7\n"
            + "i = 4, j = 6",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 0;\n"
            + "    for (; i < 3; i++) {\n"
            + "        printf(\"Hello %d\\n\", i);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "Hello 0\n"
            + "Hello 1\n"
            + "Hello 2",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    for (;;) {\n"
            + "        printf(\"Vòng lặp vô hạn\\n\");\n"
            + "        // Thêm điều kiện break để thoát\n"
            + "        break; // Chỉ chạy 1 lần để demo\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // In bảng cửu chương\n"
            + "    for (int i = 1; i <= 10; i++) {\n"
            + "        for (int j = 1; j <= 10; j++) {\n"
            + "            printf(\"%4d\", i * j);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp while", new String[]{
            "while (điều_kiện) {\n"
            + "    // Khối lệnh được thực hiện khi điều kiện đúng\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 1;\n"
            + "    \n"
            + "    while (i <= 5) {\n"
            + "        printf(\"%d \", i);\n"
            + "        i++; // Tăng giá trị i lên 1\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int n, sum = 0, i = 1;\n"
            + "    \n"
            + "    printf(\"Nhập số nguyên dương n: \");\n"
            + "    scanf(\"%d\", &n);\n"
            + "    \n"
            + "    while (i <= n) {\n"
            + "        sum += i;\n"
            + "        i++;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Tổng từ 1 đến %d là: %d\\n\", n, sum);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    while (1) { // Điều kiện luôn đúng\n"
            + "        printf(\"Vòng lặp vô hạn!\\n\");\n"
            + "        // Nếu không có break, chương trình sẽ chạy mãi\n"
            + "        break; // Thêm break để thoát khỏi vòng lặp\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int num;\n"
            + "    \n"
            + "    printf(\"Nhập các số (nhập 0 để dừng):\\n\");\n"
            + "    scanf(\"%d\", &num);\n"
            + "    \n"
            + "    while (num != 0) {\n"
            + "        printf(\"Bạn đã nhập: %d\\n\", num);\n"
            + "        scanf(\"%d\", &num);\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Kết thúc chương trình.\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp do-while", new String[]{
            "do {\n"
            + "    // Khối lệnh được thực thi\n"
            + "} while (điều_kiện);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 1;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"%d \", i);\n"
            + "        i++;\n"
            + "    } while (i <= 5);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"Nhập một số dương: \");\n"
            + "        scanf(\"%d\", &number);\n"
            + "    } while (number <= 0);\n"
            + "    \n"
            + "    printf(\"Bạn đã nhập số dương: %d\\n\", number);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int n, sum = 0, i = 1;\n"
            + "    \n"
            + "    printf(\"Nhập n: \");\n"
            + "    scanf(\"%d\", &n);\n"
            + "    \n"
            + "    do {\n"
            + "        sum += i;\n"
            + "        i++;\n"
            + "    } while (i <= n);\n"
            + "    \n"
            + "    printf(\"Tổng từ 1 đến %d là: %d\\n\", n, sum);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo mảng một chiều", new String[]{
            "kiểu_dữ_liệu tên_mảng[kích_thước];",
            "int numbers[5]; // Khai báo mảng\n"
            + "numbers[0] = 10; // Khởi tạo từng phần tử\n"
            + "numbers[1] = 20;\n"
            + "// ...",
            "int numbers[5] = {10, 20, 30, 40, 50}; // Khởi tạo đầy đủ\n"
            + "int numbers[] = {10, 20, 30}; // Kích thước tự động xác định\n"
            + "int numbers[5] = {0}; // Tất cả phần tử = 0\n"
            + "int numbers[5] = {10, 20}; // 2 phần tử đầu được khởi tạo, các phần tử còn lại = 0",
            "int value = numbers[2]; // Truy cập phần tử thứ 3\n"
            + "numbers[3] = 100; // Gán giá trị cho phần tử thứ 4",
            "int size = sizeof(numbers) / sizeof(numbers[0]);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo và khởi tạo mảng\n"
            + "    int numbers[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // 2. Tính kích thước mảng\n"
            + "    int size = sizeof(numbers) / sizeof(numbers[0]);\n"
            + "    printf(\"Kich thuoc mang: %d\\n\", size);\n"
            + "    \n"
            + "    // 3. Truy cập và in các phần tử\n"
            + "    printf(\"Cac phan tu cua mang:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"numbers[%d] = %d\\n\", i, numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // 4. Thay đổi giá trị phần tử\n"
            + "    numbers[2] = 100;\n"
            + "    printf(\"\\nSau khi thay doi:\\n\");\n"
            + "    printf(\"numbers[2] = %d\\n\", numbers[2]);\n"
            + "    \n"
            + "    // 5. Nhập giá trị từ bàn phím\n"
            + "    printf(\"\\nNhap 5 so nguyen:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"numbers[%d] = \", i);\n"
            + "        scanf(\"%d\", &numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // In lại mảng sau khi nhập\n"
            + "    printf(\"\\nMang sau khi nhap:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "// Khai báo mảng kiểu int với 5 phần tử\n"
            + "int numbers[5];\n"
            + "\n"
            + "// Khai báo và khởi tạo mảng\n"
            + "float temperatures[] = {23.5, 24.0, 22.8, 25.2};",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập phần tử đầu tiên (index 0)\n"
            + "    printf(\"Phan tu thu nhat: %d\\n\", arr[0]);\n"
            + "    \n"
            + "    // Truy cập phần tử thứ ba (index 2)\n"
            + "    printf(\"Phan tu thu ba: %d\\n\", arr[2]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[3] = {5, 10, 15};\n"
            + "    \n"
            + "    printf(\"Truoc khi thay doi: %d\\n\", numbers[1]); // 10\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử thứ 2\n"
            + "    numbers[1] = 100;\n"
            + "    \n"
            + "    printf(\"Sau khi thay doi: %d\\n\", numbers[1]); // 100\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {1, 2, 3, 4, 5};\n"
            + "    int length = sizeof(arr) / sizeof(arr[0]);\n"
            + "    \n"
            + "    // Duyệt mảng bằng for\n"
            + "    printf(\"Duyet mang bang for:\\n\");\n"
            + "    for(int i = 0; i < length; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Duyệt mảng bằng while\n"
            + "    printf(\"\\nDuyet mang bang while:\\n\");\n"
            + "    int j = 0;\n"
            + "    while(j < length) {\n"
            + "        printf(\"arr[%d] = %d\\n\", j, arr[j]);\n"
            + "        j++;\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define SIZE 5\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[SIZE];\n"
            + "    \n"
            + "    // Nhập mảng từ bàn phím\n"
            + "    printf(\"Nhap %d phan tu:\\n\", SIZE);\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        printf(\"arr[%d] = \", i);\n"
            + "        scanf(\"%d\", &arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Xuất mảng ra màn hình\n"
            + "    printf(\"\\nMang vua nhap:\\n\");\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo mảng 2 chiều 3x3\n"
            + "    int matrix[3][3] = {\n"
            + "        {1, 2, 3},\n"
            + "        {4, 5, 6},\n"
            + "        {7, 8, 9}\n"
            + "    };\n"
            + "    \n"
            + "    // Truy cập phần tử mảng 2 chiều\n"
            + "    printf(\"Phan tu [1][2]: %d\\n\", matrix[1][2]); // 6\n"
            + "    \n"
            + "    // Duyệt mảng 2 chiều\n"
            + "    printf(\"\\nToan bo mang:\\n\");\n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        for(int j = 0; j < 3; j++) {\n"
            + "            printf(\"%d \", matrix[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập mảng thông qua con trỏ\n"
            + "    int *ptr = arr;\n"
            + "    \n"
            + "    printf(\"Phan tu thu 2: %d\\n\", *(ptr + 1)); // 20\n"
            + "    \n"
            + "    // Duyệt mảng bằng con trỏ\n"
            + "    printf(\"\\nDuyet mang bang con tro:\\n\");\n"
            + "    for(int i = 0; i < 5; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, *(ptr + i));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define SIZE 5\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[SIZE] = {5, 2, 8, 1, 9};\n"
            + "    \n"
            + "    // Tìm giá trị lớn nhất\n"
            + "    int max = arr[0];\n"
            + "    for(int i = 1; i < SIZE; i++) {\n"
            + "        if(arr[i] > max) {\n"
            + "            max = arr[i];\n"
            + "        }\n"
            + "    }\n"
            + "    printf(\"Gia tri lon nhat: %d\\n\", max);\n"
            + "    \n"
            + "    // Tính tổng mảng\n"
            + "    int sum = 0;\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        sum += arr[i];\n"
            + "    }\n"
            + "    printf(\"Tong cac phan tu: %d\\n\", sum);\n"
            + "    \n"
            + "    // Đảo ngược mảng\n"
            + "    printf(\"Mang dao nguoc: \");\n"
            + "    for(int i = SIZE - 1; i >= 0; i--) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhận mảng và kích thước làm tham số\n"
            + "void printArray(int arr[], int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "// Hàm thay đổi giá trị mảng\n"
            + "void modifyArray(int arr[], int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        arr[i] *= 2; // Nhân đôi mỗi phần tử\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[] = {1, 2, 3, 4, 5};\n"
            + "    int length = sizeof(numbers) / sizeof(numbers[0]);\n"
            + "    \n"
            + "    printf(\"Mang ban dau: \");\n"
            + "    printArray(numbers, length);\n"
            + "    \n"
            + "    modifyArray(numbers, length);\n"
            + "    \n"
            + "    printf(\"Mang sau khi thay doi: \");\n"
            + "    printArray(numbers, length);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo mảng hai chiều", new String[]{
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột];",
            "kiểu_dữ_liệu tên_mảng[][số_cột] = {\n"
            + "    {giá_trị11, giá_trị12, ...},\n"
            + "    {giá_trị21, giá_trị22, ...},\n"
            + "    ...\n"
            + "};",
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột] = {\n"
            + "    {giá_trị11, giá_trị12, ...},\n"
            + "    {giá_trị21, giá_trị22, ...},\n"
            + "    ...\n"
            + "};",
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột] = {giá_trị1, giá_trị2, giá_trị3, ...};",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo mảng 2 chiều không khởi tạo\n"
            + "    int matrix1[3][4]; // Mảng 3 hàng 4 cột chưa được khởi tạo giá trị\n"
            + "    \n"
            + "    // 2. Khai báo và khởi tạo mảng 2 chiều (chỉ định kích thước)\n"
            + "    int matrix2[2][3] = {\n"
            + "        {1, 2, 3},  // Hàng 0\n"
            + "        {4, 5, 6}   // Hàng 1\n"
            + "    };\n"
            + "    \n"
            + "    // 3. Khai báo và khởi tạo mảng 2 chiều (không chỉ định số hàng)\n"
            + "    int matrix3[][4] = {\n"
            + "        {1, 2, 3, 4},\n"
            + "        {5, 6, 7, 8},\n"
            + "        {9, 10, 11, 12}\n"
            + "    }; // Compiler tự tính số hàng là 3\n"
            + "    \n"
            + "    // 4. Khai báo và khởi tạo dạng phẳng\n"
            + "    float matrix4[2][2] = {1.1, 2.2, 3.3, 4.4};\n"
            + "    \n"
            + "    // Truy xuất và in các phần tử của mảng\n"
            + "    printf(\"Phần tử matrix2[1][2]: %d\\n\", matrix2[1][2]); // Output: 6\n"
            + "    \n"
            + "    // Duyệt và in toàn bộ mảng\n"
            + "    printf(\"Mảng matrix3:\\n\");\n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        for(int j = 0; j < 4; j++) {\n"
            + "            printf(\"%d \", matrix3[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "// Khai báo mảng 2 chiều 3 hàng 4 cột\n"
            + "int matrix[3][4]; \n"
            + "\n"
            + "// Khai báo và khởi tạo giá trị\n"
            + "int matrix2[2][3] = {\n"
            + "    {1, 2, 3},\n"
            + "    {4, 5, 6}\n"
            + "};",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int rows = 3, cols = 4;\n"
            + "    int **matrix = (int **)malloc(rows * sizeof(int *));\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        matrix[i] = (int *)malloc(cols * sizeof(int));\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ khi không dùng nữa\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        free(matrix[i]);\n"
            + "    }\n"
            + "    free(matrix);\n"
            + "    return 0;\n"
            + "}",
            "matrix[i][j]",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    \n"
            + "    // Truy cập phần tử hàng 1 cột 2\n"
            + "    printf(\"Phan tu [1][2]: %d\\n\", matrix[1][2]); // Output: 6\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử\n"
            + "    matrix[0][1] = 10;\n"
            + "    printf(\"Phan tu [0][1] sau khi thay doi: %d\\n\", matrix[0][1]); // Output: 10\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define ROWS 3\n"
            + "#define COLS 3\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[ROWS][COLS];\n"
            + "    \n"
            + "    // Nhập mảng\n"
            + "    printf(\"Nhap cac phan tu cua mang:\\n\");\n"
            + "    for (int i = 0; i < ROWS; i++) {\n"
            + "        for (int j = 0; j < COLS; j++) {\n"
            + "            printf(\"matrix[%d][%d] = \", i, j);\n"
            + "            scanf(\"%d\", &matrix[i][j]);\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    // Xuất mảng\n"
            + "    printf(\"\\nMang vua nhap:\\n\");\n"
            + "    for (int i = 0; i < ROWS; i++) {\n"
            + "        for (int j = 0; j < COLS; j++) {\n"
            + "            printf(\"%d\\t\", matrix[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int sum = 0;\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        sum += matrix[i][j];\n"
            + "    }\n"
            + "}\n"
            + "printf(\"Tong cac phan tu: %d\\n\", sum);",
            "int max = matrix[0][0];\n"
            + "int min = matrix[0][0];\n"
            + "\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        if (matrix[i][j] > max) {\n"
            + "            max = matrix[i][j];\n"
            + "        }\n"
            + "        if (matrix[i][j] < min) {\n"
            + "            min = matrix[i][j];\n"
            + "        }\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "printf(\"Phan tu lon nhat: %d\\n\", max);\n"
            + "printf(\"Phan tu nho nhat: %d\\n\", min);",
            "int diagonalSum = 0;\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    diagonalSum += matrix[i][i];\n"
            + "}\n"
            + "printf(\"Tong duong cheo chinh: %d\\n\", diagonalSum);",
            "int transpose[COLS][ROWS];\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        transpose[j][i] = matrix[i][j];\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// In ma trận chuyển vị\n"
            + "printf(\"Ma tran chuyen vi:\\n\");\n"
            + "for (int i = 0; i < COLS; i++) {\n"
            + "    for (int j = 0; j < ROWS; j++) {\n"
            + "        printf(\"%d\\t\", transpose[i][j]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define ROWS1 2\n"
            + "#define COLS1 3\n"
            + "#define ROWS2 3\n"
            + "#define COLS2 2\n"
            + "\n"
            + "int main() {\n"
            + "    int mat1[ROWS1][COLS1] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    int mat2[ROWS2][COLS2] = {{7, 8}, {9, 10}, {11, 12}};\n"
            + "    int result[ROWS1][COLS2] = {0};\n"
            + "    \n"
            + "    // Kiểm tra điều kiện nhân ma trận\n"
            + "    if (COLS1 != ROWS2) {\n"
            + "        printf(\"Khong the nhan hai ma tran nay!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Thực hiện phép nhân\n"
            + "    for (int i = 0; i < ROWS1; i++) {\n"
            + "        for (int j = 0; j < COLS2; j++) {\n"
            + "            for (int k = 0; k < COLS1; k++) {\n"
            + "                result[i][j] += mat1[i][k] * mat2[k][j];\n"
            + "            }\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    // In kết quả\n"
            + "    printf(\"Ket qua nhan ma tran:\\n\");\n"
            + "    for (int i = 0; i < ROWS1; i++) {\n"
            + "        for (int j = 0; j < COLS2; j++) {\n"
            + "            printf(\"%d\\t\", result[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "void printMatrix(int mat[][3], int rows) {\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        for (int j = 0; j < 3; j++) {\n"
            + "            printf(\"%d\\t\", mat[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    printMatrix(matrix, 2);\n"
            + "    return 0;\n"
            + "}",
            "void printDynamicMatrix(int **mat, int rows, int cols) {\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        for (int j = 0; j < cols; j++) {\n"
            + "            printf(\"%d\\t\", mat[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int rows = 2, cols = 3;\n"
            + "    int **matrix = (int **)malloc(rows * sizeof(int *));\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        matrix[i] = (int *)malloc(cols * sizeof(int));\n"
            + "        for (int j = 0; j < cols; j++) {\n"
            + "            matrix[i][j] = i * cols + j + 1;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    printDynamicMatrix(matrix, rows, cols);\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        free(matrix[i]);\n"
            + "    }\n"
            + "    free(matrix);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo chuỗi", new String[]{
            "char str1[10] = \"Hello\";  // Khai báo mảng 10 phần tử, khởi tạo với \"Hello\"",
            "char str2[] = \"World\";  // Kích thước tự động xác định (6 phần tử)",
            "char *str3 = \"Programming\";  // Con trỏ trỏ tới chuỗi hằng",
            "char str4[20];  // Khai báo mảng 20 ký tự chưa khởi tạo",
            "char days[7][10] = {\"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"};",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo mảng ký tự\n"
            + "    char str1[10] = \"Hello\";\n"
            + "    printf(\"str1: %s, Length: %lu\\n\", str1, strlen(str1));\n"
            + "    \n"
            + "    // 2. Khai báo không chỉ định kích thước\n"
            + "    char str2[] = \"World\";\n"
            + "    printf(\"str2: %s, Size of array: %lu\\n\", str2, sizeof(str2));\n"
            + "    \n"
            + "    // 3. Khai báo con trỏ ký tự\n"
            + "    char *str3 = \"Programming\";\n"
            + "    printf(\"str3: %s, First character: %c\\n\", str3, *str3);\n"
            + "    \n"
            + "    // 4. Khai báo không khởi tạo\n"
            + "    char str4[20];\n"
            + "    strcpy(str4, \"C Language\");\n"
            + "    printf(\"str4: %s\\n\", str4);\n"
            + "    \n"
            + "    // 5. Khai báo nhiều chuỗi\n"
            + "    char days[7][10] = {\n"
            + "        \"Monday\", \"Tuesday\", \"Wednesday\", \n"
            + "        \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"\n"
            + "    };\n"
            + "    \n"
            + "    printf(\"\\nDays of week:\\n\");\n"
            + "    for(int i = 0; i < 7; i++) {\n"
            + "        printf(\"%d. %s\\n\", i+1, days[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "str1: Hello, Length: 5\n"
            + "str2: World, Size of array: 6\n"
            + "str3: Programming, First character: P\n"
            + "str4: C Language\n"
            + "\n"
            + "Days of week:\n"
            + "1. Monday\n"
            + "2. Tuesday\n"
            + "3. Wednesday\n"
            + "4. Thursday\n"
            + "5. Friday\n"
            + "6. Saturday\n"
            + "7. Sunday"
        });

        Code_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    printf(\"Độ dài chuỗi: %lu\\n\", strlen(str)); // 11\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char src[] = \"Hello\";\n"
            + "    char dest[20];\n"
            + "    \n"
            + "    strcpy(dest, src);\n"
            + "    printf(\"Chuỗi đích: %s\\n\", dest); // Hello\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[] = \" World\";\n"
            + "    \n"
            + "    strcat(str1, str2);\n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", str1); // Hello World\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"apple\";\n"
            + "    char str2[] = \"banana\";\n"
            + "    \n"
            + "    int result = strcmp(str1, str2);\n"
            + "    if (result < 0) printf(\"'%s' nhỏ hơn '%s'\\n\", str1, str2);\n"
            + "    else if (result > 0) printf(\"'%s' lớn hơn '%s'\\n\", str1, str2);\n"
            + "    else printf(\"Hai chuỗi bằng nhau\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"apple\";\n"
            + "    char str2[] = \"appetizer\";\n"
            + "    \n"
            + "    int result = strncmp(str1, str2, 3);\n"
            + "    if (result == 0) printf(\"3 ký tự đầu giống nhau\\n\");\n"
            + "    else printf(\"3 ký tự đầu khác nhau\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    char *ptr = strchr(str, 'o');\n"
            + "    \n"
            + "    if (ptr != NULL)\n"
            + "        printf(\"Tìm thấy 'o' tại vị trí: %ld\\n\", ptr - str); // 4\n"
            + "    else\n"
            + "        printf(\"Không tìm thấy\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    char *ptr = strstr(str, \"World\");\n"
            + "    \n"
            + "    if (ptr != NULL)\n"
            + "        printf(\"Tìm thấy 'World' tại vị trí: %ld\\n\", ptr - str); // 6\n"
            + "    else\n"
            + "        printf(\"Không tìm thấy\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello,World,C,Programming\";\n"
            + "    char *token = strtok(str, \",\");\n"
            + "    \n"
            + "    while (token != NULL) {\n"
            + "        printf(\"%s\\n\", token);\n"
            + "        token = strtok(NULL, \",\");\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello\";\n"
            + "    printf(\"Chuỗi đảo ngược: %s\\n\", strrev(str)); // olleH\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    \n"
            + "    printf(\"Chuỗi chữ thường: %s\\n\", strlwr(str)); // hello world\n"
            + "    printf(\"Chuỗi chữ hoa: %s\\n\", strupr(str)); // HELLO WORLD\n"
            + "    return 0;\n"
            + "}",
            "#define __STDC_WANT_LIB_EXT1__ 1\n"
            + "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char src[] = \"Safe copy\";\n"
            + "    char dest[20];\n"
            + "    \n"
            + "    if (strcpy_s(dest, sizeof(dest), src) == 0)\n"
            + "        printf(\"Sao chép thành công: %s\\n\", dest);\n"
            + "    else\n"
            + "        printf(\"Lỗi sao chép\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#define __STDC_WANT_LIB_EXT1__ 1\n"
            + "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[] = \" World\";\n"
            + "    \n"
            + "    if (strcat_s(str1, sizeof(str1), str2) == 0)\n"
            + "        printf(\"Nối thành công: %s\\n\", str1);\n"
            + "    else\n"
            + "        printf(\"Lỗi nối chuỗi\\n\");\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("So sánh và nối chuỗi", new String[]{
            "int strcmp(const char *str1, const char *str2);",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"Hello\";\n"
            + "    char str2[] = \"World\";\n"
            + "    char str3[] = \"Hello\";\n"
            + "    \n"
            + "    // So sánh str1 và str2\n"
            + "    int result = strcmp(str1, str2);\n"
            + "    if (result == 0) {\n"
            + "        printf(\"str1 và str2 giống nhau\\n\");\n"
            + "    } else if (result < 0) {\n"
            + "        printf(\"str1 nhỏ hơn str2\\n\");\n"
            + "    } else {\n"
            + "        printf(\"str1 lớn hơn str2\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // So sánh str1 và str3\n"
            + "    result = strcmp(str1, str3);\n"
            + "    if (result == 0) {\n"
            + "        printf(\"str1 và str3 giống nhau\\n\");\n"
            + "    } else {\n"
            + "        printf(\"str1 và str3 khác nhau\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "char *strcat(char *dest, const char *src);",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char dest[50] = \"Xin chào \";\n"
            + "    char src[] = \"thế giới!\";\n"
            + "    \n"
            + "    // Nối chuỗi src vào dest\n"
            + "    strcat(dest, src);\n"
            + "    \n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", dest);\n"
            + "    \n"
            + "    // Nối thêm một chuỗi nữa\n"
            + "    strcat(dest, \" Chào mừng bạn đến với C.\");\n"
            + "    printf(\"Chuỗi sau khi nối lần 2: %s\\n\", dest);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char s1[20] = \"Hello\";\n"
            + "    char s2[] = \"Hello World\";\n"
            + "    char s3[50];\n"
            + "    \n"
            + "    // So sánh 5 ký tự đầu\n"
            + "    if (strncmp(s1, s2, 5) == 0) {\n"
            + "        printf(\"5 ký tự đầu giống nhau\\n\");\n"
            + "    } else {\n"
            + "        printf(\"5 ký tự đầu khác nhau\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Nối 3 ký tự đầu của s2 vào s1\n"
            + "    strncat(s1, s2, 3);\n"
            + "    printf(\"s1 sau khi nối: %s\\n\", s1);\n"
            + "    \n"
            + "    // Sao chép chuỗi\n"
            + "    strcpy(s3, s1);\n"
            + "    printf(\"s3 sau khi sao chép: %s\\n\", s3);\n"
            + "    \n"
            + "    // Độ dài chuỗi\n"
            + "    printf(\"Độ dài s3: %lu\\n\", strlen(s3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khái niệm về con trỏ", new String[]{
            "int var = 10;    // Biến bình thường\n"
            + "int *ptr = &var; // Con trỏ ptr lưu địa chỉ của var",
            "kiểu_dữ_liệu *tên_con_trỏ;",
            "int *intPtr;    // Con trỏ đến kiểu int\n"
            + "float *floatPtr; // Con trỏ đến kiểu float\n"
            + "char *charPtr;  // Con trỏ đến kiểu char",
            "int num = 5;\n"
            + "int *ptr = &num; // ptr lưu địa chỉ của num\n"
            + "\n"
            + "printf(\"Địa chỉ của num: %p\\n\", &num);\n"
            + "printf(\"Giá trị của ptr: %p\\n\", ptr);\n"
            + "printf(\"Giá trị tại địa chỉ ptr trỏ đến: %d\\n\", *ptr);",
            "int arr[5] = {1, 2, 3, 4, 5};\n"
            + "int *ptr = arr; // ptr trỏ đến phần tử đầu tiên của mảng\n"
            + "\n"
            + "for(int i = 0; i < 5; i++) {\n"
            + "    printf(\"arr[%d] = %d\\n\", i, *(ptr + i));\n"
            + "}",
            "void tangGiaTri(int *n) {\n"
            + "    (*n)++;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10;\n"
            + "    printf(\"Trước: %d\\n\", a); // 10\n"
            + "    tangGiaTri(&a);\n"
            + "    printf(\"Sau: %d\\n\", a);   // 11\n"
            + "    return 0;\n"
            + "}",
            "int value = 100;\n"
            + "int *ptr = &value;\n"
            + "int **ptrToPtr = &ptr;\n"
            + "\n"
            + "printf(\"Giá trị value: %d\\n\", value);\n"
            + "printf(\"Giá trị qua ptr: %d\\n\", *ptr);\n"
            + "printf(\"Giá trị qua ptrToPtr: %d\\n\", **ptrToPtr);",
            "int *ptr = NULL;\n"
            + "\n"
            + "if (ptr == NULL) {\n"
            + "    printf(\"Con trỏ không trỏ đến đâu cả\\n\");\n"
            + "} else {\n"
            + "    printf(\"Giá trị tại con trỏ: %d\\n\", *ptr);\n"
            + "}",
            "int cong(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "int tru(int a, int b) {\n"
            + "    return a - b;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int (*phepToan)(int, int); // Khai báo con trỏ hàm\n"
            + "    \n"
            + "    phepToan = cong;\n"
            + "    printf(\"5 + 3 = %d\\n\", phepToan(5, 3));\n"
            + "    \n"
            + "    phepToan = tru;\n"
            + "    printf(\"5 - 3 = %d\\n\", phepToan(5, 3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Không đủ bộ nhớ\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng mảng\n"
            + "    for(int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int num = 10;\n"
            + "float f = 3.14;\n"
            + "char c = 'A';\n"
            + "\n"
            + "void *ptr;\n"
            + "\n"
            + "ptr = &num;\n"
            + "printf(\"Giá trị int: %d\\n\", *(int*)ptr);\n"
            + "\n"
            + "ptr = &f;\n"
            + "printf(\"Giá trị float: %.2f\\n\", *(float*)ptr);\n"
            + "\n"
            + "ptr = &c;\n"
            + "printf(\"Giá trị char: %c\\n\", *(char*)ptr);"
        });

        Code_MAP.put("Khai báo con trỏ", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo biến thông thường\n"
            + "    int number = 10;\n"
            + "    float price = 25.5;\n"
            + "    char letter = 'A';\n"
            + "    \n"
            + "    // 2. Khai báo các con trỏ\n"
            + "    int *pNumber;    // Con trỏ tới số nguyên\n"
            + "    float *pPrice;   // Con trỏ tới số thực\n"
            + "    char *pLetter;   // Con trỏ tới ký tự\n"
            + "    \n"
            + "    // 3. Gán địa chỉ của biến cho con trỏ\n"
            + "    pNumber = &number;\n"
            + "    pPrice = &price;\n"
            + "    pLetter = &letter;\n"
            + "    \n"
            + "    // 4. In giá trị và địa chỉ\n"
            + "    printf(\"Giá trị của number: %d\\n\", number);\n"
            + "    printf(\"Địa chỉ của number: %p\\n\", (void*)&number);\n"
            + "    printf(\"Giá trị pNumber trỏ tới: %d\\n\", *pNumber);\n"
            + "    printf(\"Địa chỉ lưu trong pNumber: %p\\n\", (void*)pNumber);\n"
            + "    \n"
            + "    printf(\"\\nGiá trị của price: %.2f\\n\", price);\n"
            + "    printf(\"Địa chỉ của price: %p\\n\", (void*)&price);\n"
            + "    printf(\"Giá trị pPrice trỏ tới: %.2f\\n\", *pPrice);\n"
            + "    printf(\"Địa chỉ lưu trong pPrice: %p\\n\", (void*)pPrice);\n"
            + "    \n"
            + "    printf(\"\\nGiá trị của letter: %c\\n\", letter);\n"
            + "    printf(\"Địa chỉ của letter: %p\\n\", (void*)&letter);\n"
            + "    printf(\"Giá trị pLetter trỏ tới: %c\\n\", *pLetter);\n"
            + "    printf(\"Địa chỉ lưu trong pLetter: %p\\n\", (void*)pLetter);\n"
            + "    \n"
            + "    // 5. Thay đổi giá trị thông qua con trỏ\n"
            + "    *pNumber = 20;\n"
            + "    *pPrice = 30.75;\n"
            + "    *pLetter = 'B';\n"
            + "    \n"
            + "    printf(\"\\nSau khi thay đổi qua con trỏ:\\n\");\n"
            + "    printf(\"number = %d, price = %.2f, letter = %c\\n\", number, price, letter);\n"
            + "    \n"
            + "    // 6. Con trỏ NULL\n"
            + "    int *pNull = NULL; // Con trỏ không trỏ tới đâu\n"
            + "    if (pNull == NULL) {\n"
            + "        printf(\"\\nCon trỏ pNull là NULL, không trỏ tới địa chỉ hợp lệ\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Toán tử con trỏ", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 10;\n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ của var: %p\\n\", (void*)&var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr = &var;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ lưu trong ptr: %p\\n\", (void*)ptr);\n"
            + "    printf(\"Giá trị tại địa chỉ ptr trỏ tới: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 5, b = 10;\n"
            + "    int *ptr1, *ptr2;\n"
            + "    \n"
            + "    ptr1 = &a;  // ptr1 trỏ tới a\n"
            + "    ptr2 = &b;  // ptr2 trỏ tới b\n"
            + "    \n"
            + "    printf(\"Giá trị tại ptr1: %d\\n\", *ptr1);\n"
            + "    printf(\"Giá trị tại ptr2: %d\\n\", *ptr2);\n"
            + "    \n"
            + "    ptr2 = ptr1;  // ptr2 giờ cũng trỏ tới a\n"
            + "    printf(\"Giá trị tại ptr2 sau khi gán: %d\\n\", *ptr2);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    int *ptr = arr;  // ptr trỏ tới phần tử đầu tiên\n"
            + "    \n"
            + "    printf(\"Phần tử đầu tiên: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr++;  // Di chuyển tới phần tử tiếp theo\n"
            + "    printf(\"Phần tử thứ hai: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr += 2;  // Nhảy qua 2 phần tử\n"
            + "    printf(\"Phần tử thứ tư: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr--;  // Lùi lại 1 phần tử\n"
            + "    printf(\"Phần tử thứ ba: %d\\n\", *ptr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    int *ptr1 = &arr[1];\n"
            + "    int *ptr2 = &arr[3];\n"
            + "    \n"
            + "    if (ptr1 < ptr2) {\n"
            + "        printf(\"ptr1 trỏ tới phần tử đứng trước ptr2 trong mảng\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    if (ptr1 != NULL) {\n"
            + "        printf(\"ptr1 không phải là con trỏ NULL\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // So sánh sau khi thay đổi\n"
            + "    ptr1 += 2;\n"
            + "    if (ptr1 == ptr2) {\n"
            + "        printf(\"ptr1 và ptr2 giờ trỏ tới cùng một phần tử\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 100;\n"
            + "    int *ptr = &var;\n"
            + "    int **pptr = &ptr;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Giá trị thông qua ptr: %d\\n\", *ptr);\n"
            + "    printf(\"Giá trị thông qua pptr: %d\\n\", **pptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ cấp 2\n"
            + "    **pptr = 200;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "typedef struct {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "} Employee;\n"
            + "\n"
            + "int main() {\n"
            + "    Employee emp = {1, \"Nguyen Van A\"};\n"
            + "    Employee *ptr = &emp;\n"
            + "    \n"
            + "    // Truy cập bằng toán tử arrow\n"
            + "    printf(\"ID: %d, Name: %s\\n\", ptr->id, ptr->name);\n"
            + "    \n"
            + "    // Tương đương với\n"
            + "    printf(\"ID: %d, Name: %s\\n\", (*ptr).id, (*ptr).name);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "return_type function_name(parameter1_type parameter1_name, parameter2_type parameter2_name, ...) {\n"
            + "    // Function body\n"
            + "    // Các câu lệnh thực thi\n"
            + "    [return value;] // Nếu có kiểu trả về khác void\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số nguyên\n"
            + "int sum(int a, int b) {          // int: kiểu trả về\n"
            + "                                 // sum: tên hàm\n"
            + "                                 // (int a, int b): tham số\n"
            + "    int result = a + b;          // Thân hàm\n"
            + "    return result;               // Trả về giá trị\n"
            + "}\n"
            + "\n"
            + "// Hàm không trả về giá trị, không tham số\n"
            + "void printHello() {              // void: không trả về giá trị\n"
            + "                                // printHello: tên hàm\n"
            + "                                // (): không có tham số\n"
            + "    printf(\"Hello World!\\n\");   // Thân hàm\n"
            + "                                // Không có return\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 3;\n"
            + "    int total = sum(x, y);      // Gọi hàm sum\n"
            + "    printf(\"Sum: %d\\n\", total);\n"
            + "    \n"
            + "    printHello();               // Gọi hàm printHello\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Gọi hàm", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số\n"
            + "int tinhTong(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "// Hàm không có tham số\n"
            + "void inThongBao() {\n"
            + "    printf(\"Xin chao ban!\\n\");\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Gọi hàm có trả về giá trị\n"
            + "    int ketQua = tinhTong(5, 3); // tinhTong là tên hàm, 5 và 3 là đối số\n"
            + "    printf(\"Tong la: %d\\n\", ketQua);\n"
            + "    \n"
            + "    // 2. Gọi hàm không có tham số\n"
            + "    inThongBao(); // inThongBao là tên hàm, không có đối số\n"
            + "    \n"
            + "    // 3. Gọi hàm và sử dụng kết quả trực tiếp\n"
            + "    printf(\"Tong cua 10 va 20 la: %d\\n\", tinhTong(10, 20));\n"
            + "    \n"
            + "    // 4. Gọi hàm từ thư viện chuẩn\n"
            + "    printf(\"Hien thi thong diep\\n\"); // printf là hàm từ thư viện stdio.h\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Hàm trả về giá trị", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số nguyên - trả về kiểu int\n"
            + "int tinhTong(int a, int b) {\n"
            + "    int tong = a + b;  // Thân hàm - tính toán giá trị\n"
            + "    return tong;       // Trả về giá trị tổng\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số chẵn - trả về kiểu int (0 hoặc 1)\n"
            + "int laSoChan(int num) {\n"
            + "    if(num % 2 == 0) {\n"
            + "        return 1;  // Là số chẵn - trả về 1\n"
            + "    }\n"
            + "    return 0;      // Không phải số chẵn - trả về 0\n"
            + "}\n"
            + "\n"
            + "// Hàm tìm số lớn nhất trong 3 số - trả về kiểu float\n"
            + "float timMax(float x, float y, float z) {\n"
            + "    float max = x;\n"
            + "    if(y > max) max = y;\n"
            + "    if(z > max) max = z;\n"
            + "    return max;  // Trả về giá trị lớn nhất\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Gọi hàm tinhTong\n"
            + "    int ketQua = tinhTong(5, 7);\n"
            + "    printf(\"Tong la: %d\\n\", ketQua);\n"
            + "    \n"
            + "    // Gọi hàm laSoChan\n"
            + "    int so = 10;\n"
            + "    if(laSoChan(so)) {\n"
            + "        printf(\"%d la so chan\\n\", so);\n"
            + "    } else {\n"
            + "        printf(\"%d khong phai so chan\\n\", so);\n"
            + "    }\n"
            + "    \n"
            + "    // Gọi hàm timMax\n"
            + "    float max = timMax(3.2, 5.4, 4.1);\n"
            + "    printf(\"So lon nhat la: %.2f\\n\", max);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truyền tham số theo giá trị", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi giá trị sử dụng truyền tham số theo giá trị\n"
            + "void swapByValue(int a, int b) {\n"
            + "    int temp = a;\n"
            + "    a = b;\n"
            + "    b = temp;\n"
            + "    printf(\"Trong hàm swapByValue: a = %d, b = %d\\n\", a, b);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Trước khi gọi hàm swapByValue: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    // Gọi hàm và truyền giá trị của x và y\n"
            + "    swapByValue(x, y);\n"
            + "    \n"
            + "    printf(\"Sau khi gọi hàm swapByValue: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "Trước khi gọi hàm swapByValue: x = 5, y = 10\n"
            + "Trong hàm swapByValue: a = 10, b = 5\n"
            + "Sau khi gọi hàm swapByValue: x = 5, y = 10"
        });

        Code_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "void tenHam(kieuDuLieu *tenThamSo) {\n"
            + "    // Thao tác với *tenThamSo để thay đổi giá trị gốc\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi sử dụng truyền tham chiếu (con trỏ)\n"
            + "void swap(int *a, int *b) {\n"
            + "    int temp = *a;\n"
            + "    *a = *b;\n"
            + "    *b = temp;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    swap(&x, &y); // Truyền địa chỉ của x và y\n"
            + "    printf(\"Sau khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "void tangGiaTri(int *n) {\n"
            + "    (*n)++; // Tăng giá trị tại địa chỉ n lên 1\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi goi ham: a = %d\\n\", a);\n"
            + "    tangGiaTri(&a); // Truyền địa chỉ của a\n"
            + "    printf(\"Sau khi goi ham: a = %d\\n\", a);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhân đôi các phần tử mảng (truyền mảng là truyền tham chiếu)\n"
            + "void nhanDoiMang(int arr[], int size) {\n"
            + "    for (int i = 0; i < size; i++) {\n"
            + "        arr[i] *= 2; // Thay đổi trực tiếp mảng gốc\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int mang[] = {1, 2, 3, 4, 5};\n"
            + "    int n = sizeof(mang) / sizeof(mang[0]);\n"
            + "    \n"
            + "    printf(\"Mang truoc khi thay doi: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", mang[i]);\n"
            + "    }\n"
            + "    \n"
            + "    nhanDoiMang(mang, n); // Mảng luôn được truyền theo tham chiếu\n"
            + "    \n"
            + "    printf(\"\\nMang sau khi thay doi: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", mang[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "// Khai báo hàm với tham số con trỏ\n"
            + "void tenHam(kieuDuLieu *tenConTro) {\n"
            + "    // Thao tác với giá trị tại địa chỉ con trỏ\n"
            + "    *tenConTro = giaTriMoi;\n"
            + "}\n"
            + "\n"
            + "// Gọi hàm và truyền địa chỉ\n"
            + "tenHam(&bienGoc);",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi giá trị sử dụng con trỏ\n"
            + "void swap(int *a, int *b) {\n"
            + "    int temp = *a;\n"
            + "    *a = *b;\n"
            + "    *b = temp;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    swap(&x, &y); // Truyền địa chỉ của x và y\n"
            + "    printf(\"Sau khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tăng giá trị lên 1\n"
            + "void increment(int *num) {\n"
            + "    (*num)++; // Tăng giá trị tại địa chỉ num lên 1\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int value = 5;\n"
            + "    \n"
            + "    printf(\"Truoc khi increment: %d\\n\", value);\n"
            + "    increment(&value);\n"
            + "    printf(\"Sau khi increment: %d\\n\", value);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhân đôi các phần tử mảng\n"
            + "void doubleArray(int *arr, int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        *(arr + i) *= 2; // arr[i] *= 2;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[] = {1, 2, 3, 4, 5};\n"
            + "    int size = sizeof(numbers)/sizeof(numbers[0]);\n"
            + "    \n"
            + "    printf(\"Mang truoc khi doi:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    doubleArray(numbers, size); // numbers là con trỏ đến phần tử đầu tiên\n"
            + "    \n"
            + "    printf(\"\\nMang sau khi doi:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm chỉ đọc giá trị, không thay đổi\n"
            + "void printValue(const int *ptr) {\n"
            + "    printf(\"Gia tri: %d\\n\", *ptr);\n"
            + "    // *ptr = 10; // Lỗi biên dịch vì ptr là const\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printValue(&num);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính giai thừa sử dụng đệ quy\n"
            + "unsigned long long factorial(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0 || n == 1)\n"
            + "        return 1;\n"
            + "    // Phần đệ quy\n"
            + "    else\n"
            + "        return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Giai thừa của %d là %llu\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính số Fibonacci sử dụng đệ quy\n"
            + "int fibonacci(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0)\n"
            + "        return 0;\n"
            + "    else if (n == 1)\n"
            + "        return 1;\n"
            + "    // Phần đệ quy (gọi đệ quy 2 lần)\n"
            + "    else\n"
            + "        return fibonacci(n - 1) + fibonacci(n - 2);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 6;\n"
            + "    printf(\"Số Fibonacci thứ %d là %d\\n\", n, fibonacci(n));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng sử dụng đệ quy đuôi\n"
            + "int sum(int n, int accumulator) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0)\n"
            + "        return accumulator;\n"
            + "    // Phần đệ quy (đệ quy đuôi)\n"
            + "    else\n"
            + "        return sum(n - 1, accumulator + n);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 100;\n"
            + "    printf(\"Tổng các số từ 1 đến %d là %d\\n\", num, sum(num, 0));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo nguyên mẫu hàm\n"
            + "int isOdd(int n);\n"
            + "\n"
            + "// Hàm kiểm tra số chẵn\n"
            + "int isEven(int n) {\n"
            + "    if (n == 0)\n"
            + "        return 1; // true\n"
            + "    else\n"
            + "        return isOdd(n - 1); // Gọi hàm khác\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số lẻ\n"
            + "int isOdd(int n) {\n"
            + "    if (n == 0)\n"
            + "        return 0; // false\n"
            + "    else\n"
            + "        return isEven(n - 1); // Gọi hàm khác\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 7;\n"
            + "    if (isEven(num))\n"
            + "        printf(\"%d là số chẵn\\n\", num);\n"
            + "    else\n"
            + "        printf(\"%d là số lẻ\\n\", num);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính giai thừa bằng đệ quy\n"
            + "int factorial(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0 || n == 1) {\n"
            + "        return 1;\n"
            + "    }\n"
            + "    // Phần đệ quy\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Giai thừa của %d là %d\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính số Fibonacci bằng đệ quy\n"
            + "int fibonacci(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0) return 0;\n"
            + "    if (n == 1) return 1;\n"
            + "    \n"
            + "    // Phần đệ quy\n"
            + "    return fibonacci(n - 1) + fibonacci(n - 2);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 10;\n"
            + "    printf(\"Số Fibonacci thứ %d là %d\\n\", n, fibonacci(n));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng từ 1 đến n bằng đệ quy đuôi\n"
            + "int sum(int n, int accumulator) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0) return accumulator;\n"
            + "    \n"
            + "    // Phần đệ quy đuôi\n"
            + "    return sum(n - 1, accumulator + n);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 100;\n"
            + "    printf(\"Tổng từ 1 đến %d là %d\\n\", num, sum(num, 0));\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm đệ quy tính giai thừa\n"
            + "unsigned long long factorial(int n) {\n"
            + "    // 1. Điều kiện dừng\n"
            + "    if (n == 0 || n == 1) {\n"
            + "        return 1;\n"
            + "    }\n"
            + "    // 2. Phần đệ quy\n"
            + "    else {\n"
            + "        return n * factorial(n - 1);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int number;\n"
            + "    printf(\"Nhập một số nguyên dương: \");\n"
            + "    scanf(\"%d\", &number);\n"
            + "    \n"
            + "    // Kiểm tra số nhập vào có hợp lệ không\n"
            + "    if (number < 0) {\n"
            + "        printf(\"Lỗi: Giai thừa chỉ tính được cho số nguyên dương.\\n\");\n"
            + "    } else {\n"
            + "        unsigned long long result = factorial(number);\n"
            + "        printf(\"Giai thừa của %d là %llu\\n\", number, result);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo mảng 5 phần tử kiểu int\n"
            + "    int numbers[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập và in các phần tử\n"
            + "    for(int i = 0; i < 5; i++) {\n"
            + "        printf(\"numbers[%d] = %d\\n\", i, numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử\n"
            + "    numbers[2] = 35;\n"
            + "    printf(\"\\nAfter modification:\\n\");\n"
            + "    printf(\"numbers[2] = %d\\n\", numbers[2]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo chuỗi\n"
            + "    char greeting1[] = \"Hello\"; // Tự động thêm '\\0'\n"
            + "    char greeting2[6] = {'H', 'e', 'l', 'l', 'o', '\\0'};\n"
            + "    \n"
            + "    printf(\"greeting1: %s\\n\", greeting1);\n"
            + "    printf(\"greeting2: %s\\n\", greeting2);\n"
            + "    \n"
            + "    // Sử dụng hàm thư viện string.h\n"
            + "    printf(\"Length of greeting1: %lu\\n\", strlen(greeting1));\n"
            + "    \n"
            + "    // Nối chuỗi\n"
            + "    strcat(greeting1, \" World!\");\n"
            + "    printf(\"After concatenation: %s\\n\", greeting1);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Định nghĩa struct\n"
            + "struct Student {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo biến struct\n"
            + "    struct Student student1;\n"
            + "    \n"
            + "    // Gán giá trị\n"
            + "    student1.id = 101;\n"
            + "    strcpy(student1.name, \"Nguyen Van A\");\n"
            + "    student1.gpa = 3.75;\n"
            + "    \n"
            + "    // Khai báo và khởi tạo cùng lúc\n"
            + "    struct Student student2 = {102, \"Tran Thi B\", 3.9};\n"
            + "    \n"
            + "    // Truy cập thành viên\n"
            + "    printf(\"Student 1:\\n\");\n"
            + "    printf(\"ID: %d\\nName: %s\\nGPA: %.2f\\n\", \n"
            + "           student1.id, student1.name, student1.gpa);\n"
            + "    \n"
            + "    printf(\"\\nStudent 2:\\n\");\n"
            + "    printf(\"ID: %d\\nName: %s\\nGPA: %.2f\\n\", \n"
            + "           student2.id, student2.name, student2.gpa);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "union Data {\n"
            + "    int i;\n"
            + "    float f;\n"
            + "    char str[20];\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    union Data data;\n"
            + "    \n"
            + "    data.i = 10;\n"
            + "    printf(\"data.i: %d\\n\", data.i);\n"
            + "    \n"
            + "    data.f = 3.14;\n"
            + "    printf(\"data.f: %.2f\\n\", data.f);\n"
            + "    \n"
            + "    strcpy(data.str, \"C Programming\");\n"
            + "    printf(\"data.str: %s\\n\", data.str);\n"
            + "    \n"
            + "    // Kích thước union\n"
            + "    printf(\"Size of union Data: %lu bytes\\n\", sizeof(union Data));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Định nghĩa enum\n"
            + "enum Days {\n"
            + "    Sunday,    // 0\n"
            + "    Monday,    // 1\n"
            + "    Tuesday,   // 2\n"
            + "    Wednesday, // 3\n"
            + "    Thursday,  // 4\n"
            + "    Friday,    // 5\n"
            + "    Saturday   // 6\n"
            + "};\n"
            + "\n"
            + "enum Status {\n"
            + "    Active = 1,\n"
            + "    Inactive = 0,\n"
            + "    Pending = 2\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    enum Days today = Wednesday;\n"
            + "    printf(\"Today is %d (Wednesday)\\n\", today);\n"
            + "    \n"
            + "    enum Status userStatus = Active;\n"
            + "    printf(\"User status: %d\\n\", userStatus);\n"
            + "    \n"
            + "    // Duyệt qua các giá trị enum\n"
            + "    for(int day = Sunday; day <= Saturday; day++) {\n"
            + "        printf(\"Day %d\\n\", day);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr;  // Khai báo con trỏ\n"
            + "    \n"
            + "    ptr = &var; // Lưu địa chỉ của var vào ptr\n"
            + "    \n"
            + "    printf(\"Address of var: %p\\n\", &var);\n"
            + "    printf(\"Value stored in ptr: %p\\n\", ptr);\n"
            + "    printf(\"Value pointed by ptr: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"New value of var: %d\\n\", var);\n"
            + "    \n"
            + "    // Con trỏ và mảng\n"
            + "    int arr[3] = {10, 20, 30};\n"
            + "    int *arrPtr = arr; // arrPtr trỏ đến phần tử đầu tiên\n"
            + "    \n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, *(arrPtr + i));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Định nghĩa node\n"
            + "struct Node {\n"
            + "    int data;\n"
            + "    struct Node* next;\n"
            + "};\n"
            + "\n"
            + "// Hàm thêm node vào đầu danh sách\n"
            + "void push(struct Node** head_ref, int new_data) {\n"
            + "    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    new_node->data = new_data;\n"
            + "    new_node->next = (*head_ref);\n"
            + "    (*head_ref) = new_node;\n"
            + "}\n"
            + "\n"
            + "// Hàm in danh sách\n"
            + "void printList(struct Node* node) {\n"
            + "    while (node != NULL) {\n"
            + "        printf(\"%d \", node->data);\n"
            + "        node = node->next;\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Node* head = NULL;\n"
            + "    \n"
            + "    push(&head, 3);\n"
            + "    push(&head, 2);\n"
            + "    push(&head, 1);\n"
            + "    \n"
            + "    printf(\"Linked list: \");\n"
            + "    printList(head);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("File I/O trong C", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "FILE *fptr;\n"
            + "fptr = fopen(\"file.txt\", \"w\");\n"
            + "if (fptr == NULL) {\n"
            + "    printf(\"Khong the mo file.\\n\");\n"
            + "    exit(1);\n"
            + "}",
            "int fclose(FILE *stream);",
            "fclose(fptr);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    fptr = fopen(\"example.txt\", \"w\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fprintf(fptr, \"Xin chao the gioi!\\n\");\n"
            + "    fputs(\"Day la dong thu hai.\\n\", fptr);\n"
            + "    fputc('A', fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    char buffer[255];\n"
            + "    \n"
            + "    fptr = fopen(\"example.txt\", \"r\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    // Đọc từng dòng\n"
            + "    while (fgets(buffer, 255, fptr) != NULL) {\n"
            + "        printf(\"%s\", buffer);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    struct Student s1 = {\"Nguyen Van A\", 20, 3.5};\n"
            + "    \n"
            + "    fptr = fopen(\"student.dat\", \"wb\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fwrite(&s1, sizeof(struct Student), 1, fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    struct Student s;\n"
            + "    \n"
            + "    fptr = fopen(\"student.dat\", \"rb\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fread(&s, sizeof(struct Student), 1, fptr);\n"
            + "    \n"
            + "    printf(\"Ten: %s\\nTuoi: %d\\nGPA: %.2f\\n\", s.name, s.age, s.gpa);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    fptr = fopen(\"example.txt\", \"r+\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    // Di chuyển đến byte thứ 10\n"
            + "    fseek(fptr, 10, SEEK_SET);\n"
            + "    \n"
            + "    // Lấy vị trí hiện tại\n"
            + "    long pos = ftell(fptr);\n"
            + "    printf(\"Vi tri hien tai: %ld\\n\", pos);\n"
            + "    \n"
            + "    // Quay về đầu file\n"
            + "    rewind(fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    int c;\n"
            + "    \n"
            + "    fptr = fopen(\"example.txt\", \"r\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi khi mo file\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    while ((c = fgetc(fptr)) != EOF) {\n"
            + "        putchar(c);\n"
            + "    }\n"
            + "    \n"
            + "    if (feof(fptr)) {\n"
            + "        printf(\"\\nDa den cuoi file.\\n\");\n"
            + "    } else if (ferror(fptr)) {\n"
            + "        printf(\"\\nCo loi khi doc file.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "typedef struct {\n"
            + "    char id[10];\n"
            + "    char name[50];\n"
            + "    float score;\n"
            + "} Student;\n"
            + "\n"
            + "void addStudent() {\n"
            + "    FILE *fptr = fopen(\"students.dat\", \"ab\");\n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi mo file\");\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    Student s;\n"
            + "    printf(\"Nhap ma SV: \"); scanf(\"%s\", s.id);\n"
            + "    printf(\"Nhap ten SV: \"); scanf(\" %[^\\n]\", s.name);\n"
            + "    printf(\"Nhap diem: \"); scanf(\"%f\", &s.score);\n"
            + "    \n"
            + "    fwrite(&s, sizeof(Student), 1, fptr);\n"
            + "    fclose(fptr);\n"
            + "}\n"
            + "\n"
            + "void displayStudents() {\n"
            + "    FILE *fptr = fopen(\"students.dat\", \"rb\");\n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi mo file\");\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    Student s;\n"
            + "    printf(\"\\n%-10s %-20s %-10s\\n\", \"Ma SV\", \"Ten SV\", \"Diem\");\n"
            + "    printf(\"----------------------------------------\\n\");\n"
            + "    \n"
            + "    while (fread(&s, sizeof(Student), 1, fptr) == 1) {\n"
            + "        printf(\"%-10s %-20s %-10.2f\\n\", s.id, s.name, s.score);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int choice;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"\\n1. Them sinh vien\");\n"
            + "        printf(\"\\n2. Hien thi danh sach\");\n"
            + "        printf(\"\\n0. Thoat\");\n"
            + "        printf(\"\\nLua chon cua ban: \");\n"
            + "        scanf(\"%d\", &choice);\n"
            + "        \n"
            + "        switch(choice) {\n"
            + "            case 1:\n"
            + "                addStudent();\n"
            + "                break;\n"
            + "            case 2:\n"
            + "                displayStudents();\n"
            + "                break;\n"
            + "            case 0:\n"
            + "                printf(\"Thoat chuong trinh.\\n\");\n"
            + "                break;\n"
            + "            default:\n"
            + "                printf(\"Lua chon khong hop le.\\n\");\n"
            + "        }\n"
            + "    } while (choice != 0);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các hàm file I/O", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "FILE *file = fopen(\"example.txt\", \"w\");\n"
            + "if (file == NULL) {\n"
            + "    printf(\"Không thể mở file\\n\");\n"
            + "    return 1;\n"
            + "}",
            "int fclose(FILE *stream);",
            "fclose(file);",
            "int fprintf(FILE *stream, const char *format, ...);",
            "fprintf(file, \"Hello, World!\\n\");\n"
            + "fprintf(file, \"Giá trị: %d\\n\", 42);",
            "int fputs(const char *str, FILE *stream);",
            "fputs(\"This is a string.\\n\", file);",
            "int fputc(int char, FILE *stream);",
            "fputc('A', file);",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "int data[5] = {1, 2, 3, 4, 5};\n"
            + "fwrite(data, sizeof(int), 5, file);",
            "int fscanf(FILE *stream, const char *format, ...);",
            "int num;\n"
            + "fscanf(file, \"%d\", &num);",
            "char *fgets(char *str, int n, FILE *stream);",
            "char buffer[100];\n"
            + "fgets(buffer, 100, file);",
            "int fgetc(FILE *stream);",
            "char c = fgetc(file);",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "int data[5];\n"
            + "fread(data, sizeof(int), 5, file);",
            "int feof(FILE *stream);",
            "while (!feof(file)) {\n"
            + "    // Đọc dữ liệu\n"
            + "}",
            "int ferror(FILE *stream);",
            "if (ferror(file)) {\n"
            + "    printf(\"Lỗi khi đọc file\\n\");\n"
            + "}",
            "int fseek(FILE *stream, long int offset, int whence);",
            "fseek(file, 0, SEEK_SET); // Di chuyển về đầu file",
            "long int ftell(FILE *stream);",
            "long pos = ftell(file);",
            "void rewind(FILE *stream);",
            "rewind(file);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Ghi file\n"
            + "    FILE *file = fopen(\"example.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để ghi\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    fprintf(file, \"Đây là dòng đầu tiên\\n\");\n"
            + "    fputs(\"Đây là dòng thứ hai\\n\", file);\n"
            + "    fputc('A', file);\n"
            + "    fputc('\\n', file);\n"
            + "    \n"
            + "    int data[5] = {1, 2, 3, 4, 5};\n"
            + "    fwrite(data, sizeof(int), 5, file);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc file\n"
            + "    file = fopen(\"example.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để đọc\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    char buffer[100];\n"
            + "    printf(\"Nội dung file:\\n\");\n"
            + "    \n"
            + "    // Đọc từng dòng\n"
            + "    while (fgets(buffer, 100, file) != NULL) {\n"
            + "        printf(\"%s\", buffer);\n"
            + "    }\n"
            + "    \n"
            + "    // Kiểm tra lỗi\n"
            + "    if (ferror(file)) {\n"
            + "        printf(\"Lỗi khi đọc file\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Kiểm tra cuối file\n"
            + "    if (feof(file)) {\n"
            + "        printf(\"\\nĐã đọc hết file\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khái niệm về struct", new String[]{
            "struct ten_struct {\n"
            + "    kieu_du_lieu member1;\n"
            + "    kieu_du_lieu member2;\n"
            + "    // ...\n"
            + "};",
            "struct SinhVien {\n"
            + "    char hoTen[50];\n"
            + "    int tuoi;\n"
            + "    float diemTB;\n"
            + "};",
            "struct SinhVien sv1, sv2;",
            "struct SinhVien sv1 = {\"Nguyen Van A\", 20, 8.5};",
            "strcpy(sv1.hoTen, \"Tran Thi B\");\n"
            + "sv1.tuoi = 21;\n"
            + "sv1.diemTB = 7.8;",
            "struct Diem {\n"
            + "    float toan;\n"
            + "    float van;\n"
            + "};\n"
            + "\n"
            + "struct HocSinh {\n"
            + "    char ten[50];\n"
            + "    struct Diem diem;\n"
            + "};",
            "struct SinhVien *ptr = &sv1;\n"
            + "printf(\"Ten: %s\\n\", ptr->hoTen);",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Khai báo struct\n"
            + "struct SinhVien {\n"
            + "    char hoTen[50];\n"
            + "    int tuoi;\n"
            + "    float diemTB;\n"
            + "};\n"
            + "\n"
            + "// Struct lồng nhau\n"
            + "struct Diem {\n"
            + "    float toan;\n"
            + "    float van;\n"
            + "};\n"
            + "\n"
            + "struct HocSinh {\n"
            + "    char ten[50];\n"
            + "    struct Diem diem;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Khởi tạo struct\n"
            + "    struct SinhVien sv1 = {\"Nguyen Van A\", 20, 8.5};\n"
            + "    \n"
            + "    // Định nghĩa biến struct\n"
            + "    struct SinhVien sv2;\n"
            + "    strcpy(sv2.hoTen, \"Tran Thi B\");\n"
            + "    sv2.tuoi = 21;\n"
            + "    sv2.diemTB = 7.8;\n"
            + "    \n"
            + "    // Truy cập thành viên struct\n"
            + "    printf(\"Thong tin sinh vien 1:\\n\");\n"
            + "    printf(\"Ho ten: %s\\n\", sv1.hoTen);\n"
            + "    printf(\"Tuoi: %d\\n\", sv1.tuoi);\n"
            + "    printf(\"Diem TB: %.2f\\n\\n\", sv1.diemTB);\n"
            + "    \n"
            + "    // Sử dụng con trỏ struct\n"
            + "    struct SinhVien *ptr = &sv2;\n"
            + "    printf(\"Thong tin sinh vien 2:\\n\");\n"
            + "    printf(\"Ho ten: %s\\n\", ptr->hoTen);\n"
            + "    printf(\"Tuoi: %d\\n\", ptr->tuoi);\n"
            + "    printf(\"Diem TB: %.2f\\n\\n\", ptr->diemTB);\n"
            + "    \n"
            + "    // Struct lồng nhau\n"
            + "    struct HocSinh hs1 = {\"Le Van C\", {9.0, 8.5}};\n"
            + "    printf(\"Thong tin hoc sinh:\\n\");\n"
            + "    printf(\"Ten: %s\\n\", hs1.ten);\n"
            + "    printf(\"Diem toan: %.2f\\n\", hs1.diem.toan);\n"
            + "    printf(\"Diem van: %.2f\\n\", hs1.diem.van);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "Thong tin sinh vien 1:\n"
            + "Ho ten: Nguyen Van A\n"
            + "Tuoi: 20\n"
            + "Diem TB: 8.50\n"
            + "\n"
            + "Thong tin sinh vien 2:\n"
            + "Ho ten: Tran Thi B\n"
            + "Tuoi: 21\n"
            + "Diem TB: 7.80\n"
            + "\n"
            + "Thong tin hoc sinh:\n"
            + "Ten: Le Van C\n"
            + "Diem toan: 9.00\n"
            + "Diem van: 8.50"
        });

        Code_MAP.put("Khái niệm về union", new String[]{
            "union ten_union {\n"
            + "    kieu_du_lieu thanh_vien1;\n"
            + "    kieu_du_lieu thanh_vien2;\n"
            + "    // ...\n"
            + "};",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "union Data {\n"
            + "    int i;\n"
            + "    float f;\n"
            + "    char str[20];\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    union Data data;\n"
            + "    \n"
            + "    printf(\"Kich thuoc cua union Data: %lu bytes\\n\", sizeof(data));\n"
            + "    \n"
            + "    data.i = 10;\n"
            + "    printf(\"data.i = %d\\n\", data.i);\n"
            + "    \n"
            + "    data.f = 220.5;\n"
            + "    printf(\"data.f = %.2f\\n\", data.f);\n"
            + "    \n"
            + "    strcpy(data.str, \"Hello Union\");\n"
            + "    printf(\"data.str = %s\\n\", data.str);\n"
            + "    \n"
            + "    // Giá trị của các thành viên khác sau khi gán str\n"
            + "    printf(\"Sau khi gan str:\\n\");\n"
            + "    printf(\"data.i = %d (khong con dung)\\n\", data.i);\n"
            + "    printf(\"data.f = %.2f (khong con dung)\\n\", data.f);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Giả lập dữ liệu cảm biến có thể là nhiệt độ hoặc độ ẩm\n"
            + "union SensorData {\n"
            + "    int raw_value;\n"
            + "    float temperature;\n"
            + "    float humidity;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    union SensorData sensor;\n"
            + "    int sensor_type = 0; // 0: nhiệt độ, 1: độ ẩm\n"
            + "    \n"
            + "    // Giả lập đọc dữ liệu từ cảm biến\n"
            + "    sensor.raw_value = 0x42280000; // Giá trị hex tương ứng với 42.0f\n"
            + "    \n"
            + "    printf(\"Gia tri thô: %d (0x%08x)\\n\", sensor.raw_value, sensor.raw_value);\n"
            + "    \n"
            + "    // Xác định loại cảm biến\n"
            + "    sensor_type = 0; // Giả sử đây là cảm biến nhiệt độ\n"
            + "    \n"
            + "    if (sensor_type == 0) {\n"
            + "        printf(\"Nhiet do: %.1f°C\\n\", sensor.temperature);\n"
            + "    } else {\n"
            + "        printf(\"Do am: %.1f%%\\n\", sensor.humidity);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "typedef enum {\n"
            + "    INT,\n"
            + "    FLOAT,\n"
            + "    STRING\n"
            + "} DataType;\n"
            + "\n"
            + "struct Variant {\n"
            + "    DataType type;\n"
            + "    union {\n"
            + "        int i;\n"
            + "        float f;\n"
            + "        char str[20];\n"
            + "    } value;\n"
            + "};\n"
            + "\n"
            + "void printVariant(struct Variant var) {\n"
            + "    switch(var.type) {\n"
            + "        case INT:\n"
            + "            printf(\"Integer: %d\\n\", var.value.i);\n"
            + "            break;\n"
            + "        case FLOAT:\n"
            + "            printf(\"Float: %.2f\\n\", var.value.f);\n"
            + "            break;\n"
            + "        case STRING:\n"
            + "            printf(\"String: %s\\n\", var.value.str);\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Unknown type\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Variant v1, v2, v3;\n"
            + "    \n"
            + "    v1.type = INT;\n"
            + "    v1.value.i = 42;\n"
            + "    \n"
            + "    v2.type = FLOAT;\n"
            + "    v2.value.f = 3.14f;\n"
            + "    \n"
            + "    v3.type = STRING;\n"
            + "    strcpy(v3.value.str, \"Hello\");\n"
            + "    \n"
            + "    printVariant(v1);\n"
            + "    printVariant(v2);\n"
            + "    printVariant(v3);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Sự khác biệt giữa struct và union", new String[]{
            "struct ExampleStruct {\n"
            + "    int a;      // 4 bytes\n"
            + "    char b;     // 1 byte\n"
            + "    float c;    // 4 bytes\n"
            + "}; \n"
            + "// Tổng kích thước: 4 + 1 + 4 = 9 bytes (thực tế có thể lớn hơn do padding)",
            "union ExampleUnion {\n"
            + "    int a;      // 4 bytes\n"
            + "    char b;     // 1 byte\n"
            + "    float c;    // 4 bytes\n"
            + "};\n"
            + "// Kích thước: 4 bytes (bằng thành viên lớn nhất)",
            "struct Point {\n"
            + "    int x;\n"
            + "    int y;\n"
            + "};\n"
            + "\n"
            + "struct Point p;\n"
            + "p.x = 10;\n"
            + "p.y = 20;  // Cả x và y đều giữ giá trị",
            "union Data {\n"
            + "    int i;\n"
            + "    float f;\n"
            + "    char str[20];\n"
            + "};\n"
            + "\n"
            + "union Data data;\n"
            + "data.i = 10;        // Gán giá trị cho i\n"
            + "printf(\"%d\", data.i); // OK\n"
            + "\n"
            + "data.f = 220.5;     // Gán giá trị cho f\n"
            + "printf(\"%f\", data.f); // OK, nhưng data.i bây giờ không hợp lệ",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Định nghĩa struct\n"
            + "struct Employee {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "    float salary;\n"
            + "};\n"
            + "\n"
            + "// Định nghĩa union\n"
            + "union Value {\n"
            + "    int intValue;\n"
            + "    float floatValue;\n"
            + "    char stringValue[20];\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Ví dụ về struct:\\n\");\n"
            + "    struct Employee emp1;\n"
            + "    emp1.id = 101;\n"
            + "    strcpy(emp1.name, \"John Doe\");\n"
            + "    emp1.salary = 55000.50;\n"
            + "    \n"
            + "    printf(\"ID: %d\\n\", emp1.id);\n"
            + "    printf(\"Name: %s\\n\", emp1.name);\n"
            + "    printf(\"Salary: %.2f\\n\", emp1.salary);\n"
            + "    printf(\"Size of struct Employee: %lu bytes\\n\\n\", sizeof(emp1));\n"
            + "    \n"
            + "    printf(\"Ví dụ về union:\\n\");\n"
            + "    union Value val;\n"
            + "    \n"
            + "    val.intValue = 100;\n"
            + "    printf(\"Integer value: %d\\n\", val.intValue);\n"
            + "    \n"
            + "    val.floatValue = 3.14;\n"
            + "    printf(\"Float value: %.2f\\n\", val.floatValue);\n"
            + "    // Giá trị intValue bây giờ không hợp lệ\n"
            + "    \n"
            + "    strcpy(val.stringValue, \"Hello\");\n"
            + "    printf(\"String value: %s\\n\", val.stringValue);\n"
            + "    // Cả intValue và floatValue bây giờ đều không hợp lệ\n"
            + "    \n"
            + "    printf(\"Size of union Value: %lu bytes\\n\", sizeof(val));\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Danh sách liên kết", new String[]{
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Cấu trúc Node\n"
            + "struct Node {\n"
            + "    int data;\n"
            + "    struct Node* next;\n"
            + "};\n"
            + "\n"
            + "// Tạo node mới\n"
            + "struct Node* createNode(int data) {\n"
            + "    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    newNode->data = data;\n"
            + "    newNode->next = NULL;\n"
            + "    return newNode;\n"
            + "}\n"
            + "\n"
            + "// Thêm node vào đầu danh sách\n"
            + "void insertAtBeginning(struct Node** head, int data) {\n"
            + "    struct Node* newNode = createNode(data);\n"
            + "    newNode->next = *head;\n"
            + "    *head = newNode;\n"
            + "}\n"
            + "\n"
            + "// Thêm node vào cuối danh sách\n"
            + "void insertAtEnd(struct Node** head, int data) {\n"
            + "    struct Node* newNode = createNode(data);\n"
            + "    \n"
            + "    if (*head == NULL) {\n"
            + "        *head = newNode;\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    struct Node* last = *head;\n"
            + "    while (last->next != NULL) {\n"
            + "        last = last->next;\n"
            + "    }\n"
            + "    \n"
            + "    last->next = newNode;\n"
            + "}\n"
            + "\n"
            + "// Xóa node có giá trị xác định\n"
            + "void deleteNode(struct Node** head, int key) {\n"
            + "    struct Node *temp = *head, *prev;\n"
            + "    \n"
            + "    // Nếu node cần xóa là node đầu tiên\n"
            + "    if (temp != NULL && temp->data == key) {\n"
            + "        *head = temp->next;\n"
            + "        free(temp);\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    // Tìm node cần xóa\n"
            + "    while (temp != NULL && temp->data != key) {\n"
            + "        prev = temp;\n"
            + "        temp = temp->next;\n"
            + "    }\n"
            + "    \n"
            + "    // Nếu không tìm thấy\n"
            + "    if (temp == NULL) return;\n"
            + "    \n"
            + "    // Bỏ liên kết node khỏi danh sách\n"
            + "    prev->next = temp->next;\n"
            + "    free(temp);\n"
            + "}\n"
            + "\n"
            + "// Duyệt và in danh sách\n"
            + "void printList(struct Node* node) {\n"
            + "    while (node != NULL) {\n"
            + "        printf(\"%d \", node->data);\n"
            + "        node = node->next;\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "// Đếm số node trong danh sách\n"
            + "int countNodes(struct Node* head) {\n"
            + "    int count = 0;\n"
            + "    struct Node* current = head;\n"
            + "    while (current != NULL) {\n"
            + "        count++;\n"
            + "        current = current->next;\n"
            + "    }\n"
            + "    return count;\n"
            + "}\n"
            + "\n"
            + "// Hàm main để test\n"
            + "int main() {\n"
            + "    struct Node* head = NULL;\n"
            + "    \n"
            + "    // Thêm các node\n"
            + "    insertAtEnd(&head, 1);\n"
            + "    insertAtBeginning(&head, 2);\n"
            + "    insertAtEnd(&head, 3);\n"
            + "    insertAtBeginning(&head, 4);\n"
            + "    \n"
            + "    printf(\"Danh sách liên kết: \");\n"
            + "    printList(head);\n"
            + "    \n"
            + "    printf(\"Số node: %d\\n\", countNodes(head));\n"
            + "    \n"
            + "    // Xóa node\n"
            + "    deleteNode(&head, 2);\n"
            + "    printf(\"Danh sách sau khi xóa 2: \");\n"
            + "    printList(head);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Ngăn xếp", new String[]{
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "#define MAX_SIZE 100\n"
            + "\n"
            + "// Cấu trúc Stack\n"
            + "typedef struct {\n"
            + "    int data[MAX_SIZE];\n"
            + "    int top;\n"
            + "} Stack;\n"
            + "\n"
            + "// Khởi tạo stack rỗng\n"
            + "void initialize(Stack *s) {\n"
            + "    s->top = -1;\n"
            + "}\n"
            + "\n"
            + "// Kiểm tra stack rỗng\n"
            + "bool isEmpty(Stack *s) {\n"
            + "    return s->top == -1;\n"
            + "}\n"
            + "\n"
            + "// Kiểm tra stack đầy\n"
            + "bool isFull(Stack *s) {\n"
            + "    return s->top == MAX_SIZE - 1;\n"
            + "}\n"
            + "\n"
            + "// Thêm phần tử vào stack (push)\n"
            + "void push(Stack *s, int value) {\n"
            + "    if (isFull(s)) {\n"
            + "        printf(\"Stack day, khong the them phan tu.\\n\");\n"
            + "        return;\n"
            + "    }\n"
            + "    s->data[++s->top] = value;\n"
            + "}\n"
            + "\n"
            + "// Lấy phần tử ra khỏi stack (pop)\n"
            + "int pop(Stack *s) {\n"
            + "    if (isEmpty(s)) {\n"
            + "        printf(\"Stack rong, khong the lay phan tu.\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    return s->data[s->top--];\n"
            + "}\n"
            + "\n"
            + "// Xem phần tử trên cùng (peek)\n"
            + "int peek(Stack *s) {\n"
            + "    if (isEmpty(s)) {\n"
            + "        printf(\"Stack rong.\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    return s->data[s->top];\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    Stack s;\n"
            + "    initialize(&s);\n"
            + "    \n"
            + "    push(&s, 10);\n"
            + "    push(&s, 20);\n"
            + "    push(&s, 30);\n"
            + "    \n"
            + "    printf(\"Phan tu tren cung: %d\\n\", peek(&s));\n"
            + "    \n"
            + "    printf(\"Cac phan tu lay ra tu stack: \");\n"
            + "    while (!isEmpty(&s)) {\n"
            + "        printf(\"%d \", pop(&s));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "// Cấu trúc Node\n"
            + "typedef struct Node {\n"
            + "    int data;\n"
            + "    struct Node *next;\n"
            + "} Node;\n"
            + "\n"
            + "// Cấu trúc Stack\n"
            + "typedef struct {\n"
            + "    Node *top;\n"
            + "} Stack;\n"
            + "\n"
            + "// Khởi tạo stack rỗng\n"
            + "void initialize(Stack *s) {\n"
            + "    s->top = NULL;\n"
            + "}\n"
            + "\n"
            + "// Kiểm tra stack rỗng\n"
            + "bool isEmpty(Stack *s) {\n"
            + "    return s->top == NULL;\n"
            + "}\n"
            + "\n"
            + "// Thêm phần tử vào stack (push)\n"
            + "void push(Stack *s, int value) {\n"
            + "    Node *newNode = (Node*)malloc(sizeof(Node));\n"
            + "    if (newNode == NULL) {\n"
            + "        printf(\"Khong du bo nho.\\n\");\n"
            + "        return;\n"
            + "    }\n"
            + "    newNode->data = value;\n"
            + "    newNode->next = s->top;\n"
            + "    s->top = newNode;\n"
            + "}\n"
            + "\n"
            + "// Lấy phần tử ra khỏi stack (pop)\n"
            + "int pop(Stack *s) {\n"
            + "    if (isEmpty(s)) {\n"
            + "        printf(\"Stack rong, khong the lay phan tu.\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    Node *temp = s->top;\n"
            + "    int value = temp->data;\n"
            + "    s->top = s->top->next;\n"
            + "    free(temp);\n"
            + "    return value;\n"
            + "}\n"
            + "\n"
            + "// Xem phần tử trên cùng (peek)\n"
            + "int peek(Stack *s) {\n"
            + "    if (isEmpty(s)) {\n"
            + "        printf(\"Stack rong.\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    return s->top->data;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    Stack s;\n"
            + "    initialize(&s);\n"
            + "    \n"
            + "    push(&s, 100);\n"
            + "    push(&s, 200);\n"
            + "    push(&s, 300);\n"
            + "    \n"
            + "    printf(\"Phan tu tren cung: %d\\n\", peek(&s));\n"
            + "    \n"
            + "    printf(\"Cac phan tu lay ra tu stack: \");\n"
            + "    while (!isEmpty(&s)) {\n"
            + "        printf(\"%d \", pop(&s));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Hàng đợi", new String[]{
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "#define MAX_SIZE 5\n"
            + "\n"
            + "typedef struct {\n"
            + "    int items[MAX_SIZE];\n"
            + "    int front;\n"
            + "    int rear;\n"
            + "} Queue;\n"
            + "\n"
            + "// 1. Khởi tạo hàng đợi\n"
            + "void initQueue(Queue *q) {\n"
            + "    q->front = -1;\n"
            + "    q->rear = -1;\n"
            + "}\n"
            + "\n"
            + "// 2. Kiểm tra hàng đợi rỗng\n"
            + "bool isEmpty(Queue *q) {\n"
            + "    return (q->front == -1 && q->rear == -1);\n"
            + "}\n"
            + "\n"
            + "// 3. Kiểm tra hàng đợi đầy\n"
            + "bool isFull(Queue *q) {\n"
            + "    return (q->rear == MAX_SIZE - 1);\n"
            + "}\n"
            + "\n"
            + "// 4. Thêm phần tử vào hàng đợi\n"
            + "void enqueue(Queue *q, int value) {\n"
            + "    if (isFull(q)) {\n"
            + "        printf(\"Hang doi day, khong the them %d\\n\", value);\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    if (isEmpty(q)) {\n"
            + "        q->front = q->rear = 0;\n"
            + "    } else {\n"
            + "        q->rear++;\n"
            + "    }\n"
            + "    \n"
            + "    q->items[q->rear] = value;\n"
            + "    printf(\"Da them %d vao hang doi\\n\", value);\n"
            + "}\n"
            + "\n"
            + "// 5. Lấy phần tử khỏi hàng đợi\n"
            + "int dequeue(Queue *q) {\n"
            + "    if (isEmpty(q)) {\n"
            + "        printf(\"Hang doi rong, khong the lay phan tu\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    \n"
            + "    int removedItem = q->items[q->front];\n"
            + "    \n"
            + "    if (q->front == q->rear) {\n"
            + "        // Nếu chỉ còn 1 phần tử\n"
            + "        q->front = q->rear = -1;\n"
            + "    } else {\n"
            + "        q->front++;\n"
            + "    }\n"
            + "    \n"
            + "    return removedItem;\n"
            + "}\n"
            + "\n"
            + "// 6. Xem phần tử đầu hàng đợi\n"
            + "int peek(Queue *q) {\n"
            + "    if (isEmpty(q)) {\n"
            + "        printf(\"Hang doi rong\\n\");\n"
            + "        return -1;\n"
            + "    }\n"
            + "    return q->items[q->front];\n"
            + "}\n"
            + "\n"
            + "// Hiển thị hàng đợi\n"
            + "void display(Queue *q) {\n"
            + "    if (isEmpty(q)) {\n"
            + "        printf(\"Hang doi rong\\n\");\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Cac phan tu trong hang doi: \");\n"
            + "    for (int i = q->front; i <= q->rear; i++) {\n"
            + "        printf(\"%d \", q->items[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    Queue q;\n"
            + "    initQueue(&q);\n"
            + "    \n"
            + "    enqueue(&q, 10);\n"
            + "    enqueue(&q, 20);\n"
            + "    enqueue(&q, 30);\n"
            + "    enqueue(&q, 40);\n"
            + "    enqueue(&q, 50);\n"
            + "    enqueue(&q, 60); // Thêm vào khi đầy\n"
            + "    \n"
            + "    display(&q);\n"
            + "    \n"
            + "    printf(\"Phan tu dau hang doi: %d\\n\", peek(&q));\n"
            + "    \n"
            + "    printf(\"Da lay ra %d\\n\", dequeue(&q));\n"
            + "    printf(\"Da lay ra %d\\n\", dequeue(&q));\n"
            + "    \n"
            + "    display(&q);\n"
            + "    \n"
            + "    enqueue(&q, 70);\n"
            + "    enqueue(&q, 80);\n"
            + "    \n"
            + "    display(&q);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Mở và đóng tệp tin", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "int fclose(FILE *stream);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    char data[100];\n"
            + "    \n"
            + "    // 1. Mở file để ghi\n"
            + "    file = fopen(\"example.txt\", \"w\");\n"
            + "    \n"
            + "    // Kiểm tra lỗi khi mở file\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để ghi!\\n\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Nhập dữ liệu để ghi vào file: \");\n"
            + "    fgets(data, sizeof(data), stdin);\n"
            + "    \n"
            + "    // Ghi dữ liệu vào file\n"
            + "    fprintf(file, \"%s\", data);\n"
            + "    \n"
            + "    // Đóng file sau khi ghi\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // 2. Mở file để đọc\n"
            + "    file = fopen(\"example.txt\", \"r\");\n"
            + "    \n"
            + "    // Kiểm tra lỗi khi mở file\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để đọc!\\n\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"\\nNội dung file:\\n\");\n"
            + "    \n"
            + "    // Đọc và hiển thị nội dung file\n"
            + "    while (fgets(data, sizeof(data), file) != NULL) {\n"
            + "        printf(\"%s\", data);\n"
            + "    }\n"
            + "    \n"
            + "    // Đóng file sau khi đọc\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Đọc và ghi tệp tin", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "int fclose(FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"example.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Thao tác với file ở đây\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int fputc(int char, FILE *stream);\n"
            + "int putc(int char, FILE *stream);",
            "int fputs(const char *str, FILE *stream);",
            "int fprintf(FILE *stream, const char *format, ...);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"output.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Ghi từng ký tự\n"
            + "    fputc('A', file);\n"
            + "    putc('\\n', file);\n"
            + "    \n"
            + "    // Ghi chuỗi\n"
            + "    fputs(\"Hello, World!\\n\", file);\n"
            + "    \n"
            + "    // Ghi có định dạng\n"
            + "    fprintf(file, \"Gia tri: %d, Pi: %.2f\\n\", 42, 3.14);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int fgetc(FILE *stream);\n"
            + "int getc(FILE *stream);",
            "char *fgets(char *str, int n, FILE *stream);",
            "int fscanf(FILE *stream, const char *format, ...);",
            "int feof(FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"input.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Đọc từng ký tự\n"
            + "    int ch;\n"
            + "    printf(\"Đọc từng ký tự:\\n\");\n"
            + "    while ((ch = fgetc(file)) != EOF) {\n"
            + "        putchar(ch);\n"
            + "    }\n"
            + "    rewind(file); // Đưa con trỏ về đầu file\n"
            + "    \n"
            + "    // Đọc từng dòng\n"
            + "    char buffer[100];\n"
            + "    printf(\"\\nĐọc từng dòng:\\n\");\n"
            + "    while (fgets(buffer, sizeof(buffer), file) != NULL) {\n"
            + "        printf(\"%s\", buffer);\n"
            + "    }\n"
            + "    rewind(file);\n"
            + "    \n"
            + "    // Đọc có định dạng\n"
            + "    int num;\n"
            + "    float fnum;\n"
            + "    fscanf(file, \"%d %f\", &num, &fnum);\n"
            + "    printf(\"\\nĐọc có định dạng: %d, %.2f\\n\", num, fnum);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Ghi file nhị phân\n"
            + "    FILE *file = fopen(\"students.dat\", \"wb\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    struct Student s1 = {1, \"Nguyen Van A\", 3.5};\n"
            + "    struct Student s2 = {2, \"Tran Thi B\", 3.8};\n"
            + "    \n"
            + "    fwrite(&s1, sizeof(struct Student), 1, file);\n"
            + "    fwrite(&s2, sizeof(struct Student), 1, file);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc file nhị phân\n"
            + "    file = fopen(\"students.dat\", \"rb\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    struct Student s;\n"
            + "    printf(\"Danh sách sinh viên:\\n\");\n"
            + "    while (fread(&s, sizeof(struct Student), 1, file) == 1) {\n"
            + "        printf(\"ID: %d, Ten: %s, GPA: %.2f\\n\", s.id, s.name, s.gpa);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int fseek(FILE *stream, long offset, int whence);",
            "long ftell(FILE *stream);",
            "void rewind(FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"data.txt\", \"w+\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    fprintf(file, \"Hello World!\");\n"
            + "    \n"
            + "    // Di chuyển đến ký tự thứ 6\n"
            + "    fseek(file, 6, SEEK_SET);\n"
            + "    \n"
            + "    char ch = fgetc(file);\n"
            + "    printf(\"Ký tự tại vị trí 6: %c\\n\", ch); // Output: W\n"
            + "    \n"
            + "    // Lấy vị trí hiện tại\n"
            + "    long pos = ftell(file);\n"
            + "    printf(\"Vị trí hiện tại: %ld\\n\", pos); // Output: 7\n"
            + "    \n"
            + "    // Đưa con trỏ về đầu file\n"
            + "    rewind(file);\n"
            + "    pos = ftell(file);\n"
            + "    printf(\"Vị trí sau rewind: %ld\\n\", pos); // Output: 0\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int ferror(FILE *stream);",
            "void clearerr(FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"nonexistent.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        perror(\"Lỗi mở file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Thử đọc từ file đã mở\n"
            + "    int ch = fgetc(file);\n"
            + "    if (ferror(file)) {\n"
            + "        printf(\"Đã xảy ra lỗi khi đọc file\\n\");\n"
            + "        clearerr(file); // Xóa cờ lỗi\n"
            + "    }\n"
            + "    \n"
            + "    if (feof(file)) {\n"
            + "        printf(\"Đã đến cuối file\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int rename(const char *oldname, const char *newname);",
            "int remove(const char *filename);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo file tạm\n"
            + "    FILE *file = fopen(\"temp.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        perror(\"Lỗi tạo file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    fprintf(file, \"File tạm\");\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đổi tên file\n"
            + "    if (rename(\"temp.txt\", \"new.txt\") != 0) {\n"
            + "        perror(\"Lỗi đổi tên\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Xóa file\n"
            + "    if (remove(\"new.txt\") != 0) {\n"
            + "        perror(\"Lỗi xóa file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Thao tác thành công\\n\");\n"
            + "    return 0;\n"
            + "}"

        });

        Code_MAP.put("Các hàm xử lý tệp tin", new String[]{
            "int feof(FILE *stream);",
            "int ferror(FILE *stream);",
            "void perror(const char *str);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"nonexistent.txt\", \"r\");\n"
            + "    \n"
            + "    if (file == NULL) {\n"
            + "        perror(\"Lỗi khi mở file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    while (!feof(file)) {\n"
            + "        char c = fgetc(file);\n"
            + "        if (ferror(file)) {\n"
            + "            perror(\"Lỗi khi đọc file\");\n"
            + "            break;\n"
            + "        }\n"
            + "        printf(\"%c\", c);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "int fseek(FILE *stream, long int offset, int whence);",
            "long int ftell(FILE *stream);",
            "void rewind(FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file = fopen(\"example.txt\", \"r+\");\n"
            + "    \n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Di chuyển đến cuối file\n"
            + "    fseek(file, 0, SEEK_END);\n"
            + "    long size = ftell(file);\n"
            + "    printf(\"Kích thước file: %ld bytes\\n\", size);\n"
            + "    \n"
            + "    // Quay lại đầu file\n"
            + "    rewind(file);\n"
            + "    \n"
            + "    // Di chuyển đến vị trí 10 bytes từ đầu\n"
            + "    fseek(file, 10, SEEK_SET);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float grade;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    struct Student s1 = {\"Nguyen Van A\", 20, 8.5};\n"
            + "    struct Student s2;\n"
            + "    \n"
            + "    // Ghi dữ liệu nhị phân\n"
            + "    file = fopen(\"student.dat\", \"wb\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file để ghi\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    fwrite(&s1, sizeof(struct Student), 1, file);\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc dữ liệu nhị phân\n"
            + "    file = fopen(\"student.dat\", \"rb\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Lỗi mở file để đọc\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    fread(&s2, sizeof(struct Student), 1, file);\n"
            + "    printf(\"Thông tin sinh viên: %s, %d, %.2f\\n\", s2.name, s2.age, s2.grade);\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int remove(const char *filename);",
            "int rename(const char *old_filename, const char *new_filename);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo file tạm\n"
            + "    FILE *file = fopen(\"temp.txt\", \"w\");\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đổi tên file\n"
            + "    if (rename(\"temp.txt\", \"new.txt\") == 0) {\n"
            + "        printf(\"Đổi tên file thành công\\n\");\n"
            + "    } else {\n"
            + "        perror(\"Lỗi khi đổi tên file\");\n"
            + "    }\n"
            + "    \n"
            + "    // Xóa file\n"
            + "    if (remove(\"new.txt\") == 0) {\n"
            + "        printf(\"Xóa file thành công\\n\");\n"
            + "    } else {\n"
            + "        perror(\"Lỗi khi xóa file\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
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
