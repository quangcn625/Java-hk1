/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05003_Danhsachdoituongsinhvien_1;

public class SinhVien {
    private String ma,name,lop,birth;
    private double gpa;
    static int cnt=0;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String birth, double gpa) {
        cnt++;
        if(cnt <= 99){
            String a = String.valueOf(cnt);
            for(int i=0; i<=3-a.length(); i++) a = '0' + a;
            this.ma = "B20DCCN" + a;
        }
        this.name = name;
        this.lop = lop;
        if (birth.charAt(2) != '/') this.birth = '0' + birth;
        if (birth.charAt(4) != '/') this.birth = this.birth.substring(0, 3) + '0' + this.birth.substring(3);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String ans = ma + " " + name + " " + lop + " " + birth +" ";
        String tmp = String.format("%.2f", gpa);
        ans = ans + tmp;
        return ans;
    }
    
}
