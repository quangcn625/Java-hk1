/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07003_TachDoiVaTinhTong;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author WIN
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = "";
        if(sc.hasNextLine()) s = sc.nextLine();
        while(s.length()>1){
            s = new BigInteger(s.substring(0,s.length()/2)).add(new BigInteger(s.substring(s.length()/2))).toString();
            System.out.println(s);
        }
    }
    
}
