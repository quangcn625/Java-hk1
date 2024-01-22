/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum1=0,sum2=0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum1 += a[i];
            }
            int res = -1;
            for(int i=1; i<n; i++){
                sum2 += a[i-1];
                if(sum2 == sum1 - sum2 - a[i]){
                    res = i + 1;
                    break;
                }
            }
            System.out.println(res);
            t--;
        }
    }
}
