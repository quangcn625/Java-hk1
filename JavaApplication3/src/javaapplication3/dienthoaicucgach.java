/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class dienthoaicucgach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            s = s.toUpperCase();
            int n = s.length();
            String tmp = "";
            String ans = "";
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'){
                    tmp = tmp + '2';
                }
                else if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
                    tmp = tmp + '3';
                }
                else if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'){
                    tmp = tmp + '4';
                }
                else if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'){
                    tmp = tmp + '5';
                }
                else if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'){
                    tmp = tmp + '6';
                }
                else if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'){
                    tmp = tmp + '7';
                }
                else if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V'){
                    tmp = tmp + '8';
                }
                else if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z'){
                    tmp = tmp + '9';
                }
            }
            for(int i=n-1; i>=0; i--){
                ans = ans + tmp.charAt(i);
            }
            if(ans.equals(tmp)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            //System.out.println(ans);
            t--;
        }
    }
}
