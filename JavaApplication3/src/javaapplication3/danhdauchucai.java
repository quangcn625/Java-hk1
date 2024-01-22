/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> se = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
}
