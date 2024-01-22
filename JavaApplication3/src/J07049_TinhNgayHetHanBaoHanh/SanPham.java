/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07049_TinhNgayHetHanBaoHanh;

/**
 *
 * @author WIN
 */
public class SanPham {
    private String masp, namesp;
    private int giaban, thoihanbaohanh;

    public SanPham(String masp, String namesp, int giaban, int thoihanbaohanh) {
        this.masp = masp;
        this.namesp = namesp;
        this.giaban = giaban;
        this.thoihanbaohanh = thoihanbaohanh;
    }

    public String getMasp() {
        return masp;
    }

    public String getNamesp() {
        return namesp;
    }

    public int getGiaban() {
        return giaban;
    }

    public int getThoihanbaohanh() {
        return thoihanbaohanh;
    }
}
