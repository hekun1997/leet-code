package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/22 20:42
 */
public class _700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
    public static void main(String[] args) {

    }
}
