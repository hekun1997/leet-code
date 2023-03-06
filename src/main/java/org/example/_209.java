package org.example;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/10 17:25
 */
public class _209 {
    public static int minSubArrayLen(int target, int[] nums) {
        Deque<Integer> deque = new LinkedList<>();
        int sum = 0, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            deque.addLast(nums[i]);
            while (sum >= target) {
                if (sum == target) {
                    minLength = Math.min(minLength, deque.size());
                }
                sum -= deque.removeFirst();
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
    }
}
