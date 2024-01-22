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

class PhuHo{
    static int cnt = 1;
    private String ma;
    private String name, dob;
    private double diemlithuyet, diemthuchanh;

    public PhuHo(String name, String dob, double diemlithuyet, double diemthuchanh) {
        this.ma = "PH" + String.format("%02d", cnt++);
        this.name = name;
        this.dob = dob;
        this.diemlithuyet = diemlithuyet;
        this.diemthuchanh = diemthuchanh;
    }
    
    public double getDiemthuong(){
        if(diemlithuyet >= 8 && diemthuchanh >= 8) return 1;
        else if(diemlithuyet >= 7.5 && diemthuchanh >= 7.5) return 0.5;
        return 0;
    }
    
    public int getTuoi(){
        int tmp = Integer.parseInt(dob.substring(6));
        return 2021 - tmp;
    }
    
      
    public int getDiemTB(){
        int x = (int) Math.round((diemlithuyet+diemthuchanh)/2+getDiemthuong());
        if(x > 10) return 10;
        return x;
    }
    
    public String getXeploai(){
        if(getDiemTB()<5) return "Truot";
        else if(getDiemTB()>=5 && getDiemTB()<=6) return "Trung binh";
        else if(getDiemTB()==7) return "Kha";
        else if(getDiemTB()==8) return "Gioi";
        else if(getDiemTB()==9 || getDiemTB()==10) return "Xuat sac";
        return null;
    }


    @Override
    public String toString() {
        return ma+" "+name+" "+getTuoi()+" "+getDiemTB()+" "+getXeploai();
    }
    
}
public class BAITAP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<PhuHo> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double diemlithuyet = Double.parseDouble(sc.nextLine());
            double diemthuchanh = Double.parseDouble(sc.nextLine());
            lst.add(new PhuHo(name, dob, diemlithuyet, diemthuchanh));
        }
        for(PhuHo x : lst){
            System.out.println(x);
        }
    }
    
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
*/
