package com.ex.stringEx;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String s = "((())())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int count = 0;
        String str = "";
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count != 0) {
                    str = str + ch;
                }
                count++;
            } else {
                if (ch == ')') {
                    if (count != 1) {
                        str += ch;
                    }
                }
                count--;
            }
        }

        return str;
    }
}
