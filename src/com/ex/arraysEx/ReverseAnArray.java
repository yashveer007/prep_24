package com.ex.arraysEx;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {12,34,56,3,2,67,7};
        if( arr == null || arr.length ==0) {
            System.out.println(" array is not having any value");
        }else if(arr.length ==1){
            System.out.println(arr);
        }else{
            arr = reverseArray(arr);
            for (int i: arr) {
                System.out.print(i + ", ");
            }
        }
    }

    static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return  arr;
    }
}
