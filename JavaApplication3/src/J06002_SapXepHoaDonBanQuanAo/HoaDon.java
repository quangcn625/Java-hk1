/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002_SapXepHoaDonBanQuanAo;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class HoaDon implements Comparable<HoaDon>{
    private static int cnt = 1;
    private String mahoadon;
    private String mahoadondaydu;
    private long soluongmua, loai;
    private SanPham tmp;
    
    public HoaDon(String mahoadon, long soluongmua, ArrayList<SanPham> dsSP) {
        this.mahoadon = mahoadon;
        this.soluongmua = soluongmua;
        for(SanPham x : dsSP){
            if(x.getMaloai().contains(mahoadon.substring(0, 2))){
                this.tmp = x;
                break;
            }
        }
        this.mahoadondaydu = mahoadon + "-" + String.format("%03d", cnt++);
        this.loai = Long.parseLong(mahoadon.substring(2));
    }
    
    public long getThanhTien(){
        if(loai == 1){
            return tmp.getDongia1() * soluongmua;
        }
        return tmp.getDongia2() * soluongmua;
    }
    
    public long getGiamGia(){
        if(soluongmua >= 150) return Math.round(getThanhTien() * 0.5);
        if(soluongmua >= 100) return Math.round(getThanhTien() * 0.3);
        if(soluongmua >=50 )return (long)(getThanhTien() * 0.15);
        return 0;
    }
    
    public long getPhaiTra(){
        return getThanhTien() - getGiamGia();
    }

    @Override
    public String toString() {
        return mahoadondaydu+" "+tmp.getTenSP()+" "+getGiamGia()+" "+getPhaiTra();
    }

    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.getPhaiTra(), this.getPhaiTra());
    }
}
