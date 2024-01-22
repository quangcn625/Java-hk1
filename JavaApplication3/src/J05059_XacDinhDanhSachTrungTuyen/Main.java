/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05059_XacDinhDanhSachTrungTuyen;

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
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        List<SinhVien> list1 = new ArrayList<>();
        List<SinhVien> list2 = new ArrayList<>();
        List<SinhVien> list3 = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            Double DToan = Double.valueOf(sc.nextLine());
            Double DLy = Double.valueOf(sc.nextLine());
            Double DHoa = Double.valueOf(sc.nextLine());
            list1.add(new SinhVien(ma, name, DToan, DLy, DHoa));
        }
        Collections.sort(list1);
        int q = Integer.parseInt(sc.nextLine());
        for(SinhVien x : list1){
            if(cnt < q){
                list2.add(x);
                cnt++;
            }
            else break;
        }
        double tmp = list2.get(list2.size()-1).getTongdiem();
        System.out.println(tmp);
        for(SinhVien x : list1){
            if(x.getTongdiem() >= tmp){
                System.out.println(x + " TRUNG TUYEN");
            }
            else{
                System.out.println(x + " TRUOT");
            }
        }
       
    }
    
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV3B123
Ly Thi Thu Ha
8
6.5
7
1
*/
