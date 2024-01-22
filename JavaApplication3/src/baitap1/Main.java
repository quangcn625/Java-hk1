/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1;

/**
 *
 * @author WIN
 */
import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param x
     * @return 
     */
    public static boolean checkTN(int x){
        String s = String.valueOf(x);
        for(int i=0; i<= s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    
    public static boolean check(int n){
        String s = String.valueOf(n);
        for(int i=0; i<s.length()/2; i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0) return false;
        }
        if((s.length()) % 2 == 0 || (s.length()) < 2) return false;
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(sc.next());
        }
        Collections.sort(list, (String a, String b) ->{
            if(a.length() == b.length()) return a.compareTo(b);
            return Integer.compare(b.length(), a.length());
        });
        for(String i : list){
            System.out.println(i);
        }
    }
    
}
