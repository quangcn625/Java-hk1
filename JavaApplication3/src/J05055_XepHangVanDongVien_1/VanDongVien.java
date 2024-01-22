/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05055_XepHangVanDongVien_1;

/**
 *
 * @author WIN
 */
public class VanDongVien implements Comparable<VanDongVien>{
    static int cnt = 1;
    private String ma;
    private String name;
    private String dob;
    private String TimeStart;
    private String TimeFinish;
    private int tuoi;
    private String thoigianuutien;

    public VanDongVien(String name, String dob, String TimeStart, String TimeFinish) {
        this.ma = String.format("VDV%02d",cnt++);   
        this.name = name;
        this.dob = dob;
        this.TimeStart = TimeStart;
        this.TimeFinish = TimeFinish;
        int tmp = Integer.parseInt(dob.substring(6));
        this.tuoi = 2021 - tmp;
        if(this.tuoi < 18) this.thoigianuutien = "00:00:00";
        if(this.tuoi >= 18 && this.tuoi < 25) this.thoigianuutien = "00:00:01";
        if(this.tuoi >= 25 && this.tuoi < 32) this.thoigianuutien = "00:00:02";
        if(this.tuoi >= 32) this.thoigianuutien = "00:00:03";
    }

    public String getMa() {
        return ma;
    }
    
    public String getThoigianthucte(){
        String data1[] = TimeStart.split(":");
        String data2[] = TimeFinish.split(":");
        int tmp1 = Integer.parseInt(data1[0]) * 3600 + Integer.parseInt(data1[1]) * 60 + Integer.parseInt(data1[2]);
        int tmp2 = Integer.parseInt(data2[0]) * 3600 + Integer.parseInt(data2[1]) * 60 + Integer.parseInt(data2[2]);
        int ans = tmp2 - tmp1;
        return String.format("%02d:%02d:%02d", (ans / 3600), (ans % 3600) / 60, (ans % 60));
    }
    
    public String getThoigianxephang(){
        String data1[] = thoigianuutien.split(":");
        String data2[] = getThoigianthucte().split(":");
        int tmp1 = Integer.parseInt(data1[0]) * 3600 + Integer.parseInt(data1[1]) * 60 + Integer.parseInt(data1[2]);
        int tmp2 = Integer.parseInt(data2[0]) * 3600 + Integer.parseInt(data2[1]) * 60 + Integer.parseInt(data2[2]);
        int ans = tmp2 - tmp1;
        return String.format("%02d:%02d:%02d", (ans / 3600), (ans % 3600) / 60, (ans % 60));
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getThoigianthucte()+" "+thoigianuutien+" "+getThoigianxephang();
    }

    @Override
    public int compareTo(VanDongVien o) {
        return this.getThoigianxephang().compareTo(o.getThoigianxephang());
    }
}