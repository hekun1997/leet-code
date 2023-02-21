package org.example;

import org.example.object.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/20 21:14
 */
public class _111 {
    public int minDepth(TreeNode root) {
        int minDepth = 0;
        if (root == null) {
            return minDepth;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            minDepth++;
            for (int i = deque.size(); i > 0; i--) {
                TreeNode curr = deque.removeFirst();
                if (curr.left == null && curr.right == null) {
                    return minDepth;
                }
                if (curr.left != null) {
                    deque.addLast(curr.left);
                }
                if (curr.right != null) {
                    deque.addLast(curr.right);
                }
            }
        }
        return minDepth;
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

        new _111().minDepth(_3);
    }
}
