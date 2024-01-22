/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05014_TuyenGiaoVien;

/**
 *
 * @author WIN
 */
public class GiaoVien implements Comparable<GiaoVien>{
    private static int cnt = 1;
    private String maGV, nameGV, maXT;
    private double diemTH, diemCM;

    public GiaoVien(String nameGV, String maXT, double diemTH, double diemCM) {
        this.maGV = "GV" + String.format("%02d", cnt++);
        this.nameGV = nameGV;
        this.maXT = maXT;
        this.diemTH = diemTH;
        this.diemCM = diemCM;
    }
    
    public String getNameMH(){
        String tmp = maXT.substring(0,1);
        if(tmp.equals("A")) return "TOAN";
        if(tmp.equals("B")) return "LY";
        return "HOA";
    }
    
    public double getTongdiem(){
        int tmp = Integer.parseInt(maXT.substring(1));
        if(tmp == 1) return (diemTH * 2 + diemCM + 2.0);
        if(tmp == 2) return (diemTH * 2 + diemCM + 1.5);
        if(tmp == 3) return (diemTH * 2 + diemCM + 1.0);
        return (diemTH * 2 + diemCM);

    }
    
    public String getTrangThai(){
        if(getTongdiem() >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }

    @Override
    public String toString() {
        return maGV+" "+nameGV+" "+getNameMH()+" "+String.format("%.1f", getTongdiem())+" "+getTrangThai();
    }

    @Override
    public int compareTo(GiaoVien o) {
        return Double.compare(o.getTongdiem(), this.getTongdiem());
    }
}
