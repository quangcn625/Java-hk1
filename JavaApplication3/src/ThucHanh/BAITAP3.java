/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh;

import java.util.*;
/**
 *
 * @author WIN
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma, name;
    private double d1, d2, d3, uutien, tongdiem;

    public SinhVien(String ma, String name, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.uutien = getUutien();
        this.tongdiem = getTongdiem();
    }
    
    public double getUutien(){
        String tmp = ma.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        if(tmp.equals("KV2")) return 1.0;
        return 2.5;
    }
    
    public double getTongdiem(){
        return this.d1 * 2 + this.d2 + this.d3 + this.uutien;
    }
    
    public String getTrangthai(){
        if(tongdiem >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    
    public String getLamtron(double x){
        long tmp = (long) (x * 10);
        if(tmp % 10 == 0) return String.valueOf(String.format("%.0f", x));
        return String.valueOf(String.format("%.1f", x));
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getLamtron(uutien)+" "+getLamtron(tongdiem)+" "+getTrangthai();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tongdiem == o.tongdiem) return this.ma.compareTo(o.ma);
        return Double.compare(o.tongdiem, this.tongdiem);
    }
    
}
public class BAITAP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> lst = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            lst.add(new SinhVien(ma, name, d1, d2, d3));
        }
        Collections.sort(lst);
        for(SinhVien x : lst){
            System.out.println(x);
        }
    }
    
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
*/
