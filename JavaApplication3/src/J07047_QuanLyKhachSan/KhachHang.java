/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047_QuanLyKhachSan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author WIN
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String maKH;
    private String nameKH;
    private String maphong;
    private String ngayden, ngaydi;
    private LoaiPhong tmp;

    public KhachHang(String nameKH, String maphong, String ngayden, String ngaydi, ArrayList<LoaiPhong> list) {
        this.maKH = "KH" + String.format("%02d", cnt++);
        this.nameKH = nameKH;
        this.maphong = maphong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        for(LoaiPhong x : list){
            if(x.getKHphong().contains(maphong.substring(2, 3))){
                this.tmp = x;
                break;
            }
        }
    }
    
    public long getSongayo(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date start = sdf.parse(ngayden);
            Date finish = sdf.parse(ngaydi);
            if(start.equals(finish)) return 1;
            return (finish.getTime() - start.getTime()) / (1000 * 60 * 60 * 24);
        }
        catch(Exception e){
            
        }
        return 0;
    }
    
    public double getTongtien(){
        double ans = (getSongayo() * tmp.getDonngiangay()) + (getSongayo() * tmp.getDonngiangay() * tmp.getPhiphucvu());
        if(getSongayo() < 10) return Math.round(ans * 100) / 100.0;
        if(getSongayo() < 20) return Math.round((ans - ans * 0.02) * 100) / 100.0;
        if(getSongayo() < 30) return Math.round((ans - ans * 0.04) * 100) / 100.0;
        return Math.round((ans - ans * 0.06) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return maKH+" "+nameKH+" "+maphong+" "+getSongayo()+" "+String.format("%.2f", getTongtien());
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.getSongayo(),this.getSongayo());
    }
    
}
