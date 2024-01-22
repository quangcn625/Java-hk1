/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05079_LopHocPhan_1;

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
        List<GiangVien> lst1 = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            String nameMH = sc.nextLine();
            String nhom = sc.nextLine();
            String nameGV = sc.nextLine();
            lst1.add(new GiangVien(ma, nameMH, nhom, nameGV));
        }
        Collections.sort(lst1);
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            String tmp = sc.nextLine();
            for(GiangVien x : lst1){
                if(tmp.equals(x.getMa())){
                    System.out.println("Danh sach nhom lop mon " + x.getNameMH() + ":");
                    break;
                }
            }
            for(GiangVien x : lst1){
                if(tmp.equals(x.getMa())){
                    System.out.println(x);
                }
            }
        }
    }
    
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
*/
