/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05079_LopHocPhan_1;

/**
 *
 * @author WIN
 */
public class GiangVien implements Comparable<GiangVien>{
    private static int cnt = 1;
    private String ma, nameMH, nhom, nameGV;

    public GiangVien(String ma, String nameMH, String nhom, String nameGV) {
        this.ma = ma;
        this.nameMH = nameMH;
        this.nhom = nhom;
        this.nameGV = nameGV;
    }

    public String getMa() {
        return ma;
    }

    public String getNameMH() {
        return nameMH;
    }

    @Override
    public int compareTo(GiangVien o) {
        return this.nhom.compareTo(o.nhom);
    }
    
    @Override
    public String toString(){
        return nhom+" "+nameGV;
    }
}
