/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST;

/**
 *
 * @author WIN
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    boolean checkNto(int n){
        if(n < 2) return false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    boolean isPrime(){
        return checkNto((Integer) key) && checkNto((Integer) value);
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
    
}
