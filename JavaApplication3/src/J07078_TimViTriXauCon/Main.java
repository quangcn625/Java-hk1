/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07078_TimViTriXauCon;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            int k = 0;
            while(true){
                k = a.indexOf(b, k);
                if(k == -1) break;
                System.out.printf("%d ",++k);
            }
            System.out.println();
        }
    }
    
}
