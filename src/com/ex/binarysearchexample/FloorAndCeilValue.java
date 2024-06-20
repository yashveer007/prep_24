package com.ex.binarysearchexample;

public class FloorAndCeilValue {
    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 8, 8, 10};
        int a[] = getFloorAndCeil(arr, arr.length - 1, 5);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }


    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int arr[] = new int[2];
        arr[0] = findFloor(a, n, x);
        arr[1] = findceil(a, n, x);
        return arr;
    }

    public static int findceil(int[] a, int n, int x) {
        int start = 0;
        int end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] >= x) {
                ans = a[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }


    static int findFloor(int arr[], int n, long x) {
        int start = 0;
        int end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;
    }
}
