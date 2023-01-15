package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/1/12 16:09
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明:叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _104 {
    public static int depth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return depth;
        }
        int leftDepth = depth(root.left, depth + 1);
        int rightDepth = depth(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
    public static int maxDepth(TreeNode root) {
        return depth(root, 1);
    }

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;

        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;

        System.out.println(maxDepth(treeNode3));
    }
}
