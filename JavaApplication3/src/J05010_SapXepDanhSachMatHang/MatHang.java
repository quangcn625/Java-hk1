/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010_SapXepDanhSachMatHang;

/**
 *
 * @author WIN
 */
public class MatHang implements Comparable<MatHang>{
    static int cnt = 1;
    private String ma;
    private String name;
    private String nhomhang;
    private double giamua;
    private double giaban;
    private double loinhuan;

    public MatHang() {
    }

    public MatHang(String name, String nhomhang, double giamua, double giaban) {
        this.ma = String.format("%d", cnt++);
        this.name = name;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+nhomhang+" "+String.format("%.2f", loinhuan);
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.loinhuan,this.loinhuan);
    }
    
}
