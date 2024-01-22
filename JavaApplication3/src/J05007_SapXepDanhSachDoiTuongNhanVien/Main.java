/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05007_SapXepDanhSachDoiTuongNhanVien;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String date = sc.nextLine();
            NhanVien x = new NhanVien(name,gender,dob,dc,mst,date);
            a.add(x);
        }
        Collections.sort(a);
        for (NhanVien x : a) {
            System.out.println(x);
        }
    }
    
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/
