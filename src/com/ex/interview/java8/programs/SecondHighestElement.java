package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElement {
    public static void main(String[] args) {
        int arr[] = {12,34,56,89,12,76};

        Integer integer = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findAny()
                .get();
        System.out.println(integer);
    }
}
