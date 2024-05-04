package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.List;

public class FindSumOfEvenNumbers {
    public static void main(String[] args) {
        int []arr = {1,23,45,67,32,34,68};
        int sum = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
