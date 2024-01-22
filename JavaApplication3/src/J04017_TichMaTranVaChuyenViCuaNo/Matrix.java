/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04017_TichMaTranVaChuyenViCuaNo;

/**
 *
 * @author WIN
 */
import java.util.*;

public class Matrix {
   private int n, m;
   private int data[][];

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.data = new int[n][m];
    }
   
    public void nextMatrix(Scanner sc){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) this.data[i][j] = sc.nextInt();
        }
    }
    
    public Matrix trans(){
        Matrix ans = new Matrix(this.m, this.n);
        for(int i=0; i<this.m; i++){
            for(int j=0; j<this.n; j++) ans.data[i][j] = this.data[j][i];
        }
        return ans;
    }
    
    public Matrix mul(Matrix o){
        Matrix ans = new Matrix(this.n, o.m);
        for(int i=0; i<this.n; i++){
            for(int j=0; j<o.m; j++){
                int tmp = 0;
                for(int k = 0; k<this.m; k++){
                    tmp = tmp + this.data[i][k] * o.data[k][j];
                }
                ans.data[i][j] = tmp;
            }
        }
        return ans;
    }

    @Override
    public String toString() {
        String ans = "";
        for(int i=0; i<this.n; i++){
            for(int j=0; j<this.m; j++) ans += this.data[i][j] + " ";
            ans = ans.trim() + "\n";
        }
        return ans;
    }
}
