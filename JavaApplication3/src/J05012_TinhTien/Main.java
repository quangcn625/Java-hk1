/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05012_TinhTien;

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
        List<MatHang> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            long soluong = Long.parseLong(sc.nextLine());
            long dongia = Long.parseLong(sc.nextLine());
            long tientrietkhau = Long.parseLong(sc.nextLine());
            list.add(new MatHang(ma, name, soluong, dongia, tientrietkhau));
        }
        Collections.sort(list);
        for(MatHang x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
*/