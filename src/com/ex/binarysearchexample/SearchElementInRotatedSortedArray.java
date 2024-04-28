package com.ex.binarysearchexample;

public class SearchElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target =3;
        int pivot = findPivotElementIndex(nums);
        System.out.println("pivot:: " + pivot);
        if(pivot == -1){
            System.out.println(binarySearch(nums,target,0, nums.length-1));
        }

        if (nums[pivot] == target){
            System.out.println(pivot);
        }
        if(target >= nums[0]){
            System.out.println(binarySearch(nums, target,0,pivot-1));
        }else{
            System.out.println(binarySearch(nums,target,pivot+1,nums.length-1));
        }
    }

    static int findPivotElementIndex(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;

            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int element, int start, int end){

        while (start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] == element){
                return mid;
            }

            if(arr[mid] < element){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
}
