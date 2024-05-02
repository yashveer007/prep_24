package com.ex.arraysEx;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 4, 0, 0, 6,8,0};
        arr = moveToEnd(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] moveToEnd(int[] arr) {
        int i = -1;
        // finding index of first 0 element
        for (int j =0; j< arr.length; j++){
            if(arr[j] == 0){
                i=j;
                break;
            }
        }

        for (int j = i+1; j< arr.length;j++){
            if(arr[j] !=0){
                arr[i] = arr[j];
                arr[j] =0;
                i++;
            }
        }
        return arr;
    }
}
