/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05019_LuongMuaTrungBinh;

import java.util.Date;

/**
 *
 * @author WIN
 */
public class LuongMua {
    private String name;
    private String thoidiembd;
    private String thoidiemkt;
    private int luongmua;
    private double thoigianmua;

    public LuongMua(String name, String thoidiembd, String thoidiemkt, int luongmua) {
        this.name = name;
        this.thoidiembd = thoidiembd;
        this.thoidiemkt = thoidiemkt;
        this.luongmua = luongmua;
        this.thoigianmua = getThoigian();
    }

    public String getName() {
        return name;
    }

    public double getThoigian(){
        double h = Double.parseDouble(thoidiemkt.substring(0,2)) - Double.parseDouble(thoidiembd.substring(0,2));
        double m = (Double.parseDouble(thoidiemkt.substring(3)) - Double.parseDouble(thoidiembd.substring(3))) / 60;
        return h + m;
    }
    
    public void update(LuongMua x){
        this.thoigianmua += x.thoigianmua;
        this.luongmua += x.luongmua;
    }
    
    public double result(){
        return Math.round(this.luongmua / this.thoigianmua * 100) / 100.0 ;
    }

    @Override
    public String toString() {
        return name+" "+String.format("%.2f", result());
    }
    
}