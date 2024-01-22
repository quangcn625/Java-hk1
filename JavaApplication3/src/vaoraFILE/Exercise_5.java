/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaoraFILE;

/**
 *
 * @author WIN
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercise_5 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E://VAO RA FILE//input.txt"));
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            String a[] = x.trim().split("\\s+");
            String ma = a[0];
            String name = a[1];
            double diemTB = 0;
            for(int i=2; i<a.length; i++) {
                diemTB += Double.parseDouble(a[i]);
            }
            System.out.println(name+" "+ma+" "+String.format("%.2f",diemTB)+" "+String.format("%.2f",1.0*diemTB/(a.length - 2)));
        }
    }
}
