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

class XangDau implements Comparable<XangDau>{
    private String ma;
    private long soluong;

    public XangDau(String ma, long soluong) {
        this.ma = ma;
        this.soluong = soluong;
    }
    
    public String getHang(){
        String tmp = ma.substring(3);
        if(tmp.equals("BP")) return "British Petro";
        else if(tmp.equals("ES")) return "Esso";
        else if(tmp.equals("SH")) return "Shell";
        else if(tmp.equals("CA")) return "Castrol";
        else if(tmp.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    
    public long getDongia(){
        String tmp = ma.substring(0,1);
        if(tmp.equals("N")) return 9700;
        else if(tmp.equals("D")) return 11200;
        return 128000;
    }
    
    public long getThue(){
        long tmp1 = getDongia() * soluong;
        String tmp2 = ma.substring(0,1);
        if(tmp2.equals("N") && getHang() != "Trong Nuoc") return (long) (tmp1 * 0.02);
        else if(tmp2.equals("D") && getHang() != "Trong Nuoc") return (long) (tmp1 * 0.035);
        else if(tmp2.equals("X") && getHang() != "Trong Nuoc") return (long) (tmp1 * 0.03);
        return 0;
    }
    
    public long getThanhtien(){
        return getDongia() * soluong + getThue();
    }

    @Override
    public String toString() {
        return ma+" "+getHang()+" "+getDongia()+" "+getThue()+" "+getThanhtien();
    }

    @Override
    public int compareTo(XangDau o) {
        return Long.compare(o.getThanhtien(), this.getThanhtien());
    }
}
public class BAITAP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<XangDau> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.next();
            int soluong = sc.nextInt();
            sc.nextLine();
            list.add(new XangDau(ma, soluong));
        }
        Collections.sort(list);
        for(XangDau x : list){
            System.out.println(x);
        }
    }
    
}
