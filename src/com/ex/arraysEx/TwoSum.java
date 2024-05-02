package com.ex.arraysEx;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {575, 330, 339, 584, 239, 31, 173, 929, 967};
        int k = 204;

        //First sort the array;
        Arrays.sort(arr);
        System.out.println(findSum(arr, k));
    }

    private static String findSum(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return "yes";
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return "no";
    }
}
