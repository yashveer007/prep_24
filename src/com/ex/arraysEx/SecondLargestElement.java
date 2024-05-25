package com.ex.arraysEx;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {12,45,2,67,89,56,77,101};
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for (int i =1; i < arr.length ;i++ ){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
    }
}
