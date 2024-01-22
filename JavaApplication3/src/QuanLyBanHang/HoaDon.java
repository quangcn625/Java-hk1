/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class HoaDon {
    static int cnt = 1;
    private String maHD, KH, MH;
    private long soluong;
    private MatHang tmp3;
    private KhachHang tmp2;

    public HoaDon(String KH, String MH, long soluong, ArrayList<KhachHang> list2, ArrayList<MatHang> list3) {
        this.maHD = "HD" + String.format("%03d", cnt++);
        this.KH = KH;
        this.MH = MH;
        this.soluong = soluong;
        for(KhachHang x : list2){
            if(x.getMaKH().equals(this.KH)){
                this.tmp2 = x;
                break;
            }
        }
        for(MatHang x : list3){
            if(x.getMaMH().equals(MH)){
                this.tmp3 = x;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return maHD+" "+tmp2.getNameKH()+" "+tmp2.getDc()+" "+tmp3.getNameMH()+" "+tmp3.getDonvitinh()+" "+tmp3.getNameQL()+" "+tmp3.getDiaChiQL()+" "+tmp3.getGiamua()+" "+tmp3.getGiaban()+" "+soluong+" "+(tmp3.getGiaban()) * soluong;
    }

}
