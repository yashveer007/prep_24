package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfChar {
    public static void main(String[] args) {
        String str = "ilooveeemycountrryy";

        Map<String, Long> collect = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
