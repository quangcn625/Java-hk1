/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class chuanhoaxauhoten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String a[] = s.trim().split("\\s+");
            String s1 = "";
            for(int i=0; i<a.length; i++){
                s1 = s1 + String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
                if(i < a.length - 1) s1 = s1 + " ";
            }
            System.out.println(s1);
        }
    }
}
