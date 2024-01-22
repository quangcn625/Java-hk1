/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap_2;
import java.util.*;

class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String name;
    private int soSV;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, int soSV) {
        this.ma = ma;
        this.name = name;
        this.soSV = soSV;
    }

    public int getSoSV() {
        return soSV;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+soSV;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.soSV == o.soSV) return this.ma.compareTo(o.ma);
        return Integer.compare(o.soSV, this.soSV);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<SinhVien> vc = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            vc.add(new SinhVien(ma,name,soSV));
        }
        Collections.sort(vc);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Vector<SinhVien> vcc = new Vector<>();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(SinhVien x : vc){
                if(x.getSoSV()>=a && x.getSoSV()<=b) vcc.add(x);
            }
            for(SinhVien x : vcc){
                System.out.println(x);
            }
        }
    }
}
