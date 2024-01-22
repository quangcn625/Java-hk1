/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057_DiemTuyenSinh;

import java.util.Scanner;

/**
 *
 * @author WIN
 */
public class TuyenSinh implements Comparable<TuyenSinh>{
    private static int cnt = 1;
    private String ma, name;
    private double diem;
    private String dantoc;
    private int khuvuc;

    public TuyenSinh(Scanner sc) {
        this.ma = String.format("TS%02d",cnt++);
        this.name = sc.nextLine();
        this.diem = Double.parseDouble(sc.nextLine());
        this.dantoc = sc.nextLine();
        this.khuvuc = Integer.parseInt(sc.nextLine());
    }
    
    public String formatName(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public Double getUutien(){
        double ans = 0;
        switch (khuvuc) {
            case 1:
                ans += 1.5;
                break;
            case 2:
                ans += 1;
                break;
            default:
                ans += 0;
                break;
        }
        if(dantoc.equals("Kinh")) ans += 0;
        else ans += 1.5;
        return ans;
    }
    
    public double getTongdiem(){
        return diem + getUutien();
    }
    
    public String getTrangthai(){
        if(getTongdiem()>=20.5) return "Do";
        return "Truot";
    }
    
    @Override
    public String toString(){
        return ma+" "+formatName()+" "+String.format("%.1f",getTongdiem())+" "+getTrangthai();
    }

    @Override
    public int compareTo(TuyenSinh o) {
        if(this.getTongdiem()==o.getTongdiem()) return this.ma.compareTo(o.ma);
        return Double.compare(o.getTongdiem(), this.getTongdiem());
    }
}
