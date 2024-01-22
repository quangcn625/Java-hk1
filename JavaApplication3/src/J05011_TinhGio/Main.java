/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05011_TinhGio;
import java.util.*;

class Time implements Comparable<Time>{
    private String ma;
    private String name;
    private String start;
    private String finish;

    public Time() {
    }

    public Time(String ma, String name, String start, String finish) {
        this.ma = ma;
        this.name = name;
        this.start = start;
        this.finish = finish;
    }
    
    public int getTimeplay(){
        int tmp1 = Integer.parseInt(start.substring(0, 2));
        int tmp2 = Integer.parseInt(finish.substring(0, 2));
        int tmp3 = Integer.parseInt(start.substring(3));
        int tmp4 = Integer.parseInt(finish.substring(3));
        return (tmp2-tmp1)*60+(tmp4-tmp3);
    }
    
    public String getTime(){
        return String.valueOf(this.getTimeplay()/60)+" gio "+String.valueOf(this.getTimeplay()%60)+" phut";
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+getTime();
    }

    @Override
    public int compareTo(Time o) {
        if(this.getTimeplay()<o.getTimeplay()) return 1;
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Time> list = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            list.add(new Time(ma,name,start,finish));
        }
        Collections.sort(list);
        for(Time x : list){
            System.out.println(x);
        }
    } 
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/
//06T  Hoang Van Nam 2 gio 30 phut
