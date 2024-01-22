/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

class Point{
    private double x,y;
    Point(){
        x = 0;
        y = 0;
    }
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double distance(Point p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
    double distance(Point p,Point q){
        return Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
    }
    
    @Override
    public String toString(){
        return x +" "+y;
    }
}
public class khaibaolopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p = new Point(sc.nextDouble(),sc.nextDouble());
            Point q = new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",p.distance(q));
        }
    }
}
