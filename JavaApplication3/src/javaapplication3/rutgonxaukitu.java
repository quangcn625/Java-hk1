/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(true){
            int ok = 0;
            for(int i=1; i<s.length(); i++){
                if(s.charAt(i) == s.charAt(i-1)){
                    ok = 1;
                    s = s.substring(0, i-1) + s.substring(i+1);
                    break;
                }
            }
            if(ok == 0){
                break;
            }
        }
        if(s.length()==0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
