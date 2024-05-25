package com.ex.interview.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectAnagram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("abc", "def", "cba","cat", "tca"));
        System.out.println(list);

        Map<String, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(e -> {
                    char ch[] = e.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }, Collectors.toList()));
        System.out.println(collect);


        list.stream()
                .collect(Collectors.groupingBy(e -> {
                    char ch[] = e.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }, Collectors.toList()))
                .entrySet().stream()
                .map(Map.Entry::getValue)
                .forEach(System.out::print);
    }
}
