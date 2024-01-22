/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07002_TinhTong;
import java.util.*;
import java.io.*;

/**
 *
 * @author WIN
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String x = sc.next();
            try {
                sum += Integer.parseInt(x);
            } catch (NumberFormatException e) {
                
            }
        }
        System.out.println(sum);
    }
}
/*
12 3 4 5 6 7
Aaa 1 1 Bbb XXX yyy 5 5
999999999999999999999999
9
*/
