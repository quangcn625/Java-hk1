/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07015_SoNguyenToTrongFileNhiPhan;

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
    public static boolean checkNTO(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) o.readObject();
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int i=0; i<arr.size(); i++){
            if(checkNTO(arr.get(i))){
                if(mp.containsKey(arr.get(i))){
                    mp.put(arr.get(i), mp.get(arr.get(i))+1);
                }
                else{
                    mp.put(arr.get(i), 1);
                }
            }
        }
        for(Integer i : mp.keySet()){
            System.out.println(i + " " + mp.get(i));
        }
    }
    
}
