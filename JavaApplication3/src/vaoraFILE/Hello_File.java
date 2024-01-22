/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaoraFILE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hello_File {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //Đọc dữ liệu từ file
        File file = new File("Hello.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try (FileInputStream fi = new FileInputStream(file)) {
            int c = fi.read();
            while(c != -1){
                System.out.print((char) c);
                c = fi.read();
            }
        }
        
        //Ghi dữ liệu vào file
        String s = sc.nextLine();
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(s.getBytes());
        fo.close();
    }
}
