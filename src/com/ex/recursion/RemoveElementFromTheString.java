package com.ex.recursion;

public class RemoveElementFromTheString {

    public static void main(String[] args) {
        String str = "abacbbbbcdaba";
        System.out.println(remove(str, 0, "", 'a'));
        System.out.println(removeElement(str, "", 'a'));
    }

    private static String remove(String str, int index, String newString, char target) {
        // Base condition
        if (index == str.length()) {
            return newString;
        }

        if (str.charAt(index) != target) {
            newString += str.charAt(index);
        }

        return remove(str, index + 1, newString, target);
    }

    private static String removeElement(String str, String newString, char element) {

        if (str.isEmpty()) {
            return newString;
        }

        char ch = str.charAt(0);

        if (ch != element) {
            return removeElement(str.substring(1), newString + ch, element);
        } else {
            return removeElement(str.substring(1), newString, element);
        }
    }
}
