package com.ex.linearsearchexamples;

public class MinElement {
    public static void main(String[] args) {
        int arr[] = {12, 45, 67, -4, 98, -787665, 3746, 987766};
        System.out.println("Min Element: " + minElementInArray(arr));
        System.out.println("Max Element: " + maxElement(arr));
    }

    /**
     * Searching min element in an Array
     *
     * @param arr
     * @return
     */
    private static int minElementInArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    /**
     * Searching max element in an Array
     *
     * @param arr
     * @return
     */
    private static int maxElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}
