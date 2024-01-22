/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07076_SapXepMaTran;

/**
 *
 * @author WIN
 */
import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int a[][] = new int[n][m];
            for(int x=0; x<n; x++){
                for(int y=0; y<m; y++) a[x][y] = sc.nextInt();
            }
            int ans[] = new int[n];
            for(int x=0; x<n; x++){
                ans[x] = a[x][i-1];
            }
            Arrays.sort(ans);
            for(int x=0; x<n; x++){
                a[x][i-1] = ans[x];
            }
            for(int x=0; x<n; x++){
                for(int y=0; y<m; y++){
                    System.out.print(a[x][y]+" ");
                }
                System.out.println("");
            }
        }
    }
}
