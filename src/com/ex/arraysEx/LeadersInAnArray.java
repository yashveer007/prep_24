package com.ex.arraysEx;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int []arr = {10,22,12,3,0,6};
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        for (int i = arr.length-2; i >=0;i--){
            max = Math.max(max,arr[i+1]);
            if(max < arr[i]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
