package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueElement {
    public static void main(String[] args) {
        String str = "yashveer singh";
        List<String> collect = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1 && !e.getKey().equalsIgnoreCase(" "))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
