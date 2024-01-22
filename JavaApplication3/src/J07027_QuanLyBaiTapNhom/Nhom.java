/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027_QuanLyBaiTapNhom;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class Nhom implements Comparable<Nhom>{
    private String maSV;
    private String ttNhom;
    private SinhVien tmp1;
    private BaiTap tmp2;

    public Nhom(String maSV, String ttNhom, ArrayList<SinhVien> list1, ArrayList<BaiTap> list2) {
        this.maSV = maSV;
        this.ttNhom = ttNhom;
        for(SinhVien x : list1){
            if(x.getMaSV().equals(maSV)){
                this.tmp1 = x;
                break;
            }
        }
        for(BaiTap x : list2){
            if(x.getMaBTL().equals(ttNhom)){
                this.tmp2 = x;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return maSV+" "+tmp1.getNameSV()+" "+tmp1.getSdt()+" "+ttNhom+" "+tmp2.getBaitaplon();
    }

    @Override
    public int compareTo(Nhom o) {
        return this.maSV.compareTo(o.maSV);
    }
}
