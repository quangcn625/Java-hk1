/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HoangHung;

/**
 *
 * @author WIN
 */
import java.util.*;

class XeBuyt implements Comparable<XeBuyt>{
    private static int cnt = 1;
    private String ma;
    private String name;
    private String ngaydi;
    private int sohieutuyen;
    private int soluotdiduoc;
    private String kieungay;

    public XeBuyt(String name, String ngaydi, int sohieutuyen, int soluotdiduoc, String kieungay) {
        this.ma = String.format("HN"+String.valueOf(sohieutuyen)+"%02d",cnt++);
        this.name = name;
        this.ngaydi = ngaydi;
        this.sohieutuyen = sohieutuyen;
        this.soluotdiduoc = soluotdiduoc;
        this.kieungay = kieungay;
    }
    
    public int getDoanhthu(){
        int doanhthu = 0;
        if(soluotdiduoc < 5) doanhthu = soluotdiduoc * 800;
        else if(soluotdiduoc >= 5 && soluotdiduoc <= 10) doanhthu = soluotdiduoc * 780;
        else if(soluotdiduoc > 10) doanhthu = soluotdiduoc * 750;
        if(kieungay.equals("nghi")) doanhthu = (int) Math.round(doanhthu + doanhthu * 0.1);
        else if(kieungay.equals("le")) doanhthu = (int) Math.round(doanhthu + doanhthu * 0.2);
        return doanhthu;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+ngaydi+" "+sohieutuyen+" "+soluotdiduoc+" "+kieungay+" "+getDoanhthu();
    }

    @Override
    public int compareTo(XeBuyt o) {
        if(this.getDoanhthu() == o.getDoanhthu()) return o.sohieutuyen - this.sohieutuyen;
        return o.getDoanhthu() - this.getDoanhthu();
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<XeBuyt> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String ngaydi = sc.nextLine();
            int sohieutuyen = Integer.parseInt(sc.nextLine());
            int soluotdi = Integer.parseInt(sc.nextLine());
            String kieungay = sc.nextLine();
            list.add(new XeBuyt(name, ngaydi, sohieutuyen, soluotdi, kieungay));
        }
        Collections.sort(list);
        for(XeBuyt x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
To An An
12/09/2023
1
9
thuong
do trung tuan
28/03/2023
21
9
thuong
Vu thi Hoa
10/10/2023
10
15
le
*/
