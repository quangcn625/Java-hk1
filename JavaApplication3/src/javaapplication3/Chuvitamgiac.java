/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

class Point{
    private double x,y;

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
    
    double distance(Point a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y,2));
    }
    
    double distance(Point a,Point b){
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y,2));
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    
}
public class Chuvitamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double x = a.distance(b);
            double y = a.distance(c);
            double z = b.distance(c);
            if(x + y > z && x + z > y && y + z > x){
                System.out.printf("%.3f\n",x+y+z);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
