/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> list1 = new ArrayList<>();
        int t1 = Integer.parseInt(sc.nextLine());
        while(t1-->0){
            String nameKH = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String dc = sc.nextLine();
            list1.add(new KhachHang(nameKH, gender, dob, dc));
        }
        
        ArrayList<MatHang> list2 = new ArrayList<>();
        int t2 = Integer.parseInt(sc.nextLine());
        while(t2-->0){
            String nameMH = sc.nextLine();
            String donvitinh = sc.nextLine();
            long giamua = Long.parseLong(sc.nextLine());
            long giaban = Long.parseLong(sc.nextLine());
            list2.add(new MatHang(nameMH, donvitinh, giamua, giaban));
        }
        
        ArrayList<HoaDon> list3 = new ArrayList<>();
        int t3 = Integer.parseInt(sc.nextLine());
        while(t3-->0){
            String khachhang = sc.next();
            String mathang = sc.next();
            long soluong = sc.nextLong();
            list3.add(new HoaDon(khachhang, mathang, soluong, list1, list2));
        }
        Collections.sort(list3);
        for(HoaDon x : list3){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/

