/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05024_LietKeSinhVienTheoNganh;
import java.util.*;

class SinhVien{
    private String ma,name,lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getManganh() {
        return ma.substring(5,7);
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+email;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien x = new SinhVien(ma,name,lop,email);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine().toUpperCase();
            String a[] = s.split("\\s+");
            String tmp = String.valueOf(a[0].charAt(0))+String.valueOf(a[1].charAt(0));
            Vector<SinhVien> vc = new Vector<>();
            for(SinhVien o : list){
                if(o.getLop().charAt(0)=='E' && (o.getManganh().equals("CN") || o.getManganh().equals("AT"))){
                    continue;
                }
                else{
                    if(tmp.equals(o.getManganh())){
                        vc.add(o);
                    }
                }
            }
            System.out.println("DANH SACH SINH VIEN NGANH "+ s +":");
            for(SinhVien i : vc){
                System.out.println(i);
            }
        }
    }
}
/*
B16DCCN011
Nguyen Trong Duc Anh
E16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
E15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
*/
