package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: hekun
 * @date: 2024/7/24 16:16
 */
public class _347 {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int[] result = new int[k];
        Map<Integer, Integer> countMap = new HashMap<>(nums.length);
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> sortList = new ArrayList<>(countMap.entrySet());
        sortList.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++){
            result[i] = sortList.get(i).getKey();
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4,4,4,4};
        int k = 2;
        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }
}
