/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J04019_LopTriange_1;
import java.util.*;

class Point{
    private double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
}

class Triangle{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double ab = Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
        double ac = Math.sqrt(Math.pow(a.getX()-c.getX(), 2)+Math.pow(a.getY()-c.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX()-c.getX(), 2)+Math.pow(b.getY()-c.getY(), 2));
        if(ab + ac > bc && ab + bc > ac && ac + bc > ab) return true;
        return false;
    }
    
    public String getPerimeter(){
        double ab = Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
        double ac = Math.sqrt(Math.pow(a.getX()-c.getX(), 2)+Math.pow(a.getY()-c.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX()-c.getX(), 2)+Math.pow(b.getY()-c.getY(), 2));
        return String.format("%.3f", ab+ac+bc);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
