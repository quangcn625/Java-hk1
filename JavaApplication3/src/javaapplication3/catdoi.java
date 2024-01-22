/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class catdoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            long res = 0;
            int flag = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                    res = res * 10;
                }
                else if(s.charAt(i) == '1'){
                    res = res * 10 + 1;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            if(flag == 0 && res != 0){
                System.out.println(res);
            }
            else if(flag == 1){
                System.out.println("INVALID");
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
