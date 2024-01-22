/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TEST;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;



public class Main {
    
    public static boolean check1(int a){
        String x = String.valueOf(a);
        for(int i=0; i<x.length()/2; i++){
            if(x.charAt(i) != x.charAt(x.length()-i-1)) return false;
        }
        
        String s = String.valueOf(a);
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) - '0') % 2 == 0) return false;
        }
        
        if(s.length() % 2 == 0 || s.length() < 2) return false;
        return true;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException , ParseException{
        DataInputStream da1 = new DataInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob1 = new ObjectInputStream(da1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ob1.readObject();
        
        DataInputStream da2 = new DataInputStream(new FileInputStream("DATA2.in"));
        ObjectInputStream ob2 = new ObjectInputStream(da2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ob2.readObject();
        
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i : list1){
            if(mp.containsKey(i)) mp.put(i, mp.get(i)+1);
            else if(check1(i) && list2.indexOf(i) != -1) mp.put(i, 1);
        }
        for(int i : list2){
            if(mp.containsKey(i)) mp.put(i, mp.get(i)+1);
        }
        int cnt = 0;
        for(int i : mp.keySet()){
            if(cnt < 10){
                cnt++;
                System.out.println(i + " " + mp.get(i));
            }
        }
    }
    
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/

