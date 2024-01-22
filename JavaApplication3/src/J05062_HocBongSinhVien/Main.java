/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05062_HocBongSinhVien;

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
         //TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list1 = new ArrayList<>();
        int t = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            double TBC = sc.nextDouble();
            int RL = sc.nextInt();
            sc.nextLine();
            list1.add(new SinhVien(name, TBC, RL));
        }
        //TẠO BẢN SAO TỪ LIST1
        ArrayList<SinhVien> list2 = (ArrayList<SinhVien>) list1.clone();
        Collections.sort(list2);
        double diemchuan = list2.get(q-1).getTBC();
        for(SinhVien x : list1){
            if(x.getTBC() < diemchuan) x.setHocbong("KHONG");
            System.out.println(x);
        }
    }
    
}
/*
5 2
Nguyen Van Nam
3.59 75
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
Le Gia Quang
3.59 80
Nguyen Truong Son
3.59 81
*/

