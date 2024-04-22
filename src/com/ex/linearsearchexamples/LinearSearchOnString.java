package com.ex.linearsearchexamples;

public class LinearSearchOnString {
    public static void main(String[] args) {
        String str ="yashveer singh";
        System.out.println(seachElemenrt(str,'s'));
        System.out.println(seachElemenrt(null,'g'));
        System.out.println(seachElemenrt(str,'t'));
        System.out.println(seachElemenrt("",'f'));
        System.out.println(seachElemenrt(str,'n'));
    }

    private static boolean seachElemenrt(String str, char ch){

        // checking str l
        if(str == null || str.length() == 0 ){
            return false;
        }

        // if char found
        for( char c: str.toCharArray()){
            if(c == ch){
                return true;
            }
        }

        // if char not exists
        return false;
    }
}
