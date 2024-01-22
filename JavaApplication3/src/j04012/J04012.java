/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04012;
import java.util.*;

class Cong{
    private String mnv,name,chucvu;
    private int luongcoban,songay,luong,thuong,phucap,thunhap;

    public Cong() {
    }

    public Cong(String name, int luongcoban, int songay, String chucvu) {
        this.name = name;
        this.chucvu = chucvu;
        this.luongcoban = luongcoban;
        this.songay = songay;
        this.mnv = "NV01";
        this.luong = this.luongcoban * this.songay;
        if(this.songay >= 25) this.thuong = (int) (0.2 * this.luong);
        else if(this.songay >= 22 && this.songay < 25) this.thuong = (int) (0.1 * this.luong);
        if(null == this.chucvu) this.phucap = 150000;
        else switch (this.chucvu) {
            case "GD":
                this.phucap = 250000;
                break;
            case "PGD":
                this.phucap = 200000;
                break;
            case "TP":
                this.phucap = 180000;
                break;
            default:
                this.phucap = 150000;
                break;
        }
        this.thunhap = this.luong + this.thuong + this.phucap;
    }
    
    @Override
    public String toString() {
        return mnv + " " + name + " " + luong + " " + thuong + " " + phucap + " " + thunhap;
    }
    
}
public class J04012 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Cong x = new Cong(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        System.out.println(x);
    }
    
}
