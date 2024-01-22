/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07050_SapXepMatHang;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
class MatHang implements Comparable<MatHang>{
    static int cnt = 1;
    private String ma;
    private String name;
    private String nhomhang;
    private double giamua;
    private double giaban;

    public MatHang() {
    }

    public MatHang(String name, String nhomhang, double giamua, double giaban) {
        this.ma = String.format("MH%02d", cnt++);
        this.name = name;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    
    public double getLoinhuan(){
        return giaban - giamua;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.getLoinhuan(), this.getLoinhuan());
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+nhomhang+" "+String.format("%.2f",getLoinhuan());
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String nhomhang = sc.nextLine();
            double giamua = Double.parseDouble(sc.nextLine());
            double giaban = Double.parseDouble(sc.nextLine());
            list.add(new MatHang(name,nhomhang,giamua,giaban));
        }
        Collections.sort(list);
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/
