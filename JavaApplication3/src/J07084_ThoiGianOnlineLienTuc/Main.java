/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07084_ThoiGianOnlineLienTuc;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

class Time implements Comparable<Time>{
    private String name;
    private String timeS;
    private String timeF;

    public Time(String name, String timeS, String timeF) {
        this.name = name;
        this.timeS = timeS;
        this.timeF = timeF;
    }
    
    public long getThoigian(String s1, String s2){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date d1 = sdf.parse(s1);
            Date d2 = sdf.parse(s2);
            return (d2.getTime() - d1.getTime()) / (1000 * 60);
        }catch(Exception e){
            
        }
        return 0;
    }

    @Override
    public String toString() {
        return name+" "+getThoigian(timeS, timeF);
    }

    @Override
    public int compareTo(Time o) {
        return Long.compare(getThoigian(o.timeS, o.timeF),getThoigian(this.timeS, this.timeF));
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Time> lst = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String timeS = sc.nextLine();
            String timeF = sc.nextLine();
            lst.add(new Time(name, timeS, timeF));
        }
        Collections.sort(lst);
        for(Time x : lst){
            System.out.println(x);
        }
    }
    
}
