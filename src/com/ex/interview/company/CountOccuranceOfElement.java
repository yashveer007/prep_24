package com.ex.interview.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfElement {
    public static void main(String[] args) {
        String str = "kjniueh jbcuwo ejcievih";
        List<Map.Entry<String, Long>> collect = Arrays.asList(str.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().equalsIgnoreCase(" "))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
