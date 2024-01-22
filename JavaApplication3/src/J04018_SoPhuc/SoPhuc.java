/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04018_SoPhuc;

public class SoPhuc {
    private int phanthuc,phanao;

    public SoPhuc() {
    }

    public SoPhuc(int phanthuc, int phanao) {
        this.phanthuc = phanthuc;
        this.phanao = phanao;
    }

    public int getPhanthuc() {
        return phanthuc;
    }

    public int getPhanao() {
        return phanao;
    }
    
    SoPhuc C(SoPhuc a,SoPhuc b){
        return new SoPhuc(a.phanthuc+b.phanthuc,a.phanao+b.phanao);
    }
    
    SoPhuc D(SoPhuc a,SoPhuc b){
        return new SoPhuc(a.phanthuc*b.phanthuc-a.phanao*b.phanao,a.phanao*b.phanthuc+a.phanthuc*b.phanao);
    }

    @Override
    public String toString() {
        String ans = "";
        ans = ans + String.valueOf(phanthuc);
        if(phanao > 0){
            ans = ans + " + " + String.valueOf(phanao) + "i";
        }
        else{
            ans = ans + " - " + String.valueOf(-phanao) + "i";
        }
        return ans;
    }
    
}
