/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class JKT013_SoLocPhat {
    public static void solve(int n){
        Vector<String> vc = new Vector<>();
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        vc.add("6");
        vc.add("8");
        while(true){
            String x = q.peek();
            q.remove();
            if(x.length() == 15) break;
            vc.add(x+"6");
            vc.add(x+"8");
            q.add(x+"6");
            q.add(x+"8");
        }
        Vector<String> ans = new Vector<>();
        for(String x : vc){
            if(x.length()>n) break;
            else ans.add(x);
        }
        System.out.println(ans.size());
        for(int i=ans.size()-1; i>=0; i--){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            solve(n);
            System.out.println("");
        }
    }
}
