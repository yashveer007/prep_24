package com.ex.arraysEx;

public class LeftRotateArrayByNPlace {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int rotateBy = 2 % arr.length;
        arr = reverseArrray(arr,0,rotateBy-1);
        arr = reverseArrray(arr, rotateBy, arr.length-1);
        arr = reverseArrray(arr,0, arr.length-1);
        for(int i : arr){
            System.out.print(i +",");
        }
    }

    static int[] reverseArrray(int[] arr, int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return arr;
    }
}
