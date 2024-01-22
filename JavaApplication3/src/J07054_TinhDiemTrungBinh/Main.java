/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07054_TinhDiemTrungBinh;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
class TrungBinh{
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(name, d1, d2, d3));
        }
        Collections.sort(list);
        list.get(0).setThuhang(1);
        System.out.println(list.get(0));
        for(int i=1; i<list.size(); i++){
            if(list.get(i).getTongdiem() == list.get(i-1).getTongdiem()){
                list.get(i).setThuhang(list.get(i-1).getThuhang());
            }
            else{
                list.get(i).setThuhang(i+1);
            }
            System.out.println(list.get(i));
        }
    }
    
}
/*
2
 ha Thi kieu     anh
7
6
7
Pham    THI  HAO
6
7
6
*/
