/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class capsocotongbangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
            testCase(sc);
    }
    static void testCase(Scanner sc){
        int n = sc.nextInt();
        int [] arr = new int [n];
        int k = sc.nextInt();
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(!mp.containsKey(arr[i])) mp.put(arr[i],0);
            mp.put( arr[i], mp.get(arr[i]) + 1 );
        }
        
        long res = 0;
        for(int i = 0; i < n; i++)
            if( mp.get(k-arr[i]) != null ){
                res += mp.get(k-arr[i]);
                if(k == arr[i]*2) res --;
            }
        
        System.out.println(res/2);
    }
}
