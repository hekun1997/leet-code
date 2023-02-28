package org.example.forOffer;

import java.util.PriorityQueue;

/**
 * Created by hekun on 2023/2/27 10:57
 */
public class _76 {
    public int findKthLargest(int[] nums, int k) {
        int[] result = new int[k];
        int index = 0;
        while (k > 0) {
            int maxIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            result[index] = nums[maxIndex];
            nums[maxIndex] = Integer.MIN_VALUE;
            index++;
            k--;
        }
        return result[result.length-1];
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() < k) {
                queue.offer(nums[i]);
            } else {
                if (nums[i] > queue.peek()) {
                    queue.poll();
                    queue.offer(nums[i]);
                }
            }
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        new _76().findKthLargest2(new int[]{3,2,1,5,6,4}, 2);
    }
}

class Heap {
    int value;
    Heap right;
    Heap left;


}