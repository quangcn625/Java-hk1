/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05058_SapXepKetQuaTuyenSinh;
import java.util.*;

class TuyenSinh implements Comparable<TuyenSinh>{

    private String ma, name, trangthai;
    private double d1, d2, d3, tongdiem, uutien;

    public TuyenSinh() {
    }

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
        if (this.tongdiem>= 24) {
            this.trangthai = "TRUNG TUYEN";
        }
        else {
            this.trangthai = "TRUOT";
        }
    }
    
    public String formatDouble(Double x){
        int tmp = (int) (x * 10);
        if(tmp % 10 == 0) return String.format("%.0f", x);
        else return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+formatDouble(uutien)+" "+formatDouble(tongdiem)+" "+trangthai;
    }

    @Override
    public int compareTo(TuyenSinh o) {
        if(this.tongdiem != o.tongdiem) return Double.compare(o.tongdiem,this.tongdiem);
        return this.ma.compareTo(o.ma);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TuyenSinh> list = new ArrayList<>();
        while(t-->0){
            TuyenSinh x = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(x);
        }
        Collections.sort(list);
        for(TuyenSinh x : list){
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
