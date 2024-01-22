/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.*;

public class biensodep {
    static boolean check(String a)
{
	if(a.charAt(5)<a.charAt(6) && a.charAt(6)<a.charAt(7) && a.charAt(7)<a.charAt(9) && a.charAt(9)<a.charAt(10)) return true;
	if(a.charAt(5)==a.charAt(6)&&a.charAt(6)==a.charAt(7)&&a.charAt(9)==a.charAt(10)) return true;
	for(int i=5;i<=10;i++)
	{
		if(i==8) continue;
		if(a.charAt(i)!='6'&&a.charAt(i)!='8') return false;
	}
	return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
