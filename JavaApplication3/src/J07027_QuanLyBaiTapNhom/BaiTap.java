/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027_QuanLyBaiTapNhom;

/**
 *
 * @author WIN
 */
public class BaiTap {
    private static int cnt = 1;
    private String maBTL;
    private String baitaplon;

    public BaiTap(String baitaplon) {
        this.maBTL = String.valueOf(cnt++);
        this.baitaplon = baitaplon;
    }

    public String getBaitaplon() {
        return baitaplon;
    }

    public String getMaBTL() {
        return maBTL;
    }
    
}
