/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class Doi {
    private String matruong;
    private int sonhom;
    private ArrayList<TenDoi> list;
    private Truong tmp;

    public Doi(String matruong, int sonhom, ArrayList<TenDoi> list, ArrayList<Truong> dsTruong) {
        this.matruong = matruong;
        this.sonhom = sonhom;
        this.list = list;
        for(Truong x : dsTruong){
            if(x.getMatruong().contains(matruong)){
                this.tmp = x;
                break;
            }
        }
    }

    public String getMatruong() {
        return matruong;
    }

    public int getSonhom() {
        return sonhom;
    }

    public ArrayList<TenDoi> getList() {
        return list;
    }

    public Truong getTmp() {
        return tmp;
    }

}
