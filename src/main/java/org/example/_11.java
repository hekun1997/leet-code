package org.example;

public class _11 {
    public static int maxArea(int[] height) {
        int maxArea = 0, currArea = 0;
        int start = 0, end = height.length - 1;
        while (start < end) {
            currArea = (Math.min(height[start], height[end])) * (end - start);
            if (currArea > maxArea) {
                maxArea = currArea;
            }
            if (height[start] > height[end]) {
                -- end;
            } else {
                ++ start;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
