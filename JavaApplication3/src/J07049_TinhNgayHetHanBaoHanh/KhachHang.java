/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07049_TinhNgayHetHanBaoHanh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author WIN
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String maKH, nameKH, dc, maSP;
    private int soluongmua;
    private LocalDate ngaymua, ngayhethan;
    private SanPham ans;

    public KhachHang(String nameKH, String dc, String maSP, int soluongmua, LocalDate ngaymua, ArrayList<SanPham> list) {
        this.maKH = "KH" + String.format("%02d", cnt++);
        this.nameKH = nameKH;
        this.dc = dc;
        this.maSP = maSP;
        this.soluongmua = soluongmua;
        this.ngaymua = ngaymua;
        for(SanPham x : list){
            if(x.getMasp().equals(maSP)){
                this.ans = x;
                break;
            }
        }
        this.ngayhethan = ngaymua.plusMonths(this.ans.getThoihanbaohanh());
    }

    public int getTongtien(){
        return ans.getGiaban() * soluongmua;
    }
    
    @Override
    public String toString() {
        return maKH+" "+nameKH+" "+dc+" "+maSP+" "+getTongtien()+" "+DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ngayhethan);
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.ngayhethan.isEqual(o.ngayhethan)) return this.maKH.compareTo(o.maKH);
        return this.ngayhethan.compareTo(o.ngayhethan);
    }
}
