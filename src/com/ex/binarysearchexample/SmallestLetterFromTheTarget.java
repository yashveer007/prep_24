package com.ex.binarysearchexample;

public class SmallestLetterFromTheTarget {
    public static void main(String[] args) {
        char[] ch = {'d', 'g', 'l', 'm', 'o'};

        System.out.println(getSmallestGreaterElement(ch, 'd'));
    }

    private static char getSmallestGreaterElement(char[] ch, char element) {
        int start = 0;
        int end = ch.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (element < ch[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ch[start % ch.length];
    }
}
