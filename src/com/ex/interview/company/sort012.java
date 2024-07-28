package com.ex.interview.company;

public class sort012 {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,1,1,0,0,2,1};
        int low=0;
        int mid =0;
        int high = arr.length-1;

        while(mid <= high){
            switch (arr[mid]){
                case 0 :
                    swap(arr,mid,low);
                    mid++;
                    low++;
                    break;
                case 1 :
                    mid ++;
                    break;
                case 2 :
                    swap(arr,mid,high);
                    high --;
                    break;
            }
        }

        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    private static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
