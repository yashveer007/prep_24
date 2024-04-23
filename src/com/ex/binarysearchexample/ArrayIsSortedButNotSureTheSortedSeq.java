package com.ex.binarysearchexample;

public class ArrayIsSortedButNotSureTheSortedSeq {
    public static void main(String[] args) {
        //int[] arr = {12, 15, 23, 26, 98, 101};
         int[] arr = {101, 24, 12, 11, 9, 1};
        if(isAsc(arr)){
            System.out.print("Ascending order sorted array: ");
            System.out.println(ascSearch(arr,101,0, arr.length-1));
        }else {
            System.out.print("Descending order sorted array: ");
            System.out.println(descSearch(arr,1,0, arr.length-1));
        }
    }

    /**
     * checking array is sorted in asc order or dec order
     * @param arr
     * @return
     */
    private static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            return true;
        }
        return false;
    }

    /**
     * finding element of array is ascending order sorted
     * @param arr
     * @param element
     * @param start
     * @param end
     * @return
     */
    private static int ascSearch(int[] arr, int element, int start, int end) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (start == end && arr[start] != element) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == element) {
            return mid;
        }

        if (arr[mid] < element) {
            return ascSearch(arr, element, mid + 1, end);
        } else {
            return ascSearch(arr, element, start, mid - 1);
        }
    }

    /**
     * finding element of array is descending order sorted
     * @param arr
     * @param element
     * @param start
     * @param end
     * @return
     */
    private static  int descSearch(int[] arr, int element, int start, int end){
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (start == end && arr[start] != element) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == element) {
            return mid;
        }

        if(arr[mid]> element){
            return descSearch(arr,element,mid + 1, end);
        }else{
            return descSearch(arr, element, start, mid -1);
        }
    }
}
