package org.example;

import java.util.PriorityQueue;

/**
 * Created by hekun on 2023/1/13 09:56
 */
public class _4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0d;
        }

        if (nums1 == null) {
            if (nums2.length % 2 == 0) {
                return (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0;
            }
            return nums2[nums2.length / 2];
        }

        if (nums2 == null) {
            if (nums1.length % 2 == 0) {
                return (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2.0;
            }
            return nums1[nums1.length / 2];
        }

        int count = nums1.length + nums2.length;

        int step = count / 2;

        PriorityQueue<Integer> deque = new PriorityQueue<>();
        for (int num : nums1) {
            deque.add(num);
        }
        for (int num : nums2) {
            deque.add(num);
        }

        int pre = 0, curr = 0;
        while (step + 1 > 0 && !deque.isEmpty()) {
            pre = curr;
            curr = deque.poll();
            step--;
        }

        if (count % 2 == 0) {
            return (curr + pre ) / 2.0;
        } else {
            return curr;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6,7,8,9,10};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
