package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/19 10:41
 */
public class _78 {
    List<List<Integer>> results = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public void backTrace(int[] nums, int start) {
        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            if (!results.contains(path)) {
                results.add(new ArrayList<>(path));
            }
            backTrace(nums, i+1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        results.add(new ArrayList<>());
        backTrace(nums, 0);
        return results;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new _78().subsets(nums));
    }
}
