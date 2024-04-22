package com.ex.linearsearchexamples;

public class FindElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 67, 89},
                {2, 69},
                {76, 98, 20, 27},
                {87687, 775656, 2431234, 33, 1}
        };
        System.out.println(findElement(arr,27));
    }

    /**
     *  searching element in 2D Array
     * @param arr
     * @param element
     * @return
     */
    private static int findElement(int[][] arr, int element) {
        if(arr == null || arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int[] ar : arr){
            for (int a: ar){
                if(a == element){
                    return element;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
