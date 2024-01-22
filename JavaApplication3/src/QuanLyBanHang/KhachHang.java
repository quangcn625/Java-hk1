/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

/**
 *
 * @author WIN
 */
public class KhachHang {
    static int cnt = 1;
    private String maKH, nameKH, sex, dob, dc;

    public KhachHang(String nameKH, String sex, String dob, String dc) {
        this.maKH = "KH" + String.format("%03d", cnt++);
        this.nameKH = nameKH;
        this.sex = sex;
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
