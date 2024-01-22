/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07019_HoaDon1;

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
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<SanPham> list1 = new ArrayList<>();
        while(t1-->0){
            String maloai = sc1.nextLine();
            String tenSP = sc1.nextLine();
            long loai1 = Long.parseLong(sc1.nextLine());
            long loai2 = Long.parseLong(sc1.nextLine());
            list1.add(new SanPham(maloai, tenSP, loai1, loai2));
        }
        
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> list2 = new ArrayList<>();
        while(t2-->0){
            String mahoadon = sc2.next();
            long soluongmua = sc2.nextLong();
            list2.add(new HoaDon(mahoadon, soluongmua, list1));
        }
        for(HoaDon x : list2){
            System.out.println(x);
        }
    }
    
}
