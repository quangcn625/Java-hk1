/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++) a[i][j] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            int tmp1 = 0;
            int tmp2 = 0;
            for(int j=0; j<3; j++){
                if(a[i][j]==1) tmp1++;
                else tmp2++;
            }
            if(tmp1 > tmp2) cnt++;
        }
        System.out.println(cnt);
    }
}
