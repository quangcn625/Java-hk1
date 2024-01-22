/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class sapxepchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        System.out.print("Buoc 0: "+a[0]+"\n");
        for(int i=1; i<n; i++){
            System.out.print("Buoc " + i +": ");
            int res = a[i];
            int idx = i-1;
            while(idx >= 0 && a[idx] > res){
                a[idx+1] = a[idx];
                idx--;
            }
            a[idx+1] = res;
            for(int k=0; k<=i; k++){
                System.out.print(a[k]+" ");
            }
            System.out.println("");
        }
    }
}
