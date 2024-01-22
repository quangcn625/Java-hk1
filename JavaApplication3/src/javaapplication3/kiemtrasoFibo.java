/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class kiemtrasoFibo {
    public static void check(long n){
        long[] f;
        f = new long[100];
        f[0] = 0;
        f[1] = 1;
        int i = 2;
        int flag = 0;
        while(i<=92){
            f[i] = f[i-1] + f[i-2];
            i++;
        }
        for(int k=0; k<=92; k++)
        {
            if(f[k] == n){
                flag = 1;
                System.out.println("YES");
                break;
            }
        }
        if(flag == 0) System.out.println("NO");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            check(n);
            t--;
        }
    }
}
