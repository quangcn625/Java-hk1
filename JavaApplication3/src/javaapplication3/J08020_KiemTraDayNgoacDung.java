/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class J08020_KiemTraDayNgoacDung {
    public static boolean check(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                st.add(s.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                char in = st.peek();
                char out = s.charAt(i);
                if(in == '(' && out == ')') st.pop();
                else if(in == '[' && out == ']') st.pop();
		else if(in == '{' && out == '}') st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
