/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05065_LietKeNhanVienTheoNhom;

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
        while(q-->0){
            String tmp = sc.next();
            for(NhanVien x : list){
                if(x.getChucvu().contains(tmp)){
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
    
}
/*
12

GD08001 Nguyen Kim Loan

TP05002 Hoang Thanh Tuan

TP05001 Tran Binh Nguyen

PP06002 Phan Trung Tuan

PP06001 Tran Quoc Huy

NV04003 Vo Van Lan

GD08001 Nguyen Kim Loan

TP05002 Hoang Thanh Tuan

TP05001 Tran Binh Nguyen

PP06002 Phan Trung Tuan

PP06001 Tran Quoc Huy

NV04003 Vo Van Lan

3

TP

PP

NV
*/
