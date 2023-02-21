package org.example;

import org.example.object.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/20 21:30
 */
public class _226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            for (int i = deque.size(); i > 0; i--) {
                TreeNode curr = deque.removeFirst();
                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;

                if (curr.left != null) {
                    deque.addLast(curr.left);
                }
                if (curr.right != null) {
                    deque.addLast(curr.right);
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
