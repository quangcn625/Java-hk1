/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07036_BangDiemTheoLop;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class BangDiem implements Comparable<BangDiem>{
    private String masv, mamon;
    private double diem;
    private MonHoc tmp1;
    private SinhVien tmp2;

    public BangDiem(String masv, String mamon, double diem, ArrayList<MonHoc> list1, ArrayList<SinhVien> list2) {
        this.masv = masv;
        this.mamon = mamon;
        this.diem = diem;
        for(MonHoc x : list1){
            if(x.getMamon().equals(mamon)){
                this.tmp1 = x;
                break;
            }
        }
        for(SinhVien x : list2){
            if(x.getMasv().equals(masv)){
                this.tmp2 = x;
                break;
            }
        }
    }

    public String getLop(){
        return tmp2.getLop();
    }
    
    public String getDiem(){
        double x = diem * 10;
        if(x % 10 == 0) return String.format("%.0f", diem);
        return String.format("%.1f", diem);
    }
    
    @Override
    public String toString() {
        return masv+" "+tmp2.getName()+" "+tmp1.getMamon()+" "+tmp1.getTenmon()+" "+getDiem();
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.mamon.equals(o.mamon)) return this.masv.compareTo(o.masv);
        return this.mamon.compareTo(o.mamon);
    }
}

