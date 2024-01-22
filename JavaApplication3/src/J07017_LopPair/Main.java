/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07017_LopPair;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public boolean checkNTo(int a){
        if(a < 2) return false;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return checkNTo((Integer) key) && checkNTo((Integer) value);
    }
    
    @Override
    public String toString(){
        return key+" "+value;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
