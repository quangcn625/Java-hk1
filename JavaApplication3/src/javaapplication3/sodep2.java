/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class sodep2 {
    public static boolean check(String s){
        if(s.charAt(0)!='8' && s.charAt(s.length()-1)!='8') return false;
        long sum = 0;
        for(int i=0; i< s.length(); i++){
            sum = sum + (s.charAt(i)-'0');
        }
        if(sum % 10 != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
