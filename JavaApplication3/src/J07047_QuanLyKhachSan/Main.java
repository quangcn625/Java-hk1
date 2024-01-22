/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07047_QuanLyKhachSan;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        int t1 = Integer.parseInt(sc.nextLine());
        ArrayList<LoaiPhong> list1 = new ArrayList<>();
        while(t1-->0){
            String KHphong = sc.next();
            String tenloaiphong = sc.next();
            int dongiangay = sc.nextInt();
            double dichvu = sc.nextDouble();
            sc.nextLine();
            list1.add(new LoaiPhong(KHphong, tenloaiphong, dongiangay, dichvu));
        }
        
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list2 = new ArrayList<>();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t2-->0){
            String nameKH = sc.nextLine();
            String maphong = sc.nextLine();
            String ngayden = sc.nextLine();
            String ngaydi = sc.nextLine();
            list2.add(new KhachHang(nameKH, maphong, ngayden, ngaydi, list1));
        }
        Collections.sort(list2);
        for(KhachHang x : list2){
            System.out.println(x);
        }
    }
    
}
