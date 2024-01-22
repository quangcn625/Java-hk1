/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J03022_XuLyVanBan;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        boolean ok = true;
        String ans = "";
        while(sc.hasNext() && ok){
            String s = sc.next().toLowerCase();
            if(s.equals("0")){
                ok = false;
                break;
            }
            if(!s.equals(" ")){
                int n = s.length();
                if(s.charAt(n-1)=='.' || s.charAt(n-1)=='?' || s.charAt(n-1)=='!'){
                    ans += s.substring(0, n-1);
                    list.add(ans);
                    ans = "";
                }
                else{
                    ans += s + " ";
                }
            }
        }
        for(String i : list){
            String tmp = i.substring(0, 1).toUpperCase() + i.substring(1);
            System.out.println(tmp);
        }
    }
    
}

