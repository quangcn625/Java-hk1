/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP14;

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
        List<PhongBan> list1 = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String maphong = sc.next();
            String tenphong = sc.nextLine();
            list1.add(new PhongBan(maphong, tenphong));
        }
        int k = Integer.parseInt(sc.nextLine());
        List<NhanVien> list2 = new ArrayList<>();
        while(k-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            long luongcoban = Long.parseLong(sc.nextLine());
            long songaycong = Long.parseLong(sc.nextLine());
            list2.add(new NhanVien(ma, name, luongcoban, songaycong));
        }
        String tmp = sc.nextLine();
        String ans = "";
        for(PhongBan x : list1){
            if(x.getMaphong().equals(tmp)) ans = x.getTenphong();
        }
        System.out.println("Bang luong phong" + ans +":");
        for(NhanVien x : list2){
            if(x.getMaphongban().equals(tmp)){
                System.out.println(x);
            }
        }
    }
    
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
*/
