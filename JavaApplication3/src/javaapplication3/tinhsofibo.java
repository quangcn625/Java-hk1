/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.*;

public class tinhsofibo {
    public static long Fibo(int n){
       long[] f;
       f = new long[100];
       f[0] = 0;
       f[1] = 1;
       int i = 2;
       while(i <= 92){
           f[i] = f[i-1] + f[i-2];
           i++;
       }
       return f[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            System.out.printf("%d\n",Fibo(n));
            t--;
        }
    }
}
