/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05080_LopHocPhan_2;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class nhom implements Comparable<nhom>{
    private String maMH, MH, nhomMH;
    private GiangVien GV;

    public nhom(String maMH, String MH, String nhomMH, ArrayList<GiangVien> dsGV) {
        this.maMH = maMH;
        this.MH = MH;
        this.nhomMH = nhomMH;
        for(GiangVien x : dsGV){
            if(maMH.equals(x.getMa())){
                GV = x;
                break;
            }
        }
    }

    public String getMaMH() {
        return maMH;
    }

    public String getMH() {
        return MH;
    }

    public String getNhomMH() {
        return nhomMH;
    }
    
    @Override
    public String toString(){
        return maMH+" "+MH+" "+nhomMH;
    }

    @Override
    public int compareTo(nhom o) {
        if(this.maMH.equals(o.maMH)){
            return this.nhomMH.compareTo(o.nhomMH);
        }
        return this.maMH.compareTo(o.maMH);
    }
}
