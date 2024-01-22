/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class danhsachcanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(a[i][j] == 1 && i < j){
                    System.out.println("(" + i +","+ j + ")");
                }
            }
        }
    }
}
/*
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0
*/
