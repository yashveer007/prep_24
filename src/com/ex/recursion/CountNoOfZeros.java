package com.ex.recursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        int n = 10503;
        System.out.println("n " + n);
        System.out.println(count(n,0));
    }

    private static int count(int n, int count){
        if(n%10 == n){
            if( n==0){
                count++;
            }
            return count;
        }

        if(n%10 ==0){
            return count(n/10,count +1);
        }
        return count(n/10,count);
    }
}
