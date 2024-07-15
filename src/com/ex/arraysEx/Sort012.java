package com.ex.arraysEx;

import static java.util.Collections.swap;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,2,2,1,0,0,1,1,0,2};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // swap arr[low] and arr[mid]
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swap arr[mid] and arr[high]
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
        for (int a : arr)
            System.out.print(a + " ");
    }

    private static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
