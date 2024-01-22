/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054_XepHangHocSinh;

/**
 *
 * @author WIN
 */
public class HocSinh implements Comparable<HocSinh>{
    private static int stt = 1;
    private String id,name,type;
    private double diemTB;

    public HocSinh(String name, double diemTB) {
        this.id = "HS" + String.format("%02d", stt++);
        this.name = name;
        this.diemTB = diemTB;
        if(diemTB < 5) this.type = "Yeu";
        else if(diemTB >= 5 && diemTB < 7) this.type = "Trung Binh";
        else if(diemTB >= 7 && diemTB < 9) this.type = "Kha";
        else if(diemTB >= 9) this.type = "Gioi";
    }

    public String getId() {
        return id;
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+diemTB+" "+type;
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(o.diemTB, this.diemTB);
    }
}
