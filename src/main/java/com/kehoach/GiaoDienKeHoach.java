/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kehoach;

/**
 *
 * @author PC
 */
import com.dao.KhoaBieuDAO;
import com.dao.UserDAO;
import com.entity.KhoaBieu;
import com.entity.NguoiDung;
import com.text.text_swing.ImagePanel;
import com.text.text_swing.RoundedPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GiaoDienKeHoach extends JPanel {
    NguoiDung nguoiDung = new NguoiDung();
    
//    boolean aa = false;

    KhoaBieuDAO dao = new KhoaBieuDAO();

    String o = nguoiDung.getMaNguoiDung();
    
    int v = dao.getIdKeHoachByIdUser(o);;

    
    boolean isFakeClick = false; // Cờ xác định click giả lập

    //private final java.util.List<JPanel> panels = new ArrayList<>();

    private final Map<Integer, Integer> dayClickCounts = new HashMap<>(); // Lưu số lần nhấn PanelDay của mỗi tháng

    private final Map<Integer, Integer> monthClickCounts = new HashMap<>(); // Lưu số lần nhấn của mỗi tháng

    private int maxVerticalY = 0; // Chiều cao tối đa đã đạt được

    // Danh sách chứa các điểm để vẽ đường ngang và dọc
    private final ArrayList<Point> horizontalLines = new ArrayList<>();
    private final ArrayList<Point> verticalLines = new ArrayList<>();
    ArrayList<Point> horizontalLines1 = new ArrayList<>();
    ArrayList<Point> verticalLines1 = new ArrayList<>();
    ArrayList<Point> horizontalLines2 = new ArrayList<>();
    ArrayList<Point> verticalLines2 = new ArrayList<>();
    // Độ dài của mỗi đoạn đường
    private int lineLength = 850;
    private int startX = 50;
    private int startY = 50;

    private JPanel addPanel; // Panel "nút +" để thêm đoạn mới
    private JScrollPane scrollPane;
    private Point lastMousePosition;
    private boolean dragging = false; // Kiểm tra trạng thái kéo chuột

    private int extraHorizontalLength = 100; // Độ dài đoạn ngang thêm
    private int extraVerticalLength = 150; // Độ dài đoạn dọc thêm

    private int extraHorizontalLength1 = 100; // Độ dài đoạn ngang thêm
    private int extraVerticalLength1 = 100; // Độ dài đoạn dọc thêm

    public GiaoDienKeHoach(JScrollPane scrollPane) {
//        System.out.println("getMaNguoiDung " + nguoiDung.getMaNguoiDung());
        System.out.println("v1 " + v);

        this.scrollPane = scrollPane;
        setLayout(null);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

//        setBackground(new Color(223,223,215,255));
//        setPreferredSize(new Dimension(0, 0)); // Kích thước ban đầu
        // Thêm điểm đầu tiên của đường ngang
        horizontalLines.add(new Point(startX, startY));

        // Tạo panel thay thế nút "+" và thêm vào giao diện
        addPanel = createPanelyear(startX, startY - 10);
        add(addPanel);

        // Xử lý sự kiện chuột để hỗ trợ kéo toàn bộ panel
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastMousePosition = SwingUtilities.convertPoint(GiaoDienKeHoach.this, e.getPoint(), scrollPane);
                dragging = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (!dragging) {
                    return;
                }
                Point currentMouse = SwingUtilities.convertPoint(GiaoDienKeHoach.this, e.getPoint(), scrollPane);

                int dx = lastMousePosition.x - currentMouse.x;
                int dy = lastMousePosition.y - currentMouse.y;

                JScrollBar hBar = scrollPane.getHorizontalScrollBar();
                JScrollBar vBar = scrollPane.getVerticalScrollBar();

                if (Math.abs(dx) > 2 || Math.abs(dy) > 2) {
                    SwingUtilities.invokeLater(() -> {
                        hBar.setValue(hBar.getValue() + dx);
                        vBar.setValue(vBar.getValue() + dy);
                    });
                    lastMousePosition = currentMouse;
                }
            }
        });

        simulateClicks();
    }

    // Thêm một đoạn ngang mới vào hệ thống
    private void addNewHorizontalSegment(int i) {
//        System.out.println("i " + i);
        Point lastPoint = horizontalLines.get(horizontalLines.size() - 1);
        int newX = lastPoint.x + lineLength;
        horizontalLines.add(new Point(newX, lastPoint.y));

        JPanel squarePanel = createPanelMonth(lastPoint.x + (lineLength / 6), lastPoint.y, i, 0);
        add(squarePanel);

        // Tạo đoạn dọc nối với đoạn ngang mới
//        addNewVerticalSegment(squarePanel, i, 0);
//        addNewExtraSegment(squarePanel);
//        SwingUtilities.invokeLater(() -> {
//                squarePanel.dispatchEvent(new MouseEvent(squarePanel, MouseEvent.MOUSE_CLICKED, 
//                                                   System.currentTimeMillis(), 0, 0, 0, 1, false));
//        });
        // Di chuyển nút "+" sang vị trí mới
        addPanel.setBounds(newX, lastPoint.y - 25, 50, 50);
        setPreferredSize(new Dimension(newX + 100, getPreferredSize().height));
        revalidate();
        repaint();
    }

    // Thêm một đoạn dọc mới khi nhấn vào panel
    private void addNewVerticalSegment(JPanel clickedPanel, int i, int a) {
        Point panelLocation = clickedPanel.getLocation();
        int centerX = panelLocation.x + clickedPanel.getWidth() / 2;
        int newY = panelLocation.y + lineLength + 5;

        JPanel newPanel = createPanelMonth(centerX, newY, i, a);
        add(newPanel);

        // Thêm đường thẳng dọc từ panel cha xuống panel con
        verticalLines.add(new Point(centerX, newY));

        SwingUtilities.invokeLater(() -> {
            if (monthClickCounts.getOrDefault(i, 0) < a) {  // Kiểm tra giới hạn click
                isFakeClick = true;
                newPanel.dispatchEvent(new MouseEvent(newPanel, MouseEvent.MOUSE_CLICKED,
                        System.currentTimeMillis(), 0, 0, 0, 1, false));
                isFakeClick = false;
            }
        });

//        int tuan = dao.getSoTuanByThang(i);
//        System.out.println("tuan " + tuan);
//
//        SwingUtilities.invokeLater(() -> {
//            int currentClicks = dayClickCounts.getOrDefault(i, 0);
//            if (currentClicks < tuan) {
//                isFakeClick = true;
//                newPanel.dispatchEvent(new MouseEvent(newPanel, MouseEvent.MOUSE_CLICKED,
//                        System.currentTimeMillis(), 0, 0, 0, 1, false));
//                isFakeClick = false;
//            } else {
//
//            }
//        });

        // Cập nhật kích thước panel nếu cần
        int previousMaxHeight = getPreferredSize().height;
        maxVerticalY = Math.max(maxVerticalY, newY);
        setPreferredSize(new Dimension(getPreferredSize().width, maxVerticalY + 100));

        revalidate();
        repaint();

        // Cuộn xuống khi có panel mới được thêm
//        SwingUtilities.invokeLater(() -> {
//            JScrollBar vBar = scrollPane.getVerticalScrollBar();
//            if (previousMaxHeight < maxVerticalY) {
//                vBar.setValue(vBar.getMaximum());
//            }
//        });
    }

    // Thêm một đoạn ngang và đoạn dọc khi nhấn vào panel đen
    private void addNewExtraSegment(JPanel clickedPanel, int i, int a) {
        Point panelLocation = clickedPanel.getLocation();
        int centerX = panelLocation.x + clickedPanel.getWidth() / 2;
        int centerY = panelLocation.y + clickedPanel.getHeight() / 2;
        // Tạo điểm cuối của đoạn ngang (từ tâm panel qua phải)
        int newX = centerX + extraHorizontalLength;
//        horizontalLines1.add(new Point(centerX, centerY));
        horizontalLines1.add(new Point(newX, centerY));

        // Tạo đoạn dọc đứng xuống tại điểm cuối bên phải của đoạn ngang
        int newY = centerY + extraVerticalLength;
//        verticalLines1.add(new Point(centerX, centerY));  // Điểm bắt đầu
        verticalLines1.add(new Point(newX, newY));    // Điểm kết thúc
        


        // Tạo panel mới tại điểm giao giữa đoạn ngang và đoạn dọc
        if (isFakeClick) {
//            List<Integer> idTuanList = dao.selectIdTuanByThang(a);
//            int soTuan = idTuanList.size();
//            System.out.println("tháng a " + a);
//
//            for (int j = 1; j < soTuan; j++) {
//                JPanel newPanel = PanelTitle(newX, newY, idTuanList.get(j));
//                add(newPanel); 
//                System.out.println("chi so " + idTuanList.get(j));
//            }
//            
             JPanel newPanel = PanelTitle(newX, newY, i, a);
            add(newPanel);
            //System.out.println("chi so " + i);
        } else {
            JPanel newPanel = PanelTitle(newX, newY, i, a);
            add(newPanel);
        }

        JPanel Panel = PanelAndContent(newX, newY, i, a);
        add(Panel);

        //List<int[]> clickSimulationData = dao.getAllDataTUAN();

        addNewExtraSegment1(Panel, 0, clickCount1);

        // Cập nhật kích thước của JPanel nếu cần
//        maxVerticalY = Math.max(maxVerticalY, newY);
//        setPreferredSize(new Dimension(getPreferredSize().width, maxVerticalY));
        revalidate();
        repaint();
    }
    // Thêm một đoạn ngang và đoạn dọc khi nhấn vào panel đen

    private void addNewExtraSegment1(JPanel clickedPanel, int i, int b) {

        Point panelLocation = clickedPanel.getLocation();
        int centerX = panelLocation.x + clickedPanel.getWidth() / 2;
        int centerY = panelLocation.y + clickedPanel.getHeight() / 2;

        int newX = centerX + extraHorizontalLength1;
        int newY = centerY + extraVerticalLength1;

        horizontalLines2.add(new Point(newX, centerY));
        k++;
        if (isFakeClick) {
            JPanel newPanel = PanelContent(newX, newY, k);
            add(newPanel);
        } else {
            JPanel newPanel = PanelContent(newX, newY, k);
            add(newPanel);
            dao.insertNgay(b, k, "", b, v);
            dao.callCapNhatNgay(v);
        }
//        JPanel newPanel = PanelContent(newX, newY, i);
//        add(newPanel);

        if (i < 5) {
            verticalLines2.add(new Point(centerX, newY));

            // Sử dụng monthIndex để tạo PanelDay
            JPanel panel = PanelDay(centerX, newY, b);
            add(panel);
            //System.out.println("tuần b " + b);
            
            int ngay = dao.getSoNgayByTuan(b);

            SwingUtilities.invokeLater(() -> {
                int currentClicks = dayClickCounts.getOrDefault(b, 0);
                if (currentClicks < ngay) {
                    isFakeClick = true;
                    panel.dispatchEvent(new MouseEvent(panel, MouseEvent.MOUSE_CLICKED,
                            System.currentTimeMillis(), 0, 0, 0, 1, false));
                    isFakeClick = false;
                } else {

                }
            });
//            maxVerticalY = Math.max(maxVerticalY, newY);
//            setPreferredSize(new Dimension(getPreferredSize().width, maxVerticalY));
        }

        revalidate();
        repaint();
    }

    private JPanel PanelTitle(int x, int y, int i, int a) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.darkGray);
        panel.setBounds(x - 75, y - 105, 150, 50);
        panel.setLayout(new BorderLayout());

        // Tạo JTextField
        JTextField textField = new JTextField("");
        textField.setOpaque(false);  // Làm nền trong suốt
        textField.setForeground(Color.WHITE); // Chữ màu trắng
        textField.setBorder(null); // Xóa viền
        textField.setHorizontalAlignment(JTextField.CENTER); // Canh giữa
        textField.setFont(new Font("Arial", Font.BOLD, 14));

        panel.add(textField, BorderLayout.CENTER);

        //currentClicks1 = monthClickCounts.getOrDefault(i, 0);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            final int currentIndex = i; // Tạo bản sao để cố định giá trị
            final int a1 = a;
            @Override
            public void insertUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã được thêm: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateTieuDeCuaTuan(titleText, currentIndex, a1, v);
                }
                //System.out.println("clickCount1 " + currentIndex);
                //System.out.println("a1 " + a1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã bị xóa: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateTieuDeCuaTuan(titleText, currentIndex, a1, v);
                }
                //System.out.println("clickCount1 " + currentIndex);
                //System.out.println("a1 " + a1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã thay đổi: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateTieuDeCuaTuan(titleText, currentIndex, a1, v);
                }
               // System.out.println("clickCount1 " + currentIndex);
                //System.out.println("a1 " + a1);
            }
        });
        int currentIndex = i;
        //System.out.println("currentIndex " + currentIndex);
        String title = dao.selectTieuDeByTuan(currentIndex, v);
//        System.out.println("a " + a);

        textField.setText(title);
        

        return panel;
    }

    private JPanel PanelAndContent(int x, int y, int i, int b) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.darkGray);
        panel.setBounds(x - 25, y - 25, 50, 50);
        panel.setLayout(new BorderLayout());

        addPanelDiary(x, y, i, b);

        // Thêm JLabel chứa dấu "+"
//        JLabel plusLabel = new JLabel("+");
//        plusLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Chỉnh kích thước chữ
//        plusLabel.setForeground(Color.WHITE); // Màu chữ trắng
//        plusLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa ngang
//        plusLabel.setVerticalAlignment(JLabel.CENTER); // Căn giữa dọc
//
//        panel.add(plusLabel, BorderLayout.CENTER); // Thêm vào panel
        //addNewExtraSegment1(panel, 0, clickCount);
        panel.addMouseListener(new MouseAdapter() {
            // Tạo JTextField
            @Override
            public void mouseClicked(MouseEvent e) {
//                addNewExtraSegment1(panel, 0, clickCount1);
//                panel.removeAll(); 
//                panel.setBackground(Color.darkGray);
            }
        });
        return panel;
    }

//    private JPanel PanelAndContent1(int x, int y) {
//        RoundedPanel panel = new RoundedPanel(50);
//        panel.setBackground(Color.BLACK);
//        panel.setBounds(x - 25, y - 25, 50, 50);
//        panel.setLayout(new BorderLayout());
//        panel.addMouseListener(new MouseAdapter() {
//            // Tạo JTextField
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//                addNewExtraSegment1(panel);
//                System.out.println(clickCount);
//
//            }
//        });
//        return panel;
//    }
    
    int k;
    
    private JPanel PanelDay(int x, int y, int i) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.GRAY);
        panel.setBounds(x - 25, y - 25, 50, 50);
        panel.setLayout(new BorderLayout());

        //Đảm bảo mỗi tháng bắt đầu với 0 PanelDay
        dayClickCounts.putIfAbsent(i, 0);
//        System.out.println("i " + i);

        //int currentClicks = dayClickCounts.getOrDefault(i, 0);
        JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Chỉnh kích thước chữ
        plusLabel.setForeground(Color.WHITE); // Màu chữ trắng
        plusLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa ngang
        plusLabel.setVerticalAlignment(JLabel.CENTER); // Căn giữa dọc

        panel.add(plusLabel, BorderLayout.CENTER); // Thêm vào panel
        
        panel.putClientProperty("clicked", false);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((boolean) panel.getClientProperty("clicked")) {
                    //System.out.println("Panel đã được nhấn, không thực hiện lại.");
                    return;
                }

                int currentClicks = dayClickCounts.getOrDefault(i, 0);
                //System.out.println("c " + c);
                if (currentClicks < 6) {
                    addNewExtraSegment1(panel, currentClicks, i);
                    dayClickCounts.put(i, currentClicks + 1); // Tăng số lần nhấn
                    panel.removeAll();
                    panel.setBackground(Color.darkGray);

//                    if (aa) {
//                    dao.updateSoNgayTheoTuan(currentClicks + 1, i );
//                    } else{
                    //}
                    int d = currentClicks;
                    if (isFakeClick) {

                    } else {
                        dao.updateSoNgayTheoTuan(d + 1, i, v);
                    }

                    panel.putClientProperty("clicked", true); // Đánh dấu đã nhấn
                }
            }
        });


        return panel;
    }

    private JPanel PanelContent(int x, int y, int i) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.darkGray);
        panel.setBounds(x, y - 125, 250, 50);
        panel.setLayout(new BorderLayout());

        // Tạo JTextField
//        JTextField textField = new JTextField("...");
//        textField.setOpaque(false);  // Làm nền trong suốt
//        textField.setForeground(Color.WHITE); // Chữ màu trắng
//        textField.setBorder(null); // Xóa viền
//        textField.setHorizontalAlignment(JTextField.CENTER); // Canh giữa
//        textField.setFont(new Font("Arial", Font.BOLD, 14));
//
//        panel.add(textField, BorderLayout.CENTER);
        // Thêm một panel mới bên trái
        addPanelLeft(x, y);
        addPanelRight(x, y, i);

        return panel;
    }

// Hàm thêm panel bên trái
    private void addPanelLeft(int x, int y) {
        int newX = x + 5; // Đặt panel mới sang bên trái
        JPanel leftPanel = new RoundedPanel(50);
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setBounds(newX, y - 120, 40, 40);
        leftPanel.setLayout(new BorderLayout());

        ImagePanel panel2 = new ImagePanel("/com/img/clock.png", 25, 25);

        leftPanel.add(panel2, BorderLayout.CENTER);

//        leftPanel.add(textField, BorderLayout.CENTER);
        // Thêm panel vào giao diện
        add(leftPanel);
        revalidate();
        repaint();
    }

    private void addPanelRight(int x, int y, int i) {
        int newX = x + 55; // Đặt panel mới sang bên trái
        JPanel rightPanel = new RoundedPanel(40);
        rightPanel.setBounds(newX, y - 120, 190, 40);
        rightPanel.setBackground(new Color(0, 0, 0, 0));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setOpaque(false);
        setOpaque(false);

        // Thêm JTextField vào panel bên trái (nếu cần)
        JTextField textField = new JTextField("...");
        textField.setOpaque(false);
        textField.setForeground(Color.WHITE);
        textField.setBorder(null);
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setFont(new Font("Arial", Font.BOLD, 14));

        rightPanel.add(textField, BorderLayout.CENTER);
        
                        //currentClicks1 = monthClickCounts.getOrDefault(i, 0);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            final int currentIndex = i; // Tạo bản sao để cố định giá trị
            //final int a1 = a;
            @Override
            public void insertUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã được thêm: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaNgay(titleText, currentIndex, v);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã bị xóa: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaNgay(titleText, currentIndex, v);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã thay đổi: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaNgay(titleText, currentIndex, v);
                }
            }
        });
        int currentIndex = i;
        String title = dao.selectGhiChuByNgay(k, v);

        textField.setText(title);

        // Thêm panel vào giao diện
        add(rightPanel);
        revalidate();
        repaint();
    }

    private void addPanelDiary(int x, int y, int i, int b) {
        int newX = x + 400; // Đặt panel mới sang bên trái
        JPanel rightPanel = new RoundedPanel(60);
        rightPanel.setBounds(newX, y - 25, 300, 300);
        rightPanel.setBackground(new Color(0, 0, 0, 0));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBackground(Color.GRAY);

        addPanelDiaryChilde(x, y);
        addPanelDiaryChilde1(x, y, i, b);
        // Thêm panel vào giao diện
        add(rightPanel);
        revalidate();
        repaint();
    }

    private void addPanelDiaryChilde(int x, int y) {
        int newX = x + 410; // Đặt panel mới sang bên trái
        JPanel rightPanel = new RoundedPanel(40);
        rightPanel.setBounds(newX, y - 10, 280, 50);
        rightPanel.setBackground(new Color(0, 0, 0, 0));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setOpaque(false);
        setOpaque(false);

        JTextField textField = new JTextField("   Ghi chú");
        textField.setOpaque(false);
        textField.setForeground(Color.WHITE);
        textField.setBorder(null);
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setOpaque(false);

        rightPanel.add(textField, BorderLayout.CENTER);

        // Thêm panel vào giao diện
        add(rightPanel);
        revalidate();
        repaint();
    }

    private void addPanelDiaryChilde1(int x, int y, int i, int a) {
        int newX = x + 430; // Đặt panel mới sang bên trái
        JPanel rightPanel = new RoundedPanel(0);
        rightPanel.setBounds(newX, y + 40, 280, 210);
        rightPanel.setBackground(new Color(0, 0, 0, 0));
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setOpaque(false);
        setOpaque(false);

        JTextArea textField = new JTextArea("...");
        textField.setOpaque(false);
        textField.setForeground(Color.WHITE);
        textField.setBorder(null);
//        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setOpaque(false);

        rightPanel.add(textField, BorderLayout.CENTER);
        
                //currentClicks1 = monthClickCounts.getOrDefault(i, 0);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            final int currentIndex = i; // Tạo bản sao để cố định giá trị
            final int a1 = a;
            @Override
            public void insertUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã được thêm: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaTuan(titleText, currentIndex, a1, v);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã bị xóa: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaTuan(titleText, currentIndex, a1, v);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //System.out.println("Văn bản đã thay đổi: " + textField.getText());
                if (!isFakeClick) {
                    String titleText = textField.getText();
                    dao.updateGhiChuCuaTuan(titleText, currentIndex, a1, v);
                }
            }
        });
        int currentIndex = i;
        String title = dao.selectGhiChuByTuan(currentIndex, v);

        textField.setText(title);

        // Thêm panel vào giao diện
        add(rightPanel);
        revalidate();
        repaint();
    }

//    private JPanel createPanel(int x, int y, int i) {
//        RoundedPanel panel = new RoundedPanel(50);
//        panel.setBackground(Color.BLACK);
//        panel.setBounds(x - 25, y - 25, 50, 50);
//        
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                addNewExtraSegment(panel);
//                addNewVerticalSegment(panel, i);
//            }
//        });
//        return panel;
//    }
    
    private int clickCount1 = 1;

    void update() {
        KhoaBieu model = getForm();
        try {
            dao.update(model);
        } catch (Exception e) {

        }
    }

    int currentClicks1;

    int c;
    
    //int globalWeekIndex = 1; // Bắt đầu từ 1
    
    private JPanel createPanelMonth(int x, int y, int i, int a) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.GRAY);
        panel.setBounds(x - 25, y - 25, 50, 50);
        panel.setLayout(new BorderLayout());

        monthClickCounts.put(i, 0);
        //clickCount1++;
        //System.out.println("clickCount1 " + clickCount1);

        c = i;
        //System.out.println("tháng " + (c + 1));

        if (isFakeClick) {
            clickCount1++;
//            if (clickCount1 == totalThang + 1 || clickCount1 == currentClicks1 + 1) {
//                clickCount1 = 0;
//                clickCount1++;
//            }
        }

        JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Chỉnh kích thước chữ
        plusLabel.setForeground(Color.WHITE); // Màu chữ trắng
        plusLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa ngang
        plusLabel.setVerticalAlignment(JLabel.CENTER); // Căn giữa dọc

        panel.add(plusLabel, BorderLayout.CENTER); // Thêm vào panel

        panel.putClientProperty("clicked", false);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((boolean) panel.getClientProperty("clicked")) {
                    //System.out.println("Panel đã được nhấn, không thực hiện lại.");
                    return;
                }
                currentClicks1 = monthClickCounts.getOrDefault(i, 0);
                //System.out.println("tuần " + (currentClicks1 + 1));
                if (currentClicks1 < 4) {

                    addNewExtraSegment(panel, clickCount1, currentClicks1 + 1);
                    addNewVerticalSegment(panel, i, a);
                    monthClickCounts.put(i, currentClicks1 + 1);
                    panel.removeAll();
                    panel.setBackground(Color.YELLOW);
                    ImagePanel panel2 = new ImagePanel("/com/img/calendar.png", 28, 28);
//                    KhoaBieu model = getForm();

                    if (isFakeClick) {

                    } else {
                        clickCount1++;
                        //update();
                        dao.updateKhoaBieu(currentClicks1 + 1, c + 1, v);
                        dao.insertTuan(c + 1, clickCount1 - 1, 0, "", "", currentClicks1 + 1, v);
                        dao.callCapNhatTuan(v);
                        //System.out.println("clickCount1 " + clickCount1);
                    }

                    panel.add(panel2, BorderLayout.CENTER);
                    panel.putClientProperty("clicked", true); // Đánh dấu đã nhấn
                }
            }
        });
        panel.revalidate();
        panel.repaint();

//        simulateClicks(panel);
        return panel;
    }

    int b;

    int index1;
    
    private void simulateClicks() {
        // Lấy danh sách từ database 
        System.out.println("v " + v);
        List<int[]> clickSimulationData = dao.getAllData(v);

        for (int[] data : clickSimulationData) {
            int index = data[0];
            int clickTimes = data[1];

            //System.out.println("index " + index);
            //System.out.println("clickTimes " + clickTimes);
            Point lastPoint = horizontalLines.get(horizontalLines.size() - 1);
            int newX = lastPoint.x + lineLength;
            horizontalLines.add(new Point(newX, lastPoint.y));

            JPanel squarePanel = createPanelMonth(lastPoint.x + (lineLength / 6), lastPoint.y, index - 1, clickTimes);
            add(squarePanel);

            SwingUtilities.invokeLater(() -> {
                isFakeClick = true;
                squarePanel.dispatchEvent(new MouseEvent(squarePanel, MouseEvent.MOUSE_CLICKED,
                        System.currentTimeMillis(), 0, 0, 0, 1, false));
                isFakeClick = false;
            });

            // Di chuyển nút "+" sang vị trí mới
            addPanel.setBounds(newX, lastPoint.y - 25, 50, 50);
            setPreferredSize(new Dimension(newX + 100, getPreferredSize().height));
            revalidate();
            repaint();
        }
    }

// Biến đếm số lần nhấn
    int text = 0;

    int totalThang = dao.getMaxThang(); // Lấy tổng THANG từ database

    int clickCount = totalThang; // Gán giá trị ban đầu

    KhoaBieu getForm() {
        KhoaBieu cd = new KhoaBieu();
        if (totalThang == 0) {
            cd.setThang(c + 1);
        } else if (text > 0) {
            cd.setThang(c + 1);
        } else {
            cd.setThang(c);
        }
        System.out.println("getId_kehoach " + cd.getId_kehoach());
        cd.setTuan(currentClicks1 + 1);
        System.out.println("currentClicks1 " + (currentClicks1 + 1));
        cd.setId_kehoach(v);
        return cd;
    }

    KhoaBieu getForm1() {
        KhoaBieu cd = new KhoaBieu();
        cd.setTuan(currentClicks1 + 1);
        cd.setId_kehoach(v);
        return cd;
    }

    void insert() {
        KhoaBieu model = getForm1();
        try {
            dao.insert(model);
        } catch (Exception e) {

        }
    }
    
//    void insert1() {
//        KhoaBieu model = getForm1();
//        try {
//            dao.insert(model);
//        } catch (Exception e) {
//
//        }
//    }

    private JPanel createPanelyear(int x, int y) {
        RoundedPanel panel = new RoundedPanel(50);
        panel.setBackground(Color.GRAY);
        panel.setBounds(x - 25, y - 25, 50, 50);
        panel.setLayout(new BorderLayout()); // Đặt layout để căn giữa nội dung

        // Thêm JLabel chứa dấu "+"
        JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Chỉnh kích thước chữ
        plusLabel.setForeground(Color.WHITE); // Màu chữ trắng
        plusLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa ngang
        plusLabel.setVerticalAlignment(JLabel.CENTER); // Căn giữa dọc

        panel.add(plusLabel, BorderLayout.CENTER); // Thêm vào panel

        //System.out.println("clickCount " + clickCount);
//       clickCount = (clickCount > 0) ? (clickCount - 1) : clickCount;
        if (clickCount < 12) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //System.out.println("clickCount " + clickCount);
                    addNewHorizontalSegment(clickCount);
                    clickCount++; // Tăng biến đếm sau mỗi lần nhấn
                    text++;
                    dao.insertKhoaBieu(currentClicks1 + 1, v);
                    //insert();
                }
            });
        }

        return panel;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.GRAY);

        // Vẽ các đường ngang
        for (int i = 0; i < horizontalLines.size() - 1; i++) {
            int x1 = horizontalLines.get(i).x;
            int x2 = horizontalLines.get(i + 1).x;
            int y = horizontalLines.get(i).y;
            g2d.drawLine(x1, y, x2, y);
        }

        // Vẽ các đường ngang
        for (Point p : horizontalLines1) {
            g2d.drawLine(p.x - extraHorizontalLength, p.y, p.x, p.y);
        }

        // Vẽ các đường ngang
        for (Point p : horizontalLines2) {
            g2d.drawLine(p.x - extraHorizontalLength1, p.y, p.x, p.y);
        }

        // Vẽ các đường dọc
        for (Point p : verticalLines) {
            g2d.drawLine(p.x, p.y - lineLength, p.x, p.y);
        }

        for (Point p : verticalLines1) {
            g2d.drawLine(p.x, p.y - extraVerticalLength, p.x, p.y);
        }

        for (Point p : verticalLines2) {
            g2d.drawLine(p.x, p.y - extraVerticalLength1, p.x, p.y);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Expandable Line Panel");
        JScrollPane scrollPane = new JScrollPane();
        GiaoDienKeHoach panel = new GiaoDienKeHoach(scrollPane);

        scrollPane.setViewportView(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
