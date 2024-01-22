/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J07007_LietKeTuKhacNhau;
import java.util.*;
import java.io.*;
/**
 *
 * @author WIN
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    private static class WordSet{
        private final TreeSet<String> data;

        public WordSet(String fileName) throws FileNotFoundException{ 
            Scanner sc = new Scanner(new File(fileName));
            this.data = new TreeSet<>();
            while(sc.hasNext()){
                String s = sc.next().toLowerCase();
                this.data.add(s);
            }
        }
        
        @Override
        public String toString(){
            String s = "";
            for(String i : this.data) s += i+"\n";
            return s;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
/*
lap trinh Huong doi tuong
lap trinh Huong thanh phan
*/
