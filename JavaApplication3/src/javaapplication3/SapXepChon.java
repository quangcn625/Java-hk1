/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author WIN
 */
public class SapXepChon {
public static void swap(int x,int y){
        int z = x;
        x = y;
        y = z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            System.out.print("Buoc "+ (i+1)+": ");
            int idx_min = i;
            for(int j=i+1; j<n; j++){
                if(a[idx_min]>a[j]){
                    idx_min = j;
                }
            }
            if(i != idx_min){
                int x = a[idx_min];
                a[idx_min] = a[i];
                a[i] = x;
            }
            for(int k=0; k<n; k++){
                System.out.print(a[k]+" ");
            }
            System.out.println("");
        }
    }
}
