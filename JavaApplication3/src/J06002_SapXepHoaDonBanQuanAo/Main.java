/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J06002_SapXepHoaDonBanQuanAo;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list1 = new ArrayList<>();
        ArrayList<HoaDon> list2 = new ArrayList<>();
        while(t-->0){
            String maloai = sc.nextLine();
            String nameSP = sc.nextLine();
            long loai1 = Long.parseLong(sc.nextLine());
            long loai2 = Long.parseLong(sc.nextLine());
            list1.add(new SanPham(maloai, nameSP, loai1, loai2));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String mahoadon = sc.next();
            long soluongmua = sc.nextLong();
            sc.nextLine();
            list2.add(new HoaDon(mahoadon, soluongmua, list1));
        }
        Collections.sort(list2);
        for(HoaDon x : list2){
            System.out.println(x);
        }
    }
    
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/


