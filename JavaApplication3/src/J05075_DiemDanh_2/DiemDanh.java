/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05075_DiemDanh_2;

import java.util.ArrayList;

public class DiemDanh implements Comparable<DiemDanh>{
    private String ma, dulieudiemdanh;
    private SinhVien SV;

    public DiemDanh(String ma, String dulieudiemdanh, ArrayList<SinhVien> dsSV) {
        this.ma = ma;
        this.dulieudiemdanh = dulieudiemdanh;
        for(SinhVien x : dsSV){
            if(this.ma.equals(x.msv)){
                this.SV = x;
                break;
            }
        }
    }

    public String getMa() {
        return ma;
    }
    
    public int getDiemchuyencan(){
        String a[] = dulieudiemdanh.split("");
        int diem = 10;
        for(String x : a){
            if(x.equals("v")) diem -= 2;
            else if(x.equals("m")) diem -= 1;
            else continue;
        }
        if(diem < 0) return 0;
        return diem;
    }

    @Override
    public String toString() {
        return ma+" "+SV.name+" "+SV.lop+" "+getDiemchuyencan();
    }

    @Override
    public int compareTo(DiemDanh o) {
        return Integer.compare(this.getDiemchuyencan(), o.getDiemchuyencan());
    }
}
