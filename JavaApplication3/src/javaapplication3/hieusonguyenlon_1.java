/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import static java.lang.Math.max;
import java.util.*;

public class hieusonguyenlon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            int len = max(s1.length(),s2.length());
            while(s1.length()<len){
                s1 = "0" + s1;
            }
            while(s2.length()<len){
                s2 = "0" + s2;
            }
            if(s1.compareTo(s2)<0){
                String x = s1;
                s1 = s2;
                s2 = x;
            }
            String ans1 = "";
            int res = 0;
            for(int i=len-1; i>=0; i--){
                int tmp = (s1.charAt(i) - '0')-(s2.charAt(i) - '0')-res;
                if(tmp < 0){
                    tmp += 10;
                    res = 1;
                }
                else{
                    res = 0;
                }
                ans1 += tmp;
            }
            String ans2 = "";
            for(int i=0; i<len-ans1.length(); i++){
                ans2 = ans2 + "0";
            }
            for(int i=ans1.length()-1; i>=0; i--){
                ans2 = ans2 + ans1.charAt(i);
            }
            System.out.println(ans2);
        }
    }
}
