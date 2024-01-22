/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05048_BangTheoDoiNhapXuatHang;
import java.util.*;

class NhapXuat{
    private String ma;
    private int soluongnhap;

    public NhapXuat() {
    }

    public NhapXuat(String ma, int soluongnhap) {
        this.ma = ma;
        this.soluongnhap = soluongnhap;
    }
    
    public int getSoluongxuat(){
        String x = ma.substring(0, 1);
        if(x.equals("A")) return (int) Math.round(0.6 * soluongnhap);
        return (int) Math.round(0.7 * soluongnhap);
    }
    
    public int getDongia(){
        String x = ma.substring(4);
        if(x.equals("Y")) return 110000;
        return 135000;
    }
    
    public int getTien(){
        return getSoluongxuat() * getDongia();
    }
    
    public int getThue(){
        String x1 = ma.substring(0, 1);
        String x2 = ma.substring(4);
        if("A".equals(x1)){
            if("Y".equals(x2))return (int) (0.08 * getTien());
            else if("N".equals(x2)) return (int) (0.11 * getTien());
        }
        else{
            if("Y".equals(x2)) return (int) (0.17 * getTien());
            else if("N".equals(x2))return (int) (0.22 * getTien());
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma+" "+soluongnhap+" "+getSoluongxuat()+" "+getDongia()+" "+getTien()+" "+getThue();
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhapXuat> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            int soluongnhap = Integer.parseInt(sc.nextLine());
            list.add(new NhapXuat(ma,soluongnhap));
        }
        for(NhapXuat x : list){
            System.out.println(x);
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
*/
