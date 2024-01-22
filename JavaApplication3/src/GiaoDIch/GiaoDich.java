/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDIch;

/**
 *
 * @author WIN
 */
public class GiaoDich {
    protected int MaGD,SoLuong;
    protected String NgayGD;
    protected double DonGia, ThanhTien;
    
    protected GiaoDich(){

        this.MaGD = 0;
        this.NgayGD = "";
        this.DonGia = 0;
        this.SoLuong = 0;
        this.ThanhTien = 0;

    }

    protected GiaoDich(int magd){

        this.MaGD = magd;
        this.NgayGD = "";
        this.DonGia = 0;
        this.SoLuong = 0;
        this.ThanhTien = 0;

    }

    protected GiaoDich(int ma, int sl, String ngay, double dgia){
        
        this.MaGD = ma;
        this.NgayGD = ngay;
        this.DonGia = dgia;
        this.SoLuong = sl;
        this.ThanhTien = 0;

    }
    
   // Các getter và setter cho các thuộc tính
    public void setThanhtien(double thanhtien){

        this.ThanhTien = thanhtien;

    }

    public void setThanhtien(){

        ThanhTien = DonGia * SoLuong;

    }

    public int getMaGD() {
        return MaGD;
    }

    public void setMaGD(int MaGD) {
        this.MaGD = MaGD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNgayGD() {
        return NgayGD;
    }

    public void setNgayGD(String NgayGD) {
        this.NgayGD = NgayGD;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

        
    
    
    @Override
    public String toString() {

        return MaGD + "\t" + SoLuong + "\t" + NgayGD + "\t" + DonGia;
    }
    
    // chỉ cần khi ta gọi phương thức contains
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        GiaoDich other = (GiaoDich) o;
        if (MaGD != other.MaGD) return false;
        return true;
    }
}

//Lop con thu 1

class GiaoDichVang extends GiaoDich {

    private String loaivang;
    public GiaoDichVang(){

        super();
        this.loaivang="";

    }

    public GiaoDichVang(int ma, int sl, String ngay, double dgia, String lvang){
        
        super(ma, sl, ngay, dgia);
        this.loaivang=lvang;

    }
    // không cần cài đặt các phương thức getter và setter để lấy các thuộc tính của lớp cha nữa
    // chỉ cài đặt các phương thức getter và setter của thuộc tính lớp mình
    public String getLoaivang() {

        return loaivang;

    }

    public void setLoaivang(String loaivang) {

        this.loaivang = loaivang;

    }

    // viết đè lên phương thức toString() của lớp cha nếu thấy cần
    @Override
    public String toString(){

        return super.toString() + "\t" +loaivang + "\t\t" + getThanhTien();

    }

}

//Lop con thu 2

class GiaoDichTienTe extends GiaoDich{

    private double tigia;
    private int loaitiente;
    
    public GiaoDichTienTe(){

        super();
        this.tigia=0;
        this.loaitiente=0;

    }

    public GiaoDichTienTe(int ma, int sl,String ngay, double dgia, double tgia,int loai){

        super(ma, sl, ngay, dgia);
        this.tigia=tgia;
        this.loaitiente=loai;

    }
    
    public double getTigia() {

        return tigia;
    }

    public void setTigia(double tigia) {

        this.tigia = tigia;
        
    }

    public int getLoaitiente() {
        
        return loaitiente;
        
    }

    public void setLoaitiente(int loaitiente) {

        this.loaitiente = loaitiente;
    }

    public void setThanhien(){
        
        if(loaitiente==1) this.setThanhtien((this.getDonGia() * this.getSoLuong()));
        else this.setThanhtien((this.getDonGia() * this.getSoLuong() * this.tigia));
        
    }
    
    @Override
    public String toString(){
        
        String temp;
        if(loaitiente == 1) temp=" VND";
        else if(loaitiente==2) temp=" USD";
        else temp=" EURO";
        return super.toString() + "\t" +tigia + temp + "\t\t" + getThanhTien();
        
    }
}

