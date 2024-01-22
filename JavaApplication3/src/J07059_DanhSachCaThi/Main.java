/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07059_DanhSachCaThi;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

class CaThi implements Comparable<CaThi>{
    static int cnt = 1;
    private String ma;
    private String date;
    private String time;
    private long ID;

    public CaThi(String date, String time, long ID) {
        this.ma = "C" + String.format("%03d",cnt++);
        this.date = date;
        this.time = time;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return ma+" "+date+" "+time+" "+ID;
    }

    @Override
    public int compareTo(CaThi o){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date ngaythi1 = sdf.parse(this.date);
            Date ngaythi2 = sdf.parse(o.date);
            if(ngaythi1.equals(ngaythi2)){
                if(this.time.equals(o.time)) return this.ma.compareTo(o.ma);
                return this.time.compareTo(o.time);
            }
            return ngaythi1.compareTo(ngaythi2);
        }
        catch(Exception e){
        }
        return 0;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        List<CaThi> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String date = sdf.format(sdf.parse(sc.next()));
            String time = sc.next();
            long ID = Long.parseLong(sc.next());
            lst.add(new CaThi(date,time,ID));
        }
        Collections.sort(lst);
        for(CaThi x : lst){
            System.out.println(x);
        }
    }
    
}