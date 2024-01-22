/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05019_LuongMuaTrungBinh;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LuongMua> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String thoidiembd = sc.nextLine();
            String thoidiemkt = sc.nextLine();
            int luongmua = Integer.parseInt(sc.nextLine());
            LuongMua tmp = new LuongMua(name, thoidiembd, thoidiemkt, luongmua);
            int check = 0;
            for(LuongMua x : list){
                if(x.getName().equals(name)){
                    check = 1;
                    x.update(tmp);
                    break;
                }
            }
            if(check == 0){
                list.add(tmp);
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print("T" + String.format("%02d",i+1));
            System.out.println(" " + list.get(i));
        }
    }
    
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/
