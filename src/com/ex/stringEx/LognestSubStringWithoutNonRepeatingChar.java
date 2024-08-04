package com.ex.stringEx;

import java.util.HashSet;
import java.util.Set;

public class LognestSubStringWithoutNonRepeatingChar {
    public static void main(String[] args) {
        String str = "bkberviblmndfrern";

        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(left++));
            }
        }
        System.out.println("left: " + left + "right: " + right);
    }
}
