package com.ex.interview.Extra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class intrev {
    public static void main(String[] args) {
        // “hello” and “world”
        String str1 = "cinema";
        String str2 = "tac";
        String str3 = "iceman";
        //System.out.println(isAnagram(str1,str3));
        System.out.println(isPlendrome("madam "));
        countOccuranceOfChar(str1);
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String str =  Arrays.stream(str1.split("")).sorted().collect(Collectors.joining(""));
        String str3 =  Arrays.stream(str2.split("")).sorted().collect(Collectors.joining(""));
        if(str.equalsIgnoreCase(str3)){
            return true;
        }
        return false;
    }

    public static boolean isPlendrome(String s1){
        int i =0;
        int j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i) == s1.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void countOccuranceOfChar(String str){
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }


}
