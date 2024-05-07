package com.ex.recursion;

public class CountSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(countSteps(n, 0));
    }

    private static int countSteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        if (n % 2 == 0) {
            return countSteps(n / 2, steps + 1);
        } else
            return countSteps(n - 1, steps + 1);
    }
}
