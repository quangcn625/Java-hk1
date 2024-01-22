/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05047_BangKeNhapKhoSapXepTheoTrietKhau;
import java.util.*;

class BangKe implements Comparable<BangKe>{
    private String ma;
    private String name;
    private int soluong;
    private int dongia;
    private static Map<String,Integer> mp = new HashMap<>();

    public BangKe() {
    }

    public BangKe(String name, int soluong,int dongia) {
        this.name = name;
        String a[] = name.toUpperCase().trim().split("\\s+");
        String ans = String.valueOf(a[0].charAt(0)) + String.valueOf(a[1].charAt(0));
        if(!mp.containsKey(ans)) mp.put(ans, 1);
        int tmp = mp.get(ans);
        mp.replace(ans, tmp+1);
        ans += String.format("%02d",tmp);
        this.ma = ans;
        this.soluong = soluong;
        this.dongia = dongia;
    }
   
    public double getPhantramtrietkhau(){
        if(soluong > 10) return 0.05;
        else if(soluong >= 8) return 0.02;
        else if(soluong >=5) return 0.01;
        return 0;
    }
    
    public int getTientrietkhau(){
        return (int) (dongia * soluong * getPhantramtrietkhau());
    }
    
    public int getThanhtien(){
        return soluong * dongia - getTientrietkhau();
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getTientrietkhau()+" "+getThanhtien();
    }

    @Override
    public int compareTo(BangKe o) {
        return o.getTientrietkhau() - this.getTientrietkhau();
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<BangKe> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            int dongia = Integer.parseInt(sc.nextLine());
            list.add(new BangKe(name,soluong,dongia));
        }
        Collections.sort(list);
        for(BangKe x : list){
            System.out.println(x);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/