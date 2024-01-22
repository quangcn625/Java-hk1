/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04022_LopWordSet;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author WIN
 */
public class WordSet {
    private TreeSet<String> data;

    public WordSet(String a) {
        String b[] = a.toLowerCase().trim().split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        for(String i : b){
            list.add(i);
        }
        this.data = new TreeSet<>(list);
    }
    
    public WordSet(ArrayList<String> list){
        this.data = new TreeSet<>(list);
    }
    
    public WordSet union(WordSet o){
        ArrayList<String> tmp = new ArrayList<>();
        for(String i : o.data) tmp.add(i);
        for(String i : this.data) tmp.add(i);
        return new WordSet(tmp);
    }
    
    public WordSet intersection(WordSet o){
        ArrayList<String> a = new ArrayList<>();
        for(String i: this.data){
            for(String j: o.data){
                if(i.contentEquals(j)){
                    a.add(i);
                }
                //if(i.compareTo(j)<0) break;
            }
        }
        return new WordSet(a);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(String i: this.data){
            s+= i + ' ';
        }
        return s;
    }
}
