package com.ex.interview.company;

public class ExceptionScenario {

    public static void main(String[] args) {
        int a = 10, b =0;
        System.out.println(divide(a,b));
    }

    private static int divide(int a, int b) {
        try{
            int ans = a/b;
            return  ans;
        }catch (ArithmeticException ex){
            System.out.println("Catch");
            return 3;
        }finally {
            System.out.println("finally");
            //return 4;
        }
    }
}
