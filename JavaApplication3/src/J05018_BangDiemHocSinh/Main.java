/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05018_BangDiemHocSinh;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<HocSinh> list = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine(); 
            double toan = sc.nextDouble();
            double tiengviet = sc.nextDouble();
            double ngoaingu = sc.nextDouble();
            double vatly = sc.nextDouble();
            double hoahoc = sc.nextDouble();
            double sinh = sc.nextDouble();
            double su = sc.nextDouble();
            double dia = sc.nextDouble();
            double congdan = sc.nextDouble();
            double congnghe = sc.nextDouble();
            sc.nextLine();
            HocSinh x = new HocSinh(name,toan,tiengviet,ngoaingu,vatly,hoahoc,sinh,su,dia,congdan,congnghe);
            list.add(x);
        }
        Collections.sort(list);
        for(HocSinh x : list){
            System.out.println(x);
        }
    }
}
/*
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/
