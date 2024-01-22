/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074_LichGiangDayTheoMonHoc;

/**
 *
 * @author WIN
 */
import java.util.ArrayList;

public class GiangVien implements Comparable<GiangVien>{
    private static int cnt = 1;
    private String manhom;
    private String maMon;
    private int thu;
    private int kip;
    private String name;
    private String phonghoc;
    private MonHoc tmp;

    public GiangVien(String maMon, int thu, int kip, String name, String phonghoc, ArrayList<MonHoc> dsMH) {
        this.manhom = "HP" + String.format("%03d", cnt++);
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.name = name;
        this.phonghoc = phonghoc;
        for(MonHoc x : dsMH){
            if(x.getMamon().contains(maMon)){
                this.tmp = x;
                break;
            }
        }
    }

    public String getMaMon() {
        return maMon;
    }

    @Override
    public String toString() {
        return manhom+" "+thu+" "+kip+" "+name+" "+phonghoc;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.thu == o.thu){
            if(this.kip == o.kip) return this.name.compareTo(o.name);
            return Integer.compare(this.kip, o.kip);
        }
        return Integer.compare(this.thu, o.thu);
    }
}
