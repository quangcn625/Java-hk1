/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05068_SapXepBangGiaXangDau;
import java.util.*;

class XangDau implements Comparable<XangDau>{
    private String madonhang;
    private long soluong;

    public XangDau() {
    }

    public XangDau(String madonhang, long soluong) {
        this.madonhang = madonhang;
        this.soluong = soluong;
    }
    
    public String getHangSX(){
        String x = madonhang.substring(3);
        if(x.equals("BP")) return "British Petro";
        if(x.equals("ES")) return "Esso";
        if(x.equals("SH")) return "Shell";
        if(x.equals("CA")) return "Castrol";
        if(x.equals("MO")) return "Mobil";
        if(x.equals("TN")) return "Trong Nuoc";
        return null;
    }
    
    public long getDongia(){
        String x = madonhang.substring(0,1);
        if(x.equals("X")) return 128000;
        if(x.equals("D")) return 11200;
        if(x.equals("N")) return 9700;
        return 0;
    }
    
    public long getThue(){
        String x = madonhang.substring(0,1);
        String y = madonhang.substring(3);
        if(y.equals("TN")) return 0;
        if(x.equals("X")) return (long) (soluong * getDongia() * 0.03);
        if(x.equals("D")) return (long) (soluong * getDongia() * 0.035);
        if(x.equals("N")) return (long) (soluong * getDongia() * 0.02);
        return 0;
    }
    
    public long getThanhtien(){
        return soluong * getDongia() + getThue();
    }

    @Override
    public String toString() {
        return madonhang+" "+getHangSX()+" "+getDongia()+" "+getThue()+" "+getThanhtien();
    }

    @Override
    public int compareTo(XangDau o) {
        return Long.compare(o.getThanhtien(), this.getThanhtien());
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<XangDau> list = new ArrayList<>();
        while(t-->0){
            String s = sc.next();
            long qty = sc.nextLong();
            list.add(new XangDau(s, qty));
        }
        Collections.sort(list);
        for(XangDau x : list){
            System.out.println(x);
        }
    }
}
/*
3
N89TN 4500
D00BP 3500
X92SH 2600
*/