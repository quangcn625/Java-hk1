/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05028_DanhSachDoanhNghiepNhanSInhVienThucTap_1;
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
        for(SinhVien x : vc){
            System.out.println(x);
        }
    }
    
}
/*
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
50
SUN
SUN*
50
*/