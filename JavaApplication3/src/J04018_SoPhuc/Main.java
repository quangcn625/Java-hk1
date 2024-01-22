/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J04018_SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc tmp = a.C(a, b);
            SoPhuc c = tmp.D(tmp, a);
            SoPhuc d = tmp.D(tmp, tmp);
            System.out.println(c +", "+d);
        }
    }
}
