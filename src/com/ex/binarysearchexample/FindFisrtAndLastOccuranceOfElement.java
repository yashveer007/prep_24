package com.ex.binarysearchexample;

import java.util.Arrays;

public class FindFisrtAndLastOccuranceOfElement {
    public static void main(String[] args) {
        int[] nums = {3,5,7,7,7,8,8,9,9};
        System.out.println(Arrays.toString(findIndex(nums, 3)));
    }

    private static int[] findIndex(int[] nums, int target){
        int[] arr = {-1,-1};
        arr[0] = find(nums,target,true);
        arr[1] = find(nums, target,false);
        return arr;
    }

    private static int find(int[] nums, int target, boolean isInitial){

        int index = -1;
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end -start)/2;

            if(nums[mid] > target){
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid +1;
            }else{
                index = mid;
                if(isInitial){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return index;
    }

}
