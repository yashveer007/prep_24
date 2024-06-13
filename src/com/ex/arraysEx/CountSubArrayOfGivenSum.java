package com.ex.arraysEx;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayOfGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k =3;

        Map<Integer, Integer> map = new HashMap<>();

        int prevSum =0, count =0;
        map.put(0,1);

        for(int i=0; i<arr.length; i++){
            prevSum = prevSum + arr[i];
            int remove = prevSum - k;
            count += map.getOrDefault(remove,0);
            map.put(prevSum, map.getOrDefault(prevSum,0) +1);
        }
        System.out.println(count);
    }
}
