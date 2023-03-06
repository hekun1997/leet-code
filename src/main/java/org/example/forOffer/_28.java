package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hekun on 2023/1/17 09:36
 */
public class _28 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            TreeNode curr = null;
            for (int i = queue.size(); i > 0; i--) {
                curr = queue.poll();
                if (curr == null) {
                    list.add(null);
                } else {
                    list.add(curr.val);
                }
                if (curr != null) {
                    queue.add(curr.left);
                    queue.add(curr.right);
                }
            }
            for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
                if (list.get(i) != list.get(j)) {
                    return false;
                }
            }
        }
        return true;
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

        treeNode22.left = treeNode32;

        System.out.println(isSymmetric(treeNode1));
    }
}
