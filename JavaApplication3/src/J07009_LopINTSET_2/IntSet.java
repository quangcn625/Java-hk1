/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07009_LopINTSET_2;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author WIN
 */
public class IntSet {
    private TreeSet<Integer> data;

    public IntSet(int a[]) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int x : a) tmp.add(x);
        this.data = new TreeSet<>(tmp);
    }
    
    public IntSet (ArrayList<Integer> data){
        this.data = new TreeSet<>(data);
    }
    
    public IntSet intersection(IntSet o){
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : this.data){
            for(int y : o.data){
                if(x == y){
                    list.add(x);
                }
            }
        }
        return new IntSet(list);
    }

    @Override
    public String toString() {
        String ans = "";
        for(int x : this.data) ans += String.valueOf(x) + " ";
        return ans.trim();
    }
    
}
