/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07085_TongChuSo;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.math.BigInteger;

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
        
        ArrayList<String> list = (ArrayList<String>) ob.readObject();
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Jhsf00dklT12uhf780LPPZH");
//        list.add("AAAAddd0000000000000000001T");
        for(String x : list){
            String ans = "";
            long tong = 0;
            for(int i=0; i<x.length(); i++){
                if(Character.isDigit(x.charAt(i))){
                    ans += String.valueOf(x.charAt(i));
                    tong += Long.parseLong(String.valueOf(x.charAt(i)));
                }
                else continue;
            }
            BigInteger bg = new BigInteger(ans);
            System.out.println(bg + " " + tong);
        }
        ob.close();
    }
    
}
