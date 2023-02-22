package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/22 20:54
 *
 */
public class _98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.val < root.left.val) {
            return false;
        }
        if (root.right != null && root.val > root.right.val) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public static void main(String[] args) {

    }
}
