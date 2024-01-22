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

class GiaoVien{
    private String ma, name;
    private int luongcoban;

    public GiaoVien(String ma, String name, int luongcoban) {
        this.ma = ma;
        this.name = name;
        this.luongcoban = luongcoban;
    }

    public String getMa() {
        return ma;
    }
    
    public int getPhucap(){
        String tmp = ma.substring(0,2);
        if(tmp.equals("HT")) return 2000000;
        else if(tmp.equals("HP")) return 900000;
        return 500000;
    }
    
    public int getHeso(){
        return Integer.parseInt(ma.substring(2));
    }
    
    public int getLuong(){
        return luongcoban * getHeso() + getPhucap();
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getHeso()+" "+getPhucap()+" "+getLuong();
    }
    
}
public class BAITAP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiaoVien> list = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        while(t-->0){
            String mangach = sc.nextLine();
            String x = mangach.substring(0,2);
            if(x.equals("HT")) cnt1++;
            if(x.equals("HP")) cnt2++;
            String name = sc.nextLine();
            int luongcoban = Integer.parseInt(sc.nextLine());
            if(x.equals("HT")){
                if(cnt1 == 1) list.add(new GiaoVien(mangach,name,luongcoban));
                else continue;
            }
            else if(x.equals("HP")){
                if(cnt2 == 1 || cnt2 == 2) list.add(new GiaoVien(mangach,name,luongcoban));
                else continue;
            }
            else{
                list.add(new GiaoVien(mangach,name,luongcoban));
            }
        }
        for(GiaoVien x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/
