package com.ex.recursion;

public class findNoFromTheStart {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8};
        System.out.println(search(arr, 0, 6));
        System.out.println(search(arr, 0, 12));
    }

    private static int search(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return search(arr, index + 1, target);
    }
}
