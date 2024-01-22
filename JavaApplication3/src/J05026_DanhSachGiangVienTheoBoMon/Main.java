/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05026_DanhSachGiangVienTheoBoMon;
import java.util.*;
class GiangVien{
    static int cnt = 1;
    private String ma;
    private String name;
    private String bomon;
    private String manganh;

    public GiangVien() {
    }

    public GiangVien(String name, String bomon) {
        this.ma = String.format("GV%02d", cnt++);
        this.name = name;
        this.bomon = bomon;
        String a[] = bomon.trim().split("\\s+");
        String ans = "";
        for(int i=0; i<a.length; i++){
            ans = ans + String.valueOf(a[i].charAt(0)).toUpperCase();
        }
        this.manganh = ans;
    }

    public String getManganh() {
        return manganh;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+manganh;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String manganh = sc.nextLine();
            GiangVien x = new GiangVien(name,manganh);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            Vector<GiangVien> vc = new Vector<>();
            String s = sc.nextLine();
            String a[] = s.trim().split("\\s+");
            String ans = "";
            for(int i=0; i<a.length; i++){
                ans = ans + String.valueOf(a[i].charAt(0)).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ans+":");
            for(GiangVien x : list){
                if(ans.equals(x.getManganh())) vc.add(x);
            }
            for(GiangVien x:vc){
                System.out.println(x);
            }
        }
    }
    
}
