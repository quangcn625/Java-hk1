/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP8;

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
        ArrayList<CLB> list1 = new ArrayList<>();
        while(t-->0){
            String maCLB = sc.nextLine();
            String name = sc.nextLine();
            int giave = Integer.parseInt(sc.nextLine());
            list1.add(new CLB(maCLB, name, giave));
        }
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau> list2 = new ArrayList<>();
        while(t-->0){
            list2.add(new TranDau(sc.next(), sc.nextLong(),list1));
        }
        Collections.sort(list2);
        for(TranDau x : list2){
            System.out.println(x);
        }
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
IAC1 80000
EMU2 60000
*/

