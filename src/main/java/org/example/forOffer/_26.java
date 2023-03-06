package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hekun on 2023/1/17 10:29
 */
public class _26 {
    public static boolean checkNodes(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (A != null && B == null) {
            return true;
        }
        if (A == null && B != null) {
            return false;
        }
        return A.val == B.val && checkNodes(A.left, B.left) && checkNodes(A.right, B.right);
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        // check null
        if (A == null ||B == null) {
            return false;
        }
        TreeNode curr = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        while (!queue.isEmpty()) {
            curr = queue.poll();
            if (curr.val == B.val) {
                if (checkNodes(curr, B)) {
                    return true;
                }
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        treeNode4.left = treeNode1;
        treeNode4.right = treeNode2;

        TreeNode treeNode21 = new TreeNode(1);
        TreeNode treeNode24 = new TreeNode(4);
        treeNode24.left = treeNode21;

        System.out.println(isSubStructure(treeNode3, treeNode24));
    }
}
