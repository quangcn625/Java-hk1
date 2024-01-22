/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class J08024_So0vaSo9 {
    public static long solve(int n){
        long a[] = new long[105];
        Queue<String> q = new LinkedList<>();
        Vector<Long> vc = new Vector<>();
        vc.add((long)9);
        q.add("9");
        while(true){
            String x = q.element();
            q.remove();
            if(x.length() == 10) break;
            vc.add(Long.parseLong(x + "0"));
            vc.add(Long.parseLong(x + "9"));
            q.add(x+"0");
            q.add(x+"9");
        }
        for(int i=1; i<=100; i++){
            for(long x : vc){
                if(x % i == 0){
                    a[i] = x;
                    break;
                }
            }
        }
        return a[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
        
    }
    
}
