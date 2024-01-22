/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05066_TimKiemNhanVienTheoTen;

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
        int t = sc.nextInt();
        ArrayList<NhanVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new NhanVien(sc.next(), sc.nextLine()));
        }
        Collections.sort(list);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String tmp = sc.nextLine();
            for(NhanVien x : list){
                if(x.getNameNV().toLowerCase().contains(tmp.toLowerCase())){
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
    
}