package com.ex.interview.java8.programs;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str1 = "Yashveer Singh";
        if (palindrome(str1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
