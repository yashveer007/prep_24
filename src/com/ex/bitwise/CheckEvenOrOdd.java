package com.ex.bitwise;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num = 86;
        if(checkNum(num)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    private static boolean checkNum(int num) {
         return (num & 1) == 0;
    }

}
