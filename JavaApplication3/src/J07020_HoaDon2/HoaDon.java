/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07020_HoaDon2;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class HoaDon {
    private static int cnt = 1;
    private String mahoadon, khachhang, mathang;
    private long soluong;
    private KhachHang tmp1;
    private MatHang tmp2;

    public HoaDon(String khachhang, String mathang, long soluong, ArrayList<KhachHang> dsKH, ArrayList<MatHang> dsMH) {
        this.mahoadon = "HD" + String.format("%03d", cnt++);
        this.khachhang = khachhang;
        this.mathang = mathang;
        this.soluong = soluong;
        for(KhachHang x : dsKH){
            if(x.getMaKH().contains(khachhang)){
                this.tmp1 = x;
                break;
            }
        }
        for(MatHang x : dsMH){
            if(x.getMaMH().contains(mathang)){
                this.tmp2 = x;
                break;
            }
        }
    }
    
    public long getThanhTien(){
        return tmp2.getGiaban() * soluong;
    }

    @Override
    public String toString() {
        return mahoadon+" "+tmp1.getNameKH()+" "+tmp1.getDc()+" "+tmp2.getNameMH()+" "+tmp2.getDonvitinh()+" "+tmp2.getGiamua()+" "+tmp2.getGiaban()+" "+soluong+" "+getThanhTien();
    }
}
