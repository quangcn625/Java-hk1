/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class mangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            long[] a;
            a = new long[n];
            for(int i=0; i<n; i++) a[i] = sc.nextLong();
            int flag = 1;
            for(int i=0; i<(int)n/2; i++){
                if(a[i] != a[n-i-1])
                {
                    flag = 0;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag == 1) System.out.println("YES");
            t--;
        }
    }
}
