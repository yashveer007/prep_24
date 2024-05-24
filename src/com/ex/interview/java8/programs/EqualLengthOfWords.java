package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EqualLengthOfWords {
    public static void main(String[] args) {
        Map<Integer, List<String>> collect = Arrays.asList("apple", "banana", "mango", "pineapple", "pear").stream()
                .collect(Collectors.groupingBy(e -> e.length()));
        System.out.println(collect);

        List<String> stringList = Arrays.asList("apple", "banana", "mango", "pineapple", "pear").stream()
                .filter(e -> !e.contains("an"))
                .collect(Collectors.toList() );
        System.out.println(stringList);

        String collected = Arrays.asList("apple", "banana", "mango", "pineapple", "pear").stream()
                .filter(e -> !e.contains("an"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));
        System.out.println(collected);
    }
}
