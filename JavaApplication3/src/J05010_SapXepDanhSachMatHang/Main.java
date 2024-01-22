/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05010_SapXepDanhSachMatHang;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String nhomhang = sc.nextLine();
            double giamua = Double.parseDouble(sc.nextLine());
            double giaban = Double.parseDouble(sc.nextLine());
            MatHang x = new MatHang(name,nhomhang,giamua,giaban);
            list.add(x);
        }
        Collections.sort(list);
        for(MatHang x : list){
            System.out.println(x);
        }
    }
    
}
/*
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/