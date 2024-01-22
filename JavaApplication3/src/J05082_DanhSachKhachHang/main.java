/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05082_DanhSachKhachHang;

/**
 *
 * @author WIN
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            Date dob = sdf.parse(sc.nextLine());
            String dc = sc.nextLine();
            arr.add(new KhachHang(name, sex, dob, dc));
        }
        Collections.sort(arr);
        for(KhachHang x : arr){
            System.out.println(x);
        }
    }
    
}
/*
2
 nGuyen VAN     nAm
Nam
02/2/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
1/2/1997
Phung Khoang-Nam Tu Liem-Ha Noi
*/
