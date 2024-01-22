/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05015_DuaXeDap;


/**
 *
 * @author WIN
 */
public class CuaRo implements Comparable<CuaRo>{
    private String ma;
    private String name;
    private String donvi;
    private String thoidiemdendich;

    public CuaRo(String name, String donvi, String thoidiemdendich) {
        String ans = "";
        String a[] = donvi.trim().split("\\s+");
        String b[] = name.trim().split("\\s+");
        for(String i : a){
            ans += i.substring(0,1);
        }
        for(String i : b){
            ans += i.substring(0,1);
        }
        this.ma = ans;
        this.name = name;
        this.donvi = donvi;
        this.thoidiemdendich = thoidiemdendich;
    }
    
    public double getThoigian(){
        double tmp1 = Integer.parseInt(thoidiemdendich.substring(0, 1));
        double tmp2 = Integer.parseInt(thoidiemdendich.substring(2));
        return ((tmp1 - 6) + (tmp2 / 60));
    }
    
    public long getVantocTB(){
        return (long) (Math.round(120 / getThoigian()));
    }

    @Override
    public int compareTo(CuaRo o) {
        return Double.compare(this.getThoigian(), o.getThoigian());
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+donvi+" "+getVantocTB();
    }
    
}
