/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Set<String> se = new HashSet<>();
        sc.nextLine();
        Map<String,Integer> mp = new HashMap<>();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String a[] = s.trim().split("\\s+");
            String s1 = a[a.length-1];
            for(int i=0; i<a.length-1; i++){
                s1 = s1 + String.valueOf(a[i].charAt(0));
            }
            if(!mp.containsKey(s1)) mp.put(s1,1);
            int tmp = mp.get(s1);
            mp.replace(s1, tmp+1);
            if(tmp != 1){
                s1 += String.valueOf(tmp) + "@ptit.edu.vn";
            }
            else
            {
                s1 += "@ptit.edu.vn";
            }
            System.out.println(s1);
        }
    }
}
/*
4
    nGUYEn    quaNG   vInH  
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
*/
