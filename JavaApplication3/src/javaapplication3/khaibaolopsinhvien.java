package javaapplication3;
import java.util.*;

class SinhVien {
    private String msv;
    private String name;
    private String lop;
    private String birth;
    private float gpa;

    public SinhVien() {
    }

    public SinhVien(String msv, String name, String lop, String birth, float gpa) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        if (birth.charAt(2) != '/') birth = '0' + birth;
        if (birth.charAt(5) != '/') birth = birth.substring(0, 3) + '0' + birth.substring(3);
        this.birth = birth;
        this.gpa = gpa;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

public class khaibaolopsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien("B20DCCN001", sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        System.out.printf(x.getMsv()+" "+x.getName()+" "+x.getLop()+" "+x.getBirth()+" "+"%.2f\n",x.getGpa());
    }
}
