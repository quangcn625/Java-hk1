/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05077_TinhLuong;

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
        ArrayList<PhongBan> lst1 = new ArrayList<>();
        ArrayList<NhanVien> lst2 = new ArrayList<>();
        while(t-->0){
            String maphong = sc.next();
            String tenphong = sc.nextLine();
            lst1.add(new PhongBan(maphong, tenphong));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){            
            lst2.add(new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), lst1));
        }
        for(NhanVien x : lst2){
            System.out.println(x);
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
*/
