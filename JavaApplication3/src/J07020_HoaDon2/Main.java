/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07020_HoaDon2;

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
        Scanner sc1 = new Scanner(new File("KH.in"));
        ArrayList<KhachHang> list1 = new ArrayList<>();
        int t1 = Integer.parseInt(sc1.nextLine());
        while(t1-->0){
            String nameKH = sc1.nextLine();
            String gender = sc1.nextLine();
            String dob = sc1.nextLine();
            String dc = sc1.nextLine();
            list1.add(new KhachHang(nameKH, gender, dob, dc));
        }
        
        Scanner sc2 = new Scanner(new File("MH.in"));
        ArrayList<MatHang> list2 = new ArrayList<>();
        int t2 = Integer.parseInt(sc2.nextLine());
        while(t2-->0){
            String nameMH = sc2.nextLine();
            String donvitinh = sc2.nextLine();
            long giamua = Long.parseLong(sc2.nextLine());
            long giaban = Long.parseLong(sc2.nextLine());
            list2.add(new MatHang(nameMH, donvitinh, giamua, giaban));
        }
        
        Scanner sc3 = new Scanner(new File("HD.in"));
        ArrayList<HoaDon> list3 = new ArrayList<>();
        int t3 = Integer.parseInt(sc3.nextLine());
        while(t3-->0){
            String khachhang = sc3.next();
            String mathang = sc3.next();
            long soluong = sc3.nextLong();
            //sc3.nextLine();
            list3.add(new HoaDon(khachhang, mathang, soluong, list1, list2));
        }
        for(HoaDon x : list3){
            System.out.println(x);
        }
    }
}
