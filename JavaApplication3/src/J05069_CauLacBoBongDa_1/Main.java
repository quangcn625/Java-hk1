/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05069_CauLacBoBongDa_1;
import java.util.*;

class BongDa{
    private String ma;
    private String name;
    private int giave;

    public BongDa() {
    }

    public BongDa(String ma, String name, int giave) {
        this.ma = ma;
        this.name = name;
        this.giave = giave;
    }

    public String getMa() {
        return ma;
    }

    public int getGiave() {
        return giave;
    }

    public String getName() {
        return name;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<BongDa> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int giave = Integer.parseInt(sc.nextLine());
            list.add(new BongDa(ma,name,giave));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.next();
            String tmp = s.substring(1, 3);
            int socodongvien = sc.nextInt();
            for(BongDa x : list){
                if(tmp.equals(x.getMa())){
                    System.out.println(s + " " + x.getName() + " " + x.getGiave() * socodongvien);
                }
            }
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/
