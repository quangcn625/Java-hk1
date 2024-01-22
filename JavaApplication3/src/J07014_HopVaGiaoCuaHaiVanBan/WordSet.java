/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07014_HopVaGiaoCuaHaiVanBan;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet<String> data;
    
    public WordSet(String a) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(a));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String b[] = s.trim().toLowerCase().split("\\s+");
            for(String i : b) list.add(i);
        }
        this.data = new TreeSet<>(list);
    }
    
    public WordSet(ArrayList<String> a){
        this.data = new TreeSet<>(a);
    }
    
    public WordSet union(WordSet o){
        ArrayList<String> list = new ArrayList<>();
        for(String i : this.data) list.add(i);
        for(String i : o.data) list.add(i);
        return new WordSet(list);
    }
    
    public WordSet intersection(WordSet o){
        ArrayList<String> list = new ArrayList<>();
        for(String i : this.data){
            for(String j : o.data){
                if(i.equals(j)) list.add(i);
            }
        }
        return new WordSet(list);
    }

    @Override
    public String toString() {
        String ans = "";
        for(String i : this.data) ans += i + " ";
        return ans.trim();
    }
    
}
