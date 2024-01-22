/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05071_TinhCuocDienThoaiCoDinh_1;

/**
 *
 * @author WIN
 */
public class Phone {
    private String mavung, tentinh;
    private int giacuoc;

    public Phone(String mavung, String tentinh, int giacuoc) {
        this.mavung = mavung;
        this.tentinh = tentinh;
        this.giacuoc = giacuoc;
    }

    public String getMavung() {
        return mavung;
    }

    public String getTentinh() {
        return tentinh;
    }

    public int getGiacuoc() {
        return giacuoc;
    }
    
}
