package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainanagram {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<List<String>> collect = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat").stream()
                .collect(Collectors.groupingBy(e -> {
                    char ch[] = e.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }, Collectors.toList())).entrySet()
                .stream()
                .map(Map.Entry::getValue).collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println(collect + "time: " + (end - start));
    }
}
