/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05030_BangDiemThanhPhan_1;
import java.util.*;

class SinhVien implements Comparable<SinhVien>{
    private String thutu;
    private String ma,name,lop;
    private double d1,d2,d3;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, String lop, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+String.format("%.1f", d1)+" "+String.format("%.1f", d2)+" "+String.format("%.1f", d3);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            arr.add(new SinhVien(ma,name,lop,d1,d2,d3));
        }
        Collections.sort(arr);
        int cnt = 1;
        for(SinhVien sv : arr) {
            System.out.println(String.format("%d", cnt++)+" "+sv);
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
*/
