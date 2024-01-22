/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07024_HieuCuaHaiTapTu;

import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
public class WordSet {
    private TreeSet<String> data;

    public WordSet(String a) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(a));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            String x[] = tmp.trim().toLowerCase().split("\\s+");
            for(String i : x) list.add(i);
        }
        this.data = new TreeSet<>(list);
    }
    
    public WordSet(ArrayList<String> a){
        this.data = new TreeSet<>(a);
    }
    
    public WordSet difference(WordSet o){
        ArrayList<String> tmp = new ArrayList<>();
        for(String i : this.data){
            if(!o.data.contains(i)) tmp.add(i);
        }
        return new WordSet(tmp);
    }

    @Override
    public String toString() {
        String ans = "";
        for(String i : this.data) ans += i + " ";
        return ans.trim();
    }
    
}
