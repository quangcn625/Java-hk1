/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

class ThuNhap{
    private String ma,name;
    private int bacluong;
    private long phucap,luong,luongcoban;

    public ThuNhap() {
    }

    public ThuNhap(String ma, String name,long luongcoban) {
        this.ma = ma;
        this.name = name;
        this.luongcoban = luongcoban;
        String a = this.ma.substring(2);
        this.bacluong = Integer.parseInt(a);
        String b = this.ma.substring(0, 2);
        switch (b) {
            case "HT":
                this.phucap = 2000000;
                break;
            case "HP":
                this.phucap = 900000;
                break;
            case "GV":
                this.phucap = 500000;
                break;
            default:
                break;
        }
        this.luong = this.luongcoban * this.bacluong + this.phucap;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getBacluong() {
        return bacluong;
    }

    public long getPhucap() {
        return phucap;
    }

    public long getLuong() {
        return luong;
    }

    public long getLuongcoban() {
        return luongcoban;
    }
}
public class tinhthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuNhap x = new ThuNhap(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(x.getMa()+" "+x.getName()+" "+x.getBacluong()+" "+x.getPhucap()+" "+x.getLuong());
    }
}
