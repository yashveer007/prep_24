package com.ex.recursion;

public class SubsetOfaString {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "");
    }

    private static void subset(String str, String newString) {
        if (str.isEmpty()) {
            System.out.println(newString);
            return;
        }
        subset(str.substring(1), newString + str.charAt(0));
        subset(str.substring(1), newString);
    }
}
