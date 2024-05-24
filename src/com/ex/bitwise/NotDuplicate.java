package com.ex.bitwise;

public class NotDuplicate {
    public static void main(String[] args) {
        int[] arr = {23, 45, 23, 67, 67};
        int num = findNum(arr);
        if (num != 0) {
            System.out.println(num);
        }else{
            System.out.println("No Duplicate Element found!!");
        }

    }

    private static int findNum(int[] arr) {
        int xor = 0;

        for (int a : arr) {
            xor ^= a;
        }

        return xor;
    }
}
