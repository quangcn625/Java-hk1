/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05016_HoaDobnKhachSan;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.text.*;
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name = sc.nextLine().trim();
            String sophong = sc.nextLine().trim();
            Date ngaynhanphong = sdf.parse(sc.nextLine().trim());
            Date ngaytraphong = sdf.parse(sc.nextLine().trim());
            int dichvuphatsinh = Integer.parseInt(sc.nextLine().trim());
            list.add(new KhachHang(name, sophong, ngaynhanphong, ngaytraphong, dichvuphatsinh));
        }
        Collections.sort(list);
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
    
}
/*
3
Huynh Van Thanh   
103 
05/06/2010   
05/06/2010   
15
Le Duc Cong  
106 
08/03/2010   
01/05/2010   
220
Tran Thi Bich Tuyen   
207 
10/04/2010   
21/04/2010   
96
*/
