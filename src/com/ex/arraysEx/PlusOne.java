package com.ex.arraysEx;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,9,1};
       // digits = plusOne(digits);
        digits= plusOneMethod2(digits);
        for (int i : digits) {
            System.out.print(i + " ");
        }
    }

    private static int[] plusOneMethod2(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i >=0; i-- ){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        int arr[] = new int[n+1];
        arr[0] = 1;
        return arr;
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        for(int i =0; i< digits.length; i++){
            str = str + digits[i];
        }

        int n = Integer.valueOf(str) +1;
        int count = (int)Math.floor (Math.log10(n) + 1);
        int arr[] = new int[count];
        while(n > 0){
            int temp = n%10;
            n= n/10;
            arr[--count] = temp;
        }
        return arr;
    }
}
