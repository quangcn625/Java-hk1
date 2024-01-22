/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07010_DanhSachSinhVienTrongFile_2;

/**
 *
 * @author WIN
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

class SinhVien{
    static int cnt = 1;
    private String ma;
    private String name;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String dob, double gpa) {
        this.ma = String.format("B20DCCN%03d",cnt++);
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+dob+" "+String.format("%.2f",gpa);
    }
    
}
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> arr = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sdf.format(sdf.parse(sc.nextLine()));
            double gpa = Double.parseDouble(sc.nextLine());
            arr.add(new SinhVien(name,lop,dob,gpa));
        }
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
    
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/
