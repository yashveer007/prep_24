package com.ex.interview.java8.programs;

import java.util.Arrays;

public class SumOfSquare {
    public static void main(String[] args) {
        double arr[] = {1,2.9,4,6,8,9};
        double sum = Arrays.stream(arr)
                .boxed()
                .mapToDouble(e -> Math.pow(e, 2))
                .sum();
        System.out.println(sum);
    }
}
