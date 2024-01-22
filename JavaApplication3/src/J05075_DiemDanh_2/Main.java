/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05075_DiemDanh_2;

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
        int t = Integer.parseInt(sc.nextLine());
        int k = t;
        ArrayList<SinhVien> list1 = new ArrayList<>();
        ArrayList<DiemDanh> list2 = new ArrayList<>();
        while(t-->0){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            list1.add(new SinhVien(msv, name, lop));
        }
        while(k-->0){
            String ma = sc.next();
            String dulieudiemdanh = sc.next();
            sc.nextLine();
            list2.add(new DiemDanh(ma, dulieudiemdanh, list1));
        }
        String tmp = sc.next();
        for(SinhVien x : list1){
            if(x.lop.equals(tmp)){
                for(DiemDanh y : list2){
                    if(x.getMsv().equals(y.getMa())){
                        if(y.getDiemchuyencan()==0){
                            System.out.println(y+" KDDK");
                        }
                        else{
                            System.out.println(y);
                        }
                    }
                }
            }
        }
    }
    
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
*/

