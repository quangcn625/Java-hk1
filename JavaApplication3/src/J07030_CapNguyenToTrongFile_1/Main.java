/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07030_CapNguyenToTrongFile_1;

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
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        DataInputStream ds1 = new DataInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob1 = new ObjectInputStream(ds1);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ob1.readObject();
        
        DataInputStream ds2 = new DataInputStream(new FileInputStream("DATA2.in"));
        ObjectInputStream ob2 = new ObjectInputStream(ds2);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ob2.readObject();
        
        Map<Integer, Integer> mp = new TreeMap<>();
        for(Integer x : list1){
            if(check(x) && x < 500000){
                int y = 1000000 - x;
                if(check(y)){
                    int k = list2.indexOf(y);
                    if(k != -1) mp.put(x, y);
                }
            }
        }
        for(Integer x : mp.keySet()){
            System.out.println(x + " " + mp.get(x));
        }
    }
    
}
