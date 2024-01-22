/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07018_ChuanHoaDanhSachSinhVien;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class SinhVien{
    private static int cnt = 1;
    private String ma;
    private String name;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien(Scanner sc) {
        this.ma = String.format("B20DCCN%03d",cnt++);
        this.name = sc.nextLine();
        this.lop = sc.nextLine();
        this.dob = sc.nextLine();
        this.gpa = Double.parseDouble(sc.nextLine());
    }
    
    public String formatName(){
        String a[] = name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public String formatDob() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String ans = sdf.format(sdf.parse(dob));
        return ans;
    }
    
    @Override
    public String toString(){
        try {
            return ma+" "+formatName()+" "+lop+" "+formatDob()+" "+String.format("%.2f",gpa);
        } catch (ParseException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new SinhVien(sc));
        }
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
    
}
