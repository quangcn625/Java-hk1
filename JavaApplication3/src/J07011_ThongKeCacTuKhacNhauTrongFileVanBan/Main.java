/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07011_ThongKeCacTuKhacNhauTrongFileVanBan;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        String a = "";
        while(t-->0){
            a = a + sc.nextLine().toLowerCase()+" ";
        }
        //cắt chuỗi có khoảng trắng và nhiều kí tự không phải số hoặc chữ
        String data[] = a.split("\\W\\s*");
        Map<String, Integer> mp = new HashMap<>();
        for(String x : data){
            if(!x.equals("")){
                if(mp.containsKey(x)){
                    mp.put(x, mp.get(x) + 1);
                }
                else{
                    mp.put(x, 1);
                }
            }
        }
        
        //Sorted list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for(Map.Entry<String, Integer> x : list){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    
}
/*
PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!
Khi dich benh xuat hien PTIT trich hon 6 ty dong ho tro sinh vien PTIT
voi muc ho tro 500000 dong/sinh vien PTIT.
*/
