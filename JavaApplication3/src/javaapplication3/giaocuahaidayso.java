/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class giaocuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a;
        a = new int[n];
        int[] b;
        b = new int[m];
        int[] cntA = new int[1005];
        int[] cntB = new int[1005];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            cntA[a[i]] = 1;
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
            cntB[b[i]] = 1;
        }
        for(int i=1; i<=1000; i++){
            if(cntA[i] == 1 && cntB[i] == 1) System.out.print(i+" ");
        }
        System.out.printf("\n");
    }
}