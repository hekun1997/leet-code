package org.example;

import org.example.object.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/22 15:02
 */
public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) return sum;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            TreeNode curr = deque.removeFirst();
            if (curr.left != null && curr.left.left == null && curr.left.right == null) {
                sum += curr.left.val;
            }
            if (curr.left != null) {
                deque.addLast(curr.left);
            }
            if (curr.right != null) {
                deque.addLast(curr.right);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode _3 = new TreeNode(3);
        TreeNode _9 = new TreeNode(9);
        TreeNode _20 = new TreeNode(20);
        TreeNode _15 = new TreeNode(15);
        TreeNode _7 = new TreeNode(7);

        _3.left = _9;
        _3.right = _20;

        _20.left = _15;
        _20.right = _7;

        System.out.println(new _404().sumOfLeftLeaves(_3));
    }
}
