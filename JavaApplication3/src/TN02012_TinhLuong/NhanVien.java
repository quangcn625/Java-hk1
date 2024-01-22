/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN02012_TinhLuong;

/**
 *
 * @author WIN
 */
import java.util.ArrayList;

public class NhanVien {
    private String ma, name;
    private long luongcoban, songaycong;
    private PhongBan x;

    public NhanVien(String ma, String name, long luongcoban, long songaycong, ArrayList<PhongBan> dsPB) {
        this.ma = ma;
        this.name = name;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
        String tmp = ma.substring(3);
        for(PhongBan i : dsPB){
            if(tmp.equals(i.getMaphong())){
                x = i;
                break;
            }
        }
    }
    
    public long getLuong(){
        String tmp1 = ma.substring(0,1);
        int tmp2 = Integer.parseInt(ma.substring(1,3));
        if(tmp1.equals("A")){
            if(tmp2 >= 1 && tmp2 <= 3){
                return luongcoban * songaycong * 10 * 1000;
            }
            else if(tmp2 >= 4 && tmp2 <= 8){
                return luongcoban * songaycong * 12 * 1000;
            }
            else if(tmp2 >= 9 && tmp2 <= 15){
                return luongcoban * songaycong * 14 * 1000;
            }
            else return luongcoban * songaycong * 20 * 1000;
        }
        if(tmp1.equals("B")){
            if(tmp2 >= 1 && tmp2 <= 3){
                return luongcoban * songaycong * 10 * 1000;
            }
            else if(tmp2 >= 4 && tmp2 <= 8){
                return luongcoban * songaycong * 11 * 1000;
            }
            else if(tmp2 >= 9 && tmp2 <= 15){
                return luongcoban * songaycong * 13 * 1000;
            }
            else return luongcoban * songaycong * 16 * 1000;
        }
        if(tmp1.equals("C")){
            if(tmp2 >= 1 && tmp2 <= 3){
                return luongcoban * songaycong * 9 * 1000;
            }
            else if(tmp2 >= 4 && tmp2 <= 8){
                return luongcoban * songaycong * 10 * 1000;
            }
            else if(tmp2 >= 9 && tmp2 <= 15){
                return luongcoban * songaycong * 12 * 1000;
            }
            else return luongcoban * songaycong * 14 * 1000;
        }
        if(tmp1.equals("D")){
            if(tmp2 >= 1 && tmp2 <= 3){
                return luongcoban * songaycong * 8 * 1000;
            }
            else if(tmp2 >= 4 && tmp2 <= 8){
                return luongcoban * songaycong * 9 * 1000;
            }
            else if(tmp2 >= 9 && tmp2 <= 15){
                return luongcoban * songaycong * 11 * 1000;
            }
            else return luongcoban * songaycong * 13 * 1000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma+" "+name+x.getTenphong()+" "+getLuong();
    }
}
