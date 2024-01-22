/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT1;

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
    static boolean check(int n){
        String s = String.valueOf(n);
        if(s.length()<=2) return false;
        for(int i=0; i<=s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        DataInputStream da = new DataInputStream(new FileInputStream("DAYSO.DAT"));
        ObjectInputStream ob = new ObjectInputStream(da);
        ArrayList<Integer> arr = (ArrayList<Integer>) ob.readObject();
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            if(check(x)){
                list.add(x);
            }
        }
        Collections.sort(list);
        for(int x : list){
            System.out.println(x);
        }
    }
    
}
