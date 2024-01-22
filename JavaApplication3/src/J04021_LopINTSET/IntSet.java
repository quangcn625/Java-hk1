/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04021_LopINTSET;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author WIN
 */
public class IntSet {
    private TreeSet<Integer> data;

    public IntSet(int a[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : a) list.add(i);
        this.data = new TreeSet<>(list);
    }

    public IntSet(ArrayList<Integer> data) {
        this.data = new TreeSet<>(data);
    }
    
    public IntSet union(IntSet o){
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i : o.data) tmp.add(i);
        for(int i : this.data) tmp.add(i);
        return new IntSet(tmp);
    }

    @Override
    public String toString() {
        String s = "";
        for(int i : this.data) s += String.valueOf(i) + " ";
        return s.trim();
    }
    
}
