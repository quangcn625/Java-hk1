/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> se = new HashSet<>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        int cnt = 0;
        int Max = a[n-1];
        for(int i=1; i<=Max; i++){
            if(!se.contains(i)){
                cnt++;
                System.out.println(i);
            }
        }
        if(cnt == 0){
            System.out.println("Excellent!");
        }
    }
}
