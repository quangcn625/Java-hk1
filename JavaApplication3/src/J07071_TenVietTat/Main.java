/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07071_TenVietTat;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class GiangVien implements Comparable<GiangVien>{
    private String ma,name;

    public GiangVien(String name) {
        String a[] = name.trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1);
        }
        this.ma = ans;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(GiangVien o) {
        String a[] = this.name.trim().split("\\s+");
        String b[] = o.name.trim().split("\\s+");
        String tmp1 = a[a.length-1];
        String tmp2 = b[b.length-1];
        if(tmp1.equals(tmp2)) return this.name.compareTo(o.name);
        return tmp1.compareTo(tmp2);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            list.add(new GiangVien(name));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tmp = sc.nextLine();
            String ans1 = "";
            for(int i=0; i<tmp.length(); i++){
                if(tmp.charAt(i) != '.' && tmp.charAt(i) != '*'){
                    ans1 += String.valueOf(tmp.charAt(i));
                }
            }
            for(GiangVien x : list){
                if(x.getMa().contains(ans1)){
                    System.out.println(x);
                }
            }
        }
    }
    
}

