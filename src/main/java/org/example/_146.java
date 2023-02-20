package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 09:31
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 */
public class _146 {
    public void traversal(TreeNode node, List<Integer> result) {
        if (node != null) {
            traversal(node.left, result);
            traversal(node.right, result);
            result.add(node.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            traversal(root.left, result);
            traversal(root.right, result);
            result.add(root.val);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
