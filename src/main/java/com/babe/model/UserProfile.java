package com.babe.model;

import javax.swing.ImageIcon;
import java.time.LocalDate;

public class UserProfile {
    private String displayName;
    private String fullName;
    private String email;
    private String phone;
    private String bio;
    private String gender;
    private LocalDate birthday;
    private ImageIcon avatarIcon;

    public UserProfile() {
        // Khởi tạo giá trị mặc định
        this.displayName = "";
        this.fullName = "";
        this.email = "";
        this.phone = "";
        this.bio = "";
        this.gender = "Nam";
        this.birthday = null;
        this.avatarIcon = null;
    }

    // Getters
    public String getDisplayName() { return displayName; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getBio() { return bio; }
    public String getGender() { return gender; }
    public LocalDate getBirthday() { return birthday; }
    public ImageIcon getAvatarIcon() { return avatarIcon; }

    // Setters
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setBio(String bio) { this.bio = bio; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthday(LocalDate birthday) { this.birthday = birthday; }
    public void setAvatarIcon(ImageIcon avatarIcon) { this.avatarIcon = avatarIcon; }

    public void saveToDatabase() {
        // TODO: Implement database saving logic
        // Tạm thời chỉ in ra console để kiểm tra
        System.out.println("Saving user profile to database:");
        System.out.println("Display Name: " + displayName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Bio: " + bio);
        System.out.println("Gender: " + gender);
        System.out.println("Birthday: " + birthday);
    }
} 