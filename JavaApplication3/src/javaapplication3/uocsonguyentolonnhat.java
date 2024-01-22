/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            long flag = 0;
            for(int i=2; i<=Math.sqrt(n); i++){
                while(n%i==0)
                {
                    flag = i;
                    n = n / i;
                }
            }
            if(n != 1) flag = n;
            System.out.println(flag);
            t--;
        }
    }
}
