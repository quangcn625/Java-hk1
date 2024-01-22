/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05072_TinhCuocDienThoaiCoDinh_2;

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
        ArrayList<Phone> list1 = new ArrayList<>();
        ArrayList<CuocGoi> list2 = new ArrayList<>();
        while(t-->0){
            String mavung = sc.nextLine();
            String tentinh = sc.nextLine();
            int giacuoc = Integer.parseInt(sc.nextLine());
            list1.add(new Phone(mavung, tentinh, giacuoc));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String sogoiden = sc.next();
            String giobatdau = sc.next();
            String gioketthuc = sc.next();
            sc.nextLine();
            list2.add(new CuocGoi(sogoiden, giobatdau, gioketthuc, list1));
        }
        Collections.sort(list2);
        for(CuocGoi x : list2){
            System.out.println(x);
        }
    }
    
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
*/
