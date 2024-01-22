/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            Stack<Long> st = new Stack<>();
            for(int i=n-1; i>=0; i--){
                while(!st.isEmpty() && a[i]>=st.peek()) st.pop();
                if(st.isEmpty()) b[i] = -1;
                else b[i] = st.peek();
                st.push(a[i]);
            }
            for(int i=0; i<n; i++){
                System.out.print(b[i]+" ");
            }
            System.out.println("");
        }
    }
    
}
