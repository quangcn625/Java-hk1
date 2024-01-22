/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
import java.math.BigInteger;

public class chiahet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger bg1 = new BigInteger(sc.next());
            BigInteger bg2 = new BigInteger(sc.next());
            BigInteger tmp1 = bg1.mod(bg2);
            BigInteger tmp2 = bg2.mod(bg1);
            BigInteger x = new BigInteger("0");
            if(tmp1.equals(x) || tmp2.equals(x)){
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}
