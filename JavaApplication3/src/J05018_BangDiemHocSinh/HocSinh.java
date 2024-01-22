/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018_BangDiemHocSinh;

import java.text.DecimalFormat;

/**
 *
 * @author WIN
 */
public class HocSinh implements Comparable<HocSinh>{
    static int cnt = 1;
    private String ma;
    private String name;
    private double toan;
    private double tiengviet;
    private double ngoaingu;
    private double vatly;
    private double hoahoc;
    private double sinh;
    private double su;
    private double dia;
    private double congdan;
    private double congnghe;
    private double trungbinh;
    private String hocluc;
    
    public double lamtron(double x){
        return Math.round(x*Math.pow(10, 1));
    }
    
    public HocSinh() {
    }

    public HocSinh(String name, double toan, double tiengviet, double ngoaingu, double vatly, double hoahoc, double sinh, double su, double dia, double congdan, double congnghe) {
        this.ma = String.format("HS%02d",cnt++);
        this.name = name;
        this.toan = toan;
        this.tiengviet = tiengviet;
        this.ngoaingu = ngoaingu;
        this.vatly = vatly;
        this.hoahoc = hoahoc;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.congdan = congdan;
        this.congnghe = congnghe;
        this.trungbinh = lamtron((this.toan*2+this.tiengviet*2+this.ngoaingu+this.vatly+this.hoahoc+this.sinh+this.su+this.dia+this.congdan+this.congnghe)/12.0)/10.0;
        if(this.trungbinh >= 9) this.hocluc = "XUAT SAC";
        else if(this.trungbinh>=8 && this.trungbinh<9) this.hocluc = "GIOI";
        else if(this.trungbinh>=7 && this.trungbinh<8) this.hocluc = "KHA";
        else if(this.trungbinh>=5 && this.trungbinh<7) this.hocluc = "TB";
        else this.hocluc = "YEU";
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+String.format("%.1f", trungbinh)+" "+hocluc;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.trungbinh != o.trungbinh) return Double.compare(o.trungbinh, this.trungbinh);
        return this.ma.compareTo(o.ma);
    }
    
}
