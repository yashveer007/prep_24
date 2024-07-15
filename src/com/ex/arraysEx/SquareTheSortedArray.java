package com.ex.arraysEx;

public class SquareTheSortedArray {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,2,5,10};
        int i =0;
        int j = arr.length-1;
        int ans[] = new int[arr.length];
        int k = arr.length-1;
        while(i < j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k] = arr[i] * arr[i];
                i++;
            }else{
                ans[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        for(int a: ans){
            System.out.print(a + " ");
        }
    }
}
