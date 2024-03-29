package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/21 15:23
 */
public class _222 {
    public int countNode(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNode(node.left) + countNode(node.right);
    }
    public int countNodes(TreeNode root) {
        return countNode(root);
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;

        System.out.println(new _222().countNodes(treeNode1));
    }
}
