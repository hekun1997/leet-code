package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hekun on 2023/1/17 09:05
 */
public class _27 {
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode curr = null;
        TreeNode temp = null;
        while (!queue.isEmpty()){
            curr = queue.poll();
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
            temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
        }

        return root;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode9 = null;

        treeNode4.left = treeNode2;
        treeNode4.right = treeNode7;

        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;

        treeNode7.left = treeNode6;
        treeNode7.right = treeNode9;

        mirrorTree(treeNode4);
//        for (int i = 1; i < 10; i++) {
//            System.out.println("TreeNode treeNode" + i + " = new TreeNode(" + i + ");");
//        }
    }
}
