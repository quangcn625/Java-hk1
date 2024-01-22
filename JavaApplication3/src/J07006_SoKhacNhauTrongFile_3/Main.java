/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07006_SoKhacNhauTrongFile_3;

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
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        DataInputStream ds = new DataInputStream(new FileInputStream("DATA.in"));
        ObjectInputStream ob = new ObjectInputStream(ds);
        ArrayList<Integer> list = (ArrayList<Integer>) ob.readObject();
        
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int i=0; i<list.size(); i++){
            if(mp.containsKey(list.get(i))){
                mp.put(list.get(i), mp.get(list.get(i)) + 1);
            }
            else{
                mp.put(list.get(i), 1);
            }
        }
        for(Integer x : mp.keySet()){
            System.out.println(x + " " + mp.get(x));
        }
        ob.close();
    }
    
}
