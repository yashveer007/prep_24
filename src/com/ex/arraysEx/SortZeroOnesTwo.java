package com.ex.arraysEx;

public class SortZeroOnesTwo {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 2, 0, 2, 1, 0, 1, 0};
        arr = sort(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    private static int[] sort(int arr[]) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static int[] swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
