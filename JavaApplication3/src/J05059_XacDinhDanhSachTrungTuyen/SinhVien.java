/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05059_XacDinhDanhSachTrungTuyen;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, name;
    private double DToan, DLy, DHoa, uutien, tongdiem;

    public SinhVien(String ma, String name, double DToan, double DLy, double DHoa) {
        this.ma = ma;
        this.name = name;
        this.DToan = DToan;
        this.DLy = DLy;
        this.DHoa = DHoa;
        this.uutien = getUutien();
        this.tongdiem = DToan * 2 + DLy + DHoa + getUutien();
    }

    public double getTongdiem() {
        return tongdiem;
    }
       
    public double getUutien(){
        String tmp = ma.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        if(tmp.equals("KV2")) return 1.0;
        return 2.5;
    }
    
    public String getLamTron(double x){
        double tmp = x * 10;
        if(tmp % 10 == 0) return String.format("%.0f",x);
        return String.format("%.1f", x);
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+getLamTron(uutien)+" "+getLamTron(tongdiem);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tongdiem == o.tongdiem) return this.ma.compareTo(o.ma);
        return Double.compare(o.tongdiem, this.tongdiem);
    }
}
