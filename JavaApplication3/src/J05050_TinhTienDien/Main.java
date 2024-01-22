/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05050_TinhTienDien;
import java.util.*;

class TienDien{
    static int cnt = 1;
    private String ma;
    private String LoaiSD;
    private int chisocu;
    private int chisomoi;

    public TienDien() {
    }

    public TienDien(String LoaiSD, int chisocu, int chisomoi) {
        this.ma = String.format("KH%02d",cnt++);
        this.LoaiSD = LoaiSD;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public int getHeso(){
        if(LoaiSD.equals("KD")) return 3;
        else if(LoaiSD.equals("NN")) return 5;
        else if(LoaiSD.equals("TT")) return 4;
        else return 2;
    }
    
    public long getThanhtien(){
        return (chisomoi - chisocu) * getHeso() * 550;
    }
    
    public long getPhutroi(){
        if(chisomoi-chisocu < 50) return 0;
        else if(chisomoi-chisocu >= 50 && chisomoi-chisocu <= 100) return (long) Math.round(getThanhtien() * 0.35f);
        else return getThanhtien();
    }
    
    public long getTongtien(){
        return getThanhtien() + getPhutroi();
    }

    @Override
    public String toString() {
        return ma+" "+getHeso()+" "+getThanhtien()+" "+getPhutroi()+" "+getTongtien();
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TienDien> list = new ArrayList<>();
        while(t-->0){
            String loaiSD = sc.nextLine();
            int chisocu = Integer.parseInt(sc.nextLine());
            int chisomoi = Integer.parseInt(sc.nextLine());
            list.add(new TienDien(loaiSD,chisocu,chisomoi));
        }
        for(TienDien x : list){
            System.out.println(x);
        }
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/
