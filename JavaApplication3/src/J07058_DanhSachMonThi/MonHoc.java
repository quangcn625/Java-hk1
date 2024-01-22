/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058_DanhSachMonThi;

/**
 *
 * @author WIN
 */
import java.util.Scanner;
public class MonHoc implements Comparable<MonHoc>{
    private String ma;
    private String name;
    private String hinhthucthi;

    public MonHoc(Scanner sc) {
        this.ma = sc.nextLine();
        this.name = sc.nextLine();
        this.hinhthucthi = sc.nextLine();
    }
    
    @Override
    public String toString(){
        return ma+" "+name+" "+hinhthucthi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }
}
