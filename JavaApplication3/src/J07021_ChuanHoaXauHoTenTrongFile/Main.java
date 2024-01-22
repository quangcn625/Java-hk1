/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07021_ChuanHoaXauHoTenTrongFile;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
public class Main {

    /**
     */
    public static String ChuanHoa(String s){
        String a[] = s.toLowerCase().trim().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) +" ";
        }
        return ans.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int ok = 1;
        while(sc.hasNextLine() && ok == 1){
            String s = sc.nextLine();
            if(s.equals("END")){
                ok = 0;
                continue;
            }
            System.out.println(ChuanHoa(s));
        }
    }
    
}
