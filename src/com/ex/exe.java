package com.ex;

@FunctionalInterface
interface sum {
    void sum(int number);
}

public class exe {
    public static void main(String[] args) {
        sum s = (n) -> {
            while (n > 0) {
                int sum = 0;
                if(n/10 <= 0){
                    break;
                }
                while (n > 0) {
                    int temp = n % 10;
                    sum = sum + temp;
                    n = n / 10;
                }
                n = sum;
            }
            System.out.println(n);
        };
        s.sum(617);
    }
}
