package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hekun
 * @date 2024/5/23 15:05
 * @Description: TODO
 */
public class _349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (int num: set1) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        Arrays.stream(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})).forEach(System.out::println);
    }
}
