/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07057_DiemTuyenSinh;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<TuyenSinh> list = new ArrayList<>();
        while(t-->0){
            list.add(new TuyenSinh(sc));
        }
        Collections.sort(list);
        for(TuyenSinh x : list){
            System.out.println(x);
        }
    }
    
}
