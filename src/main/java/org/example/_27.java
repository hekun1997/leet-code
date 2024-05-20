package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2021/9/25 22:33
 */
public class _27 {
    // 21.9.25
    public static int removeElement(int[] nums, int val) {
        int count = 0, size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                size--;
                i--;
                count++;
            }
        }
        return count;
    }

    public static int removeElement2(int[] nums, int val) {
        int slowIndex = 0; // pointer and slow pointer.
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
