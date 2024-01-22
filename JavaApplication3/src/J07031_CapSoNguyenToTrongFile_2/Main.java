/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07031_CapSoNguyenToTrongFile_2;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param n
     * @return
     */
    public static boolean checkNTo(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
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
        
        Map<Integer, Integer> mp = new TreeMap<>();
        
        for(int i : list1){
            if(checkNTo(i) && i < 500000 && list2.indexOf(i) == -1){
                int j = 1000000 - i;
                if(checkNTo(j) && list2.indexOf(j) == -1 && list1.indexOf(j) != -1){
                    mp.put(i, j);
                }
            }
        }
        
        for(int x : mp.keySet()){
            System.out.println(x + " " + mp.get(x));
        }
    }
    
}
