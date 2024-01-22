/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07055_XepLoai;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */

class XepLoai implements Comparable<XepLoai>{
    static int cnt = 1;
    private String ma;
    private String name;
    private double diemluyentap;
    private double diemthuchanh;
    private double diemthi;

    public XepLoai() {
    }

    public XepLoai(String name, double diemluyentap, double diemthuchanh, double diemthi) {
        this.ma = String.format("SV%02d",cnt++);
        this.name = name;
        this.diemluyentap = diemluyentap;
        this.diemthuchanh = diemthuchanh;
        this.diemthi = diemthi;
    }
    
    public String formatName(){
        String ans = "";
        String a[] = name.toLowerCase().trim().split("\\s+");
        for(String i : a){
            ans += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public double getTongdiem(){
        return diemluyentap * 0.25 + diemthuchanh * 0.35 + diemthi * 0.4;
    }
    
    public String getXeploai(){
        if(getTongdiem() >= 8) return "GIOI";
        if(getTongdiem() >= 6.5 && getTongdiem() < 8) return "KHA";
        if(getTongdiem() >= 5 && getTongdiem() < 6.5) return "TRUNG BINH";
        if(getTongdiem() < 5) return "KEM";
        return null;
    }

    @Override
    public String toString() {
        return ma+" "+formatName()+" "+String.format("%.2f", getTongdiem())+" "+getXeploai();
    }

    @Override
    public int compareTo(XepLoai o) {
        return Double.compare(o.getTongdiem(), this.getTongdiem());
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<XepLoai> arr = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            double diemluyentap = Double.parseDouble(sc.nextLine());
            double diemthuchanh = Double.parseDouble(sc.nextLine());
            double diemthi = Double.parseDouble(sc.nextLine());
            arr.add(new XepLoai(name,diemluyentap,diemthuchanh,diemthi));
        }
        Collections.sort(arr);
        for(XepLoai x : arr){
            System.out.println(x);
        }
    }
    
}
