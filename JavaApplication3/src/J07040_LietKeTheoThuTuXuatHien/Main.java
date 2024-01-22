/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07040_LietKeTheoThuTuXuatHien;

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
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        DataInputStream da = new DataInputStream(new FileInputStream("NHIPHAN.in"));
        ObjectInputStream ob = new ObjectInputStream(da);
        ArrayList<String> list = (ArrayList<String>) ob.readObject();
        Set<String> se1 = new LinkedHashSet<>();
        for(String i : list){
            String a[] = i.trim().toLowerCase().split("\\s+");
            for(String j : a){
                se1.add(j);
            }
        }
        
        Set<String> se2 = new LinkedHashSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(se1.contains(s)) se2.add(s);
        }
        
        for(String x : se2){
            System.out.println(x);
        }
    }
    
}
