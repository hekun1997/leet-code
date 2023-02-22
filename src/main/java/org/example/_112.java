package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/22 15:23
 */
public class _112 {

    private boolean result;

    public void traverse(TreeNode node, int targetSum, int sum) {
        sum += node.val;
        if (targetSum == sum && node.left == null && node.right == null) {
            result = true;
            return;
        }
        if (targetSum < sum) {
            return;
        }
        if (node.left != null) {
            traverse(node.left, targetSum, sum);
        }
        if (node.right != null) {
            traverse(node.right, targetSum, sum);
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        traverse(root, targetSum, 0);
        return result;
    }

    public static void main(String[] args) {
        TreeNode _2 = new TreeNode(-2);
        TreeNode _3 = new TreeNode(-3);
        _2.right = _3;

        System.out.println(new _112().hasPathSum(_3, -5));

    }
}
