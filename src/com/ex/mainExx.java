package com.ex;

import java.util.Stack;

public class mainExx {
    public static void main(String[] args) {
        String str = "[[{{}}]]";
        System.out.println(isValid(str));
    }

    static boolean isValid(String str){
        char ch[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i =0 ; i< ch.length ; i++){
            char c = ch[i];
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                    char top = stack.peek();
                    if(c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{'){
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
