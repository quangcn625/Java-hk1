/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int cnt = 0;
            int l = 0;
            int r = s.length() - 1;
            while(l <= r){
                if(s.charAt(l) != s.charAt(r)) cnt++;
                l++;
                r--;
            }
            if(cnt > 1){
                System.out.println("NO");
            }
            else {
                if(s.length() % 2 == 0){
                    if(cnt==1) System.out.println("YES");
                    else System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }
    }
}
