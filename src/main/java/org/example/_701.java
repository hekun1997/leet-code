package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/27 17:05
 */
public class _701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val < val && root.right != null) {  // right
            insertIntoBST(root.right, val);
        }
        if (root.val > val && root.left != null) {  // left
            insertIntoBST(root.left, val);
        }
        if (root.val < val && root.right == null) {
            root.right = new TreeNode(val);
        }
        if (root.val > val && root.left == null) {
            root.left = new TreeNode(val);
        }
        return root;
    }
    public static void main(String[] args) {
        //root = [4,2,7,1,3], val = 5
        TreeNode treeNode4 =new TreeNode(4);
        TreeNode treeNode2 =new TreeNode(2);
        TreeNode treeNode7 =new TreeNode(7);
        TreeNode treeNode1 =new TreeNode(1);
        TreeNode treeNode3 =new TreeNode(3);

        treeNode4.left = treeNode2;
        treeNode4.right = treeNode7;

        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;

        new _701().insertIntoBST(treeNode4, 5);
    }
}
