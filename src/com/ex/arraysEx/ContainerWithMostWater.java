package com.ex.arraysEx;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            leftMax[i] = max;
        }
        for (int i : leftMax) {
            System.out.print(i + " ");
        }
        System.out.println();
        max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        for (int i : rightMax) {
            System.out.print(i + " ");
        }
        int maxWater = 0;
        for(int i=0; i< n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            maxWater = maxWater + (waterLevel - height[i]);
        }
        return maxWater;
    }
}
