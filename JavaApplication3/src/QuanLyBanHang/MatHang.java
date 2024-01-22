/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class MatHang {
    static int cnt = 1;
    private String maMH, nameMH, donvitinh;
    private long giamua, giaban;
    private NhanVien tmp;

    public MatHang(String nameMH, String donvitinh, long giamua, long giaban, ArrayList<NhanVien> list1) {
        this.maMH = "MH" + String.format("%03d", cnt++);
        this.nameMH = nameMH;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
        for(NhanVien x : list1){
            if(x.getMaMH().equals(this.maMH)){
                this.tmp = x;
                break;
            }
        }
    }

    public String getMaMH() {
        return maMH;
    }
    
    public String getNameQL(){
        return tmp.getNameNV();
    }
    
    public String getDiaChiQL(){
        return tmp.getDc();
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

    public String getNameMH() {
        return nameMH;
    }
}
