/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap_3;

/**
 *
 * @author WIN
 */
public class SinhVien {
    private String maSV, nameSV, lop, email;

    public SinhVien(String maSV, String nameSV, String lop, String email) {
        this.maSV = maSV;
        this.nameSV = formatName(nameSV);
        this.lop = lop;
        this.email = email;
    }

    public String formatName(String s){
        String a[] = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public String getMaSV() {
        return maSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public String getLop() {
        return lop;
    }
    
}
