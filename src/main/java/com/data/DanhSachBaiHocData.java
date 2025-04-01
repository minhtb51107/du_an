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

        //Python
        TITLE_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "Giới thiệu về Python",
            "Lịch sử phát triển",
            "Lý do chọn Python"
        });

        TITLE_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "Cấu trúc chương trình Python",
            "Cài đặt môi trường và IDE"
        });

        TITLE_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "Biến",
            "Kiểu dữ liệu",
            "Toán tử",
            "Nhập xuất dữ liệu"
        });

        TITLE_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "Cấu trúc điều kiện",
            "Vòng lặp",
            "Danh sách",
            "Tuple",
            "Dictionary"
        });

        TITLE_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "OOP"
        });

        TITLE_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "Đọc/ghi file CSV",
            "JSON",
            "XML"
        });

        TITLE_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "Try-except",
            "Finally",
            "Tạo ngoại lệ tùy chỉnh"
        });

        TITLE_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "Lập trình đa luồng",
            "Bất đồng bộ"
        });

        TITLE_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "Requests",
            "BeautifulSoup",
            "Selenium"

        });

        TITLE_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "SQLite",
            "MySQL",
            "PostgreSQL",
            "ORM với SQLAlchemy"
        });

        TITLE_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "Pandas",
            "Numpy",
            "Matplotlib"
        });

        TITLE_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "Socket",
            "Giao thức TCP/IP",
            "UDP"
        });

        TITLE_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            "Xây dựng ứng dụng Web với Flask/Django"
        });

        TITLE_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            "Machine Learning với scikit-learn, TensorFlow, PyTorch"
        });

        TITLE_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Tự động hóa với Selenium, bot Telegram/Discord."
        });

        TITLE_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
            "Bảo mật, tối ưu hiệu năng",
            "kiểm thử với pytest, unittest"
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

        //Python
        DESCRIPTION_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "Python là một ngôn ngữ lập trình bậc cao, thông dịch, mạnh mẽ và dễ học",
            "1989 đến nay",
            "Python có cú pháp gần với ngôn ngữ tự nhiên, giúp người mới học dễ tiếp cận hơn so với các ngôn ngữ lập trình khác như C++ hay Java."
        });

        DESCRIPTION_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "Cấu trúc",
            "Cài đặt môi trường Python và Cài đặt IDE để lập trình Python"
        });

        DESCRIPTION_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "Biến là tên đại diện cho một giá trị trong bộ nhớ. Python không yêu cầu khai báo kiểu dữ liệu trước khi sử dụng biến.",
            "Kiểu dữ liệu số (Numeric Types), Kiểu dữ liệu chuỗi (Text Type), Kiểu dữ liệu chuỗi (Sequence Types), Kiểu dữ liệu ánh xạ (Mapping Type), Kiểu dữ liệu tập hợp (Set Types), Kiểu dữ liệu Boolean (Boolean Type), Kiểu dữ liệu nhị phân (Binary Types), Kiểu dữ liệu None (None Type)",
            "Toán tử số học (Arithmetic Operators), Toán tử so sánh (Comparison Operators), Toán tử gán (Assignment Operators), Toán tử logic (Logical Operators), Toán tử bitwise (Bitwise Operators), Toán tử thành viên (Membership Operators), Toán tử nhận dạng (Identity Operators)",
            "Xuất dữ liệu (Output), Nhập dữ liệu (Input), Đọc/Ghi file (File I/O)"
        });

        DESCRIPTION_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "Cấu trúc điều kiện giúp kiểm tra điều kiện và thực thi các khối lệnh khác nhau tùy vào kết quả kiểm tra.",
            "Vòng lặp giúp thực thi một khối lệnh nhiều lần.",
            "Danh sách là một cấu trúc dữ liệu có thể chứa nhiều phần tử.",
            "Tuple tương tự List nhưng không thể thay đổi giá trị sau khi khởi tạo.",
            "Dictionary lưu dữ liệu dưới dạng cặp key-value."
        });

        DESCRIPTION_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "Lập trình hướng đối tượng (OOP) là một phương pháp lập trình dựa trên việc sử dụng các đối tượng để tổ chức và quản lý mã nguồn."
        });

        DESCRIPTION_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "CSV (Comma-Separated Values) là định dạng phổ biến để lưu trữ dữ liệu dạng bảng.",
            "JSON (JavaScript Object Notation) là định dạng lưu trữ phổ biến, dễ đọc và trao đổi dữ liệu.",
            "XML (Extensible Markup Language) được sử dụng để trao đổi dữ liệu có cấu trúc."
        });

        DESCRIPTION_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "Câu lệnh try-except giúp bắt lỗi và ngăn chặn chương trình bị dừng đột ngột.",
            "Khối finally luôn được thực thi dù có lỗi hay không, giúp thực hiện các thao tác dọn dẹp tài nguyên.",
            "Python cho phép bạn định nghĩa ngoại lệ riêng bằng cách kế thừa từ lớp Exception."
        });

        DESCRIPTION_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "Thư viện threading trong Python giúp chạy nhiều luồng đồng thời để tối ưu hiệu suất.",
            "Thư viện asyncio giúp thực thi tác vụ bất đồng bộ mà không cần tạo luồng mới."
        });

        DESCRIPTION_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "Thư viện requests giúp gửi các yêu cầu HTTP GET, POST đến API.",
            "BeautifulSoup giúp trích xuất dữ liệu từ trang web bằng HTML.",
            "Selenium giúp thao tác với trình duyệt, tự động nhập dữ liệu và bấm nút."
        });

        DESCRIPTION_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "SQLite là một CSDL nhẹ, dễ sử dụng.",
            "MySQL là một hệ quản trị CSDL phổ biến, được sử dụng trong nhiều ứng dụng thực tế.",
            "PostgreSQL là một hệ quản trị CSDL mạnh mẽ, hỗ trợ nhiều tính năng nâng cao.",
            "SQLAlchemy giúp làm việc với CSDL dễ dàng hơn bằng cách sử dụng ORM (Object-Relational Mapping).",});

        DESCRIPTION_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "pandas là một thư viện mạnh mẽ để thao tác dữ liệu có cấu trúc như bảng và chuỗi thời gian.",
            "numpy là một thư viện hỗ trợ tính toán khoa học và xử lý mảng lớn.",
            "matplotlib là thư viện phổ biến để vẽ biểu đồ và trực quan hóa dữ liệu."
        });

        DESCRIPTION_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "socket là một giao diện lập trình cho phép giao tiếp giữa các tiến trình qua mạng.",
            "Giao thức TCP/IP trong Python là cách sử dụng thư viện Python để lập trình mạng dựa trên bộ giao thức TCP/IP (Transmission Control Protocol/Internet Protocol) – nền tảng của mọi kết nối Internet. ",
            "UDP không đảm bảo dữ liệu đến đúng thứ tự hoặc không bị mất, nhưng nhanh hơn TCP."
        });

        DESCRIPTION_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            "Xây dựng ứng dụng web là một trong những ứng dụng phổ biến nhất của Python. Hai framework mạnh mẽ giúp phát triển web nhanh chóng là Flask (nhẹ, linh hoạt) và Django (mạnh mẽ, đầy đủ tính năng)."
        });

        DESCRIPTION_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            "Machine Learning (ML) là một lĩnh vực quan trọng trong khoa học máy tính, giúp máy tính học từ dữ liệu và đưa ra dự đoán. Python là một ngôn ngữ phổ biến để triển khai ML với nhiều thư viện mạnh mẽ như scikit-learn, TensorFlow, PyTorch."
        });

        DESCRIPTION_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Tự động hóa là một trong những ứng dụng mạnh mẽ của Python, giúp tiết kiệm thời gian và tăng hiệu suất công việc. Trong bài học này, chúng ta sẽ tìm hiểu cách sử dụng Selenium để tự động hóa trình duyệt web và cách tạo bot Telegram/Discord."
        });

        DESCRIPTION_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
            "Bảo mật, tối ưu hiệu năng trong Python",
            "Kiểm thử giúp đảm bảo chất lượng mã nguồn. Python có hai thư viện phổ biến là unittest (tích hợp sẵn) và pytest (mạnh mẽ hơn)."
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

        //Python 
        ICON_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "",});

        ICON_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            ""
        });

        ICON_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            ""
        });

        ICON_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            ""
        });

        ICON_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
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
