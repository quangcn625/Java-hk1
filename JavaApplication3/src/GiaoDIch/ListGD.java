/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDIch;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WIN
 */
public class ListGD {
    private ArrayList<GiaoDich> list;
    
    private static int tonggdv, tonggdtt;
    public ListGD(){
        
        list = new ArrayList<GiaoDich>();
        tonggdv=0;
        tonggdtt=0;

    }
    
    GiaoDich themGD(){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap thong tin GD ");
        System.out.println("Ma GD (nhap so): ");
        int magd = in.nextInt();
        GiaoDich gd = new GiaoDich(magd);
        if(list.contains(gd)) return null;
        else{
            String ngaygd="";
            while(true){
                System.out.println("Ngay Giao Dich(dd-mm-yyyy): ");
                ngaygd = in.next();
                if(ngaygd.matches("\\d{2}-\\d{2}-\\d{4}$")) break;
            }
            gd.setNgayGD(ngaygd);
            System.out.println("Don Gia: ");
            double dongia = in.nextDouble();
            gd.setDonGia(dongia);
            System.out.println("So Luong: ");
            int soluong = in.nextInt();
            gd.setSoLuong(soluong);
            return gd;
        }
        
    }

    public boolean themGDVang(){
        
        Scanner in=new Scanner(System.in);
        GiaoDich gd = themGD();
        if(gd == null) return false;
        else{
            System.out.println("Loai Vang: ");
            String loaivang = in.next();
            GiaoDichVang gdv = new GiaoDichVang(gd.getMaGD(),gd.getSoLuong(), gd.getNgayGD(),gd.getDonGia(), loaivang);
            gdv.setThanhtien();
            tonggdv += gdv.getSoLuong();
            return list.add(gdv);
        }

    }
    
    public boolean themGDTT(){
    
        Scanner in=new Scanner(System.in);
        GiaoDich gd = themGD();
        if(gd == null) return false;
        else{
            System.out.println("Loai Tien Te(nhap 1:vnd, 2:ngoai te): ");
            int loaitiente=in.nextInt();
            double tigia;
            if(loaitiente==1) tigia=1;
            else{
                System.out.println("Ti Gia: ");
                tigia=in.nextDouble();
                GiaoDichTienTe gdtt = new GiaoDichTienTe(gd.getMaGD(),gd.getSoLuong(), gd.getNgayGD(),gd.getDonGia(), tigia,loaitiente);
                tonggdtt += gdtt.getSoLuong();
                gdtt.setThanhtien();
                return list.add(gdtt);
            }
        }
        return false;

    }
    
    public void hienthiDS(){
        
        System.out.println("==DANH SACH GIAO DICH ==");
        System.out.println("MaGD       So Luong     Ngay GD       Don Gia     Loai vang / ty gia TTien");
        double tt=0;
        for (GiaoDich gd: list){
            System.out.println(gd.toString());
            tt += gd.getThanhTien();
        }
        System.out.println("=================");
        System.out.println("Tong tien:"+Double.toString(tt));
        
    }
    
    public void getByDate(String ngaygd){
        
        System.out.println("==DANH SACH GIAO DICH Ngay "+ngaygd+"=========");
        System.out.println("MaGD     So Luong      Ngay GD     Don Gia      Loai vang / Ty gia TTien");
        for (GiaoDich gd: list)
        if(gd.getNgayGD().equals(ngaygd))
        System.out.println(gd.toString());
        System.out.println("=============");
        
    }
    
    public void getContainDate(String ngaygd){
        
        System.out.println("=====DANH SACH GIAO DICH Ngay "+ngaygd+"=========");
        System.out.println("MaGD So Luong Ngay GD Don Gia Loai vang/ty gia TTien");
        for (GiaoDich gd: list)
        if(gd.getNgayGD().indexOf(ngaygd) >= 0)
        System.out.println(gd.toString());
        System.out.println("===============");
        
    }
    
    public int tongGGVang(){

        return tonggdv; 
    }
    
    public int tongGGTienTe(){
        
        return tonggdtt;
        
    }

    public void getBySoLuong(int from,int to){
        
        System.out.println("=====DANH SACH GIAO DICH Ngay =========");
        System.out.println("MaGD So Luong Ngay GD Don Gia Loai vang / Ty gia TTien");
        for (GiaoDich gd: list)
        if((gd.getSoLuong()>= from) && (gd.getSoLuong() <= to))
        System.out.println(gd.toString());
        System.out.println("=====================================");
        
    }
    
    public void getByYear(int from,int to){
        
        System.out.println("=====DANH SACH GIAO DICH Ngay =========");
        System.out.println("MaGD So Luong Ngay GD Don Gia Loai vang/ty gia TTien");
        for (GiaoDich gd: list)
        if( (Integer.parseInt((gd.getNgayGD().substring(6))) >= from) && Integer.parseInt((gd.getNgayGD().substring(6)))<=to)
        System.out.println(gd.toString());
        System.out.println("=====================================");
        
    }
    
    public void sapXepByNgay(){
        
        Collections.sort(list, new Comparator<GiaoDich>() {
  
            @Override
            public int compare(GiaoDich g1, GiaoDich g2) {
                return ((g1.getNgayGD().substring(6)+g1.getNgayGD().substring(3,5)+g1.getNgayGD().substring(0,2)).compareTo((g2.getNgayGD().substring(6)+g2.getNgayGD().substring(3,5)+g2.getNgayGD().substring(0,2))));
            }
            }
        );
        
    }
    
    public ArrayList<GiaoDich> TimKiemGanDung(int MaGD, int SoLuong, String NgayGD, double DonGia, double ThanhTien){
        
        ArrayList<GiaoDich> result = new ArrayList<>();
        for(GiaoDich x : list){
            boolean check = true;
            if(MaGD > 0 && x.getMaGD() != MaGD){
                check = false;
            }
            if(SoLuong > 0 && x.getSoLuong() != SoLuong){
                check = false;
            }
            if(NgayGD != null && x.getNgayGD().contains(NgayGD)){
                check = false;
            }
            if(DonGia > 0 && x.getDonGia() != DonGia){
                check = false;
            }
            if(ThanhTien > 0 && x.getThanhTien() != ThanhTien){
                check = false;
            }
            if(check){
                result.add(x);
            }
        }
        return result;
        
    }
    
    public ArrayList<GiaoDich> TimKiemtrongKhoang(int MaGDdau, int MaGDcuoi, int SoLuongdau, int SoLuongcuoi, String startdob, String finishdob, double DonGiadau, double DonGiacuoi, double ThanhTiendau, double ThanhTiencuoi){
        try{
            ArrayList<GiaoDich> result = new ArrayList<>();
            for(GiaoDich x : list){
                boolean check = true;
                
                // Kiểm tra theo ma giao dịch trong khoảng
                int magd = x.getMaGD();
                if (magd < MaGDdau || magd > MaGDcuoi) {
                    check = false;
                }
                
                // Kiểm tra theo số lượng giao dịch trong khoảng
                double amount = x.getSoLuong();
                if (amount < SoLuongdau || amount > SoLuongcuoi) {
                    check = false;
                }
                
                // Kiểm tra theo ngày giao dịch trong khoảng
                if (startdob != null && finishdob != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                    Date tmp = sdf.parse(x.getNgayGD());
                    if (tmp.before(sdf.parse(startdob)) || tmp.after(sdf.parse(finishdob))) {
                        check = false;
                    }
                }
                
                // Kiểm tra theo don gia giao dịch trong khoảng
                double dongia = x.getDonGia();
                if (dongia < DonGiadau || dongia > DonGiacuoi) {
                    check = false;
                }
                
                // Kiểm tra theo thanh tien giao dịch trong khoảng
                double thanhtien = x.getThanhTien();
                if (thanhtien < ThanhTiendau || thanhtien > ThanhTiencuoi) {
                    check = false;
                }
                if(check){
                    result.add(x);
                }
            }
            return result;
        }
        catch(Exception e){
            
        }
        return null;
    }
}
