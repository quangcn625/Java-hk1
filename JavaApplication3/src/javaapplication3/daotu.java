/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(String i : a){
                for(int k = i.length()-1; k>=0; k--){
                    System.out.print(i.charAt(k));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
