package com.ex.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int digit = (int) Math.floor(Math.log10(n) + 1);
        System.out.println(reverse(n, digit - 1));
    }

    private static int reverse(int n, int digit) {

        if (n % 10 == n) {
            return n;
        }

        return (int) ((n % 10) * Math.pow(10, digit)) + reverse(n / 10, digit - 1);
    }
}
