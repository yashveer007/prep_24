package com.ex.binarysearchexample;

public class FloorValue {
    public static void main(String[] args) {
        int arr[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr, arr.length, 5));
    }

    static int findFloor(int arr[], int n, long x)
    {
        int start =0;
        int end = n;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > x){
                end = mid -1;
            }else{
                ans = mid ;
                start = mid +1;
            }
        }
        return ans;
    }


}
