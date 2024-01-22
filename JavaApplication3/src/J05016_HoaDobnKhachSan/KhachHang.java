/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05016_HoaDobnKhachSan;

import java.util.Date;

/**
 *
 * @author WIN
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String ma;
    private String name;
    private String sophong;
    private Date ngaynhanphong;
    private Date ngaytraphong;
    private int dichvuphatsinh;

    public KhachHang(String name, String sophong, Date ngaynhanphong, Date ngaytraphong, int dichvuphatsinh) {
        this.ma = "KH" + String.format("%02d", cnt++);
        this.name = name;
        this.sophong = sophong;
        this.ngaynhanphong = ngaynhanphong;
        this.ngaytraphong = ngaytraphong;
        this.dichvuphatsinh = dichvuphatsinh;
    }
    
    public int getSongayo(){
        return (int) (((ngaytraphong.getTime() - ngaynhanphong.getTime()) / (1000 * 60 * 60 * 24)) + 1);
    }
    
    public int getThanhtien(){
        String tmp = sophong.substring(0,1);
        if(tmp.equals("1")) return 25 * getSongayo() + dichvuphatsinh;
        if(tmp.equals("2")) return 34 * getSongayo() + dichvuphatsinh;
        if(tmp.equals("3")) return 50 * getSongayo() + dichvuphatsinh;
        if(tmp.equals("4")) return 80 * getSongayo() + dichvuphatsinh;
        return 0;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.getThanhtien(), this.getThanhtien());
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+sophong+" "+getSongayo()+" "+getThanhtien();
    }
    
}
