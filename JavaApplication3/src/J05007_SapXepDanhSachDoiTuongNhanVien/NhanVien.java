/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007_SapXepDanhSachDoiTuongNhanVien;

/**
 *
 * @author WIN
 */
public class NhanVien implements Comparable<NhanVien>{
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
    @Override
    public int compareTo(NhanVien o){
        String tmp1 = o.dob.substring(6);
        String tmp2 = this.dob.substring(6);
        String tmp3 = o.dob.substring(3, 5);
        String tmp4 = this.dob.substring(3, 5);
        String tmp5 = o.dob.substring(0, 2);
        String tmp6 = this.dob.substring(0, 2);
        if(tmp1 != tmp2) return tmp2.compareTo(tmp1);
        if(tmp3 != tmp4) return tmp4.compareTo(tmp3);
        return tmp6.compareTo(tmp5);
    }
}
