/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package J08011_LietKeVaDem;

import java.util.*;

public class Main {
    public static boolean solve(String s) {
        for(int i = 1; i < s.length(); i++) {
            if((s.charAt(i) - '0') < (s.charAt(i - 1) - '0')) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> arr = new LinkedHashMap<>();

        boolean oke = true;
        while(sc.hasNext()) {
            String s = sc.next();
//            if(s.equals("0")){
//                oke = false;
//                break;
//            }
            if(solve(s)) {
                if(arr.containsKey(s)) {
                    arr.put(s, arr.get(s) + 1);
                } else{
                    arr.put(s, 1);
                }
            }
        }
        ArrayList<Map.Entry<String, Integer>> b = new ArrayList<>(arr.entrySet());
//        Comparator<Map.Entry<String, Integer>> c = new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return -o1.getValue().compareTo(o2.getValue());
//            }
//        };
        
        Comparator<Map.Entry<String, Integer>> c = (o1, o2) -> -o1.getValue().compareTo(o2.getValue());
        b.sort(c);
        for(Map.Entry<String, Integer> i : b) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
/*
123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134
 */
