/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05070_CauLacBoBongDa_2;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class TranDau implements Comparable<TranDau>{
    private String matrandau;
    private long socodongvien;
    private CLB clb;

    public TranDau(String matrandau, long socodongvien, ArrayList<CLB> dsCLB) {
        this.matrandau = matrandau;
        this.socodongvien = socodongvien;
        for(CLB x : dsCLB){
            if(matrandau.substring(1, 3).equals(x.maCLB)){
                this.clb = x;
                break;
            }
        }
    }

    public long getDoanhthu(){
        return clb.giava*socodongvien;
    }
    
    @Override
    public String toString() {
        return matrandau+" "+clb.nameCLB+" "+getDoanhthu();
    }

    @Override
    public int compareTo(TranDau o) {
        if(this.getDoanhthu() == o.getDoanhthu()) return this.clb.nameCLB.compareTo(o.clb.nameCLB);
        return Long.compare(o.getDoanhthu(), this.getDoanhthu());
    }
    
}
