/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J08010_TimTuThuanNghichNghichDaiNhat;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    static boolean check(String s){
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<>();
        
        boolean ok = true;
        int ans = 0;
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext() && ok){
            String s = sc.next();
            if(s.equals("0")){
                ok = false;
                break;
            }
            if(check(s)){
                ans = Math.max(ans, s.length());
                list.add(s);
            }
        }
        for(String i : list){
            if(i.length() == ans){
                if(mp.containsKey(i)) mp.put(i, mp.get(i) + 1);
                else mp.put(i, 1);
            }
        }
        
        for(String i : mp.keySet()){
            System.out.println(i + " " + mp.get(i));
        }
    }
    
}
/*
AAAAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAAAA AD DA HDHDH AAAAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
*/
