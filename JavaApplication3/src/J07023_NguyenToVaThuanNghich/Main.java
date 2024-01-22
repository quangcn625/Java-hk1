/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07023_NguyenToVaThuanNghich;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    static boolean check1(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i= 3;i*i<=n;i+=2)
            if(n%i==0) return false;
        return true;
    }
    
    static boolean check2(int n){
        String s = String.valueOf(n);
        for(int i=0; i<=s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        // TODO code application logic here
        DataInputStream da1 = new DataInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob1 = new ObjectInputStream(da1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ob1.readObject();
        
        DataInputStream da2 = new DataInputStream(new FileInputStream("DATA2.in"));
        ObjectInputStream ob2 = new ObjectInputStream(da2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ob2.readObject();
        
        Map<Integer, Integer> mp1 = new TreeMap<>();
        Map<Integer, Integer> mp2 = new TreeMap<>();
        
        for(int i : list1){
            if(mp1.containsKey(i)) mp1.put(i, mp1.get(i) + 1);
            else if(check1(i) && check2(i) && list2.indexOf(i) != -1) mp1.put(i, 1);
        }
        
        for(int i : list2){
            if(mp2.containsKey(i)) mp2.put(i, mp2.get(i) + 1);
            else if(mp1.containsKey(i)) mp2.put(i, 1);
        }
        
        for(int x : mp1.keySet()){
            System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
        }
    }
    
}
