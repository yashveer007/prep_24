package com.ex.interview.company;

public class CustomEquality {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "dfagbhjcddc";
        String s2 = "fbgchja";
        System.out.println(isEqual(s, s1));

    }

    private static boolean isEqual(String s, String s1) {
        int i = 0;
        int j = 0;
        while (j < s1.length() && i < s.length()) {
            if (s.charAt(i) != s1.charAt(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}
