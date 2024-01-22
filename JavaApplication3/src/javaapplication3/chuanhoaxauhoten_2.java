/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class chuanhoaxauhoten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String a[] = s.trim().split("\\s+");
            String s1 = a[0].toUpperCase();
            String s2 = "";
            for(int i=1; i<a.length; i++){
                s2 = s2 + String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
                if(i < a.length - 1) s2 = s2 +" ";
            }
            System.out.print(s2 + ", " + s1);
            System.out.println("");
        }
    }
}
