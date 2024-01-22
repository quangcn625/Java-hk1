/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07012_ThongKeCacTuKhacNhauTrongFileNhiPhan;

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
        DataInputStream da = new DataInputStream(new FileInputStream("DATA.in"));
        ObjectInputStream ob = new ObjectInputStream(da);
        ArrayList<String> arr = (ArrayList<String>)ob.readObject();
        
        String s = "";
        for(String x : arr){
            s += x.toLowerCase() + " ";
        }
        String a[] = s.split("\\W\\s*");
        Map<String, Integer> mp = new HashMap<>();
        for(String x : a){
            if(!x.equals("")){
                if(mp.containsKey(x)){
                    mp.put(x, mp.get(x)+1);
                }
                else{
                    mp.put(x, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for(Map.Entry<String, Integer> x : list){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    
}
