package com.ex.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheMatchingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 4, 4, 7, 8, 4};
        List<Integer> list = search(arr, 0, 4, new ArrayList<>());
        System.out.println(list.toString());
    }

    private static List<Integer> search(int arr[], int index, int target, List<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (target == arr[index]) {
            list.add(index);
        }

        return search(arr, index + 1, target, list);
    }
}
