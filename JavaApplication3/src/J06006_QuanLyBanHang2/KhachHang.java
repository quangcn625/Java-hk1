/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author WIN
 */
public class KhachHang {
    private static int cnt = 1;
    private String maKH, nameKH, gender, dob, dc;

    public KhachHang(String nameKH, String gender, String dob, String dc) {
        this.maKH = "KH" + String.format("%03d", cnt++);
        this.nameKH = nameKH;
        this.gender = gender;
        this.dob = dob;
        this.dc = dc;
    }
    
    public String getMaKH() {
        return maKH;
    }

    public String getNameKH() {
        return nameKH;
    }

    public String getDc() {
        return dc;
    }
    
}
