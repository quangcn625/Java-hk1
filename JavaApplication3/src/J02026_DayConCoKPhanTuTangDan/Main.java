/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J02026_DayConCoKPhanTuTangDan;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    static int n, k;
    static int a[];
    static int b[];
    static boolean ok;

    static void sinh() {
        int i = k;
        while (a[i] == n - k + i && i > 0) i--;
        if (i == 0) {
            ok = true;
            return;
        } 
        else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) a[j] = a[j-1] + 1;
        }
    }
    
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n+1];
            b = new int[n+1];
            for(int i=1; i<=n; i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            for(int i=1; i<=k; i++) a[i] = i;
            ok = false;
            while(ok == false){
                for(int i=1; i<=k; i++){
                    System.out.print(b[a[i]] + " ");
                }
                System.out.println();
                sinh();
            }
        }
    }
    
}
