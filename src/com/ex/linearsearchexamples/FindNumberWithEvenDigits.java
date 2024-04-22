package com.ex.linearsearchexamples;

public class FindNumberWithEvenDigits {
    public static void main(String[] args) {
        int arr[] = {123,56,77,8,90,99999};
        System.out.println(findNumbers(arr));
    }

    /**
     *  returning count of even no's from the array
     * @param arr
     * @return
     */
    static int findNumbers(int[] arr) {
        int count =0;
        if (arr == null || arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if (iseven(element)){
                count ++;
            }
        }
        return count;
    }

    /**
     *  checking element is even or not
     * @param element
     * @return
     */
    static boolean iseven(int element){
        int size = (int)Math.floor(Math.log10(element)+1);
        if(size % 2 ==0){
            return true;
        }
        return  false;
    }
}
