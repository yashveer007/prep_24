package com.ex.interview.Extra;

public class interviewEx {
    public static void main(String[] args) {
//        reverse vowels :
        String str = "abcdedilo" ;  //a,e,i,o
        String output = "obcdidela";  //o,i,e,a
        int start =0; int end = str.length()-1;
        int mid = (end - start)/2;

        //finding the first occurrence of vowel
        for(int i  =0; i< str.length() ; i++){
            if(isVowel(str.charAt(i))){
                start = i;
                break;
            }
        }
        // if no vowel found
        if(start == str.length() ){
            System.out.println("No vowels found");
            return;
        }

        // finding the last occurrence of vowel
        for(int i  =str.length()-1; i>=0 ; i--){
            if(isVowel(str.charAt(i))){
                end = i;
                break;
            }
        }

        // if there is only one vowel
        if(start == end){
            System.out.println("Allry vowels in place");
            return;
        }

        // swapping vowels occurrence
        char ch[] = str.toCharArray();
        while(start <= end) {
            if(isVowel(ch[start]) && isVowel(ch[end])) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start ++;
                end --;
            }
            else if(!isVowel(ch[start])){
                start ++;
            }else if (!isVowel(ch[end])){
                end--;
            }
        }
        System.out.println(new String(ch));

    }

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            return true;
        }
        return false;
    }
}
