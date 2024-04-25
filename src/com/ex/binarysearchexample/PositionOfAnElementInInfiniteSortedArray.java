package com.ex.binarysearchexample;

import javax.swing.event.CellEditorListener;

public class PositionOfAnElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {12,23,25,28,29,30,35,39,45,48,50,60,89,101,156,189,200,287,410};
        System.out.println(findRange(arr,89));
    }

    private static  int findRange(int[] arr, int element){
        int start = 0;
        int end = 1;
        while( arr[end] < element){
            int temp = end +1;
            end = end + (end - start +1)*2;
            start = temp;
        }
        return binarySearch(arr,element,start,end);
    }

    private static int binarySearch(int[] arr, int element, int start, int end){

        int mid = start + (end - start)/2;

        if(arr[mid] == element){
            return mid;
        }

        if(start == end && arr[mid] != element){
            return  -1;
        }

        if (arr[mid] < element){
            return binarySearch(arr, element, mid +1, end);
        }else{
            return binarySearch(arr, element, start, mid-1);
        }
    }
}
