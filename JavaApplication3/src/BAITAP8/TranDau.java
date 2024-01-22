/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAITAP8;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class TranDau implements Comparable<TranDau>{
    private String ID;
    private long socodongvien, doanhthu;
    private CLB clb;

    public TranDau(String ID, long socodongvien, ArrayList<CLB> dsCLB) {
        this.ID = ID;
        this.socodongvien = socodongvien;
        for(CLB tmp : dsCLB){ 
            if(this.ID.substring(1,3).equals(tmp.idCLB)){
                this.clb = tmp;
                break;
            }
        }
        this.doanhthu = this.clb.giaVe * this.socodongvien;
    }

    @Override
    public int compareTo(TranDau o) {
        if(this.doanhthu == o.doanhthu) return this.clb.nameCLB.compareTo(o.clb.nameCLB);
        return Long.compare(o.doanhthu, this.doanhthu);
    }

    @Override
    public String toString() {
        return ID+" "+clb.nameCLB+" "+doanhthu;
    }
    
}
