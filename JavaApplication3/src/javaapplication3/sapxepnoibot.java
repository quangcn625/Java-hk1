/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        int check;
	for(int i=0; i<n-1; i++)
	{
            check=0;
            for(int j=0; j<n-i-1; j++)
            {
		if(a[j+1]<a[j]) 
		{
                    check=1;
                    int x = a[j+1];
                    a[j+1] = a[j];
                    a[j] = x;
		}
            }
            if(check==1) 
            {
		System.out.print("Buoc "+(i+1)+": ");
                for(int k=0; k<n; k++) {
                    System.out.print(a[k]+" ");
                }
                System.out.println("");
            }
	}
    }
}
