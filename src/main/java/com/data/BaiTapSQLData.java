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
public class BaiTapSQLData {

    private static final Map<String, int[]> Index_MAP = new HashMap<>();
    static {
        Index_MAP.put("Giới thiệu SQL", new int[]{
            10
        });

        Index_MAP.put("Khái niệm", new int[]{
            10
        });

        Index_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new int[]{
            10
        });

        Index_MAP.put("SELECT", new int[]{
            10
        });

        Index_MAP.put("INSERT", new int[]{
            10
        });

        Index_MAP.put("UPDATE", new int[]{
            10
        });

        Index_MAP.put("DELETE", new int[]{
            10
        });

        Index_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new int[]{
            10
        });

        Index_MAP.put("Toán tử số học, so sánh, logic", new int[]{
            10
        });

        Index_MAP.put("Hàm tổng hợp", new int[]{
            10
        });

        Index_MAP.put("Hàm xử lý chuỗi", new int[]{
            10
        });

        Index_MAP.put("Hàm xử lý ngày tháng", new int[]{
            10
        });

        Index_MAP.put("PRIMARY KEY, FOREIGN KEY", new int[]{
            10
        });

        Index_MAP.put("UNIQUE, CHECK, NOT NULL", new int[]{
            10
        });

        Index_MAP.put("DEFAULT", new int[]{
            10
        });

        Index_MAP.put("Tạo, xóa cơ sở dữ liệu", new int[]{
            10
        });

        Index_MAP.put("Sao lưu và phục hồi", new int[]{
            10
        });

        Index_MAP.put("Quản lý quyền truy cập", new int[]{
            10
        });

        Index_MAP.put("Tạo, xóa, sửa bảng", new int[]{
            10
        });

        Index_MAP.put("Tăng giá trị tự động", new int[]{
            10
        });

        Index_MAP.put("Tạo, xóa VIEW", new int[]{
            10
        });

        Index_MAP.put("JOIN", new int[]{
            10
        });

        Index_MAP.put("SELF JOIN", new int[]{
            10
        });

        Index_MAP.put("UNION", new int[]{
            10
        });

        Index_MAP.put("GROUP BY", new int[]{
            10
        });

        Index_MAP.put("Hàm tổng hợp", new int[]{
            10
        });

        Index_MAP.put("HAVING", new int[]{
            10
        });

        Index_MAP.put("UPPER, LOWER", new int[]{
            10
        });

        Index_MAP.put("SUBSTRING", new int[]{
            10
        });

        Index_MAP.put("ROUND", new int[]{
            10
        });

        Index_MAP.put("NOW, DATE_FORMAT", new int[]{
            10
        });

        Index_MAP.put("SELECT INTO", new int[]{
            10
        });

        Index_MAP.put("INSERT INTO SELECT", new int[]{
            10
        });

        Index_MAP.put("CASE", new int[]{
            10
        });

        Index_MAP.put("Tạo và sử dụng PROCEDURE", new int[]{
            10
        });

        Index_MAP.put("Truyền tham số vào PROCEDURE", new int[]{
            10
        });

        Index_MAP.put("Lợi ích và ứng dụng thực tế", new int[]{
            10
        });

        Index_MAP.put("Phòng chống SQL Injection", new int[]{
            10
        });

        Index_MAP.put("Nguyên tắc Least Privilege", new int[]{
            10
        });

        Index_MAP.put("PARTITIONING, HASH PARTITIONING", new int[]{
            10
        });

        Index_MAP.put("SHARDING", new int[]{
            10
        });

        Index_MAP.put("BATCH PROCESSING", new int[]{
            10
        });

        Index_MAP.put("RECURSIVE QUERIES", new int[]{
            10
        });

        Index_MAP.put("Biểu thức CTE", new int[]{
            10
        });

        Index_MAP.put("WINDOW FUNCTIONS", new int[]{
            10
        });

        Index_MAP.put("Dynamic SQL", new int[]{
            10
        });

        Index_MAP.put("MySQL", new int[]{
            10
        });

        Index_MAP.put("SQL Server", new int[]{
            10
        });

        Index_MAP.put("PostgreSQL", new int[]{
            10
        });

        Index_MAP.put("Oracle", new int[]{
            10
        });

        Index_MAP.put("IDE cho SQL", new int[]{
            10
        });

        Index_MAP.put("Công cụ GUI", new int[]{
            10
        });

        Index_MAP.put("ORM", new int[]{
            10
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

        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "Câu 1: SQL là viết tắt của gì?\n"
            + "A. Standard Query Language\n"
            + "B. Structured Query Language\n"
            + "C. Simple Query Logic\n"
            + "D. System Query Link",
            "Câu 2: Câu lệnh nào dùng để truy vấn dữ liệu từ bảng?\n"
            + "A. GET\n"
            + "B. SELECT\n"
            + "C. READ\n"
            + "D. FETCH",
            "Câu 3: Mệnh đề WHERE trong SQL dùng để làm gì?\n"
            + "A. Sắp xếp dữ liệu\n"
            + "B. Nhóm dữ liệu\n"
            + "C. Lọc dữ liệu theo điều kiện\n"
            + "D. Tính toán giá trị",
            "Câu 4: Câu lệnh INSERT dùng để làm gì?\n"
            + "A. Xóa dữ liệu\n"
            + "B. Cập nhật dữ liệu\n"
            + "C. Thêm dữ liệu mới\n"
            + "D. Tạo bảng",
            "Câu 5: Để cập nhật dữ liệu trong bảng, ta dùng lệnh nào?\n"
            + "A. MODIFY\n"
            + "B. CHANGE\n"
            + "C. UPDATE\n"
            + "D. ALTER",
            "Câu 6: Câu lệnh DELETE dùng để làm gì?\n"
            + "A. Xóa toàn bộ cơ sở dữ liệu\n"
            + "B. Xóa một hoặc nhiều bản ghi từ bảng\n"
            + "C. Xóa cột trong bảng\n"
            + "D. Xóa bảng",
            "Câu 7: Mệnh đề ORDER BY dùng để làm gì?\n"
            + "A. Lọc dữ liệu\n"
            + "B. Nhóm dữ liệu\n"
            + "C. Sắp xếp dữ liệu\n"
            + "D. Đếm dữ liệu",
            "Câu 8: Toán tử LIKE thường đi kèm với ký tự nào để tìm kiếm chuỗi con?\n"
            + "A. *\n"
            + "B. %\n"
            + "C. #\n"
            + "D. $",
            "Câu 9: Lệnh DROP TABLE dùng để làm gì?\n"
            + "A. Xóa dữ liệu trong bảng\n"
            + "B. Xóa toàn bộ bảng khỏi cơ sở dữ liệu\n"
            + "C. Thêm cột vào bảng\n"
            + "D. Đổi tên bảng",
            "Câu 10: Khóa chính (PRIMARY KEY) trong SQL có đặc điểm gì?\n"
            + "A. Cho phép giá trị trùng lặp\n"
            + "B. Không thể là NULL\n"
            + "C. Có thể có nhiều khóa chính trong một bảng\n"
            + "D. Chỉ áp dụng cho kiểu dữ liệu số"
        });

        TITLE_MAP.put("Khái niệm", new String[]{
            ". SQL là viết tắt của:\n"
            + "\n"
            + "A. Structured Question Language\n"
            + "B. Standard Query Language\n"
            + "C. Structured Query Language\n"
            + "D. System Query Language",
            ". Lệnh SQL nào được sử dụng để truy xuất dữ liệu từ một bảng?\n"
            + "\n"
            + "A. UPDATE\n"
            + "B. INSERT\n"
            + "C. DELETE\n"
            + "D. SELECT",
            ". Lệnh SQL nào được sử dụng để lọc các hàng trong một truy vấn?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Khóa chính (Primary Key) trong SQL là gì?\n"
            + "\n"
            + "A. Một khóa được sử dụng để sắp xếp dữ liệu.\n"
            + "B. Một khóa xác định duy nhất mỗi bản ghi trong một bảng.\n"
            + "C. Một khóa được sử dụng để liên kết các bảng.\n"
            + "D. Một khóa tùy chọn trong một bảng.",
            ". Loại ràng buộc nào đảm bảo rằng tất cả các giá trị trong một cột là duy nhất?\n"
            + "\n"
            + "A. FOREIGN KEY\n"
            + "B. PRIMARY KEY\n"
            + "C. UNIQUE\n"
            + "D. NOT NULL",
            ". Câu lệnh SQL nào được sử dụng để sắp xếp các hàng trong một truy vấn?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Lệnh SQL nào được sử dụng để kết hợp các hàng từ hai hoặc nhiều bảng dựa trên một cột liên quan giữa chúng?\n"
            + "\n"
            + "A. UNION\n"
            + "B. JOIN\n"
            + "C. INTERSECT\n"
            + "D. EXCEPT",
            ". Hàm tổng hợp nào được sử dụng để tính trung bình của một cột?\n"
            + "\n"
            + "A. COUNT()\n"
            + "B. SUM()\n"
            + "C. AVG()\n"
            + "D. MAX()",
            ". Lệnh SQL nào được sử dụng để thêm một cột mới vào bảng?\n"
            + "\n"
            + "A. UPDATE\n"
            + "B. INSERT\n"
            + "C. ALTER TABLE\n"
            + "D. CREATE TABLE",
            ". Lệnh SQL nào được sử dụng để xóa một bảng?\n"
            + "\n"
            + "A. DELETE\n"
            + "B. DROP TABLE\n"
            + "C. TRUNCATE TABLE\n"
            + "D. REMOVE TABLE"
        });

        TITLE_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new String[]{
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ số nguyên trong SQL?\n"
            + "\n"
            + "A. VARCHAR\n"
            + "B. TEXT\n"
            + "C. INT\n"
            + "D. DATE",
            ". Toán tử nào được sử dụng để so sánh \"bằng\" trong SQL?\n"
            + "\n"
            + "A. <>\n"
            + "B. !=\n"
            + "C. =\n"
            + "D. LIKE",
            ". Biểu thức nào được sử dụng để kết hợp hai chuỗi trong SQL?\n"
            + "\n"
            + "A. +\n"
            + "B. &\n"
            + "C. ||\n"
            + "D. CONCAT()",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ ngày và giờ trong SQL?\n"
            + "\n"
            + "A. VARCHAR\n"
            + "B. TEXT\n"
            + "C. INT\n"
            + "D. DATETIME",
            ". Toán tử nào được sử dụng để kiểm tra xem một giá trị có nằm trong một tập hợp các giá trị hay không?\n"
            + "\n"
            + "A. LIKE\n"
            + "B. BETWEEN\n"
            + "C. IN\n"
            + "D. EXISTS",
            ". Biểu thức nào được sử dụng để tính giá trị trung bình của một cột số trong SQL?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. COUNT()\n"
            + "C. MAX()\n"
            + "D. AVG()",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ chuỗi ký tự có độ dài thay đổi trong SQL?\n"
            + "\n"
            + "A. CHAR\n"
            + "B. VARCHAR\n"
            + "C. INT\n"
            + "D. DATE",
            ". Toán tử nào được sử dụng để kiểm tra xem một giá trị có nằm trong một phạm vi giá trị hay không?\n"
            + "\n"
            + "A. LIKE\n"
            + "B. BETWEEN\n"
            + "C. IN\n"
            + "D. EXISTS",
            ". Biểu thức nào được sử dụng để lấy độ dài của một chuỗi trong SQL?\n"
            + "\n"
            + "A. LENGTH()\n"
            + "B. SIZE()\n"
            + "C. COUNT()\n"
            + "D. SUM()",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ giá trị đúng/sai trong SQL?\n"
            + "\n"
            + "A. INT\n"
            + "B. VARCHAR\n"
            + "C. BOOLEAN\n"
            + "D. DATE"
        });

        TITLE_MAP.put("SELECT", new String[]{
            ". Lệnh SELECT được sử dụng để làm gì trong SQL?\n"
            + "\n"
            + "A. Cập nhật dữ liệu\n"
            + "B. Chèn dữ liệu mới\n"
            + "C. Truy xuất dữ liệu\n"
            + "D. Xóa dữ liệu",
            ". Mệnh đề nào được sử dụng để lọc các hàng trong một truy vấn SELECT?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Mệnh đề nào được sử dụng để sắp xếp kết quả của một truy vấn SELECT?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Mệnh đề nào được sử dụng để nhóm các hàng có cùng giá trị trong một cột?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Mệnh đề nào được sử dụng để lọc các nhóm được tạo bởi mệnh đề GROUP BY?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Toán tử nào được sử dụng để chọn tất cả các cột từ một bảng?\n"
            + "\n"
            + "A. ALL\n"
            + "B. ANY\n"
            + "C. SOME\n"
            + "D. *",
            ". Hàm nào được sử dụng để đếm số lượng hàng trong một bảng?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            ". Hàm nào được sử dụng để tính tổng các giá trị trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            ". Mệnh đề nào được sử dụng để giới hạn số lượng hàng trả về bởi một truy vấn SELECT?\n"
            + "\n"
            + "A. LIMIT\n"
            + "B. TOP\n"
            + "C. FETCH\n"
            + "D. BOTH A VÀ B",
            ". Toán tử nào được sử dụng để tìm kiếm các giá trị khớp với một mẫu cụ thể?\n"
            + "\n"
            + "A. EQUAL\n"
            + "B. LIKE\n"
            + "C. IN\n"
            + "D. BETWEEN"
        });

        TITLE_MAP.put("INSERT", new String[]{
            ". Lệnh SQL nào được sử dụng để thêm dữ liệu mới vào một bảng?\n"
            + "\n"
            + "A. UPDATE\n"
            + "B. DELETE\n"
            + "C. INSERT\n"
            + "D. SELECT",
            ". Cú pháp nào sau đây là đúng cho lệnh INSERT?\n"
            + "\n"
            + "A. INSERT INTO table_name VALUES (value1, value2, ...);\n"
            + "B. INSERT VALUES (value1, value2, ...) INTO table_name;\n"
            + "C. ADD INTO table_name VALUES (value1, value2, ...);\n"
            + "D. NEW RECORD INTO table_name VALUES (value1, value2, ...);",
            ". Điều gì xảy ra nếu bạn bỏ qua một cột trong danh sách cột khi sử dụng lệnh INSERT?\n"
            + "\n"
            + "A. Lỗi sẽ xảy ra.\n"
            + "B. Giá trị mặc định sẽ được chèn vào.\n"
            + "C. Giá trị NULL sẽ được chèn vào.\n"
            + "D. Bảng sẽ tự động điền giá trị.",
            ". Lệnh INSERT nào sau đây được dùng để chèn nhiều hàng cùng một lúc?\n"
            + "\n"
            + "A. INSERT MULTIPLE\n"
            + "B. INSERT BATCH\n"
            + "C. INSERT ALL\n"
            + "D. INSERT INTO... VALUES (), (), ();",
            ". Nếu kiểu dữ liệu của một cột là số và bạn cố gắng chèn một chuỗi, điều gì sẽ xảy ra?\n"
            + "\n"
            + "A. Chuỗi sẽ được tự động chuyển đổi thành số.\n"
            + "B. Lỗi sẽ xảy ra.\n"
            + "C. Giá trị NULL sẽ được chèn vào.\n"
            + "D. Cảnh báo sẽ được hiển thị.",
            ". Bạn có thể chèn dữ liệu vào bảng nào?\n"
            + "\n"
            + "A. Chỉ bảng tạm thời.\n"
            + "B. Chỉ bảng vĩnh viễn.\n"
            + "C. Bất kỳ bảng nào mà bạn có quyền ghi.\n"
            + "D. Chỉ bảng hệ thống.",
            ". Điều gì xảy ra nếu bạn chèn một giá trị trùng lặp vào một cột có ràng buộc UNIQUE?\n"
            + "\n"
            + "A. Giá trị trùng lặp sẽ được bỏ qua.\n"
            + "B. Lỗi sẽ xảy ra.\n"
            + "C. Giá trị trùng lặp sẽ được cập nhật.\n"
            + "D. Một hàng mới sẽ được tạo với giá trị trùng lặp.",
            ". Bạn có thể chèn dữ liệu từ bảng khác vào bảng hiện tại bằng cách nào?\n"
            + "\n"
            + "A. INSERT FROM SELECT\n"
            + "B. INSERT WITH SELECT\n"
            + "C. INSERT USING SELECT\n"
            + "D. INSERT INCLUDE SELECT",
            ". Điều gì xảy ra nếu bạn chèn giá trị NULL vào một cột có ràng buộc NOT NULL?\n"
            + "\n"
            + "A. Giá trị NULL sẽ được bỏ qua.\n"
            + "B. Lỗi sẽ xảy ra.\n"
            + "C. Giá trị mặc định sẽ được chèn vào.\n"
            + "D. Một giá trị ngẫu nhiên sẽ được chèn vào.",
            ". Lệnh nào sau đây được sử dụng để chèn dữ liệu vào một bảng và chỉ định các cột sẽ nhận giá trị?\n"
            + "\n"
            + "A. INSERT VALUES\n"
            + "B. INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);\n"
            + "C. INSERT SELECT\n"
            + "D. INSERT UPDATE"
        });

        TITLE_MAP.put("UPDATE", new String[]{
            ". Lệnh SQL nào được sử dụng để sửa đổi dữ liệu hiện có trong một bảng?\n"
            + "\n"
            + "A. SELECT\n"
            + "B. INSERT\n"
            + "C. UPDATE\n"
            + "D. DELETE",
            ". Mệnh đề nào được sử dụng với lệnh UPDATE để chỉ định các hàng cần sửa đổi?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            ". Mệnh đề nào được sử dụng với lệnh UPDATE để chỉ định các cột và giá trị mới?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. SET\n"
            + "D. HAVING",
            ". Điều gì xảy ra nếu bạn không sử dụng mệnh đề WHERE trong lệnh UPDATE?\n"
            + "\n"
            + "A. Lệnh sẽ báo lỗi.\n"
            + "B. Tất cả các hàng trong bảng sẽ được cập nhật.\n"
            + "C. Chỉ hàng đầu tiên trong bảng sẽ được cập nhật.\n"
            + "D. Không có hàng nào trong bảng được cập nhật.",
            ". Bạn có thể cập nhật nhiều cột cùng lúc bằng lệnh UPDATE không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi các cột có cùng kiểu dữ liệu.\n"
            + "D. Chỉ khi các cột có ràng buộc khóa ngoại.",
            ". Bạn có thể sử dụng các hàm tổng hợp (ví dụ: SUM, AVG) trong mệnh đề SET của lệnh UPDATE không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi cập nhật một hàng duy nhất.\n"
            + "D. Chỉ khi sử dụng mệnh đề GROUP BY.",
            ". Bạn có thể cập nhật giá trị của một cột thành NULL bằng lệnh UPDATE không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi cột cho phép giá trị NULL.\n"
            + "D. Chỉ khi sử dụng mệnh đề WHERE.",
            ". Bạn có thể cập nhật giá trị của một cột dựa trên giá trị của cột khác trong cùng bảng không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi sử dụng mệnh đề JOIN.\n"
            + "D. Chỉ khi các cột có cùng kiểu dữ liệu.",
            ". Điều gì xảy ra nếu giá trị mới bạn đặt cho một cột vi phạm ràng buộc UNIQUE?\n"
            + "\n"
            + "A. Lệnh UPDATE sẽ thành công.\n"
            + "B. Lệnh UPDATE sẽ báo lỗi.\n"
            + "C. Giá trị trùng lặp sẽ bị bỏ qua.\n"
            + "D. Một hàng mới sẽ được thêm vào bảng.",
            ". Lệnh UPDATE có thể được sử dụng để thay đổi kiểu dữ liệu của một cột không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi chuyển đổi sang kiểu dữ liệu tương thích.\n"
            + "D. Chỉ khi sử dụng lệnh ALTER TABLE."
        });

        TITLE_MAP.put("DELETE", new String[]{
            ". Lệnh DELETE được sử dụng để làm gì trong SQL?\n"
            + "\n"
            + "A. Thêm dữ liệu vào bảng\n"
            + "B. Cập nhật dữ liệu trong bảng\n"
            + "C. Xóa dữ liệu khỏi bảng\n"
            + "D. Tạo một bảng mới",
            ". Mệnh đề nào được sử dụng với lệnh DELETE để chỉ định các hàng cần xóa?\n"
            + "\n"
            + "A. JOIN\n"
            + "B. GROUP BY\n"
            + "C. ORDER BY\n"
            + "D. WHERE",
            ". Điều gì sẽ xảy ra nếu bạn chạy lệnh DELETE mà không có mệnh đề WHERE?\n"
            + "\n"
            + "A. Không có hàng nào bị xóa\n"
            + "B. Chỉ xóa hàng đầu tiên\n"
            + "C. Xóa tất cả các hàng trong bảng\n"
            + "D. Báo lỗi",
            ". Lệnh nào được sử dụng để xóa tất cả các hàng khỏi một bảng mà không xóa bảng đó?\n"
            + "\n"
            + "A. DROP TABLE\n"
            + "B. TRUNCATE TABLE\n"
            + "C. ALTER TABLE\n"
            + "D. UPDATE",
            ". Trong lệnh DELETE, điều kiện WHERE được đánh giá như thế nào?\n"
            + "\n"
            + "A. Cho mỗi bảng\n"
            + "B. Cho mỗi cột\n"
            + "C. Cho mỗi hàng\n"
            + "D. Cho toàn bộ cơ sở dữ liệu",
            ". Điều gì xảy ra với các ràng buộc khóa ngoại khi các hàng liên quan bị xóa?\n"
            + "\n"
            + "A. Các ràng buộc khóa ngoại tự động bị xóa\n"
            + "B. Các ràng buộc khóa ngoại không bị ảnh hưởng\n"
            + "C. Lỗi có thể xảy ra tùy thuộc vào ràng buộc ON DELETE\n"
            + "D. Các ràng buộc khóa ngoại được cập nhật tự động",
            ". Lệnh DELETE có thể được sử dụng để xóa một cột khỏi một bảng không?\n"
            + "\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi cột trống\n"
            + "D. Chỉ khi cột là khóa chính",
            ". Lệnh SQL nào được sử dụng để xóa một bảng hoàn toàn khỏi cơ sở dữ liệu?\n"
            + "\n"
            + "A. DELETE TABLE\n"
            + "B. TRUNCATE TABLE\n"
            + "C. DROP TABLE\n"
            + "D. ALTER TABLE",
            ". Điều gì sẽ xảy ra nếu bạn cố gắng xóa một hàng mà có các hàng khác tham chiếu đến nó thông qua khóa ngoại?\n"
            + "\n"
            + "A. Lệnh DELETE sẽ thành công\n"
            + "B. Lệnh DELETE sẽ thất bại và báo lỗi\n"
            + "C. Các hàng tham chiếu sẽ bị xóa tự động\n"
            + "D. Các hàng tham chiếu sẽ được cập nhật thành NULL",
            ". Trong một giao dịch SQL, nếu lệnh DELETE thất bại, điều gì sẽ xảy ra?\n"
            + "\n"
            + "A. Các thay đổi đã thực hiện sẽ được giữ lại\n"
            + "B. Giao dịch sẽ được tự động cam kết\n"
            + "C. Giao dịch sẽ được khôi phục về trạng thái ban đầu\n"
            + "D. Chỉ lệnh DELETE đó sẽ được khôi phục"
        });

        TITLE_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new String[]{
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ số nguyên trong SQL?\n"
            + "\n"
            + "A. VARCHAR\n"
            + "B. TEXT\n"
            + "C. INT\n"
            + "D. DATE",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ chuỗi văn bản có độ dài thay đổi?\n"
            + "\n"
            + "A. INT\n"
            + "B. DECIMAL\n"
            + "C. DATE\n"
            + "D. VARCHAR",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ ngày tháng năm trong SQL?\n"
            + "\n"
            + "A. INT\n"
            + "B. VARCHAR\n"
            + "C. DATE\n"
            + "D. DECIMAL",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ số thập phân có độ chính xác cố định?\n"
            + "\n"
            + "A. INT\n"
            + "B. VARCHAR\n"
            + "C. DATE\n"
            + "D. DECIMAL",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ chuỗi văn bản có độ dài tối đa lớn?\n"
            + "\n"
            + "A. INT\n"
            + "B. VARCHAR\n"
            + "C. TEXT\n"
            + "D. DATE",
            ". Hàm nào được sử dụng để chuyển đổi chuỗi thành kiểu dữ liệu ngày tháng?\n"
            + "\n"
            + "A. CONVERT()\n"
            + "B. CAST()\n"
            + "C. DATE()\n"
            + "D. SUBSTRING()",
            ". Hàm nào được sử dụng để lấy độ dài của một chuỗi trong SQL?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. LEN()\n"
            + "D. NOW()",
            ". Hàm nào được sử dụng để lấy ngày hiện tại trong SQL?\n"
            + "\n"
            + "A. LEN()\n"
            + "B. SUM()\n"
            + "C. AVG()\n"
            + "D. GETDATE()",
            ". Kiểu dữ liệu nào được sử dụng để lưu trữ giá trị đúng hoặc sai (boolean)?\n"
            + "\n"
            + "A. INT\n"
            + "B. VARCHAR\n"
            + "C. BIT\n"
            + "D. DATE",
            ". Hàm nào được sử dụng để trích xuất một phần của chuỗi trong SQL?\n"
            + "\n"
            + "A. LEN()\n"
            + "B. GETDATE()\n"
            + "C. SUBSTRING()\n"
            + "D. AVG()"
        });

        TITLE_MAP.put("Toán tử số học, so sánh, logic", new String[]{
            ". Toán tử nào dùng để cộng hai giá trị trong SQL?\n"
            + "\n"
            + "A. *\n"
            + "B. /\n"
            + "C. +\n"
            + "D. -",
            ". Toán tử nào dùng để kiểm tra sự bằng nhau trong SQL?\n"
            + "\n"
            + "A. <>\n"
            + "B. !=\n"
            + "C. =\n"
            + "D. >",
            ". Toán tử logic nào dùng để kết hợp hai điều kiện và trả về TRUE nếu cả hai điều kiện đều đúng?\n"
            + "\n"
            + "A. OR\n"
            + "B. AND\n"
            + "C. NOT\n"
            + "D. XOR",
            ". Toán tử nào dùng để chia hai giá trị trong SQL?\n"
            + "\n"
            + "A. *\n"
            + "B. /\n"
            + "C. +\n"
            + "D. -",
            ". Toán tử nào dùng để kiểm tra xem một giá trị có lớn hơn một giá trị khác hay không trong SQL?\n"
            + "\n"
            + "A. <\n"
            + "B. >\n"
            + "C. <=\n"
            + "D. >=",
            ". Toán tử logic nào dùng để đảo ngược một điều kiện trong SQL?\n"
            + "\n"
            + "A. OR\n"
            + "B. AND\n"
            + "C. NOT\n"
            + "D. XOR",
            ". Toán tử nào dùng để nhân hai giá trị trong SQL?\n"
            + "\n"
            + "A. *\n"
            + "B. /\n"
            + "C. +\n"
            + "D. -",
            ". Toán tử nào dùng để kiểm tra xem một giá trị có khác với một giá trị khác hay không trong SQL?\n"
            + "\n"
            + "A. =\n"
            + "B. <>\n"
            + "C. >\n"
            + "D. <",
            ". Toán tử logic nào dùng để kết hợp hai điều kiện và trả về TRUE nếu một trong hai điều kiện đúng?\n"
            + "\n"
            + "A. OR\n"
            + "B. AND\n"
            + "C. NOT\n"
            + "D. XOR",
            ". Toán tử nào được sử dụng để kiểm tra xem một giá trị có nằm trong một phạm vi giá trị cụ thể hay không?\n"
            + "\n"
            + "A. =\n"
            + "B. LIKE\n"
            + "C. BETWEEN\n"
            + "D. IN"
        });

        TITLE_MAP.put("Hàm tổng hợp", new String[]{
            ". Hàm SQL nào trả về số lượng hàng trong một bảng?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            ". Hàm SQL nào trả về giá trị trung bình của một cột số?\n"
            + "\n"
            + "A. MIN()\n"
            + "B. SUM()\n"
            + "C. AVG()\n"
            + "D. COUNT()",
            ". Hàm SQL nào trả về giá trị lớn nhất trong một cột?\n"
            + "\n"
            + "A. MIN()\n"
            + "B. MAX()\n"
            + "C. AVG()\n"
            + "D. SUM()",
            ". Hàm SQL nào trả về giá trị nhỏ nhất trong một cột?\n"
            + "\n"
            + "A. MIN()\n"
            + "B. MAX()\n"
            + "C. COUNT()\n"
            + "D. AVG()",
            ". Hàm SQL nào tính tổng các giá trị trong một cột số?\n"
            + "\n"
            + "A. AVG()\n"
            + "B. SUM()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            ". Hàm SQL nào được sử dụng để đếm số lượng giá trị không NULL trong một cột?\n"
            + "\n"
            + "A. COUNT(*)\n"
            + "B. COUNT(DISTINCT cột)\n"
            + "C. COUNT(cột)\n"
            + "D. SUM(cột)",
            ". Hàm SQL nào được sử dụng để đếm số lượng giá trị duy nhất trong một cột?\n"
            + "\n"
            + "A. COUNT(*)\n"
            + "B. COUNT(cột)\n"
            + "C. COUNT(DISTINCT cột)\n"
            + "D. AVG(cột)",
            ". Hàm SQL nào được sử dụng để đếm tổng số hàng trong một bảng, bao gồm cả các hàng có giá trị NULL?\n"
            + "\n"
            + "A. COUNT(cột)\n"
            + "B. COUNT(DISTINCT cột)\n"
            + "C. COUNT(*)\n"
            + "D. SUM(cột)",
            ". Mệnh đề nào thường được sử dụng cùng với các hàm tổng hợp để nhóm các hàng có cùng giá trị thành các nhóm tóm tắt?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. GROUP BY\n"
            + "D. HAVING",
            ". Mệnh đề nào được sử dụng để lọc kết quả của các hàm tổng hợp dựa trên một điều kiện?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. GROUP BY\n"
            + "D. HAVING"
        });

        TITLE_MAP.put("Hàm xử lý chuỗi", new String[]{
            ". Hàm nào được sử dụng để tìm độ dài của một chuỗi trong SQL?\n"
            + "\n"
            + "A. CONCAT()\n"
            + "B. SUBSTRING()\n"
            + "C. LENGTH()\n"
            + "D. REPLACE()",
            ". Hàm nào được sử dụng để chuyển đổi một chuỗi thành chữ hoa trong SQL?\n"
            + "\n"
            + "A. LOWER()\n"
            + "B. UPPER()\n"
            + "C. TRIM()\n"
            + "D. REVERSE()",
            ". Hàm nào được sử dụng để trích xuất một phần của chuỗi trong SQL?\n"
            + "\n"
            + "A. CONCAT()\n"
            + "B. SUBSTRING()\n"
            + "C. LENGTH()\n"
            + "D. REPLACE()",
            ". Hàm nào được sử dụng để loại bỏ khoảng trắng ở đầu và cuối chuỗi trong SQL?\n"
            + "\n"
            + "A. LOWER()\n"
            + "B. UPPER()\n"
            + "C. TRIM()\n"
            + "D. REVERSE()",
            ". Hàm nào được sử dụng để thay thế một chuỗi con bằng một chuỗi khác trong SQL?\n"
            + "\n"
            + "A. CONCAT()\n"
            + "B. SUBSTRING()\n"
            + "C. LENGTH()\n"
            + "D. REPLACE()",
            ". Hàm nào được sử dụng để nối hai hoặc nhiều chuỗi trong SQL?\n"
            + "\n"
            + "A. CONCAT()\n"
            + "B. SUBSTRING()\n"
            + "C. LENGTH()\n"
            + "D. REPLACE()",
            ". Hàm nào được sử dụng để chuyển đổi một chuỗi thành chữ thường trong SQL?\n"
            + "\n"
            + "A. LOWER()\n"
            + "B. UPPER()\n"
            + "C. TRIM()\n"
            + "D. REVERSE()",
            ". Hàm nào được sử dụng để đảo ngược một chuỗi trong SQL?\n"
            + "\n"
            + "A. LOWER()\n"
            + "B. UPPER()\n"
            + "C. TRIM()\n"
            + "D. REVERSE()",
            ". Hàm nào được sử dụng để tìm vị trí xuất hiện đầu tiên của chuỗi con trong chuỗi cha?\n"
            + "\n"
            + "A. SUBSTRING()\n"
            + "B. POSITION()\n"
            + "C. LOCATE()\n"
            + "D. INSTR()",
            ". Hàm nào được sử dụng để lấy một số ký tự từ bên trái của chuỗi?\n"
            + "\n"
            + "A. RIGHT()\n"
            + "B. LEFT()\n"
            + "C. SUBSTRING()\n"
            + "D. MID()"
        });

        TITLE_MAP.put("Hàm xử lý ngày tháng", new String[]{
            ". Hàm nào trả về ngày hiện tại?\n"
            + "\n"
            + "A. THỜI GIAN HIỆN TẠI\n"
            + "B. NGÀY HIỆN TẠI\n"
            + "C. NGÀY GIỜ HIỆN TẠI\n"
            + "D. GIỜ HIỆN TẠI",
            ". Hàm nào trích xuất phần năm từ một giá trị ngày tháng?\n"
            + "\n"
            + "A. THÁNG\n"
            + "B. NGÀY\n"
            + "C. NĂM\n"
            + "D. GIỜ",
            ". Hàm nào trả về tên của tháng từ một giá trị ngày tháng?\n"
            + "\n"
            + "A. THÁNG\n"
            + "B. TÊN THÁNG\n"
            + "C. SỐ THÁNG\n"
            + "D. NGÀY THÁNG",
            ". Hàm nào tính số ngày giữa hai ngày?\n"
            + "\n"
            + "A. NGÀY THÊM\n"
            + "B. NGÀY TRỪ\n"
            + "C. HIỆU NGÀY\n"
            + "D. NGÀY GIỜ",
            ". Hàm nào thêm một khoảng thời gian vào một giá trị ngày tháng?\n"
            + "\n"
            + "A. THÊM NGÀY GIỜ\n"
            + "B. THÊM NGÀY\n"
            + "C. TRỪ NGÀY\n"
            + "D. HIỆU NGÀY",
            ". Hàm nào trả về ngày cuối cùng của tháng từ một giá trị ngày tháng?\n"
            + "\n"
            + "A. NGÀY ĐẦU THÁNG\n"
            + "B. NGÀY CUỐI THÁNG\n"
            + "C. NGÀY TRONG THÁNG\n"
            + "D. SỐ NGÀY TRONG THÁNG",
            ". Hàm nào trích xuất phần giờ từ một giá trị thời gian?\n"
            + "\n"
            + "A. PHÚT\n"
            + "B. GIÂY\n"
            + "C. GIỜ\n"
            + "D. NGÀY",
            ". Hàm nào trả về tên của ngày trong tuần từ một giá trị ngày tháng?\n"
            + "\n"
            + "A. NGÀY TRONG TUẦN\n"
            + "B. TÊN NGÀY TRONG TUẦN\n"
            + "C. THỨ NGÀY TRONG TUẦN\n"
            + "D. SỐ NGÀY TRONG TUẦN",
            ". Hàm nào định dạng một giá trị ngày tháng theo một mẫu cụ thể?\n"
            + "\n"
            + "A. ĐỊNH DẠNG NGÀY GIỜ\n"
            + "B. ĐỊNH DẠNG NGÀY THÁNG\n"
            + "C. KIỂU NGÀY THÁNG\n"
            + "D. CHUỖI NGÀY THÁNG",
            ". Hàm nào chuyển đổi một số thành giá trị ngày?\n"
            + "\n"
            + "A. NGÀY TỪ SỐ\n"
            + "B. SỐ THÀNH NGÀY\n"
            + "C. CHUYỂN NGÀY\n"
            + "D. CHUYỂN SỐ"
        });

        TITLE_MAP.put("PRIMARY KEY, FOREIGN KEY", new String[]{
            ". Khóa chính (Primary Key) được sử dụng để làm gì?\n"
            + "\n"
            + "A. Liên kết các bảng với nhau.\n"
            + "B. Xác định duy nhất mỗi bản ghi trong một bảng.\n"
            + "C. Lọc dữ liệu trong một truy vấn.\n"
            + "D. Sắp xếp dữ liệu trong một bảng.",
            ". Khóa ngoại (Foreign Key) được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định duy nhất mỗi bản ghi trong một bảng.\n"
            + "B. Liên kết một bảng với khóa chính của bảng khác.\n"
            + "C. Lọc dữ liệu trong một truy vấn.\n"
            + "D. Tạo một chỉ mục cho bảng.",
            ". Đặc điểm nào sau đây là đúng với Khóa chính (Primary Key)?\n"
            + "\n"
            + "A. Có thể chứa giá trị NULL.\n"
            + "B. Có thể có nhiều khóa chính trong một bảng.\n"
            + "C. Giá trị phải là duy nhất.\n"
            + "D. Không cần thiết phải có trong một bảng.",
            ". Đặc điểm nào sau đây là đúng với Khóa ngoại (Foreign Key)?\n"
            + "\n"
            + "A. Phải là duy nhất trong bảng chứa nó.\n"
            + "B. Không thể chứa giá trị NULL.\n"
            + "C. Tham chiếu đến khóa chính của bảng khác.\n"
            + "D. Chỉ có thể tham chiếu đến một cột trong cùng một bảng.",
            ". Điều gì xảy ra nếu bạn cố gắng chèn một bản ghi với giá trị Khóa chính (Primary Key) trùng lặp?\n"
            + "\n"
            + "A. Bản ghi sẽ được chèn và giá trị trùng lặp sẽ bị ghi đè.\n"
            + "B. Lỗi sẽ xảy ra và bản ghi sẽ không được chèn.\n"
            + "C. Bản ghi sẽ được chèn với một cảnh báo.\n"
            + "D. Hệ thống sẽ tự động tạo một giá trị Khóa chính mới.",
            ". Điều gì xảy ra nếu bạn cố gắng chèn một bản ghi với giá trị Khóa ngoại (Foreign Key) không tồn tại trong bảng được tham chiếu?\n"
            + "\n"
            + "A. Bản ghi sẽ được chèn và giá trị không tồn tại sẽ được đặt thành NULL.\n"
            + "B. Lỗi sẽ xảy ra và bản ghi sẽ không được chèn.\n"
            + "C. Bản ghi sẽ được chèn với một cảnh báo.\n"
            + "D. Hệ thống sẽ tự động tạo một giá trị Khóa chính mới trong bảng được tham chiếu.",
            ". Khóa chính (Primary Key) có thể được tạo từ bao nhiêu cột?\n"
            + "\n"
            + "A. Chỉ một cột.\n"
            + "B. Một hoặc nhiều cột.\n"
            + "C. Tối đa hai cột.\n"
            + "D. Tùy thuộc vào loại dữ liệu.",
            ". Khóa ngoại (Foreign Key) có thể tham chiếu đến bao nhiêu Khóa chính (Primary Key)?\n"
            + "\n"
            + "A. Chỉ một Khóa chính.\n"
            + "B. Một hoặc nhiều Khóa chính.\n"
            + "C. Tối đa hai Khóa chính.\n"
            + "D. Tùy thuộc vào loại dữ liệu.",
            ". Ràng buộc nào được sử dụng để tạo Khóa chính (Primary Key)?\n"
            + "\n"
            + "A. UNIQUE\n"
            + "B. NOT NULL\n"
            + "C. PRIMARY KEY\n"
            + "D. FOREIGN KEY",
            ". Ràng buộc nào được sử dụng để tạo Khóa ngoại (Foreign Key)?\n"
            + "\n"
            + "A. UNIQUE\n"
            + "B. NOT NULL\n"
            + "C. PRIMARY KEY\n"
            + "D. FOREIGN KEY"
        });

        TITLE_MAP.put("UNIQUE, CHECK, NOT NULL", new String[]{
            ". Ràng buộc UNIQUE có chức năng gì?\n"
            + "\n"
            + "A. Đảm bảo giá trị trong cột không được trùng lặp.\n"
            + "B. Đảm bảo giá trị trong cột không được rỗng.\n"
            + "C. Giới hạn phạm vi giá trị cho phép trong cột.\n"
            + "D. Xác định khóa chính cho bảng.",
            ". Ràng buộc CHECK được sử dụng để làm gì?\n"
            + "\n"
            + "A. Đảm bảo giá trị trong cột là duy nhất.\n"
            + "B. Đảm bảo cột không chứa giá trị NULL.\n"
            + "C. Kiểm tra giá trị của cột dựa trên một điều kiện cụ thể.\n"
            + "D. Liên kết bảng với bảng khác.",
            ". Ràng buộc NOT NULL có ý nghĩa gì?\n"
            + "\n"
            + "A. Cột không được phép chứa giá trị rỗng.\n"
            + "B. Cột phải chứa các giá trị duy nhất.\n"
            + "C. Cột chỉ được phép chứa các giá trị số.\n"
            + "D. Cột phải có giá trị mặc định.",
            ". Ràng buộc nào đảm bảo rằng mỗi hàng trong một cột có một giá trị khác nhau?\n"
            + "\n"
            + "A. NOT NULL\n"
            + "B. CHECK\n"
            + "C. UNIQUE\n"
            + "D. PRIMARY KEY",
            ". Ràng buộc nào được sử dụng để giới hạn giá trị của một cột trong một phạm vi cụ thể?\n"
            + "\n"
            + "A. UNIQUE\n"
            + "B. NOT NULL\n"
            + "C. CHECK\n"
            + "D. FOREIGN KEY",
            ". Ràng buộc nào ngăn không cho một cột chứa giá trị NULL?\n"
            + "\n"
            + "A. CHECK\n"
            + "B. UNIQUE\n"
            + "C. NOT NULL\n"
            + "D. DEFAULT",
            ". Ràng buộc nào thường được sử dụng để kiểm tra tuổi của người dùng phải lớn hơn 18?\n"
            + "\n"
            + "A. UNIQUE\n"
            + "B. NOT NULL\n"
            + "C. CHECK\n"
            + "D. FOREIGN KEY",
            ". Ràng buộc nào thường được sử dụng cho cột email trong bảng người dùng?\n"
            + "\n"
            + "A. NOT NULL và CHECK\n"
            + "B. UNIQUE và NOT NULL\n"
            + "C. CHECK và UNIQUE\n"
            + "D. FOREIGN KEY và NOT NULL",
            ". Ràng buộc nào thường được sử dụng để đảm bảo cột mã sản phẩm là duy nhất?\n"
            + "\n"
            + "A. NOT NULL\n"
            + "B. CHECK\n"
            + "C. UNIQUE\n"
            + "D. FOREIGN KEY",
            ". Ràng buộc nào thường được sử dụng để đảm bảo cột tên người dùng không bị bỏ trống?\n"
            + "\n"
            + "A. UNIQUE\n"
            + "B. CHECK\n"
            + "C. NOT NULL\n"
            + "D. FOREIGN KEY"
        });

        TITLE_MAP.put("DEFAULT", new String[]{
            ". Ràng buộc DEFAULT trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Đảm bảo giá trị duy nhất cho một cột.\n"
            + "B. Đặt một giá trị mặc định cho một cột khi không có giá trị nào được chỉ định.\n"
            + "C. Hạn chế các giá trị được phép trong một cột.\n"
            + "D. Tạo một khóa chính cho một bảng.",
            ". Khi nào giá trị mặc định được áp dụng cho một cột?\n"
            + "\n"
            + "A. Khi một giá trị NULL được chèn vào cột.\n"
            + "B. Khi một giá trị không hợp lệ được chèn vào cột.\n"
            + "C. Khi một bản ghi mới được tạo và không có giá trị nào được chỉ định cho cột đó.\n"
            + "D. Khi một giá trị hiện có trong cột được cập nhật thành NULL.",
            ". Ràng buộc DEFAULT có thể được sử dụng với loại dữ liệu nào?\n"
            + "\n"
            + "A. Chỉ số nguyên.\n"
            + "B. Chỉ chuỗi ký tự.\n"
            + "C. Bất kỳ loại dữ liệu nào.\n"
            + "D. Chỉ ngày tháng.",
            ". Nếu một cột có ràng buộc DEFAULT và một giá trị NULL được chèn vào, điều gì sẽ xảy ra?\n"
            + "\n"
            + "A. Lỗi xảy ra.\n"
            + "B. Giá trị mặc định được áp dụng.\n"
            + "C. Giá trị NULL được giữ nguyên.\n"
            + "D. Hệ thống sẽ bỏ qua việc chèn.",
            ". Lệnh SQL nào được sử dụng để thêm ràng buộc DEFAULT vào một cột hiện có?\n"
            + "\n"
            + "A. ALTER TABLE...ADD CONSTRAINT DEFAULT\n"
            + "B. CREATE TABLE...DEFAULT\n"
            + "C. UPDATE TABLE...DEFAULT\n"
            + "D. INSERT INTO...DEFAULT",
            ". Ràng buộc DEFAULT có thể được sử dụng để đặt giá trị mặc định là gì?\n"
            + "\n"
            + "A. Chỉ giá trị hằng số.\n"
            + "B. Chỉ giá trị của một cột khác.\n"
            + "C. Biểu thức hoặc hàm.\n"
            + "D. Tất cả các phương án trên đều đúng.",
            ". Điều gì xảy ra nếu bạn cố gắng chèn một giá trị không hợp lệ vào một cột có ràng buộc DEFAULT?\n"
            + "\n"
            + "A. Giá trị mặc định được áp dụng.\n"
            + "B. Lỗi xảy ra.\n"
            + "C. Giá trị không hợp lệ được chèn.\n"
            + "D. Hệ thống bỏ qua giá trị và chèn NULL.",
            ". Bạn có thể có bao nhiêu ràng buộc DEFAULT trên một cột?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Chỉ một.\n"
            + "C. Hai.\n"
            + "D. Tùy thuộc vào hệ quản trị cơ sở dữ liệu.",
            ". Ràng buộc DEFAULT được thực thi khi nào?\n"
            + "\n"
            + "A. Khi bảng được tạo.\n"
            + "B. Khi dữ liệu được truy xuất.\n"
            + "C. Khi dữ liệu được chèn hoặc cập nhật.\n"
            + "D. Khi bảng bị xóa.",
            ". Điều gì xảy ra nếu ràng buộc DEFAULT bị xóa khỏi một cột?\n"
            + "\n"
            + "A. Các giá trị mặc định hiện có bị xóa.\n"
            + "B. Các bản ghi hiện có được cập nhật với giá trị NULL.\n"
            + "C. Các bản ghi mới được chèn mà không có giá trị cho cột đó sẽ được đặt thành NULL.\n"
            + "D. Lỗi xảy ra khi cố gắng chèn các bản ghi mới."
        });

        TITLE_MAP.put("Tạo, xóa cơ sở dữ liệu", new String[]{
            ". Lệnh SQL nào được sử dụng để tạo một cơ sở dữ liệu mới?\n"
            + "\n"
            + "A. XÓA CƠ SỞ DỮ LIỆU\n"
            + "B. TẠO BẢNG\n"
            + "C. TẠO CƠ SỞ DỮ LIỆU\n"
            + "D. THAY ĐỔI CƠ SỞ DỮ LIỆU",
            ". Lệnh SQL nào được sử dụng để xóa một cơ sở dữ liệu hiện có?\n"
            + "\n"
            + "A. XÓA BẢNG\n"
            + "B. XÓA CƠ SỞ DỮ LIỆU\n"
            + "C. TẠO CƠ SỞ DỮ LIỆU\n"
            + "D. THAY ĐỔI CƠ SỞ DỮ LIỆU",
            ". Điều gì sẽ xảy ra nếu bạn cố gắng xóa một cơ sở dữ liệu đang được sử dụng?\n"
            + "\n"
            + "A. Cơ sở dữ liệu sẽ bị xóa mà không có cảnh báo.\n"
            + "B. Hệ thống sẽ hiển thị lỗi và không xóa cơ sở dữ liệu.\n"
            + "C. Hệ thống sẽ tự động đóng tất cả các kết nối và xóa cơ sở dữ liệu.\n"
            + "D. Hệ thống sẽ hỏi xác nhận trước khi xóa.",
            ". Lệnh SQL nào được sử dụng để chọn một cơ sở dữ liệu để sử dụng?\n"
            + "\n"
            + "A. CHỌN CƠ SỞ DỮ LIỆU\n"
            + "B. SỬ DỤNG CƠ SỞ DỮ LIỆU\n"
            + "C. MỞ CƠ SỞ DỮ LIỆU\n"
            + "D. KẾT NỐI CƠ SỞ DỮ LIỆU",
            ". Lệnh SQL nào được sử dụng để liệt kê tất cả các cơ sở dữ liệu trong máy chủ?\n"
            + "\n"
            + "A. LIỆT KÊ CƠ SỞ DỮ LIỆU\n"
            + "B. HIỂN THỊ CƠ SỞ DỮ LIỆU\n"
            + "C. XEM CƠ SỞ DỮ LIỆU\n"
            + "D. TÌM CƠ SỞ DỮ LIỆU",
            ". Ràng buộc nào được sử dụng để đảm bảo rằng cơ sở dữ liệu không bị xóa nếu nó chứa các bảng?\n"
            + "\n"
            + "A. KHÓA NGOẠI\n"
            + "B. KHÓA CHÍNH\n"
            + "C. RÀNG BUỘC THAM CHIẾU\n"
            + "D. RÀNG BUỘC DUY NHẤT",
            ". Lệnh SQL nào được sử dụng để thay đổi tên của một cơ sở dữ liệu?\n"
            + "\n"
            + "A. ĐỔI TÊN CƠ SỞ DỮ LIỆU\n"
            + "B. THAY ĐỔI TÊN CƠ SỞ DỮ LIỆU\n"
            + "C. CẬP NHẬT TÊN CƠ SỞ DỮ LIỆU\n"
            + "D. CHỈNH SỬA TÊN CƠ SỞ DỮ LIỆU",
            ". Lệnh SQL nào được sử dụng để tạo một bản sao của cơ sở dữ liệu?\n"
            + "\n"
            + "A. SAO CHÉP CƠ SỞ DỮ LIỆU\n"
            + "B. SAO LƯU CƠ SỞ DỮ LIỆU\n"
            + "C. TẠO BẢN SAO CƠ SỞ DỮ LIỆU\n"
            + "D. NHÂN BẢN CƠ SỞ DỮ LIỆU",
            ". Điều gì xảy ra với các bảng và dữ liệu trong một cơ sở dữ liệu khi cơ sở dữ liệu đó bị xóa?\n"
            + "\n"
            + "A. Các bảng và dữ liệu được di chuyển sang một cơ sở dữ liệu khác.\n"
            + "B. Các bảng và dữ liệu được giữ lại.\n"
            + "C. Các bảng và dữ liệu bị xóa vĩnh viễn.\n"
            + "D. Các bảng được giữ lại, nhưng dữ liệu bị xóa.",
            ". Lệnh SQL nào được sử dụng để kiểm tra xem một cơ sở dữ liệu có tồn tại hay không?\n"
            + "\n"
            + "A. KIỂM TRA CƠ SỞ DỮ LIỆU\n"
            + "B. XÁC NHẬN CƠ SỞ DỮ LIỆU\n"
            + "C. TÌM KIẾM CƠ SỞ DỮ LIỆU\n"
            + "D. HIỂN THỊ TRẠNG THÁI CƠ SỞ DỮ LIỆU"
        });

        TITLE_MAP.put("Sao lưu và phục hồi", new String[]{
            ". Mục đích chính của việc sao lưu cơ sở dữ liệu là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn\n"
            + "B. Bảo vệ dữ liệu khỏi mất mát\n"
            + "C. Tối ưu hóa hiệu suất\n"
            + "D. Giảm dung lượng lưu trữ",
            ". Loại sao lưu nào sao chép toàn bộ cơ sở dữ liệu?\n"
            + "\n"
            + "A. Sao lưu khác biệt\n"
            + "B. Sao lưu nhật ký giao dịch\n"
            + "C. Sao lưu đầy đủ\n"
            + "D. Sao lưu tệp",
            ". Loại sao lưu nào chỉ sao chép các thay đổi kể từ lần sao lưu đầy đủ cuối cùng?\n"
            + "\n"
            + "A. Sao lưu đầy đủ\n"
            + "B. Sao lưu nhật ký giao dịch\n"
            + "C. Sao lưu khác biệt\n"
            + "D. Sao lưu tệp",
            ". Nhật ký giao dịch (transaction log) được sử dụng để làm gì trong quá trình phục hồi?\n"
            + "\n"
            + "A. Lưu trữ dữ liệu sao lưu đầy đủ\n"
            + "B. Ghi lại tất cả các thay đổi đối với cơ sở dữ liệu\n"
            + "C. Tối ưu hóa truy vấn\n"
            + "D. Nén dữ liệu",
            ". Điểm phục hồi (recovery point) là gì?\n"
            + "\n"
            + "A. Vị trí lưu trữ dữ liệu sao lưu\n"
            + "B. Thời điểm cơ sở dữ liệu được khôi phục về trạng thái trước đó\n"
            + "C. Tốc độ sao lưu dữ liệu\n"
            + "D. Dung lượng dữ liệu sao lưu",
            ". Thủ tục nào được sử dụng để khôi phục cơ sở dữ liệu từ bản sao lưu?\n"
            + "\n"
            + "A. Sao lưu\n"
            + "B. Phục hồi\n"
            + "C. Nén\n"
            + "D. Mã hóa",
            ". Loại phục hồi nào cho phép khôi phục cơ sở dữ liệu đến một thời điểm cụ thể?\n"
            + "\n"
            + "A. Phục hồi đầy đủ\n"
            + "B. Phục hồi khác biệt\n"
            + "C. Phục hồi nhật ký giao dịch\n"
            + "D. Phục hồi đơn giản",
            ". Rủi ro nào liên quan đến việc không sao lưu cơ sở dữ liệu thường xuyên?\n"
            + "\n"
            + "A. Mất dữ liệu vĩnh viễn\n"
            + "B. Tăng tốc độ truy vấn\n"
            + "C. Tối ưu hóa hiệu suất\n"
            + "D. Giảm dung lượng lưu trữ",
            ". Công cụ nào thường được sử dụng để lên lịch và quản lý sao lưu cơ sở dữ liệu?\n"
            + "\n"
            + "A. Trình quản lý tác vụ\n"
            + "B. Trình quản lý sao lưu\n"
            + "C. Trình quản lý truy vấn\n"
            + "D. Trình quản lý hiệu suất",
            ". Mục tiêu thời gian phục hồi (RTO) đo lường điều gì?\n"
            + "\n"
            + "A. Tần suất sao lưu\n"
            + "B. Thời gian cần thiết để khôi phục cơ sở dữ liệu\n"
            + "C. Dung lượng dữ liệu sao lưu\n"
            + "D. Tốc độ truy vấn"
        });

        TITLE_MAP.put("Quản lý quyền truy cập", new String[]{
            ". Lệnh SQL nào được sử dụng để cấp quyền cho người dùng?\n"
            + "\n"
            + "A. THAY ĐỔI QUYỀN\n"
            + "B. CẤP QUYỀN\n"
            + "C. XÓA QUYỀN\n"
            + "D. THIẾT LẬP QUYỀN",
            ". Quyền nào cho phép người dùng đọc dữ liệu từ một bảng?\n"
            + "\n"
            + "A. CHÈN\n"
            + "B. CẬP NHẬT\n"
            + "C. CHỌN\n"
            + "D. XÓA",
            ". Quyền nào cho phép người dùng sửa đổi dữ liệu trong một bảng?\n"
            + "\n"
            + "A. CHÈN\n"
            + "B. CẬP NHẬT\n"
            + "C. CHỌN\n"
            + "D. XÓA",
            ". Quyền nào cho phép người dùng thêm bản ghi mới vào một bảng?\n"
            + "\n"
            + "A. CHÈN\n"
            + "B. CẬP NHẬT\n"
            + "C. CHỌN\n"
            + "D. XÓA",
            ". Quyền nào cho phép người dùng xóa bản ghi khỏi một bảng?\n"
            + "\n"
            + "A. CHÈN\n"
            + "B. CẬP NHẬT\n"
            + "C. CHỌN\n"
            + "D. XÓA",
            ". Lệnh SQL nào được sử dụng để thu hồi quyền từ người dùng?\n"
            + "\n"
            + "A. THAY ĐỔI QUYỀN\n"
            + "B. CẤP QUYỀN\n"
            + "C. THU HỒI QUYỀN\n"
            + "D. THIẾT LẬP QUYỀN",
            ". Vai trò của người quản trị cơ sở dữ liệu (DBA) là gì?\n"
            + "\n"
            + "A. Chỉ đọc dữ liệu\n"
            + "B. Chỉ sửa đổi dữ liệu\n"
            + "C. Quản lý quyền truy cập và bảo mật\n"
            + "D. Chỉ thêm dữ liệu",
            ". Khái niệm \"vai trò\" (role) trong SQL dùng để làm gì?\n"
            + "\n"
            + "A. Nhóm các quyền lại với nhau\n"
            + "B. Xác định người dùng duy nhất\n"
            + "C. Tạo bảng mới\n"
            + "D. Sao lưu dữ liệu",
            ". Điều gì xảy ra khi một người dùng không có quyền truy cập vào một bảng?\n"
            + "\n"
            + "A. Họ có thể xem cấu trúc bảng\n"
            + "B. Họ nhận được thông báo lỗi\n"
            + "C. Họ có thể yêu cầu quyền truy cập tự động\n"
            + "D. Họ có thể truy cập dữ liệu ẩn",
            ". Biện pháp nào dưới đây giúp tăng cường bảo mật quyền truy cập?\n"
            + "\n"
            + "A. Sử dụng mật khẩu yếu\n"
            + "B. Cấp quyền thừa cho người dùng\n"
            + "C. Áp dụng nguyên tắc quyền tối thiểu\n"
            + "D. Chia sẻ tài khoản người dùng"
        });

        TITLE_MAP.put("Tạo, xóa, sửa bảng", new String[]{
            ". Lệnh SQL nào được dùng để tạo một bảng mới?\n"
            + "\n"
            + "A. CẬP NHẬT BẢNG\n"
            + "B. TẠO BẢNG\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN BẢNG",
            ". Lệnh SQL nào được dùng để xóa một bảng?\n"
            + "\n"
            + "A. XÓA DỮ LIỆU BẢNG\n"
            + "B. XÓA BẢNG\n"
            + "C. CẮT BẢNG\n"
            + "D. LOẠI BỎ BẢNG",
            ". Lệnh SQL nào được dùng để thêm một cột mới vào bảng?\n"
            + "\n"
            + "A. CẬP NHẬT CỘT\n"
            + "B. THÊM CỘT\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN CỘT",
            ". Lệnh SQL nào được dùng để thay đổi kiểu dữ liệu của một cột trong bảng?\n"
            + "\n"
            + "A. CẬP NHẬT KIỂU DỮ LIỆU\n"
            + "B. THAY ĐỔI KIỂU DỮ LIỆU\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN KIỂU DỮ LIỆU",
            ". Lệnh SQL nào được dùng để đổi tên một bảng?\n"
            + "\n"
            + "A. CẬP NHẬT TÊN BẢNG\n"
            + "B. ĐỔI TÊN BẢNG\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN TÊN BẢNG",
            ". Lệnh SQL nào được dùng để xóa một cột khỏi bảng?\n"
            + "\n"
            + "A. XÓA CỘT\n"
            + "B. LOẠI BỎ CỘT\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CẮT CỘT",
            ". Lệnh SQL nào được dùng để thêm ràng buộc khóa chính cho một cột?\n"
            + "\n"
            + "A. THÊM KHÓA CHÍNH\n"
            + "B. TẠO KHÓA CHÍNH\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN KHÓA CHÍNH",
            ". Lệnh SQL nào được dùng để thêm ràng buộc khóa ngoại cho một cột?\n"
            + "\n"
            + "A. THÊM KHÓA NGOẠI\n"
            + "B. TẠO KHÓA NGOẠI\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN KHÓA NGOẠI",
            ". Lệnh SQL nào được dùng để xóa tất cả dữ liệu trong một bảng nhưng vẫn giữ lại cấu trúc bảng?\n"
            + "\n"
            + "A. XÓA DỮ LIỆU BẢNG\n"
            + "B. XÓA BẢNG\n"
            + "C. CẮT BẢNG\n"
            + "D. LOẠI BỎ BẢNG",
            ". Lệnh SQL nào được dùng để thêm ràng buộc giá trị duy nhất cho một cột?\n"
            + "\n"
            + "A. THÊM GIÁ TRỊ DUY NHẤT\n"
            + "B. TẠO GIÁ TRỊ DUY NHẤT\n"
            + "C. THAY ĐỔI BẢNG\n"
            + "D. CHÈN GIÁ TRỊ DUY NHẤT"
        });

        TITLE_MAP.put("Tăng giá trị tự động", new String[]{
            ". Tính năng tự động tăng giá trị thường được sử dụng cho loại cột nào?\n"
            + "\n"
            + "A. Cột văn bản\n"
            + "B. Cột ngày tháng\n"
            + "C. Cột số nguyên\n"
            + "D. Cột logic",
            ". Mục đích chính của việc sử dụng tự động tăng giá trị là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn\n"
            + "B. Đảm bảo tính duy nhất của dữ liệu\n"
            + "C. Giảm dung lượng lưu trữ\n"
            + "D. Cải thiện giao diện người dùng",
            ". Trong SQL, tự động tăng giá trị thường được kết hợp với loại ràng buộc nào?\n"
            + "\n"
            + "A. KHÓA NGOẠI\n"
            + "B. KHÓA CHÍNH\n"
            + "C. RÀNG BUỘC KIỂM TRA\n"
            + "D. RÀNG BUỘC DUY NHẤT",
            ". Khi một bản ghi mới được chèn vào bảng có cột tự động tăng giá trị, giá trị của cột đó sẽ như thế nào?\n"
            + "\n"
            + "A. Được người dùng chỉ định\n"
            + "B. Tự động tăng lên từ giá trị trước đó\n"
            + "C. Luôn là 0\n"
            + "D. Bằng giá trị lớn nhất trong bảng",
            ". Điều gì xảy ra nếu bạn cố gắng chèn một giá trị cụ thể vào một cột được thiết lập tự động tăng giá trị?\n"
            + "\n"
            + "A. Hệ thống sẽ bỏ qua giá trị của bạn và tự động tăng giá trị.\n"
            + "B. Hệ thống sẽ báo lỗi.\n"
            + "C. Hệ thống sẽ ghi đè giá trị tự động.\n"
            + "D. Hệ thống sẽ thêm giá trị của bạn vào chuỗi tự động tăng.",
            ". Thuộc tính nào xác định giá trị bắt đầu cho tự động tăng giá trị?\n"
            + "\n"
            + "A. START WITH\n"
            + "B. INCREMENT BY\n"
            + "C. MAXVALUE\n"
            + "D. CYCLE",
            ". Thuộc tính nào xác định bước nhảy giữa các giá trị tự động tăng?\n"
            + "\n"
            + "A. START WITH\n"
            + "B. INCREMENT BY\n"
            + "C. MAXVALUE\n"
            + "D. CYCLE",
            ". Trong hầu hết các hệ quản trị cơ sở dữ liệu, giá trị tự động tăng giá trị có thể đạt đến giới hạn nào?\n"
            + "\n"
            + "A. Giá trị tối đa của kiểu dữ liệu của cột\n"
            + "B. 1000\n"
            + "C. 10000\n"
            + "D. Không có giới hạn",
            ". Điều gì xảy ra khi giá trị tự động tăng giá trị đạt đến giới hạn tối đa?\n"
            + "\n"
            + "A. Hệ thống sẽ báo lỗi.\n"
            + "B. Hệ thống sẽ bắt đầu lại từ giá trị ban đầu.\n"
            + "C. Hệ thống sẽ ngừng thêm bản ghi mới.\n"
            + "D. Hệ thống sẽ thay đổi kiểu dữ liệu của cột.",
            ". Mục đích của việc đặt một giá trị bắt đầu cho tự động tăng giá trị là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn\n"
            + "B. Đảm bảo tính duy nhất của dữ liệu\n"
            + "C. Tùy chỉnh phạm vi giá trị\n"
            + "D. Giảm dung lượng lưu trữ"
        });

        TITLE_MAP.put("Tạo, xóa VIEW", new String[]{
            ". Lệnh SQL nào được sử dụng để tạo một VIEW?\n"
            + "\n"
            + "A. TẠO BẢNG\n"
            + "B. TẠO VIEW\n"
            + "C. TẠO CHỈ MỤC\n"
            + "D. TẠO THỦ TỤC",
            ". Mục đích chính của việc tạo VIEW trong SQL là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn\n"
            + "B. Đơn giản hóa các truy vấn phức tạp\n"
            + "C. Lưu trữ dữ liệu tạm thời\n"
            + "D. Tất cả các đáp án trên",
            ". Lệnh SQL nào được sử dụng để xóa một VIEW?\n"
            + "\n"
            + "A. XÓA BẢNG\n"
            + "B. XÓA VIEW\n"
            + "C. XÓA CHỈ MỤC\n"
            + "D. XÓA THỦ TỤC",
            ". VIEW có thể được tạo từ bao nhiêu bảng?\n"
            + "\n"
            + "A. Chỉ một bảng\n"
            + "B. Hai bảng\n"
            + "C. Nhiều bảng\n"
            + "D. Tùy thuộc vào hệ quản trị cơ sở dữ liệu",
            ". Điều gì xảy ra khi dữ liệu trong bảng cơ sở thay đổi và View được tạo từ bảng đó?\n"
            + "\n"
            + "A. VIEW không bị ảnh hưởng\n"
            + "B. VIEW tự động cập nhật\n"
            + "C. Cần cập nhật VIEW thủ công\n"
            + "D. VIEW bị xóa",
            ". VIEW có thể được sử dụng để làm gì?\n"
            + "\n"
            + "A. Thêm dữ liệu vào bảng\n"
            + "B. Cập nhật dữ liệu trong bảng\n"
            + "C. Truy vấn dữ liệu\n"
            + "D. Tất cả các đáp án trên",
            ". Lệnh SQL nào được sử dụng để thay đổi định nghĩa của một VIEW hiện có?\n"
            + "\n"
            + "A. THAY ĐỔI BẢNG\n"
            + "B. THAY ĐỔI VIEW\n"
            + "C. CẬP NHẬT VIEW\n"
            + "D. SỬA VIEW",
            ". VIEW được lưu trữ ở đâu?\n"
            + "\n"
            + "A. Trong bộ nhớ RAM\n"
            + "B. Trong tệp tạm thời\n"
            + "C. Trong cơ sở dữ liệu\n"
            + "D. Trong bộ nhớ cache của trình duyệt",
            ". VIEW có thể chứa loại câu lệnh SQL nào?\n"
            + "\n"
            + "A. Chỉ câu lệnh SELECT\n"
            + "B. Chỉ câu lệnh INSERT\n"
            + "C. Chỉ câu lệnh UPDATE\n"
            + "D. Tất cả các câu lệnh SQL",
            ". Điều gì xảy ra khi xóa một bảng mà VIEW được tạo từ bảng đó?\n"
            + "\n"
            + "A. VIEW vẫn tồn tại\n"
            + "B. VIEW tự động bị xóa\n"
            + "C. VIEW trở nên không hợp lệ\n"
            + "D. Hệ thống báo lỗi"
        });

        TITLE_MAP.put("JOIN", new String[]{
            "Loại JOIN nào trả về tất cả các hàng từ bảng bên trái và các hàng phù hợp từ bảng bên phải?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. FULL OUTER JOIN",
            "Loại JOIN nào chỉ trả về các hàng có giá trị phù hợp trong cả hai bảng?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. CROSS JOIN",
            "Loại JOIN nào trả về tất cả các hàng khi có sự phù hợp trong một trong hai bảng?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. FULL OUTER JOIN",
            "Loại JOIN nào tạo ra tích Descartes của hai bảng?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. CROSS JOIN",
            "Điều kiện nào được sử dụng để chỉ định cột nào sẽ được sử dụng để JOIN hai bảng?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ON\n"
            + "C. GROUP BY\n"
            + "D. ORDER BY",
            "Loại JOIN nào trả về tất cả các hàng từ bảng bên phải và các hàng phù hợp từ bảng bên trái?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. FULL OUTER JOIN",
            "JOIN nào được sử dụng để kết hợp các hàng từ cùng một bảng?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. SELF JOIN",
            "Trong một LEFT JOIN, nếu không có hàng phù hợp trong bảng bên phải, các cột từ bảng bên phải sẽ chứa giá trị nào?\n"
            + "\n"
            + "A. 0\n"
            + "B. NULL\n"
            + "C. \"\" (chuỗi rỗng)\n"
            + "D. Giá trị mặc định",
            "Loại JOIN nào trả về kết quả của INNER JOIN cộng với các hàng từ LEFT JOIN không phù hợp?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. FULL OUTER JOIN",
            "Loại JOIN nào trả về kết quả của INNER JOIN cộng với các hàng từ RIGHT JOIN không phù hợp?\n"
            + "\n"
            + "A. INNER JOIN\n"
            + "B. LEFT JOIN\n"
            + "C. RIGHT JOIN\n"
            + "D. FULL OUTER JOIN"
        });

        TITLE_MAP.put("SELF JOIN", new String[]{
            "Self Join là gì?\n"
            + "\n"
            + "A. Kết hợp dữ liệu từ hai bảng khác nhau.\n"
            + "B. Kết hợp dữ liệu từ một bảng với chính nó.\n"
            + "C. Lọc dữ liệu từ một bảng.\n"
            + "D. Sắp xếp dữ liệu từ một bảng.",
            "Khi nào nên sử dụng Self Join?\n"
            + "\n"
            + "A. Khi muốn kết hợp dữ liệu từ hai bảng có quan hệ khác nhau.\n"
            + "B. Khi muốn so sánh các hàng trong cùng một bảng.\n"
            + "C. Khi muốn lọc dữ liệu theo điều kiện.\n"
            + "D. Khi muốn sắp xếp dữ liệu theo thứ tự.",
            "Điều kiện nào thường được sử dụng trong Self Join?\n"
            + "\n"
            + "A. Điều kiện so sánh giữa các cột của hai bảng khác nhau.\n"
            + "B. Điều kiện so sánh giữa các cột của cùng một bảng.\n"
            + "C. Điều kiện lọc dữ liệu.\n"
            + "D. Điều kiện sắp xếp dữ liệu.",
            "Tại sao cần đặt bí danh (alias) cho bảng trong Self Join?\n"
            + "\n"
            + "A. Để tăng tốc độ truy vấn.\n"
            + "B. Để phân biệt các bản sao của cùng một bảng.\n"
            + "C. Để lọc dữ liệu dễ dàng hơn.\n"
            + "D. Để sắp xếp dữ liệu dễ dàng hơn.",
            "Loại Join nào thường được sử dụng trong Self Join?\n"
            + "\n"
            + "A. Full Outer Join.\n"
            + "B. Left Join.\n"
            + "C. Inner Join.\n"
            + "D. Cross Join.",
            "Kết quả của Self Join là gì?\n"
            + "\n"
            + "A. Một bảng mới với các cột từ hai bảng khác nhau.\n"
            + "B. Một bảng mới với các hàng so sánh từ cùng một bảng.\n"
            + "C. Một bảng đã được lọc dữ liệu.\n"
            + "D. Một bảng đã được sắp xếp dữ liệu.",
            "Trong một bảng nhân viên, bạn muốn tìm những nhân viên có cùng người quản lý. Loại Join nào phù hợp?\n"
            + "\n"
            + "A. Left Join.\n"
            + "B. Full Outer Join.\n"
            + "C. Self Join.\n"
            + "D. Cross Join.",
            "Khi sử dụng Self Join, bạn cần đặt bí danh cho bảng mấy lần?\n"
            + "\n"
            + "A. 1 lần.\n"
            + "B. 2 lần.\n"
            + "C. 3 lần.\n"
            + "D. 4 lần.",
            "Mục đích chính của việc sử dụng Self Join là gì?\n"
            + "\n"
            + "A. Để kết hợp dữ liệu từ các bảng khác nhau.\n"
            + "B. Để so sánh các hàng dữ liệu trong cùng một bảng.\n"
            + "C. Để lọc dữ liệu từ bảng.\n"
            + "D. Để sắp xếp dữ liệu từ bảng.",
            "Trong một bảng các chuyến bay, bạn muốn tìm các chuyến bay có cùng điểm đến. Loại Join nào phù hợp?\n"
            + "\n"
            + "A. Left Join.\n"
            + "B. Full Outer Join.\n"
            + "C. Self Join.\n"
            + "D. Cross Join."
        });

        TITLE_MAP.put("UNION", new String[]{
            "Toán tử UNION trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Kết hợp các hàng từ hai hoặc nhiều bảng, loại bỏ các hàng trùng lặp.\n"
            + "B. Lọc các hàng từ một bảng dựa trên điều kiện.\n"
            + "C. Sắp xếp các hàng trong một bảng.\n"
            + "D. Cập nhật dữ liệu trong một bảng.",
            "Điều kiện nào sau đây là bắt buộc khi sử dụng toán tử UNION?\n"
            + "\n"
            + "A. Các bảng phải có cùng số cột.\n"
            + "B. Các cột tương ứng phải có cùng kiểu dữ liệu.\n"
            + "C. Cả A và B.\n"
            + "D. Không có điều kiện nào.",
            "Sự khác biệt chính giữa UNION và UNION ALL là gì?\n"
            + "\n"
            + "A. UNION loại bỏ các hàng trùng lặp, UNION ALL giữ lại tất cả các hàng.\n"
            + "B. UNION sắp xếp các hàng, UNION ALL không sắp xếp.\n"
            + "C. UNION chỉ làm việc với hai bảng, UNION ALL có thể làm việc với nhiều bảng.\n"
            + "D. UNION yêu cầu các cột phải có cùng tên, UNION ALL không yêu cầu.",
            "Mệnh đề nào sau đây có thể được sử dụng với toán tử UNION để sắp xếp kết quả?\n"
            + "\n"
            + "A. ORDER BY\n"
            + "B. GROUP BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            "Toán tử UNION có thể được sử dụng để kết hợp kết quả từ bao nhiêu câu lệnh SELECT?\n"
            + "\n"
            + "A. Chỉ hai câu lệnh.\n"
            + "B. Tối đa ba câu lệnh.\n"
            + "C. Bất kỳ số lượng câu lệnh nào.\n"
            + "D. Chỉ một câu lệnh.",
            "Điều gì xảy ra nếu kiểu dữ liệu của các cột tương ứng trong các câu lệnh SELECT không khớp nhau?\n"
            + "\n"
            + "A. Lỗi sẽ xảy ra.\n"
            + "B. SQL sẽ tự động chuyển đổi kiểu dữ liệu.\n"
            + "C. Chỉ các hàng có kiểu dữ liệu khớp nhau được trả về.\n"
            + "D. Kết quả sẽ không được trả về.",
            "Toán tử UNION có thể được sử dụng với các bảng từ các cơ sở dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có, nếu các cơ sở dữ liệu được liên kết.\n"
            + "B. Không, chỉ có thể sử dụng với các bảng trong cùng một cơ sở dữ liệu.\n"
            + "C. Chỉ có thể sử dụng với các bảng có cùng tên.\n"
            + "D. Chỉ có thể sử dụng với các bảng có cùng cấu trúc.",
            "Mệnh đề nào sau đây được sử dụng để lọc các hàng trước khi áp dụng toán tử UNION?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. HAVING\n"
            + "C. GROUP BY\n"
            + "D. ORDER BY",
            "Kết quả của toán tử UNION có thể chứa các giá trị NULL không?\n"
            + "\n"
            + "A. Có, nếu các cột tương ứng trong các bảng có giá trị NULL.\n"
            + "B. Không, các giá trị NULL sẽ bị loại bỏ.\n"
            + "C. Chỉ khi sử dụng UNION ALL.\n"
            + "D. Chỉ khi sử dụng ORDER BY.",
            "Toán tử UNION thường được sử dụng trong trường hợp nào?\n"
            + "\n"
            + "A. Kết hợp dữ liệu từ nhiều nguồn có cấu trúc tương tự.\n"
            + "B. Lọc dữ liệu từ một bảng duy nhất.\n"
            + "C. Cập nhật dữ liệu trong một bảng.\n"
            + "D. Tạo bảng mới."
        });

        TITLE_MAP.put("GROUP BY", new String[]{
            "Mệnh đề GROUP BY được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lọc các hàng trong một bảng.\n"
            + "B. Sắp xếp các hàng trong một bảng.\n"
            + "C. Nhóm các hàng có giá trị cột giống nhau.\n"
            + "D. Kết hợp các bảng.",
            "Hàm nào sau đây thường được sử dụng với mệnh đề GROUP BY?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. HAVING\n"
            + "D. JOIN",
            "Mệnh đề nào được sử dụng để lọc các nhóm được tạo bởi GROUP BY?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. HAVING\n"
            + "D. JOIN",
            "Mệnh đề GROUP BY phải được đặt ở vị trí nào trong câu lệnh SELECT?\n"
            + "\n"
            + "A. Trước mệnh đề WHERE.\n"
            + "B. Sau mệnh đề WHERE.\n"
            + "C. Sau mệnh đề ORDER BY.\n"
            + "D. Bất kỳ vị trí nào.",
            "Hàm tổng hợp nào sau đây tính số lượng hàng trong một nhóm?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm tổng hợp nào sau đây tính giá trị trung bình của một cột trong một nhóm?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MIN()",
            "Hàm tổng hợp nào sau đây tìm giá trị lớn nhất của một cột trong một nhóm?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm tổng hợp nào sau đây tính tổng giá trị của một cột trong một nhóm?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MIN()",
            "Mệnh đề GROUP BY có thể được sử dụng với bao nhiêu cột?\n"
            + "\n"
            + "A. Chỉ một cột.\n"
            + "B. Hai cột.\n"
            + "C. Nhiều cột.\n"
            + "D. Không giới hạn số cột.",
            "Khi sử dụng GROUP BY, các cột không được sử dụng trong hàm tổng hợp phải xuất hiện ở đâu?\n"
            + "\n"
            + "A. Trong mệnh đề WHERE.\n"
            + "B. Trong mệnh đề ORDER BY.\n"
            + "C. Trong mệnh đề GROUP BY.\n"
            + "D. Trong mệnh đề HAVING."
        });

        TITLE_MAP.put("Hàm tổng hợp", new String[]{
            "Hàm nào sau đây được sử dụng để tính tổng các giá trị trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm nào sau đây được sử dụng để tính giá trị trung bình của các giá trị trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MIN()",
            "Hàm nào sau đây được sử dụng để đếm số lượng hàng trong một bảng?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm nào sau đây được sử dụng để tìm giá trị lớn nhất trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm nào sau đây được sử dụng để tìm giá trị nhỏ nhất trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MIN()",
            "Hàm nào sau đây được sử dụng để đếm số lượng giá trị khác NULL trong một cột?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. COUNT(tên_cột)",
            "Mệnh đề nào sau đây được sử dụng để nhóm các hàng có cùng giá trị trong một cột?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. GROUP BY\n"
            + "D. HAVING",
            "Mệnh đề nào sau đây được sử dụng để lọc các nhóm được tạo bởi mệnh đề GROUP BY?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. GROUP BY\n"
            + "D. HAVING",
            "Hàm tổng hợp nào sau đây có thể được sử dụng với dữ liệu kiểu chuỗi?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MAX()",
            "Hàm tổng hợp nào sau đây không thể được sử dụng với dữ liệu kiểu số?\n"
            + "\n"
            + "A. SUM()\n"
            + "B. AVG()\n"
            + "C. COUNT()\n"
            + "D. MIN()"
        });

        TITLE_MAP.put("HAVING", new String[]{
            "Mệnh đề HAVING được sử dụng để làm gì trong SQL?\n"
            + "\n"
            + "A. Lọc các hàng riêng lẻ trước khi nhóm.\n"
            + "B. Lọc các nhóm sau khi nhóm.\n"
            + "C. Sắp xếp kết quả truy vấn.\n"
            + "D. Chọn các cột từ bảng.",
            "Mệnh đề HAVING thường được sử dụng cùng với mệnh đề nào?\n"
            + "\n"
            + "A. WHERE\n"
            + "B. ORDER BY\n"
            + "C. GROUP BY\n"
            + "D. JOIN",
            "Điều kiện trong mệnh đề HAVING được áp dụng cho:\n"
            + "\n"
            + "A. Từng hàng trong bảng.\n"
            + "B. Các nhóm được tạo bởi GROUP BY.\n"
            + "C. Tất cả các hàng trong bảng.\n"
            + "D. Các cột được chọn.",
            "Hàm tổng hợp nào thường được sử dụng trong mệnh đề HAVING?\n"
            + "\n"
            + "A. CONCAT\n"
            + "B. SUBSTRING\n"
            + "C. AVG\n"
            + "D. REPLACE",
            "Mệnh đề HAVING có thể được sử dụng mà không có mệnh đề GROUP BY không?\n"
            + "\n"
            + "A. Có, luôn luôn.\n"
            + "B. Có, nhưng chỉ trong một số trường hợp.\n"
            + "C. Không.\n"
            + "D. Chỉ khi sử dụng hàm COUNT.",
            "Sự khác biệt chính giữa mệnh đề WHERE và HAVING là gì?\n"
            + "\n"
            + "A. WHERE lọc hàng, HAVING lọc nhóm.\n"
            + "B. WHERE lọc nhóm, HAVING lọc hàng.\n"
            + "C. WHERE chỉ dùng với số, HAVING dùng với chuỗi.\n"
            + "D. WHERE dùng trước GROUP BY, HAVING dùng sau GROUP BY.",
            "Mệnh đề HAVING được sử dụng để lọc các nhóm dựa trên:\n"
            + "\n"
            + "A. Giá trị của các cột riêng lẻ.\n"
            + "B. Kết quả của các hàm tổng hợp.\n"
            + "C. Thứ tự của các hàng.\n"
            + "D. Kiểu dữ liệu của các cột.",
            "Cú pháp nào sau đây là đúng khi sử dụng mệnh đề HAVING?\n"
            + "\n"
            + "A. SELECT column1 FROM table1 WHERE condition HAVING condition;\n"
            + "B. SELECT column1 FROM table1 GROUP BY column1 HAVING condition WHERE condition;\n"
            + "C. SELECT column1 FROM table1 GROUP BY column1 HAVING condition;\n"
            + "D. SELECT column1 FROM table1 HAVING condition GROUP BY column1;",
            "Mệnh đề HAVING có thể sử dụng các toán tử logic nào?\n"
            + "\n"
            + "A. AND, OR, NOT\n"
            + "B. +, -, *, /\n"
            + "C. LIKE, IN, BETWEEN\n"
            + "D. JOIN, UNION, INTERSECT",
            "Khi nào mệnh đề HAVING được thực thi trong một câu truy vấn SQL?\n"
            + "\n"
            + "A. Trước mệnh đề WHERE.\n"
            + "B. Sau mệnh đề WHERE và GROUP BY.\n"
            + "C. Trước mệnh đề GROUP BY.\n"
            + "D. Sau mệnh đề ORDER BY."
        });

        TITLE_MAP.put("UPPER, LOWER", new String[]{
            "Hàm UPPER trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Chuyển đổi chuỗi thành chữ thường.\n"
            + "B. Chuyển đổi chuỗi thành chữ hoa.\n"
            + "C. Loại bỏ khoảng trắng khỏi chuỗi.\n"
            + "D. Đếm số ký tự trong chuỗi.",
            "Hàm LOWER trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Chuyển đổi chuỗi thành chữ hoa.\n"
            + "B. Chuyển đổi chuỗi thành chữ thường.\n"
            + "C. Thêm khoảng trắng vào chuỗi.\n"
            + "D. Tìm kiếm một chuỗi con trong một chuỗi.",
            "Kết quả của câu lệnh SELECT UPPER('sql tutorial') là gì?\n"
            + "\n"
            + "A. sql tutorial\n"
            + "B. SQL tutorial\n"
            + "C. SQL TUTORIAL\n"
            + "D. Sql Tutorial",
            "Kết quả của câu lệnh SELECT LOWER('SQL TUTORIAL') là gì?\n"
            + "\n"
            + "A. sql tutorial\n"
            + "B. SQL tutorial\n"
            + "C. SQL TUTORIAL\n"
            + "D. Sql Tutorial",
            "Hàm nào sau đây được sử dụng để chuyển đổi tên cột \"TenKhachHang\" thành chữ hoa?\n"
            + "\n"
            + "A. CHANGE_CASE(TenKhachHang, 'UPPER')\n"
            + "B. UCASE(TenKhachHang)\n"
            + "C. UPPER(TenKhachHang)\n"
            + "D. TO_UPPER(TenKhachHang)",
            "Hàm nào sau đây được sử dụng để chuyển đổi tên cột \"TenSanPham\" thành chữ thường?\n"
            + "\n"
            + "A. CHANGE_CASE(TenSanPham, 'LOWER')\n"
            + "B. LCASE(TenSanPham)\n"
            + "C. LOWER(TenSanPham)\n"
            + "D. TO_LOWER(TenSanPham)",
            "Giả sử cột \"Email\" có giá trị 'User@Example.Com', kết quả của SELECT LOWER(Email) là gì?\n"
            + "\n"
            + "A. User@Example.Com\n"
            + "B. [đã xoá địa chỉ email]\n"
            + "C. USER@EXAMPLE.COM\n"
            + "D. Không có kết quả nào.",
            "Giả sử cột \"MaSo\" có giá trị 'aB12Cd', kết quả của SELECT UPPER(MaSo) là gì?\n"
            + "\n"
            + "A. ab12cd\n"
            + "B. AB12CD\n"
            + "C. Ab12Cd\n"
            + "D. aB12Cd",
            "Hàm UPPER và LOWER thường được sử dụng trong mệnh đề nào của câu lệnh SQL?\n"
            + "\n"
            + "A. FROM\n"
            + "B. WHERE\n"
            + "C. GROUP BY\n"
            + "D. ORDER BY",
            "Mục đích chính của việc sử dụng hàm UPPER hoặc LOWER trong câu lệnh SQL là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn.\n"
            + "B. Định dạng dữ liệu để so sánh hoặc hiển thị.\n"
            + "C. Mã hóa dữ liệu.\n"
            + "D. Nén dữ liệu."
        });

        TITLE_MAP.put("SUBSTRING", new String[]{
            "Hàm SUBSTRING trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Trả về độ dài của một chuỗi.\n"
            + "B. Trích xuất một phần của chuỗi.\n"
            + "C. Tìm kiếm một chuỗi con trong một chuỗi.\n"
            + "D. Thay thế một chuỗi con bằng một chuỗi khác.",
            "Cú pháp cơ bản của hàm SUBSTRING là gì?\n"
            + "\n"
            + "A. SUBSTRING(chuỗi, độ dài, vị trí)\n"
            + "B. SUBSTRING(chuỗi, vị trí, độ dài)\n"
            + "C. SUBSTRING(độ dài, chuỗi, vị trí)\n"
            + "D. SUBSTRING(vị trí, chuỗi, độ dài)",
            "Nếu bạn muốn trích xuất 5 ký tự đầu tiên từ chuỗi \"SQL Tutorial\", bạn sẽ sử dụng hàm SUBSTRING như thế nào?\n"
            + "\n"
            + "A. SUBSTRING('SQL Tutorial', 5, 1)\n"
            + "B. SUBSTRING('SQL Tutorial', 1, 5)\n"
            + "C. SUBSTRING('SQL Tutorial', 6, 5)\n"
            + "D. SUBSTRING('SQL Tutorial', 5, 6)",
            "Kết quả của câu lệnh SUBSTRING('Database', 4, 3) là gì?\n"
            + "\n"
            + "A. 'Dat'\n"
            + "B. 'abas'\n"
            + "C. 'tabase'\n"
            + "D. 'tab'",
            "Hàm SUBSTRING có thể được sử dụng với kiểu dữ liệu nào?\n"
            + "\n"
            + "A. Chỉ số nguyên.\n"
            + "B. Chỉ ngày tháng.\n"
            + "C. Chỉ chuỗi ký tự.\n"
            + "D. Tất cả các kiểu dữ liệu.",
            "Nếu vị trí bắt đầu trong hàm SUBSTRING lớn hơn độ dài của chuỗi, kết quả sẽ là gì?\n"
            + "\n"
            + "A. Một lỗi sẽ xảy ra.\n"
            + "B. Trả về chuỗi gốc.\n"
            + "C. Trả về một chuỗi rỗng.\n"
            + "D. Trả về NULL.",
            "Nếu độ dài trong hàm SUBSTRING vượt quá số ký tự còn lại của chuỗi, kết quả sẽ là gì?\n"
            + "\n"
            + "A. Một lỗi sẽ xảy ra.\n"
            + "B. Trả về chuỗi con từ vị trí bắt đầu đến cuối chuỗi.\n"
            + "C. Trả về chuỗi gốc.\n"
            + "D. Trả về NULL.",
            "Hàm SUBSTRING có phân biệt chữ hoa chữ thường không?\n"
            + "\n"
            + "A. Luôn phân biệt.\n"
            + "B. Không bao giờ phân biệt.\n"
            + "C. Tùy thuộc vào cài đặt máy chủ SQL.\n"
            + "D. Chỉ phân biệt trong một số phiên bản SQL.",
            "Hàm SUBSTRING có thể được sử dụng trong mệnh đề nào của câu lệnh SQL?\n"
            + "\n"
            + "A. Chỉ SELECT.\n"
            + "B. Chỉ WHERE.\n"
            + "C. Cả SELECT và WHERE.\n"
            + "D. Chỉ ORDER BY.",
            "Hàm SUBSTRING có thể trích xuất chuỗi con từ cuối chuỗi trở về không?\n"
            + "\n"
            + "A. Có, sử dụng chỉ số âm cho vị trí bắt đầu.\n"
            + "B. Không.\n"
            + "C. Có, sử dụng hàm RIGHT thay vì SUBSTRING.\n"
            + "D. Chỉ trong một số phiên bản SQL."
        });

        TITLE_MAP.put("ROUND", new String[]{
            " Hàm ROUND(123.456, 2) trả về giá trị nào?\n"
            + "\n"
            + "A. 123\n"
            + "B. 123.45\n"
            + "C. 123.46\n"
            + "D. 123.5",
            " Hàm ROUND(123.456, 0) trả về giá trị nào?\n"
            + "\n"
            + "A. 123\n"
            + "B. 124\n"
            + "C. 123.46\n"
            + "D. 123.5",
            " Hàm ROUND(123.456, -1) trả về giá trị nào?\n"
            + "\n"
            + "A. 120\n"
            + "B. 130\n"
            + "C. 123\n"
            + "D. 123.5",
            " Hàm ROUND(123.567, 2) trả về giá trị nào?\n"
            + "\n"
            + "A. 123.56\n"
            + "B. 123.57\n"
            + "C. 123.6\n"
            + "D. 124",
            " Hàm ROUND(123.567, 0) trả về giá trị nào?\n"
            + "\n"
            + "A. 123\n"
            + "B. 124\n"
            + "C. 123.6\n"
            + "D. 123.5",
            " Hàm ROUND(123.567, -1) trả về giá trị nào?\n"
            + "\n"
            + "A. 120\n"
            + "B. 130\n"
            + "C. 124\n"
            + "D. 123.5",
            " Hàm ROUND(123.456, 1) trả về giá trị nào?\n"
            + "\n"
            + "A. 123.4\n"
            + "B. 123.5\n"
            + "C. 123.46\n"
            + "D. 124",
            " Hàm ROUND(123.546, 1) trả về giá trị nào?\n"
            + "\n"
            + "A. 123.4\n"
            + "B. 123.5\n"
            + "C. 123.6\n"
            + "D. 124",
            " Hàm ROUND(123.999, 0) trả về giá trị nào?\n"
            + "\n"
            + "A. 123\n"
            + "B. 124\n"
            + "C. 123.99\n"
            + "D. 123.10",
            " Hàm ROUND(123.999, 1) trả về giá trị nào?\n"
            + "\n"
            + "A. 123.9\n"
            + "B. 124.0\n"
            + "C. 124\n"
            + "D. 123"
        });

        TITLE_MAP.put("NOW, DATE_FORMAT", new String[]{
            " Hàm NOW() trong SQL trả về giá trị nào?\n"
            + "\n"
            + "A. Ngày hiện tại\n"
            + "B. Thời gian hiện tại\n"
            + "C. Ngày và giờ hiện tại\n"
            + "D. Tên của người dùng hiện tại",
            " Hàm DATE_FORMAT() được sử dụng để làm gì?\n"
            + "\n"
            + "A. Tính toán khoảng thời gian giữa hai ngày.\n"
            + "B. Lấy ngày hiện tại từ hệ thống.\n"
            + "C. Định dạng ngày/giờ theo một định dạng cụ thể.\n"
            + "D. Lọc dữ liệu theo điều kiện ngày tháng.",
            " Định dạng nào sau đây biểu diễn ngày theo dạng \"Ngày/Tháng/Năm\" trong DATE_FORMAT()?\n"
            + "\n"
            + "A. YYYY-MM-DD\n"
            + "B. DD/MM/YYYY\n"
            + "C. MM/DD/YYYY\n"
            + "D. YYYY/MM/DD",
            " Ký tự nào sau đây được sử dụng để biểu diễn năm có 4 chữ số trong DATE_FORMAT()?\n"
            + "\n"
            + "A. YY\n"
            + "B. YYYY\n"
            + "C. Y\n"
            + "D. YY-YYYY",
            " Ký tự nào sau đây được sử dụng để biểu diễn tháng dạng chữ viết tắt (ví dụ: Jan, Feb) trong DATE_FORMAT()?\n"
            + "\n"
            + "A. %M\n"
            + "B. %m\n"
            + "C. %b\n"
            + "D. %B",
            " Ký tự nào sau đây được sử dụng để biểu diễn giờ (00-23) trong DATE_FORMAT()?\n"
            + "\n"
            + "A. %H\n"
            + "B. %h\n"
            + "C. %I\n"
            + "D. %i",
            " Ký tự nào sau đây được sử dụng để biểu diễn phút (00-59) trong DATE_FORMAT()?\n"
            + "\n"
            + "A. %M\n"
            + "B. %m\n"
            + "C. %i\n"
            + "D. %I",
            " Ký tự nào sau đây được sử dụng để biểu diễn giây (00-59) trong DATE_FORMAT()?\n"
            + "\n"
            + "A. %s\n"
            + "B. %S\n"
            + "C. %ss\n"
            + "D. %SS",
            " Để lấy ngày hiện tại và định dạng theo \"Ngày, Tháng Năm\" (ví dụ: 25, Tháng 10 2023), cú pháp SQL nào sau đây là đúng?\n"
            + "\n"
            + "A. DATE_FORMAT(NOW(), 'DD, MM YYYY')\n"
            + "B. DATE_FORMAT(NOW(), '%d, %m %Y')\n"
            + "C. DATE_FORMAT(NOW(), '%d, %M %Y')\n"
            + "D. DATE_FORMAT(NOW(), '%DD, %MM %YYYY')",
            " Kết quả trả về của câu lệnh SELECT DATE_FORMAT(NOW(), '%W') là gì?\n"
            + "\n"
            + "A. Ngày trong tháng (ví dụ: 25)\n"
            + "B. Tên đầy đủ của tháng (ví dụ: Tháng Mười)\n"
            + "C. Tên đầy đủ của ngày trong tuần (ví dụ: Thứ Tư)\n"
            + "D. Năm hiện tại (ví dụ: 2023)"
        });

        TITLE_MAP.put("SELECT INTO", new String[]{
            "Lệnh SELECT INTO được sử dụng để làm gì?\n"
            + "\n"
            + "A. Sao chép dữ liệu từ một bảng sang bảng mới.\n"
            + "B. Cập nhật dữ liệu trong một bảng.\n"
            + "C. Xóa dữ liệu khỏi một bảng.\n"
            + "D. Tạo một bảng mới mà không có dữ liệu.",
            "Cú pháp nào sau đây là đúng cho lệnh SELECT INTO?\n"
            + "\n"
            + "A. SELECT * FROM table1 INTO table2;\n"
            + "B. INTO table2 SELECT * FROM table1;\n"
            + "C. CREATE TABLE table2 SELECT * FROM table1;\n"
            + "D. INSERT INTO table2 SELECT * FROM table1;",
            "Điều gì xảy ra nếu bảng đích (table2) đã tồn tại khi sử dụng SELECT INTO?\n"
            + "\n"
            + "A. Dữ liệu sẽ được thêm vào bảng hiện có.\n"
            + "B. Lỗi sẽ xảy ra.\n"
            + "C. Bảng hiện có sẽ bị ghi đè.\n"
            + "D. Tên bảng sẽ được đổi tự động.",
            "Lệnh SELECT INTO có sao chép các ràng buộc (constraints) từ bảng nguồn sang bảng đích không?\n"
            + "\n"
            + "A. Có, tất cả các ràng buộc đều được sao chép.\n"
            + "B. Chỉ các ràng buộc NOT NULL được sao chép.\n"
            + "C. Không, các ràng buộc không được sao chép.\n"
            + "D. Chỉ các ràng buộc khóa chính (primary key) được sao chép.",
            "Lệnh SELECT INTO có thể được sử dụng để sao chép dữ liệu từ nhiều bảng không?\n"
            + "\n"
            + "A. Có, bằng cách sử dụng JOIN.\n"
            + "B. Không, chỉ có thể sao chép từ một bảng.\n"
            + "C. Chỉ có thể sao chép từ hai bảng.\n"
            + "D. Chỉ có thể sao chép khi các bảng có cùng cấu trúc.",
            "Khi sử dụng SELECT INTO, kiểu dữ liệu của các cột trong bảng đích được xác định như thế nào?\n"
            + "\n"
            + "A. Phải được chỉ định rõ ràng.\n"
            + "B. Tự động dựa trên kiểu dữ liệu của các cột trong bảng nguồn.\n"
            + "C. Luôn là kiểu VARCHAR.\n"
            + "D. Luôn là kiểu INT.",
            "Điều gì xảy ra nếu lệnh SELECT INTO cố gắng sao chép dữ liệu không tương thích với kiểu dữ liệu của cột trong bảng đích?\n"
            + "\n"
            + "A. Dữ liệu không tương thích sẽ bị bỏ qua.\n"
            + "B. Lỗi sẽ xảy ra.\n"
            + "C. Dữ liệu sẽ được tự động chuyển đổi.\n"
            + "D. Bảng đích sẽ được tạo với kiểu dữ liệu mới.",
            "Lệnh SELECT INTO có thể được sử dụng để sao chép một phần dữ liệu từ bảng nguồn không?\n"
            + "\n"
            + "A. Có, bằng cách sử dụng mệnh đề WHERE.\n"
            + "B. Không, phải sao chép toàn bộ dữ liệu.\n"
            + "C. Chỉ có thể sao chép một cột.\n"
            + "D. Chỉ có thể sao chép các hàng đầu tiên.",
            "Trong Microsoft SQL Server, lệnh SELECT INTO tạo ra một bảng mới trong cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. Cơ sở dữ liệu hiện tại.\n"
            + "B. Cơ sở dữ liệu hệ thống (system database).\n"
            + "C. Cơ sở dữ liệu tạm thời (tempdb).\n"
            + "D. Bất kỳ cơ sở dữ liệu nào được chỉ định.",
            "Lệnh SELECT INTO có thể được sử dụng trong các hệ quản trị cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. Chỉ trong MySQL.\n"
            + "B. Chỉ trong PostgreSQL.\n"
            + "C. Trong Microsoft SQL Server, MySQL và PostgreSQL.\n"
            + "D. Chỉ trong Microsoft SQL Server."
        });

        TITLE_MAP.put("INSERT INTO SELECT", new String[]{
            "Câu lệnh SQL nào được sử dụng để sao chép dữ liệu từ một bảng sang bảng khác?\n"
            + "\n"
            + "A. UPDATE\n"
            + "B. DELETE\n"
            + "C. INSERT INTO SELECT\n"
            + "D. CREATE TABLE",
            "Điều kiện nào là bắt buộc khi sử dụng INSERT INTO SELECT?\n"
            + "\n"
            + "A. Số lượng cột trong hai bảng phải khác nhau.\n"
            + "B. Kiểu dữ liệu của các cột tương ứng phải tương thích.\n"
            + "C. Tên bảng phải giống nhau.\n"
            + "D. Thứ tự các cột phải khác nhau.",
            "Mệnh đề nào được sử dụng để lọc dữ liệu từ bảng nguồn trong câu lệnh INSERT INTO SELECT?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            "Nếu số lượng cột trong bảng đích ít hơn số lượng cột trong bảng nguồn, điều gì sẽ xảy ra?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Các cột còn thiếu trong bảng đích sẽ được gán giá trị NULL.\n"
            + "C. Các cột còn thiếu trong bảng nguồn sẽ bị bỏ qua.\n"
            + "D. Câu lệnh sẽ thực hiện thành công.",
            "Điều gì xảy ra với các bản ghi hiện có trong bảng đích khi sử dụng INSERT INTO SELECT?\n"
            + "\n"
            + "A. Chúng bị xóa.\n"
            + "B. Chúng bị ghi đè.\n"
            + "C. Chúng không bị ảnh hưởng.\n"
            + "D. Chúng được sao lưu.",
            "Câu lệnh nào sau đây dùng để sao chép tất cả dữ liệu từ bảng Customers vào bảng CustomerBackup?\n"
            + "\n"
            + "A. INSERT INTO CustomerBackup VALUES SELECT * FROM Customers;\n"
            + "B. INSERT INTO CustomerBackup SELECT * FROM Customers;\n"
            + "C. INSERT SELECT * FROM Customers INTO CustomerBackup;\n"
            + "D. SELECT * FROM Customers INSERT INTO CustomerBackup;",
            "Mệnh đề nào dùng để sắp xếp dữ liệu trước khi chèn vào bảng đích?\n"
            + "\n"
            + "A. GROUP BY\n"
            + "B. ORDER BY\n"
            + "C. WHERE\n"
            + "D. HAVING",
            "Bạn có thể sử dụng INSERT INTO SELECT để chèn dữ liệu từ:\n"
            + "\n"
            + "A. Chỉ một bảng.\n"
            + "B. Nhiều bảng.\n"
            + "C. Cả một và b đều đúng.\n"
            + "D. Cả a và b đều sai.",
            "Chức năng chính của INSERT INTO SELECT là gì?\n"
            + "\n"
            + "A. Cập nhật dữ liệu trong bảng.\n"
            + "B. Xóa dữ liệu khỏi bảng.\n"
            + "C. Sao chép dữ liệu giữa các bảng.\n"
            + "D. Tạo bảng mới.",
            "Khi sử dụng INSERT INTO SELECT, điều gì sẽ xảy ra nếu có lỗi ràng buộc khóa ngoại?\n"
            + "\n"
            + "A. Các bản ghi vi phạm sẽ bị bỏ qua.\n"
            + "B. Câu lệnh sẽ thực hiện thành công.\n"
            + "C. Câu lệnh sẽ thất bại.\n"
            + "D. Các bản ghi vi phạm sẽ được cập nhật."
        });

        TITLE_MAP.put("CASE", new String[]{
            "Mệnh đề CASE trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lọc dữ liệu từ bảng\n"
            + "B. Sắp xếp dữ liệu theo thứ tự\n"
            + "C. Thực hiện logic điều kiện và trả về giá trị dựa trên điều kiện đó\n"
            + "D. Nhóm các hàng dữ liệu",
            "Cú pháp cơ bản của mệnh đề CASE là gì?\n"
            + "\n"
            + "A. IF condition THEN result ELSE other_result ENDIF\n"
            + "B. SWITCH condition CASE result DEFAULT other_result ENDSWITCH\n"
            + "C. CASE WHEN condition THEN result ELSE other_result END\n"
            + "D. SELECT condition ? result : other_result",
            "Mệnh đề ELSE trong câu lệnh CASE có vai trò gì?\n"
            + "\n"
            + "A. Chỉ định điều kiện cần kiểm tra\n"
            + "B. Xác định giá trị trả về khi tất cả các điều kiện WHEN đều sai\n"
            + "C. Trả về giá trị khi điều kiện WHEN đầu tiên đúng\n"
            + "D. Nhóm các điều kiện lại với nhau.",
            "Mệnh đề WHEN trong câu lệnh CASE có vai trò gì?\n"
            + "\n"
            + "A. Xác định giá trị trả về mặc định\n"
            + "B. Chỉ định một điều kiện cần kiểm tra\n"
            + "C. Kết thúc câu lệnh CASE\n"
            + "D. Sắp xếp kết quả trả về.",
            "Kết quả trả về của mệnh đề CASE có thể là gì?\n"
            + "\n"
            + "A. Chỉ một giá trị số nguyên\n"
            + "B. Chỉ một chuỗi ký tự\n"
            + "C. Bất kỳ kiểu dữ liệu hợp lệ nào trong SQL\n"
            + "D. Chỉ giá trị NULL",
            "Mệnh đề CASE có thể lồng nhau được không?\n"
            + "\n"
            + "A. Không, chỉ được sử dụng một lần trong một truy vấn\n"
            + "B. Có, có thể lồng nhiều mệnh đề CASE vào nhau\n"
            + "C. Chỉ lồng được 2 lần\n"
            + "D. Chỉ lồng được khi sử dụng trong mệnh đề WHERE",
            "Mệnh đề END trong câu lệnh CASE có vai trò gì?\n"
            + "\n"
            + "A. Bắt đầu câu lệnh CASE\n"
            + "B. Kết thúc câu lệnh CASE\n"
            + "C. Xác định điều kiện ELSE\n"
            + "D. Chỉ định điều kiện WHEN",
            "Mệnh đề CASE có thể sử dụng trong mệnh đề nào của câu lệnh SELECT?\n"
            + "\n"
            + "A. Chỉ trong mệnh đề WHERE\n"
            + "B. Chỉ trong mệnh đề GROUP BY\n"
            + "C. Trong mệnh đề SELECT, WHERE, ORDER BY, và GROUP BY\n"
            + "D. Chỉ trong mệnh đề ORDER BY",
            " Khi không có mệnh đề ELSE trong câu lệnh CASE, nếu tất cả các điều kiện WHEN đều sai thì kết quả trả về là gì?\n"
            + "\n"
            + "A. Lỗi\n"
            + "B. 0\n"
            + "C. Chuỗi rỗng ('')\n"
            + "D. NULL",
            "Mệnh đề CASE được thực thi khi nào?\n"
            + "\n"
            + "A. Trước khi mệnh đề WHERE\n"
            + "B. Sau khi mệnh đề GROUP BY\n"
            + "C. Trong quá trình đánh giá từng hàng dữ liệu\n"
            + "D. Trước khi mệnh đề ORDER BY"
        });

        TITLE_MAP.put("Tạo và sử dụng PROCEDURE", new String[]{
            "Thủ tục (procedure) trong SQL được sử dụng để làm gì?\n"
            + "A. Lưu trữ dữ liệu tạm thời\n"
            + "B. Thực hiện một loạt các câu lệnh SQL được biên dịch trước\n"
            + "C. Tạo bảng mới\n"
            + "D. Xóa cơ sở dữ liệu",
            "Câu lệnh nào được sử dụng để tạo một thủ tục trong SQL?\n"
            + "A. CREATE TABLE\n"
            + "B. CREATE VIEW\n"
            + "C. CREATE PROCEDURE\n"
            + "D. CREATE FUNCTION",
            "Tham số nào được sử dụng để trả về giá trị từ một thủ tục?\n"
            + "A. IN\n"
            + "B. OUT\n"
            + "C. INOUT\n"
            + "D. RETURN",
            "Lệnh nào được sử dụng để thực thi một thủ tục trong SQL?\n"
            + "A. EXECUTE\n"
            + "B. RUN\n"
            + "C. CALL\n"
            + "D. DO",
            "Thủ tục có thể trả về bao nhiêu giá trị?\n"
            + "A. Một\n"
            + "B. Nhiều\n"
            + "C. Không có\n"
            + "D. Tùy thuộc vào phiên bản SQL",
            "Lợi ích chính của việc sử dụng thủ tục là gì?\n"
            + "A. Tăng tốc độ truy vấn\n"
            + "B. Giảm tải mạng\n"
            + "C. Tăng tính bảo mật\n"
            + "D. Tất cả các đáp án trên",
            "Lệnh nào được sử dụng để xóa một thủ tục trong SQL?\n"
            + "A. DELETE PROCEDURE\n"
            + "B. DROP PROCEDURE\n"
            + "C. REMOVE PROCEDURE\n"
            + "D. ERASE PROCEDURE",
            "Thủ tục có thể chứa các câu lệnh điều khiển luồng nào?\n"
            + "A. IF-ELSE\n"
            + "B. WHILE\n"
            + "C. FOR\n"
            + "D. Tất cả các đáp án trên",
            "Thủ tục có thể được gọi từ đâu?\n"
            + "A. Ứng dụng client\n"
            + "B. Thủ tục khác\n"
            + "C. Trigger\n"
            + "D. Tất cả các đáp án trên",
            "Thủ tục có thể được sử dụng để thực hiện tác vụ nào sau đây?\n"
            + "A. Truy xuất dữ liệu\n"
            + "B. Cập nhật dữ liệu\n"
            + "C. Chèn dữ liệu\n"
            + "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Truyền tham số vào PROCEDURE", new String[]{
            "Tham số nào sau đây được sử dụng để truyền giá trị vào một stored procedure?\n"
            + "\n"
            + "A. IN\n"
            + "B. OUT\n"
            + "C. INOUT\n"
            + "D. Tất cả các đáp án trên",
            "Tham số nào sau đây được sử dụng để trả về giá trị từ một stored procedure?\n"
            + "\n"
            + "A. IN\n"
            + "B. OUT\n"
            + "C. INOUT\n"
            + "D. Không có đáp án nào đúng",
            "Tham số nào sau đây được sử dụng để truyền giá trị vào và trả về giá trị từ một stored procedure?\n"
            + "\n"
            + "A. IN\n"
            + "B. OUT\n"
            + "C. INOUT\n"
            + "D. Tất cả các đáp án trên",
            "Điều gì xảy ra nếu bạn cố gắng thay đổi giá trị của tham số IN bên trong một stored procedure?\n"
            + "\n"
            + "A. Giá trị của tham số sẽ bị thay đổi.\n"
            + "B. Giá trị của tham số sẽ không bị thay đổi.\n"
            + "C. Lỗi sẽ xảy ra.\n"
            + "D. Không có gì xảy ra.",
            "Điều gì xảy ra nếu bạn cố gắng sử dụng giá trị của tham số OUT bên trong một stored procedure trước khi nó được gán giá trị?\n"
            + "\n"
            + "A. Giá trị của tham số sẽ là NULL.\n"
            + "B. Giá trị của tham số sẽ là giá trị mặc định.\n"
            + "C. Lỗi sẽ xảy ra.\n"
            + "D. Không có gì xảy ra.",
            "Điều gì xảy ra nếu bạn cố gắng sử dụng giá trị của tham số INOUT bên trong một stored procedure trước khi nó được gán giá trị?\n"
            + "\n"
            + "A. Giá trị của tham số sẽ là NULL.\n"
            + "B. Giá trị của tham số sẽ là giá trị mặc định.\n"
            + "C. Lỗi sẽ xảy ra.\n"
            + "D. Không có gì xảy ra.",
            "Cú pháp nào sau đây được sử dụng để khai báo một tham số trong stored procedure?\n"
            + "\n"
            + "A. PARAMETER tên_tham_số kiểu_dữ_liệu\n"
            + "B. @tên_tham_số kiểu_dữ_liệu\n"
            + "C. tên_tham_số kiểu_dữ_liệu\n"
            + "D. Tất cả các đáp án trên",
            "Cú pháp nào sau đây được sử dụng để gọi một stored procedure có tham số?\n"
            + "\n"
            + "A. EXEC tên_stored_procedure (giá_trị_tham_số)\n"
            + "B. CALL tên_stored_procedure (giá_trị_tham_số)\n"
            + "C. tên_stored_procedure (giá_trị_tham_số)\n"
            + "D. Tất cả các đáp án trên",
            "Loại dữ liệu nào có thể được sử dụng cho tham số trong stored procedure?\n"
            + "\n"
            + "A. Bất kỳ kiểu dữ liệu SQL nào.\n"
            + "B. Chỉ các kiểu dữ liệu số.\n"
            + "C. Chỉ các kiểu dữ liệu chuỗi.\n"
            + "D. Chỉ các kiểu dữ liệu ngày tháng.",
            "Lợi ích của việc sử dụng tham số trong stored procedure là gì?\n"
            + "\n"
            + "A. Tăng tính linh hoạt và khả năng tái sử dụng của stored procedure.\n"
            + "B. Giảm lượng mã cần viết.\n"
            + "C. Tăng hiệu suất.\n"
            + "D. Tất cả các đáp án trên."
        });

        TITLE_MAP.put("Lợi ích và ứng dụng thực tế", new String[]{
            "SQL được sử dụng chủ yếu để làm gì?\n"
            + "\n"
            + "A. Thiết kế giao diện người dùng\n"
            + "B. Quản lý và thao tác cơ sở dữ liệu\n"
            + "C. Phát triển ứng dụng di động\n"
            + "D. Xây dựng trò chơi điện tử",
            "Lợi ích chính của SQL là gì?\n"
            + "\n"
            + "A. Xử lý đồ họa phức tạp\n"
            + "B. Truy xuất và quản lý dữ liệu hiệu quả\n"
            + "C. Tự động hóa quá trình sản xuất\n"
            + "D. Thiết kế mạch điện tử",
            "SQL được ứng dụng trong lĩnh vực nào sau đây?\n"
            + "\n"
            + "A. Thiết kế thời trang\n"
            + "B. Phân tích dữ liệu kinh doanh\n"
            + "C. Sản xuất phim hoạt hình\n"
            + "D. Xây dựng cầu đường",
            "SQL cho phép thực hiện thao tác nào trên cơ sở dữ liệu?\n"
            + "\n"
            + "A. Vẽ tranh kỹ thuật số\n"
            + "B. Tạo, sửa, xóa và truy vấn dữ liệu\n"
            + "C. Điều khiển robot công nghiệp\n"
            + "D. Thiết kế logo",
            "Trong thương mại điện tử, SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Thiết kế website bán hàng\n"
            + "B. Quản lý thông tin sản phẩm và khách hàng\n"
            + "C. Tạo video quảng cáo\n"
            + "D. Thiết kế bao bì sản phẩm",
            "SQL hỗ trợ việc nào sau đây trong phân tích dữ liệu?\n"
            + "\n"
            + "A. Tạo hiệu ứng âm thanh\n"
            + "B. Lọc, sắp xếp và tổng hợp dữ liệu\n"
            + "C. Thiết kế mô hình 3D\n"
            + "D. Viết kịch bản phim",
            "Trong lĩnh vực tài chính, SQL được dùng để làm gì?\n"
            + "\n"
            + "A. Thiết kế logo công ty tài chính\n"
            + "B. Quản lý giao dịch và phân tích rủi ro\n"
            + "C. Tạo nhạc nền cho quảng cáo\n"
            + "D. Thiết kế nội thất văn phòng",
            "SQL giúp cải thiện điều gì trong quản lý cơ sở dữ liệu?\n"
            + "\n"
            + "A. Tốc độ xử lý đồ họa\n"
            + "B. Hiệu suất truy vấn và tính nhất quán dữ liệu\n"
            + "C. Chất lượng âm thanh\n"
            + "D. Độ phân giải hình ảnh",
            "Ứng dụng của SQL trong lĩnh vực y tế là gì?\n"
            + "\n"
            + "A. Thiết kế dụng cụ y tế\n"
            + "B. Quản lý hồ sơ bệnh nhân và kết quả xét nghiệm\n"
            + "C. Tạo phim hoạt hình giáo dục sức khỏe\n"
            + "D. Thiết kế phòng khám",
            "SQL có vai trò gì trong việc xây dựng ứng dụng web?\n"
            + "\n"
            + "A. Thiết kế giao diện người dùng\n"
            + "B. Lưu trữ và truy xuất dữ liệu từ cơ sở dữ liệu\n"
            + "C. Tạo hiệu ứng chuyển động cho website\n"
            + "D. Thiết kế logo website"
        });

        TITLE_MAP.put("Phòng chống SQL Injection", new String[]{
            "Phương pháp nào sau đây là cách tốt nhất để ngăn chặn SQL Injection?\n"
            + "\n"
            + "A.  Lọc dữ liệu đầu vào của người dùng\n"
            + "B.  Sử dụng câu lệnh tham số hóa (Prepared Statements)\n"
            + "C.  Sử dụng hàm mã hóa dữ liệu\n"
            + "D.  Tất cả các phương án trên",
            "Kỹ thuật SQL Injection nào sử dụng toán tử UNION để kết hợp kết quả của các truy vấn?\n"
            + "\n"
            + "A.  Blind SQL Injection\n"
            + "B.  Error-based SQL Injection\n"
            + "C.  Union-based SQL Injection\n"
            + "D.  Time-based SQL Injection",
            "Hàm nào sau đây thường được sử dụng để thoát các ký tự đặc biệt trong SQL?\n"
            + "\n"
            + "A.  ENCODE()\n"
            + "B.  ESCAPE()\n"
            + "C.  CONVERT()\n"
            + "D.  HASH()",
            "Kiểu tấn công SQL Injection nào dựa vào phản hồi lỗi từ cơ sở dữ liệu để thu thập thông tin?\n"
            + "\n"
            + "A.  Blind SQL Injection\n"
            + "B.  Error-based SQL Injection\n"
            + "C.  Union-based SQL Injection\n"
            + "D.  Time-based SQL Injection",
            "Biện pháp nào sau đây giúp hạn chế quyền truy cập của tài khoản cơ sở dữ liệu?\n"
            + "\n"
            + "A.  Sử dụng tài khoản root cho tất cả các ứng dụng\n"
            + "B.  Cấp quyền tối thiểu cho tài khoản ứng dụng\n"
            + "C.  Lưu trữ mật khẩu cơ sở dữ liệu trong mã nguồn\n"
            + "D.  Không bao giờ thay đổi mật khẩu cơ sở dữ liệu",
            "Kỹ thuật SQL Injection nào dựa vào thời gian phản hồi của cơ sở dữ liệu để suy luận thông tin?\n"
            + "\n"
            + "A.  Blind SQL Injection\n"
            + "B.  Error-based SQL Injection\n"
            + "C.  Union-based SQL Injection\n"
            + "D.  Time-based SQL Injection",
            "Câu lệnh nào sau đây dễ bị tấn công SQL Injection nhất?\n"
            + "\n"
            + "A.  SELECT * FROM users WHERE username = '{$username}'\n"
            + "B.  SELECT * FROM users WHERE username = ? (sử dụng prepared statements)\n"
            + "C.  SELECT * FROM users WHERE username = :username (sử dụng parameterized queries)\n"
            + "D.  Tất cả các câu lệnh trên đều an toàn",
            "Phương pháp nào sau đây giúp kiểm tra và làm sạch dữ liệu đầu vào của người dùng?\n"
            + "\n"
            + "A.  Sử dụng biểu thức chính quy (Regular Expressions)\n"
            + "B.  Sử dụng danh sách trắng (Whitelist)\n"
            + "C.  Sử dụng danh sách đen (Blacklist)\n"
            + "D.  Tất cả các phương án trên",
            "Kiểu tấn công SQL Injection nào dựa vào việc suy luận kết quả truy vấn thông qua các phản hồi khác nhau của ứng dụng?\n"
            + "\n"
            + "A.  Blind SQL Injection\n"
            + "B.  Error-based SQL Injection\n"
            + "C.  Union-based SQL Injection\n"
            + "D.  Time-based SQL Injection",
            "Nguyên tắc nào sau đây là quan trọng nhất trong việc phòng chống SQL Injection?\n"
            + "\n"
            + "A.  Không bao giờ tin tưởng dữ liệu đầu vào của người dùng\n"
            + "B.  Sử dụng các hàm mã hóa dữ liệu phức tạp\n"
            + "C.  Giấu thông tin lỗi cơ sở dữ liệu\n"
            + "D.  Thường xuyên thay đổi mật khẩu cơ sở dữ liệu"
        });

        TITLE_MAP.put("Nguyên tắc Least Privilege", new String[]{
            "Nguyên tắc Least Privilege trong SQL có nghĩa là gì?\n"
            + "\n"
            + "A. Cấp quyền truy cập tối đa cho người dùng.\n"
            + "B. Cấp quyền truy cập tối thiểu cần thiết cho người dùng để thực hiện công việc của họ.\n"
            + "C. Từ chối tất cả quyền truy cập.\n"
            + "D. Cấp quyền truy cập ngẫu nhiên.",
            "Tại sao nguyên tắc Least Privilege lại quan trọng trong SQL?\n"
            + "\n"
            + "A. Để tăng tốc độ truy vấn.\n"
            + "B. Để đơn giản hóa việc quản lý người dùng.\n"
            + "C. Để giảm thiểu rủi ro bảo mật.\n"
            + "D. Để cho phép người dùng truy cập tất cả dữ liệu.",
            "Loại quyền SQL nào nên được cấp cho người dùng chỉ cần xem dữ liệu?\n"
            + "\n"
            + "A. INSERT\n"
            + "B. UPDATE\n"
            + "C. DELETE\n"
            + "D. SELECT",
            "Loại quyền SQL nào cho phép người dùng thay đổi cấu trúc bảng?\n"
            + "\n"
            + "A. SELECT\n"
            + "B. INSERT\n"
            + "C. ALTER\n"
            + "D. DELETE",
            "Điều gì sẽ xảy ra nếu người dùng có quá nhiều quyền SQL?\n"
            + "\n"
            + "A. Họ có thể vô tình làm hỏng dữ liệu.\n"
            + "B. Họ có thể bị tấn công bởi kẻ xấu.\n"
            + "C. Họ có thể truy cập dữ liệu nhạy cảm.\n"
            + "D. Tất cả các đáp án trên.",
            "Cách tốt nhất để thực hiện nguyên tắc Least Privilege trong SQL là gì?\n"
            + "\n"
            + "A. Cấp quyền cho từng người dùng riêng lẻ.\n"
            + "B. Cấp quyền cho nhóm người dùng dựa trên vai trò của họ.\n"
            + "C. Cấp tất cả quyền cho tất cả người dùng.\n"
            + "D. Từ chối tất cả quyền truy cập.",
            "Công cụ SQL nào có thể được sử dụng để xem quyền của người dùng?\n"
            + "\n"
            + "A. SELECT\n"
            + "B. GRANT\n"
            + "C. REVOKE\n"
            + "D. SHOW GRANTS",
            "Lệnh SQL nào được sử dụng để cấp quyền cho người dùng?\n"
            + "\n"
            + "A. SELECT\n"
            + "B. GRANT\n"
            + "C. REVOKE\n"
            + "D. SHOW GRANTS",
            "Lệnh SQL nào được sử dụng để thu hồi quyền của người dùng?\n"
            + "\n"
            + "A. SELECT\n"
            + "B. GRANT\n"
            + "C. REVOKE\n"
            + "D. SHOW GRANTS",
            "Điều gì sẽ xảy ra nếu người dùng cố gắng thực hiện một thao tác SQL mà họ không có quyền?\n"
            + "\n"
            + "A. Thao tác sẽ thành công.\n"
            + "B. Hệ thống sẽ ghi lại lỗi.\n"
            + "C. Hệ thống sẽ tự động cấp quyền cho người dùng.\n"
            + "D. Hệ thống sẽ bỏ qua thao tác."
        });

        TITLE_MAP.put("PARTITIONING, HASH PARTITIONING", new String[]{
            " Phân vùng dữ liệu trong SQL nhằm mục đích chính là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn và quản lý dữ liệu\n"
            + "B. Giảm dung lượng lưu trữ\n"
            + "C. Tăng tính bảo mật dữ liệu\n"
            + "D. Đơn giản hóa cấu trúc cơ sở dữ liệu",
            "Loại phân vùng nào chia dữ liệu dựa trên một phạm vi giá trị cụ thể?\n"
            + "\n"
            + "A. Phân vùng băm (hash partitioning)\n"
            + "B. Phân vùng danh sách (list partitioning)\n"
            + "C. Phân vùng khoảng (range partitioning)\n"
            + "D. Phân vùng cột (column partitioning)",
            "Phân vùng băm (hash partitioning) hoạt động dựa trên nguyên tắc nào?\n"
            + "\n"
            + "A. Chia dữ liệu theo khoảng giá trị\n"
            + "B. Chia dữ liệu theo danh sách giá trị\n"
            + "C. Chia dữ liệu dựa trên kết quả của hàm băm\n"
            + "D. Chia dữ liệu theo kích thước tệp",
            "Ưu điểm chính của phân vùng băm (hash partitioning) so với phân vùng khoảng (range partitioning) là gì?\n"
            + "\n"
            + "A. Dễ dàng quản lý các phạm vi giá trị\n"
            + "B. Phân phối dữ liệu đồng đều hơn\n"
            + "C. Hỗ trợ truy vấn phạm vi tốt hơn\n"
            + "D. Tăng tính bảo mật dữ liệu",
            "Loại phân vùng nào cho phép bạn chỉ định rõ ràng các giá trị nào thuộc về phân vùng nào?\n"
            + "\n"
            + "A. Phân vùng băm (hash partitioning)\n"
            + "B. Phân vùng khoảng (range partitioning)\n"
            + "C. Phân vùng danh sách (list partitioning)\n"
            + "D. Phân vùng cột (column partitioning)",
            "Khi nào nên sử dụng phân vùng băm (hash partitioning) thay vì phân vùng khoảng (range partitioning)?\n"
            + "\n"
            + "A. Khi dữ liệu có phạm vi giá trị rõ ràng\n"
            + "B. Khi cần phân phối dữ liệu đồng đều\n"
            + "C. Khi cần truy vấn dữ liệu theo khoảng giá trị\n"
            + "D. Khi cần quản lý dữ liệu theo danh sách giá trị",
            " Nhược điểm chính của phân vùng băm (hash partitioning) là gì?\n"
            + "\n"
            + "A. Khó quản lý các phạm vi giá trị\n"
            + "B. Phân phối dữ liệu không đồng đều\n"
            + "C. Khó truy vấn dữ liệu theo khoảng giá trị\n"
            + "D. Tăng dung lượng lưu trữ",
            "Loại phân vùng nào cho phép bạn chia dữ liệu dựa trên nhiều cột?\n"
            + "\n"
            + "A. Phân vùng băm (hash partitioning)\n"
            + "B. Phân vùng khoảng (range partitioning)\n"
            + "C. Phân vùng danh sách (list partitioning)\n"
            + "D. Phân vùng composite (composite partitioning)",
            "Mục đích của việc sử dụng hàm băm trong phân vùng băm (hash partitioning) là gì?\n"
            + "\n"
            + "A. Sắp xếp dữ liệu theo thứ tự\n"
            + "B. Mã hóa dữ liệu\n"
            + "C. Phân phối dữ liệu vào các phân vùng\n"
            + "D. Nén dữ liệu",
            "Loại phân vùng nào phù hợp nhất cho dữ liệu nhật ký (log data) theo ngày?\n"
            + "\n"
            + "A. Phân vùng băm (hash partitioning)\n"
            + "B. Phân vùng khoảng (range partitioning)\n"
            + "C. Phân vùng danh sách (list partitioning)\n"
            + "D. Phân vùng cột (column partitioning)"
        });

        TITLE_MAP.put("SHARDING", new String[]{
            "Sharding trong SQL là gì?\n"
            + "\n"
            + "A. Một kỹ thuật tối ưu hóa truy vấn\n"
            + "B. Một phương pháp phân chia dữ liệu theo chiều dọc\n"
            + "C. Một kỹ thuật phân chia dữ liệu theo chiều ngang\n"
            + "D. Một phương pháp sao lưu dữ liệu",
            " Lợi ích chính của sharding là gì?\n"
            + "\n"
            + "A. Tăng tính nhất quán của dữ liệu\n"
            + "B. Cải thiện hiệu suất truy vấn và khả năng mở rộng\n"
            + "C. Giảm dung lượng lưu trữ cần thiết\n"
            + "D. Đơn giản hóa việc quản lý cơ sở dữ liệu",
            "Loại khóa nào thường được sử dụng để xác định shard mà một bản ghi thuộc về?\n"
            + "\n"
            + "A. Khóa ngoại\n"
            + "B. Khóa chính\n"
            + "C. Khóa phân vùng (sharding key)\n"
            + "D. Khóa duy nhất",
            "Kỹ thuật nào phân phối dữ liệu dựa trên một phạm vi giá trị của khóa phân vùng?\n"
            + "\n"
            + "A. Sharding theo phạm vi (range-based sharding)\n"
            + "B. Sharding theo hàm băm (hash-based sharding)\n"
            + "C. Sharding theo danh sách (list-based sharding)\n"
            + "D. Sharding theo địa lý (geo-based sharding)",
            "Kỹ thuật nào phân phối dữ liệu bằng cách áp dụng một hàm băm cho khóa phân vùng?\n"
            + "\n"
            + "A. Sharding theo phạm vi (range-based sharding)\n"
            + "B. Sharding theo hàm băm (hash-based sharding)\n"
            + "C. Sharding theo danh sách (list-based sharding)\n"
            + "D. Sharding theo địa lý (geo-based sharding)",
            "Điều gì xảy ra khi một truy vấn yêu cầu dữ liệu từ nhiều shard?\n"
            + "\n"
            + "A. Truy vấn sẽ thất bại\n"
            + "B. Cơ sở dữ liệu sẽ tự động hợp nhất các shard\n"
            + "C. Truy vấn sẽ được phân phối đến các shard liên quan và kết quả được tổng hợp\n"
            + "D. Dữ liệu sẽ được sao chép sang một shard duy nhất để xử lý truy vấn",
            "Thách thức chính của sharding là gì?\n"
            + "\n"
            + "A. Tăng độ phức tạp của quản lý cơ sở dữ liệu\n"
            + "B. Giảm hiệu suất truy vấn\n"
            + "C. Tăng dung lượng lưu trữ cần thiết\n"
            + "D. Giảm tính nhất quán của dữ liệu",
            "Sharding phù hợp nhất cho loại ứng dụng nào?\n"
            + "\n"
            + "A. Ứng dụng yêu cầu tính nhất quán dữ liệu cao\n"
            + "B. Ứng dụng có lượng dữ liệu nhỏ\n"
            + "C. Ứng dụng có lượng dữ liệu lớn và yêu cầu khả năng mở rộng cao\n"
            + "D. Ứng dụng không yêu cầu hiệu suất cao",
            "Phương pháp nào giúp giảm thiểu sự mất mát dữ liệu khi một shard gặp sự cố?\n"
            + "\n"
            + "A. Sao lưu dữ liệu (data backup)\n"
            + "B. Phân mảnh dữ liệu (data fragmentation)\n"
            + "C. Sao chép dữ liệu (data replication)\n"
            + "D. Nén dữ liệu (data compression)",
            "Trong sharding, \"resharding\" đề cập đến điều gì?\n"
            + "\n"
            + "A. Việc sao lưu dữ liệu từ các shard\n"
            + "B. Việc tái cấu trúc phân vùng dữ liệu khi lượng dữ liệu thay đổi\n"
            + "C. Việc tối ưu hóa truy vấn trên các shard\n"
            + "D. Việc hợp nhất dữ liệu từ các shard"
        });

        TITLE_MAP.put("BATCH PROCESSING", new String[]{
            "Xử lý hàng loạt (batch processing) trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xử lý từng bản ghi riêng lẻ\n"
            + "B. Xử lý một nhóm lớn các bản ghi cùng một lúc\n"
            + "C. Hiển thị kết quả truy vấn theo thời gian thực\n"
            + "D. Tối ưu hóa truy vấn cho cơ sở dữ liệu nhỏ",
            " Lợi ích chính của xử lý hàng loạt trong SQL là gì?\n"
            + "\n"
            + "A. Giảm thời gian xử lý cho các thao tác trên lượng dữ liệu lớn\n"
            + "B. Tăng tính tương tác của ứng dụng với người dùng\n"
            + "C. Đơn giản hóa việc gỡ lỗi truy vấn\n"
            + "D. Cải thiện khả năng tương thích với các hệ quản trị cơ sở dữ liệu khác nhau",
            "Trong SQL Server, câu lệnh nào thường được sử dụng để bắt đầu một lô (batch)?\n"
            + "\n"
            + "A. BEGIN TRANSACTION\n"
            + "B. GO\n"
            + "C. COMMIT\n"
            + "D. ROLLBACK",
            "Khi nào thì việc sử dụng xử lý hàng loạt trong SQL là phù hợp nhất?\n"
            + "\n"
            + "A. Khi cần cập nhật một bản ghi duy nhất\n"
            + "B. Khi cần thực hiện các thao tác phức tạp trên một lượng lớn dữ liệu\n"
            + "C. Khi cần hiển thị dữ liệu theo thời gian thực\n"
            + "D. Khi cần tối ưu hóa truy vấn cho cơ sở dữ liệu nhỏ",
            "Điều gì xảy ra nếu một câu lệnh trong lô (batch) bị lỗi?\n"
            + "\n"
            + "A. Toàn bộ lô sẽ bị hủy bỏ (rollback)\n"
            + "B. Các câu lệnh còn lại trong lô vẫn được thực thi\n"
            + "C. Chỉ câu lệnh bị lỗi bị bỏ qua\n"
            + "D. Hệ thống sẽ tự động sửa lỗi và tiếp tục thực thi",
            "Trong SQL, giao dịch (transaction) được sử dụng để làm gì trong xử lý hàng loạt?\n"
            + "\n"
            + "A. Tăng tốc độ thực thi của lô\n"
            + "B. Đảm bảo tính toàn vẹn dữ liệu bằng cách xử lý lô như một đơn vị duy nhất\n"
            + "C. Hiển thị kết quả của lô theo thời gian thực\n"
            + "D. Tối ưu hóa truy vấn cho cơ sở dữ liệu nhỏ",
            "Câu lệnh nào được sử dụng để kết thúc một giao dịch thành công trong SQL?\n"
            + "\n"
            + "A. BEGIN TRANSACTION\n"
            + "B. GO\n"
            + "C. COMMIT\n"
            + "D. ROLLBACK",
            "Câu lệnh nào được sử dụng để hủy bỏ một giao dịch và khôi phục dữ liệu về trạng thái ban đầu?\n"
            + "\n"
            + "A. BEGIN TRANSACTION\n"
            + "B. GO\n"
            + "C. COMMIT\n"
            + "D. ROLLBACK",
            "Loại thao tác nào sau đây thường được thực hiện bằng xử lý hàng loạt trong SQL?\n"
            + "\n"
            + "A. Cập nhật bảng người dùng khi đăng nhập\n"
            + "B. Tạo báo cáo doanh thu hàng tháng\n"
            + "C. Hiển thị thông tin sản phẩm trên trang web\n"
            + "D. Xử lý các yêu cầu tìm kiếm của người dùng",
            "Trong SQL, việc sử dụng biến (variable) trong xử lý hàng loạt giúp làm gì?\n"
            + "\n"
            + "A. Tăng tốc độ thực thi của lô\n"
            + "B. Lưu trữ và sử dụng lại các giá trị trong lô\n"
            + "C. Hiển thị kết quả của lô theo thời gian thực\n"
            + "D. Tối ưu hóa truy vấn cho cơ sở dữ liệu nhỏ"
        });

        TITLE_MAP.put("RECURSIVE QUERIES", new String[]{
            "Truy vấn đệ quy trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lọc dữ liệu từ bảng.\n"
            + "B. Tính toán các giá trị tổng hợp.\n"
            + "C. Truy vấn dữ liệu có cấu trúc phân cấp.\n"
            + "D. Sắp xếp dữ liệu.",
            "Thành phần nào sau đây là bắt buộc trong truy vấn đệ quy?\n"
            + "\n"
            + "A. Mệnh đề GROUP BY.\n"
            + "B. Mệnh đề HAVING.\n"
            + "C. Mệnh đề UNION ALL.\n"
            + "D. Mệnh đề ORDER BY.",
            "Mệnh đề nào được sử dụng để xác định điều kiện dừng cho truy vấn đệ quy?\n"
            + "\n"
            + "A. Mệnh đề WHERE.\n"
            + "B. Mệnh đề LIMIT.\n"
            + "C. Mệnh đề TOP.\n"
            + "D. Mệnh đề trong phần truy vấn điều kiện của phần truy vấn đệ quy.",
            "Truy vấn đệ quy có thể được sử dụng để giải quyết vấn đề nào sau đây?\n"
            + "\n"
            + "A. Tính toán giai thừa của một số.\n"
            + "B. Tìm kiếm đường đi ngắn nhất trong một đồ thị.\n"
            + "C. Duyệt cây phân cấp.\n"
            + "D. Tất cả các đáp án trên.",
            "Trong một truy vấn đệ quy, phần nào được thực thi đầu tiên?\n"
            + "\n"
            + "A. Phần truy vấn neo (anchor member).\n"
            + "B. Phần truy vấn đệ quy (recursive member).\n"
            + "C. Cả hai phần cùng lúc.\n"
            + "D. Thứ tự thực thi ngẫu nhiên.",
            "Loại dữ liệu nào thường được truy vấn bằng truy vấn đệ quy?\n"
            + "\n"
            + "A. Dữ liệu dạng bảng phẳng.\n"
            + "B. Dữ liệu dạng cây hoặc đồ thị.\n"
            + "C. Dữ liệu dạng số.\n"
            + "D. Dữ liệu dạng chuỗi.",
            "Truy vấn đệ quy có thể gây ra vấn đề gì nếu không được viết đúng cách?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi logic.\n"
            + "C. Vòng lặp vô hạn.\n"
            + "D. Tất cả các đáp án trên.",
            "Trong SQL Server, từ khóa nào được sử dụng để tạo truy vấn đệ quy?\n"
            + "\n"
            + "A. RECURSIVE.\n"
            + "B. WITH RECURSIVE.\n"
            + "C. COMMON TABLE EXPRESSION(CTE).\n"
            + "D. LOOP.",
            "Chức năng chính của phần truy vấn neo (anchor member) trong truy vấn đệ quy là gì?\n"
            + "\n"
            + "A. Xác định điều kiện dừng.\n"
            + "B. Tạo kết quả ban đầu.\n"
            + "C. Lặp lại quá trình truy vấn.\n"
            + "D. Lọc dữ liệu.",
            "Trong truy vấn đệ quy, phần truy vấn đệ quy (recursive member) tham chiếu đến:\n"
            + "\n"
            + "A. Bảng gốc.\n"
            + "B. Kết quả của phần truy vấn neo.\n"
            + "C. CTE (Common Table Expression) được tạo bởi truy vấn đệ quy.\n"
            + "D. Tất cả các bảng trong cơ sở dữ liệu."
        });

        TITLE_MAP.put("Biểu thức CTE", new String[]{
            "CTE (Common Table Expression) trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng tạm thời cho truy vấn.\n"
            + "B. Lọc dữ liệu từ bảng.\n"
            + "C. Tính toán các giá trị tổng hợp.\n"
            + "D. Sắp xếp dữ liệu.",
            "Mệnh đề nào được sử dụng để định nghĩa một CTE?\n"
            + "\n"
            + "A. SELECT.\n"
            + "B. FROM.\n"
            + "C. WITH.\n"
            + "D. GROUP BY.",
            "CTE có thể được sử dụng trong mệnh đề nào sau đây?\n"
            + "\n"
            + "A. SELECT.\n"
            + "B. INSERT.\n"
            + "C. UPDATE.\n"
            + "D. DELETE.",
            "CTE có thể tham chiếu đến chính nó trong trường hợp nào?\n"
            + "\n"
            + "A. CTE không đệ quy.\n"
            + "B. CTE đệ quy.\n"
            + "C. Cả hai loại CTE.\n"
            + "D. Không trường hợp nào.",
            "Phạm vi tồn tại của một CTE là gì?\n"
            + "\n"
            + "A. Toàn bộ cơ sở dữ liệu.\n"
            + "B. Chỉ trong truy vấn hiện tại.\n"
            + "C. Trong phiên làm việc hiện tại.\n"
            + "D. Cho đến khi khởi động lại máy chủ.",
            "CTE có thể thay thế cho loại truy vấn con nào?\n"
            + "\n"
            + "A. Truy vấn con tương quan.\n"
            + "B. Truy vấn con không tương quan.\n"
            + "C. Cả hai loại truy vấn con.\n"
            + "D. Không loại nào.",
            "CTE có thể được sử dụng để làm gì với dữ liệu phân cấp?\n"
            + "\n"
            + "A. Duyệt và truy vấn dữ liệu phân cấp.\n"
            + "B. Lọc dữ liệu phân cấp.\n"
            + "C. Sắp xếp dữ liệu phân cấp.\n"
            + "D. Tính toán dữ liệu phân cấp.",
            "Mệnh đề nào được sử dụng để kết hợp các kết quả của CTE?\n"
            + "\n"
            + "A. JOIN.\n"
            + "B. UNION.\n"
            + "C. INTERSECT.\n"
            + "D. EXCEPT.",
            "CTE có thể được sử dụng để cải thiện điều gì của truy vấn?\n"
            + "\n"
            + "A. Hiệu suất.\n"
            + "B. Khả năng đọc.\n"
            + "C. Khả năng bảo trì.\n"
            + "D. Tất cả các đáp án trên.",
            "CTE có thể được sử dụng để thực hiện loại thao tác nào trên dữ liệu?\n"
            + "\n"
            + "A. Thao tác dữ liệu phức tạp.\n"
            + "B. Thao tác dữ liệu đơn giản.\n"
            + "C. Cả hai loại thao tác dữ liệu.\n"
            + "D. Không loại thao tác nào.",});

        TITLE_MAP.put("WINDOW FUNCTIONS", new String[]{
            "Window functions trong SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lọc dữ liệu từ bảng.\n"
            + "B. Tính toán trên một tập hợp các hàng liên quan đến hàng hiện tại.\n"
            + "C. Tính toán các giá trị tổng hợp trên toàn bộ bảng.\n"
            + "D. Sắp xếp dữ liệu.",
            "Mệnh đề nào được sử dụng để xác định phân vùng của window function?\n"
            + "\n"
            + "A. GROUP BY.\n"
            + "B. ORDER BY.\n"
            + "C. PARTITION BY.\n"
            + "D. WHERE.",
            "Hàm nào sau đây là một ví dụ của window function?\n"
            + "\n"
            + "A. SUM().\n"
            + "B. AVG().\n"
            + "C. ROW_NUMBER().\n"
            + "D. COUNT().",
            "Window function có thể được sử dụng trong mệnh đề nào?\n"
            + "\n"
            + "A. WHERE.\n"
            + "B. GROUP BY.\n"
            + "C. HAVING.\n"
            + "D. SELECT.",
            "Window function nào được sử dụng để tính toán tổng lũy kế?\n"
            + "\n"
            + "A. RANK().\n"
            + "B. DENSE_RANK().\n"
            + "C. SUM() OVER (ORDER BY ... ROWS UNBOUNDED PRECEDING).\n"
            + "D. ROW_NUMBER().",
            "Window function nào được sử dụng để xếp hạng các hàng trong một phân vùng?\n"
            + "\n"
            + "A. SUM().\n"
            + "B. AVG().\n"
            + "C. RANK().\n"
            + "D. COUNT().",
            "Window function nào được sử dụng để trả về giá trị của hàng trước đó trong một phân vùng?\n"
            + "\n"
            + "A. LEAD().\n"
            + "B. LAG().\n"
            + "C. FIRST_VALUE().\n"
            + "D. LAST_VALUE().",
            "Window function nào được sử dụng để trả về giá trị của hàng tiếp theo trong một phân vùng?\n"
            + "\n"
            + "A. LEAD().\n"
            + "B. LAG().\n"
            + "C. FIRST_VALUE().\n"
            + "D. LAST_VALUE().",
            "Window function nào được sử dụng để trả về giá trị đầu tiên trong một phân vùng?\n"
            + "\n"
            + "A. LEAD().\n"
            + "B. LAG().\n"
            + "C. FIRST_VALUE().\n"
            + "D. LAST_VALUE().",
            "Window function nào được sử dụng để trả về giá trị cuối cùng trong một phân vùng?\n"
            + "\n"
            + "A. LEAD().\n"
            + "B. LAG().\n"
            + "C. FIRST_VALUE().\n"
            + "D. LAST_VALUE().",});

        TITLE_MAP.put("Dynamic SQL", new String[]{
            "Dynamic SQL là gì?\n"
            + "\n"
            + "A. SQL được viết sẵn trong mã nguồn.\n"
            + "B. SQL được tạo và thực thi trong thời gian chạy.\n"
            + "C. SQL được tối ưu hóa tự động.\n"
            + "D. SQL được sử dụng để tạo bảng tạm thời.",
            "Lợi ích chính của Dynamic SQL là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn.\n"
            + "B. Tăng tính linh hoạt và khả năng tùy biến.\n"
            + "C. Giảm thiểu lỗi cú pháp.\n"
            + "D. Đơn giản hóa mã SQL.",
            "Rủi ro chính của việc sử dụng Dynamic SQL là gì?\n"
            + "\n"
            + "A. Lỗi logic.\n"
            + "B. Lỗi cú pháp.\n"
            + "C. SQL injection.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để tránh SQL injection trong Dynamic SQL?\n"
            + "\n"
            + "A. Sử dụng các tham số được tham số hóa.\n"
            + "B. Sử dụng các chuỗi được nối trực tiếp.\n"
            + "C. Sử dụng các biến toàn cục.\n"
            + "D. Sử dụng các hàm không an toàn.",
            "Câu lệnh nào được sử dụng để thực thi Dynamic SQL trong SQL Server?\n"
            + "\n"
            + "A. EXECUTE.\n"
            + "B. RUN.\n"
            + "C. DO.\n"
            + "D. CALL.",
            "Dynamic SQL thường được sử dụng trong trường hợp nào?\n"
            + "\n"
            + "A. Truy vấn tĩnh.\n"
            + "B. Truy vấn với số lượng cột hoặc điều kiện không xác định trước.\n"
            + "C. Truy vấn đơn giản.\n"
            + "D. Truy vấn không yêu cầu tính linh hoạt.",
            "Dynamic SQL có thể được sử dụng để tạo loại đối tượng cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. Bảng.\n"
            + "B. Thủ tục lưu trữ.\n"
            + "C. Hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Dynamic SQL có thể được sử dụng để thực hiện loại thao tác dữ liệu nào?\n"
            + "\n"
            + "A. Thao tác dữ liệu phức tạp.\n"
            + "B. Thao tác dữ liệu đơn giản.\n"
            + "C. Cả hai loại thao tác dữ liệu.\n"
            + "D. Không loại thao tác nào.",
            "Dynamic SQL có thể được sử dụng để cải thiện điều gì của ứng dụng?\n"
            + "\n"
            + "A. Hiệu suất.\n"
            + "B. Khả năng mở rộng.\n"
            + "C. Tính linh hoạt.\n"
            + "D. Tất cả các đáp án trên.",
            "Dynamic SQL có thể được sử dụng để tạo loại báo cáo nào?\n"
            + "\n"
            + "A. Báo cáo tĩnh.\n"
            + "B. Báo cáo động.\n"
            + "C. Cả hai loại báo cáo.\n"
            + "D. Không loại báo cáo nào.",});

        TITLE_MAP.put("MySQL", new String[]{
            "MySQL là gì?\n"
            + "\n"
            + "A. Một hệ quản trị cơ sở dữ liệu quan hệ mã nguồn mở.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ nào được sử dụng để quản lý cơ sở dữ liệu MySQL thông qua giao diện đồ họa?\n"
            + "\n"
            + "A. phpMyAdmin.\n"
            + "B. MySQL Workbench.\n"
            + "C. HeidiSQL.\n"
            + "D. Tất cả các đáp án trên.",
            "Loại engine lưu trữ mặc định trong MySQL 8.0 là gì?\n"
            + "\n"
            + "A. MyISAM.\n"
            + "B. InnoDB.\n"
            + "C. MEMORY.\n"
            + "D. ARCHIVE.",
            "Câu lệnh nào được sử dụng để tạo một cơ sở dữ liệu mới trong MySQL?\n"
            + "\n"
            + "A. CREATE TABLE.\n"
            + "B. CREATE DATABASE.\n"
            + "C. CREATE SCHEMA.\n"
            + "D. NEW DATABASE.",
            "MySQL hỗ trợ loại chỉ mục nào?\n"
            + "\n"
            + "A. B-tree.\n"
            + "B. Hash.\n"
            + "C. Full-text.\n"
            + "D. Tất cả các đáp án trên.",
            "MySQL sử dụng loại giấy phép nào?\n"
            + "\n"
            + "A. GPL.\n"
            + "B. LGPL.\n"
            + "C. Thương mại.\n"
            + "D. Cả GPL và thương mại.",
            "MySQL hỗ trợ loại kiểu dữ liệu JSON nào?\n"
            + "\n"
            + "A. JSON.\n"
            + "B. XML.\n"
            + "C. TEXT.\n"
            + "D. BLOB.",
            "MySQL hỗ trợ loại transaction isolation level nào?\n"
            + "\n"
            + "A. READ UNCOMMITTED.\n"
            + "B. READ COMMITTED.\n"
            + "C. REPEATABLE READ.\n"
            + "D. Tất cả các đáp án trên.",
            "MySQL hỗ trợ loại replication nào?\n"
            + "\n"
            + "A. Asynchronous replication.\n"
            + "B. Semi-synchronous replication.\n"
            + "C. Group replication.\n"
            + "D. Tất cả các đáp án trên.",
            "MySQL hỗ trợ loại stored procedure language nào?\n"
            + "\n"
            + "A. SQL.\n"
            + "B. PL/SQL.\n"
            + "C. T-SQL.\n"
            + "D. Cả SQL và PL/SQL.",});

        TITLE_MAP.put("SQL Server", new String[]{
            "SQL Server là gì?\n"
            + "\n"
            + "A. Một hệ quản trị cơ sở dữ liệu quan hệ của Microsoft.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ nào được sử dụng để quản lý cơ sở dữ liệu SQL Server thông qua giao diện đồ họa?\n"
            + "\n"
            + "A. SQL Server Management Studio (SSMS).\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Loại engine lưu trữ mặc định trong SQL Server là gì?\n"
            + "\n"
            + "A. MyISAM.\n"
            + "B. InnoDB.\n"
            + "C. Heap.\n"
            + "D. Clustered index.",
            "Câu lệnh nào được sử dụng để tạo một bảng mới trong SQL Server?\n"
            + "\n"
            + "A. CREATE DATABASE.\n"
            + "B. CREATE TABLE.\n"
            + "C. CREATE SCHEMA.\n"
            + "D. NEW TABLE.",
            "SQL Server hỗ trợ loại chỉ mục nào?\n"
            + "\n"
            + "A. B-tree.\n"
            + "B. Hash.\n"
            + "C. Clustered và non-clustered.\n"
            + "D. Tất cả các đáp án trên.",
            "SQL Server sử dụng loại ngôn ngữ lập trình nào cho stored procedures?\n"
            + "\n"
            + "A. PL/SQL.\n"
            + "B. T-SQL.\n"
            + "C. C#.\n"
            + "D. Java.",
            "SQL Server hỗ trợ loại transaction isolation level nào?\n"
            + "\n"
            + "A. READ UNCOMMITTED.\n"
            + "B. READ COMMITTED.\n"
            + "C. REPEATABLE READ.\n"
            + "D. Tất cả các đáp án trên.",
            "SQL Server hỗ trợ loại replication nào?\n"
            + "\n"
            + "A. Transactional replication.\n"
            + "B. Merge replication.\n"
            + "C. Snapshot replication.\n"
            + "D. Tất cả các đáp án trên.",
            "SQL Server hỗ trợ loại security feature nào?\n"
            + "\n"
            + "A. Row-level security.\n"
            + "B. Dynamic data masking.\n"
            + "C. Always Encrypted.\n"
            + "D. Tất cả các đáp án trên.",
            "SQL Server hỗ trợ loại availability feature nào?\n"
            + "\n"
            + "A. Always On Availability Groups.\n"
            + "B. Database Mirroring.\n"
            + "C. Log Shipping.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("PostgreSQL", new String[]{
            "PostgreSQL là gì?\n"
            + "\n"
            + "A. Một hệ quản trị cơ sở dữ liệu quan hệ mã nguồn mở.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ nào được sử dụng để quản lý cơ sở dữ liệu PostgreSQL thông qua giao diện đồ họa?\n"
            + "\n"
            + "A. pgAdmin.\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Loại engine lưu trữ mặc định trong PostgreSQL là gì?\n"
            + "\n"
            + "A. MyISAM.\n"
            + "B. InnoDB.\n"
            + "C. Heap.\n"
            + "D. MVCC (Multi-Version Concurrency Control).",
            "Câu lệnh nào được sử dụng để tạo một schema mới trong PostgreSQL?\n"
            + "\n"
            + "A. CREATE DATABASE.\n"
            + "B. CREATE TABLE.\n"
            + "C. CREATE SCHEMA.\n"
            + "D. NEW SCHEMA.",
            "PostgreSQL hỗ trợ loại chỉ mục nào?\n"
            + "\n"
            + "A. B-tree.\n"
            + "B. Hash.\n"
            + "C. GiST, SP-GiST, GIN, BRIN.\n"
            + "D. Tất cả các đáp án trên.",
            "PostgreSQL sử dụng loại giấy phép nào?\n"
            + "\n"
            + "A. GPL.\n"
            + "B. LGPL.\n"
            + "C. BSD.\n"
            + "D. Thương mại.",
            "PostgreSQL hỗ trợ loại kiểu dữ liệu JSON nào?\n"
            + "\n"
            + "A. JSONB.\n"
            + "B. JSON.\n"
            + "C. XML.\n"
            + "D. TEXT.",
            "PostgreSQL hỗ trợ loại transaction isolation level nào?\n"
            + "\n"
            + "A. READ UNCOMMITTED.\n"
            + "B. READ COMMITTED.\n"
            + "C. REPEATABLE READ.\n"
            + "D. Tất cả các đáp án trên.",
            "PostgreSQL hỗ trợ loại replication nào?\n"
            + "\n"
            + "A. Asynchronous replication.\n"
            + "B. Synchronous replication.\n"
            + "C. Logical replication.\n"
            + "D. Tất cả các đáp án trên.",
            "PostgreSQL hỗ trợ loại stored procedure language nào?\n"
            + "\n"
            + "A. PL/pgSQL.\n"
            + "B. PL/SQL.\n"
            + "C. T-SQL.\n"
            + "D. Cả PL/pgSQL và PL/SQL.",});

        TITLE_MAP.put("Oracle", new String[]{
            "Oracle Database là gì?\n"
            + "\n"
            + "A. Một hệ quản trị cơ sở dữ liệu quan hệ thương mại.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ nào được sử dụng để quản lý cơ sở dữ liệu Oracle thông qua giao diện đồ họa?\n"
            + "\n"
            + "A. SQL Developer.\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Loại engine lưu trữ mặc định trong Oracle Database là gì?\n"
            + "\n"
            + "A. MyISAM.\n"
            + "B. InnoDB.\n"
            + "C. Heap.\n"
            + "D. Oracle Database Block.",
            "Câu lệnh nào được sử dụng để tạo một bảng mới trong Oracle Database?\n"
            + "\n"
            + "A. CREATE DATABASE.\n"
            + "B. CREATE TABLE.\n"
            + "C. CREATE SCHEMA.\n"
            + "D. NEW TABLE.",
            "Oracle Database hỗ trợ loại chỉ mục nào?\n"
            + "\n"
            + "A. B-tree.\n"
            + "B. Hash.\n"
            + "C. Bitmap, Function-based.\n"
            + "D. Tất cả các đáp án trên.",
            "Oracle Database sử dụng loại ngôn ngữ lập trình nào cho stored procedures?\n"
            + "\n"
            + "A. PL/SQL.\n"
            + "B. T-SQL.\n"
            + "C. C#.\n"
            + "D. Java.",
            "Oracle Database hỗ trợ loại transaction isolation level nào?\n"
            + "\n"
            + "A. READ UNCOMMITTED.\n"
            + "B. READ COMMITTED.\n"
            + "C. REPEATABLE READ.\n"
            + "D. Tất cả các đáp án trên.",
            "Oracle Database hỗ trợ loại replication nào?\n"
            + "\n"
            + "A. Data Guard.\n"
            + "B. GoldenGate.\n"
            + "C. Streams.\n"
            + "D. Tất cả các đáp án trên.",
            "Oracle Database hỗ trợ loại security feature nào?\n"
            + "\n"
            + "A. Virtual Private Database (VPD).\n"
            + "B. Advanced Security Option (ASO).\n"
            + "C. Database Vault.\n"
            + "D. Tất cả các đáp án trên.",
            "Oracle Database hỗ trợ loại availability feature nào?\n"
            + "\n"
            + "A. Real Application Clusters (RAC).\n"
            + "B. Data Guard.\n"
            + "C. Flashback Database.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("IDE cho SQL", new String[]{
            "IDE cho SQL là gì?\n"
            + "\n"
            + "A. Một môi trường phát triển tích hợp dành cho SQL.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ nào là một IDE phổ biến cho SQL?\n"
            + "\n"
            + "A. SQL Server Management Studio (SSMS).\n"
            + "B. DBeaver.\n"
            + "C. Azure Data Studio.\n"
            + "D. Tất cả các đáp án trên.",
            "Tính năng nào được cung cấp bởi IDE cho SQL?\n"
            + "\n"
            + "A. Gợi ý mã.\n"
            + "B. Gỡ lỗi.\n"
            + "C. Định dạng mã.\n"
            + "D. Tất cả các đáp án trên.",
            "IDE nào hỗ trợ nhiều hệ quản trị cơ sở dữ liệu khác nhau?\n"
            + "\n"
            + "A. SSMS.\n"
            + "B. SQL Developer.\n"
            + "C. DBeaver.\n"
            + "D. Azure Data Studio.",
            "IDE nào được phát triển bởi Microsoft?\n"
            + "\n"
            + "A. DBeaver.\n"
            + "B. SQL Developer.\n"
            + "C. Azure Data Studio.\n"
            + "D. HeidiSQL.",
            "IDE nào được phát triển bởi Oracle?\n"
            + "\n"
            + "A. DBeaver.\n"
            + "B. SQL Developer.\n"
            + "C. Azure Data Studio.\n"
            + "D. HeidiSQL.",
            "IDE nào là mã nguồn mở?\n"
            + "\n"
            + "A. DBeaver.\n"
            + "B. SQL Developer.\n"
            + "C. Azure Data Studio.\n"
            + "D. SSMS.",
            "IDE nào hỗ trợ loại kết nối cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. JDBC.\n"
            + "B. ODBC.\n"
            + "C. Native client.\n"
            + "D. Tất cả các đáp án trên.",
            "IDE nào cung cấp loại tính năng trực quan nào?\n"
            + "\n"
            + "A. Execution plan visualization.\n"
            + "B. Database schema visualization.\n"
            + "C. Data visualization.\n"
            + "D. Tất cả các đáp án trên.",
            "IDE nào cung cấp loại công cụ quản lý cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. Table management.\n"
            + "B. Index management.\n"
            + "C. User management.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Công cụ GUI", new String[]{
            "Công cụ GUI cho SQL là gì?\n"
            + "\n"
            + "A. Một giao diện đồ họa người dùng để quản lý cơ sở dữ liệu SQL.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Công cụ GUI nào được sử dụng để quản lý cơ sở dữ liệu MySQL?\n"
            + "\n"
            + "A. phpMyAdmin.\n"
            + "B. MySQL Workbench.\n"
            + "C. HeidiSQL.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ GUI nào được sử dụng để quản lý cơ sở dữ liệu PostgreSQL?\n"
            + "\n"
            + "A. pgAdmin.\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Công cụ GUI nào được sử dụng để quản lý cơ sở dữ liệu SQL Server?\n"
            + "\n"
            + "A. SQL Server Management Studio (SSMS).\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Công cụ GUI nào hỗ trợ nhiều hệ quản trị cơ sở dữ liệu khác nhau?\n"
            + "\n"
            + "A. DBeaver.\n"
            + "B. SQL Developer.\n"
            + "C. Azure Data Studio.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ GUI nào được sử dụng để quản lý cơ sở dữ liệu Oracle?\n"
            + "\n"
            + "A. SQL Developer.\n"
            + "B. MySQL Workbench.\n"
            + "C. phpMyAdmin.\n"
            + "D. HeidiSQL.",
            "Công cụ GUI nào cung cấp loại tính năng trực quan nào?\n"
            + "\n"
            + "A. Execution plan visualization.\n"
            + "B. Database schema visualization.\n"
            + "C. Data visualization.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ GUI nào cung cấp loại công cụ quản lý cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. Table management.\n"
            + "B. Index management.\n"
            + "C. User management.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ GUI nào cung cấp loại công cụ phân tích dữ liệu nào?\n"
            + "\n"
            + "A. Data filtering.\n"
            + "B. Data sorting.\n"
            + "C. Data aggregation.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ GUI nào cung cấp loại công cụ báo cáo nào?\n"
            + "\n"
            + "A. Report generation.\n"
            + "B. Report scheduling.\n"
            + "C. Report export.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("ORM", new String[]{
            "ORM (Object-Relational Mapping) là gì?\n"
            + "\n"
            + "A. Một kỹ thuật ánh xạ dữ liệu giữa các đối tượng trong ứng dụng và cơ sở dữ liệu quan hệ.\n"
            + "B. Một ngôn ngữ lập trình.\n"
            + "C. Một hệ điều hành.\n"
            + "D. Một công cụ phân tích dữ liệu.",
            "Lợi ích chính của việc sử dụng ORM là gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn.\n"
            + "B. Giảm thiểu mã SQL thủ công.\n"
            + "C. Tăng tính bảo mật.\n"
            + "D. Đơn giản hóa việc quản lý cơ sở dữ liệu.",
            "ORM nào phổ biến cho Java?\n"
            + "\n"
            + "A. Hibernate.\n"
            + "B. Entity Framework.\n"
            + "C. Django ORM.\n"
            + "D. SQLAlchemy.",
            "ORM nào phổ biến cho .NET?\n"
            + "\n"
            + "A. Hibernate.\n"
            + "B. Entity Framework.\n"
            + "C. Django ORM.\n"
            + "D. SQLAlchemy.",
            "ORM nào phổ biến cho Python?\n"
            + "\n"
            + "A. Hibernate.\n"
            + "B. Entity Framework.\n"
            + "C. Django ORM và SQLAlchemy.\n"
            + "D. Tất cả các đáp án trên.",
            "ORM cung cấp loại tính năng ánh xạ nào?\n"
            + "\n"
            + "A. Object-relational mapping.\n"
            + "B. Inheritance mapping.\n"
            + "C. Composition mapping.\n"
            + "D. Tất cả các đáp án trên.",
            "ORM cung cấp loại tính năng truy vấn nào?\n"
            + "\n"
            + "A. Criteria queries.\n"
            + "B. HQL (Hibernate Query Language).\n"
            + "C. LINQ (Language Integrated Query).\n"
            + "D. Tất cả các đáp án trên.",
            "ORM cung cấp loại tính năng quản lý giao dịch nào?\n"
            + "\n"
            + "A. Transaction management.\n"
            + "B. Concurrency control.\n"
            + "C. Caching.\n"
            + "D. Tất cả các đáp án trên.",
            "ORM cung cấp loại tính năng di chuyển lược đồ nào?\n"
            + "\n"
            + "A. Schema migration.\n"
            + "B. Database version control.\n"
            + "C. Data seeding.\n"
            + "D. Tất cả các đáp án trên.",
            "ORM cung cấp loại lợi ích hiệu suất nào?\n"
            + "\n"
            + "A. Lazy loading.\n"
            + "B. Eager loading.\n"
            + "C. Caching.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Công cụ tối ưu hiệu suất", new String[]{
            "Công cụ tối ưu hiệu suất SQL được sử dụng để làm gì?\n"
            + "\n"
            + "A. Tăng tốc độ truy vấn.\n"
            + "B. Giảm thiểu lỗi cú pháp.\n"
            + "C. Tăng tính bảo mật.\n"
            + "D. Đơn giản hóa mã SQL.",
            "Công cụ nào được sử dụng để phân tích hiệu suất truy vấn trong SQL Server?\n"
            + "\n"
            + "A. SQL Server Profiler.\n"
            + "B. Query Store.\n"
            + "C. Execution Plan.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích hiệu suất truy vấn trong MySQL?\n"
            + "\n"
            + "A. EXPLAIN.\n"
            + "B. MySQL Enterprise Monitor.\n"
            + "C. Performance Schema.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích hiệu suất truy vấn trong PostgreSQL?\n"
            + "\n"
            + "A. EXPLAIN.\n"
            + "B. pgBadger.\n"
            + "C. pg_stat_statements.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để tối ưu hóa hiệu suất truy vấn SQL?\n"
            + "\n"
            + "A. Sử dụng chỉ mục.\n"
            + "B. Tối ưu hóa truy vấn.\n"
            + "C. Cấu hình máy chủ cơ sở dữ liệu.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích loại tắc nghẽn hiệu suất nào?\n"
            + "\n"
            + "A. CPU bottlenecks.\n"
            + "B. Memory bottlenecks.\n"
            + "C. I/O bottlenecks.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích loại truy vấn chậm nào?\n"
            + "\n"
            + "A. Long-running queries.\n"
            + "B. Blocking queries.\n"
            + "C. Deadlock queries.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích loại chỉ mục nào?\n"
            + "\n"
            + "A. Missing indexes.\n"
            + "B. Unused indexes.\n"
            + "C. Fragmentation indexes.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích loại thống kê truy vấn nào?\n"
            + "\n"
            + "A. Query execution statistics.\n"
            + "B. Query plan statistics.\n"
            + "C. Query I/O statistics.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để phân tích loại cấu hình máy chủ nào?\n"
            + "\n"
            + "A. Memory configuration.\n"
            + "B. CPU configuration.\n"
            + "C. I/O configuration.\n"
            + "D. Tất cả các đáp án trên.",});
    }
  // Phương thức lấy tiêu đề theo chỉ số dựa vào ngôn ngữ
    public static String getTitle(String language, int index) {
        if (TITLE_MAP.containsKey(language)) {
            String[] titles = TITLE_MAP.get(language);
            if (index >= 0 && index < titles.length) {
                return titles[index];
            }
        }
        return "Không có tiêu đề";
    }

    // Phương thức lấy toàn bộ danh sách tiêu đề của một ngôn ngữ
    public static String[] getTitles(String language) {
        return TITLE_MAP.getOrDefault(language, new String[]{"Không có danh sách tiêu đề"});
    }
}
