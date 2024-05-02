package com.ex.arraysEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 4, 5, 9,9,9};
        int[] arr2 = {4, 4, 4, 4, 8, 9, 9};
        List<Integer> list = findIntersection(arr1, arr2);
        System.out.println(list.toString());
    }

    private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i])
                    list.add(arr1[i]);
                j++;
                i++;
            }
        }
        return list;
    }
}
