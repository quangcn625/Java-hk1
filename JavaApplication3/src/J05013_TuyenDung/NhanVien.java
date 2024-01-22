/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05013_TuyenDung;

/**
 *
 * @author WIN
 */
public class NhanVien implements Comparable<NhanVien>{
    private static int cnt = 1;
    private String ma, name;
    private double lythuyet, thuchanh;

    public NhanVien(String name, double lythuyet, double thuchanh) {
        this.ma = "TS" + String.format("%02d",cnt++);
        this.name = name;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    
    public double getDiemTB(){
        double x = 0, y = 0;
        if(lythuyet > 10) x = (double) (1.0 * lythuyet / 10);
        if(thuchanh > 10) y = (double)(1.0 * thuchanh / 10);
        else{
            x = lythuyet;
            y = thuchanh;
        }
        return ((x + y) / 2);
    }
    
    public String getXeploai(){
        if(getDiemTB() < 5) return "TRUOT";
        if(getDiemTB() >= 5 && getDiemTB() < 8) return "CAN NHAC";
        if(getDiemTB() >= 8 && getDiemTB() <= 9.5) return "DAT";
        return "XUAT SAC";
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+String.format("%.2f", getDiemTB())+" "+getXeploai();
    }
    
    @Override
    public int compareTo(NhanVien o){
        return Double.compare(o.getDiemTB(), this.getDiemTB());
    }
}
