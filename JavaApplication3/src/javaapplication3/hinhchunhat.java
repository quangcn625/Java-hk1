/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WIN
 */
import java.util.*;
        
public class hinhchunhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieudai = sc.nextInt();
        int chieurong = sc.nextInt();
        if(chieudai <= 0 || chieurong <= 0) System.out.println("0");
        else
        {
            System.out.print((chieudai + chieurong) * 2 + " ");
            System.out.print(chieudai * chieurong);
        }
           
    }
    
}
