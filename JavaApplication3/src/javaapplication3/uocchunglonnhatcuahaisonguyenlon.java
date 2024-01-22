/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
import java.math.BigInteger;

public class uocchunglonnhatcuahaisonguyenlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger bg1 = new BigInteger(sc.next());
            BigInteger bg2 = new BigInteger(sc.next());
            System.out.println(bg1.gcd(bg2));
        }
    }
}
