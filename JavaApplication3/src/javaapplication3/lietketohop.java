
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
public class lietketohop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k+1];
        for(int i=1; i<=k; i++) a[i] = i;
        int cnt=0;
        while(true){
            for(int i=1; i<=k; i++){
                System.out.print(a[i] +" ");
            }
            cnt++;
            int i=k;
            while(a[i] == n-k+i && i>0) i--;
            if(i == 0) break;
            else{
                a[i]++;
                for(int j=i+1; j<=k; j++){
                    a[j] = a[j-1] + 1;
                }
            }
            System.out.println("");
        }
        System.out.print("\nTong cong co "+cnt+" to hop");
    }
}
