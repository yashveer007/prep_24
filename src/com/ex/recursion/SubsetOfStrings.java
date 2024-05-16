package com.ex.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfStrings {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subset(str,"").toString());
    }

    private static List<String> subset(String str, String newString) {
        if (str.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(newString);
            return list;
        }

        List<String> left = subset(str.substring(1), newString + str.charAt(0));
        List<String> right = subset(str.substring(1), newString);
        left.addAll(right);
        return left;
    }
}
