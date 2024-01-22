/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;
class Rectange{
    private double height;
    private double width;
    private String color;
    static String ChuanHoa(String color){
        color = color.toLowerCase();
        return String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
    }
    public Rectange(){
        height = 1;
        width = 1;
    }
    public Rectange(double chieudai,double chieurong,String color){
        this.height = chieudai;
        this.width = chieurong;
        this.color = ChuanHoa(color);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return getWidth() * getHeight();
    }
    public double findPerimeter(){
        return (getWidth() + getHeight()) * 2;
    }
}
public class khaibaolophinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange hcn = new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(hcn.getHeight() <= 0 || hcn.getWidth() <=0){
            System.out.println("INVALID");
        }
        else{
            System.out.printf("%.0f %.0f %s\n",hcn.findPerimeter(),hcn.findArea(),hcn.getColor());
        }
    }
}
