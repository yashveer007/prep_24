package com.ex.sliding.window;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcdadcac";
        int i=0;
        int j=1;
        List<String> list = new ArrayList<>();
        while(j < str.length()){
            if(str.charAt(i) != str.charAt(j)){
                list.add(str.substring(i,j+1));
                j++;
            }else{
                i++;
            }
        }
        System.out.println(list);
        String s = list.stream().reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2).get();
        System.out.println(s);
    }
}
