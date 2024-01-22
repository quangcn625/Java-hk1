/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05054_XepHangHocSinh;
import java.util.*;

public class XepHangHocSinh {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list1 = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            double diemTB = Double.parseDouble(sc.nextLine());
            list1.add(new HocSinh(name, diemTB));
        }
        ArrayList<HocSinh> list2 = (ArrayList<HocSinh>) list1.clone();
        Collections.sort(list2);
        Map<String, Integer> mp = new HashMap<>();
        mp.put(list2.get(0).getId(), 1);
        for(int i=1; i<list2.size(); i++){
            if(list2.get(i).getDiemTB() == list2.get(i-1).getDiemTB()){
                mp.put(list2.get(i).getId(), mp.get(list2.get(i-1).getId()));
            }
            else{
                mp.put(list2.get(i).getId(), i+1);
            }
        }
        for(HocSinh i: list1) {
            for(Map.Entry<String, Integer> x : mp.entrySet()){
                if(i.getId().equals(x.getKey())){
                    System.out.println(i + " " + x.getValue());
                    break;
                }
            }
        }
    }
}
/*
6
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
Le Gia Quang
9.2
Nguyen Truong Son
9.2
Bui Truong Son
5.9
*/