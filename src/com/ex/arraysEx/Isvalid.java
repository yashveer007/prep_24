package com.ex.arraysEx;

import java.util.Stack;

public class Isvalid {
    public static void main(String[] args) {
        String str = "{}[]({(}))";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {

        char ch[] = str.toCharArray();
        int n = ch.length;
        int i =0;
        Stack<Character> st = new Stack<>();
        while (i <n){
            char c = ch[i];
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
                i++;
            }else {
                if(!st.empty()) {
                    char top = st.peek();
                    if (c == '}' && top == '{' || c == ']' && top == '[' || c == ')' && top == '(') {
                        st.pop();
                        i++;
                    } else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
