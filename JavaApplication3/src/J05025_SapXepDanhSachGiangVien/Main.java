/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05025_SapXepDanhSachGiangVien;
import java.util.*;

class GiangVien implements Comparable<GiangVien>{
    static int cnt = 1;
    private String name;
    private String nganh;
    private String ma;
    private String manganh;

    public GiangVien() {
    }

    public GiangVien(String name, String nganh) {
        this.ma = String.format("GV%02d", cnt++);
        this.name = name;
        this.nganh = nganh;
        String a[] = nganh.trim().split("\\s+");
        String ans = "";
        for(int i=0; i<a.length; i++){
            ans = ans + String.valueOf(a[i].charAt(0)).toUpperCase();
        }
        this.manganh = ans;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+manganh;
    }

    @Override
    public int compareTo(GiangVien o) {
        String a[] = this.name.trim().split("\\s+");
        String tmp1 = a[a.length-1];
        String b[] = o.name.trim().split("\\s+");
        String tmp2 = b[b.length-1];
        if(tmp1.equals(tmp2)) return this.ma.compareTo(o.ma);
        return tmp1.compareTo(tmp2);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String manganh = sc.nextLine();
            GiangVien x = new GiangVien(name,manganh);
            list.add(x);
        }
        Collections.sort(list);
        for(GiangVien x : list){
            System.out.println(x);
        }
    }
    
}
/*
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/
