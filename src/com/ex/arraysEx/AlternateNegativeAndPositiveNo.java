package com.ex.arraysEx;

public class AlternateNegativeAndPositiveNo {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-6,3,-8};
        int temp[] = new int[arr.length];
        int even = 0;
        int odd = 1;
        for (int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                temp[even] = arr[i];
                even +=2;
            }else{
                temp[odd] = arr[i];
                odd +=2;
            }
        }
        for (int a:
             temp) {
            System.out.print(a+ ", ");
        }
    }
}