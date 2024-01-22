/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07045_LoaiPhong;

/**
 *
 * @author WIN
 */
import java.io.File;
import java.io.IOException;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String loaiphong;
    private String ma;
    private String name;
    private int dongiangay;
    private double phiphucvu;

    public LoaiPhong() {
    }

    public LoaiPhong(String loaiphong) {
        this.loaiphong = loaiphong;
        String a[] = this.loaiphong.trim().split("\\s+");
        this.ma = a[0];
        this.name = a[1];
        this.dongiangay = Integer.parseInt(a[2]);
        this.phiphucvu = Double.parseDouble(a[3]);
    }

    @Override
    public String toString() {
        return loaiphong;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("E://VAO RA FILE//PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
/*
2
C THUONG 150 0.03
B VIP 200 0.05
*/
