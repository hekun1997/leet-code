package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/28 14:54
 */
public class _108 {
    public TreeNode dfs(int nums[], int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums, low, mid - 1);
        node.right = dfs(nums, mid + 1, high);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        new _108().sortedArrayToBST(nums);
    }
}
