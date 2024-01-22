/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class tichmatranchuyenvicuano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(x<=t){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    b[i][j] = a[j][i];
                }
            }
            for(int i=0; i<n; i++)
            {
		for(int j=0; j<n; j++)
		{
                    int tmp=0;
                    for(int k=0; k<m; k++)
                    {
			tmp = tmp + a[i][k] * b[k][j];
                    }
                    c[i][j] = tmp;
		}
            }
            System.out.print("Test " + x +":\n");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
            x++;
        }   
    }
}

