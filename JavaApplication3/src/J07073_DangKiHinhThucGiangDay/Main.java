/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07073_DangKiHinhThucGiangDay;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

class MonHoc implements Comparable<MonHoc>{
    private String ma;
    private String name;
    private int sotinchi;
    private String lythuyet;
    private String thuchanh;

    public MonHoc() {
    }
    
    public MonHoc(Scanner sc){
        this.ma = sc.nextLine();
        this.name = sc.nextLine();
        this.sotinchi = Integer.parseInt(sc.nextLine());
        this.lythuyet = sc.nextLine();
        this.thuchanh = sc.nextLine();
    } 

    public String getThuchanh() {
        return thuchanh;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+sotinchi+" "+lythuyet+" "+thuchanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> arr = new ArrayList<>();
        while(t-->0){
            arr.add(new MonHoc(sc));
        }
        Collections.sort(arr);
        for(MonHoc x : arr){
            if(!x.getThuchanh().equals("Truc tiep")){
                System.out.println(x);
            }
        }
    }
    
}
