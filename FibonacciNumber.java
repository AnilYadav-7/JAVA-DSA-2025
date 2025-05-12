package com.DSA.recursion;

public class FibonacciNumber {
    public int fibonacci(int n) {
        // Base case: return n if it is 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: calculate the Fibonacci number
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        int n = 7; // Example input
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
// This code defines a class FibonacciNumber with a method fibonacci that calculates the nth Fibonacci number using recursion. The main method demonstrates its usage by calculating the Fibonacci number for n = 5 and printing the result.
