package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/28 15:03
 */
public class _538 {
    int pre = 0;
    public void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.right);
        node.val += pre;
        pre = node.val;
        traverse(node.left);
    }
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;

        new _538().convertBST(treeNode1);
    }
}
