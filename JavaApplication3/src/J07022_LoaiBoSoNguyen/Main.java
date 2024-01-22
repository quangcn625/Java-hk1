/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07022_LoaiBoSoNguyen;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String x : list){
            System.out.print(x+" ");
        }
    }
    
}
