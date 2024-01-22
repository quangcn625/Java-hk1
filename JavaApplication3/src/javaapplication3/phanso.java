/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

class Fraction{
    private long tu,mau;

    public Fraction() {
    }

    
    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    static long USC(long a,long b){
        if(b == 0){
            return a;
        }
        return USC(b,a%b);
    }
    public void Fraction(){
        long n = USC(tu,mau);
        this.tu = tu / n;
        this.mau = mau / n;
        System.out.println(this.tu + "/" + this.mau);
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
public class phanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction p = new Fraction(sc.nextLong(),sc.nextLong());
        p.Fraction();
    }
}
