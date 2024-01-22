/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap3;

/**
 *
 * @author WIN
 */
public class Gio implements Comparable<Gio>{
    private String ma;
    private String name;
    private String giovao;
    private String giora;

    public Gio() {
    }

    public Gio(String ma, String name, String giovao, String giora) {
        this.ma = ma;
        this.name = name;
        this.giovao = giovao;
        this.giora = giora;
    }
    
    public int getTimeplay(){
        String tmp1 = giovao.substring(0, 2);
        String tmp2 = giora.substring(0,2);
        String tmp3 = giovao.substring(3);
        String tmp4 = giora.substring(3);
        return (Integer.parseInt(tmp2)-Integer.parseInt(tmp1))*60+(Integer.parseInt(tmp4)-Integer.parseInt(tmp3))-60;
    }
    
    public String getThoigianthuc(){
        return String.valueOf(this.getTimeplay()/60)+" gio "+String.valueOf(this.getTimeplay()%60)+" phut";
    }

    public String getThoigiantieuchuan(){
        if(getTimeplay()>=480) return "DU";
        return "THIEU";
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+getThoigianthuc()+" "+getThoigiantieuchuan();
    }

    @Override
    public int compareTo(Gio o) {
        return o.getThoigianthuc().compareTo(this.getThoigianthuc());
    }
}
