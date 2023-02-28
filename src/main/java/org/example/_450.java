package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/27 17:33
 */
public class _450 {
    public void updateTree(TreeNode left, TreeNode right) {
        if (right.left != null) {
            updateTree(left, right.left);
        } else {
            right.left = left;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key && root.left == null && root.right == null) {
            return null;
        }
        if (root.val == key && root.left != null && root.right == null) {
            return root.left;
        }
        if (root.val == key && root.left == null && root.right != null) {
            return root.right;
        }
        if (root.val == key && root.left != null && root.right != null) {
            updateTree(root.left, root.right);
            root.left = null;
            return root.right;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
    public static void main(String[] args) {
        //[5,3,6,2,4,null,7]
        //3
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode5.left = treeNode3;
        treeNode5.right = treeNode6;

        treeNode3.left = treeNode2;
        treeNode3.right = treeNode4;

        treeNode6.right = treeNode7;

        new _450().deleteNode(treeNode5, 3);
    }
}
