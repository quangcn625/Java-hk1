/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07046_DanhSachLuuTru;

/**
 *
 * @author WIN
 */
import java.util.*;
import java.io.*;
import java.text.*;

class DanhSach implements Comparable<DanhSach>{
    private static int cnt = 1;
    private String makhachhang;
    private String name;
    private String maphong;
    private Date ngayden;
    private Date ngaydi;

    public DanhSach(String name, String maphong, Date ngayden, Date ngaydi) {
        this.makhachhang = "KH"+String.format("%02d",cnt++);
        this.name = name;
        this.maphong = maphong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
    }
    
    public long getSongayluutru(){
        return (ngaydi.getTime() - ngayden.getTime()) / (1000 * 60 * 60 *24);
    }
    
    @Override
    public String toString(){
        return makhachhang+" "+name+" "+maphong+" "+getSongayluutru();
    }

    @Override
    public int compareTo(DanhSach o) {
        return Long.compare(o.getSongayluutru(), this.getSongayluutru());
    }
}
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACH.in"));
        List<DanhSach> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name = sc.nextLine();
            String maphong = sc.nextLine();
            Date ngayden = sdf.parse(sc.nextLine());
            Date ngaydi = sdf.parse(sc.nextLine());
            list.add(new DanhSach(name, maphong, ngayden, ngaydi));
        }
        Collections.sort(list);
        for(DanhSach x : list){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van Hoang
55B1
01/01/2021
01/01/2021
Nguyen Trung Dung
04C6
01/01/2021
10/01/2021
*/
