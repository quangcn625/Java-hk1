/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047_QuanLyKhachSan;

/**
 *
 * @author WIN
 */
public class LoaiPhong {
    private String KHphong, tenloaiphong;
    private int donngiangay;
    private double phiphucvu;

    public LoaiPhong(String KHphong, String tenloaiphong, int donngiangay, double phiphucvu) {
        this.KHphong = KHphong;
        this.tenloaiphong = tenloaiphong;
        this.donngiangay = donngiangay;
        this.phiphucvu = phiphucvu;
    }

    public String getKHphong() {
        return KHphong;
    }
    
    public long getDonngiangay() {
        return donngiangay;
    }

    public double getPhiphucvu() {
        return phiphucvu;
    }
}
