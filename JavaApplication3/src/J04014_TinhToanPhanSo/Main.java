/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J04014_TinhToanPhanSo;
import java.util.*;

class PhanSo{
    private long tu,mau;
    
    public long USC(long a,long b){
        if(b==0) return a;
        else return USC(b,a%b);
    }

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public PhanSo rutgon(PhanSo a){
        long x = USC(a.tu,a.mau);
        a.tu = a.tu / x;
        a.mau = a.mau / x;
        return a;
    }
    
    public PhanSo sumFormat(PhanSo a,PhanSo b){
        PhanSo ans = new PhanSo(1,1);
        ans.tu = a.tu * b.mau + a.mau * b.tu;
        ans.mau = a.mau * b.mau;
        return ans;
        //return PhanSo(a.tu * this.mau + a.mau * this.tu,a.mau * this.mau);
    }
    
    public PhanSo multiFormat(PhanSo a,PhanSo b){
        PhanSo ans = new PhanSo(1,1);
        ans.tu = a.tu * b.tu;
        ans.mau = a.mau * b.mau;
        return ans;
    }

    @Override
    public String toString() {
        return tu +"/"+ mau;
    }

    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextInt(),sc.nextInt());
            PhanSo b = new PhanSo(sc.nextInt(),sc.nextInt());
            PhanSo c = a.sumFormat(a, b);
            c = c.multiFormat(c, c);
            PhanSo d = a.multiFormat(a, b);
            d = d.multiFormat(c, d);
            System.out.println(c.rutgon(c) + " " + d.rutgon(d));
        }
    }
    
}
