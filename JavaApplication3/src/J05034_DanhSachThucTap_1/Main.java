/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05034_DanhSachThucTap_1;
import java.util.*;

class DanhSach implements Comparable<DanhSach>{
    static int cnt = 1;
    private String thutu,ma,name,lop,email,doanhnghiep;

    public DanhSach() {
    }

    public DanhSach(String ma, String name, String lop, String email, String doanhnghiep) {
        this.thutu = String.format("%d", cnt++);
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }

    @Override
    public String toString() {
        return thutu+" "+ma+" "+name+" "+lop+" "+email+" "+doanhnghiep;
    }

    @Override
    public int compareTo(DanhSach o) {
        return this.name.compareTo(o.name);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<DanhSach> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            list.add(new DanhSach(ma,name,lop,email,dn));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            Vector<DanhSach> vc = new Vector<>();
            for(DanhSach x : list){
                if(s.equals(x.getDoanhnghiep())) vc.add(x);
            }
            Collections.sort(vc);
            for(DanhSach x : vc){
                System.out.println(x);
            }
        }
    } 
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/
