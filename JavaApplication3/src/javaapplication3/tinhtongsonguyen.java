/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WIN
 */
import java.util.*;

public class tinhtongsonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(i <= t){
            long n = sc.nextInt();
            long sum = n*(n+1)/2;
            System.out.print(sum);
            System.out.print("\n");
            i++;
        }
    }
}
