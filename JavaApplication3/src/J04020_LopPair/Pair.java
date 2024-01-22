/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04020_LopPair;

/**
 *
 * @author WIN
 * @param <K>
 * @param <V>
 */
public class Pair <K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public boolean checkNTo(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return checkNTo((Integer) key) && checkNTo((Integer) value);
    }

    @Override
    public String toString() {
        return key+" "+value;
    }
}
