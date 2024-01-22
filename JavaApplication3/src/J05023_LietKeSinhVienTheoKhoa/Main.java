/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05023_LietKeSinhVienTheoKhoa;
import java.util.*;

class SinhVien{
    private String ma,name,lop,email,khoa;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.khoa = this.lop.substring(1, 3);
    }

    public String getKhoa() {
        return khoa;
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
        Vector<SinhVien> vc = new Vector<>();
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int n = sc.nextInt();
            for(SinhVien x : list){
                if(n == Integer.parseInt(20 + x.getKhoa())) vc.add(x);
            }
            System.out.println("DANH SACH SINH VIEN KHOA " + n +":");
            for(SinhVien x : vc){
                System.out.println(x);
            }
            vc.clear();
        }
    }
}
/*
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2015
*/
