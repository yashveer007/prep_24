package com.ex.recursion;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        printTriangle(4, 0);
    }

    private static void printTriangle(int row, int column) {

        if (row == 0) {
            return;
        }

        if (column < row) {
            System.out.print("*");
            printTriangle(row, column + 1);
        } else {
            System.out.println();
            printTriangle(row - 1, 0);
        }

    }
}
