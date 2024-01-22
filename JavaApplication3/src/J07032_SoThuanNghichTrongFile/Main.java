/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07032_SoThuanNghichTrongFile;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    static boolean checkTN(int n){
        String x = String.valueOf(n);
        for(int i=0; i<=x.length()/2; i++){
            if(x.charAt(i) != x.charAt(x.length()-i-1)) return false;
        }
        return true;
    }
    
    static boolean checkLe(int n){
        String x = String.valueOf(n);
        for(int i=0; i<=x.length()/2; i++){
            if((x.charAt(i) - '0') % 2 == 0) return false;
        }
        return !(x.length() % 2 == 0 || x.length() < 2);
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
        for(int x : list2){
            if(mp.containsKey(x)) mp.put(x, mp.get(x) + 1);
            else if(checkTN(x) && checkLe(x) && list1.indexOf(x) != -1) mp.put(x, 1);
        }
        
        for(int x : list1){
            if(mp.containsKey(x)) mp.put(x, mp.get(x) + 1);
        } 
        int cnt = 0;
        for(Integer x : mp.keySet()){
            if(cnt < 10){
                System.out.println(x + " " + mp.get(x));
                cnt++;
            }
        }
    }
    
}
