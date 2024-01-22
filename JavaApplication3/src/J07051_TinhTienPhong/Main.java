/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07051_TinhTienPhong;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.text.*;
import java.io.*;

class KhachHang implements Comparable<KhachHang>{
    private static int cnt = 1;
    private String ma, name;
    private int sophong;
    private String ngaynhanphong, ngaytraphong;
    private int tiendichvuphatsinh;

    public KhachHang(String name, int sophong, String ngaynhanphong, String ngaytraphong, int tiendichvuphatsinh) {
        this.ma = "KH" + String.format("%02d",cnt++);
        this.name = ChuanHoaName(name);
        this.sophong = sophong;
        this.ngaynhanphong = ChuanHoaNgay(ngaynhanphong);
        this.ngaytraphong = ChuanHoaNgay(ngaytraphong);
        this.tiendichvuphatsinh = tiendichvuphatsinh;
    }
    
    public String ChuanHoaName(String s){
        String a[] = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : a){
            ans += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return ans.trim();
    }
    
    public String ChuanHoaNgay(String date){
        String []data = date.split("/");
        if(data[0].length() == 1) data[0] = '0'+data[0];
        if(data[1].length() == 1) data[1] = '0'+data[1];
        return data[0]+'/'+data[1]+'/'+data[2];
    }
    
    public long SoNgayO() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dayIn = sdf.parse(ngaynhanphong);
        Date dayOut = sdf.parse(ngaytraphong);
        return ((dayOut.getTime() - dayIn.getTime()) / (1000 * 60 * 60 *24)) + 1;
    }

    public int layDonGia(int n){
        int k = (int) n /100;
        if(k==1) return 25;
        if(k==2) return 34;
        if(k==3) return 50;
        return 80;
    }

    public long getTongtien(){
        try{
            return (long) (SoNgayO() * layDonGia(sophong) + tiendichvuphatsinh);            
        }
        catch(Exception e){
            
        }
        return 0;
    }
    @Override
    public String toString(){
        try{
            return ma+" "+name+" "+sophong+" "+SoNgayO()+" "+getTongtien();
        }
        catch(Exception e){
            
        }
        return null;
    }
  
    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.getTongtien(),this.getTongtien());
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang> lst = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            int sophong = Integer.parseInt(sc.nextLine());
            String ngaynhanphong = sc.nextLine();
            String ngaytraphong = sc.nextLine();
            int dichvuphatsinh = Integer.parseInt(sc.nextLine());
            lst.add(new KhachHang(name, sophong, ngaynhanphong, ngaytraphong, dichvuphatsinh));
        }
        Collections.sort(lst);
        for(KhachHang x : lst){
            System.out.println(x);
        }
    }
    
}
