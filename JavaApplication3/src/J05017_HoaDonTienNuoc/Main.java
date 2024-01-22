/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05017_HoaDonTienNuoc;

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
        List<Nuoc> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            int chisocu = Integer.parseInt(sc.nextLine());
            int chisomoi = Integer.parseInt(sc.nextLine());
            list.add(new Nuoc(name, chisocu, chisomoi));
        }
        Collections.sort(list);
        for(Nuoc x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/
