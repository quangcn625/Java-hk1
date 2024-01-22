/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

class NhanVien{
    private String mnv,name,sex,birth,add,mst,date;

    public NhanVien() {
    }

    public NhanVien(String mnv, String name, String sex, String birth, String add, String mst, String date) {
        this.mnv = mnv;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.add = add;
        this.mst = mst;
        this.date = date;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return mnv + " " + name + " " + sex +" "+ birth + " " + add + " " + mst + " " + date;
    }
    
}
public class khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien();
        /*"00001",sc.nextLine(),sc.next(),sc.next(),sc.nextLine(),sc.next(),sc.next());*/
        x.setMnv("00001");
        x.setName(sc.nextLine());
        x.setSex(sc.next());
        x.setBirth(sc.next());
        sc.nextLine();
        x.setAdd(sc.nextLine());
        x.setMst(sc.next());
        x.setDate(sc.next());
        System.out.println(x);
    }
}
