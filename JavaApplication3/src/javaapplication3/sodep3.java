/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class sodep3 {
    public static boolean nto(int a){
        if(a < 2) return false;
        for(int i=2; i<=(int)Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    public static boolean check1(String s){
        for(int i=0; i<=(int)s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check2(String s){
        int n = s.length();
        for(int i=0; i<=(int)n/2; i++){
            if(nto(s.charAt(i)-'0') == false) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(check1(s) && check2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
