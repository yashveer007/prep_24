package com.ex.binarysearchexample;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {12,32,45,67,32,11};
        int peakElement = findPeakElement(arr, 0, arr.length-1);
        int index = binarySearch(arr,32 , 0, peakElement);
        System.out.println(index);
    }

    /**
     * finding peak element in array
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private static int findPeakElement(int[] arr,int start, int end){

        int mid = start + (end - start)/2;

        if(start == end ){
            return  start;
        }

        if(arr[mid] < arr[mid +1]){
            return findPeakElement(arr, mid +1, end);
        }else{
            return findPeakElement(arr, start, mid);
        }

    }

    private static int binarySearch(int[] arr, int element, int start, int end){
        int mid = start + (end - start)/2;

        if(arr[mid] == element){
            return  mid;
        }

        if( start >= end && arr[mid] != element){
            return -1;
        }

        boolean isAsc = arr[start] < arr[end];

        if(isAsc){
            if(arr[mid] < element){
                return binarySearch(arr,element,mid+1,end);
            }else {
                return binarySearch(arr,element,start,mid-1);
            }
        }else{
            if(arr[mid] > element){
                return binarySearch(arr,element,start,mid -1);
            }else {
                return binarySearch(arr,element,mid +1 ,end);
            }
        }


    }

}
