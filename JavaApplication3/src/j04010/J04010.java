/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04010;
import java.util.*;

class Point{
    private double x , y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double Distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }
    double Distance(Point p,Point q){
        return Math.sqrt(Math.pow(q.x - p.x,2) + Math.pow(q.y - p.y,2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
    
}
public class J04010 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.next());
       while(t-->0){
           Point x = new Point(sc.nextDouble(),sc.nextDouble());
           Point y = new Point(sc.nextDouble(),sc.nextDouble());
           Point z = new Point(sc.nextDouble(),sc.nextDouble());
           double AB = x.Distance(y);
           double AC = x.Distance(z);
           double BC = y.Distance(z);
           if(AB + AC > BC && AB + BC > AC && BC + AC > AB){
               double p = (AB + AC + BC) / 2.0;
               double s = (Math.sqrt(p*(p-AB)*(p-AC)*(p-BC)));
               double r = (1.0*AB*AC*BC) / (4 * s);
               System.out.printf("%.3f\n",Math.PI *(r * r));
           }
           else{
               System.out.println("INVALID");
           }
       }
    }

    
}

