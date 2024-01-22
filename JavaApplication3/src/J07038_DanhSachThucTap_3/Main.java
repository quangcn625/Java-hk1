/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07038_DanhSachThucTap_3;

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
        int t = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> list1 = new ArrayList<>();
        while(t-->0){
            String msv = sc1.nextLine();
            String name = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();
            list1.add(new SinhVien(msv, name, lop, email));
        }
        
        Scanner sc2 = new Scanner(new File("DN.in"));
        t = Integer.parseInt(sc2.nextLine());
        ArrayList<DN> list2 = new ArrayList<>();
        while(t-->0){
            String madn = sc2.nextLine();
            String namedn = sc2.nextLine();
            int soSV = Integer.parseInt(sc2.nextLine());
            list2.add(new DN(madn, namedn, soSV));
        }
        
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        t = Integer.parseInt(sc3.nextLine());
        ArrayList<ThucTap> list3 = new ArrayList<>();
        while(t-->0){
            String masv = sc3.next();
            String madn = sc3.next();
            sc3.nextLine();
            list3.add(new ThucTap(masv, madn, list1, list2));
        }
        Collections.sort(list3);
        t = Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s = sc3.nextLine();
            int soSVnhan = 1;
            for(DN x : list2){
                if(x.getMaDN().equals(s)){
                    soSVnhan = x.getSoSV();
                    System.out.println("DANH SACH THUC TAP TAI " + x.getNameDN() + ":");
                    break;
                }
            }
            for(ThucTap x : list3){
                if(x.getMadn().equals(s) && soSVnhan > 0){
                    System.out.println(x);
                    soSVnhan--;
                }
            }
        }
    }
    
}
