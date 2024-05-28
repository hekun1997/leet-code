package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hekun
 * @date 2024/5/23 17:30
 */
public class _1 {
    public static int[] twoSum(int[] nums, int target) {
        // value of nums, index of nums.
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{3,2,4}, 6)).forEach(System.out::println);
    }
}
