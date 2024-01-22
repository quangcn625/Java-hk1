/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J02035_QuayPhai;

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
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long F[] = new long[n];
            long ans = 0;
            for(int i=0; i<n; i++) a[i] = sc.nextLong();
            for(int i=0; i<n; i++){
                F[i] = 1;
                for(int j=0; j<i; j++){
                    if(a[j] < a[i]){
                        F[i] = Math.max(F[i], F[j]+1);
                    }
                }
                ans = Math.max(ans, F[i]);
            }
            System.out.println(n - ans);
        }
    }
    
}
