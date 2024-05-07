package com.ex.recursion;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
}
