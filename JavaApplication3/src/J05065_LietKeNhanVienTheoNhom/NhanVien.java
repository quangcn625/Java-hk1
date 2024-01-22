/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05065_LietKeNhanVienTheoNhom;

/**
 *
 * @author WIN
 */
public class NhanVien implements Comparable<NhanVien>{
    static int cnt1 = 0, cnt2 = 0, cnt3 = 0;
    private String maNV, nameNV, chucvu, hesoluong, sohieunhanvien;

    public NhanVien(String maNV, String nameNV) {
        this.maNV = getMaNV(maNV);
        this.nameNV = nameNV;
        this.chucvu = this.maNV.substring(0,2);
        this.hesoluong = this.maNV.substring(2,4);
        this.sohieunhanvien = this.maNV.substring(4);
    }

    public String getMaNV(String s){
        if(s.startsWith("GD")){
            if(cnt1 == 1){
                return "NV"+s.substring(2);
            }
            cnt1++;
        }
        if(s.startsWith("TP")){
            if(cnt2 == 3){
                return "NV"+s.substring(2);
            }
            cnt2++;
        }
        if(s.startsWith("PP")){
            if(cnt3 == 3){
                return "NV"+s.substring(2);
            }
            cnt3++;
        }
        return s;
    }

    public String getChucvu() {
        return chucvu;
    }
    
    @Override
    public int compareTo(NhanVien o) {
        if(this.hesoluong.equals(o.hesoluong)) return this.sohieunhanvien.compareTo(o.sohieunhanvien);
        return o.hesoluong.compareTo(this.hesoluong);
    }

    @Override
    public String toString() {
        return nameNV+" "+chucvu+" "+sohieunhanvien+" "+hesoluong;
    }
}
