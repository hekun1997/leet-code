package org.example.introduction_to_algorithms;

import java.util.Arrays;

/**
 * @author hekun
 * @date 2024/6/26 17:04
 */
public class InsertSort {

    public static int[] solution(int[] nums) {
        // 异常情况
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        //
        for (int currIndex = 1; currIndex < nums.length; currIndex++) {
            // 寻找插入位置
            int index = currIndex;
            while (index > 0 && nums[index] > nums[index-1]){
                int temp = nums[index];
                nums[index] = nums[index-1];
                nums[index-1] = temp;
                index--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 4, 6, 1, 3};
        Arrays.stream(solution(nums)).forEach(System.out::println);
    }
}
