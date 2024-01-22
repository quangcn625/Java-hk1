/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyBanHang;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list1 = new ArrayList<>();
        while(t1-->0){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String dc = sc.nextLine();
            String maMH = sc.nextLine();
            list1.add(new NhanVien(name, sex, dob, dc, maMH));
        }
        
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list2 = new ArrayList<>();
        while(t2-->0){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String dc = sc.nextLine();
            list2.add(new KhachHang(name, sex, dob, dc));
        }
        
        int t3 = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list3 = new ArrayList<>();
        while(t3-->0){
            String name = sc.nextLine();
            String donvitinh = sc.nextLine();
            long giamua = Long.parseLong(sc.nextLine());
            long giaban = Long.parseLong(sc.nextLine());
            list3.add(new MatHang(name, donvitinh, giamua, giaban, list1));
        }
        
        int t4 = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> list4 = new ArrayList<>();
        while(t4-->0){
            String maKH = sc.next();
            String maMH = sc.next();
            long soluong = sc.nextLong();
            sc.nextLine();
            list4.add(new HoaDon(maKH, maMH, soluong, list2, list3));
        }
        for(HoaDon x : list4){
            System.out.println(x);
        }
    }
    
}

