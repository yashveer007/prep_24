package com.ex.arraysEx;

public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-2};

        int currentSum  =0;
        int max_sum = 0;

        for(int i =0;i<arr.length; i++){
             currentSum += arr[i];
             max_sum = max_sum > currentSum ? max_sum : currentSum;
             if( currentSum <0){
                 currentSum =0;
             }
        }
        System.out.println(max_sum);
    }
}
