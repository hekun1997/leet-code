package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/1/17 10:18
 */
public class _101 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkNodes(root.left, root.right);
    }

    public static boolean checkNodes(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && checkNodes(node1.left, node2.right) && checkNodes(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode21 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode31 = new TreeNode(3);
        TreeNode treeNode32 = new TreeNode(3);

        treeNode1.left = treeNode21;
        treeNode1.right = treeNode22;

        treeNode21.right = treeNode31;

        treeNode22.right = treeNode32;

        System.out.println(isSymmetric(treeNode1));
    }
}
