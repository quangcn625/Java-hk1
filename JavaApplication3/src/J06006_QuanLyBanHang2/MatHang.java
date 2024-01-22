/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author WIN
 */
public class MatHang {
    private static int cnt = 1;
    private String maMH, nameMH, donvitinh;
    private long giamua, giaban;

    public MatHang(String nameMH, String donvitinh, long giamua, long giaban) {
        this.maMH = "MH" + String.format("%03d", cnt++);
        this.nameMH = nameMH;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getNameMH() {
        return nameMH;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public long getGiamua() {
        return giamua;
    }

    public long getGiaban() {
        return giaban;
    }
    
}

