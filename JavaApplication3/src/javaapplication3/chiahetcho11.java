/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
import java.math.BigInteger;
public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger bg1 = new BigInteger(sc.next());
            BigInteger bg2 = new BigInteger("11");
            BigInteger tmp1 = bg1.mod(bg2);
            BigInteger tmp2 = new BigInteger("0");
            if(tmp1.equals(tmp2)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
