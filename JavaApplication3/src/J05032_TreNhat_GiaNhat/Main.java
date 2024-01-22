/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J05032_TreNhat_GiaNhat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Person implements Comparable<Person>{
    private String name;
    private Date dob;

    public Person() {
    }

    public Person(String name,Date dob){
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Person o) {
        return o.dob.compareTo(this.dob);
    }
}
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Person> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.next();
            String dob = sc.next();
            Person x = new Person(name,sdf.parse(dob));
            list.add(x);
        }
        Collections.sort(list);
        System.out.println(list.get(0)); 
        System.out.println(list.get(list.size()-1));
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/

