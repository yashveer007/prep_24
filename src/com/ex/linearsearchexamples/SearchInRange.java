package com.ex.linearsearchexamples;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 56, 98, 3, 53, 367, 91, 57};
        System.out.println(searchElement(arr, 57,2,arr.length));
        System.out.println(searchElement(null, 57,2,arr.length));
        System.out.println(searchElement(arr, 12,2,arr.length));
    }

    /**
     *
     * @param arr
     * @param element
     * @param start
     * @param end
     * @return
     */
    private static int searchElement(int[] arr, int element, int start, int end) {
        if ( arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
