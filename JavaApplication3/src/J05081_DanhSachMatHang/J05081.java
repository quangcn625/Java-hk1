/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05081_DanhSachMatHang;
import java.util.*;

class DanhSach implements Comparable<DanhSach>{
    static int cnt = 0;
    private String ma,name,donvi;
    private int giamua,giaban,loinhuan;

    public DanhSach() {
    }

    public DanhSach(String name, String donvi, int giamua, int giaban) {
        cnt++;
        this.ma = "MH";
        String a = String.valueOf(cnt);
        for(int i=0; i<3-a.length(); i++){
            this.ma = this.ma + "0";
        }
        this.ma = this.ma + a;
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
    }

    @Override
    public int compareTo(DanhSach o) {
        if(this.loinhuan != o.loinhuan) return o.loinhuan - this.loinhuan;
        return this.ma.compareTo(o.ma);
    }
    
}
public class J05081 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
        ArrayList<DanhSach> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new DanhSach(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
       Collections.sort(a);
       for(DanhSach i : a){
           System.out.println(i);
       }
    }
    
}
