/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05060_KetQuaXetTuyen;
import java.util.*;

class People{
    static int cnt = 1;
    private String ma;
    private String name;
    private String dob;
    private double diemlythuyet;
    private double diemthuchanh;

    public People() {
    }

    public People(String name, String dob, double diemlythuyet, double diemthuchanh) {
        this.ma = String.format("PH%02d",cnt++);
        this.name = name;
        this.dob = dob;
        this.diemlythuyet = diemlythuyet;
        this.diemthuchanh = diemthuchanh;
    }
    
    public int getAge(){
        int x = Integer.parseInt(dob.substring(6));
        return 2021 - x;
    }
    
    public double getDiemthuong(){
        if(diemlythuyet >= 8 && diemthuchanh >= 8) return 1;
        else if(diemlythuyet >= 7.5 && diemthuchanh >= 7.5) return 0.5;
        return 0;
    }
    
    public int getDiemTB(){
        int x = (int) Math.round((diemlythuyet+diemthuchanh)/2+getDiemthuong());
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
        return ma+" "+name+" "+getAge()+" "+getDiemTB()+" "+getXeploai();
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<People> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double diemlythuyet = Double.parseDouble(sc.nextLine());
            double diemthuchanh = Double.parseDouble(sc.nextLine());
            list.add(new People(name,dob,diemlythuyet,diemthuchanh));
        }
        for(People x : list){
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
