package com.ex.linearsearchexamples;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12,45,6,23,11,7,98};

        //element exists must return true
        System.out.println(searchElement(arr, 11));

        //element doesn't exists must return false
        System.out.println(searchElement(arr,18));

        //passing empty array must return false
        System.out.println(searchElement(new int[4],98));
    }

    /**
     *
     * @param arr
     * @param element
     * @return boolean
     */
    private static boolean searchElement(int[] arr , int element){
        //if length of array is zero then no element is there
        if(arr.length ==0){
            return  false;
        }

        // if size is greater than zero checking element if exists return true
        for(int a: arr){
            if( a == element){
                return true;
            }
        }

        // if element is not there then returning false
        return false;
    }
}
