/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05076_NhapXuatHang;

/**
 *
 * @author WIN
 */
import java.util.ArrayList;

public class ThongKe {
    private String mahang;
    private long soluongnhap, dongianhap, soluongxuat;
    private MatHang MH;

    public ThongKe(String mahang, long soluongnhap, long dongianhap, long soluongxuat, ArrayList<MatHang> dsMH) {
        this.mahang = mahang;
        this.soluongnhap = soluongnhap;
        this.dongianhap = dongianhap;
        this.soluongxuat = soluongxuat;
        for(MatHang x : dsMH){
            if(this.mahang.equals(x.ma)){
                this.MH = x;
                break;
            }
        }
    }
    
    public long getTonggiatrinhap(){
        return dongianhap * soluongnhap;
    }
    
    public long getTonggiatrixuat(){
        if(MH.xeploai.equals("A")) return (long)(dongianhap * soluongxuat + dongianhap * soluongxuat * 0.08);
        if(MH.xeploai.equals("B")) return (long)(dongianhap * soluongxuat + dongianhap * soluongxuat * 0.05);
        if(MH.xeploai.equals("C")) return (long)(dongianhap * soluongxuat + dongianhap * soluongxuat * 0.02);
        return 0;
    }

    @Override
    public String toString() {
        return mahang+" "+MH.name+" "+getTonggiatrinhap()+" "+getTonggiatrixuat();
    }
    
}
