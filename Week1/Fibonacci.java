/*
 * The Fibonacci sequence is defined by the following rule. The first two values
 * in the sequence are 0 and 1. Every subsequent value is the sum of the two
 * values preceding it. Write a java program that uses both recursive and non
 * recursive functions.
 */

import java.util.Random;

class Fibonacci {
    public static void main(String args[]) {
        int n, n1, n2;

        Random rand = new Random();
        n = rand.nextInt(20);

        fib1 ans1 = new fib1();
        n1 = ans1.fibonacci(n);
        System.out.println();

        fib2 ans2 = new fib2();
        n2 = ans2.fibonacci(n);
        System.out.println();

        System.out.println("The " + n + "th fibonacci number (iteration) is " + n1);
        System.out.println("The " + n + "th fibonacci number (recursion) is " + n2);
    }
}


class fib1 {
    int a = 0, b = 1;
    int fib;

    int fibonacci(int n) {

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }

        return fib;
    }
}


class fib2 {
    int a = 0, b = 1;
    int fib;

    int fibonacci(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        fib = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.print(fib + " ");

        return fib;
    }
}
