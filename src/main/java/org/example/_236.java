package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/27 16:53
 */
public class _236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null) return right;
        return left;
    }
    public static void main(String[] args) {

    }
}
