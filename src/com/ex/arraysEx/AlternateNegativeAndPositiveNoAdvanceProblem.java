package com.ex.arraysEx;

import java.util.ArrayList;

public class AlternateNegativeAndPositiveNoAdvanceProblem {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 5, 8, -1, 0, 56, -2};
        int n = arr.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int element : arr) {
            if (element >= 0) {
                positive.add(element);
            } else {
                negative.add(element);
            }
        }
        // if positive numbers are greater than the negative numbers in the given array
        if (positive.size() > negative.size()) {
            for (int i = 0; i < negative.size(); i++) {
                arr[i * 2] = positive.get(i);
                arr[i * 2 + 1] = negative.get(i);
            }
            int currentIndex = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                arr[currentIndex++] = positive.get(i);
            }
        } else {
            for (int i = 0; i < positive.size(); i++) {
                arr[i * 2] = positive.get(i);
                arr[i * 2 + 1] = negative.get(i);
            }
            int currentIndex = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                arr[currentIndex++] = negative.get(i);
            }
        }
        for (int a : arr) {
            System.out.print(a + ", ");
        }
    }
}
