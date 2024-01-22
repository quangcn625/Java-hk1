/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class sokhonglienke {
    public static boolean check1(long a){
        long sum = 0;
        while(a > 0){
            sum = sum + (int) (a % 10);
            a = a / 10;
        }
        return sum % 10 == 0;
    }
    public static boolean check2(long a){
        while(a > 0){
            int x = (int) (a % 10);
            a = a / 10;
            int y = (int) (a % 10);
            a = a / 10;
            if(Math.abs(x-y) != 2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            if(check1(n) && check2(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
