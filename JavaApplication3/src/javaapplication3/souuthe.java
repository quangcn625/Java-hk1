/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class souuthe {
    static boolean check(String s){
        int cnt = s.length();
        int cntC = 0;
        int cntL = 0;
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) % 2 == 0){
                cntC++;
            }
            else{
                cntL++;
            }
        }
        if(cnt % 2 == 0){
            if(cntC <= cntL){
                return false;
            }
        }
        else{
            if(cntC >= cntL){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int flag = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(0) == '0' || !Character.isDigit(s.charAt(i))){
                    flag = 1;
                    System.out.println("INVALID");
                    break;
                }
            }
            if(flag == 1) continue;
            else if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
