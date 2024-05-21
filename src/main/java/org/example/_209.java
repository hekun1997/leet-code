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

    public static int minSubArrayLen2(int target, int[] nums) {
        int retVal = nums.length;
        int left = 0, right = 0;
        int sum = nums[0];
        boolean find = false;

        while (left < nums.length && right < nums.length){
            if (sum >= target) {
                find = true;
                int len = right - left + 1;
                if (retVal > len) {
                    retVal = len;
                }
                sum -= nums[left++];
                continue;
            } else if(sum < target) {
                right ++;
                if (right >= nums.length) {
                    break;
                }
                sum += nums[right];
            }
        }

        return find ? retVal : 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,4};
        System.out.println(minSubArrayLen2(4, nums));
    }
}
