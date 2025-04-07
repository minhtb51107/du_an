/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.data.DanhSachBaiHocChinhData;
import com.data.DanhSachBaiHocConData;
import static com.datastax.oss.driver.shaded.guava.common.collect.Multimaps.index;
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

    public DanhSachBaiHocChinh(TrangChinh trangChinh, String selectedLanguage) {
        this.parentTrangChinh = trangChinh;
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());

        String[] descriptions = DanhSachBaiHocChinhData.getDescriptions(selectedLanguage);

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocChinhData.getTitles(selectedLanguage);

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

        for (int i = 0; i < titles.length; i++) {

            RoundedPanel childPanel = new RoundedPanel(30);
            childPanel.setBorder(null);
            childPanel.setPreferredSize(new Dimension(300, 200));
            childPanel.setMaximumSize(new Dimension(300, 200));
            childPanel.setBackground(new Color(162,166,253,255));
            childPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JPanel panel1 = new JPanel(new GridBagLayout());
            panel1.setOpaque(false);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel titleLabel = new JLabel();
            titleLabel.setForeground(Color.BLACK);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
            titleLabel.setToolTipText(titles[i]); // Hiển thị nội dung đầy đủ khi di chuột

            // Cắt chữ để hiển thị dấu "..."
            String shortText = SwingUtilities.layoutCompoundLabel(
                    titleLabel,
                    titleLabel.getFontMetrics(titleLabel.getFont()),
                    titles[i],
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

            titleLabel.setText(shortText);

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

            int index = i;
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (selectedLanguage.equals("Java")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("Java Cơ Bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("Java Nâng Cao");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("Java Chuyên Nghiệp");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("Java Ứng Dụng Thực Tế");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                    if (selectedLanguage.equals("HTML & CSS")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("HTML Cơ Bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("HTML Nâng Cao");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("CSS Cơ Bản");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("CSS Nâng Cao");
                                break;
                            case 4:
                                parentTrangChinh.updateDanhSachBaiHocCon("CSS Chuyên Nghiệp");
                                break;
                            case 5:
                                parentTrangChinh.updateDanhSachBaiHocCon("Ứng Dụng & Dự Án Thực Tế");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                    if (selectedLanguage.equals("JAVASCRIPT")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("JavaScript Cơ Bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("JavaScript Nâng Cao");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("JavaScript Chuyên Nghiệp");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("Ứng Dụng Thực Tế");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                    if (selectedLanguage.equals("PYTHON")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("Python Cơ Bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("Python Nâng Cao");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("Python Chuyên Nghiệp");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("Python Ứng Dụng Thực Tế");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                    if (selectedLanguage.equals("C")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("C cơ bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("C trung bình");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("C nâng cao");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("C chuyên nghiệp");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                    if (selectedLanguage.equals("SQL")) {
                        switch (index) {
                            case 0:
                                parentTrangChinh.updateDanhSachBaiHocCon("SQL cơ bản");
                                break;
                            case 1:
                                parentTrangChinh.updateDanhSachBaiHocCon("SQL trung bình");
                                break;
                            case 2:
                                parentTrangChinh.updateDanhSachBaiHocCon("SQL nâng cao");
                                break;
                            case 3:
                                parentTrangChinh.updateDanhSachBaiHocCon("SQL chuyên nghiệp");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
                        }
                    }
                }
            });

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
            panel1.add(button, gbc);

            JTextArea descriptionLabel = new JTextArea(descriptions[i]);
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
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

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
//int index;
//    // Xử lý sự kiện khi nhấn nút
//    private void processLesson(String selectedLanguage) {
//            if(selectedLanguage.equals("Java")){
//                createButtonListener(index);
//            }
//        };

    // Xử lý sự kiện khi nhấn nút
//    private ActionListener createButtonListener(int index, String selectedLanguage) {
//        return e -> {
//            if (selectedLanguage.equals("Java")) {
//                System.out.print(e);
//                switch (index) {
//                    case 0:
//                        DanhSachBaiHocCon ds = new DanhSachBaiHocCon("JAVASCRIPT");
//                        ds.addSampleItems("JAVASCRIPT");
//                        //cd.updateBottomPanel(new DanhSachBaiHocCon("JAVASCRIPT"));
//                        break;
//                    case 1:
//                        TrangChinh cd1 = new TrangChinh(0, "Java", "JAVASCRIPT");

////                        cd1.resetTrangChinh(0, "Java", "JAVASCRIPT");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//            if (selectedLanguage.equals("HTML & CSS")) {
//                switch (index) {
//                    case 0:
//                        new TrangChinh(1, "Java", "Java");
//                        break;
//                    case 1:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//            if (selectedLanguage.equals("JAVASCRIPT")) {
//                switch (index) {
//                    case 0:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 11");
//                        break;
//                    case 1:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//            if (selectedLanguage.equals("PYTHON")) {
//                switch (index) {
//                    case 0:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 11");
//                        break;
//                    case 1:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//            if (selectedLanguage.equals("C")) {
//                switch (index) {
//                    case 0:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 111");
//                        break;
//                    case 1:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//            if (selectedLanguage.equals("SQL")) {
//                switch (index) {
//                    case 0:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 1");
//                        break;
//                    case 1:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 2");
//                        break;
//                    case 2:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 3");
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 4");
//                        break;
//                    case 4:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 5");
//                        break;
//                    case 5:
//                        JOptionPane.showMessageDialog(null, "Bạn đã chọn Bài 6");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Lựa chọn không hợp lệ!");
//                }
//            }
//        };
//    }
}
