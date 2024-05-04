package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllTheDuplicate {
    public static void main(String[] args) {
        String str ="Yashveer singh";
        List<String> collect = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
