/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009_TimThuKhoaCuaKyThi;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    static int cnt = 1;
    private String ma;
    private String name;
    private String date;
    private double d1;
    private double d2;
    private double d3;
    private double tongdiem;

    public SinhVien() {
    }

    public SinhVien(String name, String date, double d1, double d2, double d3) {
        this.ma = String.format("%d", cnt++);
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tongdiem = this.d1 + this.d2 + this.d3;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+date+" "+String.format("%.1f", tongdiem);
    }
    
    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    
}
