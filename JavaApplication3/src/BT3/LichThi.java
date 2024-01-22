/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

import java.util.ArrayList;
import java.text.*;
import java.util.Date;
/**
 *
 * @author WIN
 */
public class LichThi implements Comparable<LichThi>{
    private String macathi, mamon;
    private String manhom, sosinhvien;
    private MonHoc tmp1;
    private CaThi tmp2;

    public LichThi(String macathi, String mamon, String manhom, String sosinhvien, ArrayList<MonHoc> list1, ArrayList<CaThi> list2) {
        this.macathi = macathi;
        this.mamon = mamon;
        this.manhom = manhom;
        this.sosinhvien = sosinhvien;
        for(MonHoc x : list1){
            if(x.getMamon().contains(mamon)){
                this.tmp1 = x;
                break;
            }
        }
        for(CaThi x : list2){
            if(x.getMacathi().contains(macathi)){
                this.tmp2 = x;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return tmp2.getNgaythi()+" "+tmp2.getGiothi()+" "+tmp2.getPhongthi()+" "+tmp1.getTenmon()+" "+manhom+" "+sosinhvien;
    }

    @Override
    public int compareTo(LichThi o) {
        try{
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
            Date ans1 = sdf1.parse(this.tmp2.getNgaythi());
            Date ans2 = sdf1.parse(o.tmp2.getNgaythi());
            Date ans3 = sdf2.parse(this.tmp2.getGiothi());
            Date ans4 = sdf2.parse(o.tmp2.getGiothi());
            if(ans1.equals(ans2)){
                if(ans3.equals(ans4)){
                    return this.macathi.compareTo(o.macathi);
                }
                return ans3.compareTo(ans4);
            }
            return ans1.compareTo(ans2);
        }
        catch(Exception e){
            
        }
        return 0;
    }
}
