/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07016_SoNguyenToTrongHaiFileNhiPhan;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.FileNotFoundException
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
        
        Map<Integer, Integer> mp1 = new TreeMap<>();
        Map<Integer, Integer> mp2 = new TreeMap<>();
        
        for(int i : list1){
            if(mp1.containsKey(i)) mp1.put(i, mp1.get(i) + 1);
            else if(checkNTo(i) && list2.indexOf(i) != -1) mp1.put(i, 1);
        }
        
        for(int i : list2){
            if(mp2.containsKey(i)) mp2.put(i, mp2.get(i) + 1);
            else if(mp1.containsKey(i)) mp2.put(i, 1);
        }
        
        for(int i : mp1.keySet()){
            System.out.println(i + " " + mp1.get(i) + " " + mp2.get(i));
        }
    }
    
}
