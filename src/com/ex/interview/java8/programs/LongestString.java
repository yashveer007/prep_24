package com.ex.interview.java8.programs;

import java.util.Arrays;
import java.util.Optional;

public class
LongestString {
    public static void main(String[] args) {
        String str = "thakur yashveer singh is a software Engineer";
        String s = Arrays.asList(str.split(" ")).stream()
                .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2)
                .get();

        System.out.println(s);
    }
}
