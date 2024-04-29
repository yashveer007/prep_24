package com.ex.binarysearchexample;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,45,56,67,89,99};
        System.out.println(searchElement(arr,999,0,arr.length-1));
    }

    private static int searchElement(int arr[], int element, int start, int end){
        int mid = start + (end - start)/2;
        if(arr[mid] == element){
            return mid;
        }
        if(start >= end && arr[start] !=element){
            return -1;
        }

        if(arr[mid] > element){
            return searchElement(arr, element,start,mid-1);
        }
        else{
            return searchElement(arr, element, mid+1, end);
        }
    }
}
