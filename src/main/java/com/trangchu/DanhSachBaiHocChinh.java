/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trangchu;

/**
 *
 * @author PC
 */

import com.dao.CongViecDAO;
import com.data.DanhSachBaiHocChinhData;
import com.data.DanhSachBaiHocConData;
import static com.datastax.oss.driver.shaded.guava.common.collect.Multimaps.index;
import com.entity.CongViec;
import com.entity.NguoiDung;
import com.kehoach.TaskCard;
import com.lesson.content.java.TrangChinh;
import com.swing.RoundedPanel;
import com.ui.MainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author PC
 */
public class DanhSachBaiHocChinh extends JPanel {

    private int startX; // Vị trí ban đầu khi bắt đầu kéo chuột
    private JScrollPane scrollPane;
    private JPanel containerPanel;
    private TrangChinh parentTrangChinh;
        NguoiDung nguoiDung = new NguoiDung();
    private String maNguoiDung = nguoiDung.getMaNguoiDung();
    
    public DanhSachBaiHocChinh() {
        setLayout(new BorderLayout());
        setOpaque(false);
        //setBackground(Color.red);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        setPreferredSize(new Dimension(300, 50));

        String[] descriptions = {"Introduction to Java",
                "Variables and Data Types",
                "Control Flow",
                "Object-Oriented Programming",
                "Inheritance in Java",
                "Polymorphism in Java",
                "Exception Handling"};

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = {"Introduction to Java",
                "Ngôn ngữ Java",
                "HTML & CSS",
                "Javascript",
                "Ngôn ngữ C",
                "Ngôn ngữ Python",
                "Cơ sở dữ liệu SQL"};

        // Kiểm tra nếu titles == null hoặc không có đủ phần tử
//        if (titles == null || titles.length > 0) {
//            System.out.println("Lỗi: Không tìm thấy tiêu đề cho " + selectedLanguage);
//            titles = new String[]{"Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6"};
//            descriptions = new String[]{"Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6"};
//        }
        // Panel chứa tất cả panel con
        containerPanel = new JPanel();
        containerPanel.setBorder(null);
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        containerPanel.setOpaque(false);
 
        CongViecDAO congViecDAO = new CongViecDAO();
        List<CongViec> tasks = congViecDAO.getAllByNguoiDung(maNguoiDung); // maNguoiDung: biến này cần truyền từ login hoặc khai báo trước

        Color[] colors = {
            new Color(208,222,249,255), // Đỏ hồng
            new Color(247,228,211,255), // Xanh dương
            new Color(252,224,244,255), // Vàng
            new Color(193,243,228,255), // Xanh ngọc
        };
        
        Color color = colors[0];;
        int i = 0;
        for (CongViec cv : tasks) {
            switch (cv.getTrangThaiKanban()) {
            case "Next Up":
                color = colors[0];
                break;
            case "In Progress":
                color = colors[1];
                break;
            case "Review":
                color = colors[2];
                break;
            case "Completed":
                color = colors[3];
                break;
            default:
                System.out.println("Không xác định trạng thái: " + cv.getTrangThaiKanban());
        }
            RoundedPanel childPanel = new RoundedPanel(30);
            childPanel.setBorder(null);
            childPanel.setPreferredSize(new Dimension(310, 200));
            childPanel.setMaximumSize(new Dimension(310, 200));
            childPanel.setBackground(color);
            childPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JPanel panel1 = new JPanel(new GridBagLayout());
            panel1.setOpaque(false);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel titleLabel = new JLabel();
            titleLabel.setForeground(Color.BLACK);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
            titleLabel.setToolTipText(cv.getTieuDe()); // Hiển thị nội dung đầy đủ khi di chuột

            // Cắt chữ để hiển thị dấu "..."
            String shortText = SwingUtilities.layoutCompoundLabel(
                    titleLabel,
                    titleLabel.getFontMetrics(titleLabel.getFont()),
                    cv.getTieuDe(),
                    titleLabel.getIcon(),
                    titleLabel.getVerticalAlignment(),
                    titleLabel.getHorizontalAlignment(),
                    titleLabel.getVerticalTextPosition(),
                    titleLabel.getHorizontalTextPosition(),
                    new Rectangle(0, 0, 200, 30), // Giới hạn kích thước
                    new Rectangle(),
                    new Rectangle(),
                    0
            );

            titleLabel.setText(shortText + " / " + cv.getDoUuTien());

            ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/img/start.png"));
// Thay đổi kích thước icon (32x32)
            Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JButton button = new JButton(scaledIcon);
            button.setPreferredSize(new Dimension(30, 30));
            button.setFocusable(false);
            button.setBorderPainted(false);  // Ẩn viền
            button.setContentAreaFilled(false); // Xóa nền
            button.setFocusPainted(false);  // Xóa viền khi focus
            button.setOpaque(false);  // Đảm bảo không có nền

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0.8;  // Không mở rộng tiêu đề
            gbc.weighty = 0;
            gbc.anchor = GridBagConstraints.WEST;
            panel1.add(titleLabel, gbc);

            gbc.gridx = 1;
            gbc.weightx = 0.2;  // Không mở rộng nút
            gbc.anchor = GridBagConstraints.EAST;
            gbc.weighty = 0;
            //panel1.add(button, gbc);

            JTextArea descriptionLabel = new JTextArea(
                    cv.getMoTa() + "\n" + cv.getNgayHetHan() + "\n" + cv.getTrangThaiKanban()
            );
            descriptionLabel.setLineWrap(true);  // Tự động xuống dòng
            descriptionLabel.setWrapStyleWord(true); // Xuống dòng theo từ
            descriptionLabel.setEditable(false); // Chỉ hiển thị như JLabel
            descriptionLabel.setFocusable(false); // Loại bỏ focus border
            descriptionLabel.setLineWrap(true);
            descriptionLabel.setWrapStyleWord(true);
//        descriptionLabel.setEnabled(false);
            descriptionLabel.setHighlighter(null); // Ngăn chặn bôi xanh
            descriptionLabel.setRequestFocusEnabled(false);
            descriptionLabel.setOpaque(false);

            descriptionLabel.setBackground(new Color(169, 228, 232, 0));
            descriptionLabel.setBorder(null);
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setForeground(Color.BLACK);
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            gbc.weightx = 1;
            gbc.weighty = 1;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            panel1.add(descriptionLabel, gbc);

            childPanel.setLayout(new BorderLayout());
            childPanel.add(panel1, BorderLayout.CENTER);

            containerPanel.add(childPanel);
//            
//                    titleLabel.setPreferredSize(new Dimension(180, 30));
            descriptionLabel.setPreferredSize(new Dimension(150, 100));

            if (i < 5) {
                containerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            }

            titleLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(titleLabel, e, containerPanel));
                }
            });

            titleLabel.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(titleLabel, e, containerPanel));
                }
            });

            descriptionLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(descriptionLabel, e, containerPanel));
                }
            });

            descriptionLabel.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(descriptionLabel, e, containerPanel));
                }
            });
            i++;
    }

        for (int j = 0; j < 6; j++) {

//            RoundedPanel childPanel = new RoundedPanel(30);
//            childPanel.setBorder(null);
//            childPanel.setPreferredSize(new Dimension(310, 200));
//            childPanel.setMaximumSize(new Dimension(310, 200));
//            childPanel.setBackground(new Color(162,166,253,255));
//            childPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//
//            JPanel panel1 = new JPanel(new GridBagLayout());
//            panel1.setOpaque(false);
//            GridBagConstraints gbc = new GridBagConstraints();
//            gbc.insets = new Insets(5, 5, 5, 5);
//
//            JLabel titleLabel = new JLabel();
//            titleLabel.setForeground(Color.BLACK);
//            titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
//            titleLabel.setToolTipText(titles[i]); // Hiển thị nội dung đầy đủ khi di chuột
//
//            // Cắt chữ để hiển thị dấu "..."
//            String shortText = SwingUtilities.layoutCompoundLabel(
//                    titleLabel,
//                    titleLabel.getFontMetrics(titleLabel.getFont()),
//                    titles[i],
//                    titleLabel.getIcon(),
//                    titleLabel.getVerticalAlignment(),
//                    titleLabel.getHorizontalAlignment(),
//                    titleLabel.getVerticalTextPosition(),
//                    titleLabel.getHorizontalTextPosition(),
//                    new Rectangle(0, 0, 200, 30), // Giới hạn kích thước
//                    new Rectangle(),
//                    new Rectangle(),
//                    0
//            );
//
//            titleLabel.setText(shortText);
//
//            ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/img/start.png"));
//// Thay đổi kích thước icon (32x32)
//            Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
//            ImageIcon scaledIcon = new ImageIcon(scaledImage);
//
//            JButton button = new JButton(scaledIcon);
//            button.setPreferredSize(new Dimension(30, 30));
//            button.setFocusable(false);
//            button.setBorderPainted(false);  // Ẩn viền
//            button.setContentAreaFilled(false); // Xóa nền
//            button.setFocusPainted(false);  // Xóa viền khi focus
//            button.setOpaque(false);  // Đảm bảo không có nền
//
//            int index = i;
//            button.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    if (selectedLanguage.equals("Java")) {
//                        switch (index) {
//                            case 0:
//                                
//                                break;
//                            case 1:
//                                
//                                break;
//                            case 2:
//                                
//                                break;
//                            case 3:
//                                
//                                break;
//                            default:
//                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                        }
//                    }
//                }
//            });
//
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.weightx = 0.8;  // Không mở rộng tiêu đề
//            gbc.weighty = 0;
//            gbc.anchor = GridBagConstraints.WEST;
//            panel1.add(titleLabel, gbc);
//
//            gbc.gridx = 1;
//            gbc.weightx = 0.2;  // Không mở rộng nút
//            gbc.anchor = GridBagConstraints.EAST;
//            gbc.weighty = 0;
//            panel1.add(button, gbc);
//
//            JTextArea descriptionLabel = new JTextArea(descriptions[i]);
//            descriptionLabel.setLineWrap(true);  // Tự động xuống dòng
//            descriptionLabel.setWrapStyleWord(true); // Xuống dòng theo từ
//            descriptionLabel.setEditable(false); // Chỉ hiển thị như JLabel
//            descriptionLabel.setFocusable(false); // Loại bỏ focus border
//            descriptionLabel.setLineWrap(true);
//            descriptionLabel.setWrapStyleWord(true);
////        descriptionLabel.setEnabled(false);
//            descriptionLabel.setHighlighter(null); // Ngăn chặn bôi xanh
//            descriptionLabel.setRequestFocusEnabled(false);
//            descriptionLabel.setOpaque(false);
//
//            descriptionLabel.setBackground(new Color(169, 228, 232, 0));
//            descriptionLabel.setBorder(null);
//            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
//            descriptionLabel.setForeground(Color.BLACK);
//            gbc.gridx = 0;
//            gbc.gridy = 1;
//            gbc.gridwidth = 2;
//            gbc.weightx = 1;
//            gbc.weighty = 1;
//            gbc.anchor = GridBagConstraints.NORTHWEST;
//            panel1.add(descriptionLabel, gbc);
//
//            childPanel.setLayout(new BorderLayout());
//            childPanel.add(panel1, BorderLayout.CENTER);
//
//            containerPanel.add(childPanel);
////            
////                    titleLabel.setPreferredSize(new Dimension(180, 30));
//            descriptionLabel.setPreferredSize(new Dimension(150, 100));
//
//            if (i < 5) {
//                containerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
//            }
//
//            titleLabel.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(titleLabel, e, containerPanel));
//                }
//            });
//
//            titleLabel.addMouseMotionListener(new MouseMotionAdapter() {
//                @Override
//                public void mouseDragged(MouseEvent e) {
//                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(titleLabel, e, containerPanel));
//                }
//            });
//
//            descriptionLabel.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(descriptionLabel, e, containerPanel));
//                }
//            });
//
//            descriptionLabel.addMouseMotionListener(new MouseMotionAdapter() {
//                @Override
//                public void mouseDragged(MouseEvent e) {
//                    containerPanel.dispatchEvent(SwingUtilities.convertMouseEvent(descriptionLabel, e, containerPanel));
//                }
//            });
        }

        scrollPane = new JScrollPane(containerPanel);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.setViewportBorder(null);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(100, 100, 100, 150); // Màu thanh cuộn
            }
        });

        add(scrollPane, BorderLayout.CENTER);

        // Thêm chức năng kéo để cuộn bằng chuột
        addDragScrolling();
    }

    private void addDragScrolling() {
        containerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
            }
        });

        containerPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JScrollBar horizontalBar = scrollPane.getHorizontalScrollBar();
                int newValue = horizontalBar.getValue() + (startX - e.getX());

                // Giới hạn phạm vi cuộn
                newValue = Math.max(horizontalBar.getMinimum(), Math.min(horizontalBar.getMaximum(), newValue));

                horizontalBar.setValue(newValue);
                startX = e.getX();
            }
        });
    }
}

