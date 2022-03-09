package org.example;

import java.util.Arrays;

public class _167 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int curr = 0; curr < numbers.length - 1; curr ++){
//            for (int next = curr + 1; next < numbers.length; next ++){
//                if (numbers[curr] + numbers[next] == target){
//                    return new int[]{curr + 1, next + 1};
//                }
//            }
            int start = curr + 1;
            int end = numbers.length - 1;
            int middle;
            while (start < end){
                middle = (start + end) / 2;
                if (numbers[curr] + numbers[middle] == target){
                    return new int[]{curr, middle};
                }else if (numbers[curr] + numbers[middle] < target){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }
            }
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0};
        int target = -1;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }
}
