/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05042_BangXepHang;
import java.util.*;

class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int correct;
    private int submit;

    public SinhVien() {
    }

    public SinhVien(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return name+" "+correct+" "+submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.correct != o.correct) return o.correct - this.correct;
        else if(this.submit != o.correct) return this.submit - o.submit;
        return this.name.compareTo(o.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            int correct = sc.nextInt();
            int submit = sc.nextInt();
            sc.nextLine();
            list.add(new SinhVien(name,correct,submit));
        }
        Collections.sort(list);
        for(SinhVien x : list){
            System.out.println(x);
        }
    } 
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/