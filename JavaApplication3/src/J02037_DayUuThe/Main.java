/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J02037_DayUuThe;

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
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            if(a.length % 2 == 0){ 
                int Chan = 0;
                int Le = 0;
                for(String x : a){
                    int tmp = Integer.parseInt(x);
                    if(tmp % 2 == 0) Chan++;
                    else Le++;
                }
                if(Chan > Le) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                int Chan = 0;
                int Le = 0;
                for(String x : a){
                    int tmp = Integer.parseInt(x);
                    if(tmp % 2 == 0) Chan++;
                    else Le++;
                }
                if(Chan < Le) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    
}
