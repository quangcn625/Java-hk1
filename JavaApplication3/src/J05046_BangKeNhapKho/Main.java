/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05046_BangKeNhapKho;
import java.util.*;

class BangKe{
    private String name;
    private int soluong;
    private long dongia;
    private static Map<String,Integer> mp = new HashMap<>();

    public BangKe() {
    }

    public BangKe(String name, int soluong, long dongia) {
        this.name = name;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    
    public String getMa(){
        String a[] = name.toUpperCase().trim().split("\\s+");
        String ans = String.format("%c%c",a[0].charAt(0),a[1].charAt(0));
        if(!mp.containsKey(ans)) mp.put(ans, 1);
        int tmp = mp.get(ans);
        mp.replace(ans, tmp+1);
        ans += String.format("%02d",tmp);
        return ans;
    }
    
    public double getPhantramtrietkhau(){
        if(soluong > 10) return 0.05;
        else if(soluong >= 8 && soluong <=10) return 0.02;
        else if(soluong >=5 && soluong < 8) return 0.01;
        return 0;
    }
    
    public long getTientrietkhau(){
        return (long) (dongia * soluong * getPhantramtrietkhau());
    }
    
    public long getThanhtien(){
        return soluong * dongia - getTientrietkhau();
    }

    @Override
    public String toString() {
        return getMa()+" "+name+" "+getTientrietkhau()+" "+getThanhtien();
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
            long dongia = Long.parseLong(sc.nextLine());
            list.add(new BangKe(name,soluong,dongia));
        }
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