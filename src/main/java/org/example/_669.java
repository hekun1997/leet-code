package org.example;

import org.example.object.TreeNode;

/**
 * Created by hekun on 2023/2/27 22:27
 */
public class _669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) return trimBST(root.right, low, high);
        if (root.val > high) return trimBST(root.left, low, high);
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
//        if (root == null) {
//            return null;
//        }
//        if (root.val < low) {
//            return trimBST(root.right, low, high);
//        }
//        if (root.val > high) {
//            return trimBST(root.left, low, high);
//        }
//        // root在[low,high]范围内
//        root.left = trimBST(root.left, low, high);
//        root.right = trimBST(root.right, low, high);
//        return root;
    }
    public static void main(String[] args) {

    }
}
