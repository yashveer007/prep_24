package com.ex.stringEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String str = " the  sky is   blue  ";
        List<String> collect = Arrays.stream(str.trim().split("\\s+")).collect(Collectors.toList());
        String newStr = "";
        for (int i = collect.size() - 1; i >= 0; i--) {
            newStr += collect.get(i) + " ";
        }
        System.out.println(newStr);
    }
}
