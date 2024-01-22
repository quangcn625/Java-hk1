/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WIN
 */
import java.util.*;

public class J02028_DayConLienTiepCoTongBangK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            int check = 0;
//            long sum = 0;
            for(int i=0; i<n-1; i++){
                long sum = a[i];
                for(int j=i+1; j<n;){
                    if(sum < k) {
                        sum = sum + a[j];
                        j++;
                    }
                    else if(sum == k){
                        check = 1;
                        break;
                    }
                    else if(sum > k) break;
                }
                if(check == 1) break;
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
