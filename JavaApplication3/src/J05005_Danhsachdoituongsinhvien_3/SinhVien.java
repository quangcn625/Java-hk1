/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05005_Danhsachdoituongsinhvien_3;

class SinhVien implements Comparable<SinhVien>{
    static int cnt = 1;
    private String ma,name,lop,date;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String date, double gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.name = name;
        this.lop = lop;
        if(date.charAt(2) != '/') this.date = '0' + date;
        if(this.date.charAt(5) != '/') this.date = this.date.substring(0, 3) + '0' + this.date.substring(3);
        this.gpa = gpa;
    }
    
    public String formatName(){
        String a[] = this.name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1)+" ";
        }
        return ans.substring(0, ans.length()-1);
    }

    public double getGpa() {
        return gpa;
    }
    
    

    @Override
    public String toString() {
        return ma+" "+formatName()+" "+lop+" "+date+" "+String.format("%.2f", gpa);
    }
    
    @Override
    public int compareTo(SinhVien other) {
        return Double.compare(other.gpa, this.gpa);
    }
}
