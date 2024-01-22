/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05073_TinhToanGiaBan;

/**
 *
 * @author WIN
 */
public class Store {
    private String ma;
    private long dongia, soluong;

    public Store(String ma, long dongia, long soluong) {
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    public double getThue(){
        double x = 0;
        if(ma.startsWith("T")){
            x = dongia * soluong * 0.29;
        }
        else if(ma.startsWith("C")){
            x = dongia * soluong * 0.1;
        }
        else if(ma.startsWith("D")){
            x = dongia * soluong * 0.08;
        }
        else {
            x = dongia * soluong * 0.02;
        }
        if(ma.endsWith("C")) x = x * 0.95;
        return x;
    }
    
    public double getPhiVC(){
        double x = 0;
        if(ma.startsWith("T")){
            x = dongia * soluong * 0.04;
        }
        else if(ma.startsWith("C")){
            x = dongia * soluong * 0.03;
        }
        else if(ma.startsWith("D")){
            x = dongia * soluong * 0.025;
        }
        else {
            x = dongia * soluong * 0.005;
        }
        return x;
    }
    
    public double getTongchiphi(){
        double x = ((dongia * soluong + getThue() + getPhiVC()) * 1.2) / (soluong * 1.0);
        return Math.round(x * 100) / 100.0;
    }

    @Override
    public String toString() {
        return ma+" "+String.format("%.2f",getTongchiphi());
    }
    
}
