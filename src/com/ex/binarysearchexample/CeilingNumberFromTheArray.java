package com.ex.binarysearchexample;

public class CeilingNumberFromTheArray {
    public static void main(String[] args) {
        int arr[] = {12,45,67,99,101,111,456};
        if(arr == null || arr.length ==0) {
            System.out.println("Array is empty or null, please verify it");
        }else{
            System.out.println(searchCeilingValue(arr,877,0, arr.length-1));
        }
    }

    private static int searchCeilingValue(int arr[], int element, int start, int end){

        if(element > arr[arr.length-1]){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == element){
            return element;
        }

        if(start == end){
            return arr[start];
        }

        if(arr[mid] > element){
            return searchCeilingValue(arr,element,start, mid-1);
        }else{
            return searchCeilingValue(arr,element,mid +1, end);
        }
    }
}
