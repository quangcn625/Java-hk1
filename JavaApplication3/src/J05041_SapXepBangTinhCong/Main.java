/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05041_SapXepBangTinhCong;
import java.util.*;

class TinhCong implements Comparable<TinhCong>{
    static int cnt = 1;
    private String mnv;
    private String name;
    private int luongngay;
    private int songaycong;
    private String chucvu;

    public TinhCong() {
    }

    public TinhCong(String name, int luongngay, int songaycong, String chucvu) {
        this.mnv = String.format("NV%02d", cnt++);
        this.name = name;
        this.luongngay = luongngay;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
    }
    
    public long getTienluong(){
        return luongngay * songaycong;
    }
    
    public long getThuong(){
        if(songaycong >= 25) return (long) (getTienluong() * 0.2);
        if(songaycong >= 22) return (long) (getTienluong() * 0.1);
        return 0;
    }
    
    public long getPhuccap(){
        if(chucvu.equals("GD")) return 250000;
        if(chucvu.equals("PGD")) return 200000;
        if(chucvu.equals("TP")) return 180000;
        if(chucvu.equals("NV")) return 150000;
        return 0;
    }

    public long getThunhap(){
        return getTienluong()+getThuong()+getPhuccap();
    }
    
    @Override
    public String toString() {
        return mnv+" "+name+" "+getTienluong()+" "+getThuong()+" "+getPhuccap()+" "+getThunhap();
    }

    @Override
    public int compareTo(TinhCong o) {
        return Long.compare(o.getThunhap(),this.getThunhap());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TinhCong> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            int luongngay = Integer.parseInt(sc.nextLine());
            int songaycong = Integer.parseInt(sc.nextLine());
            String chucvu = sc.nextLine();
            list.add(new TinhCong(name,luongngay,songaycong,chucvu));
        }
        Collections.sort(list);
        for(TinhCong x : list){
            System.out.println(x);
        }
    } 
}
