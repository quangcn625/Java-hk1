/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05013_TuyenDung;

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
        List<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            double lythuyet = Double.parseDouble(sc.nextLine());
            double thuchanh = Double.parseDouble(sc.nextLine());
            list.add(new NhanVien(name, lythuyet, thuchanh));
        }
        Collections.sort(list);
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
*/
