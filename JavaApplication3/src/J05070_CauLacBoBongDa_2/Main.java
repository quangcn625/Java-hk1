/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05070_CauLacBoBongDa_2;
import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); 
        ArrayList<CLB> list1 = new ArrayList<>();
        while(t-->0){
            String maCLB = sc.nextLine();
            String nameCLB = sc.nextLine();
            long giave = Long.parseLong(sc.nextLine());
            list1.add(new CLB(maCLB, nameCLB, giave));
        }
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau>  list2 = new ArrayList<>();
        while(q-->0){
            String matrandau = sc.next();
            long socodongvien = sc.nextLong();
            sc.nextLine();
            list2.add(new TranDau(matrandau, socodongvien, list1));
        }
        Collections.sort(list2);
        for(TranDau tmp : list2)
            System.out.println(tmp);   
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
EMU2 60000
IAC1 80000
*/
