/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class tinhluythua {
    static int M = (int) (1e9+7);
    static long powMod(long n,long k){
        if(k==0) return 1;
        long x = powMod(n,k/2);
        if(k%2==0) return x*x%M;
        return n*(x*x%M)%M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int cnt = 0;
        while(flag == 0){
            long n = sc.nextInt();
            long m = sc.nextLong();
            cnt++;
            if(cnt > 20){
                flag = 1;
                continue;
            }
            if(n == 0 && m == 0){
                flag = 1;
                continue;
            }
            System.out.println(powMod(n,m));
        }
    }
}
