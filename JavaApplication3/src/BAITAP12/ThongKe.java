/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITAP12;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class ThongKe {
    private String mahang;
    private long soluongnhap, dongia, soluongxuat;
    private MatHang mh;

    public ThongKe(String mahang, long soluongnhap, long dongia, long soluongxuat, ArrayList<MatHang> dsMH) {
        this.mahang = mahang;
        this.soluongnhap = soluongnhap;
        this.dongia = dongia;
        this.soluongxuat = soluongxuat;
        for(MatHang x : dsMH){
            if(this.mahang.substring(0,1).contentEquals(x.ma)){
                this.mh = x;
                break;
            }
        }
    }
    
    public long getTonggiatrinhap(){
        return soluongnhap * dongia;
    }
    
    public long getTonggiatrixuat(){
        if(this.mh.xeploai.equals("A")) return (long)(soluongxuat * dongia * 0.08);
        if(this.mh.xeploai.equals("B")) return (long)(soluongxuat * dongia * 0.05);
        if(this.mh.xeploai.equals("C")) return (long)(soluongxuat * dongia * 0.02);
        return 0;
    }

    @Override
    public String toString() {
        return mahang+" "+this.mh.name+" "+getTonggiatrinhap()+" "+getTonggiatrixuat();
    }
    
}
