/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07048_DanhSachSanPham_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
class SanPham implements Comparable<SanPham>{
    private String ma;
    private String name;
    private int giaban;
    private int thoigianbaohanh;

    public SanPham() {
    }

    public SanPham(String ma, String name, int giaban, int thoigianbaohanh) {
        this.ma = ma;
        this.name = name;
        this.giaban = giaban;
        this.thoigianbaohanh = thoigianbaohanh;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+giaban+" "+thoigianbaohanh;
    }

    
    @Override
    public int compareTo(SanPham o) {
        if(this.giaban != o.giaban) return Integer.compare(o.giaban, this.giaban);
        return this.ma.compareTo(o.ma);
    }

}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        Vector<SanPham> vc = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int giaban = Integer.parseInt(sc.nextLine());
            int thoigianbaohanh = Integer.parseInt(sc.nextLine());
            vc.add(new SanPham(ma,name,giaban,thoigianbaohanh));
        }
        Collections.sort(vc);
        for(SanPham x : vc){
            System.out.println(x);
        }
    }
    
}
/*
2
KC740
May khoan KC1
39
18
KC742
May cat KC2
46
12
*/
