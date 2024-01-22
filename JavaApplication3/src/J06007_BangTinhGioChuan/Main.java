/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J06007_BangTinhGioChuan;

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
        
        int t1 = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> list1 = new ArrayList<>();
        while(t1-->0){
            String mamon = sc.next().trim();
            String tenmon = sc.nextLine().trim();
            //sc.nextLine();
            list1.add(new MonHoc(mamon, tenmon));
        }
        
        int t2 = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> list2 = new ArrayList<>();
        while(t2-->0){
            String maGV = sc.next().trim();
            String nameGV = sc.nextLine().trim();
            sc.nextLine();
            list2.add(new GiangVien(maGV, nameGV));
        }

        int t3 = sc.nextInt();
        sc.nextLine();
        ArrayList<Time> list3 = new ArrayList<>();
        while(t3-->0){
            String maGV = sc.next().trim();
            String mamon = sc.next().trim();
            double giochuan = sc.nextDouble();
            list3.add(new Time(maGV, mamon, giochuan, list1, list2));
        }
        for(Time x : list3){
            System.out.println(x);
        }
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
*/

