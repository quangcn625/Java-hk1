/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05082_DanhSachKhachHang;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WIN
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String ID, name, sex, dc;
    private Date dob;

    public KhachHang(String name, String sex, Date dob, String dc) {
        this.ID = "KH" + String.format("%03d", cnt++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.dc = dc;
    }
    
    public String formatName(){
        String a[] = name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        return ans.trim();
    }
    
    @Override
    public String toString() {
        return ID+" "+formatName()+" "+sex+" "+dc+" "+new SimpleDateFormat("dd/MM/yyy").format(dob);
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.dob.compareTo(o.dob);
    }
    
}
