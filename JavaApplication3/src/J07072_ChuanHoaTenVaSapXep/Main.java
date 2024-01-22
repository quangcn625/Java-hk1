/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07072_ChuanHoaTenVaSapXep;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien>{
    private String name;

    public SinhVien() {
    }

    public SinhVien(String name) {
        this.name = name;
    }
    
    public String formatName(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0, 1).toUpperCase() + i.substring(1) +" ";
        }
        return ans.trim();
    }
   
    public String s(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        return a[a.length-1];
    }

    @Override
    public String toString() {
        return formatName();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.s().contentEquals(o.s())) return this.formatName().compareTo(o.formatName());
        return this.s().compareTo(o.s());
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            list.add(new SinhVien(s));
        }
        Collections.sort(list);
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
    
}
