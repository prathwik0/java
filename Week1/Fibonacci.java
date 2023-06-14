/*
 * The Fibonacci sequence is defined by the following rule. The first two values
 * in the sequence are 0 and 1. Every subsequent value is the sum of the two
 * values preceding it. Write a java program that uses both recursive and non
 * recursive functions.
 */

import java.util.Random;

class Fibonacci {
    public static void main(String args[]) {
        int n, n1;

        Random as = new Random();
        n = as.nextInt(20);

        fib1 as1 = new fib1();
        n1 = as1.fibc(n);
        System.out.println("The " + n + "th fibonacci number is " + n1);
    }
}


class fib1 {
    int a = 0, b = 1;
    int fib;

    int fibc(int n) {
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n - 2; i++) {
            fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
        }
        System.out.println();
        return fib;
    }
}
