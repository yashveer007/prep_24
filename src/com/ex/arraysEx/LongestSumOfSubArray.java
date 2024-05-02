package com.ex.arraysEx;

public class LongestSumOfSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 3, 3, 1};
        int k = 6;
        int sum = arr[0];
        int maxLength = 0;
        int left = 0, right = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
    }
}
