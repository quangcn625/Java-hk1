/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT3;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> list1 = new ArrayList<>();
        while(t1-->0){
            String mamon = sc1.nextLine();
            String tenmon = sc1.nextLine();
            String hinhthucthi = sc1.nextLine();
            list1.add(new MonHoc(mamon, tenmon, hinhthucthi));
        }
        
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<CaThi> list2 = new ArrayList<>();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        while(t2-->0){
            String ngaythi = sc2.nextLine();
            String giothi = sc2.nextLine();
            String phongthi = sc2.nextLine();
            list2.add(new CaThi(ngaythi, giothi, phongthi));
        }
        
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        int t3 = Integer.parseInt(sc3.nextLine());
        ArrayList<LichThi> list3 = new ArrayList<>();
        while(t3-->0){
            String macathi = sc3.next();
            String mamon = sc3.next();
            String manhom = sc3.next();
            String sosinhvien = sc3.next();
            list3.add(new LichThi(macathi, mamon, manhom, sosinhvien, list1, list2));
        }
        Collections.sort(list3);
        for(LichThi x : list3){
            System.out.println(x);
        }
    }
}

