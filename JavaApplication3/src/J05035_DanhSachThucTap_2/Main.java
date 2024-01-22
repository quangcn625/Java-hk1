/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05035_DanhSachThucTap_2;
import java.util.*;

class DanhSach implements Comparable<DanhSach>{
    static int cnt = 1;
    private String thutu,ma,name,lop,email,doanhnghiep;

    public DanhSach() {
    }

    public DanhSach(String ma, String name, String lop, String email, String doanhnghiep) {
        this.thutu = String.format("%d", cnt++);
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }

    @Override
    public String toString() {
        return thutu+" "+ma+" "+name+" "+lop+" "+email+" "+doanhnghiep;
    }

    @Override
    public int compareTo(DanhSach o) {
        return this.ma.compareTo(o.ma);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<DanhSach> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            list.add(new DanhSach(ma,name,lop,email,dn));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            Vector<DanhSach> vc = new Vector<>();
            for(DanhSach x : list){
                if(s.equals(x.getDoanhnghiep())) vc.add(x);
            }
            Collections.sort(vc);
            for(DanhSach x : vc){
                System.out.println(x);
            }
        }
    }
    
}
