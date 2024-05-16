package com.ex.recursion;

public class Permutation {
    public static void main(String[] args) {
        String str ="abc";
        permute(str,"");
    }

    private static void permute(String str,String permute){

        if (str.length() == 0){
            System.out.println(permute);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            permute(newString,permute+ch);
        }
    }
}
