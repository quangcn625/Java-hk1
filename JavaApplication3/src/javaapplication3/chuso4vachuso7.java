/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while(n > 0){
            int x = (int) (n % 10);
            if(x == 4 || x == 7) cnt++;
            n = n / 10;
        }
        if(cnt == 4 || cnt == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
