/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(x <= t){
            int n = sc.nextInt();
            System.out.print("Test " + x +": ");
            int cnt = 0;
            for(int k=2; k<=Math.sqrt(n);){
                if(n % k == 0){
                    System.out.print(k);
                    while(n % k == 0){
                        cnt++;
                        n = n / k;
                    }
                    System.out.print("(" + cnt + ")" +" ");
                    cnt = 0;
                }
                else k++;
            }
            if(n > 1) System.out.print(n + "(" + 1 + ")");
            System.out.printf("\n");
            x++;
        }   
    }
}
