/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT2;

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
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("E:/VAO RA FILE/INSTITUTION.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<Truong> list1 = new ArrayList<>();
        while(t1-->0){
            String matruong = sc1.next();
            String tentruong = sc1.nextLine();
            sc1.nextLine();
            list1.add(new Truong(matruong, tentruong));
        }
        
        Scanner sc2 = new Scanner(new File("E:/VAO RA FILE/REGISTER.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<Doi> list2 = new ArrayList<>();
        while(t2-->0){
            String maTruong = sc2.next();
            int sonhom = sc2.nextInt();
            sc2.nextLine();
            ArrayList<TenDoi> list3 = new ArrayList<>();
            while(sonhom-->0){
                String NameTeam = sc2.nextLine();
                list3.add(new TenDoi(NameTeam));
            }
            list2.add(new Doi(maTruong, sonhom, list3, list1));
        }
        for(Doi x : list2){
            System.out.println(x.getMatruong()+" "+x.getTmp().getNametruong());
        }
    }
    
}
