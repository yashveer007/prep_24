package com.ex.interview.Extra;

import java.util.Stack;

public class ex {
    public static void main(String[] args) {
        String str = "[(){}]" ;// = true
        String str1 = "[({})()]"; //= true
        String str2 = "[())]"; //= false
        System.out.println(isValid(")"));
    }

    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(stack.empty() && ( c == '}' || c == ']'||c == ')' )){
                return false;
            }
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                char top = stack.peek();
                if ((c == '}' && top == '{') || (c == ']' && top == '[') || (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
