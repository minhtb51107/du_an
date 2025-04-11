/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class HeThong {
    static boolean sangtoi;

    static String cochu;

    long startTime = System.currentTimeMillis(); // Khi user bắt đầu học

// Khi user kết thúc bài học
    long endTime = System.currentTimeMillis();

    long totalTimeInSeconds = (endTime - startTime) / 1000;



    public String getCochu() {
        return cochu;
    }

    public void setCochu(String cochu) {
        HeThong.cochu = cochu;
    }

//    public Color getMau() {
//        return mau;
//    }
//
//    public void setMau(Color mau) {
//        HeThong.mau = mau;
//    }
//    static Color mau;

    public void setSangtoi(boolean sangtoi) {
        this.sangtoi = sangtoi;
    }

    public boolean isSangtoi() {
        return sangtoi;
    }
}
