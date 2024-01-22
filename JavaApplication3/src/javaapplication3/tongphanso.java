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
        long n = USC(tu,mau);
        this.tu = tu / n;
        this.mau = mau / n;
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
        if(b == 0) return a;
        return USC(b,a%b);
    }
    
    Fraction add(Fraction a){
        this.tu = this.tu * a.mau + a.tu * this.mau;
        this.mau = a.mau * this.mau;
        return new Fraction(tu,mau);
    }
    
    Fraction sum(Fraction a,Fraction b){
        this.tu = a.tu * b.mau + b.tu * a.mau;
        this.mau = a.mau * b.mau;
        return new Fraction(tu,mau);
    }

     @Override
    public String toString(){
        return Long.toString(this.tu)+ '/' + Long.toString(this.mau) ;
    }
    
}
public class tongphanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextLong(),sc.nextLong());
        Fraction b = new Fraction(sc.nextLong(),sc.nextLong());
        System.out.println(new Fraction().sum(a, b));
    }
}
