package com.ex.arraysEx;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {2,0,4,7,7,2};

        int start = 0;
        int end =0;
        int sum = 6;
        int currentSum =0;

        while(end < arr.length){

            currentSum += arr[end];

            while (currentSum > sum && start <=end ){
                currentSum -=arr[start];
                start++;
            }

            if(currentSum == sum){
                System.out.println("start" + start + " end " + end);
                return;
            }
            end++;
        }
        System.out.println("No subarray found");
    }
}
