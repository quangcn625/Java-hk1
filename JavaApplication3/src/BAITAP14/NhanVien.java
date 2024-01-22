/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITAP14;

/**
 *
 * @author WIN
 */
public class NhanVien {
    private String ma, name;
    private long luongcoban, songaycong;

    public NhanVien(String ma, String name, long luongcoban, long songaycong) {
        this.ma = ma;
        this.name = name;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
    }
    
    public long getLuong(){
        String tmp1 = ma.substring(0,1);
        int tmp2 = Integer.parseInt(ma.substring(1, 3));
        if(tmp1.equals("A")){
            if(tmp2 >= 1 && tmp2 <= 3) return luongcoban * songaycong * 10000;
            if(tmp2 >= 4 && tmp2 <= 8) return luongcoban * songaycong * 12000;
            if(tmp2 >= 9 && tmp2 <= 15) return luongcoban * songaycong * 14000;
            if(tmp2 >= 16) return luongcoban * songaycong * 20000;
        }
        if(tmp1.equals("B")){
            if(tmp2 >= 1 && tmp2 <= 3) return luongcoban * songaycong * 10000;
            if(tmp2 >= 4 && tmp2 <= 8) return luongcoban * songaycong * 11000;
            if(tmp2 >= 9 && tmp2 <= 15) return luongcoban * songaycong * 13000;
            if(tmp2 >= 16) return luongcoban * songaycong * 16000;
        }
        if(tmp1.equals("C")){
            if(tmp2 >= 1 && tmp2 <= 3) return luongcoban * songaycong * 9000;
            if(tmp2 >= 4 && tmp2 <= 8) return luongcoban * songaycong * 10000;
            if(tmp2 >= 9 && tmp2 <= 15) return luongcoban * songaycong * 12000;
            if(tmp2 >= 16) return luongcoban * songaycong * 14000;
        }
        if(tmp1.equals("D")){
            if(tmp2 >= 1 && tmp2 <= 3) return luongcoban * songaycong * 8000;
            if(tmp2 >= 4 && tmp2 <= 8) return luongcoban * songaycong * 9000;
            if(tmp2 >= 9 && tmp2 <= 15) return luongcoban * songaycong * 11000;
            if(tmp2 >= 16) return luongcoban * songaycong * 13000;
        }
        return 0;
    }
    
    public String getMaphongban(){
        return ma.substring(3);
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getLuong();
    }
}
