/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class xaunhiphan {
    public static long nhiphan(long n,long k){
        long mid = (int) Math.pow(2, n-1);
        if(k == mid) return n;
	if(k<mid) return nhiphan(n-1,k);
	return nhiphan(n-1,k-mid);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextInt(),k = sc.nextInt();
            System.out.println((char)nhiphan(n,k)+64);
            t--;
        }
    }
}
