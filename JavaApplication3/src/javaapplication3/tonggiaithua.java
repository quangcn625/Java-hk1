/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class tonggiaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=1; i<=n; i++){
            long tich = 1;
            for(int j=1; j<=i; j++)
            {
                tich = tich * j;
            }
            sum = sum + tich;
        }
        System.out.println(sum);
    }
}
