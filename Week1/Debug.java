/*
 * Debug the given Java program related to checking if a given number is prime
 * or not. Try debug step by step with small program of about 10 to 15 lines
 * which contains at least one if else condition and a for loop.
 */

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Welcome to Institute of Engineering College");
        System.out.println("---------Prime Number---------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter valid Number: ");

        int n = sc.nextInt();
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " is a Prime Number");
        } else
            System.out.println(n + " is not a Prime Number");

        sc.close();
    }
}
