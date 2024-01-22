/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danhsachsinhvien1;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException, FileNotFoundException {
        // TODO code application logic here
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> list1 = (ArrayList<SinhVien>) ob.readObject();
        for(SinhVien x : list1){
            System.out.println(x);
        }
    }
    
}
