/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatAI;

/**
 *
 * @author PC
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ChatMessage {
    private String message;
    private boolean isUser;
    private String chatId;
    private String chatTitle;
    private long timestamp;
    
    public ChatMessage(String message, boolean isUser, String chatId, String chatTitle) {
        this.message = message;
        this.isUser = isUser;
        this.chatId = chatId;
        this.chatTitle = chatTitle;
        this.timestamp = System.currentTimeMillis();
    }
    
    public String getMessage() {
        return message;
    }
    
    public boolean isUser() {
        return isUser;
    }
    
    public String getChatId() {
        return chatId;
    }
    
    public String getChatTitle() {
        return chatTitle;
    }
    
    public long getTimestamp() {
        return timestamp;
    }
    
    public String getFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", new Locale("vi", "VN"));
        return sdf.format(new Date(timestamp));
    }
    
    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("vi", "VN"));
        return sdf.format(new Date(timestamp));
    }
} 
