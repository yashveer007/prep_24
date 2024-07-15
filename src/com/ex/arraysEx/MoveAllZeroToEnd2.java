package com.ex.arraysEx;

public class MoveAllZeroToEnd2 {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,4,0,6,7,0,12,0};
        move(arr);
        for(int a: arr)
            System.out.print( a + " ");
    }

    private static void move(int[] arr) {
        int index = -1;
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                index = i;
                break;
            }
        }

        for(int i = index + 1 ; i < arr.length ; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}
