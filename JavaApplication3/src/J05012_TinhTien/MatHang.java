/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05012_TinhTien;

/**
 *
 * @author WIN
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, name;
    private long soluongmua, dongia, tientrietkhau;

    public MatHang(String ma, String name, long soluongmua, long dongia, long tientrietkhau) {
        this.ma = ma;
        this.name = name;
        this.soluongmua = soluongmua;
        this.dongia = dongia;
        this.tientrietkhau = tientrietkhau;
    }
    
    public long getThanhtoan(){
        return dongia * soluongmua - tientrietkhau;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+soluongmua+" "+dongia+" "+tientrietkhau+" "+getThanhtoan();
    }

    @Override
    public int compareTo(MatHang o) {
        return Long.compare(o.getThanhtoan(), this.getThanhtoan());
    }
}