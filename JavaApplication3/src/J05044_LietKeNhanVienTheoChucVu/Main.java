/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05044_LietKeNhanVienTheoChucVu;
import java.util.*;

class NhanVien{
    static int cnt = 1;
    private String mnv;
    private String name;
    private String chucvu;
    private long luongcoban;
    private long songaycong;

    public NhanVien() {
    }

    public NhanVien(String name, String chucvu, long luongcoban, long songaycong) {
        this.mnv = String.format("NV%02d",cnt++);
        this.name = name;
        this.chucvu = chucvu;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
    }
    
    public long getPhuccap(){
        if(chucvu.equals("GD")) return 500;
        if(chucvu.equals("PGD")) return 400;
        if(chucvu.equals("TP")) return 300;
        if(chucvu.equals("KT")) return 250;
        return 100;
    }
    
    public long getLuongchinh(){
        return luongcoban * songaycong;
    }
    
    public long getTamung(){
        if((getPhuccap() + getLuongchinh()) * 2/3 < 25000){
            return Math.round((getPhuccap()+getLuongchinh())*2/3.0/1000)*1000;
        }
        return 25000;
    }
    
    public long getConlai(){
        return getLuongchinh() + getPhuccap() - getTamung();
    }

    public String getChucvu() {
        return chucvu;
    }

    @Override
    public String toString() {
        return mnv+" "+name+" "+getPhuccap()+" "+getLuongchinh()+" "+getTamung()+" "+getConlai();
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String chucvu = sc.nextLine();
            long luongcoban = Long.parseLong(sc.nextLine());
            long songaycong = Long.parseLong(sc.nextLine());
            list.add(new NhanVien(name,chucvu,luongcoban,songaycong));
        }
        String s = sc.nextLine();
        for(NhanVien x : list){
            if(x.getChucvu().equals(s)) System.out.println(x);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
TP
*/