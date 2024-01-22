/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05071_TinhCuocDienThoaiCoDinh_1;

import java.util.ArrayList;

/**
 *
 * @author WIN
 */
public class CuocGoi {
    private String sogoiden;
    private String giobatdau;
    private String gioketthuc;
    private Phone ans;

    public CuocGoi(String sogoiden, String giobatdau, String gioketthuc, ArrayList<Phone> dsPhone) {
        this.sogoiden = sogoiden;
        this.giobatdau = giobatdau;
        this.gioketthuc = gioketthuc;
        for(Phone x : dsPhone){
            if(x.getMavung().contains(sogoiden.substring(1, 3))){
                this.ans = x;
                break;
            }
        }
    }
    
    public String getCuocgoi(){
        String tmp = sogoiden;
        if(tmp.startsWith("0")){
            String tmp1 = tmp.substring(1,3);
            if(tmp1.contains(ans.getMavung())){
                return ans.getTentinh();
            }
        }
        return "Noi mang";
    }
    
    public int getSophut(){
        int h = (Integer.parseInt(gioketthuc.substring(0, 2)) - Integer.parseInt(giobatdau.substring(0, 2))) * 60;
        int m =  Integer.parseInt(gioketthuc.substring(3)) - Integer.parseInt(giobatdau.substring(3));
        if(getCuocgoi().equals("Noi mang")){
            int x = h + m;
            if(x % 3 == 0){
                return x / 3;
            }
            else return x / 3 + 1;
        }
        return h + m;
    }
    
    public int Giacuocphaitra(){
        if(getCuocgoi().equals("Noi mang")){
            return getSophut() * 800;
        }
        if(getCuocgoi().equals(ans.getTentinh())) return ans.getGiacuoc() * getSophut();
        return 0;
    }

    @Override
    public String toString() {
        return sogoiden+" "+getCuocgoi()+" "+getSophut()+" "+Giacuocphaitra();
    }

}
