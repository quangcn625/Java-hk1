/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J02024_DayConCoTongLe;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    static int n;
    static int a[];
    static boolean ok;
    
    static void sinh(){
        int i = n;
        while(a[i] == 1 && i > 0) i--;
        if(i == 0){
            ok = true;
            return;
        }
        else{
            a[i]++;
            for(int j=i+1; j<=n; j++) a[j] = 0;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            int dayso[] = new int[n+1];
            for(int i=1; i<=n; i++) dayso[i] = sc.nextInt();
            Arrays.sort(dayso);
            a = new int[n+1];
            for(int i=1; i<=n; i++) a[i] = 0;
            ok = false;
            while(ok == false){
                int sum = 0;
                for(int i=1; i<=n; i++){
                    if(a[i] == 1){
                        sum += dayso[n-i+1];
                    }
                }
                if(sum % 2 != 0){
                    for(int i=1; i<=n; i++){
                        if(a[i] == 1){
                            System.out.print(dayso[n-i+1] + " ");
                        }
                    }
                    System.out.println();
                }
                sinh();
            }
        }
    }
    
}
