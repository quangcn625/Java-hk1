/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class J08021_DayNgoacDungDaiNhat {
    public static int Tinh(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int res = 0;
        st.push(-1);
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='(') st.add(i);
            else{
                st.pop();
                if(!st.isEmpty()){
                    int j = st.peek();
                    res = Math.max(res,i-j);
                }
                else if(st.isEmpty()) st.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            System.out.println(Tinh(s));
        }
    }
    
}
