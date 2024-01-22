/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07056_TinhTienDien;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class TienDien implements Comparable<TienDien>{
    private static int cnt = 1;
    private String ma,name,loaigd;
    private long csDau, csCuoi;

    public TienDien() {
    }

    public TienDien(String name, String loaigd, long csDau, long csCuoi) {
        this.ma = String.format("KH%02d",cnt++);
        this.name = name;
        this.loaigd = loaigd;
        this.csDau = csDau;
        this.csCuoi = csCuoi;
    }
    
    public String formatName(){
        String a[] = name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public long getTientrongdinhmuc(){
        if(loaigd.equals("A")){
            if(csCuoi - csDau < 100) return (csCuoi - csDau) *450;
            else return 100 * 450;
        }
        else if(loaigd.equals("B")){
            if(csCuoi - csDau < 500) return (csCuoi - csDau) *450;
            else return 500 * 450;
        }
        else if(loaigd.equals("C")){
            if(csCuoi - csDau < 200) return (csCuoi - csDau) *450;
            else return 200 * 450;
        }
        return 0;
    }
    
    public long getTienvuotdinhmuc(){
        if(loaigd.equals("A")){
            if(csCuoi - csDau > 100) return (csCuoi - csDau - 100) *1000;
            else return 0;
        }
        else if(loaigd.equals("B")){
            if(csCuoi - csDau > 500) return (csCuoi - csDau - 100) *1000;
            else return 0;
        }
        else if(loaigd.equals("C")){
            if(csCuoi - csDau > 200) return (csCuoi - csDau - 100) *1000;
            else return 0;
        }
        return 0;
    }
    
    public long getThue(){
        return (long) (0.05 * getTienvuotdinhmuc());
    }
    
    public long getTongtien(){
        return getTientrongdinhmuc() + getTienvuotdinhmuc() + getThue();
    }

    @Override
    public String toString() {
        return ma+" "+formatName()+" "+getTientrongdinhmuc()+" "+getTienvuotdinhmuc()+" "+getThue()+" "+getTongtien();
    }

    @Override
    public int compareTo(TienDien o) {
        return (int) (o.getTongtien() - this.getTongtien());
    }
    
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<TienDien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String a[] = sc.nextLine().trim().split("\\s+");
            String loaigd = a[0];
            long csDau = Long.parseLong(a[1]);
            long csCuoi = Long.parseLong(a[2]);
            list.add(new TienDien(name, loaigd, csDau, csCuoi));
        }
        Collections.sort(list);
        for(TienDien x : list){
            System.out.println(x);
        }
    }
    
}
/*
2
 nGuyEn Hong Ngat
C 200 278
 Chu thi    minh
A 120 160
 nGuyEn Hong Ngat
C 200 278
 Chu thi    minh
A 120 160
*/
