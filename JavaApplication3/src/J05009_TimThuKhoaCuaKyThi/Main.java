/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05009_TimThuKhoaCuaKyThi;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        Vector<Double> vc = new Vector<>();
        while(t-->0){
            String name = sc.nextLine();
            String date = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            double tongdiem = d1 + d2 + d3;
            vc.add(tongdiem);
            SinhVien x = new SinhVien(name,date,d1,d2,d3);
            list.add(x);
        }
        double tmp = Collections.max(vc);
        List<SinhVien> arr = new ArrayList<>();
        for(SinhVien x : list){
            if(x.getTongdiem() == tmp) arr.add(x);
        }
        Collections.sort(arr);
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
/*
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/