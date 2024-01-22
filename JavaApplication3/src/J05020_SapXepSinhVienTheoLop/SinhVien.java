/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05020_SapXepSinhVienTheoLop;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma,name,lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)) return this.ma.compareTo(o.ma);
        return this.lop.compareTo(o.lop);
    }
    
}
