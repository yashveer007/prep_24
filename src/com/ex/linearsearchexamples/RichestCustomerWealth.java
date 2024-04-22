package com.ex.linearsearchexamples;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] arr  = {
                {12,45,1},
                {2,56,1},
                {56,1,1,57,89},
                {33546,567}
        };
        System.out.println( maximumWealth(arr));

    }

    /**
     *  finding maximum wealth
     * @param accounts
     * @return
     */
    private static int maximumWealth(int[][] accounts){
        if(accounts == null || accounts.length ==0 ){
            return -1;
        }
        int maximumWealth = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int sum =0;
            for(int balance : account){
                sum += balance;
            }
            if(sum > maximumWealth){
                maximumWealth = sum;
            }
        }
        return maximumWealth;
    }
}
