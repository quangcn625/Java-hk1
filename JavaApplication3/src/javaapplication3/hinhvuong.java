/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int b[] = new int[4];
        Vector<Integer> vc1 = new Vector<>();
        Vector<Integer> vc2 = new Vector<>();
        for(int i=0; i<4; i++){
            a[i] = sc.nextInt();
            if(i % 2 == 0){
                vc1.add(a[i]);
            }
            else{
                vc2.add(a[i]);
            }
        }
        for(int i=0; i<4; i++){
            b[i] = sc.nextInt();
            if(i % 2 == 0){
                vc1.add(b[i]);
            }
            else{
                vc2.add(b[i]);
            }
        }
        int x1 = Collections.max(vc1);
        int x2 = Collections.min(vc1);
        int y1 = Collections.max(vc2);
        int y2 = Collections.min(vc2);
        System.out.println(Math.max(x1-x2,y1-y2)*Math.max(x1-x2,y1-y2));
    }
}
