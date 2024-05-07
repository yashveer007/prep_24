package com.ex.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(6));
    }

    private static int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
