/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004_QuanLyBaiTapNhom_2;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, name, sdt;
    private int nhom;

    public SinhVien(String ma, String name, String sdt, int nhom) {
        this.ma = ma;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+sdt+" "+nhom+" ";
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    
}

