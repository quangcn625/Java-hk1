/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05006_Danhsachdoituongnhanvien;

/**
 *
 * @author WIN
 */
public class NhanVien {
    static int cnt = 1;
    private String mnv;
    private String name;
    private String gender;
    private String dob;
    private String dc;
    private String mst;
    private String date;

    public NhanVien() {
    }

    public NhanVien(String name, String gender, String dob, String dc, String mst, String date) {
        this.mnv = String.format("%05d", cnt++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dc = dc;
        this.mst = mst;
        this.date = date;
    }

    @Override
    public String toString() {
        
        return mnv+" "+name+" "+gender+" "+dob+" "+dc+" "+mst+" "+date;
    }
}
