/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07005_SoKhacNhauTrongFile_2;

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
        DataInputStream data = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=1; i<=100000; i++){
            int n = data.readInt();
            if(mp.containsKey(n)){
                mp.put(n, mp.get(n)+1);
            }
            else{
                mp.put(n, 1);
            }
        }
        data.close();
        for(Integer x : mp.keySet()){
            System.out.println(x + " " + mp.get(x));
        }
    }
    
}
