/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap3;


import java.util.*;

/**
 *
 * @author WIN
 */
//class Gio implements Comparable<Gio>{
////    private String ma;
////    private String name;
////    private String giovao;
////    private String giora;
////
////    public Gio() {
////    }
////
////    public Gio(String ma, String name, String giovao, String giora) {
////        this.ma = ma;
////        this.name = name;
////        this.giovao = giovao;
////        this.giora = giora;
////    }
////    
////    public int getTimeplay(){
////        String tmp1 = giovao.substring(0, 2);
////        String tmp2 = giora.substring(0,2);
////        String tmp3 = giovao.substring(3);
////        String tmp4 = giora.substring(3);
////        return (Integer.parseInt(tmp2)-Integer.parseInt(tmp1))*60+(Integer.parseInt(tmp4)-Integer.parseInt(tmp3))-60;
////    }
////    
////    public String getThoigianthuc(){
////        return String.valueOf(this.getTimeplay()/60)+" gio "+String.valueOf(this.getTimeplay()%60)+" phut";
////    }
////
////    public String getThoigiantieuchuan(){
////        if(getTimeplay()>=480) return "DU";
////        return "THIEU";
////    }
////    
////    @Override
////    public String toString() {
////        return ma+" "+name+" "+getThoigianthuc()+" "+getThoigiantieuchuan();
////    }
////
////    @Override
////    public int compareTo(Gio o) {
////        return o.getTimeplay()-this.getTimeplay();
////    }
//    
//}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Gio> list = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String giovao = sc.nextLine();
            String giora = sc.nextLine();
            list.add(new Gio(ma,name,giovao,giora));
        }
        //Collections.sort(list);
        for(Gio x : list){
            System.out.println(x);
//            if(x.getTimeplay()>=480){
//                System.out.print(" "+"DU");
//            }
//            else{
//                System.out.print(" "+"THIEU");
//            }
//            System.out.println("");
        }
    }
    
}
/*
2
01T
Nguyen Van An
08:00
17:30
06T
Tran Hoa Binh
09:05
17:00
*/
//01T Nguyen Van An 8 gio 30 phut DU
//06T Tran Hoa Binh 6 gio 55 phut THIEU
