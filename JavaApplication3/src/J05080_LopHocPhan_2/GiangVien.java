/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05080_LopHocPhan_2;

/**
 *
 * @author WIN
 */
public class GiangVien{
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

    public String getNhom() {
        return nhom;
    }

    public String getNameGV() {
        return nameGV;
    }
}
