package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/22 20:06
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 *
 * 创建一个根节点，其值为 nums 中的最大值。
 * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * 返回 nums 构建的 最大二叉树 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _654 {
    public int findMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        for (int i = start+1; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public TreeNode findNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int maxIndex = findMaxIndex(nums, start, end);
        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = findNode(nums, start, maxIndex-1);
        node.right = findNode(nums, maxIndex+1, end);
        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return findNode(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int[]nums = {3, 2, 1, 6, 0, 5};
        TreeNode root = new _654().constructMaximumBinaryTree(nums);
        System.out.println(root);
    }
}
