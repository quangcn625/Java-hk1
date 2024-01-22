/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class soxacacch{
    public static boolean check(int[] a,int n){
        for(int i=1; i<n; i++){
            if(Math.abs(a[i]-a[i+1]) == 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int m=1; m<=t; m++){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=1; i<=n; i++) a[i] = i;
            while(true){
                if(check(a,n)){
                    for(int i=1; i<=n; i++){
                        System.out.print(a[i]);
                    }
                    System.out.println();
                }
                int i = n-1;
                while(a[i]>a[i+1] && i>0) i--;
                if(i==0) break;
                else{
                    int k = n;
                    while(a[i]>a[k] && k>0) k--;
                    int x = a[i];
                    a[i] = a[k];
                    a[k] = x;
                    int l=i+1;
                    int r=n;
                    while(l<r){
                        int y = a[l];
                        a[l] = a[r];
                        a[r] = y;
                        l++;
                        r--;
                    }
                }
            }
        }
    }
}
