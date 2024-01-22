/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class matranxoanoctangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        Vector<Integer> ans = new Vector<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
                ans.add(a[i][j]);
            }
        }
        Collections.sort(ans);
        int cnt=1;
	int h1=0;
	int c1=0;
	int h2=n-1;
	int c2=n-1;
	while(cnt <= n*n)
	{
		for(int i=c1; i<=c2; i++)
		{
			a[h1][i] = ans.get(cnt-1);
			cnt++;
		}
		for(int i=h1+1; i<=h2; i++)
		{
			a[i][c2] = ans.get(cnt-1);
			cnt++;
		}
		for(int i=c2-1; i>=c1; i--)
		{
			a[h2][i] = ans.get(cnt-1);
			cnt++;
		}
		for(int i=h2-1; i>h1; i--)
		{
			a[i][c1] = ans.get(cnt-1);
			cnt++;
		}
		h1++;
		h2--;
		c1++;
		c2--;
	}
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
