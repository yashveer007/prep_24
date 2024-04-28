package com.ex.binarysearchexample;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        System.out.println(findMaxElement(arr, 0, arr.length - 1));

    }

    private static int findMaxElement(int[] arr, int start, int end) {

        int mid = start + (end - start) / 2;

        if (start == end) {
            return arr[start];
        }

        if (arr[mid] < arr[mid + 1]) {
            return findMaxElement(arr, mid + 1, end);
        } else {
            return findMaxElement(arr, start, mid);
        }
    }
}
