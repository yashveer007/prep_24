package com.ex.arraysEx;

public class SellAndBuyStocks {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 6, 4, 3};

        int min = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            maxProfit = Math.max(maxProfit,cost);
            min = Math.min(min, arr[i]);
        }
        System.out.println(maxProfit);
    }
}
