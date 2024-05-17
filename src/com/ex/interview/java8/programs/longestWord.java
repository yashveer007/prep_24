package com.ex.interview.java8.programs;

import java.util.Arrays;

public class longestWord {
    public static void main(String[] args) {
        String sentence = "working as software Engineer";

        String maxLength = Arrays.asList(sentence.split(" ")).stream()
                .reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2).get();
        System.out.println(maxLength);
    }
}
