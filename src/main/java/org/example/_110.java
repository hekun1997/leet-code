package org.example;

import org.example.object.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/21 20:51
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class _110 {
    public int getDeep(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getDeep(node.left), getDeep(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            for (int i = deque.size(); i > 0; i--) {
                TreeNode curr = deque.removeFirst();
                int leftDeep = getDeep(curr.left);
                int rightDeep = getDeep(curr.right);
                if (Math.abs(leftDeep - rightDeep) > 1) {
                    return false;
                }
                if (curr.left != null) {
                    deque.addLast(curr.left);
                }
                if (curr.right != null) {
                    deque.addLast(curr.right);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode _1 = new TreeNode(1);
        TreeNode _2 = new TreeNode(2);
        _1.right = _2;
        System.out.println(new _110().isBalanced(_1));
    }
}
