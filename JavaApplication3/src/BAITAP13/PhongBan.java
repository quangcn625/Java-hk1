/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP13;

/**
 *
 * @author WIN
 */
public class PhongBan {
    private String maphong, tenphong;

    public PhongBan(String maphong, String tenphong) {
        this.maphong = maphong;
        this.tenphong = tenphong;
    }

    public String getMaphong() {
        return maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    @Override
    public String toString() {
        return tenphong;
    }
    
}