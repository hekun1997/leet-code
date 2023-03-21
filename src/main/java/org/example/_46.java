package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/19 11:13
 */
public class _46 {
    List<List<Integer>> results = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public void backTrace(int[] nums, int index) {
        if (index == nums.length) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            //if (index == i) continue;
            if (!path.contains(nums[i])) {
                path.add(nums[i]);
                backTrace(nums, index+1);
                path.remove(Integer.valueOf(nums[i]));
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        backTrace(nums, 0);
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new _46().permute(nums));
    }
}
