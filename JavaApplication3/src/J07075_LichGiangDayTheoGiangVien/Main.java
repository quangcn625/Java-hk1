/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07075_LichGiangDayTheoGiangVien;

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
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("E:\\MONHOC.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> list1 = new ArrayList<>();
        while(t1-->0){
            String maMH = sc1.nextLine();
            String nameMH = sc1.nextLine();
            int sotienchi = Integer.parseInt(sc1.nextLine());
            list1.add(new MonHoc(maMH, nameMH, sotienchi));
        }
        
        Scanner sc2 = new Scanner(new File("E:\\LICHGD.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> list2 = new ArrayList<>();
        while(t2-->0){
            String maMH = sc2.nextLine();
            int thu = Integer.parseInt(sc2.nextLine());
            int kip = Integer.parseInt(sc2.nextLine());
            String name = sc2.nextLine();
            String phonghoc = sc2.nextLine();
            list2.add(new GiangVien(maMH, thu, kip, name, phonghoc, list1));
        }
        Collections.sort(list2);
        String tmp = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tmp + ":");
        for(GiangVien x : list2){
            if(tmp.contains(x.getName())){
                System.out.println(x);
            }
        }
    }
    
}
