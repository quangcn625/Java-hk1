/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07049_TinhNgayHetHanBaoHanh;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t1 = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list1 = new ArrayList<>();
        while(t1-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int giaban = Integer.parseInt(sc.nextLine());
            int thoigianbaohanh = Integer.parseInt(sc.nextLine());
            list1.add(new SanPham(ma, name, giaban, thoigianbaohanh));
        }
        
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list2 = new ArrayList<>();
        while(t2-->0){
            String name = sc.nextLine();
            String dc = sc.nextLine();
            String ma = sc.nextLine();
            int soluongmua = Integer.parseInt(sc.nextLine());
            LocalDate ngaymua = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            list2.add(new KhachHang(name, dc, ma, soluongmua, ngaymua, list1));
        }
        Collections.sort(list2);
        for(KhachHang x : list2){
            System.out.println(x);
        }
    }
    
}
