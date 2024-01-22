///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
package J07025_DanhSachKhachHangTrongFIle;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String ma;
    private String name;
    private String sex;
    private Date dob;
    private String dchi;

    public KhachHang(String name, String sex, Date dob, String dchi){
        this.ma = "KH" + String.format("%03d",cnt++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.dchi = dchi;
    }
    
    
    public String formatName(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.dob.compareTo(o.dob);
    }
    
    @Override
    public String toString(){
        return ma+" "+formatName()+" "+sex+" "+dchi+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.dob);
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String sex = sc.next();
            Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
            sc.nextLine();
            String dc = sc.nextLine();
            lst.add(new KhachHang(name, sex, dob, dc));
        }
        Collections.sort(lst);
        for(KhachHang x : lst){
            System.out.println(x);
        }
    }
    
}
