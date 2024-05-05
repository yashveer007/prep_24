package com.ex.arraysEx;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] ={1,4,6,10,0,0};
        int arr2[] = {2,5};
        int i =0,j=0;
        int index =0;
        int arr[] = new int[arr1.length];
        while(i < arr1.length && j < arr2.length && arr1[i] !=0){
            if(arr1[i] <= arr2[j]){
                arr[index++] = arr1[i++];
            }else{
                arr[index++] = arr2[j++];
            }
        }
        while(i<arr1.length &&  arr1[i] !=0){
            arr[index++] = arr1[i++];
        }
        while(j < arr2.length){
            arr[index++] = arr2[j++];
        }
        for (int element:arr) {
            System.out.print(element + ", ");
        }
    }
}
