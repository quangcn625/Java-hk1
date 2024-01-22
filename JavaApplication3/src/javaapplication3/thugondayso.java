/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        x = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        st.push(x);
        n--;
        while(n-->0){
            x = sc.nextInt();
            if(!st.empty() && (x + st.peek()) % 2 == 0) st.pop();
            else{
                st.push(x);
            }
        }
        System.out.println(st.size());
    }
}
