/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05004_Danhsachdoituongsinhvien_2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        //sc.nextLine();
        while(n-->0){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien o : list) {
            System.out.println(o);
        }
    }
    
}
/*
nGuyEn  vaN    biNH
D20CQCN01-B
2/2/2002
3.1
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
*/