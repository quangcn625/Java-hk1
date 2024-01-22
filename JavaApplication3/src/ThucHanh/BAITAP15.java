/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh;

/**
 *
 * @author WIN
 */
import java.util.*;

class SinhVien implements Comparable<SinhVien>{
    private String ma, monhoc, nhom, nameGV;

    public SinhVien(String ma, String monhoc, String nhom, String nameGV) {
        this.ma = ma;
        this.monhoc = monhoc;
        this.nhom = nhom;
        this.nameGV = nameGV;
    }

    public String getMa() {
        return ma;
    }

    public String getMonhoc() {
        return monhoc;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.nhom.compareTo(o.nhom);
    }

    @Override
    public String toString() {
        return nhom+" "+nameGV;
    }
    
}
public class BAITAP15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String monhoc = sc.nextLine();
            String nhom = sc.nextLine();
            String nameGv = sc.nextLine();
            list.add(new SinhVien(ma, monhoc, nhom, nameGv));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String tmp = sc.nextLine();
            List<String> list1 = new ArrayList<>();
            List<SinhVien> list2 = new ArrayList<>();
            int cnt = 0;
            for(SinhVien x : list){
                if(x.getMa().equals(tmp)) 
                {
                    if(cnt <= 1){
                        list1.add(x.getMonhoc());
                        cnt++;
                    }
                }
            }
            for(SinhVien x : list){
                if(x.getMa().equals(tmp)) list2.add(x);
            }
            System.out.println("Danh sach nhom lop mon " + list1.get(0) +":");
            for(SinhVien x : list2){
                System.out.println(x);
            }
        }
    }
    
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
*/
