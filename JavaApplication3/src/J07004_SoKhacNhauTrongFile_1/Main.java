/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07004_SoKhacNhauTrongFile_1;
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
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        int a[] = new int[100005];
        int b[] = new int[100005];
        int idx = 0;
        while(sc.hasNext()){
            a[idx] = Integer.parseInt(sc.next());
            b[a[idx]]++;
            idx++;
        }
        Arrays.sort(a);
        for(int i=0; i<100005; i++){
            if(b[a[i]] > 0){
                System.out.println(a[i] + " " + b[a[i]]);
            }
            b[a[i]] = 0;
        }
    }
    
}
