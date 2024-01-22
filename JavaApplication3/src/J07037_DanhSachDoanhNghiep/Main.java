/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07037_DanhSachDoanhNghiep;

/**
 *
 * @author WIN
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DN implements Comparable<DN>{
    private String ma;
    private String name;
    private int soSV;

    public DN() {
    }

    public DN(String ma, String name, int soSV) {
        this.ma = ma;
        this.name = name;
        this.soSV = soSV;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + soSV;
    }

    @Override
    public int compareTo(DN o) {
        return this.ma.compareTo(o.ma);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E://VAO RA FILE//DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<DN> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            list.add(new DN(ma,name,soSV));
        }
        Collections.sort(list);
        for(DN x : list){
            System.out.println(x);
        }
    } 
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/
