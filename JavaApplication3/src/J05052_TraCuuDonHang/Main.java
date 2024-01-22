/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05052_TraCuuDonHang;
import java.util.*;

class DonHang{
    private String name;
    private String ma;
    private int dongia;
    private int soluong;

    public DonHang() {
    }

    public DonHang(String name, String ma, int dongia, int soluong) {
        this.name = name;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    public String getSothutu(){
        return ma.substring(1, 4);
    }
    
    public int getGiamgia(){
        int x = Integer.parseInt(ma.substring(4));
        if(x ==  1) return (int) (0.5 * dongia * soluong);
        else if(x == 2) return (int) (0.3 * dongia * soluong);
        return 0;
    }
    
    public int getThanhtien(){
        return dongia * soluong - getGiamgia();
    }

    @Override
    public String toString() {
        return name+" "+ma+" "+getSothutu()+" "+getGiamgia()+" "+getThanhtien();
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DonHang> arr = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String ma = sc.nextLine();
            int dongia = Integer.parseInt(sc.nextLine());
            int soluong = Integer.parseInt(sc.nextLine());
            arr.add(new DonHang(name,ma,dongia,soluong));
        }
        for(DonHang x : arr){
            System.out.println(x);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/
