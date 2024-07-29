package com.ex.arraysEx;

public class CountZeroBit {
    public static void main(String[] args) {
        int n =4;
        int count =0;

        if(n ==0){
            System.out.println(count);
            return;
        }

        while(n > 0){
            if((n & 1) == 0){
                count++;
            }
            n >>=1;
        }
        System.out.println(count);
    }
}
