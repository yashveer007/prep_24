package com.ex.sliding.window;

public class MaxSumOfKsizeSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1, 9, -6, 4, 5};
        int k = 3;

        int start = 0;
        int end = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
//        while(end <arr.length){
//             if(end - start !=  k){
//                 sum = sum + arr[end];
//                 end++;
//             }else if(end - start == k){
//                 maxSum = Math.max(maxSum,sum);
//                 sum -= arr[start];
//                 start ++;
//             }
//        }
        int j =3;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(sum, maxSum);
        for (int i = 1; i < arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[j++];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
