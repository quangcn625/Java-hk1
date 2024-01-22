/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07001_DocFileVanBan;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author WIN
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
/*
Lap trinh huong doi tuong
voi Java
*/
