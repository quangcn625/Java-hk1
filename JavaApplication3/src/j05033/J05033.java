/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05033;
import java.util.*;

class Time implements Comparable<Time>{
    private int gio,phut,giay;

    public Time() {
    }

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    @Override
    public int compareTo(Time o) {
        if(this.gio != o.gio) return this.gio - o.gio;
        if(this.phut != o.phut) return this.phut - o.phut;
        return this.giay - o.giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    
}
public class J05033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Vector<Time> vc = new Vector<>();
        while(t-->0){
            vc.add(new Time(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(vc);
        for(Time i : vc){
            System.out.println(i);
        }
    }
    
}
