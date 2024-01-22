/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

/**
 *
 * @author WIN
 */
public class NhanVien {
    private String nameNV, sex, dob, dc, maMH;

    public NhanVien(String nameNV, String sex, String dob, String dc, String maMH) {
        this.nameNV = nameNV;
        this.sex = sex;
        this.dob = dob;
        this.dc = dc;
        this.maMH = maMH;
    }

    public String getNameNV() {
        return nameNV;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getDc() {
        return dc;
    }
    
}
