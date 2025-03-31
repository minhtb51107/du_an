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
public class DanhSachBaiHocData {

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {
        TITLE_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "C là gì?",
            "Tại sao nên học C?",
            "Các đặc điểm nổi bật của C"
        });

        TITLE_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "Nguồn gốc của C",
            "Các phiên bản của C",
            "C và các ngôn ngữ lập trình khác"
        });

        TITLE_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "Đặc điểm của C",
            "Ứng dụng của C trong lập trình hệ thống",
            "C trong phát triển phần mềm nhúng"
        });

        TITLE_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "Cấu trúc tổng quát",
            "Khai báo biến",
            "Hàm main"
        });

        TITLE_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "Các bước biên dịch",
            "Trình biên dịch và trình liên kết",
            "Quá trình thực thi"
        });

        TITLE_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "Câu lệnh if",
            "Câu lệnh if-else",
            "Câu lệnh switch-case"
        });

        TITLE_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "Vòng lặp for",
            "Vòng lặp while",
            "Vòng lặp do-while"
        });

        TITLE_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "Khai báo mảng một chiều",
            "Khởi tạo mảng một chiều",
            "Truy cập và thao tác với phần tử trong mảng"
        });

        TITLE_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "Khai báo mảng hai chiều",
            "Khởi tạo mảng hai chiều",
            "Truy cập và thao tác với phần tử"
        });

        TITLE_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "Khai báo chuỗi",
            "Các hàm xử lý chuỗi",
            "So sánh và nối chuỗi"
        });

        TITLE_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "Khái niệm về con trỏ",
            "Khai báo con trỏ",
            "Toán tử con trỏ"
        });

        TITLE_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "Cú pháp định nghĩa hàm",
            "Gọi hàm",
            "Hàm trả về giá trị"
        });

        TITLE_MAP.put("Truyền tham số vào hàm", new String[]{
            "Truyền tham số theo giá trị",
            "Truyền tham số theo tham chiếu",
            "Sử dụng con trỏ để truyền tham số"
        });

        TITLE_MAP.put("Hàm đệ quy", new String[]{
            "Khái niệm hàm đệ quy",
            "Cách hoạt động của hàm đệ quy",
            "Ví dụ về hàm đệ quy"
        });

        TITLE_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "Cấu trúc dữ liệu cơ bản",
            "File I/O trong C",
            "Các hàm file I/O"
        });

        TITLE_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "Khái niệm về struct",
            "Khái niệm về union",
            "Sự khác biệt giữa struct và union"
        });

        TITLE_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "Danh sách liên kết",
            "Ngăn xếp",
            "Hàng đợi"
        });

        TITLE_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "Mở và đóng tệp tin",
            "Đọc và ghi tệp tin",
            "Các hàm xử lý tệp tin"
        });

//SQL
        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "Giới thiệu SQL",
            "Khái niệm",
            "Kiểu dữ liệu, toán tử, biểu thức"

        });

        TITLE_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "SELECT",
            "INSERT",
            "UPDATE",
            "DELETE"
        });

        TITLE_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "Kiểu dữ liệu số, chuỗi, ngày tháng",
            "Toán tử số học, so sánh, logic"
        });

        TITLE_MAP.put("Các hàm SQL cơ bản", new String[]{
            "Hàm tổng hợp",
            "Hàm xử lý chuỗi",
            "Hàm xử lý ngày tháng"
        });

        TITLE_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "PRIMARY KEY, FOREIGN KEY",
            "UNIQUE, CHECK, NOT NULL",
            "DEFAULT"
        });

        TITLE_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "Tạo, xóa cơ sở dữ liệu",
            "Sao lưu và phục hồi",
            "Quản lý quyền truy cập"
        });

        TITLE_MAP.put("Quản lý bảng", new String[]{
            "Tạo, xóa, sửa bảng",
            "Tăng giá trị tự động",
            "Tạo, xóa VIEW"
        });

        TITLE_MAP.put("Kết hợp dữ liệu", new String[]{
            "JOIN",
            "SELF JOIN",
            "UNION"
        });

        TITLE_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "GROUP BY",
            "Hàm tổng hợp",
            "HAVING"
        });

        TITLE_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "UPPER, LOWER",
            "SUBSTRING",
            "ROUND",
            "NOW, DATE_FORMAT"
        });

        TITLE_MAP.put("Xử lý dữ liệu", new String[]{
            "SELECT INTO",
            "INSERT INTO SELECT",
            "CASE"
        });

        TITLE_MAP.put("Thủ tục lưu trữ", new String[]{
            "Tạo và sử dụng PROCEDURE",
            "Truyền tham số vào PROCEDURE",
            "Lợi ích và ứng dụng thực tế"
        });

        TITLE_MAP.put("Bảo mật SQL", new String[]{
            "Phòng chống SQL Injection",
            "Nguyên tắc Least Privilege"
        });

        TITLE_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "PARTITIONING, HASH PARTITIONING",
            "SHARDING",
            "BATCH PROCESSING"
        });

        TITLE_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "RECURSIVE QUERIES",
            "Biểu thức CTE",
            "WINDOW FUNCTIONS",
            "Dynamic SQL"
        });

        TITLE_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "MySQL",
            "SQL Server",
            "PostgreSQL",
            "Oracle"
        });

        TITLE_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "IDE cho SQL",
            "Công cụ GUI",
            "ORM",
            "Công cụ tối ưu hiệu suất"
        });
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

    private static final Map<String, String[]> DESCRIPTION_MAP = new HashMap<>();

    static {
        DESCRIPTION_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "Ngôn ngữ C là một ngôn ngữ lập trình bậc cao được phát triển vào những năm 1970.",
            "C là ngôn ngữ nền tảng cho nhiều ngôn ngữ lập trình hiện đại và được sử dụng rộng rãi trong phát triển phần mềm.",
            "C có tính linh hoạt, hiệu suất cao và khả năng truy cập phần cứng."
        });

        DESCRIPTION_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "Ngôn ngữ C được phát triển bởi Dennis Ritchie tại Bell Labs vào năm 1972.",
            "C đã trải qua nhiều phiên bản, từ C89, C99 đến C11 và C18.",
            "C đã ảnh hưởng đến nhiều ngôn ngữ lập trình khác như C++, Java, và C#."
        });

        DESCRIPTION_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "C có cú pháp đơn giản, hiệu suất cao và khả năng kiểm soát bộ nhớ tốt.",
            "C thường được sử dụng để phát triển hệ điều hành, trình biên dịch và phần mềm hệ thống.",
            "C cũng được sử dụng trong lập trình nhúng và phát triển ứng dụng."
        });

        DESCRIPTION_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "Một chương trình C cơ bản bao gồm các phần khai báo thư viện, khai báo biến và hàm main.",
            "Biến được khai báo trước khi sử dụng và có thể có nhiều kiểu dữ liệu khác nhau.",
            "Hàm main là điểm bắt đầu của chương trình."
        });

        DESCRIPTION_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "Quá trình biên dịch bao gồm tiền xử lý, biên dịch, liên kết và thực thi.",
            "Trình biên dịch chuyển đổi mã nguồn thành mã máy, trong khi trình liên kết kết hợp các tệp đối tượng.",
            "Sau khi biên dịch, chương trình có thể được thực thi trên máy tính."
        });

        DESCRIPTION_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "Câu lệnh if cho phép thực hiện một khối mã nếu điều kiện đúng.",
            "Câu lệnh if-else cho phép thực hiện một khối mã khác nếu điều kiện sai.",
            "Câu lệnh switch-case cho phép kiểm tra nhiều điều kiện khác nhau."
        });

        DESCRIPTION_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "Vòng lặp for thường được sử dụng khi số lần lặp đã biết trước.",
            "Vòng lặp while lặp lại cho đến khi điều kiện sai.",
            "Vòng lặp do-while đảm bảo rằng khối mã được thực thi ít nhất một lần."
        });

        DESCRIPTION_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "Mảng một chiều là một tập hợp các phần tử cùng kiểu dữ liệu, được lưu trữ liên tiếp trong bộ nhớ.",
            "Mảng một chiều có thể được khai báo bằng cách sử dụng cú pháp: `type arrayName[size];`, ví dụ: `int arr[10];`.",
            "Để khởi tạo mảng, bạn có thể sử dụng cú pháp: `type arrayName[size] = {value1, value2, ...};`, ví dụ: `int arr[5] = {1, 2, 3, 4, 5};`. Truy cập phần tử trong mảng được thực hiện bằng cách sử dụng chỉ số, ví dụ: `arr[0]` để truy cập phần tử đầu tiên."
        });

        DESCRIPTION_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "Mảng hai chiều là một mảng có hai chỉ số, thường được sử dụng để lưu trữ dữ liệu dạng bảng.",
            "Mảng hai chiều có thể được khởi tạo bằng cách sử dụng cú pháp giống như mảng một chiều, nhưng với hai chỉ số.",
            "Có thể truy cập và thao tác với các phần tử của mảng hai chiều bằng cách sử dụng chỉ số hàng và cột."
        });

        DESCRIPTION_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "Chuỗi trong C được khai báo như một mảng ký tự và kết thúc bằng ký tự null ('\\0').",
            "Thư viện string.h cung cấp nhiều hàm hữu ích như strlen, strcpy, strcat, và strcmp để xử lý chuỗi.",
            "Có thể so sánh và nối chuỗi bằng các hàm có sẵn trong thư viện string.h."
        });

        DESCRIPTION_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "Con trỏ là một biến lưu trữ địa chỉ của một biến khác trong bộ nhớ.",
            "Con trỏ được khai báo bằng cách sử dụng ký hiệu '*' trước tên biến.",
            "Toán tử '&' được sử dụng để lấy địa chỉ của một biến, trong khi toán tử '*' được sử dụng để truy cập giá trị tại địa chỉ mà con trỏ trỏ tới."
        });

        DESCRIPTION_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "Hàm được định nghĩa bằng cách chỉ định kiểu trả về, tên hàm và danh sách tham số.",
            "Hàm có thể được gọi từ bất kỳ đâu trong chương trình, miễn là nó đã được định nghĩa trước đó.",
            "Hàm có thể trả về giá trị hoặc không trả về giá trị (void)."
        });

        DESCRIPTION_MAP.put("Truyền tham số vào hàm", new String[]{
            "Tham số có thể được truyền vào hàm theo giá trị, nghĩa là một bản sao của giá trị được gửi đến hàm.",
            "Tham số cũng có thể được truyền theo tham chiếu, cho phép hàm thay đổi giá trị của biến gốc.",
            "Sử dụng con trỏ để truyền tham số cho phép hàm truy cập và thay đổi giá trị của biến bên ngoài."
        });

        DESCRIPTION_MAP.put("Hàm đệ quy", new String[]{
            "Hàm đệ quy là hàm gọi chính nó trong quá trình thực thi.",
            "Hàm đệ quy thường bao gồm một điều kiện dừng để tránh việc gọi vô hạn.",
            "Ví dụ điển hình của hàm đệ quy là tính giai thừa của một số."
        });

        DESCRIPTION_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "Cấu trúc dữ liệu là cách tổ chức và lưu trữ dữ liệu để có thể sử dụng hiệu quả.",
            "File I/O cho phép chương trình đọc và ghi dữ liệu từ và vào tệp tin.",
            "Các hàm file I/O như fopen, fclose, fread, fwrite, fprintf, và fscanf được sử dụng để thao tác với tệp tin."
        });

        DESCRIPTION_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "Struct là một kiểu dữ liệu cho phép nhóm nhiều biến khác nhau thành một đơn vị duy nhất.",
            "Union cũng cho phép nhóm nhiều biến, nhưng chỉ một biến có thể được lưu trữ tại một thời điểm.",
            "Sự khác biệt chính giữa struct và union là struct chiếm bộ nhớ cho tất cả các thành viên, trong khi union chỉ chiếm bộ nhớ cho thành viên lớn nhất."
        });

        DESCRIPTION_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "Danh sách liên kết là một cấu trúc dữ liệu cho phép lưu trữ các phần tử không liên tiếp trong bộ nhớ.",
            "Ngăn xếp là một cấu trúc dữ liệu theo nguyên tắc LIFO (Last In, First Out), cho phép thêm và xóa phần tử từ đầu danh sách.",
            "Hàng đợi là một cấu trúc dữ liệu theo nguyên tắc FIFO (First In, First Out), cho phép thêm phần tử ở cuối và xóa phần tử ở đầu."
        });

        DESCRIPTION_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "Hàm fopen được sử dụng để mở tệp tin và trả về con trỏ đến tệp tin đó.",
            "Hàm fclose được sử dụng để đóng tệp tin đã mở, giải phóng tài nguyên.",
            "Các hàm fread và fwrite được sử dụng để đọc và ghi dữ liệu từ và vào tệp tin, trong khi fprintf và fscanf được sử dụng để định dạng và xử lý dữ liệu."
        });

        //SQL
        DESCRIPTION_MAP.put("Giới thiệu SQL", new String[]{
            "SQL là gì?, lịch sử và ứng dụng của SQL, Các hệ quản trị cơ sở dữ liệu phổ biến",
            "Các khái niệm RDBMS, DATABASE là gì?, cú pháp SQL cơ bản",
            "Kiểu dữ liệu, toán tử, biểu thức(EXPRESSION)"
        });

        DESCRIPTION_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "Lấy dữ liệu từ bảng",
            "Thêm dữ liệu vào bảng",
            "Cập nhật dữ liệu",
            "Xóa dữ liệu"
        });

        DESCRIPTION_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "Kiểu dữ liệu số, kiểu dữ liệu chuỗi, kiểu dữ liệu ngày tháng",
            "Toán tử số học, toán tử so sánh, toán tử logic"
        });

        DESCRIPTION_MAP.put("Các hàm SQL cơ bản", new String[]{
            "COUNT, SUM, AVG, MIN, MAX",
            "CONCAT, SUBSTRING, UPPER, LOWER",
            "NOW, DATE_FORMAT"
        });

        DESCRIPTION_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "Khóa chính, Khóa ngoại",
            "Giá trị duy nhất, kiểm tra điều kiện dữ liệu, không cho phép giá trị NULL",
            "Giá trị mặc định"
        });

        DESCRIPTION_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "CREATE DATABASE, DROP DATABASE",
            "BACKUP DATABASE(cơ sở dữ liệu, MySQL Dump, SQL server), RESTORE DATABASE(cơ sở dữ liệu, MySQL, SQL server) ",
            "User Permissions Management: tạo người dùng mới, cấp quyền cho người dùng, thu hồi quyền(REVOKE), xóa người dùng"
        });

        DESCRIPTION_MAP.put("Quản lý bảng", new String[]{
            "CREATE TABLE, DROP TABLE, ALTER TABLE",
            "AUTO_INCREMENT",
            "CREATE VIEW, DROP VIEW"
        });

        DESCRIPTION_MAP.put("Kết hợp dữ liệu", new String[]{
            "Kết hợp bảng, các loại JOIN phổ biến: INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN",
            "Kết hợp bảng với chính nó",
            "Kết hợp nhiều tập dữ liệu"
        });

        DESCRIPTION_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "Gom nhóm dữ liệu",
            "COUNT, SUM, AVG",
            "Lọc dữ liệu sau GROUP BY"
        });

        DESCRIPTION_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "Chuyển đổi chữ hoa/thường",
            "Trích xuất chuỗi",
            "Làm tròn số",
            "Xử lý ngày tháng"
        });

        DESCRIPTION_MAP.put("Xử lý dữ liệu", new String[]{
            "Tạo bản sao dữ liệu",
            "Sao chép dữ liệu giữa bảng",
            "Cấu trúc điều kiện trong SQL"
        });

        DESCRIPTION_MAP.put("Thủ tục lưu trữ", new String[]{
            "Tạo và sử dụng PROCEDURE",
            "Truyền tham số",
            "Lợi ích(tăng hiệu suất, bảo mật tốt hơn, tái sử dụng) và ứng dụng thực tế(tự động hóa báo cáo hàng tháng, xử lý đăng nhập/kiểm tra tài khoản, xử lý đơn hàng/cập nhật tồn kho"
        });

        DESCRIPTION_MAP.put("Bảo mật SQL", new String[]{
            "SQL Injection là một dạng tấn công bảo mật trong đó kẻ tấn công chèn mã SQL độc hại vào các truy vấn để lấy cắp dữ liệu hoặc làm hỏng hệ thống.",
            "Least Privilege là nguyên tắc bảo mật yêu cầu mỗi người dùng chỉ có quyền tối thiểu cần thiết để thực hiện công việc của họ."
        });

        DESCRIPTION_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "Phân vùng dữ liệu, phân vùng theo danh sách giá trị cụ thể, phân vùng theo hàm băm",
            "Chia nhỏ dữ liệu",
            "Xử lý hàng loạt"
        });

        DESCRIPTION_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "Truy vấn đệ quy",
            "Common Table Expressions",
            "Hàm cửa sổ",
            "SQL động"
        });

        DESCRIPTION_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "MySQL - Đặc điểm và cú pháp riêng",
            "SQL Server - Tích hợp với Microsoft",
            "PostgreSQL - Tính năng mạnh mẽ",
            "Oracle - Doanh nghiệp và bảo mật"
        });

        DESCRIPTION_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "MySQL Workbench, DBeaver",
            "pgAdmin, SQL Server Management Studio",
            "Hibernate, SQLAlchemy",
            "EXPLAIN, Query Profiler"
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getDescription(String language, int index) {
        if (DESCRIPTION_MAP.containsKey(language)) {
            String[] descriptions = DESCRIPTION_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getDescriptions(String language) {
        return DESCRIPTION_MAP.getOrDefault(language, new String[]{"Không có mô tả nào."});
    }

    private static final Map<String, String[]> ICON_MAP = new HashMap<>();

    static {
        ICON_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Truyền tham số vào hàm", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Hàm đệ quy", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "",
            "",
            ""
        });

        //SQL
        ICON_MAP.put("Giới thiệu SQL", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Các hàm SQL cơ bản", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý bảng", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Kết hợp dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Thủ tục lưu trữ", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Bảo mật SQL", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "",
            "",
            "",
            ""
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getIcon(String language, int index) {
        if (ICON_MAP.containsKey(language)) {
            String[] descriptions = ICON_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getIcons(String language) {
        return ICON_MAP.getOrDefault(language, new String[]{"Không có mô tả nào."});
    }
}
