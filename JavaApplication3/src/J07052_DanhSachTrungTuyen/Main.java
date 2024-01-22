/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07052_DanhSachTrungTuyen;
import java.util.*;
import java.io.*;

class TuyenSinh implements Comparable<TuyenSinh>{
    private String ma, name;
    private double d1, d2, d3, tongdiem, uutien;

    public TuyenSinh(String ma, String name, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        String a = this.ma.substring(0, 3);
        switch (a) {
            case "KV1":
                this.uutien = 0.5;
                break;
            case "KV2":
                this.uutien = 1;
                break;
            case "KV3":
                this.uutien = 2.5;
                break;
            default:
                break;
        }
        this.tongdiem = d1 * 2 + d2 + d3 + this.uutien;
    }

    public double getTongdiem() {
        return tongdiem;
    }
    
    public String formatDouble(Double x){
        int tmp = (int) (x * 10);
        if(tmp % 10 == 0) return String.format("%.0f", x);
        else return String.format("%.1f", x);
    }
    
    public String formatName(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }

    @Override
    public String toString() {
        return ma+" "+formatName()+" "+formatDouble(uutien)+" "+formatDouble(tongdiem);
    }

    @Override
    public int compareTo(TuyenSinh o) {
        if(o.tongdiem == this.tongdiem) return this.ma.compareTo(o.ma);
        return Double.compare(o.tongdiem, this.tongdiem);
    }

}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<TuyenSinh> list = new ArrayList<>();
        while(t-->0){
           
            TuyenSinh x = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(x);
        }
        int n = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        List<TuyenSinh> arr1 = new ArrayList<>();
        List<TuyenSinh> arr2 = new ArrayList<>();
        List<TuyenSinh> arr3 = new ArrayList<>();
        for(TuyenSinh x : list){
            if(arr1.size() == n) break;
            else{
                arr1.add(x);
            }
        }
        double tmp1 = arr1.get(arr1.size()-1).getTongdiem();
        for(TuyenSinh x : list){
            if(x.getTongdiem() >= tmp1) arr2.add(x);
            else arr3.add(x);
        }
        System.out.println(String.format("%.1f", tmp1));
        for(TuyenSinh x : arr2){
            System.out.println(x + " TRUNG TUYEN");
        }
        for(TuyenSinh x : arr3){
            System.out.println(x + " TRUOT");
        }
    }
}
/*
5
KV2A002
Hoang THAnh tuan
5
6
5
KV3B123
 LY Thi   THU ha
8
6.5
7
KV1A002
Le gia   quang
5
6
8
KV2B123
 Nguyen truong     son
8
6.5
10
KV1A002
bui   truong son
5
6
8
*/

