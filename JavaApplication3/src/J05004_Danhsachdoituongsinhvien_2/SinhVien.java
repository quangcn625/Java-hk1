/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05004_Danhsachdoituongsinhvien_2;

/**
 *
 * @author WIN
 */
public final class SinhVien {
    private String ma,name,lop,birth;
    private double gpa;
    static int cnt=1;
    
    public SinhVien() {
    }

    public SinhVien(String name, String lop, String birth, double gpa) {
        this.ma = String.format("B20DCCN%03d",cnt++);
        this.name = name;
        this.lop = lop;
        if (birth.charAt(2) != '/') this.birth = '0' + birth;
        if (this.birth.charAt(5) != '/') this.birth = this.birth.substring(0, 3) + '0' + this.birth.substring(3);
        this.gpa = gpa;
    }
    
    public String formatName(){
        String a[] = this.name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (String a1 : a) {
            ans += String.valueOf(a1.charAt(0)).toUpperCase() + a1.substring(1) + " ";
        }
        return ans.substring(0, ans.length()-1);
    }
   
    @Override
    public String toString() {
        return ma + " " + formatName()+" " + lop + " " + birth +" "+ String.format("%.2f", gpa);
    }
    
}
