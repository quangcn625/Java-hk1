/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05073_TinhToanGiaBan;

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
        ArrayList<Store> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.next();
            long dongia = sc.nextLong();
            long soluong = sc.nextLong();
            sc.nextLine();
            arr.add(new Store(ma, dongia, soluong));
        }
        for(Store x : arr){
            System.out.println(x);
        }
    }
    
}
/*
2
TTVC 400 300
CCAK 200 200
*/
