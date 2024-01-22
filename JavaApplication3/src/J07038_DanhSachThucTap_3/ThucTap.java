/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap_3;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class ThucTap implements Comparable<ThucTap>{
    private String msv, madn;
    private SinhVien tmp1;
    private DN tmp2;

    public ThucTap(String msv, String madn, ArrayList<SinhVien> ds1, ArrayList<DN> ds2) {
        this.msv = msv;
        this.madn = madn;
        for(SinhVien x : ds1){
            if(x.getMaSV().equals(msv)){
                this.tmp1 = x;
                break;
            }
        }
        for(DN x : ds2){
            if(x.getMaDN().equals(madn)){
                this.tmp2 = x;
                break;
            }
        }
    }

    public String getMadn() {
        return madn;
    }
    
    @Override
    public String toString() {
        return msv+" "+tmp1.getNameSV()+" "+tmp1.getLop();
    }
   
    @Override
    public int compareTo(ThucTap o){
        return this.msv.compareTo(o.msv);
    }
}
