/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author PC
 */
public class LichSu {

    public String getIPAddress() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Unknown";
        }
    }

    public String getDeviceInfo() {
        String os = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String user = System.getProperty("user.name");
        return os + " " + osVersion + " - User: " + user;
    }

}
