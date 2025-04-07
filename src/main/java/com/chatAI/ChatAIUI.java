/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatAI;

/**
 *
 * @author PC
 */

import com.swing.RoundedPanel;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.awt.geom.Path2D;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.Rectangle;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import javax.swing.text.*;
import javax.swing.text.html.*;
import java.util.concurrent.CompletableFuture;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author hello soncute nka
 */
public class ChatAIUI extends JPanel {
    private JPanel chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JButton newChatButton;
    private JList<String> historyList;
    private DefaultListModel<String> historyModel;
    private Map<String, List<ChatMessage>> chatHistory;
    private String currentChatId;
    private JLabel typingIndicator;
    private Timer typingTimer;
    private int typingDots = 0;
    private final String API_KEY = "AIzaSyA7BaBxVKCqrHA-2cjGmcu7PuEgrGh3ui4"; // API key của bạn
    private ChatService chatService;
    JTextPane messageText;
    ChatAIService chatAI = new ChatAIService();
    
    public ChatAIUI() {
        chatService = new ChatService();
        setBackground(new Color(24, 24, 25));
        initializeUI();
        setOpaque(false);
    }
    
    private void initializeUI() {
        // Khởi tạo các biến
        chatHistory = new HashMap<>();
        currentChatId = UUID.randomUUID().toString();
        chatHistory.put(currentChatId, new ArrayList<>());
        
        initializeComponents();
        setupLayout();
        setupCustomStyles();
        setupEventListeners();
        
        setVisible(true);
    }
    
    private void initializeComponents() {
        // Khởi tạo chatArea với JPanel thay vì JTextPane
        chatArea = new RoundedPanel(50);
        chatArea.setLayout(new BoxLayout(chatArea, BoxLayout.Y_AXIS));
        chatArea.setBackground(new Color(39,43,55,255));
        
        // Tạo custom scrollbar cho chat area
        JScrollPane chatScrollPane = new JScrollPane(chatArea);
        chatScrollPane.setBorder(BorderFactory.createEmptyBorder());
        chatScrollPane.setBackground(new Color(248, 249, 250));
        chatScrollPane.getViewport().setBackground(new Color(248, 249, 250));
        chatScrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        
        // Khởi tạo input field với style mới
        inputField = new JTextField();
        inputField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        inputField.setBackground(new Color(50,53,68,255));
        inputField.setForeground(Color.WHITE);
        inputField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(222, 226, 230), 1, true),
            BorderFactory.createEmptyBorder(8, 12, 8, 12)
        ));
        
        // Tạo nút gửi với icon mũi tên
        sendButton = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Vẽ mũi tên
                int width = getWidth();
                int height = getHeight();
                int arrowSize = Math.min(width, height) / 3;
                
                g2d.setColor(Color.WHITE);
                Path2D path = new Path2D.Double();
                path.moveTo(width/2 - arrowSize/2, height/2 - arrowSize/2);
                path.lineTo(width/2 + arrowSize/2, height/2);
                path.lineTo(width/2 - arrowSize/2, height/2 + arrowSize/2);
                g2d.fill(path);
            }
        };
        sendButton.setPreferredSize(new Dimension(50, 50));
        sendButton.setBackground(new Color(0, 132, 255));
        sendButton.setBorderPainted(false);
        sendButton.setFocusPainted(false);
        
        // Khởi tạo các thành phần khác
        newChatButton = new JButton("Chat mới");
        historyModel = new DefaultListModel<>();
        historyList = new JList<>(historyModel);
        typingIndicator = new JLabel("AI đang nhập...");
        typingTimer = new Timer(500, e -> {
            typingDots = (typingDots + 1) % 4;
            typingIndicator.setText("AI đang nhập" + ".".repeat(typingDots));
        });
        
        // Thiết lập style cho các thành phần
        setupComponentStyles();
    }
    
    private void setupComponentStyles() {
        // Style cho newChatButton
        newChatButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        newChatButton.setBackground(new Color(207,228,223,255));
        newChatButton.setForeground(new Color(33, 37, 41));
        newChatButton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
        
        // Style cho historyList
        historyList.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        historyList.setBackground(new Color(39,43,55,255));
        historyList.setForeground(new Color(255, 255, 255));
        historyList.setSelectionBackground(new Color(0, 132, 255, 30));
        historyList.setSelectionForeground(new Color(255, 255, 255));
        historyList.setFixedCellHeight(35);
        historyList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, 
                    int index, boolean isSelected, boolean cellHasFocus) {
                // Tách và chỉ hiển thị phần sau chatId
                String displayText = value.toString().split("\\|")[1];
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, displayText, index, isSelected, cellHasFocus);
                label.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
                return label;
            }
        });
        
        // Style cho typingIndicator
        typingIndicator.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        typingIndicator.setForeground(new Color(108, 117, 125));
        typingIndicator.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        typingIndicator.setVisible(false);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        setOpaque(false);
        
        // Panel bên trái cho lịch sử chat
        JPanel leftPanel = new RoundedPanel(50);
        leftPanel.setLayout(new BorderLayout());
        leftPanel.setBackground(new Color(39,43,55,255));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        leftPanel.setPreferredSize(new Dimension(250, 0));
        //leftPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(222, 226, 230)));
        
        // Style cho nút chat mới
        newChatButton.setPreferredSize(new Dimension(250, 40));
        newChatButton.setBackground(new Color(248, 249, 250));
        newChatButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        
        JPanel Panel1 = new JPanel();
        Panel1.setLayout(new BorderLayout());
        Panel1.add(newChatButton, BorderLayout.CENTER);
        Panel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 5));
        Panel1.setOpaque(false);
        
        // Thêm components vào left panel
        leftPanel.add(Panel1, BorderLayout.NORTH);
        
        // Style cho history list
        JScrollPane historyScrollPane = new JScrollPane(historyList);
        historyScrollPane.setBorder(null);
        historyScrollPane.setBackground(new Color(248, 249, 250));
        leftPanel.add(historyScrollPane, BorderLayout.CENTER);
        
        // Panel chính cho chat
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Style cho chat area
        JScrollPane chatScrollPane = new JScrollPane(chatArea);
        chatScrollPane.setBorder(null);
        chatScrollPane.setBackground(Color.WHITE);
        chatScrollPane.getViewport().setOpaque(false);
        chatScrollPane.setOpaque(false);
        chatScrollPane.setViewportBorder(null);
        mainPanel.add(chatScrollPane, BorderLayout.CENTER);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        mainPanel.setOpaque(false);
        
        // Panel cho input
        JPanel Panel = new JPanel(new BorderLayout());
        Panel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        Panel.setOpaque(false);
        JPanel inputPanel = new RoundedPanel(50);
        inputPanel.setLayout(new BorderLayout(10, 0));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        inputPanel.setBackground(new Color(39,43,55,255));
        
        // Style cho input field
        inputField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(10, 10, 10), 1, true),
            BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        
        // Style cho nút gửi
        sendButton.setPreferredSize(new Dimension(45, 45));
        sendButton.setBackground(new Color(0, 132, 255));
        sendButton.setForeground(Color.WHITE);
        sendButton.setBorder(BorderFactory.createEmptyBorder());
        
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        inputPanel.add(typingIndicator, BorderLayout.SOUTH);
        
        Panel.add(inputPanel, BorderLayout.CENTER);
        
        mainPanel.add(Panel, BorderLayout.SOUTH);
        
        add(leftPanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }
    
    private void setupCustomStyles() {
        // Thêm hover effect cho nút gửi
        sendButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                //sendButton.setBackground(new Color(52, 152, 219));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                //sendButton.setBackground(new Color(0, 132, 255));
            }
        });
        
        // Thêm hover effect cho nút chat mới
        newChatButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                newChatButton.setBackground(new Color(245, 247, 250));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                newChatButton.setBackground(Color.WHITE);
            }
        });
        
        // Thêm hover effect cho history list
        historyList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                //historyList.setBackground(new Color(240, 242, 245));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                //historyList.setBackground(new Color(248, 249, 250));
            }
        });
    }
    
    private void setupEventListeners() {
        // Xử lý sự kiện gửi tin nhắn
        ActionListener sendAction = e -> handleSendMessage();
        sendButton.addActionListener(sendAction);
        inputField.addActionListener(sendAction);
        
        // Xử lý sự kiện tạo chat mới
        newChatButton.addActionListener(e -> {
            chatService.createNewChat();
            // Xóa tất cả tin nhắn cũ
            chatArea.removeAll();
            chatArea.revalidate();
            chatArea.repaint();
            inputField.setText("");
            updateHistoryList();
        });
        
        // Xử lý sự kiện chọn chat từ history
        historyList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = historyList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    String selectedItem = historyModel.getElementAt(selectedIndex);
                    String selectedChatId = selectedItem.split("\\|")[0];
                    chatService.setCurrentChatId(selectedChatId);
                    displayChat(chatService.getCurrentChat());
                }
            }
        });
    }
    
    private void handleSendMessage() {
        String message = inputField.getText().trim();
        if (!message.isEmpty()) {
            appendMessage(message, true);
            inputField.setText("");
            
            // Hiển thị typing indicator
            typingIndicator.setVisible(true);
            typingTimer.start();
            
            // Gửi tin nhắn đến AI và nhận phản hồi
            CompletableFuture.supplyAsync(() -> {
                try {
                    return chatService.sendMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                    return "Xin lỗi, đã có lỗi xảy ra khi xử lý tin nhắn của bạn.";
                }
            }).thenAccept(response -> {
                SwingUtilities.invokeLater(() -> {
                    typingTimer.stop();
                    typingIndicator.setVisible(false);
                    appendMessage(response, false);
                    updateHistoryList();
                });
            });
        }
    }
    
    private void displayChat(List<Message> messages) {
        SwingUtilities.invokeLater(() -> {
            // Xóa tất cả tin nhắn cũ
            chatArea.removeAll();
            
            if (messages != null && !messages.isEmpty()) {
                for (Message msg : messages) {
                    appendMessage(msg.getContent(), msg.isUser());
                }
            }
            
            // Cập nhật UI và cuộn xuống
            chatArea.revalidate();
            chatArea.repaint();
            scrollToBottom();
        });
    }
    
    private void appendMessage(String message, boolean isUser) {
        // Tạo panel chính cho tin nhắn
        JPanel messagePanel = new JPanel();
        messagePanel.setOpaque(false);
        messagePanel.setLayout(new BorderLayout(12, 0));
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        
        // Tạo panel cho nội dung tin nhắn
        RoundedPanel contentPanel = new RoundedPanel(50);
        contentPanel.setLayout(new BorderLayout(0, 5)); // Thêm khoảng cách giữa các thành phần
        
        // Màu sắc cho tin nhắn
        Color userBgColor = new Color(25, 118, 210); // Xanh đậm cho user
        Color aiBgColor = new Color(240, 240, 240);  // Xám nhẹ cho AI
        
        // Thiết lập màu sắc
        if (isUser) {
            contentPanel.setBackground(userBgColor);
            contentPanel.setForeground(Color.WHITE);
        } else {
            contentPanel.setBackground(aiBgColor);
            contentPanel.setForeground(new Color(33, 37, 41));
        }
        
        // Tạo border bo tròn
        contentPanel.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(isUser ? new int[]{18, 18, 5, 18} : new int[]{18, 5, 18, 18}),
            BorderFactory.createEmptyBorder(12, 16, 12, 16)
        ));
        
        // Tạo label cho tên người gửi
        JLabel nameLabel = new JLabel(isUser ? "Bạn" : "AI");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        nameLabel.setForeground(isUser ? new Color(255, 255, 255, 240) : new Color(70, 70, 70));
        
        // Tạo JTextPane thay vì JTextArea cho tin nhắn - sẽ hiển thị tốt hơn
        messageText = new JTextPane();
        messageText.setEditable(false);
        messageText.setText(message);
        messageText.setBackground(contentPanel.getBackground());
        messageText.setForeground(isUser ? Color.WHITE : new Color(33, 37, 41));
        messageText.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        // Đảm bảo nội dung được hiển thị đầy đủ
        int messageWidth = Math.min(chatArea.getWidth() - 120, 450);
        if (messageWidth <= 0) messageWidth = 450;
        
        // Tự động tính chiều cao phù hợp với nội dung
        Dimension preferredSize = messageText.getPreferredSize();
        if (preferredSize.width > messageWidth) {
            // Cho text hiển thị trên nhiều dòng nếu quá dài
            messageText.setPreferredSize(new Dimension(messageWidth, preferredSize.height));
        }
        
        // Thêm messageText vào JScrollPane để đảm bảo nội dung dài được hiển thị
        JScrollPane messageScroll = new JScrollPane(messageText);
        messageScroll.setBorder(null);
        messageScroll.setOpaque(false);
        messageScroll.getViewport().setOpaque(false);
        
        // Tính chiều cao tự động dựa trên nội dung
        // Mỗi 80 ký tự ~ 1 dòng với chiều rộng messageWidth
        int lines = Math.max(1, (int) Math.ceil(message.length() / 50.0));
        int height = Math.min(300, 20 * lines); // Giới hạn chiều cao tối đa
        messageScroll.setPreferredSize(new Dimension(messageWidth, height));
        
        // Tạo label cho thời gian
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        JLabel timeLabel = new JLabel(sdf.format(new Date()));
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        timeLabel.setForeground(isUser ? new Color(255, 255, 255, 180) : new Color(101, 103, 107, 180));
        timeLabel.setHorizontalAlignment(isUser ? SwingConstants.RIGHT : SwingConstants.LEFT);
        
        // Thêm các thành phần vào content panel
        contentPanel.add(nameLabel, BorderLayout.NORTH);
        contentPanel.add(messageScroll, BorderLayout.CENTER);
        contentPanel.add(timeLabel, BorderLayout.SOUTH);
        
        // Tạo avatar
        JPanel avatarPanel = new JPanel(new BorderLayout());
        avatarPanel.setPreferredSize(new Dimension(38, 38));
        avatarPanel.setOpaque(false);
        
        // Tạo avatar hình tròn
        JLabel avatarLabel = createCircularAvatarLabel(isUser ? "B" : "AI", isUser);
        avatarPanel.add(avatarLabel, BorderLayout.CENTER);
        
        // Panel để căn lề
        JPanel alignPanel = new JPanel();
        alignPanel.setLayout(new BorderLayout());
        alignPanel.setOpaque(false);
        
        // Thiết lập vị trí
        if (isUser) {
            // Tin nhắn người dùng ở bên phải
            alignPanel.add(contentPanel, BorderLayout.EAST);
            messagePanel.add(alignPanel, BorderLayout.CENTER);
            messagePanel.add(avatarPanel, BorderLayout.EAST);
        } else {
            // Tin nhắn AI ở bên trái
            alignPanel.add(contentPanel, BorderLayout.WEST);
            messagePanel.add(avatarPanel, BorderLayout.WEST);
            messagePanel.add(alignPanel, BorderLayout.CENTER);
        }
        
        // Thêm tin nhắn vào chatArea
        chatArea.add(messagePanel);
        chatArea.add(Box.createVerticalStrut(10)); // Khoảng cách giữa các tin nhắn
        
        // Đảm bảo UI được cập nhật đúng
        chatArea.revalidate();
        chatArea.repaint();
        
        // Scroll xuống tin nhắn mới nhất - Cải thiện cách cuộn xuống
        scrollToBottom();
    }
    
    // Phương thức mới để cuộn xuống cuối chat
    private void scrollToBottom() {
        SwingUtilities.invokeLater(() -> {
            // Lấy JScrollPane chứa chatArea
            Container parent = chatArea.getParent();
            while (parent != null && !(parent instanceof JScrollPane)) {
                parent = parent.getParent();
            }
            
            if (parent != null) {
                JScrollPane scrollPane = (JScrollPane) parent;
                JScrollBar vertical = scrollPane.getVerticalScrollBar();
                
                // Đặt giá trị cho vertical scrollbar để cuộn xuống cuối
                vertical.setValue(vertical.getMaximum());
                
                // Lặp lại sau 100ms để đảm bảo chắc chắn cuộn xuống
                Timer timer = new Timer(100, e -> {
                    vertical.setValue(vertical.getMaximum());
                });
                timer.setRepeats(false);
                timer.start();
            }
        });
    }
    
    // Tạo avatar hình tròn dạng JLabel
    private JLabel createCircularAvatarLabel(String text, boolean isUser) {
        JLabel label = new JLabel(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                int diameter = Math.min(getWidth(), getHeight());
                
                // Vẽ hình tròn
                g2.setColor(isUser ? new Color(13, 71, 161) : new Color(33, 33, 33));
                g2.fillOval(0, 0, diameter, diameter);
                
                // Vẽ text
                FontMetrics fm = g2.getFontMetrics();
                int textWidth = fm.stringWidth(text);
                int textHeight = fm.getHeight();
                
                g2.setColor(Color.WHITE);
                g2.drawString(text, (diameter - textWidth) / 2, 
                          (diameter - textHeight) / 2 + fm.getAscent());
                
                g2.dispose();
            }
        };
        
        label.setPreferredSize(new Dimension(38, 38));
        label.setOpaque(false);
        label.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label.setForeground(Color.WHITE);
        
        return label;
    }
    
    private void updateHistoryList() {
        Map<String, List<Message>> allChats = chatService.getAllChats();
        List<String> chatIds = chatService.getChatIds();
        
        if (!allChats.isEmpty()) {
            historyModel.clear();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            
            // Duyệt qua các chat theo thứ tự trong chatIds
            for (String chatId : chatIds) {
                List<Message> chat = allChats.get(chatId);
                if (chat != null && !chat.isEmpty()) {
                    // Lấy tin nhắn đầu tiên của người dùng
                    Message firstUserMsg = chat.stream()
                        .filter(Message::isUser)
                        .findFirst()
                        .orElse(null);
                    
                    if (firstUserMsg != null) {
                        String time = sdf.format(new Date(firstUserMsg.getTimestamp()));
                        String title = firstUserMsg.getContent().trim();
                        
                        if (title.length() > 25) {
                            title = title.substring(0, 22) + "...";
                        }
                        
                        // Lưu trữ chatId trong JList item
                        historyModel.addElement(chatId + "|" + time + " - " + title);
                    }
                }
            }
            
            // Tự động chọn cuộc trò chuyện hiện tại
            for (int i = 0; i < historyModel.size(); i++) {
                String itemChatId = historyModel.getElementAt(i).split("\\|")[0];
                if (itemChatId.equals(chatService.getCurrentChatId())) {
                    historyList.setSelectedIndex(i);
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChatAIUI().setVisible(true);
        });
    }

    public static class Message {
        private String content;
        private boolean isUser;
        private long timestamp;

        public Message(String content, boolean isUser) {
            this.content = content;
            this.isUser = isUser;
            this.timestamp = System.currentTimeMillis();
        }

        public String getContent() {
            return content;
        }

        public boolean isUser() {
            return isUser;
        }

        public long getTimestamp() {
            return timestamp;
        }
    }

    public class ChatService {
        private Map<String, List<Message>> chatHistory;
        private String currentChatId;
        private List<String> chatIds;

        public ChatService() {
            chatHistory = new HashMap<>();
            chatIds = new ArrayList<>();
            createNewChat();
        }

        public void createNewChat() {
            currentChatId = UUID.randomUUID().toString();
            chatHistory.put(currentChatId, new ArrayList<>());
            chatIds.add(currentChatId);
        }
        

        public String sendMessage(String message) throws IOException{
            List<Message> currentChat = chatHistory.get(currentChatId);
            currentChat.add(new Message(message, true));
            
            String response;
            ChatAIService chatAI = new ChatAIService();
            String call = chatAI.callGeminiAPI(message);
            String formattedResponse = chatAI.formatResponse(call);
            response = formattedResponse;
            
            currentChat.add(new Message(response, false));
            return response;
        }

        public List<Message> getCurrentChat() {
            return chatHistory.get(currentChatId);
        }

        public Map<String, List<Message>> getAllChats() {
            return chatHistory;
        }

        public List<String> getChatIds() {
            return chatIds;
        }

        public void setCurrentChatId(String chatId) {
            if (chatHistory.containsKey(chatId)) {
                currentChatId = chatId;
            }
        }

        public String getCurrentChatId() {
            return currentChatId;
        }
    }
    
        public class ChatAIService {

        private void removeUnwantedLines() {
            String content = messageText.getText();
            StringBuilder cleanedContent = new StringBuilder();

            String[] lines = content.split("\\n");
            for (String line : lines) {
                if (!line.contains("idates") && !line.contains("finishReason") && !line.contains("avgLogprobs")) {
                    cleanedContent.append(line).append("\n");
                }
            }
            messageText.setText(cleanedContent.toString().trim());
        }

        private String callGeminiAPI(String code) throws IOException {
            URL url = new URL("https://generativelanguage.googleapis.com/v1/models/gemini-1.5-pro-002:generateContent?key=" + API_KEY);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            connection.setDoOutput(true);

            // Xử lý dữ liệu đầu vào
            String safeCode = code.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
            String payload = String.format("{\"contents\":[{\"parts\":[{\"text\":\"%s\"}]}]}", safeCode);

            try (OutputStream os = connection.getOutputStream()) {
                os.write(payload.getBytes("UTF-8"));
                os.flush();
            }

            int statusCode = connection.getResponseCode();
            InputStream inputStream = (statusCode >= 200 && statusCode < 300) ? connection.getInputStream() : connection.getErrorStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Chuyển đổi JSON thành đối tượng
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Lấy phần "candidates" -> "content" -> "parts" -> "text"
            JSONArray candidates = jsonResponse.optJSONArray("candidates");
            if (candidates != null && candidates.length() > 0) {
                JSONObject content = candidates.getJSONObject(0).optJSONObject("content");
                if (content != null) {
                    JSONArray parts = content.optJSONArray("parts");
                    if (parts != null && parts.length() > 0) {
                        return parts.getJSONObject(0).optString("text", "").trim(); // Lấy nội dung text
                    }
                }
            }

            return "Lỗi: Không tìm thấy nội dung phản hồi!";
        }

        private String formatJsonResponse(String jsonResponse) {
            try {
                int startIndex = jsonResponse.indexOf("\"text\":\"") + 9;
                int endIndex = jsonResponse.indexOf("\"}", startIndex);
                if (startIndex > 0 && endIndex > startIndex) {
                    String extractedText = jsonResponse.substring(startIndex, endIndex);
                    return extractedText.replaceAll("\\n", "\n");
                }
            } catch (Exception e) {
                return "Lỗi định dạng kết quả: " + e.getMessage();
            }
            return "Không thể phân tích kết quả từ API.";
        }

        private String formatResponse(String response) {
            if (response == null || response.isEmpty()) {
                return "Phản hồi rỗng hoặc không hợp lệ.";
            }
            response = response.replaceAll(".*?\"text\":\"0.*?\\n", "")
                    .replaceAll(".*?\"text\":\"\\s*\\n", "");
            return response.replaceAll("\\n", "\n")
                    .replaceAll(".*?\\\"text\\\":\\\"(.*?)\\\".*", "$1")
                    .replaceAll("\\\\\"", "\"");
        }
    }


    // Custom Border cho tin nhắn hình bong bóng
    private class RoundedBorder extends AbstractBorder {
        private int[] radii; // top-left, top-right, bottom-right, bottom-left
        
        public RoundedBorder(int[] radii) {
            this.radii = radii;
        }
        
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            g2.setColor(c.getBackground());
            
            int topLeftRadius = radii[0];
            int topRightRadius = radii[1];
            int bottomRightRadius = radii[2];
            int bottomLeftRadius = radii[3];
            
            Path2D path = new Path2D.Double();
            
            // Top-left corner
            path.moveTo(x + topLeftRadius, y);
            
            // Top edge and top-right corner
            path.lineTo(x + width - topRightRadius, y);
            path.quadTo(x + width, y, x + width, y + topRightRadius);
            
            // Right edge and bottom-right corner
            path.lineTo(x + width, y + height - bottomRightRadius);
            path.quadTo(x + width, y + height, x + width - bottomRightRadius, y + height);
            
            // Bottom edge and bottom-left corner
            path.lineTo(x + bottomLeftRadius, y + height);
            path.quadTo(x, y + height, x, y + height - bottomLeftRadius);
            
            // Left edge and back to top-left corner
            path.lineTo(x, y + topLeftRadius);
            path.quadTo(x, y, x + topLeftRadius, y);
            
            path.closePath();
            g2.fill(path);
            
            g2.dispose();
        }
        
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radii[0], radii[3], radii[2], radii[1]);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }
}

