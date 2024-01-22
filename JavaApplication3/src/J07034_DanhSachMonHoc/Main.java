/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07034_DanhSachMonHoc;

/**
 *
 * @author WIN
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MonHoc implements Comparable<MonHoc>{
    private String  ma;
    private String  name;
    private int sotinchi;

    public MonHoc() {
    }

    public MonHoc(String ma, String name, int sotinchi) {
        this.ma = ma;
        this.name = name;
        this.sotinchi = sotinchi;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + sotinchi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.name.compareTo(o.name);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //xoa duong dan di
        Scanner sc = new Scanner(new File("E://VAO RA FILE//MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int sotinchi = Integer.parseInt(sc.nextLine());
            list.add(new MonHoc(ma,name,sotinchi));
        }
        Collections.sort(list);
        for(MonHoc x : list){
            System.out.println(x);
        }
    }
}
/*
2
INT1155
Tin hoc co so 2
2
SKD1103
Ky nang tao lap Van ban
1
*/
