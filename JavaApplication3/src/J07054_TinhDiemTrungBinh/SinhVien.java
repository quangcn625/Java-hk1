/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054_TinhDiemTrungBinh;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    private static int cnt = 1;
    private String ma;
    private String name;
    private double d1, d2, d3, tongdiem;
    private int thuhang;

    public SinhVien(String name, double d1, double d2, double d3) {
        this.ma = "SV" + String.format("%02d", cnt++);
        this.name = formatName(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tongdiem = LamTron((d1 * 3 + d2 * 3 + d3 * 2) / 8.0);
    }
    
    public String formatName(String s){
        String a[] = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public double LamTron(double x){
        double tmp = x * 100;
        return Math.round(tmp) / 100.0;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setThuhang(int thuhang) {
        this.thuhang = thuhang;
    }

    public int getThuhang() {
        return thuhang;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+String.format("%.2f",tongdiem)+" "+thuhang;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tongdiem == o.tongdiem) return this.ma.compareTo(o.ma);
        return Double.compare(o.tongdiem, this.tongdiem);
    }
}
