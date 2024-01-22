/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WIN
 */
import java.util.*;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x == 0) System.out.printf("VN\n");
        else if(y == 0) System.out.printf("VSN\n");
        else System.out.printf("%.2f\n",-y/x);
    }
}
