/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001_TinhToanHoaDonBanQuanAo;

/**
 *
 * @author WIN
 */
public class SanPham {
    private String maloai;
    private String tenSP;
    private long dongia1;
    private long dongia2;

    public SanPham(String maloai, String tenSP, long dongia1, long dongia2) {
        this.maloai = maloai;
        this.tenSP = tenSP;
        this.dongia1 = dongia1;
        this.dongia2 = dongia2;
    }

    public String getMaloai() {
        return maloai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDongia1() {
        return dongia1;
    }

    public long getDongia2() {
        return dongia2;
    }
    
}
