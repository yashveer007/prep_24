package com.ex.arraysEx;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val =2;
       // removeElement(nums, val);
        move(nums, val);
        for(int i: nums){
            System.out.print(i + " ");
        }

    }

    private static int move(int[] nums, int val) {
        int i =0;
        for(int num: nums){
            if(num != val){
                nums[i++] = num;
            }
        }
        return i;
    }

    public static int removeElement(int[] nums, int val) {
        int index = -1;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == val){
                index = i;
                break;
            }
        }
        for(int i = index+1; i< nums.length-1; i++){
            if(nums[i] != val){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        System.out.println(index);
        return index-1;
    }

}
