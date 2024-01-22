/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

import java.util.Date;

/**
 *
 * @author WIN
 */
public class CaThi {
    static int cnt = 1;
    private String macathi;
    private String ngaythi,giothi;
    private String phongthi;

    public CaThi(String ngaythi, String giothi, String phongthi) {
        this.macathi = "C" + String.format("%03d",cnt++);
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.phongthi = phongthi;
    }

    public String getMacathi() {
        return macathi;
    }

    public String getNgaythi() {
        return ngaythi;
    }

    public String getGiothi() {
        return giothi;
    }

    public String getPhongthi() {
        return phongthi;
    }
    
}
