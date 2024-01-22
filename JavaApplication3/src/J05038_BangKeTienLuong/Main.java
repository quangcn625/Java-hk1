/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05038_BangKeTienLuong;
import java.util.*;

class TienLuong{
    static int cnt = 1;
    private String mnv;
    private String name;
    private long luongngay,luongthang,thuong,phucap,thuclinh;
    private int songaycong;
    private String chucvu;

    public TienLuong() {
    }

    public TienLuong(String name, long luongngay, int songaycong, String chucvu) {
        this.mnv = String.format("NV%02d",cnt++);
        this.name = name;
        this.luongngay = luongngay;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
    }
    
    public long getLuongthang(){
        return luongngay * songaycong;
    }
    
    public long getThuong(){
        if(this.songaycong >= 25) return (long) (getLuongthang() * 0.2);
        if(this.songaycong >= 22) return (long) (getLuongthang() * 0.1);
        return 0;
    }
    
    public long getPhuccap(){
        if(chucvu.equals("GD")) return 250000;
        if(chucvu.equals("PGD")) return 200000;
        if(chucvu.equals("TP")) return 180000;
        if(chucvu.equals("NV")) return 150000;
        return 0;
    }
    
    public long getThuclinh(){
        return (getLuongthang()+ getThuong()+getPhuccap());
    }

    @Override
    public String toString() {
        return mnv+" "+name+" "+getLuongthang()+" "+getThuong()+" "+getPhuccap()+" "+getThuclinh();
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TienLuong> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            long ngayluong = Long.parseLong(sc.nextLine());
            int songaycong = Integer.parseInt(sc.nextLine());
            String chucvu = sc.nextLine();
            list.add(new TienLuong(name,ngayluong,songaycong,chucvu));
        }
        long sum = 0;
        for(TienLuong x : list){
            sum = sum + x.getThuclinh();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/
