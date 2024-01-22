/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07036_BangDiemTheoLop;

/**
 *
 * @author WIN
 */
public class SinhVien {
    private String masv, name, lop, email;

    public SinhVien(String masv, String name, String lop, String email) {
        this.masv = masv;
        this.name = formatName(name);
        this.lop = lop;
        this.email = email;
    }
    
    public String formatName(String s){
        String a[] = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }

    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }
}

