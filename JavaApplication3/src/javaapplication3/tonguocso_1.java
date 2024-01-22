/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class tonguocso_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int maxNumber = 0;
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            numbers.add(a);
            maxNumber = Math.max(maxNumber, a);
        }
        
        int[] primes = new int[maxNumber + 1];
        for (int i = 2; i <= maxNumber; i++) {
            if (primes[i] == 0) {
                for (int j = i; j <= maxNumber; j += i) {
                    primes[j] = i;
                }
            }
        }
        
        long sum = 0;
        for (int a : numbers) {
            while (a > 1) {
                sum += primes[a];
                a /= primes[a];
            }
        }
        System.out.println(sum);
    }
}
