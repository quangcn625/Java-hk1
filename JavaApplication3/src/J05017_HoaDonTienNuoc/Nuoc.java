/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05017_HoaDonTienNuoc;

/**
 *
 * @author WIN
 */
public class Nuoc implements Comparable<Nuoc>{
    private static int cnt = 1;
    private String ma;
    private String name;
    private int chisocu;
    private int chisomoi;

    public Nuoc(String name, int chisocu, int chisomoi) {
        this.ma = "KH" + String.format("%02d", cnt++);
        this.name = name;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }
    
    public int getTongtiennuoc(){
        int tmp = chisomoi - chisocu;
        double ans = 0;
        if(tmp > 50){
            ans = 50 * 100;
            if(tmp > 100){
                ans += 50 * 150;
                ans += (tmp - 100) * 200;
                ans = Math.round(ans * 1.05);
            }
            else{
                ans += (tmp - 50) * 150;
                ans = Math.round(ans * 1.03);
            }
        }
        else{
            ans = tmp * 102;
        }
        return (int) ans;
    }

    @Override
    public int compareTo(Nuoc o) {
        return Integer.compare(o.getTongtiennuoc(),this.getTongtiennuoc());
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getTongtiennuoc();
    }
    
}
