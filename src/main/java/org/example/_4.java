package org.example;

/**
 * Created by hekun on 2023/1/13 09:56
 */
public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] max, min;
        if (nums1[nums1.length - 1] > nums2[nums2.length - 1]) {
            max = nums1;
            min = nums2;
        } else {
            max = nums2;
            min = nums1;
        }

        int maxIndex = max.length - 1;
        int minIndex = 0;

        while (true) {
            if (maxIndex == 0 || (minIndex == min.length - 1)) {
                break;
            }
            if (max[maxIndex - 1] >= min[minIndex + 1]) {
                maxIndex--;
                minIndex++;
            } else {
                break;
            }
        }

        return 0D;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = a;
        b[0] = 99;
        System.out.println(a[0]);
    }
}
