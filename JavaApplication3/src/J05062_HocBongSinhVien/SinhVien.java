/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05062_HocBongSinhVien;

/**
 *
 * @author WIN
 */
public class SinhVien implements Comparable<SinhVien>{
    private String name, hocbong;
    private double TBC;
    private int RL;

    public SinhVien(String name, double TBC, int RL) {
        this.name = name;
        if(TBC >= 3.6 && RL >= 90) this.hocbong = "XUATSAC";
        else if(TBC >= 3.2 && RL >= 80) this.hocbong = "GIOI";
        else if(TBC >= 2.5 && RL >= 70) this.hocbong = "KHA";
        else this.hocbong = "KHONG";
        this.TBC = TBC;
        this.RL = RL;
    }

    public double getTBC() {
        return TBC;
    }

    public void setHocbong(String hocbong) {
        this.hocbong = hocbong;
    }

    @Override
    public String toString() {
        return name+": "+hocbong;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.TBC == o.TBC) return Integer.compare(o.RL, this.RL);
        return Double.compare(o.TBC, this.TBC);
    }
}
