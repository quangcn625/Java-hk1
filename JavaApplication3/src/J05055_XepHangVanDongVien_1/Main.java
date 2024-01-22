/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05055_XepHangVanDongVien_1;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> list1 = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            String TimeStart = sc.nextLine();
            String TimeFinish = sc.nextLine();
            list1.add(new VanDongVien(name, dob, TimeStart, TimeFinish));
        }
        ArrayList<VanDongVien> list2 = (ArrayList<VanDongVien>) list1.clone();
        Collections.sort(list2);
        Map<String, Integer> mp = new HashMap<>();
        mp.put(list2.get(0).getMa(), 1);
        for(int i=1; i<list2.size(); i++){
            if(list2.get(i).getThoigianxephang().equals(list2.get(i-1).getThoigianxephang())){
                mp.put(list2.get(i).getMa(), mp.get(list2.get(i-1).getMa()));
            }
            else{
                mp.put(list2.get(i).getMa(), i + 1);
            }
        }
        for(VanDongVien x : list1){
            for(Map.Entry<String, Integer> y : mp.entrySet()){
                if(y.getKey().equals(x.getMa())){
                    System.out.println(x + " " + y.getValue());
                    break;
                }
            }
        }
    } 
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/
