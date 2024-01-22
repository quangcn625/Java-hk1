/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05014_TuyenGiaoVien;

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
        List<GiaoVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String maXT = sc.next();
            double diemTH = sc.nextDouble();
            double diemCC = sc.nextDouble();
            sc.nextLine();
            list.add(new GiaoVien(name, maXT, diemTH, diemCC));
        }
        Collections.sort(list);
        for(GiaoVien x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
*/
//GV03 Hoang Thi Tam HOA 21.5 TRUNG TUYEN

//GV03 Hoang Thi Tam HOA 21.5 TRUNG TUYEN