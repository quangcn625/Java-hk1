/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J06004_QuanLyBaiTapNhom_2;

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
        List<SinhVien> list1 = new ArrayList<>();
        List<BTL> list2 = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            int nhom = Integer.parseInt(sc.nextLine());
            list1.add(new SinhVien(ma, name, sdt, nhom));
        }
        while(m-->0){
            String tennhom = sc.nextLine();
            list2.add(new BTL(tennhom));
        }
        Collections.sort(list1);
        for(SinhVien x : list1){
            System.out.print(x);
            System.out.println(list2.get(x.getNhom()-1));
        }
    }   
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/

