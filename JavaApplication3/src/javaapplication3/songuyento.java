/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.*;

public class songuyento {
    public static int check(long a){
        if(a < 2) return 0;
        for(int i=2; i<= Math.sqrt(a); i++)
        {
            if(a % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            if(check(n)==1){
                System.out.printf("YES\n");
            }
            else{
                System.out.printf("NO\n");
            }
            t--;
        }
    }
}
