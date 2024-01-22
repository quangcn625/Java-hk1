/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07033_DanhSachSinhVienTrongFile_1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String name;
    private String lop;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String ma,String name, String lop, String email) {
        this.ma = ma;
        this.name = name;      
        this.lop = lop;
        this.email = email;
    }
    
    public String ChuanHoa(){
        String a[] = name.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0, 1).toUpperCase() + i.substring(1) +" ";
        }
        return ans.trim();
    }

    @Override
    public String toString() {
        return ma+" "+ChuanHoa()+" "+lop+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    
}
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> arr = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new SinhVien(ma,name,lop,email));
        }
        Collections.sort(arr);
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
    
}
/*
2
B15DCKT150
NGUYEN NGOC SON
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
NguyeN   TrONg Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
*/
