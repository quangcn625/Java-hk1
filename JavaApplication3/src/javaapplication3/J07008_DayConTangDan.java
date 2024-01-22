/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
public class J07008_DayConTangDan {

    /**
     */
    public static List<String> list = new ArrayList<>();
    public static int a[] = new int[100];
    public static int n;
    public static String res = "";
    
    public static void solve(int i){
        if(i >= n) return;
        for(int j=i+1; j<=n; j++){
            if(a[j] < a[i]) continue;
            String ans = res;
            res = res + a[j] +" ";
            if(res.split("\\s+").length > 1) list.add(res);
            solve(j);
            res = ans;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i=1; i<=n; i++) a[i] = sc.nextInt();
        solve(0);
        Collections.sort(list);
        for(String i : list){
            System.out.println(i);
        }
    }
    
}
