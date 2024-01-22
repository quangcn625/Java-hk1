/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007_BangTinhGioChuan;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class Time {
    private String magv, mamon;
    private double giochuan;
    private MonHoc tmp1;
    private GiangVien tmp2;

    public Time(String magv, String mamon, double giochuan, ArrayList<MonHoc> list1, ArrayList<GiangVien> list2) {
        this.magv = magv;
        this.mamon = mamon;
        this.giochuan = giochuan;
        for(MonHoc x : list1){
            if(x.getMamon().contains(mamon)){
                this.tmp1 = x;
                break;
            }
        }
        for(GiangVien x : list2){
            if(x.getMaGV().contains(magv)){
                this.tmp2 = x;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return tmp2.getNameGV()+" "+String.format("%.2f", giochuan);
    }
}
