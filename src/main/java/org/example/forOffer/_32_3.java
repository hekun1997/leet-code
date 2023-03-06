package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.*;

/**
 * Created by hekun on 2023/1/16 10:40
 */
public class _32_3 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (queue.size() > 0) {
            Deque<Integer> currResult = new ArrayDeque<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode currNode = queue.poll();
                if (level % 2 == 0) {
                    currResult.addFirst(currNode.val);
                } else {
                    currResult.addLast(currNode.val);
                }
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            level++;
            result.add(new ArrayList<>(currResult));
        }

        return result;
    }
    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;

        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;

        System.out.println(levelOrder(treeNode3));

    }
}
