/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05036_TinhGiaBan_1;
import java.util.*;

class GiaBan{
    static int cnt=1;
    private String name;
    private String dvi;
    private long dongia;
    private int soluong;

    public GiaBan() {
    }

    public GiaBan(String name, String dvi, long dongia, int soluong) {
        this.name = name;
        this.dvi = dvi;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    public String getMa(){
        return String.format("MH%02d", cnt++);
    }
    
    public double getPhiVanChuyen(){
        return Math.round((this.dongia * this.soluong) * 0.05);
    }
    
    public double getThanhTien(){
        return Math.round(this.dongia * this.soluong + getPhiVanChuyen());
    }
    
    public double getGiaBan(){
        return (getThanhTien() + 0.02 * getThanhTien());
    }

    @Override
    public String toString() {
        return getMa()+" "+name+" "+dvi+" "+String.format("%.0f",getPhiVanChuyen())+" "+String.format("%.0f",getThanhTien())+" "+String.format("%.0f",getGiaBan());
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiaBan> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String dvi = sc.nextLine();
            long dongia = Long.parseLong(sc.nextLine());
            int soluong = Integer.parseInt(sc.nextLine());
            list.add(new GiaBan(name,dvi,dongia,soluong));
        }
        for(GiaBan x : list){
            System.out.println(x);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/
