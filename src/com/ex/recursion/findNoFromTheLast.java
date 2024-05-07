package com.ex.recursion;

public class findNoFromTheLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8};
        System.out.println(search(arr, arr.length - 1, 6));
        System.out.println(search(arr, arr.length - 1, 12));
    }

    private static int search(int[] arr, int index, int target) {

        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return search(arr, index - 1, target);
    }
}
