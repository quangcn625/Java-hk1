/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07029_SoNguyenToLonNhatTrongFile;

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
        DataInputStream di = new DataInputStream(new FileInputStream("DATA.in"));
        ObjectInputStream ob = new ObjectInputStream(di);
        ArrayList<Integer> list = (ArrayList<Integer>) ob.readObject();
        Map<Integer, Integer> mp = new TreeMap<>(Collections.reverseOrder());
        for(Integer x : list){
            if(check(x)){
                if(mp.containsKey(x)){
                    mp.put(x, mp.get(x) + 1);
                }
                else{
                    mp.put(x, 1);
                }
            }
        }
        int cnt = 0;
        for(Integer x : mp.keySet()){
            if(cnt < 10){
                cnt++;
                System.out.println(x + " " + mp.get(x));
            }
        }
    }
    
}
