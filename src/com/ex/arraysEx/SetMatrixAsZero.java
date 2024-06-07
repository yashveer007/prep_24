package com.ex.arraysEx;

public class SetMatrixAsZero {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1}
        };
        int n = 3;
        int m = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        printMatrix(arr, 3, 4);
        matrixToZero(arr, n, m);
        System.out.println("=======");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixToZero(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row(i, m, arr);
                    column(j, n, arr);
                }
            }
        }
    }

    private static void row(int i, int m, int arr[][]) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] == 1) {
                arr[i][j] = -1;
            }
        }
    }

    private static void column(int j, int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] == 1) {
                arr[i][j] = -1;
            }
        }
    }
}
