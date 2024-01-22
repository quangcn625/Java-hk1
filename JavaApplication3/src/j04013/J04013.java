/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04013;

import java.util.*;

class TuyenSinh {

    private String ma, name, trangthai;
    private double d1, d2, d3, tongdiem, uutien;

    public TuyenSinh() {
    }

    public TuyenSinh(String ma, String name, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        String a = this.ma.substring(0, 3);
        switch (a) {
            case "KV1":
                this.uutien = 0.5;
                break;
            case "KV2":
                this.uutien = 1;
                break;
            case "KV3":
                this.uutien = 2.5;
                break;
            default:
                break;
        }
        this.tongdiem = d1 * 2 + d2 + d3;
        if (this.tongdiem + this.uutien >= 24) {
            this.trangthai = "TRUNG TUYEN";
        }
        else {
            this.trangthai = "TRUOT";
        }
    }
    
    public String formatDouble(Double x){
        int tmp = (int) (x * 10);
        if(tmp % 10 == 0) return String.format("%.0f", x);
        else return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+formatDouble(uutien)+" "+formatDouble(tongdiem)+" "+trangthai;
    }

}

public class J04013 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TuyenSinh x = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(x);
    }
}
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7
