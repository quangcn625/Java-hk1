/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07027_QuanLyBaiTapNhom;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        int t3 = t1;
        ArrayList<SinhVien> list1 = new ArrayList<>();
        while(t1-->0){
            String masv = sc1.nextLine();
            String name = sc1.nextLine();
            String sdt = sc1.nextLine();
            list1.add(new SinhVien(masv, name, sdt));
        }
        
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<BaiTap> list2 = new ArrayList<>();
        while(t2-->0){
            String tenBT = sc2.nextLine();
            list2.add(new BaiTap(tenBT));
        }
        
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        ArrayList<Nhom> list3 = new ArrayList<>();
        while(t3-->0){
            String masv = sc3.next();
            String ttnhom = sc3.next();
            list3.add(new Nhom(masv, ttnhom, list1, list2));
        }
        Collections.sort(list3);
        for(Nhom x : list3){
            System.out.println(x);
        }
    }
}
/*
5
B17DTCN001
Nguyen Chi  Linh
0987345543
B17DTCN011
Vu Viet Thang
0981234567
B17DTCN023
Pham Trong Thang
0992123456
B17DTCN022
Nguyen Van  Quyet
0977865432
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
B17DTCN001 1
B17DTCN011 1
B17DTCN023 1
B17DTCN022 2
B17DTCN031 2
*/
