/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07081_SapXepDanhSachSinhVien;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String name;
    private String sodt;
    private String email;
    
    public SinhVien(Scanner sc){
        this.ma = sc.next();
        sc.nextLine();
        this.name = sc.nextLine();
        this.sodt = sc.nextLine();
        this.email = sc.nextLine();
    }
    
    public String lastName(){
        String a[] = name.split("\\s+");
        return a[a.length-1];
    }
   
    @Override
    public String toString(){
        return ma+" "+name+" "+sodt+" "+email;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        if(this.lastName().equals(o.lastName())){
            if(this.name.equals(o.name)) return this.ma.compareTo(o.ma);
            return this.name.compareTo(o.name);
        }
        return this.lastName().compareTo(o.lastName());
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new SinhVien(sc));
        }
        Collections.sort(list);
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
    
}
