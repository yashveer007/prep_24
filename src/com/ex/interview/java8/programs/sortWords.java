package com.ex.interview.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortWords {
    public static void main(String[] args) {
        String str = "Hello My Name Is Yashveer Singh";

        List<String> collect = Arrays.asList(str.split(" ")).stream()
                .map( e -> e.toLowerCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
