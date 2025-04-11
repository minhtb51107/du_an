package com.baihoc;

import com.data.NoiDungBaiHoc;
import com.data.NoiDungBaiHocHTML_CSS;
import com.data.NoiDungBaiHocJava;
import com.data.NoiDungBaiHocJavascript;
import com.data.NoiDungBaiHocPython;
import com.data.NoiDungBaiHocSQL;
import com.entity.Data;
import com.ui.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DynamicPanelExample extends JPanel {

    int indexTitle = 0;
    int indexContent = 0;
    int indexCode = 0;
    private JPanel parentPanel;
    JPanel panel;

    private java.util.List<JTextArea> textAreasA = new java.util.ArrayList<>();
    private java.util.List<JTextArea> textAreasB = new java.util.ArrayList<>();
    private java.util.List<JTextArea> textAreasC = new java.util.ArrayList<>();
    
    int[] dataArrayIndex;
            String[] dataArrayTitle ;
        String[] dataArrayContent ;
        String[] dataArrayCode ;
        
        Data data = new Data();

    public DynamicPanelExample(String content) {

        textAreasA.clear();
        textAreasB.clear();
        textAreasC.clear();

        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder());
        setPreferredSize(new Dimension(350, 110));

        if (data.getMonhoc().equals("Java")) {
            dataArrayIndex = NoiDungBaiHocJava.getIndex(content);
            dataArrayTitle = NoiDungBaiHocJava.getTitle(content);
            dataArrayContent = NoiDungBaiHocJava.getContent(content);
            dataArrayCode = NoiDungBaiHocJava.getCode(content);
        }

        if (data.getMonhoc().equals("HTML & CSS")) {
            dataArrayIndex = NoiDungBaiHocHTML_CSS.getIndex(content);
            dataArrayTitle = NoiDungBaiHocHTML_CSS.getTitle(content);
            dataArrayContent = NoiDungBaiHocHTML_CSS.getContent(content);
            dataArrayCode = NoiDungBaiHocHTML_CSS.getCode(content);
        }

        if (data.getMonhoc().equals("JAVASCRIPT")) {
            dataArrayIndex = NoiDungBaiHocJavascript.getIndex(content);
            dataArrayTitle = NoiDungBaiHocJavascript.getTitle(content);
            dataArrayContent = NoiDungBaiHocJavascript.getContent(content);
            dataArrayCode = NoiDungBaiHocJavascript.getCode(content);
        }

        if (data.getMonhoc().equals("PYTHON")) {
            dataArrayIndex = NoiDungBaiHocPython.getIndex(content);
            dataArrayTitle = NoiDungBaiHocPython.getTitle(content);
            dataArrayContent = NoiDungBaiHocPython.getContent(content);
            dataArrayCode = NoiDungBaiHocPython.getCode(content);
        }

        if (data.getMonhoc().equals("C")) {
            dataArrayIndex = NoiDungBaiHocJava.getIndex(content);
            dataArrayTitle = NoiDungBaiHocJava.getTitle(content);
            dataArrayContent = NoiDungBaiHocJava.getContent(content);
            dataArrayCode = NoiDungBaiHocJava.getCode(content);
        }

        if (data.getMonhoc().equals("SQL")) {
            dataArrayIndex = NoiDungBaiHocSQL.getIndex(content);
            dataArrayTitle = NoiDungBaiHocSQL.getTitle(content);
            dataArrayContent = NoiDungBaiHocSQL.getContent(content);
            dataArrayCode = NoiDungBaiHocSQL.getCode(content);
        }

        parentPanel = new JPanel();
        parentPanel.setOpaque(false);
        parentPanel.setBackground(null);
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

        for (int value : dataArrayIndex) {
            if (value == 0) {
                parentPanel.add(createPanelC(content, indexTitle));
                if (indexTitle < dataArrayTitle.length - 1) {
                    indexTitle++;
                }
            } else if (value == 1) {
                parentPanel.add(createPanelA(content, indexContent));
                if (indexContent < dataArrayContent.length - 1) {
                    indexContent++;
                }
            } else if (value == 2) {
                parentPanel.add(createPanelB(content, indexCode));
                if (indexCode < dataArrayCode.length - 1) {
                    indexCode++;
                }
            }
        }

//        System.out.println("indexTitle: " + indexTitle);
//        System.out.println("indexContent: " + indexContent);
//        System.out.println("indexCode: " + indexCode);
//
//        System.out.println("dataArrayTitle.length: " + dataArrayTitle.length);
//        System.out.println("dataArrayContent.length: " + dataArrayContent.length);
//        System.out.println("dataArrayCode.length: " + dataArrayCode.length);
        JScrollPane scrollPane = new JScrollPane(parentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        //scrollPane.getViewport().setBackground(null);
        //scrollPane.setViewportBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        add(scrollPane);

    }

    private JPanel createPanelA(String content, int a) {
        panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBackground(null);
        //panel.setMinimumSize(new Dimension(350, 100)); // Chiều rộng tối thiểu 200px, chiều cao tối thiểu 100px
        //panel.setMaximumSize(new Dimension(350, 300)); // Không lớn hơn 500x300
        //panel.setPreferredSize(new Dimension(350, 100));

        JTextArea textArea = createTransparentTextArea();
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText(dataArrayContent[a]);

        panel.add(textArea, BorderLayout.NORTH);

        textAreasA.add(textArea);

        return panel;
    }

    private JPanel createPanelB(String content, int a) {
        JPanel newPanel = new JPanel(new BorderLayout());
        newPanel.setOpaque(false);
        panel = new JPanel(new GridBagLayout());
        newPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 15));
        panel.setBackground(Color.BLACK);
        //panel.setMinimumSize(new Dimension(350, 100)); // Chiều rộng tối thiểu 200px, chiều cao tối thiểu 100px
        //panel.setMaximumSize(new Dimension(350, 300)); // Không lớn hơn 500x300
        //panel.setPreferredSize(new Dimension(350, 140));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

        JLabel copyLabel = new JLabel("Sao chép");
        copyLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        copyLabel.setForeground(Color.YELLOW);
        copyLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        panel.add(copyLabel, gbc);

        JTextArea textArea = createAutoResizeTextArea(Color.WHITE);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText(dataArrayCode[a]);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(textArea, gbc);

        copyLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StringSelection selection = new StringSelection(textArea.getText());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
                JOptionPane.showMessageDialog(panel, "Nội dung đã được sao chép!");
            }
        });

        newPanel.add(panel, BorderLayout.CENTER);

        textAreasB.add(textArea); // B

        return newPanel;
    }

    private JPanel createPanelC(String content, int a) {
        panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBackground(null);
        //panel.setMinimumSize(new Dimension(350, 100)); // Chiều rộng tối thiểu 200px, chiều cao tối thiểu 100px
        //panel.setMaximumSize(new Dimension(350, 300)); // Không lớn hơn 500x300
        //panel.setPreferredSize(new Dimension(350, 35));

        JTextArea textArea = createTransparentTextArea();
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText(dataArrayTitle[a]);
        textArea.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(textArea, BorderLayout.NORTH);
        return panel;
    }

    private JTextArea createTransparentTextArea() {
        JTextArea textArea = new JTextArea();

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setBackground(null);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.BLACK);

        textAreasC.add(textArea); // C

        return textArea;
    }

//    private JTextArea createAutoResizeTextArea(Color backgroundColor) {
//        JTextArea textArea = new JTextArea();
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);
//        textArea.setBackground(backgroundColor);
//        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
//        textArea.setForeground(Color.BLACK);
//        return textArea;
//    }
    private JTextArea createAutoResizeTextArea(Color backgroundColor) {
        JTextArea textArea = new JTextArea(1, 0);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(backgroundColor);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        // Theo dõi thay đổi để tự mở rộng
        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }
        });

        return textArea;
    }

    private void adjustTextAreaSize(JTextArea textArea) {
        FontMetrics metrics = textArea.getFontMetrics(textArea.getFont());
        int lineHeight = metrics.getHeight();
        int lines = textArea.getLineCount();
        int newHeight = lines * lineHeight;

        textArea.setPreferredSize(new Dimension(textArea.getWidth(), newHeight));
        textArea.revalidate();
        parentPanel.revalidate();
    }

    public void setFontSizes(int sizeA, int sizeB, int sizeC) {
        for (JTextArea textArea : textAreasA) {
            textArea.setFont(textArea.getFont().deriveFont((float) sizeA));
        }
        for (JTextArea textArea : textAreasB) {
            textArea.setFont(textArea.getFont().deriveFont((float) sizeB));
        }
        for (JTextArea textArea : textAreasC) {
            textArea.setFont(textArea.getFont().deriveFont((float) sizeC));
        }
    }
    
    public void setFontSizes(int size) {
    Font newFont = new Font("Arial", Font.PLAIN, size);
    for (JTextArea textArea : textAreasA) {
        textArea.setFont(newFont);
    }
    for (JTextArea textArea : textAreasB) {
        textArea.setFont(newFont);
    }
    for (JTextArea textArea : textAreasC) {
        textArea.setFont(newFont);
    }
    // Đừng quên cập nhật lại giao diện
    revalidate();
    repaint();
}


//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Dynamic Panel Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 600);
//            frame.add(new DynamicPanelExample());
//            frame.setVisible(true);
//        });
//    }
}
