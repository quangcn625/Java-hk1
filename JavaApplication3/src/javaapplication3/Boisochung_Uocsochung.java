/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class Boisochung_Uocsochung {
    public static long USC(long a,long b){
        if(b==0) return a;
        return USC(b,a%b);
    }
    public static long BSC(long a,long b){
        return a*b/USC(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            System.out.print(BSC(n,m) + " " + USC(n,m));
            System.out.printf("\n");
            t--;
        }
    }
}
