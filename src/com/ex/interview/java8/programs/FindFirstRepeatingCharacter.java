package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "yashveer singh";
        Optional<String> first = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first);
    }
}
