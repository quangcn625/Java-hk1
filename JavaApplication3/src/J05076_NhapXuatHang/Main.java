/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05076_NhapXuatHang;

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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list1 = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String xeploai = sc.nextLine();
            list1.add(new MatHang(ma, name, xeploai));
        }
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<ThongKe> list2 = new ArrayList<>();
        while(q-->0){
            String mahang = sc.next();
            long soluongnhap = sc.nextInt();
            long dongia = sc.nextInt();
            long soluongxuat = sc.nextInt();
            sc.nextLine();
            list2.add(new ThongKe(mahang, soluongnhap, dongia, soluongxuat, list1));
        }
        for(ThongKe x : list2){
            System.out.println(x);
        }
    }  
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/
