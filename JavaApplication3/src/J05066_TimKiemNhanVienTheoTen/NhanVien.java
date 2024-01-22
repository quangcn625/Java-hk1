/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05066_TimKiemNhanVienTheoTen;

/**
 *
 * @author WIN
 */
public class NhanVien implements Comparable<NhanVien>{
    static int cnt1 = 0, cnt2 = 0, cnt3 = 0;
    private String maNV, nameNV, chucvu, hesoluong, sohieunhanvien;

    public NhanVien(String maNV, String nameNV) {
        this.hesoluong = maNV.substring(2,4);
        this.sohieunhanvien = maNV.substring(4);
        this.nameNV = nameNV;
        this.maNV = getMaNV(maNV, Integer.parseInt(this.sohieunhanvien));
        this.chucvu = this.maNV.substring(0,2);
    }

    public String getMaNV(String s, int sohieu){
        if(s.startsWith("GD") && sohieu > 1){
            return "NV"+s.substring(2);
        }
        if(s.startsWith("TP") && sohieu > 3){
            return "NV"+s.substring(2);       
        }
        if(s.startsWith("PP") && sohieu > 3){
            return "NV"+s.substring(2);
        }
        return s;
    }

    public String getNameNV() {
        return nameNV;
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


