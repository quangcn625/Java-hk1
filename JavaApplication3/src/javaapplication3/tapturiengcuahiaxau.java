/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class tapturiengcuahiaxau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String[] a = s1.split("\\s+");
            Set<String> se1 = new HashSet<>();
            for(String i : a){
                se1.add(i);
            }
            String s2 = sc.nextLine();
            String[] b = s2.split("\\s+");
            Set<String> se2 = new HashSet<>();
            for(String i : b){
                se2.add(i);
            }
            for(String i : se1){
                if(!se2.contains(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println("");
        }
    }
}
