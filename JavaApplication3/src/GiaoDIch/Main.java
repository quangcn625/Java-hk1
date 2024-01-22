/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GiaoDIch;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListGD lst = new ListGD();
        Scanner sc = new Scanner(System.in);
        boolean oke = true;
        while(oke){
            int x = Integer.parseInt(sc.nextLine());
            if(x == 0){
                oke = false;
                break;
            }
            else if(x == 1){
                lst.themGDVang();
            }
            else if(x == 2){
                lst.themGDTT();
            }
            else if(x == 3){
                lst.hienthiDS();
            }
            else if(x == 4){
                lst.getBySoLuong(10, 20);
            }
            else if(x == 5){
                lst.getByDate("20-12-2023");
            }
            else if(x == 6){
                lst.getContainDate("20-12-2023");
            }
            else if(x == 7){
                lst.getByYear(2023, 2024);
            }
        }
    }
    
}
