package org.example;

public class _704 {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle;

        while (start <= end){
            middle = (start + end) / 2;
            if (target > nums[middle]){
                start = middle + 1;
            }else if (target < nums[middle]){
                end = middle - 1;
            }else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, 3));
        System.out.println(search(nums, 5));
        System.out.println(search(nums, 9));
        System.out.println(search(nums, 2));
    }
}
