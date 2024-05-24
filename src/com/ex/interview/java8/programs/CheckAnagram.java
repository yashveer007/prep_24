package com.ex.interview.java8.programs;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bcad";
        if (isAnagram(str1,str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2){

        int ch[] = new int[26];

        for (int i =0; i< str1.length();i++){
            ch[str1.charAt(i)-'a']++;
        }

        for (int i=0; i< str2.length() ;i++){
            ch[str2.charAt(i) - 'a']--;
        }

        for(int i : ch){
            if( i !=0){
                return false;
            }
        }

        return true;
    }
}
