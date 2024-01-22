/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07035_BangDiemTheoMonHoc;

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
        ArrayList<SinhVien> list1 = new ArrayList<>();
        while(t1-->0){
            String ma = sc1.nextLine();
            String name = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();
            list1.add(new SinhVien(ma, name, lop, email));
        }
        
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<MonHoc> list2 = new ArrayList<>();
        while(t2-->0){
            String ma = sc2.nextLine();
            String name = sc2.nextLine();
            String sotinchi = sc2.nextLine();
            list2.add(new MonHoc(ma, name, sotinchi));
        }
        
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int t3 = Integer.parseInt(sc3.nextLine());
        ArrayList<BangDiem> list3 = new ArrayList<>();
        while(t3-->0){
            String maSV = sc3.next();
            String mamon = sc3.next();
            double diem = sc3.nextDouble();
            sc3.nextLine();
            list3.add(new BangDiem(maSV, mamon, diem, list2, list1));
        }
        Collections.sort(list3);
        int t4 = Integer.parseInt(sc3.nextLine());
        while(t4-->0){
            String tmp = sc3.next();
            for(MonHoc x : list2){
                if(tmp.equals(x.getMamon())){
                    System.out.println("BANG DIEM MON " + x.getTenmon() + ":");
                    break;
                }
            }
            for(BangDiem x : list3){
                if(x.getMamon().equals(tmp)){
                    System.out.println(x);
                }
            }
        }
    }
    
}
