package com.ex.arraysEx;

import java.util.Arrays;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        //row
        int n = arr.length;
        //column
        int m = arr[0].length;
        transposeMatrix(arr, n, m);
        for(int i=0; i<n;i++){
            reverse(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Optimal Approach Step1: transpose the Matrix
     *
     * @param arr
     * @param n
     * @param m
     */
    private static void transposeMatrix(int arr[][], int n, int m) {
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                // swaping two number
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    /**
     *  Optimal Approach Step1: Reverse each 1-D array
     * @param arr
     */
    public static void reverse(int arr[]){
        int i=0;
        int j = arr.length -1;
        while(i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }



    /**
     * Rotate the array using extra space :
     * Time complexity: O(n*m) , Space Complexity : O(n*m)
     *
     * @param arr
     * @param n
     * @param m
     * @return
     */
    public static int[][] bruteApproch(int arr[][], int n, int m) {
        int temp[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[j][m - 1 - i] = arr[i][j];
            }
        }
        return temp;
    }
}
